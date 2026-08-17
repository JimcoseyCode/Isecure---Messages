package K2;

import F2.f;
import H2.k;
import R2.e;
import W2.n;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import c2.o;
import c3.InterfaceC1844a;
import j2.InterfaceC2764b;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class d implements InterfaceC1844a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T2.b f7037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f7038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ExecutorService f7039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC2764b f7040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final V2.d f7041e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final n f7042f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c2.n f7043g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final c2.n f7044h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final c2.n f7045i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final c2.n f7046j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final c2.n f7047k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final c2.n f7048l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final c2.n f7049m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final c2.n f7050n = o.f18800b;

    public d(T2.b bVar, ScheduledExecutorService scheduledExecutorService, ExecutorService executorService, InterfaceC2764b interfaceC2764b, V2.d dVar, n nVar, c2.n nVar2, c2.n nVar3, c2.n nVar4, c2.n nVar5, c2.n nVar6, c2.n nVar7, c2.n nVar8) {
        this.f7037a = bVar;
        this.f7038b = scheduledExecutorService;
        this.f7039c = executorService;
        this.f7040d = interfaceC2764b;
        this.f7041e = dVar;
        this.f7042f = nVar;
        this.f7043g = nVar2;
        this.f7044h = nVar3;
        this.f7045i = nVar4;
        this.f7046j = nVar5;
        this.f7048l = nVar7;
        this.f7047k = nVar6;
        this.f7049m = nVar8;
    }

    private R2.a c(e eVar) {
        R2.c cVarD = eVar.d();
        return this.f7037a.a(eVar, new Rect(0, 0, cVarD.getWidth(), cVarD.getHeight()));
    }

    private T2.c d(e eVar) {
        return new T2.c(new E2.a(eVar.hashCode(), ((Boolean) this.f7045i.get()).booleanValue()), this.f7042f);
    }

    private C2.a e(e eVar, Bitmap.Config config, P2.c cVar) {
        F2.a fVar;
        F2.b bVarG;
        R2.a aVarC = c(eVar);
        I2.a aVar = new I2.a(aVarC);
        D2.b bVarF = f(eVar);
        I2.b bVar = new I2.b(bVarF, aVarC, ((Boolean) this.f7046j.get()).booleanValue());
        int iIntValue = ((Integer) this.f7044h.get()).intValue();
        if (iIntValue > 0) {
            fVar = new F2.d(iIntValue);
            bVarG = g(bVar, config);
        } else {
            fVar = null;
            bVarG = null;
        }
        if (((Boolean) this.f7046j.get()).booleanValue()) {
            fVar = new f(eVar.e(), aVar, bVar, new k(this.f7041e, ((Integer) this.f7048l.get()).intValue(), ((Integer) this.f7049m.get()).intValue()), ((Boolean) this.f7047k.get()).booleanValue());
        }
        return C2.c.s(new D2.a(this.f7041e, bVarF, aVar, bVar, ((Boolean) this.f7046j.get()).booleanValue(), fVar, bVarG, null), this.f7040d, this.f7038b);
    }

    private D2.b f(e eVar) {
        int iIntValue = ((Integer) this.f7043g.get()).intValue();
        return iIntValue != 1 ? iIntValue != 2 ? iIntValue != 3 ? new E2.d() : new E2.c() : new E2.b(d(eVar), false) : new E2.b(d(eVar), true);
    }

    private F2.b g(D2.c cVar, Bitmap.Config config) {
        V2.d dVar = this.f7041e;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        return new F2.c(dVar, cVar, config, this.f7039c);
    }

    @Override // c3.InterfaceC1844a
    public Drawable a(d3.e eVar) {
        if (!b(eVar)) {
            return null;
        }
        d3.c cVar = (d3.c) eVar;
        R2.c cVarG0 = cVar.g0();
        C2.a aVarE = e((e) c2.k.g(cVar.i0()), cVarG0 != null ? cVarG0.m() : null, null);
        return ((Boolean) this.f7050n.get()).booleanValue() ? new J2.f(aVarE) : new J2.b(aVarE);
    }

    @Override // c3.InterfaceC1844a
    public boolean b(d3.e eVar) {
        return eVar instanceof d3.c;
    }
}
