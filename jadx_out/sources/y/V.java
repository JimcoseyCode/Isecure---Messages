package y;

import E.C0465z;
import E.InterfaceC0464y;
import F.C0475d;
import F.D1;
import F.E0;
import F.E1;
import F.F0;
import F.InterfaceC0490j0;
import F.R0;
import F.S0;
import F.X0;
import F.k1;
import F.m1;
import F.o1;
import F.p1;
import S.c;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.net.Uri;
import android.os.Looper;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import m5.InterfaceFutureC2904a;
import n.InterfaceC2955a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class V extends J0 {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final c f33744D = new c();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    static final N.b f33745E = new N.b();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private E.Y f33746A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private k1.c f33747B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final InterfaceC0464y f33748C;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final F0.a f33749r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f33750s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final AtomicReference f33751t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final int f33752u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f33753v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Rational f33754w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private K.k f33755x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    k1.b f33756y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private C0465z f33757z;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements InterfaceC0464y {
        a() {
        }

        @Override // E.InterfaceC0464y
        public InterfaceFutureC2904a a(List list) {
            return V.this.R0(list);
        }

        @Override // E.InterfaceC0464y
        public void b() {
            V.this.J0();
        }

        @Override // E.InterfaceC0464y
        public void c() {
            V.this.V0();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b implements D1.b, E0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final S0 f33759a;

        public b() {
            this(S0.i0());
        }

        public static b f(InterfaceC0490j0 interfaceC0490j0) {
            return new b(S0.j0(interfaceC0490j0));
        }

        @Override // y.InterfaceC3564I
        public R0 b() {
            return this.f33759a;
        }

        public V e() {
            Integer num = (Integer) b().f(F.C0.f1275T, null);
            if (num != null) {
                b().X(F.D0.f1294j, num);
            } else if (V.E0(b())) {
                b().X(F.D0.f1294j, 32);
            } else if (V.F0(b())) {
                b().X(F.D0.f1294j, 32);
                b().X(F.D0.f1295k, 256);
            } else if (V.G0(b())) {
                b().X(F.D0.f1294j, 4101);
                b().X(F.D0.f1296l, C3563H.f33649c);
            } else {
                b().X(F.D0.f1294j, 256);
            }
            F.C0 c0C = c();
            F.E0.P(c0C);
            V v10 = new V(c0C);
            Size size = (Size) b().f(F.E0.f1326q, null);
            if (size != null) {
                v10.L0(new Rational(size.getWidth(), size.getHeight()));
            }
            H0.g.h((Executor) b().f(K.i.f6995L, I.c.d()), "The IO executor can't be null");
            R0 r0B = b();
            InterfaceC0490j0.a aVar = F.C0.f1273R;
            if (r0B.b(aVar)) {
                Integer num2 = (Integer) b().d(aVar);
                if (num2 == null || !(num2.intValue() == 0 || num2.intValue() == 1 || num2.intValue() == 3 || num2.intValue() == 2)) {
                    throw new IllegalArgumentException("The flash mode is not allowed to set: " + num2);
                }
                if (num2.intValue() == 3 && b().f(F.C0.f1282a0, null) == null) {
                    throw new IllegalArgumentException("A ScreenFlash instance is required for FLASH_MODE_SCREEN but was not found. If value from PreviewView.getScreenFlash() is set to ImageCapture.setScreenFlash(), ensure PreviewView.setScreenFlashWindow() is invoked first.");
                }
            }
            return v10;
        }

        @Override // F.D1.b
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public F.C0 c() {
            return new F.C0(X0.h0(this.f33759a));
        }

        public b h(E1.b bVar) {
            b().X(D1.f1303G, bVar);
            return this;
        }

        public b i(C3563H c3563h) {
            b().X(F.D0.f1296l, c3563h);
            return this;
        }

        public b j(int i10) {
            b().X(F.C0.f1273R, Integer.valueOf(i10));
            return this;
        }

        public b k(int i10) {
            b().X(F.C0.f1276U, Integer.valueOf(i10));
            return this;
        }

        public b l(S.c cVar) {
            b().X(F.E0.f1330u, cVar);
            return this;
        }

        public b m(i iVar) {
            b().X(F.C0.f1282a0, iVar);
            return this;
        }

        public b n(p1 p1Var) {
            b().X(D1.f1307K, p1Var);
            return this;
        }

        public b o(int i10) {
            b().X(D1.f1297A, Integer.valueOf(i10));
            return this;
        }

        public b p(int i10) {
            if (i10 == -1) {
                i10 = 0;
            }
            b().X(F.E0.f1322m, Integer.valueOf(i10));
            return this;
        }

        public b q(Class cls) {
            b().X(K.q.f7019N, cls);
            if (b().f(K.q.f7018M, null) == null) {
                r(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public b r(String str) {
            b().X(K.q.f7018M, str);
            return this;
        }

        @Override // F.E0.a
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public b a(Size size) {
            b().X(F.E0.f1326q, size);
            return this;
        }

        @Override // F.E0.a
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public b d(int i10) {
            b().X(F.E0.f1323n, Integer.valueOf(i10));
            return this;
        }

        private b(S0 s02) {
            this.f33759a = s02;
            Class cls = (Class) s02.f(K.q.f7019N, null);
            if (cls == null || cls.equals(V.class)) {
                h(E1.b.IMAGE_CAPTURE);
                q(V.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final p1 f33760a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final S.c f33761b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final F.C0 f33762c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final C3563H f33763d;

        static {
            p1 p1Var = p1.f1608k;
            f33760a = p1Var;
            S.c cVarA = new c.a().d(S.a.f10229c).f(S.d.f10241c).a();
            f33761b = cVarA;
            C3563H c3563h = C3563H.f33650d;
            f33763d = c3563h;
            f33762c = new b().o(4).n(p1Var).p(0).l(cVarA).k(0).i(c3563h).c();
        }

        public F.C0 a() {
            return f33762c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class d implements W {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC3597q f33764a;

        d(InterfaceC3597q interfaceC3597q) {
            this.f33764a = interfaceC3597q;
        }

        private Set a() {
            InterfaceC3597q interfaceC3597q = this.f33764a;
            HashSet hashSet = null;
            if (!(interfaceC3597q instanceof C0475d)) {
                return null;
            }
            InterfaceC0490j0 interfaceC0490j0A = ((C0475d) interfaceC3597q).B().j().a(E1.b.IMAGE_CAPTURE, 1);
            if (interfaceC0490j0A != null) {
                InterfaceC0490j0.a aVar = F.E0.f1329t;
                if (interfaceC0490j0A.b(aVar)) {
                    hashSet = new HashSet();
                    hashSet.add(0);
                    Iterator it = ((List) interfaceC0490j0A.d(aVar)).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (((Integer) ((Pair) it.next()).first).intValue() == 4101) {
                            hashSet.add(1);
                            break;
                        }
                    }
                }
            }
            return hashSet;
        }

        private boolean b() {
            InterfaceC3597q interfaceC3597q = this.f33764a;
            if (!(interfaceC3597q instanceof F.L)) {
                return false;
            }
            F.L l10 = (F.L) interfaceC3597q;
            if (l10.A().contains(3)) {
                return l10.d().contains(32);
            }
            return false;
        }

        private boolean c() {
            InterfaceC3597q interfaceC3597q = this.f33764a;
            if (interfaceC3597q instanceof F.L) {
                return ((F.L) interfaceC3597q).d().contains(4101);
            }
            return false;
        }

        @Override // y.W
        public Set d() {
            Set setA = a();
            if (setA != null) {
                return setA;
            }
            HashSet hashSet = new HashSet();
            hashSet.add(0);
            if (c()) {
                hashSet.add(1);
            }
            if (b()) {
                hashSet.add(2);
                hashSet.add(3);
            }
            return hashSet;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface f {
        void a(X x10);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class g {
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f33765a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f33766b;

        public h(Uri uri, int i10) {
            this.f33765a = uri;
            this.f33766b = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface i {
        void a(long j10, j jVar);

        void clear();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface j {
        void a();
    }

    V(F.C0 c02) {
        super(c02);
        this.f33749r = new F0.a() { // from class: y.S
            @Override // F.F0.a
            public final void a(F.F0 f02) {
                V.h0(f02);
            }
        };
        this.f33751t = new AtomicReference(null);
        this.f33753v = -1;
        this.f33754w = null;
        this.f33748C = new a();
        F.C0 c03 = (F.C0) l();
        if (c03.b(F.C0.f1272Q)) {
            this.f33750s = c03.g0();
        } else {
            this.f33750s = 1;
        }
        this.f33752u = c03.i0(0);
        this.f33755x = K.k.g(c03.m0());
    }

    private m1 A0() {
        i().i().R(null);
        return null;
    }

    private Rect B0() {
        Rect rectE = E();
        Size sizeH = h();
        Objects.requireNonNull(sizeH);
        if (rectE != null) {
            return rectE;
        }
        if (!O.b.h(this.f33754w)) {
            return new Rect(0, 0, sizeH.getWidth(), sizeH.getHeight());
        }
        F.M mI = i();
        Objects.requireNonNull(mI);
        int iT = t(mI);
        Rational rational = new Rational(this.f33754w.getDenominator(), this.f33754w.getNumerator());
        if (!H.z.i(iT)) {
            rational = this.f33754w;
        }
        Rect rectA = O.b.a(sizeH, rational);
        Objects.requireNonNull(rectA);
        return rectA;
    }

    private static boolean D0(List list, int i10) {
        if (list == null) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Integer) ((Pair) it.next()).first).equals(Integer.valueOf(i10))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean E0(R0 r02) {
        return Objects.equals(r02.f(F.C0.f1276U, null), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean F0(R0 r02) {
        return Objects.equals(r02.f(F.C0.f1276U, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean G0(R0 r02) {
        return Objects.equals(r02.f(F.C0.f1276U, null), 1);
    }

    private boolean I0() {
        if (i() == null) {
            return false;
        }
        i().i().R(null);
        return false;
    }

    private void K0(Executor executor, e eVar, f fVar) {
        X x10 = new X(4, "Not bound to a valid Camera [" + this + "]", null);
        if (eVar != null) {
            eVar.onError(x10);
        } else {
            if (fVar == null) {
                throw new IllegalArgumentException("Must have either in-memory or on-disk callback.");
            }
            fVar.a(x10);
        }
    }

    private void O0() {
        P0(this.f33755x);
    }

    private void P0(i iVar) {
        j().c(iVar);
    }

    private void T0(Executor executor, e eVar, f fVar, g gVar, g gVar2) {
        H.y.b();
        if (w0() == 3 && this.f33755x.h() == null) {
            throw new IllegalArgumentException("A ScreenFlash instance is required for FLASH_MODE_SCREEN but was not found. If value from PreviewView.getScreenFlash() is set to ImageCapture.setScreenFlash(), ensure PreviewView.setScreenFlashWindow() is invoked first.");
        }
        F.M mI = i();
        if (mI == null || !G()) {
            K0(executor, eVar, fVar);
            return;
        }
        boolean z10 = l().J() != 0;
        if (z10) {
            throw new IllegalArgumentException("Simultaneous capture RAW and JPEG needs two output file options");
        }
        E.Y y10 = this.f33746A;
        Objects.requireNonNull(y10);
        y10.e(E.i0.v(executor, eVar, fVar, gVar, gVar2, B0(), y(), t(mI), y0(), v0(), z10, this.f33756y.s()));
    }

    private void U0() {
        synchronized (this.f33751t) {
            try {
                if (this.f33751t.get() != null) {
                    return;
                }
                j().h(w0());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void g0(V v10, k1 k1Var, k1.g gVar) {
        if (v10.i() == null) {
            return;
        }
        v10.f33746A.pause();
        v10.r0(true);
        k1.b bVarS0 = v10.s0(v10.k(), (F.C0) v10.l(), (o1) H0.g.g(v10.g()));
        v10.f33756y = bVarS0;
        v10.d0(AbstractC3567L.a(new Object[]{bVarS0.p()}));
        v10.L();
        v10.f33746A.b();
    }

    public static /* synthetic */ void h0(F.F0 f02) {
        try {
            androidx.camera.core.o oVarB = f02.b();
            try {
                Objects.toString(oVarB);
                if (oVarB != null) {
                    oVarB.close();
                }
            } finally {
            }
        } catch (IllegalStateException unused) {
        }
    }

    public static /* synthetic */ Void j0(List list) {
        return null;
    }

    private void k0() {
        this.f33755x.f();
        E.Y y10 = this.f33746A;
        if (y10 != null) {
            y10.c();
        }
    }

    private void o0(D1.b bVar) {
        Set<A.b> setO = o();
        if (setO != null) {
            int iF = 0;
            for (A.b bVar2 : setO) {
                if (bVar2 instanceof C.d) {
                    iF = ((C.d) bVar2).f();
                }
            }
            bVar.b().X(F.C0.f1276U, Integer.valueOf(iF));
        }
    }

    private E.G p0(int i10, Size size) {
        A0();
        return null;
    }

    private void q0() {
        r0(false);
    }

    private void r0(boolean z10) {
        E.Y y10;
        H.y.b();
        k1.c cVar = this.f33747B;
        if (cVar != null) {
            cVar.b();
            this.f33747B = null;
        }
        C0465z c0465z = this.f33757z;
        if (c0465z != null) {
            c0465z.a();
            this.f33757z = null;
        }
        if (!z10 && (y10 = this.f33746A) != null) {
            y10.c();
            this.f33746A = null;
        }
        j().a();
    }

    private k1.b s0(String str, F.C0 c02, o1 o1Var) {
        H.y.b();
        String.format("createPipeline(cameraId: %s, streamSpec: %s)", str, o1Var);
        Size sizeF = o1Var.f();
        F.M mI = i();
        Objects.requireNonNull(mI);
        boolean z10 = !mI.o();
        if (this.f33757z != null) {
            H0.g.i(z10);
            this.f33757z.a();
        }
        Set setD = x0(i().d()).d();
        H0.g.b(setD.contains(Integer.valueOf(z0())), "The specified output format (" + z0() + ") is not supported by current configuration. Supported output formats: " + setD);
        CameraCharacteristics cameraCharacteristics = null;
        E.G gP0 = H0() ? p0(c02.r(), sizeF) : null;
        if (i() != null) {
            try {
                Object objR = i().r().r();
                if (objR instanceof CameraCharacteristics) {
                    cameraCharacteristics = (CameraCharacteristics) objR;
                }
            } catch (Exception unused) {
            }
        }
        n();
        this.f33757z = new C0465z(c02, sizeF, cameraCharacteristics, null, z10, gP0);
        if (this.f33746A == null) {
            this.f33746A = l().s().a(this.f33748C);
        }
        this.f33746A.d(this.f33757z);
        k1.b bVarF = this.f33757z.f(o1Var.f());
        bVarF.A(o1Var.g());
        if (v0() == 2 && !o1Var.h()) {
            j().b(bVarF);
        }
        if (o1Var.d() != null) {
            bVarF.g(o1Var.d());
        }
        k1.c cVar = this.f33747B;
        if (cVar != null) {
            cVar.b();
        }
        k1.c cVar2 = new k1.c(new k1.d() { // from class: y.T
            @Override // F.k1.d
            public final void a(k1 k1Var, k1.g gVar) {
                V.g0(this.f33743a, k1Var, gVar);
            }
        });
        this.f33747B = cVar2;
        bVarF.u(cVar2);
        return bVarF;
    }

    private int u0() {
        F.M mI = i();
        if (mI != null) {
            return mI.d().k();
        }
        return -1;
    }

    public static W x0(InterfaceC3597q interfaceC3597q) {
        return new d(interfaceC3597q);
    }

    private int y0() {
        F.C0 c02 = (F.C0) l();
        if (c02.b(F.C0.f1281Z)) {
            return c02.l0();
        }
        int i10 = this.f33750s;
        if (i10 == 0) {
            return 100;
        }
        if (i10 == 1 || i10 == 2) {
            return 95;
        }
        throw new IllegalStateException("CaptureMode " + this.f33750s + " is invalid");
    }

    @Override // y.J0
    public Set B() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return hashSet;
    }

    public int C0() {
        return C();
    }

    @Override // y.J0
    public D1.b D(InterfaceC0490j0 interfaceC0490j0) {
        return b.f(interfaceC0490j0);
    }

    public boolean H0() {
        return ((Boolean) l().f(F.C0.f1284c0, Boolean.FALSE)).booleanValue();
    }

    void J0() {
        synchronized (this.f33751t) {
            try {
                if (this.f33751t.get() != null) {
                    return;
                }
                this.f33751t.set(Integer.valueOf(w0()));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void L0(Rational rational) {
        this.f33754w = rational;
    }

    public void M0(int i10) {
        AbstractC3583h0.a("ImageCapture", "setFlashMode: flashMode = " + i10);
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                throw new IllegalArgumentException("Invalid flash mode: " + i10);
            }
            if (this.f33755x.h() == null) {
                throw new IllegalArgumentException("A ScreenFlash instance is required for FLASH_MODE_SCREEN but was not found. If value from PreviewView.getScreenFlash() is set to ImageCapture.setScreenFlash(), ensure PreviewView.setScreenFlashWindow() is invoked first.");
            }
            if (i() != null && u0() != 0) {
                throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN");
            }
        }
        synchronized (this.f33751t) {
            this.f33753v = i10;
            U0();
        }
    }

    public void N0(i iVar) {
        this.f33755x = K.k.g(iVar);
        O0();
    }

    @Override // y.J0
    public void O() {
        H0.g.h(i(), "Attached camera cannot be null");
        if (w0() == 3 && u0() != 0) {
            throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture");
        }
    }

    @Override // y.J0
    public void P() {
        AbstractC3583h0.a("ImageCapture", "onCameraControlReady");
        U0();
        O0();
    }

    @Override // y.J0
    protected D1 Q(F.L l10, D1.b bVar) {
        o0(bVar);
        if (l10.w().a(SoftwareJpegEncodingPreferredQuirk.class)) {
            Boolean bool = Boolean.FALSE;
            R0 r0B = bVar.b();
            InterfaceC0490j0.a aVar = F.C0.f1279X;
            Boolean bool2 = Boolean.TRUE;
            if (bool.equals(r0B.f(aVar, bool2))) {
                AbstractC3583h0.l("ImageCapture", "Device quirk suggests software JPEG encoder, but it has been explicitly disabled.");
            } else {
                AbstractC3583h0.e("ImageCapture", "Requesting software JPEG due to device quirk.");
                bVar.b().X(aVar, bool2);
            }
        }
        boolean zT0 = t0(bVar.b());
        Integer num = (Integer) bVar.b().f(F.C0.f1275T, null);
        if (num != null) {
            H0.g.b(!I0() || num.intValue() == 256, "Cannot set non-JPEG buffer format with Extensions enabled.");
            bVar.b().X(F.D0.f1294j, Integer.valueOf(zT0 ? 35 : num.intValue()));
        } else if (E0(bVar.b())) {
            bVar.b().X(F.D0.f1294j, 32);
        } else if (F0(bVar.b())) {
            bVar.b().X(F.D0.f1294j, 32);
            bVar.b().X(F.D0.f1295k, 256);
        } else if (G0(bVar.b())) {
            bVar.b().X(F.D0.f1294j, 4101);
            bVar.b().X(F.D0.f1296l, C3563H.f33649c);
        } else if (zT0) {
            bVar.b().X(F.D0.f1294j, 35);
        } else {
            List list = (List) bVar.b().f(F.E0.f1329t, null);
            if (list == null || D0(list, 256)) {
                bVar.b().X(F.D0.f1294j, 256);
            } else if (D0(list, 35)) {
                bVar.b().X(F.D0.f1294j, 35);
            }
        }
        return bVar.c();
    }

    public void Q0(int i10) {
        int iC0 = C0();
        if (!a0(i10) || this.f33754w == null) {
            return;
        }
        this.f33754w = O.b.f(Math.abs(H.c.b(i10) - H.c.b(iC0)), this.f33754w);
    }

    InterfaceFutureC2904a R0(List list) {
        H.y.b();
        return J.n.x(j().e(list, this.f33750s, this.f33752u), new InterfaceC2955a() { // from class: y.U
            @Override // n.InterfaceC2955a
            public final Object apply(Object obj) {
                return V.j0((List) obj);
            }
        }, I.c.b());
    }

    @Override // y.J0
    public void S() {
        k0();
    }

    public void S0(final Executor executor, final e eVar) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            I.c.e().execute(new Runnable() { // from class: y.Q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f33740g.S0(executor, eVar);
                }
            });
        } else {
            T0(executor, eVar, null, null, null);
        }
    }

    @Override // y.J0
    protected o1 T(InterfaceC0490j0 interfaceC0490j0) {
        this.f33756y.g(interfaceC0490j0);
        d0(AbstractC3567L.a(new Object[]{this.f33756y.p()}));
        return g().i().d(interfaceC0490j0).a();
    }

    @Override // y.J0
    protected o1 U(o1 o1Var, o1 o1Var2) {
        AbstractC3583h0.a("ImageCapture", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + o1Var + ", secondaryStreamSpec " + o1Var2);
        k1.b bVarS0 = s0(k(), (F.C0) l(), o1Var);
        this.f33756y = bVarS0;
        d0(AbstractC3567L.a(new Object[]{bVarS0.p()}));
        J();
        return o1Var;
    }

    @Override // y.J0
    public void V() {
        k0();
        q0();
        P0(null);
    }

    void V0() {
        synchronized (this.f33751t) {
            try {
                Integer num = (Integer) this.f33751t.getAndSet(null);
                if (num == null) {
                    return;
                }
                if (num.intValue() != w0()) {
                    U0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // y.J0
    public D1 m(boolean z10, E1 e12) {
        c cVar = f33744D;
        InterfaceC0490j0 interfaceC0490j0A = e12.a(cVar.a().G(), v0());
        if (z10) {
            interfaceC0490j0A = InterfaceC0490j0.W(interfaceC0490j0A, cVar.a());
        }
        if (interfaceC0490j0A == null) {
            return null;
        }
        return D(interfaceC0490j0A).c();
    }

    boolean t0(R0 r02) {
        boolean z10;
        Boolean bool = Boolean.TRUE;
        InterfaceC0490j0.a aVar = F.C0.f1279X;
        Boolean bool2 = Boolean.FALSE;
        boolean z11 = false;
        if (bool.equals(r02.f(aVar, bool2))) {
            if (I0()) {
                AbstractC3583h0.l("ImageCapture", "Software JPEG cannot be used with Extensions.");
                z10 = false;
            } else {
                z10 = true;
            }
            Integer num = (Integer) r02.f(F.C0.f1275T, null);
            if (num == null || num.intValue() == 256) {
                z11 = z10;
            } else {
                AbstractC3583h0.l("ImageCapture", "Software JPEG cannot be used with non-JPEG output buffer format.");
            }
            if (!z11) {
                AbstractC3583h0.l("ImageCapture", "Unable to support software JPEG. Disabling.");
                r02.X(aVar, bool2);
            }
        }
        return z11;
    }

    public String toString() {
        return "ImageCapture:" + r();
    }

    public int v0() {
        return this.f33750s;
    }

    public int w0() {
        int iH0;
        synchronized (this.f33751t) {
            iH0 = this.f33753v;
            if (iH0 == -1) {
                iH0 = ((F.C0) l()).h0(2);
            }
        }
        return iH0;
    }

    public int z0() {
        return ((Integer) H0.g.g((Integer) l().f(F.C0.f1276U, 0))).intValue();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class e {
        public abstract void onCaptureStarted();

        public abstract void onCaptureSuccess(androidx.camera.core.o oVar);

        public abstract void onError(X x10);

        public void onCaptureProcessProgressed(int i10) {
        }

        public void onPostviewBitmapAvailable(Bitmap bitmap) {
        }
    }
}
