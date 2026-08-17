package W2;

import d2.AbstractC2325a;
import e3.C2395a;
import g2.AbstractC2662a;
import i7.C2735B;
import j3.C2768b;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f11985h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Class f11986i = j.class;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X1.k f11987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f2.i f11988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f2.l f11989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Executor f11990d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f11991e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final t f11992f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C f11993g;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public j(X1.k fileCache, f2.i pooledByteBufferFactory, f2.l pooledByteStreams, Executor readExecutor, Executor writeExecutor, t imageCacheStatsTracker) {
        AbstractC2855l.g(fileCache, "fileCache");
        AbstractC2855l.g(pooledByteBufferFactory, "pooledByteBufferFactory");
        AbstractC2855l.g(pooledByteStreams, "pooledByteStreams");
        AbstractC2855l.g(readExecutor, "readExecutor");
        AbstractC2855l.g(writeExecutor, "writeExecutor");
        AbstractC2855l.g(imageCacheStatsTracker, "imageCacheStatsTracker");
        this.f11987a = fileCache;
        this.f11988b = pooledByteBufferFactory;
        this.f11989c = pooledByteStreams;
        this.f11990d = readExecutor;
        this.f11991e = writeExecutor;
        this.f11992f = imageCacheStatsTracker;
        C cD = C.d();
        AbstractC2855l.f(cD, "getInstance(...)");
        this.f11993g = cD;
    }

    private final boolean g(W1.d dVar) {
        d3.k kVarC = this.f11993g.c(dVar);
        if (kVarC != null) {
            kVarC.close();
            AbstractC2325a.y(f11986i, "Found image for %s in staging area", dVar.c());
            this.f11992f.f(dVar);
            return true;
        }
        AbstractC2325a.y(f11986i, "Did not find image for %s in staging area", dVar.c());
        this.f11992f.h(dVar);
        try {
            return this.f11987a.d(dVar);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void i(Object obj, j this$0) {
        AbstractC2855l.g(this$0, "this$0");
        Object objE = C2395a.e(obj, null);
        try {
            this$0.f11993g.a();
            this$0.f11987a.a();
            return null;
        } finally {
        }
    }

    private final o1.f l(W1.d dVar, d3.k kVar) {
        AbstractC2325a.y(f11986i, "Found image for %s in staging area", dVar.c());
        this.f11992f.f(dVar);
        o1.f fVarH = o1.f.h(kVar);
        AbstractC2855l.f(fVarH, "forResult(...)");
        return fVarH;
    }

    private final o1.f n(final W1.d dVar, final AtomicBoolean atomicBoolean) {
        try {
            final Object objD = C2395a.d("BufferedDiskCache_getAsync");
            return o1.f.b(new Callable() { // from class: W2.f
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return j.o(objD, atomicBoolean, this, dVar);
                }
            }, this.f11990d);
        } catch (Exception e10) {
            AbstractC2325a.H(f11986i, e10, "Failed to schedule disk-cache read for %s", dVar.c());
            return o1.f.g(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d3.k o(Object obj, AtomicBoolean isCancelled, j this$0, W1.d key) {
        AbstractC2855l.g(isCancelled, "$isCancelled");
        AbstractC2855l.g(this$0, "this$0");
        AbstractC2855l.g(key, "$key");
        Object objE = C2395a.e(obj, null);
        try {
            if (isCancelled.get()) {
                throw new CancellationException();
            }
            d3.k kVarC = this$0.f11993g.c(key);
            if (kVarC != null) {
                AbstractC2325a.y(f11986i, "Found image for %s in staging area", key.c());
                this$0.f11992f.f(key);
            } else {
                AbstractC2325a.y(f11986i, "Did not find image for %s in staging area", key.c());
                this$0.f11992f.h(key);
                try {
                    f2.h hVarR = this$0.r(key);
                    if (hVarR == null) {
                        return null;
                    }
                    AbstractC2662a abstractC2662aG0 = AbstractC2662a.g0(hVarR);
                    AbstractC2855l.f(abstractC2662aG0, "of(...)");
                    try {
                        kVarC = new d3.k(abstractC2662aG0);
                    } finally {
                        AbstractC2662a.B(abstractC2662aG0);
                    }
                } catch (Exception unused) {
                    return null;
                }
            }
            if (!Thread.interrupted()) {
                return kVarC;
            }
            AbstractC2325a.x(f11986i, "Host thread was interrupted, decreasing reference count");
            kVarC.close();
            throw new InterruptedException();
        } catch (Throwable th) {
            try {
                C2395a.c(obj, th);
                throw th;
            } finally {
                C2395a.f(objE);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(Object obj, j this$0, W1.d key, d3.k kVar) {
        AbstractC2855l.g(this$0, "this$0");
        AbstractC2855l.g(key, "$key");
        Object objE = C2395a.e(obj, null);
        try {
            this$0.u(key, kVar);
        } finally {
        }
    }

    private final f2.h r(W1.d dVar) throws IOException {
        try {
            Class cls = f11986i;
            AbstractC2325a.y(cls, "Disk cache read for %s", dVar.c());
            V1.a aVarB = this.f11987a.b(dVar);
            if (aVarB == null) {
                AbstractC2325a.y(cls, "Disk cache miss for %s", dVar.c());
                this.f11992f.l(dVar);
                return null;
            }
            AbstractC2325a.y(cls, "Found entry in disk cache for %s", dVar.c());
            this.f11992f.a(dVar);
            InputStream inputStreamA = aVarB.a();
            try {
                f2.h hVarD = this.f11988b.d(inputStreamA, (int) aVarB.size());
                inputStreamA.close();
                AbstractC2325a.y(cls, "Successful read from disk cache for %s", dVar.c());
                return hVarD;
            } catch (Throwable th) {
                inputStreamA.close();
                throw th;
            }
        } catch (IOException e10) {
            AbstractC2325a.H(f11986i, e10, "Exception reading from cache for %s", dVar.c());
            this.f11992f.d(dVar);
            throw e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void t(Object obj, j this$0, W1.d key) {
        AbstractC2855l.g(this$0, "this$0");
        AbstractC2855l.g(key, "$key");
        Object objE = C2395a.e(obj, null);
        try {
            this$0.f11993g.g(key);
            this$0.f11987a.c(key);
            return null;
        } finally {
        }
    }

    private final void u(W1.d dVar, final d3.k kVar) {
        Class cls = f11986i;
        AbstractC2325a.y(cls, "About to write to disk-cache for key %s", dVar.c());
        try {
            this.f11987a.g(dVar, new W1.j() { // from class: W2.i
                @Override // W1.j
                public final void a(OutputStream outputStream) {
                    j.v(kVar, this, outputStream);
                }
            });
            this.f11992f.i(dVar);
            AbstractC2325a.y(cls, "Successful disk-cache write for key %s", dVar.c());
        } catch (IOException e10) {
            AbstractC2325a.H(f11986i, e10, "Failed to write to disk-cache for key %s", dVar.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(d3.k kVar, j this$0, OutputStream os) {
        AbstractC2855l.g(this$0, "this$0");
        AbstractC2855l.g(os, "os");
        AbstractC2855l.d(kVar);
        InputStream inputStreamJ = kVar.J();
        if (inputStreamJ == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this$0.f11989c.a(inputStreamJ, os);
    }

    public final void f(W1.d key) {
        AbstractC2855l.g(key, "key");
        this.f11987a.f(key);
    }

    public final o1.f h() {
        this.f11993g.a();
        final Object objD = C2395a.d("BufferedDiskCache_clearAll");
        try {
            return o1.f.b(new Callable() { // from class: W2.h
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return j.i(objD, this);
                }
            }, this.f11991e);
        } catch (Exception e10) {
            AbstractC2325a.H(f11986i, e10, "Failed to schedule disk-cache clear", new Object[0]);
            return o1.f.g(e10);
        }
    }

    public final boolean j(W1.d key) {
        AbstractC2855l.g(key, "key");
        return this.f11993g.b(key) || this.f11987a.e(key);
    }

    public final boolean k(W1.d key) {
        AbstractC2855l.g(key, "key");
        if (j(key)) {
            return true;
        }
        return g(key);
    }

    public final o1.f m(W1.d key, AtomicBoolean isCancelled) {
        o1.f fVarN;
        o1.f fVarL;
        AbstractC2855l.g(key, "key");
        AbstractC2855l.g(isCancelled, "isCancelled");
        if (!C2768b.d()) {
            d3.k kVarC = this.f11993g.c(key);
            return (kVarC == null || (fVarL = l(key, kVarC)) == null) ? n(key, isCancelled) : fVarL;
        }
        C2768b.a("BufferedDiskCache#get");
        try {
            d3.k kVarC2 = this.f11993g.c(key);
            if (kVarC2 == null || (fVarN = l(key, kVarC2)) == null) {
                fVarN = n(key, isCancelled);
            }
            C2768b.b();
            return fVarN;
        } catch (Throwable th) {
            C2768b.b();
            throw th;
        }
    }

    public final void p(final W1.d key, d3.k encodedImage) {
        AbstractC2855l.g(key, "key");
        AbstractC2855l.g(encodedImage, "encodedImage");
        if (!C2768b.d()) {
            if (!d3.k.u0(encodedImage)) {
                throw new IllegalStateException("Check failed.");
            }
            this.f11993g.f(key, encodedImage);
            final d3.k kVarE = d3.k.e(encodedImage);
            try {
                final Object objD = C2395a.d("BufferedDiskCache_putAsync");
                this.f11991e.execute(new Runnable() { // from class: W2.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        j.q(objD, this, key, kVarE);
                    }
                });
                return;
            } catch (Exception e10) {
                AbstractC2325a.H(f11986i, e10, "Failed to schedule disk-cache write for %s", key.c());
                this.f11993g.h(key, encodedImage);
                d3.k.k(kVarE);
                return;
            }
        }
        C2768b.a("BufferedDiskCache#put");
        try {
            if (!d3.k.u0(encodedImage)) {
                throw new IllegalStateException("Check failed.");
            }
            this.f11993g.f(key, encodedImage);
            final d3.k kVarE2 = d3.k.e(encodedImage);
            try {
                final Object objD2 = C2395a.d("BufferedDiskCache_putAsync");
                this.f11991e.execute(new Runnable() { // from class: W2.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        j.q(objD2, this, key, kVarE2);
                    }
                });
            } catch (Exception e11) {
                AbstractC2325a.H(f11986i, e11, "Failed to schedule disk-cache write for %s", key.c());
                this.f11993g.h(key, encodedImage);
                d3.k.k(kVarE2);
            }
            C2735B c2735b = C2735B.f28704a;
        } finally {
            C2768b.b();
        }
    }

    public final o1.f s(final W1.d key) {
        AbstractC2855l.g(key, "key");
        this.f11993g.g(key);
        try {
            final Object objD = C2395a.d("BufferedDiskCache_remove");
            return o1.f.b(new Callable() { // from class: W2.g
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return j.t(objD, this, key);
                }
            }, this.f11991e);
        } catch (Exception e10) {
            AbstractC2325a.H(f11986i, e10, "Failed to schedule disk-cache remove for %s", key.c());
            return o1.f.g(e10);
        }
    }
}
