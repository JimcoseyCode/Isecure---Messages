package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.AbstractC1793k;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class L extends AbstractC1793k {

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private static final String[] f18270T = {"android:visibility:visibility", "android:visibility:parent"};

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int f18271S = 3;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class a extends AnimatorListenerAdapter implements AbstractC1793k.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f18272a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f18273b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ViewGroup f18274c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f18275d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f18276e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f18277f = false;

        a(View view, int i10, boolean z10) {
            this.f18272a = view;
            this.f18273b = i10;
            this.f18274c = (ViewGroup) view.getParent();
            this.f18275d = z10;
            i(true);
        }

        private void h() {
            if (!this.f18277f) {
                y.f(this.f18272a, this.f18273b);
                ViewGroup viewGroup = this.f18274c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            i(false);
        }

        private void i(boolean z10) {
            ViewGroup viewGroup;
            if (!this.f18275d || this.f18276e == z10 || (viewGroup = this.f18274c) == null) {
                return;
            }
            this.f18276e = z10;
            x.b(viewGroup, z10);
        }

        @Override // androidx.transition.AbstractC1793k.g
        public void b(AbstractC1793k abstractC1793k) {
            i(false);
            if (this.f18277f) {
                return;
            }
            y.f(this.f18272a, this.f18273b);
        }

        @Override // androidx.transition.AbstractC1793k.g
        public void d(AbstractC1793k abstractC1793k) {
            abstractC1793k.V(this);
        }

        @Override // androidx.transition.AbstractC1793k.g
        public void g(AbstractC1793k abstractC1793k) {
            i(true);
            if (this.f18277f) {
                return;
            }
            y.f(this.f18272a, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f18277f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            h();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z10) {
            if (z10) {
                return;
            }
            h();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z10) {
            if (z10) {
                y.f(this.f18272a, 0);
                ViewGroup viewGroup = this.f18274c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        }

        @Override // androidx.transition.AbstractC1793k.g
        public void a(AbstractC1793k abstractC1793k) {
        }

        @Override // androidx.transition.AbstractC1793k.g
        public void e(AbstractC1793k abstractC1793k) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class b extends AnimatorListenerAdapter implements AbstractC1793k.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ViewGroup f18278a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final View f18279b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final View f18280c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f18281d = true;

        b(ViewGroup viewGroup, View view, View view2) {
            this.f18278a = viewGroup;
            this.f18279b = view;
            this.f18280c = view2;
        }

        private void h() {
            this.f18280c.setTag(AbstractC1790h.f18343a, null);
            this.f18278a.getOverlay().remove(this.f18279b);
            this.f18281d = false;
        }

        @Override // androidx.transition.AbstractC1793k.g
        public void d(AbstractC1793k abstractC1793k) {
            abstractC1793k.V(this);
        }

        @Override // androidx.transition.AbstractC1793k.g
        public void e(AbstractC1793k abstractC1793k) {
            if (this.f18281d) {
                h();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            h();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.f18278a.getOverlay().remove(this.f18279b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.f18279b.getParent() == null) {
                this.f18278a.getOverlay().add(this.f18279b);
            } else {
                L.this.cancel();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z10) {
            if (z10) {
                this.f18280c.setTag(AbstractC1790h.f18343a, this.f18279b);
                this.f18278a.getOverlay().add(this.f18279b);
                this.f18281d = true;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z10) {
            if (z10) {
                return;
            }
            h();
        }

        @Override // androidx.transition.AbstractC1793k.g
        public void a(AbstractC1793k abstractC1793k) {
        }

        @Override // androidx.transition.AbstractC1793k.g
        public void b(AbstractC1793k abstractC1793k) {
        }

        @Override // androidx.transition.AbstractC1793k.g
        public void g(AbstractC1793k abstractC1793k) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f18283a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f18284b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f18285c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f18286d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        ViewGroup f18287e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        ViewGroup f18288f;

        c() {
        }
    }

    private void j0(v vVar) {
        vVar.f18416a.put("android:visibility:visibility", Integer.valueOf(vVar.f18417b.getVisibility()));
        vVar.f18416a.put("android:visibility:parent", vVar.f18417b.getParent());
        int[] iArr = new int[2];
        vVar.f18417b.getLocationOnScreen(iArr);
        vVar.f18416a.put("android:visibility:screenLocation", iArr);
    }

    private c m0(v vVar, v vVar2) {
        c cVar = new c();
        cVar.f18283a = false;
        cVar.f18284b = false;
        if (vVar == null || !vVar.f18416a.containsKey("android:visibility:visibility")) {
            cVar.f18285c = -1;
            cVar.f18287e = null;
        } else {
            cVar.f18285c = ((Integer) vVar.f18416a.get("android:visibility:visibility")).intValue();
            cVar.f18287e = (ViewGroup) vVar.f18416a.get("android:visibility:parent");
        }
        if (vVar2 == null || !vVar2.f18416a.containsKey("android:visibility:visibility")) {
            cVar.f18286d = -1;
            cVar.f18288f = null;
        } else {
            cVar.f18286d = ((Integer) vVar2.f18416a.get("android:visibility:visibility")).intValue();
            cVar.f18288f = (ViewGroup) vVar2.f18416a.get("android:visibility:parent");
        }
        if (vVar != null && vVar2 != null) {
            int i10 = cVar.f18285c;
            int i11 = cVar.f18286d;
            if (i10 != i11 || cVar.f18287e != cVar.f18288f) {
                if (i10 != i11) {
                    if (i10 == 0) {
                        cVar.f18284b = false;
                        cVar.f18283a = true;
                        return cVar;
                    }
                    if (i11 == 0) {
                        cVar.f18284b = true;
                        cVar.f18283a = true;
                        return cVar;
                    }
                } else {
                    if (cVar.f18288f == null) {
                        cVar.f18284b = false;
                        cVar.f18283a = true;
                        return cVar;
                    }
                    if (cVar.f18287e == null) {
                        cVar.f18284b = true;
                        cVar.f18283a = true;
                        return cVar;
                    }
                }
            }
        } else {
            if (vVar == null && cVar.f18286d == 0) {
                cVar.f18284b = true;
                cVar.f18283a = true;
                return cVar;
            }
            if (vVar2 == null && cVar.f18285c == 0) {
                cVar.f18284b = false;
                cVar.f18283a = true;
            }
        }
        return cVar;
    }

    @Override // androidx.transition.AbstractC1793k
    public String[] H() {
        return f18270T;
    }

    @Override // androidx.transition.AbstractC1793k
    public boolean J(v vVar, v vVar2) {
        if (vVar == null && vVar2 == null) {
            return false;
        }
        if (vVar != null && vVar2 != null && vVar2.f18416a.containsKey("android:visibility:visibility") != vVar.f18416a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c cVarM0 = m0(vVar, vVar2);
        return cVarM0.f18283a && (cVarM0.f18285c == 0 || cVarM0.f18286d == 0);
    }

    @Override // androidx.transition.AbstractC1793k
    public void g(v vVar) {
        j0(vVar);
    }

    @Override // androidx.transition.AbstractC1793k
    public void j(v vVar) {
        j0(vVar);
    }

    @Override // androidx.transition.AbstractC1793k
    public Animator n(ViewGroup viewGroup, v vVar, v vVar2) {
        c cVarM0 = m0(vVar, vVar2);
        if (!cVarM0.f18283a) {
            return null;
        }
        if (cVarM0.f18287e == null && cVarM0.f18288f == null) {
            return null;
        }
        return cVarM0.f18284b ? o0(viewGroup, vVar, cVarM0.f18285c, vVar2, cVarM0.f18286d) : q0(viewGroup, vVar, cVarM0.f18285c, vVar2, cVarM0.f18286d);
    }

    public abstract Animator n0(ViewGroup viewGroup, View view, v vVar, v vVar2);

    public Animator o0(ViewGroup viewGroup, v vVar, int i10, v vVar2, int i11) {
        if ((this.f18271S & 1) != 1 || vVar2 == null) {
            return null;
        }
        if (vVar == null) {
            View view = (View) vVar2.f18417b.getParent();
            if (m0(w(view, false), I(view, false)).f18283a) {
                return null;
            }
        }
        return n0(viewGroup, vVar2.f18417b, vVar, vVar2);
    }

    public abstract Animator p0(ViewGroup viewGroup, View view, v vVar, v vVar2);

    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069 A[PHI: r2
      0x0069: PHI (r2v3 android.view.View) = 
      (r2v2 android.view.View)
      (r2v2 android.view.View)
      (r2v2 android.view.View)
      (r2v2 android.view.View)
      (r2v2 android.view.View)
      (r2v2 android.view.View)
      (r2v6 android.view.View)
     binds: [B:26:0x003e, B:31:0x004d, B:37:0x0076, B:39:0x0079, B:41:0x007f, B:43:0x0083, B:34:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Animator q0(ViewGroup viewGroup, v vVar, int i10, v vVar2, int i11) {
        View view;
        boolean z10;
        View view2;
        boolean z11;
        if ((this.f18271S & 2) != 2 || vVar == null) {
            return null;
        }
        View view3 = vVar.f18417b;
        View viewA = vVar2 != null ? vVar2.f18417b : null;
        View view4 = (View) view3.getTag(AbstractC1790h.f18343a);
        if (view4 != null) {
            view2 = null;
            z11 = true;
        } else if (viewA == null || viewA.getParent() == null) {
            if (viewA != null) {
                view = null;
                z10 = false;
            } else {
                viewA = null;
                view = null;
                z10 = true;
            }
            if (z10) {
                if (view3.getParent() != null) {
                    if (view3.getParent() instanceof View) {
                        View view5 = (View) view3.getParent();
                        if (m0(I(view5, true), w(view5, true)).f18283a) {
                            int id = view5.getId();
                            if (view5.getParent() != null || id == -1 || viewGroup.findViewById(id) == null || !this.f18354C) {
                            }
                        } else {
                            viewA = u.a(viewGroup, view3, view5);
                        }
                    }
                    View view6 = view;
                    view4 = viewA;
                    view2 = view6;
                    z11 = false;
                }
                view2 = view;
                z11 = false;
                view4 = view3;
            } else {
                View view62 = view;
                view4 = viewA;
                view2 = view62;
                z11 = false;
            }
        } else {
            if (i11 == 4 || view3 == viewA) {
                view = viewA;
                z10 = false;
                viewA = null;
            }
            if (z10) {
            }
        }
        if (view4 == null) {
            if (view2 == null) {
                return null;
            }
            int visibility = view2.getVisibility();
            y.f(view2, 0);
            Animator animatorP0 = p0(viewGroup, view2, vVar, vVar2);
            if (animatorP0 == null) {
                y.f(view2, visibility);
                return animatorP0;
            }
            a aVar = new a(view2, i11, true);
            animatorP0.addListener(aVar);
            A().a(aVar);
            return animatorP0;
        }
        if (!z11) {
            int[] iArr = (int[]) vVar.f18416a.get("android:visibility:screenLocation");
            int i12 = iArr[0];
            int i13 = iArr[1];
            int[] iArr2 = new int[2];
            viewGroup.getLocationOnScreen(iArr2);
            view4.offsetLeftAndRight((i12 - iArr2[0]) - view4.getLeft());
            view4.offsetTopAndBottom((i13 - iArr2[1]) - view4.getTop());
            viewGroup.getOverlay().add(view4);
        }
        Animator animatorP02 = p0(viewGroup, view4, vVar, vVar2);
        if (!z11) {
            if (animatorP02 == null) {
                viewGroup.getOverlay().remove(view4);
                return animatorP02;
            }
            view3.setTag(AbstractC1790h.f18343a, view4);
            b bVar = new b(viewGroup, view4, view3);
            animatorP02.addListener(bVar);
            animatorP02.addPauseListener(bVar);
            A().a(bVar);
        }
        return animatorP02;
    }

    public void r0(int i10) {
        if ((i10 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f18271S = i10;
    }
}
