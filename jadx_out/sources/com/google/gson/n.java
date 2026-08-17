package com.google.gson;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class n {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends n {
        a() {
        }

        @Override // com.google.gson.n
        public Object b(S5.a aVar) throws IOException {
            if (aVar.D0() != S5.b.NULL) {
                return n.this.b(aVar);
            }
            aVar.u0();
            return null;
        }

        @Override // com.google.gson.n
        public void d(S5.c cVar, Object obj) throws IOException {
            if (obj == null) {
                cVar.X();
            } else {
                n.this.d(cVar, obj);
            }
        }
    }

    public final n a() {
        return new a();
    }

    public abstract Object b(S5.a aVar);

    public final f c(Object obj) {
        try {
            O5.e eVar = new O5.e();
            d(eVar, obj);
            return eVar.N0();
        } catch (IOException e10) {
            throw new g(e10);
        }
    }

    public abstract void d(S5.c cVar, Object obj);
}
