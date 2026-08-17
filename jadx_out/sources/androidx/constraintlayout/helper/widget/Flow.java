package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.i;
import androidx.constraintlayout.widget.k;
import r0.C3242e;
import r0.C3244g;
import r0.l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class Flow extends k {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private C3244g f15475r;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.k, androidx.constraintlayout.widget.c
    protected void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        this.f15475r = new C3244g();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f16090m1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == i.f16099n1) {
                    this.f15475r.w2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f16108o1) {
                    this.f15475r.C1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f16198y1) {
                    this.f15475r.H1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f16207z1) {
                    this.f15475r.E1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f16117p1) {
                    this.f15475r.F1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f16126q1) {
                    this.f15475r.I1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f16135r1) {
                    this.f15475r.G1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f16144s1) {
                    this.f15475r.D1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f15966Y1) {
                    this.f15475r.B2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f15886O1) {
                    this.f15475r.q2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f15958X1) {
                    this.f15475r.A2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f15835I1) {
                    this.f15475r.k2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f15902Q1) {
                    this.f15475r.s2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f15853K1) {
                    this.f15475r.m2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f15918S1) {
                    this.f15475r.u2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f15870M1) {
                    this.f15475r.o2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == i.f15826H1) {
                    this.f15475r.j2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == i.f15894P1) {
                    this.f15475r.r2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == i.f15844J1) {
                    this.f15475r.l2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == i.f15910R1) {
                    this.f15475r.t2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == i.f15942V1) {
                    this.f15475r.y2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == i.f15862L1) {
                    this.f15475r.n2(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == i.f15934U1) {
                    this.f15475r.x2(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == i.f15878N1) {
                    this.f15475r.p2(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f15950W1) {
                    this.f15475r.z2(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f15926T1) {
                    this.f15475r.v2(typedArrayObtainStyledAttributes.getInt(index, -1));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f15608j = this.f15475r;
        o();
    }

    @Override // androidx.constraintlayout.widget.c
    public void j(C3242e c3242e, boolean z10) {
        this.f15475r.n1(z10);
    }

    @Override // androidx.constraintlayout.widget.c, android.view.View
    protected void onMeasure(int i10, int i11) {
        p(this.f15475r, i10, i11);
    }

    @Override // androidx.constraintlayout.widget.k
    public void p(l lVar, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (lVar == null) {
            setMeasuredDimension(0, 0);
        } else {
            lVar.w1(mode, size, mode2, size2);
            setMeasuredDimension(lVar.r1(), lVar.q1());
        }
    }

    public void setFirstHorizontalBias(float f10) {
        this.f15475r.j2(f10);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i10) {
        this.f15475r.k2(i10);
        requestLayout();
    }

    public void setFirstVerticalBias(float f10) {
        this.f15475r.l2(f10);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i10) {
        this.f15475r.m2(i10);
        requestLayout();
    }

    public void setHorizontalAlign(int i10) {
        this.f15475r.n2(i10);
        requestLayout();
    }

    public void setHorizontalBias(float f10) {
        this.f15475r.o2(f10);
        requestLayout();
    }

    public void setHorizontalGap(int i10) {
        this.f15475r.p2(i10);
        requestLayout();
    }

    public void setHorizontalStyle(int i10) {
        this.f15475r.q2(i10);
        requestLayout();
    }

    public void setMaxElementsWrap(int i10) {
        this.f15475r.v2(i10);
        requestLayout();
    }

    public void setOrientation(int i10) {
        this.f15475r.w2(i10);
        requestLayout();
    }

    public void setPadding(int i10) {
        this.f15475r.C1(i10);
        requestLayout();
    }

    public void setPaddingBottom(int i10) {
        this.f15475r.D1(i10);
        requestLayout();
    }

    public void setPaddingLeft(int i10) {
        this.f15475r.F1(i10);
        requestLayout();
    }

    public void setPaddingRight(int i10) {
        this.f15475r.G1(i10);
        requestLayout();
    }

    public void setPaddingTop(int i10) {
        this.f15475r.I1(i10);
        requestLayout();
    }

    public void setVerticalAlign(int i10) {
        this.f15475r.x2(i10);
        requestLayout();
    }

    public void setVerticalBias(float f10) {
        this.f15475r.y2(f10);
        requestLayout();
    }

    public void setVerticalGap(int i10) {
        this.f15475r.z2(i10);
        requestLayout();
    }

    public void setVerticalStyle(int i10) {
        this.f15475r.A2(i10);
        requestLayout();
    }

    public void setWrapMode(int i10) {
        this.f15475r.B2(i10);
        requestLayout();
    }
}
