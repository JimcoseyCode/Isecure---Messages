package androidx.activity;

import i7.C2735B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC2855l;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f13778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3487a f13779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f13780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f13781d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f13782e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f13783f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f13784g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Runnable f13785h;

    public J(Executor executor, InterfaceC3487a reportFullyDrawn) {
        AbstractC2855l.g(executor, "executor");
        AbstractC2855l.g(reportFullyDrawn, "reportFullyDrawn");
        this.f13778a = executor;
        this.f13779b = reportFullyDrawn;
        this.f13780c = new Object();
        this.f13784g = new ArrayList();
        this.f13785h = new Runnable() { // from class: androidx.activity.I
            @Override // java.lang.Runnable
            public final void run() {
                J.d(this.f13777g);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(J j10) {
        synchronized (j10.f13780c) {
            try {
                j10.f13782e = false;
                if (j10.f13781d == 0 && !j10.f13783f) {
                    j10.f13779b.invoke();
                    j10.b();
                }
                C2735B c2735b = C2735B.f28704a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.f13780c) {
            try {
                this.f13783f = true;
                Iterator it = this.f13784g.iterator();
                while (it.hasNext()) {
                    ((InterfaceC3487a) it.next()).invoke();
                }
                this.f13784g.clear();
                C2735B c2735b = C2735B.f28704a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c() {
        boolean z10;
        synchronized (this.f13780c) {
            z10 = this.f13783f;
        }
        return z10;
    }
}
