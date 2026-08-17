package com.bumptech.glide;

import J1.b;
import J1.p;
import J1.q;
import J1.s;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import x1.AbstractC3526j;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class k implements ComponentCallbacks2, J1.l {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final M1.f f19122s = (M1.f) M1.f.g0(Bitmap.class).N();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final M1.f f19123t = (M1.f) M1.f.g0(H1.c.class).N();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final M1.f f19124u = (M1.f) ((M1.f) M1.f.h0(AbstractC3526j.f33374c).R(g.LOW)).a0(true);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final com.bumptech.glide.b f19125g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final Context f19126h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final J1.j f19127i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final q f19128j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final p f19129k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final s f19130l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Runnable f19131m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final J1.b f19132n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final CopyOnWriteArrayList f19133o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private M1.f f19134p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f19135q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f19136r;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k kVar = k.this;
            kVar.f19127i.b(kVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class b implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final q f19138a;

        b(q qVar) {
            this.f19138a = qVar;
        }

        @Override // J1.b.a
        public void a(boolean z10) {
            if (z10) {
                synchronized (k.this) {
                    this.f19138a.e();
                }
            }
        }
    }

    public k(com.bumptech.glide.b bVar, J1.j jVar, p pVar, Context context) {
        this(bVar, jVar, pVar, new q(), bVar.h(), context);
    }

    private synchronized void f() {
        try {
            Iterator it = this.f19130l.b().iterator();
            while (it.hasNext()) {
                e((N1.d) it.next());
            }
            this.f19130l.a();
        } catch (Throwable th) {
            throw th;
        }
    }

    private void r(N1.d dVar) {
        boolean zQ = q(dVar);
        M1.c request = dVar.getRequest();
        if (zQ || this.f19125g.q(dVar) || request == null) {
            return;
        }
        dVar.setRequest(null);
        request.clear();
    }

    public j a(Class cls) {
        return new j(this.f19125g, this, cls, this.f19126h);
    }

    public j b() {
        return a(Bitmap.class).a(f19122s);
    }

    public j c() {
        return a(Drawable.class);
    }

    public j d() {
        return a(File.class).a(M1.f.j0(true));
    }

    public void e(N1.d dVar) {
        if (dVar == null) {
            return;
        }
        r(dVar);
    }

    List g() {
        return this.f19133o;
    }

    synchronized M1.f h() {
        return this.f19134p;
    }

    l i(Class cls) {
        return this.f19125g.j().d(cls);
    }

    public j j(Object obj) {
        return c().x0(obj);
    }

    public synchronized void k() {
        this.f19128j.c();
    }

    public synchronized void l() {
        k();
        Iterator it = this.f19129k.a().iterator();
        while (it.hasNext()) {
            ((k) it.next()).k();
        }
    }

    public synchronized void m() {
        this.f19128j.d();
    }

    public synchronized void n() {
        this.f19128j.f();
    }

    protected synchronized void o(M1.f fVar) {
        this.f19134p = (M1.f) ((M1.f) fVar.clone()).b();
    }

    @Override // J1.l
    public synchronized void onDestroy() {
        this.f19130l.onDestroy();
        f();
        this.f19128j.b();
        this.f19127i.a(this);
        this.f19127i.a(this.f19132n);
        Q1.l.x(this.f19131m);
        this.f19125g.t(this);
    }

    @Override // J1.l
    public synchronized void onStart() {
        n();
        this.f19130l.onStart();
    }

    @Override // J1.l
    public synchronized void onStop() {
        try {
            this.f19130l.onStop();
            if (this.f19136r) {
                f();
            } else {
                m();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        if (i10 == 60 && this.f19135q) {
            l();
        }
    }

    synchronized void p(N1.d dVar, M1.c cVar) {
        this.f19130l.c(dVar);
        this.f19128j.g(cVar);
    }

    synchronized boolean q(N1.d dVar) {
        M1.c request = dVar.getRequest();
        if (request == null) {
            return true;
        }
        if (!this.f19128j.a(request)) {
            return false;
        }
        this.f19130l.d(dVar);
        dVar.setRequest(null);
        return true;
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f19128j + ", treeNode=" + this.f19129k + "}";
    }

    k(com.bumptech.glide.b bVar, J1.j jVar, p pVar, q qVar, J1.c cVar, Context context) {
        this.f19130l = new s();
        a aVar = new a();
        this.f19131m = aVar;
        this.f19125g = bVar;
        this.f19127i = jVar;
        this.f19129k = pVar;
        this.f19128j = qVar;
        this.f19126h = context;
        J1.b bVarA = cVar.a(context.getApplicationContext(), new b(qVar));
        this.f19132n = bVarA;
        bVar.p(this);
        if (Q1.l.r()) {
            Q1.l.w(aVar);
        } else {
            jVar.b(this);
        }
        jVar.b(bVarA);
        this.f19133o = new CopyOnWriteArrayList(bVar.j().b());
        o(bVar.j().c());
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }
}
