package U7;

import c8.C1915l;
import c8.EnumC1913k;
import j7.AbstractC2800q;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List f11534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List f11535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f11536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map f11537d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map f11538e;

    static {
        EnumC1475c enumC1475c = EnumC1475c.f11501j;
        EnumC1475c enumC1475c2 = EnumC1475c.f11499h;
        EnumC1475c enumC1475c3 = EnumC1475c.f11500i;
        List listM = AbstractC2800q.m(enumC1475c, enumC1475c2, enumC1475c3, EnumC1475c.f11503l, EnumC1475c.f11502k);
        f11534a = listM;
        List listE = AbstractC2800q.e(enumC1475c3);
        f11535b = listE;
        k8.c cVarK = J.k();
        EnumC1913k enumC1913k = EnumC1913k.f19007i;
        Map mapL = j7.K.l(i7.t.a(cVarK, new w(new C1915l(enumC1913k, false, 2, null), listM, false)), i7.t.a(J.i(), new w(new C1915l(enumC1913k, false, 2, null), listM, false)), i7.t.a(J.j(), new w(new C1915l(EnumC1913k.f19005g, false, 2, null), listM, false, 4, null)));
        f11536c = mapL;
        Map mapL2 = j7.K.l(i7.t.a(J.d(), new w(new C1915l(enumC1913k, false, 2, null), listE, false, 4, null)), i7.t.a(J.e(), new w(new C1915l(EnumC1913k.f19006h, false, 2, null), listE, false, 4, null)));
        f11537d = mapL2;
        f11538e = j7.K.o(mapL, mapL2);
    }

    public static final Map a() {
        return f11538e;
    }

    public static final Map b() {
        return f11536c;
    }
}
