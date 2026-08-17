package c8;

import c8.C1904f0;
import d8.C2348F;
import i7.C2735B;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2855l;
import t8.EnumC3382e;

/* JADX INFO: renamed from: c8.X, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1890X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C1907h f18944a = new C1907h(EnumC1913k.f19006h, null, false, false, 8, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C1907h f18945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C1907h f18946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map f18947d;

    static {
        EnumC1913k enumC1913k = EnumC1913k.f19007i;
        f18945b = new C1907h(enumC1913k, null, false, false, 8, null);
        f18946c = new C1907h(enumC1913k, null, true, false, 8, null);
        C2348F c2348f = C2348F.f25682a;
        String strH = c2348f.h("Object");
        String strG = c2348f.g("Predicate");
        String strG2 = c2348f.g("Function");
        String strG3 = c2348f.g("Consumer");
        String strG4 = c2348f.g("BiFunction");
        String strG5 = c2348f.g("BiConsumer");
        String strG6 = c2348f.g("UnaryOperator");
        String strI = c2348f.i("stream/Stream");
        String strI2 = c2348f.i("Optional");
        C1904f0 c1904f0 = new C1904f0();
        C1904f0.a.b(new C1904f0.a(c1904f0, c2348f.i("Iterator")), "forEachRemaining", null, new C1917m(strG3), 2, null);
        C1904f0.a.b(new C1904f0.a(c1904f0, c2348f.h("Iterable")), "spliterator", null, new C1928x(c2348f), 2, null);
        C1904f0.a aVar = new C1904f0.a(c1904f0, c2348f.i("Collection"));
        C1904f0.a.b(aVar, "removeIf", null, new C1876I(strG), 2, null);
        C1904f0.a.b(aVar, "stream", null, new C1883P(strI), 2, null);
        C1904f0.a.b(aVar, "parallelStream", null, new C1884Q(strI), 2, null);
        C1904f0.a aVar2 = new C1904f0.a(c1904f0, c2348f.i("List"));
        C1904f0.a.b(aVar2, "replaceAll", null, new C1885S(strG6), 2, null);
        aVar2.a("addFirst", "2.1", new C1886T(strH));
        aVar2.a("addLast", "2.1", new C1887U(strH));
        aVar2.a("removeFirst", "2.1", new C1888V(strH));
        aVar2.a("removeLast", "2.1", new C1889W(strH));
        C1904f0.a aVar3 = new C1904f0.a(c1904f0, c2348f.i("LinkedList"));
        aVar3.a("addFirst", "2.1", new C1918n(strH));
        aVar3.a("addLast", "2.1", new C1919o(strH));
        aVar3.a("removeFirst", "2.1", new C1920p(strH));
        aVar3.a("removeLast", "2.1", new C1921q(strH));
        C1904f0.a aVar4 = new C1904f0.a(c1904f0, c2348f.i("Map"));
        C1904f0.a.b(aVar4, "forEach", null, new C1922r(strG5), 2, null);
        C1904f0.a.b(aVar4, "putIfAbsent", null, new C1923s(strH), 2, null);
        C1904f0.a.b(aVar4, "replace", null, new C1924t(strH), 2, null);
        C1904f0.a.b(aVar4, "replace", null, new C1925u(strH), 2, null);
        C1904f0.a.b(aVar4, "replaceAll", null, new C1926v(strG4), 2, null);
        C1904f0.a.b(aVar4, "compute", null, new C1927w(strH, strG4), 2, null);
        C1904f0.a.b(aVar4, "computeIfAbsent", null, new C1929y(strH, strG2), 2, null);
        C1904f0.a.b(aVar4, "computeIfPresent", null, new C1930z(strH, strG4), 2, null);
        C1904f0.a.b(aVar4, "merge", null, new C1868A(strH, strG4), 2, null);
        C1904f0.a aVar5 = new C1904f0.a(c1904f0, strI2);
        C1904f0.a.b(aVar5, "empty", null, new C1869B(strI2), 2, null);
        C1904f0.a.b(aVar5, "of", null, new C1870C(strH, strI2), 2, null);
        C1904f0.a.b(aVar5, "ofNullable", null, new C1871D(strH, strI2), 2, null);
        C1904f0.a.b(aVar5, "get", null, new C1872E(strH), 2, null);
        C1904f0.a.b(aVar5, "ifPresent", null, new C1873F(strG3), 2, null);
        C1904f0.a.b(new C1904f0.a(c1904f0, c2348f.h("ref/Reference")), "get", null, new C1874G(strH), 2, null);
        C1904f0.a.b(new C1904f0.a(c1904f0, strG), "test", null, new C1875H(strH), 2, null);
        C1904f0.a.b(new C1904f0.a(c1904f0, c2348f.g("BiPredicate")), "test", null, new C1877J(strH), 2, null);
        C1904f0.a.b(new C1904f0.a(c1904f0, strG3), "accept", null, new C1878K(strH), 2, null);
        C1904f0.a.b(new C1904f0.a(c1904f0, strG5), "accept", null, new C1879L(strH), 2, null);
        C1904f0.a.b(new C1904f0.a(c1904f0, strG2), "apply", null, new C1880M(strH), 2, null);
        C1904f0.a.b(new C1904f0.a(c1904f0, strG4), "apply", null, new C1881N(strH), 2, null);
        C1904f0.a.b(new C1904f0.a(c1904f0, c2348f.g("Supplier")), "get", null, new C1882O(strH), 2, null);
        f18947d = c1904f0.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B A(String str, C1904f0.a.C0202a function) {
        AbstractC2855l.g(function, "$this$function");
        function.b(str, f18945b);
        function.d(EnumC3382e.BOOLEAN);
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B B(String str, C1904f0.a.C0202a function) {
        AbstractC2855l.g(function, "$this$function");
        C1907h c1907h = f18945b;
        function.b(str, c1907h);
        function.b(str, c1907h);
        function.d(EnumC3382e.BOOLEAN);
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B C(String str, C1904f0.a.C0202a function) {
        AbstractC2855l.g(function, "$this$function");
        function.b(str, f18945b);
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B D(String str, C1904f0.a.C0202a function) {
        AbstractC2855l.g(function, "$this$function");
        C1907h c1907h = f18945b;
        function.b(str, c1907h);
        function.b(str, c1907h);
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B E(String str, C1904f0.a.C0202a function) {
        AbstractC2855l.g(function, "$this$function");
        C1907h c1907h = f18945b;
        function.b(str, c1907h);
        function.c(str, c1907h);
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B F(String str, C1904f0.a.C0202a function) {
        AbstractC2855l.g(function, "$this$function");
        C1907h c1907h = f18945b;
        function.b(str, c1907h);
        function.b(str, c1907h);
        function.c(str, c1907h);
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B G(String str, C1904f0.a.C0202a function) {
        AbstractC2855l.g(function, "$this$function");
        function.c(str, f18945b);
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B H(String str, C1904f0.a.C0202a function) {
        AbstractC2855l.g(function, "$this$function");
        C1907h c1907h = f18945b;
        function.b(str, c1907h, c1907h);
        function.d(EnumC3382e.BOOLEAN);
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B I(String str, C1904f0.a.C0202a function) {
        AbstractC2855l.g(function, "$this$function");
        C1907h c1907h = f18945b;
        function.c(str, c1907h, c1907h);
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B J(String str, C1904f0.a.C0202a function) {
        AbstractC2855l.g(function, "$this$function");
        C1907h c1907h = f18945b;
        function.c(str, c1907h, c1907h);
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B a(String str, C1904f0.a.C0202a function) {
        AbstractC2855l.g(function, "$this$function");
        C1907h c1907h = f18945b;
        function.b(str, c1907h, c1907h);
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B b(String str, C1904f0.a.C0202a function) {
        AbstractC2855l.g(function, "$this$function");
        function.b(str, f18945b);
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B c(String str, C1904f0.a.C0202a function) {
        AbstractC2855l.g(function, "$this$function");
        function.c(str, f18945b);
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B d(String str, C1904f0.a.C0202a function) {
        AbstractC2855l.g(function, "$this$function");
        function.c(str, f18945b);
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B e(String str, C1904f0.a.C0202a function) {
        AbstractC2855l.g(function, "$this$function");
        C1907h c1907h = f18945b;
        function.b(str, c1907h, c1907h);
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B f(String str, C1904f0.a.C0202a function) {
        AbstractC2855l.g(function, "$this$function");
        function.b(str, f18945b);
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B g(String str, C1904f0.a.C0202a function) {
        AbstractC2855l.g(function, "$this$function");
        function.b(str, f18945b);
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B h(String str, C1904f0.a.C0202a function) {
        AbstractC2855l.g(function, "$this$function");
        function.b(str, f18945b);
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B i(String str, C1904f0.a.C0202a function) {
        AbstractC2855l.g(function, "$this$function");
        function.c(str, f18945b);
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B j(String str, C1904f0.a.C0202a function) {
        AbstractC2855l.g(function, "$this$function");
        function.c(str, f18945b);
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B k(String str, C1904f0.a.C0202a function) {
        AbstractC2855l.g(function, "$this$function");
        C1907h c1907h = f18945b;
        function.b(str, c1907h, c1907h, c1907h);
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B l(String str, C1904f0.a.C0202a function) {
        AbstractC2855l.g(function, "$this$function");
        C1907h c1907h = f18945b;
        function.b(str, c1907h);
        function.b(str, c1907h);
        function.c(str, f18944a);
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B m(String str, C1904f0.a.C0202a function) {
        AbstractC2855l.g(function, "$this$function");
        C1907h c1907h = f18945b;
        function.b(str, c1907h);
        function.b(str, c1907h);
        function.c(str, f18944a);
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B n(String str, C1904f0.a.C0202a function) {
        AbstractC2855l.g(function, "$this$function");
        C1907h c1907h = f18945b;
        function.b(str, c1907h);
        function.b(str, c1907h);
        function.b(str, c1907h);
        function.d(EnumC3382e.BOOLEAN);
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B o(String str, C1904f0.a.C0202a function) {
        AbstractC2855l.g(function, "$this$function");
        C1907h c1907h = f18945b;
        function.b(str, c1907h, c1907h, c1907h, c1907h);
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B p(String str, String str2, C1904f0.a.C0202a function) {
        AbstractC2855l.g(function, "$this$function");
        C1907h c1907h = f18945b;
        function.b(str, c1907h);
        C1907h c1907h2 = f18944a;
        function.b(str2, c1907h, c1907h, c1907h2, c1907h2);
        function.c(str, c1907h2);
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B q(String str, String str2, C1904f0.a.C0202a function) {
        AbstractC2855l.g(function, "$this$function");
        C1907h c1907h = f18945b;
        function.b(str, c1907h);
        function.b(str2, c1907h, c1907h, c1907h);
        function.c(str, c1907h);
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B r(String str, String str2, C1904f0.a.C0202a function) {
        AbstractC2855l.g(function, "$this$function");
        C1907h c1907h = f18945b;
        function.b(str, c1907h);
        C1907h c1907h2 = f18946c;
        C1907h c1907h3 = f18944a;
        function.b(str2, c1907h, c1907h, c1907h2, c1907h3);
        function.c(str, c1907h3);
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B s(String str, String str2, C1904f0.a.C0202a function) {
        AbstractC2855l.g(function, "$this$function");
        C1907h c1907h = f18945b;
        function.b(str, c1907h);
        C1907h c1907h2 = f18946c;
        function.b(str, c1907h2);
        C1907h c1907h3 = f18944a;
        function.b(str2, c1907h, c1907h2, c1907h2, c1907h3);
        function.c(str, c1907h3);
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B t(C2348F c2348f, C1904f0.a.C0202a function) {
        AbstractC2855l.g(function, "$this$function");
        String strI = c2348f.i("Spliterator");
        C1907h c1907h = f18945b;
        function.c(strI, c1907h, c1907h);
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B u(String str, C1904f0.a.C0202a function) {
        AbstractC2855l.g(function, "$this$function");
        function.c(str, f18945b, f18946c);
        return C2735B.f28704a;
    }

    public static final Map u0() {
        return f18947d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B v(String str, String str2, C1904f0.a.C0202a function) {
        AbstractC2855l.g(function, "$this$function");
        C1907h c1907h = f18946c;
        function.b(str, c1907h);
        function.c(str2, f18945b, c1907h);
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B w(String str, String str2, C1904f0.a.C0202a function) {
        AbstractC2855l.g(function, "$this$function");
        function.b(str, f18944a);
        function.c(str2, f18945b, f18946c);
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B x(String str, C1904f0.a.C0202a function) {
        AbstractC2855l.g(function, "$this$function");
        function.c(str, f18946c);
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B y(String str, C1904f0.a.C0202a function) {
        AbstractC2855l.g(function, "$this$function");
        function.b(str, f18945b, f18946c);
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B z(String str, C1904f0.a.C0202a function) {
        AbstractC2855l.g(function, "$this$function");
        function.c(str, f18944a);
        return C2735B.f28704a;
    }
}
