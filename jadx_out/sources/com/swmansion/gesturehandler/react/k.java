package com.swmansion.gesturehandler.react;

import J6.AbstractC1274d;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.RootView;
import com.facebook.react.uimanager.ThemedReactContext;
import java.util.Objects;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f24944g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReactContext f24945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final J6.i f24946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AbstractC1274d f24947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ViewGroup f24948d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f24949e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f24950f;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ViewGroup b(ViewGroup viewGroup) {
            UiThreadUtil.assertOnUiThread();
            ViewParent parent = viewGroup;
            while (parent != null && !(parent instanceof RootView)) {
                parent = parent.getParent();
            }
            if (parent != null) {
                return (ViewGroup) parent;
            }
            throw new IllegalStateException(("View " + viewGroup + " has not been mounted under ReactRootView").toString());
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public final class b extends AbstractC1274d {
        public b(int i10) {
            I0(i10);
        }

        private final void U0(MotionEvent motionEvent) {
            J6.i iVarP;
            if (S() == 0 && (!k.this.f24949e || (iVarP = P()) == null || !iVarP.v())) {
                p();
                k.this.f24949e = false;
            }
            if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 10) {
                B();
            }
        }

        @Override // J6.AbstractC1274d
        protected void j0() {
            k.this.f24949e = true;
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            motionEventObtain.setAction(3);
            if (k.this.f() instanceof RootView) {
                RootView rootView = (RootView) k.this.f();
                ViewGroup viewGroupF = k.this.f();
                AbstractC2855l.d(motionEventObtain);
                rootView.onChildStartedNativeGesture(viewGroupF, motionEventObtain);
            }
            motionEventObtain.recycle();
        }

        @Override // J6.AbstractC1274d
        protected void l0(MotionEvent event, MotionEvent sourceEvent) {
            AbstractC2855l.g(event, "event");
            AbstractC2855l.g(sourceEvent, "sourceEvent");
            U0(event);
        }

        @Override // J6.AbstractC1274d
        protected void m0(MotionEvent event, MotionEvent sourceEvent) {
            AbstractC2855l.g(event, "event");
            AbstractC2855l.g(sourceEvent, "sourceEvent");
            U0(event);
        }
    }

    public k(ReactContext context, ViewGroup wrappedView) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(wrappedView, "wrappedView");
        this.f24945a = context;
        UiThreadUtil.assertOnUiThread();
        int id = wrappedView.getId();
        NativeModule nativeModule = context.getNativeModule((Class<NativeModule>) RNGestureHandlerModule.class);
        AbstractC2855l.d(nativeModule);
        RNGestureHandlerModule rNGestureHandlerModule = (RNGestureHandlerModule) nativeModule;
        i registry = rNGestureHandlerModule.getRegistry();
        ViewGroup viewGroupB = f24944g.b(wrappedView);
        this.f24948d = viewGroupB;
        Objects.toString(viewGroupB);
        J6.i iVar = new J6.i(wrappedView, registry, new o(), viewGroupB);
        iVar.F(0.1f);
        this.f24946b = iVar;
        b bVar = new b(-id);
        this.f24947c = bVar;
        registry.j(bVar);
        registry.c(bVar.T(), id, 3);
        rNGestureHandlerModule.registerRootHelper(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(k kVar) {
        kVar.k();
    }

    private final void k() {
        AbstractC1274d abstractC1274d = this.f24947c;
        if (abstractC1274d == null || abstractC1274d.S() != 2) {
            return;
        }
        abstractC1274d.k();
        abstractC1274d.B();
    }

    public final void d(View view) {
        AbstractC2855l.g(view, "view");
        J6.i iVar = this.f24946b;
        if (iVar != null) {
            iVar.f(view);
        }
    }

    public final boolean e(MotionEvent event) {
        AbstractC2855l.g(event, "event");
        this.f24950f = true;
        J6.i iVar = this.f24946b;
        AbstractC2855l.d(iVar);
        iVar.B(event);
        this.f24950f = false;
        return this.f24949e;
    }

    public final ViewGroup f() {
        return this.f24948d;
    }

    public final void g(int i10, boolean z10) {
        if (z10) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.gesturehandler.react.j
                @Override // java.lang.Runnable
                public final void run() {
                    k.h(this.f24943g);
                }
            });
        }
    }

    public final void i() {
        if (this.f24946b == null || this.f24950f) {
            return;
        }
        k();
    }

    public final void j() {
        Objects.toString(this.f24948d);
        ReactContext reactContext = this.f24945a;
        AbstractC2855l.e(reactContext, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        NativeModule nativeModule = ((ThemedReactContext) reactContext).getReactApplicationContext().getNativeModule((Class<NativeModule>) RNGestureHandlerModule.class);
        AbstractC2855l.d(nativeModule);
        RNGestureHandlerModule rNGestureHandlerModule = (RNGestureHandlerModule) nativeModule;
        i registry = rNGestureHandlerModule.getRegistry();
        AbstractC1274d abstractC1274d = this.f24947c;
        AbstractC2855l.d(abstractC1274d);
        registry.g(abstractC1274d.T());
        rNGestureHandlerModule.unregisterRootHelper(this);
    }
}
