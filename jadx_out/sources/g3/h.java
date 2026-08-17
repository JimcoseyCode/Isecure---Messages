package g3;

import i7.C2735B;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f28181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f28182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f28183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile g f28184d;

    static {
        h hVar = new h();
        f28181a = hVar;
        f28182b = hVar.b();
        f28183c = 384;
    }

    private h() {
    }

    public static final g a() {
        if (f28184d == null) {
            synchronized (h.class) {
                try {
                    if (f28184d == null) {
                        f28184d = new g(f28183c, f28182b);
                    }
                    C2735B c2735b = C2735B.f28704a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        g gVar = f28184d;
        AbstractC2855l.d(gVar);
        return gVar;
    }

    private final int b() {
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        return ((long) iMin) > 16777216 ? (iMin / 4) * 3 : iMin / 2;
    }
}
