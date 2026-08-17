package J4;

import P4.AbstractC1378l;
import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import c6.AbstractC1858c;
import c6.C1862g;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import r4.C3266g;

/* JADX INFO: renamed from: J4.x5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C1258x5 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static N5 f6485k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final P5 f6486l = P5.c("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f6487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f6488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC1210q5 f6489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c6.m f6490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AbstractC1378l f6491e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AbstractC1378l f6492f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f6493g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f6494h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map f6495i = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map f6496j = new HashMap();

    public C1258x5(Context context, final c6.m mVar, InterfaceC1210q5 interfaceC1210q5, String str) {
        this.f6487a = context.getPackageName();
        this.f6488b = AbstractC1858c.a(context);
        this.f6490d = mVar;
        this.f6489c = interfaceC1210q5;
        K5.a();
        this.f6493g = str;
        this.f6491e = C1862g.a().b(new Callable() { // from class: J4.u5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f6409a.a();
            }
        });
        C1862g c1862gA = C1862g.a();
        mVar.getClass();
        this.f6492f = c1862gA.b(new Callable() { // from class: J4.v5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return mVar.a();
            }
        });
        P5 p52 = f6486l;
        this.f6494h = p52.containsKey(str) ? DynamiteModule.b(context, (String) p52.get(str)) : -1;
    }

    private static synchronized N5 d() {
        try {
            N5 n52 = f6485k;
            if (n52 != null) {
                return n52;
            }
            D0.h hVarA = D0.e.a(Resources.getSystem().getConfiguration());
            C1189n5 c1189n5 = new C1189n5();
            for (int i10 = 0; i10 < hVarA.f(); i10++) {
                c1189n5.c(AbstractC1858c.b(hVarA.c(i10)));
            }
            N5 n5D = c1189n5.d();
            f6485k = n5D;
            return n5D;
        } catch (Throwable th) {
            throw th;
        }
    }

    final /* synthetic */ String a() {
        return C3266g.a().b(this.f6493g);
    }

    final /* synthetic */ void b(InterfaceC1203p5 interfaceC1203p5, F3 f32, String str) {
        interfaceC1203p5.d(f32);
        String strA = interfaceC1203p5.a();
        K4 k42 = new K4();
        k42.b(this.f6487a);
        k42.c(this.f6488b);
        k42.h(d());
        k42.g(Boolean.TRUE);
        k42.l(strA);
        k42.j(str);
        k42.i(this.f6492f.p() ? (String) this.f6492f.l() : this.f6490d.a());
        k42.d(10);
        k42.k(Integer.valueOf(this.f6494h));
        interfaceC1203p5.c(k42);
        this.f6489c.a(interfaceC1203p5);
    }

    public final void c(H5 h52, final F3 f32) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f6495i.get(f32) != null && jElapsedRealtime - ((Long) this.f6495i.get(f32)).longValue() <= TimeUnit.SECONDS.toMillis(30L)) {
            return;
        }
        this.f6495i.put(f32, Long.valueOf(jElapsedRealtime));
        int i10 = h52.f5734a;
        int i11 = h52.f5735b;
        int i12 = h52.f5736c;
        int i13 = h52.f5737d;
        int i14 = h52.f5738e;
        long j10 = h52.f5739f;
        int i15 = h52.f5740g;
        C1256x3 c1256x3 = new C1256x3();
        c1256x3.d(i10 != -1 ? i10 != 35 ? i10 != 842094169 ? i10 != 16 ? i10 != 17 ? EnumC1221s3.UNKNOWN_FORMAT : EnumC1221s3.NV21 : EnumC1221s3.NV16 : EnumC1221s3.YV12 : EnumC1221s3.YUV_420_888 : EnumC1221s3.BITMAP);
        c1256x3.f(i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? EnumC1263y3.ANDROID_MEDIA_IMAGE : EnumC1263y3.FILEPATH : EnumC1263y3.BYTEBUFFER : EnumC1263y3.BYTEARRAY : EnumC1263y3.BITMAP);
        c1256x3.c(Integer.valueOf(i12));
        c1256x3.e(Integer.valueOf(i13));
        c1256x3.g(Integer.valueOf(i14));
        c1256x3.b(Long.valueOf(j10));
        c1256x3.h(Integer.valueOf(i15));
        A3 a3J = c1256x3.j();
        G3 g32 = new G3();
        g32.d(a3J);
        final InterfaceC1203p5 interfaceC1203p5E = y5.e(g32);
        final String strB = this.f6491e.p() ? (String) this.f6491e.l() : C3266g.a().b(this.f6493g);
        C1862g.d().execute(new Runnable() { // from class: J4.w5
            @Override // java.lang.Runnable
            public final void run() {
                this.f6450g.b(interfaceC1203p5E, f32, strB);
            }
        });
    }
}
