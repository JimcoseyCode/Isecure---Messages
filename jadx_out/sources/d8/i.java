package D8;

import C8.AbstractC0407d0;
import C8.B0;
import C8.M0;
import C8.r0;
import L7.m0;
import j7.AbstractC2800q;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v8.InterfaceC3442k;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends AbstractC0407d0 implements G8.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final G8.b f823h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final n f824i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final M0 f825j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final r0 f826k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f827l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f828m;

    public /* synthetic */ i(G8.b bVar, n nVar, M0 m02, r0 r0Var, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, nVar, m02, (i10 & 8) != 0 ? r0.f682h.j() : r0Var, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? false : z11);
    }

    @Override // C8.S
    public List I0() {
        return AbstractC2800q.j();
    }

    @Override // C8.S
    public r0 J0() {
        return this.f826k;
    }

    @Override // C8.S
    public boolean L0() {
        return this.f827l;
    }

    @Override // C8.M0
    /* JADX INFO: renamed from: S0 */
    public AbstractC0407d0 Q0(r0 newAttributes) {
        AbstractC2855l.g(newAttributes, "newAttributes");
        return new i(this.f823h, K0(), this.f825j, newAttributes, L0(), this.f828m);
    }

    public final G8.b T0() {
        return this.f823h;
    }

    @Override // C8.S
    /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] */
    public n K0() {
        return this.f824i;
    }

    public final M0 V0() {
        return this.f825j;
    }

    public final boolean W0() {
        return this.f828m;
    }

    @Override // C8.AbstractC0407d0
    /* JADX INFO: renamed from: X0, reason: merged with bridge method [inline-methods] */
    public i O0(boolean z10) {
        return new i(this.f823h, K0(), this.f825j, J0(), z10, false, 32, null);
    }

    @Override // C8.M0
    /* JADX INFO: renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public i U0(g kotlinTypeRefiner) {
        AbstractC2855l.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        G8.b bVar = this.f823h;
        n nVarO = K0().o(kotlinTypeRefiner);
        M0 m02 = this.f825j;
        return new i(bVar, nVarO, m02 != null ? kotlinTypeRefiner.a(m02).N0() : null, J0(), L0(), false, 32, null);
    }

    @Override // C8.S
    public InterfaceC3442k o() {
        return E8.l.a(E8.h.f1142h, true, new String[0]);
    }

    public i(G8.b captureStatus, n constructor, M0 m02, r0 attributes, boolean z10, boolean z11) {
        AbstractC2855l.g(captureStatus, "captureStatus");
        AbstractC2855l.g(constructor, "constructor");
        AbstractC2855l.g(attributes, "attributes");
        this.f823h = captureStatus;
        this.f824i = constructor;
        this.f825j = m02;
        this.f826k = attributes;
        this.f827l = z10;
        this.f828m = z11;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(G8.b captureStatus, M0 m02, B0 projection, m0 typeParameter) {
        this(captureStatus, new n(projection, null, null, typeParameter, 6, null), m02, null, false, false, 56, null);
        AbstractC2855l.g(captureStatus, "captureStatus");
        AbstractC2855l.g(projection, "projection");
        AbstractC2855l.g(typeParameter, "typeParameter");
    }
}
