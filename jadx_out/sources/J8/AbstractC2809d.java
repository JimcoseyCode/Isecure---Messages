package j8;

import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: j8.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2809d {

    /* JADX INFO: renamed from: j8.d$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends AbstractC2809d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f28938a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f28939b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String name, String desc) {
            super(null);
            AbstractC2855l.g(name, "name");
            AbstractC2855l.g(desc, "desc");
            this.f28938a = name;
            this.f28939b = desc;
        }

        @Override // j8.AbstractC2809d
        public String a() {
            return e() + ':' + d();
        }

        public final String b() {
            return this.f28938a;
        }

        public final String c() {
            return this.f28939b;
        }

        public String d() {
            return this.f28939b;
        }

        public String e() {
            return this.f28938a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC2855l.b(this.f28938a, aVar.f28938a) && AbstractC2855l.b(this.f28939b, aVar.f28939b);
        }

        public int hashCode() {
            return (this.f28938a.hashCode() * 31) + this.f28939b.hashCode();
        }
    }

    /* JADX INFO: renamed from: j8.d$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b extends AbstractC2809d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f28940a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f28941b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String name, String desc) {
            super(null);
            AbstractC2855l.g(name, "name");
            AbstractC2855l.g(desc, "desc");
            this.f28940a = name;
            this.f28941b = desc;
        }

        public static /* synthetic */ b c(b bVar, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = bVar.f28940a;
            }
            if ((i10 & 2) != 0) {
                str2 = bVar.f28941b;
            }
            return bVar.b(str, str2);
        }

        @Override // j8.AbstractC2809d
        public String a() {
            return e() + d();
        }

        public final b b(String name, String desc) {
            AbstractC2855l.g(name, "name");
            AbstractC2855l.g(desc, "desc");
            return new b(name, desc);
        }

        public String d() {
            return this.f28941b;
        }

        public String e() {
            return this.f28940a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC2855l.b(this.f28940a, bVar.f28940a) && AbstractC2855l.b(this.f28941b, bVar.f28941b);
        }

        public int hashCode() {
            return (this.f28940a.hashCode() * 31) + this.f28941b.hashCode();
        }
    }

    public /* synthetic */ AbstractC2809d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String a();

    public final String toString() {
        return a();
    }

    private AbstractC2809d() {
    }
}
