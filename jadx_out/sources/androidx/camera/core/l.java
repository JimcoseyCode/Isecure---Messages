package androidx.camera.core;

import F.F0;
import androidx.camera.core.e;
import androidx.camera.core.l;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class l extends j {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final Executor f15228v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Object f15229w = new Object();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    o f15230x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private b f15231y;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class b extends e {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final WeakReference f15234j;

        b(o oVar, l lVar) {
            super(oVar);
            this.f15234j = new WeakReference(lVar);
            d(new e.a() { // from class: androidx.camera.core.n
                @Override // androidx.camera.core.e.a
                public final void a(o oVar2) {
                    l.b.k(this.f15236a, oVar2);
                }
            });
        }

        public static /* synthetic */ void k(b bVar, o oVar) {
            final l lVar = (l) bVar.f15234j.get();
            if (lVar != null) {
                lVar.f15228v.execute(new Runnable() { // from class: androidx.camera.core.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        lVar.w();
                    }
                });
            }
        }
    }

    l(Executor executor) {
        this.f15228v = executor;
    }

    @Override // androidx.camera.core.j
    o d(F0 f02) {
        return f02.b();
    }

    @Override // androidx.camera.core.j
    void f() {
        synchronized (this.f15229w) {
            try {
                o oVar = this.f15230x;
                if (oVar != null) {
                    oVar.close();
                    this.f15230x = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.j
    void l(o oVar) {
        synchronized (this.f15229w) {
            try {
                if (!this.f15225u) {
                    oVar.close();
                    return;
                }
                if (this.f15231y == null) {
                    b bVar = new b(oVar, this);
                    this.f15231y = bVar;
                    J.n.j(e(bVar), new a(bVar), I.c.b());
                } else {
                    if (oVar.i().a() <= this.f15231y.i().a()) {
                        oVar.close();
                    } else {
                        o oVar2 = this.f15230x;
                        if (oVar2 != null) {
                            oVar2.close();
                        }
                        this.f15230x = oVar;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w() {
        synchronized (this.f15229w) {
            try {
                this.f15231y = null;
                o oVar = this.f15230x;
                if (oVar != null) {
                    this.f15230x = null;
                    l(oVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements J.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f15232a;

        a(b bVar) {
            this.f15232a = bVar;
        }

        @Override // J.c
        public void onFailure(Throwable th) {
            this.f15232a.close();
        }

        @Override // J.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
        }
    }
}
