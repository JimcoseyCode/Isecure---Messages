package com.facebook.imagepipeline.producers;

import java.util.Map;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class E implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h0 f19939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g0 f19940b;

    public E(h0 h0Var, g0 g0Var) {
        this.f19939a = h0Var;
        this.f19940b = g0Var;
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public void a(e0 context, String str, String str2) {
        AbstractC2855l.g(context, "context");
        h0 h0Var = this.f19939a;
        if (h0Var != null) {
            h0Var.onProducerEvent(context.getId(), str, str2);
        }
        g0 g0Var = this.f19940b;
        if (g0Var != null) {
            g0Var.a(context, str, str2);
        }
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public void c(e0 context, String str, boolean z10) {
        AbstractC2855l.g(context, "context");
        h0 h0Var = this.f19939a;
        if (h0Var != null) {
            h0Var.onUltimateProducerReached(context.getId(), str, z10);
        }
        g0 g0Var = this.f19940b;
        if (g0Var != null) {
            g0Var.c(context, str, z10);
        }
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public void d(e0 context, String str, Map map) {
        AbstractC2855l.g(context, "context");
        h0 h0Var = this.f19939a;
        if (h0Var != null) {
            h0Var.onProducerFinishWithCancellation(context.getId(), str, map);
        }
        g0 g0Var = this.f19940b;
        if (g0Var != null) {
            g0Var.d(context, str, map);
        }
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public void e(e0 context, String str) {
        AbstractC2855l.g(context, "context");
        h0 h0Var = this.f19939a;
        if (h0Var != null) {
            h0Var.onProducerStart(context.getId(), str);
        }
        g0 g0Var = this.f19940b;
        if (g0Var != null) {
            g0Var.e(context, str);
        }
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public boolean g(e0 context, String str) {
        AbstractC2855l.g(context, "context");
        h0 h0Var = this.f19939a;
        Boolean boolValueOf = h0Var != null ? Boolean.valueOf(h0Var.requiresExtraMap(context.getId())) : null;
        if (!AbstractC2855l.b(boolValueOf, Boolean.TRUE)) {
            g0 g0Var = this.f19940b;
            boolValueOf = g0Var != null ? Boolean.valueOf(g0Var.g(context, str)) : null;
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public void j(e0 context, String str, Map map) {
        AbstractC2855l.g(context, "context");
        h0 h0Var = this.f19939a;
        if (h0Var != null) {
            h0Var.onProducerFinishWithSuccess(context.getId(), str, map);
        }
        g0 g0Var = this.f19940b;
        if (g0Var != null) {
            g0Var.j(context, str, map);
        }
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public void k(e0 context, String str, Throwable th, Map map) {
        AbstractC2855l.g(context, "context");
        h0 h0Var = this.f19939a;
        if (h0Var != null) {
            h0Var.onProducerFinishWithFailure(context.getId(), str, th, map);
        }
        g0 g0Var = this.f19940b;
        if (g0Var != null) {
            g0Var.k(context, str, th, map);
        }
    }
}
