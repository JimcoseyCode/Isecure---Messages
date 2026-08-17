package X5;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentMap f12491a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f12492b;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements c {
        a() {
        }

        @Override // X5.e.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String a(T5.g gVar) {
            return gVar.d();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b implements c {
        b() {
        }

        @Override // X5.e.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Integer a(T5.g gVar) {
            return Integer.valueOf(gVar.a());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    interface c {
        Object a(T5.g gVar);
    }

    private e(c cVar) {
        this.f12492b = cVar;
    }

    static e b() {
        return new e(new b());
    }

    static e c() {
        return new e(new a());
    }

    @Override // X5.g
    public void a(T5.g gVar) {
        this.f12491a.put(this.f12492b.a(gVar), gVar);
    }

    c d() {
        return this.f12492b;
    }

    T5.g e(Object obj) {
        if (obj != null) {
            return (T5.g) this.f12491a.get(obj);
        }
        return null;
    }
}
