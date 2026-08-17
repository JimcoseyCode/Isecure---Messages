package o0;

import java.util.Arrays;
import o0.C3000b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class j implements C3000b.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static float f30425n = 0.001f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f30426a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f30427b = 16;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f30428c = 16;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int[] f30429d = new int[16];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int[] f30430e = new int[16];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int[] f30431f = new int[16];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float[] f30432g = new float[16];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int[] f30433h = new int[16];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int[] f30434i = new int[16];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f30435j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f30436k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final C3000b f30437l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected final c f30438m;

    j(C3000b c3000b, c cVar) {
        this.f30437l = c3000b;
        this.f30438m = cVar;
        clear();
    }

    private void l(i iVar, int i10) {
        int[] iArr;
        int i11 = iVar.f30404i % this.f30428c;
        int[] iArr2 = this.f30429d;
        int i12 = iArr2[i11];
        if (i12 == -1) {
            iArr2[i11] = i10;
        } else {
            while (true) {
                iArr = this.f30430e;
                int i13 = iArr[i12];
                if (i13 == -1) {
                    break;
                } else {
                    i12 = i13;
                }
            }
            iArr[i12] = i10;
        }
        this.f30430e[i10] = -1;
    }

    private void m(int i10, i iVar, float f10) {
        this.f30431f[i10] = iVar.f30404i;
        this.f30432g[i10] = f10;
        this.f30433h[i10] = -1;
        this.f30434i[i10] = -1;
        iVar.h(this.f30437l);
        iVar.f30414s++;
        this.f30435j++;
    }

    private int n() {
        for (int i10 = 0; i10 < this.f30427b; i10++) {
            if (this.f30431f[i10] == -1) {
                return i10;
            }
        }
        return -1;
    }

    private void o() {
        int i10 = this.f30427b * 2;
        this.f30431f = Arrays.copyOf(this.f30431f, i10);
        this.f30432g = Arrays.copyOf(this.f30432g, i10);
        this.f30433h = Arrays.copyOf(this.f30433h, i10);
        this.f30434i = Arrays.copyOf(this.f30434i, i10);
        this.f30430e = Arrays.copyOf(this.f30430e, i10);
        for (int i11 = this.f30427b; i11 < i10; i11++) {
            this.f30431f[i11] = -1;
            this.f30430e[i11] = -1;
        }
        this.f30427b = i10;
    }

    private void q(int i10, i iVar, float f10) {
        int iN = n();
        m(iN, iVar, f10);
        if (i10 != -1) {
            this.f30433h[iN] = i10;
            int[] iArr = this.f30434i;
            iArr[iN] = iArr[i10];
            iArr[i10] = iN;
        } else {
            this.f30433h[iN] = -1;
            if (this.f30435j > 0) {
                this.f30434i[iN] = this.f30436k;
                this.f30436k = iN;
            } else {
                this.f30434i[iN] = -1;
            }
        }
        int i11 = this.f30434i[iN];
        if (i11 != -1) {
            this.f30433h[i11] = iN;
        }
        l(iVar, iN);
    }

    private void r(i iVar) {
        int[] iArr;
        int i10;
        int i11 = iVar.f30404i;
        int i12 = i11 % this.f30428c;
        int[] iArr2 = this.f30429d;
        int i13 = iArr2[i12];
        if (i13 == -1) {
            return;
        }
        if (this.f30431f[i13] == i11) {
            int[] iArr3 = this.f30430e;
            iArr2[i12] = iArr3[i13];
            iArr3[i13] = -1;
            return;
        }
        while (true) {
            iArr = this.f30430e;
            i10 = iArr[i13];
            if (i10 == -1 || this.f30431f[i10] == i11) {
                break;
            } else {
                i13 = i10;
            }
        }
        if (i10 == -1 || this.f30431f[i10] != i11) {
            return;
        }
        iArr[i13] = iArr[i10];
        iArr[i10] = -1;
    }

    @Override // o0.C3000b.a
    public float a(i iVar, boolean z10) {
        int iP = p(iVar);
        if (iP == -1) {
            return 0.0f;
        }
        r(iVar);
        float f10 = this.f30432g[iP];
        if (this.f30436k == iP) {
            this.f30436k = this.f30434i[iP];
        }
        this.f30431f[iP] = -1;
        int[] iArr = this.f30433h;
        int i10 = iArr[iP];
        if (i10 != -1) {
            int[] iArr2 = this.f30434i;
            iArr2[i10] = iArr2[iP];
        }
        int i11 = this.f30434i[iP];
        if (i11 != -1) {
            iArr[i11] = iArr[iP];
        }
        this.f30435j--;
        iVar.f30414s--;
        if (z10) {
            iVar.m(this.f30437l);
        }
        return f10;
    }

    @Override // o0.C3000b.a
    public int b() {
        return this.f30435j;
    }

    @Override // o0.C3000b.a
    public float c(C3000b c3000b, boolean z10) {
        float fJ = j(c3000b.f30353a);
        a(c3000b.f30353a, z10);
        j jVar = (j) c3000b.f30357e;
        int iB = jVar.b();
        int i10 = 0;
        int i11 = 0;
        while (i10 < iB) {
            int i12 = jVar.f30431f[i11];
            if (i12 != -1) {
                g(this.f30438m.f30362d[i12], jVar.f30432g[i11] * fJ, z10);
                i10++;
            }
            i11++;
        }
        return fJ;
    }

    @Override // o0.C3000b.a
    public void clear() {
        int i10 = this.f30435j;
        for (int i11 = 0; i11 < i10; i11++) {
            i iVarD = d(i11);
            if (iVarD != null) {
                iVarD.m(this.f30437l);
            }
        }
        for (int i12 = 0; i12 < this.f30427b; i12++) {
            this.f30431f[i12] = -1;
            this.f30430e[i12] = -1;
        }
        for (int i13 = 0; i13 < this.f30428c; i13++) {
            this.f30429d[i13] = -1;
        }
        this.f30435j = 0;
        this.f30436k = -1;
    }

    @Override // o0.C3000b.a
    public i d(int i10) {
        int i11 = this.f30435j;
        if (i11 == 0) {
            return null;
        }
        int i12 = this.f30436k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10 && i12 != -1) {
                return this.f30438m.f30362d[this.f30431f[i12]];
            }
            i12 = this.f30434i[i12];
            if (i12 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // o0.C3000b.a
    public void e() {
        int i10 = this.f30435j;
        int i11 = this.f30436k;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f30432g;
            fArr[i11] = fArr[i11] * (-1.0f);
            i11 = this.f30434i[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    @Override // o0.C3000b.a
    public float f(int i10) {
        int i11 = this.f30435j;
        int i12 = this.f30436k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10) {
                return this.f30432g[i12];
            }
            i12 = this.f30434i[i12];
            if (i12 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // o0.C3000b.a
    public void g(i iVar, float f10, boolean z10) {
        float f11 = f30425n;
        if (f10 <= (-f11) || f10 >= f11) {
            int iP = p(iVar);
            if (iP == -1) {
                h(iVar, f10);
                return;
            }
            float[] fArr = this.f30432g;
            float f12 = fArr[iP] + f10;
            fArr[iP] = f12;
            float f13 = f30425n;
            if (f12 <= (-f13) || f12 >= f13) {
                return;
            }
            fArr[iP] = 0.0f;
            a(iVar, z10);
        }
    }

    @Override // o0.C3000b.a
    public void h(i iVar, float f10) {
        float f11 = f30425n;
        if (f10 > (-f11) && f10 < f11) {
            a(iVar, true);
            return;
        }
        if (this.f30435j == 0) {
            m(0, iVar, f10);
            l(iVar, 0);
            this.f30436k = 0;
            return;
        }
        int iP = p(iVar);
        if (iP != -1) {
            this.f30432g[iP] = f10;
            return;
        }
        if (this.f30435j + 1 >= this.f30427b) {
            o();
        }
        int i10 = this.f30435j;
        int i11 = this.f30436k;
        int i12 = -1;
        for (int i13 = 0; i13 < i10; i13++) {
            int i14 = this.f30431f[i11];
            int i15 = iVar.f30404i;
            if (i14 == i15) {
                this.f30432g[i11] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i11;
            }
            i11 = this.f30434i[i11];
            if (i11 == -1) {
                break;
            }
        }
        q(i12, iVar, f10);
    }

    @Override // o0.C3000b.a
    public boolean i(i iVar) {
        return p(iVar) != -1;
    }

    @Override // o0.C3000b.a
    public float j(i iVar) {
        int iP = p(iVar);
        if (iP != -1) {
            return this.f30432g[iP];
        }
        return 0.0f;
    }

    @Override // o0.C3000b.a
    public void k(float f10) {
        int i10 = this.f30435j;
        int i11 = this.f30436k;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f30432g;
            fArr[i11] = fArr[i11] / f10;
            i11 = this.f30434i[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    public int p(i iVar) {
        if (this.f30435j != 0 && iVar != null) {
            int i10 = iVar.f30404i;
            int i11 = this.f30429d[i10 % this.f30428c];
            if (i11 == -1) {
                return -1;
            }
            if (this.f30431f[i11] == i10) {
                return i11;
            }
            do {
                i11 = this.f30430e[i11];
                if (i11 == -1) {
                    break;
                }
            } while (this.f30431f[i11] != i10);
            if (i11 != -1 && this.f30431f[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    public String toString() {
        String str = hashCode() + " { ";
        int i10 = this.f30435j;
        for (int i11 = 0; i11 < i10; i11++) {
            i iVarD = d(i11);
            if (iVarD != null) {
                String str2 = str + iVarD + " = " + f(i11) + " ";
                int iP = p(iVarD);
                String str3 = str2 + "[p: ";
                String str4 = (this.f30433h[iP] != -1 ? str3 + this.f30438m.f30362d[this.f30431f[this.f30433h[iP]]] : str3 + "none") + ", n: ";
                str = (this.f30434i[iP] != -1 ? str4 + this.f30438m.f30362d[this.f30431f[this.f30434i[iP]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }
}
