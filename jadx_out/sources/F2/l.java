package f2;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f27232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC2600a f27233b;

    public l(InterfaceC2600a interfaceC2600a) {
        this(interfaceC2600a, 16384);
    }

    public long a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = (byte[]) this.f27233b.get(this.f27232a);
        long j10 = 0;
        while (true) {
            try {
                int i10 = inputStream.read(bArr, 0, this.f27232a);
                if (i10 == -1) {
                    return j10;
                }
                outputStream.write(bArr, 0, i10);
                j10 += (long) i10;
            } finally {
                this.f27233b.release(bArr);
            }
        }
    }

    public l(InterfaceC2600a interfaceC2600a, int i10) {
        c2.k.b(Boolean.valueOf(i10 > 0));
        this.f27232a = i10;
        this.f27233b = interfaceC2600a;
    }
}
