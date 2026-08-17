package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import g.AbstractC2619a;
import w0.AbstractC3461h;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f14983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TypedArray f14984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TypedValue f14985c;

    private f0(Context context, TypedArray typedArray) {
        this.f14983a = context;
        this.f14984b = typedArray;
    }

    public static f0 t(Context context, int i10, int[] iArr) {
        return new f0(context, context.obtainStyledAttributes(i10, iArr));
    }

    public static f0 u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new f0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static f0 v(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11) {
        return new f0(context, context.obtainStyledAttributes(attributeSet, iArr, i10, i11));
    }

    public boolean a(int i10, boolean z10) {
        return this.f14984b.getBoolean(i10, z10);
    }

    public int b(int i10, int i11) {
        return this.f14984b.getColor(i10, i11);
    }

    public ColorStateList c(int i10) {
        int resourceId;
        ColorStateList colorStateListA;
        return (!this.f14984b.hasValue(i10) || (resourceId = this.f14984b.getResourceId(i10, 0)) == 0 || (colorStateListA = AbstractC2619a.a(this.f14983a, resourceId)) == null) ? this.f14984b.getColorStateList(i10) : colorStateListA;
    }

    public float d(int i10, float f10) {
        return this.f14984b.getDimension(i10, f10);
    }

    public int e(int i10, int i11) {
        return this.f14984b.getDimensionPixelOffset(i10, i11);
    }

    public int f(int i10, int i11) {
        return this.f14984b.getDimensionPixelSize(i10, i11);
    }

    public Drawable g(int i10) {
        int resourceId;
        return (!this.f14984b.hasValue(i10) || (resourceId = this.f14984b.getResourceId(i10, 0)) == 0) ? this.f14984b.getDrawable(i10) : AbstractC2619a.b(this.f14983a, resourceId);
    }

    public Drawable h(int i10) {
        int resourceId;
        if (!this.f14984b.hasValue(i10) || (resourceId = this.f14984b.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return C1637j.b().d(this.f14983a, resourceId, true);
    }

    public float i(int i10, float f10) {
        return this.f14984b.getFloat(i10, f10);
    }

    public Typeface j(int i10, int i11, AbstractC3461h.e eVar) {
        int resourceId = this.f14984b.getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f14985c == null) {
            this.f14985c = new TypedValue();
        }
        return AbstractC3461h.i(this.f14983a, resourceId, this.f14985c, i11, eVar);
    }

    public int k(int i10, int i11) {
        return this.f14984b.getInt(i10, i11);
    }

    public int l(int i10, int i11) {
        return this.f14984b.getInteger(i10, i11);
    }

    public int m(int i10, int i11) {
        return this.f14984b.getLayoutDimension(i10, i11);
    }

    public int n(int i10, int i11) {
        return this.f14984b.getResourceId(i10, i11);
    }

    public String o(int i10) {
        return this.f14984b.getString(i10);
    }

    public CharSequence p(int i10) {
        return this.f14984b.getText(i10);
    }

    public CharSequence[] q(int i10) {
        return this.f14984b.getTextArray(i10);
    }

    public TypedArray r() {
        return this.f14984b;
    }

    public boolean s(int i10) {
        return this.f14984b.hasValue(i10);
    }

    public TypedValue w(int i10) {
        return this.f14984b.peekValue(i10);
    }

    public void x() {
        this.f14984b.recycle();
    }
}
