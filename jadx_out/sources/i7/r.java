package I7;

import k8.b;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC2855l;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class r {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final r f5244j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final r f5245k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final r f5246l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final r f5247m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ r[] f5248n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f5249o;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final k8.b f5250g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final k8.f f5251h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final k8.b f5252i;

    static {
        b.a aVar = k8.b.f29200d;
        f5244j = new r("UBYTE", 0, b.a.b(aVar, "kotlin/UByte", false, 2, null));
        f5245k = new r("USHORT", 1, b.a.b(aVar, "kotlin/UShort", false, 2, null));
        f5246l = new r("UINT", 2, b.a.b(aVar, "kotlin/UInt", false, 2, null));
        f5247m = new r("ULONG", 3, b.a.b(aVar, "kotlin/ULong", false, 2, null));
        r[] rVarArrH = h();
        f5248n = rVarArrH;
        f5249o = AbstractC3083a.a(rVarArrH);
    }

    private r(String str, int i10, k8.b bVar) {
        this.f5250g = bVar;
        k8.f fVarH = bVar.h();
        this.f5251h = fVarH;
        k8.c cVarF = bVar.f();
        k8.f fVarQ = k8.f.q(fVarH.j() + "Array");
        AbstractC2855l.f(fVarQ, "identifier(...)");
        this.f5252i = new k8.b(cVarF, fVarQ);
    }

    private static final /* synthetic */ r[] h() {
        return new r[]{f5244j, f5245k, f5246l, f5247m};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f5248n.clone();
    }

    public final k8.b j() {
        return this.f5252i;
    }

    public final k8.b k() {
        return this.f5250g;
    }

    public final k8.f m() {
        return this.f5251h;
    }
}
