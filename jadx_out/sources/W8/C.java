package W8;

import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class C {
    public static final B b(Object obj) {
        if (obj == AbstractC1499b.f12171a) {
            throw new IllegalStateException("Does not contain segment");
        }
        AbstractC2855l.e(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        return (B) obj;
    }

    public static final boolean c(Object obj) {
        return obj == AbstractC1499b.f12171a;
    }

    public static Object a(Object obj) {
        return obj;
    }
}
