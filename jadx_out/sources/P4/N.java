package P4;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import r4.AbstractC3268i;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class N extends AbstractC1378l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f8815a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final J f8816b = new J();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f8817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f8818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Object f8819e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Exception f8820f;

    N() {
    }

    private final void A() {
        synchronized (this.f8815a) {
            try {
                if (this.f8817c) {
                    this.f8816b.b(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void x() {
        AbstractC3268i.o(this.f8817c, "Task is not yet complete");
    }

    private final void y() {
        if (this.f8818d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    private final void z() {
        if (this.f8817c) {
            throw C1370d.a(this);
        }
    }

    @Override // P4.AbstractC1378l
    public final AbstractC1378l a(InterfaceC1371e interfaceC1371e) {
        b(AbstractC1380n.f8825a, interfaceC1371e);
        return this;
    }

    @Override // P4.AbstractC1378l
    public final AbstractC1378l b(Executor executor, InterfaceC1371e interfaceC1371e) {
        this.f8816b.a(new z(executor, interfaceC1371e));
        A();
        return this;
    }

    @Override // P4.AbstractC1378l
    public final AbstractC1378l c(InterfaceC1372f interfaceC1372f) {
        this.f8816b.a(new B(AbstractC1380n.f8825a, interfaceC1372f));
        A();
        return this;
    }

    @Override // P4.AbstractC1378l
    public final AbstractC1378l d(Executor executor, InterfaceC1372f interfaceC1372f) {
        this.f8816b.a(new B(executor, interfaceC1372f));
        A();
        return this;
    }

    @Override // P4.AbstractC1378l
    public final AbstractC1378l e(InterfaceC1373g interfaceC1373g) {
        f(AbstractC1380n.f8825a, interfaceC1373g);
        return this;
    }

    @Override // P4.AbstractC1378l
    public final AbstractC1378l f(Executor executor, InterfaceC1373g interfaceC1373g) {
        this.f8816b.a(new D(executor, interfaceC1373g));
        A();
        return this;
    }

    @Override // P4.AbstractC1378l
    public final AbstractC1378l g(InterfaceC1374h interfaceC1374h) {
        h(AbstractC1380n.f8825a, interfaceC1374h);
        return this;
    }

    @Override // P4.AbstractC1378l
    public final AbstractC1378l h(Executor executor, InterfaceC1374h interfaceC1374h) {
        this.f8816b.a(new F(executor, interfaceC1374h));
        A();
        return this;
    }

    @Override // P4.AbstractC1378l
    public final AbstractC1378l i(Executor executor, InterfaceC1369c interfaceC1369c) {
        N n10 = new N();
        this.f8816b.a(new v(executor, interfaceC1369c, n10));
        A();
        return n10;
    }

    @Override // P4.AbstractC1378l
    public final AbstractC1378l j(Executor executor, InterfaceC1369c interfaceC1369c) {
        N n10 = new N();
        this.f8816b.a(new x(executor, interfaceC1369c, n10));
        A();
        return n10;
    }

    @Override // P4.AbstractC1378l
    public final Exception k() {
        Exception exc;
        synchronized (this.f8815a) {
            exc = this.f8820f;
        }
        return exc;
    }

    @Override // P4.AbstractC1378l
    public final Object l() {
        Object obj;
        synchronized (this.f8815a) {
            try {
                x();
                y();
                Exception exc = this.f8820f;
                if (exc != null) {
                    throw new C1376j(exc);
                }
                obj = this.f8819e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // P4.AbstractC1378l
    public final Object m(Class cls) {
        Object obj;
        synchronized (this.f8815a) {
            try {
                x();
                y();
                if (cls.isInstance(this.f8820f)) {
                    throw ((Throwable) cls.cast(this.f8820f));
                }
                Exception exc = this.f8820f;
                if (exc != null) {
                    throw new C1376j(exc);
                }
                obj = this.f8819e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // P4.AbstractC1378l
    public final boolean n() {
        return this.f8818d;
    }

    @Override // P4.AbstractC1378l
    public final boolean o() {
        boolean z10;
        synchronized (this.f8815a) {
            z10 = this.f8817c;
        }
        return z10;
    }

    @Override // P4.AbstractC1378l
    public final boolean p() {
        boolean z10;
        synchronized (this.f8815a) {
            try {
                z10 = false;
                if (this.f8817c && !this.f8818d && this.f8820f == null) {
                    z10 = true;
                }
            } finally {
            }
        }
        return z10;
    }

    @Override // P4.AbstractC1378l
    public final AbstractC1378l q(InterfaceC1377k interfaceC1377k) {
        Executor executor = AbstractC1380n.f8825a;
        N n10 = new N();
        this.f8816b.a(new H(executor, interfaceC1377k, n10));
        A();
        return n10;
    }

    @Override // P4.AbstractC1378l
    public final AbstractC1378l r(Executor executor, InterfaceC1377k interfaceC1377k) {
        N n10 = new N();
        this.f8816b.a(new H(executor, interfaceC1377k, n10));
        A();
        return n10;
    }

    public final void s(Exception exc) {
        AbstractC3268i.l(exc, "Exception must not be null");
        synchronized (this.f8815a) {
            z();
            this.f8817c = true;
            this.f8820f = exc;
        }
        this.f8816b.b(this);
    }

    public final void t(Object obj) {
        synchronized (this.f8815a) {
            z();
            this.f8817c = true;
            this.f8819e = obj;
        }
        this.f8816b.b(this);
    }

    public final boolean u() {
        synchronized (this.f8815a) {
            try {
                if (this.f8817c) {
                    return false;
                }
                this.f8817c = true;
                this.f8818d = true;
                this.f8816b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean v(Exception exc) {
        AbstractC3268i.l(exc, "Exception must not be null");
        synchronized (this.f8815a) {
            try {
                if (this.f8817c) {
                    return false;
                }
                this.f8817c = true;
                this.f8820f = exc;
                this.f8816b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean w(Object obj) {
        synchronized (this.f8815a) {
            try {
                if (this.f8817c) {
                    return false;
                }
                this.f8817c = true;
                this.f8819e = obj;
                this.f8816b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
