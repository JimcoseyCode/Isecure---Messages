package androidx.core.view;

import a1.C1590a;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.core.view.L0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import v0.AbstractC3415c;

/* JADX INFO: renamed from: androidx.core.view.q0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C1690q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f16588a;

    /* JADX INFO: renamed from: androidx.core.view.q0$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class c extends e {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final Interpolator f16591f = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final Interpolator f16592g = new C1590a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final Interpolator f16593h = new DecelerateInterpolator(1.5f);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final Interpolator f16594i = new AccelerateInterpolator(1.5f);

        /* JADX INFO: renamed from: androidx.core.view.q0$c$a */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        private static class a implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final b f16595a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private L0 f16596b;

            /* JADX INFO: renamed from: androidx.core.view.q0$c$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
            class C0165a implements ValueAnimator.AnimatorUpdateListener {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ C1690q0 f16597a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ L0 f16598b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ L0 f16599c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ int f16600d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ View f16601e;

                C0165a(C1690q0 c1690q0, L0 l02, L0 l03, int i10, View view) {
                    this.f16597a = c1690q0;
                    this.f16598b = l02;
                    this.f16599c = l03;
                    this.f16600d = i10;
                    this.f16601e = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f16597a.e(valueAnimator.getAnimatedFraction());
                    c.k(this.f16601e, c.o(this.f16598b, this.f16599c, this.f16597a.b(), this.f16600d), Collections.singletonList(this.f16597a));
                }
            }

            /* JADX INFO: renamed from: androidx.core.view.q0$c$a$b */
            /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
            class b extends AnimatorListenerAdapter {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ C1690q0 f16603a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ View f16604b;

                b(C1690q0 c1690q0, View view) {
                    this.f16603a = c1690q0;
                    this.f16604b = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    this.f16603a.e(1.0f);
                    c.i(this.f16604b, this.f16603a);
                }
            }

            /* JADX INFO: renamed from: androidx.core.view.q0$c$a$c, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
            class RunnableC0166c implements Runnable {

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ View f16606g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                final /* synthetic */ C1690q0 f16607h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                final /* synthetic */ a f16608i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                final /* synthetic */ ValueAnimator f16609j;

                RunnableC0166c(View view, C1690q0 c1690q0, a aVar, ValueAnimator valueAnimator) {
                    this.f16606g = view;
                    this.f16607h = c1690q0;
                    this.f16608i = aVar;
                    this.f16609j = valueAnimator;
                }

                @Override // java.lang.Runnable
                public void run() {
                    c.l(this.f16606g, this.f16607h, this.f16608i);
                    this.f16609j.start();
                }
            }

            a(View view, b bVar) {
                this.f16595a = bVar;
                L0 l0F = AbstractC1658a0.F(view);
                this.f16596b = l0F != null ? new L0.a(l0F).a() : null;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                if (!view.isLaidOut()) {
                    this.f16596b = L0.z(windowInsets, view);
                    return c.m(view, windowInsets);
                }
                L0 l0Z = L0.z(windowInsets, view);
                if (this.f16596b == null) {
                    this.f16596b = AbstractC1658a0.F(view);
                }
                if (this.f16596b == null) {
                    this.f16596b = l0Z;
                    return c.m(view, windowInsets);
                }
                b bVarN = c.n(view);
                if (bVarN != null && Objects.equals(bVarN.mDispachedInsets, l0Z)) {
                    return c.m(view, windowInsets);
                }
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                c.e(l0Z, this.f16596b, iArr, iArr2);
                int i10 = iArr[0];
                int i11 = iArr2[0];
                int i12 = i10 | i11;
                if (i12 == 0) {
                    this.f16596b = l0Z;
                    return c.m(view, windowInsets);
                }
                L0 l02 = this.f16596b;
                C1690q0 c1690q0 = new C1690q0(i12, c.g(i10, i11), (L0.p.b() & i12) != 0 ? 160L : 250L);
                c1690q0.e(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c1690q0.a());
                a aVarF = c.f(l0Z, l02, i12);
                c.j(view, c1690q0, l0Z, false);
                duration.addUpdateListener(new C0165a(c1690q0, l0Z, l02, i12, view));
                duration.addListener(new b(c1690q0, view));
                L.a(view, new RunnableC0166c(view, c1690q0, aVarF, duration));
                this.f16596b = l0Z;
                return c.m(view, windowInsets);
            }
        }

        c(int i10, Interpolator interpolator, long j10) {
            super(i10, interpolator, j10);
        }

        static void e(L0 l02, L0 l03, int[] iArr, int[] iArr2) {
            for (int i10 = 1; i10 <= 512; i10 <<= 1) {
                x0.e eVarF = l02.f(i10);
                x0.e eVarF2 = l03.f(i10);
                int i11 = eVarF.f33237a;
                int i12 = eVarF2.f33237a;
                boolean z10 = i11 > i12 || eVarF.f33238b > eVarF2.f33238b || eVarF.f33239c > eVarF2.f33239c || eVarF.f33240d > eVarF2.f33240d;
                if (z10 != (i11 < i12 || eVarF.f33238b < eVarF2.f33238b || eVarF.f33239c < eVarF2.f33239c || eVarF.f33240d < eVarF2.f33240d)) {
                    if (z10) {
                        iArr[0] = iArr[0] | i10;
                    } else {
                        iArr2[0] = iArr2[0] | i10;
                    }
                }
            }
        }

        static a f(L0 l02, L0 l03, int i10) {
            x0.e eVarF = l02.f(i10);
            x0.e eVarF2 = l03.f(i10);
            return new a(x0.e.c(Math.min(eVarF.f33237a, eVarF2.f33237a), Math.min(eVarF.f33238b, eVarF2.f33238b), Math.min(eVarF.f33239c, eVarF2.f33239c), Math.min(eVarF.f33240d, eVarF2.f33240d)), x0.e.c(Math.max(eVarF.f33237a, eVarF2.f33237a), Math.max(eVarF.f33238b, eVarF2.f33238b), Math.max(eVarF.f33239c, eVarF2.f33239c), Math.max(eVarF.f33240d, eVarF2.f33240d)));
        }

        static Interpolator g(int i10, int i11) {
            if ((L0.p.b() & i10) != 0) {
                return f16591f;
            }
            if ((L0.p.b() & i11) != 0) {
                return f16592g;
            }
            if ((i10 & L0.p.g()) != 0) {
                return f16593h;
            }
            if ((L0.p.g() & i11) != 0) {
                return f16594i;
            }
            return null;
        }

        private static View.OnApplyWindowInsetsListener h(View view, b bVar) {
            return new a(view, bVar);
        }

        static void i(View view, C1690q0 c1690q0) {
            b bVarN = n(view);
            if (bVarN != null) {
                bVarN.onEnd(c1690q0);
                if (bVarN.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    i(viewGroup.getChildAt(i10), c1690q0);
                }
            }
        }

        static void j(View view, C1690q0 c1690q0, L0 l02, boolean z10) {
            b bVarN = n(view);
            if (bVarN != null) {
                bVarN.mDispachedInsets = l02;
                if (!z10) {
                    bVarN.onPrepare(c1690q0);
                    z10 = bVarN.getDispatchMode() == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    j(viewGroup.getChildAt(i10), c1690q0, l02, z10);
                }
            }
        }

        static void k(View view, L0 l02, List list) {
            b bVarN = n(view);
            if (bVarN != null) {
                l02 = bVarN.onProgress(l02, list);
                if (bVarN.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    k(viewGroup.getChildAt(i10), l02, list);
                }
            }
        }

        static void l(View view, C1690q0 c1690q0, a aVar) {
            b bVarN = n(view);
            if (bVarN != null) {
                bVarN.onStart(c1690q0, aVar);
                if (bVarN.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    l(viewGroup.getChildAt(i10), c1690q0, aVar);
                }
            }
        }

        static WindowInsets m(View view, WindowInsets windowInsets) {
            return view.getTag(AbstractC3415c.f32788M) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        static b n(View view) {
            Object tag = view.getTag(AbstractC3415c.f32795T);
            if (tag instanceof a) {
                return ((a) tag).f16595a;
            }
            return null;
        }

        static L0 o(L0 l02, L0 l03, float f10, int i10) {
            L0.a aVar = new L0.a(l02);
            for (int i11 = 1; i11 <= 512; i11 <<= 1) {
                if ((i10 & i11) == 0) {
                    aVar.b(i11, l02.f(i11));
                } else {
                    x0.e eVarF = l02.f(i11);
                    x0.e eVarF2 = l03.f(i11);
                    float f11 = 1.0f - f10;
                    aVar.b(i11, L0.o(eVarF, (int) (((double) ((eVarF.f33237a - eVarF2.f33237a) * f11)) + 0.5d), (int) (((double) ((eVarF.f33238b - eVarF2.f33238b) * f11)) + 0.5d), (int) (((double) ((eVarF.f33239c - eVarF2.f33239c) * f11)) + 0.5d), (int) (((double) ((eVarF.f33240d - eVarF2.f33240d) * f11)) + 0.5d)));
                }
            }
            return aVar.a();
        }

        static void p(View view, b bVar) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListenerH = bVar != null ? h(view, bVar) : null;
            view.setTag(AbstractC3415c.f32795T, onApplyWindowInsetsListenerH);
            if (view.getTag(AbstractC3415c.f32787L) == null && view.getTag(AbstractC3415c.f32788M) == null) {
                view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListenerH);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.q0$e */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f16616a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f16617b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Interpolator f16618c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f16619d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f16620e = 1.0f;

        e(int i10, Interpolator interpolator, long j10) {
            this.f16616a = i10;
            this.f16618c = interpolator;
            this.f16619d = j10;
        }

        public long a() {
            return this.f16619d;
        }

        public float b() {
            Interpolator interpolator = this.f16618c;
            return interpolator != null ? interpolator.getInterpolation(this.f16617b) : this.f16617b;
        }

        public int c() {
            return this.f16616a;
        }

        public void d(float f10) {
            this.f16617b = f10;
        }
    }

    public C1690q0(int i10, Interpolator interpolator, long j10) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f16588a = new d(i10, interpolator, j10);
        } else {
            this.f16588a = new c(i10, interpolator, j10);
        }
    }

    static void d(View view, b bVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            d.h(view, bVar);
        } else {
            c.p(view, bVar);
        }
    }

    static C1690q0 f(WindowInsetsAnimation windowInsetsAnimation) {
        return new C1690q0(windowInsetsAnimation);
    }

    public long a() {
        return this.f16588a.a();
    }

    public float b() {
        return this.f16588a.b();
    }

    public int c() {
        return this.f16588a.c();
    }

    public void e(float f10) {
        this.f16588a.d(f10);
    }

    /* JADX INFO: renamed from: androidx.core.view.q0$d */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class d extends e {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final WindowInsetsAnimation f16611f;

        /* JADX INFO: renamed from: androidx.core.view.q0$d$a */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        private static class a extends WindowInsetsAnimation$Callback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final b f16612a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private List f16613b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private ArrayList f16614c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final HashMap f16615d;

            a(b bVar) {
                super(bVar.getDispatchMode());
                this.f16615d = new HashMap();
                this.f16612a = bVar;
            }

            private C1690q0 a(WindowInsetsAnimation windowInsetsAnimation) {
                C1690q0 c1690q0 = (C1690q0) this.f16615d.get(windowInsetsAnimation);
                if (c1690q0 != null) {
                    return c1690q0;
                }
                C1690q0 c1690q0F = C1690q0.f(windowInsetsAnimation);
                this.f16615d.put(windowInsetsAnimation, c1690q0F);
                return c1690q0F;
            }

            public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.f16612a.onEnd(a(windowInsetsAnimation));
                this.f16615d.remove(windowInsetsAnimation);
            }

            public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.f16612a.onPrepare(a(windowInsetsAnimation));
            }

            public WindowInsets onProgress(WindowInsets windowInsets, List list) {
                ArrayList arrayList = this.f16614c;
                if (arrayList == null) {
                    ArrayList arrayList2 = new ArrayList(list.size());
                    this.f16614c = arrayList2;
                    this.f16613b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimationA = B0.a(list.get(size));
                    C1690q0 c1690q0A = a(windowInsetsAnimationA);
                    c1690q0A.e(windowInsetsAnimationA.getFraction());
                    this.f16614c.add(c1690q0A);
                }
                return this.f16612a.onProgress(L0.y(windowInsets), this.f16613b).x();
            }

            public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                return this.f16612a.onStart(a(windowInsetsAnimation), a.d(bounds)).c();
            }
        }

        d(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f16611f = windowInsetsAnimation;
        }

        public static WindowInsetsAnimation.Bounds e(a aVar) {
            A0.a();
            return AbstractC1707z0.a(aVar.a().g(), aVar.b().g());
        }

        public static x0.e f(WindowInsetsAnimation.Bounds bounds) {
            return x0.e.f(bounds.getUpperBound());
        }

        public static x0.e g(WindowInsetsAnimation.Bounds bounds) {
            return x0.e.f(bounds.getLowerBound());
        }

        public static void h(View view, b bVar) {
            view.setWindowInsetsAnimationCallback(bVar != null ? new a(bVar) : null);
        }

        @Override // androidx.core.view.C1690q0.e
        public long a() {
            return this.f16611f.getDurationMillis();
        }

        @Override // androidx.core.view.C1690q0.e
        public float b() {
            return this.f16611f.getInterpolatedFraction();
        }

        @Override // androidx.core.view.C1690q0.e
        public int c() {
            return this.f16611f.getTypeMask();
        }

        @Override // androidx.core.view.C1690q0.e
        public void d(float f10) {
            this.f16611f.setFraction(f10);
        }

        d(int i10, Interpolator interpolator, long j10) {
            this(AbstractC1705y0.a(i10, interpolator, j10));
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.q0$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final x0.e f16589a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final x0.e f16590b;

        public a(x0.e eVar, x0.e eVar2) {
            this.f16589a = eVar;
            this.f16590b = eVar2;
        }

        public static a d(WindowInsetsAnimation.Bounds bounds) {
            return new a(bounds);
        }

        public x0.e a() {
            return this.f16589a;
        }

        public x0.e b() {
            return this.f16590b;
        }

        public WindowInsetsAnimation.Bounds c() {
            return d.e(this);
        }

        public String toString() {
            return "Bounds{lower=" + this.f16589a + " upper=" + this.f16590b + "}";
        }

        private a(WindowInsetsAnimation.Bounds bounds) {
            this.f16589a = d.g(bounds);
            this.f16590b = d.f(bounds);
        }
    }

    private C1690q0(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f16588a = new d(windowInsetsAnimation);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.q0$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class b {
        public static final int DISPATCH_MODE_CONTINUE_ON_SUBTREE = 1;
        public static final int DISPATCH_MODE_STOP = 0;
        L0 mDispachedInsets;
        private final int mDispatchMode;

        public b(int i10) {
            this.mDispatchMode = i10;
        }

        public final int getDispatchMode() {
            return this.mDispatchMode;
        }

        public abstract L0 onProgress(L0 l02, List list);

        public void onEnd(C1690q0 c1690q0) {
        }

        public void onPrepare(C1690q0 c1690q0) {
        }

        public a onStart(C1690q0 c1690q0, a aVar) {
            return aVar;
        }
    }
}
