package J6;

import J6.AbstractC1274d;
import android.content.Context;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.views.scroll.ReactHorizontalScrollView;
import com.facebook.react.views.scroll.ReactScrollView;
import com.facebook.react.views.swiperefresh.ReactSwipeRefreshLayout;
import com.facebook.react.views.text.ReactTextView;
import com.facebook.react.views.textinput.ReactEditText;
import com.facebook.react.views.view.ReactViewGroup;
import com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class q extends AbstractC1274d {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final b f6684R = new b(null);

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final a f6685S = new a();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f6686O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private boolean f6687P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private e f6688Q = f6685S;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements e {
        a() {
        }

        @Override // J6.q.e
        public boolean a() {
            return e.a.f(this);
        }

        @Override // J6.q.e
        public Boolean b(AbstractC1274d abstractC1274d) {
            return e.a.g(this, abstractC1274d);
        }

        @Override // J6.q.e
        public boolean c(MotionEvent motionEvent) {
            return e.a.c(this, motionEvent);
        }

        @Override // J6.q.e
        public boolean d() {
            return e.a.h(this);
        }

        @Override // J6.q.e
        public boolean e(View view) {
            return e.a.b(this, view);
        }

        @Override // J6.q.e
        public void f(MotionEvent motionEvent) {
            e.a.d(this, motionEvent);
        }

        @Override // J6.q.e
        public Boolean g(View view, MotionEvent motionEvent) {
            return e.a.e(this, view, motionEvent);
        }

        @Override // J6.q.e
        public void h(MotionEvent motionEvent) {
            e.a.a(this, motionEvent);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean b(View view, MotionEvent motionEvent) {
            return (view instanceof ViewGroup) && ((ViewGroup) view).onInterceptTouchEvent(motionEvent);
        }

        private b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class c implements e {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final q f6689g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final ReactEditText f6690h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private float f6691i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private float f6692j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f6693k;

        public c(q handler, ReactEditText editText) {
            AbstractC2855l.g(handler, "handler");
            AbstractC2855l.g(editText, "editText");
            this.f6689g = handler;
            this.f6690h = editText;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(editText.getContext());
            this.f6693k = viewConfiguration.getScaledTouchSlop() * viewConfiguration.getScaledTouchSlop();
        }

        @Override // J6.q.e
        public boolean a() {
            return true;
        }

        @Override // J6.q.e
        public Boolean b(AbstractC1274d handler) {
            AbstractC2855l.g(handler, "handler");
            return Boolean.valueOf(handler.T() > 0 && !(handler instanceof q));
        }

        @Override // J6.q.e
        public boolean c(MotionEvent motionEvent) {
            return e.a.c(this, motionEvent);
        }

        @Override // J6.q.e
        public boolean d() {
            return true;
        }

        @Override // J6.q.e
        public boolean e(View view) {
            return e.a.b(this, view);
        }

        @Override // J6.q.e
        public void f(MotionEvent event) {
            AbstractC2855l.g(event, "event");
            this.f6689g.k();
            this.f6690h.onTouchEvent(event);
            this.f6691i = event.getX();
            this.f6692j = event.getY();
        }

        @Override // J6.q.e
        public Boolean g(View view, MotionEvent motionEvent) {
            return e.a.e(this, view, motionEvent);
        }

        @Override // J6.q.e
        public void h(MotionEvent event) {
            AbstractC2855l.g(event, "event");
            if (((event.getX() - this.f6691i) * (event.getX() - this.f6691i)) + ((event.getY() - this.f6692j) * (event.getY() - this.f6692j)) < this.f6693k) {
                this.f6690h.requestFocusFromJS();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class d extends AbstractC1274d.c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f6694d = new a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class f6695b = q.class;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f6696c = "NativeViewGestureHandler";

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        @Override // J6.AbstractC1274d.c
        public String d() {
            return this.f6696c;
        }

        @Override // J6.AbstractC1274d.c
        public Class e() {
            return this.f6695b;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // J6.AbstractC1274d.c
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public q a(Context context) {
            return new q();
        }

        @Override // J6.AbstractC1274d.c
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public K6.f c(q handler) {
            AbstractC2855l.g(handler, "handler");
            return new K6.f(handler);
        }

        @Override // J6.AbstractC1274d.c
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void f(q handler, ReadableMap config) {
            AbstractC2855l.g(handler, "handler");
            AbstractC2855l.g(config, "config");
            super.f(handler, config);
            if (config.hasKey("shouldActivateOnStart")) {
                handler.f6686O = config.getBoolean("shouldActivateOnStart");
            }
            if (config.hasKey("disallowInterruption")) {
                handler.f6687P = config.getBoolean("disallowInterruption");
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface e {

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class a {
            public static void a(e eVar, MotionEvent event) {
                AbstractC2855l.g(event, "event");
            }

            public static boolean b(e eVar, View view) {
                AbstractC2855l.g(view, "view");
                return view.isPressed();
            }

            public static boolean c(e eVar, MotionEvent event) {
                AbstractC2855l.g(event, "event");
                return true;
            }

            public static void d(e eVar, MotionEvent event) {
                AbstractC2855l.g(event, "event");
            }

            public static Boolean e(e eVar, View view, MotionEvent event) {
                AbstractC2855l.g(event, "event");
                if (view != null) {
                    return Boolean.valueOf(view.onTouchEvent(event));
                }
                return null;
            }

            public static boolean f(e eVar) {
                return false;
            }

            public static Boolean g(e eVar, AbstractC1274d handler) {
                AbstractC2855l.g(handler, "handler");
                return null;
            }

            public static boolean h(e eVar) {
                return false;
            }
        }

        boolean a();

        Boolean b(AbstractC1274d abstractC1274d);

        boolean c(MotionEvent motionEvent);

        boolean d();

        boolean e(View view);

        void f(MotionEvent motionEvent);

        Boolean g(View view, MotionEvent motionEvent);

        void h(MotionEvent motionEvent);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class f implements e {
        @Override // J6.q.e
        public boolean a() {
            return e.a.f(this);
        }

        @Override // J6.q.e
        public Boolean b(AbstractC1274d abstractC1274d) {
            return e.a.g(this, abstractC1274d);
        }

        @Override // J6.q.e
        public boolean c(MotionEvent motionEvent) {
            return e.a.c(this, motionEvent);
        }

        @Override // J6.q.e
        public boolean d() {
            return e.a.h(this);
        }

        @Override // J6.q.e
        public boolean e(View view) {
            return e.a.b(this, view);
        }

        @Override // J6.q.e
        public void f(MotionEvent motionEvent) {
            e.a.d(this, motionEvent);
        }

        @Override // J6.q.e
        public Boolean g(View view, MotionEvent event) {
            AbstractC2855l.g(event, "event");
            if (view != null) {
                return Boolean.valueOf(view.dispatchTouchEvent(event));
            }
            return null;
        }

        @Override // J6.q.e
        public void h(MotionEvent motionEvent) {
            e.a.a(this, motionEvent);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class g implements e {
        @Override // J6.q.e
        public boolean a() {
            return true;
        }

        @Override // J6.q.e
        public Boolean b(AbstractC1274d abstractC1274d) {
            return e.a.g(this, abstractC1274d);
        }

        @Override // J6.q.e
        public boolean c(MotionEvent motionEvent) {
            return e.a.c(this, motionEvent);
        }

        @Override // J6.q.e
        public boolean d() {
            return e.a.h(this);
        }

        @Override // J6.q.e
        public boolean e(View view) {
            return e.a.b(this, view);
        }

        @Override // J6.q.e
        public void f(MotionEvent motionEvent) {
            e.a.d(this, motionEvent);
        }

        @Override // J6.q.e
        public Boolean g(View view, MotionEvent motionEvent) {
            return e.a.e(this, view, motionEvent);
        }

        @Override // J6.q.e
        public void h(MotionEvent motionEvent) {
            e.a.a(this, motionEvent);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class h implements e {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final q f6697g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final ReactSwipeRefreshLayout f6698h;

        public h(q handler, ReactSwipeRefreshLayout swipeRefreshLayout) {
            AbstractC2855l.g(handler, "handler");
            AbstractC2855l.g(swipeRefreshLayout, "swipeRefreshLayout");
            this.f6697g = handler;
            this.f6698h = swipeRefreshLayout;
        }

        @Override // J6.q.e
        public boolean a() {
            return e.a.f(this);
        }

        @Override // J6.q.e
        public Boolean b(AbstractC1274d abstractC1274d) {
            return e.a.g(this, abstractC1274d);
        }

        @Override // J6.q.e
        public boolean c(MotionEvent motionEvent) {
            return e.a.c(this, motionEvent);
        }

        @Override // J6.q.e
        public boolean d() {
            return true;
        }

        @Override // J6.q.e
        public boolean e(View view) {
            return e.a.b(this, view);
        }

        @Override // J6.q.e
        public void f(MotionEvent event) {
            ArrayList<AbstractC1274d> arrayListS;
            AbstractC2855l.g(event, "event");
            View childAt = this.f6698h.getChildAt(0);
            abstractC1274d = null;
            ScrollView scrollView = childAt instanceof ScrollView ? (ScrollView) childAt : null;
            if (scrollView == null) {
                return;
            }
            J6.i iVarP = this.f6697g.P();
            if (iVarP != null && (arrayListS = iVarP.s(scrollView)) != null) {
                for (AbstractC1274d abstractC1274d : arrayListS) {
                    if (abstractC1274d instanceof q) {
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            if (abstractC1274d == null || abstractC1274d.S() != 4 || scrollView.getScrollY() <= 0) {
                return;
            }
            this.f6697g.D();
        }

        @Override // J6.q.e
        public Boolean g(View view, MotionEvent motionEvent) {
            return e.a.e(this, view, motionEvent);
        }

        @Override // J6.q.e
        public void h(MotionEvent motionEvent) {
            e.a.a(this, motionEvent);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class i implements e {
        @Override // J6.q.e
        public boolean a() {
            return e.a.f(this);
        }

        @Override // J6.q.e
        public Boolean b(AbstractC1274d handler) {
            AbstractC2855l.g(handler, "handler");
            return Boolean.FALSE;
        }

        @Override // J6.q.e
        public boolean c(MotionEvent motionEvent) {
            return e.a.c(this, motionEvent);
        }

        @Override // J6.q.e
        public boolean d() {
            return e.a.h(this);
        }

        @Override // J6.q.e
        public boolean e(View view) {
            AbstractC2855l.g(view, "view");
            return view instanceof ReactTextView;
        }

        @Override // J6.q.e
        public void f(MotionEvent motionEvent) {
            e.a.d(this, motionEvent);
        }

        @Override // J6.q.e
        public Boolean g(View view, MotionEvent motionEvent) {
            return e.a.e(this, view, motionEvent);
        }

        @Override // J6.q.e
        public void h(MotionEvent motionEvent) {
            e.a.a(this, motionEvent);
        }
    }

    public q() {
        G0(true);
    }

    private final void W0() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        motionEventObtain.setAction(3);
        e eVar = this.f6688Q;
        View viewW = W();
        AbstractC2855l.d(motionEventObtain);
        eVar.g(viewW, motionEventObtain);
        motionEventObtain.recycle();
    }

    @Override // J6.AbstractC1274d
    public boolean K0(AbstractC1274d handler) {
        AbstractC2855l.g(handler, "handler");
        return !this.f6687P;
    }

    @Override // J6.AbstractC1274d
    public boolean L0(AbstractC1274d handler) {
        AbstractC2855l.g(handler, "handler");
        Boolean boolB = this.f6688Q.b(handler);
        if (boolB != null) {
            return boolB.booleanValue();
        }
        if (super.L0(handler)) {
            return true;
        }
        if ((handler instanceof q) && handler.S() == 4 && ((q) handler).f6687P) {
            return false;
        }
        boolean z10 = this.f6687P;
        return !(S() == 4 && handler.S() == 4 && !z10) && S() == 4 && !z10 && (!this.f6688Q.a() || handler.T() > 0);
    }

    public final boolean X0() {
        return this.f6687P;
    }

    @Override // J6.AbstractC1274d
    protected void j0() {
        W0();
    }

    @Override // J6.AbstractC1274d
    protected void k0() {
        W0();
    }

    @Override // J6.AbstractC1274d
    protected void l0(MotionEvent event, MotionEvent sourceEvent) {
        AbstractC2855l.g(event, "event");
        AbstractC2855l.g(sourceEvent, "sourceEvent");
        View viewW = W();
        AbstractC2855l.d(viewW);
        Context context = viewW.getContext();
        AbstractC2855l.f(context, "getContext(...)");
        boolean zD = com.swmansion.gesturehandler.react.a.d(context);
        if ((viewW instanceof RNGestureHandlerButtonViewManager.a) && zD) {
            return;
        }
        if (event.getActionMasked() == 1) {
            if (S() != 0 || this.f6688Q.c(event)) {
                this.f6688Q.g(viewW, event);
                if ((S() == 0 || S() == 2) && this.f6688Q.e(viewW)) {
                    k();
                }
                if (S() == 0) {
                    q();
                } else {
                    B();
                }
            } else {
                q();
            }
            this.f6688Q.h(event);
            return;
        }
        if (S() != 0 && S() != 2) {
            if (S() == 4) {
                this.f6688Q.g(viewW, event);
                return;
            }
            return;
        }
        if (this.f6686O) {
            f6684R.b(viewW, event);
            this.f6688Q.g(viewW, event);
            k();
        } else if (f6684R.b(viewW, event)) {
            this.f6688Q.g(viewW, event);
            k();
        } else if (this.f6688Q.d()) {
            this.f6688Q.f(event);
        } else {
            if (S() == 2 || !this.f6688Q.c(event)) {
                return;
            }
            p();
        }
    }

    @Override // J6.AbstractC1274d
    protected void n0() {
        KeyEvent.Callback callbackW = W();
        if (callbackW instanceof e) {
            this.f6688Q = (e) callbackW;
            return;
        }
        if (callbackW instanceof ReactEditText) {
            this.f6688Q = new c(this, (ReactEditText) callbackW);
            return;
        }
        if (callbackW instanceof ReactSwipeRefreshLayout) {
            this.f6688Q = new h(this, (ReactSwipeRefreshLayout) callbackW);
            return;
        }
        if (callbackW instanceof ReactScrollView) {
            this.f6688Q = new g();
            return;
        }
        if (callbackW instanceof ReactHorizontalScrollView) {
            this.f6688Q = new g();
        } else if (callbackW instanceof ReactTextView) {
            this.f6688Q = new i();
        } else if (callbackW instanceof ReactViewGroup) {
            this.f6688Q = new f();
        }
    }

    @Override // J6.AbstractC1274d
    protected void o0() {
        this.f6688Q = f6685S;
    }

    @Override // J6.AbstractC1274d
    public void s0() {
        super.s0();
        this.f6686O = false;
        this.f6687P = false;
        G0(true);
    }
}
