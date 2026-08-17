package L2;

import C2.d;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0067a f7226c = new C0067a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f7227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f7228b;

    /* JADX INFO: renamed from: L2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class C0067a {
        public /* synthetic */ C0067a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0067a() {
        }
    }

    public a(d animationInformation) {
        AbstractC2855l.g(animationInformation, "animationInformation");
        this.f7227a = animationInformation;
        this.f7228b = -1L;
    }

    @Override // L2.b
    public long a(long j10) {
        long jD = d();
        long j11 = 0;
        if (jD == 0) {
            return -1L;
        }
        if (!e() && j10 / jD >= this.f7227a.b()) {
            return -1L;
        }
        long j12 = j10 % jD;
        int iA = this.f7227a.a();
        for (int i10 = 0; i10 < iA && j11 <= j12; i10++) {
            j11 += (long) this.f7227a.j(i10);
        }
        return j10 + (j11 - j12);
    }

    @Override // L2.b
    public int b(long j10, long j11) {
        long jD = d();
        if (jD == 0) {
            return c(0L);
        }
        if (e() || j10 / jD < this.f7227a.b()) {
            return c(j10 % jD);
        }
        return -1;
    }

    public final int c(long j10) {
        int i10 = 0;
        long j11 = 0;
        while (true) {
            j11 += (long) this.f7227a.j(i10);
            int i11 = i10 + 1;
            if (j10 < j11) {
                return i10;
            }
            i10 = i11;
        }
    }

    public long d() {
        long j10 = this.f7228b;
        if (j10 != -1) {
            return j10;
        }
        this.f7228b = 0L;
        int iA = this.f7227a.a();
        for (int i10 = 0; i10 < iA; i10++) {
            this.f7228b += (long) this.f7227a.j(i10);
        }
        return this.f7228b;
    }

    public boolean e() {
        return this.f7227a.b() == 0;
    }
}
