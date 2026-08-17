package I4;

/* JADX INFO: renamed from: I4.l6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C0935l6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Long f4807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Long f4808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Long f4809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Long f4810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Long f4811e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Long f4812f;

    public final C0935l6 a(Long l10) {
        this.f4809c = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final C0935l6 b(Long l10) {
        this.f4810d = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final C0935l6 c(Long l10) {
        this.f4807a = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final C0935l6 d(Long l10) {
        this.f4811e = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final C0935l6 e(Long l10) {
        this.f4808b = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final C0935l6 f(Long l10) {
        this.f4812f = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final C0957n6 g() {
        return new C0957n6(this, null);
    }
}
