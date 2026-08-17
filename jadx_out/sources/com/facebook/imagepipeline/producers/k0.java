package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.producers.G;
import g2.AbstractC2662a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class k0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f20118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f2.i f20119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d0 f20120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f20121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k3.d f20122e;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class a extends AbstractC1983t {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f20123c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final k3.d f20124d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final e0 f20125e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f20126f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final G f20127g;

        /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.k0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class C0216a implements G.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ k0 f20129a;

            C0216a(k0 k0Var) {
                this.f20129a = k0Var;
            }

            @Override // com.facebook.imagepipeline.producers.G.d
            public void a(d3.k kVar, int i10) throws Throwable {
                if (kVar == null) {
                    a.this.o().c(null, i10);
                } else {
                    a aVar = a.this;
                    aVar.v(kVar, i10, (k3.c) c2.k.g(aVar.f20124d.createImageTranscoder(kVar.I(), a.this.f20123c)));
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class b extends AbstractC1970f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ k0 f20131a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC1978n f20132b;

            b(k0 k0Var, InterfaceC1978n interfaceC1978n) {
                this.f20131a = k0Var;
                this.f20132b = interfaceC1978n;
            }

            @Override // com.facebook.imagepipeline.producers.f0
            public void a() {
                a.this.f20127g.c();
                a.this.f20126f = true;
                this.f20132b.a();
            }

            @Override // com.facebook.imagepipeline.producers.AbstractC1970f, com.facebook.imagepipeline.producers.f0
            public void b() {
                if (a.this.f20125e.X()) {
                    a.this.f20127g.h();
                }
            }
        }

        a(InterfaceC1978n interfaceC1978n, e0 e0Var, boolean z10, k3.d dVar) {
            super(interfaceC1978n);
            this.f20126f = false;
            this.f20125e = e0Var;
            Boolean resizingAllowedOverride = e0Var.e().getResizingAllowedOverride();
            this.f20123c = resizingAllowedOverride != null ? resizingAllowedOverride.booleanValue() : z10;
            this.f20124d = dVar;
            this.f20127g = new G(k0.this.f20118a, new C0216a(k0.this), 100);
            e0Var.k(new b(k0.this, interfaceC1978n));
        }

        private d3.k A(d3.k kVar) {
            return (this.f20125e.e().getRotationOptions().d() || kVar.F() == 0 || kVar.F() == -1) ? kVar : x(kVar, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void v(d3.k kVar, int i10, k3.c cVar) throws Throwable {
            this.f20125e.W().e(this.f20125e, "ResizeAndRotateProducer");
            com.facebook.imagepipeline.request.b bVarE = this.f20125e.e();
            f2.k kVarA = k0.this.f20119b.a();
            try {
                try {
                    k3.b bVarC = cVar.c(kVar, kVarA, bVarE.getRotationOptions(), bVarE.getResizeOptions(), null, 85, kVar.A());
                    if (bVarC.a() == 2) {
                        throw new RuntimeException("Error while transcoding the image");
                    }
                    Map mapY = y(kVar, bVarE.getResizeOptions(), bVarC, cVar.a());
                    AbstractC2662a abstractC2662aG0 = AbstractC2662a.g0(kVarA.d());
                    try {
                        d3.k kVar2 = new d3.k(abstractC2662aG0);
                        kVar2.M0(Q2.b.f9065b);
                        try {
                            kVar2.w0();
                            this.f20125e.W().j(this.f20125e, "ResizeAndRotateProducer", mapY);
                            if (bVarC.a() != 1) {
                                i10 |= 16;
                            }
                            o().c(kVar2, i10);
                            d3.k.k(kVar2);
                            AbstractC2662a.B(abstractC2662aG0);
                            kVarA.close();
                        } catch (Throwable th) {
                            d3.k.k(kVar2);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        AbstractC2662a.B(abstractC2662aG0);
                        throw th2;
                    }
                } catch (Exception e10) {
                    this.f20125e.W().k(this.f20125e, "ResizeAndRotateProducer", e10, null);
                    if (AbstractC1967c.d(i10)) {
                        o().onFailure(e10);
                    }
                    kVarA.close();
                }
            } catch (Throwable th3) {
                kVarA.close();
                throw th3;
            }
        }

        private void w(d3.k kVar, int i10, Q2.c cVar) {
            o().c((cVar == Q2.b.f9065b || cVar == Q2.b.f9075l) ? A(kVar) : z(kVar), i10);
        }

        private d3.k x(d3.k kVar, int i10) {
            d3.k kVarE = d3.k.e(kVar);
            if (kVarE != null) {
                kVarE.N0(i10);
            }
            return kVarE;
        }

        private Map y(d3.k kVar, X2.g gVar, k3.b bVar, String str) {
            String str2;
            if (!this.f20125e.W().g(this.f20125e, "ResizeAndRotateProducer")) {
                return null;
            }
            String str3 = kVar.getWidth() + "x" + kVar.getHeight();
            if (gVar != null) {
                str2 = gVar.f12445a + "x" + gVar.f12446b;
            } else {
                str2 = "Unspecified";
            }
            HashMap map = new HashMap();
            map.put("Image format", String.valueOf(kVar.I()));
            map.put("Original size", str3);
            map.put("Requested size", str2);
            map.put("queueTime", String.valueOf(this.f20127g.f()));
            map.put("Transcoder id", str);
            map.put("Transcoding result", String.valueOf(bVar));
            return c2.g.a(map);
        }

        private d3.k z(d3.k kVar) {
            X2.h rotationOptions = this.f20125e.e().getRotationOptions();
            return (rotationOptions.h() || !rotationOptions.g()) ? kVar : x(kVar, rotationOptions.f());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC1967c
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public void h(d3.k kVar, int i10) {
            if (this.f20126f) {
                return;
            }
            boolean zD = AbstractC1967c.d(i10);
            if (kVar == null) {
                if (zD) {
                    o().c(null, 1);
                    return;
                }
                return;
            }
            Q2.c cVarI = kVar.I();
            k2.e eVarH = k0.h(this.f20125e.e(), kVar, (k3.c) c2.k.g(this.f20124d.createImageTranscoder(cVarI, this.f20123c)));
            if (zD || eVarH != k2.e.UNSET) {
                if (eVarH != k2.e.YES) {
                    w(kVar, i10, cVarI);
                } else if (this.f20127g.k(kVar, i10)) {
                    if (zD || this.f20125e.X()) {
                        this.f20127g.h();
                    }
                }
            }
        }
    }

    public k0(Executor executor, f2.i iVar, d0 d0Var, boolean z10, k3.d dVar) {
        this.f20118a = (Executor) c2.k.g(executor);
        this.f20119b = (f2.i) c2.k.g(iVar);
        this.f20120c = (d0) c2.k.g(d0Var);
        this.f20122e = (k3.d) c2.k.g(dVar);
        this.f20121d = z10;
    }

    private static boolean f(X2.h hVar, d3.k kVar) {
        if (hVar.d()) {
            return false;
        }
        return k3.e.e(hVar, kVar) != 0 || g(hVar, kVar);
    }

    private static boolean g(X2.h hVar, d3.k kVar) {
        if (hVar.g() && !hVar.d()) {
            return k3.e.f29114b.contains(Integer.valueOf(kVar.I0()));
        }
        kVar.K0(0);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static k2.e h(com.facebook.imagepipeline.request.b bVar, d3.k kVar, k3.c cVar) {
        if (kVar == null || kVar.I() == Q2.c.f9081d) {
            return k2.e.UNSET;
        }
        if (cVar.d(kVar.I())) {
            return k2.e.k(f(bVar.getRotationOptions(), kVar) || cVar.b(kVar, bVar.getRotationOptions(), bVar.getResizeOptions()));
        }
        return k2.e.NO;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC1978n interfaceC1978n, e0 e0Var) {
        this.f20120c.b(new a(interfaceC1978n, e0Var, this.f20121d, this.f20122e), e0Var);
    }
}
