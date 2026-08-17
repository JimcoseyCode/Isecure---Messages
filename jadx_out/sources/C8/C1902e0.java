package c8;

import C8.InterfaceC0405c0;
import C8.J0;
import C8.M0;
import L7.AbstractC1293s;
import L7.InterfaceC1277b;
import L7.InterfaceC1280e;
import L7.InterfaceC1283h;
import L7.InterfaceC1288m;
import L7.InterfaceC1300z;
import L7.m0;
import L7.t0;
import U7.C1486n;
import U7.EnumC1475c;
import Y7.AbstractC1540d;
import Y7.C1546j;
import Y7.C1550n;
import b8.InterfaceC1817a;
import d8.AbstractC2344B;
import d8.AbstractC2345C;
import d8.C2348F;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import r8.AbstractC3282d;
import s8.AbstractC3340e;

/* JADX INFO: renamed from: c8.e0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1902e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1905g f18967a;

    public C1902e0(C1905g typeEnhancement) {
        AbstractC2855l.g(typeEnhancement, "typeEnhancement");
        this.f18967a = typeEnhancement;
    }

    private final boolean f(C8.S s10) {
        return J0.c(s10, C1900d0.f18965g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean g(M0 m02) {
        InterfaceC1283h interfaceC1283hP = m02.K0().p();
        if (interfaceC1283hP == null) {
            return Boolean.FALSE;
        }
        k8.f name = interfaceC1283hP.getName();
        K7.c cVar = K7.c.f7110a;
        return Boolean.valueOf(AbstractC2855l.b(name, cVar.h().g()) && AbstractC2855l.b(AbstractC3340e.k(interfaceC1283hP), cVar.h()));
    }

    private final C8.S h(InterfaceC1277b interfaceC1277b, M7.a aVar, boolean z10, X7.k kVar, EnumC1475c enumC1475c, C1912j0 c1912j0, boolean z11, Function1 function1) {
        C1906g0 c1906g0 = new C1906g0(aVar, z10, kVar, enumC1475c, false, 16, null);
        C8.S s10 = (C8.S) function1.invoke(interfaceC1277b);
        Collection<InterfaceC1277b> collectionE = interfaceC1277b.e();
        AbstractC2855l.f(collectionE, "getOverriddenDescriptors(...)");
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(collectionE, 10));
        for (InterfaceC1277b interfaceC1277b2 : collectionE) {
            AbstractC2855l.d(interfaceC1277b2);
            arrayList.add((C8.S) function1.invoke(interfaceC1277b2));
        }
        return i(c1906g0, s10, arrayList, c1912j0, z11);
    }

    private final C8.S i(C1906g0 c1906g0, C8.S s10, List list, C1912j0 c1912j0, boolean z10) {
        return this.f18967a.a(s10, c1906g0.d(s10, list, c1912j0, z10), c1906g0.z());
    }

    static /* synthetic */ C8.S j(C1902e0 c1902e0, InterfaceC1277b interfaceC1277b, M7.a aVar, boolean z10, X7.k kVar, EnumC1475c enumC1475c, C1912j0 c1912j0, boolean z11, Function1 function1, int i10, Object obj) {
        return c1902e0.h(interfaceC1277b, aVar, z10, kVar, enumC1475c, c1912j0, (i10 & 32) != 0 ? false : z11, function1);
    }

    static /* synthetic */ C8.S k(C1902e0 c1902e0, C1906g0 c1906g0, C8.S s10, List list, C1912j0 c1912j0, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            c1912j0 = null;
        }
        C1912j0 c1912j02 = c1912j0;
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return c1902e0.i(c1906g0, s10, list, c1912j02, z10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x021a, code lost:
    
        if (r3 == null) goto L133;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01f4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final InterfaceC1277b l(InterfaceC1277b interfaceC1277b, X7.k kVar) {
        InterfaceC1277b interfaceC1277b2;
        C8.S sT;
        C1891Y c1891y;
        boolean z10;
        boolean z11;
        boolean z12;
        C8.S type;
        List listB;
        String strA;
        O7.K k10;
        O7.L lO0;
        if (!(interfaceC1277b instanceof W7.a)) {
            return interfaceC1277b;
        }
        if (interfaceC1277b.getKind() != InterfaceC1277b.a.FAKE_OVERRIDE || interfaceC1277b.a().e().size() != 1) {
            X7.k kVarK = X7.c.k(kVar, u(interfaceC1277b, kVar));
            if (!(interfaceC1277b instanceof W7.f) || (lO0 = (k10 = (O7.K) interfaceC1277b).getGetter()) == null || lO0.S()) {
                interfaceC1277b2 = interfaceC1277b;
            } else {
                O7.L lO02 = k10.getGetter();
                AbstractC2855l.d(lO02);
                interfaceC1277b2 = lO02;
            }
            C8.S type2 = null;
            if (interfaceC1277b.h0() != null) {
                InterfaceC1300z interfaceC1300z = interfaceC1277b2 instanceof InterfaceC1300z ? (InterfaceC1300z) interfaceC1277b2 : null;
                sT = t(interfaceC1277b, interfaceC1300z != null ? (t0) interfaceC1300z.g0(W7.e.f12138M) : null, kVarK, null, false, C1892Z.f18952g);
            } else {
                sT = null;
            }
            W7.e eVar = interfaceC1277b instanceof W7.e ? (W7.e) interfaceC1277b : null;
            int i10 = 0;
            if (eVar != null) {
                C2348F c2348f = C2348F.f25682a;
                InterfaceC1288m interfaceC1288mB = eVar.b();
                AbstractC2855l.e(interfaceC1288mB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                String strA2 = AbstractC2344B.a(c2348f, (InterfaceC1280e) interfaceC1288mB, AbstractC2345C.c(eVar, false, false, 3, null));
                if (strA2 != null) {
                    C1891Y c1891yD = (C1891Y) AbstractC1890X.u0().get(strA2);
                    if (c1891yD == null) {
                        c1891yD = null;
                    } else {
                        if (c1891yD.a() != null && ((strA = c1891yD.a()) == null || !P8.q.K(strA, "2.", false, 2, null))) {
                            throw new IllegalStateException("Check failed.");
                        }
                        if (c1891yD.a() != null) {
                            c1891yD = c1891yD.d();
                        }
                    }
                    c1891y = c1891yD;
                } else {
                    c1891y = null;
                }
                if (c1891y != null) {
                    c1891y.b().size();
                    ((W7.e) interfaceC1277b).i().size();
                }
                boolean z13 = (U7.V.c(kVar.a().i()) || kVarK.a().q().b()) && U7.V.b(interfaceC1277b);
                List<t0> listI = interfaceC1277b2.i();
                AbstractC2855l.f(listI, "getValueParameters(...)");
                ArrayList arrayList = new ArrayList(AbstractC2800q.u(listI, 10));
                for (t0 t0Var : listI) {
                    arrayList.add(t(interfaceC1277b, t0Var, kVarK, (c1891y == null || (listB = c1891y.b()) == null) ? null : (C1912j0) AbstractC2800q.h0(listB, t0Var.getIndex()), z13, new C1894a0(t0Var)));
                }
                L7.Z z14 = interfaceC1277b instanceof L7.Z ? (L7.Z) interfaceC1277b : null;
                C8.S sJ = j(this, interfaceC1277b, interfaceC1277b2, true, kVarK, (z14 == null || !AbstractC1540d.a(z14)) ? EnumC1475c.f11499h : EnumC1475c.f11501j, c1891y != null ? c1891y.c() : null, false, C1896b0.f18958g, 32, null);
                C8.S returnType = interfaceC1277b.getReturnType();
                AbstractC2855l.d(returnType);
                if (f(returnType)) {
                    z10 = true;
                    Pair pairA = z10 ? i7.t.a(AbstractC3282d.a(), new C1486n(interfaceC1277b)) : null;
                    if (sT == null && sJ == null) {
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (((C8.S) it.next()) != null) {
                                    z11 = true;
                                    break;
                                }
                            }
                        }
                        z11 = false;
                        if (!z11) {
                        }
                    }
                    W7.a aVar = (W7.a) interfaceC1277b;
                    if (sT == null) {
                        L7.c0 c0VarH0 = interfaceC1277b.h0();
                        if (c0VarH0 != null) {
                            type2 = c0VarH0.getType();
                        }
                    } else {
                        type2 = sT;
                    }
                    ArrayList arrayList2 = new ArrayList(AbstractC2800q.u(arrayList, 10));
                    for (Object obj : arrayList) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            AbstractC2800q.t();
                        }
                        C8.S type3 = (C8.S) obj;
                        if (type3 == null) {
                            type3 = ((t0) interfaceC1277b.i().get(i10)).getType();
                            AbstractC2855l.f(type3, "getType(...)");
                        }
                        arrayList2.add(type3);
                        i10 = i11;
                    }
                    if (sJ == null) {
                        sJ = interfaceC1277b.getReturnType();
                        AbstractC2855l.d(sJ);
                    }
                    W7.a aVarV = aVar.v(type2, arrayList2, sJ, pairA);
                    AbstractC2855l.e(aVarV, "null cannot be cast to non-null type D of org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature");
                    return aVarV;
                }
                L7.c0 c0VarH02 = interfaceC1277b.h0();
                if (!((c0VarH02 == null || (type = c0VarH02.getType()) == null) ? false : f(type))) {
                    List listI2 = interfaceC1277b.i();
                    AbstractC2855l.f(listI2, "getValueParameters(...)");
                    if (listI2 != null && listI2.isEmpty()) {
                        z12 = false;
                        if (z12) {
                        }
                        if (z10) {
                        }
                        if (sT == null) {
                        }
                        W7.a aVar2 = (W7.a) interfaceC1277b;
                        if (sT == null) {
                        }
                        ArrayList arrayList22 = new ArrayList(AbstractC2800q.u(arrayList, 10));
                        while (r7.hasNext()) {
                        }
                        if (sJ == null) {
                        }
                        W7.a aVarV2 = aVar2.v(type2, arrayList22, sJ, pairA);
                        AbstractC2855l.e(aVarV2, "null cannot be cast to non-null type D of org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature");
                        return aVarV2;
                    }
                    Iterator it2 = listI2.iterator();
                    while (it2.hasNext()) {
                        C8.S type4 = ((t0) it2.next()).getType();
                        AbstractC2855l.f(type4, "getType(...)");
                        if (f(type4)) {
                            z12 = true;
                            break;
                        }
                    }
                    z12 = false;
                    if (z12) {
                        z10 = false;
                    }
                    if (z10) {
                    }
                    if (sT == null) {
                        if (!arrayList.isEmpty()) {
                        }
                        z11 = false;
                        if (!z11) {
                        }
                    }
                    W7.a aVar22 = (W7.a) interfaceC1277b;
                    if (sT == null) {
                    }
                    ArrayList arrayList222 = new ArrayList(AbstractC2800q.u(arrayList, 10));
                    while (r7.hasNext()) {
                    }
                    if (sJ == null) {
                    }
                    W7.a aVarV22 = aVar22.v(type2, arrayList222, sJ, pairA);
                    AbstractC2855l.e(aVarV22, "null cannot be cast to non-null type D of org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature");
                    return aVarV22;
                }
            }
        }
        return interfaceC1277b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8.S m(InterfaceC1277b it) {
        AbstractC2855l.g(it, "it");
        C8.S returnType = it.getReturnType();
        AbstractC2855l.d(returnType);
        return returnType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8.S n(InterfaceC1277b it) {
        AbstractC2855l.g(it, "it");
        L7.c0 c0VarH0 = it.h0();
        AbstractC2855l.d(c0VarH0);
        C8.S type = c0VarH0.getType();
        AbstractC2855l.f(type, "getType(...)");
        return type;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8.S o(t0 t0Var, InterfaceC1277b it) {
        AbstractC2855l.g(it, "it");
        C8.S type = ((t0) it.i().get(t0Var.getIndex())).getType();
        AbstractC2855l.f(type, "getType(...)");
        return type;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean s(M0 it) {
        AbstractC2855l.g(it, "it");
        return it instanceof InterfaceC0405c0;
    }

    private final C8.S t(InterfaceC1277b interfaceC1277b, t0 t0Var, X7.k kVar, C1912j0 c1912j0, boolean z10, Function1 function1) {
        X7.k kVarK;
        return h(interfaceC1277b, t0Var, false, (t0Var == null || (kVarK = X7.c.k(kVar, t0Var.getAnnotations())) == null) ? kVar : kVarK, EnumC1475c.f11500i, c1912j0, z10, function1);
    }

    private final M7.h u(InterfaceC1277b interfaceC1277b, X7.k kVar) {
        InterfaceC1283h interfaceC1283hA = AbstractC1293s.a(interfaceC1277b);
        if (interfaceC1283hA == null) {
            return interfaceC1277b.getAnnotations();
        }
        C1550n c1550n = interfaceC1283hA instanceof C1550n ? (C1550n) interfaceC1283hA : null;
        List listQ0 = c1550n != null ? c1550n.Q0() : null;
        if (listQ0 == null || listQ0.isEmpty()) {
            return interfaceC1277b.getAnnotations();
        }
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(listQ0, 10));
        Iterator it = listQ0.iterator();
        while (it.hasNext()) {
            arrayList.add(new C1546j(kVar, (InterfaceC1817a) it.next(), true));
        }
        return M7.h.f7570a.a(AbstractC2800q.x0(interfaceC1277b.getAnnotations(), arrayList));
    }

    public final Collection p(X7.k c10, Collection platformSignatures) {
        AbstractC2855l.g(c10, "c");
        AbstractC2855l.g(platformSignatures, "platformSignatures");
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(platformSignatures, 10));
        Iterator it = platformSignatures.iterator();
        while (it.hasNext()) {
            arrayList.add(l((InterfaceC1277b) it.next(), c10));
        }
        return arrayList;
    }

    public final C8.S q(C8.S type, X7.k context) {
        AbstractC2855l.g(type, "type");
        AbstractC2855l.g(context, "context");
        C8.S sK = k(this, new C1906g0(null, false, context, EnumC1475c.f11502k, true), type, AbstractC2800q.j(), null, false, 12, null);
        return sK == null ? type : sK;
    }

    public final List r(m0 typeParameter, List bounds, X7.k context) {
        C8.S s10;
        C8.S sK;
        AbstractC2855l.g(typeParameter, "typeParameter");
        AbstractC2855l.g(bounds, "bounds");
        AbstractC2855l.g(context, "context");
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(bounds, 10));
        Iterator it = bounds.iterator();
        while (it.hasNext()) {
            C8.S s11 = (C8.S) it.next();
            if (H8.d.e(s11, C1898c0.f18961g)) {
                s10 = s11;
            } else {
                s10 = s11;
                sK = k(this, new C1906g0(typeParameter, false, context, EnumC1475c.f11503l, false, 16, null), s10, AbstractC2800q.j(), null, false, 12, null);
                if (sK == null) {
                }
                arrayList.add(sK);
            }
            sK = s10;
            arrayList.add(sK);
        }
        return arrayList;
    }
}
