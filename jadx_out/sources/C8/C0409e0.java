package C8;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import v8.InterfaceC3442k;

/* JADX INFO: renamed from: C8.e0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class C0409e0 extends AbstractC0407d0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final v0 f635h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f636i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f637j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final InterfaceC3442k f638k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Function1 f639l;

    public C0409e0(v0 constructor, List arguments, boolean z10, InterfaceC3442k memberScope, Function1 refinedTypeFactory) {
        AbstractC2855l.g(constructor, "constructor");
        AbstractC2855l.g(arguments, "arguments");
        AbstractC2855l.g(memberScope, "memberScope");
        AbstractC2855l.g(refinedTypeFactory, "refinedTypeFactory");
        this.f635h = constructor;
        this.f636i = arguments;
        this.f637j = z10;
        this.f638k = memberScope;
        this.f639l = refinedTypeFactory;
        if (!(o() instanceof E8.g) || (o() instanceof E8.m)) {
            return;
        }
        throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + o() + '\n' + K0());
    }

    @Override // C8.S
    public List I0() {
        return this.f636i;
    }

    @Override // C8.S
    public r0 J0() {
        return r0.f682h.j();
    }

    @Override // C8.S
    public v0 K0() {
        return this.f635h;
    }

    @Override // C8.S
    public boolean L0() {
        return this.f637j;
    }

    @Override // C8.M0
    /* JADX INFO: renamed from: R0 */
    public AbstractC0407d0 O0(boolean z10) {
        return z10 == L0() ? this : z10 ? new C0403b0(this) : new Z(this);
    }

    @Override // C8.M0
    /* JADX INFO: renamed from: S0 */
    public AbstractC0407d0 Q0(r0 newAttributes) {
        AbstractC2855l.g(newAttributes, "newAttributes");
        return newAttributes.isEmpty() ? this : new C0411f0(this, newAttributes);
    }

    @Override // C8.M0
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public AbstractC0407d0 U0(D8.g kotlinTypeRefiner) {
        AbstractC2855l.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        AbstractC0407d0 abstractC0407d0 = (AbstractC0407d0) this.f639l.invoke(kotlinTypeRefiner);
        return abstractC0407d0 == null ? this : abstractC0407d0;
    }

    @Override // C8.S
    public InterfaceC3442k o() {
        return this.f638k;
    }
}
