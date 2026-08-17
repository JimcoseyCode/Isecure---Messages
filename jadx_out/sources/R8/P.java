package R8;

import i7.C2750m;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function2;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class P {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final P f10148g = new P("DEFAULT", 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final P f10149h = new P("LAZY", 1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final P f10150i = new P("ATOMIC", 2);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final P f10151j = new P("UNDISPATCHED", 3);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ P[] f10152k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f10153l;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10154a;

        static {
            int[] iArr = new int[P.values().length];
            try {
                iArr[P.f10148g.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[P.f10150i.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[P.f10151j.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[P.f10149h.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f10154a = iArr;
        }
    }

    static {
        P[] pArrH = h();
        f10152k = pArrH;
        f10153l = AbstractC3083a.a(pArrH);
    }

    private P(String str, int i10) {
    }

    private static final /* synthetic */ P[] h() {
        return new P[]{f10148g, f10149h, f10150i, f10151j};
    }

    public static P valueOf(String str) {
        return (P) Enum.valueOf(P.class, str);
    }

    public static P[] values() {
        return (P[]) f10152k.clone();
    }

    public final void j(Function2 function2, Object obj, n7.f fVar) {
        int i10 = a.f10154a[ordinal()];
        if (i10 == 1) {
            X8.a.b(function2, obj, fVar);
            return;
        }
        if (i10 == 2) {
            n7.h.a(function2, obj, fVar);
        } else if (i10 == 3) {
            X8.b.c(function2, obj, fVar);
        } else if (i10 != 4) {
            throw new C2750m();
        }
    }

    public final boolean k() {
        return this == f10149h;
    }
}
