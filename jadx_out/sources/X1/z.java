package x1;

import B1.n;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import v1.EnumC3417a;
import x1.InterfaceC3522f;
import z1.InterfaceC3666a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class z implements InterfaceC3522f, InterfaceC3522f.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C3523g f33493g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC3522f.a f33494h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile int f33495i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile C3519c f33496j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile Object f33497k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private volatile n.a f33498l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private volatile C3520d f33499m;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements d.a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ n.a f33500g;

        a(n.a aVar) {
            this.f33500g = aVar;
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void a(Exception exc) {
            if (z.this.d(this.f33500g)) {
                z.this.f(this.f33500g, exc);
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void c(Object obj) {
            if (z.this.d(this.f33500g)) {
                z.this.e(this.f33500g, obj);
            }
        }
    }

    z(C3523g c3523g, InterfaceC3522f.a aVar) {
        this.f33493g = c3523g;
        this.f33494h = aVar;
    }

    private boolean a(Object obj) throws Throwable {
        Throwable th;
        long jB = Q1.g.b();
        boolean z10 = false;
        try {
            com.bumptech.glide.load.data.e eVarO = this.f33493g.o(obj);
            Object objA = eVarO.a();
            v1.d dVarQ = this.f33493g.q(objA);
            C3521e c3521e = new C3521e(dVarQ, objA, this.f33493g.k());
            C3520d c3520d = new C3520d(this.f33498l.f299a, this.f33493g.p());
            InterfaceC3666a interfaceC3666aD = this.f33493g.d();
            interfaceC3666aD.b(c3520d, c3521e);
            if (Log.isLoggable("SourceGenerator", 2)) {
                c3520d.toString();
                Objects.toString(obj);
                Objects.toString(dVarQ);
                Q1.g.a(jB);
            }
            if (interfaceC3666aD.a(c3520d) != null) {
                this.f33499m = c3520d;
                this.f33496j = new C3519c(Collections.singletonList(this.f33498l.f299a), this.f33493g, this);
                this.f33498l.f301c.cleanup();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Objects.toString(this.f33499m);
                Objects.toString(obj);
            }
            try {
                this.f33494h.h(this.f33498l.f299a, eVarO.a(), this.f33498l.f301c, this.f33498l.f301c.getDataSource(), this.f33498l.f299a);
                return false;
            } catch (Throwable th2) {
                th = th2;
                z10 = true;
                if (z10) {
                    throw th;
                }
                this.f33498l.f301c.cleanup();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private boolean c() {
        return this.f33495i < this.f33493g.g().size();
    }

    private void g(n.a aVar) {
        this.f33498l.f301c.loadData(this.f33493g.l(), new a(aVar));
    }

    @Override // x1.InterfaceC3522f
    public boolean b() {
        if (this.f33497k != null) {
            Object obj = this.f33497k;
            this.f33497k = null;
            try {
                if (!a(obj)) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        if (this.f33496j != null && this.f33496j.b()) {
            return true;
        }
        this.f33496j = null;
        this.f33498l = null;
        boolean z10 = false;
        while (!z10 && c()) {
            List listG = this.f33493g.g();
            int i10 = this.f33495i;
            this.f33495i = i10 + 1;
            this.f33498l = (n.a) listG.get(i10);
            if (this.f33498l != null && (this.f33493g.e().c(this.f33498l.f301c.getDataSource()) || this.f33493g.u(this.f33498l.f301c.getDataClass()))) {
                g(this.f33498l);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // x1.InterfaceC3522f
    public void cancel() {
        n.a aVar = this.f33498l;
        if (aVar != null) {
            aVar.f301c.cancel();
        }
    }

    boolean d(n.a aVar) {
        n.a aVar2 = this.f33498l;
        return aVar2 != null && aVar2 == aVar;
    }

    void e(n.a aVar, Object obj) {
        AbstractC3526j abstractC3526jE = this.f33493g.e();
        if (obj != null && abstractC3526jE.c(aVar.f301c.getDataSource())) {
            this.f33497k = obj;
            this.f33494h.k();
        } else {
            InterfaceC3522f.a aVar2 = this.f33494h;
            v1.f fVar = aVar.f299a;
            com.bumptech.glide.load.data.d dVar = aVar.f301c;
            aVar2.h(fVar, obj, dVar, dVar.getDataSource(), this.f33499m);
        }
    }

    void f(n.a aVar, Exception exc) {
        InterfaceC3522f.a aVar2 = this.f33494h;
        C3520d c3520d = this.f33499m;
        com.bumptech.glide.load.data.d dVar = aVar.f301c;
        aVar2.j(c3520d, exc, dVar, dVar.getDataSource());
    }

    @Override // x1.InterfaceC3522f.a
    public void h(v1.f fVar, Object obj, com.bumptech.glide.load.data.d dVar, EnumC3417a enumC3417a, v1.f fVar2) {
        this.f33494h.h(fVar, obj, dVar, this.f33498l.f301c.getDataSource(), fVar);
    }

    @Override // x1.InterfaceC3522f.a
    public void j(v1.f fVar, Exception exc, com.bumptech.glide.load.data.d dVar, EnumC3417a enumC3417a) {
        this.f33494h.j(fVar, exc, dVar, this.f33498l.f301c.getDataSource());
    }

    @Override // x1.InterfaceC3522f.a
    public void k() {
        throw new UnsupportedOperationException();
    }
}
