package W6;

import L6.r;
import android.content.Context;
import android.view.WindowInsets;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ReactPointerEventsView;
import com.swmansion.rnscreens.C2304q;
import com.swmansion.rnscreens.X;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends CoordinatorLayout implements ReactPointerEventsView {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final X f12129E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final ReactPointerEventsView f12130F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final Animation.AnimationListener f12131G;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements Animation.AnimationListener {
        a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            AbstractC2855l.g(animation, "animation");
            e.this.getFragment$react_native_screens_release().H();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            AbstractC2855l.g(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            AbstractC2855l.g(animation, "animation");
            e.this.getFragment$react_native_screens_release().I();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, X fragment, ReactPointerEventsView pointerEventsImpl) {
        super(context);
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(fragment, "fragment");
        AbstractC2855l.g(pointerEventsImpl, "pointerEventsImpl");
        this.f12129E = fragment;
        this.f12130F = pointerEventsImpl;
        this.f12131G = new a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        if (getVisibility() != 4) {
            super.clearFocus();
        }
    }

    public final X getFragment$react_native_screens_release() {
        return this.f12129E;
    }

    @Override // com.facebook.react.uimanager.ReactPointerEventsView
    public PointerEvents getPointerEvents() {
        return this.f12130F.getPointerEvents();
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        AbstractC2855l.f(windowInsetsOnApplyWindowInsets, "onApplyWindowInsets(...)");
        return windowInsetsOnApplyWindowInsets;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (r.d(this.f12129E.j())) {
            this.f12129E.j().u(z10);
        }
    }

    @Override // android.view.View
    public void startAnimation(Animation animation) {
        AbstractC2855l.g(animation, "animation");
        V6.a aVar = new V6.a(this.f12129E);
        aVar.setDuration(animation.getDuration());
        if ((animation instanceof AnimationSet) && !this.f12129E.isRemoving()) {
            AnimationSet animationSet = (AnimationSet) animation;
            animationSet.addAnimation(aVar);
            animationSet.setAnimationListener(this.f12131G);
            super.startAnimation(animationSet);
            return;
        }
        AnimationSet animationSet2 = new AnimationSet(true);
        animationSet2.addAnimation(animation);
        animationSet2.addAnimation(aVar);
        animationSet2.setAnimationListener(this.f12131G);
        super.startAnimation(animationSet2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(Context context, X fragment) {
        this(context, fragment, new C2304q());
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(fragment, "fragment");
    }
}
