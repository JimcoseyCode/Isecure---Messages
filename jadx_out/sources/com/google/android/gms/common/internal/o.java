package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f21244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f21245b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ b f21246c;

    public o(b bVar, Object obj) {
        this.f21246c = bVar;
        this.f21244a = obj;
    }

    protected abstract void a(Object obj);

    protected abstract void b();

    public final void c() {
        Object obj;
        synchronized (this) {
            try {
                obj = this.f21244a;
                if (this.f21245b) {
                    toString();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj != null) {
            a(obj);
        }
        synchronized (this) {
            this.f21245b = true;
        }
        e();
    }

    public final void d() {
        synchronized (this) {
            this.f21244a = null;
        }
    }

    public final void e() {
        d();
        synchronized (this.f21246c.f21219r) {
            this.f21246c.f21219r.remove(this);
        }
    }
}
