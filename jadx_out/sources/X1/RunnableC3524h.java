package x1;

import R1.a;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import com.bumptech.glide.c;
import com.bumptech.glide.h;
import com.bumptech.glide.load.resource.bitmap.C1949t;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;
import v1.EnumC3417a;
import x1.C3525i;
import x1.InterfaceC3522f;
import z1.InterfaceC3666a;

/* JADX INFO: renamed from: x1.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class RunnableC3524h implements InterfaceC3522f.a, Runnable, Comparable, a.f {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final v1.g f33310O = v1.g.e("glide_thread_priority_override");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f33311A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private Object f33312B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private com.bumptech.glide.e f33313C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private Supplier f33314D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private Thread f33315E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private v1.f f33316F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private v1.f f33317G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private Object f33318H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private EnumC3417a f33319I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private com.bumptech.glide.load.data.d f33320J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private volatile InterfaceC3522f f33321K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private volatile boolean f33322L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private volatile boolean f33323M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private boolean f33324N;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final e f33328j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final H0.e f33329k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.bumptech.glide.d f33332n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private v1.f f33333o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private com.bumptech.glide.g f33334p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private n f33335q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f33336r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f33337s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private AbstractC3526j f33338t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private v1.h f33339u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private b f33340v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f33341w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private EnumC0371h f33342x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private g f33343y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f33344z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C3523g f33325g = new C3523g();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f33326h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final R1.c f33327i = R1.c.a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final d f33330l = new d();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final f f33331m = new f();

    /* JADX INFO: renamed from: x1.h$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f33345a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f33346b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f33347c;

        static {
            int[] iArr = new int[v1.c.values().length];
            f33347c = iArr;
            try {
                iArr[v1.c.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33347c[v1.c.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC0371h.values().length];
            f33346b = iArr2;
            try {
                iArr2[EnumC0371h.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33346b[EnumC0371h.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33346b[EnumC0371h.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33346b[EnumC0371h.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f33346b[EnumC0371h.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[g.values().length];
            f33345a = iArr3;
            try {
                iArr3[g.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f33345a[g.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f33345a[g.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: renamed from: x1.h$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    interface b {
        void a(q qVar);

        void b(v vVar, EnumC3417a enumC3417a, boolean z10);

        void c(RunnableC3524h runnableC3524h);
    }

    /* JADX INFO: renamed from: x1.h$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private final class c implements C3525i.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final EnumC3417a f33348a;

        c(EnumC3417a enumC3417a) {
            this.f33348a = enumC3417a;
        }

        @Override // x1.C3525i.a
        public v a(v vVar) {
            return RunnableC3524h.this.G(this.f33348a, vVar);
        }
    }

    /* JADX INFO: renamed from: x1.h$d */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private v1.f f33350a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private v1.k f33351b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private u f33352c;

        d() {
        }

        void a() {
            this.f33350a = null;
            this.f33351b = null;
            this.f33352c = null;
        }

        void b(e eVar, v1.h hVar) {
            R1.b.a("DecodeJob.encode");
            try {
                eVar.a().b(this.f33350a, new C3521e(this.f33351b, this.f33352c, hVar));
            } finally {
                this.f33352c.f();
                R1.b.e();
            }
        }

        boolean c() {
            return this.f33352c != null;
        }

        void d(v1.f fVar, v1.k kVar, u uVar) {
            this.f33350a = fVar;
            this.f33351b = kVar;
            this.f33352c = uVar;
        }
    }

    /* JADX INFO: renamed from: x1.h$e */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    interface e {
        InterfaceC3666a a();
    }

    /* JADX INFO: renamed from: x1.h$f */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f33353a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f33354b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f33355c;

        f() {
        }

        private boolean a(boolean z10) {
            return (this.f33355c || z10 || this.f33354b) && this.f33353a;
        }

        synchronized boolean b() {
            this.f33354b = true;
            return a(false);
        }

        synchronized boolean c() {
            this.f33355c = true;
            return a(false);
        }

        synchronized boolean d(boolean z10) {
            this.f33353a = true;
            return a(z10);
        }

        synchronized void e() {
            this.f33354b = false;
            this.f33353a = false;
            this.f33355c = false;
        }
    }

    /* JADX INFO: renamed from: x1.h$g */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private enum g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* JADX INFO: renamed from: x1.h$h, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private enum EnumC0371h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    RunnableC3524h(e eVar, H0.e eVar2) {
        this.f33328j = eVar;
        this.f33329k = eVar2;
    }

    private void A(String str, long j10, String str2) {
        Q1.g.a(j10);
        Objects.toString(this.f33335q);
        if (str2 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(", ");
            sb.append(str2);
        }
        Thread.currentThread().getName();
    }

    private void B(v vVar, EnumC3417a enumC3417a, boolean z10) {
        if (this.f33313C.a(c.d.class)) {
            K();
        }
        O();
        this.f33340v.b(vVar, enumC3417a, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void C(v vVar, EnumC3417a enumC3417a, boolean z10) {
        u uVar;
        R1.b.a("DecodeJob.notifyEncodeAndRelease");
        try {
            if (vVar instanceof r) {
                ((r) vVar).initialize();
            }
            if (this.f33330l.c()) {
                vVar = u.d(vVar);
                uVar = vVar;
            } else {
                uVar = 0;
            }
            B(vVar, enumC3417a, z10);
            this.f33342x = EnumC0371h.ENCODE;
            try {
                if (this.f33330l.c()) {
                    this.f33330l.b(this.f33328j, this.f33339u);
                }
                E();
                R1.b.e();
            } finally {
                if (uVar != 0) {
                    uVar.f();
                }
            }
        } catch (Throwable th) {
            R1.b.e();
            throw th;
        }
    }

    private void D() {
        if (this.f33313C.a(c.d.class)) {
            K();
        }
        O();
        this.f33340v.a(new q("Failed to load resource", new ArrayList(this.f33326h)));
        F();
    }

    private void E() {
        if (this.f33331m.b()) {
            I();
        }
    }

    private void F() {
        if (this.f33331m.c()) {
            I();
        }
    }

    private void I() {
        this.f33331m.e();
        this.f33330l.a();
        this.f33325g.a();
        this.f33322L = false;
        this.f33332n = null;
        this.f33333o = null;
        this.f33339u = null;
        this.f33334p = null;
        this.f33335q = null;
        this.f33340v = null;
        this.f33342x = null;
        this.f33321K = null;
        this.f33315E = null;
        this.f33316F = null;
        this.f33318H = null;
        this.f33319I = null;
        this.f33320J = null;
        this.f33344z = 0L;
        this.f33323M = false;
        this.f33312B = null;
        this.f33326h.clear();
        this.f33329k.release(this);
    }

    private void J(g gVar) {
        this.f33343y = gVar;
        this.f33340v.c(this);
    }

    private void K() {
        if (!this.f33313C.a(c.d.class)) {
            throw new IllegalStateException("OverrideGlideThreadPriority experiment is not enabled.");
        }
        Supplier supplier = this.f33314D;
        if (supplier == null || supplier.get() == null) {
            return;
        }
        try {
            Process.setThreadPriority(Process.myTid(), 9);
        } catch (IllegalArgumentException | SecurityException unused) {
            this.f33314D = null;
        }
    }

    private void L() {
        this.f33315E = Thread.currentThread();
        this.f33344z = Q1.g.b();
        boolean zB = false;
        while (!this.f33323M && this.f33321K != null && !(zB = this.f33321K.b())) {
            this.f33342x = v(this.f33342x);
            this.f33321K = u();
            if (this.f33342x == EnumC0371h.SOURCE) {
                J(g.SWITCH_TO_SOURCE_SERVICE);
                return;
            }
        }
        if ((this.f33342x == EnumC0371h.FINISHED || this.f33323M) && !zB) {
            D();
        }
    }

    private v M(Object obj, EnumC3417a enumC3417a, t tVar) {
        v1.h hVarW = w(enumC3417a);
        com.bumptech.glide.load.data.e eVarL = this.f33332n.h().l(obj);
        try {
            return tVar.a(eVarL, hVarW, this.f33336r, this.f33337s, new c(enumC3417a));
        } finally {
            eVarL.cleanup();
        }
    }

    private void N() {
        int i10 = a.f33345a[this.f33343y.ordinal()];
        if (i10 == 1) {
            this.f33342x = v(EnumC0371h.INITIALIZE);
            this.f33321K = u();
            L();
        } else if (i10 == 2) {
            L();
        } else {
            if (i10 == 3) {
                t();
                return;
            }
            throw new IllegalStateException("Unrecognized run reason: " + this.f33343y);
        }
    }

    private void O() {
        Throwable th;
        this.f33327i.c();
        if (!this.f33322L) {
            this.f33322L = true;
            return;
        }
        if (this.f33326h.isEmpty()) {
            th = null;
        } else {
            List list = this.f33326h;
            th = (Throwable) list.get(list.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }

    private v r(com.bumptech.glide.load.data.d dVar, Object obj, EnumC3417a enumC3417a) {
        if (obj == null) {
            dVar.cleanup();
            return null;
        }
        try {
            long jB = Q1.g.b();
            v vVarS = s(obj, enumC3417a);
            if (Log.isLoggable("DecodeJob", 2)) {
                z("Decoded result " + vVarS, jB);
            }
            return vVarS;
        } finally {
            dVar.cleanup();
        }
    }

    private v s(Object obj, EnumC3417a enumC3417a) {
        return M(obj, enumC3417a, this.f33325g.h(obj.getClass()));
    }

    private void t() {
        Supplier supplier;
        if (Log.isLoggable("DecodeJob", 2)) {
            A("Retrieved data", this.f33344z, "data: " + this.f33318H + ", cache key: " + this.f33316F + ", fetcher: " + this.f33320J);
        }
        v vVarR = null;
        if (this.f33313C.a(c.d.class) && (supplier = this.f33314D) != null && supplier.get() != null) {
            try {
                Process.setThreadPriority(Process.myTid(), ((Integer) this.f33314D.get()).intValue());
            } catch (IllegalArgumentException | SecurityException unused) {
                this.f33314D = null;
            }
        }
        try {
            vVarR = r(this.f33320J, this.f33318H, this.f33319I);
        } catch (q e10) {
            e10.i(this.f33317G, this.f33319I);
            this.f33326h.add(e10);
        }
        if (vVarR != null) {
            C(vVarR, this.f33319I, this.f33324N);
        } else {
            L();
        }
    }

    private InterfaceC3522f u() {
        int i10 = a.f33346b[this.f33342x.ordinal()];
        if (i10 == 1) {
            return new w(this.f33325g, this);
        }
        if (i10 == 2) {
            return new C3519c(this.f33325g, this);
        }
        if (i10 == 3) {
            return new z(this.f33325g, this);
        }
        if (i10 == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f33342x);
    }

    private EnumC0371h v(EnumC0371h enumC0371h) {
        int i10 = a.f33346b[enumC0371h.ordinal()];
        if (i10 == 1) {
            return this.f33338t.a() ? EnumC0371h.DATA_CACHE : v(EnumC0371h.DATA_CACHE);
        }
        if (i10 == 2) {
            return this.f33311A ? EnumC0371h.FINISHED : EnumC0371h.SOURCE;
        }
        if (i10 == 3 || i10 == 4) {
            return EnumC0371h.FINISHED;
        }
        if (i10 == 5) {
            return this.f33338t.b() ? EnumC0371h.RESOURCE_CACHE : v(EnumC0371h.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + enumC0371h);
    }

    private v1.h w(EnumC3417a enumC3417a) {
        v1.h hVar = this.f33339u;
        if (Build.VERSION.SDK_INT < 26) {
            return hVar;
        }
        boolean z10 = enumC3417a == EnumC3417a.RESOURCE_DISK_CACHE || this.f33325g.x();
        v1.g gVar = C1949t.f19268j;
        Boolean bool = (Boolean) hVar.b(gVar);
        if (bool != null && (!bool.booleanValue() || z10)) {
            return hVar;
        }
        v1.h hVar2 = new v1.h();
        hVar2.c(this.f33339u);
        hVar2.d(gVar, Boolean.valueOf(z10));
        return hVar2;
    }

    private int x() {
        return this.f33334p.ordinal();
    }

    private void z(String str, long j10) {
        A(str, j10, null);
    }

    v G(EnumC3417a enumC3417a, v vVar) {
        v vVarA;
        v1.l lVar;
        v1.c cVarA;
        v1.f c3520d;
        Class<?> cls = vVar.get().getClass();
        v1.k kVarN = null;
        if (enumC3417a != EnumC3417a.RESOURCE_DISK_CACHE) {
            v1.l lVarS = this.f33325g.s(cls);
            lVar = lVarS;
            vVarA = lVarS.a(this.f33332n, vVar, this.f33336r, this.f33337s);
        } else {
            vVarA = vVar;
            lVar = null;
        }
        if (!vVar.equals(vVarA)) {
            vVar.recycle();
        }
        if (this.f33325g.w(vVarA)) {
            kVarN = this.f33325g.n(vVarA);
            cVarA = kVarN.a(this.f33339u);
        } else {
            cVarA = v1.c.NONE;
        }
        v1.k kVar = kVarN;
        if (!this.f33338t.d(!this.f33325g.y(this.f33316F), enumC3417a, cVarA)) {
            return vVarA;
        }
        if (kVar == null) {
            throw new h.d(vVarA.get().getClass());
        }
        int i10 = a.f33347c[cVarA.ordinal()];
        if (i10 == 1) {
            c3520d = new C3520d(this.f33316F, this.f33333o);
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException("Unknown strategy: " + cVarA);
            }
            c3520d = new x(this.f33325g.b(), this.f33316F, this.f33333o, this.f33336r, this.f33337s, lVar, cls, this.f33339u);
        }
        u uVarD = u.d(vVarA);
        this.f33330l.d(c3520d, kVar, uVarD);
        return uVarD;
    }

    void H(boolean z10) {
        if (this.f33331m.d(z10)) {
            I();
        }
    }

    boolean P() {
        EnumC0371h enumC0371hV = v(EnumC0371h.INITIALIZE);
        return enumC0371hV == EnumC0371h.RESOURCE_CACHE || enumC0371hV == EnumC0371h.DATA_CACHE;
    }

    @Override // x1.InterfaceC3522f.a
    public void h(v1.f fVar, Object obj, com.bumptech.glide.load.data.d dVar, EnumC3417a enumC3417a, v1.f fVar2) {
        this.f33316F = fVar;
        this.f33318H = obj;
        this.f33320J = dVar;
        this.f33319I = enumC3417a;
        this.f33317G = fVar2;
        this.f33324N = fVar != this.f33325g.c().get(0);
        if (Thread.currentThread() != this.f33315E) {
            J(g.DECODE_DATA);
            return;
        }
        R1.b.a("DecodeJob.decodeFromRetrievedData");
        try {
            t();
        } finally {
            R1.b.e();
        }
    }

    @Override // x1.InterfaceC3522f.a
    public void j(v1.f fVar, Exception exc, com.bumptech.glide.load.data.d dVar, EnumC3417a enumC3417a) {
        dVar.cleanup();
        q qVar = new q("Fetching data failed", exc);
        qVar.j(fVar, enumC3417a, dVar.getDataClass());
        this.f33326h.add(qVar);
        if (Thread.currentThread() != this.f33315E) {
            J(g.SWITCH_TO_SOURCE_SERVICE);
        } else {
            L();
        }
    }

    @Override // x1.InterfaceC3522f.a
    public void k() {
        J(g.SWITCH_TO_SOURCE_SERVICE);
    }

    @Override // R1.a.f
    public R1.c m() {
        return this.f33327i;
    }

    public void p() {
        this.f33323M = true;
        InterfaceC3522f interfaceC3522f = this.f33321K;
        if (interfaceC3522f != null) {
            interfaceC3522f.cancel();
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public int compareTo(RunnableC3524h runnableC3524h) {
        int iX = x() - runnableC3524h.x();
        return iX == 0 ? this.f33341w - runnableC3524h.f33341w : iX;
    }

    @Override // java.lang.Runnable
    public void run() {
        R1.b.c("DecodeJob#run(reason=%s, model=%s)", this.f33343y, this.f33312B);
        com.bumptech.glide.load.data.d dVar = this.f33320J;
        try {
            try {
                if (this.f33323M) {
                    D();
                    if (dVar != null) {
                        dVar.cleanup();
                    }
                    R1.b.e();
                    return;
                }
                N();
                if (dVar != null) {
                    dVar.cleanup();
                }
                R1.b.e();
            } catch (Throwable th) {
                if (dVar != null) {
                    dVar.cleanup();
                }
                R1.b.e();
                throw th;
            }
        } catch (C3518b e10) {
            throw e10;
        } catch (Throwable th2) {
            if (Log.isLoggable("DecodeJob", 3)) {
                Objects.toString(this.f33342x);
            }
            if (this.f33342x != EnumC0371h.ENCODE) {
                this.f33326h.add(th2);
                D();
            }
            if (!this.f33323M) {
                throw th2;
            }
            throw th2;
        }
    }

    RunnableC3524h y(com.bumptech.glide.d dVar, Object obj, n nVar, v1.f fVar, int i10, int i11, Class cls, Class cls2, com.bumptech.glide.g gVar, AbstractC3526j abstractC3526j, Map map, boolean z10, boolean z11, boolean z12, v1.h hVar, b bVar, int i12) {
        this.f33325g.v(dVar, obj, fVar, i10, i11, abstractC3526j, cls, cls2, gVar, hVar, map, z10, z11, this.f33328j);
        this.f33332n = dVar;
        this.f33333o = fVar;
        this.f33334p = gVar;
        this.f33335q = nVar;
        this.f33336r = i10;
        this.f33337s = i11;
        this.f33338t = abstractC3526j;
        this.f33311A = z12;
        this.f33339u = hVar;
        this.f33340v = bVar;
        this.f33341w = i12;
        this.f33343y = g.INITIALIZE;
        this.f33312B = obj;
        this.f33313C = dVar.f();
        this.f33314D = (Supplier) hVar.b(f33310O);
        return this;
    }
}
