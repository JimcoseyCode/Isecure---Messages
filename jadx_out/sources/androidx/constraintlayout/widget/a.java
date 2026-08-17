package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import r0.C3238a;
import r0.C3242e;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class a extends c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f15584p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f15585q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private C3238a f15586r;

    public a(Context context) {
        super(context);
        super.setVisibility(8);
    }

    private void p(C3242e c3242e, int i10, boolean z10) {
        this.f15585q = i10;
        if (z10) {
            int i11 = this.f15584p;
            if (i11 == 5) {
                this.f15585q = 1;
            } else if (i11 == 6) {
                this.f15585q = 0;
            }
        } else {
            int i12 = this.f15584p;
            if (i12 == 5) {
                this.f15585q = 0;
            } else if (i12 == 6) {
                this.f15585q = 1;
            }
        }
        if (c3242e instanceof C3238a) {
            ((C3238a) c3242e).u1(this.f15585q);
        }
    }

    public boolean getAllowsGoneWidget() {
        return this.f15586r.o1();
    }

    public int getMargin() {
        return this.f15586r.q1();
    }

    public int getType() {
        return this.f15584p;
    }

    @Override // androidx.constraintlayout.widget.c
    protected void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        this.f15586r = new C3238a();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f16090m1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == i.f15781C1) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f15772B1) {
                    this.f15586r.t1(typedArrayObtainStyledAttributes.getBoolean(index, true));
                } else if (index == i.f15790D1) {
                    this.f15586r.v1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f15608j = this.f15586r;
        o();
    }

    @Override // androidx.constraintlayout.widget.c
    public void j(C3242e c3242e, boolean z10) {
        p(c3242e, this.f15584p, z10);
    }

    public void setAllowsGoneWidget(boolean z10) {
        this.f15586r.t1(z10);
    }

    public void setDpMargin(int i10) {
        this.f15586r.v1((int) ((i10 * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i10) {
        this.f15586r.v1(i10);
    }

    public void setType(int i10) {
        this.f15584p = i10;
    }
}
