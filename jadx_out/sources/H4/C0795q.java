package H4;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: renamed from: H4.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C0795q extends AbstractC0787i {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final AbstractC0787i f3788m = new C0795q(null, new Object[0], 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final transient Object f3789j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final transient Object[] f3790k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final transient int f3791l;

    private C0795q(Object obj, Object[] objArr, int i10) {
        this.f3789j = obj;
        this.f3790k = objArr;
        this.f3791l = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d1  */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static C0795q g(int i10, Object[] objArr, C0786h c0786h) {
        int iHighestOneBit;
        boolean z10;
        int i11;
        char c10;
        ?? r32;
        char c11;
        short[] sArr;
        boolean z11;
        int i12;
        ?? r16;
        boolean z12;
        boolean z13;
        int i13 = i10;
        Object[] objArrCopyOf = objArr;
        if (i13 == 0) {
            return (C0795q) f3788m;
        }
        C0785g c0785g = null;
        ?? r33 = 0;
        C0785g c0785g2 = null;
        C0785g c0785g3 = null;
        boolean z14 = false;
        int i14 = 1;
        if (i13 == 1) {
            Object obj = objArrCopyOf[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArrCopyOf[1];
            Objects.requireNonNull(obj2);
            X.a(obj, obj2);
            return new C0795q(null, objArrCopyOf, 1);
        }
        U.b(i13, objArrCopyOf.length >> 1, "index");
        char c12 = 2;
        int iMax = Math.max(i13, 2);
        if (iMax < 751619276) {
            iHighestOneBit = Integer.highestOneBit(iMax - 1);
            do {
                iHighestOneBit += iHighestOneBit;
            } while (((double) iHighestOneBit) * 0.7d < iMax);
        } else {
            iHighestOneBit = 1073741824;
            if (iMax >= 1073741824) {
                throw new IllegalArgumentException("collection too large");
            }
        }
        if (i13 == 1) {
            Object obj3 = objArrCopyOf[0];
            Objects.requireNonNull(obj3);
            Object obj4 = objArrCopyOf[1];
            Objects.requireNonNull(obj4);
            X.a(obj3, obj4);
            z13 = false;
            i13 = 1;
            i11 = 1;
        } else {
            int i15 = iHighestOneBit - 1;
            if (iHighestOneBit <= 128) {
                byte[] bArr = new byte[iHighestOneBit];
                Arrays.fill(bArr, (byte) -1);
                int i16 = 0;
                int i17 = 0;
                while (i16 < i13) {
                    int i18 = i17 + i17;
                    int i19 = i16 + i16;
                    Object obj5 = objArrCopyOf[i19];
                    Objects.requireNonNull(obj5);
                    Object obj6 = objArrCopyOf[i19 ^ i14];
                    Objects.requireNonNull(obj6);
                    X.a(obj5, obj6);
                    int iA = Z.a(obj5.hashCode());
                    while (true) {
                        int i20 = iA & i15;
                        z11 = z14;
                        i12 = i14;
                        int i21 = bArr[i20] & 255;
                        if (i21 == 255) {
                            bArr[i20] = (byte) i18;
                            if (i17 < i16) {
                                objArrCopyOf[i18] = obj5;
                                objArrCopyOf[i18 ^ 1] = obj6;
                            }
                            i17++;
                        } else {
                            if (obj5.equals(objArrCopyOf[i21 == true ? 1 : 0])) {
                                int i22 = ~i21;
                                Object obj7 = objArrCopyOf[i22 == true ? 1 : 0];
                                Objects.requireNonNull(obj7);
                                C0785g c0785g4 = new C0785g(obj5, obj6, obj7);
                                objArrCopyOf[i22 == true ? 1 : 0] = obj6;
                                c0785g2 = c0785g4;
                                break;
                            }
                            iA = i20 + 1;
                            z14 = z11;
                            i14 = i12;
                        }
                    }
                    i16++;
                    z14 = z11;
                    i14 = i12;
                }
                z10 = z14;
                i11 = i14;
                if (i17 == i13) {
                    c10 = 2;
                    r32 = bArr;
                    r16 = z10;
                    z12 = r32 instanceof Object[];
                    ?? r34 = r32;
                    if (z12) {
                        Object[] objArr2 = (Object[]) r32;
                        C0785g c0785g5 = (C0785g) objArr2[c10];
                        if (c0786h == null) {
                            throw c0785g5.a();
                        }
                        c0786h.f3771c = c0785g5;
                        Object obj8 = objArr2[r16];
                        int iIntValue = ((Integer) objArr2[i11]).intValue();
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
                        r34 = obj8;
                        i13 = iIntValue;
                    }
                    return new C0795q(r34, objArrCopyOf, i13);
                }
                sArr = new Object[3];
                sArr[z10 ? 1 : 0] = bArr;
                sArr[i11] = Integer.valueOf(i17);
                sArr[2] = c0785g2;
                r33 = sArr;
                z13 = z10;
            } else {
                z10 = false;
                i11 = 1;
                if (iHighestOneBit > 32768) {
                    int[] iArr = new int[iHighestOneBit];
                    Arrays.fill(iArr, -1);
                    int i23 = 0;
                    int i24 = 0;
                    while (i23 < i13) {
                        int i25 = i24 + i24;
                        int i26 = i23 + i23;
                        Object obj9 = objArrCopyOf[i26];
                        Objects.requireNonNull(obj9);
                        Object obj10 = objArrCopyOf[i26 ^ 1];
                        Objects.requireNonNull(obj10);
                        X.a(obj9, obj10);
                        int iA2 = Z.a(obj9.hashCode());
                        while (true) {
                            int i27 = iA2 & i15;
                            int i28 = iArr[i27];
                            if (i28 == -1) {
                                iArr[i27] = i25;
                                if (i24 < i23) {
                                    objArrCopyOf[i25] = obj9;
                                    objArrCopyOf[i25 ^ 1] = obj10;
                                }
                                i24++;
                                c11 = c12;
                            } else {
                                c11 = c12;
                                if (obj9.equals(objArrCopyOf[i28])) {
                                    int i29 = i28 ^ 1;
                                    Object obj11 = objArrCopyOf[i29];
                                    Objects.requireNonNull(obj11);
                                    C0785g c0785g6 = new C0785g(obj9, obj10, obj11);
                                    objArrCopyOf[i29] = obj10;
                                    c0785g = c0785g6;
                                    break;
                                }
                                iA2 = i27 + 1;
                                c12 = c11;
                            }
                        }
                        i23++;
                        c12 = c11;
                    }
                    c10 = c12;
                    if (i24 == i13) {
                        r32 = iArr;
                        r16 = z10;
                    } else {
                        Object[] objArr3 = new Object[3];
                        objArr3[0] = iArr;
                        objArr3[1] = Integer.valueOf(i24);
                        objArr3[c10] = c0785g;
                        r32 = objArr3;
                        r16 = z10;
                    }
                    z12 = r32 instanceof Object[];
                    ?? r342 = r32;
                    if (z12) {
                    }
                    return new C0795q(r342, objArrCopyOf, i13);
                }
                sArr = new short[iHighestOneBit];
                Arrays.fill(sArr, (short) -1);
                int i30 = 0;
                for (int i31 = 0; i31 < i13; i31++) {
                    int i32 = i30 + i30;
                    int i33 = i31 + i31;
                    Object obj12 = objArrCopyOf[i33];
                    Objects.requireNonNull(obj12);
                    Object obj13 = objArrCopyOf[i33 ^ 1];
                    Objects.requireNonNull(obj13);
                    X.a(obj12, obj13);
                    int iA3 = Z.a(obj12.hashCode());
                    while (true) {
                        int i34 = iA3 & i15;
                        char c13 = (char) sArr[i34];
                        if (c13 == 65535) {
                            sArr[i34] = (short) i32;
                            if (i30 < i31) {
                                objArrCopyOf[i32] = obj12;
                                objArrCopyOf[i32 ^ 1] = obj13;
                            }
                            i30++;
                        } else {
                            if (obj12.equals(objArrCopyOf[c13])) {
                                int i35 = c13 ^ 1;
                                Object obj14 = objArrCopyOf[i35 == true ? 1 : 0];
                                Objects.requireNonNull(obj14);
                                C0785g c0785g7 = new C0785g(obj12, obj13, obj14);
                                objArrCopyOf[i35 == true ? 1 : 0] = obj13;
                                c0785g3 = c0785g7;
                                break;
                            }
                            iA3 = i34 + 1;
                        }
                    }
                }
                if (i30 == i13) {
                    r33 = sArr;
                    z13 = z10;
                } else {
                    r33 = new Object[]{sArr, Integer.valueOf(i30), c0785g3};
                    z13 = z10;
                }
            }
        }
        c10 = 2;
        r32 = r33;
        r16 = z13;
        z12 = r32 instanceof Object[];
        ?? r3422 = r32;
        if (z12) {
        }
        return new C0795q(r3422, objArrCopyOf, i13);
    }

    @Override // H4.AbstractC0787i
    final AbstractC0781c a() {
        return new C0794p(this.f3790k, 1, this.f3791l);
    }

    @Override // H4.AbstractC0787i
    final AbstractC0788j d() {
        return new C0792n(this, this.f3790k, 0, this.f3791l);
    }

    @Override // H4.AbstractC0787i
    final AbstractC0788j e() {
        return new C0793o(this, new C0794p(this.f3790k, 0, this.f3791l));
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0003  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0003 A[EDGE_INSN: B:44:0x0003->B:4:0x0003 BREAK  A[LOOP:0: B:16:0x0038->B:22:0x004e], EDGE_INSN: B:46:0x0003->B:4:0x0003 BREAK  A[LOOP:1: B:26:0x0063->B:32:0x007a], EDGE_INSN: B:48:0x0003->B:4:0x0003 BREAK  A[LOOP:2: B:34:0x0089->B:43:0x00a0]] */
    @Override // H4.AbstractC0787i, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            int i10 = this.f3791l;
            Object[] objArr = this.f3790k;
            if (i10 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                }
            } else {
                Object obj4 = this.f3789j;
                if (obj4 != null) {
                    if (obj4 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj4;
                        int length = bArr.length - 1;
                        int iA = Z.a(obj.hashCode());
                        while (true) {
                            int i11 = iA & length;
                            int i12 = bArr[i11] & 255;
                            if (i12 == 255) {
                                break;
                            }
                            if (obj.equals(objArr[i12])) {
                                obj2 = objArr[i12 ^ 1];
                                break;
                            }
                            iA = i11 + 1;
                        }
                    } else if (obj4 instanceof short[]) {
                        short[] sArr = (short[]) obj4;
                        int length2 = sArr.length - 1;
                        int iA2 = Z.a(obj.hashCode());
                        while (true) {
                            int i13 = iA2 & length2;
                            char c10 = (char) sArr[i13];
                            if (c10 == 65535) {
                                break;
                            }
                            if (obj.equals(objArr[c10])) {
                                obj2 = objArr[c10 ^ 1];
                                break;
                            }
                            iA2 = i13 + 1;
                        }
                    } else {
                        int[] iArr = (int[]) obj4;
                        int length3 = iArr.length - 1;
                        int iA3 = Z.a(obj.hashCode());
                        while (true) {
                            int i14 = iA3 & length3;
                            int i15 = iArr[i14];
                            if (i15 == -1) {
                                break;
                            }
                            if (obj.equals(objArr[i15])) {
                                obj2 = objArr[i15 ^ 1];
                                break;
                            }
                            iA3 = i14 + 1;
                        }
                    }
                }
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f3791l;
    }
}
