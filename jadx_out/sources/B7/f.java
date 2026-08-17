package B7;

import B7.a;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class f extends e {
    public static double b(double d10, double d11) {
        return d10 < d11 ? d11 : d10;
    }

    public static float c(float f10, float f11) {
        return f10 < f11 ? f11 : f10;
    }

    public static int d(int i10, int i11) {
        return i10 < i11 ? i11 : i10;
    }

    public static long e(long j10, long j11) {
        return j10 < j11 ? j11 : j10;
    }

    public static double f(double d10, double d11) {
        return d10 > d11 ? d11 : d10;
    }

    public static float g(float f10, float f11) {
        return f10 > f11 ? f11 : f10;
    }

    public static int h(int i10, int i11) {
        return i10 > i11 ? i11 : i10;
    }

    public static long i(long j10, long j11) {
        return j10 > j11 ? j11 : j10;
    }

    public static double j(double d10, double d11, double d12) {
        if (d11 <= d12) {
            return d10 < d11 ? d11 : d10 > d12 ? d12 : d10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d12 + " is less than minimum " + d11 + '.');
    }

    public static float k(float f10, float f11, float f12) {
        if (f11 <= f12) {
            return f10 < f11 ? f11 : f10 > f12 ? f12 : f10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f12 + " is less than minimum " + f11 + '.');
    }

    public static int l(int i10, int i11, int i12) {
        if (i11 <= i12) {
            return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + '.');
    }

    public static long m(long j10, long j11, long j12) {
        if (j11 <= j12) {
            return j10 < j11 ? j11 : j10 > j12 ? j12 : j10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j12 + " is less than minimum " + j11 + '.');
    }

    public static a n(int i10, int i11) {
        return a.f396j.a(i10, i11, -1);
    }

    public static a o(a aVar, int i10) {
        AbstractC2855l.g(aVar, "<this>");
        e.a(i10 > 0, Integer.valueOf(i10));
        a.C0018a c0018a = a.f396j;
        int iD = aVar.d();
        int iO = aVar.o();
        if (aVar.p() <= 0) {
            i10 = -i10;
        }
        return c0018a.a(iD, iO, i10);
    }

    public static c p(int i10, int i11) {
        return i11 <= Integer.MIN_VALUE ? c.f404k.a() : new c(i10, i11 - 1);
    }
}
