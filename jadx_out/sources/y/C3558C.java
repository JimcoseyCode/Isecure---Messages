package y;

import F.AbstractC0476d0;
import F.AbstractC0482f0;
import F.C0474c1;
import F.C0477d1;
import F.C0480e1;
import F.E1;
import F.J;
import F.K;
import android.content.ComponentCallbacks2;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.camera.core.impl.MetadataHolderService;
import androidx.concurrent.futures.c;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.concurrent.Executor;
import l1.AbstractC2861a;
import m5.InterfaceFutureC2904a;
import n.InterfaceC2955a;
import y.C3559D;
import y.r0;
import z.InterfaceC3664a;

/* JADX INFO: renamed from: y.C, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C3558C {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Object f33588s = new Object();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final SparseArray f33589t = new SparseArray();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final F.Z f33590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f33591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3559D f33592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Executor f33593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Handler f33594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HandlerThread f33595f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private F.K f33596g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private F.J f33597h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private E1 f33598i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private K.m f33599j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private InterfaceC3601v f33600k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final r0 f33601l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final InterfaceFutureC2904a f33602m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final F.U f33603n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private a f33604o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private InterfaceFutureC2904a f33605p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Integer f33606q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f33607r;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y.C$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    enum a {
        UNINITIALIZED,
        INITIALIZING,
        INITIALIZING_ERROR,
        INITIALIZED,
        SHUTDOWN
    }

    public C3558C(Context context, C3559D.b bVar) {
        this(context, bVar, new C0480e1());
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016f A[Catch: all -> 0x01cb, TryCatch #3 {all -> 0x01cb, blocks: (B:3:0x0017, B:5:0x001f, B:7:0x003b, B:9:0x005a, B:11:0x0075, B:18:0x0087, B:19:0x00b0, B:21:0x00b6, B:22:0x00c6, B:24:0x00e9, B:25:0x00ec, B:28:0x00f6, B:29:0x0102, B:30:0x0103, B:31:0x010f, B:32:0x0110, B:33:0x011c, B:34:0x011d, B:38:0x013b, B:39:0x016f, B:40:0x0171, B:43:0x0177, B:45:0x017d, B:46:0x0184, B:48:0x0188, B:49:0x01b4, B:51:0x01b8, B:52:0x01bc, B:57:0x01ca, B:41:0x0172, B:42:0x0176), top: B:63:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0172 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void a(final C3558C c3558c, Context context, final Executor executor, final int i10, final c.a aVar, final long j10) {
        r0.c cVarA;
        c3558c.getClass();
        AbstractC2861a.c("CX:initAndRetryRecursively");
        final Context contextA = H.f.a(context);
        try {
            try {
                K.a aVarH0 = c3558c.f33592c.h0(null);
                if (aVarH0 == null) {
                    throw new C3579f0(new IllegalArgumentException("Invalid app configuration provided. Missing CameraFactory."));
                }
                AbstractC0476d0 abstractC0476d0A = AbstractC0476d0.a(c3558c.f33593d, c3558c.f33594e);
                C3598s c3598sF0 = c3558c.f33592c.f0(null);
                long jI0 = c3558c.f33592c.i0();
                E1.c cVarO0 = c3558c.f33592c.o0(null);
                if (cVarO0 == null) {
                    throw new C3579f0(new IllegalArgumentException("Invalid app configuration provided. Missing UseCaseConfigFactory."));
                }
                c3558c.f33598i = cVarO0.a(contextA);
                K.n nVar = new K.n(c3558c.f33598i, null);
                c3558c.f33599j = nVar;
                c3558c.f33596g = aVarH0.a(contextA, abstractC0476d0A, c3598sF0, jI0, c3558c.f33592c, nVar);
                J.a aVarL0 = c3558c.f33592c.l0(null);
                if (aVarL0 == null) {
                    throw new C3579f0(new IllegalArgumentException("Invalid app configuration provided. Missing CameraDeviceSurfaceManager."));
                }
                F.J jA = aVarL0.a(contextA, c3558c.f33596g.a(), c3558c.f33596g.c());
                c3558c.f33597h = jA;
                c3558c.f33599j.a(jA);
                if (executor instanceof ExecutorC3594n) {
                    ((ExecutorC3594n) executor).d(c3558c.f33596g);
                }
                c3558c.f33590a.n(c3558c.f33596g);
                InterfaceC3664a interfaceC3664aF = c3558c.f33596g.f();
                interfaceC3664aF.a(c3558c.f33590a);
                c3558c.f33600k = new C3602w(c3558c.f33590a, interfaceC3664aF, c3558c.f33598i, c3558c.f33599j);
                Iterator it = c3558c.f33590a.m().iterator();
                while (it.hasNext()) {
                    ((F.M) it.next()).r().t(c3558c.f33600k);
                }
                c3558c.f33603n.w(c3558c.f33596g, c3558c.f33590a);
                c3558c.f33603n.i(c3558c.f33597h);
                c3558c.f33603n.i(c3558c.f33596g.f());
                AbstractC0482f0.a(contextA, c3558c.f33590a, c3598sF0);
                if (i10 > 1) {
                    c3558c.s(null);
                }
                c3558c.p();
                aVar.c(null);
            } finally {
                AbstractC2861a.f();
            }
        } catch (AbstractC0482f0.b e10) {
            e = e10;
            F.V v10 = new F.V(j10, i10, e);
            cVarA = c3558c.f33601l.a(v10);
            c3558c.s(v10);
            c3558c.f33603n.v();
            if (!cVarA.d() || i10 >= Integer.MAX_VALUE) {
                synchronized (c3558c.f33591b) {
                    c3558c.f33604o = a.INITIALIZING_ERROR;
                }
                if (cVarA.c()) {
                    c3558c.p();
                    aVar.c(null);
                } else if (e instanceof AbstractC0482f0.b) {
                    String str = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((AbstractC0482f0.b) e).a();
                    AbstractC3583h0.d("CameraX", str, e);
                    aVar.f(new C3579f0(new C3600u(3, str)));
                } else if (e instanceof C3579f0) {
                    aVar.f(e);
                } else {
                    aVar.f(new C3579f0(e));
                }
            } else {
                AbstractC3583h0.m("CameraX", "Retry init. Start time " + j10 + " current time " + SystemClock.elapsedRealtime(), e);
                D0.g.b(c3558c.f33594e, new Runnable() { // from class: y.B
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f33580g.n(executor, j10, i10 + 1, contextA, aVar);
                    }
                }, "retry_token", cVarA.b());
            }
        } catch (RuntimeException e11) {
            e = e11;
            F.V v102 = new F.V(j10, i10, e);
            cVarA = c3558c.f33601l.a(v102);
            c3558c.s(v102);
            c3558c.f33603n.v();
            if (cVarA.d()) {
                synchronized (c3558c.f33591b) {
                }
            }
        } catch (C3579f0 e12) {
            e = e12;
            F.V v1022 = new F.V(j10, i10, e);
            cVarA = c3558c.f33601l.a(v1022);
            c3558c.s(v1022);
            c3558c.f33603n.v();
            if (cVarA.d()) {
            }
        }
    }

    public static /* synthetic */ void b(C3558C c3558c, c.a aVar) {
        c3558c.f33596g.shutdown();
        if (c3558c.f33595f != null) {
            Executor executor = c3558c.f33593d;
            if (executor instanceof ExecutorC3594n) {
                ((ExecutorC3594n) executor).c();
            }
            c3558c.f33595f.quit();
        }
        aVar.c(null);
    }

    public static /* synthetic */ Object c(C3558C c3558c, Context context, c.a aVar) {
        c3558c.n(c3558c.f33593d, SystemClock.elapsedRealtime(), 1, context, aVar);
        return "CameraX initInternal";
    }

    public static /* synthetic */ Object d(final C3558C c3558c, final c.a aVar) {
        c3558c.f33603n.v();
        c3558c.f33590a.k().h(new Runnable() { // from class: y.A
            @Override // java.lang.Runnable
            public final void run() {
                C3558C.b(this.f33576g, aVar);
            }
        }, c3558c.f33593d);
        return "CameraX shutdownInternal";
    }

    private static void f(Integer num) {
        synchronized (f33588s) {
            try {
                if (num == null) {
                    return;
                }
                SparseArray sparseArray = f33589t;
                int iIntValue = ((Integer) sparseArray.get(num.intValue())).intValue() - 1;
                if (iIntValue == 0) {
                    sparseArray.remove(num.intValue());
                } else {
                    sparseArray.put(num.intValue(), Integer.valueOf(iIntValue));
                }
                t();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static C3559D.b k(Context context) {
        ComponentCallbacks2 componentCallbacks2B = H.f.b(context);
        if (componentCallbacks2B instanceof C3559D.b) {
            return (C3559D.b) componentCallbacks2B;
        }
        try {
            Context contextA = H.f.a(context);
            Bundle bundle = contextA.getPackageManager().getServiceInfo(new ComponentName(contextA, (Class<?>) MetadataHolderService.class), 640).metaData;
            String string = bundle != null ? bundle.getString("androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER") : null;
            if (string != null) {
                return (C3559D.b) Class.forName(string).getDeclaredConstructor(null).newInstance(null);
            }
            AbstractC3583h0.c("CameraX", "No default CameraXConfig.Provider specified in meta-data. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            e = e10;
            AbstractC3583h0.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (ClassNotFoundException e11) {
            e = e11;
            AbstractC3583h0.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (IllegalAccessException e12) {
            e = e12;
            AbstractC3583h0.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (InstantiationException e13) {
            e = e13;
            AbstractC3583h0.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (NoSuchMethodException e14) {
            e = e14;
            AbstractC3583h0.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (NullPointerException e15) {
            e = e15;
            AbstractC3583h0.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (InvocationTargetException e16) {
            e = e16;
            AbstractC3583h0.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        }
    }

    private static void m(Integer num) {
        synchronized (f33588s) {
            try {
                if (num == null) {
                    return;
                }
                H0.g.c(num.intValue(), 3, 6, "minLogLevel");
                SparseArray sparseArray = f33589t;
                sparseArray.put(num.intValue(), Integer.valueOf(sparseArray.get(num.intValue()) != null ? 1 + ((Integer) sparseArray.get(num.intValue())).intValue() : 1));
                t();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(final Executor executor, final long j10, final int i10, final Context context, final c.a aVar) {
        executor.execute(new Runnable() { // from class: y.y
            @Override // java.lang.Runnable
            public final void run() {
                C3558C.a(this.f33877g, context, executor, i10, aVar, j10);
            }
        });
    }

    private InterfaceFutureC2904a o(final Context context) {
        InterfaceFutureC2904a interfaceFutureC2904aA;
        synchronized (this.f33591b) {
            H0.g.j(this.f33604o == a.UNINITIALIZED, "CameraX.initInternal() should only be called once per instance");
            this.f33604o = a.INITIALIZING;
            interfaceFutureC2904aA = androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: y.x
                @Override // androidx.concurrent.futures.c.InterfaceC0153c
                public final Object a(c.a aVar) {
                    return C3558C.c(this.f33875a, context, aVar);
                }
            });
        }
        return interfaceFutureC2904aA;
    }

    private void p() {
        synchronized (this.f33591b) {
            this.f33604o = a.INITIALIZED;
        }
    }

    private InterfaceFutureC2904a r() {
        synchronized (this.f33591b) {
            try {
                this.f33594e.removeCallbacksAndMessages("retry_token");
                int iOrdinal = this.f33604o.ordinal();
                if (iOrdinal == 0) {
                    this.f33604o = a.SHUTDOWN;
                    return J.n.p(null);
                }
                if (iOrdinal == 1) {
                    throw new IllegalStateException("CameraX could not be shutdown when it is initializing.");
                }
                if (iOrdinal == 2 || iOrdinal == 3) {
                    this.f33604o = a.SHUTDOWN;
                    f(this.f33606q);
                    this.f33605p = androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: y.z
                        @Override // androidx.concurrent.futures.c.InterfaceC0153c
                        public final Object a(c.a aVar) {
                            return C3558C.d(this.f33885a, aVar);
                        }
                    });
                }
                return this.f33605p;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void s(r0.b bVar) {
        if (AbstractC2861a.h()) {
            AbstractC2861a.j("CX:CameraProvider-RetryStatus", bVar != null ? bVar.b() : -1);
        }
    }

    private static void t() {
        SparseArray sparseArray = f33589t;
        if (sparseArray.size() == 0) {
            AbstractC3583h0.i();
            return;
        }
        if (sparseArray.get(3) != null) {
            AbstractC3583h0.j(3);
            return;
        }
        if (sparseArray.get(4) != null) {
            AbstractC3583h0.j(4);
        } else if (sparseArray.get(5) != null) {
            AbstractC3583h0.j(5);
        } else if (sparseArray.get(6) != null) {
            AbstractC3583h0.j(6);
        }
    }

    private static void u(Context context, C0474c1 c0474c1, InterfaceC2955a interfaceC2955a) {
        if (c0474c1 != null) {
            AbstractC3583h0.a("CameraX", "QuirkSettings from CameraXConfig: " + c0474c1);
        } else {
            c0474c1 = (C0474c1) interfaceC2955a.apply(context);
            AbstractC3583h0.a("CameraX", "QuirkSettings from app metadata: " + c0474c1);
        }
        if (c0474c1 == null) {
            c0474c1 = C0477d1.f1451b;
            AbstractC3583h0.a("CameraX", "QuirkSettings by default: " + c0474c1);
        }
        C0477d1.b().d(c0474c1);
    }

    public F.K g() {
        F.K k10 = this.f33596g;
        if (k10 != null) {
            return k10;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public F.Z h() {
        return this.f33590a;
    }

    public InterfaceC3601v i() {
        InterfaceC3601v interfaceC3601v = this.f33600k;
        if (interfaceC3601v != null) {
            return interfaceC3601v;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public int j() {
        return this.f33607r;
    }

    public InterfaceFutureC2904a l() {
        return this.f33602m;
    }

    public InterfaceFutureC2904a q() {
        return r();
    }

    C3558C(Context context, C3559D.b bVar, InterfaceC2955a interfaceC2955a) {
        this.f33590a = new F.Z();
        this.f33591b = new Object();
        this.f33604o = a.UNINITIALIZED;
        this.f33605p = J.n.p(null);
        if (bVar != null) {
            this.f33592c = bVar.getCameraXConfig();
        } else {
            C3559D.b bVarK = k(context);
            if (bVarK == null) {
                throw new IllegalStateException("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            }
            this.f33592c = bVarK.getCameraXConfig();
        }
        u(context, this.f33592c.m0(), interfaceC2955a);
        this.f33607r = this.f33592c.k0();
        Executor executorG0 = this.f33592c.g0(null);
        Handler handlerN0 = this.f33592c.n0(null);
        executorG0 = executorG0 == null ? new ExecutorC3594n() : executorG0;
        this.f33593d = executorG0;
        if (handlerN0 == null) {
            HandlerThread handlerThread = new HandlerThread("CameraX-scheduler", 10);
            this.f33595f = handlerThread;
            handlerThread.start();
            this.f33594e = D0.g.a(handlerThread.getLooper());
        } else {
            this.f33595f = null;
            this.f33594e = handlerN0;
        }
        Integer num = (Integer) this.f33592c.f(C3559D.f33621V, null);
        this.f33606q = num;
        m(num);
        this.f33601l = new r0.a(this.f33592c.j0()).a();
        this.f33603n = new F.U(executorG0);
        this.f33602m = o(context);
    }
}
