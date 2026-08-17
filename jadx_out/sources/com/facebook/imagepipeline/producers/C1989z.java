package com.facebook.imagepipeline.producers;

import com.facebook.hermes.intl.Constants;
import com.facebook.imagepipeline.request.b;
import g2.AbstractC2662a;
import j3.C2768b;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C1989z implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final W2.x f20223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final W2.k f20224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d0 f20225c;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.z$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class a extends AbstractC1983t {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final W2.x f20226c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final W1.d f20227d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f20228e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f20229f;

        public a(InterfaceC1978n interfaceC1978n, W2.x xVar, W1.d dVar, boolean z10, boolean z11) {
            super(interfaceC1978n);
            this.f20226c = xVar;
            this.f20227d = dVar;
            this.f20228e = z10;
            this.f20229f = z11;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC1967c
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void h(d3.k kVar, int i10) {
            try {
                if (C2768b.d()) {
                    C2768b.a("EncodedMemoryCacheProducer#onNewResultImpl");
                }
                if (!AbstractC1967c.e(i10) && kVar != null && !AbstractC1967c.l(i10, 10) && kVar.I() != Q2.c.f9081d) {
                    AbstractC2662a abstractC2662aR = kVar.r();
                    if (abstractC2662aR != null) {
                        try {
                            AbstractC2662a abstractC2662aF = (this.f20229f && this.f20228e) ? this.f20226c.f(this.f20227d, abstractC2662aR) : null;
                            if (abstractC2662aF != null) {
                                try {
                                    d3.k kVar2 = new d3.k(abstractC2662aF);
                                    kVar2.m(kVar);
                                    try {
                                        o().b(1.0f);
                                        o().c(kVar2, i10);
                                        if (C2768b.d()) {
                                            C2768b.b();
                                            return;
                                        }
                                        return;
                                    } finally {
                                        d3.k.k(kVar2);
                                    }
                                } finally {
                                    AbstractC2662a.B(abstractC2662aF);
                                }
                            }
                        } finally {
                            AbstractC2662a.B(abstractC2662aR);
                        }
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

    public C1989z(W2.x xVar, W2.k kVar, d0 d0Var) {
        this.f20223a = xVar;
        this.f20224b = kVar;
        this.f20225c = d0Var;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC1978n interfaceC1978n, e0 e0Var) {
        try {
            if (C2768b.d()) {
                C2768b.a("EncodedMemoryCacheProducer#produceResults");
            }
            g0 g0VarW = e0Var.W();
            g0VarW.e(e0Var, "EncodedMemoryCacheProducer");
            W1.d dVarD = this.f20224b.d(e0Var.e(), e0Var.d());
            AbstractC2662a abstractC2662a = e0Var.e().isCacheEnabled(4) ? this.f20223a.get(dVarD) : null;
            try {
                if (abstractC2662a != null) {
                    d3.k kVar = new d3.k(abstractC2662a);
                    try {
                        g0VarW.j(e0Var, "EncodedMemoryCacheProducer", g0VarW.g(e0Var, "EncodedMemoryCacheProducer") ? c2.g.of("cached_value_found", "true") : null);
                        g0VarW.c(e0Var, "EncodedMemoryCacheProducer", true);
                        e0Var.M("memory_encoded");
                        interfaceC1978n.b(1.0f);
                        interfaceC1978n.c(kVar, 1);
                        d3.k.k(kVar);
                        AbstractC2662a.B(abstractC2662a);
                        if (C2768b.d()) {
                            C2768b.b();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        d3.k.k(kVar);
                        throw th;
                    }
                }
                if (e0Var.d0().j() < b.c.ENCODED_MEMORY_CACHE.j()) {
                    a aVar = new a(interfaceC1978n, this.f20223a, dVarD, e0Var.e().isCacheEnabled(8), e0Var.m().F().D());
                    g0VarW.j(e0Var, "EncodedMemoryCacheProducer", g0VarW.g(e0Var, "EncodedMemoryCacheProducer") ? c2.g.of("cached_value_found", Constants.CASEFIRST_FALSE) : null);
                    this.f20225c.b(aVar, e0Var);
                    AbstractC2662a.B(abstractC2662a);
                    if (C2768b.d()) {
                        C2768b.b();
                        return;
                    }
                    return;
                }
                g0VarW.j(e0Var, "EncodedMemoryCacheProducer", g0VarW.g(e0Var, "EncodedMemoryCacheProducer") ? c2.g.of("cached_value_found", Constants.CASEFIRST_FALSE) : null);
                g0VarW.c(e0Var, "EncodedMemoryCacheProducer", false);
                e0Var.r("memory_encoded", "nil-result");
                interfaceC1978n.c(null, 1);
                AbstractC2662a.B(abstractC2662a);
                if (C2768b.d()) {
                    C2768b.b();
                }
            } catch (Throwable th2) {
                AbstractC2662a.B(abstractC2662a);
                throw th2;
            }
        } finally {
        }
    }
}
