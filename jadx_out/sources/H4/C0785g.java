package H4;

/* JADX INFO: renamed from: H4.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C0785g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f3766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f3767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f3768c;

    C0785g(Object obj, Object obj2, Object obj3) {
        this.f3766a = obj;
        this.f3767b = obj2;
        this.f3768c = obj3;
    }

    final IllegalArgumentException a() {
        Object obj = this.f3768c;
        Object obj2 = this.f3767b;
        Object obj3 = this.f3766a;
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(obj3) + "=" + String.valueOf(obj2) + " and " + String.valueOf(obj3) + "=" + String.valueOf(obj));
    }
}
