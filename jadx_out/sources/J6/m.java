package J6;

import J6.AbstractC1274d;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.swmansion.gesturehandler.react.k;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class m extends AbstractC1274d {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final a f6660R = new a(null);

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final com.swmansion.gesturehandler.react.o f6661S = new com.swmansion.gesturehandler.react.o();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Handler f6662O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private Runnable f6663P = new Runnable() { // from class: J6.l
        @Override // java.lang.Runnable
        public final void run() {
            m.W0(this.f6659g);
        }
    };

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private z f6664Q = new z(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 31, null);

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b extends AbstractC1274d.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class f6665b = m.class;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f6666c = "HoverGestureHandler";

        @Override // J6.AbstractC1274d.c
        public String d() {
            return this.f6666c;
        }

        @Override // J6.AbstractC1274d.c
        public Class e() {
            return this.f6665b;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // J6.AbstractC1274d.c
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public m a(Context context) {
            return new m();
        }

        @Override // J6.AbstractC1274d.c
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public K6.c c(m handler) {
            AbstractC2855l.g(handler, "handler");
            return new K6.c(handler);
        }
    }

    private final void V0() {
        int iS = S();
        if (iS == 0) {
            q();
        } else if (iS == 2) {
            D();
        } else {
            if (iS != 4) {
                return;
            }
            B();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W0(m mVar) {
        mVar.V0();
    }

    private final boolean Y0(AbstractC1274d abstractC1274d) {
        View viewW = abstractC1274d.W();
        while (viewW != null) {
            if (AbstractC2855l.b(viewW, W())) {
                return true;
            }
            Object parent = viewW.getParent();
            viewW = parent instanceof View ? (View) parent : null;
        }
        return false;
    }

    private final Boolean Z0(View view, View view2, View view3) {
        if (AbstractC2855l.b(view3, view2)) {
            return Boolean.TRUE;
        }
        if (AbstractC2855l.b(view3, view)) {
            return Boolean.FALSE;
        }
        if (!(view3 instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view3;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            Boolean boolZ0 = Z0(view, view2, f6661S.c(viewGroup, i10));
            if (boolZ0 != null) {
                return boolZ0;
            }
        }
        return null;
    }

    static /* synthetic */ Boolean a1(m mVar, View view, View view2, View view3, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            view3 = view.getRootView();
        }
        return mVar.Z0(view, view2, view3);
    }

    @Override // J6.AbstractC1274d
    public boolean K0(AbstractC1274d handler) {
        AbstractC2855l.g(handler, "handler");
        if (!(handler instanceof m) || ((m) handler).Y0(this)) {
            return super.K0(handler);
        }
        View viewW = handler.W();
        AbstractC2855l.d(viewW);
        View viewW2 = W();
        AbstractC2855l.d(viewW2);
        Boolean boolA1 = a1(this, viewW, viewW2, null, 4, null);
        AbstractC2855l.d(boolA1);
        return boolA1.booleanValue();
    }

    @Override // J6.AbstractC1274d
    public boolean L0(AbstractC1274d handler) {
        AbstractC2855l.g(handler, "handler");
        if (((handler instanceof m) && (Y0(handler) || ((m) handler).Y0(this))) || (handler instanceof k.b)) {
            return true;
        }
        return super.L0(handler);
    }

    @Override // J6.AbstractC1274d
    public boolean M0(AbstractC1274d handler) {
        AbstractC2855l.g(handler, "handler");
        if ((handler instanceof m) && !Y0(handler) && !((m) handler).Y0(this)) {
            View viewW = W();
            AbstractC2855l.d(viewW);
            View viewW2 = handler.W();
            AbstractC2855l.d(viewW2);
            Boolean boolA1 = a1(this, viewW, viewW2, null, 4, null);
            if (boolA1 != null) {
                return boolA1.booleanValue();
            }
        }
        return super.M0(handler);
    }

    public final z X0() {
        return this.f6664Q;
    }

    @Override // J6.AbstractC1274d
    protected void l0(MotionEvent event, MotionEvent sourceEvent) {
        AbstractC2855l.g(event, "event");
        AbstractC2855l.g(sourceEvent, "sourceEvent");
        if (event.getAction() == 0) {
            Handler handler = this.f6662O;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.f6662O = null;
            return;
        }
        if (event.getAction() != 1 || f0()) {
            return;
        }
        V0();
    }

    @Override // J6.AbstractC1274d
    protected void m0(MotionEvent event, MotionEvent sourceEvent) {
        AbstractC2855l.g(event, "event");
        AbstractC2855l.g(sourceEvent, "sourceEvent");
        if (event.getAction() == 10) {
            if (this.f6662O == null) {
                this.f6662O = new Handler(Looper.getMainLooper());
            }
            Handler handler = this.f6662O;
            AbstractC2855l.d(handler);
            handler.postDelayed(this.f6663P, 4L);
            return;
        }
        if (!f0()) {
            V0();
            return;
        }
        if (S() == 4 && event.getToolType(0) == 2) {
            this.f6664Q = z.f6795f.a(event);
            return;
        }
        if (S() == 0) {
            if (event.getAction() == 7 || event.getAction() == 9) {
                p();
                k();
            }
        }
    }

    @Override // J6.AbstractC1274d
    protected void o0() {
        super.o0();
        this.f6664Q = new z(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 31, null);
    }
}
