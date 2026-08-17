package s1;

import android.graphics.Bitmap;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import s1.InterfaceC3316a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class e implements InterfaceC3316a {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f32211u = "e";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f32212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f32213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3316a.InterfaceC0355a f32214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ByteBuffer f32215d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte[] f32216e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private short[] f32217f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte[] f32218g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private byte[] f32219h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private byte[] f32220i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int[] f32221j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f32222k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private c f32223l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Bitmap f32224m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f32225n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f32226o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f32227p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f32228q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f32229r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Boolean f32230s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Bitmap.Config f32231t;

    public e(InterfaceC3316a.InterfaceC0355a interfaceC0355a, c cVar, ByteBuffer byteBuffer, int i10) {
        this(interfaceC0355a);
        r(cVar, byteBuffer, i10);
    }

    private int j(int i10, int i11, int i12) {
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = i10; i18 < this.f32227p + i10; i18++) {
            byte[] bArr = this.f32220i;
            if (i18 >= bArr.length || i18 >= i11) {
                break;
            }
            int i19 = this.f32212a[bArr[i18] & 255];
            if (i19 != 0) {
                i13 += (i19 >> 24) & 255;
                i14 += (i19 >> 16) & 255;
                i15 += (i19 >> 8) & 255;
                i16 += i19 & 255;
                i17++;
            }
        }
        int i20 = i10 + i12;
        for (int i21 = i20; i21 < this.f32227p + i20; i21++) {
            byte[] bArr2 = this.f32220i;
            if (i21 >= bArr2.length || i21 >= i11) {
                break;
            }
            int i22 = this.f32212a[bArr2[i21] & 255];
            if (i22 != 0) {
                i13 += (i22 >> 24) & 255;
                i14 += (i22 >> 16) & 255;
                i15 += (i22 >> 8) & 255;
                i16 += i22 & 255;
                i17++;
            }
        }
        if (i17 == 0) {
            return 0;
        }
        return ((i13 / i17) << 24) | ((i14 / i17) << 16) | ((i15 / i17) << 8) | (i16 / i17);
    }

    private void k(b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int[] iArr = this.f32221j;
        int i14 = bVar.f32186d;
        int i15 = this.f32227p;
        int i16 = i14 / i15;
        int i17 = bVar.f32184b / i15;
        int i18 = bVar.f32185c / i15;
        int i19 = bVar.f32183a / i15;
        boolean z10 = this.f32222k == 0;
        int i20 = this.f32229r;
        int i21 = this.f32228q;
        byte[] bArr = this.f32220i;
        int[] iArr2 = this.f32212a;
        Boolean bool = this.f32230s;
        int i22 = 8;
        int i23 = 0;
        int i24 = 0;
        int i25 = 1;
        while (i24 < i16) {
            int[] iArr3 = iArr;
            if (bVar.f32187e) {
                if (i23 >= i16) {
                    int i26 = i25 + 1;
                    i10 = i16;
                    if (i26 == 2) {
                        i25 = i26;
                        i23 = 4;
                    } else if (i26 == 3) {
                        i25 = i26;
                        i22 = 4;
                        i23 = 2;
                    } else if (i26 != 4) {
                        i25 = i26;
                    } else {
                        i25 = i26;
                        i23 = 1;
                        i22 = 2;
                    }
                } else {
                    i10 = i16;
                }
                i11 = i23 + i22;
            } else {
                i10 = i16;
                i11 = i23;
                i23 = i24;
            }
            int i27 = i23 + i17;
            boolean z11 = i15 == 1;
            if (i27 < i21) {
                int i28 = i27 * i20;
                int i29 = i28 + i19;
                int i30 = i29 + i18;
                int i31 = i28 + i20;
                if (i31 < i30) {
                    i30 = i31;
                }
                i12 = i11;
                int i32 = i24 * i15 * bVar.f32185c;
                if (z11) {
                    int i33 = i29;
                    while (i33 < i30) {
                        int i34 = i33;
                        int i35 = iArr2[bArr[i32] & 255];
                        if (i35 != 0) {
                            iArr3[i34] = i35;
                        } else if (z10 && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i32 += i15;
                        i33 = i34 + 1;
                    }
                } else {
                    int i36 = ((i30 - i29) * i15) + i32;
                    i13 = i15;
                    int i37 = i29;
                    while (i37 < i30) {
                        int i38 = i30;
                        int iJ = j(i32, i36, bVar.f32185c);
                        if (iJ != 0) {
                            iArr3[i37] = iJ;
                        } else if (z10 && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i32 += i13;
                        i37++;
                        i30 = i38;
                    }
                    i24++;
                    i15 = i13;
                    iArr = iArr3;
                    i16 = i10;
                    i23 = i12;
                }
            } else {
                i12 = i11;
            }
            i13 = i15;
            i24++;
            i15 = i13;
            iArr = iArr3;
            i16 = i10;
            i23 = i12;
        }
        if (this.f32230s == null) {
            this.f32230s = Boolean.valueOf(bool == null ? false : bool.booleanValue());
        }
    }

    private void l(b bVar) {
        b bVar2 = bVar;
        int[] iArr = this.f32221j;
        int i10 = bVar2.f32186d;
        int i11 = bVar2.f32184b;
        int i12 = bVar2.f32185c;
        int i13 = bVar2.f32183a;
        boolean z10 = this.f32222k == 0;
        int i14 = this.f32229r;
        byte[] bArr = this.f32220i;
        int[] iArr2 = this.f32212a;
        int i15 = 0;
        byte b10 = -1;
        while (i15 < i10) {
            int i16 = (i15 + i11) * i14;
            int i17 = i16 + i13;
            int i18 = i17 + i12;
            int i19 = i16 + i14;
            if (i19 < i18) {
                i18 = i19;
            }
            int i20 = bVar2.f32185c * i15;
            int i21 = i17;
            while (i21 < i18) {
                byte b11 = bArr[i20];
                int[] iArr3 = iArr;
                int i22 = b11 & 255;
                if (i22 != b10) {
                    int i23 = iArr2[i22];
                    if (i23 != 0) {
                        iArr3[i21] = i23;
                    } else {
                        b10 = b11;
                    }
                }
                i20++;
                i21++;
                iArr = iArr3;
            }
            i15++;
            bVar2 = bVar;
        }
        Boolean bool = this.f32230s;
        this.f32230s = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.f32230s == null && z10 && b10 != -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v15, types: [short] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    private void m(b bVar) {
        int i10;
        int i11;
        byte[] bArr;
        short s10;
        e eVar = this;
        if (bVar != null) {
            eVar.f32215d.position(bVar.f32192j);
        }
        if (bVar == null) {
            c cVar = eVar.f32223l;
            i10 = cVar.f32199f;
            i11 = cVar.f32200g;
        } else {
            i10 = bVar.f32185c;
            i11 = bVar.f32186d;
        }
        int i12 = i10 * i11;
        byte[] bArr2 = eVar.f32220i;
        if (bArr2 == null || bArr2.length < i12) {
            eVar.f32220i = eVar.f32214c.e(i12);
        }
        byte[] bArr3 = eVar.f32220i;
        if (eVar.f32217f == null) {
            eVar.f32217f = new short[4096];
        }
        short[] sArr = eVar.f32217f;
        if (eVar.f32218g == null) {
            eVar.f32218g = new byte[4096];
        }
        byte[] bArr4 = eVar.f32218g;
        if (eVar.f32219h == null) {
            eVar.f32219h = new byte[4097];
        }
        byte[] bArr5 = eVar.f32219h;
        int iQ = eVar.q();
        int i13 = 1 << iQ;
        int i14 = i13 + 1;
        int i15 = i13 + 2;
        int i16 = iQ + 1;
        int i17 = (1 << i16) - 1;
        byte b10 = 0;
        for (int i18 = 0; i18 < i13; i18++) {
            sArr[i18] = 0;
            bArr4[i18] = (byte) i18;
        }
        byte[] bArr6 = eVar.f32216e;
        int i19 = i16;
        int i20 = i15;
        int i21 = i17;
        int i22 = 0;
        int iP = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = -1;
        while (true) {
            if (i22 >= i12) {
                break;
            }
            if (iP == 0) {
                iP = eVar.p();
                if (iP <= 0) {
                    eVar.f32226o = 3;
                    break;
                }
                i23 = b10;
            }
            i25 += (bArr6[i23] & 255) << i24;
            i23++;
            iP--;
            int i30 = i24 + 8;
            int i31 = i20;
            int i32 = i19;
            int i33 = i29;
            short[] sArr2 = sArr;
            int i34 = i27;
            while (true) {
                bArr = bArr4;
                if (i30 < i32) {
                    i20 = i31;
                    i27 = i34;
                    break;
                }
                int i35 = i25 & i21;
                i25 >>= i32;
                i30 -= i32;
                if (i35 == i13) {
                    i32 = i16;
                    i31 = i15;
                    i21 = i17;
                    bArr4 = bArr;
                    i33 = -1;
                } else {
                    if (i35 == i14) {
                        i27 = i34;
                        i20 = i31;
                        break;
                    }
                    byte[] bArr7 = bArr5;
                    if (i33 == -1) {
                        bArr3[i26] = bArr[i35];
                        i26++;
                        i22++;
                        i33 = i35;
                        i34 = i33;
                        bArr4 = bArr;
                        bArr5 = bArr7;
                    } else {
                        if (i35 >= i31) {
                            bArr7[i28] = (byte) i34;
                            i28++;
                            s10 = i33;
                        } else {
                            s10 = i35;
                        }
                        while (s10 >= i13) {
                            bArr7[i28] = bArr[s10];
                            i28++;
                            s10 = sArr2[s10];
                        }
                        int i36 = bArr[s10] & 255;
                        byte b11 = (byte) i36;
                        bArr3[i26] = b11;
                        while (true) {
                            i26++;
                            i22++;
                            if (i28 <= 0) {
                                break;
                            }
                            i28--;
                            bArr3[i26] = bArr7[i28];
                        }
                        if (i31 < 4096) {
                            sArr2[i31] = (short) i33;
                            bArr[i31] = b11;
                            i31++;
                            if ((i31 & i21) == 0 && i31 < 4096) {
                                i32++;
                                i21 += i31;
                            }
                        }
                        i33 = i35;
                        bArr4 = bArr;
                        bArr5 = bArr7;
                        i34 = i36;
                    }
                }
            }
            i24 = i30;
            sArr = sArr2;
            bArr4 = bArr;
            b10 = 0;
            i29 = i33;
            i19 = i32;
            eVar = this;
        }
        Arrays.fill(bArr3, i26, i12, b10);
    }

    private Bitmap o() {
        Boolean bool = this.f32230s;
        Bitmap bitmapA = this.f32214c.a(this.f32229r, this.f32228q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f32231t);
        bitmapA.setHasAlpha(true);
        return bitmapA;
    }

    private int p() {
        int iQ = q();
        if (iQ <= 0) {
            return iQ;
        }
        ByteBuffer byteBuffer = this.f32215d;
        byteBuffer.get(this.f32216e, 0, Math.min(iQ, byteBuffer.remaining()));
        return iQ;
    }

    private int q() {
        return this.f32215d.get() & 255;
    }

    private Bitmap s(b bVar, b bVar2) {
        int i10;
        int i11;
        Bitmap bitmap;
        int[] iArr = this.f32221j;
        int i12 = 0;
        if (bVar2 == null) {
            Bitmap bitmap2 = this.f32224m;
            if (bitmap2 != null) {
                this.f32214c.c(bitmap2);
            }
            this.f32224m = null;
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && bVar2.f32189g == 3 && this.f32224m == null) {
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && (i11 = bVar2.f32189g) > 0) {
            if (i11 == 2) {
                if (!bVar.f32188f) {
                    c cVar = this.f32223l;
                    int i13 = cVar.f32205l;
                    if (bVar.f32193k == null || cVar.f32203j != bVar.f32190h) {
                        i12 = i13;
                    }
                }
                int i14 = bVar2.f32186d;
                int i15 = this.f32227p;
                int i16 = i14 / i15;
                int i17 = bVar2.f32184b / i15;
                int i18 = bVar2.f32185c / i15;
                int i19 = bVar2.f32183a / i15;
                int i20 = this.f32229r;
                int i21 = (i17 * i20) + i19;
                int i22 = (i16 * i20) + i21;
                while (i21 < i22) {
                    int i23 = i21 + i18;
                    for (int i24 = i21; i24 < i23; i24++) {
                        iArr[i24] = i12;
                    }
                    i21 += this.f32229r;
                }
            } else if (i11 == 3 && (bitmap = this.f32224m) != null) {
                int i25 = this.f32229r;
                bitmap.getPixels(iArr, 0, i25, 0, 0, i25, this.f32228q);
            }
        }
        m(bVar);
        if (bVar.f32187e || this.f32227p != 1) {
            k(bVar);
        } else {
            l(bVar);
        }
        if (this.f32225n && ((i10 = bVar.f32189g) == 0 || i10 == 1)) {
            if (this.f32224m == null) {
                this.f32224m = o();
            }
            Bitmap bitmap3 = this.f32224m;
            int i26 = this.f32229r;
            bitmap3.setPixels(iArr, 0, i26, 0, 0, i26, this.f32228q);
        }
        Bitmap bitmapO = o();
        int i27 = this.f32229r;
        bitmapO.setPixels(iArr, 0, i27, 0, 0, i27, this.f32228q);
        return bitmapO;
    }

    @Override // s1.InterfaceC3316a
    public int a() {
        return this.f32223l.f32196c;
    }

    @Override // s1.InterfaceC3316a
    public ByteBuffer b() {
        return this.f32215d;
    }

    @Override // s1.InterfaceC3316a
    public synchronized Bitmap c() {
        try {
            if (this.f32223l.f32196c <= 0 || this.f32222k < 0) {
                if (Log.isLoggable(f32211u, 3)) {
                    int i10 = this.f32223l.f32196c;
                }
                this.f32226o = 1;
            }
            int i11 = this.f32226o;
            if (i11 != 1 && i11 != 2) {
                this.f32226o = 0;
                if (this.f32216e == null) {
                    this.f32216e = this.f32214c.e(255);
                }
                b bVar = (b) this.f32223l.f32198e.get(this.f32222k);
                int i12 = this.f32222k - 1;
                b bVar2 = i12 >= 0 ? (b) this.f32223l.f32198e.get(i12) : null;
                int[] iArr = bVar.f32193k;
                if (iArr == null) {
                    iArr = this.f32223l.f32194a;
                }
                this.f32212a = iArr;
                if (iArr == null) {
                    this.f32226o = 1;
                    return null;
                }
                if (bVar.f32188f) {
                    System.arraycopy(iArr, 0, this.f32213b, 0, iArr.length);
                    int[] iArr2 = this.f32213b;
                    this.f32212a = iArr2;
                    iArr2[bVar.f32190h] = 0;
                    if (bVar.f32189g == 2 && this.f32222k == 0) {
                        this.f32230s = Boolean.TRUE;
                    }
                }
                return s(bVar, bVar2);
            }
            return null;
        } finally {
        }
    }

    @Override // s1.InterfaceC3316a
    public void clear() {
        this.f32223l = null;
        byte[] bArr = this.f32220i;
        if (bArr != null) {
            this.f32214c.d(bArr);
        }
        int[] iArr = this.f32221j;
        if (iArr != null) {
            this.f32214c.f(iArr);
        }
        Bitmap bitmap = this.f32224m;
        if (bitmap != null) {
            this.f32214c.c(bitmap);
        }
        this.f32224m = null;
        this.f32215d = null;
        this.f32230s = null;
        byte[] bArr2 = this.f32216e;
        if (bArr2 != null) {
            this.f32214c.d(bArr2);
        }
    }

    @Override // s1.InterfaceC3316a
    public void d() {
        this.f32222k = (this.f32222k + 1) % this.f32223l.f32196c;
    }

    @Override // s1.InterfaceC3316a
    public int e() {
        int i10;
        if (this.f32223l.f32196c <= 0 || (i10 = this.f32222k) < 0) {
            return 0;
        }
        return n(i10);
    }

    @Override // s1.InterfaceC3316a
    public void f(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f32231t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    @Override // s1.InterfaceC3316a
    public void g() {
        this.f32222k = -1;
    }

    @Override // s1.InterfaceC3316a
    public int h() {
        return this.f32222k;
    }

    @Override // s1.InterfaceC3316a
    public int i() {
        return this.f32215d.limit() + this.f32220i.length + (this.f32221j.length * 4);
    }

    public int n(int i10) {
        if (i10 < 0) {
            return -1;
        }
        c cVar = this.f32223l;
        if (i10 < cVar.f32196c) {
            return ((b) cVar.f32198e.get(i10)).f32191i;
        }
        return -1;
    }

    public synchronized void r(c cVar, ByteBuffer byteBuffer, int i10) {
        try {
            if (i10 <= 0) {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i10);
            }
            int iHighestOneBit = Integer.highestOneBit(i10);
            this.f32226o = 0;
            this.f32223l = cVar;
            this.f32222k = -1;
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f32215d = byteBufferAsReadOnlyBuffer;
            byteBufferAsReadOnlyBuffer.position(0);
            this.f32215d.order(ByteOrder.LITTLE_ENDIAN);
            this.f32225n = false;
            Iterator it = cVar.f32198e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((b) it.next()).f32189g == 3) {
                    this.f32225n = true;
                    break;
                }
            }
            this.f32227p = iHighestOneBit;
            int i11 = cVar.f32199f;
            this.f32229r = i11 / iHighestOneBit;
            int i12 = cVar.f32200g;
            this.f32228q = i12 / iHighestOneBit;
            this.f32220i = this.f32214c.e(i11 * i12);
            this.f32221j = this.f32214c.b(this.f32229r * this.f32228q);
        } catch (Throwable th) {
            throw th;
        }
    }

    public e(InterfaceC3316a.InterfaceC0355a interfaceC0355a) {
        this.f32213b = new int[256];
        this.f32231t = Bitmap.Config.ARGB_8888;
        this.f32214c = interfaceC0355a;
        this.f32223l = new c();
    }
}
