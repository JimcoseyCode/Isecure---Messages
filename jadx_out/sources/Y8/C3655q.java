package y8;

import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: y8.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3655q implements InterfaceC3648j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final L7.O f34138a;

    public C3655q(L7.O packageFragmentProvider) {
        AbstractC2855l.g(packageFragmentProvider, "packageFragmentProvider");
        this.f34138a = packageFragmentProvider;
    }

    @Override // y8.InterfaceC3648j
    public C3647i a(k8.b classId) {
        C3647i c3647iA;
        AbstractC2855l.g(classId, "classId");
        for (L7.N n10 : L7.T.c(this.f34138a, classId.f())) {
            if ((n10 instanceof r) && (c3647iA = ((r) n10).C0().a(classId)) != null) {
                return c3647iA;
            }
        }
        return null;
    }
}
