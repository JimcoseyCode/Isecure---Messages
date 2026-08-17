package j9;

import e9.C2433a;
import i7.C2735B;
import j9.e;
import java.lang.ref.Reference;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f29039f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f29040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i9.d f29041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f29042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ConcurrentLinkedQueue f29043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f29044e;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b extends i9.a {
        b(String str) {
            super(str, false, 2, null);
        }

        @Override // i9.a
        public long f() {
            return h.this.b(System.nanoTime());
        }
    }

    public h(i9.e taskRunner, int i10, long j10, TimeUnit timeUnit) {
        AbstractC2855l.g(taskRunner, "taskRunner");
        AbstractC2855l.g(timeUnit, "timeUnit");
        this.f29044e = i10;
        this.f29040a = timeUnit.toNanos(j10);
        this.f29041b = taskRunner.i();
        this.f29042c = new b(f9.c.f27873i + " ConnectionPool");
        this.f29043d = new ConcurrentLinkedQueue();
        if (j10 > 0) {
            return;
        }
        throw new IllegalArgumentException(("keepAliveDuration <= 0: " + j10).toString());
    }

    private final int d(f fVar, long j10) {
        if (f9.c.f27872h && !Thread.holdsLock(fVar)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            AbstractC2855l.f(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(fVar);
            throw new AssertionError(sb.toString());
        }
        List listN = fVar.n();
        int i10 = 0;
        while (i10 < listN.size()) {
            Reference reference = (Reference) listN.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                o9.j.f30594c.g().m("A connection to " + fVar.A().a().l() + " was leaked. Did you forget to close a response body?", ((e.b) reference).a());
                listN.remove(i10);
                fVar.D(true);
                if (listN.isEmpty()) {
                    fVar.C(j10 - this.f29040a);
                    return 0;
                }
            }
        }
        return listN.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d A[Catch: all -> 0x002b, TryCatch #0 {all -> 0x002b, blocks: (B:8:0x0024, B:15:0x0033, B:13:0x002d, B:18:0x0037), top: B:26:0x0024 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(C2433a address, e call, List list, boolean z10) {
        AbstractC2855l.g(address, "address");
        AbstractC2855l.g(call, "call");
        for (f connection : this.f29043d) {
            AbstractC2855l.f(connection, "connection");
            synchronized (connection) {
                if (z10) {
                    try {
                        if (connection.v()) {
                            if (connection.t(address, list)) {
                                call.c(connection);
                                return true;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                C2735B c2735b = C2735B.f28704a;
            }
        }
        return false;
    }

    public final long b(long j10) {
        int i10 = 0;
        long j11 = Long.MIN_VALUE;
        f fVar = null;
        int i11 = 0;
        for (f connection : this.f29043d) {
            AbstractC2855l.f(connection, "connection");
            synchronized (connection) {
                try {
                    if (d(connection, j10) > 0) {
                        i11++;
                    } else {
                        i10++;
                        long jO = j10 - connection.o();
                        if (jO > j11) {
                            C2735B c2735b = C2735B.f28704a;
                            fVar = connection;
                            j11 = jO;
                        } else {
                            C2735B c2735b2 = C2735B.f28704a;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        long j12 = this.f29040a;
        if (j11 < j12 && i10 <= this.f29044e) {
            if (i10 > 0) {
                return j12 - j11;
            }
            if (i11 > 0) {
                return j12;
            }
            return -1L;
        }
        AbstractC2855l.d(fVar);
        synchronized (fVar) {
            if (!fVar.n().isEmpty()) {
                return 0L;
            }
            if (fVar.o() + j11 != j10) {
                return 0L;
            }
            fVar.D(true);
            this.f29043d.remove(fVar);
            f9.c.k(fVar.E());
            if (this.f29043d.isEmpty()) {
                this.f29041b.a();
            }
            return 0L;
        }
    }

    public final boolean c(f connection) {
        AbstractC2855l.g(connection, "connection");
        if (f9.c.f27872h && !Thread.holdsLock(connection)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            AbstractC2855l.f(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(connection);
            throw new AssertionError(sb.toString());
        }
        if (!connection.p() && this.f29044e != 0) {
            i9.d.j(this.f29041b, this.f29042c, 0L, 2, null);
            return false;
        }
        connection.D(true);
        this.f29043d.remove(connection);
        if (this.f29043d.isEmpty()) {
            this.f29041b.a();
        }
        return true;
    }

    public final void e(f connection) {
        AbstractC2855l.g(connection, "connection");
        if (!f9.c.f27872h || Thread.holdsLock(connection)) {
            this.f29043d.add(connection);
            i9.d.j(this.f29041b, this.f29042c, 0L, 2, null);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread threadCurrentThread = Thread.currentThread();
        AbstractC2855l.f(threadCurrentThread, "Thread.currentThread()");
        sb.append(threadCurrentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(connection);
        throw new AssertionError(sb.toString());
    }
}
