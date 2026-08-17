package I4;

import P4.AbstractC1378l;
import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import c6.AbstractC1858c;
import c6.C1862g;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import r4.C3266g;

/* JADX INFO: renamed from: I4.x9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C1069x9 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static AbstractC0885h0 f4959k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final AbstractC0907j0 f4960l = AbstractC0907j0.c("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f4961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f4962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC0960n9 f4963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c6.m f4964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AbstractC1378l f4965e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AbstractC1378l f4966f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f4967g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f4968h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map f4969i = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map f4970j = new HashMap();

    public C1069x9(Context context, final c6.m mVar, InterfaceC0960n9 interfaceC0960n9, String str) {
        this.f4961a = context.getPackageName();
        this.f4962b = AbstractC1858c.a(context);
        this.f4964d = mVar;
        this.f4963c = interfaceC0960n9;
        K9.a();
        this.f4967g = str;
        this.f4965e = C1862g.a().b(new Callable() { // from class: I4.t9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f4895a.b();
            }
        });
        C1862g c1862gA = C1862g.a();
        Objects.requireNonNull(mVar);
        this.f4966f = c1862gA.b(new Callable() { // from class: I4.u9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return mVar.a();
            }
        });
        AbstractC0907j0 abstractC0907j0 = f4960l;
        this.f4968h = abstractC0907j0.containsKey(str) ? DynamiteModule.b(context, (String) abstractC0907j0.get(str)) : -1;
    }

    static long a(List list, double d10) {
        return ((Long) list.get(Math.max(((int) Math.ceil((d10 / 100.0d) * ((double) list.size()))) - 1, 0))).longValue();
    }

    private static synchronized AbstractC0885h0 i() {
        try {
            AbstractC0885h0 abstractC0885h0 = f4959k;
            if (abstractC0885h0 != null) {
                return abstractC0885h0;
            }
            D0.h hVarA = D0.e.a(Resources.getSystem().getConfiguration());
            C0852e0 c0852e0 = new C0852e0();
            for (int i10 = 0; i10 < hVarA.f(); i10++) {
                c0852e0.e(AbstractC1858c.b(hVarA.c(i10)));
            }
            AbstractC0885h0 abstractC0885h0G = c0852e0.g();
            f4959k = abstractC0885h0G;
            return abstractC0885h0G;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final String j() {
        if (this.f4965e.p()) {
            return (String) this.f4965e.l();
        }
        return C3266g.a().b(this.f4967g);
    }

    private final boolean k(M6 m62, long j10, long j11) {
        return this.f4969i.get(m62) == null || j10 - ((Long) this.f4969i.get(m62)).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }

    final /* synthetic */ String b() {
        return C3266g.a().b(this.f4967g);
    }

    final /* synthetic */ void c(InterfaceC0949m9 interfaceC0949m9, M6 m62, String str) {
        interfaceC0949m9.c(m62);
        String strB = interfaceC0949m9.b();
        I8 i82 = new I8();
        i82.b(this.f4961a);
        i82.c(this.f4962b);
        i82.h(i());
        i82.g(Boolean.TRUE);
        i82.l(strB);
        i82.j(str);
        i82.i(this.f4966f.p() ? (String) this.f4966f.l() : this.f4964d.a());
        i82.d(10);
        i82.k(Integer.valueOf(this.f4968h));
        interfaceC0949m9.e(i82);
        this.f4963c.a(interfaceC0949m9);
    }

    public final void d(InterfaceC0949m9 interfaceC0949m9, M6 m62) {
        e(interfaceC0949m9, m62, j());
    }

    public final void e(final InterfaceC0949m9 interfaceC0949m9, final M6 m62, final String str) {
        C1862g.d().execute(new Runnable() { // from class: I4.r9
            @Override // java.lang.Runnable
            public final void run() {
                this.f4868g.c(interfaceC0949m9, m62, str);
            }
        });
    }

    public final void f(InterfaceC1058w9 interfaceC1058w9, M6 m62) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (k(m62, jElapsedRealtime, 30L)) {
            this.f4969i.put(m62, Long.valueOf(jElapsedRealtime));
            e(interfaceC1058w9.zza(), m62, j());
        }
    }

    final /* synthetic */ void g(M6 m62, h6.j jVar) {
        InterfaceC0940m0 interfaceC0940m0 = (InterfaceC0940m0) this.f4970j.get(m62);
        if (interfaceC0940m0 != null) {
            for (Object obj : interfaceC0940m0.c()) {
                ArrayList arrayList = new ArrayList(interfaceC0940m0.b(obj));
                Collections.sort(arrayList);
                C0935l6 c0935l6 = new C0935l6();
                Iterator it = arrayList.iterator();
                long jLongValue = 0;
                while (it.hasNext()) {
                    jLongValue += ((Long) it.next()).longValue();
                }
                c0935l6.a(Long.valueOf(jLongValue / ((long) arrayList.size())));
                c0935l6.c(Long.valueOf(a(arrayList, 100.0d)));
                c0935l6.f(Long.valueOf(a(arrayList, 75.0d)));
                c0935l6.d(Long.valueOf(a(arrayList, 50.0d)));
                c0935l6.b(Long.valueOf(a(arrayList, 25.0d)));
                c0935l6.e(Long.valueOf(a(arrayList, 0.0d)));
                e(jVar.a(obj, arrayList.size(), c0935l6.g()), m62, j());
            }
            this.f4970j.remove(m62);
        }
    }

    final /* synthetic */ void h(final M6 m62, Object obj, long j10, final h6.j jVar) {
        if (!this.f4970j.containsKey(m62)) {
            this.f4970j.put(m62, J.p());
        }
        ((InterfaceC0940m0) this.f4970j.get(m62)).a(obj, Long.valueOf(j10));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (k(m62, jElapsedRealtime, 30L)) {
            this.f4969i.put(m62, Long.valueOf(jElapsedRealtime));
            C1862g.d().execute(new Runnable() { // from class: I4.s9
                @Override // java.lang.Runnable
                public final void run() {
                    this.f4888g.g(m62, jVar);
                }
            });
        }
    }
}
