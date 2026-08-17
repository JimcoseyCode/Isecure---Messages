package t2;

import N2.e;
import N2.g;
import N2.i;
import N2.j;
import N2.k;
import N2.n;
import android.graphics.Rect;
import f3.C2609c;
import j2.InterfaceC2764b;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import s2.C3321e;
import u2.C3400a;
import u2.b;

/* JADX INFO: renamed from: t2.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C3362a implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3321e f32468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC2764b f32469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j f32470c = new j(k.f8064i);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C3400a f32471d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f32472e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C2609c f32473f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List f32474g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f32475h;

    public C3362a(InterfaceC2764b interfaceC2764b, C3321e c3321e) {
        this.f32469b = interfaceC2764b;
        this.f32468a = c3321e;
    }

    private void h() {
        if (this.f32472e == null) {
            this.f32472e = new b(this.f32469b, this.f32470c, this);
        }
        if (this.f32471d == null) {
            this.f32471d = new C3400a(this.f32469b, this.f32470c);
        }
        if (this.f32473f == null) {
            this.f32473f = new C2609c(this.f32471d);
        }
    }

    @Override // N2.i
    public void a(j jVar, n nVar) {
        List list;
        if (!this.f32475h || (list = this.f32474g) == null || list.isEmpty()) {
            return;
        }
        jVar.S();
        Iterator it = this.f32474g.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    @Override // N2.i
    public void b(j jVar, e eVar) {
        List list;
        jVar.H(eVar);
        if (!this.f32475h || (list = this.f32474g) == null || list.isEmpty()) {
            return;
        }
        if (eVar == e.f7977m) {
            d();
        }
        jVar.S();
        Iterator it = this.f32474g.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    public void c(g gVar) {
        if (gVar == null) {
            return;
        }
        if (this.f32474g == null) {
            this.f32474g = new CopyOnWriteArrayList();
        }
        this.f32474g.add(gVar);
    }

    public void d() {
        B2.b bVarD = this.f32468a.d();
        if (bVarD == null || bVarD.e() == null) {
            return;
        }
        Rect bounds = bVarD.e().getBounds();
        this.f32470c.N(bounds.width());
        this.f32470c.M(bounds.height());
    }

    public void e() {
        List list = this.f32474g;
        if (list != null) {
            list.clear();
        }
    }

    public void f() {
        e();
        g(false);
        this.f32470c.w();
    }

    public void g(boolean z10) {
        this.f32475h = z10;
        if (!z10) {
            b bVar = this.f32472e;
            if (bVar != null) {
                this.f32468a.T(bVar);
            }
            C2609c c2609c = this.f32473f;
            if (c2609c != null) {
                this.f32468a.z0(c2609c);
                return;
            }
            return;
        }
        h();
        b bVar2 = this.f32472e;
        if (bVar2 != null) {
            this.f32468a.l(bVar2);
        }
        C2609c c2609c2 = this.f32473f;
        if (c2609c2 != null) {
            this.f32468a.j0(c2609c2);
        }
    }
}
