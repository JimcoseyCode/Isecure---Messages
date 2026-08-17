package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.core.view.AbstractC1658a0;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class d extends RecyclerView.o implements RecyclerView.t {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final int[] f18108D = {R.attr.state_pressed};

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final int[] f18109E = new int[0];

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    int f18110A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final Runnable f18111B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final RecyclerView.u f18112C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f18113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f18114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final StateListDrawable f18115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Drawable f18116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f18117e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f18118f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final StateListDrawable f18119g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Drawable f18120h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f18121i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f18122j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f18123k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f18124l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    float f18125m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f18126n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f18127o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    float f18128p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private RecyclerView f18131s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    final ValueAnimator f18138z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f18129q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f18130r = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f18132t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f18133u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f18134v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f18135w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final int[] f18136x = new int[2];

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final int[] f18137y = new int[2];

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.q(500);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b extends RecyclerView.u {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i10, int i11) {
            d.this.B(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f18141a = false;

        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f18141a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f18141a) {
                this.f18141a = false;
                return;
            }
            if (((Float) d.this.f18138z.getAnimatedValue()).floatValue() == 0.0f) {
                d dVar = d.this;
                dVar.f18110A = 0;
                dVar.y(0);
            } else {
                d dVar2 = d.this;
                dVar2.f18110A = 2;
                dVar2.v();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class C0187d implements ValueAnimator.AnimatorUpdateListener {
        C0187d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            d.this.f18115c.setAlpha(iFloatValue);
            d.this.f18116d.setAlpha(iFloatValue);
            d.this.v();
        }
    }

    d(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f18138z = valueAnimatorOfFloat;
        this.f18110A = 0;
        this.f18111B = new a();
        this.f18112C = new b();
        this.f18115c = stateListDrawable;
        this.f18116d = drawable;
        this.f18119g = stateListDrawable2;
        this.f18120h = drawable2;
        this.f18117e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f18118f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f18121i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f18122j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f18113a = i11;
        this.f18114b = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new c());
        valueAnimatorOfFloat.addUpdateListener(new C0187d());
        j(recyclerView);
    }

    private void C(float f10) {
        int[] iArrP = p();
        float fMax = Math.max(iArrP[0], Math.min(iArrP[1], f10));
        if (Math.abs(this.f18124l - fMax) < 2.0f) {
            return;
        }
        int iX = x(this.f18125m, fMax, iArrP, this.f18131s.computeVerticalScrollRange(), this.f18131s.computeVerticalScrollOffset(), this.f18130r);
        if (iX != 0) {
            this.f18131s.scrollBy(0, iX);
        }
        this.f18125m = fMax;
    }

    private void k() {
        this.f18131s.removeCallbacks(this.f18111B);
    }

    private void l() {
        this.f18131s.f1(this);
        this.f18131s.g1(this);
        this.f18131s.h1(this.f18112C);
        k();
    }

    private void m(Canvas canvas) {
        int i10 = this.f18130r;
        int i11 = this.f18121i;
        int i12 = this.f18127o;
        int i13 = this.f18126n;
        this.f18119g.setBounds(0, 0, i13, i11);
        this.f18120h.setBounds(0, 0, this.f18129q, this.f18122j);
        canvas.translate(0.0f, i10 - i11);
        this.f18120h.draw(canvas);
        canvas.translate(i12 - (i13 / 2), 0.0f);
        this.f18119g.draw(canvas);
        canvas.translate(-r2, -r0);
    }

    private void n(Canvas canvas) {
        int i10 = this.f18129q;
        int i11 = this.f18117e;
        int i12 = i10 - i11;
        int i13 = this.f18124l;
        int i14 = this.f18123k;
        int i15 = i13 - (i14 / 2);
        this.f18115c.setBounds(0, 0, i11, i14);
        this.f18116d.setBounds(0, 0, this.f18118f, this.f18130r);
        if (!s()) {
            canvas.translate(i12, 0.0f);
            this.f18116d.draw(canvas);
            canvas.translate(0.0f, i15);
            this.f18115c.draw(canvas);
            canvas.translate(-i12, -i15);
            return;
        }
        this.f18116d.draw(canvas);
        canvas.translate(this.f18117e, i15);
        canvas.scale(-1.0f, 1.0f);
        this.f18115c.draw(canvas);
        canvas.scale(-1.0f, 1.0f);
        canvas.translate(-this.f18117e, -i15);
    }

    private int[] o() {
        int[] iArr = this.f18137y;
        int i10 = this.f18114b;
        iArr[0] = i10;
        iArr[1] = this.f18129q - i10;
        return iArr;
    }

    private int[] p() {
        int[] iArr = this.f18136x;
        int i10 = this.f18114b;
        iArr[0] = i10;
        iArr[1] = this.f18130r - i10;
        return iArr;
    }

    private void r(float f10) {
        int[] iArrO = o();
        float fMax = Math.max(iArrO[0], Math.min(iArrO[1], f10));
        if (Math.abs(this.f18127o - fMax) < 2.0f) {
            return;
        }
        int iX = x(this.f18128p, fMax, iArrO, this.f18131s.computeHorizontalScrollRange(), this.f18131s.computeHorizontalScrollOffset(), this.f18129q);
        if (iX != 0) {
            this.f18131s.scrollBy(iX, 0);
        }
        this.f18128p = fMax;
    }

    private boolean s() {
        return AbstractC1658a0.y(this.f18131s) == 1;
    }

    private void w(int i10) {
        k();
        this.f18131s.postDelayed(this.f18111B, i10);
    }

    private int x(float f10, float f11, int[] iArr, int i10, int i11, int i12) {
        int i13 = iArr[1] - iArr[0];
        if (i13 == 0) {
            return 0;
        }
        int i14 = i10 - i12;
        int i15 = (int) (((f11 - f10) / i13) * i14);
        int i16 = i11 + i15;
        if (i16 >= i14 || i16 < 0) {
            return 0;
        }
        return i15;
    }

    private void z() {
        this.f18131s.j(this);
        this.f18131s.m(this);
        this.f18131s.n(this.f18112C);
    }

    public void A() {
        int i10 = this.f18110A;
        if (i10 != 0) {
            if (i10 != 3) {
                return;
            } else {
                this.f18138z.cancel();
            }
        }
        this.f18110A = 1;
        ValueAnimator valueAnimator = this.f18138z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f18138z.setDuration(500L);
        this.f18138z.setStartDelay(0L);
        this.f18138z.start();
    }

    void B(int i10, int i11) {
        int iComputeVerticalScrollRange = this.f18131s.computeVerticalScrollRange();
        int i12 = this.f18130r;
        this.f18132t = iComputeVerticalScrollRange - i12 > 0 && i12 >= this.f18113a;
        int iComputeHorizontalScrollRange = this.f18131s.computeHorizontalScrollRange();
        int i13 = this.f18129q;
        boolean z10 = iComputeHorizontalScrollRange - i13 > 0 && i13 >= this.f18113a;
        this.f18133u = z10;
        boolean z11 = this.f18132t;
        if (!z11 && !z10) {
            if (this.f18134v != 0) {
                y(0);
                return;
            }
            return;
        }
        if (z11) {
            float f10 = i12;
            this.f18124l = (int) ((f10 * (i11 + (f10 / 2.0f))) / iComputeVerticalScrollRange);
            this.f18123k = Math.min(i12, (i12 * i12) / iComputeVerticalScrollRange);
        }
        if (this.f18133u) {
            float f11 = i13;
            this.f18127o = (int) ((f11 * (i10 + (f11 / 2.0f))) / iComputeHorizontalScrollRange);
            this.f18126n = Math.min(i13, (i13 * i13) / iComputeHorizontalScrollRange);
        }
        int i14 = this.f18134v;
        if (i14 == 0 || i14 == 1) {
            y(1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f18134v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zU = u(motionEvent.getX(), motionEvent.getY());
            boolean zT = t(motionEvent.getX(), motionEvent.getY());
            if (zU || zT) {
                if (zT) {
                    this.f18135w = 1;
                    this.f18128p = (int) motionEvent.getX();
                } else if (zU) {
                    this.f18135w = 2;
                    this.f18125m = (int) motionEvent.getY();
                }
                y(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f18134v == 2) {
            this.f18125m = 0.0f;
            this.f18128p = 0.0f;
            y(1);
            this.f18135w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f18134v == 2) {
            A();
            if (this.f18135w == 1) {
                r(motionEvent.getX());
            }
            if (this.f18135w == 2) {
                C(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i10 = this.f18134v;
        if (i10 != 1) {
            return i10 == 2;
        }
        boolean zU = u(motionEvent.getX(), motionEvent.getY());
        boolean zT = t(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0 || (!zU && !zT)) {
            return false;
        }
        if (zT) {
            this.f18135w = 1;
            this.f18128p = (int) motionEvent.getX();
        } else if (zU) {
            this.f18135w = 2;
            this.f18125m = (int) motionEvent.getY();
        }
        y(2);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.A a10) {
        if (this.f18129q != this.f18131s.getWidth() || this.f18130r != this.f18131s.getHeight()) {
            this.f18129q = this.f18131s.getWidth();
            this.f18130r = this.f18131s.getHeight();
            y(0);
        } else if (this.f18110A != 0) {
            if (this.f18132t) {
                n(canvas);
            }
            if (this.f18133u) {
                m(canvas);
            }
        }
    }

    public void j(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f18131s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            l();
        }
        this.f18131s = recyclerView;
        if (recyclerView != null) {
            z();
        }
    }

    void q(int i10) {
        int i11 = this.f18110A;
        if (i11 == 1) {
            this.f18138z.cancel();
        } else if (i11 != 2) {
            return;
        }
        this.f18110A = 3;
        ValueAnimator valueAnimator = this.f18138z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f18138z.setDuration(i10);
        this.f18138z.start();
    }

    boolean t(float f10, float f11) {
        if (f11 < this.f18130r - this.f18121i) {
            return false;
        }
        int i10 = this.f18127o;
        int i11 = this.f18126n;
        return f10 >= ((float) (i10 - (i11 / 2))) && f10 <= ((float) (i10 + (i11 / 2)));
    }

    boolean u(float f10, float f11) {
        if (s()) {
            if (f10 > this.f18117e) {
                return false;
            }
        } else if (f10 < this.f18129q - this.f18117e) {
            return false;
        }
        int i10 = this.f18124l;
        int i11 = this.f18123k;
        return f11 >= ((float) (i10 - (i11 / 2))) && f11 <= ((float) (i10 + (i11 / 2)));
    }

    void v() {
        this.f18131s.invalidate();
    }

    void y(int i10) {
        if (i10 == 2 && this.f18134v != 2) {
            this.f18115c.setState(f18108D);
            k();
        }
        if (i10 == 0) {
            v();
        } else {
            A();
        }
        if (this.f18134v == 2 && i10 != 2) {
            this.f18115c.setState(f18109E);
            w(1200);
        } else if (i10 == 1) {
            w(1500);
        }
        this.f18134v = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void c(boolean z10) {
    }
}
