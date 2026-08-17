package androidx.lifecycle;

import androidx.lifecycle.AbstractC1764k;
import java.util.Map;
import l.C2858c;
import m.b;

/* JADX INFO: renamed from: androidx.lifecycle.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1776x {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final Object f17619k = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f17620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private m.b f17621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f17622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f17623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Object f17624e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    volatile Object f17625f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f17626g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f17627h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f17628i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Runnable f17629j;

    /* JADX INFO: renamed from: androidx.lifecycle.x$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (AbstractC1776x.this.f17620a) {
                obj = AbstractC1776x.this.f17625f;
                AbstractC1776x.this.f17625f = AbstractC1776x.f17619k;
            }
            AbstractC1776x.this.n(obj);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.x$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class b extends d {
        b(B b10) {
            super(b10);
        }

        @Override // androidx.lifecycle.AbstractC1776x.d
        boolean d() {
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.x$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class c extends d implements InterfaceC1768o {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final r f17632k;

        c(r rVar, B b10) {
            super(b10);
            this.f17632k = rVar;
        }

        @Override // androidx.lifecycle.AbstractC1776x.d
        void b() {
            this.f17632k.getLifecycle().d(this);
        }

        @Override // androidx.lifecycle.AbstractC1776x.d
        boolean c(r rVar) {
            return this.f17632k == rVar;
        }

        @Override // androidx.lifecycle.AbstractC1776x.d
        boolean d() {
            return this.f17632k.getLifecycle().b().j(AbstractC1764k.b.f17593j);
        }

        @Override // androidx.lifecycle.InterfaceC1768o
        public void k(r rVar, AbstractC1764k.a aVar) {
            AbstractC1764k.b bVarB = this.f17632k.getLifecycle().b();
            if (bVarB == AbstractC1764k.b.f17590g) {
                AbstractC1776x.this.m(this.f17634g);
                return;
            }
            AbstractC1764k.b bVar = null;
            while (bVar != bVarB) {
                a(d());
                bVar = bVarB;
                bVarB = this.f17632k.getLifecycle().b();
            }
        }
    }

    public AbstractC1776x(Object obj) {
        this.f17620a = new Object();
        this.f17621b = new m.b();
        this.f17622c = 0;
        this.f17625f = f17619k;
        this.f17629j = new a();
        this.f17624e = obj;
        this.f17626g = 0;
    }

    static void a(String str) {
        if (C2858c.f().b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private void c(d dVar) {
        if (dVar.f17635h) {
            if (!dVar.d()) {
                dVar.a(false);
                return;
            }
            int i10 = dVar.f17636i;
            int i11 = this.f17626g;
            if (i10 >= i11) {
                return;
            }
            dVar.f17636i = i11;
            dVar.f17634g.onChanged(this.f17624e);
        }
    }

    void b(int i10) {
        int i11 = this.f17622c;
        this.f17622c = i10 + i11;
        if (this.f17623d) {
            return;
        }
        this.f17623d = true;
        while (true) {
            try {
                int i12 = this.f17622c;
                if (i11 == i12) {
                    this.f17623d = false;
                    return;
                }
                boolean z10 = i11 == 0 && i12 > 0;
                boolean z11 = i11 > 0 && i12 == 0;
                if (z10) {
                    j();
                } else if (z11) {
                    k();
                }
                i11 = i12;
            } catch (Throwable th) {
                this.f17623d = false;
                throw th;
            }
        }
    }

    void d(d dVar) {
        if (this.f17627h) {
            this.f17628i = true;
            return;
        }
        this.f17627h = true;
        do {
            this.f17628i = false;
            if (dVar != null) {
                c(dVar);
                dVar = null;
            } else {
                b.d dVarP = this.f17621b.p();
                while (dVarP.hasNext()) {
                    c((d) ((Map.Entry) dVarP.next()).getValue());
                    if (this.f17628i) {
                        break;
                    }
                }
            }
        } while (this.f17628i);
        this.f17627h = false;
    }

    public Object e() {
        Object obj = this.f17624e;
        if (obj != f17619k) {
            return obj;
        }
        return null;
    }

    int f() {
        return this.f17626g;
    }

    public boolean g() {
        return this.f17622c > 0;
    }

    public void h(r rVar, B b10) {
        a("observe");
        if (rVar.getLifecycle().b() == AbstractC1764k.b.f17590g) {
            return;
        }
        c cVar = new c(rVar, b10);
        d dVar = (d) this.f17621b.s(b10, cVar);
        if (dVar != null && !dVar.c(rVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVar != null) {
            return;
        }
        rVar.getLifecycle().a(cVar);
    }

    public void i(B b10) {
        a("observeForever");
        b bVar = new b(b10);
        d dVar = (d) this.f17621b.s(b10, bVar);
        if (dVar instanceof c) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVar != null) {
            return;
        }
        bVar.a(true);
    }

    protected void l(Object obj) {
        boolean z10;
        synchronized (this.f17620a) {
            z10 = this.f17625f == f17619k;
            this.f17625f = obj;
        }
        if (z10) {
            C2858c.f().c(this.f17629j);
        }
    }

    public void m(B b10) {
        a("removeObserver");
        d dVar = (d) this.f17621b.t(b10);
        if (dVar == null) {
            return;
        }
        dVar.b();
        dVar.a(false);
    }

    protected void n(Object obj) {
        a("setValue");
        this.f17626g++;
        this.f17624e = obj;
        d(null);
    }

    public AbstractC1776x() {
        this.f17620a = new Object();
        this.f17621b = new m.b();
        this.f17622c = 0;
        Object obj = f17619k;
        this.f17625f = obj;
        this.f17629j = new a();
        this.f17624e = obj;
        this.f17626g = -1;
    }

    /* JADX INFO: renamed from: androidx.lifecycle.x$d */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private abstract class d {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final B f17634g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f17635h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f17636i = -1;

        d(B b10) {
            this.f17634g = b10;
        }

        void a(boolean z10) {
            if (z10 == this.f17635h) {
                return;
            }
            this.f17635h = z10;
            AbstractC1776x.this.b(z10 ? 1 : -1);
            if (this.f17635h) {
                AbstractC1776x.this.d(this);
            }
        }

        boolean c(r rVar) {
            return false;
        }

        abstract boolean d();

        void b() {
        }
    }

    protected void j() {
    }

    protected void k() {
    }
}
