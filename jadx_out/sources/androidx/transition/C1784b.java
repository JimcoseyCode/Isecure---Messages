package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.AbstractC1793k;
import com.facebook.react.uimanager.ViewProps;
import java.util.Map;

/* JADX INFO: renamed from: androidx.transition.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C1784b extends AbstractC1793k {

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private static final String[] f18289T = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private static final Property f18290U = new a(PointF.class, "topLeft");

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private static final Property f18291V = new C0190b(PointF.class, "bottomRight");

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private static final Property f18292W = new c(PointF.class, "bottomRight");

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private static final Property f18293X = new d(PointF.class, "topLeft");

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private static final Property f18294Y = new e(PointF.class, ViewProps.POSITION);

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final C1791i f18295Z = new C1791i();

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private boolean f18296S = false;

    /* JADX INFO: renamed from: androidx.transition.b$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends Property {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(i iVar, PointF pointF) {
            iVar.c(pointF);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class C0190b extends Property {
        C0190b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(i iVar, PointF pointF) {
            iVar.a(pointF);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.b$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class c extends Property {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            y.d(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* JADX INFO: renamed from: androidx.transition.b$d */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class d extends Property {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            y.d(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* JADX INFO: renamed from: androidx.transition.b$e */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class e extends Property {
        e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            int iRound = Math.round(pointF.x);
            int iRound2 = Math.round(pointF.y);
            y.d(view, iRound, iRound2, view.getWidth() + iRound, view.getHeight() + iRound2);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.b$f */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f18297a;
        private final i mViewBounds;

        f(i iVar) {
            this.f18297a = iVar;
            this.mViewBounds = iVar;
        }
    }

    /* JADX INFO: renamed from: androidx.transition.b$g */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class g extends AnimatorListenerAdapter implements AbstractC1793k.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f18299a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Rect f18300b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f18301c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Rect f18302d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f18303e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f18304f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f18305g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f18306h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f18307i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final int f18308j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final int f18309k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f18310l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final int f18311m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f18312n;

        g(View view, Rect rect, boolean z10, Rect rect2, boolean z11, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.f18299a = view;
            this.f18300b = rect;
            this.f18301c = z10;
            this.f18302d = rect2;
            this.f18303e = z11;
            this.f18304f = i10;
            this.f18305g = i11;
            this.f18306h = i12;
            this.f18307i = i13;
            this.f18308j = i14;
            this.f18309k = i15;
            this.f18310l = i16;
            this.f18311m = i17;
        }

        @Override // androidx.transition.AbstractC1793k.g
        public void b(AbstractC1793k abstractC1793k) {
            this.f18299a.setTag(AbstractC1790h.f18344b, this.f18299a.getClipBounds());
            this.f18299a.setClipBounds(this.f18303e ? null : this.f18302d);
        }

        @Override // androidx.transition.AbstractC1793k.g
        public void e(AbstractC1793k abstractC1793k) {
            this.f18312n = true;
        }

        @Override // androidx.transition.AbstractC1793k.g
        public void g(AbstractC1793k abstractC1793k) {
            Rect rect = (Rect) this.f18299a.getTag(AbstractC1790h.f18344b);
            this.f18299a.setTag(AbstractC1790h.f18344b, null);
            this.f18299a.setClipBounds(rect);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            onAnimationStart(animator, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z10) {
            if (this.f18312n) {
                return;
            }
            Rect rect = null;
            if (z10) {
                if (!this.f18301c) {
                    rect = this.f18300b;
                }
            } else if (!this.f18303e) {
                rect = this.f18302d;
            }
            this.f18299a.setClipBounds(rect);
            if (z10) {
                y.d(this.f18299a, this.f18304f, this.f18305g, this.f18306h, this.f18307i);
            } else {
                y.d(this.f18299a, this.f18308j, this.f18309k, this.f18310l, this.f18311m);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z10) {
            int iMax = Math.max(this.f18306h - this.f18304f, this.f18310l - this.f18308j);
            int iMax2 = Math.max(this.f18307i - this.f18305g, this.f18311m - this.f18309k);
            int i10 = z10 ? this.f18308j : this.f18304f;
            int i11 = z10 ? this.f18309k : this.f18305g;
            y.d(this.f18299a, i10, i11, iMax + i10, iMax2 + i11);
            this.f18299a.setClipBounds(z10 ? this.f18302d : this.f18300b);
        }

        @Override // androidx.transition.AbstractC1793k.g
        public void a(AbstractC1793k abstractC1793k) {
        }

        @Override // androidx.transition.AbstractC1793k.g
        public void d(AbstractC1793k abstractC1793k) {
        }
    }

    /* JADX INFO: renamed from: androidx.transition.b$h */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class h extends q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f18313a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ViewGroup f18314b;

        h(ViewGroup viewGroup) {
            this.f18314b = viewGroup;
        }

        @Override // androidx.transition.q, androidx.transition.AbstractC1793k.g
        public void b(AbstractC1793k abstractC1793k) {
            x.b(this.f18314b, false);
        }

        @Override // androidx.transition.AbstractC1793k.g
        public void d(AbstractC1793k abstractC1793k) {
            if (!this.f18313a) {
                x.b(this.f18314b, false);
            }
            abstractC1793k.V(this);
        }

        @Override // androidx.transition.q, androidx.transition.AbstractC1793k.g
        public void e(AbstractC1793k abstractC1793k) {
            x.b(this.f18314b, false);
            this.f18313a = true;
        }

        @Override // androidx.transition.q, androidx.transition.AbstractC1793k.g
        public void g(AbstractC1793k abstractC1793k) {
            x.b(this.f18314b, true);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.b$i */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f18315a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f18316b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f18317c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f18318d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final View f18319e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f18320f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f18321g;

        i(View view) {
            this.f18319e = view;
        }

        private void b() {
            y.d(this.f18319e, this.f18315a, this.f18316b, this.f18317c, this.f18318d);
            this.f18320f = 0;
            this.f18321g = 0;
        }

        void a(PointF pointF) {
            this.f18317c = Math.round(pointF.x);
            this.f18318d = Math.round(pointF.y);
            int i10 = this.f18321g + 1;
            this.f18321g = i10;
            if (this.f18320f == i10) {
                b();
            }
        }

        void c(PointF pointF) {
            this.f18315a = Math.round(pointF.x);
            this.f18316b = Math.round(pointF.y);
            int i10 = this.f18320f + 1;
            this.f18320f = i10;
            if (i10 == this.f18321g) {
                b();
            }
        }
    }

    private void j0(v vVar) {
        View view = vVar.f18417b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        vVar.f18416a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        vVar.f18416a.put("android:changeBounds:parent", vVar.f18417b.getParent());
        if (this.f18296S) {
            vVar.f18416a.put("android:changeBounds:clip", view.getClipBounds());
        }
    }

    @Override // androidx.transition.AbstractC1793k
    public String[] H() {
        return f18289T;
    }

    @Override // androidx.transition.AbstractC1793k
    public void g(v vVar) {
        j0(vVar);
    }

    @Override // androidx.transition.AbstractC1793k
    public void j(v vVar) {
        Rect rect;
        j0(vVar);
        if (!this.f18296S || (rect = (Rect) vVar.f18417b.getTag(AbstractC1790h.f18344b)) == null) {
            return;
        }
        vVar.f18416a.put("android:changeBounds:clip", rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.transition.AbstractC1793k
    public Animator n(ViewGroup viewGroup, v vVar, v vVar2) {
        int i10;
        int i11;
        int i12;
        int i13;
        ObjectAnimator objectAnimatorA;
        int i14;
        Rect rect;
        ObjectAnimator objectAnimatorOfObject;
        Animator animatorC;
        if (vVar == null || vVar2 == null) {
            return null;
        }
        Map map = vVar.f18416a;
        Map map2 = vVar2.f18416a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = vVar2.f18417b;
        Rect rect2 = (Rect) vVar.f18416a.get("android:changeBounds:bounds");
        Rect rect3 = (Rect) vVar2.f18416a.get("android:changeBounds:bounds");
        int i15 = rect2.left;
        int i16 = rect3.left;
        int i17 = rect2.top;
        int i18 = rect3.top;
        int i19 = rect2.right;
        int i20 = rect3.right;
        int i21 = rect2.bottom;
        int i22 = rect3.bottom;
        int i23 = i19 - i15;
        int i24 = i21 - i17;
        int i25 = i20 - i16;
        int i26 = i22 - i18;
        Rect rect4 = (Rect) vVar.f18416a.get("android:changeBounds:clip");
        Rect rect5 = (Rect) vVar2.f18416a.get("android:changeBounds:clip");
        if ((i23 == 0 || i24 == 0) && (i25 == 0 || i26 == 0)) {
            i10 = 0;
        } else {
            i10 = (i15 == i16 && i17 == i18) ? 0 : 1;
            if (i19 != i20 || i21 != i22) {
                i10++;
            }
        }
        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
            i10++;
        }
        int i27 = i10;
        if (i27 <= 0) {
            return null;
        }
        if (this.f18296S) {
            y.d(view, i15, i17, Math.max(i23, i25) + i15, i17 + Math.max(i24, i26));
            if (i15 == i16 && i17 == i18) {
                objectAnimatorA = null;
                i11 = i22;
                i13 = i16;
                i12 = i20;
            } else {
                i11 = i22;
                i12 = i20;
                i13 = i16;
                objectAnimatorA = AbstractC1788f.a(view, f18294Y, y().a(i15, i17, i16, i18));
            }
            boolean z10 = rect4 == null;
            if (z10) {
                i14 = 0;
                rect = new Rect(0, 0, i23, i24);
            } else {
                i14 = 0;
                rect = rect4;
            }
            int i28 = rect5 == null ? 1 : i14;
            Rect rect6 = i28 != 0 ? new Rect(i14, i14, i25, i26) : rect5;
            if (rect.equals(rect6)) {
                objectAnimatorOfObject = null;
            } else {
                view.setClipBounds(rect);
                objectAnimatorOfObject = ObjectAnimator.ofObject(view, "clipBounds", f18295Z, rect, rect6);
                g gVar = new g(view, rect, z10, rect6, i28, i15, i17, i19, i21, i13, i18, i12, i11);
                objectAnimatorOfObject.addListener(gVar);
                a(gVar);
            }
            animatorC = u.c(objectAnimatorA, objectAnimatorOfObject);
        } else {
            y.d(view, i15, i17, i19, i21);
            if (i27 != 2) {
                animatorC = (i15 == i16 && i17 == i18) ? AbstractC1788f.a(view, f18292W, y().a(i19, i21, i20, i22)) : AbstractC1788f.a(view, f18293X, y().a(i15, i17, i16, i18));
            } else if (i23 == i25 && i24 == i26) {
                animatorC = AbstractC1788f.a(view, f18294Y, y().a(i15, i17, i16, i18));
            } else {
                i iVar = new i(view);
                ObjectAnimator objectAnimatorA2 = AbstractC1788f.a(iVar, f18290U, y().a(i15, i17, i16, i18));
                ObjectAnimator objectAnimatorA3 = AbstractC1788f.a(iVar, f18291V, y().a(i19, i21, i20, i22));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorA2, objectAnimatorA3);
                animatorSet.addListener(new f(iVar));
                animatorC = animatorSet;
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            x.b(viewGroup4, true);
            A().a(new h(viewGroup4));
        }
        return animatorC;
    }
}
