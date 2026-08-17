package com.facebook.react.uimanager;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import o3.AbstractC3007a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0007¨\u0006\u000b"}, d2 = {"Lcom/facebook/react/uimanager/RootViewUtil;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "getRootView", "Lcom/facebook/react/uimanager/RootView;", "reactView", "Landroid/view/View;", "getViewportOffset", "Landroid/graphics/Point;", "v", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RootViewUtil {
    public static final RootViewUtil INSTANCE = new RootViewUtil();

    private RootViewUtil() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final RootView getRootView(View reactView) {
        AbstractC2855l.g(reactView, "reactView");
        View view = reactView;
        while (!(view instanceof RootView)) {
            Object parent = view.getParent();
            if (parent == null) {
                return null;
            }
            AbstractC3007a.a(parent instanceof View);
            view = (View) parent;
        }
        return (RootView) view;
    }

    public static final Point getViewportOffset(View v10) {
        AbstractC2855l.g(v10, "v");
        int[] iArr = new int[2];
        v10.getLocationInWindow(iArr);
        Rect rect = new Rect();
        v10.getWindowVisibleDisplayFrame(rect);
        iArr[0] = iArr[0] - rect.left;
        iArr[1] = iArr[1] - rect.top;
        return new Point(iArr[0], iArr[1]);
    }
}
