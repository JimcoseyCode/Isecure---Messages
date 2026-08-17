package f0;

import F.InterfaceC0515w0;
import Z.AbstractC1562a;
import android.util.Range;
import android.util.Rational;
import c0.AbstractC1834a;
import y.AbstractC3583h0;

/* JADX INFO: renamed from: f0.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C2583f implements H0.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC1562a f27175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0515w0.a f27176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Rational f27177c;

    public C2583f(AbstractC1562a abstractC1562a, InterfaceC0515w0.a aVar, Rational rational) {
        this.f27175a = abstractC1562a;
        this.f27176b = aVar;
        this.f27177c = rational;
    }

    @Override // H0.i
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC1834a get() {
        int iE = AbstractC2579b.e(this.f27175a);
        int iF = AbstractC2579b.f(this.f27175a);
        int iC = this.f27175a.c();
        int iC2 = this.f27176b.c();
        if (iC == -1) {
            AbstractC3583h0.a("AudioSrcAdPrflRslvr", "Resolved AUDIO channel count from AudioProfile: " + iC2);
            iC = iC2;
        } else {
            AbstractC3583h0.a("AudioSrcAdPrflRslvr", "Media spec AUDIO channel count overrides AudioProfile [AudioProfile channel count: " + iC2 + ", Resolved Channel Count: " + iC + "]");
        }
        Range rangeD = this.f27175a.d();
        int iG = this.f27176b.g();
        C2587j c2587jG = AbstractC2579b.g(rangeD, iG, iC, iF, this.f27177c);
        AbstractC3583h0.a("AudioSrcAdPrflRslvr", "Using resolved AUDIO sample rate or nearest supported from AudioProfile: Capture sample rate: " + c2587jG.a() + "Hz. Encode sample rate: " + c2587jG.b() + "Hz. [AudioProfile sample rate: " + iG + "Hz]");
        return AbstractC1834a.a().d(iE).c(iF).f(iC).e(c2587jG.a()).g(c2587jG.b()).b();
    }
}
