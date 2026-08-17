package h6;

import I4.AbstractC0885h0;
import I4.C1069x9;
import I4.L6;
import I4.Y9;
import I4.aa;
import I4.ba;
import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyu;
import e6.C2428b;
import f6.C2615a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k6.C2831a;
import l6.AbstractC2876b;
import l6.C2878d;
import r4.AbstractC3268i;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class n implements l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final AbstractC0885h0 f28495h = AbstractC0885h0.t("com.google.android.gms.vision.barcode", "com.google.android.gms.tflite_dynamite");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f28496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f28497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f28498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f28499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C2428b f28500e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C1069x9 f28501f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Y9 f28502g;

    n(Context context, C2428b c2428b, C1069x9 c1069x9) {
        this.f28499d = context;
        this.f28500e = c2428b;
        this.f28501f = c1069x9;
    }

    static boolean c(Context context) {
        return DynamiteModule.a(context, ModuleDescriptor.MODULE_ID) > 0;
    }

    @Override // h6.l
    public final boolean a() throws Y5.a {
        if (this.f28502g != null) {
            return this.f28497b;
        }
        if (c(this.f28499d)) {
            this.f28497b = true;
            try {
                this.f28502g = d(DynamiteModule.f21391c, ModuleDescriptor.MODULE_ID, "com.google.mlkit.vision.barcode.bundled.internal.ThickBarcodeScannerCreator");
            } catch (RemoteException e10) {
                throw new Y5.a("Failed to create thick barcode scanner.", 13, e10);
            } catch (DynamiteModule.a e11) {
                throw new Y5.a("Failed to load the bundled barcode module.", 13, e11);
            }
        } else {
            this.f28497b = false;
            if (!c6.l.a(this.f28499d, f28495h)) {
                if (!this.f28498c) {
                    c6.l.d(this.f28499d, AbstractC0885h0.t("barcode", "tflite_dynamite"));
                    this.f28498c = true;
                }
                b.e(this.f28501f, L6.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new Y5.a("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            try {
                this.f28502g = d(DynamiteModule.f21390b, "com.google.android.gms.vision.barcode", "com.google.android.gms.vision.barcode.mlkit.BarcodeScannerCreator");
            } catch (RemoteException | DynamiteModule.a e12) {
                b.e(this.f28501f, L6.OPTIONAL_MODULE_INIT_ERROR);
                throw new Y5.a("Failed to create thin barcode scanner.", 13, e12);
            }
        }
        b.e(this.f28501f, L6.NO_ERROR);
        return this.f28497b;
    }

    @Override // h6.l
    public final List b(C2831a c2831a) throws Y5.a {
        if (this.f28502g == null) {
            a();
        }
        Y9 y92 = (Y9) AbstractC3268i.k(this.f28502g);
        if (!this.f28496a) {
            try {
                y92.y();
                this.f28496a = true;
            } catch (RemoteException e10) {
                throw new Y5.a("Failed to init barcode scanner.", 13, e10);
            }
        }
        int iK = c2831a.k();
        if (c2831a.f() == 35) {
            iK = ((Image.Plane[]) AbstractC3268i.k(c2831a.i()))[0].getRowStride();
        }
        try {
            List listX = y92.x(C2878d.b().a(c2831a), new zzyu(c2831a.f(), iK, c2831a.g(), AbstractC2876b.a(c2831a.j()), SystemClock.elapsedRealtime()));
            ArrayList arrayList = new ArrayList();
            Iterator it = listX.iterator();
            while (it.hasNext()) {
                arrayList.add(new C2615a(new m((zzyb) it.next()), c2831a.e()));
            }
            return arrayList;
        } catch (RemoteException e11) {
            throw new Y5.a("Failed to run barcode scanner.", 13, e11);
        }
    }

    final Y9 d(DynamiteModule.b bVar, String str, String str2) {
        boolean z10;
        ba baVarC = aa.c(DynamiteModule.d(this.f28499d, bVar, str).c(str2));
        C2428b c2428b = this.f28500e;
        B4.a aVarX = B4.b.x(this.f28499d);
        int iA = c2428b.a();
        if (c2428b.d()) {
            z10 = true;
        } else {
            this.f28500e.b();
            z10 = false;
        }
        return baVarC.q(aVarX, new zzyd(iA, z10));
    }

    @Override // h6.l
    public final void zzb() {
        Y9 y92 = this.f28502g;
        if (y92 != null) {
            try {
                y92.e();
            } catch (RemoteException unused) {
            }
            this.f28502g = null;
            this.f28496a = false;
        }
    }
}
