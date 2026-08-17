package com.facebook.imagepipeline.producers;

import f3.InterfaceC2610d;
import f3.InterfaceC2611e;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class F extends E implements InterfaceC2610d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC2611e f19941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC2610d f19942d;

    public F(InterfaceC2611e interfaceC2611e, InterfaceC2610d interfaceC2610d) {
        super(interfaceC2611e, interfaceC2610d);
        this.f19941c = interfaceC2611e;
        this.f19942d = interfaceC2610d;
    }

    @Override // f3.InterfaceC2610d
    public void b(e0 producerContext) {
        AbstractC2855l.g(producerContext, "producerContext");
        InterfaceC2611e interfaceC2611e = this.f19941c;
        if (interfaceC2611e != null) {
            interfaceC2611e.onRequestStart(producerContext.e(), producerContext.d(), producerContext.getId(), producerContext.A());
        }
        InterfaceC2610d interfaceC2610d = this.f19942d;
        if (interfaceC2610d != null) {
            interfaceC2610d.b(producerContext);
        }
    }

    @Override // f3.InterfaceC2610d
    public void f(e0 producerContext) {
        AbstractC2855l.g(producerContext, "producerContext");
        InterfaceC2611e interfaceC2611e = this.f19941c;
        if (interfaceC2611e != null) {
            interfaceC2611e.onRequestSuccess(producerContext.e(), producerContext.getId(), producerContext.A());
        }
        InterfaceC2610d interfaceC2610d = this.f19942d;
        if (interfaceC2610d != null) {
            interfaceC2610d.f(producerContext);
        }
    }

    @Override // f3.InterfaceC2610d
    public void h(e0 producerContext, Throwable th) {
        AbstractC2855l.g(producerContext, "producerContext");
        InterfaceC2611e interfaceC2611e = this.f19941c;
        if (interfaceC2611e != null) {
            interfaceC2611e.onRequestFailure(producerContext.e(), producerContext.getId(), th, producerContext.A());
        }
        InterfaceC2610d interfaceC2610d = this.f19942d;
        if (interfaceC2610d != null) {
            interfaceC2610d.h(producerContext, th);
        }
    }

    @Override // f3.InterfaceC2610d
    public void i(e0 producerContext) {
        AbstractC2855l.g(producerContext, "producerContext");
        InterfaceC2611e interfaceC2611e = this.f19941c;
        if (interfaceC2611e != null) {
            interfaceC2611e.onRequestCancellation(producerContext.getId());
        }
        InterfaceC2610d interfaceC2610d = this.f19942d;
        if (interfaceC2610d != null) {
            interfaceC2610d.i(producerContext);
        }
    }
}
