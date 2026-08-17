package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.facebook.react.uimanager.ViewDefaults;
import com.facebook.react.views.progressbar.ProgressBarContainerView;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
abstract class d extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Runnable f22625d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    OverScroller f22626e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f22627f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f22628g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f22629h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f22630i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private VelocityTracker f22631j;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class a implements Runnable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final CoordinatorLayout f22632g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final View f22633h;

        a(CoordinatorLayout coordinatorLayout, View view) {
            this.f22632g = coordinatorLayout;
            this.f22633h = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f22633h == null || (overScroller = d.this.f22626e) == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                d.this.N(this.f22632g, this.f22633h);
                return;
            }
            d dVar = d.this;
            dVar.P(this.f22632g, this.f22633h, dVar.f22626e.getCurrY());
            this.f22633h.postOnAnimation(this);
        }
    }

    public d() {
        this.f22628g = -1;
        this.f22630i = -1;
    }

    private void I() {
        if (this.f22631j == null) {
            this.f22631j = VelocityTracker.obtain();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008b A[ADDED_TO_REGION] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z10;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            VelocityTracker velocityTracker3 = this.f22631j;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
                this.f22631j.computeCurrentVelocity(ProgressBarContainerView.MAX_PROGRESS);
                J(coordinatorLayout, view, -L(view), 0, this.f22631j.getYVelocity(this.f22628g));
                z10 = true;
            }
            this.f22627f = false;
            this.f22628g = -1;
            velocityTracker = this.f22631j;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f22631j = null;
            }
            velocityTracker2 = this.f22631j;
            if (velocityTracker2 != null) {
            }
            if (this.f22627f) {
            }
        }
        if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f22628g);
            if (iFindPointerIndex == -1) {
                return false;
            }
            int y10 = (int) motionEvent.getY(iFindPointerIndex);
            int i10 = this.f22629h - y10;
            this.f22629h = y10;
            O(coordinatorLayout, view, i10, K(view), 0);
        } else if (actionMasked != 3) {
            if (actionMasked == 6) {
                int i11 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                this.f22628g = motionEvent.getPointerId(i11);
                this.f22629h = (int) (motionEvent.getY(i11) + 0.5f);
            }
        }
        z10 = false;
        velocityTracker2 = this.f22631j;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return !this.f22627f || z10;
        z10 = false;
        this.f22627f = false;
        this.f22628g = -1;
        velocityTracker = this.f22631j;
        if (velocityTracker != null) {
        }
        velocityTracker2 = this.f22631j;
        if (velocityTracker2 != null) {
        }
        if (this.f22627f) {
        }
    }

    abstract boolean H(View view);

    final boolean J(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, float f10) {
        Runnable runnable = this.f22625d;
        if (runnable != null) {
            view.removeCallbacks(runnable);
            this.f22625d = null;
        }
        if (this.f22626e == null) {
            this.f22626e = new OverScroller(view.getContext());
        }
        this.f22626e.fling(0, E(), 0, Math.round(f10), 0, 0, i10, i11);
        if (!this.f22626e.computeScrollOffset()) {
            N(coordinatorLayout, view);
            return false;
        }
        a aVar = new a(coordinatorLayout, view);
        this.f22625d = aVar;
        view.postOnAnimation(aVar);
        return true;
    }

    abstract int K(View view);

    abstract int L(View view);

    abstract int M();

    abstract void N(CoordinatorLayout coordinatorLayout, View view);

    final int O(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        return Q(coordinatorLayout, view, M() - i10, i11, i12);
    }

    int P(CoordinatorLayout coordinatorLayout, View view, int i10) {
        return Q(coordinatorLayout, view, i10, androidx.customview.widget.a.INVALID_ID, ViewDefaults.NUMBER_OF_LINES);
    }

    abstract int Q(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.f22630i < 0) {
            this.f22630i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f22627f) {
            int i10 = this.f22628g;
            if (i10 == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i10)) == -1) {
                return false;
            }
            int y10 = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y10 - this.f22629h) > this.f22630i) {
                this.f22629h = y10;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f22628g = -1;
            int x10 = (int) motionEvent.getX();
            int y11 = (int) motionEvent.getY();
            boolean z10 = H(view) && coordinatorLayout.y(view, x10, y11);
            this.f22627f = z10;
            if (z10) {
                this.f22629h = y11;
                this.f22628g = motionEvent.getPointerId(0);
                I();
                OverScroller overScroller = this.f22626e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f22626e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f22631j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22628g = -1;
        this.f22630i = -1;
    }
}
