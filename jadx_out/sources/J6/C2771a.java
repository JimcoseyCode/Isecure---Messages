package j6;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.internal.mlkit_code_scanner.zzon;
import com.google.android.gms.internal.mlkit_code_scanner.zzoo;
import com.google.android.gms.internal.mlkit_code_scanner.zzop;
import com.google.android.gms.internal.mlkit_code_scanner.zzoq;
import com.google.android.gms.internal.mlkit_code_scanner.zzor;
import com.google.android.gms.internal.mlkit_code_scanner.zzos;
import com.google.android.gms.internal.mlkit_code_scanner.zzot;
import com.google.android.gms.internal.mlkit_code_scanner.zzou;
import com.google.android.gms.internal.mlkit_code_scanner.zzov;
import com.google.android.gms.internal.mlkit_code_scanner.zzow;
import com.google.android.gms.internal.mlkit_code_scanner.zzox;
import com.google.android.gms.internal.mlkit_code_scanner.zzoy;
import com.google.android.gms.internal.mlkit_code_scanner.zzoz;
import f6.C2615a;
import g6.InterfaceC2680a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import r4.AbstractC3268i;

/* JADX INFO: renamed from: j6.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class C2771a implements InterfaceC2680a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zzoz f28878a;

    public C2771a(zzoz zzozVar) {
        this.f28878a = zzozVar;
    }

    private static C2615a.b o(zzoo zzooVar) {
        if (zzooVar == null) {
            return null;
        }
        return new C2615a.b(zzooVar.t0(), zzooVar.k0(), zzooVar.e(), zzooVar.s(), zzooVar.X(), zzooVar.l0(), zzooVar.A0(), zzooVar.u0());
    }

    @Override // g6.InterfaceC2680a
    public final C2615a.i a() {
        zzov zzovVarA0 = this.f28878a.A0();
        if (zzovVarA0 != null) {
            return new C2615a.i(zzovVarA0.s(), zzovVarA0.e());
        }
        return null;
    }

    @Override // g6.InterfaceC2680a
    public final C2615a.e b() {
        zzor zzorVarL0 = this.f28878a.l0();
        if (zzorVarL0 != null) {
            return new C2615a.e(zzorVarL0.t0(), zzorVarL0.A0(), zzorVarL0.N0(), zzorVarL0.L0(), zzorVarL0.D0(), zzorVarL0.X(), zzorVarL0.e(), zzorVarL0.s(), zzorVarL0.k0(), zzorVarL0.M0(), zzorVarL0.J0(), zzorVarL0.u0(), zzorVarL0.l0(), zzorVarL0.K0());
        }
        return null;
    }

    @Override // g6.InterfaceC2680a
    public final Rect c() {
        return null;
    }

    @Override // g6.InterfaceC2680a
    public final String d() {
        return this.f28878a.M0();
    }

    @Override // g6.InterfaceC2680a
    public final C2615a.c e() {
        zzop zzopVarX = this.f28878a.X();
        if (zzopVarX != null) {
            return new C2615a.c(zzopVarX.u0(), zzopVarX.X(), zzopVarX.k0(), zzopVarX.l0(), zzopVarX.t0(), o(zzopVarX.s()), o(zzopVarX.e()));
        }
        return null;
    }

    @Override // g6.InterfaceC2680a
    public final int f() {
        return this.f28878a.s();
    }

    @Override // g6.InterfaceC2680a
    public final C2615a.j g() {
        zzow zzowVarD0 = this.f28878a.D0();
        if (zzowVarD0 != null) {
            return new C2615a.j(zzowVarD0.e(), zzowVarD0.s());
        }
        return null;
    }

    @Override // g6.InterfaceC2680a
    public final int getFormat() {
        return this.f28878a.e();
    }

    @Override // g6.InterfaceC2680a
    public final C2615a.k getUrl() {
        zzox zzoxVarJ0 = this.f28878a.J0();
        if (zzoxVarJ0 != null) {
            return new C2615a.k(zzoxVarJ0.e(), zzoxVarJ0.s());
        }
        return null;
    }

    @Override // g6.InterfaceC2680a
    public final C2615a.d h() {
        zzoq zzoqVarK0 = this.f28878a.k0();
        if (zzoqVarK0 == null) {
            return null;
        }
        zzou zzouVarE = zzoqVarK0.e();
        C2615a.h hVar = zzouVarE == null ? null : new C2615a.h(zzouVarE.s(), zzouVarE.t0(), zzouVarE.l0(), zzouVarE.e(), zzouVarE.k0(), zzouVarE.X(), zzouVarE.u0());
        String strS = zzoqVarK0.s();
        String strX = zzoqVarK0.X();
        zzov[] zzovVarArrT0 = zzoqVarK0.t0();
        ArrayList arrayList = new ArrayList();
        if (zzovVarArrT0 != null) {
            for (zzov zzovVar : zzovVarArrT0) {
                if (zzovVar != null) {
                    arrayList.add(new C2615a.i(zzovVar.s(), zzovVar.e()));
                }
            }
        }
        zzos[] zzosVarArrL0 = zzoqVarK0.l0();
        ArrayList arrayList2 = new ArrayList();
        if (zzosVarArrL0 != null) {
            for (zzos zzosVar : zzosVarArrL0) {
                if (zzosVar != null) {
                    arrayList2.add(new C2615a.f(zzosVar.e(), zzosVar.s(), zzosVar.k0(), zzosVar.X()));
                }
            }
        }
        List listAsList = zzoqVarK0.u0() != null ? Arrays.asList((String[]) AbstractC3268i.k(zzoqVarK0.u0())) : new ArrayList();
        zzon[] zzonVarArrK0 = zzoqVarK0.k0();
        ArrayList arrayList3 = new ArrayList();
        if (zzonVarArrK0 != null) {
            for (zzon zzonVar : zzonVarArrK0) {
                if (zzonVar != null) {
                    arrayList3.add(new C2615a.C0272a(zzonVar.e(), zzonVar.s()));
                }
            }
        }
        return new C2615a.d(hVar, strS, strX, arrayList, arrayList2, listAsList, arrayList3);
    }

    @Override // g6.InterfaceC2680a
    public final String i() {
        return this.f28878a.L0();
    }

    @Override // g6.InterfaceC2680a
    public final byte[] j() {
        return this.f28878a.N0();
    }

    @Override // g6.InterfaceC2680a
    public final Point[] k() {
        return null;
    }

    @Override // g6.InterfaceC2680a
    public final C2615a.f l() {
        zzos zzosVarT0 = this.f28878a.t0();
        if (zzosVarT0 == null) {
            return null;
        }
        return new C2615a.f(zzosVarT0.e(), zzosVarT0.s(), zzosVarT0.k0(), zzosVarT0.X());
    }

    @Override // g6.InterfaceC2680a
    public final C2615a.g m() {
        zzot zzotVarU0 = this.f28878a.u0();
        if (zzotVarU0 != null) {
            return new C2615a.g(zzotVarU0.e(), zzotVarU0.s());
        }
        return null;
    }

    @Override // g6.InterfaceC2680a
    public final C2615a.l n() {
        zzoy zzoyVarK0 = this.f28878a.K0();
        if (zzoyVarK0 != null) {
            return new C2615a.l(zzoyVarK0.X(), zzoyVarK0.s(), zzoyVarK0.e());
        }
        return null;
    }
}
