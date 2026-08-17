package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import r0.C3242e;
import r0.InterfaceC3246i;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends View {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected int[] f15605g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected int f15606h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected Context f15607i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected InterfaceC3246i f15608j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected boolean f15609k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected String f15610l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected String f15611m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private View[] f15612n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected HashMap f15613o;

    public c(Context context) {
        super(context);
        this.f15605g = new int[32];
        this.f15609k = false;
        this.f15612n = null;
        this.f15613o = new HashMap();
        this.f15607i = context;
        i(null);
    }

    private void a(String str) {
        if (str == null || str.length() == 0 || this.f15607i == null) {
            return;
        }
        String strTrim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        int iH = h(strTrim);
        if (iH != 0) {
            this.f15613o.put(Integer.valueOf(iH), strTrim);
            b(iH);
        }
    }

    private void b(int i10) {
        if (i10 == getId()) {
            return;
        }
        int i11 = this.f15606h + 1;
        int[] iArr = this.f15605g;
        if (i11 > iArr.length) {
            this.f15605g = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f15605g;
        int i12 = this.f15606h;
        iArr2[i12] = i10;
        this.f15606h = i12 + 1;
    }

    private void c(String str) {
        if (str == null || str.length() == 0 || this.f15607i == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.b) && strTrim.equals(((ConstraintLayout.b) layoutParams).f15530b0) && childAt.getId() != -1) {
                b(childAt.getId());
            }
        }
    }

    private int g(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str == null || constraintLayout == null || (resources = this.f15607i.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            if (childAt.getId() != -1) {
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    resourceEntryName = null;
                }
                if (str.equals(resourceEntryName)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    private int h(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int iG = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object objG = constraintLayout.g(0, str);
            if (objG instanceof Integer) {
                iG = ((Integer) objG).intValue();
            }
        }
        if (iG == 0 && constraintLayout != null) {
            iG = g(constraintLayout, str);
        }
        if (iG == 0) {
            try {
                iG = h.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return iG == 0 ? this.f15607i.getResources().getIdentifier(str, "id", this.f15607i.getPackageName()) : iG;
    }

    protected void d() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        e((ConstraintLayout) parent);
    }

    protected void e(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i10 = 0; i10 < this.f15606h; i10++) {
            View viewI = constraintLayout.i(this.f15605g[i10]);
            if (viewI != null) {
                viewI.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewI.setTranslationZ(viewI.getTranslationZ() + elevation);
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f15605g, this.f15606h);
    }

    protected void i(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f16090m1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == i.f15808F1) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f15610l = string;
                    setIds(string);
                } else if (index == i.f15817G1) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f15611m = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public abstract void j(C3242e c3242e, boolean z10);

    public void n(ConstraintLayout constraintLayout) {
        String str;
        int iG;
        if (isInEditMode()) {
            setIds(this.f15610l);
        }
        InterfaceC3246i interfaceC3246i = this.f15608j;
        if (interfaceC3246i == null) {
            return;
        }
        interfaceC3246i.b();
        for (int i10 = 0; i10 < this.f15606h; i10++) {
            int i11 = this.f15605g[i10];
            View viewI = constraintLayout.i(i11);
            if (viewI == null && (iG = g(constraintLayout, (str = (String) this.f15613o.get(Integer.valueOf(i11))))) != 0) {
                this.f15605g[i10] = iG;
                this.f15613o.put(Integer.valueOf(iG), str);
                viewI = constraintLayout.i(iG);
            }
            if (viewI != null) {
                this.f15608j.c(constraintLayout.j(viewI));
            }
        }
        this.f15608j.a(constraintLayout.f15482i);
    }

    public void o() {
        if (this.f15608j == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).f15568u0 = (C3242e) this.f15608j;
        }
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f15610l;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f15611m;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f15609k) {
            super.onMeasure(i10, i11);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    protected void setIds(String str) {
        this.f15610l = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f15606h = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i10);
            if (iIndexOf == -1) {
                a(str.substring(i10));
                return;
            } else {
                a(str.substring(i10, iIndexOf));
                i10 = iIndexOf + 1;
            }
        }
    }

    protected void setReferenceTags(String str) {
        this.f15611m = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f15606h = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i10);
            if (iIndexOf == -1) {
                c(str.substring(i10));
                return;
            } else {
                c(str.substring(i10, iIndexOf));
                i10 = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f15610l = null;
        this.f15606h = 0;
        for (int i10 : iArr) {
            b(i10);
        }
    }

    @Override // android.view.View
    public void setTag(int i10, Object obj) {
        super.setTag(i10, obj);
        if (obj == null && this.f15610l == null) {
            b(i10);
        }
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15605g = new int[32];
        this.f15609k = false;
        this.f15612n = null;
        this.f15613o = new HashMap();
        this.f15607i = context;
        i(attributeSet);
    }

    protected void f(ConstraintLayout constraintLayout) {
    }

    public void k(ConstraintLayout constraintLayout) {
    }

    public void l(ConstraintLayout constraintLayout) {
    }

    public void m(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }
}
