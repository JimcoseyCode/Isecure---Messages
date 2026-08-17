package com.facebook.react.bridge;

import com.facebook.react.common.annotations.internal.LegacyArchitectureLogLevel;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogger;
import com.facebook.react.uimanager.events.PointerEventHelper;
import d2.AbstractC2325a;
import i7.C2735B;
import java.lang.reflect.Method;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/facebook/react/bridge/ReactCxxErrorHandler;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "handlerObject", "Ljava/lang/reflect/Method;", "handleErrorFunc", "Li7/B;", "setHandleErrorFunc", "(Ljava/lang/Object;Ljava/lang/reflect/Method;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "message", "handleError", "(Ljava/lang/String;)V", "Ljava/lang/reflect/Method;", "Ljava/lang/Object;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactCxxErrorHandler {
    public static final ReactCxxErrorHandler INSTANCE = new ReactCxxErrorHandler();
    private static Method handleErrorFunc;
    private static Object handlerObject;

    static {
        LegacyArchitectureLogger.assertLegacyArchitecture("ReactCxxErrorHandler", LegacyArchitectureLogLevel.WARNING);
    }

    private ReactCxxErrorHandler() {
    }

    private static final void handleError(String message) {
        Method method = handleErrorFunc;
        if (method != null) {
            try {
                method.invoke(handlerObject, new Object[]{new Exception(message)});
            } catch (Exception e10) {
                AbstractC2325a.n("ReactCxxErrorHandler", "Failed to invoke error handler function", e10);
                C2735B c2735b = C2735B.f28704a;
            }
        }
    }

    public static final void setHandleErrorFunc(Object handlerObject2, Method handleErrorFunc2) {
        handlerObject = handlerObject2;
        handleErrorFunc = handleErrorFunc2;
    }
}
