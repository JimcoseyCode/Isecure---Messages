package com.facebook.imagepipeline.producers;

import g2.AbstractC2662a;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f20104a;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private final class a extends AbstractC1983t {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ j0 f20105c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j0 j0Var, InterfaceC1978n consumer) {
            super(consumer);
            AbstractC2855l.g(consumer, "consumer");
            this.f20105c = j0Var;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC1967c
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void h(d3.k kVar, int i10) {
            AbstractC2662a abstractC2662aR = null;
            try {
                if (d3.k.u0(kVar) && kVar != null) {
                    abstractC2662aR = kVar.r();
                }
                o().c(abstractC2662aR, i10);
                AbstractC2662a.B(abstractC2662aR);
            } catch (Throwable th) {
                AbstractC2662a.B(abstractC2662aR);
                throw th;
            }
        }
    }

    public j0(d0 inputProducer) {
        AbstractC2855l.g(inputProducer, "inputProducer");
        this.f20104a = inputProducer;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC1978n consumer, e0 context) {
        AbstractC2855l.g(consumer, "consumer");
        AbstractC2855l.g(context, "context");
        this.f20104a.b(new a(this, consumer), context);
    }
}
