package W8;

import R8.U0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import n7.j;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final E f12160a = new E("NO_THREAD_ELEMENTS");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Function2 f12161b = new Function2() { // from class: W8.I
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return L.d(obj, (j.b) obj2);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Function2 f12162c = new Function2() { // from class: W8.J
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return L.e((U0) obj, (j.b) obj2);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Function2 f12163d = new Function2() { // from class: W8.K
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return L.h((P) obj, (j.b) obj2);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(Object obj, j.b bVar) {
        if (!(bVar instanceof U0)) {
            return obj;
        }
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int iIntValue = num != null ? num.intValue() : 1;
        return iIntValue == 0 ? bVar : Integer.valueOf(iIntValue + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final U0 e(U0 u02, j.b bVar) {
        if (u02 != null) {
            return u02;
        }
        if (bVar instanceof U0) {
            return (U0) bVar;
        }
        return null;
    }

    public static final void f(n7.j jVar, Object obj) {
        if (obj == f12160a) {
            return;
        }
        if (obj instanceof P) {
            ((P) obj).b(jVar);
            return;
        }
        Object objU0 = jVar.u0(null, f12162c);
        AbstractC2855l.e(objU0, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((U0) objU0).s(jVar, obj);
    }

    public static final Object g(n7.j jVar) {
        Object objU0 = jVar.u0(0, f12161b);
        AbstractC2855l.d(objU0);
        return objU0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final P h(P p10, j.b bVar) {
        if (bVar instanceof U0) {
            U0 u02 = (U0) bVar;
            p10.a(u02, u02.B(p10.f12166a));
        }
        return p10;
    }

    public static final Object i(n7.j jVar, Object obj) {
        if (obj == null) {
            obj = g(jVar);
        }
        if (obj == 0) {
            return f12160a;
        }
        if (obj instanceof Integer) {
            return jVar.u0(new P(jVar, ((Number) obj).intValue()), f12163d);
        }
        AbstractC2855l.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((U0) obj).B(jVar);
    }
}
