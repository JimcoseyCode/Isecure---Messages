package N0;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n7.j;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class J implements j.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f7722i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f7723j = "Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final J f7724g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C1311k f7725h;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: N0.J$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class C0072a implements j.c {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final C0072a f7726g = new C0072a();

            private C0072a() {
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public J(J j10, C1311k instance) {
        AbstractC2855l.g(instance, "instance");
        this.f7724g = j10;
        this.f7725h = instance;
    }

    @Override // n7.j
    public n7.j X(n7.j jVar) {
        return j.b.a.d(this, jVar);
    }

    public final void a(InterfaceC1309i candidate) {
        AbstractC2855l.g(candidate, "candidate");
        if (this.f7725h == candidate) {
            throw new IllegalStateException(f7723j.toString());
        }
        J j10 = this.f7724g;
        if (j10 != null) {
            j10.a(candidate);
        }
    }

    @Override // n7.j.b, n7.j
    public j.b e(j.c cVar) {
        return j.b.a.b(this, cVar);
    }

    @Override // n7.j.b
    public j.c getKey() {
        return a.C0072a.f7726g;
    }

    @Override // n7.j
    public Object u0(Object obj, Function2 function2) {
        return j.b.a.a(this, obj, function2);
    }

    @Override // n7.j
    public n7.j y0(j.c cVar) {
        return j.b.a.c(this, cVar);
    }
}
