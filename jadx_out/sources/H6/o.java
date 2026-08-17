package h6;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.internal.mlkit_vision_barcode.zzi;
import com.google.android.gms.internal.mlkit_vision_barcode.zzj;
import com.google.android.gms.internal.mlkit_vision_barcode.zzk;
import com.google.android.gms.internal.mlkit_vision_barcode.zzl;
import com.google.android.gms.internal.mlkit_vision_barcode.zzm;
import com.google.android.gms.internal.mlkit_vision_barcode.zzn;
import com.google.android.gms.internal.mlkit_vision_barcode.zzo;
import com.google.android.gms.internal.mlkit_vision_barcode.zzp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzq;
import com.google.android.gms.internal.mlkit_vision_barcode.zzr;
import com.google.android.gms.internal.mlkit_vision_barcode.zzs;
import com.google.android.gms.internal.mlkit_vision_barcode.zzt;
import com.google.android.gms.internal.mlkit_vision_barcode.zzu;
import f6.C2615a;
import g6.InterfaceC2680a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class o implements InterfaceC2680a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zzu f28503a;

    public o(zzu zzuVar) {
        this.f28503a = zzuVar;
    }

    private static C2615a.b o(zzj zzjVar) {
        if (zzjVar == null) {
            return null;
        }
        return new C2615a.b(zzjVar.f21497g, zzjVar.f21498h, zzjVar.f21499i, zzjVar.f21500j, zzjVar.f21501k, zzjVar.f21502l, zzjVar.f21503m, zzjVar.f21504n);
    }

    @Override // g6.InterfaceC2680a
    public final C2615a.i a() {
        zzq zzqVar = this.f28503a.f21561m;
        if (zzqVar != null) {
            return new C2615a.i(zzqVar.f21547h, zzqVar.f21546g);
        }
        return null;
    }

    @Override // g6.InterfaceC2680a
    public final C2615a.e b() {
        zzm zzmVar = this.f28503a.f21568t;
        if (zzmVar == null) {
            return null;
        }
        return new C2615a.e(zzmVar.f21519g, zzmVar.f21520h, zzmVar.f21521i, zzmVar.f21522j, zzmVar.f21523k, zzmVar.f21524l, zzmVar.f21525m, zzmVar.f21526n, zzmVar.f21527o, zzmVar.f21528p, zzmVar.f21529q, zzmVar.f21530r, zzmVar.f21531s, zzmVar.f21532t);
    }

    @Override // g6.InterfaceC2680a
    public final Rect c() {
        zzu zzuVar = this.f28503a;
        if (zzuVar.f21559k == null) {
            return null;
        }
        int i10 = 0;
        int iMax = androidx.customview.widget.a.INVALID_ID;
        int iMin = Integer.MAX_VALUE;
        int iMin2 = Integer.MAX_VALUE;
        int iMax2 = Integer.MIN_VALUE;
        while (true) {
            Point[] pointArr = zzuVar.f21559k;
            if (i10 >= pointArr.length) {
                return new Rect(iMin, iMin2, iMax, iMax2);
            }
            Point point = pointArr[i10];
            iMin = Math.min(iMin, point.x);
            iMax = Math.max(iMax, point.x);
            iMin2 = Math.min(iMin2, point.y);
            iMax2 = Math.max(iMax2, point.y);
            i10++;
        }
    }

    @Override // g6.InterfaceC2680a
    public final String d() {
        return this.f28503a.f21556h;
    }

    @Override // g6.InterfaceC2680a
    public final C2615a.c e() {
        zzk zzkVar = this.f28503a.f21566r;
        if (zzkVar == null) {
            return null;
        }
        return new C2615a.c(zzkVar.f21505g, zzkVar.f21506h, zzkVar.f21507i, zzkVar.f21508j, zzkVar.f21509k, o(zzkVar.f21510l), o(zzkVar.f21511m));
    }

    @Override // g6.InterfaceC2680a
    public final int f() {
        return this.f28503a.f21558j;
    }

    @Override // g6.InterfaceC2680a
    public final C2615a.j g() {
        zzr zzrVar = this.f28503a.f21562n;
        if (zzrVar != null) {
            return new C2615a.j(zzrVar.f21548g, zzrVar.f21549h);
        }
        return null;
    }

    @Override // g6.InterfaceC2680a
    public final int getFormat() {
        return this.f28503a.f21555g;
    }

    @Override // g6.InterfaceC2680a
    public final C2615a.k getUrl() {
        zzs zzsVar = this.f28503a.f21564p;
        if (zzsVar != null) {
            return new C2615a.k(zzsVar.f21550g, zzsVar.f21551h);
        }
        return null;
    }

    @Override // g6.InterfaceC2680a
    public final C2615a.d h() {
        zzl zzlVar = this.f28503a.f21567s;
        if (zzlVar == null) {
            return null;
        }
        zzp zzpVar = zzlVar.f21512g;
        C2615a.h hVar = zzpVar == null ? null : new C2615a.h(zzpVar.f21539g, zzpVar.f21540h, zzpVar.f21541i, zzpVar.f21542j, zzpVar.f21543k, zzpVar.f21544l, zzpVar.f21545m);
        String str = zzlVar.f21513h;
        String str2 = zzlVar.f21514i;
        zzq[] zzqVarArr = zzlVar.f21515j;
        ArrayList arrayList = new ArrayList();
        if (zzqVarArr != null) {
            for (zzq zzqVar : zzqVarArr) {
                if (zzqVar != null) {
                    arrayList.add(new C2615a.i(zzqVar.f21547h, zzqVar.f21546g));
                }
            }
        }
        zzn[] zznVarArr = zzlVar.f21516k;
        ArrayList arrayList2 = new ArrayList();
        if (zznVarArr != null) {
            for (zzn zznVar : zznVarArr) {
                if (zznVar != null) {
                    arrayList2.add(new C2615a.f(zznVar.f21533g, zznVar.f21534h, zznVar.f21535i, zznVar.f21536j));
                }
            }
        }
        String[] strArr = zzlVar.f21517l;
        List listAsList = strArr != null ? Arrays.asList(strArr) : new ArrayList();
        zzi[] zziVarArr = zzlVar.f21518m;
        ArrayList arrayList3 = new ArrayList();
        if (zziVarArr != null) {
            for (zzi zziVar : zziVarArr) {
                if (zziVar != null) {
                    arrayList3.add(new C2615a.C0272a(zziVar.f21495g, zziVar.f21496h));
                }
            }
        }
        return new C2615a.d(hVar, str, str2, arrayList, arrayList2, listAsList, arrayList3);
    }

    @Override // g6.InterfaceC2680a
    public final String i() {
        return this.f28503a.f21557i;
    }

    @Override // g6.InterfaceC2680a
    public final byte[] j() {
        return this.f28503a.f21569u;
    }

    @Override // g6.InterfaceC2680a
    public final Point[] k() {
        return this.f28503a.f21559k;
    }

    @Override // g6.InterfaceC2680a
    public final C2615a.f l() {
        zzn zznVar = this.f28503a.f21560l;
        if (zznVar != null) {
            return new C2615a.f(zznVar.f21533g, zznVar.f21534h, zznVar.f21535i, zznVar.f21536j);
        }
        return null;
    }

    @Override // g6.InterfaceC2680a
    public final C2615a.g m() {
        zzo zzoVar = this.f28503a.f21565q;
        if (zzoVar != null) {
            return new C2615a.g(zzoVar.f21537g, zzoVar.f21538h);
        }
        return null;
    }

    @Override // g6.InterfaceC2680a
    public final C2615a.l n() {
        zzt zztVar = this.f28503a.f21563o;
        if (zztVar != null) {
            return new C2615a.l(zztVar.f21552g, zztVar.f21553h, zztVar.f21554i);
        }
        return null;
    }
}
