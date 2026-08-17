package e9;

import P8.C1385d;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t7.AbstractC3376c;
import t9.InterfaceC3392i;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class C {
    public static final a Companion = new a(null);

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: e9.C$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class C0263a extends C {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ File f26003a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ x f26004b;

            C0263a(File file, x xVar) {
                this.f26003a = file;
                this.f26004b = xVar;
            }

            @Override // e9.C
            public long contentLength() {
                return this.f26003a.length();
            }

            @Override // e9.C
            public x contentType() {
                return this.f26004b;
            }

            @Override // e9.C
            public void writeTo(InterfaceC3392i sink) throws IOException {
                AbstractC2855l.g(sink, "sink");
                t9.F fJ = t9.s.j(this.f26003a);
                try {
                    sink.G(fJ);
                    AbstractC3376c.a(fJ, null);
                } finally {
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class b extends C {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ t9.k f26005a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ x f26006b;

            b(t9.k kVar, x xVar) {
                this.f26005a = kVar;
                this.f26006b = xVar;
            }

            @Override // e9.C
            public long contentLength() {
                return this.f26005a.E();
            }

            @Override // e9.C
            public x contentType() {
                return this.f26006b;
            }

            @Override // e9.C
            public void writeTo(InterfaceC3392i sink) {
                AbstractC2855l.g(sink, "sink");
                sink.S(this.f26005a);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class c extends C {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ byte[] f26007a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ x f26008b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f26009c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f26010d;

            c(byte[] bArr, x xVar, int i10, int i11) {
                this.f26007a = bArr;
                this.f26008b = xVar;
                this.f26009c = i10;
                this.f26010d = i11;
            }

            @Override // e9.C
            public long contentLength() {
                return this.f26009c;
            }

            @Override // e9.C
            public x contentType() {
                return this.f26008b;
            }

            @Override // e9.C
            public void writeTo(InterfaceC3392i sink) {
                AbstractC2855l.g(sink, "sink");
                sink.write(this.f26007a, this.f26010d, this.f26009c);
            }
        }

        private a() {
        }

        public static /* synthetic */ C i(a aVar, x xVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                i10 = 0;
            }
            if ((i12 & 8) != 0) {
                i11 = bArr.length;
            }
            return aVar.d(xVar, bArr, i10, i11);
        }

        public static /* synthetic */ C j(a aVar, String str, x xVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                xVar = null;
            }
            return aVar.f(str, xVar);
        }

        public static /* synthetic */ C k(a aVar, byte[] bArr, x xVar, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                xVar = null;
            }
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = bArr.length;
            }
            return aVar.h(bArr, xVar, i10, i11);
        }

        public final C a(x xVar, File file) {
            AbstractC2855l.g(file, "file");
            return e(file, xVar);
        }

        public final C b(x xVar, String content) {
            AbstractC2855l.g(content, "content");
            return f(content, xVar);
        }

        public final C c(x xVar, t9.k content) {
            AbstractC2855l.g(content, "content");
            return g(content, xVar);
        }

        public final C d(x xVar, byte[] content, int i10, int i11) {
            AbstractC2855l.g(content, "content");
            return h(content, xVar, i10, i11);
        }

        public final C e(File asRequestBody, x xVar) {
            AbstractC2855l.g(asRequestBody, "$this$asRequestBody");
            return new C0263a(asRequestBody, xVar);
        }

        public final C f(String toRequestBody, x xVar) {
            AbstractC2855l.g(toRequestBody, "$this$toRequestBody");
            Charset charset = C1385d.f8858b;
            if (xVar != null) {
                Charset charsetD = x.d(xVar, null, 1, null);
                if (charsetD == null) {
                    xVar = x.f26347g.c(xVar + "; charset=utf-8");
                } else {
                    charset = charsetD;
                }
            }
            byte[] bytes = toRequestBody.getBytes(charset);
            AbstractC2855l.f(bytes, "(this as java.lang.String).getBytes(charset)");
            return h(bytes, xVar, 0, bytes.length);
        }

        public final C g(t9.k toRequestBody, x xVar) {
            AbstractC2855l.g(toRequestBody, "$this$toRequestBody");
            return new b(toRequestBody, xVar);
        }

        public final C h(byte[] toRequestBody, x xVar, int i10, int i11) {
            AbstractC2855l.g(toRequestBody, "$this$toRequestBody");
            f9.c.i(toRequestBody.length, i10, i11);
            return new c(toRequestBody, xVar, i11, i10);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final C create(x xVar, File file) {
        return Companion.a(xVar, file);
    }

    public abstract long contentLength();

    public abstract x contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(InterfaceC3392i interfaceC3392i);

    public static final C create(x xVar, String str) {
        return Companion.b(xVar, str);
    }

    public static final C create(x xVar, t9.k kVar) {
        return Companion.c(xVar, kVar);
    }

    public static final C create(x xVar, byte[] bArr) {
        return a.i(Companion, xVar, bArr, 0, 0, 12, null);
    }

    public static final C create(x xVar, byte[] bArr, int i10) {
        return a.i(Companion, xVar, bArr, i10, 0, 8, null);
    }

    public static final C create(x xVar, byte[] bArr, int i10, int i11) {
        return Companion.d(xVar, bArr, i10, i11);
    }

    public static final C create(File file, x xVar) {
        return Companion.e(file, xVar);
    }

    public static final C create(String str, x xVar) {
        return Companion.f(str, xVar);
    }

    public static final C create(t9.k kVar, x xVar) {
        return Companion.g(kVar, xVar);
    }

    public static final C create(byte[] bArr) {
        return a.k(Companion, bArr, null, 0, 0, 7, null);
    }

    public static final C create(byte[] bArr, x xVar) {
        return a.k(Companion, bArr, xVar, 0, 0, 6, null);
    }

    public static final C create(byte[] bArr, x xVar, int i10) {
        return a.k(Companion, bArr, xVar, i10, 0, 4, null);
    }

    public static final C create(byte[] bArr, x xVar, int i10, int i11) {
        return Companion.h(bArr, xVar, i10, i11);
    }
}
