package I4;

/* JADX INFO: renamed from: I4.y6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C1077y6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Long f4979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private L6 f4980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Boolean f4981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Boolean f4982d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Boolean f4983e;

    public final C1077y6 a(Boolean bool) {
        this.f4982d = bool;
        return this;
    }

    public final C1077y6 b(Boolean bool) {
        this.f4983e = bool;
        return this;
    }

    public final C1077y6 c(Long l10) {
        this.f4979a = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final C1077y6 d(L6 l62) {
        this.f4980b = l62;
        return this;
    }

    public final C1077y6 e(Boolean bool) {
        this.f4981c = bool;
        return this;
    }

    public final A6 f() {
        return new A6(this, null);
    }
}
