package androidx.appcompat.widget;

import G0.l;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import g.AbstractC2619a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class B extends TextView {
    private final C1631d mBackgroundTintHelper;
    private C1640m mEmojiTextViewHelper;
    private boolean mIsSetTypefaceProcessing;
    private Future<G0.l> mPrecomputedTextFuture;
    private a mSuperCaller;
    private final C1652z mTextClassifierHelper;
    private final A mTextHelper;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private interface a {
        void a(int[] iArr, int i10);

        int[] b();

        TextClassifier c();

        int d();

        void e(TextClassifier textClassifier);

        void f(int i10);

        void g(int i10, int i11, int i12, int i13);

        int h();

        int i();

        void j(int i10);

        int k();

        void l(int i10);

        void m(int i10, float f10);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class c extends b {
        c() {
            super();
        }

        @Override // androidx.appcompat.widget.B.b, androidx.appcompat.widget.B.a
        public void f(int i10) {
            B.super.setLastBaselineToBottomHeight(i10);
        }

        @Override // androidx.appcompat.widget.B.b, androidx.appcompat.widget.B.a
        public void j(int i10) {
            B.super.setFirstBaselineToTopHeight(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class d extends c {
        d() {
            super();
        }

        @Override // androidx.appcompat.widget.B.b, androidx.appcompat.widget.B.a
        public void m(int i10, float f10) {
            B.super.setLineHeight(i10, f10);
        }
    }

    public B(Context context) {
        this(context, null);
    }

    private void e() {
        Future<G0.l> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                android.support.v4.media.session.b.a(future.get());
                androidx.core.widget.i.l(this, null);
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    private C1640m getEmojiTextViewHelper() {
        if (this.mEmojiTextViewHelper == null) {
            this.mEmojiTextViewHelper = new C1640m(this);
        }
        return this.mEmojiTextViewHelper;
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C1631d c1631d = this.mBackgroundTintHelper;
        if (c1631d != null) {
            c1631d.b();
        }
        A a10 = this.mTextHelper;
        if (a10 != null) {
            a10.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (q0.f15074c) {
            return getSuperCaller().d();
        }
        A a10 = this.mTextHelper;
        if (a10 != null) {
            return a10.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (q0.f15074c) {
            return getSuperCaller().i();
        }
        A a10 = this.mTextHelper;
        if (a10 != null) {
            return a10.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (q0.f15074c) {
            return getSuperCaller().k();
        }
        A a10 = this.mTextHelper;
        if (a10 != null) {
            return a10.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (q0.f15074c) {
            return getSuperCaller().b();
        }
        A a10 = this.mTextHelper;
        return a10 != null ? a10.h() : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (q0.f15074c) {
            return getSuperCaller().h() == 1 ? 1 : 0;
        }
        A a10 = this.mTextHelper;
        if (a10 != null) {
            return a10.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.i.o(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return androidx.core.widget.i.a(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return androidx.core.widget.i.b(this);
    }

    a getSuperCaller() {
        if (this.mSuperCaller == null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34) {
                this.mSuperCaller = new d();
            } else if (i10 >= 28) {
                this.mSuperCaller = new c();
            } else if (i10 >= 26) {
                this.mSuperCaller = new b();
            }
        }
        return this.mSuperCaller;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1631d c1631d = this.mBackgroundTintHelper;
        if (c1631d != null) {
            return c1631d.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1631d c1631d = this.mBackgroundTintHelper;
        if (c1631d != null) {
            return c1631d.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.k();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        e();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C1652z c1652z;
        return (Build.VERSION.SDK_INT >= 28 || (c1652z = this.mTextClassifierHelper) == null) ? getSuperCaller().c() : c1652z.a();
    }

    public l.a getTextMetricsParamsCompat() {
        return androidx.core.widget.i.e(this);
    }

    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().b();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.r(this, inputConnectionOnCreateInputConnection, editorInfo);
        return AbstractC1641n.a(inputConnectionOnCreateInputConnection, editorInfo, this);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30 || i10 >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        A a10 = this.mTextHelper;
        if (a10 != null) {
            a10.o(z10, i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        e();
        super.onMeasure(i10, i11);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        A a10 = this.mTextHelper;
        if (a10 == null || q0.f15074c || !a10.l()) {
            return;
        }
        this.mTextHelper.c();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        if (q0.f15074c) {
            getSuperCaller().g(i10, i11, i12, i13);
            return;
        }
        A a10 = this.mTextHelper;
        if (a10 != null) {
            a10.t(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) throws IllegalArgumentException {
        if (q0.f15074c) {
            getSuperCaller().a(iArr, i10);
            return;
        }
        A a10 = this.mTextHelper;
        if (a10 != null) {
            a10.u(iArr, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (q0.f15074c) {
            getSuperCaller().l(i10);
            return;
        }
        A a10 = this.mTextHelper;
        if (a10 != null) {
            a10.v(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1631d c1631d = this.mBackgroundTintHelper;
        if (c1631d != null) {
            c1631d.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C1631d c1631d = this.mBackgroundTintHelper;
        if (c1631d != null) {
            c1631d.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        A a10 = this.mTextHelper;
        if (a10 != null) {
            a10.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        A a10 = this.mTextHelper;
        if (a10 != null) {
            a10.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        A a10 = this.mTextHelper;
        if (a10 != null) {
            a10.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        A a10 = this.mTextHelper;
        if (a10 != null) {
            a10.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.i.p(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().e(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().j(i10);
        } else {
            androidx.core.widget.i.h(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().f(i10);
        } else {
            androidx.core.widget.i.i(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10) {
        androidx.core.widget.i.j(this, i10);
    }

    public void setPrecomputedText(G0.l lVar) {
        androidx.core.widget.i.l(this, lVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1631d c1631d = this.mBackgroundTintHelper;
        if (c1631d != null) {
            c1631d.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1631d c1631d = this.mBackgroundTintHelper;
        if (c1631d != null) {
            c1631d.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.w(colorStateList);
        this.mTextHelper.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.x(mode);
        this.mTextHelper.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        A a10 = this.mTextHelper;
        if (a10 != null) {
            a10.q(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C1652z c1652z;
        if (Build.VERSION.SDK_INT >= 28 || (c1652z = this.mTextClassifierHelper) == null) {
            getSuperCaller().e(textClassifier);
        } else {
            c1652z.b(textClassifier);
        }
    }

    public void setTextFuture(Future<G0.l> future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(l.a aVar) {
        androidx.core.widget.i.n(this, aVar);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        if (q0.f15074c) {
            super.setTextSize(i10, f10);
            return;
        }
        A a10 = this.mTextHelper;
        if (a10 != null) {
            a10.A(i10, f10);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i10) {
        if (this.mIsSetTypefaceProcessing) {
            return;
        }
        Typeface typefaceA = (typeface == null || i10 <= 0) ? null : x0.v.a(getContext(), typeface, i10);
        this.mIsSetTypefaceProcessing = true;
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        try {
            super.setTypeface(typeface, i10);
        } finally {
            this.mIsSetTypefaceProcessing = false;
        }
    }

    public B(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10, float f10) {
        if (Build.VERSION.SDK_INT >= 34) {
            getSuperCaller().m(i10, f10);
        } else {
            androidx.core.widget.i.k(this, i10, f10);
        }
    }

    public B(Context context, AttributeSet attributeSet, int i10) {
        super(c0.b(context), attributeSet, i10);
        this.mIsSetTypefaceProcessing = false;
        this.mSuperCaller = null;
        b0.a(this, getContext());
        C1631d c1631d = new C1631d(this);
        this.mBackgroundTintHelper = c1631d;
        c1631d.e(attributeSet, i10);
        A a10 = new A(this);
        this.mTextHelper = a10;
        a10.m(attributeSet, i10);
        a10.b();
        this.mTextClassifierHelper = new C1652z(this);
        getEmojiTextViewHelper().c(attributeSet, i10);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i10 != 0 ? AbstractC2619a.b(context, i10) : null, i11 != 0 ? AbstractC2619a.b(context, i11) : null, i12 != 0 ? AbstractC2619a.b(context, i12) : null, i13 != 0 ? AbstractC2619a.b(context, i13) : null);
        A a10 = this.mTextHelper;
        if (a10 != null) {
            a10.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i10 != 0 ? AbstractC2619a.b(context, i10) : null, i11 != 0 ? AbstractC2619a.b(context, i11) : null, i12 != 0 ? AbstractC2619a.b(context, i12) : null, i13 != 0 ? AbstractC2619a.b(context, i13) : null);
        A a10 = this.mTextHelper;
        if (a10 != null) {
            a10.p();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b implements a {
        b() {
        }

        @Override // androidx.appcompat.widget.B.a
        public void a(int[] iArr, int i10) {
            B.super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        @Override // androidx.appcompat.widget.B.a
        public int[] b() {
            return B.super.getAutoSizeTextAvailableSizes();
        }

        @Override // androidx.appcompat.widget.B.a
        public TextClassifier c() {
            return B.super.getTextClassifier();
        }

        @Override // androidx.appcompat.widget.B.a
        public int d() {
            return B.super.getAutoSizeMaxTextSize();
        }

        @Override // androidx.appcompat.widget.B.a
        public void e(TextClassifier textClassifier) {
            B.super.setTextClassifier(textClassifier);
        }

        @Override // androidx.appcompat.widget.B.a
        public void g(int i10, int i11, int i12, int i13) {
            B.super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        @Override // androidx.appcompat.widget.B.a
        public int h() {
            return B.super.getAutoSizeTextType();
        }

        @Override // androidx.appcompat.widget.B.a
        public int i() {
            return B.super.getAutoSizeMinTextSize();
        }

        @Override // androidx.appcompat.widget.B.a
        public int k() {
            return B.super.getAutoSizeStepGranularity();
        }

        @Override // androidx.appcompat.widget.B.a
        public void l(int i10) {
            B.super.setAutoSizeTextTypeWithDefaults(i10);
        }

        @Override // androidx.appcompat.widget.B.a
        public void f(int i10) {
        }

        @Override // androidx.appcompat.widget.B.a
        public void j(int i10) {
        }

        @Override // androidx.appcompat.widget.B.a
        public void m(int i10, float f10) {
        }
    }
}
