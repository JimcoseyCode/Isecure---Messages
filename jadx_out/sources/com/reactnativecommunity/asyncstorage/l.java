package com.reactnativecommunity.asyncstorage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class l implements Executor {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayDeque f24861g = new ArrayDeque();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Runnable f24862h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Executor f24863i;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements Runnable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Runnable f24864g;

        a(Runnable runnable) {
            this.f24864g = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f24864g.run();
            } finally {
                l.this.a();
            }
        }
    }

    public l(Executor executor) {
        this.f24863i = executor;
    }

    synchronized void a() {
        Runnable runnable = (Runnable) this.f24861g.poll();
        this.f24862h = runnable;
        if (runnable != null) {
            this.f24863i.execute(runnable);
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        this.f24861g.offer(new a(runnable));
        if (this.f24862h == null) {
            a();
        }
    }
}
