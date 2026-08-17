package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import p5.InterfaceC3080a;
import q5.C3119c;
import q5.D;
import q5.InterfaceC3120d;
import q5.w;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ThreadPoolCreation"})
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final w f24025a = new w(new C5.b() { // from class: r5.b
        @Override // C5.b
        public final Object get() {
            return ExecutorsRegistrar.m(Executors.newFixedThreadPool(4, ExecutorsRegistrar.k("Firebase Background", 10, ExecutorsRegistrar.i())));
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final w f24026b = new w(new C5.b() { // from class: r5.c
        @Override // C5.b
        public final Object get() {
            return ExecutorsRegistrar.m(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), ExecutorsRegistrar.k("Firebase Lite", 0, ExecutorsRegistrar.l())));
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final w f24027c = new w(new C5.b() { // from class: r5.d
        @Override // C5.b
        public final Object get() {
            return ExecutorsRegistrar.m(Executors.newCachedThreadPool(ExecutorsRegistrar.j("Firebase Blocking", 11)));
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final w f24028d = new w(new C5.b() { // from class: r5.e
        @Override // C5.b
        public final Object get() {
            return Executors.newSingleThreadScheduledExecutor(ExecutorsRegistrar.j("Firebase Scheduler", 0));
        }
    });

    public static /* synthetic */ ScheduledExecutorService a(InterfaceC3120d interfaceC3120d) {
        return (ScheduledExecutorService) f24026b.get();
    }

    public static /* synthetic */ ScheduledExecutorService e(InterfaceC3120d interfaceC3120d) {
        return (ScheduledExecutorService) f24027c.get();
    }

    public static /* synthetic */ ScheduledExecutorService g(InterfaceC3120d interfaceC3120d) {
        return (ScheduledExecutorService) f24025a.get();
    }

    private static StrictMode.ThreadPolicy i() {
        StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i10 = Build.VERSION.SDK_INT;
        builderDetectNetwork.detectResourceMismatches();
        if (i10 >= 26) {
            builderDetectNetwork.detectUnbufferedIo();
        }
        return builderDetectNetwork.penaltyLog().build();
    }

    private static ThreadFactory j(String str, int i10) {
        return new b(str, i10, null);
    }

    private static ThreadFactory k(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        return new b(str, i10, threadPolicy);
    }

    private static StrictMode.ThreadPolicy l() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ScheduledExecutorService m(ExecutorService executorService) {
        return new o(executorService, (ScheduledExecutorService) f24028d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return Arrays.asList(C3119c.f(D.a(InterfaceC3080a.class, ScheduledExecutorService.class), D.a(InterfaceC3080a.class, ExecutorService.class), D.a(InterfaceC3080a.class, Executor.class)).e(new q5.g() { // from class: r5.f
            @Override // q5.g
            public final Object a(InterfaceC3120d interfaceC3120d) {
                return ExecutorsRegistrar.g(interfaceC3120d);
            }
        }).d(), C3119c.f(D.a(p5.b.class, ScheduledExecutorService.class), D.a(p5.b.class, ExecutorService.class), D.a(p5.b.class, Executor.class)).e(new q5.g() { // from class: r5.g
            @Override // q5.g
            public final Object a(InterfaceC3120d interfaceC3120d) {
                return ExecutorsRegistrar.e(interfaceC3120d);
            }
        }).d(), C3119c.f(D.a(p5.c.class, ScheduledExecutorService.class), D.a(p5.c.class, ExecutorService.class), D.a(p5.c.class, Executor.class)).e(new q5.g() { // from class: r5.h
            @Override // q5.g
            public final Object a(InterfaceC3120d interfaceC3120d) {
                return ExecutorsRegistrar.a(interfaceC3120d);
            }
        }).d(), C3119c.e(D.a(p5.d.class, Executor.class)).e(new q5.g() { // from class: r5.i
            @Override // q5.g
            public final Object a(InterfaceC3120d interfaceC3120d) {
                return l.INSTANCE;
            }
        }).d());
    }
}
