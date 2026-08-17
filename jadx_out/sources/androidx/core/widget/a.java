package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.AbstractC1658a0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f16671x = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final View f16674i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Runnable f16675j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f16678m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f16679n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f16683r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    boolean f16684s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    boolean f16685t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    boolean f16686u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f16687v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f16688w;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final C0167a f16672g = new C0167a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Interpolator f16673h = new AccelerateInterpolator();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float[] f16676k = {0.0f, 0.0f};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float[] f16677l = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float[] f16680o = {0.0f, 0.0f};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float[] f16681p = {0.0f, 0.0f};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float[] f16682q = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: androidx.core.widget.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class C0167a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f16689a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f16690b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f16691c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f16692d;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private float f16698j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f16699k;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f16693e = Long.MIN_VALUE;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f16697i = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f16694f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f16695g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f16696h = 0;

        C0167a() {
        }

        private float e(long j10) {
            if (j10 < this.f16693e) {
                return 0.0f;
            }
            long j11 = this.f16697i;
            if (j11 < 0 || j10 < j11) {
                return a.e((j10 - r0) / this.f16689a, 0.0f, 1.0f) * 0.5f;
            }
            float f10 = this.f16698j;
            return (1.0f - f10) + (f10 * a.e((j10 - j11) / this.f16699k, 0.0f, 1.0f));
        }

        private float g(float f10) {
            return ((-4.0f) * f10 * f10) + (f10 * 4.0f);
        }

        public void a() {
            if (this.f16694f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fG = g(e(jCurrentAnimationTimeMillis));
            long j10 = jCurrentAnimationTimeMillis - this.f16694f;
            this.f16694f = jCurrentAnimationTimeMillis;
            float f10 = j10 * fG;
            this.f16695g = (int) (this.f16691c * f10);
            this.f16696h = (int) (f10 * this.f16692d);
        }

        public int b() {
            return this.f16695g;
        }

        public int c() {
            return this.f16696h;
        }

        public int d() {
            float f10 = this.f16691c;
            return (int) (f10 / Math.abs(f10));
        }

        public int f() {
            float f10 = this.f16692d;
            return (int) (f10 / Math.abs(f10));
        }

        public boolean h() {
            return this.f16697i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f16697i + ((long) this.f16699k);
        }

        public void i() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f16699k = a.f((int) (jCurrentAnimationTimeMillis - this.f16693e), 0, this.f16690b);
            this.f16698j = e(jCurrentAnimationTimeMillis);
            this.f16697i = jCurrentAnimationTimeMillis;
        }

        public void j(int i10) {
            this.f16690b = i10;
        }

        public void k(int i10) {
            this.f16689a = i10;
        }

        public void l(float f10, float f11) {
            this.f16691c = f10;
            this.f16692d = f11;
        }

        public void m() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f16693e = jCurrentAnimationTimeMillis;
            this.f16697i = -1L;
            this.f16694f = jCurrentAnimationTimeMillis;
            this.f16698j = 0.5f;
            this.f16695g = 0;
            this.f16696h = 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.f16686u) {
                if (aVar.f16684s) {
                    aVar.f16684s = false;
                    aVar.f16672g.m();
                }
                C0167a c0167a = a.this.f16672g;
                if (c0167a.h() || !a.this.u()) {
                    a.this.f16686u = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.f16685t) {
                    aVar2.f16685t = false;
                    aVar2.c();
                }
                c0167a.a();
                a.this.j(c0167a.b(), c0167a.c());
                AbstractC1658a0.c0(a.this.f16674i, this);
            }
        }
    }

    public a(View view) {
        this.f16674i = view;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = (int) ((1575.0f * f10) + 0.5f);
        o(f11, f11);
        float f12 = (int) ((f10 * 315.0f) + 0.5f);
        p(f12, f12);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(f16671x);
        r(500);
        q(500);
    }

    private float d(int i10, float f10, float f11, float f12) {
        float fH = h(this.f16676k[i10], f11, this.f16677l[i10], f10);
        if (fH == 0.0f) {
            return 0.0f;
        }
        float f13 = this.f16680o[i10];
        float f14 = this.f16681p[i10];
        float f15 = this.f16682q[i10];
        float f16 = f13 * f12;
        return fH > 0.0f ? e(fH * f16, f14, f15) : -e((-fH) * f16, f14, f15);
    }

    static float e(float f10, float f11, float f12) {
        return f10 > f12 ? f12 : f10 < f11 ? f11 : f10;
    }

    static int f(int i10, int i11, int i12) {
        return i10 > i12 ? i12 : i10 < i11 ? i11 : i10;
    }

    private float g(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.f16678m;
        if (i10 == 0 || i10 == 1) {
            if (f10 < f11) {
                if (f10 >= 0.0f) {
                    return 1.0f - (f10 / f11);
                }
                if (this.f16686u && i10 == 1) {
                    return 1.0f;
                }
            }
        } else if (i10 == 2 && f10 < 0.0f) {
            return f10 / (-f11);
        }
        return 0.0f;
    }

    private float h(float f10, float f11, float f12, float f13) {
        float interpolation;
        float fE = e(f10 * f11, 0.0f, f12);
        float fG = g(f11 - f13, fE) - g(f13, fE);
        if (fG < 0.0f) {
            interpolation = -this.f16673h.getInterpolation(-fG);
        } else {
            if (fG <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f16673h.getInterpolation(fG);
        }
        return e(interpolation, -1.0f, 1.0f);
    }

    private void i() {
        if (this.f16684s) {
            this.f16686u = false;
        } else {
            this.f16672g.i();
        }
    }

    private void v() {
        int i10;
        if (this.f16675j == null) {
            this.f16675j = new b();
        }
        this.f16686u = true;
        this.f16684s = true;
        if (this.f16683r || (i10 = this.f16679n) <= 0) {
            this.f16675j.run();
        } else {
            AbstractC1658a0.d0(this.f16674i, this.f16675j, i10);
        }
        this.f16683r = true;
    }

    public abstract boolean a(int i10);

    public abstract boolean b(int i10);

    void c() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f16674i.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    public abstract void j(int i10, int i11);

    public a k(int i10) {
        this.f16679n = i10;
        return this;
    }

    public a l(int i10) {
        this.f16678m = i10;
        return this;
    }

    public a m(boolean z10) {
        if (this.f16687v && !z10) {
            i();
        }
        this.f16687v = z10;
        return this;
    }

    public a n(float f10, float f11) {
        float[] fArr = this.f16677l;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a o(float f10, float f11) {
        float[] fArr = this.f16682q;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f16687v) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                i();
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                }
            }
            return !this.f16688w && this.f16686u;
        }
        this.f16685t = true;
        this.f16683r = false;
        this.f16672g.l(d(0, motionEvent.getX(), view.getWidth(), this.f16674i.getWidth()), d(1, motionEvent.getY(), view.getHeight(), this.f16674i.getHeight()));
        if (!this.f16686u && u()) {
            v();
        }
        if (this.f16688w) {
        }
    }

    public a p(float f10, float f11) {
        float[] fArr = this.f16681p;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    public a q(int i10) {
        this.f16672g.j(i10);
        return this;
    }

    public a r(int i10) {
        this.f16672g.k(i10);
        return this;
    }

    public a s(float f10, float f11) {
        float[] fArr = this.f16676k;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a t(float f10, float f11) {
        float[] fArr = this.f16680o;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    boolean u() {
        C0167a c0167a = this.f16672g;
        int iF = c0167a.f();
        int iD = c0167a.d();
        if (iF == 0 || !b(iF)) {
            return iD != 0 && a(iD);
        }
        return true;
    }
}
