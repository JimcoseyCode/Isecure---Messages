package com.facebook.imagepipeline.producers;

import Y2.InterfaceC1517c;
import com.facebook.imagepipeline.producers.C1984u;
import com.facebook.imagepipeline.request.b;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C1986w implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c2.n f20216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final W2.k f20217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d0 f20218c;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.w$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class a extends AbstractC1983t {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final e0 f20219c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final c2.n f20220d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final W2.k f20221e;

        @Override // com.facebook.imagepipeline.producers.AbstractC1967c
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void h(d3.k kVar, int i10) {
            this.f20219c.W().e(this.f20219c, "DiskCacheWriteProducer");
            if (AbstractC1967c.e(i10) || kVar == null || AbstractC1967c.l(i10, 10) || kVar.I() == Q2.c.f9081d) {
                this.f20219c.W().j(this.f20219c, "DiskCacheWriteProducer", null);
                o().c(kVar, i10);
                return;
            }
            com.facebook.imagepipeline.request.b bVarE = this.f20219c.e();
            W1.d dVarD = this.f20221e.d(bVarE, this.f20219c.d());
            InterfaceC1517c interfaceC1517c = (InterfaceC1517c) this.f20220d.get();
            W2.j jVarA = C1984u.a(bVarE, interfaceC1517c.b(), interfaceC1517c.c(), interfaceC1517c.a());
            if (jVarA != null) {
                jVarA.p(dVarD, kVar);
                this.f20219c.W().j(this.f20219c, "DiskCacheWriteProducer", null);
                o().c(kVar, i10);
                return;
            }
            this.f20219c.W().k(this.f20219c, "DiskCacheWriteProducer", new C1984u.a("Got no disk cache for CacheChoice: " + Integer.valueOf(bVarE.getCacheChoice().ordinal()).toString()), null);
            o().c(kVar, i10);
        }

        private a(InterfaceC1978n interfaceC1978n, e0 e0Var, c2.n nVar, W2.k kVar) {
            super(interfaceC1978n);
            this.f20219c = e0Var;
            this.f20220d = nVar;
            this.f20221e = kVar;
        }
    }

    public C1986w(c2.n nVar, W2.k kVar, d0 d0Var) {
        this.f20216a = nVar;
        this.f20217b = kVar;
        this.f20218c = d0Var;
    }

    private void c(InterfaceC1978n interfaceC1978n, e0 e0Var) {
        e0 e0Var2;
        if (e0Var.d0().j() >= b.c.DISK_CACHE.j()) {
            e0Var.r("disk", "nil-result_write");
            interfaceC1978n.c(null, 1);
            return;
        }
        if (e0Var.e().isCacheEnabled(32)) {
            e0Var2 = e0Var;
            interfaceC1978n = new a(interfaceC1978n, e0Var2, this.f20216a, this.f20217b);
        } else {
            e0Var2 = e0Var;
        }
        this.f20218c.b(interfaceC1978n, e0Var2);
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC1978n interfaceC1978n, e0 e0Var) {
        c(interfaceC1978n, e0Var);
    }
}
