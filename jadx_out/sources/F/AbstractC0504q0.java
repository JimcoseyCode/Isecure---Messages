package F;

import android.util.Log;
import android.util.Size;
import androidx.concurrent.futures.c;
import java.util.concurrent.atomic.AtomicInteger;
import m5.InterfaceFutureC2904a;
import y.AbstractC3583h0;

/* JADX INFO: renamed from: F.q0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0504q0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Size f1624k = new Size(0, 0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final boolean f1625l = AbstractC3583h0.f("DeferrableSurface");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final AtomicInteger f1626m = new AtomicInteger(0);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final AtomicInteger f1627n = new AtomicInteger(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f1628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f1630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c.a f1631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceFutureC2904a f1632e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c.a f1633f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceFutureC2904a f1634g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Size f1635h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f1636i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    Class f1637j;

    /* JADX INFO: renamed from: F.q0$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends Exception {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        AbstractC0504q0 f1638g;

        public a(String str, AbstractC0504q0 abstractC0504q0) {
            super(str);
            this.f1638g = abstractC0504q0;
        }

        public AbstractC0504q0 a() {
            return this.f1638g;
        }
    }

    /* JADX INFO: renamed from: F.q0$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b extends Exception {
        public b(String str) {
            super(str);
        }
    }

    public AbstractC0504q0() {
        this(f1624k, 0);
    }

    public static /* synthetic */ Object a(AbstractC0504q0 abstractC0504q0, c.a aVar) {
        synchronized (abstractC0504q0.f1628a) {
            abstractC0504q0.f1631d = aVar;
        }
        return "DeferrableSurface-termination(" + abstractC0504q0 + ")";
    }

    public static /* synthetic */ Object b(AbstractC0504q0 abstractC0504q0, c.a aVar) {
        synchronized (abstractC0504q0.f1628a) {
            abstractC0504q0.f1633f = aVar;
        }
        return "DeferrableSurface-close(" + abstractC0504q0 + ")";
    }

    public static /* synthetic */ void c(AbstractC0504q0 abstractC0504q0, String str) {
        abstractC0504q0.getClass();
        try {
            abstractC0504q0.f1632e.get();
            abstractC0504q0.n("Surface terminated", f1627n.decrementAndGet(), f1626m.get());
        } catch (Exception e10) {
            AbstractC3583h0.c("DeferrableSurface", "Unexpected surface termination for " + abstractC0504q0 + "\nStack Trace:\n" + str);
            synchronized (abstractC0504q0.f1628a) {
                throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", abstractC0504q0, Boolean.valueOf(abstractC0504q0.f1630c), Integer.valueOf(abstractC0504q0.f1629b)), e10);
            }
        }
    }

    private void n(String str, int i10, int i11) {
        if (!f1625l && AbstractC3583h0.f("DeferrableSurface")) {
            AbstractC3583h0.a("DeferrableSurface", "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        AbstractC3583h0.a("DeferrableSurface", str + "[total_surfaces=" + i10 + ", used_surfaces=" + i11 + "](" + this + "}");
    }

    public void d() {
        c.a aVar;
        synchronized (this.f1628a) {
            try {
                if (this.f1630c) {
                    aVar = null;
                } else {
                    this.f1630c = true;
                    this.f1633f.c(null);
                    if (this.f1629b == 0) {
                        aVar = this.f1631d;
                        this.f1631d = null;
                    } else {
                        aVar = null;
                    }
                    if (AbstractC3583h0.f("DeferrableSurface")) {
                        AbstractC3583h0.a("DeferrableSurface", "surface closed,  useCount=" + this.f1629b + " closed=true " + this);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            aVar.c(null);
        }
    }

    public void e() {
        c.a aVar;
        synchronized (this.f1628a) {
            try {
                int i10 = this.f1629b;
                if (i10 == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                int i11 = i10 - 1;
                this.f1629b = i11;
                if (i11 == 0 && this.f1630c) {
                    aVar = this.f1631d;
                    this.f1631d = null;
                } else {
                    aVar = null;
                }
                if (AbstractC3583h0.f("DeferrableSurface")) {
                    AbstractC3583h0.a("DeferrableSurface", "use count-1,  useCount=" + this.f1629b + " closed=" + this.f1630c + " " + this);
                    if (this.f1629b == 0) {
                        n("Surface no longer in use", f1627n.get(), f1626m.decrementAndGet());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            aVar.c(null);
        }
    }

    public InterfaceFutureC2904a f() {
        return J.n.s(this.f1634g);
    }

    public Class g() {
        return this.f1637j;
    }

    public Size h() {
        return this.f1635h;
    }

    public int i() {
        return this.f1636i;
    }

    public final InterfaceFutureC2904a j() {
        synchronized (this.f1628a) {
            try {
                if (this.f1630c) {
                    return J.n.n(new a("DeferrableSurface already closed.", this));
                }
                return o();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public InterfaceFutureC2904a k() {
        return J.n.s(this.f1632e);
    }

    public void l() {
        synchronized (this.f1628a) {
            try {
                int i10 = this.f1629b;
                if (i10 == 0 && this.f1630c) {
                    throw new a("Cannot begin use on a closed surface.", this);
                }
                this.f1629b = i10 + 1;
                if (AbstractC3583h0.f("DeferrableSurface")) {
                    if (this.f1629b == 1) {
                        n("New surface in use", f1627n.get(), f1626m.incrementAndGet());
                    }
                    AbstractC3583h0.a("DeferrableSurface", "use count+1, useCount=" + this.f1629b + " " + this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean m() {
        boolean z10;
        synchronized (this.f1628a) {
            z10 = this.f1630c;
        }
        return z10;
    }

    protected abstract InterfaceFutureC2904a o();

    public void p(Class cls) {
        this.f1637j = cls;
    }

    public AbstractC0504q0(Size size, int i10) {
        this.f1628a = new Object();
        this.f1629b = 0;
        this.f1630c = false;
        this.f1635h = size;
        this.f1636i = i10;
        InterfaceFutureC2904a interfaceFutureC2904aA = androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: F.n0
            @Override // androidx.concurrent.futures.c.InterfaceC0153c
            public final Object a(c.a aVar) {
                return AbstractC0504q0.a(this.f1571a, aVar);
            }
        });
        this.f1632e = interfaceFutureC2904aA;
        this.f1634g = androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: F.o0
            @Override // androidx.concurrent.futures.c.InterfaceC0153c
            public final Object a(c.a aVar) {
                return AbstractC0504q0.b(this.f1587a, aVar);
            }
        });
        if (AbstractC3583h0.f("DeferrableSurface")) {
            n("Surface created", f1627n.incrementAndGet(), f1626m.get());
            final String stackTraceString = Log.getStackTraceString(new Exception());
            interfaceFutureC2904aA.h(new Runnable() { // from class: F.p0
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC0504q0.c(this.f1603g, stackTraceString);
                }
            }, I.c.b());
        }
    }
}
