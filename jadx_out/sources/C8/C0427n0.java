package C8;

import L7.InterfaceC1283h;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: C8.n0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0427n0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f667e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0427n0 f668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final L7.l0 f669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f671d;

    /* JADX INFO: renamed from: C8.n0$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C0427n0 a(C0427n0 c0427n0, L7.l0 typeAliasDescriptor, List arguments) {
            AbstractC2855l.g(typeAliasDescriptor, "typeAliasDescriptor");
            AbstractC2855l.g(arguments, "arguments");
            List parameters = typeAliasDescriptor.j().getParameters();
            AbstractC2855l.f(parameters, "getParameters(...)");
            ArrayList arrayList = new ArrayList(AbstractC2800q.u(parameters, 10));
            Iterator it = parameters.iterator();
            while (it.hasNext()) {
                arrayList.add(((L7.m0) it.next()).a());
            }
            return new C0427n0(c0427n0, typeAliasDescriptor, arguments, j7.K.r(AbstractC2800q.X0(arrayList, arguments)), null);
        }

        private a() {
        }
    }

    public /* synthetic */ C0427n0(C0427n0 c0427n0, L7.l0 l0Var, List list, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(c0427n0, l0Var, list, map);
    }

    public final List a() {
        return this.f670c;
    }

    public final L7.l0 b() {
        return this.f669b;
    }

    public final B0 c(v0 constructor) {
        AbstractC2855l.g(constructor, "constructor");
        InterfaceC1283h interfaceC1283hP = constructor.p();
        if (interfaceC1283hP instanceof L7.m0) {
            return (B0) this.f671d.get(interfaceC1283hP);
        }
        return null;
    }

    public final boolean d(L7.l0 descriptor) {
        AbstractC2855l.g(descriptor, "descriptor");
        if (AbstractC2855l.b(this.f669b, descriptor)) {
            return true;
        }
        C0427n0 c0427n0 = this.f668a;
        return c0427n0 != null ? c0427n0.d(descriptor) : false;
    }

    private C0427n0(C0427n0 c0427n0, L7.l0 l0Var, List list, Map map) {
        this.f668a = c0427n0;
        this.f669b = l0Var;
        this.f670c = list;
        this.f671d = map;
    }
}
