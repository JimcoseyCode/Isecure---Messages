package h6;

import I4.AbstractBinderC0928l;
import I4.C0906j;
import I4.C1069x9;
import I4.L6;
import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_barcode.zzah;
import com.google.android.gms.internal.mlkit_vision_barcode.zzan;
import com.google.android.gms.internal.mlkit_vision_barcode.zzu;
import e6.C2428b;
import f6.C2615a;
import java.util.ArrayList;
import java.util.List;
import k6.C2831a;
import l6.AbstractC2876b;
import l6.C2877c;
import r4.AbstractC3268i;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class p implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f28504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f28505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final zzah f28506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C1069x9 f28507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C0906j f28508e;

    p(Context context, C2428b c2428b, C1069x9 c1069x9) {
        zzah zzahVar = new zzah();
        this.f28506c = zzahVar;
        this.f28505b = context;
        zzahVar.f21488g = c2428b.a();
        this.f28507d = c1069x9;
    }

    @Override // h6.l
    public final boolean a() throws Y5.a {
        if (this.f28508e != null) {
            return false;
        }
        try {
            C0906j c0906jL = AbstractBinderC0928l.c(DynamiteModule.d(this.f28505b, DynamiteModule.f21390b, "com.google.android.gms.vision.dynamite").c("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator")).l(B4.b.x(this.f28505b), this.f28506c);
            this.f28508e = c0906jL;
            if (c0906jL == null && !this.f28504a) {
                c6.l.c(this.f28505b, "barcode");
                this.f28504a = true;
                b.e(this.f28507d, L6.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new Y5.a("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            b.e(this.f28507d, L6.NO_ERROR);
            return false;
        } catch (RemoteException e10) {
            throw new Y5.a("Failed to create legacy barcode detector.", 13, e10);
        } catch (DynamiteModule.a e11) {
            throw new Y5.a("Failed to load deprecated vision dynamite module.", 13, e11);
        }
    }

    @Override // h6.l
    public final List b(C2831a c2831a) throws Y5.a {
        zzu[] zzuVarArrY;
        if (this.f28508e == null) {
            a();
        }
        C0906j c0906j = this.f28508e;
        if (c0906j == null) {
            throw new Y5.a("Error initializing the legacy barcode scanner.", 14);
        }
        C0906j c0906j2 = (C0906j) AbstractC3268i.k(c0906j);
        zzan zzanVar = new zzan(c2831a.k(), c2831a.g(), 0, 0L, AbstractC2876b.a(c2831a.j()));
        try {
            int iF = c2831a.f();
            if (iF == -1) {
                zzuVarArrY = c0906j2.y(B4.b.x(c2831a.c()), zzanVar);
            } else if (iF == 17) {
                zzuVarArrY = c0906j2.x(B4.b.x(c2831a.d()), zzanVar);
            } else if (iF == 35) {
                Image.Plane[] planeArr = (Image.Plane[]) AbstractC3268i.k(c2831a.i());
                zzanVar.f21490g = planeArr[0].getRowStride();
                zzuVarArrY = c0906j2.x(B4.b.x(planeArr[0].getBuffer()), zzanVar);
            } else {
                if (iF != 842094169) {
                    throw new Y5.a("Unsupported image format: " + c2831a.f(), 3);
                }
                zzuVarArrY = c0906j2.x(B4.b.x(C2877c.d().c(c2831a, false)), zzanVar);
            }
            ArrayList arrayList = new ArrayList();
            for (zzu zzuVar : zzuVarArrY) {
                arrayList.add(new C2615a(new o(zzuVar), c2831a.e()));
            }
            return arrayList;
        } catch (RemoteException e10) {
            throw new Y5.a("Failed to detect with legacy barcode detector", 13, e10);
        }
    }

    @Override // h6.l
    public final void zzb() {
        C0906j c0906j = this.f28508e;
        if (c0906j != null) {
            try {
                c0906j.b();
            } catch (RemoteException unused) {
            }
            this.f28508e = null;
        }
    }
}
