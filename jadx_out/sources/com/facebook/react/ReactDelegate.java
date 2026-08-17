package com.facebook.react;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.devsupport.DoubleTapReloadRecognizer;
import com.facebook.react.devsupport.ReleaseDevSupportManager;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.interfaces.fabric.ReactSurface;
import com.facebook.react.internal.featureflags.ReactNativeNewArchitectureFeatureFlags;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B/\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB/\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000eB7\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\n\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0014J\r\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0014J\r\u0010\u0018\u001a\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010#\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\"\u001a\u00020\u000f¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u000f¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00122\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b*\u0010+J\u001d\u0010/\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u0015\u00101\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\u001e¢\u0006\u0004\b1\u00102J\r\u00103\u001a\u00020\u0012¢\u0006\u0004\b3\u0010\u0014J\r\u00104\u001a\u00020\u0012¢\u0006\u0004\b4\u0010\u0014J\u0015\u00104\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020\u0012¢\u0006\u0004\b6\u0010\u0014J\u0017\u00109\u001a\u00020\u00122\b\u00108\u001a\u0004\u0018\u000107¢\u0006\u0004\b9\u0010:J\u0011\u0010<\u001a\u0004\u0018\u00010;H\u0014¢\u0006\u0004\b<\u0010=J\u001f\u0010>\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\u001e2\b\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b>\u00100J\u000f\u0010@\u001a\u00020?H\u0007¢\u0006\u0004\b@\u0010AR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010BR\u0018\u0010C\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010GR\u0018\u0010I\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0005\u0010K\u0012\u0004\bL\u0010\u0014R(\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010M\u001a\u0004\u0018\u00010\f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\r\u0010N\u001a\u0004\bO\u0010PR\u0018\u00108\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010QR$\u0010R\u001a\u00020\u000f2\u0006\u0010M\u001a\u00020\u000f8\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bR\u0010\u0019R\u0016\u0010W\u001a\u0004\u0018\u00010T8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bU\u0010VR(\u0010X\u001a\u0004\u0018\u00010;2\b\u0010X\u001a\u0004\u0018\u00010;8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bY\u0010=\"\u0004\bZ\u0010[R\u0013\u0010_\u001a\u0004\u0018\u00010\\8F¢\u0006\u0006\u001a\u0004\b]\u0010^¨\u0006`"}, d2 = {"Lcom/facebook/react/ReactDelegate;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Landroid/app/Activity;", "activity", "Lcom/facebook/react/ReactNativeHost;", "reactNativeHost", PointerEventHelper.POINTER_TYPE_UNKNOWN, "appKey", "Landroid/os/Bundle;", "launchOptions", "<init>", "(Landroid/app/Activity;Lcom/facebook/react/ReactNativeHost;Ljava/lang/String;Landroid/os/Bundle;)V", "Lcom/facebook/react/ReactHost;", "reactHost", "(Landroid/app/Activity;Lcom/facebook/react/ReactHost;Ljava/lang/String;Landroid/os/Bundle;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "fabricEnabled", "(Landroid/app/Activity;Lcom/facebook/react/ReactNativeHost;Ljava/lang/String;Landroid/os/Bundle;Z)V", "Li7/B;", "onHostResume", "()V", "onUserLeaveHint", "onHostPause", "onHostDestroy", "onBackPressed", "()Z", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)Z", PointerEventHelper.POINTER_TYPE_UNKNOWN, "requestCode", "resultCode", "data", "shouldForwardToReactInstance", "onActivityResult", "(IILandroid/content/Intent;Z)V", "hasFocus", "onWindowFocusChanged", "(Z)V", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "keyCode", "Landroid/view/KeyEvent;", "event", "onKeyDown", "(ILandroid/view/KeyEvent;)Z", "onKeyLongPress", "(I)Z", "reload", "loadApp", "(Ljava/lang/String;)V", "unloadApp", "Lcom/facebook/react/interfaces/fabric/ReactSurface;", "reactSurface", "setReactSurface", "(Lcom/facebook/react/interfaces/fabric/ReactSurface;)V", "Lcom/facebook/react/ReactRootView;", "createRootView", "()Lcom/facebook/react/ReactRootView;", "shouldShowDevMenuOrReload", "Lcom/facebook/react/ReactInstanceManager;", "getReactInstanceManager", "()Lcom/facebook/react/ReactInstanceManager;", "Landroid/app/Activity;", "internalReactRootView", "Lcom/facebook/react/ReactRootView;", "mainComponentName", "Ljava/lang/String;", "Landroid/os/Bundle;", "Lcom/facebook/react/devsupport/DoubleTapReloadRecognizer;", "doubleTapReloadRecognizer", "Lcom/facebook/react/devsupport/DoubleTapReloadRecognizer;", "Lcom/facebook/react/ReactNativeHost;", "getReactNativeHost$annotations", "value", "Lcom/facebook/react/ReactHost;", "getReactHost", "()Lcom/facebook/react/ReactHost;", "Lcom/facebook/react/interfaces/fabric/ReactSurface;", "isFabricEnabled", "Z", "Lcom/facebook/react/devsupport/interfaces/DevSupportManager;", "getDevSupportManager", "()Lcom/facebook/react/devsupport/interfaces/DevSupportManager;", "devSupportManager", "reactRootView", "getReactRootView", "setReactRootView", "(Lcom/facebook/react/ReactRootView;)V", "Lcom/facebook/react/bridge/ReactContext;", "getCurrentReactContext", "()Lcom/facebook/react/bridge/ReactContext;", "currentReactContext", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ReactDelegate {
    private final Activity activity;
    private DoubleTapReloadRecognizer doubleTapReloadRecognizer;
    private ReactRootView internalReactRootView;
    private boolean isFabricEnabled;
    private Bundle launchOptions;
    private final String mainComponentName;
    private ReactHost reactHost;
    private ReactNativeHost reactNativeHost;
    private ReactSurface reactSurface;

    public ReactDelegate(Activity activity, ReactNativeHost reactNativeHost, String str, Bundle bundle) {
        AbstractC2855l.g(activity, "activity");
        this.isFabricEnabled = ReactNativeNewArchitectureFeatureFlags.enableFabricRenderer();
        this.activity = activity;
        this.mainComponentName = str;
        this.launchOptions = bundle;
        this.doubleTapReloadRecognizer = new DoubleTapReloadRecognizer();
        this.reactNativeHost = reactNativeHost;
    }

    private final DevSupportManager getDevSupportManager() {
        ReactNativeHost reactNativeHost;
        ReactInstanceManager reactInstanceManager;
        if (ReactNativeNewArchitectureFeatureFlags.enableBridgelessArchitecture()) {
            ReactHost reactHost = this.reactHost;
            if ((reactHost != null ? reactHost.getDevSupportManager() : null) != null) {
                ReactHost reactHost2 = this.reactHost;
                if (reactHost2 != null) {
                    return reactHost2.getDevSupportManager();
                }
                return null;
            }
        }
        ReactNativeHost reactNativeHost2 = this.reactNativeHost;
        if (reactNativeHost2 != null && reactNativeHost2.hasInstance()) {
            ReactNativeHost reactNativeHost3 = this.reactNativeHost;
            if ((reactNativeHost3 != null ? reactNativeHost3.getReactInstanceManager() : null) != null && (reactNativeHost = this.reactNativeHost) != null && (reactInstanceManager = reactNativeHost.getReactInstanceManager()) != null) {
                return reactInstanceManager.getDevSupportManager();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reload$lambda$0(ReactDelegate reactDelegate) {
        ReactNativeHost reactNativeHost;
        ReactInstanceManager reactInstanceManager;
        ReactNativeHost reactNativeHost2 = reactDelegate.reactNativeHost;
        if (reactNativeHost2 == null || !reactNativeHost2.hasInstance()) {
            return;
        }
        ReactNativeHost reactNativeHost3 = reactDelegate.reactNativeHost;
        if ((reactNativeHost3 != null ? reactNativeHost3.getReactInstanceManager() : null) == null || (reactNativeHost = reactDelegate.reactNativeHost) == null || (reactInstanceManager = reactNativeHost.getReactInstanceManager()) == null) {
            return;
        }
        reactInstanceManager.recreateReactContextInBackground();
    }

    protected ReactRootView createRootView() {
        ReactRootView reactRootView = new ReactRootView(this.activity);
        reactRootView.setIsFabric(this.isFabricEnabled);
        return reactRootView;
    }

    public final ReactContext getCurrentReactContext() {
        if (!ReactNativeNewArchitectureFeatureFlags.enableBridgelessArchitecture()) {
            return getReactInstanceManager().getCurrentReactContext();
        }
        ReactHost reactHost = this.reactHost;
        if (reactHost == null || reactHost == null) {
            return null;
        }
        return reactHost.getCurrentReactContext();
    }

    public final ReactHost getReactHost() {
        return this.reactHost;
    }

    public final ReactInstanceManager getReactInstanceManager() {
        ReactNativeHost reactNativeHost = this.reactNativeHost;
        if (reactNativeHost == null) {
            throw new IllegalStateException("Cannot get ReactInstanceManager without a ReactNativeHost.");
        }
        ReactInstanceManager reactInstanceManager = reactNativeHost.getReactInstanceManager();
        AbstractC2855l.f(reactInstanceManager, "getReactInstanceManager(...)");
        return reactInstanceManager;
    }

    public final ReactRootView getReactRootView() {
        if (!ReactNativeNewArchitectureFeatureFlags.enableBridgelessArchitecture()) {
            return this.internalReactRootView;
        }
        ReactSurface reactSurface = this.reactSurface;
        if (reactSurface != null) {
            return (ReactRootView) (reactSurface != null ? reactSurface.getView() : null);
        }
        return null;
    }

    /* JADX INFO: renamed from: isFabricEnabled, reason: from getter */
    protected final boolean getIsFabricEnabled() {
        return this.isFabricEnabled;
    }

    public final void loadApp() {
        String str = this.mainComponentName;
        if (str == null) {
            throw new IllegalArgumentException("Cannot loadApp without a main component name.");
        }
        loadApp(str);
    }

    public final void onActivityResult(int requestCode, int resultCode, Intent data, boolean shouldForwardToReactInstance) {
        ReactNativeHost reactNativeHost;
        ReactInstanceManager reactInstanceManager;
        ReactHost reactHost;
        if (ReactNativeNewArchitectureFeatureFlags.enableBridgelessArchitecture() && (reactHost = this.reactHost) != null && shouldForwardToReactInstance) {
            if (reactHost != null) {
                reactHost.onActivityResult(this.activity, requestCode, resultCode, data);
                return;
            }
            return;
        }
        ReactNativeHost reactNativeHost2 = this.reactNativeHost;
        if (reactNativeHost2 == null || !reactNativeHost2.hasInstance() || !shouldForwardToReactInstance || (reactNativeHost = this.reactNativeHost) == null || (reactInstanceManager = reactNativeHost.getReactInstanceManager()) == null) {
            return;
        }
        reactInstanceManager.onActivityResult(this.activity, requestCode, resultCode, data);
    }

    public final boolean onBackPressed() {
        ReactInstanceManager reactInstanceManager;
        ReactHost reactHost;
        if (ReactNativeNewArchitectureFeatureFlags.enableBridgelessArchitecture() && (reactHost = this.reactHost) != null) {
            if (reactHost != null) {
                reactHost.onBackPressed();
            }
            return true;
        }
        ReactNativeHost reactNativeHost = this.reactNativeHost;
        if (reactNativeHost == null || !reactNativeHost.hasInstance()) {
            return false;
        }
        ReactNativeHost reactNativeHost2 = this.reactNativeHost;
        if (reactNativeHost2 != null && (reactInstanceManager = reactNativeHost2.getReactInstanceManager()) != null) {
            reactInstanceManager.onBackPressed();
        }
        return true;
    }

    public final void onConfigurationChanged(Configuration newConfig) {
        ReactHost reactHost;
        if (ReactNativeNewArchitectureFeatureFlags.enableBridgelessArchitecture() && (reactHost = this.reactHost) != null) {
            if (reactHost != null) {
                Activity activity = this.activity;
                if (activity == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                reactHost.onConfigurationChanged(activity);
                return;
            }
            return;
        }
        ReactNativeHost reactNativeHost = this.reactNativeHost;
        if (reactNativeHost == null || !reactNativeHost.hasInstance()) {
            return;
        }
        ReactInstanceManager reactInstanceManager = getReactInstanceManager();
        Activity activity2 = this.activity;
        if (activity2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        reactInstanceManager.onConfigurationChanged(activity2, newConfig);
    }

    public final void onHostDestroy() {
        ReactNativeHost reactNativeHost;
        ReactInstanceManager reactInstanceManager;
        ReactHost reactHost;
        unloadApp();
        if (ReactNativeNewArchitectureFeatureFlags.enableBridgelessArchitecture() && (reactHost = this.reactHost) != null) {
            if (reactHost != null) {
                reactHost.onHostDestroy(this.activity);
                return;
            }
            return;
        }
        ReactNativeHost reactNativeHost2 = this.reactNativeHost;
        if (reactNativeHost2 == null || !reactNativeHost2.hasInstance() || (reactNativeHost = this.reactNativeHost) == null || (reactInstanceManager = reactNativeHost.getReactInstanceManager()) == null) {
            return;
        }
        reactInstanceManager.onHostDestroy(this.activity);
    }

    public final void onHostPause() {
        ReactNativeHost reactNativeHost;
        ReactInstanceManager reactInstanceManager;
        ReactHost reactHost;
        if (ReactNativeNewArchitectureFeatureFlags.enableBridgelessArchitecture() && (reactHost = this.reactHost) != null) {
            if (reactHost != null) {
                reactHost.onHostPause(this.activity);
                return;
            }
            return;
        }
        ReactNativeHost reactNativeHost2 = this.reactNativeHost;
        if (reactNativeHost2 == null || !reactNativeHost2.hasInstance() || (reactNativeHost = this.reactNativeHost) == null || (reactInstanceManager = reactNativeHost.getReactInstanceManager()) == null) {
            return;
        }
        reactInstanceManager.onHostPause(this.activity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void onHostResume() {
        ReactNativeHost reactNativeHost;
        ReactInstanceManager reactInstanceManager;
        ReactHost reactHost;
        if (!(this.activity instanceof DefaultHardwareBackBtnHandler)) {
            throw new ClassCastException("Host Activity `" + this.activity.getClass().getSimpleName() + "` does not implement DefaultHardwareBackBtnHandler");
        }
        if (ReactNativeNewArchitectureFeatureFlags.enableBridgelessArchitecture() && (reactHost = this.reactHost) != null) {
            if (reactHost != null) {
                Activity activity = this.activity;
                AbstractC2855l.e(activity, "null cannot be cast to non-null type com.facebook.react.modules.core.DefaultHardwareBackBtnHandler");
                reactHost.onHostResume(activity, (DefaultHardwareBackBtnHandler) activity);
                return;
            }
            return;
        }
        ReactNativeHost reactNativeHost2 = this.reactNativeHost;
        if (reactNativeHost2 == null || !reactNativeHost2.hasInstance() || (reactNativeHost = this.reactNativeHost) == null || (reactInstanceManager = reactNativeHost.getReactInstanceManager()) == null) {
            return;
        }
        Activity activity2 = this.activity;
        AbstractC2855l.e(activity2, "null cannot be cast to non-null type com.facebook.react.modules.core.DefaultHardwareBackBtnHandler");
        reactInstanceManager.onHostResume(activity2, (DefaultHardwareBackBtnHandler) activity2);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onKeyDown(int keyCode, KeyEvent event) {
        ReactNativeHost reactNativeHost;
        AbstractC2855l.g(event, "event");
        if (keyCode != 90) {
            return false;
        }
        if (ReactNativeNewArchitectureFeatureFlags.enableBridgelessArchitecture()) {
            ReactHost reactHost = this.reactHost;
            if ((reactHost != null ? reactHost.getDevSupportManager() : null) == null) {
            }
        } else {
            ReactNativeHost reactNativeHost2 = this.reactNativeHost;
            if (reactNativeHost2 == null || !reactNativeHost2.hasInstance() || (reactNativeHost = this.reactNativeHost) == null || !reactNativeHost.getUseDeveloperSupport()) {
                return false;
            }
        }
        event.startTracking();
        return true;
    }

    public final boolean onKeyLongPress(int keyCode) {
        ReactNativeHost reactNativeHost;
        ReactInstanceManager reactInstanceManager;
        ReactHost reactHost;
        if (keyCode != 4 && keyCode != 90) {
            return false;
        }
        if (ReactNativeNewArchitectureFeatureFlags.enableBridgelessArchitecture() && (reactHost = this.reactHost) != null) {
            DevSupportManager devSupportManager = reactHost != null ? reactHost.getDevSupportManager() : null;
            if (devSupportManager == null || (devSupportManager instanceof ReleaseDevSupportManager)) {
                return false;
            }
            devSupportManager.showDevOptionsDialog();
            return true;
        }
        ReactNativeHost reactNativeHost2 = this.reactNativeHost;
        if (reactNativeHost2 == null || !reactNativeHost2.hasInstance() || (reactNativeHost = this.reactNativeHost) == null || !reactNativeHost.getUseDeveloperSupport()) {
            return false;
        }
        ReactNativeHost reactNativeHost3 = this.reactNativeHost;
        if (reactNativeHost3 != null && (reactInstanceManager = reactNativeHost3.getReactInstanceManager()) != null) {
            reactInstanceManager.showDevOptionsDialog();
        }
        return true;
    }

    public final boolean onNewIntent(Intent intent) {
        ReactInstanceManager reactInstanceManager;
        ReactHost reactHost;
        AbstractC2855l.g(intent, "intent");
        if (ReactNativeNewArchitectureFeatureFlags.enableBridgelessArchitecture() && (reactHost = this.reactHost) != null) {
            if (reactHost != null) {
                reactHost.onNewIntent(intent);
            }
            return true;
        }
        ReactNativeHost reactNativeHost = this.reactNativeHost;
        if (reactNativeHost == null || !reactNativeHost.hasInstance()) {
            return false;
        }
        ReactNativeHost reactNativeHost2 = this.reactNativeHost;
        if (reactNativeHost2 != null && (reactInstanceManager = reactNativeHost2.getReactInstanceManager()) != null) {
            reactInstanceManager.onNewIntent(intent);
        }
        return true;
    }

    public final void onUserLeaveHint() {
        ReactNativeHost reactNativeHost;
        ReactInstanceManager reactInstanceManager;
        ReactHost reactHost;
        if (ReactNativeNewArchitectureFeatureFlags.enableBridgelessArchitecture() && (reactHost = this.reactHost) != null) {
            if (reactHost != null) {
                reactHost.onHostLeaveHint(this.activity);
                return;
            }
            return;
        }
        ReactNativeHost reactNativeHost2 = this.reactNativeHost;
        if (reactNativeHost2 == null || !reactNativeHost2.hasInstance() || (reactNativeHost = this.reactNativeHost) == null || (reactInstanceManager = reactNativeHost.getReactInstanceManager()) == null) {
            return;
        }
        reactInstanceManager.onUserLeaveHint(this.activity);
    }

    public final void onWindowFocusChanged(boolean hasFocus) {
        ReactNativeHost reactNativeHost;
        ReactInstanceManager reactInstanceManager;
        ReactHost reactHost;
        if (ReactNativeNewArchitectureFeatureFlags.enableBridgelessArchitecture() && (reactHost = this.reactHost) != null) {
            if (reactHost != null) {
                reactHost.onWindowFocusChange(hasFocus);
                return;
            }
            return;
        }
        ReactNativeHost reactNativeHost2 = this.reactNativeHost;
        if (reactNativeHost2 == null || !reactNativeHost2.hasInstance() || (reactNativeHost = this.reactNativeHost) == null || (reactInstanceManager = reactNativeHost.getReactInstanceManager()) == null) {
            return;
        }
        reactInstanceManager.onWindowFocusChange(hasFocus);
    }

    public final void reload() {
        DevSupportManager devSupportManager = getDevSupportManager();
        if (devSupportManager == null) {
            return;
        }
        if (!(devSupportManager instanceof ReleaseDevSupportManager)) {
            devSupportManager.handleReloadJS();
            return;
        }
        if (!ReactNativeNewArchitectureFeatureFlags.enableBridgelessArchitecture()) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.h
                @Override // java.lang.Runnable
                public final void run() {
                    ReactDelegate.reload$lambda$0(this.f20399g);
                }
            });
            return;
        }
        ReactHost reactHost = this.reactHost;
        if (reactHost != null) {
            reactHost.reload("ReactDelegate.reload()");
        }
    }

    public final void setReactRootView(ReactRootView reactRootView) {
        this.internalReactRootView = reactRootView;
    }

    public final void setReactSurface(ReactSurface reactSurface) {
        this.reactSurface = reactSurface;
    }

    public final boolean shouldShowDevMenuOrReload(int keyCode, KeyEvent event) {
        DevSupportManager devSupportManager = getDevSupportManager();
        if (devSupportManager != null && devSupportManager.getKeyboardShortcutsEnabled() && !(devSupportManager instanceof ReleaseDevSupportManager)) {
            if (keyCode == 82) {
                devSupportManager.showDevOptionsDialog();
                return true;
            }
            DoubleTapReloadRecognizer doubleTapReloadRecognizer = this.doubleTapReloadRecognizer;
            if (AbstractC2855l.b(doubleTapReloadRecognizer != null ? Boolean.valueOf(doubleTapReloadRecognizer.didDoubleTapR(keyCode, this.activity.getCurrentFocus())) : null, Boolean.TRUE)) {
                devSupportManager.handleReloadJS();
                return true;
            }
        }
        return false;
    }

    public final void unloadApp() {
        if (ReactNativeNewArchitectureFeatureFlags.enableBridgelessArchitecture()) {
            ReactSurface reactSurface = this.reactSurface;
            if (reactSurface != null) {
                reactSurface.stop();
            }
            this.reactSurface = null;
            return;
        }
        ReactRootView reactRootView = this.internalReactRootView;
        if (reactRootView != null) {
            if (reactRootView != null) {
                reactRootView.unmountReactApplication();
            }
            this.internalReactRootView = null;
        }
    }

    public final void loadApp(String appKey) {
        AbstractC2855l.g(appKey, "appKey");
        if (ReactNativeNewArchitectureFeatureFlags.enableBridgelessArchitecture()) {
            ReactHost reactHost = this.reactHost;
            if (this.reactSurface == null && reactHost != null) {
                this.reactSurface = reactHost.createSurface(this.activity, appKey, this.launchOptions);
            }
            ReactSurface reactSurface = this.reactSurface;
            if (reactSurface != null) {
                reactSurface.start();
                return;
            }
            return;
        }
        if (this.internalReactRootView == null) {
            ReactRootView reactRootViewCreateRootView = createRootView();
            this.internalReactRootView = reactRootViewCreateRootView;
            ReactNativeHost reactNativeHost = this.reactNativeHost;
            if (reactNativeHost == null || reactRootViewCreateRootView == null) {
                return;
            }
            reactRootViewCreateRootView.startReactApplication(reactNativeHost != null ? reactNativeHost.getReactInstanceManager() : null, appKey, this.launchOptions);
            return;
        }
        throw new IllegalStateException("Cannot loadApp while app is already running.");
    }

    public ReactDelegate(Activity activity, ReactHost reactHost, String str, Bundle bundle) {
        AbstractC2855l.g(activity, "activity");
        this.isFabricEnabled = ReactNativeNewArchitectureFeatureFlags.enableFabricRenderer();
        this.activity = activity;
        this.mainComponentName = str;
        this.launchOptions = bundle;
        this.doubleTapReloadRecognizer = new DoubleTapReloadRecognizer();
        this.reactHost = reactHost;
    }

    public ReactDelegate(Activity activity, ReactNativeHost reactNativeHost, String str, Bundle bundle, boolean z10) {
        AbstractC2855l.g(activity, "activity");
        ReactNativeNewArchitectureFeatureFlags.enableFabricRenderer();
        this.isFabricEnabled = z10;
        this.activity = activity;
        this.mainComponentName = str;
        this.launchOptions = bundle;
        this.doubleTapReloadRecognizer = new DoubleTapReloadRecognizer();
        this.reactNativeHost = reactNativeHost;
    }

    private static /* synthetic */ void getReactNativeHost$annotations() {
    }
}
