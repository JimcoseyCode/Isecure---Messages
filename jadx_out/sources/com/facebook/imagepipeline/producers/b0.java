package com.facebook.imagepipeline.producers;

import g2.AbstractC2662a;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class b0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f20056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final V2.d f20057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f20058c;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class a extends AbstractC1983t {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final g0 f20059c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final e0 f20060d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final com.facebook.imagepipeline.request.d f20061e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f20062f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private AbstractC2662a f20063g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f20064h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f20065i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f20066j;

        /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.b0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class C0215a extends AbstractC1970f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ b0 f20068a;

            C0215a(b0 b0Var) {
                this.f20068a = b0Var;
            }

            @Override // com.facebook.imagepipeline.producers.f0
            public void a() {
                a.this.B();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                AbstractC2662a abstractC2662a;
                int i10;
                synchronized (a.this) {
                    abstractC2662a = a.this.f20063g;
                    i10 = a.this.f20064h;
                    a.this.f20063g = null;
                    a.this.f20065i = false;
                }
                if (AbstractC2662a.d0(abstractC2662a)) {
                    try {
                        a.this.y(abstractC2662a, i10);
                    } finally {
                        AbstractC2662a.B(abstractC2662a);
                    }
                }
                a.this.w();
            }
        }

        public a(InterfaceC1978n interfaceC1978n, g0 g0Var, com.facebook.imagepipeline.request.d dVar, e0 e0Var) {
            super(interfaceC1978n);
            this.f20063g = null;
            this.f20064h = 0;
            this.f20065i = false;
            this.f20066j = false;
            this.f20059c = g0Var;
            this.f20061e = dVar;
            this.f20060d = e0Var;
            e0Var.k(new C0215a(b0.this));
        }

        private synchronized boolean A() {
            return this.f20062f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void B() {
            if (x()) {
                o().a();
            }
        }

        private void C(Throwable th) {
            if (x()) {
                o().onFailure(th);
            }
        }

        private void D(AbstractC2662a abstractC2662a, int i10) {
            boolean zD = AbstractC1967c.d(i10);
            if ((zD || A()) && !(zD && x())) {
                return;
            }
            o().c(abstractC2662a, i10);
        }

        private AbstractC2662a F(d3.e eVar) {
            d3.f fVar = (d3.f) eVar;
            AbstractC2662a abstractC2662aProcess = this.f20061e.process(fVar.h0(), b0.this.f20057b);
            try {
                d3.f fVarU = d3.f.u(abstractC2662aProcess, eVar.Z(), fVar.F(), fVar.I0());
                fVarU.s(fVar.getExtras());
                return AbstractC2662a.g0(fVarU);
            } finally {
                AbstractC2662a.B(abstractC2662aProcess);
            }
        }

        private synchronized boolean G() {
            if (this.f20062f || !this.f20065i || this.f20066j || !AbstractC2662a.d0(this.f20063g)) {
                return false;
            }
            this.f20066j = true;
            return true;
        }

        private boolean H(d3.e eVar) {
            return eVar instanceof d3.f;
        }

        private void I() {
            b0.this.f20058c.execute(new b());
        }

        private void J(AbstractC2662a abstractC2662a, int i10) {
            synchronized (this) {
                try {
                    if (this.f20062f) {
                        return;
                    }
                    AbstractC2662a abstractC2662a2 = this.f20063g;
                    this.f20063g = AbstractC2662a.r(abstractC2662a);
                    this.f20064h = i10;
                    this.f20065i = true;
                    boolean zG = G();
                    AbstractC2662a.B(abstractC2662a2);
                    if (zG) {
                        I();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void w() {
            boolean zG;
            synchronized (this) {
                this.f20066j = false;
                zG = G();
            }
            if (zG) {
                I();
            }
        }

        private boolean x() {
            synchronized (this) {
                try {
                    if (this.f20062f) {
                        return false;
                    }
                    AbstractC2662a abstractC2662a = this.f20063g;
                    this.f20063g = null;
                    this.f20062f = true;
                    AbstractC2662a.B(abstractC2662a);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void y(AbstractC2662a abstractC2662a, int i10) {
            c2.k.b(Boolean.valueOf(AbstractC2662a.d0(abstractC2662a)));
            if (!H((d3.e) abstractC2662a.J())) {
                D(abstractC2662a, i10);
                return;
            }
            this.f20059c.e(this.f20060d, "PostprocessorProducer");
            try {
                try {
                    AbstractC2662a abstractC2662aF = F((d3.e) abstractC2662a.J());
                    g0 g0Var = this.f20059c;
                    e0 e0Var = this.f20060d;
                    g0Var.j(e0Var, "PostprocessorProducer", z(g0Var, e0Var, this.f20061e));
                    D(abstractC2662aF, i10);
                    AbstractC2662a.B(abstractC2662aF);
                } catch (Exception e10) {
                    g0 g0Var2 = this.f20059c;
                    e0 e0Var2 = this.f20060d;
                    g0Var2.k(e0Var2, "PostprocessorProducer", e10, z(g0Var2, e0Var2, this.f20061e));
                    C(e10);
                    AbstractC2662a.B(null);
                }
            } catch (Throwable th) {
                AbstractC2662a.B(null);
                throw th;
            }
        }

        private Map z(g0 g0Var, e0 e0Var, com.facebook.imagepipeline.request.d dVar) {
            if (g0Var.g(e0Var, "PostprocessorProducer")) {
                return c2.g.of("Postprocessor", dVar.getName());
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC1967c
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public void h(AbstractC2662a abstractC2662a, int i10) {
            if (AbstractC2662a.d0(abstractC2662a)) {
                J(abstractC2662a, i10);
            } else if (AbstractC1967c.d(i10)) {
                D(null, i10);
            }
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC1983t, com.facebook.imagepipeline.producers.AbstractC1967c
        protected void f() {
            B();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC1983t, com.facebook.imagepipeline.producers.AbstractC1967c
        protected void g(Throwable th) {
            C(th);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b extends AbstractC1983t {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC1967c
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void h(AbstractC2662a abstractC2662a, int i10) {
            if (AbstractC1967c.e(i10)) {
                return;
            }
            o().c(abstractC2662a, i10);
        }

        private b(a aVar) {
            super(aVar);
        }
    }

    public b0(d0 d0Var, V2.d dVar, Executor executor) {
        this.f20056a = (d0) c2.k.g(d0Var);
        this.f20057b = dVar;
        this.f20058c = (Executor) c2.k.g(executor);
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC1978n interfaceC1978n, e0 e0Var) {
        g0 g0VarW = e0Var.W();
        com.facebook.imagepipeline.request.d postprocessor = e0Var.e().getPostprocessor();
        c2.k.g(postprocessor);
        this.f20056a.b(new b(new a(interfaceC1978n, g0VarW, postprocessor, e0Var)), e0Var);
    }
}
