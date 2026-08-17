package z2;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import c2.k;
import com.facebook.drawee.drawable.C1964f;
import com.facebook.drawee.drawable.InterfaceC1961c;
import com.facebook.drawee.drawable.g;
import com.facebook.drawee.drawable.o;
import com.facebook.drawee.drawable.q;
import j3.C2768b;
import java.util.Iterator;

/* JADX INFO: renamed from: z2.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C3669a implements B2.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Drawable f34218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources f34219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private e f34220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C3672d f34221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C1964f f34222e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final g f34223f;

    C3669a(C3670b c3670b) {
        ColorDrawable colorDrawable = new ColorDrawable(0);
        this.f34218a = colorDrawable;
        if (C2768b.d()) {
            C2768b.a("GenericDraweeHierarchy()");
        }
        this.f34219b = c3670b.p();
        this.f34220c = c3670b.s();
        g gVar = new g(colorDrawable);
        this.f34223f = gVar;
        int i10 = 1;
        int size = c3670b.j() != null ? c3670b.j().size() : 1;
        int i11 = (size == 0 ? 1 : size) + (c3670b.m() != null ? 1 : 0);
        Drawable[] drawableArr = new Drawable[i11 + 6];
        drawableArr[0] = h(c3670b.e(), null);
        drawableArr[1] = h(c3670b.k(), c3670b.l());
        drawableArr[2] = g(gVar, c3670b.d(), c3670b.c(), c3670b.b());
        drawableArr[3] = h(c3670b.n(), c3670b.o());
        drawableArr[4] = h(c3670b.q(), c3670b.r());
        drawableArr[5] = h(c3670b.h(), c3670b.i());
        if (i11 > 0) {
            if (c3670b.j() != null) {
                Iterator it = c3670b.j().iterator();
                i10 = 0;
                while (it.hasNext()) {
                    drawableArr[i10 + 6] = h((Drawable) it.next(), null);
                    i10++;
                }
            }
            if (c3670b.m() != null) {
                drawableArr[i10 + 6] = h(c3670b.m(), null);
            }
        }
        C1964f c1964f = new C1964f(drawableArr, false, 2);
        this.f34222e = c1964f;
        c1964f.r(c3670b.g());
        C3672d c3672d = new C3672d(f.e(c1964f, this.f34220c));
        this.f34221d = c3672d;
        c3672d.mutate();
        s();
        if (C2768b.d()) {
            C2768b.b();
        }
    }

    private Drawable g(Drawable drawable, q qVar, PointF pointF, ColorFilter colorFilter) {
        drawable.setColorFilter(colorFilter);
        return f.g(drawable, qVar, pointF);
    }

    private Drawable h(Drawable drawable, q qVar) {
        return f.f(f.d(drawable, this.f34220c, this.f34219b), qVar);
    }

    private void i(int i10) {
        if (i10 >= 0) {
            this.f34222e.j(i10);
        }
    }

    private void j() {
        k(1);
        k(2);
        k(3);
        k(4);
        k(5);
    }

    private void k(int i10) {
        if (i10 >= 0) {
            this.f34222e.k(i10);
        }
    }

    private InterfaceC1961c n(int i10) {
        InterfaceC1961c interfaceC1961cC = this.f34222e.c(i10);
        interfaceC1961cC.getDrawable();
        return interfaceC1961cC.getDrawable() instanceof o ? (o) interfaceC1961cC.getDrawable() : interfaceC1961cC;
    }

    private o p(int i10) {
        InterfaceC1961c interfaceC1961cN = n(i10);
        return interfaceC1961cN instanceof o ? (o) interfaceC1961cN : f.k(interfaceC1961cN, q.f19807a);
    }

    private boolean q(int i10) {
        return n(i10) instanceof o;
    }

    private void r() {
        this.f34223f.setDrawable(this.f34218a);
    }

    private void s() {
        C1964f c1964f = this.f34222e;
        if (c1964f != null) {
            c1964f.f();
            this.f34222e.i();
            j();
            i(1);
            this.f34222e.l();
            this.f34222e.h();
        }
    }

    private void u(int i10, Drawable drawable) {
        if (drawable == null) {
            this.f34222e.e(i10, null);
        } else {
            n(i10).setDrawable(f.d(drawable, this.f34220c, this.f34219b));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void x(float f10) {
        Drawable drawableB = this.f34222e.b(3);
        if (drawableB == 0) {
            return;
        }
        if (f10 >= 0.999f) {
            if (drawableB instanceof Animatable) {
                ((Animatable) drawableB).stop();
            }
            k(3);
        } else {
            if (drawableB instanceof Animatable) {
                ((Animatable) drawableB).start();
            }
            i(3);
        }
        drawableB.setLevel(Math.round(f10 * 10000.0f));
    }

    @Override // B2.c
    public void a(Drawable drawable) {
        this.f34221d.i(drawable);
    }

    @Override // B2.c
    public void b(Throwable th) {
        this.f34222e.f();
        j();
        if (this.f34222e.b(4) != null) {
            i(4);
        } else {
            i(1);
        }
        this.f34222e.h();
    }

    @Override // B2.c
    public void c(Throwable th) {
        this.f34222e.f();
        j();
        if (this.f34222e.b(5) != null) {
            i(5);
        } else {
            i(1);
        }
        this.f34222e.h();
    }

    @Override // B2.c
    public void d(float f10, boolean z10) {
        if (this.f34222e.b(3) == null) {
            return;
        }
        this.f34222e.f();
        x(f10);
        if (z10) {
            this.f34222e.l();
        }
        this.f34222e.h();
    }

    @Override // B2.b
    public Drawable e() {
        return this.f34221d;
    }

    @Override // B2.c
    public void f(Drawable drawable, float f10, boolean z10) {
        Drawable drawableD = f.d(drawable, this.f34220c, this.f34219b);
        drawableD.mutate();
        this.f34223f.setDrawable(drawableD);
        this.f34222e.f();
        j();
        i(2);
        x(f10);
        if (z10) {
            this.f34222e.l();
        }
        this.f34222e.h();
    }

    @Override // B2.b
    public Rect getBounds() {
        return this.f34221d.getBounds();
    }

    public PointF l() {
        if (q(2)) {
            return p(2).k();
        }
        return null;
    }

    public q m() {
        if (q(2)) {
            return p(2).l();
        }
        return null;
    }

    public e o() {
        return this.f34220c;
    }

    @Override // B2.c
    public void reset() {
        r();
        s();
    }

    public void t(q qVar) {
        k.g(qVar);
        p(2).n(qVar);
    }

    public void v(int i10) {
        this.f34222e.r(i10);
    }

    public void w(Drawable drawable, q qVar) {
        u(1, drawable);
        p(1).n(qVar);
    }

    public void y(Drawable drawable) {
        u(3, drawable);
    }

    public void z(e eVar) {
        this.f34220c = eVar;
        f.j(this.f34221d, eVar);
        for (int i10 = 0; i10 < this.f34222e.d(); i10++) {
            f.i(n(i10), this.f34220c, this.f34219b);
        }
    }
}
