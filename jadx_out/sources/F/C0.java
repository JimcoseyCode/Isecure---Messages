package F;

import F.InterfaceC0490j0;
import java.util.concurrent.Executor;
import y.InterfaceC3575d0;
import y.V;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C0 implements D1, E0, K.i {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final InterfaceC0490j0.a f1272Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final InterfaceC0490j0.a f1273R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final InterfaceC0490j0.a f1274S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final InterfaceC0490j0.a f1275T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final InterfaceC0490j0.a f1276U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final InterfaceC0490j0.a f1277V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final InterfaceC0490j0.a f1278W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final InterfaceC0490j0.a f1279X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final InterfaceC0490j0.a f1280Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final InterfaceC0490j0.a f1281Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final InterfaceC0490j0.a f1282a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final InterfaceC0490j0.a f1283b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final InterfaceC0490j0.a f1284c0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final X0 f1285P;

    static {
        Class cls = Integer.TYPE;
        f1272Q = InterfaceC0490j0.a.a("camerax.core.imageCapture.captureMode", cls);
        f1273R = InterfaceC0490j0.a.a("camerax.core.imageCapture.flashMode", cls);
        f1274S = InterfaceC0490j0.a.a("camerax.core.imageCapture.captureBundle", InterfaceC0484g0.class);
        f1275T = InterfaceC0490j0.a.a("camerax.core.imageCapture.bufferFormat", Integer.class);
        f1276U = InterfaceC0490j0.a.a("camerax.core.imageCapture.outputFormat", Integer.class);
        f1277V = InterfaceC0490j0.a.a("camerax.core.imageCapture.maxCaptureStages", Integer.class);
        f1278W = InterfaceC0490j0.a.a("camerax.core.imageCapture.imageReaderProxyProvider", InterfaceC3575d0.class);
        f1279X = InterfaceC0490j0.a.a("camerax.core.imageCapture.useSoftwareJpegEncoder", Boolean.TYPE);
        f1280Y = InterfaceC0490j0.a.a("camerax.core.imageCapture.flashType", cls);
        f1281Z = InterfaceC0490j0.a.a("camerax.core.imageCapture.jpegCompressionQuality", cls);
        f1282a0 = InterfaceC0490j0.a.a("camerax.core.imageCapture.screenFlash", V.i.class);
        f1283b0 = InterfaceC0490j0.a.a("camerax.core.useCase.postviewResolutionSelector", S.c.class);
        f1284c0 = InterfaceC0490j0.a.a("camerax.core.useCase.isPostviewEnabled", Boolean.class);
    }

    public C0(X0 x02) {
        this.f1285P = x02;
    }

    public InterfaceC0484g0 f0(InterfaceC0484g0 interfaceC0484g0) {
        return (InterfaceC0484g0) f(f1274S, interfaceC0484g0);
    }

    public int g0() {
        return ((Integer) d(f1272Q)).intValue();
    }

    public int h0(int i10) {
        return ((Integer) f(f1273R, Integer.valueOf(i10))).intValue();
    }

    public int i0(int i10) {
        return ((Integer) f(f1280Y, Integer.valueOf(i10))).intValue();
    }

    public InterfaceC3575d0 j0() {
        android.support.v4.media.session.b.a(f(f1278W, null));
        return null;
    }

    public Executor k0(Executor executor) {
        return (Executor) f(K.i.f6995L, executor);
    }

    public int l0() {
        return ((Integer) d(f1281Z)).intValue();
    }

    public V.i m0() {
        return (V.i) f(f1282a0, null);
    }

    public boolean n0() {
        return b(f1272Q);
    }

    @Override // F.h1
    public InterfaceC0490j0 o() {
        return this.f1285P;
    }

    @Override // F.D0
    public int r() {
        return ((Integer) d(D0.f1294j)).intValue();
    }
}
