package N2;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f7972h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final e[] f7973i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final e f7974j = new e("UNKNOWN", 0, -1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final e f7975k = new e("REQUESTED", 1, 0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final e f7976l = new e("INTERMEDIATE_AVAILABLE", 2, 2);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final e f7977m = new e("SUCCESS", 3, 3);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final e f7978n = new e("ERROR", 4, 5);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final e f7979o = new e("EMPTY_EVENT", 5, 7);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final e f7980p = new e("RELEASED", 6, 8);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final /* synthetic */ e[] f7981q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f7982r;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f7983g;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7984a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.f7975k.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.f7977m.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.f7976l.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e.f7978n.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[e.f7980p.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f7984a = iArr;
        }
    }

    static {
        e[] eVarArrH = h();
        f7981q = eVarArrH;
        f7982r = AbstractC3083a.a(eVarArrH);
        f7972h = new a(null);
        f7973i = values();
    }

    private e(String str, int i10, int i11) {
        this.f7983g = i11;
    }

    private static final /* synthetic */ e[] h() {
        return new e[]{f7974j, f7975k, f7976l, f7977m, f7978n, f7979o, f7980p};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f7981q.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        int i10 = b.f7984a[ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "unknown" : "released" : "error" : "intermediate_available" : "success" : "requested";
    }
}
