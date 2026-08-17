package w2;

import A2.a;
import N2.b;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.MotionEvent;
import c2.g;
import c2.i;
import c2.k;
import d2.AbstractC2325a;
import j3.C2768b;
import java.util.Map;
import java.util.concurrent.Executor;
import m2.AbstractC2895b;
import v2.AbstractC3419a;
import v2.C3421c;
import v2.C3422d;
import z2.C3669a;

/* JADX INFO: renamed from: w2.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3468a implements B2.a, AbstractC3419a.InterfaceC0362a, a.InterfaceC0005a {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final Map f33099w = g.of("component_tag", "drawee");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final Map f33100x = g.of("origin", "memory_bitmap", "origin_sub", "shortcut");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final Class f33101y = AbstractC3468a.class;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC3419a f33103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f33104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C3422d f33105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private A2.a f33106e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected InterfaceC3471d f33107f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private B2.c f33109h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Drawable f33110i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f33111j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Object f33112k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f33113l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f33114m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f33115n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f33116o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f33117p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f33118q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private m2.c f33119r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Object f33120s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected Drawable f33123v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3421c f33102a = C3421c.a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected N2.d f33108g = new N2.d();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f33121t = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f33122u = false;

    /* JADX INFO: renamed from: w2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class C0365a extends AbstractC2895b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f33124a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f33125b;

        C0365a(String str, boolean z10) {
            this.f33124a = str;
            this.f33125b = z10;
        }

        @Override // m2.AbstractC2895b
        public void onFailureImpl(m2.c cVar) {
            AbstractC3468a.this.M(this.f33124a, cVar, cVar.b(), true);
        }

        @Override // m2.AbstractC2895b
        public void onNewResultImpl(m2.c cVar) {
            boolean zIsFinished = cVar.isFinished();
            boolean zE = cVar.e();
            float fD = cVar.d();
            Object result = cVar.getResult();
            if (result != null) {
                AbstractC3468a.this.O(this.f33124a, cVar, result, fD, zIsFinished, this.f33125b, zE);
            } else if (zIsFinished) {
                AbstractC3468a.this.M(this.f33124a, cVar, new NullPointerException(), true);
            }
        }

        @Override // m2.AbstractC2895b, m2.e
        public void onProgressUpdate(m2.c cVar) {
            boolean zIsFinished = cVar.isFinished();
            AbstractC3468a.this.P(this.f33124a, cVar, cVar.d(), zIsFinished);
        }
    }

    /* JADX INFO: renamed from: w2.a$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class b extends C3473f {
        private b() {
        }

        public static b d(InterfaceC3471d interfaceC3471d, InterfaceC3471d interfaceC3471d2) {
            if (C2768b.d()) {
                C2768b.a("AbstractDraweeController#createInternal");
            }
            b bVar = new b();
            bVar.a(interfaceC3471d);
            bVar.a(interfaceC3471d2);
            if (C2768b.d()) {
                C2768b.b();
            }
            return bVar;
        }
    }

    public AbstractC3468a(AbstractC3419a abstractC3419a, Executor executor, String str, Object obj) {
        this.f33103b = abstractC3419a;
        this.f33104c = executor;
        D(str, obj);
    }

    private B2.c C() {
        B2.c cVar = this.f33109h;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException("mSettableDraweeHierarchy is null; Caller context: " + this.f33112k);
    }

    private synchronized void D(String str, Object obj) {
        AbstractC3419a abstractC3419a;
        try {
            if (C2768b.d()) {
                C2768b.a("AbstractDraweeController#init");
            }
            this.f33102a.b(C3421c.a.ON_INIT_CONTROLLER);
            if (!this.f33121t && (abstractC3419a = this.f33103b) != null) {
                abstractC3419a.a(this);
            }
            this.f33113l = false;
            this.f33115n = false;
            R();
            this.f33117p = false;
            C3422d c3422d = this.f33105d;
            if (c3422d != null) {
                c3422d.a();
            }
            A2.a aVar = this.f33106e;
            if (aVar != null) {
                aVar.a();
                this.f33106e.f(this);
            }
            InterfaceC3471d interfaceC3471d = this.f33107f;
            if (interfaceC3471d instanceof b) {
                ((b) interfaceC3471d).b();
            } else {
                this.f33107f = null;
            }
            B2.c cVar = this.f33109h;
            if (cVar != null) {
                cVar.reset();
                this.f33109h.a(null);
                this.f33109h = null;
            }
            this.f33110i = null;
            if (AbstractC2325a.w(2)) {
                AbstractC2325a.A(f33101y, "controller %x %s -> %s: initialize", Integer.valueOf(System.identityHashCode(this)), this.f33111j, str);
            }
            this.f33111j = str;
            this.f33112k = obj;
            if (C2768b.d()) {
                C2768b.b();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private boolean F(String str, m2.c cVar) {
        if (cVar == null && this.f33119r == null) {
            return true;
        }
        return str.equals(this.f33111j) && cVar == this.f33119r && this.f33114m;
    }

    private void H(String str, Throwable th) {
        if (AbstractC2325a.w(2)) {
            AbstractC2325a.B(f33101y, "controller %x %s: %s: failure: %s", Integer.valueOf(System.identityHashCode(this)), this.f33111j, str, th);
        }
    }

    private void I(String str, Object obj) {
        if (AbstractC2325a.w(2)) {
            AbstractC2325a.C(f33101y, "controller %x %s: %s: image: %s %x", Integer.valueOf(System.identityHashCode(this)), this.f33111j, str, x(obj), Integer.valueOf(y(obj)));
        }
    }

    private b.a J(Map map, Map map2, Uri uri) {
        String str;
        PointF pointFL;
        B2.c cVar = this.f33109h;
        if (cVar instanceof C3669a) {
            C3669a c3669a = (C3669a) cVar;
            String strValueOf = String.valueOf(c3669a.m());
            pointFL = c3669a.l();
            str = strValueOf;
        } else {
            str = null;
            pointFL = null;
        }
        return M2.b.a(f33099w, f33100x, map, null, u(), str, pointFL, map2, p(), G(), uri);
    }

    private b.a K(m2.c cVar, Object obj, Uri uri) {
        return J(cVar == null ? null : cVar.getExtras(), L(obj), uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M(String str, m2.c cVar, Throwable th, boolean z10) {
        Drawable drawable;
        if (C2768b.d()) {
            C2768b.a("AbstractDraweeController#onFailureInternal");
        }
        if (!F(str, cVar)) {
            H("ignore_old_datasource @ onFailure", th);
            cVar.close();
            if (C2768b.d()) {
                C2768b.b();
                return;
            }
            return;
        }
        this.f33102a.b(z10 ? C3421c.a.ON_DATASOURCE_FAILURE : C3421c.a.ON_DATASOURCE_FAILURE_INT);
        if (z10) {
            H("final_failed @ onFailure", th);
            this.f33119r = null;
            this.f33116o = true;
            B2.c cVar2 = this.f33109h;
            if (cVar2 != null) {
                if (this.f33117p && (drawable = this.f33123v) != null) {
                    cVar2.f(drawable, 1.0f, true);
                } else if (h0()) {
                    cVar2.b(th);
                } else {
                    cVar2.c(th);
                }
            }
            U(th, cVar);
        } else {
            H("intermediate_failed @ onFailure", th);
            V(th);
        }
        if (C2768b.d()) {
            C2768b.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O(String str, m2.c cVar, Object obj, float f10, boolean z10, boolean z11, boolean z12) {
        try {
            if (C2768b.d()) {
                C2768b.a("AbstractDraweeController#onNewResultInternal");
            }
            if (!F(str, cVar)) {
                I("ignore_old_datasource @ onNewResult", obj);
                S(obj);
                cVar.close();
                if (C2768b.d()) {
                    C2768b.b();
                    return;
                }
                return;
            }
            this.f33102a.b(z10 ? C3421c.a.ON_DATASOURCE_RESULT : C3421c.a.ON_DATASOURCE_RESULT_INT);
            try {
                Drawable drawableM = m(obj);
                Object obj2 = this.f33120s;
                Drawable drawable = this.f33123v;
                this.f33120s = obj;
                this.f33123v = drawableM;
                try {
                    if (z10) {
                        I("set_final_result @ onNewResult", obj);
                        this.f33119r = null;
                        C().f(drawableM, 1.0f, z11);
                        Z(str, obj, cVar);
                    } else if (z12) {
                        I("set_temporary_result @ onNewResult", obj);
                        C().f(drawableM, 1.0f, z11);
                        Z(str, obj, cVar);
                    } else {
                        I("set_intermediate_result @ onNewResult", obj);
                        C().f(drawableM, f10, z11);
                        W(str, obj);
                    }
                    if (drawable != null && drawable != drawableM) {
                        Q(drawable);
                    }
                    if (obj2 != null && obj2 != obj) {
                        I("release_previous_result @ onNewResult", obj2);
                        S(obj2);
                    }
                    if (C2768b.d()) {
                        C2768b.b();
                    }
                } catch (Throwable th) {
                    if (drawable != null && drawable != drawableM) {
                        Q(drawable);
                    }
                    if (obj2 != null && obj2 != obj) {
                        I("release_previous_result @ onNewResult", obj2);
                        S(obj2);
                    }
                    throw th;
                }
            } catch (Exception e10) {
                I("drawable_failed @ onNewResult", obj);
                S(obj);
                M(str, cVar, e10, z10);
                if (C2768b.d()) {
                    C2768b.b();
                }
            }
        } catch (Throwable th2) {
            if (C2768b.d()) {
                C2768b.b();
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P(String str, m2.c cVar, float f10, boolean z10) {
        if (!F(str, cVar)) {
            H("ignore_old_datasource @ onProgress", null);
            cVar.close();
        } else {
            if (z10) {
                return;
            }
            this.f33109h.d(f10, false);
        }
    }

    private void R() {
        Map extras;
        boolean z10 = this.f33114m;
        this.f33114m = false;
        this.f33116o = false;
        m2.c cVar = this.f33119r;
        Map map = null;
        if (cVar != null) {
            extras = cVar.getExtras();
            this.f33119r.close();
            this.f33119r = null;
        } else {
            extras = null;
        }
        Drawable drawable = this.f33123v;
        if (drawable != null) {
            Q(drawable);
        }
        if (this.f33118q != null) {
            this.f33118q = null;
        }
        this.f33123v = null;
        Object obj = this.f33120s;
        if (obj != null) {
            Map mapL = L(z(obj));
            I("release", this.f33120s);
            S(this.f33120s);
            this.f33120s = null;
            map = mapL;
        }
        if (z10) {
            X(extras, map);
        }
    }

    private void U(Throwable th, m2.c cVar) {
        b.a aVarK = K(cVar, null, null);
        q().onFailure(this.f33111j, th);
        r().e(this.f33111j, th, aVarK);
    }

    private void V(Throwable th) {
        q().onIntermediateImageFailed(this.f33111j, th);
        r().r(this.f33111j);
    }

    private void W(String str, Object obj) {
        Object objZ = z(obj);
        q().onIntermediateImageSet(str, objZ);
        r().onIntermediateImageSet(str, objZ);
    }

    private void X(Map map, Map map2) {
        q().onRelease(this.f33111j);
        r().k(this.f33111j, J(map, map2, null));
    }

    private void Z(String str, Object obj, m2.c cVar) {
        Object objZ = z(obj);
        q().onFinalImageSet(str, objZ, n());
        r().m(str, objZ, K(cVar, objZ, null));
    }

    private boolean h0() {
        C3422d c3422d;
        return this.f33116o && (c3422d = this.f33105d) != null && c3422d.e();
    }

    private Rect u() {
        B2.c cVar = this.f33109h;
        if (cVar == null) {
            return null;
        }
        return cVar.getBounds();
    }

    protected abstract Uri A();

    protected C3422d B() {
        if (this.f33105d == null) {
            this.f33105d = new C3422d();
        }
        return this.f33105d;
    }

    protected void E(String str, Object obj) {
        D(str, obj);
        this.f33121t = false;
        this.f33122u = false;
    }

    protected boolean G() {
        return this.f33122u;
    }

    public abstract Map L(Object obj);

    protected abstract void Q(Drawable drawable);

    protected abstract void S(Object obj);

    public void T(N2.b bVar) {
        this.f33108g.B(bVar);
    }

    protected void Y(m2.c cVar, Object obj) {
        q().onSubmit(this.f33111j, this.f33112k);
        r().s(this.f33111j, this.f33112k, K(cVar, obj, A()));
    }

    @Override // v2.AbstractC3419a.InterfaceC0362a
    public void a() {
        this.f33102a.b(C3421c.a.ON_RELEASE_CONTROLLER);
        C3422d c3422d = this.f33105d;
        if (c3422d != null) {
            c3422d.c();
        }
        A2.a aVar = this.f33106e;
        if (aVar != null) {
            aVar.e();
        }
        B2.c cVar = this.f33109h;
        if (cVar != null) {
            cVar.reset();
        }
        R();
    }

    public void a0(String str) {
        this.f33118q = str;
    }

    @Override // B2.a
    public void b(B2.b bVar) {
        if (AbstractC2325a.w(2)) {
            AbstractC2325a.A(f33101y, "controller %x %s: setHierarchy: %s", Integer.valueOf(System.identityHashCode(this)), this.f33111j, bVar);
        }
        this.f33102a.b(bVar != null ? C3421c.a.ON_SET_HIERARCHY : C3421c.a.ON_CLEAR_HIERARCHY);
        if (this.f33114m) {
            this.f33103b.a(this);
            a();
        }
        B2.c cVar = this.f33109h;
        if (cVar != null) {
            cVar.a(null);
            this.f33109h = null;
        }
        if (bVar != null) {
            k.b(Boolean.valueOf(bVar instanceof B2.c));
            B2.c cVar2 = (B2.c) bVar;
            this.f33109h = cVar2;
            cVar2.a(this.f33110i);
        }
    }

    protected void b0(Drawable drawable) {
        this.f33110i = drawable;
        B2.c cVar = this.f33109h;
        if (cVar != null) {
            cVar.a(drawable);
        }
    }

    @Override // B2.a
    public void c() {
        if (C2768b.d()) {
            C2768b.a("AbstractDraweeController#onDetach");
        }
        if (AbstractC2325a.w(2)) {
            AbstractC2325a.z(f33101y, "controller %x %s: onDetach", Integer.valueOf(System.identityHashCode(this)), this.f33111j);
        }
        this.f33102a.b(C3421c.a.ON_DETACH_CONTROLLER);
        this.f33113l = false;
        this.f33103b.d(this);
        if (C2768b.d()) {
            C2768b.b();
        }
    }

    @Override // B2.a
    public B2.b d() {
        return this.f33109h;
    }

    protected void d0(A2.a aVar) {
        this.f33106e = aVar;
        if (aVar != null) {
            aVar.f(this);
        }
    }

    @Override // B2.a
    public boolean e(MotionEvent motionEvent) {
        if (AbstractC2325a.w(2)) {
            AbstractC2325a.A(f33101y, "controller %x %s: onTouchEvent %s", Integer.valueOf(System.identityHashCode(this)), this.f33111j, motionEvent);
        }
        A2.a aVar = this.f33106e;
        if (aVar == null) {
            return false;
        }
        if (!aVar.b() && !g0()) {
            return false;
        }
        this.f33106e.d(motionEvent);
        return true;
    }

    protected void e0(boolean z10) {
        this.f33122u = z10;
    }

    @Override // A2.a.InterfaceC0005a
    public boolean f() {
        if (AbstractC2325a.w(2)) {
            AbstractC2325a.z(f33101y, "controller %x %s: onClick", Integer.valueOf(System.identityHashCode(this)), this.f33111j);
        }
        if (!h0()) {
            return false;
        }
        this.f33105d.b();
        this.f33109h.reset();
        i0();
        return true;
    }

    protected void f0(boolean z10) {
        this.f33117p = z10;
    }

    @Override // B2.a
    public void g() {
        if (C2768b.d()) {
            C2768b.a("AbstractDraweeController#onAttach");
        }
        if (AbstractC2325a.w(2)) {
            AbstractC2325a.A(f33101y, "controller %x %s: onAttach: %s", Integer.valueOf(System.identityHashCode(this)), this.f33111j, this.f33114m ? "request already submitted" : "request needs submit");
        }
        this.f33102a.b(C3421c.a.ON_ATTACH_CONTROLLER);
        k.g(this.f33109h);
        this.f33103b.a(this);
        this.f33113l = true;
        if (!this.f33114m) {
            i0();
        }
        if (C2768b.d()) {
            C2768b.b();
        }
    }

    protected boolean g0() {
        return h0();
    }

    protected void i0() {
        if (C2768b.d()) {
            C2768b.a("AbstractDraweeController#submitRequest");
        }
        Object objO = o();
        if (objO != null) {
            if (C2768b.d()) {
                C2768b.a("AbstractDraweeController#submitRequest->cache");
            }
            this.f33119r = null;
            this.f33114m = true;
            this.f33116o = false;
            this.f33102a.b(C3421c.a.ON_SUBMIT_CACHE_HIT);
            Y(this.f33119r, z(objO));
            N(this.f33111j, objO);
            O(this.f33111j, this.f33119r, objO, 1.0f, true, true, true);
            if (C2768b.d()) {
                C2768b.b();
            }
            if (C2768b.d()) {
                C2768b.b();
                return;
            }
            return;
        }
        this.f33102a.b(C3421c.a.ON_DATASOURCE_SUBMIT);
        this.f33109h.d(0.0f, true);
        this.f33114m = true;
        this.f33116o = false;
        m2.c cVarT = t();
        this.f33119r = cVarT;
        Y(cVarT, null);
        if (AbstractC2325a.w(2)) {
            AbstractC2325a.A(f33101y, "controller %x %s: submitRequest: dataSource: %x", Integer.valueOf(System.identityHashCode(this)), this.f33111j, Integer.valueOf(System.identityHashCode(this.f33119r)));
        }
        this.f33119r.c(new C0365a(this.f33111j, this.f33119r.a()), this.f33104c);
        if (C2768b.d()) {
            C2768b.b();
        }
    }

    public void k(InterfaceC3471d interfaceC3471d) {
        k.g(interfaceC3471d);
        InterfaceC3471d interfaceC3471d2 = this.f33107f;
        if (interfaceC3471d2 instanceof b) {
            ((b) interfaceC3471d2).a(interfaceC3471d);
        } else if (interfaceC3471d2 != null) {
            this.f33107f = b.d(interfaceC3471d2, interfaceC3471d);
        } else {
            this.f33107f = interfaceC3471d;
        }
    }

    public void l(N2.b bVar) {
        this.f33108g.A(bVar);
    }

    protected abstract Drawable m(Object obj);

    public Animatable n() {
        Object obj = this.f33123v;
        if (obj instanceof Animatable) {
            return (Animatable) obj;
        }
        return null;
    }

    protected abstract Object o();

    public Object p() {
        return this.f33112k;
    }

    protected InterfaceC3471d q() {
        InterfaceC3471d interfaceC3471d = this.f33107f;
        return interfaceC3471d == null ? C3470c.a() : interfaceC3471d;
    }

    protected N2.b r() {
        return this.f33108g;
    }

    protected Drawable s() {
        return this.f33110i;
    }

    protected abstract m2.c t();

    public String toString() {
        return i.b(this).c("isAttached", this.f33113l).c("isRequestSubmitted", this.f33114m).c("hasFetchFailed", this.f33116o).a("fetchedImage", y(this.f33120s)).b("events", this.f33102a.toString()).toString();
    }

    protected A2.a v() {
        return this.f33106e;
    }

    public String w() {
        return this.f33111j;
    }

    protected String x(Object obj) {
        return obj != null ? obj.getClass().getSimpleName() : "<null>";
    }

    protected abstract int y(Object obj);

    protected abstract Object z(Object obj);

    public void c0(InterfaceC3472e interfaceC3472e) {
    }

    protected void N(String str, Object obj) {
    }
}
