package s0;

import java.util.ArrayList;
import java.util.Iterator;
import r0.C3241d;
import r0.C3242e;
import r0.C3243f;

/* JADX INFO: renamed from: s0.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C3314c extends p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    ArrayList f32103k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f32104l;

    public C3314c(C3242e c3242e, int i10) {
        super(c3242e);
        this.f32103k = new ArrayList();
        this.f32172f = i10;
        q();
    }

    private void q() {
        C3242e c3242e;
        C3242e c3242e2 = this.f32168b;
        C3242e c3242eL = c3242e2.L(this.f32172f);
        while (true) {
            C3242e c3242e3 = c3242eL;
            c3242e = c3242e2;
            c3242e2 = c3242e3;
            if (c3242e2 == null) {
                break;
            } else {
                c3242eL = c3242e2.L(this.f32172f);
            }
        }
        this.f32168b = c3242e;
        this.f32103k.add(c3242e.N(this.f32172f));
        C3242e c3242eJ = c3242e.J(this.f32172f);
        while (c3242eJ != null) {
            this.f32103k.add(c3242eJ.N(this.f32172f));
            c3242eJ = c3242eJ.J(this.f32172f);
        }
        for (p pVar : this.f32103k) {
            int i10 = this.f32172f;
            if (i10 == 0) {
                pVar.f32168b.f31674c = this;
            } else if (i10 == 1) {
                pVar.f32168b.f31676d = this;
            }
        }
        if (this.f32172f == 0 && ((C3243f) this.f32168b.K()).J1() && this.f32103k.size() > 1) {
            ArrayList arrayList = this.f32103k;
            this.f32168b = ((p) arrayList.get(arrayList.size() - 1)).f32168b;
        }
        this.f32104l = this.f32172f == 0 ? this.f32168b.z() : this.f32168b.P();
    }

    private C3242e r() {
        for (int i10 = 0; i10 < this.f32103k.size(); i10++) {
            p pVar = (p) this.f32103k.get(i10);
            if (pVar.f32168b.S() != 8) {
                return pVar.f32168b;
            }
        }
        return null;
    }

    private C3242e s() {
        for (int size = this.f32103k.size() - 1; size >= 0; size--) {
            p pVar = (p) this.f32103k.get(size);
            if (pVar.f32168b.S() != 8) {
                return pVar.f32168b;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x0160  */
    @Override // s0.p, s0.InterfaceC3315d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(InterfaceC3315d interfaceC3315d) {
        int i10;
        int i11;
        boolean z10;
        float f10;
        float f11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f12;
        int i16;
        int i17;
        float f13;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z11;
        if (this.f32174h.f32123j && this.f32175i.f32123j) {
            C3242e c3242eK = this.f32168b.K();
            boolean zJ1 = c3242eK instanceof C3243f ? ((C3243f) c3242eK).J1() : false;
            int i22 = this.f32175i.f32120g - this.f32174h.f32120g;
            int size = this.f32103k.size();
            int i23 = 0;
            while (true) {
                i10 = -1;
                i11 = 8;
                if (i23 >= size) {
                    i23 = -1;
                    break;
                } else if (((p) this.f32103k.get(i23)).f32168b.S() != 8) {
                    break;
                } else {
                    i23++;
                }
            }
            int i24 = size - 1;
            int i25 = i24;
            while (true) {
                if (i25 < 0) {
                    break;
                }
                if (((p) this.f32103k.get(i25)).f32168b.S() != 8) {
                    i10 = i25;
                    break;
                }
                i25--;
            }
            int i26 = 0;
            while (i26 < 2) {
                int i27 = 0;
                i13 = 0;
                i14 = 0;
                int i28 = 0;
                f11 = 0.0f;
                while (i27 < size) {
                    p pVar = (p) this.f32103k.get(i27);
                    if (pVar.f32168b.S() == i11) {
                        z11 = zJ1;
                    } else {
                        i28++;
                        if (i27 > 0 && i27 >= i23) {
                            i13 += pVar.f32174h.f32119f;
                        }
                        g gVar = pVar.f32171e;
                        int i29 = gVar.f32120g;
                        boolean z12 = pVar.f32170d != C3242e.b.MATCH_CONSTRAINT;
                        if (z12) {
                            int i30 = this.f32172f;
                            if (i30 == 0 && !pVar.f32168b.f31678e.f32171e.f32123j) {
                                return;
                            }
                            if (i30 == 1 && !pVar.f32168b.f31680f.f32171e.f32123j) {
                                return;
                            } else {
                                z11 = zJ1;
                            }
                        } else {
                            z11 = zJ1;
                            if (pVar.f32167a == 1 && i26 == 0) {
                                i29 = gVar.f32135m;
                                i14++;
                            } else if (gVar.f32123j) {
                            }
                            z12 = true;
                        }
                        if (z12) {
                            i13 += i29;
                        } else {
                            i14++;
                            float f14 = pVar.f32168b.f31639B0[this.f32172f];
                            if (f14 >= 0.0f) {
                                f11 += f14;
                            }
                        }
                        if (i27 < i24 && i27 < i10) {
                            i13 += -pVar.f32175i.f32119f;
                        }
                    }
                    i27++;
                    zJ1 = z11;
                    i11 = 8;
                }
                z10 = zJ1;
                f10 = 0.0f;
                if (i13 < i22 || i14 == 0) {
                    i12 = i28;
                    break;
                } else {
                    i26++;
                    zJ1 = z10;
                    i11 = 8;
                }
            }
            z10 = zJ1;
            f10 = 0.0f;
            f11 = 0.0f;
            i12 = 0;
            i13 = 0;
            i14 = 0;
            int i31 = this.f32174h.f32120g;
            if (z10) {
                i31 = this.f32175i.f32120g;
            }
            float f15 = 0.5f;
            if (i13 > i22) {
                i31 = z10 ? i31 + ((int) (((i13 - i22) / 2.0f) + 0.5f)) : i31 - ((int) (((i13 - i22) / 2.0f) + 0.5f));
            }
            if (i14 > 0) {
                float f16 = i22 - i13;
                int i32 = (int) ((f16 / i14) + 0.5f);
                int i33 = 0;
                int i34 = 0;
                while (i33 < size) {
                    p pVar2 = (p) this.f32103k.get(i33);
                    float f17 = f15;
                    int i35 = i31;
                    if (pVar2.f32168b.S() != 8 && pVar2.f32170d == C3242e.b.MATCH_CONSTRAINT) {
                        g gVar2 = pVar2.f32171e;
                        if (gVar2.f32123j) {
                            f13 = f16;
                            i18 = i32;
                            i21 = i33;
                            i34 = i34;
                        } else {
                            int i36 = f11 > f10 ? (int) (((pVar2.f32168b.f31639B0[this.f32172f] * f16) / f11) + f17) : i32;
                            f13 = f16;
                            if (this.f32172f == 0) {
                                C3242e c3242e = pVar2.f32168b;
                                i18 = i32;
                                i19 = c3242e.f31720z;
                                i20 = c3242e.f31718y;
                            } else {
                                i18 = i32;
                                C3242e c3242e2 = pVar2.f32168b;
                                i19 = c3242e2.f31640C;
                                i20 = c3242e2.f31638B;
                            }
                            i21 = i33;
                            int i37 = i34;
                            int iMax = Math.max(i20, pVar2.f32167a == 1 ? Math.min(i36, gVar2.f32135m) : i36);
                            if (i19 > 0) {
                                iMax = Math.min(i19, iMax);
                            }
                            if (iMax != i36) {
                                i34 = i37 + 1;
                                i36 = iMax;
                            } else {
                                i34 = i37;
                            }
                            pVar2.f32171e.d(i36);
                        }
                    }
                    i33 = i21 + 1;
                    f15 = f17;
                    i31 = i35;
                    f16 = f13;
                    i32 = i18;
                }
                i15 = i31;
                f12 = f15;
                int i38 = i34;
                if (i38 > 0) {
                    i14 -= i38;
                    i13 = 0;
                    for (int i39 = 0; i39 < size; i39++) {
                        p pVar3 = (p) this.f32103k.get(i39);
                        if (pVar3.f32168b.S() != 8) {
                            if (i39 > 0 && i39 >= i23) {
                                i13 += pVar3.f32174h.f32119f;
                            }
                            i13 += pVar3.f32171e.f32120g;
                            if (i39 < i24 && i39 < i10) {
                                i13 += -pVar3.f32175i.f32119f;
                            }
                        }
                    }
                }
                i17 = 2;
                if (this.f32104l == 2 && i38 == 0) {
                    i16 = 0;
                    this.f32104l = 0;
                } else {
                    i16 = 0;
                }
            } else {
                i15 = i31;
                f12 = 0.5f;
                i16 = 0;
                i17 = 2;
            }
            if (i13 > i22) {
                this.f32104l = i17;
            }
            if (i12 > 0 && i14 == 0 && i23 == i10) {
                this.f32104l = i17;
            }
            int i40 = this.f32104l;
            if (i40 == 1) {
                int i41 = i12 > 1 ? (i22 - i13) / (i12 - 1) : i12 == 1 ? (i22 - i13) / 2 : i16;
                if (i14 > 0) {
                    i41 = i16;
                }
                int i42 = i15;
                while (i16 < size) {
                    p pVar4 = (p) this.f32103k.get(z10 ? size - (i16 + 1) : i16);
                    if (pVar4.f32168b.S() == 8) {
                        pVar4.f32174h.d(i42);
                        pVar4.f32175i.d(i42);
                    } else {
                        if (i16 > 0) {
                            i42 = z10 ? i42 - i41 : i42 + i41;
                        }
                        if (i16 > 0 && i16 >= i23) {
                            i42 = z10 ? i42 - pVar4.f32174h.f32119f : i42 + pVar4.f32174h.f32119f;
                        }
                        if (z10) {
                            pVar4.f32175i.d(i42);
                        } else {
                            pVar4.f32174h.d(i42);
                        }
                        g gVar3 = pVar4.f32171e;
                        int i43 = gVar3.f32120g;
                        if (pVar4.f32170d == C3242e.b.MATCH_CONSTRAINT && pVar4.f32167a == 1) {
                            i43 = gVar3.f32135m;
                        }
                        i42 = z10 ? i42 - i43 : i42 + i43;
                        if (z10) {
                            pVar4.f32174h.d(i42);
                        } else {
                            pVar4.f32175i.d(i42);
                        }
                        pVar4.f32173g = true;
                        if (i16 < i24 && i16 < i10) {
                            i42 = z10 ? i42 - (-pVar4.f32175i.f32119f) : i42 + (-pVar4.f32175i.f32119f);
                        }
                    }
                    i16++;
                }
                return;
            }
            if (i40 == 0) {
                int i44 = (i22 - i13) / (i12 + 1);
                if (i14 > 0) {
                    i44 = i16;
                }
                int i45 = i15;
                while (i16 < size) {
                    p pVar5 = (p) this.f32103k.get(z10 ? size - (i16 + 1) : i16);
                    if (pVar5.f32168b.S() == 8) {
                        pVar5.f32174h.d(i45);
                        pVar5.f32175i.d(i45);
                    } else {
                        int i46 = z10 ? i45 - i44 : i45 + i44;
                        if (i16 > 0 && i16 >= i23) {
                            i46 = z10 ? i46 - pVar5.f32174h.f32119f : i46 + pVar5.f32174h.f32119f;
                        }
                        if (z10) {
                            pVar5.f32175i.d(i46);
                        } else {
                            pVar5.f32174h.d(i46);
                        }
                        g gVar4 = pVar5.f32171e;
                        int iMin = gVar4.f32120g;
                        if (pVar5.f32170d == C3242e.b.MATCH_CONSTRAINT && pVar5.f32167a == 1) {
                            iMin = Math.min(iMin, gVar4.f32135m);
                        }
                        i45 = z10 ? i46 - iMin : i46 + iMin;
                        if (z10) {
                            pVar5.f32174h.d(i45);
                        } else {
                            pVar5.f32175i.d(i45);
                        }
                        if (i16 < i24 && i16 < i10) {
                            i45 = z10 ? i45 - (-pVar5.f32175i.f32119f) : i45 + (-pVar5.f32175i.f32119f);
                        }
                    }
                    i16++;
                }
                return;
            }
            if (i40 == 2) {
                float fY = this.f32172f == 0 ? this.f32168b.y() : this.f32168b.O();
                if (z10) {
                    fY = 1.0f - fY;
                }
                int i47 = (int) (((i22 - i13) * fY) + f12);
                if (i47 < 0 || i14 > 0) {
                    i47 = i16;
                }
                int i48 = z10 ? i15 - i47 : i15 + i47;
                while (i16 < size) {
                    p pVar6 = (p) this.f32103k.get(z10 ? size - (i16 + 1) : i16);
                    if (pVar6.f32168b.S() == 8) {
                        pVar6.f32174h.d(i48);
                        pVar6.f32175i.d(i48);
                    } else {
                        if (i16 > 0 && i16 >= i23) {
                            i48 = z10 ? i48 - pVar6.f32174h.f32119f : i48 + pVar6.f32174h.f32119f;
                        }
                        if (z10) {
                            pVar6.f32175i.d(i48);
                        } else {
                            pVar6.f32174h.d(i48);
                        }
                        g gVar5 = pVar6.f32171e;
                        int i49 = gVar5.f32120g;
                        if (pVar6.f32170d == C3242e.b.MATCH_CONSTRAINT && pVar6.f32167a == 1) {
                            i49 = gVar5.f32135m;
                        }
                        i48 = z10 ? i48 - i49 : i48 + i49;
                        if (z10) {
                            pVar6.f32174h.d(i48);
                        } else {
                            pVar6.f32175i.d(i48);
                        }
                        if (i16 < i24 && i16 < i10) {
                            i48 = z10 ? i48 - (-pVar6.f32175i.f32119f) : i48 + (-pVar6.f32175i.f32119f);
                        }
                    }
                    i16++;
                }
            }
        }
    }

    @Override // s0.p
    void d() {
        Iterator it = this.f32103k.iterator();
        while (it.hasNext()) {
            ((p) it.next()).d();
        }
        int size = this.f32103k.size();
        if (size < 1) {
            return;
        }
        C3242e c3242e = ((p) this.f32103k.get(0)).f32168b;
        C3242e c3242e2 = ((p) this.f32103k.get(size - 1)).f32168b;
        if (this.f32172f == 0) {
            C3241d c3241d = c3242e.f31657N;
            C3241d c3241d2 = c3242e2.f31659P;
            f fVarI = i(c3241d, 0);
            int iF = c3241d.f();
            C3242e c3242eR = r();
            if (c3242eR != null) {
                iF = c3242eR.f31657N.f();
            }
            if (fVarI != null) {
                b(this.f32174h, fVarI, iF);
            }
            f fVarI2 = i(c3241d2, 0);
            int iF2 = c3241d2.f();
            C3242e c3242eS = s();
            if (c3242eS != null) {
                iF2 = c3242eS.f31659P.f();
            }
            if (fVarI2 != null) {
                b(this.f32175i, fVarI2, -iF2);
            }
        } else {
            C3241d c3241d3 = c3242e.f31658O;
            C3241d c3241d4 = c3242e2.f31660Q;
            f fVarI3 = i(c3241d3, 1);
            int iF3 = c3241d3.f();
            C3242e c3242eR2 = r();
            if (c3242eR2 != null) {
                iF3 = c3242eR2.f31658O.f();
            }
            if (fVarI3 != null) {
                b(this.f32174h, fVarI3, iF3);
            }
            f fVarI4 = i(c3241d4, 1);
            int iF4 = c3241d4.f();
            C3242e c3242eS2 = s();
            if (c3242eS2 != null) {
                iF4 = c3242eS2.f31660Q.f();
            }
            if (fVarI4 != null) {
                b(this.f32175i, fVarI4, -iF4);
            }
        }
        this.f32174h.f32114a = this;
        this.f32175i.f32114a = this;
    }

    @Override // s0.p
    public void e() {
        for (int i10 = 0; i10 < this.f32103k.size(); i10++) {
            ((p) this.f32103k.get(i10)).e();
        }
    }

    @Override // s0.p
    void f() {
        this.f32169c = null;
        Iterator it = this.f32103k.iterator();
        while (it.hasNext()) {
            ((p) it.next()).f();
        }
    }

    @Override // s0.p
    public long j() {
        int size = this.f32103k.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            p pVar = (p) this.f32103k.get(i10);
            j10 = j10 + ((long) pVar.f32174h.f32119f) + pVar.j() + ((long) pVar.f32175i.f32119f);
        }
        return j10;
    }

    @Override // s0.p
    boolean m() {
        int size = this.f32103k.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!((p) this.f32103k.get(i10)).m()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f32172f == 0 ? "horizontal : " : "vertical : ");
        for (p pVar : this.f32103k) {
            sb.append("<");
            sb.append(pVar);
            sb.append("> ");
        }
        return sb.toString();
    }
}
