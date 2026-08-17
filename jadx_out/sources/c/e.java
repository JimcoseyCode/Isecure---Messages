package C;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p7.AbstractC3083a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends A.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f458i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f459j = b.f462g;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b f460g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C.b f461h;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f462g = new b("OFF", 0);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final b f463h = new b("ON", 1);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final b f464i = new b("PREVIEW", 2);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ b[] f465j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f466k;

        static {
            b[] bVarArrH = h();
            f465j = bVarArrH;
            f466k = AbstractC3083a.a(bVarArrH);
        }

        private b(String str, int i10) {
        }

        private static final /* synthetic */ b[] h() {
            return new b[]{f462g, f463h, f464i};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f465j.clone();
        }
    }

    public e(b mode) {
        AbstractC2855l.g(mode, "mode");
        this.f460g = mode;
        this.f461h = C.b.f446i;
    }

    @Override // A.b
    public C.b c() {
        return this.f461h;
    }

    public final b f() {
        return this.f460g;
    }

    public String toString() {
        return "VideoStabilizationFeature(mode=" + this.f460g.name() + ')';
    }
}
