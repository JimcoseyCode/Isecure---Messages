package s0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import r0.AbstractC3247j;
import r0.C3241d;
import r0.C3242e;
import r0.C3243f;
import r0.C3245h;
import s0.C3313b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C3243f f32105a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C3243f f32108d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f32106b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f32107c = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList f32109e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ArrayList f32110f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C3313b.InterfaceC0354b f32111g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private C3313b.a f32112h = new C3313b.a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    ArrayList f32113i = new ArrayList();

    public e(C3243f c3243f) {
        this.f32105a = c3243f;
        this.f32108d = c3243f;
    }

    private void a(f fVar, int i10, int i11, f fVar2, ArrayList arrayList, m mVar) {
        int i12;
        f fVar3;
        ArrayList arrayList2;
        p pVar = fVar.f32117d;
        if (pVar.f32169c == null) {
            C3243f c3243f = this.f32105a;
            if (pVar == c3243f.f31678e || pVar == c3243f.f31680f) {
                return;
            }
            if (mVar == null) {
                mVar = new m(pVar, i11);
                arrayList.add(mVar);
            }
            m mVar2 = mVar;
            pVar.f32169c = mVar2;
            mVar2.a(pVar);
            for (InterfaceC3315d interfaceC3315d : pVar.f32174h.f32124k) {
                if (interfaceC3315d instanceof f) {
                    i12 = i10;
                    fVar3 = fVar2;
                    arrayList2 = arrayList;
                    a((f) interfaceC3315d, i12, 0, fVar3, arrayList2, mVar2);
                } else {
                    i12 = i10;
                    fVar3 = fVar2;
                    arrayList2 = arrayList;
                }
                i10 = i12;
                fVar2 = fVar3;
                arrayList = arrayList2;
            }
            int i13 = i10;
            f fVar4 = fVar2;
            ArrayList arrayList3 = arrayList;
            for (InterfaceC3315d interfaceC3315d2 : pVar.f32175i.f32124k) {
                if (interfaceC3315d2 instanceof f) {
                    a((f) interfaceC3315d2, i13, 1, fVar4, arrayList3, mVar2);
                }
            }
            if (i13 == 1 && (pVar instanceof n)) {
                for (InterfaceC3315d interfaceC3315d3 : ((n) pVar).f32149k.f32124k) {
                    if (interfaceC3315d3 instanceof f) {
                        a((f) interfaceC3315d3, i13, 2, fVar4, arrayList3, mVar2);
                    }
                }
            }
            for (f fVar5 : pVar.f32174h.f32125l) {
                if (fVar5 == fVar4) {
                    mVar2.f32143b = true;
                }
                a(fVar5, i13, 0, fVar4, arrayList3, mVar2);
            }
            for (f fVar6 : pVar.f32175i.f32125l) {
                if (fVar6 == fVar4) {
                    mVar2.f32143b = true;
                }
                a(fVar6, i13, 1, fVar4, arrayList3, mVar2);
            }
            if (i13 == 1 && (pVar instanceof n)) {
                Iterator it = ((n) pVar).f32149k.f32125l.iterator();
                while (it.hasNext()) {
                    a((f) it.next(), i13, 2, fVar4, arrayList3, mVar2);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x0284 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0008 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean b(C3243f c3243f) {
        C3242e.b bVar;
        int i10;
        char c10;
        C3242e.b bVar2;
        float f10;
        C3242e.b bVar3;
        C3242e.b bVar4;
        C3242e.b bVar5;
        for (C3242e c3242e : c3243f.f31826J0) {
            C3242e.b[] bVarArr = c3242e.f31668Y;
            C3242e.b bVar6 = bVarArr[0];
            C3242e.b bVar7 = bVarArr[1];
            if (c3242e.S() == 8) {
                c3242e.f31670a = true;
            } else {
                if (c3242e.f31636A < 1.0f && bVar6 == C3242e.b.MATCH_CONSTRAINT) {
                    c3242e.f31712v = 2;
                }
                if (c3242e.f31642D < 1.0f && bVar7 == C3242e.b.MATCH_CONSTRAINT) {
                    c3242e.f31714w = 2;
                }
                if (c3242e.v() > 0.0f) {
                    C3242e.b bVar8 = C3242e.b.MATCH_CONSTRAINT;
                    if (bVar6 == bVar8 && (bVar7 == C3242e.b.WRAP_CONTENT || bVar7 == C3242e.b.FIXED)) {
                        c3242e.f31712v = 3;
                    } else if (bVar7 == bVar8 && (bVar6 == C3242e.b.WRAP_CONTENT || bVar6 == C3242e.b.FIXED)) {
                        c3242e.f31714w = 3;
                    } else if (bVar6 == bVar8 && bVar7 == bVar8) {
                        if (c3242e.f31712v == 0) {
                            c3242e.f31712v = 3;
                        }
                        if (c3242e.f31714w == 0) {
                            c3242e.f31714w = 3;
                        }
                    }
                }
                C3242e.b bVar9 = C3242e.b.MATCH_CONSTRAINT;
                if (bVar6 == bVar9 && c3242e.f31712v == 1 && (c3242e.f31657N.f31620f == null || c3242e.f31659P.f31620f == null)) {
                    bVar6 = C3242e.b.WRAP_CONTENT;
                }
                if (bVar7 == bVar9 && c3242e.f31714w == 1 && (c3242e.f31658O.f31620f == null || c3242e.f31660Q.f31620f == null)) {
                    bVar7 = C3242e.b.WRAP_CONTENT;
                }
                l lVar = c3242e.f31678e;
                lVar.f32170d = bVar6;
                int i11 = c3242e.f31712v;
                lVar.f32167a = i11;
                n nVar = c3242e.f31680f;
                nVar.f32170d = bVar7;
                int i12 = c3242e.f31714w;
                nVar.f32167a = i12;
                C3242e.b bVar10 = C3242e.b.MATCH_PARENT;
                if ((bVar6 == bVar10 || bVar6 == C3242e.b.FIXED || bVar6 == C3242e.b.WRAP_CONTENT) && (bVar7 == bVar10 || bVar7 == C3242e.b.FIXED || bVar7 == C3242e.b.WRAP_CONTENT)) {
                    C3242e.b bVar11 = bVar7;
                    C3242e.b bVar12 = bVar6;
                    int iT = c3242e.T();
                    if (bVar12 == bVar10) {
                        iT = (c3243f.T() - c3242e.f31657N.f31621g) - c3242e.f31659P.f31621g;
                        bVar12 = C3242e.b.FIXED;
                    }
                    int i13 = iT;
                    int iX = c3242e.x();
                    if (bVar11 == bVar10) {
                        iX = (c3243f.x() - c3242e.f31658O.f31621g) - c3242e.f31660Q.f31621g;
                        bVar11 = C3242e.b.FIXED;
                    }
                    l(c3242e, bVar12, i13, bVar11, iX);
                    c3242e.f31678e.f32171e.d(c3242e.T());
                    c3242e.f31680f.f32171e.d(c3242e.x());
                    c3242e.f31670a = true;
                } else {
                    if (bVar6 == bVar9) {
                        bVar2 = bVar9;
                        C3242e.b bVar13 = C3242e.b.WRAP_CONTENT;
                        c10 = 0;
                        if (bVar7 != bVar13 && bVar7 != C3242e.b.FIXED) {
                            bVar = bVar7;
                            i10 = 3;
                        } else if (i11 == 3) {
                            if (bVar7 == bVar13) {
                                l(c3242e, bVar13, 0, bVar13, 0);
                            }
                            int iX2 = c3242e.x();
                            int i14 = (int) ((iX2 * c3242e.f31675c0) + 0.5f);
                            C3242e.b bVar14 = C3242e.b.FIXED;
                            l(c3242e, bVar14, i14, bVar14, iX2);
                            c3242e.f31678e.f32171e.d(c3242e.T());
                            c3242e.f31680f.f32171e.d(c3242e.x());
                            c3242e.f31670a = true;
                        } else if (i11 == 1) {
                            l(c3242e, bVar13, 0, bVar7, 0);
                            c3242e.f31678e.f32171e.f32135m = c3242e.T();
                        } else {
                            bVar = bVar7;
                            i10 = 3;
                            if (i11 == 2) {
                                C3242e.b bVar15 = c3243f.f31668Y[0];
                                C3242e.b bVar16 = C3242e.b.FIXED;
                                if (bVar15 == bVar16 || bVar15 == bVar10) {
                                    l(c3242e, bVar16, (int) ((c3242e.f31636A * c3243f.T()) + 0.5f), bVar, c3242e.x());
                                    c3242e.f31678e.f32171e.d(c3242e.T());
                                    c3242e.f31680f.f32171e.d(c3242e.x());
                                    c3242e.f31670a = true;
                                }
                            } else {
                                C3241d[] c3241dArr = c3242e.f31665V;
                                f10 = 1.0f;
                                if (c3241dArr[0].f31620f == null || c3241dArr[1].f31620f == null) {
                                    l(c3242e, bVar13, 0, bVar, 0);
                                    c3242e.f31678e.f32171e.d(c3242e.T());
                                    c3242e.f31680f.f32171e.d(c3242e.x());
                                    c3242e.f31670a = true;
                                } else if (bVar == bVar2 || !(bVar6 == (bVar4 = C3242e.b.WRAP_CONTENT) || bVar6 == C3242e.b.FIXED)) {
                                    bVar3 = bVar6;
                                    if (bVar3 == bVar2 && bVar == bVar2) {
                                        if (i11 == 1 || i12 == 1) {
                                            C3242e.b bVar17 = C3242e.b.WRAP_CONTENT;
                                            l(c3242e, bVar17, 0, bVar17, 0);
                                            c3242e.f31678e.f32171e.f32135m = c3242e.T();
                                            c3242e.f31680f.f32171e.f32135m = c3242e.x();
                                        } else if (i12 == 2 && i11 == 2) {
                                            C3242e.b[] bVarArr2 = c3243f.f31668Y;
                                            C3242e.b bVar18 = bVarArr2[c10];
                                            C3242e.b bVar19 = C3242e.b.FIXED;
                                            if (bVar18 == bVar19 && bVarArr2[1] == bVar19) {
                                                l(c3242e, bVar19, (int) ((c3242e.f31636A * c3243f.T()) + 0.5f), bVar19, (int) ((c3242e.f31642D * c3243f.x()) + 0.5f));
                                                c3242e.f31678e.f32171e.d(c3242e.T());
                                                c3242e.f31680f.f32171e.d(c3242e.x());
                                                c3242e.f31670a = true;
                                            }
                                        }
                                    }
                                } else if (i12 == i10) {
                                    if (bVar6 == bVar4) {
                                        l(c3242e, bVar4, 0, bVar4, 0);
                                    }
                                    int iT2 = c3242e.T();
                                    float f11 = c3242e.f31675c0;
                                    if (c3242e.w() == -1) {
                                        f11 = f10 / f11;
                                    }
                                    C3242e.b bVar20 = C3242e.b.FIXED;
                                    l(c3242e, bVar20, iT2, bVar20, (int) ((iT2 * f11) + 0.5f));
                                    c3242e.f31678e.f32171e.d(c3242e.T());
                                    c3242e.f31680f.f32171e.d(c3242e.x());
                                    c3242e.f31670a = true;
                                } else if (i12 == 1) {
                                    l(c3242e, bVar6, 0, bVar4, 0);
                                    c3242e.f31680f.f32171e.f32135m = c3242e.x();
                                } else {
                                    bVar3 = bVar6;
                                    if (i12 == 2) {
                                        C3242e.b bVar21 = c3243f.f31668Y[1];
                                        bVar5 = bVar;
                                        C3242e.b bVar22 = C3242e.b.FIXED;
                                        if (bVar21 == bVar22 || bVar21 == bVar10) {
                                            l(c3242e, bVar3, c3242e.T(), bVar22, (int) ((c3242e.f31642D * c3243f.x()) + 0.5f));
                                            c3242e.f31678e.f32171e.d(c3242e.T());
                                            c3242e.f31680f.f32171e.d(c3242e.x());
                                            c3242e.f31670a = true;
                                        } else {
                                            bVar = bVar5;
                                        }
                                    } else {
                                        bVar5 = bVar;
                                        C3241d[] c3241dArr2 = c3242e.f31665V;
                                        if (c3241dArr2[2].f31620f == null || c3241dArr2[i10].f31620f == null) {
                                            l(c3242e, bVar4, 0, bVar5, 0);
                                            c3242e.f31678e.f32171e.d(c3242e.T());
                                            c3242e.f31680f.f32171e.d(c3242e.x());
                                            c3242e.f31670a = true;
                                        } else {
                                            bVar = bVar5;
                                        }
                                    }
                                    if (bVar3 == bVar2) {
                                    }
                                }
                            }
                        }
                    } else {
                        bVar = bVar7;
                        i10 = 3;
                        c10 = 0;
                        bVar2 = bVar9;
                    }
                    f10 = 1.0f;
                    if (bVar == bVar2) {
                    }
                    bVar3 = bVar6;
                    if (bVar3 == bVar2) {
                    }
                }
            }
        }
        return false;
    }

    private int e(C3243f c3243f, int i10) {
        int size = this.f32113i.size();
        long jMax = 0;
        for (int i11 = 0; i11 < size; i11++) {
            jMax = Math.max(jMax, ((m) this.f32113i.get(i11)).b(c3243f, i10));
        }
        return (int) jMax;
    }

    private void i(p pVar, int i10, ArrayList arrayList) {
        for (InterfaceC3315d interfaceC3315d : pVar.f32174h.f32124k) {
            if (interfaceC3315d instanceof f) {
                a((f) interfaceC3315d, i10, 0, pVar.f32175i, arrayList, null);
            } else if (interfaceC3315d instanceof p) {
                a(((p) interfaceC3315d).f32174h, i10, 0, pVar.f32175i, arrayList, null);
            }
        }
        for (InterfaceC3315d interfaceC3315d2 : pVar.f32175i.f32124k) {
            if (interfaceC3315d2 instanceof f) {
                a((f) interfaceC3315d2, i10, 1, pVar.f32174h, arrayList, null);
            } else if (interfaceC3315d2 instanceof p) {
                a(((p) interfaceC3315d2).f32175i, i10, 1, pVar.f32174h, arrayList, null);
            }
        }
        int i11 = i10;
        if (i11 == 1) {
            for (InterfaceC3315d interfaceC3315d3 : ((n) pVar).f32149k.f32124k) {
                if (interfaceC3315d3 instanceof f) {
                    a((f) interfaceC3315d3, i11, 2, null, arrayList, null);
                }
                i11 = i10;
            }
        }
    }

    private void l(C3242e c3242e, C3242e.b bVar, int i10, C3242e.b bVar2, int i11) {
        C3313b.a aVar = this.f32112h;
        aVar.f32093a = bVar;
        aVar.f32094b = bVar2;
        aVar.f32095c = i10;
        aVar.f32096d = i11;
        this.f32111g.a(c3242e, aVar);
        c3242e.e1(this.f32112h.f32097e);
        c3242e.F0(this.f32112h.f32098f);
        c3242e.E0(this.f32112h.f32100h);
        c3242e.u0(this.f32112h.f32099g);
    }

    public void c() {
        d(this.f32109e);
        this.f32113i.clear();
        m.f32141h = 0;
        i(this.f32105a.f31678e, 0, this.f32113i);
        i(this.f32105a.f31680f, 1, this.f32113i);
        this.f32106b = false;
    }

    public void d(ArrayList arrayList) {
        arrayList.clear();
        this.f32108d.f31678e.f();
        this.f32108d.f31680f.f();
        arrayList.add(this.f32108d.f31678e);
        arrayList.add(this.f32108d.f31680f);
        HashSet hashSet = null;
        for (C3242e c3242e : this.f32108d.f31826J0) {
            if (c3242e instanceof C3245h) {
                arrayList.add(new j(c3242e));
            } else {
                if (c3242e.f0()) {
                    if (c3242e.f31674c == null) {
                        c3242e.f31674c = new C3314c(c3242e, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c3242e.f31674c);
                } else {
                    arrayList.add(c3242e.f31678e);
                }
                if (c3242e.h0()) {
                    if (c3242e.f31676d == null) {
                        c3242e.f31676d = new C3314c(c3242e, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c3242e.f31676d);
                } else {
                    arrayList.add(c3242e.f31680f);
                }
                if (c3242e instanceof AbstractC3247j) {
                    arrayList.add(new k(c3242e));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((p) it.next()).f();
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            p pVar = (p) it2.next();
            if (pVar.f32168b != this.f32108d) {
                pVar.d();
            }
        }
    }

    public boolean f(boolean z10) {
        boolean z11;
        boolean z12 = false;
        if (this.f32106b || this.f32107c) {
            for (C3242e c3242e : this.f32105a.f31826J0) {
                c3242e.n();
                c3242e.f31670a = false;
                c3242e.f31678e.r();
                c3242e.f31680f.q();
            }
            this.f32105a.n();
            C3243f c3243f = this.f32105a;
            c3243f.f31670a = false;
            c3243f.f31678e.r();
            this.f32105a.f31680f.q();
            this.f32107c = false;
        }
        if (b(this.f32108d)) {
            return false;
        }
        this.f32105a.g1(0);
        this.f32105a.h1(0);
        C3242e.b bVarU = this.f32105a.u(0);
        C3242e.b bVarU2 = this.f32105a.u(1);
        if (this.f32106b) {
            c();
        }
        int iU = this.f32105a.U();
        int iV = this.f32105a.V();
        this.f32105a.f31678e.f32174h.d(iU);
        this.f32105a.f31680f.f32174h.d(iV);
        m();
        C3242e.b bVar = C3242e.b.WRAP_CONTENT;
        if (bVarU == bVar || bVarU2 == bVar) {
            if (z10) {
                Iterator it = this.f32109e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (!((p) it.next()).m()) {
                        z10 = false;
                        break;
                    }
                }
            }
            if (z10 && bVarU == C3242e.b.WRAP_CONTENT) {
                this.f32105a.J0(C3242e.b.FIXED);
                C3243f c3243f2 = this.f32105a;
                c3243f2.e1(e(c3243f2, 0));
                C3243f c3243f3 = this.f32105a;
                c3243f3.f31678e.f32171e.d(c3243f3.T());
            }
            if (z10 && bVarU2 == C3242e.b.WRAP_CONTENT) {
                this.f32105a.a1(C3242e.b.FIXED);
                C3243f c3243f4 = this.f32105a;
                c3243f4.F0(e(c3243f4, 1));
                C3243f c3243f5 = this.f32105a;
                c3243f5.f31680f.f32171e.d(c3243f5.x());
            }
        }
        C3243f c3243f6 = this.f32105a;
        C3242e.b bVar2 = c3243f6.f31668Y[0];
        C3242e.b bVar3 = C3242e.b.FIXED;
        if (bVar2 == bVar3 || bVar2 == C3242e.b.MATCH_PARENT) {
            int iT = c3243f6.T() + iU;
            this.f32105a.f31678e.f32175i.d(iT);
            this.f32105a.f31678e.f32171e.d(iT - iU);
            m();
            C3243f c3243f7 = this.f32105a;
            C3242e.b bVar4 = c3243f7.f31668Y[1];
            if (bVar4 == bVar3 || bVar4 == C3242e.b.MATCH_PARENT) {
                int iX = c3243f7.x() + iV;
                this.f32105a.f31680f.f32175i.d(iX);
                this.f32105a.f31680f.f32171e.d(iX - iV);
            }
            m();
            z11 = true;
        } else {
            z11 = false;
        }
        for (p pVar : this.f32109e) {
            if (pVar.f32168b != this.f32105a || pVar.f32173g) {
                pVar.e();
            }
        }
        Iterator it2 = this.f32109e.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z12 = true;
                break;
            }
            p pVar2 = (p) it2.next();
            if (z11 || pVar2.f32168b != this.f32105a) {
                if (!pVar2.f32174h.f32123j || ((!pVar2.f32175i.f32123j && !(pVar2 instanceof j)) || (!pVar2.f32171e.f32123j && !(pVar2 instanceof C3314c) && !(pVar2 instanceof j)))) {
                    break;
                }
            }
        }
        this.f32105a.J0(bVarU);
        this.f32105a.a1(bVarU2);
        return z12;
    }

    public boolean g(boolean z10) {
        if (this.f32106b) {
            for (C3242e c3242e : this.f32105a.f31826J0) {
                c3242e.n();
                c3242e.f31670a = false;
                l lVar = c3242e.f31678e;
                lVar.f32171e.f32123j = false;
                lVar.f32173g = false;
                lVar.r();
                n nVar = c3242e.f31680f;
                nVar.f32171e.f32123j = false;
                nVar.f32173g = false;
                nVar.q();
            }
            this.f32105a.n();
            C3243f c3243f = this.f32105a;
            c3243f.f31670a = false;
            l lVar2 = c3243f.f31678e;
            lVar2.f32171e.f32123j = false;
            lVar2.f32173g = false;
            lVar2.r();
            n nVar2 = this.f32105a.f31680f;
            nVar2.f32171e.f32123j = false;
            nVar2.f32173g = false;
            nVar2.q();
            c();
        }
        if (b(this.f32108d)) {
            return false;
        }
        this.f32105a.g1(0);
        this.f32105a.h1(0);
        this.f32105a.f31678e.f32174h.d(0);
        this.f32105a.f31680f.f32174h.d(0);
        return true;
    }

    public boolean h(boolean z10, int i10) {
        boolean z11;
        C3242e.b bVar;
        boolean z12 = false;
        C3242e.b bVarU = this.f32105a.u(0);
        C3242e.b bVarU2 = this.f32105a.u(1);
        int iU = this.f32105a.U();
        int iV = this.f32105a.V();
        if (z10 && (bVarU == (bVar = C3242e.b.WRAP_CONTENT) || bVarU2 == bVar)) {
            Iterator it = this.f32109e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p pVar = (p) it.next();
                if (pVar.f32172f == i10 && !pVar.m()) {
                    z10 = false;
                    break;
                }
            }
            if (i10 == 0) {
                if (z10 && bVarU == C3242e.b.WRAP_CONTENT) {
                    this.f32105a.J0(C3242e.b.FIXED);
                    C3243f c3243f = this.f32105a;
                    c3243f.e1(e(c3243f, 0));
                    C3243f c3243f2 = this.f32105a;
                    c3243f2.f31678e.f32171e.d(c3243f2.T());
                }
            } else if (z10 && bVarU2 == C3242e.b.WRAP_CONTENT) {
                this.f32105a.a1(C3242e.b.FIXED);
                C3243f c3243f3 = this.f32105a;
                c3243f3.F0(e(c3243f3, 1));
                C3243f c3243f4 = this.f32105a;
                c3243f4.f31680f.f32171e.d(c3243f4.x());
            }
        }
        if (i10 == 0) {
            C3243f c3243f5 = this.f32105a;
            C3242e.b bVar2 = c3243f5.f31668Y[0];
            if (bVar2 == C3242e.b.FIXED || bVar2 == C3242e.b.MATCH_PARENT) {
                int iT = c3243f5.T() + iU;
                this.f32105a.f31678e.f32175i.d(iT);
                this.f32105a.f31678e.f32171e.d(iT - iU);
                z11 = true;
            }
            z11 = false;
        } else {
            C3243f c3243f6 = this.f32105a;
            C3242e.b bVar3 = c3243f6.f31668Y[1];
            if (bVar3 == C3242e.b.FIXED || bVar3 == C3242e.b.MATCH_PARENT) {
                int iX = c3243f6.x() + iV;
                this.f32105a.f31680f.f32175i.d(iX);
                this.f32105a.f31680f.f32171e.d(iX - iV);
                z11 = true;
            }
            z11 = false;
        }
        m();
        for (p pVar2 : this.f32109e) {
            if (pVar2.f32172f == i10 && (pVar2.f32168b != this.f32105a || pVar2.f32173g)) {
                pVar2.e();
            }
        }
        Iterator it2 = this.f32109e.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z12 = true;
                break;
            }
            p pVar3 = (p) it2.next();
            if (pVar3.f32172f == i10 && (z11 || pVar3.f32168b != this.f32105a)) {
                if (!pVar3.f32174h.f32123j || !pVar3.f32175i.f32123j || (!(pVar3 instanceof C3314c) && !pVar3.f32171e.f32123j)) {
                    break;
                }
            }
        }
        this.f32105a.J0(bVarU);
        this.f32105a.a1(bVarU2);
        return z12;
    }

    public void j() {
        this.f32106b = true;
    }

    public void k() {
        this.f32107c = true;
    }

    public void m() {
        g gVar;
        for (C3242e c3242e : this.f32105a.f31826J0) {
            if (!c3242e.f31670a) {
                C3242e.b[] bVarArr = c3242e.f31668Y;
                boolean z10 = false;
                C3242e.b bVar = bVarArr[0];
                C3242e.b bVar2 = bVarArr[1];
                int i10 = c3242e.f31712v;
                int i11 = c3242e.f31714w;
                C3242e.b bVar3 = C3242e.b.WRAP_CONTENT;
                boolean z11 = bVar == bVar3 || (bVar == C3242e.b.MATCH_CONSTRAINT && i10 == 1);
                if (bVar2 == bVar3 || (bVar2 == C3242e.b.MATCH_CONSTRAINT && i11 == 1)) {
                    z10 = true;
                }
                g gVar2 = c3242e.f31678e.f32171e;
                boolean z12 = gVar2.f32123j;
                g gVar3 = c3242e.f31680f.f32171e;
                boolean z13 = gVar3.f32123j;
                if (z12 && z13) {
                    C3242e.b bVar4 = C3242e.b.FIXED;
                    l(c3242e, bVar4, gVar2.f32120g, bVar4, gVar3.f32120g);
                    c3242e.f31670a = true;
                } else if (z12 && z10) {
                    l(c3242e, C3242e.b.FIXED, gVar2.f32120g, bVar3, gVar3.f32120g);
                    if (bVar2 == C3242e.b.MATCH_CONSTRAINT) {
                        c3242e.f31680f.f32171e.f32135m = c3242e.x();
                    } else {
                        c3242e.f31680f.f32171e.d(c3242e.x());
                        c3242e.f31670a = true;
                    }
                } else if (z13 && z11) {
                    l(c3242e, bVar3, gVar2.f32120g, C3242e.b.FIXED, gVar3.f32120g);
                    if (bVar == C3242e.b.MATCH_CONSTRAINT) {
                        c3242e.f31678e.f32171e.f32135m = c3242e.T();
                    } else {
                        c3242e.f31678e.f32171e.d(c3242e.T());
                        c3242e.f31670a = true;
                    }
                }
                if (c3242e.f31670a && (gVar = c3242e.f31680f.f32150l) != null) {
                    gVar.d(c3242e.p());
                }
            }
        }
    }

    public void n(C3313b.InterfaceC0354b interfaceC0354b) {
        this.f32111g = interfaceC0354b;
    }
}
