package p3;

/* JADX INFO: renamed from: p3.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C3050a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3050a f30621a = new C3050a();

    private C3050a() {
    }

    public static final int a(int i10, Object obj) {
        return (i10 * 31) + (obj != null ? obj.hashCode() : 0);
    }
}
