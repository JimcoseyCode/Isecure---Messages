package com.facebook.imagepipeline.producers;

import Y2.InterfaceC1535v;
import com.facebook.hermes.intl.Constants;
import com.facebook.imagepipeline.request.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C1969e implements e0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Set f20073t = c2.h.o("id", "uri_source");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Object f20074u = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.facebook.imagepipeline.request.b f20075g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f20076h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f20077i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final g0 f20078j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Object f20079k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final b.c f20080l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Map f20081m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f20082n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private X2.f f20083o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f20084p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f20085q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final List f20086r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final InterfaceC1535v f20087s;

    public C1969e(com.facebook.imagepipeline.request.b bVar, String str, g0 g0Var, Object obj, b.c cVar, boolean z10, boolean z11, X2.f fVar, InterfaceC1535v interfaceC1535v) {
        this(bVar, str, null, null, g0Var, obj, cVar, z10, z11, fVar, interfaceC1535v);
    }

    public static void a(List list) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((f0) it.next()).a();
        }
    }

    public static void b(List list) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((f0) it.next()).b();
        }
    }

    public static void c(List list) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((f0) it.next()).d();
        }
    }

    public static void f(List list) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((f0) it.next()).c();
        }
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public synchronized boolean A() {
        return this.f20082n;
    }

    @Override // M2.a
    public Object B(String str) {
        return this.f20081m.get(str);
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public String I() {
        return this.f20077i;
    }

    @Override // M2.a
    public void J(String str, Object obj) {
        if (f20073t.contains(str)) {
            return;
        }
        this.f20081m.put(str, obj);
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public void M(String str) {
        r(str, Constants.COLLATION_DEFAULT);
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public g0 W() {
        return this.f20078j;
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public synchronized boolean X() {
        return this.f20084p;
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public Object d() {
        return this.f20079k;
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public b.c d0() {
        return this.f20080l;
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public com.facebook.imagepipeline.request.b e() {
        return this.f20075g;
    }

    public void g() {
        a(h());
    }

    @Override // M2.a
    public Map getExtras() {
        return this.f20081m;
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public String getId() {
        return this.f20076h;
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public synchronized X2.f getPriority() {
        return this.f20083o;
    }

    public synchronized List h() {
        if (this.f20085q) {
            return null;
        }
        this.f20085q = true;
        return new ArrayList(this.f20086r);
    }

    public synchronized List j(boolean z10) {
        if (z10 == this.f20084p) {
            return null;
        }
        this.f20084p = z10;
        return new ArrayList(this.f20086r);
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public void k(f0 f0Var) {
        boolean z10;
        synchronized (this) {
            this.f20086r.add(f0Var);
            z10 = this.f20085q;
        }
        if (z10) {
            f0Var.a();
        }
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public InterfaceC1535v m() {
        return this.f20087s;
    }

    public synchronized List n(boolean z10) {
        if (z10 == this.f20082n) {
            return null;
        }
        this.f20082n = z10;
        return new ArrayList(this.f20086r);
    }

    public synchronized List o(X2.f fVar) {
        if (fVar == this.f20083o) {
            return null;
        }
        this.f20083o = fVar;
        return new ArrayList(this.f20086r);
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public void r(String str, String str2) {
        this.f20081m.put("origin", str);
        this.f20081m.put("origin_sub", str2);
    }

    @Override // M2.a
    public void s(Map map) {
        if (map == null) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            J((String) entry.getKey(), entry.getValue());
        }
    }

    public C1969e(com.facebook.imagepipeline.request.b bVar, String str, String str2, Map map, g0 g0Var, Object obj, b.c cVar, boolean z10, boolean z11, X2.f fVar, InterfaceC1535v interfaceC1535v) {
        this.f20075g = bVar;
        this.f20076h = str;
        HashMap map2 = new HashMap();
        this.f20081m = map2;
        map2.put("id", str);
        map2.put("uri_source", bVar == null ? "null-request" : bVar.getSourceUri());
        s(map);
        this.f20077i = str2;
        this.f20078j = g0Var;
        this.f20079k = obj == null ? f20074u : obj;
        this.f20080l = cVar;
        this.f20082n = z10;
        this.f20083o = fVar;
        this.f20084p = z11;
        this.f20085q = false;
        this.f20086r = new ArrayList();
        this.f20087s = interfaceC1535v;
    }
}
