package I4;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import v5.c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class P0 implements v5.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Charset f4542f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final v5.c f4543g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final v5.c f4544h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final v5.d f4545i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OutputStream f4546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f4547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f4548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final v5.d f4549d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final T0 f4550e = new T0(this);

    static {
        c.b bVarA = v5.c.a("key");
        J0 j02 = new J0();
        j02.a(1);
        f4543g = bVarA.b(j02.b()).a();
        c.b bVarA2 = v5.c.a("value");
        J0 j03 = new J0();
        j03.a(2);
        f4544h = bVarA2.b(j03.b()).a();
        f4545i = new v5.d() { // from class: I4.O0
            @Override // v5.d
            public final void a(Object obj, Object obj2) {
                P0.j((Map.Entry) obj, (v5.e) obj2);
            }
        };
    }

    P0(OutputStream outputStream, Map map, Map map2, v5.d dVar) {
        this.f4546a = outputStream;
        this.f4547b = map;
        this.f4548c = map2;
        this.f4549d = dVar;
    }

    static /* synthetic */ void j(Map.Entry entry, v5.e eVar) {
        eVar.a(f4543g, entry.getKey());
        eVar.a(f4544h, entry.getValue());
    }

    private static int k(v5.c cVar) {
        N0 n02 = (N0) cVar.c(N0.class);
        if (n02 != null) {
            return n02.zza();
        }
        throw new v5.b("Field has no @Protobuf config");
    }

    private final long l(v5.d dVar, Object obj) throws IOException {
        K0 k02 = new K0();
        try {
            OutputStream outputStream = this.f4546a;
            this.f4546a = k02;
            try {
                dVar.a(obj, this);
                this.f4546a = outputStream;
                long jD = k02.d();
                k02.close();
                return jD;
            } catch (Throwable th) {
                this.f4546a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                k02.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private static N0 m(v5.c cVar) {
        N0 n02 = (N0) cVar.c(N0.class);
        if (n02 != null) {
            return n02;
        }
        throw new v5.b("Field has no @Protobuf config");
    }

    private final P0 n(v5.d dVar, v5.c cVar, Object obj, boolean z10) throws IOException {
        long jL = l(dVar, obj);
        if (z10 && jL == 0) {
            return this;
        }
        q((k(cVar) << 3) | 2);
        r(jL);
        dVar.a(obj, this);
        return this;
    }

    private final P0 o(v5.f fVar, v5.c cVar, Object obj, boolean z10) {
        this.f4550e.a(cVar, z10);
        fVar.a(obj, this.f4550e);
        return this;
    }

    private static ByteBuffer p(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final void q(int i10) throws IOException {
        while (true) {
            int i11 = i10 & 127;
            if ((i10 & (-128)) == 0) {
                this.f4546a.write(i11);
                return;
            } else {
                this.f4546a.write(i11 | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                i10 >>>= 7;
            }
        }
    }

    private final void r(long j10) throws IOException {
        while (true) {
            int i10 = ((int) j10) & 127;
            if (((-128) & j10) == 0) {
                this.f4546a.write(i10);
                return;
            } else {
                this.f4546a.write(i10 | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                j10 >>>= 7;
            }
        }
    }

    @Override // v5.e
    public final v5.e a(v5.c cVar, Object obj) throws IOException {
        f(cVar, obj, true);
        return this;
    }

    @Override // v5.e
    public final /* synthetic */ v5.e b(v5.c cVar, int i10) throws IOException {
        g(cVar, i10, true);
        return this;
    }

    @Override // v5.e
    public final /* synthetic */ v5.e c(v5.c cVar, long j10) throws IOException {
        h(cVar, j10, true);
        return this;
    }

    final v5.e d(v5.c cVar, double d10, boolean z10) throws IOException {
        if (z10 && d10 == 0.0d) {
            return this;
        }
        q((k(cVar) << 3) | 1);
        this.f4546a.write(p(8).putDouble(d10).array());
        return this;
    }

    final v5.e e(v5.c cVar, float f10, boolean z10) throws IOException {
        if (z10 && f10 == 0.0f) {
            return this;
        }
        q((k(cVar) << 3) | 5);
        this.f4546a.write(p(4).putFloat(f10).array());
        return this;
    }

    final v5.e f(v5.c cVar, Object obj, boolean z10) throws IOException {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z10 || charSequence.length() != 0) {
                    q((k(cVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f4542f);
                    q(bytes.length);
                    this.f4546a.write(bytes);
                    return this;
                }
            } else if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    f(cVar, it.next(), false);
                }
            } else if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    n(f4545i, cVar, (Map.Entry) it2.next(), false);
                }
            } else {
                if (obj instanceof Double) {
                    d(cVar, ((Double) obj).doubleValue(), z10);
                    return this;
                }
                if (obj instanceof Float) {
                    e(cVar, ((Float) obj).floatValue(), z10);
                    return this;
                }
                if (obj instanceof Number) {
                    h(cVar, ((Number) obj).longValue(), z10);
                    return this;
                }
                if (obj instanceof Boolean) {
                    g(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z10);
                    return this;
                }
                if (!(obj instanceof byte[])) {
                    v5.d dVar = (v5.d) this.f4547b.get(obj.getClass());
                    if (dVar != null) {
                        n(dVar, cVar, obj, z10);
                        return this;
                    }
                    v5.f fVar = (v5.f) this.f4548c.get(obj.getClass());
                    if (fVar != null) {
                        o(fVar, cVar, obj, z10);
                        return this;
                    }
                    if (obj instanceof L0) {
                        g(cVar, ((L0) obj).zza(), true);
                        return this;
                    }
                    if (obj instanceof Enum) {
                        g(cVar, ((Enum) obj).ordinal(), true);
                        return this;
                    }
                    n(this.f4549d, cVar, obj, z10);
                    return this;
                }
                byte[] bArr = (byte[]) obj;
                if (!z10 || bArr.length != 0) {
                    q((k(cVar) << 3) | 2);
                    q(bArr.length);
                    this.f4546a.write(bArr);
                    return this;
                }
            }
        }
        return this;
    }

    final P0 g(v5.c cVar, int i10, boolean z10) throws IOException {
        if (!z10 || i10 != 0) {
            N0 n0M = m(cVar);
            int iOrdinal = n0M.zzb().ordinal();
            if (iOrdinal == 0) {
                q(n0M.zza() << 3);
                q(i10);
                return this;
            }
            if (iOrdinal == 1) {
                q(n0M.zza() << 3);
                q((i10 + i10) ^ (i10 >> 31));
                return this;
            }
            if (iOrdinal == 2) {
                q((n0M.zza() << 3) | 5);
                this.f4546a.write(p(4).putInt(i10).array());
                return this;
            }
        }
        return this;
    }

    final P0 h(v5.c cVar, long j10, boolean z10) throws IOException {
        if (!z10 || j10 != 0) {
            N0 n0M = m(cVar);
            int iOrdinal = n0M.zzb().ordinal();
            if (iOrdinal == 0) {
                q(n0M.zza() << 3);
                r(j10);
                return this;
            }
            if (iOrdinal == 1) {
                q(n0M.zza() << 3);
                r((j10 >> 63) ^ (j10 + j10));
                return this;
            }
            if (iOrdinal == 2) {
                q((n0M.zza() << 3) | 1);
                this.f4546a.write(p(8).putLong(j10).array());
                return this;
            }
        }
        return this;
    }

    final P0 i(Object obj) {
        if (obj == null) {
            return this;
        }
        v5.d dVar = (v5.d) this.f4547b.get(obj.getClass());
        if (dVar == null) {
            throw new v5.b("No encoder for ".concat(String.valueOf(obj.getClass())));
        }
        dVar.a(obj, this);
        return this;
    }
}
