package S2;

import W2.n;
import Y2.InterfaceC1530p;
import a2.g;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f10251a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f10252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static a f10253c;

    private b() {
    }

    public static final a a(V2.d dVar, InterfaceC1530p interfaceC1530p, n nVar, boolean z10, boolean z11, int i10, int i11, ExecutorService executorService) {
        if (!f10252b) {
            try {
                Class cls = Boolean.TYPE;
                Class cls2 = Integer.TYPE;
                Object objNewInstance = AnimatedFactoryV2Impl.class.getConstructor(V2.d.class, InterfaceC1530p.class, n.class, cls, cls, cls2, cls2, g.class).newInstance(dVar, interfaceC1530p, nVar, Boolean.valueOf(z10), Boolean.valueOf(z11), Integer.valueOf(i10), Integer.valueOf(i11), executorService);
                AbstractC2855l.e(objNewInstance, "null cannot be cast to non-null type com.facebook.imagepipeline.animated.factory.AnimatedFactory");
                f10253c = (a) objNewInstance;
            } catch (Throwable unused) {
            }
            if (f10253c != null) {
                f10252b = true;
            }
        }
        return f10253c;
    }
}
