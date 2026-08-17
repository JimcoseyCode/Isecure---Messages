package h6;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxq;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxr;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxs;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxt;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxu;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxv;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxw;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxx;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxy;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxz;
import com.google.android.gms.internal.mlkit_vision_barcode.zzya;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyb;
import f6.C2615a;
import g6.InterfaceC2680a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import r4.AbstractC3268i;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class m implements InterfaceC2680a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zzyb f28494a;

    public m(zzyb zzybVar) {
        this.f28494a = zzybVar;
    }

    private static C2615a.b o(zzxq zzxqVar) {
        if (zzxqVar == null) {
            return null;
        }
        return new C2615a.b(zzxqVar.t0(), zzxqVar.k0(), zzxqVar.e(), zzxqVar.s(), zzxqVar.X(), zzxqVar.l0(), zzxqVar.A0(), zzxqVar.u0());
    }

    @Override // g6.InterfaceC2680a
    public final C2615a.i a() {
        zzxx zzxxVarA0 = this.f28494a.A0();
        if (zzxxVarA0 != null) {
            return new C2615a.i(zzxxVarA0.s(), zzxxVarA0.e());
        }
        return null;
    }

    @Override // g6.InterfaceC2680a
    public final C2615a.e b() {
        zzxt zzxtVarL0 = this.f28494a.l0();
        if (zzxtVarL0 != null) {
            return new C2615a.e(zzxtVarL0.t0(), zzxtVarL0.A0(), zzxtVarL0.N0(), zzxtVarL0.L0(), zzxtVarL0.D0(), zzxtVarL0.X(), zzxtVarL0.e(), zzxtVarL0.s(), zzxtVarL0.k0(), zzxtVarL0.M0(), zzxtVarL0.J0(), zzxtVarL0.u0(), zzxtVarL0.l0(), zzxtVarL0.K0());
        }
        return null;
    }

    @Override // g6.InterfaceC2680a
    public final Rect c() {
        Point[] pointArrO0 = this.f28494a.O0();
        if (pointArrO0 == null) {
            return null;
        }
        int iMax = androidx.customview.widget.a.INVALID_ID;
        int iMin = Integer.MAX_VALUE;
        int iMin2 = Integer.MAX_VALUE;
        int iMax2 = Integer.MIN_VALUE;
        for (Point point : pointArrO0) {
            iMin = Math.min(iMin, point.x);
            iMax = Math.max(iMax, point.x);
            iMin2 = Math.min(iMin2, point.y);
            iMax2 = Math.max(iMax2, point.y);
        }
        return new Rect(iMin, iMin2, iMax, iMax2);
    }

    @Override // g6.InterfaceC2680a
    public final String d() {
        return this.f28494a.M0();
    }

    @Override // g6.InterfaceC2680a
    public final C2615a.c e() {
        zzxr zzxrVarX = this.f28494a.X();
        if (zzxrVarX != null) {
            return new C2615a.c(zzxrVarX.u0(), zzxrVarX.X(), zzxrVarX.k0(), zzxrVarX.l0(), zzxrVarX.t0(), o(zzxrVarX.s()), o(zzxrVarX.e()));
        }
        return null;
    }

    @Override // g6.InterfaceC2680a
    public final int f() {
        return this.f28494a.s();
    }

    @Override // g6.InterfaceC2680a
    public final C2615a.j g() {
        zzxy zzxyVarD0 = this.f28494a.D0();
        if (zzxyVarD0 != null) {
            return new C2615a.j(zzxyVarD0.e(), zzxyVarD0.s());
        }
        return null;
    }

    @Override // g6.InterfaceC2680a
    public final int getFormat() {
        return this.f28494a.e();
    }

    @Override // g6.InterfaceC2680a
    public final C2615a.k getUrl() {
        zzxz zzxzVarJ0 = this.f28494a.J0();
        if (zzxzVarJ0 != null) {
            return new C2615a.k(zzxzVarJ0.e(), zzxzVarJ0.s());
        }
        return null;
    }

    @Override // g6.InterfaceC2680a
    public final C2615a.d h() {
        zzxs zzxsVarK0 = this.f28494a.k0();
        if (zzxsVarK0 == null) {
            return null;
        }
        zzxw zzxwVarE = zzxsVarK0.e();
        C2615a.h hVar = zzxwVarE == null ? null : new C2615a.h(zzxwVarE.s(), zzxwVarE.t0(), zzxwVarE.l0(), zzxwVarE.e(), zzxwVarE.k0(), zzxwVarE.X(), zzxwVarE.u0());
        String strS = zzxsVarK0.s();
        String strX = zzxsVarK0.X();
        zzxx[] zzxxVarArrT0 = zzxsVarK0.t0();
        ArrayList arrayList = new ArrayList();
        if (zzxxVarArrT0 != null) {
            for (zzxx zzxxVar : zzxxVarArrT0) {
                if (zzxxVar != null) {
                    arrayList.add(new C2615a.i(zzxxVar.s(), zzxxVar.e()));
                }
            }
        }
        zzxu[] zzxuVarArrL0 = zzxsVarK0.l0();
        ArrayList arrayList2 = new ArrayList();
        if (zzxuVarArrL0 != null) {
            for (zzxu zzxuVar : zzxuVarArrL0) {
                if (zzxuVar != null) {
                    arrayList2.add(new C2615a.f(zzxuVar.e(), zzxuVar.s(), zzxuVar.k0(), zzxuVar.X()));
                }
            }
        }
        List listAsList = zzxsVarK0.u0() != null ? Arrays.asList((String[]) AbstractC3268i.k(zzxsVarK0.u0())) : new ArrayList();
        zzxp[] zzxpVarArrK0 = zzxsVarK0.k0();
        ArrayList arrayList3 = new ArrayList();
        if (zzxpVarArrK0 != null) {
            for (zzxp zzxpVar : zzxpVarArrK0) {
                if (zzxpVar != null) {
                    arrayList3.add(new C2615a.C0272a(zzxpVar.e(), zzxpVar.s()));
                }
            }
        }
        return new C2615a.d(hVar, strS, strX, arrayList, arrayList2, listAsList, arrayList3);
    }

    @Override // g6.InterfaceC2680a
    public final String i() {
        return this.f28494a.L0();
    }

    @Override // g6.InterfaceC2680a
    public final byte[] j() {
        return this.f28494a.N0();
    }

    @Override // g6.InterfaceC2680a
    public final Point[] k() {
        return this.f28494a.O0();
    }

    @Override // g6.InterfaceC2680a
    public final C2615a.f l() {
        zzxu zzxuVarT0 = this.f28494a.t0();
        if (zzxuVarT0 == null) {
            return null;
        }
        return new C2615a.f(zzxuVarT0.e(), zzxuVarT0.s(), zzxuVarT0.k0(), zzxuVarT0.X());
    }

    @Override // g6.InterfaceC2680a
    public final C2615a.g m() {
        zzxv zzxvVarU0 = this.f28494a.u0();
        if (zzxvVarU0 != null) {
            return new C2615a.g(zzxvVarU0.e(), zzxvVarU0.s());
        }
        return null;
    }

    @Override // g6.InterfaceC2680a
    public final C2615a.l n() {
        zzya zzyaVarK0 = this.f28494a.K0();
        if (zzyaVarK0 != null) {
            return new C2615a.l(zzyaVarK0.X(), zzyaVarK0.s(), zzyaVarK0.e());
        }
        return null;
    }
}
