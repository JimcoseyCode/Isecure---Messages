package C8;

import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: C8.i0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0417i0 extends C0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final S f653a;

    public C0417i0(I7.i kotlinBuiltIns) {
        AbstractC2855l.g(kotlinBuiltIns, "kotlinBuiltIns");
        AbstractC0407d0 abstractC0407d0I = kotlinBuiltIns.I();
        AbstractC2855l.f(abstractC0407d0I, "getNullableAnyType(...)");
        this.f653a = abstractC0407d0I;
    }

    @Override // C8.B0
    public N0 a() {
        return N0.f594m;
    }

    @Override // C8.B0
    public boolean b() {
        return true;
    }

    @Override // C8.B0
    public S getType() {
        return this.f653a;
    }

    @Override // C8.B0
    public B0 o(D8.g kotlinTypeRefiner) {
        AbstractC2855l.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }
}
