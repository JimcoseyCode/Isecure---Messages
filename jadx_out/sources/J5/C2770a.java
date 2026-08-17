package j5;

import Q4.k;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.B;
import e5.AbstractC2424b;
import e5.AbstractC2425c;
import k5.AbstractC2830a;

/* JADX INFO: renamed from: j5.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class C2770a extends B {
    public C2770a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private void f(Resources.Theme theme, int i10) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(i10, k.f9480G3);
        int iJ = j(getContext(), typedArrayObtainStyledAttributes, k.f9504J3, k.f9520L3);
        typedArrayObtainStyledAttributes.recycle();
        if (iJ >= 0) {
            setLineHeight(iJ);
        }
    }

    private static boolean g(Context context) {
        return AbstractC2424b.b(context, Q4.a.f9112K0, true);
    }

    private static int h(Resources.Theme theme, AttributeSet attributeSet, int i10, int i11) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, k.f9528M3, i10, i11);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(k.f9536N3, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    private void i(AttributeSet attributeSet, int i10, int i11) {
        int iH;
        Context context = getContext();
        if (g(context)) {
            Resources.Theme theme = context.getTheme();
            if (k(context, theme, attributeSet, i10, i11) || (iH = h(theme, attributeSet, i10, i11)) == -1) {
                return;
            }
            f(theme, iH);
        }
    }

    private static int j(Context context, TypedArray typedArray, int... iArr) {
        int iD = -1;
        for (int i10 = 0; i10 < iArr.length && iD < 0; i10++) {
            iD = AbstractC2425c.d(context, typedArray, iArr[i10], -1);
        }
        return iD;
    }

    private static boolean k(Context context, Resources.Theme theme, AttributeSet attributeSet, int i10, int i11) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, k.f9528M3, i10, i11);
        int iJ = j(context, typedArrayObtainStyledAttributes, k.f9544O3, k.f9552P3);
        typedArrayObtainStyledAttributes.recycle();
        return iJ != -1;
    }

    @Override // androidx.appcompat.widget.B, android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        if (g(context)) {
            f(context.getTheme(), i10);
        }
    }

    public C2770a(Context context, AttributeSet attributeSet, int i10) {
        super(AbstractC2830a.d(context, attributeSet, i10, 0), attributeSet, i10);
        i(attributeSet, i10, 0);
    }
}
