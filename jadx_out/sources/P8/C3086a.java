package p8;

import C8.AbstractC0407d0;
import C8.B0;
import C8.r0;
import D8.g;
import E8.h;
import E8.l;
import com.facebook.react.uimanager.events.PointerEventHelper;
import j7.AbstractC2800q;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v8.InterfaceC3442k;

/* JADX INFO: renamed from: p8.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3086a extends AbstractC0407d0 implements G8.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final B0 f30670h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC3087b f30671i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f30672j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final r0 f30673k;

    public /* synthetic */ C3086a(B0 b02, InterfaceC3087b interfaceC3087b, boolean z10, r0 r0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(b02, (i10 & 2) != 0 ? new C3088c(b02) : interfaceC3087b, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? r0.f682h.j() : r0Var);
    }

    @Override // C8.S
    public List I0() {
        return AbstractC2800q.j();
    }

    @Override // C8.S
    public r0 J0() {
        return this.f30673k;
    }

    @Override // C8.S
    public boolean L0() {
        return this.f30672j;
    }

    @Override // C8.M0
    /* JADX INFO: renamed from: S0 */
    public AbstractC0407d0 Q0(r0 newAttributes) {
        AbstractC2855l.g(newAttributes, "newAttributes");
        return new C3086a(this.f30670h, K0(), L0(), newAttributes);
    }

    @Override // C8.S
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public InterfaceC3087b K0() {
        return this.f30671i;
    }

    @Override // C8.AbstractC0407d0
    /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] */
    public C3086a O0(boolean z10) {
        return z10 == L0() ? this : new C3086a(this.f30670h, K0(), z10, J0());
    }

    @Override // C8.M0
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public C3086a U0(g kotlinTypeRefiner) {
        AbstractC2855l.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        B0 b0O = this.f30670h.o(kotlinTypeRefiner);
        AbstractC2855l.f(b0O, "refine(...)");
        return new C3086a(b0O, K0(), L0(), J0());
    }

    @Override // C8.S
    public InterfaceC3442k o() {
        return l.a(h.f1142h, true, new String[0]);
    }

    @Override // C8.AbstractC0407d0
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Captured(");
        sb.append(this.f30670h);
        sb.append(')');
        sb.append(L0() ? "?" : PointerEventHelper.POINTER_TYPE_UNKNOWN);
        return sb.toString();
    }

    public C3086a(B0 typeProjection, InterfaceC3087b constructor, boolean z10, r0 attributes) {
        AbstractC2855l.g(typeProjection, "typeProjection");
        AbstractC2855l.g(constructor, "constructor");
        AbstractC2855l.g(attributes, "attributes");
        this.f30670h = typeProjection;
        this.f30671i = constructor;
        this.f30672j = z10;
        this.f30673k = attributes;
    }
}
