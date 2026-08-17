package com.facebook.react.uimanager;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.events.PointerEventHelper;
import d2.AbstractC2325a;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0015\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/facebook/react/uimanager/ViewGroupDrawingOrderHelper;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Landroid/view/ViewGroup;", "viewGroup", "<init>", "(Landroid/view/ViewGroup;)V", "Landroid/view/View;", "view", "Li7/B;", "handleAddView", "(Landroid/view/View;)V", "handleRemoveView", PointerEventHelper.POINTER_TYPE_UNKNOWN, "shouldEnableCustomDrawingOrder", "()Z", PointerEventHelper.POINTER_TYPE_UNKNOWN, "childCount", "index", "getChildDrawingOrder", "(II)I", "update", "()V", "Landroid/view/ViewGroup;", "numberOfChildrenWithZIndex", "I", PointerEventHelper.POINTER_TYPE_UNKNOWN, "drawingOrderIndices", "[I", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ViewGroupDrawingOrderHelper {
    private int[] drawingOrderIndices;
    private int numberOfChildrenWithZIndex;
    private final ViewGroup viewGroup;

    public ViewGroupDrawingOrderHelper(ViewGroup viewGroup) {
        AbstractC2855l.g(viewGroup, "viewGroup");
        this.viewGroup = viewGroup;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getChildDrawingOrder$lambda$0(View view, View view2) {
        ViewGroupManager.Companion companion = ViewGroupManager.INSTANCE;
        Integer viewZIndex = companion.getViewZIndex(view);
        int iIntValue = viewZIndex != null ? viewZIndex.intValue() : 0;
        Integer viewZIndex2 = companion.getViewZIndex(view2);
        return iIntValue - (viewZIndex2 != null ? viewZIndex2.intValue() : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getChildDrawingOrder$lambda$1(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    public final int getChildDrawingOrder(int childCount, int index) {
        int[] iArr = this.drawingOrderIndices;
        if (iArr != null && (index >= iArr.length || iArr[index] >= childCount)) {
            AbstractC2325a.K(ReactConstants.TAG, "getChildDrawingOrder index out of bounds! Please check any custom view manipulations you may have done. childCount = %d, index = %d", Integer.valueOf(childCount), Integer.valueOf(index));
            update();
        }
        if (iArr == null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < childCount; i10++) {
                arrayList.add(this.viewGroup.getChildAt(i10));
            }
            final Function2 function2 = new Function2() { // from class: com.facebook.react.uimanager.K
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Integer.valueOf(ViewGroupDrawingOrderHelper.getChildDrawingOrder$lambda$0((View) obj, (View) obj2));
                }
            };
            AbstractC2800q.y(arrayList, new Comparator() { // from class: com.facebook.react.uimanager.L
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ViewGroupDrawingOrderHelper.getChildDrawingOrder$lambda$1(function2, obj, obj2);
                }
            });
            int[] iArr2 = new int[childCount];
            for (int i11 = 0; i11 < childCount; i11++) {
                Object obj = arrayList.get(i11);
                AbstractC2855l.f(obj, "get(...)");
                iArr2[i11] = this.viewGroup.indexOfChild((View) obj);
            }
            this.drawingOrderIndices = iArr2;
            iArr = iArr2;
        }
        return iArr[index];
    }

    public final void handleAddView(View view) {
        AbstractC2855l.g(view, "view");
        if (ViewGroupManager.INSTANCE.getViewZIndex(view) != null) {
            this.numberOfChildrenWithZIndex++;
        }
        this.drawingOrderIndices = null;
    }

    public final void handleRemoveView(View view) {
        if (ViewGroupManager.INSTANCE.getViewZIndex(view) != null) {
            this.numberOfChildrenWithZIndex--;
        }
        this.drawingOrderIndices = null;
    }

    public final boolean shouldEnableCustomDrawingOrder() {
        return this.numberOfChildrenWithZIndex > 0;
    }

    public final void update() {
        this.numberOfChildrenWithZIndex = 0;
        int childCount = this.viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (ViewGroupManager.INSTANCE.getViewZIndex(this.viewGroup.getChildAt(i10)) != null) {
                this.numberOfChildrenWithZIndex++;
            }
        }
        this.drawingOrderIndices = null;
    }
}
