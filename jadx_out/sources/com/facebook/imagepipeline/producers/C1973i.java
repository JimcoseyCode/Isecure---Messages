package com.facebook.imagepipeline.producers;

import com.facebook.hermes.intl.Constants;
import com.facebook.imagepipeline.request.b;
import g2.AbstractC2662a;
import j3.C2768b;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C1973i implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final W2.x f20090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final W2.k f20091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d0 f20092c;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.i$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends AbstractC1983t {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ W1.d f20093c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f20094d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC1978n interfaceC1978n, W1.d dVar, boolean z10) {
            super(interfaceC1978n);
            this.f20093c = dVar;
            this.f20094d = z10;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC1967c
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void h(AbstractC2662a abstractC2662a, int i10) {
            AbstractC2662a abstractC2662a2;
            try {
                if (C2768b.d()) {
                    C2768b.a("BitmapMemoryCacheProducer#onNewResultImpl");
                }
                boolean zD = AbstractC1967c.d(i10);
                if (abstractC2662a == null) {
                    if (zD) {
                        o().c(null, i10);
                    }
                    if (C2768b.d()) {
                        C2768b.b();
                        return;
                    }
                    return;
                }
                if (!((d3.e) abstractC2662a.J()).F0() && !AbstractC1967c.m(i10, 8)) {
                    if (!zD && (abstractC2662a2 = C1973i.this.f20090a.get(this.f20093c)) != null) {
                        try {
                            d3.p pVarZ = ((d3.e) abstractC2662a.J()).Z();
                            d3.p pVarZ2 = ((d3.e) abstractC2662a2.J()).Z();
                            if (pVarZ2.a() || pVarZ2.c() >= pVarZ.c()) {
                                o().c(abstractC2662a2, i10);
                                if (C2768b.d()) {
                                    C2768b.b();
                                    return;
                                }
                                return;
                            }
                        } finally {
                            AbstractC2662a.B(abstractC2662a2);
                        }
                    }
                    AbstractC2662a abstractC2662aF = this.f20094d ? C1973i.this.f20090a.f(this.f20093c, abstractC2662a) : null;
                    if (zD) {
                        try {
                            o().b(1.0f);
                        } catch (Throwable th) {
                            AbstractC2662a.B(abstractC2662aF);
                            throw th;
                        }
                    }
                    InterfaceC1978n interfaceC1978nO = o();
                    if (abstractC2662aF != null) {
                        abstractC2662a = abstractC2662aF;
                    }
                    interfaceC1978nO.c(abstractC2662a, i10);
                    AbstractC2662a.B(abstractC2662aF);
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
            } catch (Throwable th2) {
                if (C2768b.d()) {
                    C2768b.b();
                }
                throw th2;
            }
        }
    }

    public C1973i(W2.x xVar, W2.k kVar, d0 d0Var) {
        this.f20090a = xVar;
        this.f20091b = kVar;
        this.f20092c = d0Var;
    }

    private static void f(d3.l lVar, e0 e0Var) {
        e0Var.s(lVar.getExtras());
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC1978n interfaceC1978n, e0 e0Var) {
        try {
            if (C2768b.d()) {
                C2768b.a("BitmapMemoryCacheProducer#produceResults");
            }
            g0 g0VarW = e0Var.W();
            g0VarW.e(e0Var, e());
            W1.d dVarA = this.f20091b.a(e0Var.e(), e0Var.d());
            AbstractC2662a abstractC2662a = e0Var.e().isCacheEnabled(1) ? this.f20090a.get(dVarA) : null;
            if (abstractC2662a != null) {
                f((d3.l) abstractC2662a.J(), e0Var);
                boolean zA = ((d3.e) abstractC2662a.J()).Z().a();
                if (zA) {
                    g0VarW.j(e0Var, e(), g0VarW.g(e0Var, e()) ? c2.g.of("cached_value_found", "true") : null);
                    g0VarW.c(e0Var, e(), true);
                    e0Var.r("memory_bitmap", d());
                    interfaceC1978n.b(1.0f);
                }
                interfaceC1978n.c(abstractC2662a, AbstractC1967c.k(zA));
                abstractC2662a.close();
                if (zA) {
                    if (C2768b.d()) {
                        C2768b.b();
                        return;
                    }
                    return;
                }
            }
            if (e0Var.d0().j() >= b.c.BITMAP_MEMORY_CACHE.j()) {
                g0VarW.j(e0Var, e(), g0VarW.g(e0Var, e()) ? c2.g.of("cached_value_found", Constants.CASEFIRST_FALSE) : null);
                g0VarW.c(e0Var, e(), false);
                e0Var.r("memory_bitmap", d());
                interfaceC1978n.c(null, 1);
                if (C2768b.d()) {
                    C2768b.b();
                    return;
                }
                return;
            }
            InterfaceC1978n interfaceC1978nG = g(interfaceC1978n, dVarA, e0Var.e().isCacheEnabled(2));
            g0VarW.j(e0Var, e(), g0VarW.g(e0Var, e()) ? c2.g.of("cached_value_found", Constants.CASEFIRST_FALSE) : null);
            if (C2768b.d()) {
                C2768b.a("mInputProducer.produceResult");
            }
            this.f20092c.b(interfaceC1978nG, e0Var);
            if (C2768b.d()) {
                C2768b.b();
            }
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

    protected String d() {
        return "pipe_bg";
    }

    protected String e() {
        return "BitmapMemoryCacheProducer";
    }

    protected InterfaceC1978n g(InterfaceC1978n interfaceC1978n, W1.d dVar, boolean z10) {
        return new a(interfaceC1978n, dVar, z10);
    }
}
