package e4;

import com.facebook.react.uimanager.events.PointerEventHelper;
import e4.AbstractC2406e;

/* JADX INFO: renamed from: e4.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C2402a extends AbstractC2406e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f25865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f25866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f25867d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f25868e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f25869f;

    /* JADX INFO: renamed from: e4.a$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class b extends AbstractC2406e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f25870a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f25871b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f25872c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Long f25873d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Integer f25874e;

        b() {
        }

        @Override // e4.AbstractC2406e.a
        AbstractC2406e a() {
            Long l10 = this.f25870a;
            String str = PointerEventHelper.POINTER_TYPE_UNKNOWN;
            if (l10 == null) {
                str = PointerEventHelper.POINTER_TYPE_UNKNOWN + " maxStorageSizeInBytes";
            }
            if (this.f25871b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f25872c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f25873d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f25874e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new C2402a(this.f25870a.longValue(), this.f25871b.intValue(), this.f25872c.intValue(), this.f25873d.longValue(), this.f25874e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // e4.AbstractC2406e.a
        AbstractC2406e.a b(int i10) {
            this.f25872c = Integer.valueOf(i10);
            return this;
        }

        @Override // e4.AbstractC2406e.a
        AbstractC2406e.a c(long j10) {
            this.f25873d = Long.valueOf(j10);
            return this;
        }

        @Override // e4.AbstractC2406e.a
        AbstractC2406e.a d(int i10) {
            this.f25871b = Integer.valueOf(i10);
            return this;
        }

        @Override // e4.AbstractC2406e.a
        AbstractC2406e.a e(int i10) {
            this.f25874e = Integer.valueOf(i10);
            return this;
        }

        @Override // e4.AbstractC2406e.a
        AbstractC2406e.a f(long j10) {
            this.f25870a = Long.valueOf(j10);
            return this;
        }
    }

    @Override // e4.AbstractC2406e
    int b() {
        return this.f25867d;
    }

    @Override // e4.AbstractC2406e
    long c() {
        return this.f25868e;
    }

    @Override // e4.AbstractC2406e
    int d() {
        return this.f25866c;
    }

    @Override // e4.AbstractC2406e
    int e() {
        return this.f25869f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2406e) {
            AbstractC2406e abstractC2406e = (AbstractC2406e) obj;
            if (this.f25865b == abstractC2406e.f() && this.f25866c == abstractC2406e.d() && this.f25867d == abstractC2406e.b() && this.f25868e == abstractC2406e.c() && this.f25869f == abstractC2406e.e()) {
                return true;
            }
        }
        return false;
    }

    @Override // e4.AbstractC2406e
    long f() {
        return this.f25865b;
    }

    public int hashCode() {
        long j10 = this.f25865b;
        int i10 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f25866c) * 1000003) ^ this.f25867d) * 1000003;
        long j11 = this.f25868e;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f25869f;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f25865b + ", loadBatchSize=" + this.f25866c + ", criticalSectionEnterTimeoutMs=" + this.f25867d + ", eventCleanUpAge=" + this.f25868e + ", maxBlobByteSizePerRow=" + this.f25869f + "}";
    }

    private C2402a(long j10, int i10, int i11, long j11, int i12) {
        this.f25865b = j10;
        this.f25866c = i10;
        this.f25867d = i11;
        this.f25868e = j11;
        this.f25869f = i12;
    }
}
