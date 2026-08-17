package O5;

import com.google.gson.n;
import com.google.gson.o;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class h implements o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final N5.c f8237g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.gson.c f8238h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final N5.d f8239i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final d f8240j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Q5.b f8241k = Q5.b.a();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Field f8242d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f8243e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ n f8244f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ com.google.gson.d f8245g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ R5.a f8246h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f8247i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, boolean z10, boolean z11, Field field, boolean z12, n nVar, com.google.gson.d dVar, R5.a aVar, boolean z13) {
            super(str, z10, z11);
            this.f8242d = field;
            this.f8243e = z12;
            this.f8244f = nVar;
            this.f8245g = dVar;
            this.f8246h = aVar;
            this.f8247i = z13;
        }

        @Override // O5.h.c
        void a(S5.a aVar, Object obj) throws IllegalAccessException {
            Object objB = this.f8244f.b(aVar);
            if (objB == null && this.f8247i) {
                return;
            }
            this.f8242d.set(obj, objB);
        }

        @Override // O5.h.c
        void b(S5.c cVar, Object obj) throws IllegalAccessException {
            (this.f8243e ? this.f8244f : new k(this.f8245g, this.f8244f, this.f8246h.d())).d(cVar, this.f8242d.get(obj));
        }

        @Override // O5.h.c
        public boolean c(Object obj) {
            return this.f8252b && this.f8242d.get(obj) != obj;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b extends n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final N5.i f8249a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map f8250b;

        b(N5.i iVar, Map map) {
            this.f8249a = iVar;
            this.f8250b = map;
        }

        @Override // com.google.gson.n
        public Object b(S5.a aVar) throws IOException {
            if (aVar.D0() == S5.b.NULL) {
                aVar.u0();
                return null;
            }
            Object objConstruct = this.f8249a.construct();
            try {
                aVar.e();
                while (aVar.J()) {
                    c cVar = (c) this.f8250b.get(aVar.l0());
                    if (cVar == null || !cVar.f8253c) {
                        aVar.S0();
                    } else {
                        cVar.a(aVar, objConstruct);
                    }
                }
                aVar.A();
                return objConstruct;
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (IllegalStateException e11) {
                throw new com.google.gson.l(e11);
            }
        }

        @Override // com.google.gson.n
        public void d(S5.c cVar, Object obj) throws IOException {
            if (obj == null) {
                cVar.X();
                return;
            }
            cVar.m();
            try {
                for (c cVar2 : this.f8250b.values()) {
                    if (cVar2.c(obj)) {
                        cVar.M(cVar2.f8251a);
                        cVar2.b(cVar, obj);
                    }
                }
                cVar.A();
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f8251a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final boolean f8252b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final boolean f8253c;

        protected c(String str, boolean z10, boolean z11) {
            this.f8251a = str;
            this.f8252b = z10;
            this.f8253c = z11;
        }

        abstract void a(S5.a aVar, Object obj);

        abstract void b(S5.c cVar, Object obj);

        abstract boolean c(Object obj);
    }

    public h(N5.c cVar, com.google.gson.c cVar2, N5.d dVar, d dVar2) {
        this.f8237g = cVar;
        this.f8238h = cVar2;
        this.f8239i = dVar;
        this.f8240j = dVar2;
    }

    private c b(com.google.gson.d dVar, Field field, String str, R5.a aVar, boolean z10, boolean z11) {
        boolean zA = N5.k.a(aVar.c());
        M5.b bVar = (M5.b) field.getAnnotation(M5.b.class);
        n nVarB = bVar != null ? this.f8240j.b(this.f8237g, dVar, aVar, bVar) : null;
        boolean z12 = nVarB != null;
        if (nVarB == null) {
            nVarB = dVar.k(aVar);
        }
        return new a(str, z10, z11, field, z12, nVarB, dVar, aVar, zA);
    }

    static boolean d(Field field, boolean z10, N5.d dVar) {
        return (dVar.c(field.getType(), z10) || dVar.g(field, z10)) ? false : true;
    }

    private Map e(com.google.gson.d dVar, R5.a aVar, Class cls) {
        R5.a aVar2;
        h hVar = this;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!cls.isInterface()) {
            Type typeD = aVar.d();
            R5.a aVarB = aVar;
            Class clsC = cls;
            while (clsC != Object.class) {
                Field[] declaredFields = clsC.getDeclaredFields();
                int length = declaredFields.length;
                boolean z10 = false;
                int i10 = 0;
                h hVar2 = hVar;
                while (i10 < length) {
                    Field field = declaredFields[i10];
                    boolean zC = hVar2.c(field, true);
                    boolean zC2 = hVar2.c(field, z10);
                    if (zC || zC2) {
                        hVar2.f8241k.b(field);
                        Type typeP = N5.b.p(aVarB.d(), clsC, field.getGenericType());
                        List listF = hVar2.f(field);
                        int size = listF.size();
                        c cVar = null;
                        h hVar3 = hVar2;
                        List list = listF;
                        for (int i11 = z10; i11 < size; i11++) {
                            String str = (String) list.get(i11);
                            if (i11 != 0) {
                                zC = false;
                            }
                            int i12 = size;
                            List list2 = list;
                            R5.a aVar3 = aVarB;
                            c cVar2 = cVar;
                            boolean z11 = zC;
                            c cVar3 = (c) linkedHashMap.put(str, hVar3.b(dVar, field, str, R5.a.b(typeP), z11, zC2));
                            if (cVar2 != null) {
                                cVar3 = cVar2;
                            }
                            aVarB = aVar3;
                            zC = z11;
                            list = list2;
                            size = i12;
                            cVar = cVar3;
                            hVar3 = this;
                        }
                        aVar2 = aVarB;
                        c cVar4 = cVar;
                        if (cVar4 != null) {
                            throw new IllegalArgumentException(typeD + " declares multiple JSON fields named " + cVar4.f8251a);
                        }
                    } else {
                        aVar2 = aVarB;
                    }
                    i10++;
                    z10 = false;
                    hVar2 = this;
                    aVarB = aVar2;
                }
                aVarB = R5.a.b(N5.b.p(aVarB.d(), clsC, clsC.getGenericSuperclass()));
                clsC = aVarB.c();
                hVar = this;
            }
        }
        return linkedHashMap;
    }

    private List f(Field field) {
        M5.c cVar = (M5.c) field.getAnnotation(M5.c.class);
        if (cVar == null) {
            return Collections.singletonList(this.f8238h.h(field));
        }
        String strValue = cVar.value();
        String[] strArrAlternate = cVar.alternate();
        if (strArrAlternate.length == 0) {
            return Collections.singletonList(strValue);
        }
        ArrayList arrayList = new ArrayList(strArrAlternate.length + 1);
        arrayList.add(strValue);
        for (String str : strArrAlternate) {
            arrayList.add(str);
        }
        return arrayList;
    }

    @Override // com.google.gson.o
    public n a(com.google.gson.d dVar, R5.a aVar) {
        Class clsC = aVar.c();
        if (Object.class.isAssignableFrom(clsC)) {
            return new b(this.f8237g.a(aVar), e(dVar, aVar, clsC));
        }
        return null;
    }

    public boolean c(Field field, boolean z10) {
        return d(field, z10, this.f8239i);
    }
}
