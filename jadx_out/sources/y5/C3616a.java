package y5;

import y5.d;

/* JADX INFO: renamed from: y5.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3616a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f33954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d.a f33955b = d.a.DEFAULT;

    /* JADX INFO: renamed from: y5.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class C0374a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f33956a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d.a f33957b;

        C0374a(int i10, d.a aVar) {
            this.f33956a = i10;
            this.f33957b = aVar;
        }

        @Override // java.lang.annotation.Annotation
        public Class annotationType() {
            return d.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f33956a == dVar.tag() && this.f33957b.equals(dVar.intEncoding());
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (14552422 ^ this.f33956a) + (this.f33957b.hashCode() ^ 2041407134);
        }

        @Override // y5.d
        public d.a intEncoding() {
            return this.f33957b;
        }

        @Override // y5.d
        public int tag() {
            return this.f33956a;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f33956a + "intEncoding=" + this.f33957b + ')';
        }
    }

    public static C3616a b() {
        return new C3616a();
    }

    public d a() {
        return new C0374a(this.f33954a, this.f33955b);
    }

    public C3616a c(int i10) {
        this.f33954a = i10;
        return this;
    }
}
