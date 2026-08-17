package a9;

import W8.B;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class k extends B {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ AtomicReferenceArray f13714e;

    public k(long j10, k kVar, int i10) {
        super(j10, kVar, i10);
        this.f13714e = new AtomicReferenceArray(j.f13713f);
    }

    @Override // W8.B
    public int r() {
        return j.f13713f;
    }

    @Override // W8.B
    public void s(int i10, Throwable th, n7.j jVar) {
        v().set(i10, j.f13712e);
        t();
    }

    public String toString() {
        return "SemaphoreSegment[id=" + this.f12154c + ", hashCode=" + hashCode() + ']';
    }

    public final /* synthetic */ AtomicReferenceArray v() {
        return this.f13714e;
    }
}
