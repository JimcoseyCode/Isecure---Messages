package f0;

import F.v1;
import Z.z0;
import android.util.Range;
import android.util.Size;
import g0.q0;
import h0.AbstractC2688b;
import y.AbstractC3583h0;
import y.C3563H;

/* JADX INFO: renamed from: f0.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C2591n implements H0.i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Size f27195g = new Size(1280, 720);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v1 f27197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z0 f27198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Size f27199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C3563H f27200e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Range f27201f;

    public C2591n(String str, v1 v1Var, z0 z0Var, Size size, C3563H c3563h, Range range) {
        this.f27196a = str;
        this.f27197b = v1Var;
        this.f27198c = z0Var;
        this.f27199d = size;
        this.f27200e = c3563h;
        this.f27201f = range;
    }

    @Override // H0.i
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public q0 get() {
        C2587j c2587jC = AbstractC2590m.c(this.f27198c, this.f27201f);
        AbstractC3583h0.a("VidEncCfgDefaultRslvr", "Resolved VIDEO frame rates: Capture frame rate = " + c2587jC.a() + "fps. Encode frame rate = " + c2587jC.b() + "fps.");
        Range rangeC = this.f27198c.c();
        AbstractC3583h0.a("VidEncCfgDefaultRslvr", "Using fallback VIDEO bitrate");
        int iA = this.f27200e.a();
        int iB = c2587jC.b();
        int width = this.f27199d.getWidth();
        Size size = f27195g;
        int iF = AbstractC2590m.f(14000000, iA, 8, iB, 30, width, size.getWidth(), this.f27199d.getHeight(), size.getHeight(), rangeC);
        int iA2 = AbstractC2688b.a(this.f27196a, this.f27200e);
        return q0.c().i(this.f27196a).h(this.f27197b).k(this.f27199d).b(iF).c(c2587jC.a()).f(c2587jC.b()).j(iA2).e(AbstractC2590m.b(this.f27196a, iA2)).a();
    }
}
