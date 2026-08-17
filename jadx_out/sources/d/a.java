package D;

import C.d;
import C.e;
import D.b;
import F.L;
import K.f;
import j7.AbstractC2800q;
import j7.T;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import y.AbstractC3583h0;
import y.J0;
import y.V;
import y.p0;
import y.v0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C0027a f722b = new C0027a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final L f723a;

    /* JADX INFO: renamed from: D.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class C0027a {
        public /* synthetic */ C0027a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0027a() {
        }
    }

    public a(L cameraInfoInternal) {
        AbstractC2855l.g(cameraInfoInternal, "cameraInfoInternal");
        this.f723a = cameraInfoInternal;
    }

    private final b b(v0 v0Var, List list, int i10, List list2) {
        if (i10 < list.size()) {
            int i11 = i10 + 1;
            b bVarB = b(v0Var, list, i11, AbstractC2800q.A0(list2, list.get(i10)));
            return bVarB instanceof b.a ? bVarB : b(v0Var, list, i11, list2);
        }
        Set setK = T.k(v0Var.h(), list2);
        AbstractC3583h0.a("DefaultFeatureGroupResolver", "getFeatureListResolvedByPriority: features = " + setK + ", useCases = " + v0Var.k());
        return this.f723a.q(new B.b(setK), v0Var) ? new b.a(new B.b(setK)) : b.C0028b.f725a;
    }

    static /* synthetic */ b c(a aVar, v0 v0Var, List list, int i10, List list2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        if ((i11 & 8) != 0) {
            list2 = AbstractC2800q.j();
        }
        return aVar.b(v0Var, list, i10, list2);
    }

    @Override // D.c
    public b a(v0 sessionConfig) {
        boolean z10;
        AbstractC2855l.g(sessionConfig, "sessionConfig");
        List<J0> listK = sessionConfig.k();
        Set<A.b> setH = sessionConfig.h();
        List listG = sessionConfig.g();
        if (setH.isEmpty() && listG.isEmpty()) {
            throw new IllegalArgumentException("Must have at least one required or preferred feature");
        }
        boolean z11 = false;
        if (listK == null || !listK.isEmpty()) {
            Iterator it = listK.iterator();
            while (it.hasNext()) {
                if (((J0) it.next()) instanceof V) {
                    z10 = true;
                    break;
                }
            }
            z10 = false;
        } else {
            z10 = false;
        }
        if (listK == null || !listK.isEmpty()) {
            for (J0 j02 : listK) {
                if ((j02 instanceof p0) || f.e0(j02)) {
                    z11 = true;
                    break;
                }
            }
        }
        for (J0 j03 : listK) {
            if (B.c.f233i.c(j03) == B.c.f238n) {
                return new b.c(j03);
            }
        }
        for (A.b bVar : setH) {
            if (bVar instanceof d) {
                if (!z10) {
                    return new b.d(B.c.f235k.toString(), bVar);
                }
            } else if ((bVar instanceof C.a) || (bVar instanceof C.c) || (bVar instanceof e)) {
                if (!z11) {
                    return new b.d(B.c.f234j + " or " + B.c.f236l, bVar);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listG) {
            if (((A.b) obj) instanceof d ? z10 : true) {
                arrayList.add(obj);
            }
        }
        return c(this, sessionConfig, arrayList, 0, null, 12, null);
    }
}
