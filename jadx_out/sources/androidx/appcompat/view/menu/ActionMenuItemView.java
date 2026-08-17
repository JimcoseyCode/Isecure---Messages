package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.B;
import androidx.appcompat.widget.P;
import androidx.appcompat.widget.k0;
import f.AbstractC2577j;
import k.InterfaceC2820e;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends B implements k.a, View.OnClickListener, ActionMenuView.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    g f14266g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private CharSequence f14267h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Drawable f14268i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    e.b f14269j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private P f14270k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    b f14271l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f14272m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f14273n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f14274o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f14275p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f14276q;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class a extends P {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.P
        public InterfaceC2820e b() {
            b bVar = ActionMenuItemView.this.f14271l;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.P
        protected boolean c() {
            InterfaceC2820e interfaceC2820eB;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            e.b bVar = actionMenuItemView.f14269j;
            return bVar != null && bVar.a(actionMenuItemView.f14266g) && (interfaceC2820eB = b()) != null && interfaceC2820eB.isShowing();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class b {
        public abstract InterfaceC2820e a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (i10 < 480) {
            return (i10 >= 640 && i11 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    private void h() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f14267h);
        if (this.f14268i != null && (!this.f14266g.B() || (!this.f14272m && !this.f14273n))) {
            z10 = false;
        }
        boolean z12 = z11 & z10;
        setText(z12 ? this.f14267h : null);
        CharSequence contentDescription = this.f14266g.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z12 ? null : this.f14266g.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f14266g.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            k0.a(this, z12 ? null : this.f14266g.getTitle());
        } else {
            k0.a(this, tooltipText);
        }
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean a() {
        return f();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return f() && this.f14266g.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean c() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void d(g gVar, int i10) {
        this.f14266g = gVar;
        setIcon(gVar.getIcon());
        setTitle(gVar.i(this));
        setId(gVar.getItemId());
        setVisibility(gVar.isVisible() ? 0 : 8);
        setEnabled(gVar.isEnabled());
        if (gVar.hasSubMenu() && this.f14270k == null) {
            this.f14270k = new a();
        }
    }

    public boolean f() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.k.a
    public g getItemData() {
        return this.f14266g;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        e.b bVar = this.f14269j;
        if (bVar != null) {
            bVar.a(this.f14266g);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f14272m = g();
        h();
    }

    @Override // androidx.appcompat.widget.B, android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        boolean zF = f();
        if (zF && (i12 = this.f14275p) >= 0) {
            super.setPadding(i12, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, this.f14274o) : this.f14274o;
        if (mode != 1073741824 && this.f14274o > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i11);
        }
        if (zF || this.f14268i == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f14268i.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        P p10;
        if (this.f14266g.hasSubMenu() && (p10 = this.f14270k) != null && p10.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z10) {
        if (this.f14273n != z10) {
            this.f14273n = z10;
            g gVar = this.f14266g;
            if (gVar != null) {
                gVar.c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f14268i = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.f14276q;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (intrinsicHeight * (i10 / intrinsicWidth));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (intrinsicWidth * (i10 / intrinsicHeight));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, null, null, null);
        h();
    }

    public void setItemInvoker(e.b bVar) {
        this.f14269j = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        this.f14275p = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(b bVar) {
        this.f14271l = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f14267h = charSequence;
        h();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Resources resources = context.getResources();
        this.f14272m = g();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2577j.f27138v, i10, 0);
        this.f14274o = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC2577j.f27143w, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f14276q = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f14275p = -1;
        setSaveEnabled(false);
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }
}
