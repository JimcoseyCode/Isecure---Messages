package m8;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import m8.p;

/* JADX INFO: renamed from: m8.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2942a implements p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected int f29631g = 0;

    v d() {
        return new v(this);
    }

    public void h(OutputStream outputStream) throws IOException {
        int iB = b();
        C2947f c2947fI = C2947f.I(outputStream, C2947f.t(C2947f.u(iB) + iB));
        c2947fI.n0(iB);
        g(c2947fI);
        c2947fI.H();
    }

    /* JADX INFO: renamed from: m8.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class AbstractC0318a implements p.a {
        protected static v h(p pVar) {
            return new v(pVar);
        }

        /* JADX INFO: renamed from: m8.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        static final class C0319a extends FilterInputStream {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f29632g;

            C0319a(InputStream inputStream, int i10) {
                super(inputStream);
                this.f29632g = i10;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() {
                return Math.min(super.available(), this.f29632g);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws IOException {
                if (this.f29632g <= 0) {
                    return -1;
                }
                int i10 = super.read();
                if (i10 >= 0) {
                    this.f29632g--;
                }
                return i10;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j10) throws IOException {
                long jSkip = super.skip(Math.min(j10, this.f29632g));
                if (jSkip >= 0) {
                    this.f29632g = (int) (((long) this.f29632g) - jSkip);
                }
                return jSkip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i10, int i11) throws IOException {
                int i12 = this.f29632g;
                if (i12 <= 0) {
                    return -1;
                }
                int i13 = super.read(bArr, i10, Math.min(i11, i12));
                if (i13 >= 0) {
                    this.f29632g -= i13;
                }
                return i13;
            }
        }
    }
}
