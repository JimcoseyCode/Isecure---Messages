package y;

import F.W;
import F.j1;
import F.w1;
import y.r0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public interface r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r0 f33833a = new r0() { // from class: y.q0
        @Override // y.r0
        public final r0.c a(r0.b bVar) {
            return r0.c.f33838d;
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r0 f33834b = new W.b(b());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r0 f33835c = new F.W(b());

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final r0 f33836a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f33837b;

        public a(r0 r0Var) {
            this.f33836a = r0Var;
            this.f33837b = r0Var.c();
        }

        public r0 a() {
            r0 r0Var = this.f33836a;
            return r0Var instanceof j1 ? ((j1) r0Var).d(this.f33837b) : new w1(this.f33837b, this.f33836a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface b {
        Throwable a();

        int b();

        long c();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f33838d = new c(false, 0);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c f33839e = new c(true);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c f33840f = new c(true, 100);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static c f33841g = new c(false, 0, true);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f33842a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f33843b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f33844c;

        private c(boolean z10) {
            this(z10, a());
        }

        public static long a() {
            return 500L;
        }

        public long b() {
            return this.f33842a;
        }

        public boolean c() {
            return this.f33844c;
        }

        public boolean d() {
            return this.f33843b;
        }

        private c(boolean z10, long j10) {
            this(z10, j10, false);
        }

        private c(boolean z10, long j10, boolean z11) {
            this.f33843b = z10;
            this.f33842a = j10;
            if (z11) {
                H0.g.b(!z10, "shouldRetry must be false when completeWithoutFailure is set to true");
            }
            this.f33844c = z11;
        }
    }

    static long b() {
        return 6000L;
    }

    c a(b bVar);

    default long c() {
        return 0L;
    }
}
