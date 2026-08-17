package com.swmansion.rnscreens.gamma.tabs;

import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.Choreographer;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.core.view.AbstractC1670g0;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.I;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.uimanager.ThemedReactContext;
import com.google.android.material.navigation.NavigationBarView;
import com.swmansion.rnscreens.S;
import com.swmansion.rnscreens.gamma.tabs.l;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class l extends FrameLayout implements com.swmansion.rnscreens.gamma.tabs.b, com.swmansion.rnscreens.safearea.c, View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final kotlin.properties.d f25212A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final kotlin.properties.d f25213B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final kotlin.properties.d f25214C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final kotlin.properties.d f25215D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final kotlin.properties.d f25216E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final kotlin.properties.d f25217F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final kotlin.properties.d f25218G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final kotlin.properties.d f25219H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final kotlin.properties.d f25220I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final kotlin.properties.d f25221J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final Choreographer.FrameCallback f25222K;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ThemedReactContext f25223g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final b f25224h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final c f25225i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final androidx.appcompat.view.d f25226j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.google.android.material.bottomnavigation.c f25227k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final FrameLayout f25228l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public com.swmansion.rnscreens.gamma.tabs.s f25229m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private FragmentManager f25230n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final List f25231o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Integer f25232p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f25233q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private com.swmansion.rnscreens.safearea.d f25234r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final com.swmansion.rnscreens.gamma.tabs.q f25235s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final com.swmansion.rnscreens.gamma.tabs.o f25236t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final kotlin.properties.d f25237u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final kotlin.properties.d f25238v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final kotlin.properties.d f25239w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final kotlin.properties.d f25240x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final kotlin.properties.d f25241y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final kotlin.properties.d f25242z;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    static final /* synthetic */ C7.k[] f25211M = {D.e(new kotlin.jvm.internal.p(l.class, "tabBarBackgroundColor", "getTabBarBackgroundColor()Ljava/lang/Integer;", 0)), D.e(new kotlin.jvm.internal.p(l.class, "tabBarItemActiveIndicatorColor", "getTabBarItemActiveIndicatorColor()Ljava/lang/Integer;", 0)), D.e(new kotlin.jvm.internal.p(l.class, "isTabBarItemActiveIndicatorEnabled", "isTabBarItemActiveIndicatorEnabled()Z", 0)), D.e(new kotlin.jvm.internal.p(l.class, "tabBarItemIconColor", "getTabBarItemIconColor()Ljava/lang/Integer;", 0)), D.e(new kotlin.jvm.internal.p(l.class, "tabBarItemTitleFontFamily", "getTabBarItemTitleFontFamily()Ljava/lang/String;", 0)), D.e(new kotlin.jvm.internal.p(l.class, "tabBarItemIconColorActive", "getTabBarItemIconColorActive()Ljava/lang/Integer;", 0)), D.e(new kotlin.jvm.internal.p(l.class, "tabBarItemTitleFontColor", "getTabBarItemTitleFontColor()Ljava/lang/Integer;", 0)), D.e(new kotlin.jvm.internal.p(l.class, "tabBarItemTitleFontColorActive", "getTabBarItemTitleFontColorActive()Ljava/lang/Integer;", 0)), D.e(new kotlin.jvm.internal.p(l.class, "tabBarItemTitleFontSize", "getTabBarItemTitleFontSize()Ljava/lang/Float;", 0)), D.e(new kotlin.jvm.internal.p(l.class, "tabBarItemTitleFontSizeActive", "getTabBarItemTitleFontSizeActive()Ljava/lang/Float;", 0)), D.e(new kotlin.jvm.internal.p(l.class, "tabBarItemTitleFontWeight", "getTabBarItemTitleFontWeight()Ljava/lang/String;", 0)), D.e(new kotlin.jvm.internal.p(l.class, "tabBarItemTitleFontStyle", "getTabBarItemTitleFontStyle()Ljava/lang/String;", 0)), D.e(new kotlin.jvm.internal.p(l.class, "tabBarItemRippleColor", "getTabBarItemRippleColor()Ljava/lang/Integer;", 0)), D.e(new kotlin.jvm.internal.p(l.class, "tabBarItemLabelVisibilityMode", "getTabBarItemLabelVisibilityMode()Ljava/lang/String;", 0)), D.e(new kotlin.jvm.internal.p(l.class, "tabBarHidden", "getTabBarHidden()Z", 0)), D.e(new kotlin.jvm.internal.p(l.class, "nativeContainerBackgroundColor", "getNativeContainerBackgroundColor()Ljava/lang/Integer;", 0))};

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final a f25210L = new a(null);

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f25243a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f25244b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f25245c;

        public b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(b bVar) {
            bVar.i();
        }

        private final void i() {
            if (this.f25243a) {
                h();
            }
        }

        public final void b() {
            d();
            c();
        }

        public final void c() {
            this.f25245c = true;
        }

        public final void d() {
            this.f25244b = true;
        }

        public final void e() {
            this.f25243a = true;
            l.this.post(new Runnable() { // from class: com.swmansion.rnscreens.gamma.tabs.m
                @Override // java.lang.Runnable
                public final void run() {
                    l.b.f(this.f25264g);
                }
            });
        }

        public final void g() {
            if (this.f25243a) {
                return;
            }
            e();
        }

        public final void h() {
            this.f25243a = false;
            if (this.f25244b) {
                this.f25244b = false;
                l.this.N();
            }
            if (this.f25245c) {
                this.f25245c = false;
                l.this.I();
                l.this.f25236t.a();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private final class c {
        public c() {
        }

        public final boolean a() {
            ScrollView scrollViewB;
            S sA;
            FrameLayout frameLayout = l.this.f25228l;
            com.swmansion.rnscreens.gamma.tabs.e currentFocusedTab = l.this.getCurrentFocusedTab();
            if (currentFocusedTab.w().getShouldUseRepeatedTabSelectionPopToRootSpecialEffect() && (sA = Q6.f.f9856a.a(frameLayout)) != null && sA.d0()) {
                return true;
            }
            if (!currentFocusedTab.w().getShouldUseRepeatedTabSelectionScrollToTopSpecialEffect() || (scrollViewB = Q6.f.f9856a.b(frameLayout)) == null || scrollViewB.getScrollY() <= 0) {
                return false;
            }
            scrollViewB.smoothScrollTo(scrollViewB.getScrollX(), 0);
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class d extends kotlin.properties.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f25248a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Object obj, l lVar) {
            super(obj);
            this.f25248a = lVar;
        }

        @Override // kotlin.properties.b
        protected void afterChange(C7.k property, Object obj, Object obj2) {
            AbstractC2855l.g(property, "property");
            l lVar = this.f25248a;
            lVar.M((Float) obj, (Float) obj2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class e extends kotlin.properties.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f25249a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Object obj, l lVar) {
            super(obj);
            this.f25249a = lVar;
        }

        @Override // kotlin.properties.b
        protected void afterChange(C7.k property, Object obj, Object obj2) {
            AbstractC2855l.g(property, "property");
            l lVar = this.f25249a;
            lVar.M((String) obj, (String) obj2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class f extends kotlin.properties.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f25250a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Object obj, l lVar) {
            super(obj);
            this.f25250a = lVar;
        }

        @Override // kotlin.properties.b
        protected void afterChange(C7.k property, Object obj, Object obj2) {
            AbstractC2855l.g(property, "property");
            l lVar = this.f25250a;
            lVar.M((String) obj, (String) obj2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class g extends kotlin.properties.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f25251a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Object obj, l lVar) {
            super(obj);
            this.f25251a = lVar;
        }

        @Override // kotlin.properties.b
        protected void afterChange(C7.k property, Object obj, Object obj2) {
            AbstractC2855l.g(property, "property");
            l lVar = this.f25251a;
            lVar.M((Integer) obj, (Integer) obj2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class h extends kotlin.properties.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f25252a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Object obj, l lVar) {
            super(obj);
            this.f25252a = lVar;
        }

        @Override // kotlin.properties.b
        protected void afterChange(C7.k property, Object obj, Object obj2) {
            AbstractC2855l.g(property, "property");
            l lVar = this.f25252a;
            lVar.M((String) obj, (String) obj2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class i extends kotlin.properties.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f25253a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Object obj, l lVar) {
            super(obj);
            this.f25253a = lVar;
        }

        @Override // kotlin.properties.b
        protected void afterChange(C7.k property, Object obj, Object obj2) {
            AbstractC2855l.g(property, "property");
            Boolean bool = (Boolean) obj2;
            Boolean bool2 = (Boolean) obj;
            if (bool.booleanValue() != bool2.booleanValue()) {
                l.L(this.f25253a, null, 1, null);
                this.f25253a.M(bool2, bool);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class j extends kotlin.properties.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f25254a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Object obj, l lVar) {
            super(obj);
            this.f25254a = lVar;
        }

        @Override // kotlin.properties.b
        protected void afterChange(C7.k property, Object obj, Object obj2) {
            AbstractC2855l.g(property, "property");
            Integer num = (Integer) obj2;
            if (AbstractC2855l.b(num, (Integer) obj)) {
                return;
            }
            this.f25254a.setBackground(num != null ? new ColorDrawable(num.intValue()) : null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class k extends kotlin.properties.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f25255a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Object obj, l lVar) {
            super(obj);
            this.f25255a = lVar;
        }

        @Override // kotlin.properties.b
        protected void afterChange(C7.k property, Object obj, Object obj2) {
            AbstractC2855l.g(property, "property");
            l lVar = this.f25255a;
            lVar.M((Integer) obj, (Integer) obj2);
        }
    }

    /* JADX INFO: renamed from: com.swmansion.rnscreens.gamma.tabs.l$l, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class C0241l extends kotlin.properties.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f25256a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0241l(Object obj, l lVar) {
            super(obj);
            this.f25256a = lVar;
        }

        @Override // kotlin.properties.b
        protected void afterChange(C7.k property, Object obj, Object obj2) {
            AbstractC2855l.g(property, "property");
            l lVar = this.f25256a;
            lVar.M((Integer) obj, (Integer) obj2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class m extends kotlin.properties.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f25257a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Object obj, l lVar) {
            super(obj);
            this.f25257a = lVar;
        }

        @Override // kotlin.properties.b
        protected void afterChange(C7.k property, Object obj, Object obj2) {
            AbstractC2855l.g(property, "property");
            Boolean bool = (Boolean) obj2;
            bool.booleanValue();
            Boolean bool2 = (Boolean) obj;
            bool2.booleanValue();
            this.f25257a.M(bool2, bool);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class n extends kotlin.properties.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f25258a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Object obj, l lVar) {
            super(obj);
            this.f25258a = lVar;
        }

        @Override // kotlin.properties.b
        protected void afterChange(C7.k property, Object obj, Object obj2) {
            AbstractC2855l.g(property, "property");
            l lVar = this.f25258a;
            lVar.M((Integer) obj, (Integer) obj2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class o extends kotlin.properties.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f25259a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Object obj, l lVar) {
            super(obj);
            this.f25259a = lVar;
        }

        @Override // kotlin.properties.b
        protected void afterChange(C7.k property, Object obj, Object obj2) {
            AbstractC2855l.g(property, "property");
            l lVar = this.f25259a;
            lVar.M((String) obj, (String) obj2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class p extends kotlin.properties.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f25260a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(Object obj, l lVar) {
            super(obj);
            this.f25260a = lVar;
        }

        @Override // kotlin.properties.b
        protected void afterChange(C7.k property, Object obj, Object obj2) {
            AbstractC2855l.g(property, "property");
            l lVar = this.f25260a;
            lVar.M((Integer) obj, (Integer) obj2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class q extends kotlin.properties.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f25261a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(Object obj, l lVar) {
            super(obj);
            this.f25261a = lVar;
        }

        @Override // kotlin.properties.b
        protected void afterChange(C7.k property, Object obj, Object obj2) {
            AbstractC2855l.g(property, "property");
            l lVar = this.f25261a;
            lVar.M((Integer) obj, (Integer) obj2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class r extends kotlin.properties.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f25262a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(Object obj, l lVar) {
            super(obj);
            this.f25262a = lVar;
        }

        @Override // kotlin.properties.b
        protected void afterChange(C7.k property, Object obj, Object obj2) {
            AbstractC2855l.g(property, "property");
            l lVar = this.f25262a;
            lVar.M((Integer) obj, (Integer) obj2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class s extends kotlin.properties.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f25263a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(Object obj, l lVar) {
            super(obj);
            this.f25263a = lVar;
        }

        @Override // kotlin.properties.b
        protected void afterChange(C7.k property, Object obj, Object obj2) {
            AbstractC2855l.g(property, "property");
            l lVar = this.f25263a;
            lVar.M((Float) obj, (Float) obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ThemedReactContext reactContext) {
        super(reactContext);
        AbstractC2855l.g(reactContext, "reactContext");
        this.f25223g = reactContext;
        this.f25224h = new b();
        this.f25225i = new c();
        androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(reactContext, Q4.j.f9407f);
        this.f25226j = dVar;
        com.google.android.material.bottomnavigation.c cVar = new com.google.android.material.bottomnavigation.c(dVar);
        cVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 80));
        this.f25227k = cVar;
        FrameLayout frameLayout = new FrameLayout(reactContext);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setId(Q6.g.f9857a.a());
        this.f25228l = frameLayout;
        ArrayList arrayList = new ArrayList();
        this.f25231o = arrayList;
        this.f25235s = new com.swmansion.rnscreens.gamma.tabs.q(dVar, cVar, arrayList);
        this.f25236t = new com.swmansion.rnscreens.gamma.tabs.o(cVar, arrayList);
        kotlin.properties.a aVar = kotlin.properties.a.f29400a;
        this.f25237u = new k(null, this);
        this.f25238v = new C0241l(null, this);
        this.f25239w = new m(Boolean.TRUE, this);
        this.f25240x = new n(null, this);
        this.f25241y = new o(null, this);
        this.f25242z = new p(null, this);
        this.f25212A = new q(null, this);
        this.f25213B = new r(null, this);
        this.f25214C = new s(null, this);
        this.f25215D = new d(null, this);
        this.f25216E = new e(null, this);
        this.f25217F = new f(null, this);
        this.f25218G = new g(null, this);
        this.f25219H = new h(null, this);
        this.f25220I = new i(Boolean.FALSE, this);
        this.f25221J = new j(null, this);
        addView(frameLayout);
        addView(cVar);
        cVar.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.swmansion.rnscreens.gamma.tabs.f
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                l.l(view, i10, i11, i12, i13, i14, i15, i16, i17);
            }
        });
        cVar.setOnItemSelectedListener(new NavigationBarView.c() { // from class: com.swmansion.rnscreens.gamma.tabs.g
            @Override // com.google.android.material.navigation.NavigationBarView.c
            public final boolean a(MenuItem menuItem) {
                return l.m(this.f25205a, menuItem);
            }
        });
        this.f25222K = new Choreographer.FrameCallback() { // from class: com.swmansion.rnscreens.gamma.tabs.h
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j10) {
                l.z(this.f25206a, j10);
            }
        };
    }

    private final void C() {
        if (this.f25233q || this.f25222K == null) {
            return;
        }
        this.f25233q = true;
        ReactChoreographer.INSTANCE.getInstance().postFrameCallback(ReactChoreographer.CallbackType.NATIVE_ANIMATED_MODULE, this.f25222K);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean E(com.swmansion.rnscreens.gamma.tabs.a aVar, com.swmansion.rnscreens.gamma.tabs.e it) {
        AbstractC2855l.g(it, "it");
        return it.w() == aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean F(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I() {
        Y6.e.f12948a.a("TabsHost", "updateBottomNavigationViewAppearance");
        this.f25235s.c(this);
        Integer selectedTabScreenFragmentId = getSelectedTabScreenFragmentId();
        if (selectedTabScreenFragmentId == null) {
            throw new IllegalStateException("[RNScreens] A single selected tab must be present");
        }
        int iIntValue = selectedTabScreenFragmentId.intValue();
        if (this.f25227k.getSelectedItemId() != iIntValue) {
            this.f25227k.setSelectedItemId(iIntValue);
        }
        post(new Runnable() { // from class: com.swmansion.rnscreens.gamma.tabs.k
            @Override // java.lang.Runnable
            public final void run() {
                l.J(this.f25209g);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(l lVar) {
        lVar.C();
        Y6.e.f12948a.a("TabsHost", "BottomNavigationView request layout");
    }

    private final void K(Integer num) {
        int iIntValue = getTabBarHidden() ? 0 : num != null ? num.intValue() : this.f25227k.getHeight();
        com.swmansion.rnscreens.safearea.d dVar = this.f25234r;
        if (dVar != null) {
            dVar.e(new com.swmansion.rnscreens.safearea.a(0.0f, 0.0f, 0.0f, iIntValue));
        }
    }

    static /* synthetic */ void L(l lVar, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        lVar.K(num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(Object obj, Object obj2) {
        if (AbstractC2855l.b(obj2, obj)) {
            return;
        }
        b bVar = this.f25224h;
        bVar.c();
        bVar.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N() {
        com.swmansion.rnscreens.gamma.tabs.e currentFocusedTab = getCurrentFocusedTab();
        List listV0 = getRequireFragmentManager().v0();
        AbstractC2855l.f(listV0, "getFragments(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : listV0) {
            if (obj instanceof com.swmansion.rnscreens.gamma.tabs.e) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() > 1) {
            throw new IllegalStateException("[RNScreens] There can be only a single focused tab");
        }
        com.swmansion.rnscreens.gamma.tabs.e eVar = (com.swmansion.rnscreens.gamma.tabs.e) AbstractC2800q.g0(arrayList);
        if (currentFocusedTab == eVar) {
            return;
        }
        I iU = getRequireFragmentManager().o().u(true);
        if (eVar != null) {
            iU.n(eVar);
        }
        iU.b(this.f25228l.getId(), currentFocusedTab);
        iU.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.swmansion.rnscreens.gamma.tabs.e getCurrentFocusedTab() {
        Object next;
        Iterator it = this.f25231o.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((com.swmansion.rnscreens.gamma.tabs.e) next).w().b()) {
                break;
            }
        }
        if (next != null) {
            return (com.swmansion.rnscreens.gamma.tabs.e) next;
        }
        throw new IllegalStateException("[RNScreens] No focused tab present");
    }

    private final FragmentManager getRequireFragmentManager() {
        FragmentManager fragmentManager = this.f25230n;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException("[RNScreens] Nullish fragment manager");
    }

    private final Integer getSelectedTabScreenFragmentId() {
        if (this.f25231o.isEmpty()) {
            return null;
        }
        Iterator it = this.f25231o.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (((com.swmansion.rnscreens.gamma.tabs.e) it.next()).w().b()) {
                break;
            }
            i10++;
        }
        return Integer.valueOf(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        Y6.e.f12948a.a("TabsHost", "BottomNavigationView layout changed {" + i10 + ", " + i11 + "} {" + (i12 - i10) + ", " + (i13 - i11) + "}");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(l lVar, MenuItem item) {
        String tabKey;
        com.swmansion.rnscreens.gamma.tabs.a aVarW;
        AbstractC2855l.g(item, "item");
        Y6.e.f12948a.a("TabsHost", "Item selected " + item);
        com.swmansion.rnscreens.gamma.tabs.e eVarV = lVar.v(item.getItemId());
        boolean zA = AbstractC2855l.b(eVarV, lVar.getCurrentFocusedTab()) ? lVar.f25225i.a() : false;
        if (eVarV == null || (aVarW = eVarV.w()) == null || (tabKey = aVarW.getTabKey()) == null) {
            tabKey = "undefined";
        }
        lVar.getEventEmitter$react_native_screens_release().h(tabKey, item.getItemId(), zA);
        return true;
    }

    private final void t(int i10) {
        Integer num = this.f25232p;
        if (num != null && i10 == num.intValue()) {
            return;
        }
        if (i10 == 16) {
            this.f25226j.setTheme(Q4.j.f9411j);
        } else if (i10 != 32) {
            this.f25226j.setTheme(Q4.j.f9407f);
        } else {
            this.f25226j.setTheme(Q4.j.f9406e);
        }
        this.f25235s.c(this);
        this.f25232p = Integer.valueOf(i10);
    }

    private final void u() {
        measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
        layout(getLeft(), getTop(), getRight(), getBottom());
    }

    private final com.swmansion.rnscreens.gamma.tabs.e v(int i10) {
        return (com.swmansion.rnscreens.gamma.tabs.e) AbstractC2800q.h0(this.f25231o, i10);
    }

    private final MenuItem x(com.swmansion.rnscreens.gamma.tabs.a aVar) {
        Iterator it = this.f25231o.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (((com.swmansion.rnscreens.gamma.tabs.e) it.next()).w() == aVar) {
                break;
            }
            i10++;
        }
        Integer numValueOf = Integer.valueOf(i10);
        if (numValueOf.intValue() == -1) {
            numValueOf = null;
        }
        if (numValueOf == null) {
            return null;
        }
        return this.f25227k.getMenu().findItem(numValueOf.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(l lVar, long j10) {
        lVar.f25233q = false;
        lVar.u();
    }

    public final void A(com.swmansion.rnscreens.gamma.tabs.a tabScreen, int i10) {
        AbstractC2855l.g(tabScreen, "tabScreen");
        if (i10 < this.f25227k.getMaxItemCount()) {
            this.f25231o.add(i10, new com.swmansion.rnscreens.gamma.tabs.e(tabScreen));
            tabScreen.setTabScreenDelegate$react_native_screens_release(this);
            b bVar = this.f25224h;
            bVar.b();
            bVar.g();
            return;
        }
        throw new IllegalArgumentException(("[RNScreens] Attempt to insert TabScreen at index " + i10 + "; BottomNavigationView supports at most " + this.f25227k.getMaxItemCount() + " items").toString());
    }

    public final void B() {
        if (getId() == -1) {
            throw new IllegalStateException("[RNScreens] TabsHost must have its tag set when registering event emitters");
        }
        setEventEmitter$react_native_screens_release(new com.swmansion.rnscreens.gamma.tabs.s(this.f25223g, getId()));
    }

    public final void D() {
        Iterator it = this.f25231o.iterator();
        while (it.hasNext()) {
            ((com.swmansion.rnscreens.gamma.tabs.e) it.next()).w().setTabScreenDelegate$react_native_screens_release(null);
        }
        this.f25231o.clear();
        b bVar = this.f25224h;
        bVar.b();
        bVar.g();
    }

    public final void G(final com.swmansion.rnscreens.gamma.tabs.a reactSubview) {
        AbstractC2855l.g(reactSubview, "reactSubview");
        List list = this.f25231o;
        final Function1 function1 = new Function1() { // from class: com.swmansion.rnscreens.gamma.tabs.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(l.E(reactSubview, (e) obj));
            }
        };
        boolean zRemoveIf = list.removeIf(new Predicate() { // from class: com.swmansion.rnscreens.gamma.tabs.j
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return l.F(function1, obj);
            }
        });
        Boolean boolValueOf = Boolean.valueOf(zRemoveIf);
        if (!zRemoveIf) {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            reactSubview.setTabScreenDelegate$react_native_screens_release(null);
            b bVar = this.f25224h;
            bVar.b();
            bVar.g();
        }
    }

    public final void H(int i10) {
        ((com.swmansion.rnscreens.gamma.tabs.e) this.f25231o.remove(i10)).w().setTabScreenDelegate$react_native_screens_release(null);
        b bVar = this.f25224h;
        bVar.b();
        bVar.g();
    }

    @Override // com.swmansion.rnscreens.gamma.tabs.b
    public void a(com.swmansion.rnscreens.gamma.tabs.a tabScreen) {
        AbstractC2855l.g(tabScreen, "tabScreen");
        MenuItem menuItemX = x(tabScreen);
        if (menuItemX != null) {
            this.f25235s.a(menuItemX, tabScreen);
            this.f25236t.b(menuItemX, tabScreen);
        }
    }

    @Override // com.swmansion.rnscreens.gamma.tabs.b
    public void b(com.swmansion.rnscreens.gamma.tabs.a tabScreen, boolean z10) {
        AbstractC2855l.g(tabScreen, "tabScreen");
        b bVar = this.f25224h;
        bVar.b();
        bVar.g();
    }

    @Override // com.swmansion.rnscreens.safearea.c
    public void c(com.swmansion.rnscreens.safearea.d listener) {
        AbstractC2855l.g(listener, "listener");
        if (AbstractC2855l.b(this.f25234r, listener)) {
            this.f25234r = null;
            this.f25227k.removeOnLayoutChangeListener(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        if (Build.VERSION.SDK_INT >= 30) {
            return super.dispatchApplyWindowInsets(windowInsets);
        }
        if (!(windowInsets != null ? windowInsets.isConsumed() : true)) {
            Iterator it = AbstractC1670g0.a(this).iterator();
            while (it.hasNext()) {
                ((View) it.next()).dispatchApplyWindowInsets(windowInsets);
            }
        }
        return windowInsets;
    }

    @Override // com.swmansion.rnscreens.gamma.tabs.b
    public void e(com.swmansion.rnscreens.gamma.tabs.a tabScreen, Configuration config) {
        AbstractC2855l.g(tabScreen, "tabScreen");
        AbstractC2855l.g(config, "config");
        onConfigurationChanged(config);
    }

    public final com.swmansion.rnscreens.gamma.tabs.s getEventEmitter$react_native_screens_release() {
        com.swmansion.rnscreens.gamma.tabs.s sVar = this.f25229m;
        if (sVar != null) {
            return sVar;
        }
        AbstractC2855l.y("eventEmitter");
        return null;
    }

    @Override // com.swmansion.rnscreens.safearea.c
    public com.swmansion.rnscreens.safearea.a getInterfaceInsets() {
        return new com.swmansion.rnscreens.safearea.a(0.0f, 0.0f, 0.0f, this.f25227k.getHeight());
    }

    public final Integer getNativeContainerBackgroundColor() {
        return (Integer) this.f25221J.getValue(this, f25211M[15]);
    }

    public final ThemedReactContext getReactContext() {
        return this.f25223g;
    }

    public final Integer getTabBarBackgroundColor() {
        return (Integer) this.f25237u.getValue(this, f25211M[0]);
    }

    public final boolean getTabBarHidden() {
        return ((Boolean) this.f25220I.getValue(this, f25211M[14])).booleanValue();
    }

    public final Integer getTabBarItemActiveIndicatorColor() {
        return (Integer) this.f25238v.getValue(this, f25211M[1]);
    }

    public final Integer getTabBarItemIconColor() {
        return (Integer) this.f25240x.getValue(this, f25211M[3]);
    }

    public final Integer getTabBarItemIconColorActive() {
        return (Integer) this.f25242z.getValue(this, f25211M[5]);
    }

    public final String getTabBarItemLabelVisibilityMode() {
        return (String) this.f25219H.getValue(this, f25211M[13]);
    }

    public final Integer getTabBarItemRippleColor() {
        return (Integer) this.f25218G.getValue(this, f25211M[12]);
    }

    public final Integer getTabBarItemTitleFontColor() {
        return (Integer) this.f25212A.getValue(this, f25211M[6]);
    }

    public final Integer getTabBarItemTitleFontColorActive() {
        return (Integer) this.f25213B.getValue(this, f25211M[7]);
    }

    public final String getTabBarItemTitleFontFamily() {
        return (String) this.f25241y.getValue(this, f25211M[4]);
    }

    public final Float getTabBarItemTitleFontSize() {
        return (Float) this.f25214C.getValue(this, f25211M[8]);
    }

    public final Float getTabBarItemTitleFontSizeActive() {
        return (Float) this.f25215D.getValue(this, f25211M[9]);
    }

    public final String getTabBarItemTitleFontStyle() {
        return (String) this.f25217F.getValue(this, f25211M[11]);
    }

    public final String getTabBarItemTitleFontWeight() {
        return (String) this.f25216E.getValue(this, f25211M[10]);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        Y6.e.f12948a.a("TabsHost", "TabsHost [" + getId() + "] attached to window");
        super.onAttachedToWindow();
        FragmentManager fragmentManagerA = Q6.b.f9854a.a(this);
        if (fragmentManagerA == null) {
            throw new IllegalStateException("[RNScreens] Nullish fragment manager - can't run container operations");
        }
        this.f25230n = fragmentManagerA;
        b bVar = this.f25224h;
        bVar.b();
        bVar.h();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (configuration != null) {
            t(configuration.uiMode & 48);
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        if (view instanceof com.google.android.material.bottomnavigation.c) {
            int i18 = i13 - i11;
            if (i18 != i17 - i15) {
                K(Integer.valueOf(i18));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("[RNScreens] TabsHost's onLayoutChange expects BottomNavigationView, received " + view + " instead").toString());
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        C();
    }

    public final void setEventEmitter$react_native_screens_release(com.swmansion.rnscreens.gamma.tabs.s sVar) {
        AbstractC2855l.g(sVar, "<set-?>");
        this.f25229m = sVar;
    }

    public final void setNativeContainerBackgroundColor(Integer num) {
        this.f25221J.setValue(this, f25211M[15], num);
    }

    @Override // com.swmansion.rnscreens.safearea.c
    public void setOnInterfaceInsetsChangeListener(com.swmansion.rnscreens.safearea.d listener) {
        AbstractC2855l.g(listener, "listener");
        if (this.f25234r == null) {
            this.f25227k.addOnLayoutChangeListener(this);
        }
        this.f25234r = listener;
    }

    public final void setTabBarBackgroundColor(Integer num) {
        this.f25237u.setValue(this, f25211M[0], num);
    }

    public final void setTabBarHidden(boolean z10) {
        this.f25220I.setValue(this, f25211M[14], Boolean.valueOf(z10));
    }

    public final void setTabBarItemActiveIndicatorColor(Integer num) {
        this.f25238v.setValue(this, f25211M[1], num);
    }

    public final void setTabBarItemActiveIndicatorEnabled(boolean z10) {
        this.f25239w.setValue(this, f25211M[2], Boolean.valueOf(z10));
    }

    public final void setTabBarItemIconColor(Integer num) {
        this.f25240x.setValue(this, f25211M[3], num);
    }

    public final void setTabBarItemIconColorActive(Integer num) {
        this.f25242z.setValue(this, f25211M[5], num);
    }

    public final void setTabBarItemLabelVisibilityMode(String str) {
        this.f25219H.setValue(this, f25211M[13], str);
    }

    public final void setTabBarItemRippleColor(Integer num) {
        this.f25218G.setValue(this, f25211M[12], num);
    }

    public final void setTabBarItemTitleFontColor(Integer num) {
        this.f25212A.setValue(this, f25211M[6], num);
    }

    public final void setTabBarItemTitleFontColorActive(Integer num) {
        this.f25213B.setValue(this, f25211M[7], num);
    }

    public final void setTabBarItemTitleFontFamily(String str) {
        this.f25241y.setValue(this, f25211M[4], str);
    }

    public final void setTabBarItemTitleFontSize(Float f10) {
        this.f25214C.setValue(this, f25211M[8], f10);
    }

    public final void setTabBarItemTitleFontSizeActive(Float f10) {
        this.f25215D.setValue(this, f25211M[9], f10);
    }

    public final void setTabBarItemTitleFontStyle(String str) {
        this.f25217F.setValue(this, f25211M[11], str);
    }

    public final void setTabBarItemTitleFontWeight(String str) {
        this.f25216E.setValue(this, f25211M[10], str);
    }

    @Override // com.swmansion.rnscreens.gamma.tabs.b
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public com.swmansion.rnscreens.gamma.tabs.e d(com.swmansion.rnscreens.gamma.tabs.a tabScreen) {
        Object next;
        AbstractC2855l.g(tabScreen, "tabScreen");
        Iterator it = this.f25231o.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((com.swmansion.rnscreens.gamma.tabs.e) next).w() == tabScreen) {
                break;
            }
        }
        return (com.swmansion.rnscreens.gamma.tabs.e) next;
    }

    public final boolean y() {
        return ((Boolean) this.f25239w.getValue(this, f25211M[2])).booleanValue();
    }
}
