package K7;

import I7.o;
import d8.C2348F;
import j7.AbstractC2800q;
import j7.T;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2855l;
import t8.EnumC3382e;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f7192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set f7193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set f7194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Set f7195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Set f7196e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Set f7197f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Set f7198g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Set f7199h;

    static {
        x xVar = new x();
        f7192a = xVar;
        C2348F c2348f = C2348F.f25682a;
        f7193b = T.l(c2348f.f("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");
        f7194c = T.k(T.k(T.k(T.k(T.k(T.k(xVar.b(), c2348f.f("List", "sort(Ljava/util/Comparator;)V", "reversed()Ljava/util/List;")), c2348f.e("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), c2348f.e("Double", "isInfinite()Z", "isNaN()Z")), c2348f.e("Float", "isInfinite()Z", "isNaN()Z")), c2348f.e("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V")), c2348f.e("CharSequence", "isEmpty()Z"));
        f7195d = c2348f.f("List", "getFirst()Ljava/lang/Object;", "getLast()Ljava/lang/Object;");
        f7196e = T.k(T.k(T.k(T.k(T.k(T.k(c2348f.e("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), c2348f.f("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), c2348f.e("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), c2348f.e("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), c2348f.f("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), c2348f.f("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), c2348f.f("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        f7197f = T.k(T.k(c2348f.f("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), c2348f.f("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), c2348f.f("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        Set setA = xVar.a();
        String[] strArrB = c2348f.b("D");
        Set setK = T.k(setA, c2348f.e("Float", (String[]) Arrays.copyOf(strArrB, strArrB.length)));
        String[] strArrB2 = c2348f.b("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        f7198g = T.k(setK, c2348f.e("String", (String[]) Arrays.copyOf(strArrB2, strArrB2.length)));
        String[] strArrB3 = c2348f.b("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        f7199h = c2348f.e("Throwable", (String[]) Arrays.copyOf(strArrB3, strArrB3.length));
    }

    private x() {
    }

    private final Set a() {
        C2348F c2348f = C2348F.f25682a;
        EnumC3382e enumC3382e = EnumC3382e.BOOLEAN;
        EnumC3382e enumC3382e2 = EnumC3382e.BYTE;
        List listM = AbstractC2800q.m(enumC3382e, enumC3382e2, EnumC3382e.DOUBLE, EnumC3382e.FLOAT, enumC3382e2, EnumC3382e.INT, EnumC3382e.LONG, EnumC3382e.SHORT);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listM.iterator();
        while (it.hasNext()) {
            String strJ = ((EnumC3382e) it.next()).r().g().j();
            AbstractC2855l.f(strJ, "asString(...)");
            String[] strArrB = c2348f.b("Ljava/lang/String;");
            AbstractC2800q.A(linkedHashSet, c2348f.e(strJ, (String[]) Arrays.copyOf(strArrB, strArrB.length)));
        }
        return linkedHashSet;
    }

    private final Set b() {
        C2348F c2348f = C2348F.f25682a;
        List<EnumC3382e> listM = AbstractC2800q.m(EnumC3382e.BOOLEAN, EnumC3382e.CHAR);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (EnumC3382e enumC3382e : listM) {
            String strJ = enumC3382e.r().g().j();
            AbstractC2855l.f(strJ, "asString(...)");
            AbstractC2800q.A(linkedHashSet, c2348f.e(strJ, enumC3382e.p() + "Value()" + enumC3382e.m()));
        }
        return linkedHashSet;
    }

    public final Set c() {
        return f7195d;
    }

    public final Set d() {
        return f7193b;
    }

    public final Set e() {
        return f7198g;
    }

    public final Set f() {
        return f7194c;
    }

    public final Set g() {
        return f7197f;
    }

    public final Set h() {
        return f7199h;
    }

    public final Set i() {
        return f7196e;
    }

    public final boolean j(k8.d fqName) {
        AbstractC2855l.g(fqName, "fqName");
        return AbstractC2855l.b(fqName, o.a.f5199i) || I7.o.e(fqName);
    }

    public final boolean k(k8.d fqName) {
        AbstractC2855l.g(fqName, "fqName");
        if (j(fqName)) {
            return true;
        }
        k8.b bVarN = c.f7110a.n(fqName);
        if (bVarN == null) {
            return false;
        }
        try {
            return Serializable.class.isAssignableFrom(Class.forName(bVarN.a().b()));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
