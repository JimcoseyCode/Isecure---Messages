package com.facebook.imagepipeline.producers;

import com.facebook.hermes.intl.Constants;
import g2.AbstractC2662a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class a0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final W2.x f20049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final W2.k f20050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d0 f20051c;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class a extends AbstractC1983t {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final W1.d f20052c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f20053d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final W2.x f20054e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f20055f;

        public a(InterfaceC1978n interfaceC1978n, W1.d dVar, boolean z10, W2.x xVar, boolean z11) {
            super(interfaceC1978n);
            this.f20052c = dVar;
            this.f20053d = z10;
            this.f20054e = xVar;
            this.f20055f = z11;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC1967c
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void h(AbstractC2662a abstractC2662a, int i10) {
            if (abstractC2662a == null) {
                if (AbstractC1967c.d(i10)) {
                    o().c(null, i10);
                }
            } else if (!AbstractC1967c.e(i10) || this.f20053d) {
                AbstractC2662a abstractC2662aF = this.f20055f ? this.f20054e.f(this.f20052c, abstractC2662a) : null;
                try {
                    o().b(1.0f);
                    InterfaceC1978n interfaceC1978nO = o();
                    if (abstractC2662aF != null) {
                        abstractC2662a = abstractC2662aF;
                    }
                    interfaceC1978nO.c(abstractC2662a, i10);
                } finally {
                    AbstractC2662a.B(abstractC2662aF);
                }
            }
        }
    }

    public a0(W2.x xVar, W2.k kVar, d0 d0Var) {
        this.f20049a = xVar;
        this.f20050b = kVar;
        this.f20051c = d0Var;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC1978n interfaceC1978n, e0 e0Var) {
        g0 g0VarW = e0Var.W();
        com.facebook.imagepipeline.request.b bVarE = e0Var.e();
        Object objD = e0Var.d();
        com.facebook.imagepipeline.request.d postprocessor = bVarE.getPostprocessor();
        if (postprocessor == null || postprocessor.getPostprocessorCacheKey() == null) {
            this.f20051c.b(interfaceC1978n, e0Var);
            return;
        }
        g0VarW.e(e0Var, c());
        W1.d dVarC = this.f20050b.c(bVarE, objD);
        AbstractC2662a abstractC2662a = e0Var.e().isCacheEnabled(1) ? this.f20049a.get(dVarC) : null;
        if (abstractC2662a == null) {
            a aVar = new a(interfaceC1978n, dVarC, false, this.f20049a, e0Var.e().isCacheEnabled(2));
            g0VarW.j(e0Var, c(), g0VarW.g(e0Var, c()) ? c2.g.of("cached_value_found", Constants.CASEFIRST_FALSE) : null);
            this.f20051c.b(aVar, e0Var);
        } else {
            g0VarW.j(e0Var, c(), g0VarW.g(e0Var, c()) ? c2.g.of("cached_value_found", "true") : null);
            g0VarW.c(e0Var, "PostprocessedBitmapMemoryCacheProducer", true);
            e0Var.r("memory_bitmap", "postprocessed");
            interfaceC1978n.b(1.0f);
            interfaceC1978n.c(abstractC2662a, 1);
            abstractC2662a.close();
        }
    }

    protected String c() {
        return "PostprocessedBitmapMemoryCacheProducer";
    }
}
