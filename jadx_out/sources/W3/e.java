package W3;

import W3.u;
import android.content.Context;
import c4.C1848d;
import d4.w;
import e4.C2408g;
import e4.C2409h;
import e4.C2410i;
import e4.C2411j;
import e4.InterfaceC2405d;
import e4.N;
import e4.V;
import g4.C2675c;
import g4.C2676d;
import javax.inject.Provider;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class e extends u {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Provider f12085g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Provider f12086h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Provider f12087i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Provider f12088j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Provider f12089k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Provider f12090l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Provider f12091m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Provider f12092n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Provider f12093o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Provider f12094p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Provider f12095q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Provider f12096r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Provider f12097s;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class b implements u.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f12098a;

        private b() {
        }

        @Override // W3.u.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(Context context) {
            this.f12098a = (Context) Y3.d.b(context);
            return this;
        }

        @Override // W3.u.a
        public u build() {
            Y3.d.a(this.f12098a, Context.class);
            return new e(this.f12098a);
        }
    }

    public static u.a k() {
        return new b();
    }

    private void m(Context context) {
        this.f12085g = Y3.a.a(k.a());
        Y3.b bVarA = Y3.c.a(context);
        this.f12086h = bVarA;
        X3.j jVarA = X3.j.a(bVarA, C2675c.a(), C2676d.a());
        this.f12087i = jVarA;
        this.f12088j = Y3.a.a(X3.l.a(this.f12086h, jVarA));
        this.f12089k = V.a(this.f12086h, C2408g.a(), C2410i.a());
        this.f12090l = Y3.a.a(C2409h.a(this.f12086h));
        this.f12091m = Y3.a.a(N.a(C2675c.a(), C2676d.a(), C2411j.a(), this.f12089k, this.f12090l));
        c4.g gVarB = c4.g.b(C2675c.a());
        this.f12092n = gVarB;
        c4.i iVarA = c4.i.a(this.f12086h, this.f12091m, gVarB, C2676d.a());
        this.f12093o = iVarA;
        Provider provider = this.f12085g;
        Provider provider2 = this.f12088j;
        Provider provider3 = this.f12091m;
        this.f12094p = C1848d.a(provider, provider2, iVarA, provider3, provider3);
        Provider provider4 = this.f12086h;
        Provider provider5 = this.f12088j;
        Provider provider6 = this.f12091m;
        this.f12095q = d4.s.a(provider4, provider5, provider6, this.f12093o, this.f12085g, provider6, C2675c.a(), C2676d.a(), this.f12091m);
        Provider provider7 = this.f12085g;
        Provider provider8 = this.f12091m;
        this.f12096r = w.a(provider7, provider8, this.f12093o, provider8);
        this.f12097s = Y3.a.a(v.a(C2675c.a(), C2676d.a(), this.f12094p, this.f12095q, this.f12096r));
    }

    @Override // W3.u
    InterfaceC2405d d() {
        return (InterfaceC2405d) this.f12091m.get();
    }

    @Override // W3.u
    t e() {
        return (t) this.f12097s.get();
    }

    private e(Context context) {
        m(context);
    }
}
