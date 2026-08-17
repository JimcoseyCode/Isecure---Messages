package r;

import F.AbstractC0504q0;
import F.F0;
import F.k1;
import O.c;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import y.AbstractC3583h0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class K2 implements G2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s.E f31011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f31012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final O.f f31013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f31014d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f31015e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f31016f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f31017g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    androidx.camera.core.r f31018h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private AbstractC0504q0 f31019i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    b f31020j;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ImageWriter f31023a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicBoolean f31024b = new AtomicBoolean(true);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Executor f31025c;

        b(Executor executor) {
            this.f31025c = executor;
        }

        public void b() {
            this.f31024b.set(false);
        }

        public boolean c(final androidx.camera.core.o oVar) {
            ImageWriter imageWriter;
            Image imageP0 = oVar.p0();
            if (this.f31024b.get() && (imageWriter = this.f31023a) != null && imageP0 != null) {
                try {
                    L.a.d(imageWriter, imageP0);
                    L.a.e(this.f31023a, new ImageWriter.OnImageReleasedListener() { // from class: r.L2
                        @Override // android.media.ImageWriter.OnImageReleasedListener
                        public final void onImageReleased(ImageWriter imageWriter2) {
                            oVar.close();
                        }
                    }, this.f31025c);
                    return true;
                } catch (IllegalStateException e10) {
                    AbstractC3583h0.c("ZslControlImpl", "enqueueImageToImageWriter throws IllegalStateException = " + e10.getMessage());
                }
            }
            return false;
        }

        public void d(ImageWriter imageWriter) {
            if (this.f31024b.get()) {
                if (this.f31023a != null) {
                    AbstractC3583h0.l("ZslControlImpl", "ImageWriter already existed in the ImageWriter holder. Closing the previous one.");
                    this.f31023a.close();
                }
                this.f31023a = imageWriter;
            }
        }

        public void e() {
            b();
            ImageWriter imageWriter = this.f31023a;
            if (imageWriter != null) {
                imageWriter.close();
            }
        }
    }

    K2(s.E e10, Executor executor) {
        this.f31016f = false;
        this.f31017g = false;
        this.f31011a = e10;
        this.f31012b = executor;
        this.f31016f = M2.a(e10, 4);
        this.f31017g = androidx.camera.camera2.internal.compat.quirk.b.b(ZslDisablerQuirk.class) != null;
        this.f31013c = new O.f(3, new c.a() { // from class: r.H2
            @Override // O.c.a
            public final void a(Object obj) {
                ((androidx.camera.core.o) obj).close();
            }
        });
    }

    public static /* synthetic */ void i(K2 k22, F.F0 f02) {
        k22.getClass();
        try {
            androidx.camera.core.o oVarB = f02.b();
            if (oVarB != null) {
                k22.f31013c.b(oVarB);
            }
        } catch (IllegalStateException e10) {
            AbstractC3583h0.c("ZslControlImpl", "Failed to acquire latest image IllegalStateException = " + e10.getMessage());
        }
    }

    public static /* synthetic */ void j(androidx.camera.core.r rVar, b bVar) {
        rVar.j();
        bVar.e();
    }

    private void k() {
        androidx.camera.core.r rVar = this.f31018h;
        if (rVar != null) {
            rVar.d();
            this.f31018h = null;
        }
        b bVar = this.f31020j;
        if (bVar != null) {
            bVar.b();
            this.f31020j = null;
        }
        l();
        AbstractC0504q0 abstractC0504q0 = this.f31019i;
        if (abstractC0504q0 != null) {
            abstractC0504q0.d();
            this.f31019i = null;
        }
    }

    private void l() {
        O.f fVar = this.f31013c;
        while (!fVar.isEmpty()) {
            ((androidx.camera.core.o) fVar.a()).close();
        }
    }

    private Map m(s.E e10) {
        StreamConfigurationMap streamConfigurationMap;
        try {
            streamConfigurationMap = (StreamConfigurationMap) e10.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        } catch (AssertionError e11) {
            AbstractC3583h0.c("ZslControlImpl", "Failed to retrieve StreamConfigurationMap, error = " + e11.getMessage());
            streamConfigurationMap = null;
        }
        if (streamConfigurationMap == null || streamConfigurationMap.getInputFormats() == null) {
            return new HashMap();
        }
        HashMap map = new HashMap();
        for (int i10 : streamConfigurationMap.getInputFormats()) {
            Size[] inputSizes = streamConfigurationMap.getInputSizes(i10);
            if (inputSizes != null) {
                Arrays.sort(inputSizes, new H.e(true));
                map.put(Integer.valueOf(i10), inputSizes[0]);
            }
        }
        return map;
    }

    private boolean n(s.E e10, int i10) {
        int[] validOutputFormatsForInput;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) e10.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null || (validOutputFormatsForInput = streamConfigurationMap.getValidOutputFormatsForInput(i10)) == null) {
            return false;
        }
        for (int i11 : validOutputFormatsForInput) {
            if (i11 == 256) {
                return true;
            }
        }
        return false;
    }

    @Override // r.G2
    public void a() {
        k();
    }

    @Override // r.G2
    public void b(k1.b bVar) {
        k();
        if (this.f31014d) {
            bVar.B(1);
            return;
        }
        if (this.f31017g) {
            bVar.B(1);
            return;
        }
        Map mapM = m(this.f31011a);
        if (!this.f31016f || mapM.isEmpty() || !mapM.containsKey(34) || !n(this.f31011a, 34)) {
            bVar.B(1);
            return;
        }
        Size size = (Size) mapM.get(34);
        androidx.camera.core.q qVar = new androidx.camera.core.q(size.getWidth(), size.getHeight(), 34, 9);
        final androidx.camera.core.r rVar = new androidx.camera.core.r(qVar);
        Surface surface = rVar.getSurface();
        Objects.requireNonNull(surface);
        F.G0 g02 = new F.G0(surface, new Size(rVar.getWidth(), rVar.getHeight()), 34);
        final b bVar2 = new b(this.f31012b);
        this.f31018h = rVar;
        this.f31019i = g02;
        this.f31020j = bVar2;
        rVar.e(new F0.a() { // from class: r.I2
            @Override // F.F0.a
            public final void a(F.F0 f02) {
                K2.i(this.f30975a, f02);
            }
        }, I.c.d());
        g02.k().h(new Runnable() { // from class: r.J2
            @Override // java.lang.Runnable
            public final void run() {
                K2.j(rVar, bVar2);
            }
        }, this.f31012b);
        bVar.l(g02);
        bVar.e(qVar.m());
        bVar.k(new a(bVar2));
        bVar.x(new InputConfiguration(rVar.getWidth(), rVar.getHeight(), rVar.c()));
    }

    @Override // r.G2
    public boolean c() {
        return this.f31014d;
    }

    @Override // r.G2
    public boolean d() {
        return this.f31015e;
    }

    @Override // r.G2
    public void e(boolean z10) {
        this.f31015e = z10;
    }

    @Override // r.G2
    public void f(boolean z10) {
        if (this.f31014d != z10 && z10) {
            l();
        }
        this.f31014d = z10;
    }

    @Override // r.G2
    public androidx.camera.core.o g() {
        try {
            return (androidx.camera.core.o) this.f31013c.a();
        } catch (NoSuchElementException unused) {
            AbstractC3583h0.c("ZslControlImpl", "dequeueImageFromBuffer no such element");
            return null;
        }
    }

    @Override // r.G2
    public boolean h(androidx.camera.core.o oVar) {
        b bVar = this.f31020j;
        if (bVar != null) {
            return bVar.c(oVar);
        }
        return false;
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends CameraCaptureSession.StateCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f31021a;

        a(b bVar) {
            this.f31021a = bVar;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            Surface inputSurface = cameraCaptureSession.getInputSurface();
            if (inputSurface != null) {
                this.f31021a.d(L.a.c(inputSurface, 1));
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        }
    }
}
