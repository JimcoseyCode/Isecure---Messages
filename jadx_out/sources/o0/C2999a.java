package o0;

import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.Arrays;
import o0.C3000b;

/* JADX INFO: renamed from: o0.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C2999a implements C3000b.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static float f30341l = 0.001f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3000b f30343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final c f30344c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f30342a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f30345d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private i f30346e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int[] f30347f = new int[8];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int[] f30348g = new int[8];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float[] f30349h = new float[8];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f30350i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f30351j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f30352k = false;

    C2999a(C3000b c3000b, c cVar) {
        this.f30343b = c3000b;
        this.f30344c = cVar;
    }

    @Override // o0.C3000b.a
    public final float a(i iVar, boolean z10) {
        if (this.f30346e == iVar) {
            this.f30346e = null;
        }
        int i10 = this.f30350i;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f30342a) {
            if (this.f30347f[i10] == iVar.f30404i) {
                if (i10 == this.f30350i) {
                    this.f30350i = this.f30348g[i10];
                } else {
                    int[] iArr = this.f30348g;
                    iArr[i12] = iArr[i10];
                }
                if (z10) {
                    iVar.m(this.f30343b);
                }
                iVar.f30414s--;
                this.f30342a--;
                this.f30347f[i10] = -1;
                if (this.f30352k) {
                    this.f30351j = i10;
                }
                return this.f30349h[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f30348g[i10];
        }
        return 0.0f;
    }

    @Override // o0.C3000b.a
    public int b() {
        return this.f30342a;
    }

    @Override // o0.C3000b.a
    public float c(C3000b c3000b, boolean z10) {
        float fJ = j(c3000b.f30353a);
        a(c3000b.f30353a, z10);
        C3000b.a aVar = c3000b.f30357e;
        int iB = aVar.b();
        for (int i10 = 0; i10 < iB; i10++) {
            i iVarD = aVar.d(i10);
            g(iVarD, aVar.j(iVarD) * fJ, z10);
        }
        return fJ;
    }

    @Override // o0.C3000b.a
    public final void clear() {
        int i10 = this.f30350i;
        for (int i11 = 0; i10 != -1 && i11 < this.f30342a; i11++) {
            i iVar = this.f30344c.f30362d[this.f30347f[i10]];
            if (iVar != null) {
                iVar.m(this.f30343b);
            }
            i10 = this.f30348g[i10];
        }
        this.f30350i = -1;
        this.f30351j = -1;
        this.f30352k = false;
        this.f30342a = 0;
    }

    @Override // o0.C3000b.a
    public i d(int i10) {
        int i11 = this.f30350i;
        for (int i12 = 0; i11 != -1 && i12 < this.f30342a; i12++) {
            if (i12 == i10) {
                return this.f30344c.f30362d[this.f30347f[i11]];
            }
            i11 = this.f30348g[i11];
        }
        return null;
    }

    @Override // o0.C3000b.a
    public void e() {
        int i10 = this.f30350i;
        for (int i11 = 0; i10 != -1 && i11 < this.f30342a; i11++) {
            float[] fArr = this.f30349h;
            fArr[i10] = fArr[i10] * (-1.0f);
            i10 = this.f30348g[i10];
        }
    }

    @Override // o0.C3000b.a
    public float f(int i10) {
        int i11 = this.f30350i;
        for (int i12 = 0; i11 != -1 && i12 < this.f30342a; i12++) {
            if (i12 == i10) {
                return this.f30349h[i11];
            }
            i11 = this.f30348g[i11];
        }
        return 0.0f;
    }

    @Override // o0.C3000b.a
    public void g(i iVar, float f10, boolean z10) {
        float f11 = f30341l;
        if (f10 <= (-f11) || f10 >= f11) {
            int i10 = this.f30350i;
            if (i10 == -1) {
                this.f30350i = 0;
                this.f30349h[0] = f10;
                this.f30347f[0] = iVar.f30404i;
                this.f30348g[0] = -1;
                iVar.f30414s++;
                iVar.h(this.f30343b);
                this.f30342a++;
                if (this.f30352k) {
                    return;
                }
                int i11 = this.f30351j + 1;
                this.f30351j = i11;
                int[] iArr = this.f30347f;
                if (i11 >= iArr.length) {
                    this.f30352k = true;
                    this.f30351j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i12 = -1;
            for (int i13 = 0; i10 != -1 && i13 < this.f30342a; i13++) {
                int i14 = this.f30347f[i10];
                int i15 = iVar.f30404i;
                if (i14 == i15) {
                    float[] fArr = this.f30349h;
                    float f12 = fArr[i10] + f10;
                    float f13 = f30341l;
                    if (f12 > (-f13) && f12 < f13) {
                        f12 = 0.0f;
                    }
                    fArr[i10] = f12;
                    if (f12 == 0.0f) {
                        if (i10 == this.f30350i) {
                            this.f30350i = this.f30348g[i10];
                        } else {
                            int[] iArr2 = this.f30348g;
                            iArr2[i12] = iArr2[i10];
                        }
                        if (z10) {
                            iVar.m(this.f30343b);
                        }
                        if (this.f30352k) {
                            this.f30351j = i10;
                        }
                        iVar.f30414s--;
                        this.f30342a--;
                        return;
                    }
                    return;
                }
                if (i14 < i15) {
                    i12 = i10;
                }
                i10 = this.f30348g[i10];
            }
            int length = this.f30351j;
            int i16 = length + 1;
            if (this.f30352k) {
                int[] iArr3 = this.f30347f;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i16;
            }
            int[] iArr4 = this.f30347f;
            if (length >= iArr4.length && this.f30342a < iArr4.length) {
                int i17 = 0;
                while (true) {
                    int[] iArr5 = this.f30347f;
                    if (i17 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i17] == -1) {
                        length = i17;
                        break;
                    }
                    i17++;
                }
            }
            int[] iArr6 = this.f30347f;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i18 = this.f30345d * 2;
                this.f30345d = i18;
                this.f30352k = false;
                this.f30351j = length - 1;
                this.f30349h = Arrays.copyOf(this.f30349h, i18);
                this.f30347f = Arrays.copyOf(this.f30347f, this.f30345d);
                this.f30348g = Arrays.copyOf(this.f30348g, this.f30345d);
            }
            this.f30347f[length] = iVar.f30404i;
            this.f30349h[length] = f10;
            if (i12 != -1) {
                int[] iArr7 = this.f30348g;
                iArr7[length] = iArr7[i12];
                iArr7[i12] = length;
            } else {
                this.f30348g[length] = this.f30350i;
                this.f30350i = length;
            }
            iVar.f30414s++;
            iVar.h(this.f30343b);
            this.f30342a++;
            if (!this.f30352k) {
                this.f30351j++;
            }
            int i19 = this.f30351j;
            int[] iArr8 = this.f30347f;
            if (i19 >= iArr8.length) {
                this.f30352k = true;
                this.f30351j = iArr8.length - 1;
            }
        }
    }

    @Override // o0.C3000b.a
    public final void h(i iVar, float f10) {
        if (f10 == 0.0f) {
            a(iVar, true);
            return;
        }
        int i10 = this.f30350i;
        if (i10 == -1) {
            this.f30350i = 0;
            this.f30349h[0] = f10;
            this.f30347f[0] = iVar.f30404i;
            this.f30348g[0] = -1;
            iVar.f30414s++;
            iVar.h(this.f30343b);
            this.f30342a++;
            if (this.f30352k) {
                return;
            }
            int i11 = this.f30351j + 1;
            this.f30351j = i11;
            int[] iArr = this.f30347f;
            if (i11 >= iArr.length) {
                this.f30352k = true;
                this.f30351j = iArr.length - 1;
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f30342a; i13++) {
            int i14 = this.f30347f[i10];
            int i15 = iVar.f30404i;
            if (i14 == i15) {
                this.f30349h[i10] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i10;
            }
            i10 = this.f30348g[i10];
        }
        int length = this.f30351j;
        int i16 = length + 1;
        if (this.f30352k) {
            int[] iArr2 = this.f30347f;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i16;
        }
        int[] iArr3 = this.f30347f;
        if (length >= iArr3.length && this.f30342a < iArr3.length) {
            int i17 = 0;
            while (true) {
                int[] iArr4 = this.f30347f;
                if (i17 >= iArr4.length) {
                    break;
                }
                if (iArr4[i17] == -1) {
                    length = i17;
                    break;
                }
                i17++;
            }
        }
        int[] iArr5 = this.f30347f;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i18 = this.f30345d * 2;
            this.f30345d = i18;
            this.f30352k = false;
            this.f30351j = length - 1;
            this.f30349h = Arrays.copyOf(this.f30349h, i18);
            this.f30347f = Arrays.copyOf(this.f30347f, this.f30345d);
            this.f30348g = Arrays.copyOf(this.f30348g, this.f30345d);
        }
        this.f30347f[length] = iVar.f30404i;
        this.f30349h[length] = f10;
        if (i12 != -1) {
            int[] iArr6 = this.f30348g;
            iArr6[length] = iArr6[i12];
            iArr6[i12] = length;
        } else {
            this.f30348g[length] = this.f30350i;
            this.f30350i = length;
        }
        iVar.f30414s++;
        iVar.h(this.f30343b);
        int i19 = this.f30342a + 1;
        this.f30342a = i19;
        if (!this.f30352k) {
            this.f30351j++;
        }
        int[] iArr7 = this.f30347f;
        if (i19 >= iArr7.length) {
            this.f30352k = true;
        }
        if (this.f30351j >= iArr7.length) {
            this.f30352k = true;
            this.f30351j = iArr7.length - 1;
        }
    }

    @Override // o0.C3000b.a
    public boolean i(i iVar) {
        int i10 = this.f30350i;
        if (i10 == -1) {
            return false;
        }
        for (int i11 = 0; i10 != -1 && i11 < this.f30342a; i11++) {
            if (this.f30347f[i10] == iVar.f30404i) {
                return true;
            }
            i10 = this.f30348g[i10];
        }
        return false;
    }

    @Override // o0.C3000b.a
    public final float j(i iVar) {
        int i10 = this.f30350i;
        for (int i11 = 0; i10 != -1 && i11 < this.f30342a; i11++) {
            if (this.f30347f[i10] == iVar.f30404i) {
                return this.f30349h[i10];
            }
            i10 = this.f30348g[i10];
        }
        return 0.0f;
    }

    @Override // o0.C3000b.a
    public void k(float f10) {
        int i10 = this.f30350i;
        for (int i11 = 0; i10 != -1 && i11 < this.f30342a; i11++) {
            float[] fArr = this.f30349h;
            fArr[i10] = fArr[i10] / f10;
            i10 = this.f30348g[i10];
        }
    }

    public String toString() {
        int i10 = this.f30350i;
        String str = PointerEventHelper.POINTER_TYPE_UNKNOWN;
        for (int i11 = 0; i10 != -1 && i11 < this.f30342a; i11++) {
            str = ((str + " -> ") + this.f30349h[i10] + " : ") + this.f30344c.f30362d[this.f30347f[i10]];
            i10 = this.f30348g[i10];
        }
        return str;
    }
}
