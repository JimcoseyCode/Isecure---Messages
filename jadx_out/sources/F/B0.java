package F;

import F.InterfaceC0490j0;
import androidx.camera.core.g;
import y.InterfaceC3575d0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class B0 implements D1, E0, K.r {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final InterfaceC0490j0.a f1265Q = InterfaceC0490j0.a.a("camerax.core.imageAnalysis.backpressureStrategy", g.b.class);

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final InterfaceC0490j0.a f1266R = InterfaceC0490j0.a.a("camerax.core.imageAnalysis.imageQueueDepth", Integer.TYPE);

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final InterfaceC0490j0.a f1267S = InterfaceC0490j0.a.a("camerax.core.imageAnalysis.imageReaderProxyProvider", InterfaceC3575d0.class);

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final InterfaceC0490j0.a f1268T = InterfaceC0490j0.a.a("camerax.core.imageAnalysis.outputImageFormat", g.e.class);

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final InterfaceC0490j0.a f1269U = InterfaceC0490j0.a.a("camerax.core.imageAnalysis.onePixelShiftEnabled", Boolean.class);

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final InterfaceC0490j0.a f1270V = InterfaceC0490j0.a.a("camerax.core.imageAnalysis.outputImageRotationEnabled", Boolean.class);

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final X0 f1271P;

    public B0(X0 x02) {
        this.f1271P = x02;
    }

    public int f0(int i10) {
        return ((Integer) f(f1265Q, Integer.valueOf(i10))).intValue();
    }

    public int g0(int i10) {
        return ((Integer) f(f1266R, Integer.valueOf(i10))).intValue();
    }

    public InterfaceC3575d0 h0() {
        android.support.v4.media.session.b.a(f(f1267S, null));
        return null;
    }

    public Boolean i0(Boolean bool) {
        return (Boolean) f(f1269U, bool);
    }

    public int j0(int i10) {
        return ((Integer) f(f1268T, Integer.valueOf(i10))).intValue();
    }

    public Boolean k0(Boolean bool) {
        return (Boolean) f(f1270V, bool);
    }

    @Override // F.h1
    public InterfaceC0490j0 o() {
        return this.f1271P;
    }

    @Override // F.D0
    public int r() {
        return 35;
    }
}
