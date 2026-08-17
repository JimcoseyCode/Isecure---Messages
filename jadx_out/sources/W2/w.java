package W2;

import W2.n;
import W2.x;
import android.os.SystemClock;
import g2.AbstractC2662a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class w implements n, x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n.b f12014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final m f12015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final m f12016c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final D f12018e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final x.a f12019f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c2.n f12020g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected y f12021h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f12023j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f12024k;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Map f12017d = new WeakHashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f12022i = SystemClock.uptimeMillis();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements D {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ D f12025a;

        a(D d10) {
            this.f12025a = d10;
        }

        @Override // W2.D
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int a(n.a aVar) {
            return w.this.f12023j ? aVar.f12004g : this.f12025a.a(aVar.f11999b.J());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b implements g2.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n.a f12027a;

        b(n.a aVar) {
            this.f12027a = aVar;
        }

        @Override // g2.h
        public void release(Object obj) {
            w.this.y(this.f12027a);
        }
    }

    public w(D d10, x.a aVar, c2.n nVar, n.b bVar, boolean z10, boolean z11) {
        this.f12018e = d10;
        this.f12015b = new m(A(d10));
        this.f12016c = new m(A(d10));
        this.f12019f = aVar;
        this.f12020g = nVar;
        this.f12021h = (y) c2.k.h((y) nVar.get(), "mMemoryCacheParamsSupplier returned null");
        this.f12014a = bVar;
        this.f12023j = z10;
        this.f12024k = z11;
    }

    private D A(D d10) {
        return new a(d10);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized boolean i(int i10) {
        boolean z10;
        if (i10 <= this.f12021h.f12033e) {
            if (k() <= this.f12021h.f12030b - 1) {
                z10 = l() <= this.f12021h.f12029a - i10;
            }
        }
        return z10;
    }

    private synchronized void j(n.a aVar) {
        c2.k.g(aVar);
        c2.k.i(aVar.f12000c > 0);
        aVar.f12000c--;
    }

    private synchronized void m(n.a aVar) {
        c2.k.g(aVar);
        c2.k.i(!aVar.f12001d);
        aVar.f12000c++;
    }

    private synchronized void n(n.a aVar) {
        c2.k.g(aVar);
        c2.k.i(!aVar.f12001d);
        aVar.f12001d = true;
    }

    private synchronized void o(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                n((n.a) it.next());
            }
        }
    }

    private synchronized boolean p(n.a aVar) {
        if (aVar.f12001d || aVar.f12000c != 0) {
            return false;
        }
        this.f12015b.h(aVar.f11998a, aVar);
        return true;
    }

    private void q(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC2662a.B(x((n.a) it.next()));
            }
        }
    }

    private static void s(n.a aVar) {
        n.b bVar;
        if (aVar == null || (bVar = aVar.f12002e) == null) {
            return;
        }
        bVar.a(aVar.f11998a, true);
    }

    private static void t(n.a aVar) {
        n.b bVar;
        if (aVar == null || (bVar = aVar.f12002e) == null) {
            return;
        }
        bVar.a(aVar.f11998a, false);
    }

    private void u(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                t((n.a) it.next());
            }
        }
    }

    private synchronized void v() {
        if (this.f12022i + this.f12021h.f12034f > SystemClock.uptimeMillis()) {
            return;
        }
        this.f12022i = SystemClock.uptimeMillis();
        this.f12021h = (y) c2.k.h((y) this.f12020g.get(), "mMemoryCacheParamsSupplier returned null");
    }

    private synchronized AbstractC2662a w(n.a aVar) {
        m(aVar);
        return AbstractC2662a.w0(aVar.f11999b.J(), new b(aVar));
    }

    private synchronized AbstractC2662a x(n.a aVar) {
        c2.k.g(aVar);
        return (aVar.f12001d && aVar.f12000c == 0) ? aVar.f11999b : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(n.a aVar) {
        boolean zP;
        AbstractC2662a abstractC2662aX;
        c2.k.g(aVar);
        synchronized (this) {
            j(aVar);
            zP = p(aVar);
            abstractC2662aX = x(aVar);
        }
        AbstractC2662a.B(abstractC2662aX);
        if (!zP) {
            aVar = null;
        }
        s(aVar);
        v();
        r();
    }

    private synchronized ArrayList z(int i10, int i11) {
        int iMax = Math.max(i10, 0);
        int iMax2 = Math.max(i11, 0);
        if (this.f12015b.c() <= iMax && this.f12015b.f() <= iMax2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (this.f12015b.c() <= iMax && this.f12015b.f() <= iMax2) {
                break;
            }
            Object objD = this.f12015b.d();
            if (objD != null) {
                this.f12015b.i(objD);
                arrayList.add((n.a) this.f12016c.i(objD));
            } else {
                if (!this.f12024k) {
                    throw new IllegalStateException(String.format("key is null, but exclusiveEntries count: %d, size: %d", Integer.valueOf(this.f12015b.c()), Integer.valueOf(this.f12015b.f())));
                }
                this.f12015b.k();
            }
        }
        return arrayList;
    }

    @Override // W2.x
    public void a(Object obj) {
        c2.k.g(obj);
        synchronized (this) {
            try {
                n.a aVar = (n.a) this.f12015b.i(obj);
                if (aVar != null) {
                    this.f12015b.h(obj, aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // W2.x
    public synchronized boolean b(c2.l lVar) {
        return !this.f12016c.e(lVar).isEmpty();
    }

    @Override // W2.n
    public AbstractC2662a c(Object obj) {
        n.a aVar;
        boolean z10;
        AbstractC2662a abstractC2662a;
        c2.k.g(obj);
        synchronized (this) {
            try {
                aVar = (n.a) this.f12015b.i(obj);
                if (aVar != null) {
                    n.a aVar2 = (n.a) this.f12016c.i(obj);
                    c2.k.g(aVar2);
                    c2.k.i(aVar2.f12000c == 0);
                    abstractC2662a = aVar2.f11999b;
                    z10 = true;
                } else {
                    abstractC2662a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z10) {
            t(aVar);
        }
        return abstractC2662a;
    }

    @Override // W2.x
    public synchronized boolean contains(Object obj) {
        return this.f12016c.a(obj);
    }

    @Override // W2.x
    public int d(c2.l lVar) {
        ArrayList arrayListJ;
        ArrayList arrayListJ2;
        synchronized (this) {
            arrayListJ = this.f12015b.j(lVar);
            arrayListJ2 = this.f12016c.j(lVar);
            o(arrayListJ2);
        }
        q(arrayListJ2);
        u(arrayListJ);
        v();
        r();
        return arrayListJ2.size();
    }

    @Override // W2.n
    public AbstractC2662a e(Object obj, AbstractC2662a abstractC2662a, n.b bVar) {
        n.a aVar;
        AbstractC2662a abstractC2662aW;
        AbstractC2662a abstractC2662aX;
        c2.k.g(obj);
        c2.k.g(abstractC2662a);
        v();
        synchronized (this) {
            try {
                aVar = (n.a) this.f12015b.i(obj);
                n.a aVar2 = (n.a) this.f12016c.i(obj);
                abstractC2662aW = null;
                if (aVar2 != null) {
                    n(aVar2);
                    abstractC2662aX = x(aVar2);
                } else {
                    abstractC2662aX = null;
                }
                int iA = this.f12018e.a(abstractC2662a.J());
                if (i(iA)) {
                    n.a aVarA = this.f12023j ? n.a.a(obj, abstractC2662a, iA, bVar) : n.a.b(obj, abstractC2662a, bVar);
                    this.f12016c.h(obj, aVarA);
                    abstractC2662aW = w(aVarA);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        AbstractC2662a.B(abstractC2662aX);
        t(aVar);
        r();
        return abstractC2662aW;
    }

    @Override // W2.x
    public AbstractC2662a f(Object obj, AbstractC2662a abstractC2662a) {
        return e(obj, abstractC2662a, this.f12014a);
    }

    @Override // W2.x
    public AbstractC2662a get(Object obj) {
        n.a aVar;
        AbstractC2662a abstractC2662aW;
        c2.k.g(obj);
        synchronized (this) {
            try {
                aVar = (n.a) this.f12015b.i(obj);
                n.a aVar2 = (n.a) this.f12016c.b(obj);
                abstractC2662aW = aVar2 != null ? w(aVar2) : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        t(aVar);
        v();
        r();
        return abstractC2662aW;
    }

    public synchronized int k() {
        return this.f12016c.c() - this.f12015b.c();
    }

    public synchronized int l() {
        return this.f12016c.f() - this.f12015b.f();
    }

    public void r() {
        ArrayList arrayListZ;
        synchronized (this) {
            y yVar = this.f12021h;
            int iMin = Math.min(yVar.f12032d, yVar.f12030b - k());
            y yVar2 = this.f12021h;
            arrayListZ = z(iMin, Math.min(yVar2.f12031c, yVar2.f12029a - l()));
            o(arrayListZ);
        }
        q(arrayListZ);
        u(arrayListZ);
    }
}
