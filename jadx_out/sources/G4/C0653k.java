package G4;

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

/* JADX INFO: renamed from: G4.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C0653k implements v5.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Charset f2876f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final v5.c f2877g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final v5.c f2878h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final v5.d f2879i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OutputStream f2880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f2881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f2882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final v5.d f2883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C0685o f2884e = new C0685o(this);

    static {
        c.b bVarA = v5.c.a("key");
        C0605e c0605e = new C0605e();
        c0605e.a(1);
        f2877g = bVarA.b(c0605e.b()).a();
        c.b bVarA2 = v5.c.a("value");
        C0605e c0605e2 = new C0605e();
        c0605e2.a(2);
        f2878h = bVarA2.b(c0605e2.b()).a();
        f2879i = new v5.d() { // from class: G4.j
            @Override // v5.d
            public final void a(Object obj, Object obj2) {
                C0653k.j((Map.Entry) obj, (v5.e) obj2);
            }
        };
    }

    C0653k(OutputStream outputStream, Map map, Map map2, v5.d dVar) {
        this.f2880a = outputStream;
        this.f2881b = map;
        this.f2882c = map2;
        this.f2883d = dVar;
    }

    static /* synthetic */ void j(Map.Entry entry, v5.e eVar) {
        eVar.a(f2877g, entry.getKey());
        eVar.a(f2878h, entry.getValue());
    }

    private static int k(v5.c cVar) {
        InterfaceC0637i interfaceC0637i = (InterfaceC0637i) cVar.c(InterfaceC0637i.class);
        if (interfaceC0637i != null) {
            return interfaceC0637i.zza();
        }
        throw new v5.b("Field has no @Protobuf config");
    }

    private final long l(v5.d dVar, Object obj) throws IOException {
        C0613f c0613f = new C0613f();
        try {
            OutputStream outputStream = this.f2880a;
            this.f2880a = c0613f;
            try {
                dVar.a(obj, this);
                this.f2880a = outputStream;
                long jD = c0613f.d();
                c0613f.close();
                return jD;
            } catch (Throwable th) {
                this.f2880a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                c0613f.close();
            } catch (Throwable th3) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                } catch (Exception unused) {
                }
            }
            throw th2;
        }
    }

    private static InterfaceC0637i m(v5.c cVar) {
        InterfaceC0637i interfaceC0637i = (InterfaceC0637i) cVar.c(InterfaceC0637i.class);
        if (interfaceC0637i != null) {
            return interfaceC0637i;
        }
        throw new v5.b("Field has no @Protobuf config");
    }

    private final C0653k n(v5.d dVar, v5.c cVar, Object obj, boolean z10) throws IOException {
        long jL = l(dVar, obj);
        if (z10 && jL == 0) {
            return this;
        }
        q((k(cVar) << 3) | 2);
        r(jL);
        dVar.a(obj, this);
        return this;
    }

    private final C0653k o(v5.f fVar, v5.c cVar, Object obj, boolean z10) {
        this.f2884e.a(cVar, z10);
        fVar.a(obj, this.f2884e);
        return this;
    }

    private static ByteBuffer p(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final void q(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            this.f2880a.write((i10 & 127) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            i10 >>>= 7;
        }
        this.f2880a.write(i10 & 127);
    }

    private final void r(long j10) throws IOException {
        while (((-128) & j10) != 0) {
            this.f2880a.write((((int) j10) & 127) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            j10 >>>= 7;
        }
        this.f2880a.write(((int) j10) & 127);
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
        this.f2880a.write(p(8).putDouble(d10).array());
        return this;
    }

    final v5.e e(v5.c cVar, float f10, boolean z10) throws IOException {
        if (z10 && f10 == 0.0f) {
            return this;
        }
        q((k(cVar) << 3) | 5);
        this.f2880a.write(p(4).putFloat(f10).array());
        return this;
    }

    final v5.e f(v5.c cVar, Object obj, boolean z10) throws IOException {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z10 || charSequence.length() != 0) {
                    q((k(cVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f2876f);
                    q(bytes.length);
                    this.f2880a.write(bytes);
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
                    n(f2879i, cVar, (Map.Entry) it2.next(), false);
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
                    v5.d dVar = (v5.d) this.f2881b.get(obj.getClass());
                    if (dVar != null) {
                        n(dVar, cVar, obj, z10);
                        return this;
                    }
                    v5.f fVar = (v5.f) this.f2882c.get(obj.getClass());
                    if (fVar != null) {
                        o(fVar, cVar, obj, z10);
                        return this;
                    }
                    if (obj instanceof InterfaceC0621g) {
                        g(cVar, ((InterfaceC0621g) obj).zza(), true);
                        return this;
                    }
                    if (obj instanceof Enum) {
                        g(cVar, ((Enum) obj).ordinal(), true);
                        return this;
                    }
                    n(this.f2883d, cVar, obj, z10);
                    return this;
                }
                byte[] bArr = (byte[]) obj;
                if (!z10 || bArr.length != 0) {
                    q((k(cVar) << 3) | 2);
                    q(bArr.length);
                    this.f2880a.write(bArr);
                    return this;
                }
            }
        }
        return this;
    }

    final C0653k g(v5.c cVar, int i10, boolean z10) throws IOException {
        if (!z10 || i10 != 0) {
            InterfaceC0637i interfaceC0637iM = m(cVar);
            EnumC0629h enumC0629h = EnumC0629h.DEFAULT;
            int iOrdinal = interfaceC0637iM.zzb().ordinal();
            if (iOrdinal == 0) {
                q(interfaceC0637iM.zza() << 3);
                q(i10);
                return this;
            }
            if (iOrdinal == 1) {
                q(interfaceC0637iM.zza() << 3);
                q((i10 + i10) ^ (i10 >> 31));
                return this;
            }
            if (iOrdinal == 2) {
                q((interfaceC0637iM.zza() << 3) | 5);
                this.f2880a.write(p(4).putInt(i10).array());
                return this;
            }
        }
        return this;
    }

    final C0653k h(v5.c cVar, long j10, boolean z10) throws IOException {
        if (!z10 || j10 != 0) {
            InterfaceC0637i interfaceC0637iM = m(cVar);
            EnumC0629h enumC0629h = EnumC0629h.DEFAULT;
            int iOrdinal = interfaceC0637iM.zzb().ordinal();
            if (iOrdinal == 0) {
                q(interfaceC0637iM.zza() << 3);
                r(j10);
                return this;
            }
            if (iOrdinal == 1) {
                q(interfaceC0637iM.zza() << 3);
                r((j10 >> 63) ^ (j10 + j10));
                return this;
            }
            if (iOrdinal == 2) {
                q((interfaceC0637iM.zza() << 3) | 1);
                this.f2880a.write(p(8).putLong(j10).array());
                return this;
            }
        }
        return this;
    }

    final C0653k i(Object obj) {
        if (obj == null) {
            return this;
        }
        v5.d dVar = (v5.d) this.f2881b.get(obj.getClass());
        if (dVar == null) {
            throw new v5.b("No encoder for ".concat(String.valueOf(obj.getClass())));
        }
        dVar.a(obj, this);
        return this;
    }
}
