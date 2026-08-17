package androidx.core.widget;

import I0.B;
import I0.z;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.view.AbstractC1658a0;
import androidx.core.view.C;
import androidx.core.view.C1657a;
import androidx.core.view.C1685o;
import androidx.core.view.D;
import androidx.core.view.E;
import androidx.core.view.G;
import androidx.core.view.H;
import androidx.core.view.InterfaceC1687p;
import androidx.core.view.M;
import com.facebook.react.uimanager.ViewDefaults;
import com.facebook.react.views.progressbar.ProgressBarContainerView;
import java.util.ArrayList;
import v0.AbstractC3413a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements G, D {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private static final float f16636K = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private static final a f16637L = new a();

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static final int[] f16638M = {R.attr.fillViewport};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final int[] f16639A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f16640B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f16641C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private SavedState f16642D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final H f16643E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final E f16644F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private float f16645G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private e f16646H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    final d f16647I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    C1685o f16648J;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f16649g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f16650h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Rect f16651i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private OverScroller f16652j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public EdgeEffect f16653k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public EdgeEffect f16654l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    M f16655m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f16656n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f16657o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f16658p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private View f16659q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f16660r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private VelocityTracker f16661s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f16662t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f16663u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f16664v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f16665w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f16666x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f16667y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final int[] f16668z;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f16669g;

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f16669g + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f16669g);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f16669g = parcel.readInt();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a extends C1657a {
        a() {
        }

        @Override // androidx.core.view.C1657a
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            B.a(accessibilityEvent, nestedScrollView.getScrollX());
            B.b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // androidx.core.view.C1657a
        public void onInitializeAccessibilityNodeInfo(View view, z zVar) {
            int scrollRange;
            super.onInitializeAccessibilityNodeInfo(view, zVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            zVar.w0(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            zVar.R0(true);
            if (nestedScrollView.getScrollY() > 0) {
                zVar.b(z.a.f3891r);
                zVar.b(z.a.f3858C);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                zVar.b(z.a.f3890q);
                zVar.b(z.a.f3860E);
            }
        }

        @Override // androidx.core.view.C1657a
        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            if (super.performAccessibilityAction(view, i10, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i10 != 4096) {
                if (i10 == 8192 || i10 == 16908344) {
                    int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (iMax == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.R(0, iMax, true);
                    return true;
                }
                if (i10 != 16908346) {
                    return false;
                }
            }
            int iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (iMin == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.R(0, iMin, true);
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class b {
        static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class c {
        public static void a(View view, float f10) {
            try {
                view.setFrameContentVelocity(f10);
            } catch (LinkageError unused) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class d implements InterfaceC1687p {
        d() {
        }

        @Override // androidx.core.view.InterfaceC1687p
        public boolean a(float f10) {
            if (f10 == 0.0f) {
                return false;
            }
            c();
            NestedScrollView.this.p((int) f10);
            return true;
        }

        @Override // androidx.core.view.InterfaceC1687p
        public float b() {
            return -NestedScrollView.this.getVerticalScrollFactorCompat();
        }

        @Override // androidx.core.view.InterfaceC1687p
        public void c() {
            NestedScrollView.this.f16652j.abortAnimation();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface e {
        void a(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC3413a.f32773c);
    }

    private boolean A(View view, int i10, int i11) {
        view.getDrawingRect(this.f16651i);
        offsetDescendantRectToMyCoords(view, this.f16651i);
        return this.f16651i.bottom + i10 >= getScrollY() && this.f16651i.top - i10 <= getScrollY() + i11;
    }

    private void B(int i10, int i11, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i10);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f16644F.e(0, scrollY2, 0, i10 - scrollY2, null, i11, iArr);
    }

    private void C(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f16667y) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f16656n = (int) motionEvent.getY(i10);
            this.f16667y = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f16661s;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void F() {
        VelocityTracker velocityTracker = this.f16661s;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f16661s = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int G(int i10, float f10) {
        float fD;
        int iRound;
        float width = f10 / getWidth();
        float height = i10 / getHeight();
        float f11 = 0.0f;
        if (androidx.core.widget.d.b(this.f16653k) == 0.0f) {
            if (androidx.core.widget.d.b(this.f16654l) != 0.0f) {
                fD = androidx.core.widget.d.d(this.f16654l, height, 1.0f - width);
                if (androidx.core.widget.d.b(this.f16654l) == 0.0f) {
                    this.f16654l.onRelease();
                }
            }
            iRound = Math.round(f11 * getHeight());
            if (iRound != 0) {
                invalidate();
            }
            return iRound;
        }
        fD = -androidx.core.widget.d.d(this.f16653k, -height, width);
        if (androidx.core.widget.d.b(this.f16653k) == 0.0f) {
            this.f16653k.onRelease();
        }
        f11 = fD;
        iRound = Math.round(f11 * getHeight());
        if (iRound != 0) {
        }
        return iRound;
    }

    private void H(boolean z10) {
        if (z10) {
            S(2, 1);
        } else {
            U(1);
        }
        this.f16641C = getScrollY();
        postInvalidateOnAnimation();
    }

    private boolean I(int i10, int i11, int i12) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i13 = height + scrollY;
        boolean z10 = false;
        boolean z11 = i10 == 33;
        View viewO = o(z11, i11, i12);
        if (viewO == null) {
            viewO = this;
        }
        if (i11 < scrollY || i12 > i13) {
            J(z11 ? i11 - scrollY : i12 - i13, 0, 1, true);
            z10 = true;
        }
        if (viewO != findFocus()) {
            viewO.requestFocus(i10);
        }
        return z10;
    }

    private int J(int i10, int i11, int i12, boolean z10) {
        return K(i10, -1, null, i11, i12, z10);
    }

    private void L(View view) {
        view.getDrawingRect(this.f16651i);
        offsetDescendantRectToMyCoords(view, this.f16651i);
        int iG = g(this.f16651i);
        if (iG != 0) {
            scrollBy(0, iG);
        }
    }

    private boolean M(Rect rect, boolean z10) {
        int iG = g(rect);
        boolean z11 = iG != 0;
        if (z11) {
            if (z10) {
                scrollBy(0, iG);
                return z11;
            }
            O(0, iG);
        }
        return z11;
    }

    private boolean N(EdgeEffect edgeEffect, int i10) {
        if (i10 > 0) {
            return true;
        }
        return r(-i10) < androidx.core.widget.d.b(edgeEffect) * ((float) getHeight());
    }

    private void P(int i10, int i11, int i12, boolean z10) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f16650h > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f16652j.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i11 + scrollY, Math.max(0, height - height2))) - scrollY, i12);
            H(z10);
        } else {
            if (!this.f16652j.isFinished()) {
                a();
            }
            scrollBy(i10, i11);
        }
        this.f16650h = AnimationUtils.currentAnimationTimeMillis();
    }

    private boolean T(MotionEvent motionEvent) {
        boolean z10;
        if (androidx.core.widget.d.b(this.f16653k) != 0.0f) {
            androidx.core.widget.d.d(this.f16653k, 0.0f, motionEvent.getX() / getWidth());
            z10 = true;
        } else {
            z10 = false;
        }
        if (androidx.core.widget.d.b(this.f16654l) == 0.0f) {
            return z10;
        }
        androidx.core.widget.d.d(this.f16654l, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    private void a() {
        this.f16652j.abortAnimation();
        U(1);
    }

    private boolean d() {
        int overScrollMode = getOverScrollMode();
        return overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0);
    }

    private boolean e() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                return true;
            }
        }
        return false;
    }

    private static int f(int i10, int i11, int i12) {
        if (i11 >= i12 || i10 < 0) {
            return 0;
        }
        return i11 + i10 > i12 ? i12 - i11 : i10;
    }

    private M getScrollFeedbackProvider() {
        if (this.f16655m == null) {
            this.f16655m = M.a(this);
        }
        return this.f16655m;
    }

    private void k(int i10) {
        if (i10 != 0) {
            if (this.f16663u) {
                O(0, i10);
            } else {
                scrollBy(0, i10);
            }
        }
    }

    private boolean l(int i10) {
        if (androidx.core.widget.d.b(this.f16653k) != 0.0f) {
            if (N(this.f16653k, i10)) {
                this.f16653k.onAbsorb(i10);
                return true;
            }
            p(-i10);
            return true;
        }
        if (androidx.core.widget.d.b(this.f16654l) == 0.0f) {
            return false;
        }
        int i11 = -i10;
        if (N(this.f16654l, i11)) {
            this.f16654l.onAbsorb(i11);
            return true;
        }
        p(i11);
        return true;
    }

    private void m() {
        this.f16667y = -1;
        this.f16660r = false;
        F();
        U(0);
        this.f16653k.onRelease();
        this.f16654l.onRelease();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private View o(boolean z10, int i10, int i11) {
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z11 = false;
        for (int i12 = 0; i12 < size; i12++) {
            View view2 = focusables.get(i12);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i10 < bottom && top < i11) {
                boolean z12 = i10 < top && bottom < i11;
                if (view == null) {
                    view = view2;
                    z11 = z12;
                } else {
                    boolean z13 = (z10 && top < view.getTop()) || (!z10 && bottom > view.getBottom());
                    if (z11) {
                        if (z12 && z13) {
                            view = view2;
                        }
                    } else if (z12) {
                        view = view2;
                        z11 = true;
                    } else if (z13) {
                    }
                }
            }
        }
        return view;
    }

    private float r(int i10) {
        double dLog = Math.log((Math.abs(i10) * 0.35f) / (this.f16649g * 0.015f));
        float f10 = f16636K;
        return (float) (((double) (this.f16649g * 0.015f)) * Math.exp((((double) f10) / (((double) f10) - 1.0d)) * dLog));
    }

    private boolean t(int i10, int i11) {
        if (getChildCount() > 0) {
            int scrollY = getScrollY();
            View childAt = getChildAt(0);
            if (i11 >= childAt.getTop() - scrollY && i11 < childAt.getBottom() - scrollY && i10 >= childAt.getLeft() && i10 < childAt.getRight()) {
                return true;
            }
        }
        return false;
    }

    private void u() {
        VelocityTracker velocityTracker = this.f16661s;
        if (velocityTracker == null) {
            this.f16661s = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void v() {
        this.f16652j = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f16664v = viewConfiguration.getScaledTouchSlop();
        this.f16665w = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f16666x = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void w() {
        if (this.f16661s == null) {
            this.f16661s = VelocityTracker.obtain();
        }
    }

    private void x(int i10, int i11) {
        this.f16656n = i10;
        this.f16667y = i11;
        S(2, 0);
    }

    private boolean y(View view) {
        return !A(view, 0, getHeight());
    }

    private static boolean z(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && z((View) parent, view2);
    }

    boolean D(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10) {
        boolean z11;
        boolean z12;
        int i18;
        int overScrollMode = getOverScrollMode();
        boolean z13 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z14 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z15 = overScrollMode == 0 || (overScrollMode == 1 && z13);
        boolean z16 = overScrollMode == 0 || (overScrollMode == 1 && z14);
        int i19 = i12 + i10;
        int i20 = !z15 ? 0 : i16;
        int i21 = i13 + i11;
        int i22 = !z16 ? 0 : i17;
        int i23 = -i20;
        int i24 = i20 + i14;
        int i25 = -i22;
        int i26 = i22 + i15;
        if (i19 > i24) {
            i19 = i24;
            z11 = true;
        } else if (i19 < i23) {
            z11 = true;
            i19 = i23;
        } else {
            z11 = false;
        }
        if (i21 > i26) {
            i21 = i26;
            z12 = true;
        } else if (i21 < i25) {
            z12 = true;
            i21 = i25;
        } else {
            z12 = false;
        }
        if (!z12 || s(1)) {
            i18 = i19;
        } else {
            int i27 = i19;
            this.f16652j.springBack(i27, i21, 0, 0, 0, getScrollRange());
            i18 = i27;
        }
        onOverScrolled(i18, i21, z11, z12);
        return z11 || z12;
    }

    public boolean E(int i10) {
        boolean z10 = i10 == 130;
        int height = getHeight();
        if (z10) {
            this.f16651i.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f16651i;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f16651i.top = getScrollY() - height;
            Rect rect2 = this.f16651i;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f16651i;
        int i11 = rect3.top;
        int i12 = height + i11;
        rect3.bottom = i12;
        return I(i10, i11, i12);
    }

    int K(int i10, int i11, MotionEvent motionEvent, int i12, int i13, boolean z10) {
        int i14;
        int i15;
        VelocityTracker velocityTracker;
        if (i13 == 1) {
            S(2, i13);
        }
        boolean z11 = false;
        if (i(0, i10, this.f16639A, this.f16668z, i13)) {
            int i16 = i10 - this.f16639A[1];
            i15 = this.f16668z[1];
            i14 = i16;
        } else {
            i14 = i10;
            i15 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        boolean z12 = d() && !z10;
        int i17 = i14;
        boolean z13 = D(0, i14, 0, scrollY, 0, scrollRange, 0, 0, true) && !s(i13);
        int scrollY2 = getScrollY() - scrollY;
        if (motionEvent != null && scrollY2 != 0) {
            getScrollFeedbackProvider().c(motionEvent.getDeviceId(), motionEvent.getSource(), i11, scrollY2);
        }
        int[] iArr = this.f16639A;
        iArr[1] = 0;
        j(0, scrollY2, 0, i17 - scrollY2, this.f16668z, i13, iArr);
        int i18 = i15 + this.f16668z[1];
        int i19 = i17 - this.f16639A[1];
        int i20 = scrollY + i19;
        if (i20 < 0) {
            if (z12) {
                androidx.core.widget.d.d(this.f16653k, (-i19) / getHeight(), i12 / getWidth());
                if (motionEvent != null) {
                    getScrollFeedbackProvider().b(motionEvent.getDeviceId(), motionEvent.getSource(), i11, true);
                }
                if (!this.f16654l.isFinished()) {
                    this.f16654l.onRelease();
                }
            }
        } else if (i20 > scrollRange && z12) {
            androidx.core.widget.d.d(this.f16654l, i19 / getHeight(), 1.0f - (i12 / getWidth()));
            if (motionEvent != null) {
                getScrollFeedbackProvider().b(motionEvent.getDeviceId(), motionEvent.getSource(), i11, false);
            }
            if (!this.f16653k.isFinished()) {
                this.f16653k.onRelease();
            }
        }
        if (this.f16653k.isFinished() && this.f16654l.isFinished()) {
            z11 = z13;
        } else {
            postInvalidateOnAnimation();
        }
        if (z11 && i13 == 0 && (velocityTracker = this.f16661s) != null) {
            velocityTracker.clear();
        }
        if (i13 == 1) {
            U(i13);
            this.f16653k.onRelease();
            this.f16654l.onRelease();
        }
        return i18;
    }

    public final void O(int i10, int i11) {
        P(i10, i11, 250, false);
    }

    void Q(int i10, int i11, int i12, boolean z10) {
        P(i10 - getScrollX(), i11 - getScrollY(), i12, z10);
    }

    void R(int i10, int i11, boolean z10) {
        Q(i10, i11, 250, z10);
    }

    public boolean S(int i10, int i11) {
        return this.f16644F.q(i10, i11);
    }

    public void U(int i10) {
        this.f16644F.s(i10);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    public boolean c(int i10) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i10);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !A(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i10 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i10 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i10 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            J(maxScrollAmount, 0, 1, true);
        } else {
            viewFindNextFocus.getDrawingRect(this.f16651i);
            offsetDescendantRectToMyCoords(viewFindNextFocus, this.f16651i);
            J(g(this.f16651i), 0, 1, true);
            viewFindNextFocus.requestFocus(i10);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && y(viewFindFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        int i10;
        if (this.f16652j.isFinished()) {
            return;
        }
        this.f16652j.computeScrollOffset();
        int currY = this.f16652j.getCurrY();
        int iH = h(currY - this.f16641C);
        this.f16641C = currY;
        int[] iArr = this.f16639A;
        iArr[1] = 0;
        i(0, iH, iArr, null, 1);
        int i11 = iH - this.f16639A[1];
        int scrollRange = getScrollRange();
        if (Build.VERSION.SDK_INT >= 35) {
            c.a(this, Math.abs(this.f16652j.getCurrVelocity()));
        }
        if (i11 != 0) {
            int scrollY = getScrollY();
            D(0, i11, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            i10 = scrollRange;
            int scrollY2 = getScrollY() - scrollY;
            int i12 = i11 - scrollY2;
            int[] iArr2 = this.f16639A;
            iArr2[1] = 0;
            j(0, scrollY2, 0, i12, this.f16668z, 1, iArr2);
            i11 = i12 - this.f16639A[1];
        } else {
            i10 = scrollRange;
        }
        if (i11 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && i10 > 0)) {
                if (i11 < 0) {
                    if (this.f16653k.isFinished()) {
                        this.f16653k.onAbsorb((int) this.f16652j.getCurrVelocity());
                    }
                } else if (this.f16654l.isFinished()) {
                    this.f16654l.onAbsorb((int) this.f16652j.getCurrVelocity());
                }
            }
            a();
        }
        if (this.f16652j.isFinished()) {
            U(1);
        } else {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || n(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.f16644F.a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f16644F.b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return i(i10, i11, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f16644F.f(i10, i11, i12, i13, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        int paddingLeft2 = 0;
        if (!this.f16653k.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (b.a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (b.a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            this.f16653k.setSize(width, height);
            if (this.f16653k.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        if (this.f16654l.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (b.a(this)) {
            width2 -= getPaddingLeft() + getPaddingRight();
            paddingLeft2 = getPaddingLeft();
        }
        if (b.a(this)) {
            height2 -= getPaddingTop() + getPaddingBottom();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        this.f16654l.setSize(width2, height2);
        if (this.f16654l.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    protected int g(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i10 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i11 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i10 - verticalFadingEdgeLength : i10;
        int i12 = rect.bottom;
        if (i12 > i11 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i11, (childAt.getBottom() + layoutParams.bottomMargin) - i10);
        }
        if (rect.top >= scrollY || i12 >= i11) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i11 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f16643E.a();
    }

    int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    float getVerticalScrollFactorCompat() {
        if (this.f16645G == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f16645G = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f16645G;
    }

    int h(int i10) {
        int height = getHeight();
        if (i10 > 0 && androidx.core.widget.d.b(this.f16653k) != 0.0f) {
            int iRound = Math.round(((-height) / 4.0f) * androidx.core.widget.d.d(this.f16653k, ((-i10) * 4.0f) / height, 0.5f));
            if (iRound != i10) {
                this.f16653k.finish();
            }
            return i10 - iRound;
        }
        if (i10 >= 0 || androidx.core.widget.d.b(this.f16654l) == 0.0f) {
            return i10;
        }
        float f10 = height;
        int iRound2 = Math.round((f10 / 4.0f) * androidx.core.widget.d.d(this.f16654l, (i10 * 4.0f) / f10, 0.5f));
        if (iRound2 != i10) {
            this.f16654l.finish();
        }
        return i10 - iRound2;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return s(0);
    }

    public boolean i(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return this.f16644F.d(i10, i11, iArr, iArr2, i12);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f16644F.m();
    }

    public void j(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        this.f16644F.e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    @Override // android.view.ViewGroup
    protected void measureChild(View view, int i10, int i11) {
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public boolean n(KeyEvent keyEvent) {
        this.f16651i.setEmpty();
        if (!e()) {
            if (isFocused() && keyEvent.getKeyCode() != 4) {
                View viewFindFocus = findFocus();
                if (viewFindFocus == this) {
                    viewFindFocus = null;
                }
                View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
                if (viewFindNextFocus != null && viewFindNextFocus != this && viewFindNextFocus.requestFocus(130)) {
                    return true;
                }
            }
            return false;
        }
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                return keyEvent.isAltPressed() ? q(33) : c(33);
            }
            if (keyCode == 20) {
                return keyEvent.isAltPressed() ? q(130) : c(130);
            }
            if (keyCode == 62) {
                E(keyEvent.isShiftPressed() ? 33 : 130);
                return false;
            }
            if (keyCode == 92) {
                return q(33);
            }
            if (keyCode == 93) {
                return q(130);
            }
            if (keyCode == 122) {
                E(33);
                return false;
            }
            if (keyCode == 123) {
                E(130);
                return false;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f16658p = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i10;
        int width;
        float axisValue;
        if (motionEvent.getAction() == 8 && !this.f16660r) {
            if (C.a(motionEvent, 2)) {
                axisValue = motionEvent.getAxisValue(9);
                i10 = 9;
                width = (int) motionEvent.getX();
            } else if (C.a(motionEvent, 4194304)) {
                float axisValue2 = motionEvent.getAxisValue(26);
                width = getWidth() / 2;
                i10 = 26;
                axisValue = axisValue2;
            } else {
                i10 = 0;
                width = 0;
                axisValue = 0.0f;
            }
            if (axisValue != 0.0f) {
                K(-((int) (axisValue * getVerticalScrollFactorCompat())), i10, motionEvent, width, 1, C.a(motionEvent, 8194));
                if (i10 == 0) {
                    return true;
                }
                this.f16648J.g(motionEvent, i10);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0063  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int iFindPointerIndex;
        int action = motionEvent.getAction();
        boolean z10 = true;
        if (action == 2 && this.f16660r) {
            return true;
        }
        int i10 = action & 255;
        if (i10 == 0) {
            int y10 = (int) motionEvent.getY();
            if (t((int) motionEvent.getX(), y10)) {
                this.f16656n = y10;
                this.f16667y = motionEvent.getPointerId(0);
                u();
                this.f16661s.addMovement(motionEvent);
                this.f16652j.computeScrollOffset();
                if (!T(motionEvent) && this.f16652j.isFinished()) {
                    z10 = false;
                }
                this.f16660r = z10;
                S(2, 0);
            } else {
                if (!T(motionEvent) && this.f16652j.isFinished()) {
                    z10 = false;
                }
                this.f16660r = z10;
                F();
            }
        } else if (i10 == 1) {
            this.f16660r = false;
            this.f16667y = -1;
            F();
            if (this.f16652j.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            U(0);
        } else if (i10 == 2) {
            int i11 = this.f16667y;
            if (i11 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i11)) != -1) {
                int y11 = (int) motionEvent.getY(iFindPointerIndex);
                if (Math.abs(y11 - this.f16656n) > this.f16664v && (2 & getNestedScrollAxes()) == 0) {
                    this.f16660r = true;
                    this.f16656n = y11;
                    w();
                    this.f16661s.addMovement(motionEvent);
                    this.f16640B = 0;
                    ViewParent parent = getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                }
            }
        } else if (i10 != 3) {
            if (i10 == 6) {
                C(motionEvent);
            }
        }
        return this.f16660r;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int measuredHeight = 0;
        this.f16657o = false;
        View view = this.f16659q;
        if (view != null && z(view, this)) {
            L(this.f16659q);
        }
        this.f16659q = null;
        if (!this.f16658p) {
            if (this.f16642D != null) {
                scrollTo(getScrollX(), this.f16642D.f16669g);
                this.f16642D = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iF = f(scrollY, paddingTop, measuredHeight);
            if (iF != scrollY) {
                scrollTo(getScrollX(), iF);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f16658p = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f16662t && View.MeasureSpec.getMode(i11) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (z10) {
            return false;
        }
        dispatchNestedFling(0.0f, f11, true);
        p((int) f11);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    @Override // androidx.core.view.F
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr, int i12) {
        i(i10, i11, iArr, null, i12);
    }

    @Override // androidx.core.view.G
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        B(i13, i14, iArr);
    }

    @Override // androidx.core.view.F
    public void onNestedScrollAccepted(View view, View view2, int i10, int i11) {
        this.f16643E.c(view, view2, i10, i11);
        S(2, i11);
    }

    @Override // android.view.View
    protected void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        super.scrollTo(i10, i11);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (i10 == 2) {
            i10 = 130;
        } else if (i10 == 1) {
            i10 = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i10) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i10);
        if (viewFindNextFocus == null || y(viewFindNextFocus)) {
            return false;
        }
        return viewFindNextFocus.requestFocus(i10, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f16642D = savedState;
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f16669g = getScrollY();
        return savedState;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        e eVar = this.f16646H;
        if (eVar != null) {
            eVar.a(this, i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !A(viewFindFocus, 0, i13)) {
            return;
        }
        viewFindFocus.getDrawingRect(this.f16651i);
        offsetDescendantRectToMyCoords(viewFindFocus, this.f16651i);
        k(g(this.f16651i));
    }

    @Override // androidx.core.view.F
    public boolean onStartNestedScroll(View view, View view2, int i10, int i11) {
        return (i10 & 2) != 0;
    }

    @Override // androidx.core.view.F
    public void onStopNestedScroll(View view, int i10) {
        this.f16643E.e(view, i10);
        U(i10);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        NestedScrollView nestedScrollView;
        ViewParent parent;
        w();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f16640B = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(0.0f, this.f16640B);
        if (actionMasked == 0) {
            nestedScrollView = this;
            if (getChildCount() == 0) {
                return false;
            }
            if (nestedScrollView.f16660r && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!nestedScrollView.f16652j.isFinished()) {
                a();
            }
            x((int) motionEvent.getY(), motionEvent.getPointerId(0));
        } else if (actionMasked != 1) {
            if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f16667y);
                if (iFindPointerIndex != -1) {
                    int y10 = (int) motionEvent.getY(iFindPointerIndex);
                    int i10 = this.f16656n - y10;
                    int iG = i10 - G(i10, motionEvent.getX(iFindPointerIndex));
                    if (!this.f16660r && Math.abs(iG) > this.f16664v) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f16660r = true;
                        iG = iG > 0 ? iG - this.f16664v : iG + this.f16664v;
                    }
                    int i11 = iG;
                    if (this.f16660r) {
                        nestedScrollView = this;
                        int iK = nestedScrollView.K(i11, 1, motionEvent, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        nestedScrollView.f16656n = y10 - iK;
                        nestedScrollView.f16640B += iK;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f16660r && getChildCount() > 0 && this.f16652j.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                m();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f16656n = (int) motionEvent.getY(actionIndex);
                this.f16667y = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                C(motionEvent);
                this.f16656n = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f16667y));
            }
            nestedScrollView = this;
        } else {
            nestedScrollView = this;
            VelocityTracker velocityTracker = nestedScrollView.f16661s;
            velocityTracker.computeCurrentVelocity(ProgressBarContainerView.MAX_PROGRESS, nestedScrollView.f16666x);
            int yVelocity = (int) velocityTracker.getYVelocity(nestedScrollView.f16667y);
            if (Math.abs(yVelocity) >= nestedScrollView.f16665w) {
                if (!l(yVelocity)) {
                    int i12 = -yVelocity;
                    float f10 = i12;
                    if (!dispatchNestedPreFling(0.0f, f10)) {
                        dispatchNestedFling(0.0f, f10, true);
                        p(i12);
                    }
                }
            } else if (nestedScrollView.f16652j.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            m();
        }
        VelocityTracker velocityTracker2 = nestedScrollView.f16661s;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public void p(int i10) {
        if (getChildCount() > 0) {
            this.f16652j.fling(getScrollX(), getScrollY(), 0, i10, 0, 0, androidx.customview.widget.a.INVALID_ID, ViewDefaults.NUMBER_OF_LINES, 0, 0);
            H(true);
            if (Build.VERSION.SDK_INT >= 35) {
                c.a(this, Math.abs(this.f16652j.getCurrVelocity()));
            }
        }
    }

    public boolean q(int i10) {
        int childCount;
        boolean z10 = i10 == 130;
        int height = getHeight();
        Rect rect = this.f16651i;
        rect.top = 0;
        rect.bottom = height;
        if (z10 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f16651i.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f16651i;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f16651i;
        return I(i10, rect3.top, rect3.bottom);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f16657o) {
            this.f16659q = view2;
        } else {
            L(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return M(rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        if (z10) {
            F();
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f16657o = true;
        super.requestLayout();
    }

    public boolean s(int i10) {
        return this.f16644F.l(i10);
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int iF = f(i10, width, width2);
            int iF2 = f(i11, height, height2);
            if (iF == getScrollX() && iF2 == getScrollY()) {
                return;
            }
            super.scrollTo(iF, iF2);
        }
    }

    public void setFillViewport(boolean z10) {
        if (z10 != this.f16662t) {
            this.f16662t = z10;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        this.f16644F.n(z10);
    }

    public void setOnScrollChangeListener(e eVar) {
        this.f16646H = eVar;
    }

    public void setSmoothScrollingEnabled(boolean z10) {
        this.f16663u = z10;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return S(i10, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        U(0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f16651i = new Rect();
        this.f16657o = true;
        this.f16658p = false;
        this.f16659q = null;
        this.f16660r = false;
        this.f16663u = true;
        this.f16667y = -1;
        this.f16668z = new int[2];
        this.f16639A = new int[2];
        d dVar = new d();
        this.f16647I = dVar;
        this.f16648J = new C1685o(getContext(), dVar);
        this.f16653k = androidx.core.widget.d.a(context, attributeSet);
        this.f16654l = androidx.core.widget.d.a(context, attributeSet);
        this.f16649g = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        v();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f16638M, i10, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f16643E = new H(this);
        this.f16644F = new E(this);
        setNestedScrollingEnabled(true);
        AbstractC1658a0.k0(this, f16637L);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        onNestedPreScroll(view, i10, i11, iArr, 0);
    }

    @Override // androidx.core.view.F
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14) {
        B(i13, i14, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return onStartNestedScroll(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        B(i13, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        onNestedScrollAccepted(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10) {
        if (getChildCount() <= 0) {
            super.addView(view, i10);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
