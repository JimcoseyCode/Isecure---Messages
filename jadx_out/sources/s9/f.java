package s9;

import kotlin.jvm.internal.AbstractC2855l;
import t9.C3391h;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f32405a = new f();

    private f() {
    }

    public final String a(int i10) {
        if (i10 < 1000 || i10 >= 5000) {
            return "Code must be in range [1000,5000): " + i10;
        }
        if ((1004 > i10 || 1006 < i10) && (1015 > i10 || 2999 < i10)) {
            return null;
        }
        return "Code " + i10 + " is reserved and may not be used.";
    }

    public final void b(C3391h.a cursor, byte[] key) {
        AbstractC2855l.g(cursor, "cursor");
        AbstractC2855l.g(key, "key");
        int length = key.length;
        int i10 = 0;
        do {
            byte[] bArr = cursor.f32598k;
            int i11 = cursor.f32599l;
            int i12 = cursor.f32600m;
            if (bArr != null) {
                while (i11 < i12) {
                    int i13 = i10 % length;
                    bArr[i11] = (byte) (bArr[i11] ^ key[i13]);
                    i11++;
                    i10 = i13 + 1;
                }
            }
        } while (cursor.e() != -1);
    }

    public final void c(int i10) {
        String strA = a(i10);
        if (strA == null) {
            return;
        }
        AbstractC2855l.d(strA);
        throw new IllegalArgumentException(strA.toString());
    }
}
