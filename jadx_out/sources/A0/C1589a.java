package a0;

import F.D1;
import F.E0;
import F.InterfaceC0490j0;
import F.X0;
import H0.g;
import K.r;
import Z.x0;
import g0.s0;
import java.util.Objects;

/* JADX INFO: renamed from: a0.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C1589a implements D1, E0, r {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final InterfaceC0490j0.a f13658Q = InterfaceC0490j0.a.a("camerax.video.VideoCapture.videoOutput", x0.class);

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final InterfaceC0490j0.a f13659R = InterfaceC0490j0.a.a("camerax.video.VideoCapture.videoEncoderInfoFinder", s0.a.class);

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final InterfaceC0490j0.a f13660S = InterfaceC0490j0.a.a("camerax.video.VideoCapture.forceEnableSurfaceProcessing", Boolean.class);

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final X0 f13661P;

    public C1589a(X0 x02) {
        g.a(x02.b(f13658Q));
        this.f13661P = x02;
    }

    public s0.a f0() {
        s0.a aVar = (s0.a) d(f13659R);
        Objects.requireNonNull(aVar);
        return aVar;
    }

    public x0 g0() {
        x0 x0Var = (x0) d(f13658Q);
        Objects.requireNonNull(x0Var);
        return x0Var;
    }

    public boolean h0() {
        Boolean bool = (Boolean) f(f13660S, Boolean.FALSE);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    @Override // F.h1
    public InterfaceC0490j0 o() {
        return this.f13661P;
    }

    @Override // F.D0
    public int r() {
        return 34;
    }
}
