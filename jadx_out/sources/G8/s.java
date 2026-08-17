package G8;

import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.enums.EnumEntries;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class s {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final s f3547h = new s("IN", 0, "in");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final s f3548i = new s("OUT", 1, "out");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final s f3549j = new s("INV", 2, PointerEventHelper.POINTER_TYPE_UNKNOWN);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ s[] f3550k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f3551l;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f3552g;

    static {
        s[] sVarArrH = h();
        f3550k = sVarArrH;
        f3551l = AbstractC3083a.a(sVarArrH);
    }

    private s(String str, int i10, String str2) {
        this.f3552g = str2;
    }

    private static final /* synthetic */ s[] h() {
        return new s[]{f3547h, f3548i, f3549j};
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f3550k.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f3552g;
    }
}
