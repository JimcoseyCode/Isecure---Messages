package K7;

import I7.o;
import J7.f;
import j7.AbstractC2800q;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import k8.b;
import kotlin.jvm.internal.AbstractC2855l;
import t8.EnumC3382e;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f7110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f7111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f7112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f7113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f7114e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final k8.b f7115f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final k8.c f7116g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final k8.b f7117h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final k8.b f7118i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final k8.b f7119j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final HashMap f7120k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final HashMap f7121l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final HashMap f7122m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final HashMap f7123n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final HashMap f7124o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final HashMap f7125p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final List f7126q;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final k8.b f7127a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final k8.b f7128b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final k8.b f7129c;

        public a(k8.b javaClass, k8.b kotlinReadOnly, k8.b kotlinMutable) {
            AbstractC2855l.g(javaClass, "javaClass");
            AbstractC2855l.g(kotlinReadOnly, "kotlinReadOnly");
            AbstractC2855l.g(kotlinMutable, "kotlinMutable");
            this.f7127a = javaClass;
            this.f7128b = kotlinReadOnly;
            this.f7129c = kotlinMutable;
        }

        public final k8.b a() {
            return this.f7127a;
        }

        public final k8.b b() {
            return this.f7128b;
        }

        public final k8.b c() {
            return this.f7129c;
        }

        public final k8.b d() {
            return this.f7127a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC2855l.b(this.f7127a, aVar.f7127a) && AbstractC2855l.b(this.f7128b, aVar.f7128b) && AbstractC2855l.b(this.f7129c, aVar.f7129c);
        }

        public int hashCode() {
            return (((this.f7127a.hashCode() * 31) + this.f7128b.hashCode()) * 31) + this.f7129c.hashCode();
        }

        public String toString() {
            return "PlatformMutabilityMapping(javaClass=" + this.f7127a + ", kotlinReadOnly=" + this.f7128b + ", kotlinMutable=" + this.f7129c + ')';
        }
    }

    static {
        c cVar = new c();
        f7110a = cVar;
        StringBuilder sb = new StringBuilder();
        f.a aVar = f.a.f6828e;
        sb.append(aVar.b());
        sb.append('.');
        sb.append(aVar.a());
        f7111b = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        f.b bVar = f.b.f6829e;
        sb2.append(bVar.b());
        sb2.append('.');
        sb2.append(bVar.a());
        f7112c = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        f.d dVar = f.d.f6831e;
        sb3.append(dVar.b());
        sb3.append('.');
        sb3.append(dVar.a());
        f7113d = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        f.c cVar2 = f.c.f6830e;
        sb4.append(cVar2.b());
        sb4.append('.');
        sb4.append(cVar2.a());
        f7114e = sb4.toString();
        b.a aVar2 = k8.b.f29200d;
        k8.b bVarC = aVar2.c(new k8.c("kotlin.jvm.functions.FunctionN"));
        f7115f = bVarC;
        f7116g = bVarC.a();
        k8.i iVar = k8.i.f29276a;
        f7117h = iVar.k();
        f7118i = iVar.j();
        f7119j = cVar.g(Class.class);
        f7120k = new HashMap();
        f7121l = new HashMap();
        f7122m = new HashMap();
        f7123n = new HashMap();
        f7124o = new HashMap();
        f7125p = new HashMap();
        k8.b bVarC2 = aVar2.c(o.a.f5179W);
        a aVar3 = new a(cVar.g(Iterable.class), bVarC2, new k8.b(bVarC2.f(), k8.e.g(o.a.f5192e0, bVarC2.f()), false));
        k8.b bVarC3 = aVar2.c(o.a.f5178V);
        a aVar4 = new a(cVar.g(Iterator.class), bVarC3, new k8.b(bVarC3.f(), k8.e.g(o.a.f5190d0, bVarC3.f()), false));
        k8.b bVarC4 = aVar2.c(o.a.f5180X);
        a aVar5 = new a(cVar.g(Collection.class), bVarC4, new k8.b(bVarC4.f(), k8.e.g(o.a.f5194f0, bVarC4.f()), false));
        k8.b bVarC5 = aVar2.c(o.a.f5181Y);
        a aVar6 = new a(cVar.g(List.class), bVarC5, new k8.b(bVarC5.f(), k8.e.g(o.a.f5196g0, bVarC5.f()), false));
        k8.b bVarC6 = aVar2.c(o.a.f5184a0);
        a aVar7 = new a(cVar.g(Set.class), bVarC6, new k8.b(bVarC6.f(), k8.e.g(o.a.f5200i0, bVarC6.f()), false));
        k8.b bVarC7 = aVar2.c(o.a.f5182Z);
        a aVar8 = new a(cVar.g(ListIterator.class), bVarC7, new k8.b(bVarC7.f(), k8.e.g(o.a.f5198h0, bVarC7.f()), false));
        k8.c cVar3 = o.a.f5186b0;
        k8.b bVarC8 = aVar2.c(cVar3);
        a aVar9 = new a(cVar.g(Map.class), bVarC8, new k8.b(bVarC8.f(), k8.e.g(o.a.f5202j0, bVarC8.f()), false));
        k8.b bVarC9 = aVar2.c(cVar3);
        k8.f fVarG = o.a.f5188c0.g();
        AbstractC2855l.f(fVarG, "shortName(...)");
        k8.b bVarD = bVarC9.d(fVarG);
        List listM = AbstractC2800q.m(aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, new a(cVar.g(Map.Entry.class), bVarD, new k8.b(bVarD.f(), k8.e.g(o.a.f5204k0, bVarD.f()), false)));
        f7126q = listM;
        cVar.f(Object.class, o.a.f5185b);
        cVar.f(String.class, o.a.f5197h);
        cVar.f(CharSequence.class, o.a.f5195g);
        cVar.e(Throwable.class, o.a.f5223u);
        cVar.f(Cloneable.class, o.a.f5189d);
        cVar.f(Number.class, o.a.f5217r);
        cVar.e(Comparable.class, o.a.f5225v);
        cVar.f(Enum.class, o.a.f5219s);
        cVar.e(Annotation.class, o.a.f5154G);
        Iterator it = listM.iterator();
        while (it.hasNext()) {
            f7110a.d((a) it.next());
        }
        for (EnumC3382e enumC3382e : EnumC3382e.values()) {
            c cVar4 = f7110a;
            b.a aVar10 = k8.b.f29200d;
            k8.c cVarR = enumC3382e.r();
            AbstractC2855l.f(cVarR, "getWrapperFqName(...)");
            k8.b bVarC10 = aVar10.c(cVarR);
            I7.l lVarQ = enumC3382e.q();
            AbstractC2855l.f(lVarQ, "getPrimitiveType(...)");
            cVar4.a(bVarC10, aVar10.c(I7.o.c(lVarQ)));
        }
        for (k8.b bVar2 : I7.d.f5056a.a()) {
            f7110a.a(k8.b.f29200d.c(new k8.c("kotlin.jvm.internal." + bVar2.h().j() + "CompanionObject")), bVar2.d(k8.h.f29223d));
        }
        for (int i10 = 0; i10 < 23; i10++) {
            c cVar5 = f7110a;
            cVar5.a(k8.b.f29200d.c(new k8.c("kotlin.jvm.functions.Function" + i10)), I7.o.a(i10));
            cVar5.c(new k8.c(f7112c + i10), f7117h);
        }
        for (int i11 = 0; i11 < 22; i11++) {
            f.c cVar6 = f.c.f6830e;
            f7110a.c(new k8.c((cVar6.b() + '.' + cVar6.a()) + i11), f7117h);
        }
        c cVar7 = f7110a;
        k8.c cVarL = o.a.f5187c.l();
        AbstractC2855l.f(cVarL, "toSafe(...)");
        cVar7.c(cVarL, cVar7.g(Void.class));
    }

    private c() {
    }

    private final void a(k8.b bVar, k8.b bVar2) {
        b(bVar, bVar2);
        c(bVar2.a(), bVar);
    }

    private final void b(k8.b bVar, k8.b bVar2) {
        f7120k.put(bVar.a().j(), bVar2);
    }

    private final void c(k8.c cVar, k8.b bVar) {
        f7121l.put(cVar.j(), bVar);
    }

    private final void d(a aVar) {
        k8.b bVarA = aVar.a();
        k8.b bVarB = aVar.b();
        k8.b bVarC = aVar.c();
        a(bVarA, bVarB);
        c(bVarC.a(), bVarA);
        f7124o.put(bVarC, bVarB);
        f7125p.put(bVarB, bVarC);
        k8.c cVarA = bVarB.a();
        k8.c cVarA2 = bVarC.a();
        f7122m.put(bVarC.a().j(), cVarA);
        f7123n.put(cVarA.j(), cVarA2);
    }

    private final void e(Class cls, k8.c cVar) {
        a(g(cls), k8.b.f29200d.c(cVar));
    }

    private final void f(Class cls, k8.d dVar) {
        k8.c cVarL = dVar.l();
        AbstractC2855l.f(cVarL, "toSafe(...)");
        e(cls, cVarL);
    }

    private final k8.b g(Class cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            return k8.b.f29200d.c(new k8.c(cls.getCanonicalName()));
        }
        k8.b bVarG = g(declaringClass);
        k8.f fVarQ = k8.f.q(cls.getSimpleName());
        AbstractC2855l.f(fVarQ, "identifier(...)");
        return bVarG.d(fVarQ);
    }

    private final boolean j(k8.d dVar, String str) {
        Integer numN;
        String strB = dVar.b();
        AbstractC2855l.f(strB, "asString(...)");
        if (!P8.q.K(strB, str, false, 2, null)) {
            return false;
        }
        String strSubstring = strB.substring(str.length());
        AbstractC2855l.f(strSubstring, "substring(...)");
        return (P8.q.J0(strSubstring, '0', false, 2, null) || (numN = P8.q.n(strSubstring)) == null || numN.intValue() < 23) ? false : true;
    }

    public final k8.c h() {
        return f7116g;
    }

    public final List i() {
        return f7126q;
    }

    public final boolean k(k8.d dVar) {
        return f7122m.containsKey(dVar);
    }

    public final boolean l(k8.d dVar) {
        return f7123n.containsKey(dVar);
    }

    public final k8.b m(k8.c fqName) {
        AbstractC2855l.g(fqName, "fqName");
        return (k8.b) f7120k.get(fqName.j());
    }

    public final k8.b n(k8.d kotlinFqName) {
        AbstractC2855l.g(kotlinFqName, "kotlinFqName");
        return j(kotlinFqName, f7111b) ? f7115f : j(kotlinFqName, f7113d) ? f7115f : j(kotlinFqName, f7112c) ? f7117h : j(kotlinFqName, f7114e) ? f7117h : (k8.b) f7121l.get(kotlinFqName);
    }

    public final k8.c o(k8.d dVar) {
        return (k8.c) f7122m.get(dVar);
    }

    public final k8.c p(k8.d dVar) {
        return (k8.c) f7123n.get(dVar);
    }
}
