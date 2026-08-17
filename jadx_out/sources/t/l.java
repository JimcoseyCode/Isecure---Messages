package T;

import F.A;
import F.B;
import F.EnumC0510u;
import F.EnumC0512v;
import F.EnumC0514w;
import F.EnumC0516x;
import F.EnumC0518y;
import F.EnumC0520z;
import F.u1;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class l implements B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B f10378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u1 f10379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f10380c;

    public l(u1 u1Var, B b10) {
        this(b10, u1Var, -1L);
    }

    @Override // F.B
    public long a() {
        B b10 = this.f10378a;
        if (b10 != null) {
            return b10.a();
        }
        long j10 = this.f10380c;
        if (j10 != -1) {
            return j10;
        }
        throw new IllegalStateException("No timestamp is available.");
    }

    @Override // F.B
    public u1 b() {
        return this.f10379b;
    }

    @Override // F.B
    public A c() {
        B b10 = this.f10378a;
        return b10 != null ? b10.c() : A.UNKNOWN;
    }

    @Override // F.B
    public EnumC0520z e() {
        B b10 = this.f10378a;
        return b10 != null ? b10.e() : EnumC0520z.UNKNOWN;
    }

    @Override // F.B
    public EnumC0518y f() {
        B b10 = this.f10378a;
        return b10 != null ? b10.f() : EnumC0518y.UNKNOWN;
    }

    @Override // F.B
    public EnumC0514w g() {
        B b10 = this.f10378a;
        return b10 != null ? b10.g() : EnumC0514w.UNKNOWN;
    }

    @Override // F.B
    public EnumC0512v h() {
        B b10 = this.f10378a;
        return b10 != null ? b10.h() : EnumC0512v.UNKNOWN;
    }

    @Override // F.B
    public EnumC0510u j() {
        B b10 = this.f10378a;
        return b10 != null ? b10.j() : EnumC0510u.UNKNOWN;
    }

    @Override // F.B
    public EnumC0516x k() {
        B b10 = this.f10378a;
        return b10 != null ? b10.k() : EnumC0516x.UNKNOWN;
    }

    public l(u1 u1Var, long j10) {
        this(null, u1Var, j10);
    }

    private l(B b10, u1 u1Var, long j10) {
        this.f10378a = b10;
        this.f10379b = u1Var;
        this.f10380c = j10;
    }
}
