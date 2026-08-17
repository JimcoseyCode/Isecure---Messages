package I7;

import i7.AbstractC2746i;
import i7.EnumC2749l;
import j7.T;
import java.util.Set;
import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f5078k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Set f5079l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final l f5080m = new l("BOOLEAN", 0, "Boolean");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final l f5081n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final l f5082o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final l f5083p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final l f5084q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final l f5085r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final l f5086s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final l f5087t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final /* synthetic */ l[] f5088u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f5089v;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final k8.f f5090g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final k8.f f5091h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Lazy f5092i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Lazy f5093j;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        l lVar = new l("CHAR", 1, "Char");
        f5081n = lVar;
        l lVar2 = new l("BYTE", 2, "Byte");
        f5082o = lVar2;
        l lVar3 = new l("SHORT", 3, "Short");
        f5083p = lVar3;
        l lVar4 = new l("INT", 4, "Int");
        f5084q = lVar4;
        l lVar5 = new l("FLOAT", 5, "Float");
        f5085r = lVar5;
        l lVar6 = new l("LONG", 6, "Long");
        f5086s = lVar6;
        l lVar7 = new l("DOUBLE", 7, "Double");
        f5087t = lVar7;
        l[] lVarArrH = h();
        f5088u = lVarArrH;
        f5089v = AbstractC3083a.a(lVarArrH);
        f5078k = new a(null);
        f5079l = T.h(lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7);
    }

    private l(String str, int i10, String str2) {
        k8.f fVarQ = k8.f.q(str2);
        AbstractC2855l.f(fVarQ, "identifier(...)");
        this.f5090g = fVarQ;
        k8.f fVarQ2 = k8.f.q(str2 + "Array");
        AbstractC2855l.f(fVarQ2, "identifier(...)");
        this.f5091h = fVarQ2;
        EnumC2749l enumC2749l = EnumC2749l.f28717h;
        this.f5092i = AbstractC2746i.a(enumC2749l, new j(this));
        this.f5093j = AbstractC2746i.a(enumC2749l, new k(this));
    }

    private static final /* synthetic */ l[] h() {
        return new l[]{f5080m, f5081n, f5082o, f5083p, f5084q, f5085r, f5086s, f5087t};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k8.c m(l lVar) {
        k8.c cVarC = o.f5108A.c(lVar.f5091h);
        AbstractC2855l.f(cVarC, "child(...)");
        return cVarC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k8.c t(l lVar) {
        k8.c cVarC = o.f5108A.c(lVar.f5090g);
        AbstractC2855l.f(cVarC, "child(...)");
        return cVarC;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f5088u.clone();
    }

    public final k8.c p() {
        return (k8.c) this.f5093j.getValue();
    }

    public final k8.f q() {
        return this.f5091h;
    }

    public final k8.c r() {
        return (k8.c) this.f5092i.getValue();
    }

    public final k8.f s() {
        return this.f5090g;
    }
}
