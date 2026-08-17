package androidx.camera.core.internal.compat.quirk;

import F.InterfaceC0471b1;
import android.os.Build;
import androidx.camera.core.o;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class IncorrectJpegMetadataQuirk implements InterfaceC0471b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set f15199a = new HashSet(Arrays.asList("A24", "BEYOND0", "BEYOND2"));

    private boolean g(byte[] bArr) {
        byte b10;
        int i10 = 2;
        while (i10 + 4 <= bArr.length && (b10 = bArr[i10]) == -1) {
            if (b10 == -1 && bArr[i10 + 1] == -38) {
                return true;
            }
            i10 += (((bArr[i10 + 2] & 255) << 8) | (bArr[i10 + 3] & 255)) + 2;
        }
        return false;
    }

    private int h(byte[] bArr) {
        int i10 = 2;
        while (true) {
            int i11 = i10 + 1;
            if (i11 > bArr.length) {
                return -1;
            }
            if (bArr[i10] == -1 && bArr[i11] == -40) {
                return i10;
            }
            i10 = i11;
        }
    }

    private static boolean i() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && f15199a.contains(Build.DEVICE.toUpperCase(Locale.US));
    }

    static boolean k() {
        return i();
    }

    public byte[] j(o oVar) {
        int iH = 0;
        ByteBuffer byteBufferC = oVar.p()[0].c();
        byte[] bArr = new byte[byteBufferC.capacity()];
        byteBufferC.rewind();
        byteBufferC.get(bArr);
        return (g(bArr) || (iH = h(bArr)) != -1) ? Arrays.copyOfRange(bArr, iH, byteBufferC.limit()) : bArr;
    }
}
