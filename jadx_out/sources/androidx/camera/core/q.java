package androidx.camera.core;

import F.B;
import F.F0;
import android.media.ImageReader;
import android.util.LongSparseArray;
import android.view.Surface;
import androidx.camera.core.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import y.AbstractC3583h0;
import y.Y;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class q implements F0, e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f15237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private F.r f15238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f15239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private F0.a f15240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f15241e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final F0 f15242f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    F0.a f15243g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Executor f15244h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final LongSparseArray f15245i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final LongSparseArray f15246j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f15247k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List f15248l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List f15249m;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends F.r {
        a() {
        }

        @Override // F.r
        public void b(int i10, B b10) {
            super.b(i10, b10);
            q.this.q(b10);
        }
    }

    public q(int i10, int i11, int i12, int i13) {
        this(j(i10, i11, i12, i13));
    }

    public static /* synthetic */ void h(q qVar, F0.a aVar) {
        qVar.getClass();
        aVar.a(qVar);
    }

    public static /* synthetic */ void i(q qVar, F0 f02) {
        synchronized (qVar.f15237a) {
            qVar.f15239c++;
        }
        qVar.n(f02);
    }

    private static F0 j(int i10, int i11, int i12, int i13) {
        return new d(ImageReader.newInstance(i10, i11, i12, i13));
    }

    private void k(o oVar) {
        synchronized (this.f15237a) {
            try {
                int iIndexOf = this.f15248l.indexOf(oVar);
                if (iIndexOf >= 0) {
                    this.f15248l.remove(iIndexOf);
                    int i10 = this.f15247k;
                    if (iIndexOf <= i10) {
                        this.f15247k = i10 - 1;
                    }
                }
                this.f15249m.remove(oVar);
                if (this.f15239c > 0) {
                    n(this.f15242f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void l(s sVar) {
        final F0.a aVar;
        Executor executor;
        synchronized (this.f15237a) {
            try {
                if (this.f15248l.size() < f()) {
                    sVar.d(this);
                    this.f15248l.add(sVar);
                    aVar = this.f15243g;
                    executor = this.f15244h;
                } else {
                    AbstractC3583h0.a("TAG", "Maximum image number reached.");
                    sVar.close();
                    aVar = null;
                    executor = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            if (executor != null) {
                executor.execute(new Runnable() { // from class: y.j0
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.camera.core.q.h(this.f33799g, aVar);
                    }
                });
            } else {
                aVar.a(this);
            }
        }
    }

    private void o() {
        synchronized (this.f15237a) {
            try {
                for (int size = this.f15245i.size() - 1; size >= 0; size--) {
                    Y y10 = (Y) this.f15245i.valueAt(size);
                    long jA = y10.a();
                    o oVar = (o) this.f15246j.get(jA);
                    if (oVar != null) {
                        this.f15246j.remove(jA);
                        this.f15245i.removeAt(size);
                        l(new s(oVar, y10));
                    }
                }
                p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void p() {
        synchronized (this.f15237a) {
            try {
                if (this.f15246j.size() != 0 && this.f15245i.size() != 0) {
                    long jKeyAt = this.f15246j.keyAt(0);
                    Long lValueOf = Long.valueOf(jKeyAt);
                    long jKeyAt2 = this.f15245i.keyAt(0);
                    H0.g.a(!Long.valueOf(jKeyAt2).equals(lValueOf));
                    if (jKeyAt2 > jKeyAt) {
                        for (int size = this.f15246j.size() - 1; size >= 0; size--) {
                            if (this.f15246j.keyAt(size) < jKeyAt2) {
                                ((o) this.f15246j.valueAt(size)).close();
                                this.f15246j.removeAt(size);
                            }
                        }
                    } else {
                        for (int size2 = this.f15245i.size() - 1; size2 >= 0; size2--) {
                            if (this.f15245i.keyAt(size2) < jKeyAt) {
                                this.f15245i.removeAt(size2);
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // androidx.camera.core.e.a
    public void a(o oVar) {
        synchronized (this.f15237a) {
            k(oVar);
        }
    }

    @Override // F.F0
    public o b() {
        synchronized (this.f15237a) {
            try {
                if (this.f15248l.isEmpty()) {
                    return null;
                }
                if (this.f15247k >= this.f15248l.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < this.f15248l.size() - 1; i10++) {
                    if (!this.f15249m.contains(this.f15248l.get(i10))) {
                        arrayList.add((o) this.f15248l.get(i10));
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((o) it.next()).close();
                }
                int size = this.f15248l.size();
                List list = this.f15248l;
                this.f15247k = size;
                o oVar = (o) list.get(size - 1);
                this.f15249m.add(oVar);
                return oVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F.F0
    public int c() {
        int iC;
        synchronized (this.f15237a) {
            iC = this.f15242f.c();
        }
        return iC;
    }

    @Override // F.F0
    public void close() {
        synchronized (this.f15237a) {
            try {
                if (this.f15241e) {
                    return;
                }
                Iterator it = new ArrayList(this.f15248l).iterator();
                while (it.hasNext()) {
                    ((o) it.next()).close();
                }
                this.f15248l.clear();
                this.f15242f.close();
                this.f15241e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F.F0
    public void d() {
        synchronized (this.f15237a) {
            this.f15242f.d();
            this.f15243g = null;
            this.f15244h = null;
            this.f15239c = 0;
        }
    }

    @Override // F.F0
    public void e(F0.a aVar, Executor executor) {
        synchronized (this.f15237a) {
            this.f15243g = (F0.a) H0.g.g(aVar);
            this.f15244h = (Executor) H0.g.g(executor);
            this.f15242f.e(this.f15240d, executor);
        }
    }

    @Override // F.F0
    public int f() {
        int iF;
        synchronized (this.f15237a) {
            iF = this.f15242f.f();
        }
        return iF;
    }

    @Override // F.F0
    public o g() {
        synchronized (this.f15237a) {
            try {
                if (this.f15248l.isEmpty()) {
                    return null;
                }
                if (this.f15247k >= this.f15248l.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                List list = this.f15248l;
                int i10 = this.f15247k;
                this.f15247k = i10 + 1;
                o oVar = (o) list.get(i10);
                this.f15249m.add(oVar);
                return oVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F.F0
    public int getHeight() {
        int height;
        synchronized (this.f15237a) {
            height = this.f15242f.getHeight();
        }
        return height;
    }

    @Override // F.F0
    public Surface getSurface() {
        Surface surface;
        synchronized (this.f15237a) {
            surface = this.f15242f.getSurface();
        }
        return surface;
    }

    @Override // F.F0
    public int getWidth() {
        int width;
        synchronized (this.f15237a) {
            width = this.f15242f.getWidth();
        }
        return width;
    }

    public F.r m() {
        return this.f15238b;
    }

    void n(F0 f02) {
        o oVarG;
        synchronized (this.f15237a) {
            try {
                if (this.f15241e) {
                    return;
                }
                int size = this.f15246j.size() + this.f15248l.size();
                if (size >= f02.f()) {
                    AbstractC3583h0.a("MetadataImageReader", "Skip to acquire the next image because the acquired image count has reached the max images count.");
                    return;
                }
                do {
                    try {
                        oVarG = f02.g();
                        if (oVarG != null) {
                            this.f15239c--;
                            size++;
                            this.f15246j.put(oVarG.i().a(), oVarG);
                            o();
                        }
                    } catch (IllegalStateException e10) {
                        AbstractC3583h0.b("MetadataImageReader", "Failed to acquire next image.", e10);
                        oVarG = null;
                    }
                    if (oVarG == null || this.f15239c <= 0) {
                        break;
                    }
                } while (size < f02.f());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void q(B b10) {
        synchronized (this.f15237a) {
            try {
                if (this.f15241e) {
                    return;
                }
                this.f15245i.put(b10.a(), new K.c(b10));
                o();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    q(F0 f02) {
        this.f15237a = new Object();
        this.f15238b = new a();
        this.f15239c = 0;
        this.f15240d = new F0.a() { // from class: y.i0
            @Override // F.F0.a
            public final void a(F.F0 f03) {
                androidx.camera.core.q.i(this.f33798a, f03);
            }
        };
        this.f15241e = false;
        this.f15245i = new LongSparseArray();
        this.f15246j = new LongSparseArray();
        this.f15249m = new ArrayList();
        this.f15242f = f02;
        this.f15247k = 0;
        this.f15248l = new ArrayList(f());
    }
}
