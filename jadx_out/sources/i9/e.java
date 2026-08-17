package i9;

import com.facebook.react.uimanager.ViewDefaults;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import i7.C2735B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Logger f28849i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f28851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f28852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f28853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f28854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f28855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Runnable f28856f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a f28857g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f28850j = new b(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e f28848h = new e(new c(f9.c.K(f9.c.f27873i + " TaskRunner", true)));

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface a {
        void a(e eVar);

        void b(e eVar, long j10);

        long c();

        void execute(Runnable runnable);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {
        private b() {
        }

        public final Logger a() {
            return e.f28849i;
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class c implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ThreadPoolExecutor f28858a;

        public c(ThreadFactory threadFactory) {
            AbstractC2855l.g(threadFactory, "threadFactory");
            this.f28858a = new ThreadPoolExecutor(0, ViewDefaults.NUMBER_OF_LINES, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // i9.e.a
        public void a(e taskRunner) {
            AbstractC2855l.g(taskRunner, "taskRunner");
            taskRunner.notify();
        }

        @Override // i9.e.a
        public void b(e taskRunner, long j10) throws InterruptedException {
            AbstractC2855l.g(taskRunner, "taskRunner");
            long j11 = j10 / 1000000;
            long j12 = j10 - (1000000 * j11);
            if (j11 > 0 || j10 > 0) {
                taskRunner.wait(j11, (int) j12);
            }
        }

        @Override // i9.e.a
        public long c() {
            return System.nanoTime();
        }

        @Override // i9.e.a
        public void execute(Runnable runnable) {
            AbstractC2855l.g(runnable, "runnable");
            this.f28858a.execute(runnable);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i9.a aVarD;
            long jC;
            while (true) {
                synchronized (e.this) {
                    aVarD = e.this.d();
                }
                if (aVarD == null) {
                    return;
                }
                i9.d dVarD = aVarD.d();
                AbstractC2855l.d(dVarD);
                boolean zIsLoggable = e.f28850j.a().isLoggable(Level.FINE);
                if (zIsLoggable) {
                    jC = dVarD.h().g().c();
                    i9.b.c(aVarD, dVarD, "starting");
                } else {
                    jC = -1;
                }
                try {
                    try {
                        e.this.j(aVarD);
                        C2735B c2735b = C2735B.f28704a;
                        if (zIsLoggable) {
                            i9.b.c(aVarD, dVarD, "finished run in " + i9.b.b(dVarD.h().g().c() - jC));
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    if (zIsLoggable) {
                        i9.b.c(aVarD, dVarD, "failed a run in " + i9.b.b(dVarD.h().g().c() - jC));
                    }
                    throw th;
                }
            }
        }
    }

    static {
        Logger logger = Logger.getLogger(e.class.getName());
        AbstractC2855l.f(logger, "Logger.getLogger(TaskRunner::class.java.name)");
        f28849i = logger;
    }

    public e(a backend) {
        AbstractC2855l.g(backend, "backend");
        this.f28857g = backend;
        this.f28851a = ModuleDescriptor.MODULE_VERSION;
        this.f28854d = new ArrayList();
        this.f28855e = new ArrayList();
        this.f28856f = new d();
    }

    private final void c(i9.a aVar, long j10) {
        if (f9.c.f27872h && !Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            AbstractC2855l.f(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        i9.d dVarD = aVar.d();
        AbstractC2855l.d(dVarD);
        if (!(dVarD.c() == aVar)) {
            throw new IllegalStateException("Check failed.");
        }
        boolean zD = dVarD.d();
        dVarD.m(false);
        dVarD.l(null);
        this.f28854d.remove(dVarD);
        if (j10 != -1 && !zD && !dVarD.g()) {
            dVarD.k(aVar, j10, true);
        }
        if (dVarD.e().isEmpty()) {
            return;
        }
        this.f28855e.add(dVarD);
    }

    private final void e(i9.a aVar) {
        if (!f9.c.f27872h || Thread.holdsLock(this)) {
            aVar.g(-1L);
            i9.d dVarD = aVar.d();
            AbstractC2855l.d(dVarD);
            dVarD.e().remove(aVar);
            this.f28855e.remove(dVarD);
            dVarD.l(aVar);
            this.f28854d.add(dVarD);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread threadCurrentThread = Thread.currentThread();
        AbstractC2855l.f(threadCurrentThread, "Thread.currentThread()");
        sb.append(threadCurrentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(i9.a aVar) {
        if (f9.c.f27872h && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            AbstractC2855l.f(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        Thread currentThread = Thread.currentThread();
        AbstractC2855l.f(currentThread, "currentThread");
        String name = currentThread.getName();
        currentThread.setName(aVar.b());
        try {
            long jF = aVar.f();
            synchronized (this) {
                c(aVar, jF);
                C2735B c2735b = C2735B.f28704a;
            }
            currentThread.setName(name);
        } catch (Throwable th) {
            synchronized (this) {
                c(aVar, -1L);
                C2735B c2735b2 = C2735B.f28704a;
                currentThread.setName(name);
                throw th;
            }
        }
    }

    public final i9.a d() {
        boolean z10;
        if (f9.c.f27872h && !Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            AbstractC2855l.f(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        while (!this.f28855e.isEmpty()) {
            long jC = this.f28857g.c();
            Iterator it = this.f28855e.iterator();
            long jMin = Long.MAX_VALUE;
            i9.a aVar = null;
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                i9.a aVar2 = (i9.a) ((i9.d) it.next()).e().get(0);
                long jMax = Math.max(0L, aVar2.c() - jC);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (aVar != null) {
                        z10 = true;
                        break;
                    }
                    aVar = aVar2;
                }
            }
            if (aVar != null) {
                e(aVar);
                if (z10 || (!this.f28852b && !this.f28855e.isEmpty())) {
                    this.f28857g.execute(this.f28856f);
                }
                return aVar;
            }
            if (this.f28852b) {
                if (jMin < this.f28853c - jC) {
                    this.f28857g.a(this);
                }
                return null;
            }
            this.f28852b = true;
            this.f28853c = jC + jMin;
            try {
                try {
                    this.f28857g.b(this, jMin);
                } catch (InterruptedException unused) {
                    f();
                }
            } finally {
                this.f28852b = false;
            }
        }
        return null;
    }

    public final void f() {
        for (int size = this.f28854d.size() - 1; size >= 0; size--) {
            ((i9.d) this.f28854d.get(size)).b();
        }
        for (int size2 = this.f28855e.size() - 1; size2 >= 0; size2--) {
            i9.d dVar = (i9.d) this.f28855e.get(size2);
            dVar.b();
            if (dVar.e().isEmpty()) {
                this.f28855e.remove(size2);
            }
        }
    }

    public final a g() {
        return this.f28857g;
    }

    public final void h(i9.d taskQueue) {
        AbstractC2855l.g(taskQueue, "taskQueue");
        if (f9.c.f27872h && !Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            AbstractC2855l.f(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        if (taskQueue.c() == null) {
            if (taskQueue.e().isEmpty()) {
                this.f28855e.remove(taskQueue);
            } else {
                f9.c.a(this.f28855e, taskQueue);
            }
        }
        if (this.f28852b) {
            this.f28857g.a(this);
        } else {
            this.f28857g.execute(this.f28856f);
        }
    }

    public final i9.d i() {
        int i10;
        synchronized (this) {
            i10 = this.f28851a;
            this.f28851a = i10 + 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('Q');
        sb.append(i10);
        return new i9.d(this, sb.toString());
    }
}
