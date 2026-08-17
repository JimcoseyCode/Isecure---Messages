package Y8;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.C;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f13143b = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "lastScheduledTask$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f13144c = AtomicIntegerFieldUpdater.newUpdater(l.class, "producerIndex$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f13145d = AtomicIntegerFieldUpdater.newUpdater(l.class, "consumerIndex$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f13146e = AtomicIntegerFieldUpdater.newUpdater(l.class, "blockingTasksInBuffer$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReferenceArray f13147a = new AtomicReferenceArray(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    private final h b(h hVar) {
        if (e() == 127) {
            return hVar;
        }
        if (hVar.f13134h) {
            f13146e.incrementAndGet(this);
        }
        int i10 = f13144c.get(this) & 127;
        while (this.f13147a.get(i10) != null) {
            Thread.yield();
        }
        this.f13147a.lazySet(i10, hVar);
        f13144c.incrementAndGet(this);
        return null;
    }

    private final void c(h hVar) {
        if (hVar == null || !hVar.f13134h) {
            return;
        }
        f13146e.decrementAndGet(this);
    }

    private final int e() {
        return f13144c.get(this) - f13145d.get(this);
    }

    private final h m() {
        h hVar;
        while (true) {
            int i10 = f13145d.get(this);
            if (i10 - f13144c.get(this) == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (f13145d.compareAndSet(this, i10, i10 + 1) && (hVar = (h) this.f13147a.getAndSet(i11, null)) != null) {
                c(hVar);
                return hVar;
            }
        }
    }

    private final boolean n(d dVar) {
        h hVarM = m();
        if (hVarM == null) {
            return false;
        }
        dVar.a(hVarM);
        return true;
    }

    private final h o(boolean z10) {
        h hVar;
        do {
            hVar = (h) f13143b.get(this);
            if (hVar == null || hVar.f13134h != z10) {
                int i10 = f13145d.get(this);
                int i11 = f13144c.get(this);
                while (i10 != i11) {
                    if (z10 && f13146e.get(this) == 0) {
                        return null;
                    }
                    i11--;
                    h hVarQ = q(i11, z10);
                    if (hVarQ != null) {
                        return hVarQ;
                    }
                }
                return null;
            }
        } while (!androidx.concurrent.futures.b.a(f13143b, this, hVar, null));
        return hVar;
    }

    private final h p(int i10) {
        int i11 = f13145d.get(this);
        int i12 = f13144c.get(this);
        boolean z10 = i10 == 1;
        while (i11 != i12) {
            if (z10 && f13146e.get(this) == 0) {
                return null;
            }
            int i13 = i11 + 1;
            h hVarQ = q(i11, z10);
            if (hVarQ != null) {
                return hVarQ;
            }
            i11 = i13;
        }
        return null;
    }

    private final h q(int i10, boolean z10) {
        int i11 = i10 & 127;
        h hVar = (h) this.f13147a.get(i11);
        if (hVar == null || hVar.f13134h != z10 || !T8.l.a(this.f13147a, i11, hVar, null)) {
            return null;
        }
        if (z10) {
            f13146e.decrementAndGet(this);
        }
        return hVar;
    }

    private final long s(int i10, C c10) {
        h hVar;
        do {
            hVar = (h) f13143b.get(this);
            if (hVar == null) {
                return -2L;
            }
            if (((hVar.f13134h ? 1 : 2) & i10) == 0) {
                return -2L;
            }
            long jA = j.f13141f.a() - hVar.f13133g;
            long j10 = j.f13137b;
            if (jA < j10) {
                return j10 - jA;
            }
        } while (!androidx.concurrent.futures.b.a(f13143b, this, hVar, null));
        c10.f29371g = hVar;
        return -1L;
    }

    public final h a(h hVar, boolean z10) {
        if (z10) {
            return b(hVar);
        }
        h hVar2 = (h) f13143b.getAndSet(this, hVar);
        if (hVar2 == null) {
            return null;
        }
        return b(hVar2);
    }

    public final int i() {
        return f13143b.get(this) != null ? e() + 1 : e();
    }

    public final void j(d dVar) {
        h hVar = (h) f13143b.getAndSet(this, null);
        if (hVar != null) {
            dVar.a(hVar);
        }
        while (n(dVar)) {
        }
    }

    public final h k() {
        h hVar = (h) f13143b.getAndSet(this, null);
        return hVar == null ? m() : hVar;
    }

    public final h l() {
        return o(true);
    }

    public final long r(int i10, C c10) {
        h hVarM = i10 == 3 ? m() : p(i10);
        if (hVarM == null) {
            return s(i10, c10);
        }
        c10.f29371g = hVarM;
        return -1L;
    }
}
