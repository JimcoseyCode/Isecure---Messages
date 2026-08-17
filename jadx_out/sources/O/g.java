package o;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.A;
import androidx.lifecycle.AbstractC1776x;
import androidx.lifecycle.T;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import o.C2993a;
import o.C2998f;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class g extends T {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Executor f30272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C2998f.a f30273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C2998f.d f30274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C2998f.c f30275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C2993a f30276f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private h f30277g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private DialogInterface.OnClickListener f30278h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private CharSequence f30279i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f30281k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f30282l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f30283m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f30284n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f30285o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private A f30286p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private A f30287q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private A f30288r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private A f30289s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private A f30290t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private A f30292v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private A f30294x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private A f30295y;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f30280j = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f30291u = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f30293w = 0;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends C2998f.a {
        a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class b extends C2993a.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f30297a;

        b(g gVar) {
            this.f30297a = new WeakReference(gVar);
        }

        @Override // o.C2993a.d
        void a(int i10, CharSequence charSequence) {
            if (this.f30297a.get() == null || ((g) this.f30297a.get()).A() || !((g) this.f30297a.get()).y()) {
                return;
            }
            ((g) this.f30297a.get()).H(new C2995c(i10, charSequence));
        }

        @Override // o.C2993a.d
        void b() {
            if (this.f30297a.get() == null || !((g) this.f30297a.get()).y()) {
                return;
            }
            ((g) this.f30297a.get()).I(true);
        }

        @Override // o.C2993a.d
        void c(CharSequence charSequence) {
            if (this.f30297a.get() != null) {
                ((g) this.f30297a.get()).J(charSequence);
            }
        }

        @Override // o.C2993a.d
        void d(C2998f.b bVar) {
            if (this.f30297a.get() == null || !((g) this.f30297a.get()).y()) {
                return;
            }
            if (bVar.a() == -1) {
                bVar = new C2998f.b(bVar.b(), ((g) this.f30297a.get()).s());
            }
            ((g) this.f30297a.get()).K(bVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class c implements Executor {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Handler f30298g = new Handler(Looper.getMainLooper());

        c() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f30298g.post(runnable);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class d implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final WeakReference f30299g;

        d(g gVar) {
            this.f30299g = new WeakReference(gVar);
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (this.f30299g.get() != null) {
                ((g) this.f30299g.get()).Y(true);
            }
        }
    }

    private static void c0(A a10, Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            a10.n(obj);
        } else {
            a10.l(obj);
        }
    }

    boolean A() {
        return this.f30283m;
    }

    boolean B() {
        return this.f30284n;
    }

    AbstractC1776x C() {
        if (this.f30292v == null) {
            this.f30292v = new A();
        }
        return this.f30292v;
    }

    boolean D() {
        return this.f30291u;
    }

    boolean E() {
        return this.f30285o;
    }

    AbstractC1776x F() {
        if (this.f30290t == null) {
            this.f30290t = new A();
        }
        return this.f30290t;
    }

    boolean G() {
        return this.f30281k;
    }

    void H(C2995c c2995c) {
        if (this.f30287q == null) {
            this.f30287q = new A();
        }
        c0(this.f30287q, c2995c);
    }

    void I(boolean z10) {
        if (this.f30289s == null) {
            this.f30289s = new A();
        }
        c0(this.f30289s, Boolean.valueOf(z10));
    }

    void J(CharSequence charSequence) {
        if (this.f30288r == null) {
            this.f30288r = new A();
        }
        c0(this.f30288r, charSequence);
    }

    void K(C2998f.b bVar) {
        if (this.f30286p == null) {
            this.f30286p = new A();
        }
        c0(this.f30286p, bVar);
    }

    void L(boolean z10) {
        this.f30282l = z10;
    }

    void M(int i10) {
        this.f30280j = i10;
    }

    void N(C2998f.a aVar) {
        this.f30273c = aVar;
    }

    void O(Executor executor) {
        this.f30272b = executor;
    }

    void P(boolean z10) {
        this.f30283m = z10;
    }

    void Q(C2998f.c cVar) {
        this.f30275e = cVar;
    }

    void R(boolean z10) {
        this.f30284n = z10;
    }

    void S(boolean z10) {
        if (this.f30292v == null) {
            this.f30292v = new A();
        }
        c0(this.f30292v, Boolean.valueOf(z10));
    }

    void T(boolean z10) {
        this.f30291u = z10;
    }

    void U(CharSequence charSequence) {
        if (this.f30295y == null) {
            this.f30295y = new A();
        }
        c0(this.f30295y, charSequence);
    }

    void V(int i10) {
        this.f30293w = i10;
    }

    void W(int i10) {
        if (this.f30294x == null) {
            this.f30294x = new A();
        }
        c0(this.f30294x, Integer.valueOf(i10));
    }

    void X(boolean z10) {
        this.f30285o = z10;
    }

    void Y(boolean z10) {
        if (this.f30290t == null) {
            this.f30290t = new A();
        }
        c0(this.f30290t, Boolean.valueOf(z10));
    }

    void Z(CharSequence charSequence) {
        this.f30279i = charSequence;
    }

    void a0(C2998f.d dVar) {
        this.f30274d = dVar;
    }

    void b0(boolean z10) {
        this.f30281k = z10;
    }

    int e() {
        C2998f.d dVar = this.f30274d;
        if (dVar != null) {
            return AbstractC2994b.b(dVar, this.f30275e);
        }
        return 0;
    }

    C2993a f() {
        if (this.f30276f == null) {
            this.f30276f = new C2993a(new b(this));
        }
        return this.f30276f;
    }

    A g() {
        if (this.f30287q == null) {
            this.f30287q = new A();
        }
        return this.f30287q;
    }

    AbstractC1776x h() {
        if (this.f30288r == null) {
            this.f30288r = new A();
        }
        return this.f30288r;
    }

    AbstractC1776x i() {
        if (this.f30286p == null) {
            this.f30286p = new A();
        }
        return this.f30286p;
    }

    int j() {
        return this.f30280j;
    }

    h k() {
        if (this.f30277g == null) {
            this.f30277g = new h();
        }
        return this.f30277g;
    }

    C2998f.a l() {
        if (this.f30273c == null) {
            this.f30273c = new a();
        }
        return this.f30273c;
    }

    Executor m() {
        Executor executor = this.f30272b;
        return executor != null ? executor : new c();
    }

    C2998f.c n() {
        return this.f30275e;
    }

    CharSequence o() {
        C2998f.d dVar = this.f30274d;
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }

    AbstractC1776x p() {
        if (this.f30295y == null) {
            this.f30295y = new A();
        }
        return this.f30295y;
    }

    int q() {
        return this.f30293w;
    }

    AbstractC1776x r() {
        if (this.f30294x == null) {
            this.f30294x = new A();
        }
        return this.f30294x;
    }

    int s() {
        int iE = e();
        return (!AbstractC2994b.d(iE) || AbstractC2994b.c(iE)) ? -1 : 2;
    }

    DialogInterface.OnClickListener t() {
        if (this.f30278h == null) {
            this.f30278h = new d(this);
        }
        return this.f30278h;
    }

    CharSequence u() {
        CharSequence charSequence = this.f30279i;
        if (charSequence != null) {
            return charSequence;
        }
        C2998f.d dVar = this.f30274d;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    CharSequence v() {
        C2998f.d dVar = this.f30274d;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    CharSequence w() {
        C2998f.d dVar = this.f30274d;
        if (dVar != null) {
            return dVar.e();
        }
        return null;
    }

    AbstractC1776x x() {
        if (this.f30289s == null) {
            this.f30289s = new A();
        }
        return this.f30289s;
    }

    boolean y() {
        return this.f30282l;
    }

    boolean z() {
        C2998f.d dVar = this.f30274d;
        return dVar == null || dVar.f();
    }
}
