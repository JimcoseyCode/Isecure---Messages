package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.v1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C2204v1 implements J1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2186r1 f22430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final W1 f22431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f22432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final B0 f22433d;

    private C2204v1(W1 w12, B0 b02, InterfaceC2186r1 interfaceC2186r1) {
        this.f22431b = w12;
        this.f22432c = interfaceC2186r1 instanceof M0;
        this.f22433d = b02;
        this.f22430a = interfaceC2186r1;
    }

    static C2204v1 j(W1 w12, B0 b02, InterfaceC2186r1 interfaceC2186r1) {
        return new C2204v1(w12, b02, interfaceC2186r1);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.J1
    public final void a(Object obj) {
        this.f22431b.a(obj);
        this.f22433d.a(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b8 A[EDGE_INSN: B:61:0x00b8->B:33:0x00b8 BREAK  A[LOOP:1: B:17:0x0064->B:64:0x0064], SYNTHETIC] */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.J1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Object obj, byte[] bArr, int i10, int i11, C2116d0 c2116d0) throws Z0 {
        int iJ;
        P0 p02 = (P0) obj;
        X1 x1F = p02.zzc;
        if (x1F == X1.c()) {
            x1F = X1.f();
            p02.zzc = x1F;
        }
        X1 x12 = x1F;
        F0 f0F = ((M0) obj).F();
        O0 o0B = null;
        while (i10 < i11) {
            int iJ2 = AbstractC2121e0.j(bArr, i10, c2116d0);
            int i12 = c2116d0.f22344a;
            if (i12 == 11) {
                int i13 = i11;
                C2116d0 c2116d02 = c2116d0;
                int i14 = 0;
                AbstractC2171o0 abstractC2171o0 = null;
                while (true) {
                    if (iJ2 >= i13) {
                        iJ = iJ2;
                        break;
                    }
                    iJ = AbstractC2121e0.j(bArr, iJ2, c2116d02);
                    int i15 = c2116d02.f22344a;
                    int i16 = i15 >>> 3;
                    int i17 = i15 & 7;
                    if (i16 != 2) {
                        if (i16 == 3) {
                            if (o0B != null) {
                                iJ2 = AbstractC2121e0.e(C2216y1.a().b(o0B.f22294a.getClass()), bArr, iJ, i13, c2116d02);
                                f0F.i(o0B.f22295b, c2116d02.f22346c);
                            } else if (i17 == 2) {
                                iJ2 = AbstractC2121e0.a(bArr, iJ, c2116d02);
                                abstractC2171o0 = (AbstractC2171o0) c2116d02.f22346c;
                            }
                        }
                        if (i15 != 12) {
                            break;
                        } else {
                            iJ2 = AbstractC2121e0.p(i15, bArr, iJ, i13, c2116d02);
                        }
                    } else if (i17 == 0) {
                        iJ2 = AbstractC2121e0.j(bArr, iJ, c2116d02);
                        i14 = c2116d02.f22344a;
                        o0B = c2116d02.f22347d.b(this.f22430a, i14);
                    } else if (i15 != 12) {
                    }
                }
                if (abstractC2171o0 != null) {
                    x12.j((i14 << 3) | 2, abstractC2171o0);
                }
                i10 = iJ;
                i11 = i13;
                c2116d0 = c2116d02;
            } else if ((i12 & 7) == 2) {
                o0B = c2116d0.f22347d.b(this.f22430a, i12 >>> 3);
                if (o0B != null) {
                    i10 = AbstractC2121e0.e(C2216y1.a().b(o0B.f22294a.getClass()), bArr, iJ2, i11, c2116d0);
                    f0F.i(o0B.f22295b, c2116d0.f22346c);
                } else {
                    i10 = AbstractC2121e0.i(i12, bArr, iJ2, i11, x12, c2116d0);
                }
            } else {
                i10 = AbstractC2121e0.p(i12, bArr, iJ2, i11, c2116d0);
            }
        }
        if (i10 != i11) {
            throw new Z0("Failed to parse the message.");
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.J1
    public final void c(Object obj, InterfaceC2163m2 interfaceC2163m2) {
        Iterator itF = ((M0) obj).zzb.f();
        while (itF.hasNext()) {
            Map.Entry entry = (Map.Entry) itF.next();
            E0 e02 = (E0) entry.getKey();
            if (e02.f() != EnumC2158l2.MESSAGE) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            e02.l();
            e02.e();
            if (entry instanceof AbstractC2107b1) {
                e02.zza();
                ((AbstractC2107b1) entry).a();
                throw null;
            }
            interfaceC2163m2.A(e02.zza(), entry.getValue());
        }
        ((P0) obj).zzc.k(interfaceC2163m2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.J1
    public final boolean d(Object obj) {
        return ((M0) obj).zzb.k();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.J1
    public final int e(Object obj) {
        int iHashCode = ((P0) obj).zzc.hashCode();
        return this.f22432c ? (iHashCode * 53) + ((M0) obj).zzb.f21669a.hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.J1
    public final Object f() {
        InterfaceC2186r1 interfaceC2186r1 = this.f22430a;
        return interfaceC2186r1 instanceof P0 ? ((P0) interfaceC2186r1).n() : interfaceC2186r1.g().u0();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.J1
    public final int g(Object obj) {
        int iB = ((P0) obj).zzc.b();
        return this.f22432c ? iB + ((M0) obj).zzb.b() : iB;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.J1
    public final void h(Object obj, Object obj2) {
        L1.u(this.f22431b, obj, obj2);
        if (this.f22432c) {
            L1.t(this.f22433d, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.J1
    public final boolean i(Object obj, Object obj2) {
        if (!((P0) obj).zzc.equals(((P0) obj2).zzc)) {
            return false;
        }
        if (this.f22432c) {
            return ((M0) obj).zzb.equals(((M0) obj2).zzb);
        }
        return true;
    }
}
