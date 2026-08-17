package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.AbstractC1793k;

/* JADX INFO: renamed from: androidx.transition.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C1785c extends L {

    /* JADX INFO: renamed from: androidx.transition.c$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class a extends AnimatorListenerAdapter implements AbstractC1793k.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f18322a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f18323b = false;

        a(View view) {
            this.f18322a = view;
        }

        @Override // androidx.transition.AbstractC1793k.g
        public void b(AbstractC1793k abstractC1793k) {
            this.f18322a.setTag(AbstractC1790h.f18346d, Float.valueOf(this.f18322a.getVisibility() == 0 ? y.b(this.f18322a) : 0.0f));
        }

        @Override // androidx.transition.AbstractC1793k.g
        public void g(AbstractC1793k abstractC1793k) {
            this.f18322a.setTag(AbstractC1790h.f18346d, null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            y.e(this.f18322a, 1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f18322a.hasOverlappingRendering() && this.f18322a.getLayerType() == 0) {
                this.f18323b = true;
                this.f18322a.setLayerType(2, null);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z10) {
            if (this.f18323b) {
                this.f18322a.setLayerType(0, null);
            }
            if (z10) {
                return;
            }
            y.e(this.f18322a, 1.0f);
            y.a(this.f18322a);
        }

        @Override // androidx.transition.AbstractC1793k.g
        public void a(AbstractC1793k abstractC1793k) {
        }

        @Override // androidx.transition.AbstractC1793k.g
        public void d(AbstractC1793k abstractC1793k) {
        }

        @Override // androidx.transition.AbstractC1793k.g
        public void e(AbstractC1793k abstractC1793k) {
        }

        @Override // androidx.transition.AbstractC1793k.g
        public void f(AbstractC1793k abstractC1793k, boolean z10) {
        }
    }

    public C1785c(int i10) {
        r0(i10);
    }

    private Animator s0(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        y.e(view, f10);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) y.f18425b, f11);
        a aVar = new a(view);
        objectAnimatorOfFloat.addListener(aVar);
        A().a(aVar);
        return objectAnimatorOfFloat;
    }

    private static float v0(v vVar, float f10) {
        Float f11;
        return (vVar == null || (f11 = (Float) vVar.f18416a.get("android:fade:transitionAlpha")) == null) ? f10 : f11.floatValue();
    }

    @Override // androidx.transition.L, androidx.transition.AbstractC1793k
    public void j(v vVar) {
        super.j(vVar);
        Float fValueOf = (Float) vVar.f18417b.getTag(AbstractC1790h.f18346d);
        if (fValueOf == null) {
            fValueOf = vVar.f18417b.getVisibility() == 0 ? Float.valueOf(y.b(vVar.f18417b)) : Float.valueOf(0.0f);
        }
        vVar.f18416a.put("android:fade:transitionAlpha", fValueOf);
    }

    @Override // androidx.transition.L
    public Animator n0(ViewGroup viewGroup, View view, v vVar, v vVar2) {
        y.c(view);
        return s0(view, v0(vVar, 0.0f), 1.0f);
    }

    @Override // androidx.transition.L
    public Animator p0(ViewGroup viewGroup, View view, v vVar, v vVar2) {
        y.c(view);
        Animator animatorS0 = s0(view, v0(vVar, 1.0f), 0.0f);
        if (animatorS0 == null) {
            y.e(view, v0(vVar2, 1.0f));
        }
        return animatorS0;
    }

    public C1785c() {
    }
}
