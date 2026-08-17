package com.facebook.imagepipeline.producers;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v0 f20215a = new v0();

    private v0() {
    }

    public static final int a(int i10) {
        return (int) (i10 * 1.3333334f);
    }

    public static final boolean b(int i10, int i11, X2.g gVar) {
        return gVar == null ? ((float) a(i10)) >= 2048.0f && a(i11) >= 2048 : a(i10) >= gVar.f12445a && a(i11) >= gVar.f12446b;
    }

    public static final boolean c(d3.k kVar, X2.g gVar) {
        if (kVar == null) {
            return false;
        }
        int iF = kVar.F();
        return (iF == 90 || iF == 270) ? b(kVar.getHeight(), kVar.getWidth(), gVar) : b(kVar.getWidth(), kVar.getHeight(), gVar);
    }
}
