package y;

import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: y.g0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C3581g0 extends v0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f33790j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3581g0(List useCases, L0 l02, List effects) {
        super(useCases, l02, effects, null, null, null, 56, null);
        AbstractC2855l.g(useCases, "useCases");
        AbstractC2855l.g(effects, "effects");
        this.f33790j = true;
    }

    @Override // y.v0
    public boolean m() {
        return this.f33790j;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C3581g0(K0 useCaseGroup) {
        AbstractC2855l.g(useCaseGroup, "useCaseGroup");
        List listB = useCaseGroup.b();
        AbstractC2855l.f(listB, "getUseCases(...)");
        L0 l0C = useCaseGroup.c();
        List listA = useCaseGroup.a();
        AbstractC2855l.f(listA, "getEffects(...)");
        this(listB, l0C, listA);
    }
}
