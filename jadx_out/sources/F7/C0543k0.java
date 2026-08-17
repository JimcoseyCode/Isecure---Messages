package F7;

import C7.h;
import F7.K0;
import i7.AbstractC2746i;
import i7.C2735B;
import i7.EnumC2749l;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: F7.k0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0543k0 extends B0 implements C7.l, C7.h {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Lazy f2076w;

    /* JADX INFO: renamed from: F7.k0$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends K0.d implements h.a, Function1 {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final C0543k0 f2077p;

        public a(C0543k0 property) {
            AbstractC2855l.g(property, "property");
            this.f2077p = property;
        }

        @Override // C7.k.a
        /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
        public C0543k0 j() {
            return this.f2077p;
        }

        public void h0(Object obj) throws D7.a {
            j().s0(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws D7.a {
            h0(obj);
            return C2735B.f28704a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0543k0(AbstractC0529d0 container, L7.Z descriptor) {
        super(container, descriptor);
        AbstractC2855l.g(container, "container");
        AbstractC2855l.g(descriptor, "descriptor");
        this.f2076w = AbstractC2746i.a(EnumC2749l.f28717h, new C0541j0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a p0(C0543k0 c0543k0) {
        return new a(c0543k0);
    }

    @Override // C7.h
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public a h() {
        return (a) this.f2076w.getValue();
    }

    public void s0(Object obj) throws D7.a {
        h().call(obj);
    }
}
