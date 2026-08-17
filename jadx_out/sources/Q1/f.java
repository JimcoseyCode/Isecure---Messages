package Q1;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile Object f9027a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f9028b;

        a(b bVar) {
            this.f9028b = bVar;
        }

        @Override // Q1.f.b
        public Object get() {
            if (this.f9027a == null) {
                synchronized (this) {
                    try {
                        if (this.f9027a == null) {
                            this.f9027a = k.e(this.f9028b.get());
                        }
                    } finally {
                    }
                }
            }
            return this.f9027a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface b {
        Object get();
    }

    public static b a(b bVar) {
        return new a(bVar);
    }
}
