package O5;

import com.google.gson.n;
import com.google.gson.o;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final N5.c f8222g;

    public d(N5.c cVar) {
        this.f8222g = cVar;
    }

    @Override // com.google.gson.o
    public n a(com.google.gson.d dVar, R5.a aVar) {
        M5.b bVar = (M5.b) aVar.c().getAnnotation(M5.b.class);
        if (bVar == null) {
            return null;
        }
        return b(this.f8222g, dVar, aVar, bVar);
    }

    n b(N5.c cVar, com.google.gson.d dVar, R5.a aVar, M5.b bVar) {
        n nVarA;
        Object objConstruct = cVar.a(R5.a.a(bVar.value())).construct();
        if (objConstruct instanceof n) {
            nVarA = (n) objConstruct;
        } else {
            if (!(objConstruct instanceof o)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objConstruct.getClass().getName() + " as a @JsonAdapter for " + aVar.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            nVarA = ((o) objConstruct).a(dVar, aVar);
        }
        return (nVarA == null || !bVar.nullSafe()) ? nVarA : nVarA.a();
    }
}
