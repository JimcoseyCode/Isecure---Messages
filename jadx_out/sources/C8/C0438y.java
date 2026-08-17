package C8;

import L7.InterfaceC1283h;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: C8.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0438y extends A implements InterfaceC0436w, G8.e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f716j = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AbstractC0407d0 f717h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f718i;

    /* JADX INFO: renamed from: C8.y$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean a(M0 m02) {
            m02.K0();
            return (m02.K0().p() instanceof L7.m0) || (m02 instanceof D8.i);
        }

        public static /* synthetic */ C0438y c(a aVar, M0 m02, boolean z10, boolean z11, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            if ((i10 & 4) != 0) {
                z11 = false;
            }
            return aVar.b(m02, z10, z11);
        }

        private final boolean d(M0 m02, boolean z10) {
            if (!a(m02)) {
                return false;
            }
            InterfaceC1283h interfaceC1283hP = m02.K0().p();
            O7.U u10 = interfaceC1283hP instanceof O7.U ? (O7.U) interfaceC1283hP : null;
            if (u10 == null || u10.Q0()) {
                return (z10 && (m02.K0().p() instanceof L7.m0)) ? J0.l(m02) : !D8.r.f845a.a(m02);
            }
            return true;
        }

        public final C0438y b(M0 type, boolean z10, boolean z11) {
            AbstractC2855l.g(type, "type");
            if (type instanceof C0438y) {
                return (C0438y) type;
            }
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (!z11 && !d(type, z10)) {
                return null;
            }
            if (type instanceof I) {
                I i10 = (I) type;
                AbstractC2855l.b(i10.S0().K0(), i10.T0().K0());
            }
            return new C0438y(L.c(type).O0(false), z10, defaultConstructorMarker);
        }

        private a() {
        }
    }

    public /* synthetic */ C0438y(AbstractC0407d0 abstractC0407d0, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC0407d0, z10);
    }

    @Override // C8.InterfaceC0436w
    public S L(S replacement) {
        AbstractC2855l.g(replacement, "replacement");
        return AbstractC0415h0.e(replacement.N0(), this.f718i);
    }

    @Override // C8.A, C8.S
    public boolean L0() {
        return false;
    }

    @Override // C8.M0
    /* JADX INFO: renamed from: R0 */
    public AbstractC0407d0 O0(boolean z10) {
        return z10 ? T0().O0(z10) : this;
    }

    @Override // C8.M0
    /* JADX INFO: renamed from: S0 */
    public AbstractC0407d0 Q0(r0 newAttributes) {
        AbstractC2855l.g(newAttributes, "newAttributes");
        return new C0438y(T0().Q0(newAttributes), this.f718i);
    }

    @Override // C8.A
    protected AbstractC0407d0 T0() {
        return this.f717h;
    }

    public final AbstractC0407d0 W0() {
        return this.f717h;
    }

    @Override // C8.A
    /* JADX INFO: renamed from: X0, reason: merged with bridge method [inline-methods] */
    public C0438y V0(AbstractC0407d0 delegate) {
        AbstractC2855l.g(delegate, "delegate");
        return new C0438y(delegate, this.f718i);
    }

    @Override // C8.AbstractC0407d0
    public String toString() {
        return T0() + " & Any";
    }

    @Override // C8.InterfaceC0436w
    public boolean x0() {
        T0().K0();
        return T0().K0().p() instanceof L7.m0;
    }

    private C0438y(AbstractC0407d0 abstractC0407d0, boolean z10) {
        this.f717h = abstractC0407d0;
        this.f718i = z10;
    }
}
