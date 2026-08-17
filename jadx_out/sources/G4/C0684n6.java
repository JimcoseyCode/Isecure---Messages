package G4;

import P4.AbstractC1378l;
import android.content.Context;
import android.content.res.Resources;
import c6.AbstractC1858c;
import c6.C1862g;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import r4.C3266g;

/* JADX INFO: renamed from: G4.n6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C0684n6 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static C6 f3269k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Q6 f3270l = Q6.c("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f3271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f3272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC0628g6 f3273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c6.m f3274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AbstractC1378l f3275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AbstractC1378l f3276f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f3277g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f3278h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map f3279i = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map f3280j = new HashMap();

    public C0684n6(Context context, final c6.m mVar, InterfaceC0628g6 interfaceC0628g6, String str) {
        this.f3271a = context.getPackageName();
        this.f3272b = AbstractC1858c.a(context);
        this.f3274d = mVar;
        this.f3273c = interfaceC0628g6;
        A6.a();
        this.f3277g = str;
        this.f3275e = C1862g.a().b(new Callable() { // from class: G4.k6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f2906a.a();
            }
        });
        C1862g c1862gA = C1862g.a();
        mVar.getClass();
        this.f3276f = c1862gA.b(new Callable() { // from class: G4.l6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return mVar.a();
            }
        });
        Q6 q62 = f3270l;
        this.f3278h = q62.containsKey(str) ? DynamiteModule.b(context, (String) q62.get(str)) : -1;
    }

    private static synchronized C6 d() {
        try {
            C6 c62 = f3269k;
            if (c62 != null) {
                return c62;
            }
            D0.h hVarA = D0.e.a(Resources.getSystem().getConfiguration());
            C0683n5 c0683n5 = new C0683n5();
            for (int i10 = 0; i10 < hVarA.f(); i10++) {
                c0683n5.a(AbstractC1858c.b(hVarA.c(i10)));
            }
            C6 c6B = c0683n5.b();
            f3269k = c6B;
            return c6B;
        } catch (Throwable th) {
            throw th;
        }
    }

    final /* synthetic */ String a() {
        return C3266g.a().b(this.f3277g);
    }

    final /* synthetic */ void b(InterfaceC0620f6 interfaceC0620f6, EnumC0682n4 enumC0682n4, String str) {
        interfaceC0620f6.c(enumC0682n4);
        String strA = interfaceC0620f6.a();
        E5 e52 = new E5();
        e52.b(this.f3271a);
        e52.c(this.f3272b);
        e52.h(d());
        e52.g(Boolean.TRUE);
        e52.l(strA);
        e52.j(str);
        e52.i(this.f3276f.p() ? (String) this.f3276f.l() : this.f3274d.a());
        e52.d(10);
        e52.k(Integer.valueOf(this.f3278h));
        interfaceC0620f6.d(e52);
        this.f3273c.a(interfaceC0620f6);
    }

    public final void c(final InterfaceC0620f6 interfaceC0620f6, final EnumC0682n4 enumC0682n4) {
        final String strB = this.f3275e.p() ? (String) this.f3275e.l() : C3266g.a().b(this.f3277g);
        C1862g.d().execute(new Runnable() { // from class: G4.m6
            @Override // java.lang.Runnable
            public final void run() {
                this.f3000g.b(interfaceC0620f6, enumC0682n4, strB);
            }
        });
    }
}
