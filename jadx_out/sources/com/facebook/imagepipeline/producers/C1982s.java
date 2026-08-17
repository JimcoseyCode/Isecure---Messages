package com.facebook.imagepipeline.producers;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C1982s implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f20197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f20198b;

    public C1982s(d0 inputProducer, ScheduledExecutorService scheduledExecutorService) {
        AbstractC2855l.g(inputProducer, "inputProducer");
        this.f20197a = inputProducer;
        this.f20198b = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C1982s this$0, InterfaceC1978n consumer, e0 context) {
        AbstractC2855l.g(this$0, "this$0");
        AbstractC2855l.g(consumer, "$consumer");
        AbstractC2855l.g(context, "$context");
        this$0.f20197a.b(consumer, context);
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(final InterfaceC1978n consumer, final e0 context) {
        AbstractC2855l.g(consumer, "consumer");
        AbstractC2855l.g(context, "context");
        com.facebook.imagepipeline.request.b bVarE = context.e();
        ScheduledExecutorService scheduledExecutorService = this.f20198b;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.schedule(new Runnable() { // from class: com.facebook.imagepipeline.producers.r
                @Override // java.lang.Runnable
                public final void run() {
                    C1982s.d(this.f20186g, consumer, context);
                }
            }, bVarE.getDelayMs(), TimeUnit.MILLISECONDS);
        } else {
            this.f20197a.b(consumer, context);
        }
    }
}
