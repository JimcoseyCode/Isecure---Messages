package com.facebook.react.uimanager;

import android.graphics.Rect;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H&¢\u0006\u0004\b\u0003\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0012\u001a\u00020\r8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Lcom/facebook/react/uimanager/ReactClippingViewGroup;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Li7/B;", "updateClippingRect", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "excludedViews", "(Ljava/util/Set;)V", "Landroid/graphics/Rect;", "outClippingRect", "getClippingRect", "(Landroid/graphics/Rect;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getRemoveClippedSubviews", "()Z", "setRemoveClippedSubviews", "(Z)V", ReactClippingViewGroupHelper.PROP_REMOVE_CLIPPED_SUBVIEWS, "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ReactClippingViewGroup {
    void getClippingRect(Rect outClippingRect);

    boolean getRemoveClippedSubviews();

    void setRemoveClippedSubviews(boolean z10);

    void updateClippingRect();

    void updateClippingRect(Set<Integer> excludedViews);
}
