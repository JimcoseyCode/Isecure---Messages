package com.facebook.imagepipeline.producers;

import c2.AbstractC1841b;
import g2.AbstractC2662a;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class L implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f19973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f2.i f19974b;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends m0 {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ com.facebook.imagepipeline.request.b f19975l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ g0 f19976m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ e0 f19977n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC1978n interfaceC1978n, g0 g0Var, e0 e0Var, String str, com.facebook.imagepipeline.request.b bVar, g0 g0Var2, e0 e0Var2) {
            super(interfaceC1978n, g0Var, e0Var, str);
            this.f19975l = bVar;
            this.f19976m = g0Var2;
            this.f19977n = e0Var2;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // a2.h
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void b(d3.k kVar) {
            d3.k.k(kVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // a2.h
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public d3.k c() {
            d3.k kVarD = L.this.d(this.f19975l);
            if (kVarD == null) {
                this.f19976m.c(this.f19977n, L.this.f(), false);
                this.f19977n.r("local", "fetch");
                return null;
            }
            kVarD.w0();
            this.f19976m.c(this.f19977n, L.this.f(), true);
            this.f19977n.r("local", "fetch");
            this.f19977n.J("image_color_space", kVarD.A());
            return kVarD;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b extends AbstractC1970f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ m0 f19979a;

        b(m0 m0Var) {
            this.f19979a = m0Var;
        }

        @Override // com.facebook.imagepipeline.producers.f0
        public void a() {
            this.f19979a.a();
        }
    }

    protected L(Executor executor, f2.i iVar) {
        this.f19973a = executor;
        this.f19974b = iVar;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC1978n interfaceC1978n, e0 e0Var) {
        g0 g0VarW = e0Var.W();
        com.facebook.imagepipeline.request.b bVarE = e0Var.e();
        e0Var.r("local", "fetch");
        a aVar = new a(interfaceC1978n, g0VarW, e0Var, f(), bVarE, g0VarW, e0Var);
        e0Var.k(new b(aVar));
        this.f19973a.execute(aVar);
    }

    protected d3.k c(InputStream inputStream, int i10) {
        AbstractC2662a abstractC2662aG0 = null;
        try {
            abstractC2662aG0 = i10 <= 0 ? AbstractC2662a.g0(this.f19974b.c(inputStream)) : AbstractC2662a.g0(this.f19974b.d(inputStream, i10));
            d3.k kVar = new d3.k(abstractC2662aG0);
            AbstractC1841b.b(inputStream);
            AbstractC2662a.B(abstractC2662aG0);
            return kVar;
        } catch (Throwable th) {
            AbstractC1841b.b(inputStream);
            AbstractC2662a.B(abstractC2662aG0);
            throw th;
        }
    }

    protected abstract d3.k d(com.facebook.imagepipeline.request.b bVar);

    protected d3.k e(InputStream inputStream, int i10) {
        return c(inputStream, i10);
    }

    protected abstract String f();
}
