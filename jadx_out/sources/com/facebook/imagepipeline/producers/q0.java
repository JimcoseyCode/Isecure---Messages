package com.facebook.imagepipeline.producers;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f20183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f20184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Deque f20185c;

    public q0(Executor executor) {
        AbstractC2855l.g(executor, "executor");
        this.f20183a = executor;
        this.f20185c = new ArrayDeque();
    }

    @Override // com.facebook.imagepipeline.producers.p0
    public synchronized void a(Runnable runnable) {
        AbstractC2855l.g(runnable, "runnable");
        this.f20185c.remove(runnable);
    }

    @Override // com.facebook.imagepipeline.producers.p0
    public synchronized void b(Runnable runnable) {
        try {
            AbstractC2855l.g(runnable, "runnable");
            if (this.f20184b) {
                this.f20185c.add(runnable);
            } else {
                this.f20183a.execute(runnable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
