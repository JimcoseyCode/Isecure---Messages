package f0;

import F.v1;
import Z.AbstractC1562a;
import android.util.Range;
import c0.AbstractC1834a;
import g0.AbstractC2635a;
import y.AbstractC3583h0;

/* JADX INFO: renamed from: f0.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C2581d implements H0.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f27171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AbstractC1562a f27172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AbstractC1834a f27173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final v1 f27174e;

    public C2581d(String str, int i10, v1 v1Var, AbstractC1562a abstractC1562a, AbstractC1834a abstractC1834a) {
        this.f27170a = str;
        this.f27171b = i10;
        this.f27174e = v1Var;
        this.f27172c = abstractC1562a;
        this.f27173d = abstractC1834a;
    }

    @Override // H0.i
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC2635a get() {
        Range rangeB = this.f27172c.b();
        AbstractC3583h0.a("AudioEncCfgDefaultRslvr", "Using fallback AUDIO bitrate");
        return AbstractC2635a.c().h(this.f27170a).i(this.f27171b).g(this.f27174e).e(this.f27173d.f()).d(this.f27173d.e()).f(this.f27173d.g()).c(AbstractC2579b.h(156000, this.f27173d.f(), 2, this.f27173d.g(), 48000, rangeB)).b();
    }
}
