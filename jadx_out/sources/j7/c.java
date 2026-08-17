package J7;

import J7.f;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f6815g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f6816h = new c("Function", 0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f6817i = new c("SuspendFunction", 1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f6818j = new c("KFunction", 2);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final c f6819k = new c("KSuspendFunction", 3);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final c f6820l = new c("UNKNOWN", 4);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ c[] f6821m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f6822n;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a(f functionTypeKind) {
            AbstractC2855l.g(functionTypeKind, "functionTypeKind");
            return AbstractC2855l.b(functionTypeKind, f.a.f6828e) ? c.f6816h : AbstractC2855l.b(functionTypeKind, f.d.f6831e) ? c.f6817i : AbstractC2855l.b(functionTypeKind, f.b.f6829e) ? c.f6818j : AbstractC2855l.b(functionTypeKind, f.c.f6830e) ? c.f6819k : c.f6820l;
        }

        private a() {
        }
    }

    static {
        c[] cVarArrH = h();
        f6821m = cVarArrH;
        f6822n = AbstractC3083a.a(cVarArrH);
        f6815g = new a(null);
    }

    private c(String str, int i10) {
    }

    private static final /* synthetic */ c[] h() {
        return new c[]{f6816h, f6817i, f6818j, f6819k, f6820l};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f6821m.clone();
    }
}
