package Z;

import Z.S;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: Z.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C1572k extends S.j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AbstractC1579s f13395n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Executor f13396o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final H0.a f13397p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f13398q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f13399r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final long f13400s;

    C1572k(AbstractC1579s abstractC1579s, Executor executor, H0.a aVar, boolean z10, boolean z11, long j10) {
        if (abstractC1579s == null) {
            throw new NullPointerException("Null getOutputOptions");
        }
        this.f13395n = abstractC1579s;
        this.f13396o = executor;
        this.f13397p = aVar;
        this.f13398q = z10;
        this.f13399r = z11;
        this.f13400s = j10;
    }

    @Override // Z.S.j
    Executor A() {
        return this.f13396o;
    }

    @Override // Z.S.j
    H0.a B() {
        return this.f13397p;
    }

    @Override // Z.S.j
    AbstractC1579s I() {
        return this.f13395n;
    }

    @Override // Z.S.j
    long J() {
        return this.f13400s;
    }

    @Override // Z.S.j
    boolean W() {
        return this.f13398q;
    }

    public boolean equals(Object obj) {
        Executor executor;
        H0.a aVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof S.j) {
            S.j jVar = (S.j) obj;
            if (this.f13395n.equals(jVar.I()) && ((executor = this.f13396o) != null ? executor.equals(jVar.A()) : jVar.A() == null) && ((aVar = this.f13397p) != null ? aVar.equals(jVar.B()) : jVar.B() == null) && this.f13398q == jVar.W() && this.f13399r == jVar.g0() && this.f13400s == jVar.J()) {
                return true;
            }
        }
        return false;
    }

    @Override // Z.S.j
    boolean g0() {
        return this.f13399r;
    }

    public int hashCode() {
        int iHashCode = (this.f13395n.hashCode() ^ 1000003) * 1000003;
        Executor executor = this.f13396o;
        int iHashCode2 = (iHashCode ^ (executor == null ? 0 : executor.hashCode())) * 1000003;
        H0.a aVar = this.f13397p;
        int iHashCode3 = (((iHashCode2 ^ (aVar != null ? aVar.hashCode() : 0)) * 1000003) ^ (this.f13398q ? 1231 : 1237)) * 1000003;
        int i10 = this.f13399r ? 1231 : 1237;
        long j10 = this.f13400s;
        return ((iHashCode3 ^ i10) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "RecordingRecord{getOutputOptions=" + this.f13395n + ", getCallbackExecutor=" + this.f13396o + ", getEventListener=" + this.f13397p + ", hasAudioEnabled=" + this.f13398q + ", isPersistent=" + this.f13399r + ", getRecordingId=" + this.f13400s + "}";
    }
}
