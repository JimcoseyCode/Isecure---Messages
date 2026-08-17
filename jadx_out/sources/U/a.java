package U;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class a extends h {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f10703n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f10704o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f10705p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f10706q;

    a(int i10, int i11, int i12, String str) {
        this.f10703n = i10;
        this.f10704o = i11;
        this.f10705p = i12;
        if (str == null) {
            throw new NullPointerException("Null description");
        }
        this.f10706q = str;
    }

    @Override // U.h
    String p() {
        return this.f10706q;
    }

    @Override // U.h
    public int q() {
        return this.f10703n;
    }

    @Override // U.h
    int r() {
        return this.f10704o;
    }

    @Override // U.h
    int s() {
        return this.f10705p;
    }
}
