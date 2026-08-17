package y5;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import y5.d;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class f implements v5.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Charset f33963f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final v5.c f33964g = v5.c.a("key").b(C3616a.b().c(1).a()).a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final v5.c f33965h = v5.c.a("value").b(C3616a.b().c(2).a()).a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final v5.d f33966i = new v5.d() { // from class: y5.e
        @Override // v5.d
        public final void a(Object obj, Object obj2) {
            f.d((Map.Entry) obj, (v5.e) obj2);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OutputStream f33967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f33968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f33969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final v5.d f33970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i f33971e = new i(this);

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f33972a;

        static {
            int[] iArr = new int[d.a.values().length];
            f33972a = iArr;
            try {
                iArr[d.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33972a[d.a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33972a[d.a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    f(OutputStream outputStream, Map map, Map map2, v5.d dVar) {
        this.f33967a = outputStream;
        this.f33968b = map;
        this.f33969c = map2;
        this.f33970d = dVar;
    }

    public static /* synthetic */ void d(Map.Entry entry, v5.e eVar) {
        eVar.a(f33964g, entry.getKey());
        eVar.a(f33965h, entry.getValue());
    }

    private static ByteBuffer m(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }

    private long n(v5.d dVar, Object obj) throws IOException {
        b bVar = new b();
        try {
            OutputStream outputStream = this.f33967a;
            this.f33967a = bVar;
            try {
                dVar.a(obj, this);
                this.f33967a = outputStream;
                long jD = bVar.d();
                bVar.close();
                return jD;
            } catch (Throwable th) {
                this.f33967a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                bVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private f o(v5.d dVar, v5.c cVar, Object obj, boolean z10) throws IOException {
        long jN = n(dVar, obj);
        if (z10 && jN == 0) {
            return this;
        }
        t((s(cVar) << 3) | 2);
        u(jN);
        dVar.a(obj, this);
        return this;
    }

    private f p(v5.f fVar, v5.c cVar, Object obj, boolean z10) {
        this.f33971e.b(cVar, z10);
        fVar.a(obj, this.f33971e);
        return this;
    }

    private static d r(v5.c cVar) {
        d dVar = (d) cVar.c(d.class);
        if (dVar != null) {
            return dVar;
        }
        throw new v5.b("Field has no @Protobuf config");
    }

    private static int s(v5.c cVar) {
        d dVar = (d) cVar.c(d.class);
        if (dVar != null) {
            return dVar.tag();
        }
        throw new v5.b("Field has no @Protobuf config");
    }

    private void t(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            this.f33967a.write((i10 & 127) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            i10 >>>= 7;
        }
        this.f33967a.write(i10 & 127);
    }

    private void u(long j10) throws IOException {
        while (((-128) & j10) != 0) {
            this.f33967a.write((((int) j10) & 127) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            j10 >>>= 7;
        }
        this.f33967a.write(((int) j10) & 127);
    }

    @Override // v5.e
    public v5.e a(v5.c cVar, Object obj) {
        return g(cVar, obj, true);
    }

    v5.e e(v5.c cVar, double d10, boolean z10) throws IOException {
        if (z10 && d10 == 0.0d) {
            return this;
        }
        t((s(cVar) << 3) | 1);
        this.f33967a.write(m(8).putDouble(d10).array());
        return this;
    }

    v5.e f(v5.c cVar, float f10, boolean z10) throws IOException {
        if (z10 && f10 == 0.0f) {
            return this;
        }
        t((s(cVar) << 3) | 5);
        this.f33967a.write(m(4).putFloat(f10).array());
        return this;
    }

    v5.e g(v5.c cVar, Object obj, boolean z10) throws IOException {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z10 || charSequence.length() != 0) {
                    t((s(cVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f33963f);
                    t(bytes.length);
                    this.f33967a.write(bytes);
                    return this;
                }
            } else if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    g(cVar, it.next(), false);
                }
            } else if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    o(f33966i, cVar, (Map.Entry) it2.next(), false);
                }
            } else {
                if (obj instanceof Double) {
                    return e(cVar, ((Double) obj).doubleValue(), z10);
                }
                if (obj instanceof Float) {
                    return f(cVar, ((Float) obj).floatValue(), z10);
                }
                if (obj instanceof Number) {
                    return k(cVar, ((Number) obj).longValue(), z10);
                }
                if (obj instanceof Boolean) {
                    return l(cVar, ((Boolean) obj).booleanValue(), z10);
                }
                if (!(obj instanceof byte[])) {
                    v5.d dVar = (v5.d) this.f33968b.get(obj.getClass());
                    if (dVar != null) {
                        return o(dVar, cVar, obj, z10);
                    }
                    v5.f fVar = (v5.f) this.f33969c.get(obj.getClass());
                    return fVar != null ? p(fVar, cVar, obj, z10) : obj instanceof c ? b(cVar, ((c) obj).a()) : obj instanceof Enum ? b(cVar, ((Enum) obj).ordinal()) : o(this.f33970d, cVar, obj, z10);
                }
                byte[] bArr = (byte[]) obj;
                if (!z10 || bArr.length != 0) {
                    t((s(cVar) << 3) | 2);
                    t(bArr.length);
                    this.f33967a.write(bArr);
                    return this;
                }
            }
        }
        return this;
    }

    @Override // v5.e
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public f b(v5.c cVar, int i10) {
        return i(cVar, i10, true);
    }

    f i(v5.c cVar, int i10, boolean z10) throws IOException {
        if (!z10 || i10 != 0) {
            d dVarR = r(cVar);
            int i11 = a.f33972a[dVarR.intEncoding().ordinal()];
            if (i11 == 1) {
                t(dVarR.tag() << 3);
                t(i10);
                return this;
            }
            if (i11 == 2) {
                t(dVarR.tag() << 3);
                t((i10 << 1) ^ (i10 >> 31));
                return this;
            }
            if (i11 == 3) {
                t((dVarR.tag() << 3) | 5);
                this.f33967a.write(m(4).putInt(i10).array());
                return this;
            }
        }
        return this;
    }

    @Override // v5.e
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public f c(v5.c cVar, long j10) {
        return k(cVar, j10, true);
    }

    f k(v5.c cVar, long j10, boolean z10) throws IOException {
        if (!z10 || j10 != 0) {
            d dVarR = r(cVar);
            int i10 = a.f33972a[dVarR.intEncoding().ordinal()];
            if (i10 == 1) {
                t(dVarR.tag() << 3);
                u(j10);
                return this;
            }
            if (i10 == 2) {
                t(dVarR.tag() << 3);
                u((j10 >> 63) ^ (j10 << 1));
                return this;
            }
            if (i10 == 3) {
                t((dVarR.tag() << 3) | 1);
                this.f33967a.write(m(8).putLong(j10).array());
                return this;
            }
        }
        return this;
    }

    f l(v5.c cVar, boolean z10, boolean z11) {
        return i(cVar, z10 ? 1 : 0, z11);
    }

    f q(Object obj) {
        if (obj == null) {
            return this;
        }
        v5.d dVar = (v5.d) this.f33968b.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, this);
            return this;
        }
        throw new v5.b("No encoder for " + obj.getClass());
    }
}
