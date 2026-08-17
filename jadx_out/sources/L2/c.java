package l2;

import com.facebook.webpsupport.WebpBitmapFactoryImpl;
import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f29418a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f29419b = e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static InterfaceC2865b f29420c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f29421d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f29422e = a("RIFF");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final byte[] f29423f = a("WEBP");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final byte[] f29424g = a("VP8 ");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final byte[] f29425h = a("VP8L");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final byte[] f29426i = a("VP8X");

    private static byte[] a(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("ASCII not found!", e10);
        }
    }

    public static boolean b(byte[] bArr, int i10) {
        return j(bArr, i10 + 12, f29426i) && ((bArr[i10 + 20] & 2) == 2);
    }

    public static boolean c(byte[] bArr, int i10, int i11) {
        return i11 >= 21 && j(bArr, i10 + 12, f29426i);
    }

    public static boolean d(byte[] bArr, int i10) {
        return j(bArr, i10 + 12, f29426i) && ((bArr[i10 + 20] & 16) == 16);
    }

    private static boolean e() {
        return true;
    }

    public static boolean f(byte[] bArr, int i10) {
        return j(bArr, i10 + 12, f29425h);
    }

    public static boolean g(byte[] bArr, int i10) {
        return j(bArr, i10 + 12, f29424g);
    }

    public static boolean h(byte[] bArr, int i10, int i11) {
        return i11 >= 20 && j(bArr, i10, f29422e) && j(bArr, i10 + 8, f29423f);
    }

    public static InterfaceC2865b i() {
        InterfaceC2865b interfaceC2865b;
        if (f29421d) {
            return f29420c;
        }
        try {
            interfaceC2865b = (InterfaceC2865b) WebpBitmapFactoryImpl.class.newInstance();
        } catch (Throwable unused) {
            interfaceC2865b = null;
        }
        f29421d = true;
        return interfaceC2865b;
    }

    private static boolean j(byte[] bArr, int i10, byte[] bArr2) {
        if (bArr2 == null || bArr == null || bArr2.length + i10 > bArr.length) {
            return false;
        }
        for (int i11 = 0; i11 < bArr2.length; i11++) {
            if (bArr[i11 + i10] != bArr2[i11]) {
                return false;
            }
        }
        return true;
    }
}
