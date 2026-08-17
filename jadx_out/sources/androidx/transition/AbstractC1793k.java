package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import androidx.core.view.AbstractC1658a0;
import androidx.transition.AbstractC1793k;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m0.C2892a;

/* JADX INFO: renamed from: androidx.transition.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1793k implements Cloneable {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final Animator[] f18348O = new Animator[0];

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private static final int[] f18349P = {2, 1, 3, 4};

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private static final AbstractC1789g f18350Q = new a();

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private static ThreadLocal f18351R = new ThreadLocal();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private ArrayList f18352A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private g[] f18353B;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private f f18363L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private C2892a f18364M;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private ArrayList f18385z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f18366g = getClass().getName();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f18367h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    long f18368i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private TimeInterpolator f18369j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    ArrayList f18370k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    ArrayList f18371l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ArrayList f18372m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ArrayList f18373n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ArrayList f18374o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ArrayList f18375p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ArrayList f18376q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ArrayList f18377r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private ArrayList f18378s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ArrayList f18379t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ArrayList f18380u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private w f18381v = new w();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private w f18382w = new w();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    t f18383x = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int[] f18384y = f18349P;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    boolean f18354C = false;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    ArrayList f18355D = new ArrayList();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private Animator[] f18356E = f18348O;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    int f18357F = 0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f18358G = false;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    boolean f18359H = false;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private AbstractC1793k f18360I = null;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private ArrayList f18361J = null;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    ArrayList f18362K = new ArrayList();

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private AbstractC1789g f18365N = f18350Q;

    /* JADX INFO: renamed from: androidx.transition.k$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends AbstractC1789g {
        a() {
        }

        @Override // androidx.transition.AbstractC1789g
        public Path a(float f10, float f11, float f12, float f13) {
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f12, f13);
            return path;
        }
    }

    /* JADX INFO: renamed from: androidx.transition.k$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C2892a f18386a;

        b(C2892a c2892a) {
            this.f18386a = c2892a;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f18386a.remove(animator);
            AbstractC1793k.this.f18355D.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC1793k.this.f18355D.add(animator);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.k$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC1793k.this.p();
            animator.removeListener(this);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.k$d */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        View f18389a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f18390b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        v f18391c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        WindowId f18392d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        AbstractC1793k f18393e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Animator f18394f;

        d(View view, String str, AbstractC1793k abstractC1793k, WindowId windowId, v vVar, Animator animator) {
            this.f18389a = view;
            this.f18390b = str;
            this.f18391c = vVar;
            this.f18392d = windowId;
            this.f18393e = abstractC1793k;
            this.f18394f = animator;
        }
    }

    /* JADX INFO: renamed from: androidx.transition.k$e */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class e {
        static ArrayList a(ArrayList arrayList, Object obj) {
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            if (!arrayList.contains(obj)) {
                arrayList.add(obj);
            }
            return arrayList;
        }

        static ArrayList b(ArrayList arrayList, Object obj) {
            if (arrayList == null) {
                return arrayList;
            }
            arrayList.remove(obj);
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: androidx.transition.k$f */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class f {
    }

    /* JADX INFO: renamed from: androidx.transition.k$g */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface g {
        void a(AbstractC1793k abstractC1793k);

        void b(AbstractC1793k abstractC1793k);

        default void c(AbstractC1793k abstractC1793k, boolean z10) {
            d(abstractC1793k);
        }

        void d(AbstractC1793k abstractC1793k);

        void e(AbstractC1793k abstractC1793k);

        default void f(AbstractC1793k abstractC1793k, boolean z10) {
            a(abstractC1793k);
        }

        void g(AbstractC1793k abstractC1793k);
    }

    /* JADX INFO: renamed from: androidx.transition.k$h */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    interface h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f18395a = new h() { // from class: androidx.transition.l
            @Override // androidx.transition.AbstractC1793k.h
            public final void a(AbstractC1793k.g gVar, AbstractC1793k abstractC1793k, boolean z10) {
                gVar.f(abstractC1793k, z10);
            }
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final h f18396b = new h() { // from class: androidx.transition.m
            @Override // androidx.transition.AbstractC1793k.h
            public final void a(AbstractC1793k.g gVar, AbstractC1793k abstractC1793k, boolean z10) {
                gVar.c(abstractC1793k, z10);
            }
        };

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f18397c = new h() { // from class: androidx.transition.n
            @Override // androidx.transition.AbstractC1793k.h
            public final void a(AbstractC1793k.g gVar, AbstractC1793k abstractC1793k, boolean z10) {
                gVar.e(abstractC1793k);
            }
        };

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final h f18398d = new h() { // from class: androidx.transition.o
            @Override // androidx.transition.AbstractC1793k.h
            public final void a(AbstractC1793k.g gVar, AbstractC1793k abstractC1793k, boolean z10) {
                gVar.b(abstractC1793k);
            }
        };

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final h f18399e = new h() { // from class: androidx.transition.p
            @Override // androidx.transition.AbstractC1793k.h
            public final void a(AbstractC1793k.g gVar, AbstractC1793k abstractC1793k, boolean z10) {
                gVar.g(abstractC1793k);
            }
        };

        void a(g gVar, AbstractC1793k abstractC1793k, boolean z10);
    }

    private static C2892a B() {
        C2892a c2892a = (C2892a) f18351R.get();
        if (c2892a != null) {
            return c2892a;
        }
        C2892a c2892a2 = new C2892a();
        f18351R.set(c2892a2);
        return c2892a2;
    }

    private static boolean L(v vVar, v vVar2, String str) {
        Object obj = vVar.f18416a.get(str);
        Object obj2 = vVar2.f18416a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    private void M(C2892a c2892a, C2892a c2892a2, SparseArray sparseArray, SparseArray sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = (View) sparseArray.valueAt(i10);
            if (view2 != null && K(view2) && (view = (View) sparseArray2.get(sparseArray.keyAt(i10))) != null && K(view)) {
                v vVar = (v) c2892a.get(view2);
                v vVar2 = (v) c2892a2.get(view);
                if (vVar != null && vVar2 != null) {
                    this.f18385z.add(vVar);
                    this.f18352A.add(vVar2);
                    c2892a.remove(view2);
                    c2892a2.remove(view);
                }
            }
        }
    }

    private void N(C2892a c2892a, C2892a c2892a2) {
        v vVar;
        for (int size = c2892a.size() - 1; size >= 0; size--) {
            View view = (View) c2892a.f(size);
            if (view != null && K(view) && (vVar = (v) c2892a2.remove(view)) != null && K(vVar.f18417b)) {
                this.f18385z.add((v) c2892a.h(size));
                this.f18352A.add(vVar);
            }
        }
    }

    private void O(C2892a c2892a, C2892a c2892a2, m0.f fVar, m0.f fVar2) {
        View view;
        int iJ = fVar.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            View view2 = (View) fVar.k(i10);
            if (view2 != null && K(view2) && (view = (View) fVar2.c(fVar.f(i10))) != null && K(view)) {
                v vVar = (v) c2892a.get(view2);
                v vVar2 = (v) c2892a2.get(view);
                if (vVar != null && vVar2 != null) {
                    this.f18385z.add(vVar);
                    this.f18352A.add(vVar2);
                    c2892a.remove(view2);
                    c2892a2.remove(view);
                }
            }
        }
    }

    private void P(C2892a c2892a, C2892a c2892a2, C2892a c2892a3, C2892a c2892a4) {
        View view;
        int size = c2892a3.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = (View) c2892a3.j(i10);
            if (view2 != null && K(view2) && (view = (View) c2892a4.get(c2892a3.f(i10))) != null && K(view)) {
                v vVar = (v) c2892a.get(view2);
                v vVar2 = (v) c2892a2.get(view);
                if (vVar != null && vVar2 != null) {
                    this.f18385z.add(vVar);
                    this.f18352A.add(vVar2);
                    c2892a.remove(view2);
                    c2892a2.remove(view);
                }
            }
        }
    }

    private void Q(w wVar, w wVar2) {
        C2892a c2892a = new C2892a(wVar.f18419a);
        C2892a c2892a2 = new C2892a(wVar2.f18419a);
        int i10 = 0;
        while (true) {
            int[] iArr = this.f18384y;
            if (i10 >= iArr.length) {
                c(c2892a, c2892a2);
                return;
            }
            int i11 = iArr[i10];
            if (i11 == 1) {
                N(c2892a, c2892a2);
            } else if (i11 == 2) {
                P(c2892a, c2892a2, wVar.f18422d, wVar2.f18422d);
            } else if (i11 == 3) {
                M(c2892a, c2892a2, wVar.f18420b, wVar2.f18420b);
            } else if (i11 == 4) {
                O(c2892a, c2892a2, wVar.f18421c, wVar2.f18421c);
            }
            i10++;
        }
    }

    private void R(AbstractC1793k abstractC1793k, h hVar, boolean z10) {
        AbstractC1793k abstractC1793k2 = this.f18360I;
        if (abstractC1793k2 != null) {
            abstractC1793k2.R(abstractC1793k, hVar, z10);
        }
        ArrayList arrayList = this.f18361J;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f18361J.size();
        g[] gVarArr = this.f18353B;
        if (gVarArr == null) {
            gVarArr = new g[size];
        }
        this.f18353B = null;
        g[] gVarArr2 = (g[]) this.f18361J.toArray(gVarArr);
        for (int i10 = 0; i10 < size; i10++) {
            hVar.a(gVarArr2[i10], abstractC1793k, z10);
            gVarArr2[i10] = null;
        }
        this.f18353B = gVarArr2;
    }

    private void Z(Animator animator, C2892a c2892a) {
        if (animator != null) {
            animator.addListener(new b(c2892a));
            f(animator);
        }
    }

    private void c(C2892a c2892a, C2892a c2892a2) {
        for (int i10 = 0; i10 < c2892a.size(); i10++) {
            v vVar = (v) c2892a.j(i10);
            if (K(vVar.f18417b)) {
                this.f18385z.add(vVar);
                this.f18352A.add(null);
            }
        }
        for (int i11 = 0; i11 < c2892a2.size(); i11++) {
            v vVar2 = (v) c2892a2.j(i11);
            if (K(vVar2.f18417b)) {
                this.f18352A.add(vVar2);
                this.f18385z.add(null);
            }
        }
    }

    private static void e(w wVar, View view, v vVar) {
        wVar.f18419a.put(view, vVar);
        int id = view.getId();
        if (id >= 0) {
            if (wVar.f18420b.indexOfKey(id) >= 0) {
                wVar.f18420b.put(id, null);
            } else {
                wVar.f18420b.put(id, view);
            }
        }
        String strH = AbstractC1658a0.H(view);
        if (strH != null) {
            if (wVar.f18422d.containsKey(strH)) {
                wVar.f18422d.put(strH, null);
            } else {
                wVar.f18422d.put(strH, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (wVar.f18421c.e(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    wVar.f18421c.g(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) wVar.f18421c.c(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    wVar.f18421c.g(itemIdAtPosition, null);
                }
            }
        }
    }

    private void h(View view, boolean z10) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList arrayList = this.f18374o;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList arrayList2 = this.f18375p;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList arrayList3 = this.f18376q;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (((Class) this.f18376q.get(i10)).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    v vVar = new v(view);
                    if (z10) {
                        j(vVar);
                    } else {
                        g(vVar);
                    }
                    vVar.f18418c.add(this);
                    i(vVar);
                    if (z10) {
                        e(this.f18381v, view, vVar);
                    } else {
                        e(this.f18382w, view, vVar);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList arrayList4 = this.f18378s;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                        ArrayList arrayList5 = this.f18379t;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList arrayList6 = this.f18380u;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i11 = 0; i11 < size2; i11++) {
                                    if (((Class) this.f18380u.get(i11)).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                                h(viewGroup.getChildAt(i12), z10);
                            }
                        }
                    }
                }
            }
        }
    }

    private ArrayList r(ArrayList arrayList, Class cls, boolean z10) {
        return cls != null ? z10 ? e.a(arrayList, cls) : e.b(arrayList, cls) : arrayList;
    }

    public final AbstractC1793k A() {
        t tVar = this.f18383x;
        return tVar != null ? tVar.A() : this;
    }

    public long C() {
        return this.f18367h;
    }

    public List D() {
        return this.f18370k;
    }

    public List E() {
        return this.f18372m;
    }

    public List F() {
        return this.f18373n;
    }

    public List G() {
        return this.f18371l;
    }

    public String[] H() {
        return null;
    }

    public v I(View view, boolean z10) {
        t tVar = this.f18383x;
        if (tVar != null) {
            return tVar.I(view, z10);
        }
        return (v) (z10 ? this.f18381v : this.f18382w).f18419a.get(view);
    }

    public boolean J(v vVar, v vVar2) {
        if (vVar != null && vVar2 != null) {
            String[] strArrH = H();
            if (strArrH != null) {
                for (String str : strArrH) {
                    if (L(vVar, vVar2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = vVar.f18416a.keySet().iterator();
                while (it.hasNext()) {
                    if (L(vVar, vVar2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    boolean K(View view) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int id = view.getId();
        ArrayList arrayList3 = this.f18374o;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList arrayList4 = this.f18375p;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList arrayList5 = this.f18376q;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((Class) this.f18376q.get(i10)).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f18377r != null && AbstractC1658a0.H(view) != null && this.f18377r.contains(AbstractC1658a0.H(view))) {
            return false;
        }
        if ((this.f18370k.size() == 0 && this.f18371l.size() == 0 && (((arrayList = this.f18373n) == null || arrayList.isEmpty()) && ((arrayList2 = this.f18372m) == null || arrayList2.isEmpty()))) || this.f18370k.contains(Integer.valueOf(id)) || this.f18371l.contains(view)) {
            return true;
        }
        ArrayList arrayList6 = this.f18372m;
        if (arrayList6 != null && arrayList6.contains(AbstractC1658a0.H(view))) {
            return true;
        }
        if (this.f18373n != null) {
            for (int i11 = 0; i11 < this.f18373n.size(); i11++) {
                if (((Class) this.f18373n.get(i11)).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    void S(h hVar, boolean z10) {
        R(this, hVar, z10);
    }

    public void T(View view) {
        if (this.f18359H) {
            return;
        }
        int size = this.f18355D.size();
        Animator[] animatorArr = (Animator[]) this.f18355D.toArray(this.f18356E);
        this.f18356E = f18348O;
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            animator.pause();
        }
        this.f18356E = animatorArr;
        S(h.f18398d, false);
        this.f18358G = true;
    }

    void U(ViewGroup viewGroup) {
        d dVar;
        this.f18385z = new ArrayList();
        this.f18352A = new ArrayList();
        Q(this.f18381v, this.f18382w);
        C2892a c2892aB = B();
        int size = c2892aB.size();
        WindowId windowId = viewGroup.getWindowId();
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = (Animator) c2892aB.f(i10);
            if (animator != null && (dVar = (d) c2892aB.get(animator)) != null && dVar.f18389a != null && windowId.equals(dVar.f18392d)) {
                v vVar = dVar.f18391c;
                View view = dVar.f18389a;
                v vVarI = I(view, true);
                v vVarW = w(view, true);
                if (vVarI == null && vVarW == null) {
                    vVarW = (v) this.f18382w.f18419a.get(view);
                }
                if ((vVarI != null || vVarW != null) && dVar.f18393e.J(vVar, vVarW)) {
                    dVar.f18393e.A().getClass();
                    if (animator.isRunning() || animator.isStarted()) {
                        animator.cancel();
                    } else {
                        c2892aB.remove(animator);
                    }
                }
            }
        }
        o(viewGroup, this.f18381v, this.f18382w, this.f18385z, this.f18352A);
        a0();
    }

    public AbstractC1793k V(g gVar) {
        AbstractC1793k abstractC1793k;
        ArrayList arrayList = this.f18361J;
        if (arrayList != null) {
            if (!arrayList.remove(gVar) && (abstractC1793k = this.f18360I) != null) {
                abstractC1793k.V(gVar);
            }
            if (this.f18361J.size() == 0) {
                this.f18361J = null;
            }
        }
        return this;
    }

    public AbstractC1793k W(View view) {
        this.f18371l.remove(view);
        return this;
    }

    public void Y(View view) {
        if (this.f18358G) {
            if (!this.f18359H) {
                int size = this.f18355D.size();
                Animator[] animatorArr = (Animator[]) this.f18355D.toArray(this.f18356E);
                this.f18356E = f18348O;
                for (int i10 = size - 1; i10 >= 0; i10--) {
                    Animator animator = animatorArr[i10];
                    animatorArr[i10] = null;
                    animator.resume();
                }
                this.f18356E = animatorArr;
                S(h.f18399e, false);
            }
            this.f18358G = false;
        }
    }

    public AbstractC1793k a(g gVar) {
        if (this.f18361J == null) {
            this.f18361J = new ArrayList();
        }
        this.f18361J.add(gVar);
        return this;
    }

    protected void a0() {
        h0();
        C2892a c2892aB = B();
        for (Animator animator : this.f18362K) {
            if (c2892aB.containsKey(animator)) {
                h0();
                Z(animator, c2892aB);
            }
        }
        this.f18362K.clear();
        p();
    }

    public AbstractC1793k b(View view) {
        this.f18371l.add(view);
        return this;
    }

    public AbstractC1793k b0(long j10) {
        this.f18368i = j10;
        return this;
    }

    public void c0(f fVar) {
        this.f18363L = fVar;
    }

    protected void cancel() {
        int size = this.f18355D.size();
        Animator[] animatorArr = (Animator[]) this.f18355D.toArray(this.f18356E);
        this.f18356E = f18348O;
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            animator.cancel();
        }
        this.f18356E = animatorArr;
        S(h.f18397c, false);
    }

    public AbstractC1793k d0(TimeInterpolator timeInterpolator) {
        this.f18369j = timeInterpolator;
        return this;
    }

    public void e0(AbstractC1789g abstractC1789g) {
        if (abstractC1789g == null) {
            this.f18365N = f18350Q;
        } else {
            this.f18365N = abstractC1789g;
        }
    }

    protected void f(Animator animator) {
        if (animator == null) {
            p();
            return;
        }
        if (t() >= 0) {
            animator.setDuration(t());
        }
        if (C() >= 0) {
            animator.setStartDelay(C() + animator.getStartDelay());
        }
        if (v() != null) {
            animator.setInterpolator(v());
        }
        animator.addListener(new c());
        animator.start();
    }

    public abstract void g(v vVar);

    public AbstractC1793k g0(long j10) {
        this.f18367h = j10;
        return this;
    }

    protected void h0() {
        if (this.f18357F == 0) {
            S(h.f18395a, false);
            this.f18359H = false;
        }
        this.f18357F++;
    }

    String i0(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f18368i != -1) {
            sb.append("dur(");
            sb.append(this.f18368i);
            sb.append(") ");
        }
        if (this.f18367h != -1) {
            sb.append("dly(");
            sb.append(this.f18367h);
            sb.append(") ");
        }
        if (this.f18369j != null) {
            sb.append("interp(");
            sb.append(this.f18369j);
            sb.append(") ");
        }
        if (this.f18370k.size() > 0 || this.f18371l.size() > 0) {
            sb.append("tgts(");
            if (this.f18370k.size() > 0) {
                for (int i10 = 0; i10 < this.f18370k.size(); i10++) {
                    if (i10 > 0) {
                        sb.append(", ");
                    }
                    sb.append(this.f18370k.get(i10));
                }
            }
            if (this.f18371l.size() > 0) {
                for (int i11 = 0; i11 < this.f18371l.size(); i11++) {
                    if (i11 > 0) {
                        sb.append(", ");
                    }
                    sb.append(this.f18371l.get(i11));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public abstract void j(v vVar);

    void k(ViewGroup viewGroup, boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        C2892a c2892a;
        l(z10);
        if ((this.f18370k.size() > 0 || this.f18371l.size() > 0) && (((arrayList = this.f18372m) == null || arrayList.isEmpty()) && ((arrayList2 = this.f18373n) == null || arrayList2.isEmpty()))) {
            for (int i10 = 0; i10 < this.f18370k.size(); i10++) {
                View viewFindViewById = viewGroup.findViewById(((Integer) this.f18370k.get(i10)).intValue());
                if (viewFindViewById != null) {
                    v vVar = new v(viewFindViewById);
                    if (z10) {
                        j(vVar);
                    } else {
                        g(vVar);
                    }
                    vVar.f18418c.add(this);
                    i(vVar);
                    if (z10) {
                        e(this.f18381v, viewFindViewById, vVar);
                    } else {
                        e(this.f18382w, viewFindViewById, vVar);
                    }
                }
            }
            for (int i11 = 0; i11 < this.f18371l.size(); i11++) {
                View view = (View) this.f18371l.get(i11);
                v vVar2 = new v(view);
                if (z10) {
                    j(vVar2);
                } else {
                    g(vVar2);
                }
                vVar2.f18418c.add(this);
                i(vVar2);
                if (z10) {
                    e(this.f18381v, view, vVar2);
                } else {
                    e(this.f18382w, view, vVar2);
                }
            }
        } else {
            h(viewGroup, z10);
        }
        if (z10 || (c2892a = this.f18364M) == null) {
            return;
        }
        int size = c2892a.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            arrayList3.add((View) this.f18381v.f18422d.remove((String) this.f18364M.f(i12)));
        }
        for (int i13 = 0; i13 < size; i13++) {
            View view2 = (View) arrayList3.get(i13);
            if (view2 != null) {
                this.f18381v.f18422d.put((String) this.f18364M.j(i13), view2);
            }
        }
    }

    void l(boolean z10) {
        if (z10) {
            this.f18381v.f18419a.clear();
            this.f18381v.f18420b.clear();
            this.f18381v.f18421c.a();
        } else {
            this.f18382w.f18419a.clear();
            this.f18382w.f18420b.clear();
            this.f18382w.f18421c.a();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: m */
    public AbstractC1793k clone() {
        try {
            AbstractC1793k abstractC1793k = (AbstractC1793k) super.clone();
            abstractC1793k.f18362K = new ArrayList();
            abstractC1793k.f18381v = new w();
            abstractC1793k.f18382w = new w();
            abstractC1793k.f18385z = null;
            abstractC1793k.f18352A = null;
            abstractC1793k.f18360I = this;
            abstractC1793k.f18361J = null;
            return abstractC1793k;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public Animator n(ViewGroup viewGroup, v vVar, v vVar2) {
        return null;
    }

    void o(ViewGroup viewGroup, w wVar, w wVar2, ArrayList arrayList, ArrayList arrayList2) {
        View view;
        Animator animator;
        v vVar;
        View view2;
        Animator animator2;
        C2892a c2892aB = B();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        A().getClass();
        for (int i10 = 0; i10 < size; i10++) {
            v vVar2 = (v) arrayList.get(i10);
            v vVar3 = (v) arrayList2.get(i10);
            if (vVar2 != null && !vVar2.f18418c.contains(this)) {
                vVar2 = null;
            }
            if (vVar3 != null && !vVar3.f18418c.contains(this)) {
                vVar3 = null;
            }
            if ((vVar2 != null || vVar3 != null) && (vVar2 == null || vVar3 == null || J(vVar2, vVar3))) {
                Animator animatorN = n(viewGroup, vVar2, vVar3);
                if (animatorN != null) {
                    if (vVar3 != null) {
                        View view3 = vVar3.f18417b;
                        String[] strArrH = H();
                        if (strArrH != null && strArrH.length > 0) {
                            vVar = new v(view3);
                            v vVar4 = (v) wVar2.f18419a.get(view3);
                            if (vVar4 != null) {
                                int i11 = 0;
                                while (i11 < strArrH.length) {
                                    Map map = vVar.f18416a;
                                    String[] strArr = strArrH;
                                    String str = strArr[i11];
                                    map.put(str, vVar4.f18416a.get(str));
                                    i11++;
                                    strArrH = strArr;
                                }
                            }
                            int size2 = c2892aB.size();
                            int i12 = 0;
                            while (true) {
                                if (i12 >= size2) {
                                    view2 = view3;
                                    animator2 = animatorN;
                                    break;
                                }
                                d dVar = (d) c2892aB.get((Animator) c2892aB.f(i12));
                                if (dVar.f18391c != null && dVar.f18389a == view3) {
                                    view2 = view3;
                                    if (dVar.f18390b.equals(x()) && dVar.f18391c.equals(vVar)) {
                                        animator2 = null;
                                        break;
                                    }
                                } else {
                                    view2 = view3;
                                }
                                i12++;
                                view3 = view2;
                            }
                        } else {
                            view2 = view3;
                            animator2 = animatorN;
                            vVar = null;
                        }
                        animator = animator2;
                        view = view2;
                    } else {
                        view = vVar2.f18417b;
                        animator = animatorN;
                        vVar = null;
                    }
                    if (animator != null) {
                        c2892aB.put(animator, new d(view, x(), this, viewGroup.getWindowId(), vVar, animator));
                        this.f18362K.add(animator);
                    }
                }
            }
        }
        if (sparseIntArray.size() != 0) {
            for (int i13 = 0; i13 < sparseIntArray.size(); i13++) {
                d dVar2 = (d) c2892aB.get((Animator) this.f18362K.get(sparseIntArray.keyAt(i13)));
                dVar2.f18394f.setStartDelay((((long) sparseIntArray.valueAt(i13)) - Long.MAX_VALUE) + dVar2.f18394f.getStartDelay());
            }
        }
    }

    protected void p() {
        int i10 = this.f18357F - 1;
        this.f18357F = i10;
        if (i10 == 0) {
            S(h.f18396b, false);
            for (int i11 = 0; i11 < this.f18381v.f18421c.j(); i11++) {
                View view = (View) this.f18381v.f18421c.k(i11);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i12 = 0; i12 < this.f18382w.f18421c.j(); i12++) {
                View view2 = (View) this.f18382w.f18421c.k(i12);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f18359H = true;
        }
    }

    public AbstractC1793k q(Class cls, boolean z10) {
        this.f18376q = r(this.f18376q, cls, z10);
        return this;
    }

    public long t() {
        return this.f18368i;
    }

    public String toString() {
        return i0(PointerEventHelper.POINTER_TYPE_UNKNOWN);
    }

    public f u() {
        return this.f18363L;
    }

    public TimeInterpolator v() {
        return this.f18369j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
    
        if (r3 < 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
    
        r6 = r5.f18352A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0034, code lost:
    
        r6 = r5.f18385z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        return (androidx.transition.v) r6.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003d, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    v w(View view, boolean z10) {
        t tVar = this.f18383x;
        if (tVar != null) {
            return tVar.w(view, z10);
        }
        ArrayList arrayList = z10 ? this.f18385z : this.f18352A;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            }
            v vVar = (v) arrayList.get(i10);
            if (vVar == null) {
                return null;
            }
            if (vVar.f18417b == view) {
                break;
            }
            i10++;
        }
    }

    public String x() {
        return this.f18366g;
    }

    public AbstractC1789g y() {
        return this.f18365N;
    }

    public s z() {
        return null;
    }

    public void f0(s sVar) {
    }

    void i(v vVar) {
    }
}
