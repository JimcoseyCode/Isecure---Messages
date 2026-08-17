package o;

import android.os.Build;
import o.C2998f;

/* JADX INFO: renamed from: o.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2994b {
    static String a(int i10) {
        return i10 != 15 ? i10 != 255 ? i10 != 32768 ? i10 != 32783 ? i10 != 33023 ? String.valueOf(i10) : "BIOMETRIC_WEAK | DEVICE_CREDENTIAL" : "BIOMETRIC_STRONG | DEVICE_CREDENTIAL" : "DEVICE_CREDENTIAL" : "BIOMETRIC_WEAK" : "BIOMETRIC_STRONG";
    }

    static int b(C2998f.d dVar, C2998f.c cVar) {
        if (dVar.a() != 0) {
            return dVar.a();
        }
        int i10 = cVar != null ? 15 : 255;
        return dVar.g() ? 32768 | i10 : i10;
    }

    static boolean c(int i10) {
        return (i10 & 32768) != 0;
    }

    static boolean d(int i10) {
        return (i10 & 32767) != 0;
    }

    static boolean e(int i10) {
        if (i10 != 15 && i10 != 255) {
            if (i10 == 32768) {
                return Build.VERSION.SDK_INT >= 30;
            }
            if (i10 != 32783) {
                return i10 == 33023 || i10 == 0;
            }
            int i11 = Build.VERSION.SDK_INT;
            return i11 < 28 || i11 > 29;
        }
        return true;
    }

    static boolean f(int i10) {
        return (i10 & 255) == 255;
    }
}
