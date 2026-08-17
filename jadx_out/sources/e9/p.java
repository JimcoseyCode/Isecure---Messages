package e9;

import com.facebook.react.uimanager.ViewDefaults;
import i7.C2735B;
import j7.AbstractC2800q;
import j9.e;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Runnable f26303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ExecutorService f26304d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f26301a = 64;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f26302b = 5;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ArrayDeque f26305e = new ArrayDeque();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayDeque f26306f = new ArrayDeque();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayDeque f26307g = new ArrayDeque();

    private final e.a d(String str) {
        for (e.a aVar : this.f26306f) {
            if (AbstractC2855l.b(aVar.d(), str)) {
                return aVar;
            }
        }
        for (e.a aVar2 : this.f26305e) {
            if (AbstractC2855l.b(aVar2.d(), str)) {
                return aVar2;
            }
        }
        return null;
    }

    private final void e(Deque deque, Object obj) {
        Runnable runnable;
        synchronized (this) {
            if (!deque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnable = this.f26303c;
            C2735B c2735b = C2735B.f28704a;
        }
        if (h() || runnable == null) {
            return;
        }
        runnable.run();
    }

    private final boolean h() {
        int i10;
        boolean z10;
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
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = this.f26305e.iterator();
                AbstractC2855l.f(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    e.a asyncCall = (e.a) it.next();
                    if (this.f26306f.size() >= this.f26301a) {
                        break;
                    }
                    if (asyncCall.c().get() < this.f26302b) {
                        it.remove();
                        asyncCall.c().incrementAndGet();
                        AbstractC2855l.f(asyncCall, "asyncCall");
                        arrayList.add(asyncCall);
                        this.f26306f.add(asyncCall);
                    }
                }
                z10 = k() > 0;
                C2735B c2735b = C2735B.f28704a;
            } catch (Throwable th) {
                throw th;
            }
        }
        int size = arrayList.size();
        for (i10 = 0; i10 < size; i10++) {
            ((e.a) arrayList.get(i10)).a(c());
        }
        return z10;
    }

    public final void a(e.a call) {
        e.a aVarD;
        AbstractC2855l.g(call, "call");
        synchronized (this) {
            try {
                this.f26305e.add(call);
                if (!call.b().n() && (aVarD = d(call.d())) != null) {
                    call.e(aVarD);
                }
                C2735B c2735b = C2735B.f28704a;
            } catch (Throwable th) {
                throw th;
            }
        }
        h();
    }

    public final synchronized void b(j9.e call) {
        AbstractC2855l.g(call, "call");
        this.f26307g.add(call);
    }

    public final synchronized ExecutorService c() {
        ExecutorService executorService;
        try {
            if (this.f26304d == null) {
                this.f26304d = new ThreadPoolExecutor(0, ViewDefaults.NUMBER_OF_LINES, 60L, TimeUnit.SECONDS, new SynchronousQueue(), f9.c.K(f9.c.f27873i + " Dispatcher", false));
            }
            executorService = this.f26304d;
            AbstractC2855l.d(executorService);
        } catch (Throwable th) {
            throw th;
        }
        return executorService;
    }

    public final void f(e.a call) {
        AbstractC2855l.g(call, "call");
        call.c().decrementAndGet();
        e(this.f26306f, call);
    }

    public final void g(j9.e call) {
        AbstractC2855l.g(call, "call");
        e(this.f26307g, call);
    }

    public final synchronized List i() {
        List listUnmodifiableList;
        try {
            ArrayDeque arrayDeque = this.f26305e;
            ArrayList arrayList = new ArrayList(AbstractC2800q.u(arrayDeque, 10));
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                arrayList.add(((e.a) it.next()).b());
            }
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            AbstractC2855l.f(listUnmodifiableList, "Collections.unmodifiable…yncCalls.map { it.call })");
        } catch (Throwable th) {
            throw th;
        }
        return listUnmodifiableList;
    }

    public final synchronized List j() {
        List listUnmodifiableList;
        try {
            ArrayDeque arrayDeque = this.f26307g;
            ArrayDeque arrayDeque2 = this.f26306f;
            ArrayList arrayList = new ArrayList(AbstractC2800q.u(arrayDeque2, 10));
            Iterator it = arrayDeque2.iterator();
            while (it.hasNext()) {
                arrayList.add(((e.a) it.next()).b());
            }
            listUnmodifiableList = Collections.unmodifiableList(AbstractC2800q.z0(arrayDeque, arrayList));
            AbstractC2855l.f(listUnmodifiableList, "Collections.unmodifiable…yncCalls.map { it.call })");
        } catch (Throwable th) {
            throw th;
        }
        return listUnmodifiableList;
    }

    public final synchronized int k() {
        return this.f26306f.size() + this.f26307g.size();
    }
}
