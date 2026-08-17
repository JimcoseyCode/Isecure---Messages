package R3;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class c extends e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final int f9987m = e.a("ANMF");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f9988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f9989e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f9990f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f9991g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f9992h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    byte f9993i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    a f9994j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    i f9995k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    j f9996l;

    @Override // R3.e
    void b(S3.a aVar) throws IOException {
        int iAvailable = aVar.available();
        this.f9988d = aVar.d();
        this.f9989e = aVar.d();
        this.f9990f = aVar.a();
        this.f9991g = aVar.a();
        this.f9992h = aVar.d();
        this.f9993i = aVar.peek();
        long j10 = iAvailable - this.f10005b;
        while (aVar.available() > j10) {
            e eVarC = m.c(aVar);
            if (eVarC instanceof a) {
                this.f9994j = (a) eVarC;
            } else if (eVarC instanceof i) {
                this.f9995k = (i) eVarC;
            } else if (eVarC instanceof j) {
                this.f9996l = (j) eVarC;
            }
        }
    }

    boolean d() {
        return (this.f9993i & 2) == 2;
    }

    boolean e() {
        return (this.f9993i & 1) == 1;
    }
}
