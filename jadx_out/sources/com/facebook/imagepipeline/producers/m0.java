package com.facebook.imagepipeline.producers;

import java.util.Map;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m0 extends a2.h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC1978n f20138h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final g0 f20139i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final e0 f20140j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f20141k;

    public m0(InterfaceC1978n consumer, g0 producerListener, e0 producerContext, String producerName) {
        AbstractC2855l.g(consumer, "consumer");
        AbstractC2855l.g(producerListener, "producerListener");
        AbstractC2855l.g(producerContext, "producerContext");
        AbstractC2855l.g(producerName, "producerName");
        this.f20138h = consumer;
        this.f20139i = producerListener;
        this.f20140j = producerContext;
        this.f20141k = producerName;
        producerListener.e(producerContext, producerName);
    }

    @Override // a2.h
    protected void d() {
        g0 g0Var = this.f20139i;
        e0 e0Var = this.f20140j;
        String str = this.f20141k;
        g0Var.d(e0Var, str, g0Var.g(e0Var, str) ? g() : null);
        this.f20138h.a();
    }

    @Override // a2.h
    protected void e(Exception e10) {
        AbstractC2855l.g(e10, "e");
        g0 g0Var = this.f20139i;
        e0 e0Var = this.f20140j;
        String str = this.f20141k;
        g0Var.k(e0Var, str, e10, g0Var.g(e0Var, str) ? h(e10) : null);
        this.f20138h.onFailure(e10);
    }

    @Override // a2.h
    protected void f(Object obj) {
        g0 g0Var = this.f20139i;
        e0 e0Var = this.f20140j;
        String str = this.f20141k;
        g0Var.j(e0Var, str, g0Var.g(e0Var, str) ? i(obj) : null);
        this.f20138h.c(obj, 1);
    }

    protected Map g() {
        return null;
    }

    protected Map h(Exception exc) {
        return null;
    }

    protected Map i(Object obj) {
        return null;
    }
}
