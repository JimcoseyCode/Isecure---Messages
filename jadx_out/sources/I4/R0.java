package I4;

import java.util.HashMap;
import java.util.Map;
import w5.InterfaceC3481b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class R0 implements InterfaceC3481b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final v5.d f4573d = new v5.d() { // from class: I4.Q0
        @Override // v5.d
        public final void a(Object obj, Object obj2) {
            int i10 = R0.f4574e;
            throw new v5.b("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f4574e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f4575a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f4576b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v5.d f4577c = f4573d;

    @Override // w5.InterfaceC3481b
    public final /* bridge */ /* synthetic */ InterfaceC3481b a(Class cls, v5.d dVar) {
        this.f4575a.put(cls, dVar);
        this.f4576b.remove(cls);
        return this;
    }

    public final S0 b() {
        return new S0(new HashMap(this.f4575a), new HashMap(this.f4576b), this.f4577c);
    }
}
