package com.facebook.imagepipeline.producers;

import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1983t extends AbstractC1967c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1978n f20199b;

    public AbstractC1983t(InterfaceC1978n consumer) {
        AbstractC2855l.g(consumer, "consumer");
        this.f20199b = consumer;
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC1967c
    protected void f() {
        this.f20199b.a();
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC1967c
    protected void g(Throwable t10) {
        AbstractC2855l.g(t10, "t");
        this.f20199b.onFailure(t10);
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC1967c
    protected void i(float f10) {
        this.f20199b.b(f10);
    }

    public final InterfaceC1978n o() {
        return this.f20199b;
    }
}
