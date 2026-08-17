package r0;

import r0.C3242e;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static boolean[] f31812a = new boolean[3];

    static void a(C3243f c3243f, o0.d dVar, C3242e c3242e) {
        c3242e.f31706s = -1;
        c3242e.f31708t = -1;
        C3242e.b bVar = c3243f.f31668Y[0];
        C3242e.b bVar2 = C3242e.b.WRAP_CONTENT;
        if (bVar != bVar2 && c3242e.f31668Y[0] == C3242e.b.MATCH_PARENT) {
            int i10 = c3242e.f31657N.f31621g;
            int iT = c3243f.T() - c3242e.f31659P.f31621g;
            C3241d c3241d = c3242e.f31657N;
            c3241d.f31623i = dVar.q(c3241d);
            C3241d c3241d2 = c3242e.f31659P;
            c3241d2.f31623i = dVar.q(c3241d2);
            dVar.f(c3242e.f31657N.f31623i, i10);
            dVar.f(c3242e.f31659P.f31623i, iT);
            c3242e.f31706s = 2;
            c3242e.I0(i10, iT);
        }
        if (c3243f.f31668Y[1] == bVar2 || c3242e.f31668Y[1] != C3242e.b.MATCH_PARENT) {
            return;
        }
        int i11 = c3242e.f31658O.f31621g;
        int iX = c3243f.x() - c3242e.f31660Q.f31621g;
        C3241d c3241d3 = c3242e.f31658O;
        c3241d3.f31623i = dVar.q(c3241d3);
        C3241d c3241d4 = c3242e.f31660Q;
        c3241d4.f31623i = dVar.q(c3241d4);
        dVar.f(c3242e.f31658O.f31623i, i11);
        dVar.f(c3242e.f31660Q.f31623i, iX);
        if (c3242e.f31691k0 > 0 || c3242e.S() == 8) {
            C3241d c3241d5 = c3242e.f31661R;
            c3241d5.f31623i = dVar.q(c3241d5);
            dVar.f(c3242e.f31661R.f31623i, c3242e.f31691k0 + i11);
        }
        c3242e.f31708t = 2;
        c3242e.Z0(i11, iX);
    }

    public static final boolean b(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}
