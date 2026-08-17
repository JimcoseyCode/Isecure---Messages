package y;

import F.C0475d;
import F.E1;
import kotlin.jvm.internal.AbstractC2855l;
import z.InterfaceC3664a;

/* JADX INFO: renamed from: y.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C3602w implements InterfaceC3601v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F.Z f33871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3664a f33872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final E1 f33873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final K.m f33874d;

    public C3602w(F.Z cameraRepository, InterfaceC3664a cameraCoordinator, E1 useCaseConfigFactory, K.m streamSpecsCalculator) {
        AbstractC2855l.g(cameraRepository, "cameraRepository");
        AbstractC2855l.g(cameraCoordinator, "cameraCoordinator");
        AbstractC2855l.g(useCaseConfigFactory, "useCaseConfigFactory");
        AbstractC2855l.g(streamSpecsCalculator, "streamSpecsCalculator");
        this.f33871a = cameraRepository;
        this.f33872b = cameraCoordinator;
        this.f33873c = useCaseConfigFactory;
        this.f33874d = streamSpecsCalculator;
    }

    private final K.f c(F.M m10, F.M m11, C0475d c0475d, C0475d c0475d2, C3561F c3561f, C3561F c3561f2) {
        return new K.f(m10, m11, c0475d, c0475d2, c3561f, c3561f2, this.f33872b, this.f33874d, this.f33873c);
    }

    static /* synthetic */ K.f d(C3602w c3602w, F.M m10, F.M m11, C0475d c0475d, C0475d c0475d2, C3561F c3561f, C3561F c3561f2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            m11 = null;
        }
        if ((i10 & 8) != 0) {
            c0475d2 = null;
        }
        if ((i10 & 16) != 0) {
            c3561f = C3561F.f33635d;
        }
        if ((i10 & 32) != 0) {
            c3561f2 = C3561F.f33635d;
        }
        return c3602w.c(m10, m11, c0475d, c0475d2, c3561f, c3561f2);
    }

    @Override // y.InterfaceC3601v
    public K.f a(F.M camera, F.M m10, C0475d adapterCameraInfo, C0475d c0475d, C3561F compositionSettings, C3561F secondaryCompositionSettings) {
        AbstractC2855l.g(camera, "camera");
        AbstractC2855l.g(adapterCameraInfo, "adapterCameraInfo");
        AbstractC2855l.g(compositionSettings, "compositionSettings");
        AbstractC2855l.g(secondaryCompositionSettings, "secondaryCompositionSettings");
        return c(camera, m10, adapterCameraInfo, c0475d, compositionSettings, secondaryCompositionSettings);
    }

    @Override // y.InterfaceC3601v
    public K.f b(String cameraId) {
        AbstractC2855l.g(cameraId, "cameraId");
        F.M mL = this.f33871a.l(cameraId);
        AbstractC2855l.f(mL, "getCamera(...)");
        return d(this, mL, null, new C0475d(mL.r(), F.H.a()), null, null, null, 58, null);
    }
}
