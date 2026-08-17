package H4;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: H4.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0787i implements Map, Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private transient AbstractC0788j f3772g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private transient AbstractC0788j f3773h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private transient AbstractC0781c f3774i;

    AbstractC0787i() {
    }

    public static AbstractC0787i c(Object obj, Object obj2) {
        X.a("optional-module-barcode", "com.google.android.gms.vision.barcode");
        return C0795q.g(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    }

    abstract AbstractC0781c a();

    @Override // java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC0781c values() {
        AbstractC0781c abstractC0781c = this.f3774i;
        if (abstractC0781c != null) {
            return abstractC0781c;
        }
        AbstractC0781c abstractC0781cA = a();
        this.f3774i = abstractC0781cA;
        return abstractC0781cA;
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

    abstract AbstractC0788j d();

    abstract AbstractC0788j e();

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
    public final AbstractC0788j entrySet() {
        AbstractC0788j abstractC0788j = this.f3772g;
        if (abstractC0788j != null) {
            return abstractC0788j;
        }
        AbstractC0788j abstractC0788jD = d();
        this.f3772g = abstractC0788jD;
        return abstractC0788jD;
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
        return r.a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        AbstractC0788j abstractC0788j = this.f3773h;
        if (abstractC0788j != null) {
            return abstractC0788j;
        }
        AbstractC0788j abstractC0788jE = e();
        this.f3773h = abstractC0788jE;
        return abstractC0788jE;
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
        if (size < 0) {
            throw new IllegalArgumentException("size cannot be negative but was: " + size);
        }
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
