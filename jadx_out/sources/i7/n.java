package I7;

import C8.C0421k0;
import C8.S;
import C8.V;
import C8.r0;
import I7.o;
import L7.AbstractC1299y;
import L7.H;
import L7.InterfaceC1280e;
import L7.InterfaceC1283h;
import L7.M;
import L7.m0;
import i7.AbstractC2746i;
import i7.EnumC2749l;
import j7.AbstractC2800q;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.v;
import v8.InterfaceC3442k;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final M f5097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Lazy f5098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f5099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f5100d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f5101e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a f5102f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a f5103g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final a f5104h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final a f5105i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final a f5106j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final /* synthetic */ C7.k[] f5096l = {D.k(new v(D.b(n.class), "kClass", "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), D.k(new v(D.b(n.class), "kProperty", "getKProperty()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), D.k(new v(D.b(n.class), "kProperty0", "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), D.k(new v(D.b(n.class), "kProperty1", "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), D.k(new v(D.b(n.class), "kProperty2", "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), D.k(new v(D.b(n.class), "kMutableProperty0", "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), D.k(new v(D.b(n.class), "kMutableProperty1", "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), D.k(new v(D.b(n.class), "kMutableProperty2", "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"))};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f5095k = new b(null);

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f5107a;

        public a(int i10) {
            this.f5107a = i10;
        }

        public final InterfaceC1280e a(n types, C7.k property) {
            AbstractC2855l.g(types, "types");
            AbstractC2855l.g(property, "property");
            return types.c(K8.a.a(property.getName()), this.f5107a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final S a(H module) {
            AbstractC2855l.g(module, "module");
            InterfaceC1280e interfaceC1280eB = AbstractC1299y.b(module, o.a.f5228w0);
            if (interfaceC1280eB == null) {
                return null;
            }
            r0 r0VarJ = r0.f682h.j();
            List parameters = interfaceC1280eB.j().getParameters();
            AbstractC2855l.f(parameters, "getParameters(...)");
            Object objC0 = AbstractC2800q.C0(parameters);
            AbstractC2855l.f(objC0, "single(...)");
            return V.h(r0VarJ, interfaceC1280eB, AbstractC2800q.e(new C0421k0((m0) objC0)));
        }

        private b() {
        }
    }

    public n(H module, M notFoundClasses) {
        AbstractC2855l.g(module, "module");
        AbstractC2855l.g(notFoundClasses, "notFoundClasses");
        this.f5097a = notFoundClasses;
        this.f5098b = AbstractC2746i.a(EnumC2749l.f28717h, new m(module));
        this.f5099c = new a(1);
        this.f5100d = new a(1);
        this.f5101e = new a(1);
        this.f5102f = new a(2);
        this.f5103g = new a(3);
        this.f5104h = new a(1);
        this.f5105i = new a(2);
        this.f5106j = new a(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC1280e c(String str, int i10) {
        k8.f fVarQ = k8.f.q(str);
        AbstractC2855l.f(fVarQ, "identifier(...)");
        InterfaceC1283h interfaceC1283hF = e().f(fVarQ, T7.d.f10633n);
        InterfaceC1280e interfaceC1280e = interfaceC1283hF instanceof InterfaceC1280e ? (InterfaceC1280e) interfaceC1283hF : null;
        return interfaceC1280e == null ? this.f5097a.d(new k8.b(o.f5139x, fVarQ), AbstractC2800q.e(Integer.valueOf(i10))) : interfaceC1280e;
    }

    private final InterfaceC3442k e() {
        return (InterfaceC3442k) this.f5098b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3442k f(H h10) {
        return h10.e0(o.f5139x).o();
    }

    public final InterfaceC1280e d() {
        return this.f5099c.a(this, f5096l[0]);
    }
}
