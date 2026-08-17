package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class f0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static WeakReference f24256d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f24257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b0 f24258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f24259c;

    private f0(SharedPreferences sharedPreferences, Executor executor) {
        this.f24259c = executor;
        this.f24257a = sharedPreferences;
    }

    public static synchronized f0 b(Context context, Executor executor) {
        f0 f0Var;
        try {
            WeakReference weakReference = f24256d;
            f0Var = weakReference != null ? (f0) weakReference.get() : null;
            if (f0Var == null) {
                f0Var = new f0(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                f0Var.d();
                f24256d = new WeakReference(f0Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f0Var;
    }

    private synchronized void d() {
        this.f24258b = b0.d(this.f24257a, "topic_operation_queue", ",", this.f24259c);
    }

    synchronized boolean a(e0 e0Var) {
        return this.f24258b.b(e0Var.e());
    }

    synchronized e0 c() {
        return e0.a(this.f24258b.f());
    }

    synchronized boolean e(e0 e0Var) {
        return this.f24258b.g(e0Var.e());
    }
}
