package H2;

import g2.AbstractC2662a;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC2855l;
import p7.AbstractC3083a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC2662a f3725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f3726b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f3727g = new a("SUCCESS", 0);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f3728h = new a("NEAREST", 1);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final a f3729i = new a("MISSING", 2);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ a[] f3730j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f3731k;

        static {
            a[] aVarArrH = h();
            f3730j = aVarArrH;
            f3731k = AbstractC3083a.a(aVarArrH);
        }

        private a(String str, int i10) {
        }

        private static final /* synthetic */ a[] h() {
            return new a[]{f3727g, f3728h, f3729i};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f3730j.clone();
        }
    }

    public l(AbstractC2662a abstractC2662a, a type) {
        AbstractC2855l.g(type, "type");
        this.f3725a = abstractC2662a;
        this.f3726b = type;
    }

    public final AbstractC2662a a() {
        return this.f3725a;
    }

    public final a b() {
        return this.f3726b;
    }
}
