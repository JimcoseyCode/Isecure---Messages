package t9;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B f32558a = new B();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f32559b = 65536;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final A f32560c = new A(new byte[0], 0, 0, false, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f32561d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AtomicReference[] f32562e;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f32561d = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i10 = 0; i10 < iHighestOneBit; i10++) {
            atomicReferenceArr[i10] = new AtomicReference();
        }
        f32562e = atomicReferenceArr;
    }

    private B() {
    }

    private final AtomicReference a() {
        return f32562e[(int) (Thread.currentThread().getId() & (((long) f32561d) - 1))];
    }

    public static final void b(A segment) {
        AbstractC2855l.g(segment, "segment");
        if (segment.f32556f != null || segment.f32557g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.f32554d) {
            return;
        }
        AtomicReference atomicReferenceA = f32558a.a();
        A a10 = f32560c;
        A a11 = (A) atomicReferenceA.getAndSet(a10);
        if (a11 == a10) {
            return;
        }
        int i10 = a11 != null ? a11.f32553c : 0;
        if (i10 >= f32559b) {
            atomicReferenceA.set(a11);
            return;
        }
        segment.f32556f = a11;
        segment.f32552b = 0;
        segment.f32553c = i10 + 8192;
        atomicReferenceA.set(segment);
    }

    public static final A c() {
        AtomicReference atomicReferenceA = f32558a.a();
        A a10 = f32560c;
        A a11 = (A) atomicReferenceA.getAndSet(a10);
        if (a11 == a10) {
            return new A();
        }
        if (a11 == null) {
            atomicReferenceA.set(null);
            return new A();
        }
        atomicReferenceA.set(a11.f32556f);
        a11.f32556f = null;
        a11.f32553c = 0;
        return a11;
    }
}
