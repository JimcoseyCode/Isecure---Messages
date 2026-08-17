package y7;

import com.facebook.react.uimanager.ViewDefaults;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: y7.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3626c extends AbstractC3625b {
    public static int a(long j10) {
        return Long.signum(j10);
    }

    public static int b(double d10) {
        if (Double.isNaN(d10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return d10 > 2.147483647E9d ? ViewDefaults.NUMBER_OF_LINES : d10 < -2.147483648E9d ? androidx.customview.widget.a.INVALID_ID : (int) Math.round(d10);
    }

    public static int c(float f10) {
        if (Float.isNaN(f10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f10);
    }

    public static long d(double d10) {
        if (Double.isNaN(d10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d10);
    }
}
