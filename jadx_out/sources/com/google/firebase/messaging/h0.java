package com.google.firebase.messaging;

import P4.AbstractC1378l;
import P4.AbstractC1381o;
import P4.C1379m;
import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import m0.C2892a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class h0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f24270i = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f24271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final L f24272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final G f24273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final FirebaseMessaging f24274d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ScheduledExecutorService f24276f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final f0 f24278h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f24275e = new C2892a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f24277g = false;

    private h0(FirebaseMessaging firebaseMessaging, L l10, f0 f0Var, G g10, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f24274d = firebaseMessaging;
        this.f24272b = l10;
        this.f24278h = f0Var;
        this.f24273c = g10;
        this.f24271a = context;
        this.f24276f = scheduledExecutorService;
    }

    public static /* synthetic */ h0 a(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, L l10, G g10) {
        return new h0(firebaseMessaging, l10, f0.b(context, scheduledExecutorService), g10, context, scheduledExecutorService);
    }

    private void b(e0 e0Var, C1379m c1379m) {
        ArrayDeque arrayDeque;
        synchronized (this.f24275e) {
            try {
                String strE = e0Var.e();
                if (this.f24275e.containsKey(strE)) {
                    arrayDeque = (ArrayDeque) this.f24275e.get(strE);
                } else {
                    ArrayDeque arrayDeque2 = new ArrayDeque();
                    this.f24275e.put(strE, arrayDeque2);
                    arrayDeque = arrayDeque2;
                }
                arrayDeque.add(c1379m);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void c(AbstractC1378l abstractC1378l) throws IOException {
        try {
            AbstractC1381o.b(abstractC1378l, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e10) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e10);
        } catch (ExecutionException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e11);
            }
            throw ((RuntimeException) cause);
        }
    }

    private void d(String str) throws IOException {
        c(this.f24273c.m(this.f24274d.n(), str));
    }

    private void e(String str) throws IOException {
        c(this.f24273c.n(this.f24274d.n(), str));
    }

    static AbstractC1378l f(final FirebaseMessaging firebaseMessaging, final L l10, final G g10, final Context context, final ScheduledExecutorService scheduledExecutorService) {
        return AbstractC1381o.c(scheduledExecutorService, new Callable() { // from class: com.google.firebase.messaging.g0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return h0.a(context, scheduledExecutorService, firebaseMessaging, l10, g10);
            }
        });
    }

    static boolean h() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    private void j(e0 e0Var) {
        synchronized (this.f24275e) {
            try {
                String strE = e0Var.e();
                if (this.f24275e.containsKey(strE)) {
                    ArrayDeque arrayDeque = (ArrayDeque) this.f24275e.get(strE);
                    C1379m c1379m = (C1379m) arrayDeque.poll();
                    if (c1379m != null) {
                        c1379m.c(null);
                    }
                    if (arrayDeque.isEmpty()) {
                        this.f24275e.remove(strE);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void o() {
        if (i()) {
            return;
        }
        s(0L);
    }

    boolean g() {
        return this.f24278h.c() != null;
    }

    synchronized boolean i() {
        return this.f24277g;
    }

    boolean k(e0 e0Var) throws IOException {
        try {
            String strB = e0Var.b();
            int iHashCode = strB.hashCode();
            if (iHashCode != 83) {
                if (iHashCode == 85 && strB.equals("U")) {
                    e(e0Var.c());
                    if (!h()) {
                        return true;
                    }
                    e0Var.c();
                    return true;
                }
            } else if (strB.equals("S")) {
                d(e0Var.c());
                if (!h()) {
                    return true;
                }
                e0Var.c();
                return true;
            }
            h();
            return true;
        } catch (IOException e10) {
            if ("SERVICE_NOT_AVAILABLE".equals(e10.getMessage()) || "INTERNAL_SERVER_ERROR".equals(e10.getMessage()) || "TOO_MANY_SUBSCRIBERS".equals(e10.getMessage())) {
                e10.getMessage();
                return false;
            }
            if (e10.getMessage() == null) {
                return false;
            }
            throw e10;
        }
    }

    void l(Runnable runnable, long j10) {
        this.f24276f.schedule(runnable, j10, TimeUnit.SECONDS);
    }

    AbstractC1378l m(e0 e0Var) {
        this.f24278h.a(e0Var);
        C1379m c1379m = new C1379m();
        b(e0Var, c1379m);
        return c1379m.a();
    }

    synchronized void n(boolean z10) {
        this.f24277g = z10;
    }

    void p() {
        if (g()) {
            o();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1378l q(String str) {
        AbstractC1378l abstractC1378lM = m(e0.f(str));
        p();
        return abstractC1378lM;
    }

    boolean r() {
        while (true) {
            synchronized (this) {
                try {
                    e0 e0VarC = this.f24278h.c();
                    if (e0VarC == null) {
                        h();
                        return true;
                    }
                    if (!k(e0VarC)) {
                        return false;
                    }
                    this.f24278h.e(e0VarC);
                    j(e0VarC);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    void s(long j10) {
        l(new i0(this, this.f24271a, this.f24272b, Math.min(Math.max(30L, 2 * j10), f24270i)), j10);
        n(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1378l t(String str) {
        AbstractC1378l abstractC1378lM = m(e0.g(str));
        p();
        return abstractC1378lM;
    }
}
