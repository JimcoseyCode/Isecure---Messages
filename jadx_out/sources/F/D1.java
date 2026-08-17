package F;

import E.InterfaceC0464y;
import E.Y;
import F.C0486h0;
import F.E1;
import F.InterfaceC0490j0;
import F.k1;
import android.util.Range;
import java.util.Objects;
import y.InterfaceC3564I;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public interface D1 extends K.q, D0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final InterfaceC0490j0.a f1297A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final InterfaceC0490j0.a f1298B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final InterfaceC0490j0.a f1299C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final InterfaceC0490j0.a f1300D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final InterfaceC0490j0.a f1301E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final InterfaceC0490j0.a f1302F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final InterfaceC0490j0.a f1303G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final InterfaceC0490j0.a f1304H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final InterfaceC0490j0.a f1305I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final InterfaceC0490j0.a f1306J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final InterfaceC0490j0.a f1307K;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final InterfaceC0490j0.a f1308w = InterfaceC0490j0.a.a("camerax.core.useCase.defaultSessionConfig", k1.class);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final InterfaceC0490j0.a f1309x = InterfaceC0490j0.a.a("camerax.core.useCase.defaultCaptureConfig", C0486h0.class);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final InterfaceC0490j0.a f1310y = InterfaceC0490j0.a.a("camerax.core.useCase.sessionConfigUnpacker", k1.e.class);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final InterfaceC0490j0.a f1311z = InterfaceC0490j0.a.a("camerax.core.useCase.captureConfigUnpacker", C0486h0.b.class);

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements Y.b {
        a() {
        }

        @Override // E.Y.b
        public E.Y a(InterfaceC0464y interfaceC0464y) {
            return new E.c0(interfaceC0464y);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface b extends InterfaceC3564I {
        D1 c();
    }

    static {
        Class cls = Integer.TYPE;
        f1297A = InterfaceC0490j0.a.a("camerax.core.useCase.surfaceOccupancyPriority", cls);
        f1298B = InterfaceC0490j0.a.a("camerax.core.useCase.sessionType", cls);
        f1299C = InterfaceC0490j0.a.a("camerax.core.useCase.targetFrameRate", Range.class);
        f1300D = InterfaceC0490j0.a.a("camerax.core.useCase.isStrictFrameRateRequired", Boolean.class);
        Class cls2 = Boolean.TYPE;
        f1301E = InterfaceC0490j0.a.a("camerax.core.useCase.zslDisabled", cls2);
        f1302F = InterfaceC0490j0.a.a("camerax.core.useCase.highResolutionDisabled", cls2);
        f1303G = InterfaceC0490j0.a.a("camerax.core.useCase.captureType", E1.b.class);
        f1304H = InterfaceC0490j0.a.a("camerax.core.useCase.previewStabilizationMode", cls);
        f1305I = InterfaceC0490j0.a.a("camerax.core.useCase.videoStabilizationMode", cls);
        f1306J = InterfaceC0490j0.a.a("camerax.core.useCase.takePictureManagerProvider", Y.b.class);
        f1307K = InterfaceC0490j0.a.a("camerax.core.useCase.streamUseCase", p1.class);
    }

    default C0486h0 E(C0486h0 c0486h0) {
        return (C0486h0) f(f1309x, c0486h0);
    }

    default p1 F() {
        p1 p1Var = (p1) f(f1307K, p1.f1605h);
        Objects.requireNonNull(p1Var);
        return p1Var;
    }

    default E1.b G() {
        return (E1.b) d(f1303G);
    }

    default int H() {
        return ((Integer) f(f1305I, 0)).intValue();
    }

    default k1.e I(k1.e eVar) {
        return (k1.e) f(f1310y, eVar);
    }

    default Range K(Range range) {
        return (Range) f(f1299C, range);
    }

    default int N(int i10) {
        return ((Integer) f(f1297A, Integer.valueOf(i10))).intValue();
    }

    default int Q() {
        return ((Integer) f(f1304H, 0)).intValue();
    }

    default boolean S() {
        Boolean bool = (Boolean) f(f1300D, Boolean.FALSE);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    default boolean Z(boolean z10) {
        return ((Boolean) f(f1302F, Boolean.valueOf(z10))).booleanValue();
    }

    default boolean b0() {
        return b(f1299C);
    }

    default C0486h0.b e0(C0486h0.b bVar) {
        return (C0486h0.b) f(f1311z, bVar);
    }

    default int q(int i10) {
        return ((Integer) f(f1298B, Integer.valueOf(i10))).intValue();
    }

    default Y.b s() {
        Y.b bVar = (Y.b) f(f1306J, new a());
        Objects.requireNonNull(bVar);
        return bVar;
    }

    default k1 w() {
        return (k1) d(f1308w);
    }

    default k1 x(k1 k1Var) {
        return (k1) f(f1308w, k1Var);
    }

    default boolean y(boolean z10) {
        return ((Boolean) f(f1301E, Boolean.valueOf(z10))).booleanValue();
    }
}
