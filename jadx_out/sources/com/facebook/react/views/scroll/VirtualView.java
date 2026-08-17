package com.facebook.react.views.scroll;

import android.graphics.Rect;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.virtual.VirtualViewMode;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lcom/facebook/react/views/scroll/VirtualView;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/views/virtual/VirtualViewMode;", "newMode", "Landroid/graphics/Rect;", "thresholdRect", "Li7/B;", "onModeChange", "(Lcom/facebook/react/views/virtual/VirtualViewMode;Landroid/graphics/Rect;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getVirtualViewID", "()Ljava/lang/String;", "virtualViewID", "getContainerRelativeRect", "()Landroid/graphics/Rect;", "containerRelativeRect", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface VirtualView {
    Rect getContainerRelativeRect();

    String getVirtualViewID();

    void onModeChange(VirtualViewMode newMode, Rect thresholdRect);
}
