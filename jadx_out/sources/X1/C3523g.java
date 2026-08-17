package x1;

import B1.n;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import x1.RunnableC3524h;
import z1.InterfaceC3666a;

/* JADX INFO: renamed from: x1.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C3523g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f33292a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f33293b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.bumptech.glide.d f33294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f33295d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f33296e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f33297f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Class f33298g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private RunnableC3524h.e f33299h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private v1.h f33300i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map f33301j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Class f33302k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f33303l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f33304m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private v1.f f33305n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private com.bumptech.glide.g f33306o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private AbstractC3526j f33307p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f33308q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f33309r;

    C3523g() {
    }

    void a() {
        this.f33294c = null;
        this.f33295d = null;
        this.f33305n = null;
        this.f33298g = null;
        this.f33302k = null;
        this.f33300i = null;
        this.f33306o = null;
        this.f33301j = null;
        this.f33307p = null;
        this.f33292a.clear();
        this.f33303l = false;
        this.f33293b.clear();
        this.f33304m = false;
    }

    y1.b b() {
        return this.f33294c.a();
    }

    List c() {
        if (!this.f33304m) {
            this.f33304m = true;
            this.f33293b.clear();
            List listG = g();
            int size = listG.size();
            for (int i10 = 0; i10 < size; i10++) {
                n.a aVar = (n.a) listG.get(i10);
                if (!this.f33293b.contains(aVar.f299a)) {
                    this.f33293b.add(aVar.f299a);
                }
                for (int i11 = 0; i11 < aVar.f300b.size(); i11++) {
                    if (!this.f33293b.contains(aVar.f300b.get(i11))) {
                        this.f33293b.add((v1.f) aVar.f300b.get(i11));
                    }
                }
            }
        }
        return this.f33293b;
    }

    InterfaceC3666a d() {
        return this.f33299h.a();
    }

    AbstractC3526j e() {
        return this.f33307p;
    }

    int f() {
        return this.f33297f;
    }

    List g() {
        if (!this.f33303l) {
            this.f33303l = true;
            this.f33292a.clear();
            List listI = this.f33294c.h().i(this.f33295d);
            int size = listI.size();
            for (int i10 = 0; i10 < size; i10++) {
                n.a aVarBuildLoadData = ((B1.n) listI.get(i10)).buildLoadData(this.f33295d, this.f33296e, this.f33297f, this.f33300i);
                if (aVarBuildLoadData != null) {
                    this.f33292a.add(aVarBuildLoadData);
                }
            }
        }
        return this.f33292a;
    }

    t h(Class cls) {
        return this.f33294c.h().h(cls, this.f33298g, this.f33302k);
    }

    Class i() {
        return this.f33295d.getClass();
    }

    List j(File file) {
        return this.f33294c.h().i(file);
    }

    v1.h k() {
        return this.f33300i;
    }

    com.bumptech.glide.g l() {
        return this.f33306o;
    }

    List m() {
        return this.f33294c.h().j(this.f33295d.getClass(), this.f33298g, this.f33302k);
    }

    v1.k n(v vVar) {
        return this.f33294c.h().k(vVar);
    }

    com.bumptech.glide.load.data.e o(Object obj) {
        return this.f33294c.h().l(obj);
    }

    v1.f p() {
        return this.f33305n;
    }

    v1.d q(Object obj) {
        return this.f33294c.h().m(obj);
    }

    Class r() {
        return this.f33302k;
    }

    v1.l s(Class cls) {
        v1.l lVar = (v1.l) this.f33301j.get(cls);
        if (lVar == null) {
            Iterator it = this.f33301j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    lVar = (v1.l) entry.getValue();
                    break;
                }
            }
        }
        if (lVar != null) {
            return lVar;
        }
        if (!this.f33301j.isEmpty() || !this.f33308q) {
            return D1.n.b();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    int t() {
        return this.f33296e;
    }

    boolean u(Class cls) {
        return h(cls) != null;
    }

    void v(com.bumptech.glide.d dVar, Object obj, v1.f fVar, int i10, int i11, AbstractC3526j abstractC3526j, Class cls, Class cls2, com.bumptech.glide.g gVar, v1.h hVar, Map map, boolean z10, boolean z11, RunnableC3524h.e eVar) {
        this.f33294c = dVar;
        this.f33295d = obj;
        this.f33305n = fVar;
        this.f33296e = i10;
        this.f33297f = i11;
        this.f33307p = abstractC3526j;
        this.f33298g = cls;
        this.f33299h = eVar;
        this.f33302k = cls2;
        this.f33306o = gVar;
        this.f33300i = hVar;
        this.f33301j = map;
        this.f33308q = z10;
        this.f33309r = z11;
    }

    boolean w(v vVar) {
        return this.f33294c.h().n(vVar);
    }

    boolean x() {
        return this.f33309r;
    }

    boolean y(v1.f fVar) {
        List listG = g();
        int size = listG.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((n.a) listG.get(i10)).f299a.equals(fVar)) {
                return true;
            }
        }
        return false;
    }
}
