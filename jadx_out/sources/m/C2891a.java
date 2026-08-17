package m;

import java.util.HashMap;
import java.util.Map;
import m.b;

/* JADX INFO: renamed from: m.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C2891a extends b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final HashMap f29491k = new HashMap();

    public boolean contains(Object obj) {
        return this.f29491k.containsKey(obj);
    }

    @Override // m.b
    protected b.c o(Object obj) {
        return (b.c) this.f29491k.get(obj);
    }

    @Override // m.b
    public Object s(Object obj, Object obj2) {
        b.c cVarO = o(obj);
        if (cVarO != null) {
            return cVarO.f29497h;
        }
        this.f29491k.put(obj, r(obj, obj2));
        return null;
    }

    @Override // m.b
    public Object t(Object obj) {
        Object objT = super.t(obj);
        this.f29491k.remove(obj);
        return objT;
    }

    public Map.Entry u(Object obj) {
        if (contains(obj)) {
            return ((b.c) this.f29491k.get(obj)).f29499j;
        }
        return null;
    }
}
