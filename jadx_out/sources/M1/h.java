package M1;

import F1.i;
import Q1.l;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.c;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import v1.EnumC3417a;
import x1.AbstractC3526j;
import x1.C3527k;
import x1.q;
import x1.v;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements c, N1.c, g {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final boolean f7416E = Log.isLoggable("GlideRequest", 2);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f7417A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f7418B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f7419C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private RuntimeException f7420D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f7421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f7422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final R1.c f7423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f7424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e f7425e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.bumptech.glide.request.b f7426f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Context f7427g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.bumptech.glide.d f7428h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Object f7429i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Class f7430j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final M1.a f7431k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f7432l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f7433m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.bumptech.glide.g f7434n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final N1.d f7435o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final List f7436p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final O1.c f7437q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Executor f7438r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private v f7439s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private C3527k.d f7440t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f7441u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private volatile C3527k f7442v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private a f7443w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Drawable f7444x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Drawable f7445y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Drawable f7446z;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private enum a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    private h(Context context, com.bumptech.glide.d dVar, Object obj, Object obj2, Class cls, M1.a aVar, int i10, int i11, com.bumptech.glide.g gVar, N1.d dVar2, e eVar, List list, com.bumptech.glide.request.b bVar, C3527k c3527k, O1.c cVar, Executor executor) {
        this.f7422b = f7416E ? String.valueOf(super.hashCode()) : null;
        this.f7423c = R1.c.a();
        this.f7424d = obj;
        this.f7427g = context;
        this.f7428h = dVar;
        this.f7429i = obj2;
        this.f7430j = cls;
        this.f7431k = aVar;
        this.f7432l = i10;
        this.f7433m = i11;
        this.f7434n = gVar;
        this.f7435o = dVar2;
        this.f7425e = eVar;
        this.f7436p = list;
        this.f7426f = bVar;
        this.f7442v = c3527k;
        this.f7437q = cVar;
        this.f7438r = executor;
        this.f7443w = a.PENDING;
        if (this.f7420D == null && dVar.f().a(c.C0203c.class)) {
            this.f7420D = new RuntimeException("Glide request origin trace");
        }
    }

    private void e() {
        if (this.f7419C) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    private boolean f() {
        com.bumptech.glide.request.b bVar = this.f7426f;
        return bVar == null || bVar.canNotifyCleared(this);
    }

    private boolean g() {
        com.bumptech.glide.request.b bVar = this.f7426f;
        return bVar == null || bVar.canNotifyStatusChanged(this);
    }

    private boolean h() {
        com.bumptech.glide.request.b bVar = this.f7426f;
        return bVar == null || bVar.canSetImage(this);
    }

    private void i() {
        e();
        this.f7423c.c();
        this.f7435o.removeCallback(this);
        C3527k.d dVar = this.f7440t;
        if (dVar != null) {
            dVar.a();
            this.f7440t = null;
        }
    }

    private void j(Object obj) {
        List<e> list = this.f7436p;
        if (list == null) {
            return;
        }
        for (e eVar : list) {
        }
    }

    private Drawable k() {
        if (this.f7444x == null) {
            Drawable drawableM = this.f7431k.m();
            this.f7444x = drawableM;
            if (drawableM == null && this.f7431k.l() > 0) {
                this.f7444x = o(this.f7431k.l());
            }
        }
        return this.f7444x;
    }

    private Drawable l() {
        if (this.f7446z == null) {
            Drawable drawableN = this.f7431k.n();
            this.f7446z = drawableN;
            if (drawableN == null && this.f7431k.o() > 0) {
                this.f7446z = o(this.f7431k.o());
            }
        }
        return this.f7446z;
    }

    private Drawable m() {
        if (this.f7445y == null) {
            Drawable drawableU = this.f7431k.u();
            this.f7445y = drawableU;
            if (drawableU == null && this.f7431k.v() > 0) {
                this.f7445y = o(this.f7431k.v());
            }
        }
        return this.f7445y;
    }

    private boolean n() {
        com.bumptech.glide.request.b bVar = this.f7426f;
        return bVar == null || !bVar.getRoot().isAnyResourceSet();
    }

    private Drawable o(int i10) {
        return i.a(this.f7427g, i10, this.f7431k.A() != null ? this.f7431k.A() : this.f7427g.getTheme());
    }

    private static int q(int i10, float f10) {
        return i10 == Integer.MIN_VALUE ? i10 : Math.round(f10 * i10);
    }

    private void r() {
        com.bumptech.glide.request.b bVar = this.f7426f;
        if (bVar != null) {
            bVar.onRequestFailed(this);
        }
    }

    private void s() {
        com.bumptech.glide.request.b bVar = this.f7426f;
        if (bVar != null) {
            bVar.onRequestSuccess(this);
        }
    }

    public static h t(Context context, com.bumptech.glide.d dVar, Object obj, Object obj2, Class cls, M1.a aVar, int i10, int i11, com.bumptech.glide.g gVar, N1.d dVar2, e eVar, List list, com.bumptech.glide.request.b bVar, C3527k c3527k, O1.c cVar, Executor executor) {
        return new h(context, dVar, obj, obj2, cls, aVar, i10, i11, gVar, dVar2, eVar, list, bVar, c3527k, cVar, executor);
    }

    private void u(q qVar, int i10) {
        boolean zOnLoadFailed;
        this.f7423c.c();
        synchronized (this.f7424d) {
            try {
                qVar.k(this.f7420D);
                int iG = this.f7428h.g();
                if (iG <= i10) {
                    Objects.toString(this.f7429i);
                    if (iG <= 4) {
                        qVar.g("Glide");
                    }
                }
                this.f7440t = null;
                this.f7443w = a.FAILED;
                r();
                boolean z10 = true;
                this.f7419C = true;
                try {
                    List list = this.f7436p;
                    if (list != null) {
                        Iterator it = list.iterator();
                        zOnLoadFailed = false;
                        while (it.hasNext()) {
                            zOnLoadFailed |= ((e) it.next()).onLoadFailed(qVar, this.f7429i, this.f7435o, n());
                        }
                    } else {
                        zOnLoadFailed = false;
                    }
                    e eVar = this.f7425e;
                    if (eVar == null || !eVar.onLoadFailed(qVar, this.f7429i, this.f7435o, n())) {
                        z10 = false;
                    }
                    if (!(zOnLoadFailed | z10)) {
                        w();
                    }
                    this.f7419C = false;
                    R1.b.f("GlideRequest", this.f7421a);
                } catch (Throwable th) {
                    this.f7419C = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void v(v vVar, Object obj, EnumC3417a enumC3417a, boolean z10) {
        boolean zOnResourceReady;
        boolean zN = n();
        this.f7443w = a.COMPLETE;
        this.f7439s = vVar;
        if (this.f7428h.g() <= 3) {
            obj.getClass();
            Objects.toString(enumC3417a);
            Objects.toString(this.f7429i);
            Q1.g.a(this.f7441u);
        }
        s();
        boolean z11 = true;
        this.f7419C = true;
        try {
            List list = this.f7436p;
            if (list != null) {
                Iterator it = list.iterator();
                zOnResourceReady = false;
                while (it.hasNext()) {
                    Object obj2 = obj;
                    EnumC3417a enumC3417a2 = enumC3417a;
                    zOnResourceReady |= ((e) it.next()).onResourceReady(obj2, this.f7429i, this.f7435o, enumC3417a2, zN);
                    obj = obj2;
                    enumC3417a = enumC3417a2;
                }
            } else {
                zOnResourceReady = false;
            }
            Object obj3 = obj;
            EnumC3417a enumC3417a3 = enumC3417a;
            e eVar = this.f7425e;
            if (eVar == null || !eVar.onResourceReady(obj3, this.f7429i, this.f7435o, enumC3417a3, zN)) {
                z11 = false;
            }
            if (!(z11 | zOnResourceReady)) {
                this.f7435o.onResourceReady(obj3, this.f7437q.a(enumC3417a3, zN));
            }
            this.f7419C = false;
            R1.b.f("GlideRequest", this.f7421a);
        } catch (Throwable th) {
            this.f7419C = false;
            throw th;
        }
    }

    private void w() {
        if (g()) {
            Drawable drawableL = this.f7429i == null ? l() : null;
            if (drawableL == null) {
                drawableL = k();
            }
            if (drawableL == null) {
                drawableL = m();
            }
            this.f7435o.onLoadFailed(drawableL);
        }
    }

    @Override // M1.g
    public void a(q qVar) {
        u(qVar, 5);
    }

    @Override // M1.g
    public void b(v vVar, EnumC3417a enumC3417a, boolean z10) {
        this.f7423c.c();
        v vVar2 = null;
        try {
            synchronized (this.f7424d) {
                try {
                    this.f7440t = null;
                    if (vVar == null) {
                        a(new q("Expected to receive a Resource<R> with an object of " + this.f7430j + " inside, but instead got null."));
                        return;
                    }
                    Object obj = vVar.get();
                    try {
                        if (obj == null || !this.f7430j.isAssignableFrom(obj.getClass())) {
                            this.f7439s = null;
                            StringBuilder sb = new StringBuilder();
                            sb.append("Expected to receive an object of ");
                            sb.append(this.f7430j);
                            sb.append(" but instead got ");
                            sb.append(obj != null ? obj.getClass() : PointerEventHelper.POINTER_TYPE_UNKNOWN);
                            sb.append("{");
                            sb.append(obj);
                            sb.append("} inside Resource{");
                            sb.append(vVar);
                            sb.append("}.");
                            sb.append(obj != null ? PointerEventHelper.POINTER_TYPE_UNKNOWN : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                            a(new q(sb.toString()));
                        } else if (h()) {
                            v(vVar, obj, enumC3417a, z10);
                            return;
                        } else {
                            this.f7439s = null;
                            this.f7443w = a.COMPLETE;
                            R1.b.f("GlideRequest", this.f7421a);
                        }
                        this.f7442v.l(vVar);
                    } catch (Throwable th) {
                        vVar2 = vVar;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (vVar2 != null) {
                this.f7442v.l(vVar2);
            }
            throw th3;
        }
    }

    @Override // M1.c
    public void begin() {
        synchronized (this.f7424d) {
            try {
                e();
                this.f7423c.c();
                this.f7441u = Q1.g.b();
                Object obj = this.f7429i;
                if (obj == null) {
                    if (l.u(this.f7432l, this.f7433m)) {
                        this.f7417A = this.f7432l;
                        this.f7418B = this.f7433m;
                    }
                    u(new q("Received null model"), l() == null ? 5 : 3);
                    return;
                }
                a aVar = this.f7443w;
                a aVar2 = a.RUNNING;
                if (aVar == aVar2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (aVar == a.COMPLETE) {
                    b(this.f7439s, EnumC3417a.MEMORY_CACHE, false);
                    return;
                }
                j(obj);
                this.f7421a = R1.b.b("GlideRequest");
                a aVar3 = a.WAITING_FOR_SIZE;
                this.f7443w = aVar3;
                if (l.u(this.f7432l, this.f7433m)) {
                    c(this.f7432l, this.f7433m);
                } else {
                    this.f7435o.getSize(this);
                }
                a aVar4 = this.f7443w;
                if ((aVar4 == aVar2 || aVar4 == aVar3) && g()) {
                    this.f7435o.onLoadStarted(m());
                }
                if (f7416E) {
                    p("finished run method in " + Q1.g.a(this.f7441u));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // N1.c
    public void c(int i10, int i11) throws Throwable {
        Object obj;
        h hVar = this;
        hVar.f7423c.c();
        Object obj2 = hVar.f7424d;
        synchronized (obj2) {
            try {
                try {
                    boolean z10 = f7416E;
                    if (z10) {
                        hVar.p("Got onSizeReady in " + Q1.g.a(hVar.f7441u));
                    }
                    if (hVar.f7443w == a.WAITING_FOR_SIZE) {
                        a aVar = a.RUNNING;
                        hVar.f7443w = aVar;
                        float fZ = hVar.f7431k.z();
                        hVar.f7417A = q(i10, fZ);
                        hVar.f7418B = q(i11, fZ);
                        if (z10) {
                            hVar.p("finished setup for calling load in " + Q1.g.a(hVar.f7441u));
                        }
                        try {
                            C3527k c3527k = hVar.f7442v;
                            com.bumptech.glide.d dVar = hVar.f7428h;
                            try {
                                Object obj3 = hVar.f7429i;
                                v1.f fVarY = hVar.f7431k.y();
                                try {
                                    int i12 = hVar.f7417A;
                                    int i13 = hVar.f7418B;
                                    Class clsX = hVar.f7431k.x();
                                    Class cls = hVar.f7430j;
                                    try {
                                        com.bumptech.glide.g gVar = hVar.f7434n;
                                        AbstractC3526j abstractC3526jK = hVar.f7431k.k();
                                        Map mapB = hVar.f7431k.B();
                                        boolean zL = hVar.f7431k.L();
                                        boolean zI = hVar.f7431k.I();
                                        v1.h hVarQ = hVar.f7431k.q();
                                        boolean zG = hVar.f7431k.G();
                                        boolean zD = hVar.f7431k.D();
                                        boolean zC = hVar.f7431k.C();
                                        boolean zP = hVar.f7431k.p();
                                        Executor executor = hVar.f7438r;
                                        Object obj4 = obj2;
                                        try {
                                            hVar.f7440t = c3527k.g(dVar, obj3, fVarY, i12, i13, clsX, cls, gVar, abstractC3526jK, mapB, zL, zI, hVarQ, zG, zD, zC, zP, hVar, executor);
                                            if (hVar.f7443w != aVar) {
                                                hVar.f7440t = null;
                                            }
                                            if (z10) {
                                                hVar.p("finished onSizeReady in " + Q1.g.a(hVar.f7441u));
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            obj = obj4;
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        obj = obj2;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    obj = obj2;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                obj = obj2;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            obj = obj2;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                    obj = obj2;
                }
            } catch (Throwable th7) {
                th = th7;
                obj = hVar;
            }
        }
    }

    @Override // M1.c
    public void clear() {
        synchronized (this.f7424d) {
            try {
                e();
                this.f7423c.c();
                a aVar = this.f7443w;
                a aVar2 = a.CLEARED;
                if (aVar == aVar2) {
                    return;
                }
                i();
                v vVar = this.f7439s;
                if (vVar != null) {
                    this.f7439s = null;
                } else {
                    vVar = null;
                }
                if (f()) {
                    this.f7435o.onLoadCleared(m());
                }
                R1.b.f("GlideRequest", this.f7421a);
                this.f7443w = aVar2;
                if (vVar != null) {
                    this.f7442v.l(vVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M1.g
    public Object d() {
        this.f7423c.c();
        return this.f7424d;
    }

    @Override // M1.c
    public boolean isAnyResourceSet() {
        boolean z10;
        synchronized (this.f7424d) {
            z10 = this.f7443w == a.COMPLETE;
        }
        return z10;
    }

    @Override // M1.c
    public boolean isCleared() {
        boolean z10;
        synchronized (this.f7424d) {
            z10 = this.f7443w == a.CLEARED;
        }
        return z10;
    }

    @Override // M1.c
    public boolean isComplete() {
        boolean z10;
        synchronized (this.f7424d) {
            z10 = this.f7443w == a.COMPLETE;
        }
        return z10;
    }

    @Override // M1.c
    public boolean isEquivalentTo(c cVar) {
        int i10;
        int i11;
        Object obj;
        Class cls;
        M1.a aVar;
        com.bumptech.glide.g gVar;
        int size;
        int i12;
        int i13;
        Object obj2;
        Class cls2;
        M1.a aVar2;
        com.bumptech.glide.g gVar2;
        int size2;
        if (!(cVar instanceof h)) {
            return false;
        }
        synchronized (this.f7424d) {
            try {
                i10 = this.f7432l;
                i11 = this.f7433m;
                obj = this.f7429i;
                cls = this.f7430j;
                aVar = this.f7431k;
                gVar = this.f7434n;
                List list = this.f7436p;
                size = list != null ? list.size() : 0;
            } finally {
            }
        }
        h hVar = (h) cVar;
        synchronized (hVar.f7424d) {
            try {
                i12 = hVar.f7432l;
                i13 = hVar.f7433m;
                obj2 = hVar.f7429i;
                cls2 = hVar.f7430j;
                aVar2 = hVar.f7431k;
                gVar2 = hVar.f7434n;
                List list2 = hVar.f7436p;
                size2 = list2 != null ? list2.size() : 0;
            } finally {
            }
        }
        return i10 == i12 && i11 == i13 && l.d(obj, obj2) && cls.equals(cls2) && l.c(aVar, aVar2) && gVar == gVar2 && size == size2;
    }

    @Override // M1.c
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f7424d) {
            try {
                a aVar = this.f7443w;
                z10 = aVar == a.RUNNING || aVar == a.WAITING_FOR_SIZE;
            } finally {
            }
        }
        return z10;
    }

    @Override // M1.c
    public void pause() {
        synchronized (this.f7424d) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        Object obj;
        Class cls;
        synchronized (this.f7424d) {
            obj = this.f7429i;
            cls = this.f7430j;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }

    private void p(String str) {
    }
}
