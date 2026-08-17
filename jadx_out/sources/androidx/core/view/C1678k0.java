package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: androidx.core.view.k0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C1678k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f16563a;

    /* JADX INFO: renamed from: androidx.core.view.k0$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1680l0 f16564a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f16565b;

        a(InterfaceC1680l0 interfaceC1680l0, View view) {
            this.f16564a = interfaceC1680l0;
            this.f16565b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f16564a.a(this.f16565b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f16564a.b(this.f16565b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f16564a.c(this.f16565b);
        }
    }

    C1678k0(View view) {
        this.f16563a = new WeakReference(view);
    }

    private void h(View view, InterfaceC1680l0 interfaceC1680l0) {
        if (interfaceC1680l0 != null) {
            view.animate().setListener(new a(interfaceC1680l0, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public C1678k0 b(float f10) {
        View view = (View) this.f16563a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
        return this;
    }

    public void c() {
        View view = (View) this.f16563a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long d() {
        View view = (View) this.f16563a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public C1678k0 e(long j10) {
        View view = (View) this.f16563a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
        return this;
    }

    public C1678k0 f(Interpolator interpolator) {
        View view = (View) this.f16563a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public C1678k0 g(InterfaceC1680l0 interfaceC1680l0) {
        View view = (View) this.f16563a.get();
        if (view != null) {
            h(view, interfaceC1680l0);
        }
        return this;
    }

    public C1678k0 i(long j10) {
        View view = (View) this.f16563a.get();
        if (view != null) {
            view.animate().setStartDelay(j10);
        }
        return this;
    }

    public C1678k0 j(final InterfaceC1684n0 interfaceC1684n0) {
        final View view = (View) this.f16563a.get();
        if (view != null) {
            view.animate().setUpdateListener(interfaceC1684n0 != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.j0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    interfaceC1684n0.a(view);
                }
            } : null);
        }
        return this;
    }

    public void k() {
        View view = (View) this.f16563a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public C1678k0 l(float f10) {
        View view = (View) this.f16563a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
        return this;
    }
}
