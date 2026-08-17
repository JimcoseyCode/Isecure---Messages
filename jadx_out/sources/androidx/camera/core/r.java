package androidx.camera.core;

import F.F0;
import android.view.Surface;
import androidx.camera.core.e;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class r implements F0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final F0 f15254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Surface f15255e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private e.a f15256f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f15251a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f15252b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f15253c = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e.a f15257g = new e.a() { // from class: y.t0
        @Override // androidx.camera.core.e.a
        public final void a(androidx.camera.core.o oVar) {
            androidx.camera.core.r.h(this.f33859a, oVar);
        }
    };

    public r(F0 f02) {
        this.f15254d = f02;
        this.f15255e = f02.getSurface();
    }

    public static /* synthetic */ void a(r rVar, F0.a aVar, F0 f02) {
        rVar.getClass();
        aVar.a(rVar);
    }

    public static /* synthetic */ void h(r rVar, o oVar) {
        e.a aVar;
        synchronized (rVar.f15251a) {
            try {
                int i10 = rVar.f15252b - 1;
                rVar.f15252b = i10;
                if (rVar.f15253c && i10 == 0) {
                    rVar.close();
                }
                aVar = rVar.f15256f;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            aVar.a(oVar);
        }
    }

    private o l(o oVar) {
        if (oVar == null) {
            return null;
        }
        this.f15252b++;
        t tVar = new t(oVar);
        tVar.d(this.f15257g);
        return tVar;
    }

    @Override // F.F0
    public o b() {
        o oVarL;
        synchronized (this.f15251a) {
            oVarL = l(this.f15254d.b());
        }
        return oVarL;
    }

    @Override // F.F0
    public int c() {
        int iC;
        synchronized (this.f15251a) {
            iC = this.f15254d.c();
        }
        return iC;
    }

    @Override // F.F0
    public void close() {
        synchronized (this.f15251a) {
            try {
                Surface surface = this.f15255e;
                if (surface != null) {
                    surface.release();
                }
                this.f15254d.close();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F.F0
    public void d() {
        synchronized (this.f15251a) {
            this.f15254d.d();
        }
    }

    @Override // F.F0
    public void e(final F0.a aVar, Executor executor) {
        synchronized (this.f15251a) {
            this.f15254d.e(new F0.a() { // from class: y.s0
                @Override // F.F0.a
                public final void a(F.F0 f02) {
                    androidx.camera.core.r.a(this.f33851a, aVar, f02);
                }
            }, executor);
        }
    }

    @Override // F.F0
    public int f() {
        int iF;
        synchronized (this.f15251a) {
            iF = this.f15254d.f();
        }
        return iF;
    }

    @Override // F.F0
    public o g() {
        o oVarL;
        synchronized (this.f15251a) {
            oVarL = l(this.f15254d.g());
        }
        return oVarL;
    }

    @Override // F.F0
    public int getHeight() {
        int height;
        synchronized (this.f15251a) {
            height = this.f15254d.getHeight();
        }
        return height;
    }

    @Override // F.F0
    public Surface getSurface() {
        Surface surface;
        synchronized (this.f15251a) {
            surface = this.f15254d.getSurface();
        }
        return surface;
    }

    @Override // F.F0
    public int getWidth() {
        int width;
        synchronized (this.f15251a) {
            width = this.f15254d.getWidth();
        }
        return width;
    }

    public int i() {
        int iF;
        synchronized (this.f15251a) {
            iF = this.f15254d.f() - this.f15252b;
        }
        return iF;
    }

    public void j() {
        synchronized (this.f15251a) {
            try {
                this.f15253c = true;
                this.f15254d.d();
                if (this.f15252b == 0) {
                    close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void k(e.a aVar) {
        synchronized (this.f15251a) {
            this.f15256f = aVar;
        }
    }
}
