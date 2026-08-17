package O5;

import com.google.gson.n;
import com.google.gson.o;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final N5.c f8217g;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class a extends n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final n f8218a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final N5.i f8219b;

        public a(com.google.gson.d dVar, Type type, n nVar, N5.i iVar) {
            this.f8218a = new k(dVar, nVar, type);
            this.f8219b = iVar;
        }

        @Override // com.google.gson.n
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Collection b(S5.a aVar) throws IOException {
            if (aVar.D0() == S5.b.NULL) {
                aVar.u0();
                return null;
            }
            Collection collection = (Collection) this.f8219b.construct();
            aVar.d();
            while (aVar.J()) {
                collection.add(this.f8218a.b(aVar));
            }
            aVar.s();
            return collection;
        }

        @Override // com.google.gson.n
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(S5.c cVar, Collection collection) throws IOException {
            if (collection == null) {
                cVar.X();
                return;
            }
            cVar.k();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                this.f8218a.d(cVar, it.next());
            }
            cVar.s();
        }
    }

    public b(N5.c cVar) {
        this.f8217g = cVar;
    }

    @Override // com.google.gson.o
    public n a(com.google.gson.d dVar, R5.a aVar) {
        Type typeD = aVar.d();
        Class clsC = aVar.c();
        if (!Collection.class.isAssignableFrom(clsC)) {
            return null;
        }
        Type typeH = N5.b.h(typeD, clsC);
        return new a(dVar, typeH, dVar.k(R5.a.b(typeH)), this.f8217g.a(aVar));
    }
}
