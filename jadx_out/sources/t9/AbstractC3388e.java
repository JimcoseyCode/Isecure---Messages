package t9;

import kotlin.jvm.internal.AbstractC2855l;
import t9.C3391h;

/* JADX INFO: renamed from: t9.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3388e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C3391h.a f32577a = new C3391h.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f32578b = -1234567890;

    public static final boolean a(byte[] a10, int i10, byte[] b10, int i11, int i12) {
        AbstractC2855l.g(a10, "a");
        AbstractC2855l.g(b10, "b");
        for (int i13 = 0; i13 < i12; i13++) {
            if (a10[i13 + i10] != b10[i13 + i11]) {
                return false;
            }
        }
        return true;
    }

    public static final void b(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException("size=" + j10 + " offset=" + j11 + " byteCount=" + j12);
        }
    }

    public static final int c() {
        return f32578b;
    }

    public static final C3391h.a d() {
        return f32577a;
    }

    public static final int e(k kVar, int i10) {
        AbstractC2855l.g(kVar, "<this>");
        return i10 == f32578b ? kVar.E() : i10;
    }

    public static final int f(byte[] bArr, int i10) {
        AbstractC2855l.g(bArr, "<this>");
        return i10 == f32578b ? bArr.length : i10;
    }

    public static final C3391h.a g(C3391h.a unsafeCursor) {
        AbstractC2855l.g(unsafeCursor, "unsafeCursor");
        return unsafeCursor == f32577a ? new C3391h.a() : unsafeCursor;
    }

    public static final int h(int i10) {
        return ((i10 & 255) << 24) | (((-16777216) & i10) >>> 24) | ((16711680 & i10) >>> 8) | ((65280 & i10) << 8);
    }

    public static final short i(short s10) {
        return (short) (((s10 & 255) << 8) | ((65280 & s10) >>> 8));
    }

    public static final String j(byte b10) {
        return P8.q.s(new char[]{u9.b.f()[(b10 >> 4) & 15], u9.b.f()[b10 & 15]});
    }

    public static final String k(int i10) {
        if (i10 == 0) {
            return "0";
        }
        int i11 = 0;
        char[] cArr = {u9.b.f()[(i10 >> 28) & 15], u9.b.f()[(i10 >> 24) & 15], u9.b.f()[(i10 >> 20) & 15], u9.b.f()[(i10 >> 16) & 15], u9.b.f()[(i10 >> 12) & 15], u9.b.f()[(i10 >> 8) & 15], u9.b.f()[(i10 >> 4) & 15], u9.b.f()[i10 & 15]};
        while (i11 < 8 && cArr[i11] == '0') {
            i11++;
        }
        return P8.q.t(cArr, i11, 8);
    }
}
