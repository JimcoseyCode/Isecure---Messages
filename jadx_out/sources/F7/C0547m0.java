package F7;

import C7.i;
import F7.K0;
import i7.AbstractC2746i;
import i7.C2735B;
import i7.EnumC2749l;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: F7.m0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0547m0 extends E0 implements C7.i {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Lazy f2083w;

    /* JADX INFO: renamed from: F7.m0$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends K0.d implements i.a {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final C0547m0 f2084p;

        public a(C0547m0 property) {
            AbstractC2855l.g(property, "property");
            this.f2084p = property;
        }

        @Override // C7.k.a
        /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
        public C0547m0 j() {
            return this.f2084p;
        }

        public void h0(Object obj, Object obj2) throws D7.a {
            j().s0(obj, obj2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws D7.a {
            h0(obj, obj2);
            return C2735B.f28704a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0547m0(AbstractC0529d0 container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        AbstractC2855l.g(container, "container");
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(signature, "signature");
        this.f2083w = AbstractC2746i.a(EnumC2749l.f28717h, new C0545l0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a p0(C0547m0 c0547m0) {
        return new a(c0547m0);
    }

    @Override // C7.i, C7.h
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public a h() {
        return (a) this.f2083w.getValue();
    }

    public void s0(Object obj, Object obj2) throws D7.a {
        h().call(obj, obj2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0547m0(AbstractC0529d0 container, L7.Z descriptor) {
        super(container, descriptor);
        AbstractC2855l.g(container, "container");
        AbstractC2855l.g(descriptor, "descriptor");
        this.f2083w = AbstractC2746i.a(EnumC2749l.f28717h, new C0545l0(this));
    }
}
