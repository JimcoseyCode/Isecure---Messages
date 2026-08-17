package y8;

import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: y8.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3662y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f34151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f34152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f34153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f34154d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f34155e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final k8.b f34156f;

    public C3662y(Object obj, Object obj2, Object obj3, Object obj4, String filePath, k8.b classId) {
        AbstractC2855l.g(filePath, "filePath");
        AbstractC2855l.g(classId, "classId");
        this.f34151a = obj;
        this.f34152b = obj2;
        this.f34153c = obj3;
        this.f34154d = obj4;
        this.f34155e = filePath;
        this.f34156f = classId;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3662y)) {
            return false;
        }
        C3662y c3662y = (C3662y) obj;
        return AbstractC2855l.b(this.f34151a, c3662y.f34151a) && AbstractC2855l.b(this.f34152b, c3662y.f34152b) && AbstractC2855l.b(this.f34153c, c3662y.f34153c) && AbstractC2855l.b(this.f34154d, c3662y.f34154d) && AbstractC2855l.b(this.f34155e, c3662y.f34155e) && AbstractC2855l.b(this.f34156f, c3662y.f34156f);
    }

    public int hashCode() {
        Object obj = this.f34151a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f34152b;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f34153c;
        int iHashCode3 = (iHashCode2 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Object obj4 = this.f34154d;
        return ((((iHashCode3 + (obj4 != null ? obj4.hashCode() : 0)) * 31) + this.f34155e.hashCode()) * 31) + this.f34156f.hashCode();
    }

    public String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.f34151a + ", compilerVersion=" + this.f34152b + ", languageVersion=" + this.f34153c + ", expectedVersion=" + this.f34154d + ", filePath=" + this.f34155e + ", classId=" + this.f34156f + ')';
    }
}
