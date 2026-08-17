package com.facebook.react.views.view;

import android.view.View;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.ReactClippingViewGroupHelper;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.view.ReactViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0011\u001a\u00020\t2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\t2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/facebook/react/views/view/ReactClippingViewManager;", "Lcom/facebook/react/views/view/ReactViewGroup;", "T", "Lcom/facebook/react/uimanager/ViewGroupManager;", "<init>", "()V", "view", PointerEventHelper.POINTER_TYPE_UNKNOWN, ReactClippingViewGroupHelper.PROP_REMOVE_CLIPPED_SUBVIEWS, "Li7/B;", "setRemoveClippedSubviews", "(Lcom/facebook/react/views/view/ReactViewGroup;Z)V", "parent", "Landroid/view/View;", "child", PointerEventHelper.POINTER_TYPE_UNKNOWN, "index", "addView", "(Lcom/facebook/react/views/view/ReactViewGroup;Landroid/view/View;I)V", "getChildCount", "(Lcom/facebook/react/views/view/ReactViewGroup;)I", "getChildAt", "(Lcom/facebook/react/views/view/ReactViewGroup;I)Landroid/view/View;", "removeViewAt", "(Lcom/facebook/react/views/view/ReactViewGroup;I)V", "removeAllViews", "(Lcom/facebook/react/views/view/ReactViewGroup;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class ReactClippingViewManager<T extends ReactViewGroup> extends ViewGroupManager<T> {
    public ReactClippingViewManager() {
        super(null, 1, null);
    }

    @ReactProp(name = ReactClippingViewGroupHelper.PROP_REMOVE_CLIPPED_SUBVIEWS)
    public void setRemoveClippedSubviews(T view, boolean removeClippedSubviews) {
        AbstractC2855l.g(view, "view");
        UiThreadUtil.assertOnUiThread();
        view.setRemoveClippedSubviews(removeClippedSubviews);
    }

    @Override // com.facebook.react.uimanager.IViewGroupManager
    public void removeAllViews(T parent) {
        AbstractC2855l.g(parent, "parent");
        UiThreadUtil.assertOnUiThread();
        if (parent.get_removeClippedSubviews()) {
            parent.removeAllViewsWithSubviewClippingEnabled$ReactAndroid_release();
        } else {
            parent.removeAllViews();
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(T parent, View child, int index) {
        AbstractC2855l.g(parent, "parent");
        AbstractC2855l.g(child, "child");
        UiThreadUtil.assertOnUiThread();
        if (parent.get_removeClippedSubviews()) {
            parent.addViewWithSubviewClippingEnabled$ReactAndroid_release(child, index);
        } else {
            parent.addView(child, index);
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(T parent, int index) {
        AbstractC2855l.g(parent, "parent");
        if (parent.get_removeClippedSubviews()) {
            return parent.getChildAtWithSubviewClippingEnabled$ReactAndroid_release(index);
        }
        return parent.getChildAt(index);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(T parent) {
        AbstractC2855l.g(parent, "parent");
        if (parent.get_removeClippedSubviews()) {
            return parent.getAllChildrenCount();
        }
        return parent.getChildCount();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(T parent, int index) {
        AbstractC2855l.g(parent, "parent");
        UiThreadUtil.assertOnUiThread();
        if (parent.get_removeClippedSubviews()) {
            View childAt = getChildAt((ReactViewGroup) parent, index);
            if (childAt != null) {
                parent.removeViewWithSubviewClippingEnabled$ReactAndroid_release(childAt);
                return;
            }
            return;
        }
        parent.removeViewAt(index);
    }
}
