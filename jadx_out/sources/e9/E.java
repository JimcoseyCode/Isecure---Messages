package e9;

import P8.C1385d;
import com.facebook.react.uimanager.ViewDefaults;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t7.AbstractC3376c;
import t9.C3391h;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class E implements Closeable {
    public static final b Companion = new b(null);
    private Reader reader;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends Reader {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f26038g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Reader f26039h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final t9.j f26040i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final Charset f26041j;

        public a(t9.j source, Charset charset) {
            AbstractC2855l.g(source, "source");
            AbstractC2855l.g(charset, "charset");
            this.f26040i = source;
            this.f26041j = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f26038g = true;
            Reader reader = this.f26039h;
            if (reader != null) {
                reader.close();
            } else {
                this.f26040i.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cbuf, int i10, int i11) throws IOException {
            AbstractC2855l.g(cbuf, "cbuf");
            if (this.f26038g) {
                throw new IOException("Stream closed");
            }
            Reader inputStreamReader = this.f26039h;
            if (inputStreamReader == null) {
                inputStreamReader = new InputStreamReader(this.f26040i.inputStream(), f9.c.G(this.f26040i, this.f26041j));
                this.f26039h = inputStreamReader;
            }
            return inputStreamReader.read(cbuf, i10, i11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class a extends E {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ t9.j f26042g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ x f26043h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ long f26044i;

            a(t9.j jVar, x xVar, long j10) {
                this.f26042g = jVar;
                this.f26043h = xVar;
                this.f26044i = j10;
            }

            @Override // e9.E
            public long contentLength() {
                return this.f26044i;
            }

            @Override // e9.E
            public x contentType() {
                return this.f26043h;
            }

            @Override // e9.E
            public t9.j source() {
                return this.f26042g;
            }
        }

        private b() {
        }

        public static /* synthetic */ E i(b bVar, t9.j jVar, x xVar, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                xVar = null;
            }
            if ((i10 & 2) != 0) {
                j10 = -1;
            }
            return bVar.f(jVar, xVar, j10);
        }

        public static /* synthetic */ E j(b bVar, byte[] bArr, x xVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                xVar = null;
            }
            return bVar.h(bArr, xVar);
        }

        public final E a(x xVar, long j10, t9.j content) {
            AbstractC2855l.g(content, "content");
            return f(content, xVar, j10);
        }

        public final E b(x xVar, String content) {
            AbstractC2855l.g(content, "content");
            return e(content, xVar);
        }

        public final E c(x xVar, t9.k content) {
            AbstractC2855l.g(content, "content");
            return g(content, xVar);
        }

        public final E d(x xVar, byte[] content) {
            AbstractC2855l.g(content, "content");
            return h(content, xVar);
        }

        public final E e(String toResponseBody, x xVar) {
            AbstractC2855l.g(toResponseBody, "$this$toResponseBody");
            Charset charset = C1385d.f8858b;
            if (xVar != null) {
                Charset charsetD = x.d(xVar, null, 1, null);
                if (charsetD == null) {
                    xVar = x.f26347g.c(xVar + "; charset=utf-8");
                } else {
                    charset = charsetD;
                }
            }
            C3391h c3391hD1 = new C3391h().d1(toResponseBody, charset);
            return f(c3391hD1, xVar, c3391hD1.size());
        }

        public final E f(t9.j asResponseBody, x xVar, long j10) {
            AbstractC2855l.g(asResponseBody, "$this$asResponseBody");
            return new a(asResponseBody, xVar, j10);
        }

        public final E g(t9.k toResponseBody, x xVar) {
            AbstractC2855l.g(toResponseBody, "$this$toResponseBody");
            return f(new C3391h().S(toResponseBody), xVar, toResponseBody.E());
        }

        public final E h(byte[] toResponseBody, x xVar) {
            AbstractC2855l.g(toResponseBody, "$this$toResponseBody");
            return f(new C3391h().write(toResponseBody), xVar, toResponseBody.length);
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final E create(x xVar, long j10, t9.j jVar) {
        return Companion.a(xVar, j10, jVar);
    }

    private final Charset d() {
        Charset charsetC;
        x xVarContentType = contentType();
        return (xVarContentType == null || (charsetC = xVarContentType.c(C1385d.f8858b)) == null) ? C1385d.f8858b : charsetC;
    }

    public final InputStream byteStream() {
        return source().inputStream();
    }

    public final t9.k byteString() throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > ViewDefaults.NUMBER_OF_LINES) {
            throw new IOException("Cannot buffer entire body for content length: " + jContentLength);
        }
        t9.j jVarSource = source();
        try {
            t9.k kVarC0 = jVarSource.c0();
            AbstractC3376c.a(jVarSource, null);
            int iE = kVarC0.E();
            if (jContentLength == -1 || jContentLength == iE) {
                return kVarC0;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + iE + ") disagree");
        } finally {
        }
    }

    public final byte[] bytes() throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > ViewDefaults.NUMBER_OF_LINES) {
            throw new IOException("Cannot buffer entire body for content length: " + jContentLength);
        }
        t9.j jVarSource = source();
        try {
            byte[] bArrC = jVarSource.C();
            AbstractC3376c.a(jVarSource, null);
            int length = bArrC.length;
            if (jContentLength == -1 || jContentLength == length) {
                return bArrC;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + length + ") disagree");
        } finally {
        }
    }

    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        a aVar = new a(source(), d());
        this.reader = aVar;
        return aVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        f9.c.j(source());
    }

    public abstract long contentLength();

    public abstract x contentType();

    public abstract t9.j source();

    public final String string() throws IOException {
        t9.j jVarSource = source();
        try {
            String strY = jVarSource.Y(f9.c.G(jVarSource, d()));
            AbstractC3376c.a(jVarSource, null);
            return strY;
        } finally {
        }
    }

    public static final E create(x xVar, String str) {
        return Companion.b(xVar, str);
    }

    public static final E create(x xVar, t9.k kVar) {
        return Companion.c(xVar, kVar);
    }

    public static final E create(x xVar, byte[] bArr) {
        return Companion.d(xVar, bArr);
    }

    public static final E create(String str, x xVar) {
        return Companion.e(str, xVar);
    }

    public static final E create(t9.j jVar, x xVar, long j10) {
        return Companion.f(jVar, xVar, j10);
    }

    public static final E create(t9.k kVar, x xVar) {
        return Companion.g(kVar, xVar);
    }

    public static final E create(byte[] bArr, x xVar) {
        return Companion.h(bArr, xVar);
    }
}
