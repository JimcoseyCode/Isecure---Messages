package F;

import F.n1;

/* JADX INFO: renamed from: F.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C0499o extends n1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Throwable f1586a;

    C0499o(Throwable th) {
        if (th == null) {
            throw new NullPointerException("Null error");
        }
        this.f1586a = th;
    }

    @Override // F.n1.a
    public Throwable a() {
        return this.f1586a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n1.a) {
            return this.f1586a.equals(((n1.a) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.f1586a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ErrorWrapper{error=" + this.f1586a + "}";
    }
}
