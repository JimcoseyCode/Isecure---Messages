package D8;

import C8.C0412g;
import C8.M0;
import C8.S;
import C8.u0;
import D8.f;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o8.C3033o;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class q implements p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f f843d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C3033o f844e;

    public q(g kotlinTypeRefiner, f kotlinTypePreparator) {
        AbstractC2855l.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        AbstractC2855l.g(kotlinTypePreparator, "kotlinTypePreparator");
        this.f842c = kotlinTypeRefiner;
        this.f843d = kotlinTypePreparator;
        C3033o c3033oM = C3033o.m(d());
        AbstractC2855l.f(c3033oM, "createWithTypeRefiner(...)");
        this.f844e = c3033oM;
    }

    @Override // D8.p
    public C3033o a() {
        return this.f844e;
    }

    @Override // D8.e
    public boolean b(S subtype, S supertype) {
        AbstractC2855l.g(subtype, "subtype");
        AbstractC2855l.g(supertype, "supertype");
        return g(AbstractC0440a.b(true, false, null, f(), d(), 6, null), subtype.N0(), supertype.N0());
    }

    @Override // D8.e
    public boolean c(S a10, S b10) {
        AbstractC2855l.g(a10, "a");
        AbstractC2855l.g(b10, "b");
        return e(AbstractC0440a.b(false, false, null, f(), d(), 6, null), a10.N0(), b10.N0());
    }

    @Override // D8.p
    public g d() {
        return this.f842c;
    }

    public final boolean e(u0 u0Var, M0 a10, M0 b10) {
        AbstractC2855l.g(u0Var, "<this>");
        AbstractC2855l.g(a10, "a");
        AbstractC2855l.g(b10, "b");
        return C0412g.f645a.m(u0Var, a10, b10);
    }

    public f f() {
        return this.f843d;
    }

    public final boolean g(u0 u0Var, M0 subType, M0 superType) {
        AbstractC2855l.g(u0Var, "<this>");
        AbstractC2855l.g(subType, "subType");
        AbstractC2855l.g(superType, "superType");
        return C0412g.v(C0412g.f645a, u0Var, subType, superType, false, 8, null);
    }

    public /* synthetic */ q(g gVar, f fVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(gVar, (i10 & 2) != 0 ? f.a.f820a : fVar);
    }
}
