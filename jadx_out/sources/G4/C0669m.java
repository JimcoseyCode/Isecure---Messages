package G4;

import java.util.HashMap;
import java.util.Map;
import w5.InterfaceC3481b;

/* JADX INFO: renamed from: G4.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C0669m implements InterfaceC3481b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final v5.d f2926d = new v5.d() { // from class: G4.l
        @Override // v5.d
        public final void a(Object obj, Object obj2) {
            int i10 = C0669m.f2927e;
            throw new v5.b("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f2927e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f2928a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f2929b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v5.d f2930c = f2926d;

    @Override // w5.InterfaceC3481b
    public final /* bridge */ /* synthetic */ InterfaceC3481b a(Class cls, v5.d dVar) {
        this.f2928a.put(cls, dVar);
        this.f2929b.remove(cls);
        return this;
    }

    public final C0677n b() {
        return new C0677n(new HashMap(this.f2928a), new HashMap(this.f2929b), this.f2930c);
    }
}
