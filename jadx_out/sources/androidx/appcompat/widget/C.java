package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.core.view.AbstractC1658a0;
import com.facebook.react.uimanager.ViewDefaults;
import f.AbstractC2577j;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class C {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final RectF f14633l = new RectF();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static ConcurrentHashMap f14634m = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f14635a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f14636b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f14637c = -1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f14638d = -1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f14639e = -1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int[] f14640f = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f14641g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private TextPaint f14642h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final TextView f14643i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Context f14644j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final d f14645k;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class a {
        static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11, TextView textView, TextPaint textPaint, d dVar) {
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10);
            StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i11 == -1) {
                i11 = ViewDefaults.NUMBER_OF_LINES;
            }
            hyphenationFrequency.setMaxLines(i11);
            try {
                dVar.a(builderObtain, textView);
            } catch (ClassCastException unused) {
            }
            return builderObtain.build();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class b extends d {
        b() {
        }

        @Override // androidx.appcompat.widget.C.d
        void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) C.m(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class c extends b {
        c() {
        }

        @Override // androidx.appcompat.widget.C.b, androidx.appcompat.widget.C.d
        void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // androidx.appcompat.widget.C.d
        boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class d {
        d() {
        }

        abstract void a(StaticLayout.Builder builder, TextView textView);

        boolean b(TextView textView) {
            return ((Boolean) C.m(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    C(TextView textView) {
        this.f14643i = textView;
        this.f14644j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f14645k = new c();
        } else {
            this.f14645k = new b();
        }
    }

    private int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i10 : iArr) {
                if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                    arrayList.add(Integer.valueOf(i10));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i11 = 0; i11 < size; i11++) {
                    iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    private void c() {
        this.f14635a = 0;
        this.f14638d = -1.0f;
        this.f14639e = -1.0f;
        this.f14637c = -1.0f;
        this.f14640f = new int[0];
        this.f14636b = false;
    }

    private int e(RectF rectF) {
        int length = this.f14640f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i10 = 1;
        int i11 = length - 1;
        int i12 = 0;
        while (i10 <= i11) {
            int i13 = (i10 + i11) / 2;
            if (x(this.f14640f[i13], rectF)) {
                int i14 = i13 + 1;
                i12 = i10;
                i10 = i14;
            } else {
                i12 = i13 - 1;
                i11 = i12;
            }
        }
        return this.f14640f[i12];
    }

    private static Method k(String str) {
        try {
            Method declaredMethod = (Method) f14634m.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, null)) != null) {
                declaredMethod.setAccessible(true);
                f14634m.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception unused) {
            return null;
        }
    }

    static Object m(Object obj, String str, Object obj2) {
        try {
            return k(str).invoke(obj, null);
        } catch (Exception unused) {
            return obj2;
        }
    }

    private void s(float f10) {
        if (f10 != this.f14643i.getPaint().getTextSize()) {
            this.f14643i.getPaint().setTextSize(f10);
            boolean zIsInLayout = this.f14643i.isInLayout();
            if (this.f14643i.getLayout() != null) {
                this.f14636b = false;
                try {
                    Method methodK = k("nullLayouts");
                    if (methodK != null) {
                        methodK.invoke(this.f14643i, null);
                    }
                } catch (Exception unused) {
                }
                if (zIsInLayout) {
                    this.f14643i.forceLayout();
                } else {
                    this.f14643i.requestLayout();
                }
                this.f14643i.invalidate();
            }
        }
    }

    private boolean u() {
        if (y() && this.f14635a == 1) {
            if (!this.f14641g || this.f14640f.length == 0) {
                int iFloor = ((int) Math.floor((this.f14639e - this.f14638d) / this.f14637c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i10 = 0; i10 < iFloor; i10++) {
                    iArr[i10] = Math.round(this.f14638d + (i10 * this.f14637c));
                }
                this.f14640f = b(iArr);
            }
            this.f14636b = true;
        } else {
            this.f14636b = false;
        }
        return this.f14636b;
    }

    private void v(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = typedArray.getDimensionPixelSize(i10, -1);
            }
            this.f14640f = b(iArr);
            w();
        }
    }

    private boolean w() {
        boolean z10 = this.f14640f.length > 0;
        this.f14641g = z10;
        if (z10) {
            this.f14635a = 1;
            this.f14638d = r0[0];
            this.f14639e = r0[r1 - 1];
            this.f14637c = -1.0f;
        }
        return z10;
    }

    private boolean x(int i10, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f14643i.getText();
        TransformationMethod transformationMethod = this.f14643i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f14643i)) != null) {
            text = transformation;
        }
        int maxLines = this.f14643i.getMaxLines();
        l(i10);
        StaticLayout staticLayoutD = d(text, (Layout.Alignment) m(this.f14643i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (staticLayoutD.getLineCount() <= maxLines && staticLayoutD.getLineEnd(staticLayoutD.getLineCount() - 1) == text.length())) && ((float) staticLayoutD.getHeight()) <= rectF.bottom;
    }

    private boolean y() {
        return !(this.f14643i instanceof C1638k);
    }

    private void z(float f10, float f11, float f12) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
        }
        if (f11 <= f10) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        }
        if (f12 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
        }
        this.f14635a = 1;
        this.f14638d = f10;
        this.f14639e = f11;
        this.f14637c = f12;
        this.f14641g = false;
    }

    void a() {
        if (n()) {
            if (this.f14636b) {
                if (this.f14643i.getMeasuredHeight() <= 0 || this.f14643i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f14645k.b(this.f14643i) ? 1048576 : (this.f14643i.getMeasuredWidth() - this.f14643i.getTotalPaddingLeft()) - this.f14643i.getTotalPaddingRight();
                int height = (this.f14643i.getHeight() - this.f14643i.getCompoundPaddingBottom()) - this.f14643i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f14633l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fE = e(rectF);
                        if (fE != this.f14643i.getTextSize()) {
                            t(0, fE);
                        }
                    } finally {
                    }
                }
            }
            this.f14636b = true;
        }
    }

    StaticLayout d(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11) {
        return a.a(charSequence, alignment, i10, i11, this.f14643i, this.f14642h, this.f14645k);
    }

    int f() {
        return Math.round(this.f14639e);
    }

    int g() {
        return Math.round(this.f14638d);
    }

    int h() {
        return Math.round(this.f14637c);
    }

    int[] i() {
        return this.f14640f;
    }

    int j() {
        return this.f14635a;
    }

    void l(int i10) {
        TextPaint textPaint = this.f14642h;
        if (textPaint == null) {
            this.f14642h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f14642h.set(this.f14643i.getPaint());
        this.f14642h.setTextSize(i10);
    }

    boolean n() {
        return y() && this.f14635a != 0;
    }

    void o(AttributeSet attributeSet, int i10) {
        int resourceId;
        TypedArray typedArrayObtainStyledAttributes = this.f14644j.obtainStyledAttributes(attributeSet, AbstractC2577j.f27064g0, i10, 0);
        TextView textView = this.f14643i;
        AbstractC1658a0.i0(textView, textView.getContext(), AbstractC2577j.f27064g0, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
        if (typedArrayObtainStyledAttributes.hasValue(AbstractC2577j.f27089l0)) {
            this.f14635a = typedArrayObtainStyledAttributes.getInt(AbstractC2577j.f27089l0, 0);
        }
        float dimension = typedArrayObtainStyledAttributes.hasValue(AbstractC2577j.f27084k0) ? typedArrayObtainStyledAttributes.getDimension(AbstractC2577j.f27084k0, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(AbstractC2577j.f27074i0) ? typedArrayObtainStyledAttributes.getDimension(AbstractC2577j.f27074i0, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(AbstractC2577j.f27069h0) ? typedArrayObtainStyledAttributes.getDimension(AbstractC2577j.f27069h0, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes.hasValue(AbstractC2577j.f27079j0) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(AbstractC2577j.f27079j0, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            v(typedArrayObtainTypedArray);
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!y()) {
            this.f14635a = 0;
            return;
        }
        if (this.f14635a == 1) {
            if (!this.f14641g) {
                DisplayMetrics displayMetrics = this.f14644j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                z(dimension2, dimension3, dimension);
            }
            u();
        }
    }

    void p(int i10, int i11, int i12, int i13) {
        if (y()) {
            DisplayMetrics displayMetrics = this.f14644j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(i13, i10, displayMetrics), TypedValue.applyDimension(i13, i11, displayMetrics), TypedValue.applyDimension(i13, i12, displayMetrics));
            if (u()) {
                a();
            }
        }
    }

    void q(int[] iArr, int i10) {
        if (y()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i10 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f14644j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArrCopyOf[i11] = Math.round(TypedValue.applyDimension(i10, iArr[i11], displayMetrics));
                    }
                }
                this.f14640f = b(iArrCopyOf);
                if (!w()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f14641g = false;
            }
            if (u()) {
                a();
            }
        }
    }

    void r(int i10) {
        if (y()) {
            if (i10 == 0) {
                c();
                return;
            }
            if (i10 != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i10);
            }
            DisplayMetrics displayMetrics = this.f14644j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (u()) {
                a();
            }
        }
    }

    void t(int i10, float f10) {
        Context context = this.f14644j;
        s(TypedValue.applyDimension(i10, f10, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }
}
