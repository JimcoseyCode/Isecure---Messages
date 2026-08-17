package r6;

import android.graphics.Rect;
import android.view.View;
import kotlin.jvm.internal.AbstractC2855l;
import v6.C3429a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f31976a = new int[2];

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v10) {
            AbstractC2855l.g(v10, "v");
            v10.removeOnAttachStateChangeListener(this);
            v10.requestApplyInsets();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v10) {
            AbstractC2855l.g(v10, "v");
        }
    }

    public static final void a(View view, Rect rect) {
        AbstractC2855l.g(view, "<this>");
        AbstractC2855l.g(rect, "rect");
        if (!view.isAttachedToWindow()) {
            C3429a.d(C3429a.f32948a, "View.copyBoundsInWindow", "Can not copy bounds as view is not attached to window", null, 4, null);
            return;
        }
        rect.set(0, 0, view.getWidth(), view.getHeight());
        int[] iArr = f31976a;
        view.getLocationInWindow(iArr);
        rect.offset(iArr[0], iArr[1]);
    }

    public static final int[] b(View view) {
        AbstractC2855l.g(view, "<this>");
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    public static final void c(View view) {
        AbstractC2855l.g(view, "<this>");
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new a());
        }
    }
}
