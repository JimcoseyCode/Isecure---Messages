package N5;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class l {
    public static void a(com.google.gson.f fVar, S5.c cVar) {
        O5.l.f8284X.d(cVar, fVar);
    }

    public static Writer b(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new a(appendable);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class a extends Writer {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Appendable f8144g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final C0084a f8145h = new C0084a();

        /* JADX INFO: renamed from: N5.l$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        static class C0084a implements CharSequence {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            char[] f8146g;

            C0084a() {
            }

            @Override // java.lang.CharSequence
            public char charAt(int i10) {
                return this.f8146g[i10];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.f8146g.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i10, int i11) {
                return new String(this.f8146g, i10, i11 - i10);
            }
        }

        a(Appendable appendable) {
            this.f8144g = appendable;
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i10, int i11) throws IOException {
            C0084a c0084a = this.f8145h;
            c0084a.f8146g = cArr;
            this.f8144g.append(c0084a, i10, i11 + i10);
        }

        @Override // java.io.Writer
        public void write(int i10) throws IOException {
            this.f8144g.append((char) i10);
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }
    }
}
