package F3;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class j extends e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final int f1867h = e.a("IHDR");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f1868e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f1869f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    byte[] f1870g = new byte[5];

    j() {
    }

    @Override // F3.e
    void b(G3.a aVar) throws IOException {
        this.f1868e = aVar.c();
        this.f1869f = aVar.c();
        byte[] bArr = this.f1870g;
        aVar.read(bArr, 0, bArr.length);
    }
}
