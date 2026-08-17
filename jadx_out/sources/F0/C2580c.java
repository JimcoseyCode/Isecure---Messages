package f0;

import F.InterfaceC0515w0;
import F.v1;
import Z.AbstractC1562a;
import c0.AbstractC1834a;
import g0.AbstractC2635a;
import y.AbstractC3583h0;

/* JADX INFO: renamed from: f0.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C2580c implements H0.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v1 f27165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f27166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AbstractC1562a f27167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AbstractC1834a f27168e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC0515w0.a f27169f;

    public C2580c(String str, int i10, v1 v1Var, AbstractC1562a abstractC1562a, AbstractC1834a abstractC1834a, InterfaceC0515w0.a aVar) {
        this.f27164a = str;
        this.f27166c = i10;
        this.f27165b = v1Var;
        this.f27167d = abstractC1562a;
        this.f27168e = abstractC1834a;
        this.f27169f = aVar;
    }

    @Override // H0.i
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC2635a get() {
        AbstractC3583h0.a("AudioEncAdPrflRslvr", "Using resolved AUDIO bitrate from AudioProfile");
        return AbstractC2635a.c().h(this.f27164a).i(this.f27166c).g(this.f27165b).e(this.f27168e.f()).d(this.f27168e.e()).f(this.f27168e.g()).c(AbstractC2579b.h(this.f27169f.b(), this.f27168e.f(), this.f27169f.c(), this.f27168e.g(), this.f27169f.g(), this.f27167d.b())).b();
    }
}
