package h0;

import P8.q;
import android.os.StatFs;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: h0.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C2691e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2691e f28256a = new C2691e();

    private C2691e() {
    }

    public static final String a(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException("Bytes cannot be negative");
        }
        String[] strArr = {"B", "KB", "MB", "GB", "TB"};
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        double d10 = j10;
        int i10 = 0;
        double d11 = d10;
        while (d11 >= 1024.0d && i10 < 4) {
            d11 /= 1024.0d;
            i10++;
        }
        if (i10 == 0) {
            return decimalFormat.format(d11) + ' ' + strArr[i10];
        }
        StringBuilder sb = new StringBuilder();
        while (-1 < i10) {
            double dPow = Math.pow(1024.0d, i10);
            double dFloor = Math.floor(d10 / dPow);
            if (dFloor > 0.0d) {
                sb.append(decimalFormat.format(dFloor));
                sb.append(" ");
                sb.append(strArr[i10]);
                sb.append(" ");
                d10 -= dFloor * dPow;
            }
            i10--;
        }
        return q.c1(sb).toString();
    }

    public static final long b(File file) {
        AbstractC2855l.g(file, "file");
        String path = file.getPath();
        AbstractC2855l.f(path, "getPath(...)");
        return c(path);
    }

    public static final long c(String path) {
        AbstractC2855l.g(path, "path");
        return new StatFs(path).getAvailableBytes();
    }

    public static final boolean d(Exception e10) {
        String message;
        AbstractC2855l.g(e10, "e");
        return (e10 instanceof FileNotFoundException) && (message = e10.getMessage()) != null && q.Q(message, "No space left on device", false, 2, null);
    }
}
