package Q6;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class d implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f9855a = 3;

    private final boolean b(int i10) {
        return i10 % 10 == 1;
    }

    private final void c() {
        int i10 = this.f9855a + 2;
        this.f9855a = i10;
        if (b(i10)) {
            this.f9855a += 2;
        }
    }

    @Override // Q6.h
    public int a() {
        int i10 = this.f9855a;
        c();
        return i10;
    }
}
