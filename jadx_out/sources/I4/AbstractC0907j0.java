package I4;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: I4.j0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0907j0 implements Map, Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private transient AbstractC0918k0 f4781g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private transient AbstractC0918k0 f4782h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private transient AbstractC0830c0 f4783i;

    AbstractC0907j0() {
    }

    public static AbstractC0907j0 c(Object obj, Object obj2) {
        L.b("optional-module-barcode", "com.google.android.gms.vision.barcode");
        return A0.g(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    }

    abstract AbstractC0830c0 a();

    @Override // java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC0830c0 values() {
        AbstractC0830c0 abstractC0830c0 = this.f4783i;
        if (abstractC0830c0 != null) {
            return abstractC0830c0;
        }
        AbstractC0830c0 abstractC0830c0A = a();
        this.f4783i = abstractC0830c0A;
        return abstractC0830c0A;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    abstract AbstractC0918k0 d();

    abstract AbstractC0918k0 e();

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final AbstractC0918k0 entrySet() {
        AbstractC0918k0 abstractC0918k0 = this.f4781g;
        if (abstractC0918k0 != null) {
            return abstractC0918k0;
        }
        AbstractC0918k0 abstractC0918k0D = d();
        this.f4781g = abstractC0918k0D;
        return abstractC0918k0D;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return C0.a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        AbstractC0918k0 abstractC0918k0 = this.f4782h;
        if (abstractC0918k0 != null) {
            return abstractC0918k0;
        }
        AbstractC0918k0 abstractC0918k0E = e();
        this.f4782h = abstractC0918k0E;
        return abstractC0918k0E;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        L.a(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb.append('{');
        boolean z10 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z10) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z10 = false;
        }
        sb.append('}');
        return sb.toString();
    }
}
