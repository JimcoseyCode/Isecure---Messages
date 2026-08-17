package y;

import F.AbstractC0504q0;
import F.o1;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.concurrent.futures.c;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import m5.InterfaceFutureC2904a;
import y.I0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class I0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Range f33661q = o1.f1588a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f33662a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Size f33663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3563H f33664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Range f33665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final F.M f33666e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f33667f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f33668g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final InterfaceFutureC2904a f33669h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final c.a f33670i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final InterfaceFutureC2904a f33671j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final c.a f33672k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final c.a f33673l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AbstractC0504q0 f33674m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private h f33675n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private i f33676o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Executor f33677p;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements J.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c.a f33678a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceFutureC2904a f33679b;

        a(c.a aVar, InterfaceFutureC2904a interfaceFutureC2904a) {
            this.f33678a = aVar;
            this.f33679b = interfaceFutureC2904a;
        }

        @Override // J.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r22) {
            H0.g.i(this.f33678a.c(null));
        }

        @Override // J.c
        public void onFailure(Throwable th) {
            if (th instanceof f) {
                H0.g.i(this.f33679b.cancel(false));
            } else {
                H0.g.i(this.f33678a.c(null));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b extends AbstractC0504q0 {
        b(Size size, int i10) {
            super(size, i10);
        }

        @Override // F.AbstractC0504q0
        protected InterfaceFutureC2904a o() {
            return I0.this.f33669h;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class c implements J.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceFutureC2904a f33682a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c.a f33683b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f33684c;

        c(InterfaceFutureC2904a interfaceFutureC2904a, c.a aVar, String str) {
            this.f33682a = interfaceFutureC2904a;
            this.f33683b = aVar;
            this.f33684c = str;
        }

        @Override // J.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Surface surface) {
            J.n.t(this.f33682a, this.f33683b);
        }

        @Override // J.c
        public void onFailure(Throwable th) {
            if (!(th instanceof CancellationException)) {
                this.f33683b.c(null);
                return;
            }
            H0.g.i(this.f33683b.f(new f(this.f33684c + " cancelled.", th)));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class d implements J.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ H0.a f33686a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Surface f33687b;

        d(H0.a aVar, Surface surface) {
            this.f33686a = aVar;
            this.f33687b = surface;
        }

        @Override // J.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r32) {
            this.f33686a.accept(g.c(0, this.f33687b));
        }

        @Override // J.c
        public void onFailure(Throwable th) {
            H0.g.j(th instanceof f, "Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th);
            this.f33686a.accept(g.c(1, this.f33687b));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class f extends RuntimeException {
        f(String str, Throwable th) {
            super(str, th);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class g {
        g() {
        }

        static g c(int i10, Surface surface) {
            return new C3580g(i10, surface);
        }

        public abstract int a();

        public abstract Surface b();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class h {
        h() {
        }

        public static h g(Rect rect, int i10, int i11, boolean z10, Matrix matrix, boolean z11) {
            return new C3582h(rect, i10, i11, z10, matrix, z11);
        }

        public abstract Rect a();

        public abstract int b();

        public abstract Matrix c();

        public abstract int d();

        public abstract boolean e();

        public abstract boolean f();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface i {
        void a(h hVar);
    }

    public I0(Size size, F.M m10, boolean z10, C3563H c3563h, int i10, Range range, Runnable runnable) {
        this.f33663b = size;
        this.f33666e = m10;
        this.f33667f = z10;
        H0.g.b(c3563h.e(), "SurfaceRequest's DynamicRange must always be fully specified.");
        this.f33664c = c3563h;
        this.f33668g = i10;
        this.f33665d = range;
        final String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        final AtomicReference atomicReference = new AtomicReference(null);
        InterfaceFutureC2904a interfaceFutureC2904aA = androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: y.D0
            @Override // androidx.concurrent.futures.c.InterfaceC0153c
            public final Object a(c.a aVar) {
                return I0.a(atomicReference, str, aVar);
            }
        });
        c.a aVar = (c.a) H0.g.g((c.a) atomicReference.get());
        this.f33673l = aVar;
        final AtomicReference atomicReference2 = new AtomicReference(null);
        InterfaceFutureC2904a interfaceFutureC2904aA2 = androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: y.E0
            @Override // androidx.concurrent.futures.c.InterfaceC0153c
            public final Object a(c.a aVar2) {
                return I0.j(atomicReference2, str, aVar2);
            }
        });
        this.f33671j = interfaceFutureC2904aA2;
        J.n.j(interfaceFutureC2904aA2, new a(aVar, interfaceFutureC2904aA), I.c.b());
        c.a aVar2 = (c.a) H0.g.g((c.a) atomicReference2.get());
        final AtomicReference atomicReference3 = new AtomicReference(null);
        InterfaceFutureC2904a interfaceFutureC2904aA3 = androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: y.F0
            @Override // androidx.concurrent.futures.c.InterfaceC0153c
            public final Object a(c.a aVar3) {
                return I0.c(atomicReference3, str, aVar3);
            }
        });
        this.f33669h = interfaceFutureC2904aA3;
        this.f33670i = (c.a) H0.g.g((c.a) atomicReference3.get());
        b bVar = new b(size, 34);
        this.f33674m = bVar;
        InterfaceFutureC2904a interfaceFutureC2904aK = bVar.k();
        J.n.j(interfaceFutureC2904aA3, new c(interfaceFutureC2904aK, aVar2, str), I.c.b());
        interfaceFutureC2904aK.h(new Runnable() { // from class: y.G0
            @Override // java.lang.Runnable
            public final void run() {
                this.f33648g.f33669h.cancel(true);
            }
        }, I.c.b());
        this.f33672k = s(I.c.b(), runnable);
    }

    public static /* synthetic */ Object a(AtomicReference atomicReference, String str, c.a aVar) {
        atomicReference.set(aVar);
        return str + "-cancellation";
    }

    public static /* synthetic */ Object c(AtomicReference atomicReference, String str, c.a aVar) {
        atomicReference.set(aVar);
        return str + "-Surface";
    }

    public static /* synthetic */ Object g(I0 i02, AtomicReference atomicReference, c.a aVar) {
        i02.getClass();
        atomicReference.set(aVar);
        return "SurfaceRequest-surface-recreation(" + i02.hashCode() + ")";
    }

    public static /* synthetic */ Object j(AtomicReference atomicReference, String str, c.a aVar) {
        atomicReference.set(aVar);
        return str + "-status";
    }

    private c.a s(Executor executor, Runnable runnable) {
        final AtomicReference atomicReference = new AtomicReference(null);
        J.n.j(androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: y.H0
            @Override // androidx.concurrent.futures.c.InterfaceC0153c
            public final Object a(c.a aVar) {
                return I0.g(this.f33659a, atomicReference, aVar);
            }
        }), new e(runnable), executor);
        return (c.a) H0.g.g((c.a) atomicReference.get());
    }

    public void k(Executor executor, Runnable runnable) {
        this.f33673l.a(runnable, executor);
    }

    public void l() {
        synchronized (this.f33662a) {
            this.f33676o = null;
            this.f33677p = null;
        }
    }

    public F.M m() {
        return this.f33666e;
    }

    public AbstractC0504q0 n() {
        return this.f33674m;
    }

    public C3563H o() {
        return this.f33664c;
    }

    public Range p() {
        return this.f33665d;
    }

    public Size q() {
        return this.f33663b;
    }

    public int r() {
        return this.f33668g;
    }

    public boolean t() {
        z();
        return this.f33672k.c(null);
    }

    public boolean u() {
        return this.f33667f;
    }

    public boolean v() {
        return this.f33669h.isDone();
    }

    public void w(final Surface surface, Executor executor, final H0.a aVar) {
        if (!surface.isValid()) {
            executor.execute(new Runnable() { // from class: y.A0
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.accept(I0.g.c(2, surface));
                }
            });
            return;
        }
        if (this.f33670i.c(surface) || this.f33669h.isCancelled()) {
            J.n.j(this.f33671j, new d(aVar, surface), executor);
            return;
        }
        H0.g.i(this.f33669h.isDone());
        try {
            this.f33669h.get();
            executor.execute(new Runnable() { // from class: y.B0
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.accept(I0.g.c(3, surface));
                }
            });
        } catch (InterruptedException | ExecutionException unused) {
            executor.execute(new Runnable() { // from class: y.C0
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.accept(I0.g.c(4, surface));
                }
            });
        }
    }

    public void x(Executor executor, final i iVar) {
        final h hVar;
        synchronized (this.f33662a) {
            this.f33676o = iVar;
            this.f33677p = executor;
            hVar = this.f33675n;
        }
        if (hVar != null) {
            executor.execute(new Runnable() { // from class: y.z0
                @Override // java.lang.Runnable
                public final void run() {
                    iVar.a(hVar);
                }
            });
        }
    }

    public void y(final h hVar) {
        final i iVar;
        Executor executor;
        synchronized (this.f33662a) {
            this.f33675n = hVar;
            iVar = this.f33676o;
            executor = this.f33677p;
        }
        if (iVar == null || executor == null) {
            return;
        }
        executor.execute(new Runnable() { // from class: y.y0
            @Override // java.lang.Runnable
            public final void run() {
                iVar.a(hVar);
            }
        });
    }

    public boolean z() {
        return this.f33670i.f(new AbstractC0504q0.b("Surface request will not complete."));
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class e implements J.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f33689a;

        e(Runnable runnable) {
            this.f33689a = runnable;
        }

        @Override // J.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
            this.f33689a.run();
        }

        @Override // J.c
        public void onFailure(Throwable th) {
        }
    }
}
