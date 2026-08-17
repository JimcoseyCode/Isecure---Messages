package r0;

import java.util.ArrayList;
import java.util.Arrays;
import s0.o;

/* JADX INFO: renamed from: r0.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3247j extends C3242e implements InterfaceC3246i {

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public C3242e[] f31810J0 = new C3242e[4];

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public int f31811K0 = 0;

    @Override // r0.InterfaceC3246i
    public void b() {
        this.f31811K0 = 0;
        Arrays.fill(this.f31810J0, (Object) null);
    }

    @Override // r0.InterfaceC3246i
    public void c(C3242e c3242e) {
        if (c3242e == this || c3242e == null) {
            return;
        }
        int i10 = this.f31811K0 + 1;
        C3242e[] c3242eArr = this.f31810J0;
        if (i10 > c3242eArr.length) {
            this.f31810J0 = (C3242e[]) Arrays.copyOf(c3242eArr, c3242eArr.length * 2);
        }
        C3242e[] c3242eArr2 = this.f31810J0;
        int i11 = this.f31811K0;
        c3242eArr2[i11] = c3242e;
        this.f31811K0 = i11 + 1;
    }

    public void l1(ArrayList arrayList, int i10, o oVar) {
        for (int i11 = 0; i11 < this.f31811K0; i11++) {
            oVar.a(this.f31810J0[i11]);
        }
        for (int i12 = 0; i12 < this.f31811K0; i12++) {
            s0.i.a(this.f31810J0[i12], i10, arrayList, oVar);
        }
    }

    public int m1(int i10) {
        int i11;
        int i12;
        for (int i13 = 0; i13 < this.f31811K0; i13++) {
            C3242e c3242e = this.f31810J0[i13];
            if (i10 == 0 && (i12 = c3242e.f31649G0) != -1) {
                return i12;
            }
            if (i10 == 1 && (i11 = c3242e.f31651H0) != -1) {
                return i11;
            }
        }
        return -1;
    }

    @Override // r0.InterfaceC3246i
    public void a(C3243f c3243f) {
    }
}
