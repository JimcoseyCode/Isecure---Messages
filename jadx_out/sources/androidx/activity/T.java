package androidx.activity;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.T;
import androidx.lifecycle.AbstractC1764k;
import androidx.lifecycle.InterfaceC1768o;
import i7.C2735B;
import j7.C2792i;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2853j;
import kotlin.jvm.internal.AbstractC2855l;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runnable f13792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final H0.a f13793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C2792i f13794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private L f13795d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private OnBackInvokedCallback f13796e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private OnBackInvokedDispatcher f13797f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f13798g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f13799h;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f13800a = new a();

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(InterfaceC3487a interfaceC3487a) {
            interfaceC3487a.invoke();
        }

        public final OnBackInvokedCallback b(final InterfaceC3487a onBackInvoked) {
            AbstractC2855l.g(onBackInvoked, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: androidx.activity.S
                public final void onBackInvoked() {
                    T.a.c(onBackInvoked);
                }
            };
        }

        public final void d(Object dispatcher, int i10, Object callback) {
            AbstractC2855l.g(dispatcher, "dispatcher");
            AbstractC2855l.g(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(i10, (OnBackInvokedCallback) callback);
        }

        public final void e(Object dispatcher, Object callback) {
            AbstractC2855l.g(dispatcher, "dispatcher");
            AbstractC2855l.g(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f13801a = new b();

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class a implements OnBackAnimationCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1 f13802a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1 f13803b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC3487a f13804c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC3487a f13805d;

            a(Function1 function1, Function1 function12, InterfaceC3487a interfaceC3487a, InterfaceC3487a interfaceC3487a2) {
                this.f13802a = function1;
                this.f13803b = function12;
                this.f13804c = interfaceC3487a;
                this.f13805d = interfaceC3487a2;
            }

            public void onBackCancelled() {
                this.f13805d.invoke();
            }

            public void onBackInvoked() {
                this.f13804c.invoke();
            }

            public void onBackProgressed(BackEvent backEvent) {
                AbstractC2855l.g(backEvent, "backEvent");
                this.f13803b.invoke(new C1604c(backEvent));
            }

            public void onBackStarted(BackEvent backEvent) {
                AbstractC2855l.g(backEvent, "backEvent");
                this.f13802a.invoke(new C1604c(backEvent));
            }
        }

        private b() {
        }

        public final OnBackInvokedCallback a(Function1 onBackStarted, Function1 onBackProgressed, InterfaceC3487a onBackInvoked, InterfaceC3487a onBackCancelled) {
            AbstractC2855l.g(onBackStarted, "onBackStarted");
            AbstractC2855l.g(onBackProgressed, "onBackProgressed");
            AbstractC2855l.g(onBackInvoked, "onBackInvoked");
            AbstractC2855l.g(onBackCancelled, "onBackCancelled");
            return new a(onBackStarted, onBackProgressed, onBackInvoked, onBackCancelled);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private final class c implements InterfaceC1768o, InterfaceC1605d {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final AbstractC1764k f13806g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final L f13807h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private InterfaceC1605d f13808i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ T f13809j;

        public c(T t10, AbstractC1764k lifecycle, L onBackPressedCallback) {
            AbstractC2855l.g(lifecycle, "lifecycle");
            AbstractC2855l.g(onBackPressedCallback, "onBackPressedCallback");
            this.f13809j = t10;
            this.f13806g = lifecycle;
            this.f13807h = onBackPressedCallback;
            lifecycle.a(this);
        }

        @Override // androidx.activity.InterfaceC1605d
        public void cancel() {
            this.f13806g.d(this);
            this.f13807h.removeCancellable(this);
            InterfaceC1605d interfaceC1605d = this.f13808i;
            if (interfaceC1605d != null) {
                interfaceC1605d.cancel();
            }
            this.f13808i = null;
        }

        @Override // androidx.lifecycle.InterfaceC1768o
        public void k(androidx.lifecycle.r source, AbstractC1764k.a event) {
            AbstractC2855l.g(source, "source");
            AbstractC2855l.g(event, "event");
            if (event == AbstractC1764k.a.ON_START) {
                this.f13808i = this.f13809j.q(this.f13807h);
                return;
            }
            if (event != AbstractC1764k.a.ON_STOP) {
                if (event == AbstractC1764k.a.ON_DESTROY) {
                    cancel();
                }
            } else {
                InterfaceC1605d interfaceC1605d = this.f13808i;
                if (interfaceC1605d != null) {
                    interfaceC1605d.cancel();
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private final class d implements InterfaceC1605d {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final L f13810g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ T f13811h;

        public d(T t10, L onBackPressedCallback) {
            AbstractC2855l.g(onBackPressedCallback, "onBackPressedCallback");
            this.f13811h = t10;
            this.f13810g = onBackPressedCallback;
        }

        @Override // androidx.activity.InterfaceC1605d
        public void cancel() {
            this.f13811h.f13794c.remove(this.f13810g);
            if (AbstractC2855l.b(this.f13811h.f13795d, this.f13810g)) {
                this.f13810g.handleOnBackCancelled();
                this.f13811h.f13795d = null;
            }
            this.f13810g.removeCancellable(this);
            InterfaceC3487a enabledChangedCallback$activity_release = this.f13810g.getEnabledChangedCallback$activity_release();
            if (enabledChangedCallback$activity_release != null) {
                enabledChangedCallback$activity_release.invoke();
            }
            this.f13810g.setEnabledChangedCallback$activity_release(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    /* synthetic */ class e extends AbstractC2853j implements InterfaceC3487a {
        e(Object obj) {
            super(0, obj, T.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        @Override // w7.InterfaceC3487a
        public /* bridge */ /* synthetic */ Object invoke() {
            m0invoke();
            return C2735B.f28704a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m0invoke() {
            ((T) this.receiver).x();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    /* synthetic */ class f extends AbstractC2853j implements InterfaceC3487a {
        f(Object obj) {
            super(0, obj, T.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        @Override // w7.InterfaceC3487a
        public /* bridge */ /* synthetic */ Object invoke() {
            m1invoke();
            return C2735B.f28704a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m1invoke() {
            ((T) this.receiver).x();
        }
    }

    public T(Runnable runnable, H0.a aVar) {
        this.f13792a = runnable;
        this.f13793b = aVar;
        this.f13794c = new C2792i();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            this.f13796e = i10 >= 34 ? b.f13801a.a(new Function1() { // from class: androidx.activity.M
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return T.f(this.f13786g, (C1604c) obj);
                }
            }, new Function1() { // from class: androidx.activity.N
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return T.g(this.f13787g, (C1604c) obj);
                }
            }, new InterfaceC3487a() { // from class: androidx.activity.O
                @Override // w7.InterfaceC3487a
                public final Object invoke() {
                    return T.h(this.f13788g);
                }
            }, new InterfaceC3487a() { // from class: androidx.activity.P
                @Override // w7.InterfaceC3487a
                public final Object invoke() {
                    return T.i(this.f13789g);
                }
            }) : a.f13800a.b(new InterfaceC3487a() { // from class: androidx.activity.Q
                @Override // w7.InterfaceC3487a
                public final Object invoke() {
                    return T.j(this.f13790g);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B f(T t10, C1604c backEvent) {
        AbstractC2855l.g(backEvent, "backEvent");
        t10.u(backEvent);
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B g(T t10, C1604c backEvent) {
        AbstractC2855l.g(backEvent, "backEvent");
        t10.t(backEvent);
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B h(T t10) {
        t10.s();
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B i(T t10) {
        t10.r();
        return C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B j(T t10) {
        t10.s();
        return C2735B.f28704a;
    }

    private final void r() {
        Object objPrevious;
        L l10 = this.f13795d;
        if (l10 == null) {
            C2792i c2792i = this.f13794c;
            ListIterator<E> listIterator = c2792i.listIterator(c2792i.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                } else {
                    objPrevious = listIterator.previous();
                    if (((L) objPrevious).isEnabled()) {
                        break;
                    }
                }
            }
            l10 = (L) objPrevious;
        }
        this.f13795d = null;
        if (l10 != null) {
            l10.handleOnBackCancelled();
        }
    }

    private final void t(C1604c c1604c) {
        Object objPrevious;
        L l10 = this.f13795d;
        if (l10 == null) {
            C2792i c2792i = this.f13794c;
            ListIterator<E> listIterator = c2792i.listIterator(c2792i.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                } else {
                    objPrevious = listIterator.previous();
                    if (((L) objPrevious).isEnabled()) {
                        break;
                    }
                }
            }
            l10 = (L) objPrevious;
        }
        if (l10 != null) {
            l10.handleOnBackProgressed(c1604c);
        }
    }

    private final void u(C1604c c1604c) {
        Object objPrevious;
        C2792i c2792i = this.f13794c;
        ListIterator<E> listIterator = c2792i.listIterator(c2792i.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            } else {
                objPrevious = listIterator.previous();
                if (((L) objPrevious).isEnabled()) {
                    break;
                }
            }
        }
        L l10 = (L) objPrevious;
        if (this.f13795d != null) {
            r();
        }
        this.f13795d = l10;
        if (l10 != null) {
            l10.handleOnBackStarted(c1604c);
        }
    }

    private final void w(boolean z10) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f13797f;
        OnBackInvokedCallback onBackInvokedCallback = this.f13796e;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (z10 && !this.f13798g) {
            a.f13800a.d(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f13798g = true;
        } else {
            if (z10 || !this.f13798g) {
                return;
            }
            a.f13800a.e(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f13798g = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x() {
        boolean z10 = this.f13799h;
        C2792i c2792i = this.f13794c;
        boolean z11 = false;
        if (c2792i == null || !c2792i.isEmpty()) {
            Iterator<E> it = c2792i.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((L) it.next()).isEnabled()) {
                    z11 = true;
                    break;
                }
            }
        }
        this.f13799h = z11;
        if (z11 != z10) {
            H0.a aVar = this.f13793b;
            if (aVar != null) {
                aVar.accept(Boolean.valueOf(z11));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                w(z11);
            }
        }
    }

    public final void o(L onBackPressedCallback) {
        AbstractC2855l.g(onBackPressedCallback, "onBackPressedCallback");
        q(onBackPressedCallback);
    }

    public final void p(androidx.lifecycle.r owner, L onBackPressedCallback) {
        AbstractC2855l.g(owner, "owner");
        AbstractC2855l.g(onBackPressedCallback, "onBackPressedCallback");
        AbstractC1764k lifecycle = owner.getLifecycle();
        if (lifecycle.b() == AbstractC1764k.b.f17590g) {
            return;
        }
        onBackPressedCallback.addCancellable(new c(this, lifecycle, onBackPressedCallback));
        x();
        onBackPressedCallback.setEnabledChangedCallback$activity_release(new e(this));
    }

    public final InterfaceC1605d q(L onBackPressedCallback) {
        AbstractC2855l.g(onBackPressedCallback, "onBackPressedCallback");
        this.f13794c.add(onBackPressedCallback);
        d dVar = new d(this, onBackPressedCallback);
        onBackPressedCallback.addCancellable(dVar);
        x();
        onBackPressedCallback.setEnabledChangedCallback$activity_release(new f(this));
        return dVar;
    }

    public final void s() {
        Object objPrevious;
        L l10 = this.f13795d;
        if (l10 == null) {
            C2792i c2792i = this.f13794c;
            ListIterator<E> listIterator = c2792i.listIterator(c2792i.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                } else {
                    objPrevious = listIterator.previous();
                    if (((L) objPrevious).isEnabled()) {
                        break;
                    }
                }
            }
            l10 = (L) objPrevious;
        }
        this.f13795d = null;
        if (l10 != null) {
            l10.handleOnBackPressed();
            return;
        }
        Runnable runnable = this.f13792a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void v(OnBackInvokedDispatcher invoker) {
        AbstractC2855l.g(invoker, "invoker");
        this.f13797f = invoker;
        w(this.f13799h);
    }

    public T(Runnable runnable) {
        this(runnable, null);
    }
}
