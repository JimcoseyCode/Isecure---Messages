package O5;

import com.google.gson.n;
import com.google.gson.o;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class f implements o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final N5.c f8228g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final boolean f8229h;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private final class a extends n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final n f8230a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final n f8231b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final N5.i f8232c;

        public a(com.google.gson.d dVar, Type type, n nVar, Type type2, n nVar2, N5.i iVar) {
            this.f8230a = new k(dVar, nVar, type);
            this.f8231b = new k(dVar, nVar2, type2);
            this.f8232c = iVar;
        }

        private String e(com.google.gson.f fVar) {
            if (!fVar.t()) {
                if (fVar.r()) {
                    return "null";
                }
                throw new AssertionError();
            }
            com.google.gson.k kVarP = fVar.p();
            if (kVarP.z()) {
                return String.valueOf(kVarP.v());
            }
            if (kVarP.x()) {
                return Boolean.toString(kVarP.u());
            }
            if (kVarP.A()) {
                return kVarP.w();
            }
            throw new AssertionError();
        }

        @Override // com.google.gson.n
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map b(S5.a aVar) throws IOException {
            S5.b bVarD0 = aVar.D0();
            if (bVarD0 == S5.b.NULL) {
                aVar.u0();
                return null;
            }
            Map map = (Map) this.f8232c.construct();
            if (bVarD0 != S5.b.BEGIN_ARRAY) {
                aVar.e();
                while (aVar.J()) {
                    N5.f.f8118a.a(aVar);
                    Object objB = this.f8230a.b(aVar);
                    if (map.put(objB, this.f8231b.b(aVar)) != null) {
                        throw new com.google.gson.l("duplicate key: " + objB);
                    }
                }
                aVar.A();
                return map;
            }
            aVar.d();
            while (aVar.J()) {
                aVar.d();
                Object objB2 = this.f8230a.b(aVar);
                if (map.put(objB2, this.f8231b.b(aVar)) != null) {
                    throw new com.google.gson.l("duplicate key: " + objB2);
                }
                aVar.s();
            }
            aVar.s();
            return map;
        }

        @Override // com.google.gson.n
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(S5.c cVar, Map map) throws IOException {
            if (map == null) {
                cVar.X();
                return;
            }
            if (!f.this.f8229h) {
                cVar.m();
                for (Map.Entry entry : map.entrySet()) {
                    cVar.M(String.valueOf(entry.getKey()));
                    this.f8231b.d(cVar, entry.getValue());
                }
                cVar.A();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i10 = 0;
            boolean z10 = false;
            for (Map.Entry entry2 : map.entrySet()) {
                com.google.gson.f fVarC = this.f8230a.c(entry2.getKey());
                arrayList.add(fVarC);
                arrayList2.add(entry2.getValue());
                z10 |= fVarC.q() || fVarC.s();
            }
            if (!z10) {
                cVar.m();
                int size = arrayList.size();
                while (i10 < size) {
                    cVar.M(e((com.google.gson.f) arrayList.get(i10)));
                    this.f8231b.d(cVar, arrayList2.get(i10));
                    i10++;
                }
                cVar.A();
                return;
            }
            cVar.k();
            int size2 = arrayList.size();
            while (i10 < size2) {
                cVar.k();
                N5.l.a((com.google.gson.f) arrayList.get(i10), cVar);
                this.f8231b.d(cVar, arrayList2.get(i10));
                cVar.s();
                i10++;
            }
            cVar.s();
        }
    }

    public f(N5.c cVar, boolean z10) {
        this.f8228g = cVar;
        this.f8229h = z10;
    }

    private n b(com.google.gson.d dVar, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? l.f8292f : dVar.k(R5.a.b(type));
    }

    @Override // com.google.gson.o
    public n a(com.google.gson.d dVar, R5.a aVar) {
        Type typeD = aVar.d();
        if (!Map.class.isAssignableFrom(aVar.c())) {
            return null;
        }
        Type[] typeArrJ = N5.b.j(typeD, N5.b.k(typeD));
        return new a(dVar, typeArrJ[0], b(dVar, typeArrJ[0]), typeArrJ[1], dVar.k(R5.a.b(typeArrJ[1])), this.f8228g.a(aVar));
    }
}
