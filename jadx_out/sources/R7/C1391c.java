package R7;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: R7.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class C1391c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1391c f10071a = new C1391c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static a f10072b;

    /* JADX INFO: renamed from: R7.c$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f10073a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Method f10074b;

        public a(Method method, Method method2) {
            this.f10073a = method;
            this.f10074b = method2;
        }

        public final Method a() {
            return this.f10074b;
        }

        public final Method b() {
            return this.f10073a;
        }
    }

    private C1391c() {
    }

    public final a a(Member member) {
        AbstractC2855l.g(member, "member");
        Class<?> cls = member.getClass();
        try {
            return new a(cls.getMethod("getParameters", null), AbstractC1394f.j(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", null));
        } catch (NoSuchMethodException unused) {
            return new a(null, null);
        }
    }

    public final List b(Member member) throws IllegalAccessException, InvocationTargetException {
        Method methodA;
        AbstractC2855l.g(member, "member");
        a aVarA = f10072b;
        if (aVarA == null) {
            synchronized (this) {
                aVarA = f10072b;
                if (aVarA == null) {
                    aVarA = f10071a.a(member);
                    f10072b = aVarA;
                }
            }
        }
        Method methodB = aVarA.b();
        if (methodB == null || (methodA = aVarA.a()) == null) {
            return null;
        }
        Object objInvoke = methodB.invoke(member, null);
        AbstractC2855l.e(objInvoke, "null cannot be cast to non-null type kotlin.Array<*>");
        Object[] objArr = (Object[]) objInvoke;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            Object objInvoke2 = methodA.invoke(obj, null);
            AbstractC2855l.e(objInvoke2, "null cannot be cast to non-null type kotlin.String");
            arrayList.add((String) objInvoke2);
        }
        return arrayList;
    }
}
