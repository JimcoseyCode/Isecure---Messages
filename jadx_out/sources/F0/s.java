package F0;

import android.R;
import android.app.Activity;
import android.content.res.Resources;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.window.SplashScreenView;
import i7.AbstractC2746i;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC2855l;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f1788a;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Activity f1789a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Lazy f1790b;

        /* JADX INFO: renamed from: F0.s$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        static final class C0039a extends kotlin.jvm.internal.n implements InterfaceC3487a {
            C0039a() {
                super(0);
            }

            @Override // w7.InterfaceC3487a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ViewGroup invoke() {
                View viewInflate = View.inflate(a.this.b(), f.f1766a, null);
                AbstractC2855l.e(viewInflate, "null cannot be cast to non-null type android.view.ViewGroup");
                return (ViewGroup) viewInflate;
            }
        }

        public a(Activity activity) {
            AbstractC2855l.g(activity, "activity");
            this.f1789a = activity;
            this.f1790b = AbstractC2746i.b(new C0039a());
        }

        private final ViewGroup d() {
            return (ViewGroup) this.f1790b.getValue();
        }

        public void a() {
            View rootView = ((ViewGroup) this.f1789a.findViewById(R.id.content)).getRootView();
            ViewGroup viewGroup = rootView instanceof ViewGroup ? (ViewGroup) rootView : null;
            if (viewGroup != null) {
                viewGroup.addView(d());
            }
        }

        public final Activity b() {
            return this.f1789a;
        }

        public ViewGroup c() {
            return d();
        }

        public void e() {
            ViewParent parent = c().getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(c());
            }
        }
    }

    public s(Activity ctx) {
        AbstractC2855l.g(ctx, "ctx");
        a bVar = Build.VERSION.SDK_INT >= 31 ? new b(ctx) : new a(ctx);
        bVar.a();
        this.f1788a = bVar;
    }

    public final View a() {
        return this.f1788a.c();
    }

    public final void b() {
        this.f1788a.e();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s(SplashScreenView platformView, Activity ctx) {
        this(ctx);
        AbstractC2855l.g(platformView, "platformView");
        AbstractC2855l.g(ctx, "ctx");
        a aVar = this.f1788a;
        AbstractC2855l.e(aVar, "null cannot be cast to non-null type androidx.core.splashscreen.SplashScreenViewProvider.ViewImpl31");
        ((b) aVar).h(platformView);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class b extends a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public SplashScreenView f1792c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Activity activity) {
            super(activity);
            AbstractC2855l.g(activity, "activity");
        }

        @Override // F0.s.a
        public void e() {
            f().remove();
            if (Build.VERSION.SDK_INT < 33) {
                Resources.Theme theme = b().getTheme();
                AbstractC2855l.f(theme, "activity.theme");
                View decorView = b().getWindow().getDecorView();
                AbstractC2855l.f(decorView, "activity.window.decorView");
                w.b(theme, decorView, null, 4, null);
            }
        }

        public final SplashScreenView f() {
            SplashScreenView splashScreenView = this.f1792c;
            if (splashScreenView != null) {
                return splashScreenView;
            }
            AbstractC2855l.y("platformView");
            return null;
        }

        @Override // F0.s.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public SplashScreenView c() {
            return f();
        }

        public final void h(SplashScreenView splashScreenView) {
            AbstractC2855l.g(splashScreenView, "<set-?>");
            this.f1792c = splashScreenView;
        }

        @Override // F0.s.a
        public void a() {
        }
    }
}
