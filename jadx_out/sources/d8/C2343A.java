package d8;

import h8.InterfaceC2710c;
import i7.C2750m;
import i8.AbstractC2757a;
import j8.AbstractC2809d;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: d8.A, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2343A {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f25678b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f25679a;

    /* JADX INFO: renamed from: d8.A$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C2343A a(String name, String desc) {
            AbstractC2855l.g(name, "name");
            AbstractC2855l.g(desc, "desc");
            return new C2343A(name + '#' + desc, null);
        }

        public final C2343A b(AbstractC2809d signature) {
            AbstractC2855l.g(signature, "signature");
            if (signature instanceof AbstractC2809d.b) {
                AbstractC2809d.b bVar = (AbstractC2809d.b) signature;
                return d(bVar.e(), bVar.d());
            }
            if (!(signature instanceof AbstractC2809d.a)) {
                throw new C2750m();
            }
            AbstractC2809d.a aVar = (AbstractC2809d.a) signature;
            return a(aVar.e(), aVar.d());
        }

        public final C2343A c(InterfaceC2710c nameResolver, AbstractC2757a.c signature) {
            AbstractC2855l.g(nameResolver, "nameResolver");
            AbstractC2855l.g(signature, "signature");
            return d(nameResolver.getString(signature.w()), nameResolver.getString(signature.v()));
        }

        public final C2343A d(String name, String desc) {
            AbstractC2855l.g(name, "name");
            AbstractC2855l.g(desc, "desc");
            return new C2343A(name + desc, null);
        }

        public final C2343A e(C2343A signature, int i10) {
            AbstractC2855l.g(signature, "signature");
            return new C2343A(signature.a() + '@' + i10, null);
        }

        private a() {
        }
    }

    public /* synthetic */ C2343A(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String a() {
        return this.f25679a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2343A) && AbstractC2855l.b(this.f25679a, ((C2343A) obj).f25679a);
    }

    public int hashCode() {
        return this.f25679a.hashCode();
    }

    public String toString() {
        return "MemberSignature(signature=" + this.f25679a + ')';
    }

    private C2343A(String str) {
        this.f25679a = str;
    }
}
