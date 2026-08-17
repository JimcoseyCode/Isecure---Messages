package com.facebook.react.uimanager;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.R;
import com.facebook.react.uimanager.events.PointerEventHelper;
import j7.AbstractC2800q;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ!\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n¢\u0006\u0004\b\f\u0010\rJ9\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/facebook/react/uimanager/ReactAxOrderHelper;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Landroid/view/View;", "view", "Li7/B;", "cleanUpAxOrder", "(Landroid/view/View;)V", "restoreFocusability", PointerEventHelper.POINTER_TYPE_UNKNOWN, "axOrderList", "disableFocusForSubtree", "(Landroid/view/View;Ljava/util/List;)V", "parent", PointerEventHelper.POINTER_TYPE_UNKNOWN, "result", "buildAxOrderList", "(Landroid/view/View;Landroid/view/View;Ljava/util/List;[Landroid/view/View;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactAxOrderHelper {
    public static final ReactAxOrderHelper INSTANCE = new ReactAxOrderHelper();

    private ReactAxOrderHelper() {
    }

    public static final void cleanUpAxOrder(View view) {
        AbstractC2855l.g(view, "view");
        Boolean bool = (Boolean) view.getTag(R.id.original_focusability);
        if (bool != null) {
            view.setFocusable(bool.booleanValue());
        }
        if (((View) view.getTag(R.id.accessibility_order_parent)) != null) {
            view.setTag(R.id.accessibility_order_parent, null);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                AbstractC2855l.f(childAt, "getChildAt(...)");
                cleanUpAxOrder(childAt);
            }
        }
    }

    public static final void restoreFocusability(View view) {
        AbstractC2855l.g(view, "view");
        Boolean bool = (Boolean) view.getTag(R.id.original_focusability);
        if (bool != null) {
            view.setFocusable(bool.booleanValue());
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                AbstractC2855l.f(childAt, "getChildAt(...)");
                restoreFocusability(childAt);
            }
        }
    }

    public final void buildAxOrderList(View view, View parent, List<?> axOrderList, View[] result) {
        int iJ0;
        AbstractC2855l.g(view, "view");
        AbstractC2855l.g(parent, "parent");
        AbstractC2855l.g(axOrderList, "axOrderList");
        AbstractC2855l.g(result, "result");
        Object tag = view.getTag(R.id.view_tag_native_id);
        view.setTag(R.id.accessibility_order_parent, parent);
        if (AbstractC2800q.X(axOrderList, tag) && (iJ0 = AbstractC2800q.j0(axOrderList, tag)) != -1) {
            result[iJ0] = view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                AbstractC2855l.f(childAt, "getChildAt(...)");
                buildAxOrderList(childAt, parent, axOrderList, result);
            }
        }
    }

    public final void disableFocusForSubtree(View view, List<?> axOrderList) {
        AbstractC2855l.g(view, "view");
        AbstractC2855l.g(axOrderList, "axOrderList");
        if (!AbstractC2800q.X(axOrderList, view.getTag(R.id.view_tag_native_id))) {
            if (view.getTag(R.id.original_focusability) == null) {
                view.setTag(R.id.original_focusability, Boolean.valueOf(view.isFocusable()));
            }
            view.setFocusable(false);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                AbstractC2855l.f(childAt, "getChildAt(...)");
                disableFocusForSubtree(childAt, axOrderList);
            }
        }
    }
}
