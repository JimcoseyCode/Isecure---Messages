package N2;

import N2.b;
import j7.AbstractC2800q;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends h {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private long f8042A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private long f8043B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private long f8044C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f8045D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f8046E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f8047F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private Throwable f8048G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private e f8049H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private n f8050I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private long f8051J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private long f8052K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private b.a f8053L;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f8054s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f8055t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Object f8056u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Object f8057v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Object f8058w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f8059x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f8060y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f8061z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k infra) {
        super(infra);
        AbstractC2855l.g(infra, "infra");
        this.f8059x = -1L;
        this.f8060y = -1L;
        this.f8061z = -1L;
        this.f8042A = -1L;
        this.f8043B = -1L;
        this.f8044C = -1L;
        this.f8046E = -1;
        this.f8047F = -1;
        this.f8049H = e.f7974j;
        this.f8050I = n.f8071j;
        this.f8051J = -1L;
        this.f8052K = -1L;
    }

    public final void A(long j10) {
        this.f8061z = j10;
    }

    public final void B(String str) {
        this.f8054s = str;
    }

    public final void C(long j10) {
        this.f8060y = j10;
    }

    public final void D(long j10) {
        this.f8059x = j10;
    }

    public final void E(Throwable th) {
        this.f8048G = th;
    }

    public final void F(b.a aVar) {
        this.f8053L = aVar;
    }

    public final void G(Object obj) {
        this.f8058w = obj;
    }

    public final void H(e eVar) {
        AbstractC2855l.g(eVar, "<set-?>");
        this.f8049H = eVar;
    }

    public final void I(Object obj) {
        this.f8056u = obj;
    }

    public final void J(long j10) {
        this.f8044C = j10;
    }

    public final void K(long j10) {
        this.f8043B = j10;
    }

    public final void L(long j10) {
        this.f8052K = j10;
    }

    public final void M(int i10) {
        this.f8047F = i10;
    }

    public final void N(int i10) {
        this.f8046E = i10;
    }

    public final void O(boolean z10) {
        this.f8045D = z10;
    }

    public final void P(String str) {
        this.f8055t = str;
    }

    public final void Q(long j10) {
        this.f8051J = j10;
    }

    public final void R(boolean z10) {
        this.f8050I = z10 ? n.f8072k : n.f8073l;
    }

    public final f S() {
        return new f(j(), this.f8054s, this.f8055t, this.f8056u, this.f8057v, this.f8058w, this.f8059x, this.f8060y, this.f8061z, this.f8042A, this.f8043B, this.f8044C, f(), n(), this.f8045D, this.f8046E, this.f8047F, this.f8048G, this.f8050I, this.f8051J, this.f8052K, null, this.f8053L, a(), o(), c(), d(), b(), r(), q(), l(), p(), AbstractC2800q.P0(k()), m(), h(), i(), g(), e());
    }

    public final void w() {
        this.f8055t = null;
        this.f8056u = null;
        this.f8057v = null;
        this.f8058w = null;
        this.f8045D = false;
        this.f8046E = -1;
        this.f8047F = -1;
        this.f8048G = null;
        this.f8049H = e.f7974j;
        this.f8050I = n.f8071j;
        this.f8053L = null;
        x();
        s();
    }

    public final void x() {
        this.f8043B = -1L;
        this.f8044C = -1L;
        this.f8059x = -1L;
        this.f8061z = -1L;
        this.f8042A = -1L;
        this.f8051J = -1L;
        this.f8052K = -1L;
        k().clear();
        u(false);
        t(null);
        v(null);
    }

    public final void y(Object obj) {
        this.f8057v = obj;
    }

    public final void z(long j10) {
        this.f8042A = j10;
    }
}
