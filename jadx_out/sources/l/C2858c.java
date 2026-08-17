package l;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C2858c extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile C2858c f29401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Executor f29402d = new Executor() { // from class: l.a
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C2858c.f().c(runnable);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Executor f29403e = new Executor() { // from class: l.b
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C2858c.f().a(runnable);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f29404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f29405b;

    private C2858c() {
        C2859d c2859d = new C2859d();
        this.f29405b = c2859d;
        this.f29404a = c2859d;
    }

    public static C2858c f() {
        if (f29401c != null) {
            return f29401c;
        }
        synchronized (C2858c.class) {
            try {
                if (f29401c == null) {
                    f29401c = new C2858c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f29401c;
    }

    @Override // l.e
    public void a(Runnable runnable) {
        this.f29404a.a(runnable);
    }

    @Override // l.e
    public boolean b() {
        return this.f29404a.b();
    }

    @Override // l.e
    public void c(Runnable runnable) {
        this.f29404a.c(runnable);
    }
}
