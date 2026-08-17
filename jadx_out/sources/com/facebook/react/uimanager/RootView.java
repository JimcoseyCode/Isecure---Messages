package com.facebook.react.uimanager;

import android.view.MotionEvent;
import android.view.View;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\tJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/uimanager/RootView;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Landroid/view/View;", "childView", "Landroid/view/MotionEvent;", "ev", "Li7/B;", "onChildStartedNativeGesture", "(Landroid/view/View;Landroid/view/MotionEvent;)V", "(Landroid/view/MotionEvent;)V", "onChildEndedNativeGesture", PointerEventHelper.POINTER_TYPE_UNKNOWN, "t", "handleException", "(Ljava/lang/Throwable;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface RootView {
    void handleException(Throwable t10);

    void onChildEndedNativeGesture(View childView, MotionEvent ev);

    default void onChildStartedNativeGesture(MotionEvent ev) {
        AbstractC2855l.g(ev, "ev");
        onChildStartedNativeGesture(null, ev);
    }

    void onChildStartedNativeGesture(View childView, MotionEvent ev);
}
