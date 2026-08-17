package m8;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m8.AbstractC2942a;
import m8.AbstractC2951j;
import m8.C2949h;
import m8.p;
import m8.y;

/* JADX INFO: renamed from: m8.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2950i extends AbstractC2942a implements Serializable {

    /* JADX INFO: renamed from: m8.i$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f29674a;

        static {
            int[] iArr = new int[y.c.values().length];
            f29674a = iArr;
            try {
                iArr[y.c.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29674a[y.c.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: m8.i$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class b extends AbstractC2942a.AbstractC0318a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private AbstractC2945d f29675g = AbstractC2945d.f29639g;

        protected b() {
        }

        public final AbstractC2945d i() {
            return this.f29675g;
        }

        public abstract b j(AbstractC2950i abstractC2950i);

        public final b k(AbstractC2945d abstractC2945d) {
            this.f29675g = abstractC2945d;
            return this;
        }
    }

    /* JADX INFO: renamed from: m8.i$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class c extends b implements q {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private C2949h f29676h = C2949h.g();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f29677i;

        protected c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C2949h m() {
            this.f29676h.q();
            this.f29677i = false;
            return this.f29676h;
        }

        private void n() {
            if (this.f29677i) {
                return;
            }
            this.f29676h = this.f29676h.clone();
            this.f29677i = true;
        }

        protected final void o(d dVar) {
            n();
            this.f29676h.r(dVar.f29678h);
        }
    }

    /* JADX INFO: renamed from: m8.i$e */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class e implements C2949h.b {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final AbstractC2951j.b f29683g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final int f29684h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final y.b f29685i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final boolean f29686j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final boolean f29687k;

        e(AbstractC2951j.b bVar, int i10, y.b bVar2, boolean z10, boolean z11) {
            this.f29683g = bVar;
            this.f29684h = i10;
            this.f29685i = bVar2;
            this.f29686j = z10;
            this.f29687k = z11;
        }

        @Override // m8.C2949h.b
        public int a() {
            return this.f29684h;
        }

        @Override // m8.C2949h.b
        public boolean c() {
            return this.f29686j;
        }

        @Override // m8.C2949h.b
        public y.b d() {
            return this.f29685i;
        }

        @Override // m8.C2949h.b
        public boolean g() {
            return this.f29687k;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public int compareTo(e eVar) {
            return this.f29684h - eVar.f29684h;
        }

        @Override // m8.C2949h.b
        public p.a i(p.a aVar, p pVar) {
            return ((b) aVar).j((AbstractC2950i) pVar);
        }

        public AbstractC2951j.b j() {
            return this.f29683g;
        }

        @Override // m8.C2949h.b
        public y.c o() {
            return this.f29685i.h();
        }
    }

    /* JADX INFO: renamed from: m8.i$f */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final p f29688a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object f29689b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final p f29690c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final e f29691d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final Class f29692e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final Method f29693f;

        f(p pVar, Object obj, p pVar2, e eVar, Class cls) {
            if (pVar == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (eVar.d() == y.b.f29756s && pVar2 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.f29688a = pVar;
            this.f29689b = obj;
            this.f29690c = pVar2;
            this.f29691d = eVar;
            this.f29692e = cls;
            if (AbstractC2951j.a.class.isAssignableFrom(cls)) {
                this.f29693f = AbstractC2950i.j(cls, "valueOf", Integer.TYPE);
            } else {
                this.f29693f = null;
            }
        }

        Object a(Object obj) {
            if (!this.f29691d.c()) {
                return e(obj);
            }
            if (this.f29691d.o() != y.c.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(e(it.next()));
            }
            return arrayList;
        }

        public p b() {
            return this.f29688a;
        }

        public p c() {
            return this.f29690c;
        }

        public int d() {
            return this.f29691d.a();
        }

        Object e(Object obj) {
            return this.f29691d.o() == y.c.ENUM ? AbstractC2950i.k(this.f29693f, null, (Integer) obj) : obj;
        }

        Object f(Object obj) {
            return this.f29691d.o() == y.c.ENUM ? Integer.valueOf(((AbstractC2951j.a) obj).a()) : obj;
        }
    }

    protected AbstractC2950i() {
    }

    static Method j(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e10) {
            String name = cls.getName();
            String strValueOf = String.valueOf(str);
            StringBuilder sb = new StringBuilder(name.length() + 45 + strValueOf.length());
            sb.append("Generated message class \"");
            sb.append(name);
            sb.append("\" missing method \"");
            sb.append(strValueOf);
            sb.append("\".");
            throw new RuntimeException(sb.toString(), e10);
        }
    }

    static Object k(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static f m(p pVar, p pVar2, AbstractC2951j.b bVar, int i10, y.b bVar2, boolean z10, Class cls) {
        return new f(pVar, Collections.EMPTY_LIST, pVar2, new e(bVar, i10, bVar2, true, z10), cls);
    }

    public static f n(p pVar, Object obj, p pVar2, AbstractC2951j.b bVar, int i10, y.b bVar2, Class cls) {
        return new f(pVar, obj, pVar2, new e(bVar, i10, bVar2, false, false), cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean p(C2949h c2949h, p pVar, C2946e c2946e, C2947f c2947f, C2948g c2948g, int i10) throws C2952k {
        boolean z10;
        boolean z11;
        Object objBuild;
        p pVar2;
        int iB = y.b(i10);
        f fVarB = c2948g.b(pVar, y.a(i10));
        if (fVarB != null) {
            if (iB == C2949h.l(fVarB.f29691d.d(), false)) {
                z11 = false;
                z10 = false;
            } else {
                e eVar = fVarB.f29691d;
                if (eVar.f29686j && eVar.f29685i.k() && iB == C2949h.l(fVarB.f29691d.d(), true)) {
                    z10 = true;
                    z11 = false;
                } else {
                    z11 = true;
                    z10 = false;
                }
            }
        }
        if (z11) {
            return c2946e.O(i10, c2947f);
        }
        if (z10) {
            int i11 = c2946e.i(c2946e.z());
            if (fVarB.f29691d.d() == y.b.f29759v) {
                while (c2946e.e() > 0) {
                    AbstractC2951j.a aVarA = fVarB.f29691d.j().a(c2946e.m());
                    if (aVarA == null) {
                        return true;
                    }
                    c2949h.a(fVarB.f29691d, fVarB.f(aVarA));
                }
            } else {
                while (c2946e.e() > 0) {
                    c2949h.a(fVarB.f29691d, C2949h.u(c2946e, fVarB.f29691d.d(), false));
                }
            }
            c2946e.h(i11);
        } else {
            int i12 = a.f29674a[fVarB.f29691d.o().ordinal()];
            if (i12 == 1) {
                p.a aVarF = (fVarB.f29691d.c() || (pVar2 = (p) c2949h.h(fVarB.f29691d)) == null) ? null : pVar2.f();
                if (aVarF == null) {
                    aVarF = fVarB.c().c();
                }
                if (fVarB.f29691d.d() == y.b.f29755r) {
                    c2946e.q(fVarB.d(), aVarF, c2948g);
                } else {
                    c2946e.u(aVarF, c2948g);
                }
                objBuild = aVarF.build();
            } else if (i12 != 2) {
                objBuild = C2949h.u(c2946e, fVarB.f29691d.d(), false);
            } else {
                int iM = c2946e.m();
                AbstractC2951j.a aVarA2 = fVarB.f29691d.j().a(iM);
                if (aVarA2 == null) {
                    c2947f.n0(i10);
                    c2947f.x0(iM);
                    return true;
                }
                objBuild = aVarA2;
            }
            if (fVarB.f29691d.c()) {
                c2949h.a(fVarB.f29691d, fVarB.f(objBuild));
            } else {
                c2949h.v(fVarB.f29691d, fVarB.f(objBuild));
            }
        }
        return true;
    }

    protected boolean o(C2946e c2946e, C2947f c2947f, C2948g c2948g, int i10) {
        return c2946e.O(i10, c2947f);
    }

    /* JADX INFO: renamed from: m8.i$d */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class d extends AbstractC2950i implements q {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final C2949h f29678h;

        /* JADX INFO: renamed from: m8.i$d$a */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        protected class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Iterator f29679a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Map.Entry f29680b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final boolean f29681c;

            /* synthetic */ a(d dVar, boolean z10, a aVar) {
                this(z10);
            }

            public void a(int i10, C2947f c2947f) {
                while (true) {
                    Map.Entry entry = this.f29680b;
                    if (entry == null || ((e) entry.getKey()).a() >= i10) {
                        return;
                    }
                    e eVar = (e) this.f29680b.getKey();
                    if (this.f29681c && eVar.o() == y.c.MESSAGE && !eVar.c()) {
                        c2947f.e0(eVar.a(), (p) this.f29680b.getValue());
                    } else {
                        C2949h.z(eVar, this.f29680b.getValue(), c2947f);
                    }
                    if (this.f29679a.hasNext()) {
                        this.f29680b = (Map.Entry) this.f29679a.next();
                    } else {
                        this.f29680b = null;
                    }
                }
            }

            private a(boolean z10) {
                Iterator itP = d.this.f29678h.p();
                this.f29679a = itP;
                if (itP.hasNext()) {
                    this.f29680b = (Map.Entry) itP.next();
                }
                this.f29681c = z10;
            }
        }

        protected d() {
            this.f29678h = C2949h.t();
        }

        private void y(f fVar) {
            if (fVar.b() != a()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        @Override // m8.AbstractC2950i
        protected void l() {
            this.f29678h.q();
        }

        @Override // m8.AbstractC2950i
        protected boolean o(C2946e c2946e, C2947f c2947f, C2948g c2948g, int i10) {
            return AbstractC2950i.p(this.f29678h, a(), c2946e, c2947f, c2948g, i10);
        }

        protected boolean r() {
            return this.f29678h.n();
        }

        protected int s() {
            return this.f29678h.k();
        }

        public final Object t(f fVar) {
            y(fVar);
            Object objH = this.f29678h.h(fVar.f29691d);
            return objH == null ? fVar.f29689b : fVar.a(objH);
        }

        public final Object u(f fVar, int i10) {
            y(fVar);
            return fVar.e(this.f29678h.i(fVar.f29691d, i10));
        }

        public final int v(f fVar) {
            y(fVar);
            return this.f29678h.j(fVar.f29691d);
        }

        public final boolean w(f fVar) {
            y(fVar);
            return this.f29678h.m(fVar.f29691d);
        }

        protected a x() {
            return new a(this, false, null);
        }

        protected d(c cVar) {
            this.f29678h = cVar.m();
        }
    }

    protected AbstractC2950i(b bVar) {
    }

    protected void l() {
    }
}
