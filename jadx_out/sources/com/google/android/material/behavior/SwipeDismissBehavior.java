package com.google.android.material.behavior;

import I0.C;
import I0.z;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC1658a0;
import androidx.customview.widget.c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    androidx.customview.widget.c f22744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f22745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f22746c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f22748e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f22747d = 0.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f22749f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float f22750g = 0.5f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float f22751h = 0.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    float f22752i = 0.5f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final c.AbstractC0170c f22753j = new a();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends c.AbstractC0170c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f22754a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f22755b = -1;

        a() {
        }

        private boolean n(View view, float f10) {
            if (f10 == 0.0f) {
                return Math.abs(view.getLeft() - this.f22754a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f22750g);
            }
            boolean z10 = view.getLayoutDirection() == 1;
            int i10 = SwipeDismissBehavior.this.f22749f;
            if (i10 == 2) {
                return true;
            }
            if (i10 == 0) {
                return z10 ? f10 < 0.0f : f10 > 0.0f;
            }
            if (i10 == 1) {
                if (z10) {
                    return f10 > 0.0f;
                }
                if (f10 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.customview.widget.c.AbstractC0170c
        public int a(View view, int i10, int i11) {
            int width;
            int width2;
            int width3;
            boolean z10 = view.getLayoutDirection() == 1;
            int i12 = SwipeDismissBehavior.this.f22749f;
            if (i12 == 0) {
                if (z10) {
                    width = this.f22754a - view.getWidth();
                    width2 = this.f22754a;
                } else {
                    width = this.f22754a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i12 != 1) {
                width = this.f22754a - view.getWidth();
                width2 = view.getWidth() + this.f22754a;
            } else if (z10) {
                width = this.f22754a;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.f22754a - view.getWidth();
                width2 = this.f22754a;
            }
            return SwipeDismissBehavior.H(width, i10, width2);
        }

        @Override // androidx.customview.widget.c.AbstractC0170c
        public int b(View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.c.AbstractC0170c
        public int d(View view) {
            return view.getWidth();
        }

        @Override // androidx.customview.widget.c.AbstractC0170c
        public void i(View view, int i10) {
            this.f22755b = i10;
            this.f22754a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior.this.f22746c = true;
                parent.requestDisallowInterceptTouchEvent(true);
                SwipeDismissBehavior.this.f22746c = false;
            }
        }

        @Override // androidx.customview.widget.c.AbstractC0170c
        public void j(int i10) {
            SwipeDismissBehavior.this.getClass();
        }

        @Override // androidx.customview.widget.c.AbstractC0170c
        public void k(View view, int i10, int i11, int i12, int i13) {
            float width = view.getWidth() * SwipeDismissBehavior.this.f22751h;
            float width2 = view.getWidth() * SwipeDismissBehavior.this.f22752i;
            float fAbs = Math.abs(i10 - this.f22754a);
            if (fAbs <= width) {
                view.setAlpha(1.0f);
            } else if (fAbs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.G(0.0f, 1.0f - SwipeDismissBehavior.J(width, width2, fAbs), 1.0f));
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
        @Override // androidx.customview.widget.c.AbstractC0170c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void l(View view, float f10, float f11) {
            int i10;
            boolean z10;
            this.f22755b = -1;
            int width = view.getWidth();
            if (!n(view, f10)) {
                i10 = this.f22754a;
                z10 = false;
            } else if (f10 >= 0.0f) {
                int left = view.getLeft();
                int i11 = this.f22754a;
                i10 = left < i11 ? this.f22754a - width : i11 + width;
                z10 = true;
            }
            if (SwipeDismissBehavior.this.f22744a.O(i10, view.getTop())) {
                view.postOnAnimation(new c(view, z10));
            } else if (z10) {
                SwipeDismissBehavior.this.getClass();
            }
        }

        @Override // androidx.customview.widget.c.AbstractC0170c
        public boolean m(View view, int i10) {
            int i11 = this.f22755b;
            return (i11 == -1 || i11 == i10) && SwipeDismissBehavior.this.F(view);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b implements C {
        b() {
        }

        @Override // I0.C
        public boolean a(View view, C.a aVar) {
            if (!SwipeDismissBehavior.this.F(view)) {
                return false;
            }
            boolean z10 = view.getLayoutDirection() == 1;
            int i10 = SwipeDismissBehavior.this.f22749f;
            AbstractC1658a0.U(view, (!(i10 == 0 && z10) && (i10 != 1 || z10)) ? view.getWidth() : -view.getWidth());
            view.setAlpha(0.0f);
            SwipeDismissBehavior.this.getClass();
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class c implements Runnable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final View f22758g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f22759h;

        c(View view, boolean z10) {
            this.f22758g = view;
            this.f22759h = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            androidx.customview.widget.c cVar = SwipeDismissBehavior.this.f22744a;
            if (cVar != null && cVar.m(true)) {
                this.f22758g.postOnAnimation(this);
            } else if (this.f22759h) {
                SwipeDismissBehavior.this.getClass();
            }
        }
    }

    static float G(float f10, float f11, float f12) {
        return Math.min(Math.max(f10, f11), f12);
    }

    static int H(int i10, int i11, int i12) {
        return Math.min(Math.max(i10, i11), i12);
    }

    private void I(ViewGroup viewGroup) {
        if (this.f22744a == null) {
            this.f22744a = this.f22748e ? androidx.customview.widget.c.n(viewGroup, this.f22747d, this.f22753j) : androidx.customview.widget.c.o(viewGroup, this.f22753j);
        }
    }

    static float J(float f10, float f11, float f12) {
        return (f12 - f10) / (f11 - f10);
    }

    private void N(View view) {
        AbstractC1658a0.e0(view, 1048576);
        if (F(view)) {
            AbstractC1658a0.g0(view, z.a.f3898y, null, new b());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.f22744a == null) {
            return false;
        }
        if (this.f22746c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f22744a.F(motionEvent);
        return true;
    }

    public boolean F(View view) {
        return true;
    }

    public void K(float f10) {
        this.f22752i = G(0.0f, f10, 1.0f);
    }

    public void L(float f10) {
        this.f22751h = G(0.0f, f10, 1.0f);
    }

    public void M(int i10) {
        this.f22749f = i10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zY = this.f22745b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zY = coordinatorLayout.y(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f22745b = zY;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f22745b = false;
        }
        if (zY) {
            I(coordinatorLayout);
            if (!this.f22746c && this.f22744a.P(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        boolean zL = super.l(coordinatorLayout, view, i10);
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            N(view);
        }
        return zL;
    }
}
