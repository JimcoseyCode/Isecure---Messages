package x5;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import v5.f;
import v5.g;

/* JADX INFO: renamed from: x5.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class C3548e implements v5.e, g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C3548e f33540a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f33541b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final JsonWriter f33542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f33543d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f33544e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final v5.d f33545f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f33546g;

    C3548e(Writer writer, Map map, Map map2, v5.d dVar, boolean z10) {
        this.f33542c = new JsonWriter(writer);
        this.f33543d = map;
        this.f33544e = map2;
        this.f33545f = dVar;
        this.f33546g = z10;
    }

    private boolean o(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    private C3548e r(String str, Object obj) throws IOException {
        t();
        this.f33542c.name(str);
        if (obj != null) {
            return h(obj, false);
        }
        this.f33542c.nullValue();
        return this;
    }

    private C3548e s(String str, Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        t();
        this.f33542c.name(str);
        return h(obj, false);
    }

    private void t() throws IOException {
        if (!this.f33541b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        C3548e c3548e = this.f33540a;
        if (c3548e != null) {
            c3548e.t();
            this.f33540a.f33541b = false;
            this.f33540a = null;
            this.f33542c.endObject();
        }
    }

    @Override // v5.e
    public v5.e a(v5.c cVar, Object obj) {
        return l(cVar.b(), obj);
    }

    @Override // v5.e
    public v5.e b(v5.c cVar, int i10) {
        return j(cVar.b(), i10);
    }

    @Override // v5.e
    public v5.e c(v5.c cVar, long j10) {
        return k(cVar.b(), j10);
    }

    public C3548e f(int i10) throws IOException {
        t();
        this.f33542c.value(i10);
        return this;
    }

    public C3548e g(long j10) throws IOException {
        t();
        this.f33542c.value(j10);
        return this;
    }

    C3548e h(Object obj, boolean z10) {
        if (z10 && o(obj)) {
            throw new v5.b(String.format("%s cannot be encoded inline", obj == null ? null : obj.getClass()));
        }
        if (obj == null) {
            this.f33542c.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f33542c.value((Number) obj);
            return this;
        }
        int i10 = 0;
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.f33542c.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    h(it.next(), false);
                }
                this.f33542c.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.f33542c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        l((String) key, entry.getValue());
                    } catch (ClassCastException e10) {
                        throw new v5.b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e10);
                    }
                }
                this.f33542c.endObject();
                return this;
            }
            v5.d dVar = (v5.d) this.f33543d.get(obj.getClass());
            if (dVar != null) {
                return q(dVar, obj, z10);
            }
            f fVar = (f) this.f33544e.get(obj.getClass());
            if (fVar != null) {
                fVar.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                return q(this.f33545f, obj, z10);
            }
            d(((Enum) obj).name());
            return this;
        }
        if (obj instanceof byte[]) {
            return n((byte[]) obj);
        }
        this.f33542c.beginArray();
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i10 < length) {
                this.f33542c.value(r6[i10]);
                i10++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i10 < length2) {
                g(jArr[i10]);
                i10++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i10 < length3) {
                this.f33542c.value(dArr[i10]);
                i10++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i10 < length4) {
                this.f33542c.value(zArr[i10]);
                i10++;
            }
        } else if (obj instanceof Number[]) {
            for (Number number : (Number[]) obj) {
                h(number, false);
            }
        } else {
            for (Object obj2 : (Object[]) obj) {
                h(obj2, false);
            }
        }
        this.f33542c.endArray();
        return this;
    }

    @Override // v5.g
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public C3548e d(String str) throws IOException {
        t();
        this.f33542c.value(str);
        return this;
    }

    public C3548e j(String str, int i10) throws IOException {
        t();
        this.f33542c.name(str);
        return f(i10);
    }

    public C3548e k(String str, long j10) throws IOException {
        t();
        this.f33542c.name(str);
        return g(j10);
    }

    public C3548e l(String str, Object obj) {
        return this.f33546g ? s(str, obj) : r(str, obj);
    }

    @Override // v5.g
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public C3548e e(boolean z10) throws IOException {
        t();
        this.f33542c.value(z10);
        return this;
    }

    public C3548e n(byte[] bArr) throws IOException {
        t();
        if (bArr == null) {
            this.f33542c.nullValue();
            return this;
        }
        this.f33542c.value(Base64.encodeToString(bArr, 2));
        return this;
    }

    void p() {
        t();
        this.f33542c.flush();
    }

    C3548e q(v5.d dVar, Object obj, boolean z10) throws IOException {
        if (!z10) {
            this.f33542c.beginObject();
        }
        dVar.a(obj, this);
        if (!z10) {
            this.f33542c.endObject();
        }
        return this;
    }
}
