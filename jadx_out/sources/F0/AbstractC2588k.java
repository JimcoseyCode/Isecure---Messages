package f0;

import android.util.Rational;
import kotlin.jvm.internal.AbstractC2855l;
import y.AbstractC3583h0;
import y7.AbstractC3624a;

/* JADX INFO: renamed from: f0.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2588k {
    private static final boolean a(Rational rational) {
        return AbstractC2855l.b(rational, Rational.NaN) || AbstractC2855l.b(rational, Rational.ZERO) || AbstractC2855l.b(rational, Rational.NEGATIVE_INFINITY) || AbstractC2855l.b(rational, Rational.POSITIVE_INFINITY);
    }

    public static final int b(int i10, Rational rational) {
        if (rational == null) {
            return i10;
        }
        if (!a(rational)) {
            return AbstractC3624a.c(i10 * rational.floatValue());
        }
        AbstractC3583h0.l("CaptureEncodeRates", "Invalid capture-to-encode ratio: " + rational);
        return i10;
    }

    public static final int c(int i10, Rational rational) {
        if (rational == null) {
            return i10;
        }
        if (!a(rational)) {
            return AbstractC3624a.c(i10 / rational.floatValue());
        }
        AbstractC3583h0.l("CaptureEncodeRates", "Invalid capture-to-encode ratio: " + rational);
        return i10;
    }
}
