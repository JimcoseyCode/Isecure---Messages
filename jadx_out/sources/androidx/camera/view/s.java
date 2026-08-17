package androidx.camera.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import java.util.Objects;
import y.AbstractC3583h0;
import y.V;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends View {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Window f15412g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private V.i f15413h;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements V.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f15414a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ValueAnimator f15415b;

        a() {
        }

        @Override // y.V.i
        public void a(long j10, final V.j jVar) {
            AbstractC3583h0.a("ScreenFlashView", "ScreenFlash#apply");
            this.f15414a = s.this.getBrightness();
            s.this.setBrightness(1.0f);
            ValueAnimator valueAnimator = this.f15415b;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            s sVar = s.this;
            Objects.requireNonNull(jVar);
            this.f15415b = sVar.e(new Runnable() { // from class: androidx.camera.view.r
                @Override // java.lang.Runnable
                public final void run() {
                    jVar.a();
                }
            });
        }

        @Override // y.V.i
        public void clear() {
            AbstractC3583h0.a("ScreenFlashView", "ScreenFlash#clear");
            ValueAnimator valueAnimator = this.f15415b;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f15415b = null;
            }
            s.this.setAlpha(0.0f);
            s.this.setBrightness(this.f15414a);
        }
    }

    public s(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void a(s sVar, ValueAnimator valueAnimator) {
        sVar.getClass();
        AbstractC3583h0.a("ScreenFlashView", "animateToFullOpacity: value = " + ((Float) valueAnimator.getAnimatedValue()).floatValue());
        sVar.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ValueAnimator e(Runnable runnable) {
        AbstractC3583h0.a("ScreenFlashView", "animateToFullOpacity");
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(getVisibilityRampUpAnimationDurationMillis());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.camera.view.q
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                s.a(this.f15410a, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new b(runnable));
        valueAnimatorOfFloat.start();
        return valueAnimatorOfFloat;
    }

    private void f(Window window) {
        StringBuilder sb = new StringBuilder();
        sb.append("updateScreenFlash: is new window null = ");
        sb.append(window == null);
        sb.append(",  is new window same as previous = ");
        sb.append(window == this.f15412g);
        AbstractC3583h0.a("ScreenFlashView", sb.toString());
        if (this.f15412g != window) {
            this.f15413h = window == null ? null : new a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getBrightness() {
        Window window = this.f15412g;
        if (window != null) {
            return window.getAttributes().screenBrightness;
        }
        AbstractC3583h0.c("ScreenFlashView", "setBrightness: mScreenFlashWindow is null!");
        return Float.NaN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrightness(float f10) {
        if (this.f15412g == null) {
            AbstractC3583h0.c("ScreenFlashView", "setBrightness: mScreenFlashWindow is null!");
            return;
        }
        if (Float.isNaN(f10)) {
            AbstractC3583h0.c("ScreenFlashView", "setBrightness: value is NaN!");
            return;
        }
        WindowManager.LayoutParams attributes = this.f15412g.getAttributes();
        attributes.screenBrightness = f10;
        this.f15412g.setAttributes(attributes);
        AbstractC3583h0.a("ScreenFlashView", "Brightness set to " + attributes.screenBrightness);
    }

    private void setScreenFlashUiInfo(V.i iVar) {
        AbstractC3583h0.a("ScreenFlashView", "setScreenFlashUiInfo: mCameraController is null!");
    }

    public V.i getScreenFlash() {
        return this.f15413h;
    }

    public long getVisibilityRampUpAnimationDurationMillis() {
        return 1000L;
    }

    public void setController(AbstractC1653a abstractC1653a) {
        H.y.b();
    }

    public void setScreenFlashWindow(Window window) {
        H.y.b();
        f(window);
        this.f15412g = window;
        setScreenFlashUiInfo(getScreenFlash());
    }

    public s(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public s(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public s(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        setBackgroundColor(-1);
        setAlpha(0.0f);
        setElevation(Float.MAX_VALUE);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f15417a;

        b(Runnable runnable) {
            this.f15417a = runnable;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC3583h0.a("ScreenFlashView", "ScreenFlash#apply: onAnimationEnd");
            Runnable runnable = this.f15417a;
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }
}
