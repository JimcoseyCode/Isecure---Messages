package q5;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D f30813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f30814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f30815c;

    private q(Class cls, int i10, int i11) {
        this(D.b(cls), i10, i11);
    }

    private static String a(int i10) {
        if (i10 == 0) {
            return "direct";
        }
        if (i10 == 1) {
            return "provider";
        }
        if (i10 == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i10);
    }

    public static q g(Class cls) {
        return new q(cls, 0, 0);
    }

    public static q h(Class cls) {
        return new q(cls, 0, 1);
    }

    public static q i(D d10) {
        return new q(d10, 0, 1);
    }

    public static q j(Class cls) {
        return new q(cls, 1, 0);
    }

    public static q k(D d10) {
        return new q(d10, 1, 0);
    }

    public static q l(Class cls) {
        return new q(cls, 1, 1);
    }

    public static q m(Class cls) {
        return new q(cls, 2, 0);
    }

    public D b() {
        return this.f30813a;
    }

    public boolean c() {
        return this.f30815c == 2;
    }

    public boolean d() {
        return this.f30815c == 0;
    }

    public boolean e() {
        return this.f30814b == 1;
    }

    public boolean equals(Object obj) {
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.f30813a.equals(qVar.f30813a) && this.f30814b == qVar.f30814b && this.f30815c == qVar.f30815c) {
                return true;
            }
        }
        return false;
    }

    public boolean f() {
        return this.f30814b == 2;
    }

    public int hashCode() {
        return ((((this.f30813a.hashCode() ^ 1000003) * 1000003) ^ this.f30814b) * 1000003) ^ this.f30815c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f30813a);
        sb.append(", type=");
        int i10 = this.f30814b;
        sb.append(i10 == 1 ? "required" : i10 == 0 ? "optional" : "set");
        sb.append(", injection=");
        sb.append(a(this.f30815c));
        sb.append("}");
        return sb.toString();
    }

    private q(D d10, int i10, int i11) {
        this.f30813a = (D) AbstractC3116C.c(d10, "Null dependency anInterface.");
        this.f30814b = i10;
        this.f30815c = i11;
    }
}
