package expo.modules.adapters.react.apploader;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import com.facebook.react.ReactApplication;
import com.facebook.react.ReactHost;
import com.facebook.react.ReactInstanceEventListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.apploader.HeadlessAppLoader;
import expo.modules.core.interfaces.Consumer;
import expo.modules.core.interfaces.DoNotStrip;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.I;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lexpo/modules/adapters/react/apploader/RNHeadlessAppLoader;", "Lexpo/modules/apploader/HeadlessAppLoader;", "<init>", "()V", "Landroid/content/Context;", "context", "Lexpo/modules/apploader/HeadlessAppLoader$Params;", "params", "Ljava/lang/Runnable;", "alreadyRunning", "Lexpo/modules/core/interfaces/Consumer;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "callback", "Li7/B;", "loadApp", "(Landroid/content/Context;Lexpo/modules/apploader/HeadlessAppLoader$Params;Ljava/lang/Runnable;Lexpo/modules/core/interfaces/Consumer;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "appScopeKey", "invalidateApp", "(Ljava/lang/String;)Z", "isRunning", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RNHeadlessAppLoader implements HeadlessAppLoader {
    @DoNotStrip
    public RNHeadlessAppLoader() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invalidateApp$lambda$1(ReactHost reactHost, String str) {
        if (reactHost.getLifecycleState() == LifecycleState.BEFORE_CREATE) {
            reactHost.destroy("Closing headless task app", null);
        }
        I.c(RNHeadlessAppLoaderKt.appRecords).remove(str);
    }

    @Override // expo.modules.apploader.HeadlessAppLoader
    @SuppressLint({"VisibleForTests"})
    public boolean invalidateApp(final String appScopeKey) {
        ReactContext reactContext;
        if (!RNHeadlessAppLoaderKt.appRecords.containsKey(appScopeKey) || RNHeadlessAppLoaderKt.appRecords.get(appScopeKey) == null || (reactContext = (ReactContext) RNHeadlessAppLoaderKt.appRecords.get(appScopeKey)) == null) {
            return false;
        }
        Object applicationContext = reactContext.getApplicationContext();
        AbstractC2855l.e(applicationContext, "null cannot be cast to non-null type com.facebook.react.ReactApplication");
        final ReactHost reactHost = ((ReactApplication) applicationContext).getReactHost();
        if (reactHost == null) {
            throw new IllegalStateException("Your application does not have a valid reactHost");
        }
        new Handler(reactContext.getMainLooper()).post(new Runnable() { // from class: expo.modules.adapters.react.apploader.a
            @Override // java.lang.Runnable
            public final void run() {
                RNHeadlessAppLoader.invalidateApp$lambda$1(reactHost, appScopeKey);
            }
        });
        return true;
    }

    @Override // expo.modules.apploader.HeadlessAppLoader
    public boolean isRunning(String appScopeKey) {
        return RNHeadlessAppLoaderKt.appRecords.get(appScopeKey) != null;
    }

    @Override // expo.modules.apploader.HeadlessAppLoader
    public void loadApp(Context context, final HeadlessAppLoader.Params params, Runnable alreadyRunning, final Consumer<Boolean> callback) {
        AbstractC2855l.g(context, "context");
        if (params == null || params.getAppScopeKey() == null) {
            throw new IllegalArgumentException("Params must be set with appScopeKey!");
        }
        if (!(context.getApplicationContext() instanceof ReactApplication)) {
            throw new IllegalStateException("Your application must implement ReactApplication");
        }
        if (RNHeadlessAppLoaderKt.appRecords.containsKey(params.getAppScopeKey())) {
            if (alreadyRunning != null) {
                alreadyRunning.run();
                return;
            }
            return;
        }
        Object applicationContext = context.getApplicationContext();
        AbstractC2855l.e(applicationContext, "null cannot be cast to non-null type com.facebook.react.ReactApplication");
        final ReactHost reactHost = ((ReactApplication) applicationContext).getReactHost();
        if (reactHost == null) {
            throw new IllegalStateException("Your application does not have a valid reactHost");
        }
        reactHost.addReactInstanceEventListener(new ReactInstanceEventListener() { // from class: expo.modules.adapters.react.apploader.RNHeadlessAppLoader.loadApp.1
            @Override // com.facebook.react.ReactInstanceEventListener
            public void onReactContextInitialized(ReactContext context2) {
                AbstractC2855l.g(context2, "context");
                reactHost.removeReactInstanceEventListener(this);
                RNHeadlessAppLoaderKt.appRecords.put(params.getAppScopeKey(), context2);
                Consumer<Boolean> consumer = callback;
                if (consumer != null) {
                    consumer.apply(Boolean.TRUE);
                }
            }
        });
        new Handler(context.getMainLooper()).post(new Runnable() { // from class: expo.modules.adapters.react.apploader.b
            @Override // java.lang.Runnable
            public final void run() {
                reactHost.start();
            }
        });
    }
}
