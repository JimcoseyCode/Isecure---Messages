package L7;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class E {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f7282g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final E f7283h = new E("FINAL", 0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final E f7284i = new E("SEALED", 1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final E f7285j = new E("OPEN", 2);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final E f7286k = new E("ABSTRACT", 3);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ E[] f7287l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f7288m;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final E a(boolean z10, boolean z11, boolean z12) {
            return z10 ? E.f7284i : z11 ? E.f7286k : z12 ? E.f7285j : E.f7283h;
        }

        private a() {
        }
    }

    static {
        E[] eArrH = h();
        f7287l = eArrH;
        f7288m = AbstractC3083a.a(eArrH);
        f7282g = new a(null);
    }

    private E(String str, int i10) {
    }

    private static final /* synthetic */ E[] h() {
        return new E[]{f7283h, f7284i, f7285j, f7286k};
    }

    public static E valueOf(String str) {
        return (E) Enum.valueOf(E.class, str);
    }

    public static E[] values() {
        return (E[]) f7287l.clone();
    }
}
