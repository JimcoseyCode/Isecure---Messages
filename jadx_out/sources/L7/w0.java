package L7;

import java.util.Map;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w0 f7361a = new w0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f7362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final h f7363c;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends x0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f7364c = new a();

        private a() {
            super("inherited", false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b extends x0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f7365c = new b();

        private b() {
            super("internal", false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class c extends x0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f7366c = new c();

        private c() {
            super("invisible_fake", false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class d extends x0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f7367c = new d();

        private d() {
            super("local", false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class e extends x0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f7368c = new e();

        private e() {
            super("private", false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class f extends x0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f7369c = new f();

        private f() {
            super("private_to_this", false);
        }

        @Override // L7.x0
        public String b() {
            return "private/*private to this*/";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class g extends x0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f7370c = new g();

        private g() {
            super("protected", true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class h extends x0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f7371c = new h();

        private h() {
            super("public", true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class i extends x0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f7372c = new i();

        private i() {
            super("unknown", false);
        }
    }

    static {
        Map mapC = j7.K.c();
        mapC.put(f.f7369c, 0);
        mapC.put(e.f7368c, 0);
        mapC.put(b.f7365c, 1);
        mapC.put(g.f7370c, 1);
        h hVar = h.f7371c;
        mapC.put(hVar, 2);
        f7362b = j7.K.b(mapC);
        f7363c = hVar;
    }

    private w0() {
    }

    public final Integer a(x0 first, x0 second) {
        AbstractC2855l.g(first, "first");
        AbstractC2855l.g(second, "second");
        if (first == second) {
            return 0;
        }
        Map map = f7362b;
        Integer num = (Integer) map.get(first);
        Integer num2 = (Integer) map.get(second);
        if (num == null || num2 == null || AbstractC2855l.b(num, num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    public final boolean b(x0 visibility) {
        AbstractC2855l.g(visibility, "visibility");
        return visibility == e.f7368c || visibility == f.f7369c;
    }
}
