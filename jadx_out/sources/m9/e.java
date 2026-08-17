package m9;

import P8.q;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String[] f29828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f29829e = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t9.k f29825a = t9.k.f32603j.g("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f29826b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f29827c = new String[64];

    static {
        String[] strArr = new String[256];
        for (int i10 = 0; i10 < 256; i10++) {
            String binaryString = Integer.toBinaryString(i10);
            AbstractC2855l.f(binaryString, "Integer.toBinaryString(it)");
            strArr[i10] = q.D(f9.c.q("%8s", binaryString), ' ', '0', false, 4, null);
        }
        f29828d = strArr;
        String[] strArr2 = f29827c;
        strArr2[0] = PointerEventHelper.POINTER_TYPE_UNKNOWN;
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i11 = iArr[0];
        strArr2[i11 | 8] = AbstractC2855l.p(strArr2[i11], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i12 = 0; i12 < 3; i12++) {
            int i13 = iArr2[i12];
            int i14 = iArr[0];
            String[] strArr3 = f29827c;
            int i15 = i14 | i13;
            strArr3[i15] = strArr3[i14] + "|" + strArr3[i13];
            strArr3[i15 | 8] = strArr3[i14] + "|" + strArr3[i13] + "|PADDED";
        }
        int length = f29827c.length;
        for (int i16 = 0; i16 < length; i16++) {
            String[] strArr4 = f29827c;
            if (strArr4[i16] == null) {
                strArr4[i16] = f29828d[i16];
            }
        }
    }

    private e() {
    }

    public final String a(int i10, int i11) {
        String str;
        if (i11 == 0) {
            return PointerEventHelper.POINTER_TYPE_UNKNOWN;
        }
        if (i10 != 2 && i10 != 3) {
            if (i10 == 4 || i10 == 6) {
                return i11 == 1 ? "ACK" : f29828d[i11];
            }
            if (i10 != 7 && i10 != 8) {
                String[] strArr = f29827c;
                if (i11 < strArr.length) {
                    str = strArr[i11];
                    AbstractC2855l.d(str);
                } else {
                    str = f29828d[i11];
                }
                String str2 = str;
                return (i10 != 5 || (i11 & 4) == 0) ? (i10 != 0 || (i11 & 32) == 0) ? str2 : q.E(str2, "PRIORITY", "COMPRESSED", false, 4, null) : q.E(str2, "HEADERS", "PUSH_PROMISE", false, 4, null);
            }
        }
        return f29828d[i11];
    }

    public final String b(int i10) {
        String[] strArr = f29826b;
        return i10 < strArr.length ? strArr[i10] : f9.c.q("0x%02x", Integer.valueOf(i10));
    }

    public final String c(boolean z10, int i10, int i11, int i12, int i13) {
        return f9.c.q("%s 0x%08x %5d %-13s %s", z10 ? "<<" : ">>", Integer.valueOf(i10), Integer.valueOf(i11), b(i12), a(i12, i13));
    }
}
