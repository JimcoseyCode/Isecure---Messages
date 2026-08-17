package f0;

import F.InterfaceC0515w0;
import F.v1;
import Z.z0;
import android.util.Range;
import android.util.Size;
import g0.q0;
import y.AbstractC3583h0;
import y.C3563H;

/* JADX INFO: renamed from: f0.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C2592o implements H0.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v1 f27203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z0 f27204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Size f27205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC0515w0.c f27206e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C3563H f27207f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Range f27208g;

    public C2592o(String str, v1 v1Var, z0 z0Var, Size size, InterfaceC0515w0.c cVar, C3563H c3563h, Range range) {
        this.f27202a = str;
        this.f27203b = v1Var;
        this.f27204c = z0Var;
        this.f27205d = size;
        this.f27206e = cVar;
        this.f27207f = c3563h;
        this.f27208g = range;
    }

    @Override // H0.i
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public q0 get() {
        C2587j c2587jC = AbstractC2590m.c(this.f27204c, this.f27208g);
        AbstractC3583h0.a("VidEncVdPrflRslvr", "Resolved VIDEO frame rates: Capture frame rate = " + c2587jC.a() + "fps. Encode frame rate = " + c2587jC.b() + "fps.");
        Range rangeC = this.f27204c.c();
        AbstractC3583h0.a("VidEncVdPrflRslvr", "Using resolved VIDEO bitrate from EncoderProfiles");
        int iF = AbstractC2590m.f(this.f27206e.c(), this.f27207f.a(), this.f27206e.b(), c2587jC.b(), this.f27206e.f(), this.f27205d.getWidth(), this.f27206e.l(), this.f27205d.getHeight(), this.f27206e.h(), rangeC);
        int iJ = this.f27206e.j();
        return q0.c().i(this.f27202a).h(this.f27203b).k(this.f27205d).b(iF).c(c2587jC.a()).f(c2587jC.b()).j(iJ).e(AbstractC2590m.b(this.f27202a, iJ)).a();
    }
}
