package com.google.gson;

import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final R5.a f24342v = R5.a.a(Object.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ThreadLocal f24343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f24344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final N5.c f24345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final O5.d f24346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final List f24347e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final N5.d f24348f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final com.google.gson.c f24349g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Map f24350h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final boolean f24351i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final boolean f24352j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final boolean f24353k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final boolean f24354l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final boolean f24355m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final boolean f24356n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final boolean f24357o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final String f24358p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final int f24359q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final int f24360r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final m f24361s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final List f24362t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    final List f24363u;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends n {
        a() {
        }

        @Override // com.google.gson.n
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Double b(S5.a aVar) throws IOException {
            if (aVar.D0() != S5.b.NULL) {
                return Double.valueOf(aVar.g0());
            }
            aVar.u0();
            return null;
        }

        @Override // com.google.gson.n
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(S5.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.X();
            } else {
                d.d(number.doubleValue());
                cVar.J0(number);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b extends n {
        b() {
        }

        @Override // com.google.gson.n
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Float b(S5.a aVar) throws IOException {
            if (aVar.D0() != S5.b.NULL) {
                return Float.valueOf((float) aVar.g0());
            }
            aVar.u0();
            return null;
        }

        @Override // com.google.gson.n
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(S5.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.X();
            } else {
                d.d(number.floatValue());
                cVar.J0(number);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class c extends n {
        c() {
        }

        @Override // com.google.gson.n
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(S5.a aVar) throws IOException {
            if (aVar.D0() != S5.b.NULL) {
                return Long.valueOf(aVar.k0());
            }
            aVar.u0();
            return null;
        }

        @Override // com.google.gson.n
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(S5.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.X();
            } else {
                cVar.K0(number.toString());
            }
        }
    }

    /* JADX INFO: renamed from: com.google.gson.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class C0233d extends n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f24366a;

        C0233d(n nVar) {
            this.f24366a = nVar;
        }

        @Override // com.google.gson.n
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicLong b(S5.a aVar) {
            return new AtomicLong(((Number) this.f24366a.b(aVar)).longValue());
        }

        @Override // com.google.gson.n
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(S5.c cVar, AtomicLong atomicLong) {
            this.f24366a.d(cVar, Long.valueOf(atomicLong.get()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class e extends n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f24367a;

        e(n nVar) {
            this.f24367a = nVar;
        }

        @Override // com.google.gson.n
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicLongArray b(S5.a aVar) throws IOException {
            ArrayList arrayList = new ArrayList();
            aVar.d();
            while (aVar.J()) {
                arrayList.add(Long.valueOf(((Number) this.f24367a.b(aVar)).longValue()));
            }
            aVar.s();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i10 = 0; i10 < size; i10++) {
                atomicLongArray.set(i10, ((Long) arrayList.get(i10)).longValue());
            }
            return atomicLongArray;
        }

        @Override // com.google.gson.n
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(S5.c cVar, AtomicLongArray atomicLongArray) throws IOException {
            cVar.k();
            int length = atomicLongArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                this.f24367a.d(cVar, Long.valueOf(atomicLongArray.get(i10)));
            }
            cVar.s();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class f extends n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private n f24368a;

        f() {
        }

        @Override // com.google.gson.n
        public Object b(S5.a aVar) {
            n nVar = this.f24368a;
            if (nVar != null) {
                return nVar.b(aVar);
            }
            throw new IllegalStateException();
        }

        @Override // com.google.gson.n
        public void d(S5.c cVar, Object obj) {
            n nVar = this.f24368a;
            if (nVar == null) {
                throw new IllegalStateException();
            }
            nVar.d(cVar, obj);
        }

        public void e(n nVar) {
            if (this.f24368a != null) {
                throw new AssertionError();
            }
            this.f24368a = nVar;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d() {
        N5.d dVar = N5.d.f8104m;
        com.google.gson.b bVar = com.google.gson.b.f24335g;
        Map map = Collections.EMPTY_MAP;
        m mVar = m.f24373g;
        List list = Collections.EMPTY_LIST;
        this(dVar, bVar, map, false, false, false, true, false, false, false, mVar, null, 2, 2, list, list, list);
    }

    private static void a(Object obj, S5.a aVar) {
        if (obj != null) {
            try {
                if (aVar.D0() == S5.b.END_DOCUMENT) {
                } else {
                    throw new g("JSON document was not fully consumed.");
                }
            } catch (S5.d e10) {
                throw new l(e10);
            } catch (IOException e11) {
                throw new g(e11);
            }
        }
    }

    private static n b(n nVar) {
        return new C0233d(nVar).a();
    }

    private static n c(n nVar) {
        return new e(nVar).a();
    }

    static void d(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    private n e(boolean z10) {
        return z10 ? O5.l.f8308v : new a();
    }

    private n f(boolean z10) {
        return z10 ? O5.l.f8307u : new b();
    }

    private static n n(m mVar) {
        return mVar == m.f24373g ? O5.l.f8306t : new c();
    }

    public Object g(S5.a aVar, Type type) {
        boolean zM = aVar.M();
        boolean z10 = true;
        aVar.N0(true);
        try {
            try {
                try {
                    aVar.D0();
                    z10 = false;
                    return k(R5.a.b(type)).b(aVar);
                } catch (EOFException e10) {
                    if (!z10) {
                        throw new l(e10);
                    }
                    aVar.N0(zM);
                    return null;
                } catch (IllegalStateException e11) {
                    throw new l(e11);
                }
            } catch (IOException e12) {
                throw new l(e12);
            } catch (AssertionError e13) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e13.getMessage());
                assertionError.initCause(e13);
                throw assertionError;
            }
        } finally {
            aVar.N0(zM);
        }
    }

    public Object h(Reader reader, Type type) {
        S5.a aVarO = o(reader);
        Object objG = g(aVarO, type);
        a(objG, aVarO);
        return objG;
    }

    public Object i(String str, Class cls) {
        return N5.k.b(cls).cast(j(str, cls));
    }

    public Object j(String str, Type type) {
        if (str == null) {
            return null;
        }
        return h(new StringReader(str), type);
    }

    public n k(R5.a aVar) {
        boolean z10;
        n nVar = (n) this.f24344b.get(aVar == null ? f24342v : aVar);
        if (nVar != null) {
            return nVar;
        }
        Map map = (Map) this.f24343a.get();
        if (map == null) {
            map = new HashMap();
            this.f24343a.set(map);
            z10 = true;
        } else {
            z10 = false;
        }
        f fVar = (f) map.get(aVar);
        if (fVar != null) {
            return fVar;
        }
        try {
            f fVar2 = new f();
            map.put(aVar, fVar2);
            Iterator it = this.f24347e.iterator();
            while (it.hasNext()) {
                n nVarA = ((o) it.next()).a(this, aVar);
                if (nVarA != null) {
                    fVar2.e(nVarA);
                    this.f24344b.put(aVar, nVarA);
                    return nVarA;
                }
            }
            throw new IllegalArgumentException("GSON (2.8.6) cannot handle " + aVar);
        } finally {
            map.remove(aVar);
            if (z10) {
                this.f24343a.remove();
            }
        }
    }

    public n l(Class cls) {
        return k(R5.a.a(cls));
    }

    public n m(o oVar, R5.a aVar) {
        if (!this.f24347e.contains(oVar)) {
            oVar = this.f24346d;
        }
        boolean z10 = false;
        for (o oVar2 : this.f24347e) {
            if (z10) {
                n nVarA = oVar2.a(this, aVar);
                if (nVarA != null) {
                    return nVarA;
                }
            } else if (oVar2 == oVar) {
                z10 = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    public S5.a o(Reader reader) {
        S5.a aVar = new S5.a(reader);
        aVar.N0(this.f24356n);
        return aVar;
    }

    public S5.c p(Writer writer) throws IOException {
        if (this.f24353k) {
            writer.write(")]}'\n");
        }
        S5.c cVar = new S5.c(writer);
        if (this.f24355m) {
            cVar.t0("  ");
        }
        cVar.w0(this.f24351i);
        return cVar;
    }

    public String q(com.google.gson.f fVar) {
        StringWriter stringWriter = new StringWriter();
        u(fVar, stringWriter);
        return stringWriter.toString();
    }

    public String r(Object obj) {
        return obj == null ? q(h.f24370g) : s(obj, obj.getClass());
    }

    public String s(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        w(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public void t(com.google.gson.f fVar, S5.c cVar) {
        boolean zJ = cVar.J();
        cVar.u0(true);
        boolean zI = cVar.I();
        cVar.l0(this.f24354l);
        boolean zB = cVar.B();
        cVar.w0(this.f24351i);
        try {
            try {
                N5.l.a(fVar, cVar);
            } catch (IOException e10) {
                throw new g(e10);
            } catch (AssertionError e11) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e11.getMessage());
                assertionError.initCause(e11);
                throw assertionError;
            }
        } finally {
            cVar.u0(zJ);
            cVar.l0(zI);
            cVar.w0(zB);
        }
    }

    public String toString() {
        return "{serializeNulls:" + this.f24351i + ",factories:" + this.f24347e + ",instanceCreators:" + this.f24345c + "}";
    }

    public void u(com.google.gson.f fVar, Appendable appendable) {
        try {
            t(fVar, p(N5.l.b(appendable)));
        } catch (IOException e10) {
            throw new g(e10);
        }
    }

    public void v(Object obj, Type type, S5.c cVar) {
        n nVarK = k(R5.a.b(type));
        boolean zJ = cVar.J();
        cVar.u0(true);
        boolean zI = cVar.I();
        cVar.l0(this.f24354l);
        boolean zB = cVar.B();
        cVar.w0(this.f24351i);
        try {
            try {
                nVarK.d(cVar, obj);
            } catch (IOException e10) {
                throw new g(e10);
            } catch (AssertionError e11) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e11.getMessage());
                assertionError.initCause(e11);
                throw assertionError;
            }
        } finally {
            cVar.u0(zJ);
            cVar.l0(zI);
            cVar.w0(zB);
        }
    }

    public void w(Object obj, Type type, Appendable appendable) {
        try {
            v(obj, type, p(N5.l.b(appendable)));
        } catch (IOException e10) {
            throw new g(e10);
        }
    }

    d(N5.d dVar, com.google.gson.c cVar, Map map, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, m mVar, String str, int i10, int i11, List list, List list2, List list3) {
        this.f24343a = new ThreadLocal();
        this.f24344b = new ConcurrentHashMap();
        this.f24348f = dVar;
        this.f24349g = cVar;
        this.f24350h = map;
        N5.c cVar2 = new N5.c(map);
        this.f24345c = cVar2;
        this.f24351i = z10;
        this.f24352j = z11;
        this.f24353k = z12;
        this.f24354l = z13;
        this.f24355m = z14;
        this.f24356n = z15;
        this.f24357o = z16;
        this.f24361s = mVar;
        this.f24358p = str;
        this.f24359q = i10;
        this.f24360r = i11;
        this.f24362t = list;
        this.f24363u = list2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(O5.l.f8285Y);
        arrayList.add(O5.g.f8234b);
        arrayList.add(dVar);
        arrayList.addAll(list3);
        arrayList.add(O5.l.f8264D);
        arrayList.add(O5.l.f8299m);
        arrayList.add(O5.l.f8293g);
        arrayList.add(O5.l.f8295i);
        arrayList.add(O5.l.f8297k);
        n nVarN = n(mVar);
        arrayList.add(O5.l.b(Long.TYPE, Long.class, nVarN));
        arrayList.add(O5.l.b(Double.TYPE, Double.class, e(z16)));
        arrayList.add(O5.l.b(Float.TYPE, Float.class, f(z16)));
        arrayList.add(O5.l.f8310x);
        arrayList.add(O5.l.f8301o);
        arrayList.add(O5.l.f8303q);
        arrayList.add(O5.l.a(AtomicLong.class, b(nVarN)));
        arrayList.add(O5.l.a(AtomicLongArray.class, c(nVarN)));
        arrayList.add(O5.l.f8305s);
        arrayList.add(O5.l.f8312z);
        arrayList.add(O5.l.f8266F);
        arrayList.add(O5.l.f8268H);
        arrayList.add(O5.l.a(BigDecimal.class, O5.l.f8262B));
        arrayList.add(O5.l.a(BigInteger.class, O5.l.f8263C));
        arrayList.add(O5.l.f8270J);
        arrayList.add(O5.l.f8272L);
        arrayList.add(O5.l.f8276P);
        arrayList.add(O5.l.f8278R);
        arrayList.add(O5.l.f8283W);
        arrayList.add(O5.l.f8274N);
        arrayList.add(O5.l.f8290d);
        arrayList.add(O5.c.f8220b);
        arrayList.add(O5.l.f8281U);
        arrayList.add(O5.j.f8256b);
        arrayList.add(O5.i.f8254b);
        arrayList.add(O5.l.f8279S);
        arrayList.add(O5.a.f8214c);
        arrayList.add(O5.l.f8288b);
        arrayList.add(new O5.b(cVar2));
        arrayList.add(new O5.f(cVar2, z11));
        O5.d dVar2 = new O5.d(cVar2);
        this.f24346d = dVar2;
        arrayList.add(dVar2);
        arrayList.add(O5.l.f8286Z);
        arrayList.add(new O5.h(cVar2, cVar, dVar, dVar2));
        this.f24347e = Collections.unmodifiableList(arrayList);
    }
}
