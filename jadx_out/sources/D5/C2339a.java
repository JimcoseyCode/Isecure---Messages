package d5;

import Q4.j;
import Q4.k;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.C1647u;
import androidx.core.widget.c;
import com.google.android.material.internal.l;
import e5.AbstractC2425c;
import f.AbstractC2568a;
import k5.AbstractC2830a;

/* JADX INFO: renamed from: d5.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class C2339a extends C1647u {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f25669m = j.f9424w;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int[][] f25670n = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ColorStateList f25671k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f25672l;

    public C2339a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC2568a.f26719F);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f25671k == null) {
            int iD = X4.a.d(this, AbstractC2568a.f26747s);
            int iD2 = X4.a.d(this, Q4.a.f9164r);
            int iD3 = X4.a.d(this, Q4.a.f9109J);
            int[][] iArr = f25670n;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = X4.a.j(iD3, iD, 1.0f);
            iArr2[1] = X4.a.j(iD3, iD2, 0.54f);
            iArr2[2] = X4.a.j(iD3, iD2, 0.38f);
            iArr2[3] = X4.a.j(iD3, iD2, 0.38f);
            this.f25671k = new ColorStateList(iArr, iArr2);
        }
        return this.f25671k;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f25672l && c.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f25672l = z10;
        if (z10) {
            c.d(this, getMaterialThemeColorsTintList());
        } else {
            c.d(this, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C2339a(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f25669m;
        super(AbstractC2830a.d(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        TypedArray typedArrayI = l.i(context2, attributeSet, k.f9822w3, i10, i11, new int[0]);
        if (typedArrayI.hasValue(k.f9830x3)) {
            c.d(this, AbstractC2425c.a(context2, typedArrayI, k.f9830x3));
        }
        this.f25672l = typedArrayI.getBoolean(k.f9838y3, false);
        typedArrayI.recycle();
    }
}
