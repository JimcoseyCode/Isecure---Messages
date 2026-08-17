package J7;

import I7.o;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k8.c f6824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f6825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f6826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k8.b f6827d;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f6828e = new a();

        private a() {
            super(o.f5108A, "Function", false, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b extends f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f6829e = new b();

        private b() {
            super(o.f5139x, "KFunction", true, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class c extends f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c f6830e = new c();

        private c() {
            super(o.f5139x, "KSuspendFunction", true, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class d extends f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final d f6831e = new d();

        private d() {
            super(o.f5134s, "SuspendFunction", false, null);
        }
    }

    public f(k8.c packageFqName, String classNamePrefix, boolean z10, k8.b bVar) {
        AbstractC2855l.g(packageFqName, "packageFqName");
        AbstractC2855l.g(classNamePrefix, "classNamePrefix");
        this.f6824a = packageFqName;
        this.f6825b = classNamePrefix;
        this.f6826c = z10;
        this.f6827d = bVar;
    }

    public final String a() {
        return this.f6825b;
    }

    public final k8.c b() {
        return this.f6824a;
    }

    public final k8.f c(int i10) {
        k8.f fVarQ = k8.f.q(this.f6825b + i10);
        AbstractC2855l.f(fVarQ, "identifier(...)");
        return fVarQ;
    }

    public String toString() {
        return this.f6824a + '.' + this.f6825b + 'N';
    }
}
