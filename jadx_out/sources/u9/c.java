package u9;

import kotlin.jvm.internal.AbstractC2855l;
import t9.C;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c {
    public static final int a(int[] iArr, int i10, int i11, int i12) {
        AbstractC2855l.g(iArr, "<this>");
        int i13 = i12 - 1;
        while (i11 <= i13) {
            int i14 = (i11 + i13) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i10) {
                i11 = i14 + 1;
            } else {
                if (i15 <= i10) {
                    return i14;
                }
                i13 = i14 - 1;
            }
        }
        return (-i11) - 1;
    }

    public static final int b(C c10, int i10) {
        AbstractC2855l.g(c10, "<this>");
        int iA = a(c10.K(), i10 + 1, 0, c10.L().length);
        return iA >= 0 ? iA : ~iA;
    }
}
