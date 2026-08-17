package e9;

import e9.C;
import e9.t;
import e9.x;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t9.C3391h;
import t9.InterfaceC3392i;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class y extends C {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final x f26352f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final x f26353g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final x f26354h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final x f26355i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final x f26356j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final byte[] f26357k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final byte[] f26358l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final byte[] f26359m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b f26360n = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f26361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f26362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t9.k f26363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final x f26364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f26365e;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {
        private b() {
        }

        public final void a(StringBuilder appendQuotedString, String key) {
            AbstractC2855l.g(appendQuotedString, "$this$appendQuotedString");
            AbstractC2855l.g(key, "key");
            appendQuotedString.append('\"');
            int length = key.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = key.charAt(i10);
                if (cCharAt == '\n') {
                    appendQuotedString.append("%0A");
                } else if (cCharAt == '\r') {
                    appendQuotedString.append("%0D");
                } else if (cCharAt != '\"') {
                    appendQuotedString.append(cCharAt);
                } else {
                    appendQuotedString.append("%22");
                }
            }
            appendQuotedString.append('\"');
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f26369c = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final t f26370a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C f26371b;

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class a {
            private a() {
            }

            public final c a(t tVar, C body) {
                AbstractC2855l.g(body, "body");
                DefaultConstructorMarker defaultConstructorMarker = null;
                if (!((tVar != null ? tVar.o("Content-Type") : null) == null)) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type");
                }
                if ((tVar != null ? tVar.o("Content-Length") : null) == null) {
                    return new c(tVar, body, defaultConstructorMarker);
                }
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            }

            public final c b(String name, String value) {
                AbstractC2855l.g(name, "name");
                AbstractC2855l.g(value, "value");
                return c(name, null, C.a.j(C.Companion, value, null, 1, null));
            }

            public final c c(String name, String str, C body) {
                AbstractC2855l.g(name, "name");
                AbstractC2855l.g(body, "body");
                StringBuilder sb = new StringBuilder();
                sb.append("form-data; name=");
                b bVar = y.f26360n;
                bVar.a(sb, name);
                if (str != null) {
                    sb.append("; filename=");
                    bVar.a(sb, str);
                }
                String string = sb.toString();
                AbstractC2855l.f(string, "StringBuilder().apply(builderAction).toString()");
                return a(new t.a().d("Content-Disposition", string).e(), body);
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private c(t tVar, C c10) {
            this.f26370a = tVar;
            this.f26371b = c10;
        }

        public final C a() {
            return this.f26371b;
        }

        public final t b() {
            return this.f26370a;
        }

        public /* synthetic */ c(t tVar, C c10, DefaultConstructorMarker defaultConstructorMarker) {
            this(tVar, c10);
        }
    }

    static {
        x.a aVar = x.f26347g;
        f26352f = aVar.b("multipart/mixed");
        f26353g = aVar.b("multipart/alternative");
        f26354h = aVar.b("multipart/digest");
        f26355i = aVar.b("multipart/parallel");
        f26356j = aVar.b("multipart/form-data");
        f26357k = new byte[]{(byte) 58, (byte) 32};
        f26358l = new byte[]{(byte) 13, (byte) 10};
        byte b10 = (byte) 45;
        f26359m = new byte[]{b10, b10};
    }

    public y(t9.k boundaryByteString, x type, List parts) {
        AbstractC2855l.g(boundaryByteString, "boundaryByteString");
        AbstractC2855l.g(type, "type");
        AbstractC2855l.g(parts, "parts");
        this.f26363c = boundaryByteString;
        this.f26364d = type;
        this.f26365e = parts;
        this.f26361a = x.f26347g.b(type + "; boundary=" + a());
        this.f26362b = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long b(InterfaceC3392i interfaceC3392i, boolean z10) throws EOFException {
        C3391h c3391h;
        if (z10) {
            interfaceC3392i = new C3391h();
            c3391h = interfaceC3392i;
        } else {
            c3391h = 0;
        }
        int size = this.f26365e.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            c cVar = (c) this.f26365e.get(i10);
            t tVarB = cVar.b();
            C cA = cVar.a();
            AbstractC2855l.d(interfaceC3392i);
            interfaceC3392i.write(f26359m);
            interfaceC3392i.S(this.f26363c);
            interfaceC3392i.write(f26358l);
            if (tVarB != null) {
                int size2 = tVarB.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    interfaceC3392i.V(tVarB.p(i11)).write(f26357k).V(tVarB.s(i11)).write(f26358l);
                }
            }
            x xVarContentType = cA.contentType();
            if (xVarContentType != null) {
                interfaceC3392i.V("Content-Type: ").V(xVarContentType.toString()).write(f26358l);
            }
            long jContentLength = cA.contentLength();
            if (jContentLength != -1) {
                interfaceC3392i.V("Content-Length: ").C0(jContentLength).write(f26358l);
            } else if (z10) {
                AbstractC2855l.d(c3391h);
                c3391h.k();
                return -1L;
            }
            byte[] bArr = f26358l;
            interfaceC3392i.write(bArr);
            if (z10) {
                j10 += jContentLength;
            } else {
                cA.writeTo(interfaceC3392i);
            }
            interfaceC3392i.write(bArr);
        }
        AbstractC2855l.d(interfaceC3392i);
        byte[] bArr2 = f26359m;
        interfaceC3392i.write(bArr2);
        interfaceC3392i.S(this.f26363c);
        interfaceC3392i.write(bArr2);
        interfaceC3392i.write(f26358l);
        if (!z10) {
            return j10;
        }
        AbstractC2855l.d(c3391h);
        long size3 = j10 + c3391h.size();
        c3391h.k();
        return size3;
    }

    public final String a() {
        return this.f26363c.I();
    }

    @Override // e9.C
    public long contentLength() throws EOFException {
        long j10 = this.f26362b;
        if (j10 != -1) {
            return j10;
        }
        long jB = b(null, true);
        this.f26362b = jB;
        return jB;
    }

    @Override // e9.C
    public x contentType() {
        return this.f26361a;
    }

    @Override // e9.C
    public void writeTo(InterfaceC3392i sink) throws EOFException {
        AbstractC2855l.g(sink, "sink");
        b(sink, false);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final t9.k f26366a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private x f26367b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f26368c;

        public a(String boundary) {
            AbstractC2855l.g(boundary, "boundary");
            this.f26366a = t9.k.f32603j.g(boundary);
            this.f26367b = y.f26352f;
            this.f26368c = new ArrayList();
        }

        public final a a(String name, String value) {
            AbstractC2855l.g(name, "name");
            AbstractC2855l.g(value, "value");
            d(c.f26369c.b(name, value));
            return this;
        }

        public final a b(String name, String str, C body) {
            AbstractC2855l.g(name, "name");
            AbstractC2855l.g(body, "body");
            d(c.f26369c.c(name, str, body));
            return this;
        }

        public final a c(t tVar, C body) {
            AbstractC2855l.g(body, "body");
            d(c.f26369c.a(tVar, body));
            return this;
        }

        public final a d(c part) {
            AbstractC2855l.g(part, "part");
            this.f26368c.add(part);
            return this;
        }

        public final y e() {
            if (this.f26368c.isEmpty()) {
                throw new IllegalStateException("Multipart body must have at least one part.");
            }
            return new y(this.f26366a, this.f26367b, f9.c.R(this.f26368c));
        }

        public final a f(x type) {
            AbstractC2855l.g(type, "type");
            if (AbstractC2855l.b(type.g(), "multipart")) {
                this.f26367b = type;
                return this;
            }
            throw new IllegalArgumentException(("multipart != " + type).toString());
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ a(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i10 & 1) != 0) {
                str = UUID.randomUUID().toString();
                AbstractC2855l.f(str, "UUID.randomUUID().toString()");
            }
            this(str);
        }
    }
}
