package r0;

import java.util.ArrayList;
import o0.C3000b;
import r0.C3242e;

/* JADX INFO: renamed from: r0.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3239b {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033 A[PHI: r15 r16
      0x0033: PHI (r15v26 boolean) = (r15v1 boolean), (r15v28 boolean) binds: [B:26:0x0047, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x0033: PHI (r16v5 boolean) = (r16v1 boolean), (r16v7 boolean) binds: [B:26:0x0047, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[PHI: r15 r16
      0x0035: PHI (r15v3 boolean) = (r15v1 boolean), (r15v28 boolean) binds: [B:26:0x0047, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x0035: PHI (r16v3 boolean) = (r16v1 boolean), (r16v7 boolean) binds: [B:26:0x0047, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0499 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x038b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x016a  */
    /* JADX WARN: Type inference failed for: r0v27, types: [o0.d] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [o0.d] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [r0.e] */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r5v17, types: [o0.i] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void a(C3243f c3243f, o0.d dVar, int i10, int i11, C3240c c3240c) {
        boolean z10;
        boolean z11;
        boolean z12;
        float f10;
        ?? r02;
        C3241d c3241d;
        o0.i iVar;
        o0.i iVar2;
        C3242e c3242e;
        int i12;
        C3241d c3241d2;
        o0.i iVar3;
        C3242e c3242e2;
        int i13;
        o0.i iVar4;
        int size;
        float f11;
        ArrayList arrayList;
        boolean z13;
        boolean z14;
        int i14;
        int i15 = i10;
        C3242e c3242e3 = c3240c.f31593a;
        C3242e c3242e4 = c3240c.f31595c;
        C3242e c3242e5 = c3240c.f31594b;
        C3242e c3242e6 = c3240c.f31596d;
        C3242e c3242e7 = c3240c.f31597e;
        float f12 = c3240c.f31603k;
        boolean z15 = c3243f.f31668Y[i15] == C3242e.b.WRAP_CONTENT;
        if (i15 == 0) {
            int i16 = c3242e7.f31717x0;
            z10 = i16 == 0;
            z11 = i16 == 1;
            z12 = i16 == 2;
        } else {
            int i17 = c3242e7.f31719y0;
            z10 = i17 == 0;
            z11 = i17 == 1;
            if (i17 == 2) {
            }
        }
        ?? r14 = c3242e3;
        boolean z16 = false;
        while (true) {
            f10 = f12;
            if (z16) {
                break;
            }
            C3241d c3241d3 = r14.f31665V[i11];
            int i18 = z12 ? 1 : 4;
            int iF = c3241d3.f();
            C3242e.b bVar = r14.f31668Y[i15];
            boolean z17 = z15;
            C3242e.b bVar2 = C3242e.b.MATCH_CONSTRAINT;
            boolean z18 = bVar == bVar2 && r14.f31716x[i15] == 0;
            boolean z19 = z12;
            C3241d c3241d4 = c3241d3.f31620f;
            if (c3241d4 != null && r14 != c3242e3) {
                iF += c3241d4.f();
            }
            int i19 = iF;
            if (z19 && r14 != c3242e3 && r14 != c3242e5) {
                i18 = 8;
            }
            boolean z20 = z18;
            C3241d c3241d5 = c3241d3.f31620f;
            if (c3241d5 != null) {
                if (r14 == c3242e5) {
                    z13 = z16;
                    z14 = z10;
                    dVar.h(c3241d3.f31623i, c3241d5.f31623i, i19, 6);
                } else {
                    z13 = z16;
                    z14 = z10;
                    dVar.h(c3241d3.f31623i, c3241d5.f31623i, i19, 8);
                }
                if (z20 && !z19) {
                    i18 = 5;
                }
                dVar.e(c3241d3.f31623i, c3241d3.f31620f.f31623i, i19, (r14 == c3242e5 && z19 && r14.e0(i15)) ? 5 : i18);
            } else {
                z13 = z16;
                z14 = z10;
            }
            if (z17) {
                if (r14.S() == 8 || r14.f31668Y[i15] != bVar2) {
                    i14 = 0;
                } else {
                    C3241d[] c3241dArr = r14.f31665V;
                    i14 = 0;
                    dVar.h(c3241dArr[i11 + 1].f31623i, c3241dArr[i11].f31623i, 0, 5);
                }
                dVar.h(r14.f31665V[i11].f31623i, c3243f.f31665V[i11].f31623i, i14, 8);
            }
            C3241d c3241d6 = r14.f31665V[i11 + 1].f31620f;
            if (c3241d6 != null) {
                C3242e c3242e8 = c3241d6.f31618d;
                C3241d c3241d7 = c3242e8.f31665V[i11].f31620f;
                if (c3241d7 != null && c3241d7.f31618d == r14) {
                    obj = c3242e8;
                }
            }
            if (obj != null) {
                r14 = obj;
                z16 = z13;
            } else {
                z16 = true;
            }
            f12 = f10;
            z15 = z17;
            z12 = z19;
            z10 = z14;
            r14 = r14;
        }
        boolean z21 = z15;
        boolean z22 = z12;
        boolean z23 = z10;
        if (c3242e6 != null) {
            int i20 = i11 + 1;
            if (c3242e4.f31665V[i20].f31620f != null) {
                C3241d c3241d8 = c3242e6.f31665V[i20];
                if (c3242e6.f31668Y[i15] == C3242e.b.MATCH_CONSTRAINT && c3242e6.f31716x[i15] == 0 && !z22) {
                    C3241d c3241d9 = c3241d8.f31620f;
                    if (c3241d9.f31618d == c3243f) {
                        dVar.e(c3241d8.f31623i, c3241d9.f31623i, -c3241d8.f(), 5);
                    }
                    dVar.j(c3241d8.f31623i, c3242e4.f31665V[i20].f31620f.f31623i, -c3241d8.f(), 6);
                } else {
                    if (z22) {
                        C3241d c3241d10 = c3241d8.f31620f;
                        if (c3241d10.f31618d == c3243f) {
                            dVar.e(c3241d8.f31623i, c3241d10.f31623i, -c3241d8.f(), 4);
                        }
                    }
                    dVar.j(c3241d8.f31623i, c3242e4.f31665V[i20].f31620f.f31623i, -c3241d8.f(), 6);
                }
            }
        }
        if (z21) {
            int i21 = i11 + 1;
            o0.i iVar5 = c3243f.f31665V[i21].f31623i;
            C3241d c3241d11 = c3242e4.f31665V[i21];
            dVar.h(iVar5, c3241d11.f31623i, c3241d11.f(), 8);
        }
        ArrayList arrayList2 = c3240c.f31600h;
        if (arrayList2 != null && (size = arrayList2.size()) > 1) {
            float f13 = (!c3240c.f31610r || c3240c.f31612t) ? f10 : c3240c.f31602j;
            float f14 = 0.0f;
            float f15 = 0.0f;
            C3242e c3242e9 = null;
            int i22 = 0;
            while (i22 < size) {
                C3242e c3242e10 = (C3242e) arrayList2.get(i22);
                float f16 = c3242e10.f31639B0[i15];
                if (f16 >= f14) {
                    f11 = f14;
                } else if (c3240c.f31612t) {
                    C3241d[] c3241dArr2 = c3242e10.f31665V;
                    f11 = f14;
                    dVar.e(c3241dArr2[i11 + 1].f31623i, c3241dArr2[i11].f31623i, 0, 4);
                    arrayList = arrayList2;
                    i22++;
                    f14 = f11;
                    arrayList2 = arrayList;
                } else {
                    f11 = f14;
                    f16 = 1.0f;
                }
                float f17 = f16;
                if (f17 == f11) {
                    C3241d[] c3241dArr3 = c3242e10.f31665V;
                    dVar.e(c3241dArr3[i11 + 1].f31623i, c3241dArr3[i11].f31623i, 0, 8);
                    arrayList = arrayList2;
                    i22++;
                    f14 = f11;
                    arrayList2 = arrayList;
                } else {
                    if (c3242e9 != null) {
                        C3241d[] c3241dArr4 = c3242e9.f31665V;
                        o0.i iVar6 = c3241dArr4[i11].f31623i;
                        int i23 = i11 + 1;
                        o0.i iVar7 = c3241dArr4[i23].f31623i;
                        C3241d[] c3241dArr5 = c3242e10.f31665V;
                        arrayList = arrayList2;
                        o0.i iVar8 = c3241dArr5[i11].f31623i;
                        o0.i iVar9 = c3241dArr5[i23].f31623i;
                        C3000b c3000bR = dVar.r();
                        c3000bR.l(f15, f13, f17, iVar6, iVar7, iVar8, iVar9);
                        dVar.d(c3000bR);
                    } else {
                        arrayList = arrayList2;
                    }
                    c3242e9 = c3242e10;
                    f15 = f17;
                    i22++;
                    f14 = f11;
                    arrayList2 = arrayList;
                }
            }
        }
        if (c3242e5 != null && (c3242e5 == c3242e6 || z22)) {
            C3241d c3241d12 = c3242e3.f31665V[i11];
            int i24 = i11 + 1;
            C3241d c3241d13 = c3242e4.f31665V[i24];
            C3241d c3241d14 = c3241d12.f31620f;
            o0.i iVar10 = c3241d14 != null ? c3241d14.f31623i : null;
            C3241d c3241d15 = c3241d13.f31620f;
            o0.i iVar11 = c3241d15 != null ? c3241d15.f31623i : null;
            C3241d c3241d16 = c3242e5.f31665V[i11];
            if (c3242e6 != null) {
                c3241d13 = c3242e6.f31665V[i24];
            }
            if (iVar10 != null && iVar11 != null) {
                dVar.c(c3241d16.f31623i, iVar10, c3241d16.f(), i15 == 0 ? c3242e7.f31697n0 : c3242e7.f31699o0, iVar11, c3241d13.f31623i, c3241d13.f(), 7);
            }
        } else {
            if (!z23 || c3242e5 == null) {
                if (z11 && c3242e5 != null) {
                    int i25 = c3240c.f31602j;
                    boolean z24 = i25 > 0 && c3240c.f31601i == i25;
                    C3242e c3242e11 = c3242e5;
                    C3242e c3242e12 = c3242e11;
                    while (c3242e11 != null) {
                        C3242e c3242e13 = c3242e11.f31643D0[i10];
                        while (c3242e13 != null && c3242e13.S() == 8) {
                            c3242e13 = c3242e13.f31643D0[i10];
                        }
                        if (c3242e11 != c3242e5 && c3242e11 != c3242e6 && c3242e13 != null) {
                            if (c3242e13 == c3242e6) {
                                c3242e13 = null;
                            }
                            C3241d c3241d17 = c3242e11.f31665V[i11];
                            o0.i iVar12 = c3241d17.f31623i;
                            C3241d c3241d18 = c3241d17.f31620f;
                            if (c3241d18 != null) {
                                o0.i iVar13 = c3241d18.f31623i;
                            }
                            int i26 = i11 + 1;
                            o0.i iVar14 = c3242e12.f31665V[i26].f31623i;
                            int iF2 = c3241d17.f();
                            int iF3 = c3242e11.f31665V[i26].f();
                            if (c3242e13 != null) {
                                c3241d = c3242e13.f31665V[i11];
                                iVar = c3241d.f31623i;
                                C3241d c3241d19 = c3241d.f31620f;
                                iVar2 = c3241d19 != null ? c3241d19.f31623i : null;
                            } else {
                                c3241d = c3242e6.f31665V[i11];
                                iVar = c3241d != null ? c3241d.f31623i : null;
                                iVar2 = c3242e11.f31665V[i26].f31623i;
                            }
                            if (c3241d != null) {
                                iF3 += c3241d.f();
                            }
                            int iF4 = iF2 + c3242e12.f31665V[i26].f();
                            int i27 = z24 ? 8 : 4;
                            if (iVar12 == null || iVar14 == null || iVar == null || iVar2 == null) {
                                c3242e = c3242e13;
                            } else {
                                c3242e = c3242e13;
                                dVar.c(iVar12, iVar14, iF4, 0.5f, iVar, iVar2, iF3, i27);
                            }
                            c3242e13 = c3242e;
                        }
                        if (c3242e11.S() != 8) {
                            c3242e12 = c3242e11;
                        }
                        c3242e11 = c3242e13;
                    }
                    C3241d c3241d20 = c3242e5.f31665V[i11];
                    C3241d c3241d21 = c3242e3.f31665V[i11].f31620f;
                    int i28 = i11 + 1;
                    C3241d c3241d22 = c3242e6.f31665V[i28];
                    C3241d c3241d23 = c3242e4.f31665V[i28].f31620f;
                    if (c3241d21 == null) {
                        r02 = dVar;
                        if (c3241d23 != null && c3242e5 != c3242e6) {
                            r02.e(c3241d22.f31623i, c3241d23.f31623i, -c3241d22.f(), 5);
                        }
                    } else {
                        if (c3242e5 != c3242e6) {
                            dVar.e(c3241d20.f31623i, c3241d21.f31623i, c3241d20.f(), 5);
                        } else {
                            if (c3241d23 != null) {
                                o0.d dVar2 = dVar;
                                dVar2.c(c3241d20.f31623i, c3241d21.f31623i, c3241d20.f(), 0.5f, c3241d22.f31623i, c3241d23.f31623i, c3241d22.f(), 5);
                                r02 = dVar2;
                            }
                            if (c3241d23 != null) {
                                r02.e(c3241d22.f31623i, c3241d23.f31623i, -c3241d22.f(), 5);
                            }
                        }
                        r02 = dVar;
                        if (c3241d23 != null) {
                        }
                    }
                }
                if ((z23 && !z11) || c3242e5 == null || c3242e5 == c3242e6) {
                    return;
                }
                C3241d[] c3241dArr6 = c3242e5.f31665V;
                C3241d c3241d24 = c3241dArr6[i11];
                if (c3242e6 == null) {
                    c3242e6 = c3242e5;
                }
                int i29 = i11 + 1;
                C3241d c3241d25 = c3242e6.f31665V[i29];
                C3241d c3241d26 = c3241d24.f31620f;
                iVar4 = c3241d26 == null ? c3241d26.f31623i : null;
                C3241d c3241d27 = c3241d25.f31620f;
                Object obj = c3241d27 == null ? c3241d27.f31623i : null;
                if (c3242e4 != c3242e6) {
                    C3241d c3241d28 = c3242e4.f31665V[i29].f31620f;
                    obj = c3241d28 != null ? c3241d28.f31623i : null;
                }
                if (c3242e5 == c3242e6) {
                    c3241d25 = c3241dArr6[i29];
                }
                if (iVar4 != null || obj == null) {
                }
                r02.c(c3241d24.f31623i, iVar4, c3241d24.f(), 0.5f, obj, c3241d25.f31623i, c3242e6.f31665V[i29].f(), 5);
                return;
            }
            int i30 = c3240c.f31602j;
            boolean z25 = i30 > 0 && c3240c.f31601i == i30;
            C3242e c3242e14 = c3242e5;
            C3242e c3242e15 = c3242e14;
            while (c3242e14 != null) {
                C3242e c3242e16 = c3242e14.f31643D0[i15];
                while (true) {
                    if (c3242e16 == null) {
                        i12 = 8;
                        break;
                    }
                    i12 = 8;
                    if (c3242e16.S() != 8) {
                        break;
                    } else {
                        c3242e16 = c3242e16.f31643D0[i15];
                    }
                }
                if (c3242e16 != null || c3242e14 == c3242e6) {
                    C3241d c3241d29 = c3242e14.f31665V[i11];
                    o0.i iVar15 = c3241d29.f31623i;
                    C3241d c3241d30 = c3241d29.f31620f;
                    o0.i iVar16 = c3241d30 != null ? c3241d30.f31623i : null;
                    if (c3242e15 != c3242e14) {
                        iVar16 = c3242e15.f31665V[i11 + 1].f31623i;
                    } else if (c3242e14 == c3242e5) {
                        C3241d c3241d31 = c3242e3.f31665V[i11].f31620f;
                        iVar16 = c3241d31 != null ? c3241d31.f31623i : null;
                    }
                    int iF5 = c3241d29.f();
                    int i31 = i11 + 1;
                    int iF6 = c3242e14.f31665V[i31].f();
                    if (c3242e16 != null) {
                        c3241d2 = c3242e16.f31665V[i11];
                        iVar3 = c3241d2.f31623i;
                    } else {
                        c3241d2 = c3242e4.f31665V[i31].f31620f;
                        iVar3 = c3241d2 != null ? c3241d2.f31623i : null;
                    }
                    o0.i iVar17 = c3242e14.f31665V[i31].f31623i;
                    if (c3241d2 != null) {
                        iF6 += c3241d2.f();
                    }
                    int iF7 = iF5 + c3242e15.f31665V[i31].f();
                    if (iVar15 == null || iVar16 == null || iVar3 == null || iVar17 == null) {
                        c3242e2 = c3242e16;
                        i13 = 8;
                    } else {
                        if (c3242e14 == c3242e5) {
                            iF7 = c3242e5.f31665V[i11].f();
                        }
                        if (c3242e14 == c3242e6) {
                            iF6 = c3242e6.f31665V[i31].f();
                        }
                        c3242e2 = c3242e16;
                        i13 = 8;
                        dVar.c(iVar15, iVar16, iF7, 0.5f, iVar3, iVar17, iF6, z25 ? 8 : 5);
                        if (c3242e14.S() == i13) {
                            c3242e15 = c3242e14;
                        }
                        i15 = i10;
                        c3242e14 = c3242e2;
                    }
                } else {
                    c3242e2 = c3242e16;
                    i13 = i12;
                }
                if (c3242e14.S() == i13) {
                }
                i15 = i10;
                c3242e14 = c3242e2;
            }
        }
        r02 = dVar;
        if (z23) {
        }
        C3241d[] c3241dArr62 = c3242e5.f31665V;
        C3241d c3241d242 = c3241dArr62[i11];
        if (c3242e6 == null) {
        }
        int i292 = i11 + 1;
        C3241d c3241d252 = c3242e6.f31665V[i292];
        C3241d c3241d262 = c3241d242.f31620f;
        if (c3241d262 == null) {
        }
        C3241d c3241d272 = c3241d252.f31620f;
        if (c3241d272 == null) {
        }
        if (c3242e4 != c3242e6) {
        }
        if (c3242e5 == c3242e6) {
        }
        if (iVar4 != null) {
        }
    }

    public static void b(C3243f c3243f, o0.d dVar, ArrayList arrayList, int i10) {
        int i11;
        C3240c[] c3240cArr;
        int i12;
        if (i10 == 0) {
            i11 = c3243f.f31739U0;
            c3240cArr = c3243f.f31742X0;
            i12 = 0;
        } else {
            i11 = c3243f.f31740V0;
            c3240cArr = c3243f.f31741W0;
            i12 = 2;
        }
        for (int i13 = 0; i13 < i11; i13++) {
            C3240c c3240c = c3240cArr[i13];
            c3240c.a();
            if (arrayList == null || arrayList.contains(c3240c.f31593a)) {
                a(c3243f, dVar, i10, i12, c3240c);
            }
        }
    }
}
