package U8;

import V8.k;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
abstract /* synthetic */ class h {
    public static final b a(b bVar, int i10, T8.a aVar) {
        if (i10 < 0 && i10 != -2 && i10 != -1) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i10).toString());
        }
        if (i10 == -1 && aVar != T8.a.f10646g) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i10 == -1) {
            aVar = T8.a.f10647h;
            i10 = 0;
        }
        int i11 = i10;
        T8.a aVar2 = aVar;
        if (bVar instanceof V8.k) {
            return k.a.a((V8.k) bVar, null, i11, aVar2, 1, null);
        }
        return new V8.h(bVar, null, i11, aVar2, 2, null);
    }

    public static /* synthetic */ b b(b bVar, int i10, T8.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -2;
        }
        if ((i11 & 2) != 0) {
            aVar = T8.a.f10646g;
        }
        return d.a(bVar, i10, aVar);
    }

    public static final b c(b bVar) {
        return b(bVar, -1, null, 2, null);
    }
}
