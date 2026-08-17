package com.facebook.react.uimanager.events;

import android.view.MotionEvent;
import android.view.View;
import com.facebook.react.uimanager.RootView;
import com.facebook.react.uimanager.RootViewUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lcom/facebook/react/uimanager/events/NativeGestureUtil;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Landroid/view/View;", "view", "Landroid/view/MotionEvent;", "event", "Li7/B;", "notifyNativeGestureStarted", "(Landroid/view/View;Landroid/view/MotionEvent;)V", "notifyNativeGestureEnded", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NativeGestureUtil {
    public static final NativeGestureUtil INSTANCE = new NativeGestureUtil();

    private NativeGestureUtil() {
    }

    public static final void notifyNativeGestureEnded(View view, MotionEvent event) {
        AbstractC2855l.g(view, "view");
        AbstractC2855l.g(event, "event");
        RootView rootView = RootViewUtil.getRootView(view);
        if (rootView != null) {
            rootView.onChildEndedNativeGesture(view, event);
        }
    }

    public static final void notifyNativeGestureStarted(View view, MotionEvent event) {
        AbstractC2855l.g(view, "view");
        AbstractC2855l.g(event, "event");
        RootView rootView = RootViewUtil.getRootView(view);
        if (rootView != null) {
            rootView.onChildStartedNativeGesture(view, event);
        }
    }
}
