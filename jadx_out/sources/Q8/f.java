package q8;

import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k8.b f30869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f30870b;

    public f(k8.b classId, int i10) {
        AbstractC2855l.g(classId, "classId");
        this.f30869a = classId;
        this.f30870b = i10;
    }

    public final k8.b a() {
        return this.f30869a;
    }

    public final int b() {
        return this.f30870b;
    }

    public final int c() {
        return this.f30870b;
    }

    public final k8.b d() {
        return this.f30869a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return AbstractC2855l.b(this.f30869a, fVar.f30869a) && this.f30870b == fVar.f30870b;
    }

    public int hashCode() {
        return (this.f30869a.hashCode() * 31) + Integer.hashCode(this.f30870b);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i10 = this.f30870b;
        for (int i11 = 0; i11 < i10; i11++) {
            sb.append("kotlin/Array<");
        }
        sb.append(this.f30869a);
        int i12 = this.f30870b;
        for (int i13 = 0; i13 < i12; i13++) {
            sb.append(">");
        }
        String string = sb.toString();
        AbstractC2855l.f(string, "toString(...)");
        return string;
    }
}
