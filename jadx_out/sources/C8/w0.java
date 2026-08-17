package C8;

import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class w0 extends E0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f710c = new a(null);

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: C8.w0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class C0026a extends w0 {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Map f711d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ boolean f712e;

            C0026a(Map map, boolean z10) {
                this.f711d = map;
                this.f712e = z10;
            }

            @Override // C8.E0
            public boolean a() {
                return this.f712e;
            }

            @Override // C8.E0
            public boolean f() {
                return this.f711d.isEmpty();
            }

            @Override // C8.w0
            public B0 k(v0 key) {
                AbstractC2855l.g(key, "key");
                return (B0) this.f711d.get(key);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ w0 e(a aVar, Map map, boolean z10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.d(map, z10);
        }

        public final E0 a(S kotlinType) {
            AbstractC2855l.g(kotlinType, "kotlinType");
            return b(kotlinType.K0(), kotlinType.I0());
        }

        public final E0 b(v0 typeConstructor, List arguments) {
            AbstractC2855l.g(typeConstructor, "typeConstructor");
            AbstractC2855l.g(arguments, "arguments");
            List parameters = typeConstructor.getParameters();
            AbstractC2855l.f(parameters, "getParameters(...)");
            L7.m0 m0Var = (L7.m0) AbstractC2800q.s0(parameters);
            if (m0Var == null || !m0Var.j0()) {
                return new M(parameters, arguments);
            }
            List parameters2 = typeConstructor.getParameters();
            AbstractC2855l.f(parameters2, "getParameters(...)");
            ArrayList arrayList = new ArrayList(AbstractC2800q.u(parameters2, 10));
            Iterator it = parameters2.iterator();
            while (it.hasNext()) {
                arrayList.add(((L7.m0) it.next()).j());
            }
            return e(this, j7.K.r(AbstractC2800q.X0(arrayList, arguments)), false, 2, null);
        }

        public final w0 c(Map map) {
            AbstractC2855l.g(map, "map");
            return e(this, map, false, 2, null);
        }

        public final w0 d(Map map, boolean z10) {
            AbstractC2855l.g(map, "map");
            return new C0026a(map, z10);
        }

        private a() {
        }
    }

    public static final E0 i(v0 v0Var, List list) {
        return f710c.b(v0Var, list);
    }

    public static final w0 j(Map map) {
        return f710c.c(map);
    }

    @Override // C8.E0
    public B0 e(S key) {
        AbstractC2855l.g(key, "key");
        return k(key.K0());
    }

    public abstract B0 k(v0 v0Var);
}
