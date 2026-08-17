package q5;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f30756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f30757b;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private @interface a {
    }

    public D(Class cls, Class cls2) {
        this.f30756a = cls;
        this.f30757b = cls2;
    }

    public static D a(Class cls, Class cls2) {
        return new D(cls, cls2);
    }

    public static D b(Class cls) {
        return new D(a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || D.class != obj.getClass()) {
            return false;
        }
        D d10 = (D) obj;
        if (this.f30757b.equals(d10.f30757b)) {
            return this.f30756a.equals(d10.f30756a);
        }
        return false;
    }

    public int hashCode() {
        return (this.f30757b.hashCode() * 31) + this.f30756a.hashCode();
    }

    public String toString() {
        if (this.f30756a == a.class) {
            return this.f30757b.getName();
        }
        return "@" + this.f30756a.getName() + " " + this.f30757b.getName();
    }
}
