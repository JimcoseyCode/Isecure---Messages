package com.facebook.imagepipeline.producers;

import android.util.Pair;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class r0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f20189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f20190b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f20193e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ConcurrentLinkedQueue f20192d = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f20191c = 0;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class a extends AbstractC1983t {

        /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.r0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class RunnableC0217a implements Runnable {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ Pair f20195g;

            RunnableC0217a(Pair pair) {
                this.f20195g = pair;
            }

            @Override // java.lang.Runnable
            public void run() {
                r0 r0Var = r0.this;
                Pair pair = this.f20195g;
                r0Var.g((InterfaceC1978n) pair.first, (e0) pair.second);
            }
        }

        private void p() {
            Pair pair;
            synchronized (r0.this) {
                try {
                    pair = (Pair) r0.this.f20192d.poll();
                    if (pair == null) {
                        r0 r0Var = r0.this;
                        r0Var.f20191c--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (pair != null) {
                r0.this.f20193e.execute(new RunnableC0217a(pair));
            }
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC1983t, com.facebook.imagepipeline.producers.AbstractC1967c
        protected void f() {
            o().a();
            p();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC1983t, com.facebook.imagepipeline.producers.AbstractC1967c
        protected void g(Throwable th) {
            o().onFailure(th);
            p();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC1967c
        protected void h(Object obj, int i10) {
            o().c(obj, i10);
            if (AbstractC1967c.d(i10)) {
                p();
            }
        }

        private a(InterfaceC1978n interfaceC1978n) {
            super(interfaceC1978n);
        }
    }

    public r0(int i10, Executor executor, d0 d0Var) {
        this.f20190b = i10;
        this.f20193e = (Executor) c2.k.g(executor);
        this.f20189a = (d0) c2.k.g(d0Var);
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC1978n interfaceC1978n, e0 e0Var) {
        boolean z10;
        e0Var.W().e(e0Var, "ThrottlingProducer");
        synchronized (this) {
            try {
                int i10 = this.f20191c;
                z10 = true;
                if (i10 >= this.f20190b) {
                    this.f20192d.add(Pair.create(interfaceC1978n, e0Var));
                } else {
                    this.f20191c = i10 + 1;
                    z10 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z10) {
            return;
        }
        g(interfaceC1978n, e0Var);
    }

    void g(InterfaceC1978n interfaceC1978n, e0 e0Var) {
        e0Var.W().j(e0Var, "ThrottlingProducer", null);
        this.f20189a.b(new a(interfaceC1978n), e0Var);
    }
}
