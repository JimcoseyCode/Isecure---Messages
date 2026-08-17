package F7;

import C7.l;
import F7.K0;
import i7.AbstractC2746i;
import i7.EnumC2749l;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class B0 extends K0 implements C7.l {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Lazy f1917u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Lazy f1918v;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends K0.c implements l.a {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final B0 f1919p;

        public a(B0 property) {
            AbstractC2855l.g(property, "property");
            this.f1919p = property;
        }

        @Override // C7.k.a
        /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
        public B0 j() {
            return this.f1919p;
        }

        @Override // w7.InterfaceC3487a
        public Object invoke() {
            return j().get();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B0(AbstractC0529d0 container, L7.Z descriptor) {
        super(container, descriptor);
        AbstractC2855l.g(container, "container");
        AbstractC2855l.g(descriptor, "descriptor");
        EnumC2749l enumC2749l = EnumC2749l.f28717h;
        this.f1917u = AbstractC2746i.a(enumC2749l, new C0572z0(this));
        this.f1918v = AbstractC2746i.a(enumC2749l, new A0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a k0(B0 b02) {
        return new a(b02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object n0(B0 b02) {
        return b02.f0(b02.d0(), null, null);
    }

    @Override // C7.l
    public Object get() {
        return h0().call(new Object[0]);
    }

    @Override // w7.InterfaceC3487a
    public Object invoke() {
        return get();
    }

    @Override // F7.K0
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public a h0() {
        return (a) this.f1917u.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B0(AbstractC0529d0 container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        AbstractC2855l.g(container, "container");
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(signature, "signature");
        EnumC2749l enumC2749l = EnumC2749l.f28717h;
        this.f1917u = AbstractC2746i.a(enumC2749l, new C0572z0(this));
        this.f1918v = AbstractC2746i.a(enumC2749l, new A0(this));
    }
}
