package W8;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: W8.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1499b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final E f12171a = new E("CLOSED");

    public static final AbstractC1500c b(AbstractC1500c abstractC1500c) {
        while (true) {
            Object objG = abstractC1500c.g();
            if (objG == f12171a) {
                return abstractC1500c;
            }
            AbstractC1500c abstractC1500c2 = (AbstractC1500c) objG;
            if (abstractC1500c2 != null) {
                abstractC1500c = abstractC1500c2;
            } else if (abstractC1500c.m()) {
                return abstractC1500c;
            }
        }
    }

    public static final Object c(B b10, long j10, Function2 function2) {
        while (true) {
            if (b10.f12154c >= j10 && !b10.k()) {
                return C.a(b10);
            }
            Object objG = b10.g();
            if (objG == f12171a) {
                return C.a(f12171a);
            }
            B b11 = (B) ((AbstractC1500c) objG);
            if (b11 == null) {
                b11 = (B) function2.invoke(Long.valueOf(b10.f12154c + 1), b10);
                if (b10.o(b11)) {
                    if (b10.k()) {
                        b10.n();
                    }
                }
            }
            b10 = b11;
        }
    }
}
