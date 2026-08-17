package F7;

import j7.AbstractC2800q;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: F7.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0536h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC0522a f2056a = AbstractC0524b.a(C0526c.f2026g);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC0522a f2057b = AbstractC0524b.a(C0528d.f2029g);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AbstractC0522a f2058c = AbstractC0524b.a(C0530e.f2043g);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AbstractC0522a f2059d = AbstractC0524b.a(C0532f.f2048g);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AbstractC0522a f2060e = AbstractC0524b.a(C0534g.f2053g);

    /* JADX INFO: Access modifiers changed from: private */
    public static final C7.o a(Class it) {
        AbstractC2855l.g(it, "it");
        return D7.d.b(m(it), AbstractC2800q.j(), false, AbstractC2800q.j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConcurrentHashMap b(Class it) {
        AbstractC2855l.g(it, "it");
        return new ConcurrentHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C7.o c(Class it) {
        AbstractC2855l.g(it, "it");
        return D7.d.b(m(it), AbstractC2800q.j(), true, AbstractC2800q.j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final X d(Class it) {
        AbstractC2855l.g(it, "it");
        return new X(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0564v0 e(Class it) {
        AbstractC2855l.g(it, "it");
        return new C0564v0(it);
    }

    public static final C7.o k(Class jClass, List arguments, boolean z10) {
        AbstractC2855l.g(jClass, "jClass");
        AbstractC2855l.g(arguments, "arguments");
        return arguments.isEmpty() ? z10 ? (C7.o) f2059d.a(jClass) : (C7.o) f2058c.a(jClass) : l(jClass, arguments, z10);
    }

    private static final C7.o l(Class cls, List list, boolean z10) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) f2060e.a(cls);
        Pair pairA = i7.t.a(list, Boolean.valueOf(z10));
        Object obj = concurrentHashMap.get(pairA);
        if (obj == null) {
            C7.o oVarB = D7.d.b(m(cls), list, z10, AbstractC2800q.j());
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(pairA, oVarB);
            obj = objPutIfAbsent == null ? oVarB : objPutIfAbsent;
        }
        AbstractC2855l.f(obj, "getOrPut(...)");
        return (C7.o) obj;
    }

    public static final X m(Class jClass) {
        AbstractC2855l.g(jClass, "jClass");
        Object objA = f2056a.a(jClass);
        AbstractC2855l.e(objA, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<T of kotlin.reflect.jvm.internal.CachesKt.getOrCreateKotlinClass>");
        return (X) objA;
    }

    public static final C7.f n(Class jClass) {
        AbstractC2855l.g(jClass, "jClass");
        return (C7.f) f2057b.a(jClass);
    }
}
