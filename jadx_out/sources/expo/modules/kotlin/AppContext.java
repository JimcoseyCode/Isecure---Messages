package expo.modules.kotlin;

import R8.C1404d0;
import R8.M;
import R8.N;
import R8.O;
import R8.T0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.View;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.uimanager.NativeViewHierarchyManager;
import com.facebook.react.uimanager.UIBlock;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.adapters.react.NativeModulesProxy;
import expo.modules.core.errors.ContextDestroyedException;
import expo.modules.core.interfaces.ActivityProvider;
import expo.modules.core.logging.Logger;
import expo.modules.interfaces.permissions.Permissions;
import expo.modules.kotlin.activityresult.ActivityResultsManager;
import expo.modules.kotlin.activityresult.DefaultAppContextActivityResultCaller;
import expo.modules.kotlin.defaultmodules.JSLoggerModule;
import expo.modules.kotlin.defaultmodules.NativeModulesProxyModule;
import expo.modules.kotlin.events.EventEmitter;
import expo.modules.kotlin.events.EventName;
import expo.modules.kotlin.events.KEventEmitterWrapper;
import expo.modules.kotlin.events.KModuleEventEmitterWrapper;
import expo.modules.kotlin.events.OnActivityResultPayload;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.providers.CurrentActivityProvider;
import expo.modules.kotlin.runtime.MainRuntime;
import expo.modules.kotlin.runtime.WorkletRuntime;
import expo.modules.kotlin.services.AppDirectoriesService;
import expo.modules.kotlin.services.FilePermissionService;
import expo.modules.kotlin.services.Service;
import expo.modules.kotlin.services.ServicesRegistry;
import i7.AbstractC2746i;
import i7.C2735B;
import j7.AbstractC2800q;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import l1.AbstractC2861a;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0094\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rJ\r\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\rJ\u001a\u0010\u0011\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0010\u0018\u0001H\u0086\b¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0015\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0014\u0018\u0001*\u00020\u0013H\u0086\b¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0015\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0014*\u00020\u00132\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017¢\u0006\u0004\b\u0015\u0010\u0019J\u0017\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001f\u0010\rJ\u000f\u0010\"\u001a\u00020\u000bH\u0000¢\u0006\u0004\b!\u0010\rJ\u000f\u0010$\u001a\u00020\u000bH\u0000¢\u0006\u0004\b#\u0010\rJ\u000f\u0010&\u001a\u00020\u000bH\u0000¢\u0006\u0004\b%\u0010\rJ\u000f\u0010(\u001a\u00020\u000bH\u0000¢\u0006\u0004\b'\u0010\rJ1\u00102\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+2\b\u0010/\u001a\u0004\u0018\u00010.H\u0000¢\u0006\u0004\b0\u00101J\u0019\u00106\u001a\u00020\u000b2\b\u00103\u001a\u0004\u0018\u00010.H\u0000¢\u0006\u0004\b4\u00105J#\u00109\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0014*\u0002072\u0006\u00108\u001a\u00020+H\u0007¢\u0006\u0004\b9\u0010:J\u001d\u0010?\u001a\u00020\u000b2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u000b0;H\u0000¢\u0006\u0004\b=\u0010>J\u000f\u0010A\u001a\u00020\u000bH\u0000¢\u0006\u0004\b@\u0010\rJ\u0017\u0010D\u001a\u00020\u000b2\u0006\u0010C\u001a\u00020BH\u0007¢\u0006\u0004\bD\u0010ER\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010F\u001a\u0004\bG\u0010HR \u0010J\u001a\u00020I8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bJ\u0010K\u0012\u0004\bN\u0010\r\u001a\u0004\bL\u0010MR\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020P0O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010T\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010W\u001a\u00020V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010Z\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0017\u0010]\u001a\u00020\\8\u0006¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u0017\u0010a\u001a\u00020\\8\u0006¢\u0006\f\n\u0004\ba\u0010^\u001a\u0004\bb\u0010`R\u0017\u0010c\u001a\u00020\\8\u0006¢\u0006\f\n\u0004\bc\u0010^\u001a\u0004\bd\u0010`R\u0017\u0010f\u001a\u00020e8\u0006¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR\u0017\u0010k\u001a\u00020j8\u0006¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR*\u0010p\u001a\n\u0012\u0004\u0012\u00020o\u0018\u00010\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bp\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\u0014\u0010w\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u001a\u0010z\u001a\u00020y8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}R.\u0010\u0084\u0001\u001a\n\u0018\u00010~j\u0004\u0018\u0001`\u007f8FX\u0087\u0084\u0002¢\u0006\u0016\n\u0005\b\u0080\u0001\u0010R\u0012\u0005\b\u0083\u0001\u0010\r\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\"\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0085\u00018FX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b\u0086\u0001\u0010R\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u008d\u0001\u001a\u00030\u008a\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0013\u0010\u008f\u0001\u001a\u00020I8F¢\u0006\u0007\u001a\u0005\b\u008e\u0001\u0010MR\u0014\u0010\u0092\u0001\u001a\u00020P8F¢\u0006\b\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0015\u0010\u0096\u0001\u001a\u00030\u0093\u00018F¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0015\u0010\u009a\u0001\u001a\u00030\u0097\u00018F¢\u0006\b\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0015\u0010\u009c\u0001\u001a\u00030\u0097\u00018F¢\u0006\b\u001a\u0006\b\u009b\u0001\u0010\u0099\u0001R\u0017\u0010 \u0001\u001a\u0005\u0018\u00010\u009d\u00018F¢\u0006\b\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0017\u0010¤\u0001\u001a\u0005\u0018\u00010¡\u00018F¢\u0006\b\u001a\u0006\b¢\u0001\u0010£\u0001R\u0017\u0010¨\u0001\u001a\u0005\u0018\u00010¥\u00018F¢\u0006\b\u001a\u0006\b¦\u0001\u0010§\u0001R\u0014\u0010«\u0001\u001a\u00020V8F¢\u0006\b\u001a\u0006\b©\u0001\u0010ª\u0001R\u0019\u0010®\u0001\u001a\u0004\u0018\u00010\u001c8@X\u0080\u0004¢\u0006\b\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R\u0019\u0010±\u0001\u001a\u0004\u0018\u00010)8VX\u0096\u0004¢\u0006\b\u001a\u0006\b¯\u0001\u0010°\u0001R\u0014\u0010³\u0001\u001a\u00020)8F¢\u0006\b\u001a\u0006\b²\u0001\u0010°\u0001¨\u0006´\u0001"}, d2 = {"Lexpo/modules/kotlin/AppContext;", "Lexpo/modules/kotlin/providers/CurrentActivityProvider;", "Lexpo/modules/kotlin/ModulesProvider;", "modulesProvider", "Lexpo/modules/core/ModuleRegistry;", "legacyModuleRegistry", "Ljava/lang/ref/WeakReference;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContextHolder", "<init>", "(Lexpo/modules/kotlin/ModulesProvider;Lexpo/modules/core/ModuleRegistry;Ljava/lang/ref/WeakReference;)V", "Li7/B;", "registerInlineModulesList", "()V", "onCreate", "installJSIInterop", "Module", "legacyModule", "()Ljava/lang/Object;", "Lexpo/modules/kotlin/services/Service;", "T", "service", "()Lexpo/modules/kotlin/services/Service;", "Ljava/lang/Class;", "serviceClass", "(Ljava/lang/Class;)Lexpo/modules/kotlin/services/Service;", "Lexpo/modules/kotlin/modules/Module;", "module", "Lexpo/modules/kotlin/events/EventEmitter;", "eventEmitter", "(Lexpo/modules/kotlin/modules/Module;)Lexpo/modules/kotlin/events/EventEmitter;", "onDestroy$expo_modules_core_release", "onDestroy", "onHostResume$expo_modules_core_release", "onHostResume", "onHostPause$expo_modules_core_release", "onHostPause", "onUserLeaveHint$expo_modules_core_release", "onUserLeaveHint", "onHostDestroy$expo_modules_core_release", "onHostDestroy", "Landroid/app/Activity;", "activity", PointerEventHelper.POINTER_TYPE_UNKNOWN, "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult$expo_modules_core_release", "(Landroid/app/Activity;IILandroid/content/Intent;)V", "onActivityResult", "intent", "onNewIntent$expo_modules_core_release", "(Landroid/content/Intent;)V", "onNewIntent", "Landroid/view/View;", "viewTag", "findView", "(I)Landroid/view/View;", "Lkotlin/Function0;", "block", "dispatchOnMainUsingUIManager$expo_modules_core_release", "(Lw7/a;)V", "dispatchOnMainUsingUIManager", "assertMainThread$expo_modules_core_release", "assertMainThread", "Ljava/lang/Runnable;", "runnable", "executeOnJavaScriptThread", "(Ljava/lang/Runnable;)V", "Lexpo/modules/core/ModuleRegistry;", "getLegacyModuleRegistry", "()Lexpo/modules/core/ModuleRegistry;", "Lexpo/modules/kotlin/runtime/MainRuntime;", "hostingRuntimeContext", "Lexpo/modules/kotlin/runtime/MainRuntime;", "getHostingRuntimeContext", "()Lexpo/modules/kotlin/runtime/MainRuntime;", "getHostingRuntimeContext$annotations", "Lkotlin/Lazy;", "Lexpo/modules/kotlin/runtime/WorkletRuntime;", "uiRuntimeHolder", "Lkotlin/Lazy;", "Lexpo/modules/kotlin/ReactLifecycleDelegate;", "reactLifecycleDelegate", "Lexpo/modules/kotlin/ReactLifecycleDelegate;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hostWasDestroyed", "Z", "LS8/e;", "modulesQueueDispatcher", "LS8/e;", "LR8/N;", "backgroundCoroutineScope", "LR8/N;", "getBackgroundCoroutineScope", "()LR8/N;", "modulesQueue", "getModulesQueue", "mainQueue", "getMainQueue", "Lexpo/modules/kotlin/ModuleRegistry;", "registry", "Lexpo/modules/kotlin/ModuleRegistry;", "getRegistry", "()Lexpo/modules/kotlin/ModuleRegistry;", "Lexpo/modules/kotlin/services/ServicesRegistry;", "services", "Lexpo/modules/kotlin/services/ServicesRegistry;", "getServices", "()Lexpo/modules/kotlin/services/ServicesRegistry;", "Lexpo/modules/adapters/react/NativeModulesProxy;", "legacyModulesProxyHolder", "Ljava/lang/ref/WeakReference;", "getLegacyModulesProxyHolder$expo_modules_core_release", "()Ljava/lang/ref/WeakReference;", "setLegacyModulesProxyHolder$expo_modules_core_release", "(Ljava/lang/ref/WeakReference;)V", "Lexpo/modules/kotlin/activityresult/ActivityResultsManager;", "activityResultsManager", "Lexpo/modules/kotlin/activityresult/ActivityResultsManager;", "Lexpo/modules/kotlin/activityresult/DefaultAppContextActivityResultCaller;", "appContextActivityResultCaller", "Lexpo/modules/kotlin/activityresult/DefaultAppContextActivityResultCaller;", "getAppContextActivityResultCaller$expo_modules_core_release", "()Lexpo/modules/kotlin/activityresult/DefaultAppContextActivityResultCaller;", "Lexpo/modules/kotlin/defaultmodules/JSLoggerModule;", "Lexpo/modules/kotlin/defaultmodules/ErrorManagerModule;", "errorManager$delegate", "getErrorManager", "()Lexpo/modules/kotlin/defaultmodules/JSLoggerModule;", "getErrorManager$annotations", "errorManager", "Lexpo/modules/core/logging/Logger;", "jsLogger$delegate", "getJsLogger", "()Lexpo/modules/core/logging/Logger;", "jsLogger", "Lexpo/modules/kotlin/services/AppDirectoriesService;", "getAppDirectories", "()Lexpo/modules/kotlin/services/AppDirectoriesService;", "appDirectories", "getRuntime", "runtime", "getUiRuntime", "()Lexpo/modules/kotlin/runtime/WorkletRuntime;", "uiRuntime", "Lexpo/modules/kotlin/services/FilePermissionService;", "getFilePermission", "()Lexpo/modules/kotlin/services/FilePermissionService;", "filePermission", "Ljava/io/File;", "getPersistentFilesDirectory", "()Ljava/io/File;", "persistentFilesDirectory", "getCacheDirectory", "cacheDirectory", "Lexpo/modules/interfaces/permissions/Permissions;", "getPermissions", "()Lexpo/modules/interfaces/permissions/Permissions;", "permissions", "Lexpo/modules/core/interfaces/ActivityProvider;", "getActivityProvider", "()Lexpo/modules/core/interfaces/ActivityProvider;", "activityProvider", "Landroid/content/Context;", "getReactContext", "()Landroid/content/Context;", "reactContext", "getHasActiveReactInstance", "()Z", "hasActiveReactInstance", "getCallbackInvoker$expo_modules_core_release", "()Lexpo/modules/kotlin/events/EventEmitter;", "callbackInvoker", "getCurrentActivity", "()Landroid/app/Activity;", "currentActivity", "getThrowingActivity", "throwingActivity", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AppContext implements CurrentActivityProvider {
    private final ActivityResultsManager activityResultsManager;
    private final DefaultAppContextActivityResultCaller appContextActivityResultCaller;
    private final N backgroundCoroutineScope;

    /* JADX INFO: renamed from: errorManager$delegate, reason: from kotlin metadata */
    private final Lazy errorManager;
    private boolean hostWasDestroyed;
    private final MainRuntime hostingRuntimeContext;

    /* JADX INFO: renamed from: jsLogger$delegate, reason: from kotlin metadata */
    private final Lazy jsLogger;
    private final expo.modules.core.ModuleRegistry legacyModuleRegistry;
    private WeakReference<NativeModulesProxy> legacyModulesProxyHolder;
    private final N mainQueue;
    private final N modulesQueue;
    private final S8.e modulesQueueDispatcher;
    private final ReactLifecycleDelegate reactLifecycleDelegate;
    private final ModuleRegistry registry;
    private final ServicesRegistry services;
    private final Lazy uiRuntimeHolder;

    public AppContext(ModulesProvider modulesProvider, expo.modules.core.ModuleRegistry legacyModuleRegistry, final WeakReference<ReactApplicationContext> reactContextHolder) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        AbstractC2855l.g(modulesProvider, "modulesProvider");
        AbstractC2855l.g(legacyModuleRegistry, "legacyModuleRegistry");
        AbstractC2855l.g(reactContextHolder, "reactContextHolder");
        this.legacyModuleRegistry = legacyModuleRegistry;
        this.hostingRuntimeContext = new MainRuntime(this, reactContextHolder);
        this.uiRuntimeHolder = AbstractC2746i.b(new InterfaceC3487a() { // from class: expo.modules.kotlin.c
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return AppContext.uiRuntimeHolder$lambda$0(this.f26586g, reactContextHolder);
            }
        });
        ReactLifecycleDelegate reactLifecycleDelegate = new ReactLifecycleDelegate(this);
        this.reactLifecycleDelegate = reactLifecycleDelegate;
        HandlerThread handlerThread = new HandlerThread("expo.modules.AsyncFunctionQueue");
        handlerThread.start();
        S8.e eVarC = S8.f.c(new Handler(handlerThread.getLooper()), null, 1, null);
        this.modulesQueueDispatcher = eVarC;
        this.backgroundCoroutineScope = O.a(C1404d0.b().X(T0.b(null, 1, null)).X(new M("expo.modules.BackgroundCoroutineScope")));
        this.modulesQueue = O.a(eVarC.X(T0.b(null, 1, null)).X(new M("expo.modules.AsyncFunctionQueue")));
        this.mainQueue = O.a(C1404d0.c().X(T0.b(null, 1, null)).X(new M("expo.modules.MainQueue")));
        ModuleRegistry moduleRegistry = new ModuleRegistry(UtilsKt.weak(this));
        this.registry = moduleRegistry;
        ServicesRegistry servicesRegistry = new ServicesRegistry(UtilsKt.weak(this));
        this.services = servicesRegistry;
        ActivityResultsManager activityResultsManager = new ActivityResultsManager(this);
        this.activityResultsManager = activityResultsManager;
        this.appContextActivityResultCaller = new DefaultAppContextActivityResultCaller(activityResultsManager);
        ReactApplicationContext reactApplicationContext = reactContextHolder.get();
        if (reactApplicationContext == null) {
            throw new IllegalArgumentException("The app context should be created with valid react context.");
        }
        ReactApplicationContext reactApplicationContext2 = reactApplicationContext;
        legacyModuleRegistry.setAppContext(this);
        reactApplicationContext2.addLifecycleEventListener(reactLifecycleDelegate);
        reactApplicationContext2.addActivityEventListener(reactLifecycleDelegate);
        servicesRegistry.register(FilePermissionService.class);
        servicesRegistry.register(AppDirectoriesService.class);
        servicesRegistry.register(modulesProvider.getServices());
        moduleRegistry.register(new NativeModulesProxyModule(), null);
        moduleRegistry.register(new JSLoggerModule(), null);
        moduleRegistry.register(modulesProvider);
        registerInlineModulesList();
        CoreLoggerKt.getLogger().info("✅ AppContext was initialized");
        this.errorManager = AbstractC2746i.b(new InterfaceC3487a() { // from class: expo.modules.kotlin.d
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return AppContext.errorManager_delegate$lambda$7(this.f26589g);
            }
        });
        this.jsLogger = AbstractC2746i.b(new InterfaceC3487a() { // from class: expo.modules.kotlin.e
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return AppContext.jsLogger_delegate$lambda$8(this.f26590g);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dispatchOnMainUsingUIManager$lambda$15(InterfaceC3487a interfaceC3487a, NativeViewHierarchyManager it) {
        AbstractC2855l.g(it, "it");
        interfaceC3487a.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSLoggerModule errorManager_delegate$lambda$7(AppContext appContext) {
        Object next;
        Iterator<T> it = appContext.registry.getRegistry().values().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Module module = ((ModuleHolder) next).getModule();
            if (module != null ? module instanceof JSLoggerModule : true) {
                break;
            }
        }
        ModuleHolder moduleHolder = (ModuleHolder) next;
        Module module2 = moduleHolder != null ? moduleHolder.getModule() : null;
        return (JSLoggerModule) (module2 instanceof JSLoggerModule ? module2 : null);
    }

    private final AppDirectoriesService getAppDirectories() {
        Service service = getServices().getRegistry().get(AppDirectoriesService.class);
        if (!(service instanceof AppDirectoriesService)) {
            service = null;
        }
        AppDirectoriesService appDirectoriesService = (AppDirectoriesService) service;
        if (appDirectoriesService != null) {
            return appDirectoriesService;
        }
        throw new IllegalStateException("AppDirectoriesService is not registered in the ServicesRegistry.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Logger jsLogger_delegate$lambda$8(AppContext appContext) {
        Object next;
        Iterator<T> it = appContext.registry.getRegistry().values().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ModuleHolder) next).getModule() instanceof JSLoggerModule) {
                break;
            }
        }
        ModuleHolder moduleHolder = (ModuleHolder) next;
        Module module = moduleHolder != null ? moduleHolder.getModule() : null;
        if (!(module instanceof JSLoggerModule)) {
            module = null;
        }
        JSLoggerModule jSLoggerModule = (JSLoggerModule) module;
        if (jSLoggerModule != null) {
            return jSLoggerModule.getLogger();
        }
        return null;
    }

    private final void registerInlineModulesList() throws IllegalAccessException, InstantiationException, InvocationTargetException {
        try {
            Object objNewInstance = Class.forName("inline.modules.ExpoInlineModulesList").getConstructor(null).newInstance(null);
            AbstractC2855l.e(objNewInstance, "null cannot be cast to non-null type expo.modules.kotlin.ModulesProvider");
            this.registry.register((ModulesProvider) objNewInstance);
        } catch (ClassNotFoundException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkletRuntime uiRuntimeHolder$lambda$0(AppContext appContext, WeakReference weakReference) {
        return new WorkletRuntime(appContext, weakReference);
    }

    public final void assertMainThread$expo_modules_core_release() throws Exceptions.IncorrectThreadException {
        Utils utils = Utils.INSTANCE;
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return;
        }
        String name = Thread.currentThread().getName();
        AbstractC2855l.f(name, "getName(...)");
        String name2 = Looper.getMainLooper().getThread().getName();
        AbstractC2855l.f(name2, "getName(...)");
        throw new Exceptions.IncorrectThreadException(name, name2);
    }

    public final void dispatchOnMainUsingUIManager$expo_modules_core_release(final InterfaceC3487a block) throws Exceptions.ReactContextLost {
        AbstractC2855l.g(block, "block");
        ReactApplicationContext reactContext = getRuntime().getReactContext();
        if (reactContext == null) {
            throw new Exceptions.ReactContextLost();
        }
        UIManager uIManagerForReactTag = UIManagerHelper.getUIManagerForReactTag(reactContext, 1);
        AbstractC2855l.e(uIManagerForReactTag, "null cannot be cast to non-null type com.facebook.react.uimanager.UIManagerModule");
        ((UIManagerModule) uIManagerForReactTag).addUIBlock(new UIBlock() { // from class: expo.modules.kotlin.f
            @Override // com.facebook.react.uimanager.UIBlock
            public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                AppContext.dispatchOnMainUsingUIManager$lambda$15(block, nativeViewHierarchyManager);
            }
        });
    }

    public final EventEmitter eventEmitter(Module module) {
        Object module2;
        AbstractC2855l.g(module, "module");
        try {
            module2 = getLegacyModuleRegistry().getModule(expo.modules.core.interfaces.services.EventEmitter.class);
        } catch (Exception unused) {
            module2 = null;
        }
        expo.modules.core.interfaces.services.EventEmitter eventEmitter = (expo.modules.core.interfaces.services.EventEmitter) module2;
        if (eventEmitter == null) {
            return null;
        }
        ModuleHolder moduleHolder = this.registry.getModuleHolder(module);
        if (moduleHolder != null) {
            return new KModuleEventEmitterWrapper(moduleHolder, eventEmitter, getRuntime().getReactContextHolder());
        }
        String strO0 = AbstractC2800q.o0(this.registry.getRegistry().keySet(), ", ", null, null, 0, null, null, 62, null);
        throw new IllegalArgumentException(("Cannot create an event emitter for module " + module.getClass() + " that isn't present in the module registry. Available modules: [" + strO0 + "].").toString());
    }

    public final void executeOnJavaScriptThread(Runnable runnable) {
        AbstractC2855l.g(runnable, "runnable");
        ReactApplicationContext reactContext = getRuntime().getReactContext();
        if (reactContext != null) {
            reactContext.runOnJSQueueThread(runnable);
        }
    }

    public final <T extends View> T findView(int viewTag) {
        ReactApplicationContext reactContext = getRuntime().getReactContext();
        if (reactContext == null) {
            return null;
        }
        UIManager uIManagerForReactTag = UIManagerHelper.getUIManagerForReactTag(reactContext, viewTag);
        T t10 = uIManagerForReactTag != null ? (T) uIManagerForReactTag.resolveView(viewTag) : null;
        if (t10 != null) {
            return t10;
        }
        return null;
    }

    public final ActivityProvider getActivityProvider() {
        Object module;
        try {
            module = getLegacyModuleRegistry().getModule(ActivityProvider.class);
        } catch (Exception unused) {
            module = null;
        }
        return (ActivityProvider) module;
    }

    /* JADX INFO: renamed from: getAppContextActivityResultCaller$expo_modules_core_release, reason: from getter */
    public final DefaultAppContextActivityResultCaller getAppContextActivityResultCaller() {
        return this.appContextActivityResultCaller;
    }

    public final N getBackgroundCoroutineScope() {
        return this.backgroundCoroutineScope;
    }

    public final File getCacheDirectory() {
        return getAppDirectories().getCacheDirectory();
    }

    public final EventEmitter getCallbackInvoker$expo_modules_core_release() {
        Object module;
        try {
            module = getLegacyModuleRegistry().getModule(expo.modules.core.interfaces.services.EventEmitter.class);
        } catch (Exception unused) {
            module = null;
        }
        expo.modules.core.interfaces.services.EventEmitter eventEmitter = (expo.modules.core.interfaces.services.EventEmitter) module;
        if (eventEmitter == null) {
            return null;
        }
        return new KEventEmitterWrapper(eventEmitter, getRuntime().getReactContextHolder());
    }

    @Override // expo.modules.kotlin.providers.CurrentActivityProvider
    public Activity getCurrentActivity() {
        Activity currentActivity;
        ActivityProvider activityProvider = getActivityProvider();
        if (activityProvider != null && (currentActivity = activityProvider.getCurrentActivity()) != null) {
            return currentActivity;
        }
        Context reactContext = getReactContext();
        ReactApplicationContext reactApplicationContext = reactContext instanceof ReactApplicationContext ? (ReactApplicationContext) reactContext : null;
        if (reactApplicationContext != null) {
            return reactApplicationContext.getCurrentActivity();
        }
        return null;
    }

    public final JSLoggerModule getErrorManager() {
        return (JSLoggerModule) this.errorManager.getValue();
    }

    public final FilePermissionService getFilePermission() {
        Service service = getServices().getRegistry().get(FilePermissionService.class);
        if (!(service instanceof FilePermissionService)) {
            service = null;
        }
        FilePermissionService filePermissionService = (FilePermissionService) service;
        if (filePermissionService != null) {
            return filePermissionService;
        }
        throw new IllegalStateException("FilePermissionService is not registered in the ServicesRegistry.");
    }

    public final boolean getHasActiveReactInstance() {
        ReactApplicationContext reactContext = getRuntime().getReactContext();
        return reactContext != null && reactContext.hasActiveReactInstance();
    }

    public final MainRuntime getHostingRuntimeContext() {
        return this.hostingRuntimeContext;
    }

    public final Logger getJsLogger() {
        return (Logger) this.jsLogger.getValue();
    }

    public final expo.modules.core.ModuleRegistry getLegacyModuleRegistry() {
        return this.legacyModuleRegistry;
    }

    public final WeakReference<NativeModulesProxy> getLegacyModulesProxyHolder$expo_modules_core_release() {
        return this.legacyModulesProxyHolder;
    }

    public final N getMainQueue() {
        return this.mainQueue;
    }

    public final N getModulesQueue() {
        return this.modulesQueue;
    }

    public final Permissions getPermissions() {
        Object module;
        try {
            module = getLegacyModuleRegistry().getModule(Permissions.class);
        } catch (Exception unused) {
            module = null;
        }
        return (Permissions) module;
    }

    public final File getPersistentFilesDirectory() {
        return getAppDirectories().getPersistentFilesDirectory();
    }

    public final Context getReactContext() {
        return getRuntime().getReactContext();
    }

    public final ModuleRegistry getRegistry() {
        return this.registry;
    }

    public final MainRuntime getRuntime() {
        return this.hostingRuntimeContext;
    }

    public final ServicesRegistry getServices() {
        return this.services;
    }

    public final Activity getThrowingActivity() throws Exceptions.MissingActivity {
        Activity currentActivity;
        ActivityProvider activityProvider = getActivityProvider();
        if (activityProvider == null || (currentActivity = activityProvider.getCurrentActivity()) == null) {
            Context reactContext = getReactContext();
            ReactApplicationContext reactApplicationContext = reactContext instanceof ReactApplicationContext ? (ReactApplicationContext) reactContext : null;
            currentActivity = reactApplicationContext != null ? reactApplicationContext.getCurrentActivity() : null;
        }
        if (currentActivity != null) {
            return currentActivity;
        }
        throw new Exceptions.MissingActivity();
    }

    public final WorkletRuntime getUiRuntime() {
        return (WorkletRuntime) this.uiRuntimeHolder.getValue();
    }

    public final void installJSIInterop() {
        getRuntime().install$expo_modules_core_release();
    }

    public final /* synthetic */ <Module> Module legacyModule() {
        try {
            expo.modules.core.ModuleRegistry legacyModuleRegistry = getLegacyModuleRegistry();
            AbstractC2855l.m(4, "Module");
            return (Module) legacyModuleRegistry.getModule(Object.class);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void onActivityResult$expo_modules_core_release(Activity activity, int requestCode, int resultCode, Intent data) {
        AbstractC2855l.g(activity, "activity");
        this.activityResultsManager.onActivityResult(requestCode, resultCode, data);
        this.registry.post(EventName.ON_ACTIVITY_RESULT, activity, new OnActivityResultPayload(requestCode, resultCode, data));
    }

    public final void onCreate() {
        AbstractC2861a.c("[ExpoModulesCore] AppContext.onCreate");
        try {
            getRegistry().postOnCreate();
            C2735B c2735b = C2735B.f28704a;
        } finally {
            AbstractC2861a.f();
        }
    }

    public final void onDestroy$expo_modules_core_release() {
        AbstractC2861a.c("[ExpoModulesCore] AppContext.onDestroy");
        try {
            ReactApplicationContext reactContext = getRuntime().getReactContext();
            if (reactContext != null) {
                reactContext.removeLifecycleEventListener(this.reactLifecycleDelegate);
                reactContext.removeActivityEventListener(this.reactLifecycleDelegate);
            }
            ModuleRegistry registry = getRegistry();
            registry.post(EventName.MODULE_DESTROY);
            registry.cleanUp();
            O.b(getModulesQueue(), new ContextDestroyedException(null, 1, null));
            O.b(getMainQueue(), new ContextDestroyedException(null, 1, null));
            O.b(getBackgroundCoroutineScope(), new ContextDestroyedException(null, 1, null));
            getRuntime().deallocate$expo_modules_core_release();
            if (this.uiRuntimeHolder.e()) {
                getUiRuntime().deallocate$expo_modules_core_release();
            }
            CoreLoggerKt.getLogger().info("✅ AppContext was destroyed");
            C2735B c2735b = C2735B.f28704a;
            AbstractC2861a.f();
        } catch (Throwable th) {
            AbstractC2861a.f();
            throw th;
        }
    }

    public final void onHostDestroy$expo_modules_core_release() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            if (!(currentActivity instanceof androidx.appcompat.app.d)) {
                Activity currentActivity2 = getCurrentActivity();
                throw new IllegalStateException(("Current Activity is of incorrect class, expected AppCompatActivity, received " + (currentActivity2 != null ? currentActivity2.getLocalClassName() : null)).toString());
            }
            this.activityResultsManager.onHostDestroy((androidx.appcompat.app.d) currentActivity);
        }
        this.registry.post(EventName.ACTIVITY_DESTROYS);
        this.hostWasDestroyed = true;
    }

    public final void onHostPause$expo_modules_core_release() {
        this.registry.post(EventName.ACTIVITY_ENTERS_BACKGROUND);
    }

    public final void onHostResume$expo_modules_core_release() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        if (currentActivity instanceof androidx.appcompat.app.d) {
            if (this.hostWasDestroyed) {
                this.hostWasDestroyed = false;
                this.registry.registerActivityContracts$expo_modules_core_release();
            }
            this.activityResultsManager.onHostResume((androidx.appcompat.app.d) currentActivity);
            this.registry.post(EventName.ACTIVITY_ENTERS_FOREGROUND);
            return;
        }
        Activity currentActivity2 = getCurrentActivity();
        throw new IllegalStateException(("Current Activity is of incorrect class, expected AppCompatActivity, received " + (currentActivity2 != null ? currentActivity2.getLocalClassName() : null)).toString());
    }

    public final void onNewIntent$expo_modules_core_release(Intent intent) {
        this.registry.post(EventName.ON_NEW_INTENT, intent);
    }

    public final void onUserLeaveHint$expo_modules_core_release() {
        this.registry.post(EventName.ON_USER_LEAVES_ACTIVITY);
    }

    public final /* synthetic */ <T extends Service> T service() {
        Map<Class<? extends Service>, Service> registry = getServices().getRegistry();
        AbstractC2855l.m(4, "T");
        Service service = registry.get(Service.class);
        AbstractC2855l.m(2, "T");
        return (T) service;
    }

    public final void setLegacyModulesProxyHolder$expo_modules_core_release(WeakReference<NativeModulesProxy> weakReference) {
        this.legacyModulesProxyHolder = weakReference;
    }

    public final <T extends Service> T service(Class<T> serviceClass) {
        AbstractC2855l.g(serviceClass, "serviceClass");
        Service service = this.services.getRegistry().get(serviceClass);
        if (service instanceof Service) {
            return (T) service;
        }
        return null;
    }

    public static /* synthetic */ void getErrorManager$annotations() {
    }

    public static /* synthetic */ void getHostingRuntimeContext$annotations() {
    }
}
