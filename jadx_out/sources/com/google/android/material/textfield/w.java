package com.google.android.material.textfield;

import android.R;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.C1630c;
import androidx.appcompat.widget.S;
import com.facebook.react.uimanager.events.PointerEventHelper;
import e5.AbstractC2425c;
import f.AbstractC2568a;
import f.AbstractC2576i;
import java.util.List;
import k5.AbstractC2830a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class w extends C1630c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final S f23925k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final AccessibilityManager f23926l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Rect f23927m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f23928n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final float f23929o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ColorStateList f23930p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f23931q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ColorStateList f23932r;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements AdapterView.OnItemClickListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
            w wVar = w.this;
            Object objT = i10 < 0 ? wVar.f23925k.t() : wVar.getAdapter().getItem(i10);
            w wVar2 = w.this;
            wVar2.setText(wVar2.convertSelectionToString(objT), false);
            AdapterView.OnItemClickListener onItemClickListener = w.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i10 < 0) {
                    view = w.this.f23925k.w();
                    i10 = w.this.f23925k.v();
                    j10 = w.this.f23925k.u();
                }
                onItemClickListener.onItemClick(w.this.f23925k.j(), view, i10, j10);
            }
            w.this.f23925k.dismiss();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class b extends ArrayAdapter {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private ColorStateList f23934g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private ColorStateList f23935h;

        b(Context context, int i10, String[] strArr) {
            super(context, i10, strArr);
            f();
        }

        private ColorStateList a() {
            if (!c() || !d()) {
                return null;
            }
            int[] iArr = {R.attr.state_hovered, -16842919};
            int[] iArr2 = {R.attr.state_selected, -16842919};
            int colorForState = w.this.f23932r.getColorForState(iArr2, 0);
            int colorForState2 = w.this.f23932r.getColorForState(iArr, 0);
            return new ColorStateList(new int[][]{iArr2, iArr, new int[0]}, new int[]{X4.a.i(w.this.f23931q, colorForState), X4.a.i(w.this.f23931q, colorForState2), w.this.f23931q});
        }

        private Drawable b() {
            if (!c()) {
                return null;
            }
            ColorDrawable colorDrawable = new ColorDrawable(w.this.f23931q);
            if (this.f23935h == null) {
                return colorDrawable;
            }
            colorDrawable.setTintList(this.f23934g);
            return new RippleDrawable(this.f23935h, colorDrawable, null);
        }

        private boolean c() {
            return w.this.f23931q != 0;
        }

        private boolean d() {
            return w.this.f23932r != null;
        }

        private ColorStateList e() {
            if (!d()) {
                return null;
            }
            int[] iArr = {R.attr.state_pressed};
            return new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{w.this.f23932r.getColorForState(iArr, 0), 0});
        }

        void f() {
            this.f23935h = e();
            this.f23934g = a();
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i10, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                textView.setBackground(w.this.getText().toString().contentEquals(textView.getText()) ? b() : null);
            }
            return view2;
        }
    }

    public w(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC2568a.f26741m);
    }

    private TextInputLayout f() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private boolean g() {
        return i() || h();
    }

    private boolean h() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f23926l;
        if (accessibilityManager != null && accessibilityManager.isEnabled() && (enabledAccessibilityServiceList = this.f23926l.getEnabledAccessibilityServiceList(16)) != null) {
            for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean i() {
        AccessibilityManager accessibilityManager = this.f23926l;
        return accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled();
    }

    private int j() {
        ListAdapter adapter = getAdapter();
        TextInputLayout textInputLayoutF = f();
        int i10 = 0;
        if (adapter == null || textInputLayoutF == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMin = Math.min(adapter.getCount(), Math.max(0, this.f23925k.v()) + 15);
        View view = null;
        int iMax = 0;
        for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
            int itemViewType = adapter.getItemViewType(iMax2);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = adapter.getView(iMax2, view, textInputLayoutF);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax = Math.max(iMax, view.getMeasuredWidth());
        }
        Drawable drawableI = this.f23925k.i();
        if (drawableI != null) {
            drawableI.getPadding(this.f23927m);
            Rect rect = this.f23927m;
            iMax += rect.left + rect.right;
        }
        return iMax + textInputLayoutF.getEndIconView().getMeasuredWidth();
    }

    private void k() {
        TextInputLayout textInputLayoutF = f();
        if (textInputLayoutF != null) {
            textInputLayoutF.s0();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void dismissDropDown() {
        if (g()) {
            this.f23925k.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f23930p;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutF = f();
        return (textInputLayoutF == null || !textInputLayoutF.T()) ? super.getHint() : textInputLayoutF.getHint();
    }

    public float getPopupElevation() {
        return this.f23929o;
    }

    public int getSimpleItemSelectedColor() {
        return this.f23931q;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f23932r;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutF = f();
        if (textInputLayoutF != null && textInputLayoutF.T() && super.getHint() == null && com.google.android.material.internal.e.d()) {
            setHint(PointerEventHelper.POINTER_TYPE_UNKNOWN);
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f23925k.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), j()), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z10) {
        if (g()) {
            return;
        }
        super.onWindowFocusChanged(z10);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t10) {
        super.setAdapter(t10);
        this.f23925k.p(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        S s10 = this.f23925k;
        if (s10 != null) {
            s10.e(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i10) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i10));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f23930p = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof h5.h) {
            ((h5.h) dropDownBackground).d0(this.f23930p);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f23925k.K(getOnItemSelectedListener());
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i10) {
        super.setRawInputType(i10);
        k();
    }

    public void setSimpleItemSelectedColor(int i10) {
        this.f23931q = i10;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).f();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f23932r = colorStateList;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).f();
        }
    }

    public void setSimpleItems(int i10) {
        setSimpleItems(getResources().getStringArray(i10));
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        if (g()) {
            this.f23925k.show();
        } else {
            super.showDropDown();
        }
    }

    public w(Context context, AttributeSet attributeSet, int i10) {
        super(AbstractC2830a.d(context, attributeSet, i10, 0), attributeSet, i10);
        this.f23927m = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayI = com.google.android.material.internal.l.i(context2, attributeSet, Q4.k.f9566R1, i10, AbstractC2576i.f26904f, new int[0]);
        if (typedArrayI.hasValue(Q4.k.f9574S1) && typedArrayI.getInt(Q4.k.f9574S1, 0) == 0) {
            setKeyListener(null);
        }
        this.f23928n = typedArrayI.getResourceId(Q4.k.f9598V1, Q4.g.f9340m);
        this.f23929o = typedArrayI.getDimensionPixelOffset(Q4.k.f9582T1, Q4.c.f9235k0);
        if (typedArrayI.hasValue(Q4.k.f9590U1)) {
            this.f23930p = ColorStateList.valueOf(typedArrayI.getColor(Q4.k.f9590U1, 0));
        }
        this.f23931q = typedArrayI.getColor(Q4.k.f9606W1, 0);
        this.f23932r = AbstractC2425c.a(context2, typedArrayI, Q4.k.f9614X1);
        this.f23926l = (AccessibilityManager) context2.getSystemService("accessibility");
        S s10 = new S(context2);
        this.f23925k = s10;
        s10.H(true);
        s10.B(this);
        s10.G(2);
        s10.p(getAdapter());
        s10.J(new a());
        if (typedArrayI.hasValue(Q4.k.f9622Y1)) {
            setSimpleItems(typedArrayI.getResourceId(Q4.k.f9622Y1, 0));
        }
        typedArrayI.recycle();
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new b(getContext(), this.f23928n, strArr));
    }
}
