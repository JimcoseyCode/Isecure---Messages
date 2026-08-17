package androidx.swiperefreshlayout.widget;

import H0.g;
import a1.C1591b;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class b extends Drawable implements Animatable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Interpolator f18229m = new LinearInterpolator();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Interpolator f18230n = new C1591b();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int[] f18231o = {-16777216};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c f18232g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f18233h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Resources f18234i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Animator f18235j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    float f18236k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f18237l;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f18238a;

        a(c cVar) {
            this.f18238a = cVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            b.this.n(fFloatValue, this.f18238a);
            b.this.b(fFloatValue, this.f18238a, false);
            b.this.invalidateSelf();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final RectF f18242a = new RectF();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Paint f18243b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Paint f18244c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Paint f18245d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f18246e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        float f18247f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        float f18248g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        float f18249h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int[] f18250i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f18251j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float f18252k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        float f18253l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        float f18254m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f18255n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Path f18256o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        float f18257p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        float f18258q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f18259r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f18260s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f18261t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f18262u;

        c() {
            Paint paint = new Paint();
            this.f18243b = paint;
            Paint paint2 = new Paint();
            this.f18244c = paint2;
            Paint paint3 = new Paint();
            this.f18245d = paint3;
            this.f18246e = 0.0f;
            this.f18247f = 0.0f;
            this.f18248g = 0.0f;
            this.f18249h = 5.0f;
            this.f18257p = 1.0f;
            this.f18261t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        void A() {
            this.f18252k = this.f18246e;
            this.f18253l = this.f18247f;
            this.f18254m = this.f18248g;
        }

        void a(Canvas canvas, Rect rect) {
            RectF rectF = this.f18242a;
            float f10 = this.f18258q;
            float fMin = (this.f18249h / 2.0f) + f10;
            if (f10 <= 0.0f) {
                fMin = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.f18259r * this.f18257p) / 2.0f, this.f18249h / 2.0f);
            }
            rectF.set(rect.centerX() - fMin, rect.centerY() - fMin, rect.centerX() + fMin, rect.centerY() + fMin);
            float f11 = this.f18246e;
            float f12 = this.f18248g;
            float f13 = (f11 + f12) * 360.0f;
            float f14 = ((this.f18247f + f12) * 360.0f) - f13;
            this.f18243b.setColor(this.f18262u);
            this.f18243b.setAlpha(this.f18261t);
            float f15 = this.f18249h / 2.0f;
            rectF.inset(f15, f15);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f18245d);
            float f16 = -f15;
            rectF.inset(f16, f16);
            canvas.drawArc(rectF, f13, f14, false, this.f18243b);
            b(canvas, f13, f14, rectF);
        }

        void b(Canvas canvas, float f10, float f11, RectF rectF) {
            if (this.f18255n) {
                Path path = this.f18256o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f18256o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float fMin = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f12 = (this.f18259r * this.f18257p) / 2.0f;
                this.f18256o.moveTo(0.0f, 0.0f);
                this.f18256o.lineTo(this.f18259r * this.f18257p, 0.0f);
                Path path3 = this.f18256o;
                float f13 = this.f18259r;
                float f14 = this.f18257p;
                path3.lineTo((f13 * f14) / 2.0f, this.f18260s * f14);
                this.f18256o.offset((fMin + rectF.centerX()) - f12, rectF.centerY() + (this.f18249h / 2.0f));
                this.f18256o.close();
                this.f18244c.setColor(this.f18262u);
                this.f18244c.setAlpha(this.f18261t);
                canvas.save();
                canvas.rotate(f10 + f11, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f18256o, this.f18244c);
                canvas.restore();
            }
        }

        int c() {
            return this.f18261t;
        }

        float d() {
            return this.f18247f;
        }

        int e() {
            return this.f18250i[f()];
        }

        int f() {
            return (this.f18251j + 1) % this.f18250i.length;
        }

        float g() {
            return this.f18246e;
        }

        int h() {
            return this.f18250i[this.f18251j];
        }

        float i() {
            return this.f18253l;
        }

        float j() {
            return this.f18254m;
        }

        float k() {
            return this.f18252k;
        }

        void l() {
            t(f());
        }

        void m() {
            this.f18252k = 0.0f;
            this.f18253l = 0.0f;
            this.f18254m = 0.0f;
            y(0.0f);
            v(0.0f);
            w(0.0f);
        }

        void n(int i10) {
            this.f18261t = i10;
        }

        void o(float f10, float f11) {
            this.f18259r = (int) f10;
            this.f18260s = (int) f11;
        }

        void p(float f10) {
            if (f10 != this.f18257p) {
                this.f18257p = f10;
            }
        }

        void q(float f10) {
            this.f18258q = f10;
        }

        void r(int i10) {
            this.f18262u = i10;
        }

        void s(ColorFilter colorFilter) {
            this.f18243b.setColorFilter(colorFilter);
        }

        void t(int i10) {
            this.f18251j = i10;
            this.f18262u = this.f18250i[i10];
        }

        void u(int[] iArr) {
            this.f18250i = iArr;
            t(0);
        }

        void v(float f10) {
            this.f18247f = f10;
        }

        void w(float f10) {
            this.f18248g = f10;
        }

        void x(boolean z10) {
            if (this.f18255n != z10) {
                this.f18255n = z10;
            }
        }

        void y(float f10) {
            this.f18246e = f10;
        }

        void z(float f10) {
            this.f18249h = f10;
            this.f18243b.setStrokeWidth(f10);
        }
    }

    public b(Context context) {
        this.f18234i = ((Context) g.g(context)).getResources();
        c cVar = new c();
        this.f18232g = cVar;
        cVar.u(f18231o);
        k(2.5f);
        m();
    }

    private void a(float f10, c cVar) {
        n(f10, cVar);
        float fFloor = (float) (Math.floor(cVar.j() / 0.8f) + 1.0d);
        cVar.y(cVar.k() + (((cVar.i() - 0.01f) - cVar.k()) * f10));
        cVar.v(cVar.i());
        cVar.w(cVar.j() + ((fFloor - cVar.j()) * f10));
    }

    private int c(float f10, int i10, int i11) {
        return ((((i10 >> 24) & 255) + ((int) ((((i11 >> 24) & 255) - r0) * f10))) << 24) | ((((i10 >> 16) & 255) + ((int) ((((i11 >> 16) & 255) - r1) * f10))) << 16) | ((((i10 >> 8) & 255) + ((int) ((((i11 >> 8) & 255) - r2) * f10))) << 8) | ((i10 & 255) + ((int) (f10 * ((i11 & 255) - r8))));
    }

    private void h(float f10) {
        this.f18233h = f10;
    }

    private void i(float f10, float f11, float f12, float f13) {
        c cVar = this.f18232g;
        float f14 = this.f18234i.getDisplayMetrics().density;
        cVar.z(f11 * f14);
        cVar.q(f10 * f14);
        cVar.t(0);
        cVar.o(f12 * f14, f13 * f14);
    }

    private void m() {
        c cVar = this.f18232g;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new a(cVar));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f18229m);
        valueAnimatorOfFloat.addListener(new C0189b(cVar));
        this.f18235j = valueAnimatorOfFloat;
    }

    void b(float f10, c cVar, boolean z10) {
        float interpolation;
        float interpolation2;
        if (this.f18237l) {
            a(f10, cVar);
            return;
        }
        if (f10 != 1.0f || z10) {
            float fJ = cVar.j();
            if (f10 < 0.5f) {
                interpolation = cVar.k();
                interpolation2 = (f18230n.getInterpolation(f10 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float fK = cVar.k() + 0.79f;
                interpolation = fK - (((1.0f - f18230n.getInterpolation((f10 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = fK;
            }
            float f11 = fJ + (0.20999998f * f10);
            float f12 = (f10 + this.f18236k) * 216.0f;
            cVar.y(interpolation);
            cVar.v(interpolation2);
            cVar.w(f11);
            h(f12);
        }
    }

    public void d(boolean z10) {
        this.f18232g.x(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f18233h, bounds.exactCenterX(), bounds.exactCenterY());
        this.f18232g.a(canvas, bounds);
        canvas.restore();
    }

    public void e(float f10) {
        this.f18232g.p(f10);
        invalidateSelf();
    }

    public void f(int... iArr) {
        this.f18232g.u(iArr);
        this.f18232g.t(0);
        invalidateSelf();
    }

    public void g(float f10) {
        this.f18232g.w(f10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f18232g.c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f18235j.isRunning();
    }

    public void j(float f10, float f11) {
        this.f18232g.y(f10);
        this.f18232g.v(f11);
        invalidateSelf();
    }

    public void k(float f10) {
        this.f18232g.z(f10);
        invalidateSelf();
    }

    public void l(int i10) {
        if (i10 == 0) {
            i(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            i(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    void n(float f10, c cVar) {
        if (f10 > 0.75f) {
            cVar.r(c((f10 - 0.75f) / 0.25f, cVar.h(), cVar.e()));
        } else {
            cVar.r(cVar.h());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f18232g.n(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f18232g.s(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f18235j.cancel();
        this.f18232g.A();
        if (this.f18232g.d() != this.f18232g.g()) {
            this.f18237l = true;
            this.f18235j.setDuration(666L);
            this.f18235j.start();
        } else {
            this.f18232g.t(0);
            this.f18232g.m();
            this.f18235j.setDuration(1332L);
            this.f18235j.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f18235j.cancel();
        h(0.0f);
        this.f18232g.x(false);
        this.f18232g.t(0);
        this.f18232g.m();
        invalidateSelf();
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class C0189b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f18240a;

        C0189b(c cVar) {
            this.f18240a = cVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            b.this.b(1.0f, this.f18240a, true);
            this.f18240a.A();
            this.f18240a.l();
            b bVar = b.this;
            if (!bVar.f18237l) {
                bVar.f18236k += 1.0f;
                return;
            }
            bVar.f18237l = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            this.f18240a.x(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b.this.f18236k = 0.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }
}
