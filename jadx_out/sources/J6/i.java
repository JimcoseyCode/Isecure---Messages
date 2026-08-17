package J6;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import com.facebook.react.uimanager.RootView;
import com.facebook.react.uimanager.ViewDefaults;
import com.swmansion.gesturehandler.react.k;
import i7.C2735B;
import i7.C2750m;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f6638n = new a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final PointF f6639o = new PointF();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final float[] f6640p = new float[2];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Matrix f6641q = new Matrix();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final float[] f6642r = new float[2];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Comparator f6643s = new Comparator() { // from class: J6.f
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return i.t((AbstractC1274d) obj, (AbstractC1274d) obj2);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ViewGroup f6644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f6645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final D f6646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ViewGroup f6647d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f6648e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayList f6649f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayList f6650g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ArrayList f6651h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final HashSet f6652i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f6653j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f6654k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f6655l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f6656m;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean h(AbstractC1274d abstractC1274d, AbstractC1274d abstractC1274d2) {
            return abstractC1274d == abstractC1274d2 || abstractC1274d.L0(abstractC1274d2) || abstractC1274d2.L0(abstractC1274d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean i(int i10) {
            return i10 == 3 || i10 == 1 || i10 == 5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean j(float f10, float f11, View view) {
            return 0.0f <= f10 && f10 <= ((float) view.getWidth()) && 0.0f <= f11 && f11 <= ((float) view.getHeight());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean k(AbstractC1274d abstractC1274d, AbstractC1274d abstractC1274d2) {
            if (!abstractC1274d.Y(abstractC1274d2) || h(abstractC1274d, abstractC1274d2)) {
                return false;
            }
            if (abstractC1274d == abstractC1274d2) {
                return true;
            }
            if (abstractC1274d.a0() || abstractC1274d.S() == 4) {
                return abstractC1274d.K0(abstractC1274d2);
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean l(AbstractC1274d abstractC1274d, AbstractC1274d abstractC1274d2) {
            if (abstractC1274d != abstractC1274d2) {
                return abstractC1274d.N0(abstractC1274d2) || abstractC1274d2.M0(abstractC1274d);
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean m(View view, float[] fArr) {
            return !((view instanceof ViewGroup) && view.getBackground() == null) && j(fArr[0], fArr[1], view);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void n(float f10, float f11, ViewGroup viewGroup, View view, PointF pointF) {
            float scrollX = (f10 + viewGroup.getScrollX()) - view.getLeft();
            float scrollY = (f11 + viewGroup.getScrollY()) - view.getTop();
            Matrix matrix = view.getMatrix();
            if (!matrix.isIdentity()) {
                float[] fArr = i.f6640p;
                fArr[0] = scrollX;
                fArr[1] = scrollY;
                matrix.invert(i.f6641q);
                i.f6641q.mapPoints(fArr);
                float f12 = fArr[0];
                scrollY = fArr[1];
                scrollX = f12;
            }
            pointF.set(scrollX, scrollY);
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6657a;

        static {
            int[] iArr = new int[v.values().length];
            try {
                iArr[v.f6744g.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[v.f6746i.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[v.f6745h.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[v.f6747j.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f6657a = iArr;
        }
    }

    public i(ViewGroup wrapperView, j handlerRegistry, D viewConfigHelper, ViewGroup rootView) {
        AbstractC2855l.g(wrapperView, "wrapperView");
        AbstractC2855l.g(handlerRegistry, "handlerRegistry");
        AbstractC2855l.g(viewConfigHelper, "viewConfigHelper");
        AbstractC2855l.g(rootView, "rootView");
        this.f6644a = wrapperView;
        this.f6645b = handlerRegistry;
        this.f6646c = viewConfigHelper;
        this.f6647d = rootView;
        this.f6649f = new ArrayList();
        this.f6650g = new ArrayList();
        this.f6651h = new ArrayList();
        this.f6652i = new HashSet();
    }

    private final void C(AbstractC1274d abstractC1274d, View view) {
        if (this.f6649f.contains(abstractC1274d)) {
            return;
        }
        this.f6649f.add(abstractC1274d);
        abstractC1274d.w0(false);
        abstractC1274d.x0(false);
        abstractC1274d.v0(ViewDefaults.NUMBER_OF_LINES);
        abstractC1274d.q0(view, this);
    }

    private final boolean D(View view, float[] fArr, int i10, MotionEvent motionEvent) {
        boolean z10;
        ArrayList arrayListA = this.f6645b.a(view);
        if (arrayListA != null) {
            synchronized (arrayListA) {
                try {
                    Iterator it = arrayListA.iterator();
                    AbstractC2855l.f(it, "iterator(...)");
                    z10 = false;
                    while (it.hasNext()) {
                        AbstractC1274d abstractC1274d = (AbstractC1274d) it.next();
                        if (abstractC1274d.d0() && abstractC1274d.g0(view, fArr[0], fArr[1]) && !I(abstractC1274d, motionEvent)) {
                            C(abstractC1274d, view);
                            abstractC1274d.O0(i10);
                            z10 = true;
                        }
                    }
                    C2735B c2735b = C2735B.f28704a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            z10 = false;
        }
        float width = view.getWidth();
        float f10 = fArr[0];
        if (0.0f <= f10 && f10 <= width) {
            float height = view.getHeight();
            float f11 = fArr[1];
            if (0.0f <= f11 && f11 <= height && y(view) && p(view, fArr, i10)) {
                return true;
            }
        }
        return z10;
    }

    private final void E() {
        if (this.f6653j || this.f6654k != 0) {
            this.f6655l = true;
        } else {
            l();
        }
    }

    private final boolean G(AbstractC1274d abstractC1274d) {
        ArrayList<AbstractC1274d> arrayList = this.f6649f;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        for (AbstractC1274d abstractC1274d2 : arrayList) {
            if (abstractC1274d.Y(abstractC1274d2) && abstractC1274d2.S() == 4 && !f6638n.h(abstractC1274d, abstractC1274d2) && abstractC1274d.c0(abstractC1274d2)) {
                return true;
            }
        }
        return false;
    }

    private final boolean H(AbstractC1274d abstractC1274d) {
        ArrayList<AbstractC1274d> arrayList = this.f6649f;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        for (AbstractC1274d abstractC1274d2 : arrayList) {
            if (f6638n.l(abstractC1274d, abstractC1274d2) && abstractC1274d2.S() == 5) {
                return true;
            }
        }
        return false;
    }

    private final boolean I(AbstractC1274d abstractC1274d, MotionEvent motionEvent) {
        return ((abstractC1274d instanceof m) || (abstractC1274d instanceof k.b) || !com.swmansion.gesturehandler.react.a.c(motionEvent)) ? false : true;
    }

    private final boolean J(View view) {
        return (view instanceof com.swmansion.gesturehandler.react.l) && !AbstractC2855l.b(view, this.f6644a) && ((com.swmansion.gesturehandler.react.l) view).d();
    }

    private final boolean M(View view, float[] fArr, int i10, MotionEvent motionEvent) {
        if (J(view)) {
            return false;
        }
        int i11 = b.f6657a[this.f6646c.a(view).ordinal()];
        if (i11 == 1) {
            return false;
        }
        if (i11 == 2) {
            return D(view, fArr, i10, motionEvent) || f6638n.m(view, fArr);
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return D(view, fArr, i10, motionEvent) || (view instanceof ViewGroup ? r((ViewGroup) view, fArr, i10, motionEvent) : false) || f6638n.m(view, fArr);
            }
            throw new C2750m();
        }
        if (!(view instanceof ViewGroup)) {
            if (view instanceof EditText) {
                return D(view, fArr, i10, motionEvent);
            }
            return false;
        }
        boolean zR = r((ViewGroup) view, fArr, i10, motionEvent);
        if (zR) {
            D(view, fArr, i10, motionEvent);
        }
        return zR;
    }

    private final void N(AbstractC1274d abstractC1274d) {
        if (H(abstractC1274d) || G(abstractC1274d)) {
            abstractC1274d.q();
        } else if (u(abstractC1274d)) {
            h(abstractC1274d);
        } else {
            z(abstractC1274d);
            abstractC1274d.x0(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B g(AbstractC1274d abstractC1274d) {
        abstractC1274d.p();
        abstractC1274d.k();
        abstractC1274d.B();
        return C2735B.f28704a;
    }

    private final void h(AbstractC1274d abstractC1274d) {
        if (this.f6650g.contains(abstractC1274d)) {
            return;
        }
        this.f6650g.add(abstractC1274d);
        this.f6652i.add(Integer.valueOf(abstractC1274d.T()));
        abstractC1274d.x0(true);
        int i10 = this.f6656m;
        this.f6656m = i10 + 1;
        abstractC1274d.v0(i10);
    }

    private final boolean i(View view) {
        return view.getVisibility() == 0 && view.getAlpha() >= this.f6648e;
    }

    private final void j() {
        Iterator it = AbstractC2800q.P0(AbstractC2800q.O(this.f6650g)).iterator();
        while (it.hasNext()) {
            ((AbstractC1274d) it.next()).q();
        }
        this.f6651h.clear();
        this.f6651h.addAll(this.f6649f);
        Iterator it2 = AbstractC2800q.O(this.f6649f).iterator();
        while (it2.hasNext()) {
            ((AbstractC1274d) it2.next()).q();
        }
    }

    private final void k() {
        for (AbstractC1274d abstractC1274d : AbstractC2800q.P0(this.f6650g)) {
            if (!abstractC1274d.a0()) {
                this.f6650g.remove(abstractC1274d);
                this.f6652i.remove(Integer.valueOf(abstractC1274d.T()));
            }
        }
    }

    private final void l() {
        for (AbstractC1274d abstractC1274d : AbstractC2800q.O(this.f6649f)) {
            if (f6638n.i(abstractC1274d.S()) && !abstractC1274d.a0()) {
                abstractC1274d.r0();
                abstractC1274d.w0(false);
                abstractC1274d.x0(false);
                abstractC1274d.v0(ViewDefaults.NUMBER_OF_LINES);
            }
        }
        AbstractC2800q.G(this.f6649f, new Function1() { // from class: J6.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(i.m((AbstractC1274d) obj));
            }
        });
        this.f6655l = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(AbstractC1274d it) {
        AbstractC2855l.g(it, "it");
        return f6638n.i(it.S()) && !it.a0();
    }

    private final void n(AbstractC1274d abstractC1274d, MotionEvent motionEvent) {
        if (!x(abstractC1274d.W())) {
            abstractC1274d.q();
            return;
        }
        if (abstractC1274d.S0(motionEvent)) {
            int actionMasked = motionEvent.getActionMasked();
            View viewW = abstractC1274d.W();
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            AbstractC2855l.f(motionEventObtain, "obtain(...)");
            MotionEvent motionEventK = K(viewW, motionEventObtain);
            if (abstractC1274d.N() && abstractC1274d.S() != 0) {
                abstractC1274d.R0(motionEventK, motionEvent);
            }
            if (!abstractC1274d.a0() || actionMasked != 2) {
                boolean z10 = abstractC1274d.S() == 0;
                abstractC1274d.X(motionEventK, motionEvent);
                if (abstractC1274d.Z()) {
                    if (abstractC1274d.R()) {
                        abstractC1274d.H0(false);
                        abstractC1274d.t0();
                    }
                    abstractC1274d.v(motionEventK);
                }
                if (abstractC1274d.N() && z10) {
                    abstractC1274d.R0(motionEventK, motionEvent);
                }
                if (actionMasked == 1 || actionMasked == 6 || actionMasked == 10) {
                    abstractC1274d.P0(motionEventK.getPointerId(motionEventK.getActionIndex()));
                }
            }
            motionEventK.recycle();
        }
    }

    private final void o(MotionEvent motionEvent) {
        this.f6651h.clear();
        this.f6651h.addAll(this.f6649f);
        AbstractC2800q.y(this.f6651h, f6643s);
        Iterator it = this.f6651h.iterator();
        AbstractC2855l.f(it, "iterator(...)");
        while (it.hasNext()) {
            n((AbstractC1274d) it.next(), motionEvent);
        }
    }

    private final boolean p(View view, float[] fArr, int i10) {
        boolean z10 = false;
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof ViewGroup) {
                if ((parent instanceof com.swmansion.gesturehandler.react.l) && ((com.swmansion.gesturehandler.react.l) parent).d()) {
                    break;
                }
                ViewGroup viewGroup = (ViewGroup) parent;
                ArrayList arrayListA = this.f6645b.a((View) parent);
                if (arrayListA != null) {
                    synchronized (arrayListA) {
                        try {
                            Iterator it = arrayListA.iterator();
                            AbstractC2855l.f(it, "iterator(...)");
                            while (it.hasNext()) {
                                AbstractC1274d abstractC1274d = (AbstractC1274d) it.next();
                                if (abstractC1274d.d0() && abstractC1274d.g0(view, fArr[0], fArr[1])) {
                                    C(abstractC1274d, viewGroup);
                                    abstractC1274d.O0(i10);
                                    z10 = true;
                                }
                            }
                            C2735B c2735b = C2735B.f28704a;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } else {
                    continue;
                }
            }
        }
        return z10;
    }

    private final void q(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        float[] fArr = f6642r;
        fArr[0] = motionEvent.getX(actionIndex);
        fArr[1] = motionEvent.getY(actionIndex);
        M(this.f6644a, fArr, pointerId, motionEvent);
        r(this.f6644a, fArr, pointerId, motionEvent);
    }

    private final boolean r(ViewGroup viewGroup, float[] fArr, int i10, MotionEvent motionEvent) {
        ViewGroup viewGroup2;
        if (J(viewGroup)) {
            return false;
        }
        int childCount = viewGroup.getChildCount() - 1;
        while (-1 < childCount) {
            View viewC = this.f6646c.c(viewGroup, childCount);
            if (i(viewC)) {
                PointF pointF = f6639o;
                a aVar = f6638n;
                viewGroup2 = viewGroup;
                aVar.n(fArr[0], fArr[1], viewGroup2, viewC, pointF);
                float f10 = fArr[0];
                float f11 = fArr[1];
                fArr[0] = pointF.x;
                fArr[1] = pointF.y;
                boolean zM = (!w(viewC) || aVar.j(fArr[0], fArr[1], viewC)) ? M(viewC, fArr, i10, motionEvent) : false;
                fArr[0] = f10;
                fArr[1] = f11;
                if (zM) {
                    return true;
                }
            } else {
                viewGroup2 = viewGroup;
            }
            childCount--;
            viewGroup = viewGroup2;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int t(AbstractC1274d abstractC1274d, AbstractC1274d abstractC1274d2) {
        if ((abstractC1274d.Z() && abstractC1274d2.Z()) || (abstractC1274d.a0() && abstractC1274d2.a0())) {
            return Integer.signum(abstractC1274d2.G() - abstractC1274d.G());
        }
        if (abstractC1274d.Z()) {
            return -1;
        }
        if (abstractC1274d2.Z()) {
            return 1;
        }
        if (abstractC1274d.a0()) {
            return -1;
        }
        return abstractC1274d2.a0() ? 1 : 0;
    }

    private final boolean u(AbstractC1274d abstractC1274d) {
        ArrayList<AbstractC1274d> arrayList = this.f6649f;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        for (AbstractC1274d abstractC1274d2 : arrayList) {
            a aVar = f6638n;
            if (!aVar.i(abstractC1274d2.S()) && aVar.l(abstractC1274d, abstractC1274d2)) {
                return true;
            }
        }
        return false;
    }

    private final boolean w(View view) {
        return !(view instanceof ViewGroup) || this.f6646c.b((ViewGroup) view);
    }

    private final boolean x(View view) {
        if (view == null) {
            return false;
        }
        if (view == this.f6644a) {
            return true;
        }
        ViewParent parent = view.getParent();
        while (parent != null && parent != this.f6644a) {
            parent = parent.getParent();
        }
        return parent == this.f6644a;
    }

    private final boolean y(View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return false;
        }
        Matrix matrix = view.getMatrix();
        float[] fArr = f6640p;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        matrix.mapPoints(fArr);
        float left = fArr[0] + view.getLeft();
        float top = fArr[1] + view.getTop();
        return left < 0.0f || left + ((float) view.getWidth()) > ((float) viewGroup.getWidth()) || top < 0.0f || top + ((float) view.getHeight()) > ((float) viewGroup.getHeight());
    }

    private final void z(AbstractC1274d abstractC1274d) {
        int iS = abstractC1274d.S();
        abstractC1274d.x0(false);
        abstractC1274d.w0(true);
        abstractC1274d.H0(true);
        int i10 = this.f6656m;
        this.f6656m = i10 + 1;
        abstractC1274d.v0(i10);
        for (AbstractC1274d abstractC1274d2 : AbstractC2800q.O(this.f6649f)) {
            if (f6638n.k(abstractC1274d2, abstractC1274d)) {
                abstractC1274d2.q();
            }
        }
        for (AbstractC1274d abstractC1274d3 : AbstractC2800q.O(this.f6650g)) {
            if (f6638n.k(abstractC1274d3, abstractC1274d)) {
                abstractC1274d3.x0(false);
            }
        }
        k();
        if (iS == 1 || iS == 3) {
            return;
        }
        abstractC1274d.w(4, 2);
        if (iS != 4) {
            abstractC1274d.w(5, 4);
            if (iS != 5) {
                abstractC1274d.w(0, 5);
            }
        }
    }

    public final void A(AbstractC1274d handler, int i10, int i11) {
        AbstractC2855l.g(handler, "handler");
        this.f6654k++;
        if (f6638n.i(i10)) {
            for (AbstractC1274d abstractC1274d : AbstractC2800q.P0(this.f6650g)) {
                if (f6638n.l(abstractC1274d, handler) && this.f6652i.contains(Integer.valueOf(abstractC1274d.T()))) {
                    if (i10 == 5) {
                        abstractC1274d.q();
                        if (abstractC1274d.S() == 5) {
                            abstractC1274d.w(3, 2);
                        }
                        abstractC1274d.x0(false);
                    } else {
                        N(abstractC1274d);
                    }
                }
            }
            k();
        }
        if (i10 == 4) {
            N(handler);
        } else if (i11 == 4 || i11 == 5) {
            if (handler.Z()) {
                handler.w(i10, i11);
            } else if (i11 == 4 && (i10 == 3 || i10 == 1)) {
                handler.w(i10, 2);
            }
        } else if (i11 != 0 || i10 != 3) {
            handler.w(i10, i11);
        }
        this.f6654k--;
        E();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean B(MotionEvent event) {
        AbstractC2855l.g(event, "event");
        this.f6653j = true;
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            q(event);
        } else if (actionMasked == 3) {
            j();
        } else if (actionMasked == 5 || actionMasked == 7) {
        }
        o(event);
        this.f6653j = false;
        if (this.f6655l && this.f6654k == 0) {
            l();
        }
        if ((actionMasked == 1 || actionMasked == 3 || actionMasked == 10) && this.f6649f.isEmpty()) {
            ViewGroup viewGroup = this.f6647d;
            if (viewGroup instanceof RootView) {
                ((RootView) viewGroup).onChildEndedNativeGesture(viewGroup, event);
            }
        }
        return true;
    }

    public final void F(float f10) {
        this.f6648e = f10;
    }

    public final MotionEvent K(View view, MotionEvent event) {
        AbstractC2855l.g(event, "event");
        if (view != null) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (!AbstractC2855l.b(viewGroup, this.f6644a)) {
                K(viewGroup, event);
            }
            if (viewGroup != null) {
                event.setLocation((event.getX() + viewGroup.getScrollX()) - view.getLeft(), (event.getY() + viewGroup.getScrollY()) - view.getTop());
            }
            if (!view.getMatrix().isIdentity()) {
                Matrix matrix = view.getMatrix();
                Matrix matrix2 = f6641q;
                matrix.invert(matrix2);
                event.transform(matrix2);
            }
        }
        return event;
    }

    public final PointF L(View view, PointF point) {
        AbstractC2855l.g(point, "point");
        if (view != null) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (!AbstractC2855l.b(viewGroup, this.f6644a)) {
                L(viewGroup, point);
            }
            if (viewGroup != null) {
                point.x += viewGroup.getScrollX() - view.getLeft();
                point.y += viewGroup.getScrollY() - view.getTop();
            }
            if (!view.getMatrix().isIdentity()) {
                Matrix matrix = view.getMatrix();
                Matrix matrix2 = f6641q;
                matrix.invert(matrix2);
                float[] fArr = f6642r;
                fArr[0] = point.x;
                fArr[1] = point.y;
                matrix2.mapPoints(fArr);
                point.x = fArr[0];
                point.y = fArr[1];
            }
        }
        return point;
    }

    public final void f(View view) {
        AbstractC2855l.g(view, "view");
        ArrayList<AbstractC1274d> arrayListA = this.f6645b.a(view);
        if (arrayListA != null) {
            for (final AbstractC1274d abstractC1274d : arrayListA) {
                if (abstractC1274d instanceof q) {
                    C(abstractC1274d, view);
                    abstractC1274d.T0(new InterfaceC3487a() { // from class: J6.h
                        @Override // w7.InterfaceC3487a
                        public final Object invoke() {
                            return i.g(abstractC1274d);
                        }
                    });
                }
            }
        }
    }

    public final ArrayList s(View view) {
        AbstractC2855l.g(view, "view");
        return this.f6645b.a(view);
    }

    public final boolean v() {
        ArrayList arrayList = this.f6649f;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((AbstractC1274d) it.next()).S() == 4) {
                return true;
            }
        }
        return false;
    }
}
