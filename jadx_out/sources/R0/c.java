package R0;

import R0.f;
import j7.AbstractC2793j;
import j7.AbstractC2800q;
import j7.K;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f9939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f9940b;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class a extends n implements Function1 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f9941h = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Map.Entry entry) {
            AbstractC2855l.g(entry, "entry");
            Object value = entry.getValue();
            return "  " + ((f.a) entry.getKey()).a() + " = " + (value instanceof byte[] ? AbstractC2793j.Y((byte[]) value, ", ", "[", "]", 0, null, null, 56, null) : String.valueOf(entry.getValue()));
        }
    }

    public /* synthetic */ c(Map map, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new LinkedHashMap() : map, (i10 & 2) != 0 ? true : z10);
    }

    @Override // R0.f
    public Map a() {
        Pair pair;
        Set<Map.Entry> setEntrySet = this.f9939a.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(B7.d.d(K.e(AbstractC2800q.u(setEntrySet, 10)), 16));
        for (Map.Entry entry : setEntrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                AbstractC2855l.f(bArrCopyOf, "copyOf(this, size)");
                pair = new Pair(key, bArrCopyOf);
            } else {
                pair = new Pair(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(pair.c(), pair.d());
        }
        return R0.a.b(linkedHashMap);
    }

    @Override // R0.f
    public Object b(f.a key) {
        AbstractC2855l.g(key, "key");
        Object obj = this.f9939a.get(key);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        AbstractC2855l.f(bArrCopyOf, "copyOf(this, size)");
        return bArrCopyOf;
    }

    public final void e() {
        if (this.f9940b.a()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        boolean zB;
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        Map map = cVar.f9939a;
        if (map == this.f9939a) {
            return true;
        }
        if (map.size() != this.f9939a.size()) {
            return false;
        }
        Map map2 = cVar.f9939a;
        if (map2.isEmpty()) {
            return true;
        }
        for (Map.Entry entry : map2.entrySet()) {
            Object obj2 = this.f9939a.get(entry.getKey());
            if (obj2 != null) {
                Object value = entry.getValue();
                zB = value instanceof byte[] ? (obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2) : AbstractC2855l.b(value, obj2);
            }
            if (!zB) {
                return false;
            }
        }
        return true;
    }

    public final void f() {
        this.f9940b.b(true);
    }

    public final void g(f.b... pairs) {
        AbstractC2855l.g(pairs, "pairs");
        e();
        if (pairs.length <= 0) {
            return;
        }
        f.b bVar = pairs[0];
        throw null;
    }

    public final Object h(f.a key) {
        AbstractC2855l.g(key, "key");
        e();
        return this.f9939a.remove(key);
    }

    public int hashCode() {
        Iterator it = this.f9939a.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final void i(f.a key, Object obj) {
        AbstractC2855l.g(key, "key");
        j(key, obj);
    }

    public final void j(f.a key, Object obj) {
        AbstractC2855l.g(key, "key");
        e();
        if (obj == null) {
            h(key);
            return;
        }
        if (obj instanceof Set) {
            this.f9939a.put(key, R0.a.a((Set) obj));
            return;
        }
        if (!(obj instanceof byte[])) {
            this.f9939a.put(key, obj);
            return;
        }
        Map map = this.f9939a;
        byte[] bArr = (byte[]) obj;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        AbstractC2855l.f(bArrCopyOf, "copyOf(this, size)");
        map.put(key, bArrCopyOf);
    }

    public String toString() {
        return AbstractC2800q.o0(this.f9939a.entrySet(), ",\n", "{\n", "\n}", 0, null, a.f9941h, 24, null);
    }

    public c(Map preferencesMap, boolean z10) {
        AbstractC2855l.g(preferencesMap, "preferencesMap");
        this.f9939a = preferencesMap;
        this.f9940b = new b(z10);
    }
}
