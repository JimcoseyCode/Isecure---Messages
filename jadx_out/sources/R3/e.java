package R3;

import android.text.TextUtils;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10006c;

    public static int a(String str) {
        if (TextUtils.isEmpty(str) || str.length() != 4) {
            return -1159790593;
        }
        return ((str.charAt(3) & 255) << 24) | (str.charAt(0) & 255) | ((str.charAt(1) & 255) << 8) | ((str.charAt(2) & 255) << 16);
    }

    final void c(S3.a aVar) throws IOException {
        int iAvailable = aVar.available();
        b(aVar);
        int iAvailable2 = iAvailable - aVar.available();
        int i10 = this.f10005b;
        int i11 = i10 + (i10 & 1);
        if (iAvailable2 > i11) {
            throw new IOException("Out of chunk area");
        }
        if (iAvailable2 < i11) {
            aVar.skip(i11 - iAvailable2);
        }
    }

    void b(S3.a aVar) {
    }
}
