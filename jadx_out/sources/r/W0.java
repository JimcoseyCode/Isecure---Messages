package r;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import s.C3294h;
import y.C3579f0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class W0 {
    public static boolean a(s.S s10, String str) throws C3579f0 {
        if ("robolectric".equals(Build.FINGERPRINT)) {
            return true;
        }
        try {
            int[] iArr = (int[]) s10.c(str).a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i10 : iArr) {
                    if (i10 == 0) {
                        return true;
                    }
                }
            }
            return false;
        } catch (C3294h e10) {
            throw new C3579f0(Z0.a(e10));
        }
    }
}
