package J4;

import java.util.HashMap;
import java.util.Map;
import w5.InterfaceC3481b;

/* JADX INFO: renamed from: J4.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C1183n implements InterfaceC3481b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final v5.d f6183d = new v5.d() { // from class: J4.m
        @Override // v5.d
        public final void a(Object obj, Object obj2) {
            int i10 = C1183n.f6184e;
            throw new v5.b("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f6184e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f6185a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f6186b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v5.d f6187c = f6183d;

    @Override // w5.InterfaceC3481b
    public final /* bridge */ /* synthetic */ InterfaceC3481b a(Class cls, v5.d dVar) {
        this.f6185a.put(cls, dVar);
        this.f6186b.remove(cls);
        return this;
    }

    public final C1190o b() {
        return new C1190o(new HashMap(this.f6185a), new HashMap(this.f6186b), this.f6187c);
    }
}
