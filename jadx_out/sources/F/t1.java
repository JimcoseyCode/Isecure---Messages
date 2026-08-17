package F;

import java.util.Map;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f1691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f1692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f1693c;

    public t1(Map useCaseStreamSpecs, Map attachedSurfaceStreamSpecs, int i10) {
        AbstractC2855l.g(useCaseStreamSpecs, "useCaseStreamSpecs");
        AbstractC2855l.g(attachedSurfaceStreamSpecs, "attachedSurfaceStreamSpecs");
        this.f1691a = useCaseStreamSpecs;
        this.f1692b = attachedSurfaceStreamSpecs;
        this.f1693c = i10;
    }

    public final Map a() {
        return this.f1691a;
    }

    public final Map b() {
        return this.f1692b;
    }

    public final int c() {
        return this.f1693c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj;
        return AbstractC2855l.b(this.f1691a, t1Var.f1691a) && AbstractC2855l.b(this.f1692b, t1Var.f1692b) && this.f1693c == t1Var.f1693c;
    }

    public int hashCode() {
        return (((this.f1691a.hashCode() * 31) + this.f1692b.hashCode()) * 31) + Integer.hashCode(this.f1693c);
    }

    public String toString() {
        return "SurfaceStreamSpecQueryResult(useCaseStreamSpecs=" + this.f1691a + ", attachedSurfaceStreamSpecs=" + this.f1692b + ", maxSupportedFrameRate=" + this.f1693c + ')';
    }
}
