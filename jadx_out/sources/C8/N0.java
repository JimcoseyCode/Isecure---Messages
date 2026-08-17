package C8;

import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.enums.EnumEntries;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class N0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final N0 f592k = new N0("INVARIANT", 0, PointerEventHelper.POINTER_TYPE_UNKNOWN, true, true, 0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final N0 f593l = new N0("IN_VARIANCE", 1, "in", true, false, -1);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final N0 f594m = new N0("OUT_VARIANCE", 2, "out", false, true, 1);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ N0[] f595n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f596o;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f597g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f598h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f599i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f600j;

    static {
        N0[] n0ArrH = h();
        f595n = n0ArrH;
        f596o = AbstractC3083a.a(n0ArrH);
    }

    private N0(String str, int i10, String str2, boolean z10, boolean z11, int i11) {
        this.f597g = str2;
        this.f598h = z10;
        this.f599i = z11;
        this.f600j = i11;
    }

    private static final /* synthetic */ N0[] h() {
        return new N0[]{f592k, f593l, f594m};
    }

    public static N0 valueOf(String str) {
        return (N0) Enum.valueOf(N0.class, str);
    }

    public static N0[] values() {
        return (N0[]) f595n.clone();
    }

    public final boolean j() {
        return this.f599i;
    }

    public final String k() {
        return this.f597g;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f597g;
    }
}
