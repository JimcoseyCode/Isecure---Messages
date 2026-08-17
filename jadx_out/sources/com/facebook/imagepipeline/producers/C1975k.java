package com.facebook.imagepipeline.producers;

import W2.C1497d;
import Y2.InterfaceC1517c;
import com.facebook.imagepipeline.request.b;
import g2.AbstractC2662a;
import j3.C2768b;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C1975k implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final W2.x f20106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c2.n f20107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final W2.k f20108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d0 f20109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C1497d f20110e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C1497d f20111f;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.k$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class a extends AbstractC1983t {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final e0 f20112c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final W2.x f20113d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final c2.n f20114e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final W2.k f20115f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final C1497d f20116g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final C1497d f20117h;

        public a(InterfaceC1978n interfaceC1978n, e0 e0Var, W2.x xVar, c2.n nVar, W2.k kVar, C1497d c1497d, C1497d c1497d2) {
            super(interfaceC1978n);
            this.f20112c = e0Var;
            this.f20113d = xVar;
            this.f20114e = nVar;
            this.f20115f = kVar;
            this.f20116g = c1497d;
            this.f20117h = c1497d2;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC1967c
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void h(AbstractC2662a abstractC2662a, int i10) {
            try {
                if (C2768b.d()) {
                    C2768b.a("BitmapProbeProducer#onNewResultImpl");
                }
                if (!AbstractC1967c.e(i10) && abstractC2662a != null && !AbstractC1967c.l(i10, 8)) {
                    com.facebook.imagepipeline.request.b bVarE = this.f20112c.e();
                    W1.d dVarD = this.f20115f.d(bVarE, this.f20112c.d());
                    String str = (String) this.f20112c.B("origin");
                    if (str != null && str.equals("memory_bitmap")) {
                        if (this.f20112c.m().F().E() && !this.f20116g.b(dVarD)) {
                            this.f20113d.a(dVarD);
                            this.f20116g.a(dVarD);
                        }
                        if (this.f20112c.m().F().C() && !this.f20117h.b(dVarD)) {
                            boolean z10 = bVarE.getCacheChoice() == b.EnumC0218b.SMALL;
                            InterfaceC1517c interfaceC1517c = (InterfaceC1517c) this.f20114e.get();
                            (z10 ? interfaceC1517c.b() : interfaceC1517c.c()).f(dVarD);
                            this.f20117h.a(dVarD);
                        }
                    }
                    o().c(abstractC2662a, i10);
                    if (C2768b.d()) {
                        C2768b.b();
                        return;
                    }
                    return;
                }
                o().c(abstractC2662a, i10);
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

    public C1975k(W2.x xVar, c2.n nVar, W2.k kVar, C1497d c1497d, C1497d c1497d2, d0 d0Var) {
        this.f20106a = xVar;
        this.f20107b = nVar;
        this.f20108c = kVar;
        this.f20110e = c1497d;
        this.f20111f = c1497d2;
        this.f20109d = d0Var;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC1978n interfaceC1978n, e0 e0Var) {
        try {
            if (C2768b.d()) {
                C2768b.a("BitmapProbeProducer#produceResults");
            }
            g0 g0VarW = e0Var.W();
            g0VarW.e(e0Var, c());
            a aVar = new a(interfaceC1978n, e0Var, this.f20106a, this.f20107b, this.f20108c, this.f20110e, this.f20111f);
            g0VarW.j(e0Var, "BitmapProbeProducer", null);
            if (C2768b.d()) {
                C2768b.a("mInputProducer.produceResult");
            }
            this.f20109d.b(aVar, e0Var);
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
        return "BitmapProbeProducer";
    }
}
