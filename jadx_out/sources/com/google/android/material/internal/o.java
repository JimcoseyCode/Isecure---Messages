package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.AbstractC1658a0;
import androidx.core.view.I;
import androidx.core.view.L0;
import androidx.core.view.l1;
import com.facebook.react.views.text.TextAttributeProps;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class o {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements I {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ c f23488g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ d f23489h;

        a(c cVar, d dVar) {
            this.f23488g = cVar;
            this.f23489h = dVar;
        }

        @Override // androidx.core.view.I
        public L0 a(View view, L0 l02) {
            return this.f23488g.a(view, l02, new d(this.f23489h));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface c {
        L0 a(View view, L0 l02, d dVar);
    }

    public static void b(View view, c cVar) {
        AbstractC1658a0.w0(view, new a(cVar, new d(view.getPaddingStart(), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom())));
        j(view);
    }

    public static float c(Context context, int i10) {
        return TypedValue.applyDimension(1, i10, context.getResources().getDisplayMetrics());
    }

    public static Integer d(View view) {
        ColorStateList colorStateListF = com.google.android.material.drawable.d.f(view.getBackground());
        if (colorStateListF != null) {
            return Integer.valueOf(colorStateListF.getDefaultColor());
        }
        return null;
    }

    private static InputMethodManager e(View view) {
        return (InputMethodManager) androidx.core.content.a.j(view.getContext(), InputMethodManager.class);
    }

    public static float f(View view) {
        float elevation = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            elevation += ((View) parent).getElevation();
        }
        return elevation;
    }

    public static void g(View view, boolean z10) {
        l1 l1VarJ;
        if (z10 && (l1VarJ = AbstractC1658a0.J(view)) != null) {
            l1VarJ.b(L0.p.b());
            return;
        }
        InputMethodManager inputMethodManagerE = e(view);
        if (inputMethodManagerE != null) {
            inputMethodManagerE.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static boolean h(View view) {
        return view.getLayoutDirection() == 1;
    }

    public static PorterDuff.Mode i(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                return PorterDuff.Mode.MULTIPLY;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void j(View view) {
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new b());
        }
    }

    public static void k(final View view, final boolean z10) {
        view.requestFocus();
        view.post(new Runnable() { // from class: com.google.android.material.internal.n
            @Override // java.lang.Runnable
            public final void run() {
                o.l(view, z10);
            }
        });
    }

    public static void l(View view, boolean z10) {
        l1 l1VarJ;
        if (!z10 || (l1VarJ = AbstractC1658a0.J(view)) == null) {
            e(view).showSoftInput(view, 1);
        } else {
            l1VarJ.g(L0.p.b());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f23490a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f23491b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f23492c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f23493d;

        public d(int i10, int i11, int i12, int i13) {
            this.f23490a = i10;
            this.f23491b = i11;
            this.f23492c = i12;
            this.f23493d = i13;
        }

        public void a(View view) {
            view.setPaddingRelative(this.f23490a, this.f23491b, this.f23492c, this.f23493d);
        }

        public d(d dVar) {
            this.f23490a = dVar.f23490a;
            this.f23491b = dVar.f23491b;
            this.f23492c = dVar.f23492c;
            this.f23493d = dVar.f23493d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            view.requestApplyInsets();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }
}
