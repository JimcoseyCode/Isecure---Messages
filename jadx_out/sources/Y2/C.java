package Y2;

import W2.C1497d;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import com.facebook.imagepipeline.producers.C1965a;
import com.facebook.imagepipeline.producers.C1971g;
import com.facebook.imagepipeline.producers.C1972h;
import com.facebook.imagepipeline.producers.C1973i;
import com.facebook.imagepipeline.producers.C1974j;
import com.facebook.imagepipeline.producers.C1975k;
import com.facebook.imagepipeline.producers.C1976l;
import com.facebook.imagepipeline.producers.C1979o;
import com.facebook.imagepipeline.producers.C1980p;
import com.facebook.imagepipeline.producers.C1982s;
import com.facebook.imagepipeline.producers.C1985v;
import com.facebook.imagepipeline.producers.C1986w;
import com.facebook.imagepipeline.producers.C1988y;
import com.facebook.imagepipeline.producers.C1989z;
import com.facebook.imagepipeline.producers.LocalExifThumbnailProducer;
import com.facebook.imagepipeline.producers.X;
import com.facebook.imagepipeline.producers.Y;
import com.facebook.imagepipeline.producers.a0;
import com.facebook.imagepipeline.producers.b0;
import com.facebook.imagepipeline.producers.d0;
import com.facebook.imagepipeline.producers.i0;
import com.facebook.imagepipeline.producers.k0;
import com.facebook.imagepipeline.producers.n0;
import com.facebook.imagepipeline.producers.o0;
import com.facebook.imagepipeline.producers.p0;
import com.facebook.imagepipeline.producers.r0;
import com.facebook.imagepipeline.producers.t0;
import com.facebook.imagepipeline.producers.u0;
import f2.InterfaceC2600a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected ContentResolver f12617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Resources f12618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected AssetManager f12619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final InterfaceC2600a f12620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final b3.c f12621e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final b3.e f12622f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final EnumC1528n f12623g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final boolean f12624h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final boolean f12625i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected final InterfaceC1530p f12626j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected final f2.i f12627k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected final c2.n f12628l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected final W2.x f12629m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected final W2.x f12630n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected final W2.k f12631o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected final C1497d f12632p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected final C1497d f12633q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected final V2.d f12634r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected final int f12635s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected final int f12636t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected boolean f12637u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected final C1515a f12638v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected final int f12639w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected final boolean f12640x;

    public C(Context context, InterfaceC2600a interfaceC2600a, b3.c cVar, b3.e eVar, EnumC1528n enumC1528n, boolean z10, boolean z11, InterfaceC1530p interfaceC1530p, f2.i iVar, W2.x xVar, W2.x xVar2, c2.n nVar, W2.k kVar, V2.d dVar, int i10, int i11, boolean z12, int i12, C1515a c1515a, boolean z13, int i13) {
        this.f12617a = context.getApplicationContext().getContentResolver();
        this.f12618b = context.getApplicationContext().getResources();
        this.f12619c = context.getApplicationContext().getAssets();
        this.f12620d = interfaceC2600a;
        this.f12621e = cVar;
        this.f12622f = eVar;
        this.f12623g = enumC1528n;
        this.f12624h = z10;
        this.f12625i = z11;
        this.f12626j = interfaceC1530p;
        this.f12627k = iVar;
        this.f12630n = xVar;
        this.f12629m = xVar2;
        this.f12628l = nVar;
        this.f12631o = kVar;
        this.f12634r = dVar;
        this.f12632p = new C1497d(i13);
        this.f12633q = new C1497d(i13);
        this.f12635s = i10;
        this.f12636t = i11;
        this.f12637u = z12;
        this.f12639w = i12;
        this.f12638v = c1515a;
        this.f12640x = z13;
    }

    public static C1965a a(d0 d0Var) {
        return new C1965a(d0Var);
    }

    public static C1976l h(d0 d0Var, d0 d0Var2) {
        return new C1976l(d0Var, d0Var2);
    }

    public a0 A(d0 d0Var) {
        return new a0(this.f12630n, this.f12631o, d0Var);
    }

    public b0 B(d0 d0Var) {
        return new b0(d0Var, this.f12634r, this.f12626j.c());
    }

    public i0 C() {
        return new i0(this.f12626j.e(), this.f12627k, this.f12617a);
    }

    public k0 D(d0 d0Var, boolean z10, k3.d dVar) {
        return new k0(this.f12626j.c(), this.f12627k, d0Var, z10, dVar);
    }

    public n0 E(d0 d0Var) {
        return new n0(d0Var);
    }

    public r0 F(d0 d0Var) {
        return new r0(5, this.f12626j.b(), d0Var);
    }

    public t0 G(u0[] u0VarArr) {
        return new t0(u0VarArr);
    }

    public d0 b(d0 d0Var, p0 p0Var) {
        return new o0(d0Var, p0Var);
    }

    public C1971g c(d0 d0Var) {
        return new C1971g(this.f12630n, this.f12631o, d0Var);
    }

    public C1972h d(d0 d0Var) {
        return new C1972h(this.f12631o, d0Var);
    }

    public C1973i e(d0 d0Var) {
        return new C1973i(this.f12630n, this.f12631o, d0Var);
    }

    public C1974j f(d0 d0Var) {
        return new C1974j(d0Var, this.f12635s, this.f12636t, this.f12637u);
    }

    public C1975k g(d0 d0Var) {
        return new C1975k(this.f12629m, this.f12628l, this.f12631o, this.f12632p, this.f12633q, d0Var);
    }

    public C1979o i() {
        return new C1979o(this.f12627k);
    }

    public C1980p j(d0 d0Var) {
        return new C1980p(this.f12620d, this.f12626j.a(), this.f12621e, this.f12622f, this.f12623g, this.f12624h, this.f12625i, d0Var, this.f12639w, this.f12638v, null, c2.o.f18800b);
    }

    public C1982s k(d0 d0Var) {
        return new C1982s(d0Var, this.f12626j.g());
    }

    public C1985v l(d0 d0Var) {
        return new C1985v(this.f12628l, this.f12631o, d0Var);
    }

    public C1986w m(d0 d0Var) {
        return new C1986w(this.f12628l, this.f12631o, d0Var);
    }

    public C1988y n(d0 d0Var) {
        return new C1988y(this.f12631o, this.f12640x, d0Var);
    }

    public d0 o(d0 d0Var) {
        return new C1989z(this.f12629m, this.f12631o, d0Var);
    }

    public com.facebook.imagepipeline.producers.A p(d0 d0Var) {
        return new com.facebook.imagepipeline.producers.A(this.f12628l, this.f12631o, this.f12632p, this.f12633q, d0Var);
    }

    public com.facebook.imagepipeline.producers.H q() {
        return new com.facebook.imagepipeline.producers.H(this.f12626j.e(), this.f12627k, this.f12619c);
    }

    public com.facebook.imagepipeline.producers.I r() {
        return new com.facebook.imagepipeline.producers.I(this.f12626j.e(), this.f12627k, this.f12617a);
    }

    public com.facebook.imagepipeline.producers.J s() {
        return new com.facebook.imagepipeline.producers.J(this.f12626j.e(), this.f12627k, this.f12617a);
    }

    public LocalExifThumbnailProducer t() {
        return new LocalExifThumbnailProducer(this.f12626j.f(), this.f12627k, this.f12617a);
    }

    public com.facebook.imagepipeline.producers.M u() {
        return new com.facebook.imagepipeline.producers.M(this.f12626j.e(), this.f12627k);
    }

    public com.facebook.imagepipeline.producers.N v() {
        return new com.facebook.imagepipeline.producers.N(this.f12626j.e(), this.f12627k, this.f12618b);
    }

    public com.facebook.imagepipeline.producers.S w() {
        return new com.facebook.imagepipeline.producers.S(this.f12626j.c(), this.f12617a);
    }

    public com.facebook.imagepipeline.producers.T x() {
        return new com.facebook.imagepipeline.producers.T(this.f12626j.e(), this.f12617a);
    }

    public d0 y(X x10) {
        return new com.facebook.imagepipeline.producers.W(this.f12627k, this.f12620d, x10);
    }

    public Y z(d0 d0Var) {
        return new Y(this.f12628l, this.f12631o, this.f12627k, this.f12620d, d0Var);
    }
}
