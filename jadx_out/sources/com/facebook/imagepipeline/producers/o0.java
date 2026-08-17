package com.facebook.imagepipeline.producers;

import android.os.Looper;
import e3.C2395a;
import i7.C2735B;
import j3.C2768b;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 implements d0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f20144c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f20145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p0 f20146b;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String c(e0 e0Var) {
            if (!C2395a.b()) {
                return null;
            }
            return "ThreadHandoffProducer_produceResults_" + e0Var.getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean d(e0 e0Var) {
            return e0Var.m().F().k() && Looper.getMainLooper().getThread() != Thread.currentThread();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b extends AbstractC1970f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ m0 f20147a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o0 f20148b;

        b(m0 m0Var, o0 o0Var) {
            this.f20147a = m0Var;
            this.f20148b = o0Var;
        }

        @Override // com.facebook.imagepipeline.producers.f0
        public void a() {
            this.f20147a.a();
            this.f20148b.d().a(this.f20147a);
        }
    }

    public o0(d0 inputProducer, p0 threadHandoffProducerQueue) {
        AbstractC2855l.g(inputProducer, "inputProducer");
        AbstractC2855l.g(threadHandoffProducerQueue, "threadHandoffProducerQueue");
        this.f20145a = inputProducer;
        this.f20146b = threadHandoffProducerQueue;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC1978n consumer, e0 context) {
        AbstractC2855l.g(consumer, "consumer");
        AbstractC2855l.g(context, "context");
        if (!C2768b.d()) {
            g0 g0VarW = context.W();
            a aVar = f20144c;
            if (aVar.d(context)) {
                g0VarW.e(context, "BackgroundThreadHandoffProducer");
                g0VarW.j(context, "BackgroundThreadHandoffProducer", null);
                this.f20145a.b(consumer, context);
                return;
            } else {
                c cVar = new c(consumer, g0VarW, context, this);
                context.k(new b(cVar, this));
                this.f20146b.b(C2395a.a(cVar, aVar.c(context)));
                return;
            }
        }
        C2768b.a("ThreadHandoffProducer#produceResults");
        try {
            g0 g0VarW2 = context.W();
            a aVar2 = f20144c;
            if (aVar2.d(context)) {
                g0VarW2.e(context, "BackgroundThreadHandoffProducer");
                g0VarW2.j(context, "BackgroundThreadHandoffProducer", null);
                this.f20145a.b(consumer, context);
            } else {
                c cVar2 = new c(consumer, g0VarW2, context, this);
                context.k(new b(cVar2, this));
                this.f20146b.b(C2395a.a(cVar2, aVar2.c(context)));
                C2735B c2735b = C2735B.f28704a;
            }
        } finally {
            C2768b.b();
        }
    }

    public final d0 c() {
        return this.f20145a;
    }

    public final p0 d() {
        return this.f20146b;
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class c extends m0 {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ InterfaceC1978n f20149l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ g0 f20150m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ e0 f20151n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ o0 f20152o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC1978n interfaceC1978n, g0 g0Var, e0 e0Var, o0 o0Var) {
            super(interfaceC1978n, g0Var, e0Var, "BackgroundThreadHandoffProducer");
            this.f20149l = interfaceC1978n;
            this.f20150m = g0Var;
            this.f20151n = e0Var;
            this.f20152o = o0Var;
        }

        @Override // a2.h
        protected Object c() {
            return null;
        }

        @Override // com.facebook.imagepipeline.producers.m0, a2.h
        protected void f(Object obj) {
            this.f20150m.j(this.f20151n, "BackgroundThreadHandoffProducer", null);
            this.f20152o.c().b(this.f20149l, this.f20151n);
        }

        @Override // a2.h
        protected void b(Object obj) {
        }
    }
}
