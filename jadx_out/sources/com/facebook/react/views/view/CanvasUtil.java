package com.facebook.react.views.view;

import android.graphics.Canvas;
import android.os.Build;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\u0003R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/facebook/react/views/view/CanvasUtil;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Landroid/graphics/Canvas;", "canvas", PointerEventHelper.POINTER_TYPE_UNKNOWN, "enable", "Li7/B;", "enableZ", "(Landroid/graphics/Canvas;Z)V", "fetchOrderMethods", "Ljava/lang/reflect/Method;", "reorderBarrierMethod", "Ljava/lang/reflect/Method;", "inorderBarrierMethod", "orderMethodsFetched", "Z", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CanvasUtil {
    public static final CanvasUtil INSTANCE = new CanvasUtil();
    private static Method inorderBarrierMethod;
    private static boolean orderMethodsFetched;
    private static Method reorderBarrierMethod;

    private CanvasUtil() {
    }

    public static final void enableZ(Canvas canvas, boolean enable) {
        Method method;
        AbstractC2855l.g(canvas, "canvas");
        if (Build.VERSION.SDK_INT >= 29) {
            if (enable) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        INSTANCE.fetchOrderMethods();
        if (enable) {
            try {
                Method method2 = reorderBarrierMethod;
                if (method2 != null) {
                    if (method2 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    method2.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return;
            }
        }
        if (enable || (method = inorderBarrierMethod) == null) {
            return;
        }
        if (method == null) {
            throw new IllegalStateException("Required value was null.");
        }
        method.invoke(canvas, null);
    }

    private final void fetchOrderMethods() {
        Method method;
        if (orderMethodsFetched) {
            return;
        }
        try {
            if (Build.VERSION.SDK_INT == 28) {
                Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Object[].class);
                Object objInvoke = declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                AbstractC2855l.e(objInvoke, "null cannot be cast to non-null type java.lang.reflect.Method");
                reorderBarrierMethod = (Method) objInvoke;
                Object objInvoke2 = declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                AbstractC2855l.e(objInvoke2, "null cannot be cast to non-null type java.lang.reflect.Method");
                inorderBarrierMethod = (Method) objInvoke2;
            } else {
                reorderBarrierMethod = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                inorderBarrierMethod = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
            }
            method = reorderBarrierMethod;
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        if (method != null && inorderBarrierMethod != null) {
            if (method != null) {
                method.setAccessible(true);
            }
            Method method2 = inorderBarrierMethod;
            if (method2 != null) {
                method2.setAccessible(true);
            }
            orderMethodsFetched = true;
        }
    }
}
