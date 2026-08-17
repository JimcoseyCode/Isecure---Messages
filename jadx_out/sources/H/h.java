package H;

import com.facebook.react.uimanager.events.PointerEventHelper;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final Charset f3574e = StandardCharsets.US_ASCII;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final String[] f3575f = {PointerEventHelper.POINTER_TYPE_UNKNOWN, "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final int[] f3576g = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final byte[] f3577h = {65, 83, 67, 73, 73, 0, 0, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f3580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f3581d;

    h(int i10, int i11, byte[] bArr) {
        this(i10, i11, -1L, bArr);
    }

    public static h a(String str) {
        if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
            return new h(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
        }
        byte[] bytes = str.getBytes(f3574e);
        return new h(1, bytes.length, bytes);
    }

    public static h b(double[] dArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f3576g[12] * dArr.length]);
        byteBufferWrap.order(byteOrder);
        for (double d10 : dArr) {
            byteBufferWrap.putDouble(d10);
        }
        return new h(12, dArr.length, byteBufferWrap.array());
    }

    public static h c(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f3576g[9] * iArr.length]);
        byteBufferWrap.order(byteOrder);
        for (int i10 : iArr) {
            byteBufferWrap.putInt(i10);
        }
        return new h(9, iArr.length, byteBufferWrap.array());
    }

    public static h d(m[] mVarArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f3576g[10] * mVarArr.length]);
        byteBufferWrap.order(byteOrder);
        for (m mVar : mVarArr) {
            byteBufferWrap.putInt((int) mVar.b());
            byteBufferWrap.putInt((int) mVar.a());
        }
        return new h(10, mVarArr.length, byteBufferWrap.array());
    }

    public static h e(String str) {
        byte[] bytes = (str + (char) 0).getBytes(f3574e);
        return new h(2, bytes.length, bytes);
    }

    public static h f(long j10, ByteOrder byteOrder) {
        return g(new long[]{j10}, byteOrder);
    }

    public static h g(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f3576g[4] * jArr.length]);
        byteBufferWrap.order(byteOrder);
        for (long j10 : jArr) {
            byteBufferWrap.putInt((int) j10);
        }
        return new h(4, jArr.length, byteBufferWrap.array());
    }

    public static h h(m[] mVarArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f3576g[5] * mVarArr.length]);
        byteBufferWrap.order(byteOrder);
        for (m mVar : mVarArr) {
            byteBufferWrap.putInt((int) mVar.b());
            byteBufferWrap.putInt((int) mVar.a());
        }
        return new h(5, mVarArr.length, byteBufferWrap.array());
    }

    public static h i(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f3576g[3] * iArr.length]);
        byteBufferWrap.order(byteOrder);
        for (int i10 : iArr) {
            byteBufferWrap.putShort((short) i10);
        }
        return new h(3, iArr.length, byteBufferWrap.array());
    }

    public int j() {
        return f3576g[this.f3578a] * this.f3579b;
    }

    public String toString() {
        return "(" + f3575f[this.f3578a] + ", data length:" + this.f3581d.length + ")";
    }

    h(int i10, int i11, long j10, byte[] bArr) {
        this.f3578a = i10;
        this.f3579b = i11;
        this.f3580c = j10;
        this.f3581d = bArr;
    }
}
