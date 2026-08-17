package com.facebook.react.uimanager.internal;

import P8.q;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.common.annotations.LegacyArchitectureShadowNodeWithCxxImpl;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.util.RNLog;
import com.facebook.yoga.o;
import j7.AbstractC2793j;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/facebook/react/uimanager/internal/LegacyArchitectureShadowNodeLogger;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "Ljava/lang/Class;", "shadowNodeClass", PointerEventHelper.POINTER_TYPE_UNKNOWN, "viewManagerName", "Li7/B;", "assertUnsupportedViewManager", "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/Class;Ljava/lang/String;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LegacyArchitectureShadowNodeLogger {
    public static final LegacyArchitectureShadowNodeLogger INSTANCE = new LegacyArchitectureShadowNodeLogger();

    private LegacyArchitectureShadowNodeLogger() {
    }

    public static final void assertUnsupportedViewManager(ReactApplicationContext reactContext, Class<?> shadowNodeClass, String viewManagerName) {
        AbstractC2855l.g(reactContext, "reactContext");
        AbstractC2855l.g(shadowNodeClass, "shadowNodeClass");
        AbstractC2855l.g(viewManagerName, "viewManagerName");
        Class<?>[] interfaces = shadowNodeClass.getInterfaces();
        AbstractC2855l.f(interfaces, "getInterfaces(...)");
        boolean zB = AbstractC2793j.B(interfaces, o.class);
        boolean zIsAnnotationPresent = shadowNodeClass.isAnnotationPresent(LegacyArchitectureShadowNodeWithCxxImpl.class);
        if (!zB || zIsAnnotationPresent) {
            return;
        }
        String strJ = q.j("\n          [Legacy Architecture] The ViewManager `" + viewManagerName + "` is unlikely to work with the New Architecture.\n          That's because the shadow node `" + shadowNodeClass.getSimpleName() + "` implements the `YogaMeasureFunction.measure()` method.\n          This is not supported in the New Architecture as shadow nodes with custom measurements should be implemented in C++.\n          ");
        if (ReactBuildConfig.DEBUG) {
            RNLog.w(reactContext, strJ);
            ReactSoftExceptionLogger.logSoftException(ReactSoftExceptionLogger.Categories.SOFT_ASSERTIONS, new ReactNoCrashSoftException(strJ));
        }
    }
}
