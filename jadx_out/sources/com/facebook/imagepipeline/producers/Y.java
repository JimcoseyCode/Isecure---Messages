package com.facebook.imagepipeline.producers;

import Y2.InterfaceC1517c;
import android.net.Uri;
import d2.AbstractC2325a;
import f2.InterfaceC2600a;
import g2.AbstractC2662a;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class Y implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c2.n f20030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final W2.k f20031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f2.i f20032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC2600a f20033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d0 f20034e;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements o1.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g0 f20035a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e0 f20036b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC1978n f20037c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ W1.d f20038d;

        a(g0 g0Var, e0 e0Var, InterfaceC1978n interfaceC1978n, W1.d dVar) {
            this.f20035a = g0Var;
            this.f20036b = e0Var;
            this.f20037c = interfaceC1978n;
            this.f20038d = dVar;
        }

        @Override // o1.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(o1.f fVar) {
            if (Y.g(fVar)) {
                this.f20035a.d(this.f20036b, "PartialDiskCacheProducer", null);
                this.f20037c.a();
            } else if (fVar.n()) {
                this.f20035a.k(this.f20036b, "PartialDiskCacheProducer", fVar.i(), null);
                Y.this.i(this.f20037c, this.f20036b, this.f20038d, null);
            } else {
                d3.k kVar = (d3.k) fVar.j();
                if (kVar != null) {
                    g0 g0Var = this.f20035a;
                    e0 e0Var = this.f20036b;
                    g0Var.j(e0Var, "PartialDiskCacheProducer", Y.f(g0Var, e0Var, true, kVar.X()));
                    X2.b bVarG = X2.b.g(kVar.X() - 1);
                    kVar.J0(bVarG);
                    int iX = kVar.X();
                    com.facebook.imagepipeline.request.b bVarE = this.f20036b.e();
                    if (bVarG.c(bVarE.getBytesRange())) {
                        this.f20036b.r("disk", "partial");
                        this.f20035a.c(this.f20036b, "PartialDiskCacheProducer", true);
                        this.f20037c.c(kVar, 9);
                    } else {
                        this.f20037c.c(kVar, 8);
                        Y.this.i(this.f20037c, new l0(com.facebook.imagepipeline.request.c.b(bVarE).z(X2.b.d(iX - 1)).a(), this.f20036b), this.f20038d, kVar);
                    }
                } else {
                    g0 g0Var2 = this.f20035a;
                    e0 e0Var2 = this.f20036b;
                    g0Var2.j(e0Var2, "PartialDiskCacheProducer", Y.f(g0Var2, e0Var2, false, 0));
                    Y.this.i(this.f20037c, this.f20036b, this.f20038d, kVar);
                }
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b extends AbstractC1970f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f20040a;

        b(AtomicBoolean atomicBoolean) {
            this.f20040a = atomicBoolean;
        }

        @Override // com.facebook.imagepipeline.producers.f0
        public void a() {
            this.f20040a.set(true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class c extends AbstractC1983t {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final c2.n f20042c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final W1.d f20043d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final f2.i f20044e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final InterfaceC2600a f20045f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final d3.k f20046g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f20047h;

        private void p(InputStream inputStream, OutputStream outputStream, int i10) throws IOException {
            byte[] bArr = (byte[]) this.f20045f.get(16384);
            int i11 = i10;
            while (i11 > 0) {
                try {
                    int i12 = inputStream.read(bArr, 0, Math.min(16384, i11));
                    if (i12 < 0) {
                        break;
                    } else if (i12 > 0) {
                        outputStream.write(bArr, 0, i12);
                        i11 -= i12;
                    }
                } finally {
                    this.f20045f.release(bArr);
                }
            }
            if (i11 > 0) {
                throw new IOException(String.format(null, "Failed to read %d bytes - finished %d short", Integer.valueOf(i10), Integer.valueOf(i11)));
            }
        }

        private f2.k q(d3.k kVar, d3.k kVar2) throws IOException {
            int i10 = ((X2.b) c2.k.g(kVar2.s())).f12411a;
            f2.k kVarE = this.f20044e.e(kVar2.X() + i10);
            p(kVar.M(), kVarE, i10);
            p(kVar2.M(), kVarE, kVar2.X());
            return kVarE;
        }

        private void s(f2.k kVar) throws Throwable {
            d3.k kVar2;
            Throwable th;
            AbstractC2662a abstractC2662aG0 = AbstractC2662a.g0(kVar.d());
            try {
                kVar2 = new d3.k(abstractC2662aG0);
                try {
                    kVar2.w0();
                    o().c(kVar2, 1);
                    d3.k.k(kVar2);
                    AbstractC2662a.B(abstractC2662aG0);
                } catch (Throwable th2) {
                    th = th2;
                    d3.k.k(kVar2);
                    AbstractC2662a.B(abstractC2662aG0);
                    throw th;
                }
            } catch (Throwable th3) {
                kVar2 = null;
                th = th3;
            }
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC1967c
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public void h(d3.k kVar, int i10) {
            if (AbstractC1967c.e(i10)) {
                return;
            }
            if (this.f20046g != null && kVar != null && kVar.s() != null) {
                try {
                    try {
                        s(q(this.f20046g, kVar));
                    } catch (IOException e10) {
                        AbstractC2325a.n("PartialDiskCacheProducer", "Error while merging image data", e10);
                        o().onFailure(e10);
                    }
                    ((InterfaceC1517c) this.f20042c.get()).c().s(this.f20043d);
                    return;
                } finally {
                    kVar.close();
                    this.f20046g.close();
                }
            }
            if (!this.f20047h || !AbstractC1967c.m(i10, 8) || !AbstractC1967c.d(i10) || kVar == null || kVar.I() == Q2.c.f9081d) {
                o().c(kVar, i10);
            } else {
                ((InterfaceC1517c) this.f20042c.get()).c().p(this.f20043d, kVar);
                o().c(kVar, i10);
            }
        }

        private c(InterfaceC1978n interfaceC1978n, c2.n nVar, W1.d dVar, f2.i iVar, InterfaceC2600a interfaceC2600a, d3.k kVar, boolean z10) {
            super(interfaceC1978n);
            this.f20042c = nVar;
            this.f20043d = dVar;
            this.f20044e = iVar;
            this.f20045f = interfaceC2600a;
            this.f20046g = kVar;
            this.f20047h = z10;
        }
    }

    public Y(c2.n nVar, W2.k kVar, f2.i iVar, InterfaceC2600a interfaceC2600a, d0 d0Var) {
        this.f20030a = nVar;
        this.f20031b = kVar;
        this.f20032c = iVar;
        this.f20033d = interfaceC2600a;
        this.f20034e = d0Var;
    }

    private static Uri e(com.facebook.imagepipeline.request.b bVar) {
        return bVar.getSourceUri().buildUpon().appendQueryParameter("fresco_partial", "true").build();
    }

    static Map f(g0 g0Var, e0 e0Var, boolean z10, int i10) {
        if (g0Var.g(e0Var, "PartialDiskCacheProducer")) {
            return z10 ? c2.g.of("cached_value_found", String.valueOf(z10), "encodedImageSize", String.valueOf(i10)) : c2.g.of("cached_value_found", String.valueOf(z10));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean g(o1.f fVar) {
        if (fVar.l()) {
            return true;
        }
        return fVar.n() && (fVar.i() instanceof CancellationException);
    }

    private o1.d h(InterfaceC1978n interfaceC1978n, e0 e0Var, W1.d dVar) {
        return new a(e0Var.W(), e0Var, interfaceC1978n, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(InterfaceC1978n interfaceC1978n, e0 e0Var, W1.d dVar, d3.k kVar) {
        this.f20034e.b(new c(interfaceC1978n, this.f20030a, dVar, this.f20032c, this.f20033d, kVar, e0Var.e().isCacheEnabled(32)), e0Var);
    }

    private void j(AtomicBoolean atomicBoolean, e0 e0Var) {
        e0Var.k(new b(atomicBoolean));
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC1978n interfaceC1978n, e0 e0Var) {
        com.facebook.imagepipeline.request.b bVarE = e0Var.e();
        boolean zIsCacheEnabled = e0Var.e().isCacheEnabled(16);
        boolean zIsCacheEnabled2 = e0Var.e().isCacheEnabled(32);
        if (!zIsCacheEnabled && !zIsCacheEnabled2) {
            this.f20034e.b(interfaceC1978n, e0Var);
            return;
        }
        g0 g0VarW = e0Var.W();
        g0VarW.e(e0Var, "PartialDiskCacheProducer");
        W1.d dVarB = this.f20031b.b(bVarE, e(bVarE), e0Var.d());
        if (!zIsCacheEnabled) {
            g0VarW.j(e0Var, "PartialDiskCacheProducer", f(g0VarW, e0Var, false, 0));
            i(interfaceC1978n, e0Var, dVarB, null);
        } else {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            ((InterfaceC1517c) this.f20030a.get()).c().m(dVarB, atomicBoolean).e(h(interfaceC1978n, e0Var, dVarB));
            j(atomicBoolean, e0Var);
        }
    }
}
