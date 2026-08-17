package F0;

import F0.g;
import android.R;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.ImageView;
import android.window.SplashScreen;
import android.window.SplashScreenView;
import com.facebook.react.uimanager.ViewDefaults;
import g.AbstractC2619a;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f1767b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f1768a;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g a(Activity activity) {
            AbstractC2855l.g(activity, "<this>");
            g gVar = new g(activity, null);
            gVar.b();
            return gVar;
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Activity f1769a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f1770b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f1771c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f1772d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Drawable f1773e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f1774f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private d f1775g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private e f1776h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private s f1777i;

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class a implements View.OnLayoutChangeListener {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ s f1779h;

            a(s sVar) {
                this.f1779h = sVar;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                AbstractC2855l.g(view, "view");
                if (view.isAttachedToWindow()) {
                    view.removeOnLayoutChangeListener(this);
                    if (!b.this.h().a()) {
                        b.this.d(this.f1779h);
                    } else {
                        b.this.f1777i = this.f1779h;
                    }
                }
            }
        }

        public b(Activity activity) {
            AbstractC2855l.g(activity, "activity");
            this.f1769a = activity;
            this.f1775g = new d() { // from class: F0.h
                @Override // F0.g.d
                public final boolean a() {
                    return g.b.l();
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(s splashScreenViewProvider, e finalListener) {
            AbstractC2855l.g(splashScreenViewProvider, "$splashScreenViewProvider");
            AbstractC2855l.g(finalListener, "$finalListener");
            splashScreenViewProvider.a().bringToFront();
            finalListener.a(splashScreenViewProvider);
        }

        private final void f(View view, Drawable drawable) {
            float dimension;
            ImageView imageView = (ImageView) view.findViewById(F0.e.f1765a);
            if (this.f1774f) {
                Drawable drawableB = AbstractC2619a.b(imageView.getContext(), F0.d.f1764a);
                dimension = imageView.getResources().getDimension(F0.c.f1763b) * 0.6666667f;
                if (drawableB != null) {
                    imageView.setBackground(new F0.a(drawableB, dimension));
                }
            } else {
                dimension = imageView.getResources().getDimension(F0.c.f1762a) * 0.6666667f;
            }
            imageView.setImageDrawable(new F0.a(drawable, dimension));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean l() {
            return false;
        }

        public final void d(final s splashScreenViewProvider) {
            AbstractC2855l.g(splashScreenViewProvider, "splashScreenViewProvider");
            final e eVar = this.f1776h;
            if (eVar == null) {
                return;
            }
            this.f1776h = null;
            splashScreenViewProvider.a().postOnAnimation(new Runnable() { // from class: F0.i
                @Override // java.lang.Runnable
                public final void run() {
                    g.b.e(splashScreenViewProvider, eVar);
                }
            });
        }

        public final Activity g() {
            return this.f1769a;
        }

        public final d h() {
            return this.f1775g;
        }

        public void i() {
            TypedValue typedValue = new TypedValue();
            Resources.Theme currentTheme = this.f1769a.getTheme();
            if (currentTheme.resolveAttribute(F0.b.f1761d, typedValue, true)) {
                this.f1771c = Integer.valueOf(typedValue.resourceId);
                this.f1772d = Integer.valueOf(typedValue.data);
            }
            if (currentTheme.resolveAttribute(F0.b.f1760c, typedValue, true)) {
                this.f1773e = AbstractC2619a.b(this.f1769a, typedValue.resourceId);
            }
            if (currentTheme.resolveAttribute(F0.b.f1759b, typedValue, true)) {
                this.f1774f = typedValue.resourceId == F0.c.f1763b;
            }
            AbstractC2855l.f(currentTheme, "currentTheme");
            k(currentTheme, typedValue);
        }

        public void j(e exitAnimationListener) {
            AbstractC2855l.g(exitAnimationListener, "exitAnimationListener");
            this.f1776h = exitAnimationListener;
            s sVar = new s(this.f1769a);
            Integer num = this.f1771c;
            Integer num2 = this.f1772d;
            View viewA = sVar.a();
            if (num != null && num.intValue() != 0) {
                viewA.setBackgroundResource(num.intValue());
            } else if (num2 != null) {
                viewA.setBackgroundColor(num2.intValue());
            } else {
                viewA.setBackground(this.f1769a.getWindow().getDecorView().getBackground());
            }
            Drawable drawable = this.f1773e;
            if (drawable != null) {
                f(viewA, drawable);
            }
            viewA.addOnLayoutChangeListener(new a(sVar));
        }

        protected final void k(Resources.Theme currentTheme, TypedValue typedValue) {
            AbstractC2855l.g(currentTheme, "currentTheme");
            AbstractC2855l.g(typedValue, "typedValue");
            if (currentTheme.resolveAttribute(F0.b.f1758a, typedValue, true)) {
                int i10 = typedValue.resourceId;
                this.f1770b = i10;
                if (i10 != 0) {
                    this.f1769a.setTheme(i10);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface d {
        boolean a();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface e {
        void a(s sVar);
    }

    public /* synthetic */ g(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        this.f1768a.i();
    }

    public final void c(e listener) {
        AbstractC2855l.g(listener, "listener");
        this.f1768a.j(listener);
    }

    private g(Activity activity) {
        this.f1768a = Build.VERSION.SDK_INT >= 31 ? new c(activity) : new b(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class c extends b {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f1780j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final ViewGroup.OnHierarchyChangeListener f1781k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Activity activity) {
            super(activity);
            AbstractC2855l.g(activity, "activity");
            this.f1780j = true;
            this.f1781k = new a(activity);
        }

        private final void n() {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = g().getTheme();
            Window window = g().getWindow();
            if (theme.resolveAttribute(R.attr.statusBarColor, typedValue, true)) {
                window.setStatusBarColor(typedValue.data);
            }
            if (theme.resolveAttribute(R.attr.navigationBarColor, typedValue, true)) {
                window.setNavigationBarColor(typedValue.data);
            }
            if (theme.resolveAttribute(R.attr.windowDrawsSystemBarBackgrounds, typedValue, true)) {
                if (typedValue.data != 0) {
                    window.addFlags(androidx.customview.widget.a.INVALID_ID);
                } else {
                    window.clearFlags(androidx.customview.widget.a.INVALID_ID);
                }
            }
            View decorView = window.getDecorView();
            AbstractC2855l.e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) decorView;
            AbstractC2855l.f(theme, "theme");
            w.a(theme, viewGroup, typedValue);
            viewGroup.setOnHierarchyChangeListener(null);
            window.setDecorFitsSystemWindows(this.f1780j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void q(c this$0, e exitAnimationListener, SplashScreenView splashScreenView) {
            AbstractC2855l.g(this$0, "this$0");
            AbstractC2855l.g(exitAnimationListener, "$exitAnimationListener");
            AbstractC2855l.g(splashScreenView, "splashScreenView");
            if (Build.VERSION.SDK_INT < 33) {
                this$0.n();
            }
            exitAnimationListener.a(new s(splashScreenView, this$0.g()));
        }

        @Override // F0.g.b
        public void i() {
            Resources.Theme theme = g().getTheme();
            AbstractC2855l.f(theme, "activity.theme");
            k(theme, new TypedValue());
            if (Build.VERSION.SDK_INT < 33) {
                View decorView = g().getWindow().getDecorView();
                AbstractC2855l.e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) decorView).setOnHierarchyChangeListener(this.f1781k);
            }
        }

        @Override // F0.g.b
        public void j(final e exitAnimationListener) {
            AbstractC2855l.g(exitAnimationListener, "exitAnimationListener");
            g().getSplashScreen().setOnExitAnimationListener(new SplashScreen.OnExitAnimationListener() { // from class: F0.p
                @Override // android.window.SplashScreen.OnExitAnimationListener
                public final void onSplashScreenExit(SplashScreenView splashScreenView) {
                    g.c.q(this.f1786a, exitAnimationListener, splashScreenView);
                }
            });
        }

        public final boolean o(SplashScreenView child) {
            AbstractC2855l.g(child, "child");
            WindowInsets windowInsetsBuild = n.a().build();
            AbstractC2855l.f(windowInsetsBuild, "Builder().build()");
            Rect rect = new Rect(androidx.customview.widget.a.INVALID_ID, androidx.customview.widget.a.INVALID_ID, ViewDefaults.NUMBER_OF_LINES, ViewDefaults.NUMBER_OF_LINES);
            return (windowInsetsBuild == child.getRootView().computeSystemWindowInsets(windowInsetsBuild, rect) && rect.isEmpty()) ? false : true;
        }

        public final void p(boolean z10) {
            this.f1780j = z10;
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class a implements ViewGroup.OnHierarchyChangeListener {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ Activity f1783h;

            a(Activity activity) {
                this.f1783h = activity;
            }

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewAdded(View view, View view2) {
                if (q.a(view2)) {
                    c cVar = c.this;
                    cVar.p(cVar.o(r.a(view2)));
                    View decorView = this.f1783h.getWindow().getDecorView();
                    AbstractC2855l.e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
                    ((ViewGroup) decorView).setOnHierarchyChangeListener(null);
                }
            }

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewRemoved(View view, View view2) {
            }
        }
    }
}
