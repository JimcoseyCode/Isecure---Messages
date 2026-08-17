package L6;

import L6.g;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.react.uimanager.ThemedReactContext;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.swmansion.rnscreens.C2311y;
import com.swmansion.rnscreens.X;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ThemedReactContext f7239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f7240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f7241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private BottomSheetBehavior.f f7242d;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class a extends BottomSheetBehavior.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C2311y f7243a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final View f7244b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f7245c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f7246d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f7247e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private float f7248f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final ValueAnimator f7249g;

        public a(C2311y screen, View viewToAnimate, float f10) {
            AbstractC2855l.g(screen, "screen");
            AbstractC2855l.g(viewToAnimate, "viewToAnimate");
            this.f7243a = screen;
            this.f7244b = viewToAnimate;
            this.f7245c = f10;
            this.f7246d = f(screen.getSheetLargestUndimmedDetentIndex());
            float f11 = f(B7.d.l(screen.getSheetLargestUndimmedDetentIndex() + 1, 0, screen.getSheetDetents().d() - 1));
            this.f7247e = f11;
            this.f7248f = f11 - this.f7246d;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, f10);
            valueAnimatorOfFloat.setDuration(1L);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: L6.f
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    g.a.e(this.f7238a, valueAnimator);
                }
            });
            this.f7249g = valueAnimatorOfFloat;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(a aVar, ValueAnimator it) {
            AbstractC2855l.g(it, "it");
            View view = aVar.f7244b;
            Object animatedValue = it.getAnimatedValue();
            AbstractC2855l.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            view.setAlpha(((Float) animatedValue).floatValue());
        }

        private final float f(int i10) {
            int iD = this.f7243a.getSheetDetents().d();
            if (iD == 1) {
                return (i10 == -1 || i10 != 0) ? -1.0f : 1.0f;
            }
            if (iD == 2) {
                if (i10 == -1) {
                    return -1.0f;
                }
                if (i10 != 0) {
                    return i10 != 1 ? -1.0f : 1.0f;
                }
                return 0.0f;
            }
            if (iD != 3 || i10 == -1) {
                return -1.0f;
            }
            if (i10 == 0) {
                return 0.0f;
            }
            if (i10 != 1) {
                return i10 != 2 ? -1.0f : 1.0f;
            }
            BottomSheetBehavior<C2311y> sheetBehavior = this.f7243a.getSheetBehavior();
            AbstractC2855l.d(sheetBehavior);
            return sheetBehavior.o0();
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void b(View bottomSheet, float f10) {
            AbstractC2855l.g(bottomSheet, "bottomSheet");
            float f11 = this.f7246d;
            if (f11 >= f10 || f10 >= this.f7247e) {
                return;
            }
            this.f7249g.setCurrentFraction((f10 - f11) / this.f7248f);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void c(View bottomSheet, int i10) {
            AbstractC2855l.g(bottomSheet, "bottomSheet");
            if (i10 == 1 || i10 == 2) {
                this.f7246d = f(this.f7243a.getSheetLargestUndimmedDetentIndex());
                float f10 = f(B7.d.l(this.f7243a.getSheetLargestUndimmedDetentIndex() + 1, 0, this.f7243a.getSheetDetents().d() - 1));
                this.f7247e = f10;
                this.f7248f = f10 - this.f7246d;
            }
        }
    }

    public g(ThemedReactContext reactContext, C2311y screen) {
        AbstractC2855l.g(reactContext, "reactContext");
        AbstractC2855l.g(screen, "screen");
        this.f7239a = reactContext;
        this.f7240b = b(screen);
        this.f7241c = 0.3f;
    }

    private final d b(final C2311y c2311y) {
        d dVar = new d(this.f7239a, this.f7241c);
        dVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        dVar.setOnClickListener(new View.OnClickListener() { // from class: L6.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g.c(c2311y, view);
            }
        });
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C2311y c2311y, View view) {
        if (c2311y.getSheetClosesOnTouchOutside()) {
            Fragment fragment = c2311y.getFragment();
            AbstractC2855l.e(fragment, "null cannot be cast to non-null type com.swmansion.rnscreens.ScreenStackFragment");
            ((X) fragment).Z();
        }
    }

    private final BottomSheetBehavior.f i(C2311y c2311y, boolean z10) {
        if (this.f7242d == null || z10) {
            this.f7242d = new a(c2311y, this.f7240b, this.f7241c);
        }
        BottomSheetBehavior.f fVar = this.f7242d;
        AbstractC2855l.d(fVar);
        return fVar;
    }

    public final d d() {
        return this.f7240b;
    }

    public final float e() {
        return this.f7241c;
    }

    public final void f(BottomSheetBehavior bottomSheetBehavior) {
        BottomSheetBehavior.f fVar = this.f7242d;
        if (fVar == null || bottomSheetBehavior == null) {
            return;
        }
        bottomSheetBehavior.D0(fVar);
    }

    public final void g(C2311y screen, BottomSheetBehavior behavior) {
        AbstractC2855l.g(screen, "screen");
        AbstractC2855l.g(behavior, "behavior");
        behavior.Y(i(screen, true));
    }

    public final void h(C2311y screen, ViewGroup root) {
        AbstractC2855l.g(screen, "screen");
        AbstractC2855l.g(root, "root");
        root.addView(this.f7240b, 0);
        if (j(screen, screen.getSheetInitialDetentIndex())) {
            this.f7240b.setAlpha(this.f7241c);
        } else {
            this.f7240b.setAlpha(0.0f);
        }
    }

    public final boolean j(C2311y screen, int i10) {
        AbstractC2855l.g(screen, "screen");
        return i10 > screen.getSheetLargestUndimmedDetentIndex();
    }
}
