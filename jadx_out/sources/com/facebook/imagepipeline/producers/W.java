package com.facebook.imagepipeline.producers;

import android.os.SystemClock;
import com.facebook.imagepipeline.producers.X;
import f2.InterfaceC2600a;
import g2.AbstractC2662a;
import j3.C2768b;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class W implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final f2.i f20025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC2600a f20026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final X f20027c;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements X.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C f20028a;

        a(C c10) {
            this.f20028a = c10;
        }

        @Override // com.facebook.imagepipeline.producers.X.a
        public void a() {
            W.this.k(this.f20028a);
        }

        @Override // com.facebook.imagepipeline.producers.X.a
        public void b(InputStream inputStream, int i10) throws Throwable {
            if (C2768b.d()) {
                C2768b.a("NetworkFetcher->onResponse");
            }
            W.this.m(this.f20028a, inputStream, i10);
            if (C2768b.d()) {
                C2768b.b();
            }
        }

        @Override // com.facebook.imagepipeline.producers.X.a
        public void onFailure(Throwable th) {
            W.this.l(this.f20028a, th);
        }
    }

    public W(f2.i iVar, InterfaceC2600a interfaceC2600a, X x10) {
        this.f20025a = iVar;
        this.f20026b = interfaceC2600a;
        this.f20027c = x10;
    }

    protected static float e(int i10, int i11) {
        return i11 > 0 ? i10 / i11 : 1.0f - ((float) Math.exp(((double) (-i10)) / 50000.0d));
    }

    private Map f(C c10, int i10) {
        if (c10.d().g(c10.b(), "NetworkFetchProducer")) {
            return this.f20027c.getExtraMap(c10, i10);
        }
        return null;
    }

    protected static void j(f2.k kVar, int i10, X2.b bVar, InterfaceC1978n interfaceC1978n, e0 e0Var) throws Throwable {
        d3.k kVar2;
        AbstractC2662a abstractC2662aG0 = AbstractC2662a.g0(kVar.d());
        d3.k kVar3 = null;
        try {
            kVar2 = new d3.k(abstractC2662aG0);
        } catch (Throwable th) {
            th = th;
        }
        try {
            kVar2.J0(bVar);
            kVar2.w0();
            interfaceC1978n.c(kVar2, i10);
            d3.k.k(kVar2);
            AbstractC2662a.B(abstractC2662aG0);
        } catch (Throwable th2) {
            th = th2;
            kVar3 = kVar2;
            d3.k.k(kVar3);
            AbstractC2662a.B(abstractC2662aG0);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(C c10) {
        c10.d().d(c10.b(), "NetworkFetchProducer", null);
        c10.a().a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(C c10, Throwable th) {
        c10.d().k(c10.b(), "NetworkFetchProducer", th, null);
        c10.d().c(c10.b(), "NetworkFetchProducer", false);
        c10.b().M("network");
        c10.a().onFailure(th);
    }

    private boolean n(C c10, e0 e0Var) {
        b3.e eVarP = e0Var.m().p();
        if (eVarP != null && eVarP.c() && c10.b().X()) {
            return this.f20027c.shouldPropagate(c10);
        }
        return false;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC1978n interfaceC1978n, e0 e0Var) {
        e0Var.W().e(e0Var, "NetworkFetchProducer");
        C cCreateFetchState = this.f20027c.createFetchState(interfaceC1978n, e0Var);
        this.f20027c.fetch(cCreateFetchState, new a(cCreateFetchState));
    }

    protected long g() {
        return SystemClock.uptimeMillis();
    }

    protected void h(f2.k kVar, C c10) throws Throwable {
        Map mapF = f(c10, kVar.size());
        g0 g0VarD = c10.d();
        g0VarD.j(c10.b(), "NetworkFetchProducer", mapF);
        g0VarD.c(c10.b(), "NetworkFetchProducer", true);
        c10.b().M("network");
        j(kVar, c10.e() | 1, c10.f(), c10.a(), c10.b());
    }

    protected void i(f2.k kVar, C c10) throws Throwable {
        if (n(c10, c10.b())) {
            long jG = g();
            if (jG - c10.c() >= 100) {
                c10.h(jG);
                c10.d().a(c10.b(), "NetworkFetchProducer", "intermediate_result");
                j(kVar, c10.e(), c10.f(), c10.a(), c10.b());
            }
        }
    }

    protected void m(C c10, InputStream inputStream, int i10) throws Throwable {
        f2.k kVarE = i10 > 0 ? this.f20025a.e(i10) : this.f20025a.a();
        byte[] bArr = (byte[]) this.f20026b.get(16384);
        while (true) {
            try {
                int i11 = inputStream.read(bArr);
                if (i11 < 0) {
                    this.f20027c.onFetchCompletion(c10, kVarE.size());
                    h(kVarE, c10);
                    this.f20026b.release(bArr);
                    kVarE.close();
                    return;
                }
                if (i11 > 0) {
                    kVarE.write(bArr, 0, i11);
                    i(kVarE, c10);
                    c10.a().b(e(kVarE.size(), i10));
                }
            } catch (Throwable th) {
                this.f20026b.release(bArr);
                kVarE.close();
                throw th;
            }
        }
    }
}
