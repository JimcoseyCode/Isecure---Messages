package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.AbstractC1764k;
import androidx.lifecycle.G;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class E implements r {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final b f17519o = new b(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final E f17520p = new E();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f17521g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f17522h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Handler f17525k;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f17523i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f17524j = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final C1772t f17526l = new C1772t(this);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Runnable f17527m = new Runnable() { // from class: androidx.lifecycle.D
        @Override // java.lang.Runnable
        public final void run() {
            E.i(this.f17518g);
        }
    };

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final G.a f17528n = new d();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f17529a = new a();

        private a() {
        }

        public static final void a(Activity activity, Application.ActivityLifecycleCallbacks callback) {
            AbstractC2855l.g(activity, "activity");
            AbstractC2855l.g(callback, "callback");
            activity.registerActivityLifecycleCallbacks(callback);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final r a() {
            return E.f17520p;
        }

        public final void b(Context context) {
            AbstractC2855l.g(context, "context");
            E.f17520p.h(context);
        }

        private b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class c extends AbstractC1760g {

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class a extends AbstractC1760g {
            final /* synthetic */ E this$0;

            a(E e10) {
                this.this$0 = e10;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                AbstractC2855l.g(activity, "activity");
                this.this$0.e();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                AbstractC2855l.g(activity, "activity");
                this.this$0.f();
            }
        }

        c() {
        }

        @Override // androidx.lifecycle.AbstractC1760g, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            AbstractC2855l.g(activity, "activity");
            if (Build.VERSION.SDK_INT < 29) {
                G.INSTANCE.b(activity).e(E.this.f17528n);
            }
        }

        @Override // androidx.lifecycle.AbstractC1760g, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            AbstractC2855l.g(activity, "activity");
            E.this.d();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            AbstractC2855l.g(activity, "activity");
            a.a(activity, new a(E.this));
        }

        @Override // androidx.lifecycle.AbstractC1760g, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            AbstractC2855l.g(activity, "activity");
            E.this.g();
        }
    }

    private E() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(E e10) {
        e10.j();
        e10.k();
    }

    public final void d() {
        int i10 = this.f17522h - 1;
        this.f17522h = i10;
        if (i10 == 0) {
            Handler handler = this.f17525k;
            AbstractC2855l.d(handler);
            handler.postDelayed(this.f17527m, 700L);
        }
    }

    public final void e() {
        int i10 = this.f17522h + 1;
        this.f17522h = i10;
        if (i10 == 1) {
            if (this.f17523i) {
                this.f17526l.i(AbstractC1764k.a.ON_RESUME);
                this.f17523i = false;
            } else {
                Handler handler = this.f17525k;
                AbstractC2855l.d(handler);
                handler.removeCallbacks(this.f17527m);
            }
        }
    }

    public final void f() {
        int i10 = this.f17521g + 1;
        this.f17521g = i10;
        if (i10 == 1 && this.f17524j) {
            this.f17526l.i(AbstractC1764k.a.ON_START);
            this.f17524j = false;
        }
    }

    public final void g() {
        this.f17521g--;
        k();
    }

    @Override // androidx.lifecycle.r
    public AbstractC1764k getLifecycle() {
        return this.f17526l;
    }

    public final void h(Context context) {
        AbstractC2855l.g(context, "context");
        this.f17525k = new Handler();
        this.f17526l.i(AbstractC1764k.a.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        AbstractC2855l.e(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new c());
    }

    public final void j() {
        if (this.f17522h == 0) {
            this.f17523i = true;
            this.f17526l.i(AbstractC1764k.a.ON_PAUSE);
        }
    }

    public final void k() {
        if (this.f17521g == 0 && this.f17523i) {
            this.f17526l.i(AbstractC1764k.a.ON_STOP);
            this.f17524j = true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class d implements G.a {
        d() {
        }

        @Override // androidx.lifecycle.G.a
        public void onResume() {
            E.this.e();
        }

        @Override // androidx.lifecycle.G.a
        public void onStart() {
            E.this.f();
        }

        @Override // androidx.lifecycle.G.a
        public void a() {
        }
    }
}
