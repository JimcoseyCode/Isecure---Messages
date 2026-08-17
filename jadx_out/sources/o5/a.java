package O5;

import com.google.gson.n;
import com.google.gson.o;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f8214c = new C0089a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f8215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f8216b;

    /* JADX INFO: renamed from: O5.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class C0089a implements o {
        C0089a() {
        }

        @Override // com.google.gson.o
        public n a(com.google.gson.d dVar, R5.a aVar) {
            Type typeD = aVar.d();
            if (!(typeD instanceof GenericArrayType) && (!(typeD instanceof Class) || !((Class) typeD).isArray())) {
                return null;
            }
            Type typeG = N5.b.g(typeD);
            return new a(dVar, dVar.k(R5.a.b(typeG)), N5.b.k(typeG));
        }
    }

    public a(com.google.gson.d dVar, n nVar, Class cls) {
        this.f8216b = new k(dVar, nVar, cls);
        this.f8215a = cls;
    }

    @Override // com.google.gson.n
    public Object b(S5.a aVar) throws IOException {
        if (aVar.D0() == S5.b.NULL) {
            aVar.u0();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.d();
        while (aVar.J()) {
            arrayList.add(this.f8216b.b(aVar));
        }
        aVar.s();
        int size = arrayList.size();
        Object objNewInstance = Array.newInstance((Class<?>) this.f8215a, size);
        for (int i10 = 0; i10 < size; i10++) {
            Array.set(objNewInstance, i10, arrayList.get(i10));
        }
        return objNewInstance;
    }

    @Override // com.google.gson.n
    public void d(S5.c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.X();
            return;
        }
        cVar.k();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f8216b.d(cVar, Array.get(obj, i10));
        }
        cVar.s();
    }
}
