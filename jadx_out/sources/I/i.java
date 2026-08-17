package I;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class i implements Executor {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Executor f3835h;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Deque f3834g = new ArrayDeque();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final b f3836i = new b();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    c f3837j = c.IDLE;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    long f3838k = 0;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements Runnable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Runnable f3839g;

        a(Runnable runnable) {
            this.f3839g = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3839g.run();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    final class b implements Runnable {
        b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
        
            if (r1 == false) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
        
            r3.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x004b, code lost:
        
            r2 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
        
            y.AbstractC3583h0.d("SequentialExecutor", "Exception while executing runnable " + r3, r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
        
            return;
         */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0034 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void a() {
            Runnable runnable;
            boolean z10 = false;
            boolean zInterrupted = false;
            while (true) {
                try {
                    synchronized (i.this.f3834g) {
                        if (z10) {
                            runnable = (Runnable) i.this.f3834g.poll();
                            if (runnable != null) {
                            }
                        } else {
                            i iVar = i.this;
                            c cVar = iVar.f3837j;
                            c cVar2 = c.RUNNING;
                            if (cVar != cVar2) {
                                iVar.f3838k++;
                                iVar.f3837j = cVar2;
                                z10 = true;
                                runnable = (Runnable) i.this.f3834g.poll();
                                if (runnable != null) {
                                    i.this.f3837j = c.IDLE;
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
                synchronized (i.this.f3834g) {
                    i.this.f3837j = c.IDLE;
                    throw e10;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    enum c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    i(Executor executor) {
        this.f3835h = (Executor) H0.g.g(executor);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0061  */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void execute(Runnable runnable) {
        c cVar;
        boolean z10;
        H0.g.g(runnable);
        synchronized (this.f3834g) {
            c cVar2 = this.f3837j;
            if (cVar2 != c.RUNNING && cVar2 != (cVar = c.QUEUED)) {
                long j10 = this.f3838k;
                a aVar = new a(runnable);
                this.f3834g.add(aVar);
                c cVar3 = c.QUEUING;
                this.f3837j = cVar3;
                try {
                    this.f3835h.execute(this.f3836i);
                    if (this.f3837j != cVar3) {
                        return;
                    }
                    synchronized (this.f3834g) {
                        try {
                            if (this.f3838k == j10 && this.f3837j == cVar3) {
                                this.f3837j = cVar;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e10) {
                    synchronized (this.f3834g) {
                        try {
                            c cVar4 = this.f3837j;
                            if (cVar4 == c.IDLE || cVar4 == c.QUEUING) {
                                z10 = this.f3834g.removeLastOccurrence(aVar);
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
            this.f3834g.add(runnable);
        }
    }
}
