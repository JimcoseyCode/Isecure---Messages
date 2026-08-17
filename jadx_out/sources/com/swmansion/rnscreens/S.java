package com.swmansion.rnscreens;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.swmansion.rnscreens.C2311y;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class S extends A {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final a f25024x = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ArrayList f25025n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Set f25026o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List f25027p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final List f25028q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private List f25029r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Y f25030s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f25031t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private W6.a f25032u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private List f25033v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f25034w;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean b(G g10, C2311y.d dVar) {
            if (dVar == null) {
                dVar = g10.j().getStackAnimation();
            }
            return (Build.VERSION.SDK_INT >= 33 || dVar == C2311y.d.f25445j || dVar == C2311y.d.f25448m || dVar == C2311y.d.f25449n || dVar == C2311y.d.f25450o) && dVar != C2311y.d.f25443h;
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Canvas f25035a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private View f25036b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f25037c;

        public b() {
        }

        public final void a() {
            S.this.c0(this);
            this.f25035a = null;
            this.f25036b = null;
            this.f25037c = 0L;
        }

        public final Canvas b() {
            return this.f25035a;
        }

        public final View c() {
            return this.f25036b;
        }

        public final long d() {
            return this.f25037c;
        }

        public final void e(Canvas canvas) {
            this.f25035a = canvas;
        }

        public final void f(View view) {
            this.f25036b = view;
        }

        public final void g(long j10) {
            this.f25037c = j10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25039a;

        static {
            int[] iArr = new int[C2311y.e.values().length];
            try {
                iArr[C2311y.e.f25456j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f25039a = iArr;
        }
    }

    public S(Context context) {
        super(context);
        this.f25025n = new ArrayList();
        this.f25026o = new HashSet();
        this.f25027p = new ArrayList();
        this.f25028q = new ArrayList();
        this.f25029r = new ArrayList();
        this.f25033v = new ArrayList();
    }

    private final void O() {
        int surfaceId = UIManagerHelper.getSurfaceId(this);
        Context context = getContext();
        AbstractC2855l.e(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new M6.t(surfaceId, getId()));
        }
    }

    private final void P() {
        List<b> list = this.f25029r;
        this.f25029r = new ArrayList();
        for (b bVar : list) {
            bVar.a();
            this.f25028q.add(bVar);
        }
    }

    private final b Q() {
        if (this.f25028q.isEmpty()) {
            return new b();
        }
        List list = this.f25028q;
        return (b) list.remove(AbstractC2800q.l(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean R(S s10, Y wrapper) {
        AbstractC2855l.g(wrapper, "wrapper");
        return !s10.f24976g.contains(wrapper) || s10.f25026o.contains(wrapper);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean S(kotlin.jvm.internal.C c10, G it) {
        AbstractC2855l.g(it, "it");
        return it != c10.f29371g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean T(kotlin.jvm.internal.C c10, S s10, G it) {
        AbstractC2855l.g(it, "it");
        return !(it == c10.f29371g || AbstractC2800q.X(s10.f25026o, it)) || it.j().getActivityState() == C2311y.a.f25433g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean U(kotlin.jvm.internal.C c10, G it) {
        AbstractC2855l.g(it, "it");
        return it != c10.f29371g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V(G g10) {
        C2311y c2311yJ;
        if (g10 == null || (c2311yJ = g10.j()) == null) {
            return;
        }
        c2311yJ.bringToFront();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Y W(G it) {
        AbstractC2855l.g(it, "it");
        return (Y) it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean X(G it) {
        AbstractC2855l.g(it, "it");
        return it.j().getActivityState() == C2311y.a.f25433g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Y(S s10, G it) {
        AbstractC2855l.g(it, "it");
        return (AbstractC2800q.X(s10.f25026o, it) || it.j().getActivityState() == C2311y.a.f25433g) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Z(G it) {
        AbstractC2855l.g(it, "it");
        return it.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a0(kotlin.jvm.internal.C c10, Y it) {
        AbstractC2855l.g(it, "it");
        return it != c10.f29371g && it.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c0(b bVar) {
        Canvas canvasB = bVar.b();
        AbstractC2855l.d(canvasB);
        super.drawChild(canvasB, bVar.c(), bVar.d());
    }

    private final void e0(G g10) {
        Y y10;
        if (this.f24976g.size() > 1 && g10 != null && (y10 = this.f25030s) != null && y10.b()) {
            ArrayList arrayList = this.f24976g;
            for (G g11 : AbstractC2800q.N(AbstractC2800q.F0(arrayList, B7.d.p(0, arrayList.size() - 1)))) {
                g11.j().h(4);
                if (AbstractC2855l.b(g11, g10)) {
                    break;
                }
            }
        }
        C2311y topScreen = getTopScreen();
        if (topScreen != null) {
            topScreen.h(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.swmansion.rnscreens.A
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public Y c(C2311y screen) {
        AbstractC2855l.g(screen, "screen");
        return c.f25039a[screen.getStackPresentation().ordinal()] == 1 ? new X(screen) : new X(screen);
    }

    public final void N(Y screenFragment) {
        AbstractC2855l.g(screenFragment, "screenFragment");
        this.f25026o.add(screenFragment);
        w();
    }

    public final void b0() {
        if (this.f25031t) {
            return;
        }
        O();
    }

    public final boolean d0() {
        int iNextIndex;
        Iterator it = this.f24976g.iterator();
        int i10 = 0;
        while (true) {
            iNextIndex = -1;
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (((G) it.next()).j().getActivityState() != C2311y.a.f25433g) {
                break;
            }
            i10++;
        }
        ArrayList arrayList = this.f24976g;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            if (((G) listIterator.previous()).j().getActivityState() != C2311y.a.f25433g) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        if (i10 < 0 || iNextIndex <= i10) {
            return false;
        }
        int i11 = i10 + 1;
        if (i11 <= iNextIndex) {
            while (true) {
                p(((G) this.f24976g.get(i11)).j());
                if (i11 == iNextIndex) {
                    break;
                }
                i11++;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        AbstractC2855l.g(canvas, "canvas");
        super.dispatchDraw(canvas);
        W6.a aVar = this.f25032u;
        if (aVar != null) {
            aVar.a(this.f25029r);
        }
        P();
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View child, long j10) {
        AbstractC2855l.g(canvas, "canvas");
        AbstractC2855l.g(child, "child");
        List list = this.f25029r;
        b bVarQ = Q();
        bVarQ.e(canvas);
        bVarQ.f(child);
        bVarQ.g(j10);
        list.add(bVarQ);
        return true;
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        W6.a aVar;
        AbstractC2855l.g(view, "view");
        super.endViewTransition(view);
        this.f25033v.remove(view);
        if (this.f25033v.isEmpty() && (aVar = this.f25032u) != null) {
            aVar.disable();
        }
        if (this.f25031t) {
            this.f25031t = false;
            O();
        }
    }

    public final ArrayList<Y> getFragments() {
        return this.f25025n;
    }

    public final boolean getGoingForward() {
        return this.f25034w;
    }

    public final C2311y getRootScreen() {
        Object next;
        C2311y c2311yJ;
        Iterator it = this.f24976g.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!AbstractC2800q.X(this.f25026o, (G) next)) {
                break;
            }
        }
        G g10 = (G) next;
        if (g10 == null || (c2311yJ = g10.j()) == null) {
            throw new IllegalStateException("[RNScreens] Stack has no root screen set");
        }
        return c2311yJ;
    }

    public final List<String> getScreenIds() {
        ArrayList arrayList = this.f24976g;
        ArrayList arrayList2 = new ArrayList(AbstractC2800q.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((G) it.next()).j().getScreenId());
        }
        return arrayList2;
    }

    @Override // com.swmansion.rnscreens.A
    public C2311y getTopScreen() {
        Y y10 = this.f25030s;
        if (y10 != null) {
            return y10.j();
        }
        return null;
    }

    @Override // com.swmansion.rnscreens.A
    public boolean n(G g10) {
        return super.n(g10) && !AbstractC2800q.X(this.f25026o, g10);
    }

    @Override // com.swmansion.rnscreens.A
    protected void o() {
        Iterator it = this.f25025n.iterator();
        while (it.hasNext()) {
            ((Y) it.next()).n();
        }
    }

    public final void setGoingForward(boolean z10) {
        this.f25034w = z10;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        W6.a aVar;
        AbstractC2855l.g(view, "view");
        if (!(view instanceof W6.e)) {
            throw new IllegalStateException(("[RNScreens] Unexpected type of ScreenStack direct subview " + view.getClass()).toString());
        }
        super.startViewTransition(view);
        if (((W6.e) view).getFragment$react_native_screens_release().isRemoving()) {
            this.f25033v.add(view);
        }
        if (!this.f25033v.isEmpty() && (aVar = this.f25032u) != null) {
            aVar.enable();
        }
        this.f25031t = true;
    }

    @Override // com.swmansion.rnscreens.A
    public void u() {
        C2311y.d stackAnimation;
        boolean z10;
        C2311y c2311yJ;
        Y y10;
        int iV;
        Object obj;
        C2311y c2311yJ2;
        final kotlin.jvm.internal.C c10 = new kotlin.jvm.internal.C();
        final kotlin.jvm.internal.C c11 = new kotlin.jvm.internal.C();
        this.f25032u = null;
        O8.i iVarY = O8.l.y(AbstractC2800q.V(AbstractC2800q.O(this.f24976g)), new Function1() { // from class: com.swmansion.rnscreens.H
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return Boolean.valueOf(S.Y(this.f25014g, (G) obj2));
            }
        });
        c10.f29371g = O8.l.C(iVarY);
        G g10 = (G) O8.l.C(O8.l.x(iVarY, new Function1() { // from class: com.swmansion.rnscreens.I
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return Boolean.valueOf(S.Z((G) obj2));
            }
        }));
        if (g10 == null || g10 == c10.f29371g) {
            g10 = null;
        }
        c11.f29371g = g10;
        boolean z11 = AbstractC2800q.X(this.f25025n, c10.f29371g) && !AbstractC2800q.X(this.f25027p, c10.f29371g);
        Object obj2 = c10.f29371g;
        Y y11 = this.f25030s;
        boolean z12 = obj2 != y11;
        if (obj2 == null || z11) {
            if (obj2 == null || y11 == null || !z12) {
                stackAnimation = null;
                z10 = true;
            } else {
                stackAnimation = (y11 == null || (c2311yJ = y11.j()) == null) ? null : c2311yJ.getStackAnimation();
                z10 = false;
            }
        } else if (y11 != null) {
            z10 = (y11 != null && this.f24976g.contains(y11)) || (((G) c10.f29371g).j().getReplaceAnimation() == C2311y.c.f25438g);
            if (z10) {
                c2311yJ2 = ((G) c10.f29371g).j();
            } else {
                Y y12 = this.f25030s;
                if (y12 == null || (c2311yJ2 = y12.j()) == null) {
                    stackAnimation = null;
                }
            }
            stackAnimation = c2311yJ2.getStackAnimation();
        } else {
            stackAnimation = C2311y.d.f25443h;
            this.f25034w = true;
            z10 = true;
        }
        this.f25034w = z10;
        if (z10 && (obj = c10.f29371g) != null && f25024x.b((G) obj, stackAnimation) && c11.f29371g == null) {
            this.f25032u = new W6.d();
        } else if (c10.f29371g != null && z11 && (y10 = this.f25030s) != null && y10.b() && !((G) c10.f29371g).b() && (iV = O8.l.v(O8.l.Q(AbstractC2800q.V(AbstractC2800q.O(this.f25025n)), new Function1() { // from class: com.swmansion.rnscreens.J
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                return Boolean.valueOf(S.a0(c10, (Y) obj3));
            }
        }))) > 1) {
            this.f25032u = new W6.c(Math.max((AbstractC2800q.l(this.f25025n) - iV) + 1, 0));
        }
        androidx.fragment.app.I iG = g();
        if (stackAnimation != null) {
            Y6.c.a(iG, stackAnimation, z10);
        }
        Iterator it = O8.l.y(AbstractC2800q.V(this.f25025n), new Function1() { // from class: com.swmansion.rnscreens.K
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                return Boolean.valueOf(S.R(this.f25016g, (Y) obj3));
            }
        }).iterator();
        while (it.hasNext()) {
            iG.n(((Y) it.next()).f());
        }
        Iterator it2 = O8.l.y(O8.l.Q(AbstractC2800q.V(this.f24976g), new Function1() { // from class: com.swmansion.rnscreens.L
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                return Boolean.valueOf(S.S(c11, (G) obj3));
            }
        }), new Function1() { // from class: com.swmansion.rnscreens.M
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                return Boolean.valueOf(S.T(c10, this, (G) obj3));
            }
        }).iterator();
        while (it2.hasNext()) {
            iG.n(((G) it2.next()).f());
        }
        Object obj3 = c11.f29371g;
        if (obj3 == null || ((G) obj3).f().isAdded()) {
            Object obj4 = c10.f29371g;
            if (obj4 != null && !((G) obj4).f().isAdded()) {
                if (L6.r.c(((G) c10.f29371g).j())) {
                    ((G) c10.f29371g).f().postponeEnterTransition();
                }
                iG.b(getId(), ((G) c10.f29371g).f());
            }
        } else {
            final G g11 = (G) c10.f29371g;
            Iterator it3 = O8.l.x(AbstractC2800q.V(this.f24976g), new Function1() { // from class: com.swmansion.rnscreens.N
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj5) {
                    return Boolean.valueOf(S.U(c11, (G) obj5));
                }
            }).iterator();
            while (it3.hasNext()) {
                iG.b(getId(), ((G) it3.next()).f()).q(new Runnable() { // from class: com.swmansion.rnscreens.O
                    @Override // java.lang.Runnable
                    public final void run() {
                        S.V(g11);
                    }
                });
            }
        }
        Object obj5 = c10.f29371g;
        this.f25030s = obj5 instanceof Y ? (Y) obj5 : null;
        this.f25025n.clear();
        AbstractC2800q.z(this.f25025n, O8.l.J(AbstractC2800q.V(this.f24976g), new Function1() { // from class: com.swmansion.rnscreens.P
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj6) {
                return S.W((G) obj6);
            }
        }));
        this.f25027p = O8.l.S(O8.l.y(AbstractC2800q.V(this.f24976g), new Function1() { // from class: com.swmansion.rnscreens.Q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj6) {
                return Boolean.valueOf(S.X((G) obj6));
            }
        }));
        e0((G) c11.f29371g);
        iG.k();
    }

    @Override // com.swmansion.rnscreens.A
    public void x() {
        this.f25026o.clear();
        super.x();
    }

    @Override // com.swmansion.rnscreens.A
    public void z(int i10) {
        Set set = this.f25026o;
        kotlin.jvm.internal.I.a(set).remove(m(i10));
        super.z(i10);
    }
}
