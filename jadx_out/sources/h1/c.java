package H1;

import H1.g;
import Q1.k;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import java.nio.ByteBuffer;
import java.util.List;
import s1.InterfaceC3316a;
import v1.l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class c extends Drawable implements g.b, Animatable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a f3647g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f3648h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f3649i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f3650j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f3651k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f3652l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f3653m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f3654n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Paint f3655o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Rect f3656p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private List f3657q;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class a extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final g f3658a;

        a(g gVar) {
            this.f3658a = gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new c(this);
        }
    }

    public c(Context context, InterfaceC3316a interfaceC3316a, l lVar, int i10, int i11, Bitmap bitmap) {
        this(new a(new g(com.bumptech.glide.b.d(context), interfaceC3316a, i10, i11, lVar, bitmap)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Drawable.Callback b() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    private Rect d() {
        if (this.f3656p == null) {
            this.f3656p = new Rect();
        }
        return this.f3656p;
    }

    private Paint h() {
        if (this.f3655o == null) {
            this.f3655o = new Paint(2);
        }
        return this.f3655o;
    }

    private void j() {
        List list = this.f3657q;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((androidx.vectordrawable.graphics.drawable.b) this.f3657q.get(i10)).b(this);
            }
        }
    }

    private void l() {
        this.f3652l = 0;
    }

    private void n() {
        k.b(!this.f3650j, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f3647g.f3658a.f() == 1) {
            invalidateSelf();
        } else {
            if (this.f3648h) {
                return;
            }
            this.f3648h = true;
            this.f3647g.f3658a.r(this);
            invalidateSelf();
        }
    }

    private void o() {
        this.f3648h = false;
        this.f3647g.f3658a.s(this);
    }

    @Override // H1.g.b
    public void a() {
        if (b() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (g() == f() - 1) {
            this.f3652l++;
        }
        int i10 = this.f3653m;
        if (i10 == -1 || this.f3652l < i10) {
            return;
        }
        stop();
        j();
    }

    public ByteBuffer c() {
        return this.f3647g.f3658a.b();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f3650j) {
            return;
        }
        if (this.f3654n) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), d());
            this.f3654n = false;
        }
        canvas.drawBitmap(this.f3647g.f3658a.c(), (Rect) null, d(), h());
    }

    public Bitmap e() {
        return this.f3647g.f3658a.e();
    }

    public int f() {
        return this.f3647g.f3658a.f();
    }

    public int g() {
        return this.f3647g.f3658a.d();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f3647g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f3647g.f3658a.h();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f3647g.f3658a.k();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public int i() {
        return this.f3647g.f3658a.j();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f3648h;
    }

    public void k() {
        this.f3650j = true;
        this.f3647g.f3658a.a();
    }

    public void m(l lVar, Bitmap bitmap) {
        this.f3647g.f3658a.o(lVar, bitmap);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f3654n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        h().setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        h().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        k.b(!this.f3650j, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f3651k = z10;
        if (!z10) {
            o();
        } else if (this.f3649i) {
            n();
        }
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f3649i = true;
        l();
        if (this.f3651k) {
            n();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f3649i = false;
        o();
    }

    c(a aVar) {
        this.f3651k = true;
        this.f3653m = -1;
        this.f3647g = (a) k.e(aVar);
    }
}
