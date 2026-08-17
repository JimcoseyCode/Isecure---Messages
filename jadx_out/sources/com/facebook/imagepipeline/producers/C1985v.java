package com.facebook.imagepipeline.producers;

import Y2.InterfaceC1517c;
import com.facebook.imagepipeline.producers.C1984u;
import com.facebook.imagepipeline.request.b;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C1985v implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c2.n f20206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final W2.k f20207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d0 f20208c;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.v$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements o1.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g0 f20209a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e0 f20210b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC1978n f20211c;

        a(g0 g0Var, e0 e0Var, InterfaceC1978n interfaceC1978n) {
            this.f20209a = g0Var;
            this.f20210b = e0Var;
            this.f20211c = interfaceC1978n;
        }

        @Override // o1.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(o1.f fVar) {
            if (C1985v.f(fVar)) {
                this.f20209a.d(this.f20210b, "DiskCacheProducer", null);
                this.f20211c.a();
            } else if (fVar.n()) {
                this.f20209a.k(this.f20210b, "DiskCacheProducer", fVar.i(), null);
                C1985v.this.f20208c.b(this.f20211c, this.f20210b);
            } else {
                d3.k kVar = (d3.k) fVar.j();
                if (kVar != null) {
                    g0 g0Var = this.f20209a;
                    e0 e0Var = this.f20210b;
                    g0Var.j(e0Var, "DiskCacheProducer", C1985v.e(g0Var, e0Var, true, kVar.X()));
                    this.f20209a.c(this.f20210b, "DiskCacheProducer", true);
                    this.f20210b.M("disk");
                    this.f20211c.b(1.0f);
                    this.f20211c.c(kVar, 1);
                    kVar.close();
                } else {
                    g0 g0Var2 = this.f20209a;
                    e0 e0Var2 = this.f20210b;
                    g0Var2.j(e0Var2, "DiskCacheProducer", C1985v.e(g0Var2, e0Var2, false, 0));
                    C1985v.this.f20208c.b(this.f20211c, this.f20210b);
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.v$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b extends AbstractC1970f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f20213a;

        b(AtomicBoolean atomicBoolean) {
            this.f20213a = atomicBoolean;
        }

        @Override // com.facebook.imagepipeline.producers.f0
        public void a() {
            this.f20213a.set(true);
        }
    }

    public C1985v(c2.n nVar, W2.k kVar, d0 d0Var) {
        this.f20206a = nVar;
        this.f20207b = kVar;
        this.f20208c = d0Var;
    }

    static Map e(g0 g0Var, e0 e0Var, boolean z10, int i10) {
        if (g0Var.g(e0Var, "DiskCacheProducer")) {
            return z10 ? c2.g.of("cached_value_found", String.valueOf(z10), "encodedImageSize", String.valueOf(i10)) : c2.g.of("cached_value_found", String.valueOf(z10));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean f(o1.f fVar) {
        if (fVar.l()) {
            return true;
        }
        return fVar.n() && (fVar.i() instanceof CancellationException);
    }

    private void g(InterfaceC1978n interfaceC1978n, e0 e0Var) {
        if (e0Var.d0().j() < b.c.DISK_CACHE.j()) {
            this.f20208c.b(interfaceC1978n, e0Var);
        } else {
            e0Var.r("disk", "nil-result_read");
            interfaceC1978n.c(null, 1);
        }
    }

    private o1.d h(InterfaceC1978n interfaceC1978n, e0 e0Var) {
        return new a(e0Var.W(), e0Var, interfaceC1978n);
    }

    private void i(AtomicBoolean atomicBoolean, e0 e0Var) {
        e0Var.k(new b(atomicBoolean));
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC1978n interfaceC1978n, e0 e0Var) {
        com.facebook.imagepipeline.request.b bVarE = e0Var.e();
        if (!e0Var.e().isCacheEnabled(16)) {
            g(interfaceC1978n, e0Var);
            return;
        }
        e0Var.W().e(e0Var, "DiskCacheProducer");
        W1.d dVarD = this.f20207b.d(bVarE, e0Var.d());
        InterfaceC1517c interfaceC1517c = (InterfaceC1517c) this.f20206a.get();
        W2.j jVarA = C1984u.a(bVarE, interfaceC1517c.b(), interfaceC1517c.c(), interfaceC1517c.a());
        if (jVarA != null) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            jVarA.m(dVarD, atomicBoolean).e(h(interfaceC1978n, e0Var));
            i(atomicBoolean, e0Var);
        } else {
            e0Var.W().k(e0Var, "DiskCacheProducer", new C1984u.a("Got no disk cache for CacheChoice: " + Integer.valueOf(bVarE.getCacheChoice().ordinal()).toString()), null);
            g(interfaceC1978n, e0Var);
        }
    }
}
