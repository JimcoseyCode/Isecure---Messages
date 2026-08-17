package W2;

import f2.InterfaceC2602c;
import g2.AbstractC2662a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public interface n extends x, InterfaceC2602c {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f11998a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AbstractC2662a f11999b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final b f12002e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f12004g;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f12000c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f12001d = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f12003f = 0;

        private a(Object obj, AbstractC2662a abstractC2662a, b bVar, int i10) {
            this.f11998a = c2.k.g(obj);
            this.f11999b = (AbstractC2662a) c2.k.g(AbstractC2662a.r(abstractC2662a));
            this.f12002e = bVar;
            this.f12004g = i10;
        }

        public static a a(Object obj, AbstractC2662a abstractC2662a, int i10, b bVar) {
            return new a(obj, abstractC2662a, bVar, i10);
        }

        public static a b(Object obj, AbstractC2662a abstractC2662a, b bVar) {
            return a(obj, abstractC2662a, -1, bVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface b {
        void a(Object obj, boolean z10);
    }

    AbstractC2662a c(Object obj);

    AbstractC2662a e(Object obj, AbstractC2662a abstractC2662a, b bVar);
}
