package U7;

import b8.InterfaceC1823g;
import java.util.Arrays;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: U7.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC1492u {
    b8.u a(k8.c cVar, boolean z10);

    Set b(k8.c cVar);

    InterfaceC1823g c(a aVar);

    /* JADX INFO: renamed from: U7.u$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final k8.b f11527a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f11528b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final InterfaceC1823g f11529c;

        public a(k8.b classId, byte[] bArr, InterfaceC1823g interfaceC1823g) {
            AbstractC2855l.g(classId, "classId");
            this.f11527a = classId;
            this.f11528b = bArr;
            this.f11529c = interfaceC1823g;
        }

        public final k8.b a() {
            return this.f11527a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC2855l.b(this.f11527a, aVar.f11527a) && AbstractC2855l.b(this.f11528b, aVar.f11528b) && AbstractC2855l.b(this.f11529c, aVar.f11529c);
        }

        public int hashCode() {
            int iHashCode = this.f11527a.hashCode() * 31;
            byte[] bArr = this.f11528b;
            int iHashCode2 = (iHashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
            InterfaceC1823g interfaceC1823g = this.f11529c;
            return iHashCode2 + (interfaceC1823g != null ? interfaceC1823g.hashCode() : 0);
        }

        public String toString() {
            return "Request(classId=" + this.f11527a + ", previouslyFoundClassFileContent=" + Arrays.toString(this.f11528b) + ", outerClass=" + this.f11529c + ')';
        }

        public /* synthetic */ a(k8.b bVar, byte[] bArr, InterfaceC1823g interfaceC1823g, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(bVar, (i10 & 2) != 0 ? null : bArr, (i10 & 4) != 0 ? null : interfaceC1823g);
        }
    }
}
