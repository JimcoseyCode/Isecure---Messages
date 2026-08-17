package O5;

import O5.h;
import com.google.gson.n;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class k extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.gson.d f8258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f8259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Type f8260c;

    k(com.google.gson.d dVar, n nVar, Type type) {
        this.f8258a = dVar;
        this.f8259b = nVar;
        this.f8260c = type;
    }

    private Type e(Type type, Object obj) {
        return obj != null ? (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type : type;
    }

    @Override // com.google.gson.n
    public Object b(S5.a aVar) {
        return this.f8259b.b(aVar);
    }

    @Override // com.google.gson.n
    public void d(S5.c cVar, Object obj) {
        n nVarK = this.f8259b;
        Type typeE = e(this.f8260c, obj);
        if (typeE != this.f8260c) {
            nVarK = this.f8258a.k(R5.a.b(typeE));
            if (nVarK instanceof h.b) {
                n nVar = this.f8259b;
                if (!(nVar instanceof h.b)) {
                    nVarK = nVar;
                }
            }
        }
        nVarK.d(cVar, obj);
    }
}
