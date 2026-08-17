package J4;

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

/* JADX INFO: renamed from: J4.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C1169l implements v5.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Charset f6144f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final v5.c f6145g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final v5.c f6146h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final v5.d f6147i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OutputStream f6148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f6149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f6150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final v5.d f6151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C1197p f6152e = new C1197p(this);

    static {
        c.b bVarA = v5.c.a("key");
        C1127f c1127f = new C1127f();
        c1127f.a(1);
        f6145g = bVarA.b(c1127f.b()).a();
        c.b bVarA2 = v5.c.a("value");
        C1127f c1127f2 = new C1127f();
        c1127f2.a(2);
        f6146h = bVarA2.b(c1127f2.b()).a();
        f6147i = new v5.d() { // from class: J4.k
            @Override // v5.d
            public final void a(Object obj, Object obj2) {
                C1169l.j((Map.Entry) obj, (v5.e) obj2);
            }
        };
    }

    C1169l(OutputStream outputStream, Map map, Map map2, v5.d dVar) {
        this.f6148a = outputStream;
        this.f6149b = map;
        this.f6150c = map2;
        this.f6151d = dVar;
    }

    static /* synthetic */ void j(Map.Entry entry, v5.e eVar) {
        eVar.a(f6145g, entry.getKey());
        eVar.a(f6146h, entry.getValue());
    }

    private static int k(v5.c cVar) {
        InterfaceC1155j interfaceC1155j = (InterfaceC1155j) cVar.c(InterfaceC1155j.class);
        if (interfaceC1155j != null) {
            return interfaceC1155j.zza();
        }
        throw new v5.b("Field has no @Protobuf config");
    }

    private final long l(v5.d dVar, Object obj) throws IOException {
        C1134g c1134g = new C1134g();
        try {
            OutputStream outputStream = this.f6148a;
            this.f6148a = c1134g;
            try {
                dVar.a(obj, this);
                this.f6148a = outputStream;
                long jD = c1134g.d();
                c1134g.close();
                return jD;
            } catch (Throwable th) {
                this.f6148a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                c1134g.close();
            } catch (Throwable th3) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                } catch (Exception unused) {
                }
            }
            throw th2;
        }
    }

    private static InterfaceC1155j m(v5.c cVar) {
        InterfaceC1155j interfaceC1155j = (InterfaceC1155j) cVar.c(InterfaceC1155j.class);
        if (interfaceC1155j != null) {
            return interfaceC1155j;
        }
        throw new v5.b("Field has no @Protobuf config");
    }

    private final C1169l n(v5.d dVar, v5.c cVar, Object obj, boolean z10) throws IOException {
        long jL = l(dVar, obj);
        if (z10 && jL == 0) {
            return this;
        }
        q((k(cVar) << 3) | 2);
        r(jL);
        dVar.a(obj, this);
        return this;
    }

    private final C1169l o(v5.f fVar, v5.c cVar, Object obj, boolean z10) {
        this.f6152e.a(cVar, z10);
        fVar.a(obj, this.f6152e);
        return this;
    }

    private static ByteBuffer p(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final void q(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            this.f6148a.write((i10 & 127) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            i10 >>>= 7;
        }
        this.f6148a.write(i10 & 127);
    }

    private final void r(long j10) throws IOException {
        while (((-128) & j10) != 0) {
            this.f6148a.write((((int) j10) & 127) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            j10 >>>= 7;
        }
        this.f6148a.write(((int) j10) & 127);
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
        this.f6148a.write(p(8).putDouble(d10).array());
        return this;
    }

    final v5.e e(v5.c cVar, float f10, boolean z10) throws IOException {
        if (z10 && f10 == 0.0f) {
            return this;
        }
        q((k(cVar) << 3) | 5);
        this.f6148a.write(p(4).putFloat(f10).array());
        return this;
    }

    final v5.e f(v5.c cVar, Object obj, boolean z10) throws IOException {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z10 || charSequence.length() != 0) {
                    q((k(cVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f6144f);
                    q(bytes.length);
                    this.f6148a.write(bytes);
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
                    n(f6147i, cVar, (Map.Entry) it2.next(), false);
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
                    v5.d dVar = (v5.d) this.f6149b.get(obj.getClass());
                    if (dVar != null) {
                        n(dVar, cVar, obj, z10);
                        return this;
                    }
                    v5.f fVar = (v5.f) this.f6150c.get(obj.getClass());
                    if (fVar != null) {
                        o(fVar, cVar, obj, z10);
                        return this;
                    }
                    if (obj instanceof InterfaceC1141h) {
                        g(cVar, ((InterfaceC1141h) obj).zza(), true);
                        return this;
                    }
                    if (obj instanceof Enum) {
                        g(cVar, ((Enum) obj).ordinal(), true);
                        return this;
                    }
                    n(this.f6151d, cVar, obj, z10);
                    return this;
                }
                byte[] bArr = (byte[]) obj;
                if (!z10 || bArr.length != 0) {
                    q((k(cVar) << 3) | 2);
                    q(bArr.length);
                    this.f6148a.write(bArr);
                    return this;
                }
            }
        }
        return this;
    }

    final C1169l g(v5.c cVar, int i10, boolean z10) throws IOException {
        if (!z10 || i10 != 0) {
            InterfaceC1155j interfaceC1155jM = m(cVar);
            EnumC1148i enumC1148i = EnumC1148i.DEFAULT;
            int iOrdinal = interfaceC1155jM.zzb().ordinal();
            if (iOrdinal == 0) {
                q(interfaceC1155jM.zza() << 3);
                q(i10);
                return this;
            }
            if (iOrdinal == 1) {
                q(interfaceC1155jM.zza() << 3);
                q((i10 + i10) ^ (i10 >> 31));
                return this;
            }
            if (iOrdinal == 2) {
                q((interfaceC1155jM.zza() << 3) | 5);
                this.f6148a.write(p(4).putInt(i10).array());
                return this;
            }
        }
        return this;
    }

    final C1169l h(v5.c cVar, long j10, boolean z10) throws IOException {
        if (!z10 || j10 != 0) {
            InterfaceC1155j interfaceC1155jM = m(cVar);
            EnumC1148i enumC1148i = EnumC1148i.DEFAULT;
            int iOrdinal = interfaceC1155jM.zzb().ordinal();
            if (iOrdinal == 0) {
                q(interfaceC1155jM.zza() << 3);
                r(j10);
                return this;
            }
            if (iOrdinal == 1) {
                q(interfaceC1155jM.zza() << 3);
                r((j10 >> 63) ^ (j10 + j10));
                return this;
            }
            if (iOrdinal == 2) {
                q((interfaceC1155jM.zza() << 3) | 1);
                this.f6148a.write(p(8).putLong(j10).array());
                return this;
            }
        }
        return this;
    }

    final C1169l i(Object obj) {
        if (obj == null) {
            return this;
        }
        v5.d dVar = (v5.d) this.f6149b.get(obj.getClass());
        if (dVar == null) {
            throw new v5.b("No encoder for ".concat(String.valueOf(obj.getClass())));
        }
        dVar.a(obj, this);
        return this;
    }
}
