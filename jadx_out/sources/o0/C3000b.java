package o0;

import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.ArrayList;
import o0.d;
import o0.i;

/* JADX INFO: renamed from: o0.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C3000b implements d.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f30357e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    i f30353a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    float f30354b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f30355c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ArrayList f30356d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f30358f = false;

    /* JADX INFO: renamed from: o0.b$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface a {
        float a(i iVar, boolean z10);

        int b();

        float c(C3000b c3000b, boolean z10);

        void clear();

        i d(int i10);

        void e();

        float f(int i10);

        void g(i iVar, float f10, boolean z10);

        void h(i iVar, float f10);

        boolean i(i iVar);

        float j(i iVar);

        void k(float f10);
    }

    public C3000b() {
    }

    private boolean u(i iVar, d dVar) {
        return iVar.f30414s <= 1;
    }

    private i w(boolean[] zArr, i iVar) {
        i.a aVar;
        int iB = this.f30357e.b();
        i iVar2 = null;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < iB; i10++) {
            float f11 = this.f30357e.f(i10);
            if (f11 < 0.0f) {
                i iVarD = this.f30357e.d(i10);
                if ((zArr == null || !zArr[iVarD.f30404i]) && iVarD != iVar && (((aVar = iVarD.f30411p) == i.a.SLACK || aVar == i.a.ERROR) && f11 < f10)) {
                    f10 = f11;
                    iVar2 = iVarD;
                }
            }
        }
        return iVar2;
    }

    public void A(d dVar, i iVar, boolean z10) {
        if (iVar == null || !iVar.f30408m) {
            return;
        }
        this.f30354b += iVar.f30407l * this.f30357e.j(iVar);
        this.f30357e.a(iVar, z10);
        if (z10) {
            iVar.m(this);
        }
        if (d.f30365t && this.f30357e.b() == 0) {
            this.f30358f = true;
            dVar.f30371a = true;
        }
    }

    public void B(d dVar, C3000b c3000b, boolean z10) {
        this.f30354b += c3000b.f30354b * this.f30357e.c(c3000b, z10);
        if (z10) {
            c3000b.f30353a.m(this);
        }
        if (d.f30365t && this.f30353a != null && this.f30357e.b() == 0) {
            this.f30358f = true;
            dVar.f30371a = true;
        }
    }

    public void C(d dVar, i iVar, boolean z10) {
        if (iVar == null || !iVar.f30415t) {
            return;
        }
        float fJ = this.f30357e.j(iVar);
        this.f30354b += iVar.f30417v * fJ;
        this.f30357e.a(iVar, z10);
        if (z10) {
            iVar.m(this);
        }
        this.f30357e.g(dVar.f30384n.f30362d[iVar.f30416u], fJ, z10);
        if (d.f30365t && this.f30357e.b() == 0) {
            this.f30358f = true;
            dVar.f30371a = true;
        }
    }

    public void D(d dVar) {
        if (dVar.f30377g.length == 0) {
            return;
        }
        boolean z10 = false;
        while (!z10) {
            int iB = this.f30357e.b();
            for (int i10 = 0; i10 < iB; i10++) {
                i iVarD = this.f30357e.d(i10);
                if (iVarD.f30405j != -1 || iVarD.f30408m || iVarD.f30415t) {
                    this.f30356d.add(iVarD);
                }
            }
            int size = this.f30356d.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    i iVar = (i) this.f30356d.get(i11);
                    if (iVar.f30408m) {
                        A(dVar, iVar, true);
                    } else if (iVar.f30415t) {
                        C(dVar, iVar, true);
                    } else {
                        B(dVar, dVar.f30377g[iVar.f30405j], true);
                    }
                }
                this.f30356d.clear();
            } else {
                z10 = true;
            }
        }
        if (d.f30365t && this.f30353a != null && this.f30357e.b() == 0) {
            this.f30358f = true;
            dVar.f30371a = true;
        }
    }

    @Override // o0.d.a
    public void a(i iVar) {
        int i10 = iVar.f30406k;
        float f10 = 1.0f;
        if (i10 != 1) {
            if (i10 == 2) {
                f10 = 1000.0f;
            } else if (i10 == 3) {
                f10 = 1000000.0f;
            } else if (i10 == 4) {
                f10 = 1.0E9f;
            } else if (i10 == 5) {
                f10 = 1.0E12f;
            }
        }
        this.f30357e.h(iVar, f10);
    }

    @Override // o0.d.a
    public i b(d dVar, boolean[] zArr) {
        return w(zArr, null);
    }

    @Override // o0.d.a
    public void c(d.a aVar) {
        if (aVar instanceof C3000b) {
            C3000b c3000b = (C3000b) aVar;
            this.f30353a = null;
            this.f30357e.clear();
            for (int i10 = 0; i10 < c3000b.f30357e.b(); i10++) {
                this.f30357e.g(c3000b.f30357e.d(i10), c3000b.f30357e.f(i10), true);
            }
        }
    }

    @Override // o0.d.a
    public void clear() {
        this.f30357e.clear();
        this.f30353a = null;
        this.f30354b = 0.0f;
    }

    public C3000b d(d dVar, int i10) {
        this.f30357e.h(dVar.o(i10, "ep"), 1.0f);
        this.f30357e.h(dVar.o(i10, "em"), -1.0f);
        return this;
    }

    C3000b e(i iVar, int i10) {
        this.f30357e.h(iVar, i10);
        return this;
    }

    boolean f(d dVar) {
        boolean z10;
        i iVarG = g(dVar);
        if (iVarG == null) {
            z10 = true;
        } else {
            x(iVarG);
            z10 = false;
        }
        if (this.f30357e.b() == 0) {
            this.f30358f = true;
        }
        return z10;
    }

    i g(d dVar) {
        int iB = this.f30357e.b();
        i iVar = null;
        float f10 = 0.0f;
        float f11 = 0.0f;
        boolean z10 = false;
        boolean z11 = false;
        i iVar2 = null;
        for (int i10 = 0; i10 < iB; i10++) {
            float f12 = this.f30357e.f(i10);
            i iVarD = this.f30357e.d(i10);
            if (iVarD.f30411p == i.a.UNRESTRICTED) {
                if (iVar == null || f10 > f12) {
                    boolean zU = u(iVarD, dVar);
                    z10 = zU;
                    f10 = f12;
                    iVar = iVarD;
                } else if (!z10 && u(iVarD, dVar)) {
                    f10 = f12;
                    iVar = iVarD;
                    z10 = true;
                }
            } else if (iVar == null && f12 < 0.0f) {
                if (iVar2 == null || f11 > f12) {
                    boolean zU2 = u(iVarD, dVar);
                    z11 = zU2;
                    f11 = f12;
                    iVar2 = iVarD;
                } else if (!z11 && u(iVarD, dVar)) {
                    f11 = f12;
                    iVar2 = iVarD;
                    z11 = true;
                }
            }
        }
        return iVar != null ? iVar : iVar2;
    }

    @Override // o0.d.a
    public i getKey() {
        return this.f30353a;
    }

    C3000b h(i iVar, i iVar2, int i10, float f10, i iVar3, i iVar4, int i11) {
        if (iVar2 == iVar3) {
            this.f30357e.h(iVar, 1.0f);
            this.f30357e.h(iVar4, 1.0f);
            this.f30357e.h(iVar2, -2.0f);
            return this;
        }
        if (f10 == 0.5f) {
            this.f30357e.h(iVar, 1.0f);
            this.f30357e.h(iVar2, -1.0f);
            this.f30357e.h(iVar3, -1.0f);
            this.f30357e.h(iVar4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                this.f30354b = (-i10) + i11;
                return this;
            }
        } else {
            if (f10 <= 0.0f) {
                this.f30357e.h(iVar, -1.0f);
                this.f30357e.h(iVar2, 1.0f);
                this.f30354b = i10;
                return this;
            }
            if (f10 >= 1.0f) {
                this.f30357e.h(iVar4, -1.0f);
                this.f30357e.h(iVar3, 1.0f);
                this.f30354b = -i11;
                return this;
            }
            float f11 = 1.0f - f10;
            this.f30357e.h(iVar, f11 * 1.0f);
            this.f30357e.h(iVar2, f11 * (-1.0f));
            this.f30357e.h(iVar3, (-1.0f) * f10);
            this.f30357e.h(iVar4, 1.0f * f10);
            if (i10 > 0 || i11 > 0) {
                this.f30354b = ((-i10) * f11) + (i11 * f10);
                return this;
            }
        }
        return this;
    }

    C3000b i(i iVar, int i10) {
        this.f30353a = iVar;
        float f10 = i10;
        iVar.f30407l = f10;
        this.f30354b = f10;
        this.f30358f = true;
        return this;
    }

    @Override // o0.d.a
    public boolean isEmpty() {
        return this.f30353a == null && this.f30354b == 0.0f && this.f30357e.b() == 0;
    }

    C3000b j(i iVar, i iVar2, float f10) {
        this.f30357e.h(iVar, -1.0f);
        this.f30357e.h(iVar2, f10);
        return this;
    }

    public C3000b k(i iVar, i iVar2, i iVar3, i iVar4, float f10) {
        this.f30357e.h(iVar, -1.0f);
        this.f30357e.h(iVar2, 1.0f);
        this.f30357e.h(iVar3, f10);
        this.f30357e.h(iVar4, -f10);
        return this;
    }

    public C3000b l(float f10, float f11, float f12, i iVar, i iVar2, i iVar3, i iVar4) {
        this.f30354b = 0.0f;
        if (f11 == 0.0f || f10 == f12) {
            this.f30357e.h(iVar, 1.0f);
            this.f30357e.h(iVar2, -1.0f);
            this.f30357e.h(iVar4, 1.0f);
            this.f30357e.h(iVar3, -1.0f);
            return this;
        }
        if (f10 == 0.0f) {
            this.f30357e.h(iVar, 1.0f);
            this.f30357e.h(iVar2, -1.0f);
            return this;
        }
        if (f12 == 0.0f) {
            this.f30357e.h(iVar3, 1.0f);
            this.f30357e.h(iVar4, -1.0f);
            return this;
        }
        float f13 = (f10 / f11) / (f12 / f11);
        this.f30357e.h(iVar, 1.0f);
        this.f30357e.h(iVar2, -1.0f);
        this.f30357e.h(iVar4, f13);
        this.f30357e.h(iVar3, -f13);
        return this;
    }

    public C3000b m(i iVar, int i10) {
        if (i10 < 0) {
            this.f30354b = i10 * (-1);
            this.f30357e.h(iVar, 1.0f);
            return this;
        }
        this.f30354b = i10;
        this.f30357e.h(iVar, -1.0f);
        return this;
    }

    public C3000b n(i iVar, i iVar2, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f30354b = i10;
        }
        if (z10) {
            this.f30357e.h(iVar, 1.0f);
            this.f30357e.h(iVar2, -1.0f);
            return this;
        }
        this.f30357e.h(iVar, -1.0f);
        this.f30357e.h(iVar2, 1.0f);
        return this;
    }

    public C3000b o(i iVar, i iVar2, i iVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f30354b = i10;
        }
        if (z10) {
            this.f30357e.h(iVar, 1.0f);
            this.f30357e.h(iVar2, -1.0f);
            this.f30357e.h(iVar3, -1.0f);
            return this;
        }
        this.f30357e.h(iVar, -1.0f);
        this.f30357e.h(iVar2, 1.0f);
        this.f30357e.h(iVar3, 1.0f);
        return this;
    }

    public C3000b p(i iVar, i iVar2, i iVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f30354b = i10;
        }
        if (z10) {
            this.f30357e.h(iVar, 1.0f);
            this.f30357e.h(iVar2, -1.0f);
            this.f30357e.h(iVar3, 1.0f);
            return this;
        }
        this.f30357e.h(iVar, -1.0f);
        this.f30357e.h(iVar2, 1.0f);
        this.f30357e.h(iVar3, -1.0f);
        return this;
    }

    public C3000b q(i iVar, i iVar2, i iVar3, i iVar4, float f10) {
        this.f30357e.h(iVar3, 0.5f);
        this.f30357e.h(iVar4, 0.5f);
        this.f30357e.h(iVar, -0.5f);
        this.f30357e.h(iVar2, -0.5f);
        this.f30354b = -f10;
        return this;
    }

    void r() {
        float f10 = this.f30354b;
        if (f10 < 0.0f) {
            this.f30354b = f10 * (-1.0f);
            this.f30357e.e();
        }
    }

    boolean s() {
        i iVar = this.f30353a;
        if (iVar != null) {
            return iVar.f30411p == i.a.UNRESTRICTED || this.f30354b >= 0.0f;
        }
        return false;
    }

    boolean t(i iVar) {
        return this.f30357e.i(iVar);
    }

    public String toString() {
        return z();
    }

    public i v(i iVar) {
        return w(null, iVar);
    }

    void x(i iVar) {
        i iVar2 = this.f30353a;
        if (iVar2 != null) {
            this.f30357e.h(iVar2, -1.0f);
            this.f30353a.f30405j = -1;
            this.f30353a = null;
        }
        float fA = this.f30357e.a(iVar, true) * (-1.0f);
        this.f30353a = iVar;
        if (fA == 1.0f) {
            return;
        }
        this.f30354b /= fA;
        this.f30357e.k(fA);
    }

    public void y() {
        this.f30353a = null;
        this.f30357e.clear();
        this.f30354b = 0.0f;
        this.f30358f = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    String z() {
        boolean z10;
        String str = (this.f30353a == null ? PointerEventHelper.POINTER_TYPE_UNKNOWN + "0" : PointerEventHelper.POINTER_TYPE_UNKNOWN + this.f30353a) + " = ";
        if (this.f30354b != 0.0f) {
            str = str + this.f30354b;
            z10 = true;
        } else {
            z10 = false;
        }
        int iB = this.f30357e.b();
        for (int i10 = 0; i10 < iB; i10++) {
            i iVarD = this.f30357e.d(i10);
            if (iVarD != null) {
                float f10 = this.f30357e.f(i10);
                if (f10 != 0.0f) {
                    String string = iVarD.toString();
                    if (!z10) {
                        if (f10 < 0.0f) {
                            str = str + "- ";
                            f10 *= -1.0f;
                        }
                        str = f10 == 1.0f ? str + string : str + f10 + " " + string;
                        z10 = true;
                    } else if (f10 > 0.0f) {
                        str = str + " + ";
                        if (f10 == 1.0f) {
                        }
                        z10 = true;
                    } else {
                        str = str + " - ";
                        f10 *= -1.0f;
                        if (f10 == 1.0f) {
                        }
                        z10 = true;
                    }
                }
            }
        }
        if (z10) {
            return str;
        }
        return str + "0.0";
    }

    public C3000b(c cVar) {
        this.f30357e = new C2999a(this, cVar);
    }
}
