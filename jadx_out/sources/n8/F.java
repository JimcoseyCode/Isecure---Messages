package n8;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class F {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final F f30090g = new F("PLAIN", 0) { // from class: n8.F.b
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // n8.F
        public String j(String string) {
            AbstractC2855l.g(string, "string");
            return string;
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final F f30091h = new F("HTML", 1) { // from class: n8.F.a
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // n8.F
        public String j(String string) {
            AbstractC2855l.g(string, "string");
            return P8.q.E(P8.q.E(string, "<", "&lt;", false, 4, null), ">", "&gt;", false, 4, null);
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ F[] f30092i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f30093j;

    static {
        F[] fArrH = h();
        f30092i = fArrH;
        f30093j = AbstractC3083a.a(fArrH);
    }

    public /* synthetic */ F(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10);
    }

    private static final /* synthetic */ F[] h() {
        return new F[]{f30090g, f30091h};
    }

    public static F valueOf(String str) {
        return (F) Enum.valueOf(F.class, str);
    }

    public static F[] values() {
        return (F[]) f30092i.clone();
    }

    public abstract String j(String str);

    private F(String str, int i10) {
    }
}
