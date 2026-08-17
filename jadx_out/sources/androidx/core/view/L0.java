package androidx.core.view;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class L0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final L0 f16462b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f16463a;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class d extends c {
        d() {
        }

        @Override // androidx.core.view.L0.g
        void c(int i10, x0.e eVar) {
            this.f16471c.setInsets(q.a(i10), eVar.g());
        }

        d(L0 l02) {
            super(l02);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class e extends d {
        e() {
        }

        e(L0 l02) {
            super(l02);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class f extends e {
        f() {
        }

        @Override // androidx.core.view.L0.d, androidx.core.view.L0.g
        void c(int i10, x0.e eVar) {
            this.f16471c.setInsets(r.a(i10), eVar.g());
        }

        f(L0 l02) {
            super(l02);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final L0 f16472a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        x0.e[] f16473b;

        g() {
            this(new L0((L0) null));
        }

        protected final void a() {
            x0.e[] eVarArr = this.f16473b;
            if (eVarArr != null) {
                x0.e eVarF = eVarArr[p.c(1)];
                x0.e eVarF2 = this.f16473b[p.c(2)];
                if (eVarF2 == null) {
                    eVarF2 = this.f16472a.f(2);
                }
                if (eVarF == null) {
                    eVarF = this.f16472a.f(1);
                }
                g(x0.e.b(eVarF, eVarF2));
                x0.e eVar = this.f16473b[p.c(16)];
                if (eVar != null) {
                    f(eVar);
                }
                x0.e eVar2 = this.f16473b[p.c(32)];
                if (eVar2 != null) {
                    d(eVar2);
                }
                x0.e eVar3 = this.f16473b[p.c(64)];
                if (eVar3 != null) {
                    h(eVar3);
                }
            }
        }

        abstract L0 b();

        void c(int i10, x0.e eVar) {
            if (this.f16473b == null) {
                this.f16473b = new x0.e[10];
            }
            for (int i11 = 1; i11 <= 512; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    this.f16473b[p.c(i11)] = eVar;
                }
            }
        }

        abstract void e(x0.e eVar);

        abstract void g(x0.e eVar);

        g(L0 l02) {
            this.f16472a = l02;
        }

        void d(x0.e eVar) {
        }

        void f(x0.e eVar) {
        }

        void h(x0.e eVar) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class j extends i {
        j(L0 l02, WindowInsets windowInsets) {
            super(l02, windowInsets);
        }

        @Override // androidx.core.view.L0.o
        L0 a() {
            return L0.y(this.f16479c.consumeDisplayCutout());
        }

        @Override // androidx.core.view.L0.h, androidx.core.view.L0.o
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Objects.equals(this.f16479c, jVar.f16479c) && Objects.equals(this.f16483g, jVar.f16483g) && h.C(this.f16484h, jVar.f16484h);
        }

        @Override // androidx.core.view.L0.o
        androidx.core.view.r f() {
            return androidx.core.view.r.e(this.f16479c.getDisplayCutout());
        }

        @Override // androidx.core.view.L0.o
        public int hashCode() {
            return this.f16479c.hashCode();
        }

        j(L0 l02, j jVar) {
            super(l02, jVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class l extends k {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        static final L0 f16489r = L0.y(WindowInsets.CONSUMED);

        l(L0 l02, WindowInsets windowInsets) {
            super(l02, windowInsets);
        }

        @Override // androidx.core.view.L0.h, androidx.core.view.L0.o
        public x0.e g(int i10) {
            return x0.e.f(this.f16479c.getInsets(q.a(i10)));
        }

        @Override // androidx.core.view.L0.h, androidx.core.view.L0.o
        public x0.e h(int i10) {
            return x0.e.f(this.f16479c.getInsetsIgnoringVisibility(q.a(i10)));
        }

        @Override // androidx.core.view.L0.h, androidx.core.view.L0.o
        public boolean q(int i10) {
            return this.f16479c.isVisible(q.a(i10));
        }

        l(L0 l02, l lVar) {
            super(l02, lVar);
        }

        @Override // androidx.core.view.L0.h, androidx.core.view.L0.o
        final void d(View view) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class m extends l {
        m(L0 l02, WindowInsets windowInsets) {
            super(l02, windowInsets);
        }

        m(L0 l02, m mVar) {
            super(l02, mVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class n extends m {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        static final L0 f16490s = L0.y(WindowInsets.CONSUMED);

        n(L0 l02, WindowInsets windowInsets) {
            super(l02, windowInsets);
        }

        @Override // androidx.core.view.L0.l, androidx.core.view.L0.h, androidx.core.view.L0.o
        public x0.e g(int i10) {
            return x0.e.f(this.f16479c.getInsets(r.a(i10)));
        }

        @Override // androidx.core.view.L0.l, androidx.core.view.L0.h, androidx.core.view.L0.o
        public x0.e h(int i10) {
            return x0.e.f(this.f16479c.getInsetsIgnoringVisibility(r.a(i10)));
        }

        @Override // androidx.core.view.L0.l, androidx.core.view.L0.h, androidx.core.view.L0.o
        public boolean q(int i10) {
            return this.f16479c.isVisible(r.a(i10));
        }

        n(L0 l02, n nVar) {
            super(l02, nVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class p {
        public static int a() {
            return IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }

        public static int b() {
            return 8;
        }

        static int c(int i10) {
            if (i10 == 1) {
                return 0;
            }
            if (i10 == 2) {
                return 1;
            }
            if (i10 == 4) {
                return 2;
            }
            if (i10 == 8) {
                return 3;
            }
            if (i10 == 16) {
                return 4;
            }
            if (i10 == 32) {
                return 5;
            }
            if (i10 == 64) {
                return 6;
            }
            if (i10 == 128) {
                return 7;
            }
            if (i10 == 256) {
                return 8;
            }
            if (i10 == 512) {
                return 9;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i10);
        }

        public static int d() {
            return 32;
        }

        public static int e() {
            return 2;
        }

        public static int f() {
            return 1;
        }

        public static int g() {
            return 519;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class q {
        static int a(int i10) {
            int iStatusBars;
            int i11 = 0;
            for (int i12 = 1; i12 <= 512; i12 <<= 1) {
                if ((i10 & i12) != 0) {
                    if (i12 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i12 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i12 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i12 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i12 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i12 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i12 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i12 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    }
                    i11 |= iStatusBars;
                }
            }
            return i11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class r {
        static int a(int i10) {
            int iStatusBars;
            int i11 = 0;
            for (int i12 = 1; i12 <= 512; i12 <<= 1) {
                if ((i10 & i12) != 0) {
                    if (i12 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i12 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i12 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i12 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i12 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i12 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i12 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i12 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    } else if (i12 == 512) {
                        iStatusBars = WindowInsets.Type.systemOverlays();
                    }
                    i11 |= iStatusBars;
                }
            }
            return i11;
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            f16462b = n.f16490s;
        } else if (i10 >= 30) {
            f16462b = l.f16489r;
        } else {
            f16462b = o.f16491b;
        }
    }

    private L0(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            this.f16463a = new n(this, windowInsets);
            return;
        }
        if (i10 >= 31) {
            this.f16463a = new m(this, windowInsets);
            return;
        }
        if (i10 >= 30) {
            this.f16463a = new l(this, windowInsets);
            return;
        }
        if (i10 >= 29) {
            this.f16463a = new k(this, windowInsets);
        } else if (i10 >= 28) {
            this.f16463a = new j(this, windowInsets);
        } else {
            this.f16463a = new i(this, windowInsets);
        }
    }

    static x0.e o(x0.e eVar, int i10, int i11, int i12, int i13) {
        int iMax = Math.max(0, eVar.f33237a - i10);
        int iMax2 = Math.max(0, eVar.f33238b - i11);
        int iMax3 = Math.max(0, eVar.f33239c - i12);
        int iMax4 = Math.max(0, eVar.f33240d - i13);
        return (iMax == i10 && iMax2 == i11 && iMax3 == i12 && iMax4 == i13) ? eVar : x0.e.c(iMax, iMax2, iMax3, iMax4);
    }

    public static L0 y(WindowInsets windowInsets) {
        return z(windowInsets, null);
    }

    public static L0 z(WindowInsets windowInsets, View view) {
        L0 l02 = new L0((WindowInsets) H0.g.g(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            l02.u(AbstractC1658a0.F(view));
            l02.d(view.getRootView());
            l02.w(view.getWindowSystemUiVisibility());
        }
        return l02;
    }

    public L0 a() {
        return this.f16463a.a();
    }

    public L0 b() {
        return this.f16463a.b();
    }

    public L0 c() {
        return this.f16463a.c();
    }

    void d(View view) {
        this.f16463a.d(view);
    }

    public androidx.core.view.r e() {
        return this.f16463a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof L0) {
            return H0.c.a(this.f16463a, ((L0) obj).f16463a);
        }
        return false;
    }

    public x0.e f(int i10) {
        return this.f16463a.g(i10);
    }

    public x0.e g(int i10) {
        return this.f16463a.h(i10);
    }

    public x0.e h() {
        return this.f16463a.j();
    }

    public int hashCode() {
        o oVar = this.f16463a;
        if (oVar == null) {
            return 0;
        }
        return oVar.hashCode();
    }

    public x0.e i() {
        return this.f16463a.k();
    }

    public int j() {
        return this.f16463a.l().f33240d;
    }

    public int k() {
        return this.f16463a.l().f33237a;
    }

    public int l() {
        return this.f16463a.l().f33239c;
    }

    public int m() {
        return this.f16463a.l().f33238b;
    }

    public L0 n(int i10, int i11, int i12, int i13) {
        return this.f16463a.n(i10, i11, i12, i13);
    }

    public boolean p() {
        return this.f16463a.o();
    }

    public boolean q(int i10) {
        return this.f16463a.q(i10);
    }

    public L0 r(int i10, int i11, int i12, int i13) {
        return new a(this).d(x0.e.c(i10, i11, i12, i13)).a();
    }

    void s(x0.e[] eVarArr) {
        this.f16463a.r(eVarArr);
    }

    void t(x0.e eVar) {
        this.f16463a.s(eVar);
    }

    void u(L0 l02) {
        this.f16463a.t(l02);
    }

    void v(x0.e eVar) {
        this.f16463a.u(eVar);
    }

    void w(int i10) {
        this.f16463a.v(i10);
    }

    public WindowInsets x() {
        o oVar = this.f16463a;
        if (oVar instanceof h) {
            return ((h) oVar).f16479c;
        }
        return null;
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class b extends g {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static Field f16465e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static boolean f16466f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static Constructor f16467g = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static boolean f16468h = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WindowInsets f16469c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private x0.e f16470d;

        b() {
            this.f16469c = i();
        }

        private static WindowInsets i() {
            if (!f16466f) {
                try {
                    f16465e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException unused) {
                }
                f16466f = true;
            }
            Field field = f16465e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException unused2) {
                }
            }
            if (!f16468h) {
                try {
                    f16467g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException unused3) {
                }
                f16468h = true;
            }
            Constructor constructor = f16467g;
            if (constructor != null) {
                try {
                    return (WindowInsets) constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException unused4) {
                }
            }
            return null;
        }

        @Override // androidx.core.view.L0.g
        L0 b() {
            a();
            L0 l0Y = L0.y(this.f16469c);
            l0Y.s(this.f16473b);
            l0Y.v(this.f16470d);
            return l0Y;
        }

        @Override // androidx.core.view.L0.g
        void e(x0.e eVar) {
            this.f16470d = eVar;
        }

        @Override // androidx.core.view.L0.g
        void g(x0.e eVar) {
            WindowInsets windowInsets = this.f16469c;
            if (windowInsets != null) {
                this.f16469c = windowInsets.replaceSystemWindowInsets(eVar.f33237a, eVar.f33238b, eVar.f33239c, eVar.f33240d);
            }
        }

        b(L0 l02) {
            super(l02);
            this.f16469c = l02.x();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class c extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final WindowInsets.Builder f16471c;

        c() {
            this.f16471c = F0.n.a();
        }

        @Override // androidx.core.view.L0.g
        L0 b() {
            a();
            L0 l0Y = L0.y(this.f16471c.build());
            l0Y.s(this.f16473b);
            return l0Y;
        }

        @Override // androidx.core.view.L0.g
        void d(x0.e eVar) {
            this.f16471c.setMandatorySystemGestureInsets(eVar.g());
        }

        @Override // androidx.core.view.L0.g
        void e(x0.e eVar) {
            this.f16471c.setStableInsets(eVar.g());
        }

        @Override // androidx.core.view.L0.g
        void f(x0.e eVar) {
            this.f16471c.setSystemGestureInsets(eVar.g());
        }

        @Override // androidx.core.view.L0.g
        void g(x0.e eVar) {
            this.f16471c.setSystemWindowInsets(eVar.g());
        }

        @Override // androidx.core.view.L0.g
        void h(x0.e eVar) {
            this.f16471c.setTappableElementInsets(eVar.g());
        }

        c(L0 l02) {
            WindowInsets.Builder builderA;
            super(l02);
            WindowInsets windowInsetsX = l02.x();
            if (windowInsetsX != null) {
                builderA = R0.a(windowInsetsX);
            } else {
                builderA = F0.n.a();
            }
            this.f16471c = builderA;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class i extends h {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private x0.e f16485n;

        i(L0 l02, WindowInsets windowInsets) {
            super(l02, windowInsets);
            this.f16485n = null;
        }

        @Override // androidx.core.view.L0.o
        L0 b() {
            return L0.y(this.f16479c.consumeStableInsets());
        }

        @Override // androidx.core.view.L0.o
        L0 c() {
            return L0.y(this.f16479c.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.L0.o
        final x0.e j() {
            if (this.f16485n == null) {
                this.f16485n = x0.e.c(this.f16479c.getStableInsetLeft(), this.f16479c.getStableInsetTop(), this.f16479c.getStableInsetRight(), this.f16479c.getStableInsetBottom());
            }
            return this.f16485n;
        }

        @Override // androidx.core.view.L0.o
        boolean o() {
            return this.f16479c.isConsumed();
        }

        @Override // androidx.core.view.L0.o
        public void u(x0.e eVar) {
            this.f16485n = eVar;
        }

        i(L0 l02, i iVar) {
            super(l02, iVar);
            this.f16485n = null;
            this.f16485n = iVar.f16485n;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class h extends o {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static boolean f16474i = false;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static Method f16475j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static Class f16476k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static Field f16477l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static Field f16478m;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final WindowInsets f16479c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private x0.e[] f16480d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private x0.e f16481e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private L0 f16482f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        x0.e f16483g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f16484h;

        h(L0 l02, WindowInsets windowInsets) {
            super(l02);
            this.f16481e = null;
            this.f16479c = windowInsets;
        }

        private static void B() {
            try {
                f16475j = View.class.getDeclaredMethod("getViewRootImpl", null);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f16476k = cls;
                f16477l = cls.getDeclaredField("mVisibleInsets");
                f16478m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f16477l.setAccessible(true);
                f16478m.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                e10.getMessage();
            }
            f16474i = true;
        }

        static boolean C(int i10, int i11) {
            return (i10 & 6) == (i11 & 6);
        }

        private x0.e w(int i10, boolean z10) {
            x0.e eVarB = x0.e.f33236e;
            for (int i11 = 1; i11 <= 512; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    eVarB = x0.e.b(eVarB, x(i11, z10));
                }
            }
            return eVarB;
        }

        private x0.e y() {
            L0 l02 = this.f16482f;
            return l02 != null ? l02.h() : x0.e.f33236e;
        }

        private x0.e z(View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f16474i) {
                B();
            }
            Method method = f16475j;
            if (method != null && f16476k != null && f16477l != null) {
                try {
                    Object objInvoke = method.invoke(view, null);
                    if (objInvoke == null) {
                        return null;
                    }
                    Rect rect = (Rect) f16477l.get(f16478m.get(objInvoke));
                    if (rect != null) {
                        return x0.e.d(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e10) {
                    e10.getMessage();
                }
            }
            return null;
        }

        protected boolean A(int i10) {
            if (i10 != 1 && i10 != 2) {
                if (i10 == 4) {
                    return false;
                }
                if (i10 != 8 && i10 != 128) {
                    return true;
                }
            }
            return !x(i10, false).equals(x0.e.f33236e);
        }

        @Override // androidx.core.view.L0.o
        void d(View view) {
            x0.e eVarZ = z(view);
            if (eVarZ == null) {
                eVarZ = x0.e.f33236e;
            }
            s(eVarZ);
        }

        @Override // androidx.core.view.L0.o
        void e(L0 l02) {
            l02.u(this.f16482f);
            l02.t(this.f16483g);
            l02.w(this.f16484h);
        }

        @Override // androidx.core.view.L0.o
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            h hVar = (h) obj;
            return Objects.equals(this.f16483g, hVar.f16483g) && C(this.f16484h, hVar.f16484h);
        }

        @Override // androidx.core.view.L0.o
        public x0.e g(int i10) {
            return w(i10, false);
        }

        @Override // androidx.core.view.L0.o
        public x0.e h(int i10) {
            return w(i10, true);
        }

        @Override // androidx.core.view.L0.o
        final x0.e l() {
            if (this.f16481e == null) {
                this.f16481e = x0.e.c(this.f16479c.getSystemWindowInsetLeft(), this.f16479c.getSystemWindowInsetTop(), this.f16479c.getSystemWindowInsetRight(), this.f16479c.getSystemWindowInsetBottom());
            }
            return this.f16481e;
        }

        @Override // androidx.core.view.L0.o
        L0 n(int i10, int i11, int i12, int i13) {
            a aVar = new a(L0.y(this.f16479c));
            aVar.d(L0.o(l(), i10, i11, i12, i13));
            aVar.c(L0.o(j(), i10, i11, i12, i13));
            return aVar.a();
        }

        @Override // androidx.core.view.L0.o
        boolean p() {
            return this.f16479c.isRound();
        }

        @Override // androidx.core.view.L0.o
        boolean q(int i10) {
            for (int i11 = 1; i11 <= 512; i11 <<= 1) {
                if ((i10 & i11) != 0 && !A(i11)) {
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.core.view.L0.o
        public void r(x0.e[] eVarArr) {
            this.f16480d = eVarArr;
        }

        @Override // androidx.core.view.L0.o
        void s(x0.e eVar) {
            this.f16483g = eVar;
        }

        @Override // androidx.core.view.L0.o
        void t(L0 l02) {
            this.f16482f = l02;
        }

        @Override // androidx.core.view.L0.o
        void v(int i10) {
            this.f16484h = i10;
        }

        protected x0.e x(int i10, boolean z10) {
            x0.e eVarH;
            int i11;
            if (i10 == 1) {
                return z10 ? x0.e.c(0, Math.max(y().f33238b, l().f33238b), 0, 0) : (this.f16484h & 4) != 0 ? x0.e.f33236e : x0.e.c(0, l().f33238b, 0, 0);
            }
            if (i10 == 2) {
                if (z10) {
                    x0.e eVarY = y();
                    x0.e eVarJ = j();
                    return x0.e.c(Math.max(eVarY.f33237a, eVarJ.f33237a), 0, Math.max(eVarY.f33239c, eVarJ.f33239c), Math.max(eVarY.f33240d, eVarJ.f33240d));
                }
                if ((this.f16484h & 2) != 0) {
                    return x0.e.f33236e;
                }
                x0.e eVarL = l();
                L0 l02 = this.f16482f;
                eVarH = l02 != null ? l02.h() : null;
                int iMin = eVarL.f33240d;
                if (eVarH != null) {
                    iMin = Math.min(iMin, eVarH.f33240d);
                }
                return x0.e.c(eVarL.f33237a, 0, eVarL.f33239c, iMin);
            }
            if (i10 != 8) {
                if (i10 == 16) {
                    return k();
                }
                if (i10 == 32) {
                    return i();
                }
                if (i10 == 64) {
                    return m();
                }
                if (i10 != 128) {
                    return x0.e.f33236e;
                }
                L0 l03 = this.f16482f;
                androidx.core.view.r rVarE = l03 != null ? l03.e() : f();
                return rVarE != null ? x0.e.c(rVarE.b(), rVarE.d(), rVarE.c(), rVarE.a()) : x0.e.f33236e;
            }
            x0.e[] eVarArr = this.f16480d;
            eVarH = eVarArr != null ? eVarArr[p.c(8)] : null;
            if (eVarH != null) {
                return eVarH;
            }
            x0.e eVarL2 = l();
            x0.e eVarY2 = y();
            int i12 = eVarL2.f33240d;
            if (i12 > eVarY2.f33240d) {
                return x0.e.c(0, 0, 0, i12);
            }
            x0.e eVar = this.f16483g;
            return (eVar == null || eVar.equals(x0.e.f33236e) || (i11 = this.f16483g.f33240d) <= eVarY2.f33240d) ? x0.e.f33236e : x0.e.c(0, 0, 0, i11);
        }

        h(L0 l02, h hVar) {
            this(l02, new WindowInsets(hVar.f16479c));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class k extends j {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private x0.e f16486o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private x0.e f16487p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private x0.e f16488q;

        k(L0 l02, WindowInsets windowInsets) {
            super(l02, windowInsets);
            this.f16486o = null;
            this.f16487p = null;
            this.f16488q = null;
        }

        @Override // androidx.core.view.L0.o
        x0.e i() {
            if (this.f16487p == null) {
                this.f16487p = x0.e.f(this.f16479c.getMandatorySystemGestureInsets());
            }
            return this.f16487p;
        }

        @Override // androidx.core.view.L0.o
        x0.e k() {
            if (this.f16486o == null) {
                this.f16486o = x0.e.f(this.f16479c.getSystemGestureInsets());
            }
            return this.f16486o;
        }

        @Override // androidx.core.view.L0.o
        x0.e m() {
            if (this.f16488q == null) {
                this.f16488q = x0.e.f(this.f16479c.getTappableElementInsets());
            }
            return this.f16488q;
        }

        @Override // androidx.core.view.L0.h, androidx.core.view.L0.o
        L0 n(int i10, int i11, int i12, int i13) {
            return L0.y(this.f16479c.inset(i10, i11, i12, i13));
        }

        k(L0 l02, k kVar) {
            super(l02, kVar);
            this.f16486o = null;
            this.f16487p = null;
            this.f16488q = null;
        }

        @Override // androidx.core.view.L0.i, androidx.core.view.L0.o
        public void u(x0.e eVar) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final g f16464a;

        public a() {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34) {
                this.f16464a = new f();
                return;
            }
            if (i10 >= 31) {
                this.f16464a = new e();
                return;
            }
            if (i10 >= 30) {
                this.f16464a = new d();
            } else if (i10 >= 29) {
                this.f16464a = new c();
            } else {
                this.f16464a = new b();
            }
        }

        public L0 a() {
            return this.f16464a.b();
        }

        public a b(int i10, x0.e eVar) {
            this.f16464a.c(i10, eVar);
            return this;
        }

        public a c(x0.e eVar) {
            this.f16464a.e(eVar);
            return this;
        }

        public a d(x0.e eVar) {
            this.f16464a.g(eVar);
            return this;
        }

        public a(L0 l02) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34) {
                this.f16464a = new f(l02);
                return;
            }
            if (i10 >= 31) {
                this.f16464a = new e(l02);
                return;
            }
            if (i10 >= 30) {
                this.f16464a = new d(l02);
            } else if (i10 >= 29) {
                this.f16464a = new c(l02);
            } else {
                this.f16464a = new b(l02);
            }
        }
    }

    public L0(L0 l02) {
        if (l02 != null) {
            o oVar = l02.f16463a;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34 && (oVar instanceof n)) {
                this.f16463a = new n(this, (n) oVar);
            } else if (i10 >= 31 && (oVar instanceof m)) {
                this.f16463a = new m(this, (m) oVar);
            } else if (i10 >= 30 && (oVar instanceof l)) {
                this.f16463a = new l(this, (l) oVar);
            } else if (i10 >= 29 && (oVar instanceof k)) {
                this.f16463a = new k(this, (k) oVar);
            } else if (i10 >= 28 && (oVar instanceof j)) {
                this.f16463a = new j(this, (j) oVar);
            } else if (oVar instanceof i) {
                this.f16463a = new i(this, (i) oVar);
            } else if (oVar instanceof h) {
                this.f16463a = new h(this, (h) oVar);
            } else {
                this.f16463a = new o(this);
            }
            oVar.e(this);
            return;
        }
        this.f16463a = new o(this);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final L0 f16491b = new a().a().a().b().c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final L0 f16492a;

        o(L0 l02) {
            this.f16492a = l02;
        }

        L0 a() {
            return this.f16492a;
        }

        L0 b() {
            return this.f16492a;
        }

        L0 c() {
            return this.f16492a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return p() == oVar.p() && o() == oVar.o() && H0.c.a(l(), oVar.l()) && H0.c.a(j(), oVar.j()) && H0.c.a(f(), oVar.f());
        }

        androidx.core.view.r f() {
            return null;
        }

        x0.e g(int i10) {
            return x0.e.f33236e;
        }

        x0.e h(int i10) {
            if ((i10 & 8) == 0) {
                return x0.e.f33236e;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        public int hashCode() {
            return H0.c.b(Boolean.valueOf(p()), Boolean.valueOf(o()), l(), j(), f());
        }

        x0.e i() {
            return l();
        }

        x0.e j() {
            return x0.e.f33236e;
        }

        x0.e k() {
            return l();
        }

        x0.e l() {
            return x0.e.f33236e;
        }

        x0.e m() {
            return l();
        }

        L0 n(int i10, int i11, int i12, int i13) {
            return f16491b;
        }

        boolean o() {
            return false;
        }

        boolean p() {
            return false;
        }

        boolean q(int i10) {
            return true;
        }

        void d(View view) {
        }

        void e(L0 l02) {
        }

        public void r(x0.e[] eVarArr) {
        }

        void s(x0.e eVar) {
        }

        void t(L0 l02) {
        }

        public void u(x0.e eVar) {
        }

        void v(int i10) {
        }
    }
}
