package com.facebook.react;

import android.app.Service;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.internal.featureflags.ReactNativeNewArchitectureFeatureFlags;
import com.facebook.react.jstasks.HeadlessJsTaskConfig;
import com.facebook.react.jstasks.HeadlessJsTaskContext;
import com.facebook.react.jstasks.HeadlessJsTaskEventListener;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0001.B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0013\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0004¢\u0006\u0004\b\u001a\u0010\rJ\u000f\u0010\u001b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001b\u0010\u0004J\u0017\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001f\u0010\u001eR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00100 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010'\u001a\u00020#8TX\u0094\u0004¢\u0006\f\u0012\u0004\b&\u0010\u0004\u001a\u0004\b$\u0010%R\u0016\u0010+\u001a\u0004\u0018\u00010(8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lcom/facebook/react/HeadlessJsTaskService;", "Landroid/app/Service;", "Lcom/facebook/react/jstasks/HeadlessJsTaskEventListener;", "<init>", "()V", "Lcom/facebook/react/bridge/ReactContext;", "reactContext", "Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;", "taskConfig", "Li7/B;", "invokeStartTask", "(Lcom/facebook/react/bridge/ReactContext;Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;)V", "createReactContextAndScheduleTask", "(Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;)V", "Landroid/content/Intent;", "intent", PointerEventHelper.POINTER_TYPE_UNKNOWN, "flags", "startId", "onStartCommand", "(Landroid/content/Intent;II)I", "getTaskConfig", "(Landroid/content/Intent;)Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "startTask", "onDestroy", "taskId", "onHeadlessJsTaskStart", "(I)V", "onHeadlessJsTaskFinish", PointerEventHelper.POINTER_TYPE_UNKNOWN, "activeTasks", "Ljava/util/Set;", "Lcom/facebook/react/ReactNativeHost;", "getReactNativeHost", "()Lcom/facebook/react/ReactNativeHost;", "getReactNativeHost$annotations", "reactNativeHost", "Lcom/facebook/react/ReactHost;", "getReactHost", "()Lcom/facebook/react/ReactHost;", "reactHost", "getReactContext", "()Lcom/facebook/react/bridge/ReactContext;", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class HeadlessJsTaskService extends Service implements HeadlessJsTaskEventListener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static PowerManager.WakeLock wakeLock;
    private final Set<Integer> activeTasks = new CopyOnWriteArraySet();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u000b\u001a\b\u0018\u00010\tR\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/facebook/react/HeadlessJsTaskService$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Landroid/content/Context;", "context", "Li7/B;", "acquireWakeLockNow", "(Landroid/content/Context;)V", "Landroid/os/PowerManager$WakeLock;", "Landroid/os/PowerManager;", "wakeLock", "Landroid/os/PowerManager$WakeLock;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void acquireWakeLockNow(Context context) {
            PowerManager.WakeLock wakeLock;
            AbstractC2855l.g(context, "context");
            if (HeadlessJsTaskService.wakeLock == null || !((wakeLock = HeadlessJsTaskService.wakeLock) == null || wakeLock.isHeld())) {
                Object systemService = context.getSystemService("power");
                AbstractC2855l.e(systemService, "null cannot be cast to non-null type android.os.PowerManager");
                PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) systemService).newWakeLock(1, HeadlessJsTaskService.class.getCanonicalName());
                wakeLockNewWakeLock.setReferenceCounted(false);
                wakeLockNewWakeLock.acquire();
                HeadlessJsTaskService.wakeLock = wakeLockNewWakeLock;
            }
        }

        private Companion() {
        }
    }

    public static final void acquireWakeLockNow(Context context) {
        INSTANCE.acquireWakeLockNow(context);
    }

    private final void createReactContextAndScheduleTask(final HeadlessJsTaskConfig taskConfig) {
        if (!ReactNativeNewArchitectureFeatureFlags.enableBridgelessArchitecture()) {
            final ReactInstanceManager reactInstanceManager = getReactNativeHost().getReactInstanceManager();
            AbstractC2855l.f(reactInstanceManager, "getReactInstanceManager(...)");
            reactInstanceManager.addReactInstanceEventListener(new ReactInstanceEventListener() { // from class: com.facebook.react.HeadlessJsTaskService.createReactContextAndScheduleTask.2
                @Override // com.facebook.react.ReactInstanceEventListener
                public void onReactContextInitialized(ReactContext context) {
                    AbstractC2855l.g(context, "context");
                    HeadlessJsTaskService.this.invokeStartTask(context, taskConfig);
                    reactInstanceManager.removeReactInstanceEventListener(this);
                }
            });
            reactInstanceManager.createReactContextInBackground();
            return;
        }
        final ReactHost reactHost = getReactHost();
        if (reactHost == null) {
            throw new IllegalStateException("Required value was null.");
        }
        reactHost.addReactInstanceEventListener(new ReactInstanceEventListener() { // from class: com.facebook.react.HeadlessJsTaskService.createReactContextAndScheduleTask.1
            @Override // com.facebook.react.ReactInstanceEventListener
            public void onReactContextInitialized(ReactContext context) {
                AbstractC2855l.g(context, "context");
                HeadlessJsTaskService.this.invokeStartTask(context, taskConfig);
                reactHost.removeReactInstanceEventListener(this);
            }
        });
        reactHost.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invokeStartTask(ReactContext reactContext, final HeadlessJsTaskConfig taskConfig) {
        final HeadlessJsTaskContext companion = HeadlessJsTaskContext.INSTANCE.getInstance(reactContext);
        companion.addTaskEventListener(this);
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.d
            @Override // java.lang.Runnable
            public final void run() {
                HeadlessJsTaskService.invokeStartTask$lambda$0(companion, taskConfig, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeStartTask$lambda$0(HeadlessJsTaskContext headlessJsTaskContext, HeadlessJsTaskConfig headlessJsTaskConfig, HeadlessJsTaskService headlessJsTaskService) {
        headlessJsTaskService.activeTasks.add(Integer.valueOf(headlessJsTaskContext.startTask(headlessJsTaskConfig)));
    }

    protected final ReactContext getReactContext() {
        if (!ReactNativeNewArchitectureFeatureFlags.enableBridgelessArchitecture()) {
            ReactInstanceManager reactInstanceManager = getReactNativeHost().getReactInstanceManager();
            AbstractC2855l.f(reactInstanceManager, "getReactInstanceManager(...)");
            return reactInstanceManager.getCurrentReactContext();
        }
        ReactHost reactHost = getReactHost();
        if (reactHost != null) {
            return reactHost.getCurrentReactContext();
        }
        throw new IllegalStateException("ReactHost is not initialized in New Architecture");
    }

    protected ReactHost getReactHost() {
        ComponentCallbacks2 application = getApplication();
        AbstractC2855l.e(application, "null cannot be cast to non-null type com.facebook.react.ReactApplication");
        return ((ReactApplication) application).getReactHost();
    }

    protected ReactNativeHost getReactNativeHost() {
        ComponentCallbacks2 application = getApplication();
        AbstractC2855l.e(application, "null cannot be cast to non-null type com.facebook.react.ReactApplication");
        return ((ReactApplication) application).getReactNativeHost();
    }

    protected HeadlessJsTaskConfig getTaskConfig(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        AbstractC2855l.g(intent, "intent");
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ReactContext reactContext = getReactContext();
        if (reactContext != null) {
            HeadlessJsTaskContext.INSTANCE.getInstance(reactContext).removeTaskEventListener(this);
        }
        PowerManager.WakeLock wakeLock2 = wakeLock;
        if (wakeLock2 != null) {
            wakeLock2.release();
        }
    }

    @Override // com.facebook.react.jstasks.HeadlessJsTaskEventListener
    public void onHeadlessJsTaskFinish(int taskId) {
        this.activeTasks.remove(Integer.valueOf(taskId));
        if (this.activeTasks.isEmpty()) {
            stopSelf();
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        HeadlessJsTaskConfig taskConfig = getTaskConfig(intent);
        if (taskConfig == null) {
            return 2;
        }
        startTask(taskConfig);
        return 3;
    }

    protected final void startTask(HeadlessJsTaskConfig taskConfig) {
        AbstractC2855l.g(taskConfig, "taskConfig");
        UiThreadUtil.assertOnUiThread();
        INSTANCE.acquireWakeLockNow(this);
        ReactContext reactContext = getReactContext();
        if (reactContext == null) {
            createReactContextAndScheduleTask(taskConfig);
        } else {
            invokeStartTask(reactContext, taskConfig);
        }
    }

    protected static /* synthetic */ void getReactNativeHost$annotations() {
    }

    @Override // com.facebook.react.jstasks.HeadlessJsTaskEventListener
    public void onHeadlessJsTaskStart(int taskId) {
    }
}
