package com.google.android.material.textfield;

import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.C1637j;
import androidx.appcompat.widget.M;
import androidx.appcompat.widget.f0;
import androidx.core.view.AbstractC1658a0;
import androidx.core.view.C1657a;
import androidx.customview.view.AbsSavedState;
import androidx.transition.C1785c;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.google.android.material.internal.CheckableImageButton;
import e5.AbstractC2425c;
import f.AbstractC2568a;
import f.AbstractC2576i;
import g.AbstractC2619a;
import h5.l;
import java.util.Iterator;
import java.util.LinkedHashSet;
import k5.AbstractC2830a;
import y0.AbstractC3606a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    private static final int f23728J0 = Q4.j.f9416o;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    private static final int[][] f23729K0 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private TextView f23730A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    int f23731A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private ColorStateList f23732B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    private boolean f23733B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f23734C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    final com.google.android.material.internal.a f23735C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private C1785c f23736D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    private boolean f23737D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private C1785c f23738E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    private boolean f23739E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private ColorStateList f23740F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    private ValueAnimator f23741F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private ColorStateList f23742G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    private boolean f23743G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private ColorStateList f23744H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    private boolean f23745H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private ColorStateList f23746I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    private boolean f23747I0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f23748J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private CharSequence f23749K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private boolean f23750L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private h5.h f23751M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private h5.h f23752N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private StateListDrawable f23753O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private boolean f23754P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private h5.h f23755Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private h5.h f23756R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private h5.l f23757S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private boolean f23758T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final int f23759U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private int f23760V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private int f23761W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private int f23762a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private int f23763b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private int f23764c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private int f23765d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private int f23766e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private final Rect f23767f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final FrameLayout f23768g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private final Rect f23769g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final A f23770h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private final RectF f23771h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final s f23772i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private Typeface f23773i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f23774j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private Drawable f23775j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    EditText f23776k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private int f23777k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private CharSequence f23778l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private final LinkedHashSet f23779l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f23780m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private Drawable f23781m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f23782n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private int f23783n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f23784o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private Drawable f23785o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f23786p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private ColorStateList f23787p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final v f23788q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private ColorStateList f23789q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    boolean f23790r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private int f23791r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f23792s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private int f23793s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f23794t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private int f23795t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private f f23796u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private ColorStateList f23797u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private TextView f23798v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private int f23799v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f23800w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private int f23801w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f23802x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private int f23803x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private CharSequence f23804y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private int f23805y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f23806z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private int f23807z0;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        CharSequence f23808i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f23809j;

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f23808i) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            TextUtils.writeToParcel(this.f23808i, parcel, i10);
            parcel.writeInt(this.f23809j ? 1 : 0);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f23808i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f23809j = parcel.readInt() == 1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b extends C1657a {
        b() {
        }

        @Override // androidx.core.view.C1657a
        public void onInitializeAccessibilityNodeInfo(View view, I0.z zVar) {
            super.onInitializeAccessibilityNodeInfo(view, zVar);
            zVar.b1(false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f23772i.h();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f23735C0.j0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class e extends C1657a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TextInputLayout f23816a;

        public e(TextInputLayout textInputLayout) {
            this.f23816a = textInputLayout;
        }

        @Override // androidx.core.view.C1657a
        public void onInitializeAccessibilityNodeInfo(View view, I0.z zVar) {
            super.onInitializeAccessibilityNodeInfo(view, zVar);
            EditText editText = this.f23816a.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f23816a.getHint();
            CharSequence error = this.f23816a.getError();
            CharSequence placeholderText = this.f23816a.getPlaceholderText();
            int counterMaxLength = this.f23816a.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f23816a.getCounterOverflowDescription();
            boolean zIsEmpty = TextUtils.isEmpty(text);
            boolean zIsEmpty2 = TextUtils.isEmpty(hint);
            boolean zQ = this.f23816a.Q();
            boolean zIsEmpty3 = TextUtils.isEmpty(error);
            boolean z10 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
            String string = !zIsEmpty2 ? hint.toString() : PointerEventHelper.POINTER_TYPE_UNKNOWN;
            this.f23816a.f23770h.A(zVar);
            if (!zIsEmpty) {
                zVar.X0(text);
            } else if (!TextUtils.isEmpty(string)) {
                zVar.X0(string);
                if (!zQ && placeholderText != null) {
                    zVar.X0(string + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                zVar.X0(placeholderText);
            }
            if (!TextUtils.isEmpty(string)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    zVar.G0(string);
                } else {
                    if (!zIsEmpty) {
                        string = ((Object) text) + ", " + string;
                    }
                    zVar.X0(string);
                }
                zVar.T0(zIsEmpty);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            zVar.J0(counterMaxLength);
            if (z10) {
                if (zIsEmpty3) {
                    error = counterOverflowDescription;
                }
                zVar.C0(error);
            }
            View viewT = this.f23816a.f23788q.t();
            if (viewT != null) {
                zVar.H0(viewT);
            }
            this.f23816a.f23772i.m().o(view, zVar);
        }

        @Override // androidx.core.view.C1657a
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            this.f23816a.f23772i.m().p(view, accessibilityEvent);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface f {
        int a(Editable editable);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface g {
        void a(TextInputLayout textInputLayout);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, Q4.a.f9114L0);
    }

    private void A(boolean z10) {
        ValueAnimator valueAnimator = this.f23741F0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f23741F0.cancel();
        }
        if (z10 && this.f23739E0) {
            m(1.0f);
        } else {
            this.f23735C0.j0(1.0f);
        }
        this.f23733B0 = false;
        if (C()) {
            W();
        }
        z0();
        this.f23770h.l(false);
        this.f23772i.H(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0(Editable editable) {
        if (this.f23796u.a(editable) != 0 || this.f23733B0) {
            M();
        } else {
            g0();
        }
    }

    private C1785c B() {
        C1785c c1785c = new C1785c();
        c1785c.b0(c5.d.f(getContext(), Q4.a.f9165r0, 87));
        c1785c.d0(c5.d.g(getContext(), Q4.a.f9175w0, R4.a.f10024a));
        return c1785c;
    }

    private void B0(boolean z10, boolean z11) {
        int defaultColor = this.f23797u0.getDefaultColor();
        int colorForState = this.f23797u0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f23797u0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z10) {
            this.f23765d0 = colorForState2;
        } else if (z11) {
            this.f23765d0 = colorForState;
        } else {
            this.f23765d0 = defaultColor;
        }
    }

    private boolean C() {
        return this.f23748J && !TextUtils.isEmpty(this.f23749K) && (this.f23751M instanceof AbstractC2229h);
    }

    private void D() {
        Iterator it = this.f23779l0.iterator();
        while (it.hasNext()) {
            ((g) it.next()).a(this);
        }
    }

    private void E(Canvas canvas) {
        h5.h hVar;
        if (this.f23756R == null || (hVar = this.f23755Q) == null) {
            return;
        }
        hVar.draw(canvas);
        if (this.f23776k.isFocused()) {
            Rect bounds = this.f23756R.getBounds();
            Rect bounds2 = this.f23755Q.getBounds();
            float fB = this.f23735C0.B();
            int iCenterX = bounds2.centerX();
            bounds.left = R4.a.c(iCenterX, bounds2.left, fB);
            bounds.right = R4.a.c(iCenterX, bounds2.right, fB);
            this.f23756R.draw(canvas);
        }
    }

    private void F(Canvas canvas) {
        if (this.f23748J) {
            this.f23735C0.k(canvas);
        }
    }

    private void G(boolean z10) {
        ValueAnimator valueAnimator = this.f23741F0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f23741F0.cancel();
        }
        if (z10 && this.f23739E0) {
            m(0.0f);
        } else {
            this.f23735C0.j0(0.0f);
        }
        if (C() && ((AbstractC2229h) this.f23751M).w0()) {
            z();
        }
        this.f23733B0 = true;
        M();
        this.f23770h.l(true);
        this.f23772i.H(true);
    }

    private h5.h H(boolean z10) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(Q4.c.f9245p0);
        float f10 = z10 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f23776k;
        float popupElevation = editText instanceof w ? ((w) editText).getPopupElevation() : getResources().getDimensionPixelOffset(Q4.c.f9188A);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(Q4.c.f9237l0);
        h5.l lVarM = h5.l.a().D(f10).I(f10).u(dimensionPixelOffset).y(dimensionPixelOffset).m();
        EditText editText2 = this.f23776k;
        h5.h hVarR = h5.h.r(getContext(), popupElevation, editText2 instanceof w ? ((w) editText2).getDropDownBackgroundTintList() : null);
        hVarR.setShapeAppearanceModel(lVarM);
        hVarR.g0(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        return hVarR;
    }

    private static Drawable I(h5.h hVar, int i10, int i11, int[][] iArr) {
        return new RippleDrawable(new ColorStateList(iArr, new int[]{X4.a.j(i11, i10, 0.1f), i10}), hVar, hVar);
    }

    private int J(int i10, boolean z10) {
        return i10 + ((z10 || getPrefixText() == null) ? (!z10 || getSuffixText() == null) ? this.f23776k.getCompoundPaddingLeft() : this.f23772i.y() : this.f23770h.c());
    }

    private int K(int i10, boolean z10) {
        return i10 - ((z10 || getSuffixText() == null) ? (!z10 || getPrefixText() == null) ? this.f23776k.getCompoundPaddingRight() : this.f23770h.c() : this.f23772i.y());
    }

    private static Drawable L(Context context, h5.h hVar, int i10, int[][] iArr) {
        int iC = X4.a.c(context, Q4.a.f9109J, "TextInputLayout");
        h5.h hVar2 = new h5.h(hVar.H());
        int iJ = X4.a.j(i10, iC, 0.1f);
        hVar2.d0(new ColorStateList(iArr, new int[]{iJ, 0}));
        hVar2.setTint(iC);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iJ, iC});
        h5.h hVar3 = new h5.h(hVar.H());
        hVar3.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, hVar2, hVar3), hVar});
    }

    private void M() {
        TextView textView = this.f23730A;
        if (textView == null || !this.f23806z) {
            return;
        }
        textView.setText((CharSequence) null);
        androidx.transition.r.a(this.f23768g, this.f23738E);
        this.f23730A.setVisibility(4);
    }

    private boolean R() {
        return getHintMaxLines() == 1;
    }

    private boolean S() {
        if (d0()) {
            return true;
        }
        return this.f23798v != null && this.f23794t;
    }

    private boolean U() {
        return this.f23760V == 1 && this.f23776k.getMinLines() <= 1;
    }

    private void V() {
        q();
        s0();
        C0();
        h0();
        l();
        if (this.f23760V != 0) {
            v0();
        }
        b0();
    }

    private void W() {
        if (C()) {
            RectF rectF = this.f23771h0;
            this.f23735C0.o(rectF, this.f23776k.getWidth(), this.f23776k.getGravity());
            if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
                return;
            }
            p(rectF);
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f23762a0);
            rectF.top = 0.0f;
            ((AbstractC2229h) this.f23751M).z0(rectF);
        }
    }

    private void X() {
        if (!C() || this.f23733B0) {
            return;
        }
        z();
        W();
    }

    private static void Y(ViewGroup viewGroup, boolean z10) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            childAt.setEnabled(z10);
            if (childAt instanceof ViewGroup) {
                Y((ViewGroup) childAt, z10);
            }
        }
    }

    private void a0() {
        TextView textView = this.f23730A;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    private void b0() {
        EditText editText = this.f23776k;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i10 = this.f23760V;
                if (i10 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i10 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    public static /* synthetic */ int c(Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    private boolean e0() {
        return (this.f23772i.G() || ((this.f23772i.A() && N()) || this.f23772i.w() != null)) && this.f23772i.getMeasuredWidth() > 0;
    }

    private boolean f0() {
        return (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.f23770h.getMeasuredWidth() > 0;
    }

    private void g0() {
        if (this.f23730A == null || !this.f23806z || TextUtils.isEmpty(this.f23804y)) {
            return;
        }
        this.f23730A.setText(this.f23804y);
        androidx.transition.r.a(this.f23768g, this.f23736D);
        this.f23730A.setVisibility(0);
        this.f23730A.bringToFront();
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f23776k;
        if (!(editText instanceof AutoCompleteTextView) || r.a(editText)) {
            return this.f23751M;
        }
        int iD = X4.a.d(this.f23776k, AbstractC2568a.f26748t);
        int i10 = this.f23760V;
        if (i10 == 2) {
            return L(getContext(), this.f23751M, iD, f23729K0);
        }
        if (i10 == 1) {
            return I(this.f23751M, this.f23766e0, iD, f23729K0);
        }
        return null;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f23753O == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f23753O = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f23753O.addState(new int[0], H(false));
        }
        return this.f23753O;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f23752N == null) {
            this.f23752N = H(true);
        }
        return this.f23752N;
    }

    private void h0() {
        if (this.f23760V == 1) {
            if (AbstractC2425c.l(getContext())) {
                this.f23761W = getResources().getDimensionPixelSize(Q4.c.f9202O);
            } else if (AbstractC2425c.k(getContext())) {
                this.f23761W = getResources().getDimensionPixelSize(Q4.c.f9201N);
            }
        }
    }

    private void i0(Rect rect) {
        h5.h hVar = this.f23755Q;
        if (hVar != null) {
            int i10 = rect.bottom;
            hVar.setBounds(rect.left, i10 - this.f23763b0, rect.right, i10);
        }
        h5.h hVar2 = this.f23756R;
        if (hVar2 != null) {
            int i11 = rect.bottom;
            hVar2.setBounds(rect.left, i11 - this.f23764c0, rect.right, i11);
        }
    }

    private void j0(int i10) {
        this.f23735C0.s0(i10);
        Rect rect = this.f23767f0;
        com.google.android.material.internal.b.a(this, this.f23776k, rect);
        this.f23735C0.S(s(rect));
        v0();
        l();
        t0(i10);
    }

    private void k() {
        TextView textView = this.f23730A;
        if (textView != null) {
            this.f23768g.addView(textView);
            this.f23730A.setVisibility(0);
        }
    }

    private void k0() {
        if (this.f23798v != null) {
            EditText editText = this.f23776k;
            l0(editText == null ? null : editText.getText());
        }
    }

    private void l() {
        if (this.f23776k == null || this.f23760V != 1) {
            return;
        }
        if (!R()) {
            EditText editText = this.f23776k;
            editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.f23735C0.q() + this.f23774j), this.f23776k.getPaddingEnd(), getResources().getDimensionPixelSize(Q4.c.f9197J));
        } else if (AbstractC2425c.l(getContext())) {
            EditText editText2 = this.f23776k;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(Q4.c.f9200M), this.f23776k.getPaddingEnd(), getResources().getDimensionPixelSize(Q4.c.f9199L));
        } else if (AbstractC2425c.k(getContext())) {
            EditText editText3 = this.f23776k;
            editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(Q4.c.f9198K), this.f23776k.getPaddingEnd(), getResources().getDimensionPixelSize(Q4.c.f9197J));
        }
    }

    private static void m0(Context context, TextView textView, int i10, int i11, boolean z10) {
        textView.setContentDescription(context.getString(z10 ? Q4.i.f9375c : Q4.i.f9374b, Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    private void n() {
        h5.h hVar = this.f23751M;
        if (hVar == null) {
            return;
        }
        h5.l lVarH = hVar.H();
        h5.l lVar = this.f23757S;
        if (lVarH != lVar) {
            this.f23751M.setShapeAppearanceModel(lVar);
        }
        if (x()) {
            this.f23751M.j0(this.f23762a0, this.f23765d0);
        }
        int iR = r();
        this.f23766e0 = iR;
        this.f23751M.d0(ColorStateList.valueOf(iR));
        o();
        s0();
    }

    private void n0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f23798v;
        if (textView != null) {
            c0(textView, this.f23794t ? this.f23800w : this.f23802x);
            if (!this.f23794t && (colorStateList2 = this.f23740F) != null) {
                this.f23798v.setTextColor(colorStateList2);
            }
            if (!this.f23794t || (colorStateList = this.f23742G) == null) {
                return;
            }
            this.f23798v.setTextColor(colorStateList);
        }
    }

    private void o() {
        if (this.f23755Q == null || this.f23756R == null) {
            return;
        }
        if (y()) {
            this.f23755Q.d0(this.f23776k.isFocused() ? ColorStateList.valueOf(this.f23791r0) : ColorStateList.valueOf(this.f23765d0));
            this.f23756R.d0(ColorStateList.valueOf(this.f23765d0));
        }
        invalidate();
    }

    private void o0() {
        ColorStateList colorStateList;
        ColorStateList colorStateListG = this.f23744H;
        if (colorStateListG == null) {
            colorStateListG = X4.a.g(getContext(), AbstractC2568a.f26747s);
        }
        EditText editText = this.f23776k;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = AbstractC3606a.r(this.f23776k.getTextCursorDrawable()).mutate();
        if (S() && (colorStateList = this.f23746I) != null) {
            colorStateListG = colorStateList;
        }
        drawableMutate.setTintList(colorStateListG);
    }

    private void p(RectF rectF) {
        float f10 = rectF.left;
        int i10 = this.f23759U;
        rectF.left = f10 - i10;
        rectF.right += i10;
    }

    private void q() {
        int i10 = this.f23760V;
        if (i10 == 0) {
            this.f23751M = null;
            this.f23755Q = null;
            this.f23756R = null;
            return;
        }
        if (i10 == 1) {
            this.f23751M = new h5.h(this.f23757S);
            this.f23755Q = new h5.h();
            this.f23756R = new h5.h();
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException(this.f23760V + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.f23748J || (this.f23751M instanceof AbstractC2229h)) {
                this.f23751M = new h5.h(this.f23757S);
            } else {
                this.f23751M = AbstractC2229h.v0(this.f23757S);
            }
            this.f23755Q = null;
            this.f23756R = null;
        }
    }

    private int r() {
        return this.f23760V == 1 ? X4.a.i(X4.a.e(this, Q4.a.f9109J, 0), this.f23766e0) : this.f23766e0;
    }

    private void r0() {
        this.f23776k.setBackground(getEditTextBoxBackground());
    }

    private Rect s(Rect rect) {
        if (this.f23776k == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.f23769g0;
        boolean zH = com.google.android.material.internal.o.h(this);
        rect2.bottom = rect.bottom;
        int i10 = this.f23760V;
        if (i10 == 1) {
            rect2.left = J(rect.left, zH);
            rect2.top = rect.top + this.f23761W;
            rect2.right = K(rect.right, zH);
            return rect2;
        }
        if (i10 != 2) {
            rect2.left = J(rect.left, zH);
            rect2.top = getPaddingTop();
            rect2.right = K(rect.right, zH);
            return rect2;
        }
        rect2.left = rect.left + this.f23776k.getPaddingLeft();
        rect2.top = rect.top - w();
        rect2.right = rect.right - this.f23776k.getPaddingRight();
        return rect2;
    }

    private void setEditText(EditText editText) {
        if (this.f23776k != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        getEndIconMode();
        this.f23776k = editText;
        int i10 = this.f23780m;
        if (i10 != -1) {
            setMinEms(i10);
        } else {
            setMinWidth(this.f23784o);
        }
        int i11 = this.f23782n;
        if (i11 != -1) {
            setMaxEms(i11);
        } else {
            setMaxWidth(this.f23786p);
        }
        this.f23754P = false;
        V();
        setTextInputAccessibilityDelegate(new e(this));
        this.f23735C0.p0(this.f23776k.getTypeface());
        this.f23735C0.h0(this.f23776k.getTextSize());
        this.f23735C0.d0(this.f23776k.getLetterSpacing());
        int gravity = this.f23776k.getGravity();
        this.f23735C0.X((gravity & (-113)) | 48);
        this.f23735C0.g0(gravity);
        this.f23731A0 = editText.getMinimumHeight();
        this.f23776k.addTextChangedListener(new a(editText));
        if (this.f23787p0 == null) {
            this.f23787p0 = this.f23776k.getHintTextColors();
        }
        if (this.f23748J) {
            if (TextUtils.isEmpty(this.f23749K)) {
                CharSequence hint = this.f23776k.getHint();
                this.f23778l = hint;
                setHint(hint);
                this.f23776k.setHint((CharSequence) null);
            }
            this.f23750L = true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            o0();
        }
        if (this.f23798v != null) {
            l0(this.f23776k.getText());
        }
        q0();
        this.f23788q.f();
        this.f23770h.bringToFront();
        this.f23772i.bringToFront();
        D();
        this.f23772i.x0();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        x0(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f23749K)) {
            return;
        }
        this.f23749K = charSequence;
        this.f23735C0.n0(charSequence);
        if (this.f23733B0) {
            return;
        }
        W();
    }

    private void setPlaceholderTextEnabled(boolean z10) {
        if (this.f23806z == z10) {
            return;
        }
        if (z10) {
            k();
        } else {
            a0();
            this.f23730A = null;
        }
        this.f23806z = z10;
    }

    private int t(Rect rect, Rect rect2, float f10) {
        return U() ? (int) (rect2.top + f10) : rect.bottom - this.f23776k.getCompoundPaddingBottom();
    }

    private void t0(int i10) {
        if (this.f23776k == null) {
            return;
        }
        float fZ = this.f23735C0.z();
        if (this.f23804y != null) {
            TextPaint textPaint = new TextPaint(129);
            textPaint.set(this.f23730A.getPaint());
            textPaint.setTextSize(this.f23730A.getTextSize());
            textPaint.setTypeface(this.f23730A.getTypeface());
            textPaint.setLetterSpacing(this.f23730A.getLetterSpacing());
            fQ = (this.f23760V == 1 ? this.f23774j + this.f23735C0.q() + this.f23761W : 0.0f) + com.google.android.material.internal.g.b(this.f23804y, textPaint, i10).g(getLayoutDirection() == 1).f(true).h(this.f23730A.getLineSpacingExtra(), this.f23730A.getLineSpacingMultiplier()).j(new com.google.android.material.internal.h() { // from class: com.google.android.material.textfield.K
                @Override // com.google.android.material.internal.h
                public final void a(StaticLayout.Builder builder) {
                    builder.setBreakStrategy(this.f23725a.f23730A.getBreakStrategy());
                }
            }).a().getHeight();
        }
        float fMax = Math.max(fZ, fQ);
        if (this.f23776k.getMeasuredHeight() < fMax) {
            this.f23776k.setMinimumHeight(Math.round(fMax));
        }
    }

    private int u(Rect rect, float f10) {
        if (U()) {
            return (int) (rect.centerY() - (f10 / 2.0f));
        }
        return (rect.top + this.f23776k.getCompoundPaddingTop()) - ((this.f23760V != 0 || R()) ? 0 : (int) (this.f23735C0.A() / 2.0f));
    }

    private boolean u0() {
        int iMax;
        if (this.f23776k == null || this.f23776k.getMeasuredHeight() >= (iMax = Math.max(this.f23772i.getMeasuredHeight(), this.f23770h.getMeasuredHeight()))) {
            return false;
        }
        this.f23776k.setMinimumHeight(iMax);
        return true;
    }

    private Rect v(Rect rect) {
        if (this.f23776k == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.f23769g0;
        float fA = R() ? this.f23735C0.A() : this.f23735C0.y() * this.f23735C0.w();
        rect2.left = rect.left + this.f23776k.getCompoundPaddingLeft();
        rect2.top = u(rect, fA);
        rect2.right = rect.right - this.f23776k.getCompoundPaddingRight();
        rect2.bottom = t(rect, rect2, fA);
        return rect2;
    }

    private void v0() {
        if (this.f23760V != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f23768g.getLayoutParams();
            int iW = w();
            if (iW != layoutParams.topMargin) {
                layoutParams.topMargin = iW;
                this.f23768g.requestLayout();
            }
        }
    }

    private int w() {
        if (!this.f23748J) {
            return 0;
        }
        int i10 = this.f23760V;
        if (i10 == 0) {
            return (int) this.f23735C0.q();
        }
        if (i10 != 2) {
            return 0;
        }
        return R() ? (int) (this.f23735C0.q() / 2.0f) : Math.max(0, (int) (this.f23735C0.q() - (this.f23735C0.n() / 2.0f)));
    }

    private boolean x() {
        return this.f23760V == 2 && y();
    }

    private void x0(boolean z10, boolean z11) {
        ColorStateList colorStateList;
        TextView textView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f23776k;
        boolean z12 = false;
        boolean z13 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f23776k;
        if (editText2 != null && editText2.hasFocus()) {
            z12 = true;
        }
        ColorStateList colorStateList2 = this.f23787p0;
        if (colorStateList2 != null) {
            this.f23735C0.Q(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f23787p0;
            this.f23735C0.Q(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f23807z0) : this.f23807z0));
        } else if (d0()) {
            this.f23735C0.Q(this.f23788q.r());
        } else if (this.f23794t && (textView = this.f23798v) != null) {
            this.f23735C0.Q(textView.getTextColors());
        } else if (z12 && (colorStateList = this.f23789q0) != null) {
            this.f23735C0.W(colorStateList);
        }
        if (z13 || !this.f23737D0 || (isEnabled() && z12)) {
            if (z11 || this.f23733B0) {
                A(z10);
                return;
            }
            return;
        }
        if (z11 || !this.f23733B0) {
            G(z10);
        }
    }

    private boolean y() {
        return this.f23762a0 > -1 && this.f23765d0 != 0;
    }

    private void y0() {
        EditText editText;
        if (this.f23730A == null || (editText = this.f23776k) == null) {
            return;
        }
        this.f23730A.setGravity(editText.getGravity());
        this.f23730A.setPadding(this.f23776k.getCompoundPaddingLeft(), this.f23776k.getCompoundPaddingTop(), this.f23776k.getCompoundPaddingRight(), this.f23776k.getCompoundPaddingBottom());
    }

    private void z() {
        if (C()) {
            ((AbstractC2229h) this.f23751M).x0();
        }
    }

    private void z0() {
        EditText editText = this.f23776k;
        A0(editText == null ? null : editText.getText());
    }

    void C0() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.f23751M == null || this.f23760V == 0) {
            return;
        }
        boolean z10 = false;
        boolean z11 = isFocused() || ((editText2 = this.f23776k) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f23776k) != null && editText.isHovered())) {
            z10 = true;
        }
        if (!isEnabled()) {
            this.f23765d0 = this.f23807z0;
        } else if (d0()) {
            if (this.f23797u0 != null) {
                B0(z11, z10);
            } else {
                this.f23765d0 = getErrorCurrentTextColors();
            }
        } else if (!this.f23794t || (textView = this.f23798v) == null) {
            if (z11) {
                this.f23765d0 = this.f23795t0;
            } else if (z10) {
                this.f23765d0 = this.f23793s0;
            } else {
                this.f23765d0 = this.f23791r0;
            }
        } else if (this.f23797u0 != null) {
            B0(z11, z10);
        } else {
            this.f23765d0 = textView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            o0();
        }
        this.f23772i.I();
        Z();
        if (this.f23760V == 2) {
            int i10 = this.f23762a0;
            if (z11 && isEnabled()) {
                this.f23762a0 = this.f23764c0;
            } else {
                this.f23762a0 = this.f23763b0;
            }
            if (this.f23762a0 != i10) {
                X();
            }
        }
        if (this.f23760V == 1) {
            if (!isEnabled()) {
                this.f23766e0 = this.f23801w0;
            } else if (z10 && !z11) {
                this.f23766e0 = this.f23805y0;
            } else if (z11) {
                this.f23766e0 = this.f23803x0;
            } else {
                this.f23766e0 = this.f23799v0;
            }
        }
        n();
    }

    public boolean N() {
        return this.f23772i.F();
    }

    public boolean O() {
        return this.f23788q.A();
    }

    public boolean P() {
        return this.f23788q.B();
    }

    final boolean Q() {
        return this.f23733B0;
    }

    public boolean T() {
        return this.f23750L;
    }

    public void Z() {
        this.f23770h.m();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i10, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.f23768g.addView(view, layoutParams2);
        this.f23768g.setLayoutParams(layoutParams);
        v0();
        setEditText((EditText) view);
    }

    void c0(TextView textView, int i10) {
        try {
            androidx.core.widget.i.m(textView, i10);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        androidx.core.widget.i.m(textView, AbstractC2576i.f26900b);
        textView.setTextColor(androidx.core.content.a.c(getContext(), Q4.b.f9182a));
    }

    boolean d0() {
        return this.f23788q.l();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i10) {
        EditText editText = this.f23776k;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i10);
            return;
        }
        if (this.f23778l != null) {
            boolean z10 = this.f23750L;
            this.f23750L = false;
            CharSequence hint = editText.getHint();
            this.f23776k.setHint(this.f23778l);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i10);
                return;
            } finally {
                this.f23776k.setHint(hint);
                this.f23750L = z10;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i10);
        onProvideAutofillVirtualStructure(viewStructure, i10);
        viewStructure.setChildCount(this.f23768g.getChildCount());
        for (int i11 = 0; i11 < this.f23768g.getChildCount(); i11++) {
            View childAt = this.f23768g.getChildAt(i11);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i11);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i10);
            if (childAt == this.f23776k) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f23745H0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f23745H0 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        F(canvas);
        E(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f23743G0) {
            return;
        }
        this.f23743G0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        com.google.android.material.internal.a aVar = this.f23735C0;
        boolean zM0 = aVar != null ? aVar.m0(drawableState) : false;
        if (this.f23776k != null) {
            w0(isLaidOut() && isEnabled());
        }
        q0();
        C0();
        if (zM0) {
            invalidate();
        }
        this.f23743G0 = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f23776k;
        return editText != null ? editText.getBaseline() + getPaddingTop() + w() : super.getBaseline();
    }

    h5.h getBoxBackground() {
        int i10 = this.f23760V;
        if (i10 == 1 || i10 == 2) {
            return this.f23751M;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f23766e0;
    }

    public int getBoxBackgroundMode() {
        return this.f23760V;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f23761W;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return com.google.android.material.internal.o.h(this) ? this.f23757S.j().a(this.f23771h0) : this.f23757S.l().a(this.f23771h0);
    }

    public float getBoxCornerRadiusBottomStart() {
        return com.google.android.material.internal.o.h(this) ? this.f23757S.l().a(this.f23771h0) : this.f23757S.j().a(this.f23771h0);
    }

    public float getBoxCornerRadiusTopEnd() {
        return com.google.android.material.internal.o.h(this) ? this.f23757S.r().a(this.f23771h0) : this.f23757S.t().a(this.f23771h0);
    }

    public float getBoxCornerRadiusTopStart() {
        return com.google.android.material.internal.o.h(this) ? this.f23757S.t().a(this.f23771h0) : this.f23757S.r().a(this.f23771h0);
    }

    public int getBoxStrokeColor() {
        return this.f23795t0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f23797u0;
    }

    public int getBoxStrokeWidth() {
        return this.f23763b0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f23764c0;
    }

    public int getCounterMaxLength() {
        return this.f23792s;
    }

    CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f23790r && this.f23794t && (textView = this.f23798v) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f23742G;
    }

    public ColorStateList getCounterTextColor() {
        return this.f23740F;
    }

    public ColorStateList getCursorColor() {
        return this.f23744H;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f23746I;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f23787p0;
    }

    public EditText getEditText() {
        return this.f23776k;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f23772i.l();
    }

    public Drawable getEndIconDrawable() {
        return this.f23772i.n();
    }

    public int getEndIconMinSize() {
        return this.f23772i.o();
    }

    public int getEndIconMode() {
        return this.f23772i.p();
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f23772i.q();
    }

    CheckableImageButton getEndIconView() {
        return this.f23772i.r();
    }

    public CharSequence getError() {
        if (this.f23788q.A()) {
            return this.f23788q.p();
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f23788q.n();
    }

    public CharSequence getErrorContentDescription() {
        return this.f23788q.o();
    }

    public int getErrorCurrentTextColors() {
        return this.f23788q.q();
    }

    public Drawable getErrorIconDrawable() {
        return this.f23772i.s();
    }

    public CharSequence getHelperText() {
        if (this.f23788q.B()) {
            return this.f23788q.s();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f23788q.u();
    }

    public CharSequence getHint() {
        if (this.f23748J) {
            return this.f23749K;
        }
        return null;
    }

    final float getHintCollapsedTextHeight() {
        return this.f23735C0.q();
    }

    final int getHintCurrentCollapsedTextColor() {
        return this.f23735C0.t();
    }

    public int getHintMaxLines() {
        return this.f23735C0.x();
    }

    public ColorStateList getHintTextColor() {
        return this.f23789q0;
    }

    public f getLengthCounter() {
        return this.f23796u;
    }

    public int getMaxEms() {
        return this.f23782n;
    }

    public int getMaxWidth() {
        return this.f23786p;
    }

    public int getMinEms() {
        return this.f23780m;
    }

    public int getMinWidth() {
        return this.f23784o;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f23772i.u();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f23772i.v();
    }

    public CharSequence getPlaceholderText() {
        if (this.f23806z) {
            return this.f23804y;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f23734C;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f23732B;
    }

    public CharSequence getPrefixText() {
        return this.f23770h.a();
    }

    public ColorStateList getPrefixTextColor() {
        return this.f23770h.b();
    }

    public TextView getPrefixTextView() {
        return this.f23770h.d();
    }

    public h5.l getShapeAppearanceModel() {
        return this.f23757S;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f23770h.e();
    }

    public Drawable getStartIconDrawable() {
        return this.f23770h.f();
    }

    public int getStartIconMinSize() {
        return this.f23770h.g();
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f23770h.h();
    }

    public CharSequence getSuffixText() {
        return this.f23772i.w();
    }

    public ColorStateList getSuffixTextColor() {
        return this.f23772i.x();
    }

    public TextView getSuffixTextView() {
        return this.f23772i.z();
    }

    public Typeface getTypeface() {
        return this.f23773i0;
    }

    public void j(g gVar) {
        this.f23779l0.add(gVar);
        if (this.f23776k != null) {
            gVar.a(this);
        }
    }

    void l0(Editable editable) {
        int iA = this.f23796u.a(editable);
        boolean z10 = this.f23794t;
        int i10 = this.f23792s;
        if (i10 == -1) {
            this.f23798v.setText(String.valueOf(iA));
            this.f23798v.setContentDescription(null);
            this.f23794t = false;
        } else {
            this.f23794t = iA > i10;
            m0(getContext(), this.f23798v, iA, this.f23792s, this.f23794t);
            if (z10 != this.f23794t) {
                n0();
            }
            this.f23798v.setText(G0.a.c().j(getContext().getString(Q4.i.f9376d, Integer.valueOf(iA), Integer.valueOf(this.f23792s))));
        }
        if (this.f23776k == null || z10 == this.f23794t) {
            return;
        }
        w0(false);
        C0();
        q0();
    }

    void m(float f10) {
        if (this.f23735C0.B() == f10) {
            return;
        }
        if (this.f23741F0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f23741F0 = valueAnimator;
            valueAnimator.setInterpolator(c5.d.g(getContext(), Q4.a.f9173v0, R4.a.f10025b));
            this.f23741F0.setDuration(c5.d.f(getContext(), Q4.a.f9163q0, 167));
            this.f23741F0.addUpdateListener(new d());
        }
        this.f23741F0.setFloatValues(this.f23735C0.B(), f10);
        this.f23741F0.start();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f23735C0.L(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f23772i.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f23747I0 = false;
        boolean zU0 = u0();
        boolean zP0 = p0();
        if (zU0 || zP0) {
            this.f23776k.post(new Runnable() { // from class: com.google.android.material.textfield.I
                @Override // java.lang.Runnable
                public final void run() {
                    this.f23724g.f23776k.requestLayout();
                }
            });
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        EditText editText = this.f23776k;
        if (editText != null) {
            Rect rect = this.f23767f0;
            com.google.android.material.internal.b.a(this, editText, rect);
            i0(rect);
            if (this.f23748J) {
                this.f23735C0.h0(this.f23776k.getTextSize());
                int gravity = this.f23776k.getGravity();
                this.f23735C0.X((gravity & (-113)) | 48);
                this.f23735C0.g0(gravity);
                this.f23735C0.S(s(rect));
                this.f23735C0.c0(v(rect));
                this.f23735C0.N();
                if (!C() || this.f23733B0) {
                    return;
                }
                W();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.f23747I0) {
            this.f23772i.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f23747I0 = true;
        }
        y0();
        this.f23772i.x0();
        if (R()) {
            return;
        }
        j0((this.f23776k.getMeasuredWidth() - this.f23776k.getCompoundPaddingLeft()) - this.f23776k.getCompoundPaddingRight());
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        setError(savedState.f23808i);
        if (savedState.f23809j) {
            post(new c());
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        boolean z10 = i10 == 1;
        if (z10 != this.f23758T) {
            float fA = this.f23757S.r().a(this.f23771h0);
            float fA2 = this.f23757S.t().a(this.f23771h0);
            h5.l lVarM = h5.l.a().C(this.f23757S.s()).H(this.f23757S.q()).t(this.f23757S.k()).x(this.f23757S.i()).D(fA2).I(fA).u(this.f23757S.l().a(this.f23771h0)).y(this.f23757S.j().a(this.f23771h0)).m();
            this.f23758T = z10;
            setShapeAppearanceModel(lVarM);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (d0()) {
            savedState.f23808i = getError();
        }
        savedState.f23809j = this.f23772i.E();
        return savedState;
    }

    boolean p0() {
        boolean z10;
        if (this.f23776k == null) {
            return false;
        }
        boolean z11 = true;
        if (f0()) {
            int measuredWidth = this.f23770h.getMeasuredWidth() - this.f23776k.getPaddingLeft();
            if (this.f23775j0 == null || this.f23777k0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f23775j0 = colorDrawable;
                this.f23777k0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] compoundDrawablesRelative = this.f23776k.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative[0];
            Drawable drawable2 = this.f23775j0;
            if (drawable != drawable2) {
                this.f23776k.setCompoundDrawablesRelative(drawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                z10 = true;
            }
            z10 = false;
        } else {
            if (this.f23775j0 != null) {
                Drawable[] compoundDrawablesRelative2 = this.f23776k.getCompoundDrawablesRelative();
                this.f23776k.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.f23775j0 = null;
                z10 = true;
            }
            z10 = false;
        }
        if (e0()) {
            int measuredWidth2 = this.f23772i.z().getMeasuredWidth() - this.f23776k.getPaddingRight();
            CheckableImageButton checkableImageButtonK = this.f23772i.k();
            if (checkableImageButtonK != null) {
                measuredWidth2 = measuredWidth2 + checkableImageButtonK.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) checkableImageButtonK.getLayoutParams()).getMarginStart();
            }
            Drawable[] compoundDrawablesRelative3 = this.f23776k.getCompoundDrawablesRelative();
            Drawable drawable3 = this.f23781m0;
            if (drawable3 != null && this.f23783n0 != measuredWidth2) {
                this.f23783n0 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                this.f23776k.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.f23781m0, compoundDrawablesRelative3[3]);
                return true;
            }
            if (drawable3 == null) {
                ColorDrawable colorDrawable2 = new ColorDrawable();
                this.f23781m0 = colorDrawable2;
                this.f23783n0 = measuredWidth2;
                colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
            }
            Drawable drawable4 = compoundDrawablesRelative3[2];
            Drawable drawable5 = this.f23781m0;
            if (drawable4 != drawable5) {
                this.f23785o0 = drawable4;
                this.f23776k.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], drawable5, compoundDrawablesRelative3[3]);
                return true;
            }
        } else if (this.f23781m0 != null) {
            Drawable[] compoundDrawablesRelative4 = this.f23776k.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative4[2] == this.f23781m0) {
                this.f23776k.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.f23785o0, compoundDrawablesRelative4[3]);
            } else {
                z11 = z10;
            }
            this.f23781m0 = null;
            return z11;
        }
        return z10;
    }

    void q0() {
        Drawable background;
        TextView textView;
        EditText editText = this.f23776k;
        if (editText == null || this.f23760V != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (M.a(background)) {
            background = background.mutate();
        }
        if (d0()) {
            background.setColorFilter(C1637j.e(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f23794t && (textView = this.f23798v) != null) {
            background.setColorFilter(C1637j.e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            AbstractC3606a.c(background);
            this.f23776k.refreshDrawableState();
        }
    }

    void s0() {
        EditText editText = this.f23776k;
        if (editText == null || this.f23751M == null) {
            return;
        }
        if ((this.f23754P || editText.getBackground() == null) && this.f23760V != 0) {
            r0();
            this.f23754P = true;
        }
    }

    public void setBoxBackgroundColor(int i10) {
        if (this.f23766e0 != i10) {
            this.f23766e0 = i10;
            this.f23799v0 = i10;
            this.f23803x0 = i10;
            this.f23805y0 = i10;
            n();
        }
    }

    public void setBoxBackgroundColorResource(int i10) {
        setBoxBackgroundColor(androidx.core.content.a.c(getContext(), i10));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f23799v0 = defaultColor;
        this.f23766e0 = defaultColor;
        this.f23801w0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f23803x0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f23805y0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        n();
    }

    public void setBoxBackgroundMode(int i10) {
        if (i10 == this.f23760V) {
            return;
        }
        this.f23760V = i10;
        if (this.f23776k != null) {
            V();
        }
    }

    public void setBoxCollapsedPaddingTop(int i10) {
        this.f23761W = i10;
    }

    public void setBoxCornerFamily(int i10) {
        this.f23757S = this.f23757S.w().B(i10, this.f23757S.r()).G(i10, this.f23757S.t()).s(i10, this.f23757S.j()).w(i10, this.f23757S.l()).m();
        n();
    }

    public void setBoxStrokeColor(int i10) {
        if (this.f23795t0 != i10) {
            this.f23795t0 = i10;
            C0();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f23791r0 = colorStateList.getDefaultColor();
            this.f23807z0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f23793s0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f23795t0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f23795t0 != colorStateList.getDefaultColor()) {
            this.f23795t0 = colorStateList.getDefaultColor();
        }
        C0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f23797u0 != colorStateList) {
            this.f23797u0 = colorStateList;
            C0();
        }
    }

    public void setBoxStrokeWidth(int i10) {
        this.f23763b0 = i10;
        C0();
    }

    public void setBoxStrokeWidthFocused(int i10) {
        this.f23764c0 = i10;
        C0();
    }

    public void setBoxStrokeWidthFocusedResource(int i10) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i10));
    }

    public void setBoxStrokeWidthResource(int i10) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public void setCounterEnabled(boolean z10) {
        if (this.f23790r != z10) {
            if (z10) {
                androidx.appcompat.widget.B b10 = new androidx.appcompat.widget.B(getContext());
                this.f23798v = b10;
                b10.setId(Q4.e.f9292V);
                Typeface typeface = this.f23773i0;
                if (typeface != null) {
                    this.f23798v.setTypeface(typeface);
                }
                this.f23798v.setMaxLines(1);
                this.f23788q.e(this.f23798v, 2);
                ((ViewGroup.MarginLayoutParams) this.f23798v.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(Q4.c.f9255u0));
                n0();
                k0();
            } else {
                this.f23788q.C(this.f23798v, 2);
                this.f23798v = null;
            }
            this.f23790r = z10;
        }
    }

    public void setCounterMaxLength(int i10) {
        if (this.f23792s != i10) {
            if (i10 > 0) {
                this.f23792s = i10;
            } else {
                this.f23792s = -1;
            }
            if (this.f23790r) {
                k0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i10) {
        if (this.f23800w != i10) {
            this.f23800w = i10;
            n0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f23742G != colorStateList) {
            this.f23742G = colorStateList;
            n0();
        }
    }

    public void setCounterTextAppearance(int i10) {
        if (this.f23802x != i10) {
            this.f23802x = i10;
            n0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f23740F != colorStateList) {
            this.f23740F = colorStateList;
            n0();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f23744H != colorStateList) {
            this.f23744H = colorStateList;
            o0();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f23746I != colorStateList) {
            this.f23746I = colorStateList;
            if (S()) {
                o0();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f23787p0 = colorStateList;
        this.f23789q0 = colorStateList;
        if (this.f23776k != null) {
            w0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        Y(this, z10);
        super.setEnabled(z10);
    }

    public void setEndIconActivated(boolean z10) {
        this.f23772i.N(z10);
    }

    public void setEndIconCheckable(boolean z10) {
        this.f23772i.O(z10);
    }

    public void setEndIconContentDescription(int i10) {
        this.f23772i.P(i10);
    }

    public void setEndIconDrawable(int i10) {
        this.f23772i.R(i10);
    }

    public void setEndIconMinSize(int i10) {
        this.f23772i.T(i10);
    }

    public void setEndIconMode(int i10) {
        this.f23772i.U(i10);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        this.f23772i.V(onClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f23772i.W(onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        this.f23772i.X(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        this.f23772i.Y(colorStateList);
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        this.f23772i.Z(mode);
    }

    public void setEndIconVisible(boolean z10) {
        this.f23772i.a0(z10);
    }

    public void setError(CharSequence charSequence) {
        if (!this.f23788q.A()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f23788q.w();
        } else {
            this.f23788q.Q(charSequence);
        }
    }

    public void setErrorAccessibilityLiveRegion(int i10) {
        this.f23788q.E(i10);
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.f23788q.F(charSequence);
    }

    public void setErrorEnabled(boolean z10) {
        this.f23788q.G(z10);
    }

    public void setErrorIconDrawable(int i10) {
        this.f23772i.b0(i10);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        this.f23772i.d0(onClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f23772i.e0(onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.f23772i.f0(colorStateList);
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        this.f23772i.g0(mode);
    }

    public void setErrorTextAppearance(int i10) {
        this.f23788q.H(i10);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f23788q.I(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z10) {
        if (this.f23737D0 != z10) {
            this.f23737D0 = z10;
            w0(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (P()) {
                setHelperTextEnabled(false);
            }
        } else {
            if (!P()) {
                setHelperTextEnabled(true);
            }
            this.f23788q.R(charSequence);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f23788q.L(colorStateList);
    }

    public void setHelperTextEnabled(boolean z10) {
        this.f23788q.K(z10);
    }

    public void setHelperTextTextAppearance(int i10) {
        this.f23788q.J(i10);
    }

    public void setHint(CharSequence charSequence) {
        if (this.f23748J) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z10) {
        this.f23739E0 = z10;
    }

    public void setHintEnabled(boolean z10) {
        if (z10 != this.f23748J) {
            this.f23748J = z10;
            if (z10) {
                CharSequence hint = this.f23776k.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f23749K)) {
                        setHint(hint);
                    }
                    this.f23776k.setHint((CharSequence) null);
                }
                this.f23750L = true;
            } else {
                this.f23750L = false;
                if (!TextUtils.isEmpty(this.f23749K) && TextUtils.isEmpty(this.f23776k.getHint())) {
                    this.f23776k.setHint(this.f23749K);
                }
                setHintInternal(null);
            }
            if (this.f23776k != null) {
                v0();
            }
        }
    }

    public void setHintMaxLines(int i10) {
        this.f23735C0.T(i10);
        this.f23735C0.e0(i10);
        requestLayout();
    }

    public void setHintTextAppearance(int i10) {
        this.f23735C0.U(i10);
        this.f23789q0 = this.f23735C0.p();
        if (this.f23776k != null) {
            w0(false);
            v0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f23789q0 != colorStateList) {
            if (this.f23787p0 == null) {
                this.f23735C0.W(colorStateList);
            }
            this.f23789q0 = colorStateList;
            if (this.f23776k != null) {
                w0(false);
            }
        }
    }

    public void setLengthCounter(f fVar) {
        this.f23796u = fVar;
    }

    public void setMaxEms(int i10) {
        this.f23782n = i10;
        EditText editText = this.f23776k;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxEms(i10);
    }

    public void setMaxWidth(int i10) {
        this.f23786p = i10;
        EditText editText = this.f23776k;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxWidth(i10);
    }

    public void setMaxWidthResource(int i10) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    public void setMinEms(int i10) {
        this.f23780m = i10;
        EditText editText = this.f23776k;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinEms(i10);
    }

    public void setMinWidth(int i10) {
        this.f23784o = i10;
        EditText editText = this.f23776k;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinWidth(i10);
    }

    public void setMinWidthResource(int i10) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i10) {
        this.f23772i.i0(i10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i10) {
        this.f23772i.k0(i10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z10) {
        this.f23772i.m0(z10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f23772i.n0(colorStateList);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f23772i.o0(mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f23730A == null) {
            androidx.appcompat.widget.B b10 = new androidx.appcompat.widget.B(getContext());
            this.f23730A = b10;
            b10.setId(Q4.e.f9295Y);
            this.f23730A.setImportantForAccessibility(1);
            this.f23730A.setAccessibilityLiveRegion(1);
            C1785c c1785cB = B();
            this.f23736D = c1785cB;
            c1785cB.g0(67L);
            this.f23738E = B();
            setPlaceholderTextAppearance(this.f23734C);
            setPlaceholderTextColor(this.f23732B);
            AbstractC1658a0.k0(this.f23730A, new b());
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f23806z) {
                setPlaceholderTextEnabled(true);
            }
            this.f23804y = charSequence;
        }
        z0();
    }

    public void setPlaceholderTextAppearance(int i10) {
        this.f23734C = i10;
        TextView textView = this.f23730A;
        if (textView != null) {
            androidx.core.widget.i.m(textView, i10);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f23732B != colorStateList) {
            this.f23732B = colorStateList;
            TextView textView = this.f23730A;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f23770h.n(charSequence);
    }

    public void setPrefixTextAppearance(int i10) {
        this.f23770h.o(i10);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f23770h.p(colorStateList);
    }

    public void setShapeAppearanceModel(h5.l lVar) {
        h5.h hVar = this.f23751M;
        if (hVar == null || hVar.H() == lVar) {
            return;
        }
        this.f23757S = lVar;
        n();
    }

    public void setStartIconCheckable(boolean z10) {
        this.f23770h.q(z10);
    }

    public void setStartIconContentDescription(int i10) {
        setStartIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setStartIconDrawable(int i10) {
        setStartIconDrawable(i10 != 0 ? AbstractC2619a.b(getContext(), i10) : null);
    }

    public void setStartIconMinSize(int i10) {
        this.f23770h.t(i10);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        this.f23770h.u(onClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f23770h.v(onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        this.f23770h.w(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        this.f23770h.x(colorStateList);
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        this.f23770h.y(mode);
    }

    public void setStartIconVisible(boolean z10) {
        this.f23770h.z(z10);
    }

    public void setSuffixText(CharSequence charSequence) {
        this.f23772i.p0(charSequence);
    }

    public void setSuffixTextAppearance(int i10) {
        this.f23772i.q0(i10);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f23772i.r0(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.f23776k;
        if (editText != null) {
            AbstractC1658a0.k0(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f23773i0) {
            this.f23773i0 = typeface;
            this.f23735C0.p0(typeface);
            this.f23788q.N(typeface);
            TextView textView = this.f23798v;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    void w0(boolean z10) {
        x0(z10, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextInputLayout(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f23728J0;
        super(AbstractC2830a.d(context, attributeSet, i10, i11), attributeSet, i10);
        this.f23780m = -1;
        this.f23782n = -1;
        this.f23784o = -1;
        this.f23786p = -1;
        this.f23788q = new v(this);
        this.f23796u = new f() { // from class: com.google.android.material.textfield.J
            @Override // com.google.android.material.textfield.TextInputLayout.f
            public final int a(Editable editable) {
                return TextInputLayout.c(editable);
            }
        };
        this.f23767f0 = new Rect();
        this.f23769g0 = new Rect();
        this.f23771h0 = new RectF();
        this.f23779l0 = new LinkedHashSet();
        com.google.android.material.internal.a aVar = new com.google.android.material.internal.a(this);
        this.f23735C0 = aVar;
        this.f23747I0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f23768g = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        TimeInterpolator timeInterpolator = R4.a.f10024a;
        aVar.o0(timeInterpolator);
        aVar.l0(timeInterpolator);
        aVar.X(8388659);
        f0 f0VarJ = com.google.android.material.internal.l.j(context2, attributeSet, Q4.k.f9474F5, i10, i11, Q4.k.f9661c6, Q4.k.f9643a6, Q4.k.f9809u6, Q4.k.f9849z6, Q4.k.f9467E6);
        A a10 = new A(this, f0VarJ);
        this.f23770h = a10;
        this.f23748J = f0VarJ.a(Q4.k.f9451C6, true);
        setHint(f0VarJ.p(Q4.k.f9514K5));
        this.f23739E0 = f0VarJ.a(Q4.k.f9443B6, true);
        this.f23737D0 = f0VarJ.a(Q4.k.f9825w6, true);
        if (f0VarJ.s(Q4.k.f9530M5)) {
            setMinEms(f0VarJ.k(Q4.k.f9530M5, -1));
        } else if (f0VarJ.s(Q4.k.f9506J5)) {
            setMinWidth(f0VarJ.f(Q4.k.f9506J5, -1));
        }
        if (f0VarJ.s(Q4.k.f9522L5)) {
            setMaxEms(f0VarJ.k(Q4.k.f9522L5, -1));
        } else if (f0VarJ.s(Q4.k.f9498I5)) {
            setMaxWidth(f0VarJ.f(Q4.k.f9498I5, -1));
        }
        this.f23757S = h5.l.e(context2, attributeSet, i10, i11).m();
        this.f23759U = context2.getResources().getDimensionPixelOffset(Q4.c.f9249r0);
        this.f23761W = f0VarJ.e(Q4.k.f9554P5, 0);
        this.f23774j = getResources().getDimensionPixelSize(Q4.c.f9189B);
        this.f23763b0 = f0VarJ.f(Q4.k.f9610W5, context2.getResources().getDimensionPixelSize(Q4.c.f9251s0));
        this.f23764c0 = f0VarJ.f(Q4.k.f9618X5, context2.getResources().getDimensionPixelSize(Q4.c.f9253t0));
        this.f23762a0 = this.f23763b0;
        float fD = f0VarJ.d(Q4.k.f9586T5, -1.0f);
        float fD2 = f0VarJ.d(Q4.k.f9578S5, -1.0f);
        float fD3 = f0VarJ.d(Q4.k.f9562Q5, -1.0f);
        float fD4 = f0VarJ.d(Q4.k.f9570R5, -1.0f);
        l.b bVarW = this.f23757S.w();
        if (fD >= 0.0f) {
            bVarW.D(fD);
        }
        if (fD2 >= 0.0f) {
            bVarW.I(fD2);
        }
        if (fD3 >= 0.0f) {
            bVarW.y(fD3);
        }
        if (fD4 >= 0.0f) {
            bVarW.u(fD4);
        }
        this.f23757S = bVarW.m();
        ColorStateList colorStateListB = AbstractC2425c.b(context2, f0VarJ, Q4.k.f9538N5);
        if (colorStateListB != null) {
            int defaultColor = colorStateListB.getDefaultColor();
            this.f23799v0 = defaultColor;
            this.f23766e0 = defaultColor;
            if (colorStateListB.isStateful()) {
                this.f23801w0 = colorStateListB.getColorForState(new int[]{-16842910}, -1);
                this.f23803x0 = colorStateListB.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f23805y0 = colorStateListB.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f23803x0 = this.f23799v0;
                ColorStateList colorStateListA = AbstractC2619a.a(context2, Q4.b.f9184c);
                this.f23801w0 = colorStateListA.getColorForState(new int[]{-16842910}, -1);
                this.f23805y0 = colorStateListA.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f23766e0 = 0;
            this.f23799v0 = 0;
            this.f23801w0 = 0;
            this.f23803x0 = 0;
            this.f23805y0 = 0;
        }
        if (f0VarJ.s(Q4.k.f9490H5)) {
            ColorStateList colorStateListC = f0VarJ.c(Q4.k.f9490H5);
            this.f23789q0 = colorStateListC;
            this.f23787p0 = colorStateListC;
        }
        ColorStateList colorStateListB2 = AbstractC2425c.b(context2, f0VarJ, Q4.k.f9594U5);
        this.f23795t0 = f0VarJ.b(Q4.k.f9594U5, 0);
        this.f23791r0 = androidx.core.content.a.c(context2, Q4.b.f9185d);
        this.f23807z0 = androidx.core.content.a.c(context2, Q4.b.f9186e);
        this.f23793s0 = androidx.core.content.a.c(context2, Q4.b.f9187f);
        if (colorStateListB2 != null) {
            setBoxStrokeColorStateList(colorStateListB2);
        }
        if (f0VarJ.s(Q4.k.f9602V5)) {
            setBoxStrokeErrorColor(AbstractC2425c.b(context2, f0VarJ, Q4.k.f9602V5));
        }
        if (f0VarJ.n(Q4.k.f9467E6, -1) != -1) {
            setHintTextAppearance(f0VarJ.n(Q4.k.f9467E6, 0));
        }
        this.f23744H = f0VarJ.c(Q4.k.f9679e6);
        this.f23746I = f0VarJ.c(Q4.k.f9688f6);
        int iN = f0VarJ.n(Q4.k.f9809u6, 0);
        CharSequence charSequenceP = f0VarJ.p(Q4.k.f9769p6);
        int iK = f0VarJ.k(Q4.k.f9761o6, 1);
        boolean zA = f0VarJ.a(Q4.k.f9777q6, false);
        int iN2 = f0VarJ.n(Q4.k.f9849z6, 0);
        boolean zA2 = f0VarJ.a(Q4.k.f9841y6, false);
        CharSequence charSequenceP2 = f0VarJ.p(Q4.k.f9833x6);
        int iN3 = f0VarJ.n(Q4.k.f9531M6, 0);
        CharSequence charSequenceP3 = f0VarJ.p(Q4.k.f9523L6);
        boolean zA3 = f0VarJ.a(Q4.k.f9626Y5, false);
        setCounterMaxLength(f0VarJ.k(Q4.k.f9634Z5, -1));
        this.f23802x = f0VarJ.n(Q4.k.f9661c6, 0);
        this.f23800w = f0VarJ.n(Q4.k.f9643a6, 0);
        setBoxBackgroundMode(f0VarJ.k(Q4.k.f9546O5, 0));
        setErrorContentDescription(charSequenceP);
        setErrorAccessibilityLiveRegion(iK);
        setCounterOverflowTextAppearance(this.f23800w);
        setHelperTextTextAppearance(iN2);
        setErrorTextAppearance(iN);
        setCounterTextAppearance(this.f23802x);
        setPlaceholderText(charSequenceP3);
        setPlaceholderTextAppearance(iN3);
        if (f0VarJ.s(Q4.k.f9817v6)) {
            setErrorTextColor(f0VarJ.c(Q4.k.f9817v6));
        }
        if (f0VarJ.s(Q4.k.f9435A6)) {
            setHelperTextColor(f0VarJ.c(Q4.k.f9435A6));
        }
        if (f0VarJ.s(Q4.k.f9475F6)) {
            setHintTextColor(f0VarJ.c(Q4.k.f9475F6));
        }
        if (f0VarJ.s(Q4.k.f9670d6)) {
            setCounterTextColor(f0VarJ.c(Q4.k.f9670d6));
        }
        if (f0VarJ.s(Q4.k.f9652b6)) {
            setCounterOverflowTextColor(f0VarJ.c(Q4.k.f9652b6));
        }
        if (f0VarJ.s(Q4.k.f9539N6)) {
            setPlaceholderTextColor(f0VarJ.c(Q4.k.f9539N6));
        }
        s sVar = new s(this, f0VarJ);
        this.f23772i = sVar;
        boolean zA4 = f0VarJ.a(Q4.k.f9482G5, true);
        setHintMaxLines(f0VarJ.k(Q4.k.f9459D6, 1));
        f0VarJ.x();
        setImportantForAccessibility(2);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
        frameLayout.addView(a10);
        frameLayout.addView(sVar);
        addView(frameLayout);
        setEnabled(zA4);
        setHelperTextEnabled(zA2);
        setErrorEnabled(zA);
        setCounterEnabled(zA3);
        setHelperText(charSequenceP2);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        this.f23772i.Q(charSequence);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f23772i.S(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f23772i.c0(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f23772i.j0(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f23772i.l0(drawable);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.f23770h.r(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f23770h.s(drawable);
    }

    public void setHint(int i10) {
        setHint(i10 != 0 ? getResources().getText(i10) : null);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements TextWatcher {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f23810g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ EditText f23811h;

        a(EditText editText) {
            this.f23811h = editText;
            this.f23810g = editText.getLineCount();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout.this.w0(!r0.f23745H0);
            TextInputLayout textInputLayout = TextInputLayout.this;
            if (textInputLayout.f23790r) {
                textInputLayout.l0(editable);
            }
            if (TextInputLayout.this.f23806z) {
                TextInputLayout.this.A0(editable);
            }
            int lineCount = this.f23811h.getLineCount();
            int i10 = this.f23810g;
            if (lineCount != i10) {
                if (lineCount < i10) {
                    int minimumHeight = this.f23811h.getMinimumHeight();
                    int i11 = TextInputLayout.this.f23731A0;
                    if (minimumHeight != i11) {
                        this.f23811h.setMinimumHeight(i11);
                    }
                }
                this.f23810g = lineCount;
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }
}
