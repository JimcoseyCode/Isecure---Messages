package v8;

import j7.AbstractC2800q;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: v8.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3435d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f32955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f32956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f32957e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f32958f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f32959g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f32960h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f32961i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f32962j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f32963k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f32964l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f32965m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f32966n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C3435d f32967o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C3435d f32968p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C3435d f32969q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C3435d f32970r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C3435d f32971s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C3435d f32972t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C3435d f32973u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C3435d f32974v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final C3435d f32975w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final C3435d f32976x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final List f32977y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final List f32978z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f32979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f32980b;

    /* JADX INFO: renamed from: v8.d$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: v8.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        private static final class C0363a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f32981a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f32982b;

            public C0363a(int i10, String name) {
                AbstractC2855l.g(name, "name");
                this.f32981a = i10;
                this.f32982b = name;
            }

            public final int a() {
                return this.f32981a;
            }

            public final String b() {
                return this.f32982b;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int j() {
            int i10 = C3435d.f32956d;
            C3435d.f32956d <<= 1;
            return i10;
        }

        public final int b() {
            return C3435d.f32963k;
        }

        public final int c() {
            return C3435d.f32964l;
        }

        public final int d() {
            return C3435d.f32961i;
        }

        public final int e() {
            return C3435d.f32957e;
        }

        public final int f() {
            return C3435d.f32960h;
        }

        public final int g() {
            return C3435d.f32958f;
        }

        public final int h() {
            return C3435d.f32959g;
        }

        public final int i() {
            return C3435d.f32962j;
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        a.C0363a c0363a;
        a.C0363a c0363a2;
        a aVar = new a(null);
        f32955c = aVar;
        f32956d = 1;
        int iJ = aVar.j();
        f32957e = iJ;
        int iJ2 = aVar.j();
        f32958f = iJ2;
        int iJ3 = aVar.j();
        f32959g = iJ3;
        int iJ4 = aVar.j();
        f32960h = iJ4;
        int iJ5 = aVar.j();
        f32961i = iJ5;
        int iJ6 = aVar.j();
        f32962j = iJ6;
        int iJ7 = aVar.j() - 1;
        f32963k = iJ7;
        int i10 = iJ | iJ2 | iJ3;
        f32964l = i10;
        int i11 = iJ2 | iJ5 | iJ6;
        f32965m = i11;
        int i12 = iJ5 | iJ6;
        f32966n = i12;
        int i13 = 2;
        f32967o = new C3435d(iJ7, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f32968p = new C3435d(i12, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f32969q = new C3435d(iJ, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f32970r = new C3435d(iJ2, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f32971s = new C3435d(iJ3, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f32972t = new C3435d(i10, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f32973u = new C3435d(iJ4, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f32974v = new C3435d(iJ5, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f32975w = new C3435d(iJ6, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f32976x = new C3435d(i11, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        Field[] fields = C3435d.class.getFields();
        AbstractC2855l.f(fields, "getFields(...)");
        ArrayList<Field> arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Field field2 : arrayList) {
            Object obj = field2.get(null);
            C3435d c3435d = obj instanceof C3435d ? (C3435d) obj : null;
            if (c3435d != null) {
                int i14 = c3435d.f32980b;
                String name = field2.getName();
                AbstractC2855l.f(name, "getName(...)");
                c0363a2 = new a.C0363a(i14, name);
            } else {
                c0363a2 = null;
            }
            if (c0363a2 != null) {
                arrayList2.add(c0363a2);
            }
        }
        f32977y = arrayList2;
        Field[] fields2 = C3435d.class.getFields();
        AbstractC2855l.f(fields2, "getFields(...)");
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList<Field> arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (AbstractC2855l.b(((Field) obj2).getType(), Integer.TYPE)) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Field field4 : arrayList4) {
            Object obj3 = field4.get(null);
            AbstractC2855l.e(obj3, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj3).intValue();
            if (iIntValue == ((-iIntValue) & iIntValue)) {
                String name2 = field4.getName();
                AbstractC2855l.f(name2, "getName(...)");
                c0363a = new a.C0363a(iIntValue, name2);
            } else {
                c0363a = null;
            }
            if (c0363a != null) {
                arrayList5.add(c0363a);
            }
        }
        f32978z = arrayList5;
    }

    public C3435d(int i10, List excludes) {
        AbstractC2855l.g(excludes, "excludes");
        this.f32979a = excludes;
        Iterator it = excludes.iterator();
        while (it.hasNext()) {
            i10 &= ~((AbstractC3434c) it.next()).a();
        }
        this.f32980b = i10;
    }

    public final boolean a(int i10) {
        return (i10 & this.f32980b) != 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AbstractC2855l.b(C3435d.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC2855l.e(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter");
        C3435d c3435d = (C3435d) obj;
        return AbstractC2855l.b(this.f32979a, c3435d.f32979a) && this.f32980b == c3435d.f32980b;
    }

    public int hashCode() {
        return (this.f32979a.hashCode() * 31) + this.f32980b;
    }

    public final List l() {
        return this.f32979a;
    }

    public final int m() {
        return this.f32980b;
    }

    public final C3435d n(int i10) {
        int i11 = i10 & this.f32980b;
        if (i11 == 0) {
            return null;
        }
        return new C3435d(i11, this.f32979a);
    }

    public String toString() {
        Object next;
        Iterator it = f32977y.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((a.C0363a) next).a() == this.f32980b) {
                break;
            }
        }
        a.C0363a c0363a = (a.C0363a) next;
        String strB = c0363a != null ? c0363a.b() : null;
        if (strB == null) {
            List<a.C0363a> list = f32978z;
            ArrayList arrayList = new ArrayList();
            for (a.C0363a c0363a2 : list) {
                String strB2 = a(c0363a2.a()) ? c0363a2.b() : null;
                if (strB2 != null) {
                    arrayList.add(strB2);
                }
            }
            strB = AbstractC2800q.o0(arrayList, " | ", null, null, 0, null, null, 62, null);
        }
        return "DescriptorKindFilter(" + strB + ", " + this.f32979a + ')';
    }

    public /* synthetic */ C3435d(int i10, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i11 & 2) != 0 ? AbstractC2800q.j() : list);
    }
}
