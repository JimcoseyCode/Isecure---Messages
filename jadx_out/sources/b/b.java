package B;

import D.b;
import F.L;
import i7.C2750m;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import y.AbstractC3583h0;
import y.v0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f231b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f232a;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ b c(a aVar, v0 v0Var, L l10, D.c cVar, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                cVar = new D.a(l10);
            }
            return aVar.b(v0Var, l10, cVar);
        }

        public final b a(v0 v0Var, L cameraInfoInternal) {
            AbstractC2855l.g(v0Var, "<this>");
            AbstractC2855l.g(cameraInfoInternal, "cameraInfoInternal");
            return c(this, v0Var, cameraInfoInternal, null, 2, null);
        }

        public final b b(v0 v0Var, L cameraInfoInternal, D.c resolver) {
            AbstractC2855l.g(v0Var, "<this>");
            AbstractC2855l.g(cameraInfoInternal, "cameraInfoInternal");
            AbstractC2855l.g(resolver, "resolver");
            AbstractC3583h0.a("ResolvedFeatureGroup", "resolveFeatureGroup: sessionConfig = " + v0Var + ", lensFacing = " + cameraInfoInternal.k());
            if (v0Var.h().isEmpty() && v0Var.g().isEmpty()) {
                return null;
            }
            D.b bVarA = resolver.a(v0Var);
            if (bVarA instanceof b.a) {
                b bVarA2 = ((b.a) bVarA).a();
                AbstractC3583h0.a("ResolvedFeatureGroup", "resolvedFeatureGroup = " + bVarA2);
                return bVarA2;
            }
            if (bVarA instanceof b.C0028b) {
                throw new IllegalArgumentException("Feature group is not supported");
            }
            if (bVarA instanceof b.c) {
                throw new IllegalArgumentException(((b.c) bVarA).a() + " is not supported");
            }
            if (!(bVarA instanceof b.d)) {
                throw new C2750m();
            }
            StringBuilder sb = new StringBuilder();
            b.d dVar = (b.d) bVarA;
            sb.append(dVar.b());
            sb.append(" must be added for ");
            sb.append(dVar.a());
            throw new IllegalArgumentException(sb.toString());
        }

        private a() {
        }
    }

    public b(Set features) {
        AbstractC2855l.g(features, "features");
        this.f232a = features;
    }

    public static final b b(v0 v0Var, L l10) {
        return f231b.a(v0Var, l10);
    }

    public final Set a() {
        return this.f232a;
    }

    public String toString() {
        return "ResolvedFeatureGroup(features=" + this.f232a + ')';
    }
}
