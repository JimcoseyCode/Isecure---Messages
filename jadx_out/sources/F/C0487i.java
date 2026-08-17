package F;

import F.InterfaceC0490j0;

/* JADX INFO: renamed from: F.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C0487i extends InterfaceC0490j0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f1492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f1493c;

    C0487i(String str, Class cls, Object obj) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.f1491a = str;
        if (cls == null) {
            throw new NullPointerException("Null valueClass");
        }
        this.f1492b = cls;
        this.f1493c = obj;
    }

    @Override // F.InterfaceC0490j0.a
    public String c() {
        return this.f1491a;
    }

    @Override // F.InterfaceC0490j0.a
    public Object d() {
        return this.f1493c;
    }

    @Override // F.InterfaceC0490j0.a
    public Class e() {
        return this.f1492b;
    }

    public boolean equals(Object obj) {
        Object obj2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC0490j0.a) {
            InterfaceC0490j0.a aVar = (InterfaceC0490j0.a) obj;
            if (this.f1491a.equals(aVar.c()) && this.f1492b.equals(aVar.e()) && ((obj2 = this.f1493c) != null ? obj2.equals(aVar.d()) : aVar.d() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.f1491a.hashCode() ^ 1000003) * 1000003) ^ this.f1492b.hashCode()) * 1000003;
        Object obj = this.f1493c;
        return iHashCode ^ (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "Option{id=" + this.f1491a + ", valueClass=" + this.f1492b + ", token=" + this.f1493c + "}";
    }
}
