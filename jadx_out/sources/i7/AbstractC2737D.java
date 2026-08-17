package i7;

import P8.AbstractC1382a;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: i7.D, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2737D {
    public static final int a(int i10, int i11) {
        return AbstractC2855l.i(i10 ^ androidx.customview.widget.a.INVALID_ID, i11 ^ androidx.customview.widget.a.INVALID_ID);
    }

    public static final int b(long j10, long j11) {
        return AbstractC2855l.j(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE);
    }

    public static final String c(long j10, int i10) {
        if (j10 >= 0) {
            String string = Long.toString(j10, AbstractC1382a.a(i10));
            AbstractC2855l.f(string, "toString(...)");
            return string;
        }
        long j11 = i10;
        long j12 = ((j10 >>> 1) / j11) << 1;
        long j13 = j10 - (j12 * j11);
        if (j13 >= j11) {
            j13 -= j11;
            j12++;
        }
        StringBuilder sb = new StringBuilder();
        String string2 = Long.toString(j12, AbstractC1382a.a(i10));
        AbstractC2855l.f(string2, "toString(...)");
        sb.append(string2);
        String string3 = Long.toString(j13, AbstractC1382a.a(i10));
        AbstractC2855l.f(string3, "toString(...)");
        sb.append(string3);
        return sb.toString();
    }
}
