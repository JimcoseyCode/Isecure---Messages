package i9;

import i7.C2735B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f28842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f28843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f28844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f28845d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e f28846e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f28847f;

    public d(e taskRunner, String name) {
        AbstractC2855l.g(taskRunner, "taskRunner");
        AbstractC2855l.g(name, "name");
        this.f28846e = taskRunner;
        this.f28847f = name;
        this.f28844c = new ArrayList();
    }

    public static /* synthetic */ void j(d dVar, a aVar, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        dVar.i(aVar, j10);
    }

    public final void a() {
        if (f9.c.f27872h && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            AbstractC2855l.f(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        synchronized (this.f28846e) {
            try {
                if (b()) {
                    this.f28846e.h(this);
                }
                C2735B c2735b = C2735B.f28704a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        a aVar = this.f28843b;
        if (aVar != null) {
            AbstractC2855l.d(aVar);
            if (aVar.a()) {
                this.f28845d = true;
            }
        }
        boolean z10 = false;
        for (int size = this.f28844c.size() - 1; size >= 0; size--) {
            if (((a) this.f28844c.get(size)).a()) {
                a aVar2 = (a) this.f28844c.get(size);
                if (e.f28850j.a().isLoggable(Level.FINE)) {
                    b.c(aVar2, this, "canceled");
                }
                this.f28844c.remove(size);
                z10 = true;
            }
        }
        return z10;
    }

    public final a c() {
        return this.f28843b;
    }

    public final boolean d() {
        return this.f28845d;
    }

    public final List e() {
        return this.f28844c;
    }

    public final String f() {
        return this.f28847f;
    }

    public final boolean g() {
        return this.f28842a;
    }

    public final e h() {
        return this.f28846e;
    }

    public final void i(a task, long j10) {
        AbstractC2855l.g(task, "task");
        synchronized (this.f28846e) {
            if (!this.f28842a) {
                if (k(task, j10, false)) {
                    this.f28846e.h(this);
                }
                C2735B c2735b = C2735B.f28704a;
            } else if (task.a()) {
                if (e.f28850j.a().isLoggable(Level.FINE)) {
                    b.c(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (e.f28850j.a().isLoggable(Level.FINE)) {
                    b.c(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean k(a task, long j10, boolean z10) {
        String str;
        AbstractC2855l.g(task, "task");
        task.e(this);
        long jC = this.f28846e.g().c();
        long j11 = jC + j10;
        int iIndexOf = this.f28844c.indexOf(task);
        if (iIndexOf != -1) {
            if (task.c() <= j11) {
                if (e.f28850j.a().isLoggable(Level.FINE)) {
                    b.c(task, this, "already scheduled");
                }
                return false;
            }
            this.f28844c.remove(iIndexOf);
        }
        task.g(j11);
        if (e.f28850j.a().isLoggable(Level.FINE)) {
            if (z10) {
                str = "run again after " + b.b(j11 - jC);
            } else {
                str = "scheduled after " + b.b(j11 - jC);
            }
            b.c(task, this, str);
        }
        Iterator it = this.f28844c.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (((a) it.next()).c() - jC > j10) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = this.f28844c.size();
        }
        this.f28844c.add(size, task);
        return size == 0;
    }

    public final void l(a aVar) {
        this.f28843b = aVar;
    }

    public final void m(boolean z10) {
        this.f28845d = z10;
    }

    public final void n() {
        if (f9.c.f27872h && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            AbstractC2855l.f(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        synchronized (this.f28846e) {
            try {
                this.f28842a = true;
                if (b()) {
                    this.f28846e.h(this);
                }
                C2735B c2735b = C2735B.f28704a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return this.f28847f;
    }
}
