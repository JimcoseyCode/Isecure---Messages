package h6;

import I4.A9;
import I4.C0809a1;
import I4.C0831c1;
import I4.C0852e0;
import I4.C0957n6;
import I4.C1000r6;
import I4.C1069x9;
import I4.C1077y6;
import I4.C1091z9;
import I4.EnumC1011s6;
import I4.InterfaceC0949m9;
import I4.InterfaceC1058w9;
import I4.K6;
import I4.L6;
import I4.M6;
import I4.N6;
import I4.Z0;
import I4.Z6;
import android.os.SystemClock;
import c6.AbstractC1861f;
import c6.C1862g;
import c6.C1864i;
import e6.C2428b;
import f6.C2615a;
import java.util.Iterator;
import java.util.List;
import k6.C2831a;
import l6.C2875a;
import l6.C2878d;
import r4.AbstractC3268i;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends AbstractC1861f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final C2878d f28486j = C2878d.b();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static boolean f28487k = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C2428b f28488d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final l f28489e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C1069x9 f28490f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C1091z9 f28491g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C2875a f28492h = new C2875a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f28493i;

    public k(C1864i c1864i, C2428b c2428b, l lVar, C1069x9 c1069x9) {
        AbstractC3268i.l(c1864i, "MlKitContext can not be null");
        AbstractC3268i.l(c2428b, "BarcodeScannerOptions can not be null");
        this.f28488d = c2428b;
        this.f28489e = lVar;
        this.f28490f = c1069x9;
        this.f28491g = C1091z9.a(c1864i.b());
    }

    private final void m(final L6 l62, long j10, final C2831a c2831a, List list) {
        final C0852e0 c0852e0 = new C0852e0();
        final C0852e0 c0852e02 = new C0852e0();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C2615a c2615a = (C2615a) it.next();
                c0852e0.e(b.a(c2615a.g()));
                c0852e02.e(b.b(c2615a.n()));
            }
        }
        final long jElapsedRealtime = SystemClock.elapsedRealtime() - j10;
        this.f28490f.f(new InterfaceC1058w9() { // from class: h6.i
            @Override // I4.InterfaceC1058w9
            public final InterfaceC0949m9 zza() {
                return this.f28479a.j(jElapsedRealtime, l62, c0852e0, c0852e02, c2831a);
            }
        }, M6.ON_DEVICE_BARCODE_DETECT);
        C0809a1 c0809a1 = new C0809a1();
        c0809a1.e(l62);
        c0809a1.f(Boolean.valueOf(f28487k));
        c0809a1.g(b.c(this.f28488d));
        c0809a1.c(c0852e0.g());
        c0809a1.d(c0852e02.g());
        final C0831c1 c0831c1H = c0809a1.h();
        final j jVar = new j(this);
        final C1069x9 c1069x9 = this.f28490f;
        final M6 m62 = M6.AGGREGATED_ON_DEVICE_BARCODE_DETECTION;
        C1862g.d().execute(new Runnable() { // from class: I4.v9
            @Override // java.lang.Runnable
            public final void run() {
                c1069x9.h(m62, c0831c1H, jElapsedRealtime, jVar);
            }
        });
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f28491g.c(true != this.f28493i ? 24301 : 24302, l62.zza(), jCurrentTimeMillis - jElapsedRealtime, jCurrentTimeMillis);
    }

    @Override // c6.k
    public final synchronized void b() {
        this.f28493i = this.f28489e.a();
    }

    @Override // c6.k
    public final synchronized void d() {
        try {
            this.f28489e.zzb();
            f28487k = true;
            N6 n62 = new N6();
            K6 k62 = this.f28493i ? K6.TYPE_THICK : K6.TYPE_THIN;
            C1069x9 c1069x9 = this.f28490f;
            n62.e(k62);
            Z6 z62 = new Z6();
            z62.i(b.c(this.f28488d));
            n62.g(z62.j());
            c1069x9.d(A9.a(n62), M6.ON_DEVICE_BARCODE_CLOSE);
        } catch (Throwable th) {
            throw th;
        }
    }

    final /* synthetic */ InterfaceC0949m9 j(long j10, L6 l62, C0852e0 c0852e0, C0852e0 c0852e02, C2831a c2831a) {
        Z6 z62 = new Z6();
        C1077y6 c1077y6 = new C1077y6();
        c1077y6.c(Long.valueOf(j10));
        c1077y6.d(l62);
        c1077y6.e(Boolean.valueOf(f28487k));
        Boolean bool = Boolean.TRUE;
        c1077y6.a(bool);
        c1077y6.b(bool);
        z62.h(c1077y6.f());
        z62.i(b.c(this.f28488d));
        z62.e(c0852e0.g());
        z62.f(c0852e02.g());
        int iF = c2831a.f();
        int iC = f28486j.c(c2831a);
        C1000r6 c1000r6 = new C1000r6();
        c1000r6.a(iF != -1 ? iF != 35 ? iF != 842094169 ? iF != 16 ? iF != 17 ? EnumC1011s6.UNKNOWN_FORMAT : EnumC1011s6.NV21 : EnumC1011s6.NV16 : EnumC1011s6.YV12 : EnumC1011s6.YUV_420_888 : EnumC1011s6.BITMAP);
        c1000r6.b(Integer.valueOf(iC));
        z62.g(c1000r6.d());
        N6 n62 = new N6();
        n62.e(this.f28493i ? K6.TYPE_THICK : K6.TYPE_THIN);
        n62.g(z62.j());
        return A9.a(n62);
    }

    final /* synthetic */ InterfaceC0949m9 k(C0831c1 c0831c1, int i10, C0957n6 c0957n6) {
        N6 n62 = new N6();
        n62.e(this.f28493i ? K6.TYPE_THICK : K6.TYPE_THIN);
        Z0 z02 = new Z0();
        z02.a(Integer.valueOf(i10));
        z02.c(c0831c1);
        z02.b(c0957n6);
        n62.d(z02.e());
        return A9.a(n62);
    }

    @Override // c6.AbstractC1861f
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final synchronized List i(C2831a c2831a) throws Throwable {
        k kVar;
        C2831a c2831a2;
        List listB;
        try {
            try {
                C2875a c2875a = this.f28492h;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                c2875a.a(c2831a);
                try {
                    listB = this.f28489e.b(c2831a);
                    kVar = this;
                    c2831a2 = c2831a;
                } catch (Y5.a e10) {
                    e = e10;
                    kVar = this;
                    c2831a2 = c2831a;
                }
                try {
                    kVar.m(L6.NO_ERROR, jElapsedRealtime, c2831a2, listB);
                    f28487k = false;
                    return listB;
                } catch (Y5.a e11) {
                    e = e11;
                    Y5.a aVar = e;
                    kVar.m(aVar.a() == 14 ? L6.MODEL_NOT_DOWNLOADED : L6.UNKNOWN_ERROR, jElapsedRealtime, c2831a2, null);
                    throw aVar;
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
