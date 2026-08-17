package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.react.uimanager.ViewDefaults;
import f.AbstractC2573f;
import f.AbstractC2577j;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f14486g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View f14487h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private View f14488i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private View f14489j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    Drawable f14490k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    Drawable f14491l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    Drawable f14492m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f14493n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    boolean f14494o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f14495p;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class a {
        public static void a(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C1629b(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2577j.f27033a);
        this.f14490k = typedArrayObtainStyledAttributes.getDrawable(AbstractC2577j.f27038b);
        this.f14491l = typedArrayObtainStyledAttributes.getDrawable(AbstractC2577j.f27048d);
        this.f14495p = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC2577j.f27078j, -1);
        boolean z10 = true;
        if (getId() == AbstractC2573f.f26830I) {
            this.f14493n = true;
            this.f14492m = typedArrayObtainStyledAttributes.getDrawable(AbstractC2577j.f27043c);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f14493n ? this.f14490k != null || this.f14491l != null : this.f14492m != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
    }

    private int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    private boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f14490k;
        if (drawable != null && drawable.isStateful()) {
            this.f14490k.setState(getDrawableState());
        }
        Drawable drawable2 = this.f14491l;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f14491l.setState(getDrawableState());
        }
        Drawable drawable3 = this.f14492m;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f14492m.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f14487h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f14490k;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f14491l;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f14492m;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f14488i = findViewById(AbstractC2573f.f26839a);
        this.f14489j = findViewById(AbstractC2573f.f26845g);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f14486g || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049 A[PHI: r1
      0x0049: PHI (r1v8 boolean) = (r1v1 boolean), (r1v1 boolean), (r1v0 boolean) binds: [B:31:0x00a6, B:33:0x00aa, B:15:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Drawable drawable;
        super.onLayout(z10, i10, i11, i12, i13);
        View view = this.f14487h;
        boolean z11 = true;
        boolean z12 = false;
        boolean z13 = (view == null || view.getVisibility() == 8) ? false : true;
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int measuredHeight2 = measuredHeight - view.getMeasuredHeight();
            int i14 = layoutParams.bottomMargin;
            view.layout(i10, measuredHeight2 - i14, i12, measuredHeight - i14);
        }
        if (this.f14493n) {
            Drawable drawable2 = this.f14492m;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z11 = z12;
            }
        } else {
            if (this.f14490k != null) {
                if (this.f14488i.getVisibility() == 0) {
                    this.f14490k.setBounds(this.f14488i.getLeft(), this.f14488i.getTop(), this.f14488i.getRight(), this.f14488i.getBottom());
                } else {
                    View view2 = this.f14489j;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f14490k.setBounds(0, 0, 0, 0);
                    } else {
                        this.f14490k.setBounds(this.f14489j.getLeft(), this.f14489j.getTop(), this.f14489j.getRight(), this.f14489j.getBottom());
                    }
                }
                z12 = true;
            }
            this.f14494o = z13;
            if (z13 && (drawable = this.f14491l) != null) {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        }
        if (z11) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        if (this.f14488i == null && View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE && (i12 = this.f14495p) >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i11)), androidx.customview.widget.a.INVALID_ID);
        }
        super.onMeasure(i10, i11);
        if (this.f14488i == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        View view = this.f14487h;
        if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min((!b(this.f14488i) ? a(this.f14488i) : !b(this.f14489j) ? a(this.f14489j) : 0) + a(this.f14487h), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i11) : ViewDefaults.NUMBER_OF_LINES));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f14490k;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f14490k);
        }
        this.f14490k = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f14488i;
            if (view != null) {
                this.f14490k.setBounds(view.getLeft(), this.f14488i.getTop(), this.f14488i.getRight(), this.f14488i.getBottom());
            }
        }
        boolean z10 = false;
        if (!this.f14493n ? !(this.f14490k != null || this.f14491l != null) : this.f14492m == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        a.a(this);
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f14492m;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f14492m);
        }
        this.f14492m = drawable;
        boolean z10 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f14493n && (drawable2 = this.f14492m) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f14493n ? !(this.f14490k != null || this.f14491l != null) : this.f14492m == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        a.a(this);
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f14491l;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f14491l);
        }
        this.f14491l = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f14494o && (drawable2 = this.f14491l) != null) {
                drawable2.setBounds(this.f14487h.getLeft(), this.f14487h.getTop(), this.f14487h.getRight(), this.f14487h.getBottom());
            }
        }
        boolean z10 = false;
        if (!this.f14493n ? !(this.f14490k != null || this.f14491l != null) : this.f14492m == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        a.a(this);
    }

    public void setTabContainer(Y y10) {
        View view = this.f14487h;
        if (view != null) {
            removeView(view);
        }
        this.f14487h = y10;
    }

    public void setTransitioning(boolean z10) {
        this.f14486g = z10;
        setDescendantFocusability(z10 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f14490k;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.f14491l;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.f14492m;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (drawable == this.f14490k && !this.f14493n) {
            return true;
        }
        if (drawable == this.f14491l && this.f14494o) {
            return true;
        }
        return (drawable == this.f14492m && this.f14493n) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }
}
