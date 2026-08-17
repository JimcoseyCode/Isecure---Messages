package F7;

import C7.m;
import F7.K0;
import i7.AbstractC2746i;
import i7.EnumC2749l;
import java.lang.reflect.Member;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class E0 extends K0 implements C7.m {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Lazy f1925u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Lazy f1926v;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends K0.c implements m.a {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final E0 f1927p;

        public a(E0 property) {
            AbstractC2855l.g(property, "property");
            this.f1927p = property;
        }

        @Override // C7.k.a
        /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public E0 j() {
            return this.f1927p;
        }

        @Override // kotlin.jvm.functions.Function1
        public Object invoke(Object obj) {
            return a0().get(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E0(AbstractC0529d0 container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        AbstractC2855l.g(container, "container");
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(signature, "signature");
        EnumC2749l enumC2749l = EnumC2749l.f28717h;
        this.f1925u = AbstractC2746i.a(enumC2749l, new C0(this));
        this.f1926v = AbstractC2746i.a(enumC2749l, new D0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a k0(E0 e02) {
        return new a(e02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Member n0(E0 e02) {
        return e02.d0();
    }

    @Override // C7.m
    public Object get(Object obj) {
        return getGetter().call(obj);
    }

    @Override // C7.m
    public Object getDelegate(Object obj) {
        return f0((Member) this.f1926v.getValue(), obj, null);
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // F7.K0
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public a h0() {
        return (a) this.f1925u.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E0(AbstractC0529d0 container, L7.Z descriptor) {
        super(container, descriptor);
        AbstractC2855l.g(container, "container");
        AbstractC2855l.g(descriptor, "descriptor");
        EnumC2749l enumC2749l = EnumC2749l.f28717h;
        this.f1925u = AbstractC2746i.a(enumC2749l, new C0(this));
        this.f1926v = AbstractC2746i.a(enumC2749l, new D0(this));
    }
}
