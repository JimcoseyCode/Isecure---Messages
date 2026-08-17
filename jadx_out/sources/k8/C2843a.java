package k8;

import P8.q;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: k8.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2843a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0308a f29192f = new C0308a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final f f29193g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final c f29194h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f29195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f29196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f29197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f29198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c f29199e;

    /* JADX INFO: renamed from: k8.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class C0308a {
        public /* synthetic */ C0308a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0308a() {
        }
    }

    static {
        f fVar = h.f29232m;
        f29193g = fVar;
        c cVarK = c.k(fVar);
        AbstractC2855l.f(cVarK, "topLevel(...)");
        f29194h = cVarK;
    }

    private C2843a(c cVar, c cVar2, f fVar, b bVar, c cVar3) {
        this.f29195a = cVar;
        this.f29196b = cVar2;
        this.f29197c = fVar;
        this.f29198d = bVar;
        this.f29199e = cVar3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2843a)) {
            return false;
        }
        C2843a c2843a = (C2843a) obj;
        return AbstractC2855l.b(this.f29195a, c2843a.f29195a) && AbstractC2855l.b(this.f29196b, c2843a.f29196b) && AbstractC2855l.b(this.f29197c, c2843a.f29197c);
    }

    public int hashCode() {
        int iHashCode = (527 + this.f29195a.hashCode()) * 31;
        c cVar = this.f29196b;
        return ((iHashCode + (cVar != null ? cVar.hashCode() : 0)) * 31) + this.f29197c.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String strB = this.f29195a.b();
        AbstractC2855l.f(strB, "asString(...)");
        sb.append(q.D(strB, '.', '/', false, 4, null));
        sb.append("/");
        c cVar = this.f29196b;
        if (cVar != null) {
            sb.append(cVar);
            sb.append(".");
        }
        sb.append(this.f29197c);
        String string = sb.toString();
        AbstractC2855l.f(string, "toString(...)");
        return string;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2843a(c packageName, f callableName) {
        this(packageName, null, callableName, null, null);
        AbstractC2855l.g(packageName, "packageName");
        AbstractC2855l.g(callableName, "callableName");
    }
}
