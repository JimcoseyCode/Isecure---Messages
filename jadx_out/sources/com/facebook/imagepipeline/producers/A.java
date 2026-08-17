package com.facebook.imagepipeline.producers;

import W2.C1497d;
import Y2.InterfaceC1517c;
import com.facebook.imagepipeline.request.b;
import j3.C2768b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class A implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c2.n f19909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final W2.k f19910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d0 f19911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C1497d f19912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C1497d f19913e;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class a extends AbstractC1983t {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final e0 f19914c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final c2.n f19915d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final W2.k f19916e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final C1497d f19917f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final C1497d f19918g;

        public a(InterfaceC1978n interfaceC1978n, e0 e0Var, c2.n nVar, W2.k kVar, C1497d c1497d, C1497d c1497d2) {
            super(interfaceC1978n);
            this.f19914c = e0Var;
            this.f19915d = nVar;
            this.f19916e = kVar;
            this.f19917f = c1497d;
            this.f19918g = c1497d2;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC1967c
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void h(d3.k kVar, int i10) {
            try {
                if (C2768b.d()) {
                    C2768b.a("EncodedProbeProducer#onNewResultImpl");
                }
                if (!AbstractC1967c.e(i10) && kVar != null && !AbstractC1967c.l(i10, 10) && kVar.I() != Q2.c.f9081d) {
                    com.facebook.imagepipeline.request.b bVarE = this.f19914c.e();
                    W1.d dVarD = this.f19916e.d(bVarE, this.f19914c.d());
                    this.f19917f.a(dVarD);
                    if ("memory_encoded".equals(this.f19914c.B("origin"))) {
                        if (!this.f19918g.b(dVarD)) {
                            boolean z10 = bVarE.getCacheChoice() == b.EnumC0218b.SMALL;
                            InterfaceC1517c interfaceC1517c = (InterfaceC1517c) this.f19915d.get();
                            (z10 ? interfaceC1517c.b() : interfaceC1517c.c()).f(dVarD);
                            this.f19918g.a(dVarD);
                        }
                    } else if ("disk".equals(this.f19914c.B("origin"))) {
                        this.f19918g.a(dVarD);
                    }
                    o().c(kVar, i10);
                    if (C2768b.d()) {
                        C2768b.b();
                        return;
                    }
                    return;
                }
                o().c(kVar, i10);
                if (C2768b.d()) {
                    C2768b.b();
                }
            } catch (Throwable th) {
                if (C2768b.d()) {
                    C2768b.b();
                }
                throw th;
            }
        }
    }

    public A(c2.n nVar, W2.k kVar, C1497d c1497d, C1497d c1497d2, d0 d0Var) {
        this.f19909a = nVar;
        this.f19910b = kVar;
        this.f19912d = c1497d;
        this.f19913e = c1497d2;
        this.f19911c = d0Var;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC1978n interfaceC1978n, e0 e0Var) {
        try {
            if (C2768b.d()) {
                C2768b.a("EncodedProbeProducer#produceResults");
            }
            g0 g0VarW = e0Var.W();
            g0VarW.e(e0Var, c());
            a aVar = new a(interfaceC1978n, e0Var, this.f19909a, this.f19910b, this.f19912d, this.f19913e);
            g0VarW.j(e0Var, "EncodedProbeProducer", null);
            if (C2768b.d()) {
                C2768b.a("mInputProducer.produceResult");
            }
            this.f19911c.b(aVar, e0Var);
            if (C2768b.d()) {
                C2768b.b();
            }
            if (C2768b.d()) {
                C2768b.b();
            }
        } finally {
        }
    }

    protected String c() {
        return "EncodedProbeProducer";
    }
}
