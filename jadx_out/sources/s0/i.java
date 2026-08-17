package s0;

import java.util.ArrayList;
import java.util.Iterator;
import r0.AbstractC3247j;
import r0.C3238a;
import r0.C3241d;
import r0.C3242e;
import r0.C3243f;
import r0.C3244g;
import r0.C3245h;
import s0.C3313b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static o a(C3242e c3242e, int i10, ArrayList arrayList, o oVar) {
        int iM1;
        int i11 = i10 == 0 ? c3242e.f31649G0 : c3242e.f31651H0;
        if (i11 != -1 && (oVar == null || i11 != oVar.f32154b)) {
            int i12 = 0;
            while (true) {
                if (i12 >= arrayList.size()) {
                    break;
                }
                o oVar2 = (o) arrayList.get(i12);
                if (oVar2.c() == i11) {
                    if (oVar != null) {
                        oVar.g(i10, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                } else {
                    i12++;
                }
            }
        } else if (i11 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if ((c3242e instanceof AbstractC3247j) && (iM1 = ((AbstractC3247j) c3242e).m1(i10)) != -1) {
                int i13 = 0;
                while (true) {
                    if (i13 >= arrayList.size()) {
                        break;
                    }
                    o oVar3 = (o) arrayList.get(i13);
                    if (oVar3.c() == iM1) {
                        oVar = oVar3;
                        break;
                    }
                    i13++;
                }
            }
            if (oVar == null) {
                oVar = new o(i10);
            }
            arrayList.add(oVar);
        }
        if (oVar.a(c3242e)) {
            if (c3242e instanceof C3245h) {
                C3245h c3245h = (C3245h) c3242e;
                c3245h.l1().c(c3245h.m1() == 0 ? 1 : 0, arrayList, oVar);
            }
            if (i10 == 0) {
                c3242e.f31649G0 = oVar.c();
                c3242e.f31657N.c(i10, arrayList, oVar);
                c3242e.f31659P.c(i10, arrayList, oVar);
            } else {
                c3242e.f31651H0 = oVar.c();
                c3242e.f31658O.c(i10, arrayList, oVar);
                c3242e.f31661R.c(i10, arrayList, oVar);
                c3242e.f31660Q.c(i10, arrayList, oVar);
            }
            c3242e.f31664U.c(i10, arrayList, oVar);
        }
        return oVar;
    }

    private static o b(ArrayList arrayList, int i10) {
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            o oVar = (o) arrayList.get(i11);
            if (i10 == oVar.f32154b) {
                return oVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:176:0x0349  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean c(C3243f c3243f, C3313b.InterfaceC0354b interfaceC0354b) {
        o oVar;
        boolean z10;
        o oVar2;
        ArrayList arrayListL1 = c3243f.l1();
        int size = arrayListL1.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            C3242e c3242e = (C3242e) arrayListL1.get(i11);
            if (!d(c3243f.A(), c3243f.Q(), c3242e.A(), c3242e.Q()) || (c3242e instanceof C3244g)) {
                return false;
            }
        }
        int i12 = 0;
        ArrayList arrayList = null;
        ArrayList<AbstractC3247j> arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList<AbstractC3247j> arrayList4 = null;
        ArrayList arrayList5 = null;
        ArrayList arrayList6 = null;
        while (i12 < size) {
            C3242e c3242e2 = (C3242e) arrayListL1.get(i12);
            if (!d(c3243f.A(), c3243f.Q(), c3242e2.A(), c3242e2.Q())) {
                C3243f.M1(i10, c3242e2, interfaceC0354b, c3243f.f31758n1, C3313b.a.f32090k);
            }
            boolean z11 = c3242e2 instanceof C3245h;
            if (z11) {
                C3245h c3245h = (C3245h) c3242e2;
                if (c3245h.m1() == 0) {
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    arrayList3.add(c3245h);
                }
                if (c3245h.m1() == 1) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(c3245h);
                }
            }
            if (c3242e2 instanceof AbstractC3247j) {
                if (c3242e2 instanceof C3238a) {
                    C3238a c3238a = (C3238a) c3242e2;
                    if (c3238a.r1() == 0) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(c3238a);
                    }
                    if (c3238a.r1() == 1) {
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        arrayList4.add(c3238a);
                    }
                } else {
                    AbstractC3247j abstractC3247j = (AbstractC3247j) c3242e2;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(abstractC3247j);
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                    }
                    arrayList4.add(abstractC3247j);
                }
            }
            if (c3242e2.f31657N.f31620f == null && c3242e2.f31659P.f31620f == null && !z11 && !(c3242e2 instanceof C3238a)) {
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                }
                arrayList5.add(c3242e2);
            }
            if (c3242e2.f31658O.f31620f == null && c3242e2.f31660Q.f31620f == null && c3242e2.f31661R.f31620f == null && !z11 && !(c3242e2 instanceof C3238a)) {
                if (arrayList6 == null) {
                    arrayList6 = new ArrayList();
                }
                arrayList6.add(c3242e2);
            }
            i12++;
            i10 = 0;
        }
        ArrayList<o> arrayList7 = new ArrayList();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a((C3245h) it.next(), 0, arrayList7, null);
            }
        }
        o oVar3 = null;
        int i13 = 0;
        if (arrayList2 != null) {
            for (AbstractC3247j abstractC3247j2 : arrayList2) {
                o oVarA = a(abstractC3247j2, i13, arrayList7, oVar3);
                abstractC3247j2.l1(arrayList7, i13, oVarA);
                oVarA.b(arrayList7);
                oVar3 = null;
                i13 = 0;
            }
        }
        C3241d c3241dO = c3243f.o(C3241d.b.LEFT);
        if (c3241dO.d() != null) {
            Iterator it2 = c3241dO.d().iterator();
            while (it2.hasNext()) {
                a(((C3241d) it2.next()).f31618d, 0, arrayList7, null);
            }
        }
        C3241d c3241dO2 = c3243f.o(C3241d.b.RIGHT);
        if (c3241dO2.d() != null) {
            Iterator it3 = c3241dO2.d().iterator();
            while (it3.hasNext()) {
                a(((C3241d) it3.next()).f31618d, 0, arrayList7, null);
            }
        }
        C3241d c3241dO3 = c3243f.o(C3241d.b.CENTER);
        if (c3241dO3.d() != null) {
            Iterator it4 = c3241dO3.d().iterator();
            while (it4.hasNext()) {
                a(((C3241d) it4.next()).f31618d, 0, arrayList7, null);
            }
        }
        o oVar4 = null;
        if (arrayList5 != null) {
            Iterator it5 = arrayList5.iterator();
            while (it5.hasNext()) {
                a((C3242e) it5.next(), 0, arrayList7, null);
            }
        }
        if (arrayList3 != null) {
            Iterator it6 = arrayList3.iterator();
            while (it6.hasNext()) {
                a((C3245h) it6.next(), 1, arrayList7, null);
            }
        }
        int i14 = 1;
        if (arrayList4 != null) {
            for (AbstractC3247j abstractC3247j3 : arrayList4) {
                o oVarA2 = a(abstractC3247j3, i14, arrayList7, oVar4);
                abstractC3247j3.l1(arrayList7, i14, oVarA2);
                oVarA2.b(arrayList7);
                oVar4 = null;
                i14 = 1;
            }
        }
        C3241d c3241dO4 = c3243f.o(C3241d.b.TOP);
        if (c3241dO4.d() != null) {
            Iterator it7 = c3241dO4.d().iterator();
            while (it7.hasNext()) {
                a(((C3241d) it7.next()).f31618d, 1, arrayList7, null);
            }
        }
        C3241d c3241dO5 = c3243f.o(C3241d.b.BASELINE);
        if (c3241dO5.d() != null) {
            Iterator it8 = c3241dO5.d().iterator();
            while (it8.hasNext()) {
                a(((C3241d) it8.next()).f31618d, 1, arrayList7, null);
            }
        }
        C3241d c3241dO6 = c3243f.o(C3241d.b.BOTTOM);
        if (c3241dO6.d() != null) {
            Iterator it9 = c3241dO6.d().iterator();
            while (it9.hasNext()) {
                a(((C3241d) it9.next()).f31618d, 1, arrayList7, null);
            }
        }
        C3241d c3241dO7 = c3243f.o(C3241d.b.CENTER);
        if (c3241dO7.d() != null) {
            Iterator it10 = c3241dO7.d().iterator();
            while (it10.hasNext()) {
                a(((C3241d) it10.next()).f31618d, 1, arrayList7, null);
            }
        }
        if (arrayList6 != null) {
            Iterator it11 = arrayList6.iterator();
            while (it11.hasNext()) {
                a((C3242e) it11.next(), 1, arrayList7, null);
            }
        }
        for (int i15 = 0; i15 < size; i15++) {
            C3242e c3242e3 = (C3242e) arrayListL1.get(i15);
            if (c3242e3.p0()) {
                o oVarB = b(arrayList7, c3242e3.f31649G0);
                o oVarB2 = b(arrayList7, c3242e3.f31651H0);
                if (oVarB != null && oVarB2 != null) {
                    oVarB.g(0, oVarB2);
                    oVarB2.i(2);
                    arrayList7.remove(oVarB);
                }
            }
        }
        if (arrayList7.size() <= 1) {
            return false;
        }
        if (c3243f.A() == C3242e.b.WRAP_CONTENT) {
            oVar = null;
            int i16 = 0;
            for (o oVar5 : arrayList7) {
                if (oVar5.d() != 1) {
                    oVar5.h(false);
                    int iF = oVar5.f(c3243f.E1(), 0);
                    if (iF > i16) {
                        oVar = oVar5;
                        i16 = iF;
                    }
                }
            }
            if (oVar != null) {
                c3243f.J0(C3242e.b.FIXED);
                c3243f.e1(i16);
                oVar.h(true);
            } else {
                oVar = null;
            }
        }
        if (c3243f.Q() == C3242e.b.WRAP_CONTENT) {
            o oVar6 = null;
            int i17 = 0;
            for (o oVar7 : arrayList7) {
                if (oVar7.d() != 0) {
                    oVar7.h(false);
                    int iF2 = oVar7.f(c3243f.E1(), 1);
                    if (iF2 > i17) {
                        oVar6 = oVar7;
                        i17 = iF2;
                    }
                }
            }
            z10 = true;
            if (oVar6 != null) {
                c3243f.a1(C3242e.b.FIXED);
                c3243f.F0(i17);
                oVar6.h(true);
                oVar2 = oVar6;
            }
            if (oVar == null || oVar2 != null) {
                return z10;
            }
            return false;
        }
        z10 = true;
        oVar2 = null;
        if (oVar == null) {
        }
        return z10;
    }

    public static boolean d(C3242e.b bVar, C3242e.b bVar2, C3242e.b bVar3, C3242e.b bVar4) {
        C3242e.b bVar5;
        C3242e.b bVar6;
        C3242e.b bVar7 = C3242e.b.FIXED;
        return (bVar3 == bVar7 || bVar3 == (bVar6 = C3242e.b.WRAP_CONTENT) || (bVar3 == C3242e.b.MATCH_PARENT && bVar != bVar6)) || (bVar4 == bVar7 || bVar4 == (bVar5 = C3242e.b.WRAP_CONTENT) || (bVar4 == C3242e.b.MATCH_PARENT && bVar2 != bVar5));
    }
}
