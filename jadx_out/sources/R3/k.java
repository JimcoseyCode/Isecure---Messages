package R3;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class k extends e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final int f10011g = e.a("VP8X");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    byte f10012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10013e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10014f;

    @Override // R3.e
    void b(S3.a aVar) throws IOException {
        this.f10012d = aVar.peek();
        aVar.skip(3L);
        this.f10013e = aVar.a();
        this.f10014f = aVar.a();
    }

    boolean d() {
        return (this.f10012d & 16) == 16;
    }

    boolean e() {
        return (this.f10012d & 2) == 2;
    }
}
