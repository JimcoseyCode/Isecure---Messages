package k3;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class h implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f29124a;

    public h(int i10) {
        this.f29124a = i10;
    }

    @Override // k3.d
    public c createImageTranscoder(Q2.c cVar, boolean z10) {
        return new g(z10, this.f29124a);
    }
}
