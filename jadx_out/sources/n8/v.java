package n8;

import j7.AbstractC2793j;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Set;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class v {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f30141h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Set f30142i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Set f30143j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final v f30144k = new v("VISIBILITY", 0, true);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final v f30145l = new v("MODALITY", 1, true);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final v f30146m = new v("OVERRIDE", 2, true);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final v f30147n = new v("ANNOTATIONS", 3, false);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final v f30148o = new v("INNER", 4, true);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final v f30149p = new v("MEMBER_KIND", 5, true);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final v f30150q = new v("DATA", 6, true);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final v f30151r = new v("INLINE", 7, true);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final v f30152s = new v("EXPECT", 8, true);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final v f30153t = new v("ACTUAL", 9, true);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final v f30154u = new v("CONST", 10, true);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final v f30155v = new v("LATEINIT", 11, true);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final v f30156w = new v("FUN", 12, true);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final v f30157x = new v("VALUE", 13, true);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final /* synthetic */ v[] f30158y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f30159z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f30160g;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        v[] vVarArrH = h();
        f30158y = vVarArrH;
        f30159z = AbstractC3083a.a(vVarArrH);
        f30141h = new a(null);
        v[] vVarArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (v vVar : vVarArrValues) {
            if (vVar.f30160g) {
                arrayList.add(vVar);
            }
        }
        f30142i = AbstractC2800q.T0(arrayList);
        f30143j = AbstractC2793j.I0(values());
    }

    private v(String str, int i10, boolean z10) {
        this.f30160g = z10;
    }

    private static final /* synthetic */ v[] h() {
        return new v[]{f30144k, f30145l, f30146m, f30147n, f30148o, f30149p, f30150q, f30151r, f30152s, f30153t, f30154u, f30155v, f30156w, f30157x};
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) f30158y.clone();
    }
}
