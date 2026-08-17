package y1;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements y1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f33895a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f33896b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f33897c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f33898d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f33899e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f33900f;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class a implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f33901a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f33902b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Class f33903c;

        a(b bVar) {
            this.f33901a = bVar;
        }

        @Override // y1.m
        public void a() {
            this.f33901a.c(this);
        }

        void b(int i10, Class cls) {
            this.f33902b = i10;
            this.f33903c = cls;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f33902b == aVar.f33902b && this.f33903c == aVar.f33903c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i10 = this.f33902b * 31;
            Class cls = this.f33903c;
            return i10 + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return "Key{size=" + this.f33902b + "array=" + this.f33903c + '}';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class b extends c {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // y1.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a() {
            return new a(this);
        }

        a e(int i10, Class cls) {
            a aVar = (a) b();
            aVar.b(i10, cls);
            return aVar;
        }
    }

    public i(int i10) {
        this.f33899e = i10;
    }

    private void e(int i10, Class cls) {
        NavigableMap navigableMapL = l(cls);
        Integer num = (Integer) navigableMapL.get(Integer.valueOf(i10));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapL.remove(Integer.valueOf(i10));
                return;
            } else {
                navigableMapL.put(Integer.valueOf(i10), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i10 + ", this: " + this);
    }

    private void f() {
        g(this.f33899e);
    }

    private void g(int i10) {
        while (this.f33900f > i10) {
            Object objF = this.f33895a.f();
            Q1.k.e(objF);
            InterfaceC3609a interfaceC3609aH = h(objF);
            this.f33900f -= interfaceC3609aH.c(objF) * interfaceC3609aH.b();
            e(interfaceC3609aH.c(objF), objF.getClass());
            if (Log.isLoggable(interfaceC3609aH.a(), 2)) {
                interfaceC3609aH.a();
                interfaceC3609aH.c(objF);
            }
        }
    }

    private InterfaceC3609a h(Object obj) {
        return i(obj.getClass());
    }

    private InterfaceC3609a i(Class cls) {
        InterfaceC3609a fVar;
        InterfaceC3609a interfaceC3609a = (InterfaceC3609a) this.f33898d.get(cls);
        if (interfaceC3609a != null) {
            return interfaceC3609a;
        }
        if (cls.equals(int[].class)) {
            fVar = new h();
        } else {
            if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
            }
            fVar = new f();
        }
        this.f33898d.put(cls, fVar);
        return fVar;
    }

    private Object j(a aVar) {
        return this.f33895a.a(aVar);
    }

    private Object k(a aVar, Class cls) {
        InterfaceC3609a interfaceC3609aI = i(cls);
        Object objJ = j(aVar);
        if (objJ != null) {
            this.f33900f -= interfaceC3609aI.c(objJ) * interfaceC3609aI.b();
            e(interfaceC3609aI.c(objJ), cls);
        }
        if (objJ != null) {
            return objJ;
        }
        if (Log.isLoggable(interfaceC3609aI.a(), 2)) {
            interfaceC3609aI.a();
            int i10 = aVar.f33902b;
        }
        return interfaceC3609aI.newArray(aVar.f33902b);
    }

    private NavigableMap l(Class cls) {
        NavigableMap navigableMap = (NavigableMap) this.f33897c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f33897c.put(cls, treeMap);
        return treeMap;
    }

    private boolean m() {
        int i10 = this.f33900f;
        return i10 == 0 || this.f33899e / i10 >= 2;
    }

    private boolean n(int i10) {
        return i10 <= this.f33899e / 2;
    }

    private boolean o(int i10, Integer num) {
        if (num != null) {
            return m() || num.intValue() <= i10 * 8;
        }
        return false;
    }

    @Override // y1.b
    public synchronized void a(int i10) {
        try {
            if (i10 >= 40) {
                b();
            } else if (i10 >= 20 || i10 == 15) {
                g(this.f33899e / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // y1.b
    public synchronized void b() {
        g(0);
    }

    @Override // y1.b
    public synchronized Object c(int i10, Class cls) {
        return k(this.f33896b.e(i10, cls), cls);
    }

    @Override // y1.b
    public synchronized Object d(int i10, Class cls) {
        Integer num;
        try {
            num = (Integer) l(cls).ceilingKey(Integer.valueOf(i10));
        } catch (Throwable th) {
            throw th;
        }
        return k(o(i10, num) ? this.f33896b.e(num.intValue(), cls) : this.f33896b.e(i10, cls), cls);
    }

    @Override // y1.b
    public synchronized void put(Object obj) {
        Class<?> cls = obj.getClass();
        InterfaceC3609a interfaceC3609aI = i(cls);
        int iC = interfaceC3609aI.c(obj);
        int iB = interfaceC3609aI.b() * iC;
        if (n(iB)) {
            a aVarE = this.f33896b.e(iC, cls);
            this.f33895a.d(aVarE, obj);
            NavigableMap navigableMapL = l(cls);
            Integer num = (Integer) navigableMapL.get(Integer.valueOf(aVarE.f33902b));
            Integer numValueOf = Integer.valueOf(aVarE.f33902b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapL.put(numValueOf, Integer.valueOf(iIntValue));
            this.f33900f += iB;
            f();
        }
    }
}
