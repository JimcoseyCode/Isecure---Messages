package androidx.lifecycle;

import com.facebook.react.uimanager.events.PointerEventHelper;
import j7.AbstractC2800q;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2845b;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: androidx.lifecycle.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C1775w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1775w f17616a = new C1775w();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f17617b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f17618c = new HashMap();

    private C1775w() {
    }

    private final InterfaceC1761h a(Constructor constructor, Object obj) {
        try {
            Object objNewInstance = constructor.newInstance(obj);
            AbstractC2855l.d(objNewInstance);
            android.support.v4.media.session.b.a(objNewInstance);
            return null;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    private final Constructor b(Class cls) {
        try {
            Package r02 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r02 != null ? r02.getName() : PointerEventHelper.POINTER_TYPE_UNKNOWN;
            AbstractC2855l.d(name);
            if (name.length() != 0) {
                AbstractC2855l.d(canonicalName);
                canonicalName = canonicalName.substring(name.length() + 1);
                AbstractC2855l.f(canonicalName, "substring(...)");
            }
            AbstractC2855l.d(canonicalName);
            String strC = c(canonicalName);
            if (name.length() != 0) {
                strC = name + '.' + strC;
            }
            Class<?> cls2 = Class.forName(strC);
            AbstractC2855l.e(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor<?> declaredConstructor = cls2.getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static final String c(String className) {
        AbstractC2855l.g(className, "className");
        return P8.q.E(className, ".", "_", false, 4, null) + "_LifecycleAdapter";
    }

    private final int d(Class cls) {
        Map map = f17617b;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int iG = g(cls);
        map.put(cls, Integer.valueOf(iG));
        return iG;
    }

    private final boolean e(Class cls) {
        return cls != null && InterfaceC1770q.class.isAssignableFrom(cls);
    }

    public static final InterfaceC1768o f(Object object) {
        AbstractC2855l.g(object, "object");
        boolean z10 = object instanceof InterfaceC1768o;
        boolean z11 = object instanceof InterfaceC1758e;
        if (z10 && z11) {
            return new C1759f((InterfaceC1758e) object, (InterfaceC1768o) object);
        }
        if (z11) {
            return new C1759f((InterfaceC1758e) object, null);
        }
        if (z10) {
            return (InterfaceC1768o) object;
        }
        Class<?> cls = object.getClass();
        C1775w c1775w = f17616a;
        if (c1775w.d(cls) != 2) {
            return new F(object);
        }
        Object obj = f17618c.get(cls);
        AbstractC2855l.d(obj);
        List list = (List) obj;
        if (list.size() == 1) {
            c1775w.a((Constructor) list.get(0), object);
            return new S(null);
        }
        int size = list.size();
        InterfaceC1761h[] interfaceC1761hArr = new InterfaceC1761h[size];
        for (int i10 = 0; i10 < size; i10++) {
            f17616a.a((Constructor) list.get(i10), object);
            interfaceC1761hArr[i10] = null;
        }
        return new C1757d(interfaceC1761hArr);
    }

    private final int g(Class cls) {
        ArrayList arrayList;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor constructorB = b(cls);
        if (constructorB != null) {
            f17618c.put(cls, AbstractC2800q.e(constructorB));
            return 2;
        }
        if (C1756c.f17573c.d(cls)) {
            return 1;
        }
        Class superclass = cls.getSuperclass();
        if (e(superclass)) {
            AbstractC2855l.d(superclass);
            if (d(superclass) == 1) {
                return 1;
            }
            Object obj = f17618c.get(superclass);
            AbstractC2855l.d(obj);
            arrayList = new ArrayList((Collection) obj);
        } else {
            arrayList = null;
        }
        Iterator itA = AbstractC2845b.a(cls.getInterfaces());
        while (itA.hasNext()) {
            Class cls2 = (Class) itA.next();
            if (e(cls2)) {
                AbstractC2855l.d(cls2);
                if (d(cls2) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                Object obj2 = f17618c.get(cls2);
                AbstractC2855l.d(obj2);
                arrayList.addAll((Collection) obj2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        f17618c.put(cls, arrayList);
        return 2;
    }
}
