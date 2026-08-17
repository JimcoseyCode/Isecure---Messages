package C8;

import i7.AbstractC2746i;
import i7.EnumC2749l;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: C8.k0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0421k0 extends C0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final L7.m0 f657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Lazy f658b;

    public C0421k0(L7.m0 typeParameter) {
        AbstractC2855l.g(typeParameter, "typeParameter");
        this.f657a = typeParameter;
        this.f658b = AbstractC2746i.a(EnumC2749l.f28717h, new C0419j0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final S c(C0421k0 c0421k0) {
        return AbstractC0423l0.b(c0421k0.f657a);
    }

    private final S e() {
        return (S) this.f658b.getValue();
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
        return e();
    }

    @Override // C8.B0
    public B0 o(D8.g kotlinTypeRefiner) {
        AbstractC2855l.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }
}
