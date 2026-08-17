package com.reactnativepagerview;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.react.uimanager.events.NativeGestureUtil;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends FrameLayout {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Integer f24883g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f24884h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f24885i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f24886j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f24887k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f24888l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        AbstractC2855l.g(context, "context");
        this.f24885i = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    private final boolean a(int i10, float f10) {
        int i11 = -((int) Math.signum(f10));
        if (i10 == 0) {
            View child = getChild();
            if (child != null) {
                return child.canScrollHorizontally(i11);
            }
            return false;
        }
        if (i10 != 1) {
            throw new IllegalArgumentException();
        }
        View child2 = getChild();
        if (child2 != null) {
            return child2.canScrollVertically(i11);
        }
        return false;
    }

    private final void b(MotionEvent motionEvent) {
        ViewPager2 parentViewPager = getParentViewPager();
        Integer numValueOf = parentViewPager != null ? Integer.valueOf(parentViewPager.getOrientation()) : null;
        if (motionEvent.getAction() == 0) {
            this.f24886j = motionEvent.getX();
            this.f24887k = motionEvent.getY();
            if (numValueOf != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 2) {
            float x10 = motionEvent.getX() - this.f24886j;
            float y10 = motionEvent.getY() - this.f24887k;
            boolean z10 = numValueOf != null && numValueOf.intValue() == 0;
            float fAbs = Math.abs(x10) * (z10 ? 0.5f : 1.0f);
            float fAbs2 = Math.abs(y10) * (z10 ? 1.0f : 0.5f);
            int i10 = this.f24885i;
            if (fAbs > i10 || fAbs2 > i10) {
                NativeGestureUtil.notifyNativeGestureStarted(this, motionEvent);
                this.f24888l = true;
                if (numValueOf == null) {
                    return;
                }
                if (z10 == (fAbs2 > fAbs)) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                    return;
                }
                int iIntValue = numValueOf.intValue();
                if (!z10) {
                    x10 = y10;
                }
                if (a(iIntValue, x10)) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                } else {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
        }
    }

    private final View getChild() {
        if (getChildCount() > 0) {
            return getChildAt(0);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x000d, code lost:
    
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final ViewPager2 getParentViewPager() {
        View view;
        Object parent = getParent();
        if (parent instanceof View) {
            view = (View) parent;
            while (view != null && !(view instanceof ViewPager2)) {
                Object parent2 = view.getParent();
                if (parent2 instanceof View) {
                    view = (View) parent2;
                }
            }
            if (view instanceof ViewPager2) {
                return (ViewPager2) view;
            }
            return null;
        }
        view = null;
    }

    public final boolean getDidSetInitialIndex() {
        return this.f24884h;
    }

    public final Integer getInitialIndex() {
        return this.f24883g;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent e10) {
        AbstractC2855l.g(e10, "e");
        b(e10);
        return super.onInterceptTouchEvent(e10);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent e10) {
        AbstractC2855l.g(e10, "e");
        if (e10.getActionMasked() == 1 && this.f24888l) {
            NativeGestureUtil.notifyNativeGestureEnded(this, e10);
            this.f24888l = false;
        }
        return super.onTouchEvent(e10);
    }

    public final void setDidSetInitialIndex(boolean z10) {
        this.f24884h = z10;
    }

    public final void setInitialIndex(Integer num) {
        this.f24883g = num;
    }
}
