package f0;

import Z.AbstractC1562a;
import android.util.Range;
import android.util.Rational;
import c0.AbstractC1834a;
import y.AbstractC3583h0;

/* JADX INFO: renamed from: f0.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C2584g implements H0.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC1562a f27178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rational f27179b;

    public C2584g(AbstractC1562a abstractC1562a, Rational rational) {
        this.f27178a = abstractC1562a;
        this.f27179b = rational;
    }

    @Override // H0.i
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC1834a get() {
        int iE = AbstractC2579b.e(this.f27178a);
        int iF = AbstractC2579b.f(this.f27178a);
        int iC = this.f27178a.c();
        if (iC == -1) {
            AbstractC3583h0.a("DefAudioResolver", "Using fallback AUDIO channel count: 1");
            iC = 1;
        } else {
            AbstractC3583h0.a("DefAudioResolver", "Using supplied AUDIO channel count: " + iC);
        }
        Range rangeD = this.f27178a.d();
        C2587j c2587jG = AbstractC2579b.g(rangeD, AbstractC1562a.f13325b.equals(rangeD) ? 44100 : ((Integer) rangeD.getUpper()).intValue(), iC, iE, this.f27179b);
        AbstractC3583h0.a("DefAudioResolver", "Using AUDIO sample rate resolved from AudioSpec: Capture sample rate: " + c2587jG.a() + "Hz. Encode sample rate: " + c2587jG.b() + "Hz.");
        return AbstractC1834a.a().d(iE).c(iF).f(iC).e(c2587jG.a()).g(c2587jG.b()).b();
    }
}
