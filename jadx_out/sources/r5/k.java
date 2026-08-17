package r5;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import r4.AbstractC3268i;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class k implements Executor {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Logger f31947l = Logger.getLogger(k.class.getName());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Executor f31948g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Deque f31949h = new ArrayDeque();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private c f31950i = c.IDLE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f31951j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final b f31952k = new b(this, null);

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements Runnable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Runnable f31953g;

        a(Runnable runnable) {
            this.f31953g = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f31953g.run();
        }

        public String toString() {
            return this.f31953g.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private final class b implements Runnable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Runnable f31955g;

        private b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
        
            if (r1 == false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
            r2 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
        
            r8.f31955g.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x005c, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x005d, code lost:
        
            r5.k.f31947l.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r8.f31955g, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x007a, code lost:
        
            r8.f31955g = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
        
            return;
         */
        /* JADX WARN: Removed duplicated region for block: B:46:0x003d A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void a() {
            Runnable runnable;
            boolean z10 = false;
            boolean zInterrupted = false;
            while (true) {
                try {
                    synchronized (k.this.f31949h) {
                        if (z10) {
                            runnable = (Runnable) k.this.f31949h.poll();
                            this.f31955g = runnable;
                            if (runnable != null) {
                            }
                        } else {
                            c cVar = k.this.f31950i;
                            c cVar2 = c.RUNNING;
                            if (cVar != cVar2) {
                                k.d(k.this);
                                k.this.f31950i = cVar2;
                                z10 = true;
                                runnable = (Runnable) k.this.f31949h.poll();
                                this.f31955g = runnable;
                                if (runnable != null) {
                                    k.this.f31950i = c.IDLE;
                                }
                            }
                        }
                    }
                    if (!zInterrupted) {
                        return;
                    }
                } finally {
                    if (zInterrupted) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a();
            } catch (Error e10) {
                synchronized (k.this.f31949h) {
                    k.this.f31950i = c.IDLE;
                    throw e10;
                }
            }
        }

        public String toString() {
            Runnable runnable = this.f31955g;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + k.this.f31950i + "}";
        }

        /* synthetic */ b(k kVar, a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    enum c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    k(Executor executor) {
        this.f31948g = (Executor) AbstractC3268i.k(executor);
    }

    static /* synthetic */ long d(k kVar) {
        long j10 = kVar.f31951j;
        kVar.f31951j = 1 + j10;
        return j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0061  */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void execute(Runnable runnable) {
        c cVar;
        boolean z10;
        AbstractC3268i.k(runnable);
        synchronized (this.f31949h) {
            c cVar2 = this.f31950i;
            if (cVar2 != c.RUNNING && cVar2 != (cVar = c.QUEUED)) {
                long j10 = this.f31951j;
                a aVar = new a(runnable);
                this.f31949h.add(aVar);
                c cVar3 = c.QUEUING;
                this.f31950i = cVar3;
                try {
                    this.f31948g.execute(this.f31952k);
                    if (this.f31950i != cVar3) {
                        return;
                    }
                    synchronized (this.f31949h) {
                        try {
                            if (this.f31951j == j10 && this.f31950i == cVar3) {
                                this.f31950i = cVar;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e10) {
                    synchronized (this.f31949h) {
                        try {
                            c cVar4 = this.f31950i;
                            if (cVar4 == c.IDLE || cVar4 == c.QUEUING) {
                                z10 = this.f31949h.removeLastOccurrence(aVar);
                            }
                            if (!(e10 instanceof RejectedExecutionException) || z10) {
                                throw e10;
                            }
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.f31949h.add(runnable);
        }
    }

    public String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f31948g + "}";
    }
}
