package w2;

import android.content.Context;
import android.graphics.drawable.Animatable;
import c2.i;
import c2.k;
import c2.n;
import j3.C2768b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import m2.h;

/* JADX INFO: renamed from: w2.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3469b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final InterfaceC3471d f33127q = new a();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final NullPointerException f33128r = new NullPointerException("No image request was specified!");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final AtomicLong f33129s = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f33130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f33131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f33132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f33133d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Object f33134e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Object f33135f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Object[] f33136g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f33137h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private n f33138i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private InterfaceC3471d f33139j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f33140k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f33141l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f33142m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f33143n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f33144o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private B2.a f33145p;

    /* JADX INFO: renamed from: w2.b$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends C3470c {
        a() {
        }

        @Override // w2.C3470c, w2.InterfaceC3471d
        public void onFinalImageSet(String str, Object obj, Animatable animatable) {
            if (animatable != null) {
                animatable.start();
            }
        }
    }

    /* JADX INFO: renamed from: w2.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class C0366b implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ B2.a f33146a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f33147b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f33148c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f33149d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ c f33150e;

        C0366b(B2.a aVar, String str, Object obj, Object obj2, c cVar) {
            this.f33146a = aVar;
            this.f33147b = str;
            this.f33148c = obj;
            this.f33149d = obj2;
            this.f33150e = cVar;
        }

        @Override // c2.n
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public m2.c get() {
            return AbstractC3469b.this.g(this.f33146a, this.f33147b, this.f33148c, this.f33149d, this.f33150e);
        }

        public String toString() {
            return i.b(this).b("request", this.f33148c.toString()).toString();
        }
    }

    /* JADX INFO: renamed from: w2.b$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public enum c {
        FULL_FETCH,
        DISK_CACHE,
        BITMAP_MEMORY_CACHE
    }

    protected AbstractC3469b(Context context, Set set, Set set2) {
        this.f33130a = context;
        this.f33131b = set;
        this.f33132c = set2;
        q();
    }

    protected static String c() {
        return String.valueOf(f33129s.getAndIncrement());
    }

    private void q() {
        this.f33133d = null;
        this.f33134e = null;
        this.f33135f = null;
        this.f33136g = null;
        this.f33137h = true;
        this.f33139j = null;
        this.f33140k = false;
        this.f33141l = false;
        this.f33143n = false;
        this.f33145p = null;
        this.f33144o = null;
    }

    public AbstractC3469b A(InterfaceC3471d interfaceC3471d) {
        this.f33139j = interfaceC3471d;
        return p();
    }

    public AbstractC3469b B(Object obj) {
        this.f33134e = obj;
        return p();
    }

    public AbstractC3469b C(Object obj) {
        this.f33135f = obj;
        return p();
    }

    public AbstractC3469b D(B2.a aVar) {
        this.f33145p = aVar;
        return p();
    }

    protected void E() {
        boolean z10 = true;
        k.j(this.f33136g == null || this.f33134e == null, "Cannot specify both ImageRequest and FirstAvailableImageRequests!");
        if (this.f33138i != null && (this.f33136g != null || this.f33134e != null || this.f33135f != null)) {
            z10 = false;
        }
        k.j(z10, "Cannot specify DataSourceSupplier with other ImageRequests! Use one or the other.");
    }

    public AbstractC3468a a() {
        Object obj;
        E();
        if (this.f33134e == null && this.f33136g == null && (obj = this.f33135f) != null) {
            this.f33134e = obj;
            this.f33135f = null;
        }
        return b();
    }

    protected AbstractC3468a b() {
        if (C2768b.d()) {
            C2768b.a("AbstractDraweeControllerBuilder#buildController");
        }
        AbstractC3468a abstractC3468aV = v();
        abstractC3468aV.e0(r());
        abstractC3468aV.f0(o());
        abstractC3468aV.a0(e());
        f();
        abstractC3468aV.c0(null);
        u(abstractC3468aV);
        s(abstractC3468aV);
        if (C2768b.d()) {
            C2768b.b();
        }
        return abstractC3468aV;
    }

    public Object d() {
        return this.f33133d;
    }

    public String e() {
        return this.f33144o;
    }

    public InterfaceC3472e f() {
        return null;
    }

    protected abstract m2.c g(B2.a aVar, String str, Object obj, Object obj2, c cVar);

    protected n h(B2.a aVar, String str, Object obj) {
        return i(aVar, str, obj, c.FULL_FETCH);
    }

    protected n i(B2.a aVar, String str, Object obj, c cVar) {
        return new C0366b(aVar, str, obj, d(), cVar);
    }

    protected n j(B2.a aVar, String str, Object[] objArr, boolean z10) {
        ArrayList arrayList = new ArrayList(objArr.length * 2);
        if (z10) {
            for (Object obj : objArr) {
                arrayList.add(i(aVar, str, obj, c.BITMAP_MEMORY_CACHE));
            }
        }
        for (Object obj2 : objArr) {
            arrayList.add(h(aVar, str, obj2));
        }
        return m2.f.b(arrayList);
    }

    public Object[] k() {
        return this.f33136g;
    }

    public Object l() {
        return this.f33134e;
    }

    public Object m() {
        return this.f33135f;
    }

    public B2.a n() {
        return this.f33145p;
    }

    public boolean o() {
        return this.f33142m;
    }

    public boolean r() {
        return this.f33143n;
    }

    protected void s(AbstractC3468a abstractC3468a) {
        Set set = this.f33131b;
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                abstractC3468a.k((InterfaceC3471d) it.next());
            }
        }
        Set set2 = this.f33132c;
        if (set2 != null) {
            Iterator it2 = set2.iterator();
            while (it2.hasNext()) {
                abstractC3468a.l((N2.b) it2.next());
            }
        }
        InterfaceC3471d interfaceC3471d = this.f33139j;
        if (interfaceC3471d != null) {
            abstractC3468a.k(interfaceC3471d);
        }
        if (this.f33141l) {
            abstractC3468a.k(f33127q);
        }
    }

    protected void t(AbstractC3468a abstractC3468a) {
        if (abstractC3468a.v() == null) {
            abstractC3468a.d0(A2.a.c(this.f33130a));
        }
    }

    protected void u(AbstractC3468a abstractC3468a) {
        if (this.f33140k) {
            abstractC3468a.B().d(this.f33140k);
            t(abstractC3468a);
        }
    }

    protected abstract AbstractC3468a v();

    protected n w(B2.a aVar, String str) {
        n nVarJ;
        n nVar = this.f33138i;
        if (nVar != null) {
            return nVar;
        }
        Object obj = this.f33134e;
        if (obj != null) {
            nVarJ = h(aVar, str, obj);
        } else {
            Object[] objArr = this.f33136g;
            nVarJ = objArr != null ? j(aVar, str, objArr, this.f33137h) : null;
        }
        if (nVarJ != null && this.f33135f != null) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(nVarJ);
            arrayList.add(h(aVar, str, this.f33135f));
            nVarJ = h.c(arrayList, false);
        }
        return nVarJ == null ? m2.d.a(f33128r) : nVarJ;
    }

    public AbstractC3469b x() {
        q();
        return p();
    }

    public AbstractC3469b y(boolean z10) {
        this.f33141l = z10;
        return p();
    }

    public AbstractC3469b z(Object obj) {
        this.f33133d = obj;
        return p();
    }

    protected final AbstractC3469b p() {
        return this;
    }
}
