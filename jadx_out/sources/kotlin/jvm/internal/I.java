package kotlin.jvm.internal;

import i7.InterfaceC2740c;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import w7.InterfaceC3487a;
import w7.InterfaceC3488b;
import w7.InterfaceC3489c;
import w7.InterfaceC3490d;
import w7.InterfaceC3491e;
import w7.InterfaceC3492f;
import w7.InterfaceC3493g;
import w7.InterfaceC3494h;
import x7.InterfaceC3550a;
import x7.InterfaceC3551b;
import x7.InterfaceC3552c;
import x7.InterfaceC3553d;
import x7.InterfaceC3554e;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class I {
    public static Collection a(Object obj) {
        if ((obj instanceof InterfaceC3550a) && !(obj instanceof InterfaceC3551b)) {
            o(obj, "kotlin.collections.MutableCollection");
        }
        return f(obj);
    }

    public static Iterable b(Object obj) {
        if ((obj instanceof InterfaceC3550a) && !(obj instanceof InterfaceC3552c)) {
            o(obj, "kotlin.collections.MutableIterable");
        }
        return g(obj);
    }

    public static Map c(Object obj) {
        if ((obj instanceof InterfaceC3550a) && !(obj instanceof InterfaceC3553d)) {
            o(obj, "kotlin.collections.MutableMap");
        }
        return h(obj);
    }

    public static Set d(Object obj) {
        if ((obj instanceof InterfaceC3550a) && !(obj instanceof InterfaceC3554e)) {
            o(obj, "kotlin.collections.MutableSet");
        }
        return i(obj);
    }

    public static Object e(Object obj, int i10) {
        if (obj != null && !k(obj, i10)) {
            o(obj, "kotlin.jvm.functions.Function" + i10);
        }
        return obj;
    }

    public static Collection f(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e10) {
            throw n(e10);
        }
    }

    public static Iterable g(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e10) {
            throw n(e10);
        }
    }

    public static Map h(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e10) {
            throw n(e10);
        }
    }

    public static Set i(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e10) {
            throw n(e10);
        }
    }

    public static int j(Object obj) {
        if (obj instanceof InterfaceC2851h) {
            return ((InterfaceC2851h) obj).getArity();
        }
        if (obj instanceof InterfaceC3487a) {
            return 0;
        }
        if (obj instanceof Function1) {
            return 1;
        }
        if (obj instanceof Function2) {
            return 2;
        }
        if (obj instanceof w7.o) {
            return 3;
        }
        if (obj instanceof w7.p) {
            return 4;
        }
        if (obj instanceof w7.q) {
            return 5;
        }
        if (obj instanceof w7.r) {
            return 6;
        }
        if (obj instanceof w7.s) {
            return 7;
        }
        if (obj instanceof w7.t) {
            return 8;
        }
        if (obj instanceof w7.u) {
            return 9;
        }
        if (obj instanceof InterfaceC3488b) {
            return 10;
        }
        if (obj instanceof InterfaceC3489c) {
            return 11;
        }
        if (obj instanceof InterfaceC3490d) {
            return 12;
        }
        if (obj instanceof InterfaceC3491e) {
            return 13;
        }
        if (obj instanceof InterfaceC3492f) {
            return 14;
        }
        if (obj instanceof InterfaceC3493g) {
            return 15;
        }
        if (obj instanceof InterfaceC3494h) {
            return 16;
        }
        if (obj instanceof w7.i) {
            return 17;
        }
        if (obj instanceof w7.j) {
            return 18;
        }
        if (obj instanceof w7.k) {
            return 19;
        }
        if (obj instanceof w7.l) {
            return 20;
        }
        if (obj instanceof w7.m) {
            return 21;
        }
        return obj instanceof w7.n ? 22 : -1;
    }

    public static boolean k(Object obj, int i10) {
        return (obj instanceof InterfaceC2740c) && j(obj) == i10;
    }

    public static boolean l(Object obj) {
        if (obj instanceof Map) {
            return !(obj instanceof InterfaceC3550a) || (obj instanceof InterfaceC3553d);
        }
        return false;
    }

    private static Throwable m(Throwable th) {
        return AbstractC2855l.o(th, I.class.getName());
    }

    public static ClassCastException n(ClassCastException classCastException) {
        throw ((ClassCastException) m(classCastException));
    }

    public static void o(Object obj, String str) {
        p((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    public static void p(String str) {
        throw n(new ClassCastException(str));
    }
}
