package g2;

import android.graphics.Bitmap;
import c2.AbstractC1841b;
import c2.k;
import d2.AbstractC2325a;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: g2.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2662a implements Cloneable, Closeable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f28116l;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected boolean f28119g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final i f28120h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final c f28121i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected final Throwable f28122j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Class f28115k = AbstractC2662a.class;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final h f28117m = new C0282a();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final c f28118n = new b();

    /* JADX INFO: renamed from: g2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class C0282a implements h {
        C0282a() {
        }

        @Override // g2.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void release(Closeable closeable) {
            try {
                AbstractC1841b.a(closeable, true);
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: g2.a$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b implements c {
        b() {
        }

        @Override // g2.AbstractC2662a.c
        public boolean a() {
            return false;
        }

        @Override // g2.AbstractC2662a.c
        public void b(i iVar, Throwable th) {
            Object objF = iVar.f();
            AbstractC2325a.G(AbstractC2662a.f28115k, "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(iVar)), objF == null ? null : objF.getClass().getName());
        }
    }

    /* JADX INFO: renamed from: g2.a$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface c {
        boolean a();

        void b(i iVar, Throwable th);
    }

    protected AbstractC2662a(i iVar, c cVar, Throwable th) {
        this.f28120h = (i) k.g(iVar);
        iVar.b();
        this.f28121i = cVar;
        this.f28122j = th;
    }

    public static List A(Collection collection) {
        if (collection == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(r((AbstractC2662a) it.next()));
        }
        return arrayList;
    }

    public static AbstractC2662a A0(Object obj, h hVar, c cVar, Throwable th) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Bitmap) || (obj instanceof d)) {
            int i10 = f28116l;
            if (i10 == 1) {
                return new C2664c(obj, hVar, cVar, th);
            }
            if (i10 == 2) {
                return new g(obj, hVar, cVar, th);
            }
            if (i10 == 3) {
                return new e(obj);
            }
        }
        return new C2663b(obj, hVar, cVar, th);
    }

    public static void B(AbstractC2662a abstractC2662a) {
        if (abstractC2662a != null) {
            abstractC2662a.close();
        }
    }

    public static void I(Iterable iterable) {
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                B((AbstractC2662a) it.next());
            }
        }
    }

    public static boolean d0(AbstractC2662a abstractC2662a) {
        return abstractC2662a != null && abstractC2662a.W();
    }

    public static AbstractC2662a g0(Closeable closeable) {
        return w0(closeable, f28117m);
    }

    public static AbstractC2662a i0(Closeable closeable, c cVar) {
        if (closeable == null) {
            return null;
        }
        return A0(closeable, f28117m, cVar, cVar.a() ? new Throwable() : null);
    }

    public static AbstractC2662a r(AbstractC2662a abstractC2662a) {
        if (abstractC2662a != null) {
            return abstractC2662a.m();
        }
        return null;
    }

    public static AbstractC2662a w0(Object obj, h hVar) {
        return y0(obj, hVar, f28118n);
    }

    public static AbstractC2662a y0(Object obj, h hVar, c cVar) {
        if (obj == null) {
            return null;
        }
        return A0(obj, hVar, cVar, cVar.a() ? new Throwable() : null);
    }

    public synchronized Object J() {
        k.i(!this.f28119g);
        return k.g(this.f28120h.f());
    }

    public int M() {
        if (W()) {
            return System.identityHashCode(this.f28120h.f());
        }
        return 0;
    }

    public synchronized boolean W() {
        return !this.f28119g;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            try {
                if (this.f28119g) {
                    return;
                }
                this.f28119g = true;
                this.f28120h.d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public abstract AbstractC2662a clone();

    public synchronized AbstractC2662a m() {
        if (!W()) {
            return null;
        }
        return clone();
    }

    protected AbstractC2662a(Object obj, h hVar, c cVar, Throwable th, boolean z10) {
        this.f28120h = new i(obj, hVar, z10);
        this.f28121i = cVar;
        this.f28122j = th;
    }
}
