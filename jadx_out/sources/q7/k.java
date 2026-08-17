package Q7;

import L7.H;
import d8.C2363k;
import i7.C2735B;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import y8.C3652n;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f9873c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3652n f9874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Q7.a f9875b;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k a(ClassLoader classLoader) {
            AbstractC2855l.g(classLoader, "classLoader");
            g gVar = new g(classLoader);
            C2363k.a aVar = C2363k.f25755b;
            ClassLoader classLoader2 = C2735B.class.getClassLoader();
            AbstractC2855l.f(classLoader2, "getClassLoader(...)");
            C2363k.a.C0251a c0251aA = aVar.a(gVar, new g(classLoader2), new d(classLoader), "runtime module for " + classLoader, j.f9872b, l.f9876a);
            return new k(c0251aA.a().a(), new Q7.a(c0251aA.b(), gVar), null);
        }

        private a() {
        }
    }

    public /* synthetic */ k(C3652n c3652n, Q7.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(c3652n, aVar);
    }

    public final C3652n a() {
        return this.f9874a;
    }

    public final H b() {
        return this.f9874a.q();
    }

    public final Q7.a c() {
        return this.f9875b;
    }

    private k(C3652n c3652n, Q7.a aVar) {
        this.f9874a = c3652n;
        this.f9875b = aVar;
    }
}
