package F;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import y.AbstractC3583h0;
import y.C3598s;

/* JADX INFO: renamed from: F.f0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0482f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C3598s f1458a = new C3598s.a().b(2).a();

    /* JADX INFO: renamed from: F.f0$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class a {
        static int a(Context context) {
            return context.getDeviceId();
        }
    }

    /* JADX INFO: renamed from: F.f0$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class b extends Exception {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f1459g;

        public b(String str, int i10, Throwable th) {
            super(str, th);
            this.f1459g = i10;
        }

        public int a() {
            return this.f1459g;
        }
    }

    public static void a(Context context, Z z10, C3598s c3598s) throws b {
        Integer numD;
        if (Build.VERSION.SDK_INT >= 34 && a.a(context) != 0) {
            AbstractC3583h0.a("CameraValidator", "Virtual device with ID: " + a.a(context) + " has " + z10.m().size() + " cameras. Skipping validation.");
            return;
        }
        IllegalArgumentException e10 = null;
        if (c3598s != null) {
            try {
                numD = c3598s.d();
                if (numD == null) {
                    AbstractC3583h0.l("CameraValidator", "No lens facing info in the availableCamerasSelector, don't verify the camera lens facing.");
                    return;
                }
            } catch (IllegalStateException e11) {
                AbstractC3583h0.d("CameraValidator", "Cannot get lens facing from the availableCamerasSelector don't verify the camera lens facing.", e11);
                return;
            }
        } else {
            numD = null;
        }
        AbstractC3583h0.a("CameraValidator", "Verifying camera lens facing on " + Build.DEVICE + ", lensFacingInteger: " + numD);
        PackageManager packageManager = context.getPackageManager();
        int i10 = 0;
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera") && (c3598s == null || numD.intValue() == 1)) {
                C3598s.f33846d.g(z10.m());
                i10 = 1;
            }
        } catch (IllegalArgumentException e12) {
            e10 = e12;
            AbstractC3583h0.m("CameraValidator", "Camera LENS_FACING_BACK verification failed", e10);
        }
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera.front") && (c3598s == null || numD.intValue() == 0)) {
                C3598s.f33845c.g(z10.m());
                i10++;
            }
        } catch (IllegalArgumentException e13) {
            e10 = e13;
            AbstractC3583h0.m("CameraValidator", "Camera LENS_FACING_FRONT verification failed", e10);
        }
        try {
            f1458a.g(z10.m());
            AbstractC3583h0.a("CameraValidator", "Found a LENS_FACING_EXTERNAL camera");
            i10++;
        } catch (IllegalArgumentException unused) {
        }
        if (e10 == null) {
            return;
        }
        AbstractC3583h0.c("CameraValidator", "Camera LensFacing verification failed, existing cameras: " + z10.m());
        throw new b("Expected camera missing from device.", i10, e10);
    }
}
