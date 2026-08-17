package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.k0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f16746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f16747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f16748c;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k0.b f16749a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f16750b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final k0.b f16751c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f16752d;

        public a(k0.b bVar, Object obj, k0.b bVar2, Object obj2) {
            this.f16749a = bVar;
            this.f16750b = obj;
            this.f16751c = bVar2;
            this.f16752d = obj2;
        }
    }

    private C(k0.b bVar, Object obj, k0.b bVar2, Object obj2) {
        this.f16746a = new a(bVar, obj, bVar2, obj2);
        this.f16747b = obj;
        this.f16748c = obj2;
    }

    static int b(a aVar, Object obj, Object obj2) {
        return C1724q.b(aVar.f16749a, 1, obj) + C1724q.b(aVar.f16751c, 2, obj2);
    }

    public static C d(k0.b bVar, Object obj, k0.b bVar2, Object obj2) {
        return new C(bVar, obj, bVar2, obj2);
    }

    static void e(AbstractC1716i abstractC1716i, a aVar, Object obj, Object obj2) {
        C1724q.u(abstractC1716i, aVar.f16749a, 1, obj);
        C1724q.u(abstractC1716i, aVar.f16751c, 2, obj2);
    }

    public int a(int i10, Object obj, Object obj2) {
        return AbstractC1716i.O(i10) + AbstractC1716i.y(b(this.f16746a, obj, obj2));
    }

    a c() {
        return this.f16746a;
    }
}
