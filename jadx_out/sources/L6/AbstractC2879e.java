package l6;

import J4.C1168k5;
import P4.AbstractC1378l;
import P4.AbstractC1381o;
import P4.C1368b;
import P4.InterfaceC1373g;
import androidx.lifecycle.AbstractC1764k;
import androidx.lifecycle.C;
import androidx.lifecycle.InterfaceC1770q;
import c6.AbstractC1861f;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.io.Closeable;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import k6.C2831a;
import r4.AbstractC3268i;
import r4.C3263d;

/* JADX INFO: renamed from: l6.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2879e implements Closeable, InterfaceC1770q {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final C3263d f29450l = new C3263d("MobileVisionBase", PointerEventHelper.POINTER_TYPE_UNKNOWN);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f29451m = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f29452g = new AtomicBoolean(false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AbstractC1861f f29453h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C1368b f29454i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Executor f29455j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AbstractC1378l f29456k;

    public AbstractC2879e(AbstractC1861f abstractC1861f, Executor executor) {
        this.f29453h = abstractC1861f;
        C1368b c1368b = new C1368b();
        this.f29454i = c1368b;
        this.f29455j = executor;
        abstractC1861f.c();
        this.f29456k = abstractC1861f.a(executor, new Callable() { // from class: l6.g
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i10 = AbstractC2879e.f29451m;
                return null;
            }
        }, c1368b.b()).e(new InterfaceC1373g() { // from class: l6.h
            @Override // P4.InterfaceC1373g
            public final void onFailure(Exception exc) {
                AbstractC2879e.f29450l.d("MobileVisionBase", "Error preloading model resource", exc);
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, e6.InterfaceC2427a
    @C(AbstractC1764k.a.ON_DESTROY)
    public synchronized void close() {
        if (this.f29452g.getAndSet(true)) {
            return;
        }
        this.f29454i.a();
        this.f29453h.e(this.f29455j);
    }

    public synchronized AbstractC1378l r(final C2831a c2831a) {
        AbstractC3268i.l(c2831a, "InputImage can not be null");
        if (this.f29452g.get()) {
            return AbstractC1381o.e(new Y5.a("This detector is already closed!", 14));
        }
        if (c2831a.k() < 32 || c2831a.g() < 32) {
            return AbstractC1381o.e(new Y5.a("InputImage width and height should be at least 32!", 3));
        }
        return this.f29453h.a(this.f29455j, new Callable() { // from class: l6.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f29457a.s(c2831a);
            }
        }, this.f29454i.b());
    }

    final /* synthetic */ Object s(C2831a c2831a) {
        C1168k5 c1168k5R = C1168k5.r("detectorTaskWithResource#run");
        c1168k5R.e();
        try {
            Object objI = this.f29453h.i(c2831a);
            c1168k5R.close();
            return objI;
        } catch (Throwable th) {
            try {
                c1168k5R.close();
            } catch (Throwable th2) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                } catch (Exception unused) {
                }
            }
            throw th;
        }
    }
}
