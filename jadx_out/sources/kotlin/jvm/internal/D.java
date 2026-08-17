package kotlin.jvm.internal;

import F7.b1;
import com.facebook.react.uimanager.events.PointerEventHelper;
import j7.AbstractC2793j;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final E f29372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C7.d[] f29373b;

    static {
        E e10 = null;
        try {
            e10 = (E) b1.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (e10 == null) {
            e10 = new E();
        }
        f29372a = e10;
        f29373b = new C7.d[0];
    }

    public static C7.g a(AbstractC2852i abstractC2852i) {
        return f29372a.a(abstractC2852i);
    }

    public static C7.d b(Class cls) {
        return f29372a.b(cls);
    }

    public static C7.f c(Class cls) {
        return f29372a.c(cls, PointerEventHelper.POINTER_TYPE_UNKNOWN);
    }

    public static C7.f d(Class cls, String str) {
        return f29372a.c(cls, str);
    }

    public static C7.i e(o oVar) {
        return f29372a.d(oVar);
    }

    public static C7.o f(Class cls) {
        return f29372a.j(b(cls), Collections.EMPTY_LIST, true);
    }

    public static C7.o g(Class cls, C7.q qVar) {
        return f29372a.j(b(cls), Collections.singletonList(qVar), true);
    }

    public static C7.o h(Class cls, C7.q qVar, C7.q qVar2) {
        return f29372a.j(b(cls), Arrays.asList(qVar, qVar2), true);
    }

    public static C7.o i(Class cls, C7.q... qVarArr) {
        return f29372a.j(b(cls), AbstractC2793j.v0(qVarArr), true);
    }

    public static C7.l j(s sVar) {
        return f29372a.e(sVar);
    }

    public static C7.m k(u uVar) {
        return f29372a.f(uVar);
    }

    public static C7.n l(w wVar) {
        return f29372a.g(wVar);
    }

    public static String m(InterfaceC2851h interfaceC2851h) {
        return f29372a.h(interfaceC2851h);
    }

    public static String n(n nVar) {
        return f29372a.i(nVar);
    }

    public static C7.o o(Class cls) {
        return f29372a.j(b(cls), Collections.EMPTY_LIST, false);
    }

    public static C7.o p(Class cls, C7.q qVar) {
        return f29372a.j(b(cls), Collections.singletonList(qVar), false);
    }

    public static C7.o q(Class cls, C7.q qVar, C7.q qVar2) {
        return f29372a.j(b(cls), Arrays.asList(qVar, qVar2), false);
    }
}
