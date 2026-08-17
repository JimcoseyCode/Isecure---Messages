package Q1;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Class f9037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Class f9038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Class f9039c;

    public j() {
    }

    public void a(Class cls, Class cls2, Class cls3) {
        this.f9037a = cls;
        this.f9038b = cls2;
        this.f9039c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return this.f9037a.equals(jVar.f9037a) && this.f9038b.equals(jVar.f9038b) && l.e(this.f9039c, jVar.f9039c);
    }

    public int hashCode() {
        int iHashCode = ((this.f9037a.hashCode() * 31) + this.f9038b.hashCode()) * 31;
        Class cls = this.f9039c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f9037a + ", second=" + this.f9038b + '}';
    }

    public j(Class cls, Class cls2, Class cls3) {
        a(cls, cls2, cls3);
    }
}
