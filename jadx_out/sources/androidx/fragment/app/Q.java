package androidx.fragment.app;

import D0.d;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.AbstractC1658a0;
import androidx.fragment.app.Q;
import i7.C2735B;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class Q {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f17413f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ViewGroup f17414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f17415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f17416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f17417d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f17418e;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Q a(ViewGroup container, FragmentManager fragmentManager) {
            AbstractC2855l.g(container, "container");
            AbstractC2855l.g(fragmentManager, "fragmentManager");
            T tB0 = fragmentManager.B0();
            AbstractC2855l.f(tB0, "fragmentManager.specialEffectsControllerFactory");
            return b(container, tB0);
        }

        public final Q b(ViewGroup container, T factory) {
            AbstractC2855l.g(container, "container");
            AbstractC2855l.g(factory, "factory");
            Object tag = container.getTag(Y0.b.f12602b);
            if (tag instanceof Q) {
                return (Q) tag;
            }
            Q qA = factory.a(container);
            AbstractC2855l.f(qA, "factory.createController(container)");
            container.setTag(Y0.b.f12602b, qA);
            return qA;
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class b extends c {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final G f17419h;

        /* JADX WARN: Illegal instructions before constructor call */
        public b(c.b finalState, c.a lifecycleImpact, G fragmentStateManager, D0.d cancellationSignal) {
            AbstractC2855l.g(finalState, "finalState");
            AbstractC2855l.g(lifecycleImpact, "lifecycleImpact");
            AbstractC2855l.g(fragmentStateManager, "fragmentStateManager");
            AbstractC2855l.g(cancellationSignal, "cancellationSignal");
            Fragment fragmentK = fragmentStateManager.k();
            AbstractC2855l.f(fragmentK, "fragmentStateManager.fragment");
            super(finalState, lifecycleImpact, fragmentK, cancellationSignal);
            this.f17419h = fragmentStateManager;
        }

        @Override // androidx.fragment.app.Q.c
        public void e() {
            super.e();
            this.f17419h.m();
        }

        @Override // androidx.fragment.app.Q.c
        public void n() {
            if (i() != c.a.ADDING) {
                if (i() == c.a.REMOVING) {
                    Fragment fragmentK = this.f17419h.k();
                    AbstractC2855l.f(fragmentK, "fragmentStateManager.fragment");
                    View viewRequireView = fragmentK.requireView();
                    AbstractC2855l.f(viewRequireView, "fragment.requireView()");
                    if (FragmentManager.J0(2)) {
                        Objects.toString(viewRequireView.findFocus());
                        viewRequireView.toString();
                        fragmentK.toString();
                    }
                    viewRequireView.clearFocus();
                    return;
                }
                return;
            }
            Fragment fragmentK2 = this.f17419h.k();
            AbstractC2855l.f(fragmentK2, "fragmentStateManager.fragment");
            View viewFindFocus = fragmentK2.mView.findFocus();
            if (viewFindFocus != null) {
                fragmentK2.setFocusedView(viewFindFocus);
                if (FragmentManager.J0(2)) {
                    viewFindFocus.toString();
                    fragmentK2.toString();
                }
            }
            View viewRequireView2 = h().requireView();
            AbstractC2855l.f(viewRequireView2, "this.fragment.requireView()");
            if (viewRequireView2.getParent() == null) {
                this.f17419h.b();
                viewRequireView2.setAlpha(0.0f);
            }
            if (viewRequireView2.getAlpha() == 0.0f && viewRequireView2.getVisibility() == 0) {
                viewRequireView2.setVisibility(4);
            }
            viewRequireView2.setAlpha(fragmentK2.getPostOnViewCreatedAlpha());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private b f17420a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private a f17421b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Fragment f17422c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List f17423d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Set f17424e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f17425f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f17426g;

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public enum a {
            NONE,
            ADDING,
            REMOVING
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public enum b {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;


            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final a f17431g = new a(null);

            /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
            public static final class a {
                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final b a(View view) {
                    AbstractC2855l.g(view, "<this>");
                    return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? b.INVISIBLE : b(view.getVisibility());
                }

                public final b b(int i10) {
                    if (i10 == 0) {
                        return b.VISIBLE;
                    }
                    if (i10 == 4) {
                        return b.INVISIBLE;
                    }
                    if (i10 == 8) {
                        return b.GONE;
                    }
                    throw new IllegalArgumentException("Unknown visibility " + i10);
                }

                private a() {
                }
            }

            /* JADX INFO: renamed from: androidx.fragment.app.Q$c$b$b, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
            public /* synthetic */ class C0177b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f17437a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.REMOVED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.VISIBLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.GONE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.INVISIBLE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    f17437a = iArr;
                }
            }

            public static final b k(int i10) {
                return f17431g.b(i10);
            }

            public final void j(View view) {
                AbstractC2855l.g(view, "view");
                int i10 = C0177b.f17437a[ordinal()];
                if (i10 == 1) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        if (FragmentManager.J0(2)) {
                            view.toString();
                            viewGroup.toString();
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i10 == 2) {
                    if (FragmentManager.J0(2)) {
                        Objects.toString(view);
                    }
                    view.setVisibility(0);
                } else if (i10 == 3) {
                    if (FragmentManager.J0(2)) {
                        Objects.toString(view);
                    }
                    view.setVisibility(8);
                } else {
                    if (i10 != 4) {
                        return;
                    }
                    if (FragmentManager.J0(2)) {
                        Objects.toString(view);
                    }
                    view.setVisibility(4);
                }
            }
        }

        /* JADX INFO: renamed from: androidx.fragment.app.Q$c$c, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public /* synthetic */ class C0178c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f17438a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ADDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.REMOVING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f17438a = iArr;
            }
        }

        public c(b finalState, a lifecycleImpact, Fragment fragment, D0.d cancellationSignal) {
            AbstractC2855l.g(finalState, "finalState");
            AbstractC2855l.g(lifecycleImpact, "lifecycleImpact");
            AbstractC2855l.g(fragment, "fragment");
            AbstractC2855l.g(cancellationSignal, "cancellationSignal");
            this.f17420a = finalState;
            this.f17421b = lifecycleImpact;
            this.f17422c = fragment;
            this.f17423d = new ArrayList();
            this.f17424e = new LinkedHashSet();
            cancellationSignal.c(new d.a() { // from class: androidx.fragment.app.S
                @Override // D0.d.a
                public final void onCancel() {
                    Q.c.b(this.f17440a);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(c this$0) {
            AbstractC2855l.g(this$0, "this$0");
            this$0.d();
        }

        public final void c(Runnable listener) {
            AbstractC2855l.g(listener, "listener");
            this.f17423d.add(listener);
        }

        public final void d() {
            if (this.f17425f) {
                return;
            }
            this.f17425f = true;
            if (this.f17424e.isEmpty()) {
                e();
                return;
            }
            Iterator it = AbstractC2800q.S0(this.f17424e).iterator();
            while (it.hasNext()) {
                ((D0.d) it.next()).a();
            }
        }

        public void e() {
            if (this.f17426g) {
                return;
            }
            if (FragmentManager.J0(2)) {
                toString();
            }
            this.f17426g = true;
            Iterator it = this.f17423d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void f(D0.d signal) {
            AbstractC2855l.g(signal, "signal");
            if (this.f17424e.remove(signal) && this.f17424e.isEmpty()) {
                e();
            }
        }

        public final b g() {
            return this.f17420a;
        }

        public final Fragment h() {
            return this.f17422c;
        }

        public final a i() {
            return this.f17421b;
        }

        public final boolean j() {
            return this.f17425f;
        }

        public final boolean k() {
            return this.f17426g;
        }

        public final void l(D0.d signal) {
            AbstractC2855l.g(signal, "signal");
            n();
            this.f17424e.add(signal);
        }

        public final void m(b finalState, a lifecycleImpact) {
            AbstractC2855l.g(finalState, "finalState");
            AbstractC2855l.g(lifecycleImpact, "lifecycleImpact");
            int i10 = C0178c.f17438a[lifecycleImpact.ordinal()];
            if (i10 == 1) {
                if (this.f17420a == b.REMOVED) {
                    if (FragmentManager.J0(2)) {
                        Objects.toString(this.f17422c);
                        Objects.toString(this.f17421b);
                    }
                    this.f17420a = b.VISIBLE;
                    this.f17421b = a.ADDING;
                    return;
                }
                return;
            }
            if (i10 == 2) {
                if (FragmentManager.J0(2)) {
                    Objects.toString(this.f17422c);
                    Objects.toString(this.f17420a);
                    Objects.toString(this.f17421b);
                }
                this.f17420a = b.REMOVED;
                this.f17421b = a.REMOVING;
                return;
            }
            if (i10 == 3 && this.f17420a != b.REMOVED) {
                if (FragmentManager.J0(2)) {
                    Objects.toString(this.f17422c);
                    Objects.toString(this.f17420a);
                    Objects.toString(finalState);
                }
                this.f17420a = finalState;
            }
        }

        public abstract void n();

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + this.f17420a + " lifecycleImpact = " + this.f17421b + " fragment = " + this.f17422c + '}';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17439a;

        static {
            int[] iArr = new int[c.a.values().length];
            try {
                iArr[c.a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f17439a = iArr;
        }
    }

    public Q(ViewGroup container) {
        AbstractC2855l.g(container, "container");
        this.f17414a = container;
        this.f17415b = new ArrayList();
        this.f17416c = new ArrayList();
    }

    private final void c(c.b bVar, c.a aVar, G g10) {
        synchronized (this.f17415b) {
            D0.d dVar = new D0.d();
            Fragment fragmentK = g10.k();
            AbstractC2855l.f(fragmentK, "fragmentStateManager.fragment");
            c cVarL = l(fragmentK);
            if (cVarL != null) {
                cVarL.m(bVar, aVar);
                return;
            }
            final b bVar2 = new b(bVar, aVar, g10, dVar);
            this.f17415b.add(bVar2);
            bVar2.c(new Runnable() { // from class: androidx.fragment.app.O
                @Override // java.lang.Runnable
                public final void run() {
                    Q.d(this.f17409g, bVar2);
                }
            });
            bVar2.c(new Runnable() { // from class: androidx.fragment.app.P
                @Override // java.lang.Runnable
                public final void run() {
                    Q.e(this.f17411g, bVar2);
                }
            });
            C2735B c2735b = C2735B.f28704a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Q this$0, b operation) {
        AbstractC2855l.g(this$0, "this$0");
        AbstractC2855l.g(operation, "$operation");
        if (this$0.f17415b.contains(operation)) {
            c.b bVarG = operation.g();
            View view = operation.h().mView;
            AbstractC2855l.f(view, "operation.fragment.mView");
            bVarG.j(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Q this$0, b operation) {
        AbstractC2855l.g(this$0, "this$0");
        AbstractC2855l.g(operation, "$operation");
        this$0.f17415b.remove(operation);
        this$0.f17416c.remove(operation);
    }

    private final c l(Fragment fragment) {
        Object next;
        Iterator it = this.f17415b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            c cVar = (c) next;
            if (AbstractC2855l.b(cVar.h(), fragment) && !cVar.j()) {
                break;
            }
        }
        return (c) next;
    }

    private final c m(Fragment fragment) {
        Object next;
        Iterator it = this.f17416c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            c cVar = (c) next;
            if (AbstractC2855l.b(cVar.h(), fragment) && !cVar.j()) {
                break;
            }
        }
        return (c) next;
    }

    public static final Q r(ViewGroup viewGroup, FragmentManager fragmentManager) {
        return f17413f.a(viewGroup, fragmentManager);
    }

    public static final Q s(ViewGroup viewGroup, T t10) {
        return f17413f.b(viewGroup, t10);
    }

    private final void u() {
        for (c cVar : this.f17415b) {
            if (cVar.i() == c.a.ADDING) {
                View viewRequireView = cVar.h().requireView();
                AbstractC2855l.f(viewRequireView, "fragment.requireView()");
                cVar.m(c.b.f17431g.b(viewRequireView.getVisibility()), c.a.NONE);
            }
        }
    }

    public final void f(c.b finalState, G fragmentStateManager) {
        AbstractC2855l.g(finalState, "finalState");
        AbstractC2855l.g(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.J0(2)) {
            Objects.toString(fragmentStateManager.k());
        }
        c(finalState, c.a.ADDING, fragmentStateManager);
    }

    public final void g(G fragmentStateManager) {
        AbstractC2855l.g(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.J0(2)) {
            Objects.toString(fragmentStateManager.k());
        }
        c(c.b.GONE, c.a.NONE, fragmentStateManager);
    }

    public final void h(G fragmentStateManager) {
        AbstractC2855l.g(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.J0(2)) {
            Objects.toString(fragmentStateManager.k());
        }
        c(c.b.REMOVED, c.a.REMOVING, fragmentStateManager);
    }

    public final void i(G fragmentStateManager) {
        AbstractC2855l.g(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.J0(2)) {
            Objects.toString(fragmentStateManager.k());
        }
        c(c.b.VISIBLE, c.a.NONE, fragmentStateManager);
    }

    public abstract void j(List list, boolean z10);

    public final void k() {
        if (this.f17418e) {
            return;
        }
        if (!AbstractC1658a0.P(this.f17414a)) {
            n();
            this.f17417d = false;
            return;
        }
        synchronized (this.f17415b) {
            try {
                if (!this.f17415b.isEmpty()) {
                    List<c> listR0 = AbstractC2800q.R0(this.f17416c);
                    this.f17416c.clear();
                    for (c cVar : listR0) {
                        if (FragmentManager.J0(2)) {
                            Objects.toString(cVar);
                        }
                        cVar.d();
                        if (!cVar.k()) {
                            this.f17416c.add(cVar);
                        }
                    }
                    u();
                    List listR02 = AbstractC2800q.R0(this.f17415b);
                    this.f17415b.clear();
                    this.f17416c.addAll(listR02);
                    FragmentManager.J0(2);
                    Iterator it = listR02.iterator();
                    while (it.hasNext()) {
                        ((c) it.next()).n();
                    }
                    j(listR02, this.f17417d);
                    this.f17417d = false;
                    FragmentManager.J0(2);
                }
                C2735B c2735b = C2735B.f28704a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n() {
        FragmentManager.J0(2);
        boolean zP = AbstractC1658a0.P(this.f17414a);
        synchronized (this.f17415b) {
            try {
                u();
                Iterator it = this.f17415b.iterator();
                while (it.hasNext()) {
                    ((c) it.next()).n();
                }
                for (c cVar : AbstractC2800q.R0(this.f17416c)) {
                    if (FragmentManager.J0(2)) {
                        if (!zP) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Container ");
                            sb.append(this.f17414a);
                            sb.append(" is not attached to window. ");
                        }
                        Objects.toString(cVar);
                    }
                    cVar.d();
                }
                for (c cVar2 : AbstractC2800q.R0(this.f17415b)) {
                    if (FragmentManager.J0(2)) {
                        if (!zP) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Container ");
                            sb2.append(this.f17414a);
                            sb2.append(" is not attached to window. ");
                        }
                        Objects.toString(cVar2);
                    }
                    cVar2.d();
                }
                C2735B c2735b = C2735B.f28704a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o() {
        if (this.f17418e) {
            FragmentManager.J0(2);
            this.f17418e = false;
            k();
        }
    }

    public final c.a p(G fragmentStateManager) {
        AbstractC2855l.g(fragmentStateManager, "fragmentStateManager");
        Fragment fragmentK = fragmentStateManager.k();
        AbstractC2855l.f(fragmentK, "fragmentStateManager.fragment");
        c cVarL = l(fragmentK);
        c.a aVarI = cVarL != null ? cVarL.i() : null;
        c cVarM = m(fragmentK);
        c.a aVarI2 = cVarM != null ? cVarM.i() : null;
        int i10 = aVarI == null ? -1 : d.f17439a[aVarI.ordinal()];
        return (i10 == -1 || i10 == 1) ? aVarI2 : aVarI;
    }

    public final ViewGroup q() {
        return this.f17414a;
    }

    public final void t() {
        Object objPrevious;
        synchronized (this.f17415b) {
            try {
                u();
                List list = this.f17415b;
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                    c cVar = (c) objPrevious;
                    c.b.a aVar = c.b.f17431g;
                    View view = cVar.h().mView;
                    AbstractC2855l.f(view, "operation.fragment.mView");
                    c.b bVarA = aVar.a(view);
                    c.b bVarG = cVar.g();
                    c.b bVar = c.b.VISIBLE;
                    if (bVarG == bVar && bVarA != bVar) {
                        break;
                    }
                }
                c cVar2 = (c) objPrevious;
                Fragment fragmentH = cVar2 != null ? cVar2.h() : null;
                this.f17418e = fragmentH != null ? fragmentH.isPostponed() : false;
                C2735B c2735b = C2735B.f28704a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void v(boolean z10) {
        this.f17417d = z10;
    }
}
