package androidx.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.AbstractActivityC1618q;
import androidx.activity.result.IntentSenderRequest;
import androidx.core.view.C1704y;
import androidx.core.view.InterfaceC1698v;
import androidx.lifecycle.AbstractC1764k;
import androidx.lifecycle.C1772t;
import androidx.lifecycle.InterfaceC1762i;
import androidx.lifecycle.InterfaceC1768o;
import androidx.lifecycle.U;
import c.C1831a;
import c.InterfaceC1832b;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import d.AbstractC2314b;
import d.InterfaceC2313a;
import d1.AbstractC2320a;
import d1.C2321b;
import e.AbstractC2379a;
import h1.C2697f;
import h1.C2699h;
import h1.InterfaceC2700i;
import i7.AbstractC2746i;
import i7.C2735B;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l1.AbstractC2861a;
import w7.InterfaceC3487a;

/* JADX INFO: renamed from: androidx.activity.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC1618q extends androidx.core.app.h implements androidx.lifecycle.r, androidx.lifecycle.W, InterfaceC1762i, InterfaceC2700i, V, d.f, androidx.core.content.b, androidx.core.content.c, androidx.core.app.q, androidx.core.app.r, InterfaceC1698v, K {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final c Companion = new c(null);
    private androidx.lifecycle.V _viewModelStore;
    private final d.e activityResultRegistry;
    private int contentLayoutId;
    private final Lazy defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;
    private final Lazy fullyDrawnReporter$delegate;
    private final AtomicInteger nextLocalRequestCode;
    private final Lazy onBackPressedDispatcher$delegate;
    private final CopyOnWriteArrayList<H0.a> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<H0.a> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<H0.a> onNewIntentListeners;
    private final CopyOnWriteArrayList<H0.a> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<H0.a> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final e reportFullyDrawnExecutor;
    private final C2699h savedStateRegistryController;
    private final C1831a contextAwareHelper = new C1831a();
    private final C1704y menuHostHelper = new C1704y(new Runnable() { // from class: androidx.activity.e
        @Override // java.lang.Runnable
        public final void run() {
            AbstractActivityC1618q.y(this.f13828g);
        }
    });

    /* JADX INFO: renamed from: androidx.activity.q$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements InterfaceC1768o {
        a() {
        }

        @Override // androidx.lifecycle.InterfaceC1768o
        public void k(androidx.lifecycle.r source, AbstractC1764k.a event) {
            AbstractC2855l.g(source, "source");
            AbstractC2855l.g(event, "event");
            AbstractActivityC1618q.this.v();
            AbstractActivityC1618q.this.getLifecycle().d(this);
        }
    }

    /* JADX INFO: renamed from: androidx.activity.q$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f13843a = new b();

        private b() {
        }

        public final OnBackInvokedDispatcher a(Activity activity) {
            AbstractC2855l.g(activity, "activity");
            OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            AbstractC2855l.f(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
            return onBackInvokedDispatcher;
        }
    }

    /* JADX INFO: renamed from: androidx.activity.q$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    /* JADX INFO: renamed from: androidx.activity.q$d */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Object f13844a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private androidx.lifecycle.V f13845b;

        public final Object a() {
            return this.f13844a;
        }

        public final androidx.lifecycle.V b() {
            return this.f13845b;
        }

        public final void c(Object obj) {
            this.f13844a = obj;
        }

        public final void d(androidx.lifecycle.V v10) {
            this.f13845b = v10;
        }
    }

    /* JADX INFO: renamed from: androidx.activity.q$e */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private interface e extends Executor {
        void i0(View view);

        void m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: androidx.activity.q$f */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    final class f implements e, ViewTreeObserver.OnDrawListener, Runnable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final long f13846g = SystemClock.uptimeMillis() + ((long) ModuleDescriptor.MODULE_VERSION);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Runnable f13847h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f13848i;

        public f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(f fVar) {
            Runnable runnable = fVar.f13847h;
            if (runnable != null) {
                AbstractC2855l.d(runnable);
                runnable.run();
                fVar.f13847h = null;
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            AbstractC2855l.g(runnable, "runnable");
            this.f13847h = runnable;
            View decorView = AbstractActivityC1618q.this.getWindow().getDecorView();
            AbstractC2855l.f(decorView, "getDecorView(...)");
            if (!this.f13848i) {
                decorView.postOnAnimation(new Runnable() { // from class: androidx.activity.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractActivityC1618q.f.b(this.f13851g);
                    }
                });
            } else if (AbstractC2855l.b(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // androidx.activity.AbstractActivityC1618q.e
        public void i0(View view) {
            AbstractC2855l.g(view, "view");
            if (this.f13848i) {
                return;
            }
            this.f13848i = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }

        @Override // androidx.activity.AbstractActivityC1618q.e
        public void m() {
            AbstractActivityC1618q.this.getWindow().getDecorView().removeCallbacks(this);
            AbstractActivityC1618q.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.f13847h;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.f13846g) {
                    this.f13848i = false;
                    AbstractActivityC1618q.this.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.f13847h = null;
            if (AbstractActivityC1618q.this.getFullyDrawnReporter().c()) {
                this.f13848i = false;
                AbstractActivityC1618q.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractActivityC1618q.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    /* JADX INFO: renamed from: androidx.activity.q$g */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class g extends d.e {
        g() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void u(g gVar, int i10, AbstractC2379a.C0253a c0253a) {
            gVar.g(i10, c0253a.a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void v(g gVar, int i10, IntentSender.SendIntentException sendIntentException) {
            gVar.f(i10, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", sendIntentException));
        }

        @Override // d.e
        public void k(final int i10, AbstractC2379a contract, Object obj, androidx.core.app.c cVar) {
            Bundle bundleExtra;
            final int i11;
            AbstractC2855l.g(contract, "contract");
            AbstractActivityC1618q abstractActivityC1618q = AbstractActivityC1618q.this;
            final AbstractC2379a.C0253a c0253aB = contract.b(abstractActivityC1618q, obj);
            if (c0253aB != null) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.activity.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractActivityC1618q.g.u(this.f13864g, i10, c0253aB);
                    }
                });
                return;
            }
            Intent intentA = contract.a(abstractActivityC1618q, obj);
            if (intentA.getExtras() != null) {
                Bundle extras = intentA.getExtras();
                AbstractC2855l.d(extras);
                if (extras.getClassLoader() == null) {
                    intentA.setExtrasClassLoader(abstractActivityC1618q.getClassLoader());
                }
            }
            if (intentA.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundleExtra = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            } else {
                bundleExtra = null;
            }
            Bundle bundle = bundleExtra;
            if (AbstractC2855l.b("androidx.activity.result.contract.action.REQUEST_PERMISSIONS", intentA.getAction())) {
                String[] stringArrayExtra = intentA.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                androidx.core.app.b.r(abstractActivityC1618q, stringArrayExtra, i10);
                return;
            }
            if (!AbstractC2855l.b("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST", intentA.getAction())) {
                androidx.core.app.b.v(abstractActivityC1618q, intentA, i10, bundle);
                return;
            }
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) intentA.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                AbstractC2855l.d(intentSenderRequest);
                i11 = i10;
                try {
                    androidx.core.app.b.w(abstractActivityC1618q, intentSenderRequest.getIntentSender(), i11, intentSenderRequest.getFillInIntent(), intentSenderRequest.getFlagsMask(), intentSenderRequest.getFlagsValues(), 0, bundle);
                    C2735B c2735b = C2735B.f28704a;
                } catch (IntentSender.SendIntentException e10) {
                    e = e10;
                    final IntentSender.SendIntentException sendIntentException = e;
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.activity.t
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractActivityC1618q.g.v(this.f13867g, i11, sendIntentException);
                        }
                    });
                }
            } catch (IntentSender.SendIntentException e11) {
                e = e11;
                i11 = i10;
            }
        }
    }

    public AbstractActivityC1618q() {
        C2699h c2699hB = C2699h.f28264c.b(this);
        this.savedStateRegistryController = c2699hB;
        this.reportFullyDrawnExecutor = t();
        this.fullyDrawnReporter$delegate = AbstractC2746i.b(new InterfaceC3487a() { // from class: androidx.activity.h
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return AbstractActivityC1618q.w(this.f13832g);
            }
        });
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new g();
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().a(new InterfaceC1768o() { // from class: androidx.activity.i
            @Override // androidx.lifecycle.InterfaceC1768o
            public final void k(androidx.lifecycle.r rVar, AbstractC1764k.a aVar) {
                AbstractActivityC1618q.n(this.f13833g, rVar, aVar);
            }
        });
        getLifecycle().a(new InterfaceC1768o() { // from class: androidx.activity.j
            @Override // androidx.lifecycle.InterfaceC1768o
            public final void k(androidx.lifecycle.r rVar, AbstractC1764k.a aVar) {
                AbstractActivityC1618q.o(this.f13834g, rVar, aVar);
            }
        });
        getLifecycle().a(new a());
        c2699hB.c();
        androidx.lifecycle.L.c(this);
        getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new C2697f.b() { // from class: androidx.activity.k
            @Override // h1.C2697f.b
            public final Bundle a() {
                return AbstractActivityC1618q.p(this.f13835a);
            }
        });
        addOnContextAvailableListener(new InterfaceC1832b() { // from class: androidx.activity.l
            @Override // c.InterfaceC1832b
            public final void a(Context context) {
                AbstractActivityC1618q.q(this.f13836a, context);
            }
        });
        this.defaultViewModelProviderFactory$delegate = AbstractC2746i.b(new InterfaceC3487a() { // from class: androidx.activity.m
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return AbstractActivityC1618q.u(this.f13837g);
            }
        });
        this.onBackPressedDispatcher$delegate = AbstractC2746i.b(new InterfaceC3487a() { // from class: androidx.activity.n
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return AbstractActivityC1618q.z(this.f13838g);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(AbstractActivityC1618q abstractActivityC1618q) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e10) {
            if (!AbstractC2855l.b(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e10;
            }
        } catch (NullPointerException e11) {
            if (!AbstractC2855l.b(e11.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e11;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(AbstractActivityC1618q abstractActivityC1618q, T t10) {
        abstractActivityC1618q.r(t10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(AbstractActivityC1618q abstractActivityC1618q, androidx.lifecycle.r rVar, AbstractC1764k.a event) {
        Window window;
        View viewPeekDecorView;
        AbstractC2855l.g(rVar, "<unused var>");
        AbstractC2855l.g(event, "event");
        if (event != AbstractC1764k.a.ON_STOP || (window = abstractActivityC1618q.getWindow()) == null || (viewPeekDecorView = window.peekDecorView()) == null) {
            return;
        }
        viewPeekDecorView.cancelPendingInputEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(AbstractActivityC1618q abstractActivityC1618q, androidx.lifecycle.r rVar, AbstractC1764k.a event) {
        AbstractC2855l.g(rVar, "<unused var>");
        AbstractC2855l.g(event, "event");
        if (event == AbstractC1764k.a.ON_DESTROY) {
            abstractActivityC1618q.contextAwareHelper.b();
            if (!abstractActivityC1618q.isChangingConfigurations()) {
                abstractActivityC1618q.getViewModelStore().a();
            }
            abstractActivityC1618q.reportFullyDrawnExecutor.m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle p(AbstractActivityC1618q abstractActivityC1618q) {
        Bundle bundle = new Bundle();
        abstractActivityC1618q.activityResultRegistry.m(bundle);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(AbstractActivityC1618q abstractActivityC1618q, Context it) {
        AbstractC2855l.g(it, "it");
        Bundle bundleA = abstractActivityC1618q.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (bundleA != null) {
            abstractActivityC1618q.activityResultRegistry.l(bundleA);
        }
    }

    private final void r(final T t10) {
        getLifecycle().a(new InterfaceC1768o() { // from class: androidx.activity.g
            @Override // androidx.lifecycle.InterfaceC1768o
            public final void k(androidx.lifecycle.r rVar, AbstractC1764k.a aVar) {
                AbstractActivityC1618q.s(t10, this, rVar, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(T t10, AbstractActivityC1618q abstractActivityC1618q, androidx.lifecycle.r rVar, AbstractC1764k.a event) {
        AbstractC2855l.g(rVar, "<unused var>");
        AbstractC2855l.g(event, "event");
        if (event == AbstractC1764k.a.ON_CREATE) {
            t10.v(b.f13843a.a(abstractActivityC1618q));
        }
    }

    private final e t() {
        return new f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.lifecycle.P u(AbstractActivityC1618q abstractActivityC1618q) {
        return new androidx.lifecycle.P(abstractActivityC1618q.getApplication(), abstractActivityC1618q, abstractActivityC1618q.getIntent() != null ? abstractActivityC1618q.getIntent().getExtras() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v() {
        if (this._viewModelStore == null) {
            d dVar = (d) getLastNonConfigurationInstance();
            if (dVar != null) {
                this._viewModelStore = dVar.b();
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new androidx.lifecycle.V();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J w(final AbstractActivityC1618q abstractActivityC1618q) {
        return new J(abstractActivityC1618q.reportFullyDrawnExecutor, new InterfaceC3487a() { // from class: androidx.activity.f
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return AbstractActivityC1618q.x(this.f13829g);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B x(AbstractActivityC1618q abstractActivityC1618q) {
        abstractActivityC1618q.reportFullyDrawn();
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(AbstractActivityC1618q abstractActivityC1618q) {
        abstractActivityC1618q.invalidateMenu();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final T z(final AbstractActivityC1618q abstractActivityC1618q) {
        final T t10 = new T(new Runnable() { // from class: androidx.activity.o
            @Override // java.lang.Runnable
            public final void run() {
                AbstractActivityC1618q.A(this.f13839g);
            }
        });
        if (Build.VERSION.SDK_INT >= 33) {
            if (!AbstractC2855l.b(Looper.myLooper(), Looper.getMainLooper())) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.activity.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractActivityC1618q.B(this.f13840g, t10);
                    }
                });
                return t10;
            }
            abstractActivityC1618q.r(t10);
        }
        return t10;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        e eVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        AbstractC2855l.f(decorView, "getDecorView(...)");
        eVar.i0(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.core.view.InterfaceC1698v
    public void addMenuProvider(androidx.core.view.B provider) {
        AbstractC2855l.g(provider, "provider");
        this.menuHostHelper.c(provider);
    }

    @Override // androidx.core.content.b
    public final void addOnConfigurationChangedListener(H0.a listener) {
        AbstractC2855l.g(listener, "listener");
        this.onConfigurationChangedListeners.add(listener);
    }

    public final void addOnContextAvailableListener(InterfaceC1832b listener) {
        AbstractC2855l.g(listener, "listener");
        this.contextAwareHelper.a(listener);
    }

    @Override // androidx.core.app.q
    public final void addOnMultiWindowModeChangedListener(H0.a listener) {
        AbstractC2855l.g(listener, "listener");
        this.onMultiWindowModeChangedListeners.add(listener);
    }

    public final void addOnNewIntentListener(H0.a listener) {
        AbstractC2855l.g(listener, "listener");
        this.onNewIntentListeners.add(listener);
    }

    @Override // androidx.core.app.r
    public final void addOnPictureInPictureModeChangedListener(H0.a listener) {
        AbstractC2855l.g(listener, "listener");
        this.onPictureInPictureModeChangedListeners.add(listener);
    }

    @Override // androidx.core.content.c
    public final void addOnTrimMemoryListener(H0.a listener) {
        AbstractC2855l.g(listener, "listener");
        this.onTrimMemoryListeners.add(listener);
    }

    public final void addOnUserLeaveHintListener(Runnable listener) {
        AbstractC2855l.g(listener, "listener");
        this.onUserLeaveHintListeners.add(listener);
    }

    @Override // d.f
    public final d.e getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // androidx.lifecycle.InterfaceC1762i
    public AbstractC2320a getDefaultViewModelCreationExtras() {
        C2321b c2321b = new C2321b(null, 1, null);
        if (getApplication() != null) {
            c2321b.c(U.a.f17564h, getApplication());
        }
        c2321b.c(androidx.lifecycle.L.f17542a, this);
        c2321b.c(androidx.lifecycle.L.f17543b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            c2321b.c(androidx.lifecycle.L.f17544c, extras);
        }
        return c2321b;
    }

    @Override // androidx.lifecycle.InterfaceC1762i
    public U.c getDefaultViewModelProviderFactory() {
        return (U.c) this.defaultViewModelProviderFactory$delegate.getValue();
    }

    public J getFullyDrawnReporter() {
        return (J) this.fullyDrawnReporter$delegate.getValue();
    }

    public Object getLastCustomNonConfigurationInstance() {
        d dVar = (d) getLastNonConfigurationInstance();
        if (dVar != null) {
            return dVar.a();
        }
        return null;
    }

    @Override // androidx.core.app.h, androidx.lifecycle.r
    public AbstractC1764k getLifecycle() {
        return super.getLifecycle();
    }

    @Override // androidx.activity.V
    public final T getOnBackPressedDispatcher() {
        return (T) this.onBackPressedDispatcher$delegate.getValue();
    }

    @Override // h1.InterfaceC2700i
    public final C2697f getSavedStateRegistry() {
        return this.savedStateRegistryController.b();
    }

    @Override // androidx.lifecycle.W
    public androidx.lifecycle.V getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        v();
        androidx.lifecycle.V v10 = this._viewModelStore;
        AbstractC2855l.d(v10);
        return v10;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        AbstractC2855l.f(decorView, "getDecorView(...)");
        androidx.lifecycle.X.a(decorView, this);
        View decorView2 = getWindow().getDecorView();
        AbstractC2855l.f(decorView2, "getDecorView(...)");
        androidx.lifecycle.Y.a(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        AbstractC2855l.f(decorView3, "getDecorView(...)");
        h1.m.a(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        AbstractC2855l.f(decorView4, "getDecorView(...)");
        a0.a(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        AbstractC2855l.f(decorView5, "getDecorView(...)");
        Z.a(decorView5, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        if (this.activityResultRegistry.f(i10, i11, intent)) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        getOnBackPressedDispatcher().s();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        AbstractC2855l.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Iterator<H0.a> it = this.onConfigurationChangedListeners.iterator();
        AbstractC2855l.f(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(newConfig);
        }
    }

    @Override // androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.savedStateRegistryController.d(bundle);
        this.contextAwareHelper.c(this);
        super.onCreate(bundle);
        androidx.lifecycle.G.INSTANCE.c(this);
        int i10 = this.contentLayoutId;
        if (i10 != 0) {
            setContentView(i10);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i10, Menu menu) {
        AbstractC2855l.g(menu, "menu");
        if (i10 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i10, menu);
        this.menuHostHelper.f(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem item) {
        AbstractC2855l.g(item, "item");
        if (super.onMenuItemSelected(i10, item)) {
            return true;
        }
        if (i10 == 0) {
            return this.menuHostHelper.h(item);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z10) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<H0.a> it = this.onMultiWindowModeChangedListeners.iterator();
        AbstractC2855l.f(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(new androidx.core.app.i(z10));
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        AbstractC2855l.g(intent, "intent");
        super.onNewIntent(intent);
        Iterator<H0.a> it = this.onNewIntentListeners.iterator();
        AbstractC2855l.f(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        AbstractC2855l.g(menu, "menu");
        this.menuHostHelper.g(menu);
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<H0.a> it = this.onPictureInPictureModeChangedListeners.iterator();
        AbstractC2855l.f(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(new androidx.core.app.s(z10));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i10, View view, Menu menu) {
        AbstractC2855l.g(menu, "menu");
        if (i10 != 0) {
            return true;
        }
        super.onPreparePanel(i10, view, menu);
        this.menuHostHelper.i(menu);
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] permissions, int[] grantResults) {
        AbstractC2855l.g(permissions, "permissions");
        AbstractC2855l.g(grantResults, "grantResults");
        if (this.activityResultRegistry.f(i10, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", permissions).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", grantResults))) {
            return;
        }
        super.onRequestPermissionsResult(i10, permissions, grantResults);
    }

    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        d dVar;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        androidx.lifecycle.V vB = this._viewModelStore;
        if (vB == null && (dVar = (d) getLastNonConfigurationInstance()) != null) {
            vB = dVar.b();
        }
        if (vB == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        d dVar2 = new d();
        dVar2.c(objOnRetainCustomNonConfigurationInstance);
        dVar2.d(vB);
        return dVar2;
    }

    @Override // androidx.core.app.h, android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        AbstractC2855l.g(outState, "outState");
        if (getLifecycle() instanceof C1772t) {
            AbstractC1764k lifecycle = getLifecycle();
            AbstractC2855l.e(lifecycle, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((C1772t) lifecycle).n(AbstractC1764k.b.f17592i);
        }
        super.onSaveInstanceState(outState);
        this.savedStateRegistryController.e(outState);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        Iterator<H0.a> it = this.onTrimMemoryListeners.iterator();
        AbstractC2855l.f(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i10));
        }
    }

    @Override // android.app.Activity
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        AbstractC2855l.f(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public Context peekAvailableContext() {
        return this.contextAwareHelper.d();
    }

    public final <I, O> AbstractC2314b registerForActivityResult(AbstractC2379a contract, d.e registry, InterfaceC2313a callback) {
        AbstractC2855l.g(contract, "contract");
        AbstractC2855l.g(registry, "registry");
        AbstractC2855l.g(callback, "callback");
        return registry.n("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, contract, callback);
    }

    @Override // androidx.core.view.InterfaceC1698v
    public void removeMenuProvider(androidx.core.view.B provider) {
        AbstractC2855l.g(provider, "provider");
        this.menuHostHelper.j(provider);
    }

    @Override // androidx.core.content.b
    public final void removeOnConfigurationChangedListener(H0.a listener) {
        AbstractC2855l.g(listener, "listener");
        this.onConfigurationChangedListeners.remove(listener);
    }

    public final void removeOnContextAvailableListener(InterfaceC1832b listener) {
        AbstractC2855l.g(listener, "listener");
        this.contextAwareHelper.e(listener);
    }

    @Override // androidx.core.app.q
    public final void removeOnMultiWindowModeChangedListener(H0.a listener) {
        AbstractC2855l.g(listener, "listener");
        this.onMultiWindowModeChangedListeners.remove(listener);
    }

    public final void removeOnNewIntentListener(H0.a listener) {
        AbstractC2855l.g(listener, "listener");
        this.onNewIntentListeners.remove(listener);
    }

    @Override // androidx.core.app.r
    public final void removeOnPictureInPictureModeChangedListener(H0.a listener) {
        AbstractC2855l.g(listener, "listener");
        this.onPictureInPictureModeChangedListeners.remove(listener);
    }

    @Override // androidx.core.content.c
    public final void removeOnTrimMemoryListener(H0.a listener) {
        AbstractC2855l.g(listener, "listener");
        this.onTrimMemoryListeners.remove(listener);
    }

    public final void removeOnUserLeaveHintListener(Runnable listener) {
        AbstractC2855l.g(listener, "listener");
        this.onUserLeaveHintListeners.remove(listener);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (AbstractC2861a.h()) {
                AbstractC2861a.c("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            getFullyDrawnReporter().b();
            AbstractC2861a.f();
        } catch (Throwable th) {
            AbstractC2861a.f();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i10) {
        initializeViewTreeOwners();
        e eVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        AbstractC2855l.f(decorView, "getDecorView(...)");
        eVar.i0(decorView);
        super.setContentView(i10);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i10) {
        AbstractC2855l.g(intent, "intent");
        super.startActivityForResult(intent, i10);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intent, int i10, Intent intent2, int i11, int i12, int i13) throws IntentSender.SendIntentException {
        AbstractC2855l.g(intent, "intent");
        super.startIntentSenderForResult(intent, i10, intent2, i11, i12, i13);
    }

    public void addMenuProvider(androidx.core.view.B provider, androidx.lifecycle.r owner) {
        AbstractC2855l.g(provider, "provider");
        AbstractC2855l.g(owner, "owner");
        this.menuHostHelper.d(provider, owner);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i10, Bundle bundle) {
        AbstractC2855l.g(intent, "intent");
        super.startActivityForResult(intent, i10, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intent, int i10, Intent intent2, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        AbstractC2855l.g(intent, "intent");
        super.startIntentSenderForResult(intent, i10, intent2, i11, i12, i13, bundle);
    }

    public void addMenuProvider(androidx.core.view.B provider, androidx.lifecycle.r owner, AbstractC1764k.b state) {
        AbstractC2855l.g(provider, "provider");
        AbstractC2855l.g(owner, "owner");
        AbstractC2855l.g(state, "state");
        this.menuHostHelper.e(provider, owner, state);
    }

    public final <I, O> AbstractC2314b registerForActivityResult(AbstractC2379a contract, InterfaceC2313a callback) {
        AbstractC2855l.g(contract, "contract");
        AbstractC2855l.g(callback, "callback");
        return registerForActivityResult(contract, this.activityResultRegistry, callback);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z10, Configuration newConfig) {
        AbstractC2855l.g(newConfig, "newConfig");
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z10, newConfig);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<H0.a> it = this.onMultiWindowModeChangedListeners.iterator();
            AbstractC2855l.f(it, "iterator(...)");
            while (it.hasNext()) {
                it.next().accept(new androidx.core.app.i(z10, newConfig));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10, Configuration newConfig) {
        AbstractC2855l.g(newConfig, "newConfig");
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z10, newConfig);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<H0.a> it = this.onPictureInPictureModeChangedListeners.iterator();
            AbstractC2855l.f(it, "iterator(...)");
            while (it.hasNext()) {
                it.next().accept(new androidx.core.app.s(z10, newConfig));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        e eVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        AbstractC2855l.f(decorView, "getDecorView(...)");
        eVar.i0(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        e eVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        AbstractC2855l.f(decorView, "getDecorView(...)");
        eVar.i0(decorView);
        super.setContentView(view, layoutParams);
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }
}
