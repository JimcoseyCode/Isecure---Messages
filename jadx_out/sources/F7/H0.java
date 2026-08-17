package F7;

import C7.n;
import F7.K0;
import i7.AbstractC2746i;
import i7.EnumC2749l;
import java.lang.reflect.Member;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC2846c;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class H0 extends K0 implements C7.n {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Lazy f1933u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Lazy f1934v;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends K0.c implements n.a {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final H0 f1935p;

        public a(H0 property) {
            AbstractC2855l.g(property, "property");
            this.f1935p = property;
        }

        @Override // C7.k.a
        /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
        public H0 j() {
            return this.f1935p;
        }

        @Override // kotlin.jvm.functions.Function2
        public Object invoke(Object obj, Object obj2) {
            return j().r(obj, obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H0(AbstractC0529d0 container, String name, String signature) {
        super(container, name, signature, AbstractC2846c.NO_RECEIVER);
        AbstractC2855l.g(container, "container");
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(signature, "signature");
        EnumC2749l enumC2749l = EnumC2749l.f28717h;
        this.f1933u = AbstractC2746i.a(enumC2749l, new F0(this));
        this.f1934v = AbstractC2746i.a(enumC2749l, new G0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a k0(H0 h02) {
        return new a(h02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Member n0(H0 h02) {
        return h02.d0();
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        return r(obj, obj2);
    }

    @Override // F7.K0
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public a h0() {
        return (a) this.f1933u.getValue();
    }

    @Override // C7.n
    public Object r(Object obj, Object obj2) {
        return h0().call(obj, obj2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H0(AbstractC0529d0 container, L7.Z descriptor) {
        super(container, descriptor);
        AbstractC2855l.g(container, "container");
        AbstractC2855l.g(descriptor, "descriptor");
        EnumC2749l enumC2749l = EnumC2749l.f28717h;
        this.f1933u = AbstractC2746i.a(enumC2749l, new F0(this));
        this.f1934v = AbstractC2746i.a(enumC2749l, new G0(this));
    }
}
