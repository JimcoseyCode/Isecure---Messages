package C8;

import C8.u0;
import i7.C2735B;
import i7.C2750m;
import j7.AbstractC2800q;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: C8.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0412g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0412g f645a = new C0412g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f646b;

    /* JADX INFO: renamed from: C8.g$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f647a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f648b;

        static {
            int[] iArr = new int[G8.s.values().length];
            try {
                iArr[G8.s.f3549j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[G8.s.f3548i.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[G8.s.f3547h.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f647a = iArr;
            int[] iArr2 = new int[u0.b.values().length];
            try {
                iArr2[u0.b.f701g.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[u0.b.f702h.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[u0.b.f703i.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f648b = iArr2;
        }
    }

    private C0412g() {
    }

    private final List A(u0 u0Var, List list) {
        int i10;
        G8.o oVarJ = u0Var.j();
        if (list.size() >= 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                G8.k kVarZ0 = oVarJ.z0((G8.j) obj);
                int iF0 = oVarJ.F0(kVarZ0);
                while (true) {
                    if (i10 >= iF0) {
                        arrayList.add(obj);
                        break;
                    }
                    i10 = oVarJ.b0(oVarJ.h(oVarJ.I(kVarZ0, i10))) == null ? i10 + 1 : 0;
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return list;
    }

    private final Boolean c(u0 u0Var, G8.j jVar, G8.j jVar2) {
        G8.o oVarJ = u0Var.j();
        if (!oVarJ.c0(jVar) && !oVarJ.c0(jVar2)) {
            return null;
        }
        if (f(oVarJ, jVar) && f(oVarJ, jVar2)) {
            return Boolean.TRUE;
        }
        if (oVarJ.c0(jVar)) {
            if (g(oVarJ, u0Var, jVar, jVar2, false)) {
                return Boolean.TRUE;
            }
        } else if (oVarJ.c0(jVar2) && (e(oVarJ, jVar) || g(oVarJ, u0Var, jVar2, jVar, true))) {
            return Boolean.TRUE;
        }
        return null;
    }

    private static final boolean d(G8.o oVar, G8.j jVar) {
        if (!(jVar instanceof G8.d)) {
            return false;
        }
        G8.l lVarO0 = oVar.o0(oVar.z((G8.d) jVar));
        return !oVar.l(lVarO0) && oVar.c0(oVar.m0(oVar.h(lVarO0)));
    }

    private static final boolean e(G8.o oVar, G8.j jVar) {
        G8.m mVarC = oVar.c(jVar);
        if (!(mVarC instanceof G8.h)) {
            return false;
        }
        Collection collectionM = oVar.m(mVarC);
        if (collectionM != null && collectionM.isEmpty()) {
            return false;
        }
        Iterator it = collectionM.iterator();
        while (it.hasNext()) {
            G8.j jVarA = oVar.a((G8.i) it.next());
            if (jVarA != null && oVar.c0(jVarA)) {
                return true;
            }
        }
        return false;
    }

    private static final boolean f(G8.o oVar, G8.j jVar) {
        return oVar.c0(jVar) || d(oVar, jVar);
    }

    private static final boolean g(G8.o oVar, u0 u0Var, G8.j jVar, G8.j jVar2, boolean z10) {
        u0 u0Var2;
        G8.j jVar3;
        Collection<G8.i> collectionS = oVar.S(jVar);
        if (collectionS != null && collectionS.isEmpty()) {
            return false;
        }
        for (G8.i iVar : collectionS) {
            if (AbstractC2855l.b(oVar.D0(iVar), oVar.c(jVar2))) {
                return true;
            }
            if (z10) {
                u0Var2 = u0Var;
                jVar3 = jVar2;
                if (v(f645a, u0Var2, jVar3, iVar, false, 8, null)) {
                    return true;
                }
            } else {
                u0Var2 = u0Var;
                jVar3 = jVar2;
            }
            u0Var = u0Var2;
            jVar2 = jVar3;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Boolean h(u0 u0Var, G8.j jVar, G8.j jVar2) {
        G8.j jVarE0;
        G8.n nVarO;
        G8.o oVarJ = u0Var.j();
        if (oVarJ.E0(jVar) || oVarJ.E0(jVar2)) {
            return u0Var.m() ? Boolean.TRUE : (!oVarJ.W(jVar) || oVarJ.W(jVar2)) ? Boolean.valueOf(C0406d.f630a.b(oVarJ, oVarJ.g(jVar, false), oVarJ.g(jVar2, false))) : Boolean.FALSE;
        }
        if (oVarJ.x(jVar) && oVarJ.x(jVar2)) {
            return Boolean.valueOf(f645a.r(oVarJ, jVar, jVar2) || u0Var.n());
        }
        if (oVarJ.E(jVar) || oVarJ.E(jVar2)) {
            return Boolean.valueOf(u0Var.n());
        }
        G8.e eVarB0 = oVarJ.B0(jVar2);
        if (eVarB0 == null || (jVarE0 = oVarJ.e0(eVarB0)) == null) {
            jVarE0 = jVar2;
        }
        G8.d dVarD = oVarJ.d(jVarE0);
        G8.i iVarH = dVarD != null ? oVarJ.H(dVarD) : null;
        if (dVarD != null && iVarH != null) {
            if (oVarJ.W(jVar2)) {
                iVarH = oVarJ.O(iVarH, true);
            } else if (oVarJ.f0(jVar2)) {
                iVarH = oVarJ.C0(iVarH);
            }
            G8.i iVar = iVarH;
            int i10 = a.f648b[u0Var.g(jVar, dVarD).ordinal()];
            if (i10 == 1) {
                return Boolean.valueOf(v(f645a, u0Var, jVar, iVar, false, 8, null));
            }
            if (i10 != 2) {
                if (i10 != 3) {
                    throw new C2750m();
                }
            } else if (v(f645a, u0Var, jVar, iVar, false, 8, null)) {
                return Boolean.TRUE;
            }
        }
        G8.m mVarC = oVarJ.c(jVar2);
        if (oVarJ.r(mVarC)) {
            oVarJ.W(jVar2);
            Collection collectionM = oVarJ.m(mVarC);
            if (collectionM == null || !collectionM.isEmpty()) {
                Iterator it = collectionM.iterator();
                while (it.hasNext()) {
                    if (!v(f645a, u0Var, jVar, (G8.i) it.next(), false, 8, null)) {
                        break;
                    }
                }
                z = true;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        G8.m mVarC2 = oVarJ.c(jVar);
        if (jVar instanceof G8.d) {
            nVarO = f645a.o(u0Var.j(), jVar2, jVar);
            if (nVarO != null && oVarJ.u(nVarO, oVarJ.c(jVar2))) {
                return Boolean.TRUE;
            }
        } else if (oVarJ.r(mVarC2)) {
            Collection collectionM2 = oVarJ.m(mVarC2);
            if (collectionM2 == null || !collectionM2.isEmpty()) {
                Iterator it2 = collectionM2.iterator();
                while (it2.hasNext()) {
                    if (!(((G8.i) it2.next()) instanceof G8.d)) {
                        break;
                    }
                }
                nVarO = f645a.o(u0Var.j(), jVar2, jVar);
                if (nVarO != null) {
                    return Boolean.TRUE;
                }
            }
        }
        return null;
    }

    private final List i(u0 u0Var, G8.j jVar, G8.m mVar) {
        u0.c cVarJ;
        G8.o oVarJ = u0Var.j();
        List listM = oVarJ.M(jVar, mVar);
        if (listM != null) {
            return listM;
        }
        if (!oVarJ.t0(mVar) && oVarJ.B(jVar)) {
            return AbstractC2800q.j();
        }
        if (oVarJ.t(mVar)) {
            if (!oVarJ.V(oVarJ.c(jVar), mVar)) {
                return AbstractC2800q.j();
            }
            G8.j jVarR = oVarJ.R(jVar, G8.b.f3541g);
            if (jVarR != null) {
                jVar = jVarR;
            }
            return AbstractC2800q.e(jVar);
        }
        M8.k kVar = new M8.k();
        u0Var.k();
        ArrayDeque arrayDequeH = u0Var.h();
        AbstractC2855l.d(arrayDequeH);
        Set setI = u0Var.i();
        AbstractC2855l.d(setI);
        arrayDequeH.push(jVar);
        while (!arrayDequeH.isEmpty()) {
            if (setI.size() > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + jVar + ". Supertypes = " + AbstractC2800q.o0(setI, null, null, null, 0, null, null, 63, null)).toString());
            }
            G8.j jVar2 = (G8.j) arrayDequeH.pop();
            AbstractC2855l.d(jVar2);
            if (setI.add(jVar2)) {
                G8.j jVarR2 = oVarJ.R(jVar2, G8.b.f3541g);
                if (jVarR2 == null) {
                    jVarR2 = jVar2;
                }
                if (oVarJ.V(oVarJ.c(jVarR2), mVar)) {
                    kVar.add(jVarR2);
                    cVarJ = u0.c.C0025c.f707a;
                } else {
                    cVarJ = oVarJ.x0(jVarR2) == 0 ? u0.c.b.f706a : u0Var.j().J(jVarR2);
                }
                if (AbstractC2855l.b(cVarJ, u0.c.C0025c.f707a)) {
                    cVarJ = null;
                }
                if (cVarJ != null) {
                    G8.o oVarJ2 = u0Var.j();
                    Iterator it = oVarJ2.m(oVarJ2.c(jVar2)).iterator();
                    while (it.hasNext()) {
                        arrayDequeH.add(cVarJ.a(u0Var, (G8.i) it.next()));
                    }
                }
            }
        }
        u0Var.e();
        return kVar;
    }

    private final List j(u0 u0Var, G8.j jVar, G8.m mVar) {
        return A(u0Var, i(u0Var, jVar, mVar));
    }

    private final boolean k(u0 u0Var, G8.i iVar, G8.i iVar2, boolean z10) {
        G8.o oVarJ = u0Var.j();
        G8.i iVarO = u0Var.o(u0Var.p(iVar));
        G8.i iVarO2 = u0Var.o(u0Var.p(iVar2));
        C0412g c0412g = f645a;
        Boolean boolH = c0412g.h(u0Var, oVarJ.K(iVarO), oVarJ.m0(iVarO2));
        if (boolH == null) {
            Boolean boolC = u0Var.c(iVarO, iVarO2, z10);
            return boolC != null ? boolC.booleanValue() : c0412g.w(u0Var, oVarJ.K(iVarO), oVarJ.m0(iVarO2));
        }
        boolean zBooleanValue = boolH.booleanValue();
        u0Var.c(iVarO, iVarO2, z10);
        return zBooleanValue;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
    
        return r7.y0(r7.D0(r8), r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final G8.n o(G8.o oVar, G8.i iVar, G8.i iVar2) {
        G8.i iVarH;
        int iX0 = oVar.x0(iVar);
        int i10 = 0;
        while (true) {
            if (i10 >= iX0) {
                return null;
            }
            G8.l lVarT = oVar.T(iVar, i10);
            G8.l lVar = oVar.l(lVarT) ? null : lVarT;
            if (lVar != null && (iVarH = oVar.h(lVar)) != null) {
                boolean z10 = oVar.L(oVar.H0(oVar.K(iVarH))) && oVar.L(oVar.H0(oVar.K(iVar2)));
                if (AbstractC2855l.b(iVarH, iVar2) || (z10 && AbstractC2855l.b(oVar.D0(iVarH), oVar.D0(iVar2)))) {
                    break;
                }
                G8.n nVarO = o(oVar, iVarH, iVar2);
                if (nVarO != null) {
                    return nVarO;
                }
            }
            i10++;
        }
    }

    private final boolean p(u0 u0Var, G8.j jVar) {
        G8.o oVarJ = u0Var.j();
        G8.m mVarC = oVarJ.c(jVar);
        if (oVarJ.t0(mVarC)) {
            return oVarJ.w(mVarC);
        }
        if (oVarJ.w(oVarJ.c(jVar))) {
            return true;
        }
        u0Var.k();
        ArrayDeque arrayDequeH = u0Var.h();
        AbstractC2855l.d(arrayDequeH);
        Set setI = u0Var.i();
        AbstractC2855l.d(setI);
        arrayDequeH.push(jVar);
        while (!arrayDequeH.isEmpty()) {
            if (setI.size() > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + jVar + ". Supertypes = " + AbstractC2800q.o0(setI, null, null, null, 0, null, null, 63, null)).toString());
            }
            G8.j jVar2 = (G8.j) arrayDequeH.pop();
            AbstractC2855l.d(jVar2);
            if (setI.add(jVar2)) {
                u0.c cVar = oVarJ.B(jVar2) ? u0.c.C0025c.f707a : u0.c.b.f706a;
                if (AbstractC2855l.b(cVar, u0.c.C0025c.f707a)) {
                    cVar = null;
                }
                if (cVar == null) {
                    continue;
                } else {
                    G8.o oVarJ2 = u0Var.j();
                    Iterator it = oVarJ2.m(oVarJ2.c(jVar2)).iterator();
                    while (it.hasNext()) {
                        G8.j jVarA = cVar.a(u0Var, (G8.i) it.next());
                        if (oVarJ.w(oVarJ.c(jVarA))) {
                            u0Var.e();
                            return true;
                        }
                        arrayDequeH.add(jVarA);
                    }
                }
            }
        }
        u0Var.e();
        return false;
    }

    private final boolean q(G8.o oVar, G8.i iVar) {
        return (!oVar.j(oVar.D0(iVar)) || oVar.Q(iVar) || oVar.f0(iVar) || oVar.v(iVar) || oVar.s0(iVar)) ? false : true;
    }

    private final boolean r(G8.o oVar, G8.j jVar, G8.j jVar2) {
        G8.j jVarE0;
        G8.j jVarE02;
        G8.e eVarB0 = oVar.B0(jVar);
        if (eVarB0 == null || (jVarE0 = oVar.e0(eVarB0)) == null) {
            jVarE0 = jVar;
        }
        G8.e eVarB02 = oVar.B0(jVar2);
        if (eVarB02 == null || (jVarE02 = oVar.e0(eVarB02)) == null) {
            jVarE02 = jVar2;
        }
        if (oVar.c(jVarE0) != oVar.c(jVarE02)) {
            return false;
        }
        if (oVar.f0(jVar) || !oVar.f0(jVar2)) {
            return !oVar.W(jVar) || oVar.W(jVar2);
        }
        return false;
    }

    public static /* synthetic */ boolean v(C0412g c0412g, u0 u0Var, G8.i iVar, G8.i iVar2, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return c0412g.u(u0Var, iVar, iVar2, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean w(u0 u0Var, G8.j jVar, G8.j jVar2) {
        Collection<G8.j> arrayList;
        boolean z10;
        G8.i iVarH;
        G8.o oVarJ = u0Var.j();
        if (f646b) {
            if (!oVarJ.b(jVar) && !oVarJ.r(oVarJ.c(jVar))) {
                u0Var.l(jVar);
            }
            if (!oVarJ.b(jVar2)) {
                u0Var.l(jVar2);
            }
        }
        boolean z11 = false;
        if (!C0404c.f629a.d(u0Var, jVar, jVar2)) {
            return false;
        }
        C0412g c0412g = f645a;
        Boolean boolC = c0412g.c(u0Var, oVarJ.K(jVar), oVarJ.m0(jVar2));
        if (boolC != null) {
            boolean zBooleanValue = boolC.booleanValue();
            u0.d(u0Var, jVar, jVar2, false, 4, null);
            return zBooleanValue;
        }
        G8.m mVarC = oVarJ.c(jVar2);
        boolean z12 = true;
        if ((oVarJ.V(oVarJ.c(jVar), mVarC) && oVarJ.D(mVarC) == 0) || oVarJ.G0(oVarJ.c(jVar2))) {
            return true;
        }
        List<G8.j> listN = c0412g.n(u0Var, jVar, mVarC);
        int i10 = 10;
        if (listN.size() > 1) {
            G8.o oVarJ2 = u0Var.j();
            G8.q qVar = oVarJ2 instanceof G8.q ? (G8.q) oVarJ2 : null;
            if (qVar == null || !qVar.i0()) {
                arrayList = new ArrayList(AbstractC2800q.u(listN, 10));
                for (G8.j jVar3 : listN) {
                    G8.j jVarA = oVarJ.a(u0Var.o(jVar3));
                    if (jVarA != null) {
                        jVar3 = jVarA;
                    }
                    arrayList.add(jVar3);
                }
            } else {
                arrayList = new LinkedHashSet();
                for (G8.j jVar4 : listN) {
                    G8.j jVarA2 = oVarJ.a(u0Var.o(jVar4));
                    if (jVarA2 != null) {
                        jVar4 = jVarA2;
                    }
                    arrayList.add(jVar4);
                }
            }
        }
        int size = arrayList.size();
        if (size == 0) {
            return f645a.p(u0Var, jVar);
        }
        if (size == 1) {
            return f645a.s(u0Var, oVarJ.z0((G8.j) AbstractC2800q.d0(arrayList)), jVar2);
        }
        G8.a aVar = new G8.a(oVarJ.D(mVarC));
        int iD = oVarJ.D(mVarC);
        int i11 = 0;
        boolean z13 = false;
        while (i11 < iD) {
            z13 = (z13 || oVarJ.y(oVarJ.y0(mVarC, i11)) != G8.s.f3548i) ? z12 : z11;
            if (z13) {
                z10 = z12;
            } else {
                ArrayList arrayList2 = new ArrayList(AbstractC2800q.u(arrayList, i10));
                for (G8.j jVar5 : arrayList) {
                    boolean z14 = z12;
                    G8.l lVarL0 = oVarJ.l0(jVar5, i11);
                    if (lVarL0 != null) {
                        if (oVarJ.A0(lVarL0) != G8.s.f3549j) {
                            lVarL0 = null;
                        }
                        if (lVarL0 != null && (iVarH = oVarJ.h(lVarL0)) != null) {
                            arrayList2.add(iVarH);
                            z12 = z14;
                        }
                    }
                    throw new IllegalStateException(("Incorrect type: " + jVar5 + ", subType: " + jVar + ", superType: " + jVar2).toString());
                }
                z10 = z12;
                aVar.add(oVarJ.X(oVarJ.Z(arrayList2)));
            }
            i11++;
            z12 = z10;
            z11 = false;
            i10 = 10;
        }
        return (z13 || !f645a.s(u0Var, aVar, jVar2)) ? u0Var.q(new C0408e(arrayList, u0Var, oVarJ, jVar2)) : z12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B x(Collection collection, u0 u0Var, G8.o oVar, G8.j jVar, u0.a runForkingPoint) {
        AbstractC2855l.g(runForkingPoint, "$this$runForkingPoint");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            runForkingPoint.a(new C0410f(u0Var, oVar, (G8.j) it.next(), jVar));
        }
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean y(u0 u0Var, G8.o oVar, G8.j jVar, G8.j jVar2) {
        return f645a.s(u0Var, oVar.z0(jVar), jVar2);
    }

    private final boolean z(G8.o oVar, G8.i iVar, G8.i iVar2, G8.m mVar) {
        G8.j jVarA = oVar.a(iVar);
        if (jVarA instanceof G8.d) {
            G8.d dVar = (G8.d) jVarA;
            if (oVar.k(dVar) || !oVar.l(oVar.o0(oVar.z(dVar))) || oVar.N(dVar) != G8.b.f3541g) {
                return false;
            }
            oVar.D0(iVar2);
        }
        return false;
    }

    public final G8.s l(G8.s declared, G8.s useSite) {
        AbstractC2855l.g(declared, "declared");
        AbstractC2855l.g(useSite, "useSite");
        G8.s sVar = G8.s.f3549j;
        if (declared == sVar) {
            return useSite;
        }
        if (useSite == sVar || declared == useSite) {
            return declared;
        }
        return null;
    }

    public final boolean m(u0 state, G8.i a10, G8.i b10) {
        AbstractC2855l.g(state, "state");
        AbstractC2855l.g(a10, "a");
        AbstractC2855l.g(b10, "b");
        G8.o oVarJ = state.j();
        if (a10 == b10) {
            return true;
        }
        C0412g c0412g = f645a;
        if (c0412g.q(oVarJ, a10) && c0412g.q(oVarJ, b10)) {
            G8.i iVarO = state.o(state.p(a10));
            G8.i iVarO2 = state.o(state.p(b10));
            G8.j jVarK = oVarJ.K(iVarO);
            if (!oVarJ.V(oVarJ.D0(iVarO), oVarJ.D0(iVarO2))) {
                return false;
            }
            if (oVarJ.x0(jVarK) == 0) {
                return oVarJ.p0(iVarO) || oVarJ.p0(iVarO2) || oVarJ.W(jVarK) == oVarJ.W(oVarJ.K(iVarO2));
            }
        }
        return v(c0412g, state, a10, b10, false, 8, null) && v(c0412g, state, b10, a10, false, 8, null);
    }

    public final List n(u0 state, G8.j subType, G8.m superConstructor) {
        u0.c cVar;
        AbstractC2855l.g(state, "state");
        AbstractC2855l.g(subType, "subType");
        AbstractC2855l.g(superConstructor, "superConstructor");
        G8.o oVarJ = state.j();
        if (oVarJ.B(subType)) {
            return f645a.j(state, subType, superConstructor);
        }
        if (!oVarJ.t0(superConstructor) && !oVarJ.q(superConstructor)) {
            return f645a.i(state, subType, superConstructor);
        }
        M8.k<G8.j> kVar = new M8.k();
        state.k();
        ArrayDeque arrayDequeH = state.h();
        AbstractC2855l.d(arrayDequeH);
        Set setI = state.i();
        AbstractC2855l.d(setI);
        arrayDequeH.push(subType);
        while (!arrayDequeH.isEmpty()) {
            if (setI.size() > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + subType + ". Supertypes = " + AbstractC2800q.o0(setI, null, null, null, 0, null, null, 63, null)).toString());
            }
            G8.j jVar = (G8.j) arrayDequeH.pop();
            AbstractC2855l.d(jVar);
            if (setI.add(jVar)) {
                if (oVarJ.B(jVar)) {
                    kVar.add(jVar);
                    cVar = u0.c.C0025c.f707a;
                } else {
                    cVar = u0.c.b.f706a;
                }
                if (AbstractC2855l.b(cVar, u0.c.C0025c.f707a)) {
                    cVar = null;
                }
                if (cVar != null) {
                    G8.o oVarJ2 = state.j();
                    Iterator it = oVarJ2.m(oVarJ2.c(jVar)).iterator();
                    while (it.hasNext()) {
                        arrayDequeH.add(cVar.a(state, (G8.i) it.next()));
                    }
                }
            }
        }
        state.e();
        ArrayList arrayList = new ArrayList();
        for (G8.j jVar2 : kVar) {
            C0412g c0412g = f645a;
            AbstractC2855l.d(jVar2);
            AbstractC2800q.A(arrayList, c0412g.j(state, jVar2, superConstructor));
        }
        return arrayList;
    }

    public final boolean s(u0 u0Var, G8.k capturedSubArguments, G8.j superType) {
        boolean zM;
        u0 u0Var2 = u0Var;
        AbstractC2855l.g(u0Var2, "<this>");
        AbstractC2855l.g(capturedSubArguments, "capturedSubArguments");
        AbstractC2855l.g(superType, "superType");
        G8.o oVarJ = u0Var2.j();
        G8.m mVarC = oVarJ.c(superType);
        int iF0 = oVarJ.F0(capturedSubArguments);
        int iD = oVarJ.D(mVarC);
        if (iF0 != iD || iF0 != oVarJ.x0(superType)) {
            return false;
        }
        for (int i10 = 0; i10 < iD; i10++) {
            G8.l lVarT = oVarJ.T(superType, i10);
            if (!oVarJ.l(lVarT)) {
                G8.i iVarH = oVarJ.h(lVarT);
                G8.l lVarI = oVarJ.I(capturedSubArguments, i10);
                oVarJ.A0(lVarI);
                G8.s sVar = G8.s.f3549j;
                G8.i iVarH2 = oVarJ.h(lVarI);
                C0412g c0412g = f645a;
                G8.s sVarL = c0412g.l(oVarJ.y(oVarJ.y0(mVarC, i10)), oVarJ.A0(lVarT));
                if (sVarL == null) {
                    return u0Var2.m();
                }
                if (sVarL != sVar || (!c0412g.z(oVarJ, iVarH2, iVarH, mVarC) && !c0412g.z(oVarJ, iVarH, iVarH2, mVarC))) {
                    if (u0Var2.f696g > 100) {
                        throw new IllegalStateException(("Arguments depth is too high. Some related argument: " + iVarH2).toString());
                    }
                    u0Var2.f696g++;
                    int i11 = a.f647a[sVarL.ordinal()];
                    if (i11 == 1) {
                        zM = c0412g.m(u0Var2, iVarH2, iVarH);
                    } else if (i11 == 2) {
                        u0Var2 = u0Var;
                        zM = v(c0412g, u0Var2, iVarH2, iVarH, false, 8, null);
                    } else {
                        if (i11 != 3) {
                            throw new C2750m();
                        }
                        zM = v(c0412g, u0Var2, iVarH, iVarH2, false, 8, null);
                        u0Var2 = u0Var;
                    }
                    u0Var2.f696g--;
                    if (!zM) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final boolean t(u0 state, G8.i subType, G8.i superType) {
        AbstractC2855l.g(state, "state");
        AbstractC2855l.g(subType, "subType");
        AbstractC2855l.g(superType, "superType");
        return v(this, state, subType, superType, false, 8, null);
    }

    public final boolean u(u0 state, G8.i subType, G8.i superType, boolean z10) {
        AbstractC2855l.g(state, "state");
        AbstractC2855l.g(subType, "subType");
        AbstractC2855l.g(superType, "superType");
        if (subType == superType) {
            return true;
        }
        if (state.f(subType, superType)) {
            return k(state, subType, superType, z10);
        }
        return false;
    }
}
