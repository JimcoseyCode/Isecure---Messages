package j3;

import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: j3.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C2768b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2768b f28875a = new C2768b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f28876b = new C0302b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f28877c;

    /* JADX INFO: renamed from: j3.b$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface a {
    }

    /* JADX INFO: renamed from: j3.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class C0302b implements a {
    }

    /* JADX INFO: renamed from: j3.b$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface c {
        void a(String str);

        void b();

        boolean c();
    }

    private C2768b() {
    }

    public static final void a(String name) {
        AbstractC2855l.g(name, "name");
        f28875a.c().a(name);
    }

    public static final void b() {
        f28875a.c().b();
    }

    private final c c() {
        C2767a c2767a;
        c cVar = f28877c;
        if (cVar != null) {
            return cVar;
        }
        synchronized (C2768b.class) {
            c2767a = new C2767a();
            f28877c = c2767a;
        }
        return c2767a;
    }

    public static final boolean d() {
        return f28875a.c().c();
    }
}
