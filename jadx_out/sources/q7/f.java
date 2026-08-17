package Q7;

import P8.q;
import R7.AbstractC1394f;
import d8.InterfaceC2376x;
import e8.C2431a;
import e8.C2432b;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class f implements InterfaceC2376x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f9866c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f9867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2431a f9868b;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a(Class klass) {
            AbstractC2855l.g(klass, "klass");
            C2432b c2432b = new C2432b();
            c.f9864a.b(klass, c2432b);
            C2431a c2431aN = c2432b.n();
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (c2431aN == null) {
                return null;
            }
            return new f(klass, c2431aN, defaultConstructorMarker);
        }

        private a() {
        }
    }

    public /* synthetic */ f(Class cls, C2431a c2431a, DefaultConstructorMarker defaultConstructorMarker) {
        this(cls, c2431a);
    }

    @Override // d8.InterfaceC2376x
    public C2431a a() {
        return this.f9868b;
    }

    @Override // d8.InterfaceC2376x
    public void b(InterfaceC2376x.d visitor, byte[] bArr) {
        AbstractC2855l.g(visitor, "visitor");
        c.f9864a.i(this.f9867a, visitor);
    }

    @Override // d8.InterfaceC2376x
    public k8.b c() {
        return AbstractC1394f.e(this.f9867a);
    }

    @Override // d8.InterfaceC2376x
    public void d(InterfaceC2376x.c visitor, byte[] bArr) {
        AbstractC2855l.g(visitor, "visitor");
        c.f9864a.b(this.f9867a, visitor);
    }

    public final Class e() {
        return this.f9867a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof f) && AbstractC2855l.b(this.f9867a, ((f) obj).f9867a);
    }

    @Override // d8.InterfaceC2376x
    public String h() {
        StringBuilder sb = new StringBuilder();
        String name = this.f9867a.getName();
        AbstractC2855l.f(name, "getName(...)");
        sb.append(q.D(name, '.', '/', false, 4, null));
        sb.append(".class");
        return sb.toString();
    }

    public int hashCode() {
        return this.f9867a.hashCode();
    }

    public String toString() {
        return f.class.getName() + ": " + this.f9867a;
    }

    private f(Class cls, C2431a c2431a) {
        this.f9867a = cls;
        this.f9868b = c2431a;
    }
}
