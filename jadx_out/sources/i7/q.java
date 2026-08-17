package I7;

import k8.b;
import kotlin.enums.EnumEntries;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class q {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final q f5236i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final q f5237j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final q f5238k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final q f5239l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ q[] f5240m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f5241n;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final k8.b f5242g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final k8.f f5243h;

    static {
        b.a aVar = k8.b.f29200d;
        f5236i = new q("UBYTEARRAY", 0, b.a.b(aVar, "kotlin/UByteArray", false, 2, null));
        f5237j = new q("USHORTARRAY", 1, b.a.b(aVar, "kotlin/UShortArray", false, 2, null));
        f5238k = new q("UINTARRAY", 2, b.a.b(aVar, "kotlin/UIntArray", false, 2, null));
        f5239l = new q("ULONGARRAY", 3, b.a.b(aVar, "kotlin/ULongArray", false, 2, null));
        q[] qVarArrH = h();
        f5240m = qVarArrH;
        f5241n = AbstractC3083a.a(qVarArrH);
    }

    private q(String str, int i10, k8.b bVar) {
        this.f5242g = bVar;
        this.f5243h = bVar.h();
    }

    private static final /* synthetic */ q[] h() {
        return new q[]{f5236i, f5237j, f5238k, f5239l};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f5240m.clone();
    }

    public final k8.f j() {
        return this.f5243h;
    }
}
