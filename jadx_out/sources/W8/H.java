package W8;

import com.facebook.react.uimanager.ViewDefaults;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class H {
    public static final int a(String str, int i10, int i11, int i12) {
        return (int) F.c(str, i10, i11, i12);
    }

    public static final long b(String str, long j10, long j11, long j12) {
        String strD = F.d(str);
        if (strD == null) {
            return j10;
        }
        Long lP = P8.q.p(strD);
        if (lP == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + strD + '\'').toString());
        }
        long jLongValue = lP.longValue();
        if (j11 <= jLongValue && jLongValue <= j12) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j11 + ".." + j12 + ", but is '" + jLongValue + '\'').toString());
    }

    public static final String c(String str, String str2) {
        String strD = F.d(str);
        return strD == null ? str2 : strD;
    }

    public static final boolean d(String str, boolean z10) {
        String strD = F.d(str);
        return strD != null ? Boolean.parseBoolean(strD) : z10;
    }

    public static /* synthetic */ int e(String str, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i11 = 1;
        }
        if ((i13 & 8) != 0) {
            i12 = ViewDefaults.NUMBER_OF_LINES;
        }
        return F.b(str, i10, i11, i12);
    }

    public static /* synthetic */ long f(String str, long j10, long j11, long j12, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j11 = 1;
        }
        long j13 = j11;
        if ((i10 & 8) != 0) {
            j12 = Long.MAX_VALUE;
        }
        return F.c(str, j10, j13, j12);
    }
}
