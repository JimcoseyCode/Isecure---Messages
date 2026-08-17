package com.google.android.material.chip;

import Q4.k;
import R4.c;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.facebook.react.uimanager.ViewDefaults;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.google.android.material.drawable.d;
import com.google.android.material.internal.i;
import com.google.android.material.internal.l;
import com.google.android.material.internal.o;
import e5.AbstractC2425c;
import e5.e;
import f5.AbstractC2614a;
import g.AbstractC2619a;
import h5.h;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import x0.AbstractC3516d;
import y0.AbstractC3606a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class a extends h implements Drawable.Callback, i.b {

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    private static final int[] f23072Y0 = {R.attr.state_enabled};

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    private static final ShapeDrawable f23073Z0 = new ShapeDrawable(new OvalShape());

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    private final PointF f23074A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    private final Path f23075B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    private final i f23076C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    private int f23077D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    private int f23078E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    private int f23079F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    private int f23080G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    private int f23081H0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    private int f23082I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    private boolean f23083J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    private int f23084K0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    private int f23085L0;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    private ColorFilter f23086M0;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    private PorterDuffColorFilter f23087N0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private ColorStateList f23088O;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    private ColorStateList f23089O0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private ColorStateList f23090P;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    private PorterDuff.Mode f23091P0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private float f23092Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    private int[] f23093Q0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private float f23094R;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    private boolean f23095R0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private ColorStateList f23096S;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    private ColorStateList f23097S0;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private float f23098T;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    private WeakReference f23099T0;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private ColorStateList f23100U;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    private TextUtils.TruncateAt f23101U0;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private CharSequence f23102V;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    private boolean f23103V0;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private boolean f23104W;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    private int f23105W0;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private Drawable f23106X;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    private boolean f23107X0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private ColorStateList f23108Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private float f23109Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f23110a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private boolean f23111b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private Drawable f23112c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private Drawable f23113d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private ColorStateList f23114e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private float f23115f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private CharSequence f23116g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private boolean f23117h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private boolean f23118i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private Drawable f23119j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private ColorStateList f23120k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private c f23121l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private c f23122m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private float f23123n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private float f23124o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private float f23125p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private float f23126q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private float f23127r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private float f23128s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private float f23129t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private float f23130u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private final Context f23131v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private final Paint f23132w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private final Paint f23133x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private final Paint.FontMetrics f23134y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private final RectF f23135z0;

    /* JADX INFO: renamed from: com.google.android.material.chip.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface InterfaceC0226a {
        void a();
    }

    private a(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f23094R = -1.0f;
        this.f23132w0 = new Paint(1);
        this.f23134y0 = new Paint.FontMetrics();
        this.f23135z0 = new RectF();
        this.f23074A0 = new PointF();
        this.f23075B0 = new Path();
        this.f23085L0 = 255;
        this.f23091P0 = PorterDuff.Mode.SRC_IN;
        this.f23099T0 = new WeakReference(null);
        R(context);
        this.f23131v0 = context;
        i iVar = new i(this);
        this.f23076C0 = iVar;
        this.f23102V = PointerEventHelper.POINTER_TYPE_UNKNOWN;
        iVar.g().density = context.getResources().getDisplayMetrics().density;
        this.f23133x0 = null;
        int[] iArr = f23072Y0;
        setState(iArr);
        v2(iArr);
        this.f23103V0 = true;
        f23073Z0.setTint(-1);
    }

    private void A0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.f23102V != null) {
            float fV0 = this.f23123n0 + v0() + this.f23126q0;
            float fZ0 = this.f23130u0 + z0() + this.f23127r0;
            if (AbstractC3606a.f(this) == 0) {
                rectF.left = rect.left + fV0;
                rectF.right = rect.right - fZ0;
            } else {
                rectF.left = rect.left + fZ0;
                rectF.right = rect.right - fV0;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private static boolean A1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    private float B0() {
        this.f23076C0.g().getFontMetrics(this.f23134y0);
        Paint.FontMetrics fontMetrics = this.f23134y0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private static boolean B1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    private static boolean C1(e eVar) {
        return (eVar == null || eVar.j() == null || !eVar.j().isStateful()) ? false : true;
    }

    private boolean D0() {
        return this.f23118i0 && this.f23119j0 != null && this.f23117h0;
    }

    private void D1(AttributeSet attributeSet, int i10, int i11) {
        TypedArray typedArrayI = l.i(this.f23131v0, attributeSet, k.f9835y0, i10, i11, new int[0]);
        this.f23107X0 = typedArrayI.hasValue(k.f9716j1);
        l2(AbstractC2425c.a(this.f23131v0, typedArrayI, k.f9605W0));
        P1(AbstractC2425c.a(this.f23131v0, typedArrayI, k.f9501J0));
        d2(typedArrayI.getDimension(k.f9565R0, 0.0f));
        if (typedArrayI.hasValue(k.f9509K0)) {
            R1(typedArrayI.getDimension(k.f9509K0, 0.0f));
        }
        h2(AbstractC2425c.a(this.f23131v0, typedArrayI, k.f9589U0));
        j2(typedArrayI.getDimension(k.f9597V0, 0.0f));
        I2(AbstractC2425c.a(this.f23131v0, typedArrayI, k.f9708i1));
        N2(typedArrayI.getText(k.f9453D0));
        e eVarH = AbstractC2425c.h(this.f23131v0, typedArrayI, k.f9843z0);
        eVarH.o(typedArrayI.getDimension(k.f9429A0, eVarH.k()));
        O2(eVarH);
        int i12 = typedArrayI.getInt(k.f9437B0, 0);
        if (i12 == 1) {
            A2(TextUtils.TruncateAt.START);
        } else if (i12 == 2) {
            A2(TextUtils.TruncateAt.MIDDLE);
        } else if (i12 == 3) {
            A2(TextUtils.TruncateAt.END);
        }
        c2(typedArrayI.getBoolean(k.f9557Q0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            c2(typedArrayI.getBoolean(k.f9533N0, false));
        }
        V1(AbstractC2425c.e(this.f23131v0, typedArrayI, k.f9525M0));
        if (typedArrayI.hasValue(k.f9549P0)) {
            Z1(AbstractC2425c.a(this.f23131v0, typedArrayI, k.f9549P0));
        }
        X1(typedArrayI.getDimension(k.f9541O0, -1.0f));
        y2(typedArrayI.getBoolean(k.f9665d1, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            y2(typedArrayI.getBoolean(k.f9621Y0, false));
        }
        m2(AbstractC2425c.e(this.f23131v0, typedArrayI, k.f9613X0));
        w2(AbstractC2425c.a(this.f23131v0, typedArrayI, k.f9656c1));
        r2(typedArrayI.getDimension(k.f9638a1, 0.0f));
        H1(typedArrayI.getBoolean(k.f9461E0, false));
        O1(typedArrayI.getBoolean(k.f9493I0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            O1(typedArrayI.getBoolean(k.f9477G0, false));
        }
        J1(AbstractC2425c.e(this.f23131v0, typedArrayI, k.f9469F0));
        if (typedArrayI.hasValue(k.f9485H0)) {
            L1(AbstractC2425c.a(this.f23131v0, typedArrayI, k.f9485H0));
        }
        L2(c.b(this.f23131v0, typedArrayI, k.f9724k1));
        B2(c.b(this.f23131v0, typedArrayI, k.f9683f1));
        f2(typedArrayI.getDimension(k.f9581T0, 0.0f));
        F2(typedArrayI.getDimension(k.f9700h1, 0.0f));
        D2(typedArrayI.getDimension(k.f9692g1, 0.0f));
        T2(typedArrayI.getDimension(k.f9740m1, 0.0f));
        Q2(typedArrayI.getDimension(k.f9732l1, 0.0f));
        t2(typedArrayI.getDimension(k.f9647b1, 0.0f));
        o2(typedArrayI.getDimension(k.f9629Z0, 0.0f));
        T1(typedArrayI.getDimension(k.f9517L0, 0.0f));
        H2(typedArrayI.getDimensionPixelSize(k.f9445C0, ViewDefaults.NUMBER_OF_LINES));
        typedArrayI.recycle();
    }

    public static a E0(Context context, AttributeSet attributeSet, int i10, int i11) {
        a aVar = new a(context, attributeSet, i10, i11);
        aVar.D1(attributeSet, i10, i11);
        return aVar;
    }

    private void F0(Canvas canvas, Rect rect) {
        if (X2()) {
            u0(rect, this.f23135z0);
            RectF rectF = this.f23135z0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.f23119j0.setBounds(0, 0, (int) this.f23135z0.width(), (int) this.f23135z0.height());
            this.f23119j0.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    private boolean F1(int[] iArr, int[] iArr2) {
        boolean z10;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.f23088O;
        int iQ = q(colorStateList != null ? colorStateList.getColorForState(iArr, this.f23077D0) : 0);
        boolean state = true;
        if (this.f23077D0 != iQ) {
            this.f23077D0 = iQ;
            zOnStateChange = true;
        }
        ColorStateList colorStateList2 = this.f23090P;
        int iQ2 = q(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f23078E0) : 0);
        if (this.f23078E0 != iQ2) {
            this.f23078E0 = iQ2;
            zOnStateChange = true;
        }
        int i10 = X4.a.i(iQ, iQ2);
        if ((this.f23079F0 != i10) | (B() == null)) {
            this.f23079F0 = i10;
            d0(ColorStateList.valueOf(i10));
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.f23096S;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f23080G0) : 0;
        if (this.f23080G0 != colorForState) {
            this.f23080G0 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.f23097S0 == null || !AbstractC2614a.e(iArr)) ? 0 : this.f23097S0.getColorForState(iArr, this.f23081H0);
        if (this.f23081H0 != colorForState2) {
            this.f23081H0 = colorForState2;
            if (this.f23095R0) {
                zOnStateChange = true;
            }
        }
        int colorForState3 = (this.f23076C0.e() == null || this.f23076C0.e().j() == null) ? 0 : this.f23076C0.e().j().getColorForState(iArr, this.f23082I0);
        if (this.f23082I0 != colorForState3) {
            this.f23082I0 = colorForState3;
            zOnStateChange = true;
        }
        boolean z11 = w1(getState(), R.attr.state_checked) && this.f23117h0;
        if (this.f23083J0 == z11 || this.f23119j0 == null) {
            z10 = false;
        } else {
            float fV0 = v0();
            this.f23083J0 = z11;
            if (fV0 != v0()) {
                zOnStateChange = true;
                z10 = true;
            } else {
                z10 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList4 = this.f23089O0;
        int colorForState4 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f23084K0) : 0;
        if (this.f23084K0 != colorForState4) {
            this.f23084K0 = colorForState4;
            this.f23087N0 = d.k(this, this.f23089O0, this.f23091P0);
        } else {
            state = zOnStateChange;
        }
        if (B1(this.f23106X)) {
            state |= this.f23106X.setState(iArr);
        }
        if (B1(this.f23119j0)) {
            state |= this.f23119j0.setState(iArr);
        }
        if (B1(this.f23112c0)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.f23112c0.setState(iArr3);
        }
        if (B1(this.f23113d0)) {
            state |= this.f23113d0.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z10) {
            E1();
        }
        return state;
    }

    private void G0(Canvas canvas, Rect rect) {
        if (this.f23107X0) {
            return;
        }
        this.f23132w0.setColor(this.f23078E0);
        this.f23132w0.setStyle(Paint.Style.FILL);
        this.f23132w0.setColorFilter(u1());
        this.f23135z0.set(rect);
        canvas.drawRoundRect(this.f23135z0, R0(), R0(), this.f23132w0);
    }

    private void H0(Canvas canvas, Rect rect) {
        if (Y2()) {
            u0(rect, this.f23135z0);
            RectF rectF = this.f23135z0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.f23106X.setBounds(0, 0, (int) this.f23135z0.width(), (int) this.f23135z0.height());
            this.f23106X.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    private void I0(Canvas canvas, Rect rect) {
        if (this.f23098T <= 0.0f || this.f23107X0) {
            return;
        }
        this.f23132w0.setColor(this.f23080G0);
        this.f23132w0.setStyle(Paint.Style.STROKE);
        if (!this.f23107X0) {
            this.f23132w0.setColorFilter(u1());
        }
        RectF rectF = this.f23135z0;
        float f10 = rect.left;
        float f11 = this.f23098T;
        rectF.set(f10 + (f11 / 2.0f), rect.top + (f11 / 2.0f), rect.right - (f11 / 2.0f), rect.bottom - (f11 / 2.0f));
        float f12 = this.f23094R - (this.f23098T / 2.0f);
        canvas.drawRoundRect(this.f23135z0, f12, f12, this.f23132w0);
    }

    private void J0(Canvas canvas, Rect rect) {
        if (this.f23107X0) {
            return;
        }
        this.f23132w0.setColor(this.f23077D0);
        this.f23132w0.setStyle(Paint.Style.FILL);
        this.f23135z0.set(rect);
        canvas.drawRoundRect(this.f23135z0, R0(), R0(), this.f23132w0);
    }

    private void K0(Canvas canvas, Rect rect) {
        if (Z2()) {
            x0(rect, this.f23135z0);
            RectF rectF = this.f23135z0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.f23112c0.setBounds(0, 0, (int) this.f23135z0.width(), (int) this.f23135z0.height());
            this.f23113d0.setBounds(this.f23112c0.getBounds());
            this.f23113d0.jumpToCurrentState();
            this.f23113d0.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    private void L0(Canvas canvas, Rect rect) {
        this.f23132w0.setColor(this.f23081H0);
        this.f23132w0.setStyle(Paint.Style.FILL);
        this.f23135z0.set(rect);
        if (!this.f23107X0) {
            canvas.drawRoundRect(this.f23135z0, R0(), R0(), this.f23132w0);
        } else {
            l(new RectF(rect), this.f23075B0);
            super.u(canvas, this.f23132w0, this.f23075B0, x());
        }
    }

    private void M0(Canvas canvas, Rect rect) {
        Canvas canvas2;
        Paint paint = this.f23133x0;
        if (paint != null) {
            paint.setColor(AbstractC3516d.k(-16777216, 127));
            canvas.drawRect(rect, this.f23133x0);
            if (Y2() || X2()) {
                u0(rect, this.f23135z0);
                canvas.drawRect(this.f23135z0, this.f23133x0);
            }
            if (this.f23102V != null) {
                canvas2 = canvas;
                canvas2.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.f23133x0);
            } else {
                canvas2 = canvas;
            }
            if (Z2()) {
                x0(rect, this.f23135z0);
                canvas2.drawRect(this.f23135z0, this.f23133x0);
            }
            this.f23133x0.setColor(AbstractC3516d.k(-65536, 127));
            w0(rect, this.f23135z0);
            canvas2.drawRect(this.f23135z0, this.f23133x0);
            this.f23133x0.setColor(AbstractC3516d.k(-16711936, 127));
            y0(rect, this.f23135z0);
            canvas2.drawRect(this.f23135z0, this.f23133x0);
        }
    }

    private void N0(Canvas canvas, Rect rect) {
        if (this.f23102V != null) {
            Paint.Align alignC0 = C0(rect, this.f23074A0);
            A0(rect, this.f23135z0);
            if (this.f23076C0.e() != null) {
                this.f23076C0.g().drawableState = getState();
                this.f23076C0.n(this.f23131v0);
            }
            this.f23076C0.g().setTextAlign(alignC0);
            int iSave = 0;
            boolean z10 = Math.round(this.f23076C0.h(q1().toString())) > Math.round(this.f23135z0.width());
            if (z10) {
                iSave = canvas.save();
                canvas.clipRect(this.f23135z0);
            }
            CharSequence charSequenceEllipsize = this.f23102V;
            if (z10 && this.f23101U0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f23076C0.g(), this.f23135z0.width(), this.f23101U0);
            }
            CharSequence charSequence = charSequenceEllipsize;
            int length = charSequence.length();
            PointF pointF = this.f23074A0;
            canvas.drawText(charSequence, 0, length, pointF.x, pointF.y, this.f23076C0.g());
            if (z10) {
                canvas.restoreToCount(iSave);
            }
        }
    }

    private boolean X2() {
        return this.f23118i0 && this.f23119j0 != null && this.f23083J0;
    }

    private boolean Y2() {
        return this.f23104W && this.f23106X != null;
    }

    private boolean Z2() {
        return this.f23111b0 && this.f23112c0 != null;
    }

    private void a3(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    private void b3() {
        this.f23097S0 = this.f23095R0 ? AbstractC2614a.d(this.f23100U) : null;
    }

    private void c3() {
        this.f23113d0 = new RippleDrawable(AbstractC2614a.d(o1()), this.f23112c0, f23073Z0);
    }

    private float i1() {
        Drawable drawable = this.f23083J0 ? this.f23119j0 : this.f23106X;
        float fCeil = this.f23109Z;
        if (fCeil <= 0.0f && drawable != null) {
            fCeil = (float) Math.ceil(o.c(this.f23131v0, 24));
            if (drawable.getIntrinsicHeight() <= fCeil) {
                return drawable.getIntrinsicHeight();
            }
        }
        return fCeil;
    }

    private float j1() {
        Drawable drawable = this.f23083J0 ? this.f23119j0 : this.f23106X;
        float f10 = this.f23109Z;
        return (f10 > 0.0f || drawable == null) ? f10 : drawable.getIntrinsicWidth();
    }

    private void l2(ColorStateList colorStateList) {
        if (this.f23088O != colorStateList) {
            this.f23088O = colorStateList;
            onStateChange(getState());
        }
    }

    private void t0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        AbstractC3606a.m(drawable, AbstractC3606a.f(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f23112c0) {
            if (drawable.isStateful()) {
                drawable.setState(f1());
            }
            drawable.setTintList(this.f23114e0);
            return;
        }
        Drawable drawable2 = this.f23106X;
        if (drawable == drawable2 && this.f23110a0) {
            drawable2.setTintList(this.f23108Y);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    private void u0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (Y2() || X2()) {
            float f10 = this.f23123n0 + this.f23124o0;
            float fJ1 = j1();
            if (AbstractC3606a.f(this) == 0) {
                float f11 = rect.left + f10;
                rectF.left = f11;
                rectF.right = f11 + fJ1;
            } else {
                float f12 = rect.right - f10;
                rectF.right = f12;
                rectF.left = f12 - fJ1;
            }
            float fI1 = i1();
            float fExactCenterY = rect.exactCenterY() - (fI1 / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fI1;
        }
    }

    private ColorFilter u1() {
        ColorFilter colorFilter = this.f23086M0;
        return colorFilter != null ? colorFilter : this.f23087N0;
    }

    private void w0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (Z2()) {
            float f10 = this.f23130u0 + this.f23129t0 + this.f23115f0 + this.f23128s0 + this.f23127r0;
            if (AbstractC3606a.f(this) == 0) {
                rectF.right = rect.right - f10;
            } else {
                rectF.left = rect.left + f10;
            }
        }
    }

    private static boolean w1(int[] iArr, int i10) {
        if (iArr == null) {
            return false;
        }
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    private void x0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (Z2()) {
            float f10 = this.f23130u0 + this.f23129t0;
            if (AbstractC3606a.f(this) == 0) {
                float f11 = rect.right - f10;
                rectF.right = f11;
                rectF.left = f11 - this.f23115f0;
            } else {
                float f12 = rect.left + f10;
                rectF.left = f12;
                rectF.right = f12 + this.f23115f0;
            }
            float fExactCenterY = rect.exactCenterY();
            float f13 = this.f23115f0;
            float f14 = fExactCenterY - (f13 / 2.0f);
            rectF.top = f14;
            rectF.bottom = f14 + f13;
        }
    }

    private void y0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (Z2()) {
            float f10 = this.f23130u0 + this.f23129t0 + this.f23115f0 + this.f23128s0 + this.f23127r0;
            if (AbstractC3606a.f(this) == 0) {
                float f11 = rect.right;
                rectF.right = f11;
                rectF.left = f11 - f10;
            } else {
                int i10 = rect.left;
                rectF.left = i10;
                rectF.right = i10 + f10;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    public void A2(TextUtils.TruncateAt truncateAt) {
        this.f23101U0 = truncateAt;
    }

    public void B2(c cVar) {
        this.f23122m0 = cVar;
    }

    Paint.Align C0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.f23102V != null) {
            float fV0 = this.f23123n0 + v0() + this.f23126q0;
            if (AbstractC3606a.f(this) == 0) {
                pointF.x = rect.left + fV0;
            } else {
                pointF.x = rect.right - fV0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - B0();
        }
        return align;
    }

    public void C2(int i10) {
        B2(c.c(this.f23131v0, i10));
    }

    public void D2(float f10) {
        if (this.f23125p0 != f10) {
            float fV0 = v0();
            this.f23125p0 = f10;
            float fV02 = v0();
            invalidateSelf();
            if (fV0 != fV02) {
                E1();
            }
        }
    }

    protected void E1() {
        InterfaceC0226a interfaceC0226a = (InterfaceC0226a) this.f23099T0.get();
        if (interfaceC0226a != null) {
            interfaceC0226a.a();
        }
    }

    public void E2(int i10) {
        D2(this.f23131v0.getResources().getDimension(i10));
    }

    public void F2(float f10) {
        if (this.f23124o0 != f10) {
            float fV0 = v0();
            this.f23124o0 = f10;
            float fV02 = v0();
            invalidateSelf();
            if (fV0 != fV02) {
                E1();
            }
        }
    }

    boolean G1(boolean z10) {
        if (this.f23112c0 != null) {
            return v2(z10 ? new int[]{R.attr.state_pressed, R.attr.state_enabled} : f23072Y0);
        }
        return false;
    }

    public void G2(int i10) {
        F2(this.f23131v0.getResources().getDimension(i10));
    }

    public void H1(boolean z10) {
        if (this.f23117h0 != z10) {
            this.f23117h0 = z10;
            float fV0 = v0();
            if (!z10 && this.f23083J0) {
                this.f23083J0 = false;
            }
            float fV02 = v0();
            invalidateSelf();
            if (fV0 != fV02) {
                E1();
            }
        }
    }

    public void H2(int i10) {
        this.f23105W0 = i10;
    }

    public void I1(int i10) {
        H1(this.f23131v0.getResources().getBoolean(i10));
    }

    public void I2(ColorStateList colorStateList) {
        if (this.f23100U != colorStateList) {
            this.f23100U = colorStateList;
            b3();
            onStateChange(getState());
        }
    }

    public void J1(Drawable drawable) {
        if (this.f23119j0 != drawable) {
            float fV0 = v0();
            this.f23119j0 = drawable;
            float fV02 = v0();
            a3(this.f23119j0);
            t0(this.f23119j0);
            invalidateSelf();
            if (fV0 != fV02) {
                E1();
            }
        }
    }

    public void J2(int i10) {
        I2(AbstractC2619a.a(this.f23131v0, i10));
    }

    public void K1(int i10) {
        J1(AbstractC2619a.b(this.f23131v0, i10));
    }

    void K2(boolean z10) {
        this.f23103V0 = z10;
    }

    public void L1(ColorStateList colorStateList) {
        if (this.f23120k0 != colorStateList) {
            this.f23120k0 = colorStateList;
            if (D0()) {
                this.f23119j0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void L2(c cVar) {
        this.f23121l0 = cVar;
    }

    public void M1(int i10) {
        L1(AbstractC2619a.a(this.f23131v0, i10));
    }

    public void M2(int i10) {
        L2(c.c(this.f23131v0, i10));
    }

    public void N1(int i10) {
        O1(this.f23131v0.getResources().getBoolean(i10));
    }

    public void N2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = PointerEventHelper.POINTER_TYPE_UNKNOWN;
        }
        if (TextUtils.equals(this.f23102V, charSequence)) {
            return;
        }
        this.f23102V = charSequence;
        this.f23076C0.m(true);
        invalidateSelf();
        E1();
    }

    public Drawable O0() {
        return this.f23119j0;
    }

    public void O1(boolean z10) {
        if (this.f23118i0 != z10) {
            boolean zX2 = X2();
            this.f23118i0 = z10;
            boolean zX22 = X2();
            if (zX2 != zX22) {
                if (zX22) {
                    t0(this.f23119j0);
                } else {
                    a3(this.f23119j0);
                }
                invalidateSelf();
                E1();
            }
        }
    }

    public void O2(e eVar) {
        this.f23076C0.k(eVar, this.f23131v0);
    }

    public ColorStateList P0() {
        return this.f23120k0;
    }

    public void P1(ColorStateList colorStateList) {
        if (this.f23090P != colorStateList) {
            this.f23090P = colorStateList;
            onStateChange(getState());
        }
    }

    public void P2(int i10) {
        O2(new e(this.f23131v0, i10));
    }

    public ColorStateList Q0() {
        return this.f23090P;
    }

    public void Q1(int i10) {
        P1(AbstractC2619a.a(this.f23131v0, i10));
    }

    public void Q2(float f10) {
        if (this.f23127r0 != f10) {
            this.f23127r0 = f10;
            invalidateSelf();
            E1();
        }
    }

    public float R0() {
        return this.f23107X0 ? K() : this.f23094R;
    }

    public void R1(float f10) {
        if (this.f23094R != f10) {
            this.f23094R = f10;
            setShapeAppearanceModel(H().x(f10));
        }
    }

    public void R2(int i10) {
        Q2(this.f23131v0.getResources().getDimension(i10));
    }

    public float S0() {
        return this.f23130u0;
    }

    public void S1(int i10) {
        R1(this.f23131v0.getResources().getDimension(i10));
    }

    public void S2(float f10) {
        e eVarR1 = r1();
        if (eVarR1 != null) {
            eVarR1.o(f10);
            this.f23076C0.g().setTextSize(f10);
            a();
        }
    }

    public Drawable T0() {
        Drawable drawable = this.f23106X;
        if (drawable != null) {
            return AbstractC3606a.q(drawable);
        }
        return null;
    }

    public void T1(float f10) {
        if (this.f23130u0 != f10) {
            this.f23130u0 = f10;
            invalidateSelf();
            E1();
        }
    }

    public void T2(float f10) {
        if (this.f23126q0 != f10) {
            this.f23126q0 = f10;
            invalidateSelf();
            E1();
        }
    }

    public float U0() {
        return this.f23109Z;
    }

    public void U1(int i10) {
        T1(this.f23131v0.getResources().getDimension(i10));
    }

    public void U2(int i10) {
        T2(this.f23131v0.getResources().getDimension(i10));
    }

    public ColorStateList V0() {
        return this.f23108Y;
    }

    public void V1(Drawable drawable) {
        Drawable drawableT0 = T0();
        if (drawableT0 != drawable) {
            float fV0 = v0();
            this.f23106X = drawable != null ? AbstractC3606a.r(drawable).mutate() : null;
            float fV02 = v0();
            a3(drawableT0);
            if (Y2()) {
                t0(this.f23106X);
            }
            invalidateSelf();
            if (fV0 != fV02) {
                E1();
            }
        }
    }

    public void V2(boolean z10) {
        if (this.f23095R0 != z10) {
            this.f23095R0 = z10;
            b3();
            onStateChange(getState());
        }
    }

    public float W0() {
        return this.f23092Q;
    }

    public void W1(int i10) {
        V1(AbstractC2619a.b(this.f23131v0, i10));
    }

    boolean W2() {
        return this.f23103V0;
    }

    public float X0() {
        return this.f23123n0;
    }

    public void X1(float f10) {
        if (this.f23109Z != f10) {
            float fV0 = v0();
            this.f23109Z = f10;
            float fV02 = v0();
            invalidateSelf();
            if (fV0 != fV02) {
                E1();
            }
        }
    }

    public ColorStateList Y0() {
        return this.f23096S;
    }

    public void Y1(int i10) {
        X1(this.f23131v0.getResources().getDimension(i10));
    }

    public float Z0() {
        return this.f23098T;
    }

    public void Z1(ColorStateList colorStateList) {
        this.f23110a0 = true;
        if (this.f23108Y != colorStateList) {
            this.f23108Y = colorStateList;
            if (Y2()) {
                this.f23106X.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    @Override // com.google.android.material.internal.i.b
    public void a() {
        E1();
        invalidateSelf();
    }

    public Drawable a1() {
        Drawable drawable = this.f23112c0;
        if (drawable != null) {
            return AbstractC3606a.q(drawable);
        }
        return null;
    }

    public void a2(int i10) {
        Z1(AbstractC2619a.a(this.f23131v0, i10));
    }

    public CharSequence b1() {
        return this.f23116g0;
    }

    public void b2(int i10) {
        c2(this.f23131v0.getResources().getBoolean(i10));
    }

    public float c1() {
        return this.f23129t0;
    }

    public void c2(boolean z10) {
        if (this.f23104W != z10) {
            boolean zY2 = Y2();
            this.f23104W = z10;
            boolean zY22 = Y2();
            if (zY2 != zY22) {
                if (zY22) {
                    t0(this.f23106X);
                } else {
                    a3(this.f23106X);
                }
                invalidateSelf();
                E1();
            }
        }
    }

    public float d1() {
        return this.f23115f0;
    }

    public void d2(float f10) {
        if (this.f23092Q != f10) {
            this.f23092Q = f10;
            invalidateSelf();
            E1();
        }
    }

    @Override // h5.h, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Canvas canvas2;
        int iA;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i10 = this.f23085L0;
        if (i10 < 255) {
            canvas2 = canvas;
            iA = U4.a.a(canvas2, bounds.left, bounds.top, bounds.right, bounds.bottom, i10);
        } else {
            canvas2 = canvas;
            iA = 0;
        }
        J0(canvas2, bounds);
        G0(canvas2, bounds);
        if (this.f23107X0) {
            super.draw(canvas2);
        }
        I0(canvas2, bounds);
        L0(canvas2, bounds);
        H0(canvas2, bounds);
        F0(canvas2, bounds);
        if (this.f23103V0) {
            N0(canvas2, bounds);
        }
        K0(canvas2, bounds);
        M0(canvas2, bounds);
        if (this.f23085L0 < 255) {
            canvas2.restoreToCount(iA);
        }
    }

    public float e1() {
        return this.f23128s0;
    }

    public void e2(int i10) {
        d2(this.f23131v0.getResources().getDimension(i10));
    }

    public int[] f1() {
        return this.f23093Q0;
    }

    public void f2(float f10) {
        if (this.f23123n0 != f10) {
            this.f23123n0 = f10;
            invalidateSelf();
            E1();
        }
    }

    public ColorStateList g1() {
        return this.f23114e0;
    }

    public void g2(int i10) {
        f2(this.f23131v0.getResources().getDimension(i10));
    }

    @Override // h5.h, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f23085L0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f23086M0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.f23092Q;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f23123n0 + v0() + this.f23126q0 + this.f23076C0.h(q1().toString()) + this.f23127r0 + z0() + this.f23130u0), this.f23105W0);
    }

    @Override // h5.h, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // h5.h, android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Outline outline2;
        if (this.f23107X0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f23094R);
        } else {
            outline.setRoundRect(bounds, this.f23094R);
            outline2 = outline;
        }
        outline2.setAlpha(getAlpha() / 255.0f);
    }

    public void h1(RectF rectF) {
        y0(getBounds(), rectF);
    }

    public void h2(ColorStateList colorStateList) {
        if (this.f23096S != colorStateList) {
            this.f23096S = colorStateList;
            if (this.f23107X0) {
                l0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void i2(int i10) {
        h2(AbstractC2619a.a(this.f23131v0, i10));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // h5.h, android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (A1(this.f23088O) || A1(this.f23090P) || A1(this.f23096S)) {
            return true;
        }
        return (this.f23095R0 && A1(this.f23097S0)) || C1(this.f23076C0.e()) || D0() || B1(this.f23106X) || B1(this.f23119j0) || A1(this.f23089O0);
    }

    public void j2(float f10) {
        if (this.f23098T != f10) {
            this.f23098T = f10;
            this.f23132w0.setStrokeWidth(f10);
            if (this.f23107X0) {
                super.m0(f10);
            }
            invalidateSelf();
        }
    }

    public TextUtils.TruncateAt k1() {
        return this.f23101U0;
    }

    public void k2(int i10) {
        j2(this.f23131v0.getResources().getDimension(i10));
    }

    public c l1() {
        return this.f23122m0;
    }

    public float m1() {
        return this.f23125p0;
    }

    public void m2(Drawable drawable) {
        Drawable drawableA1 = a1();
        if (drawableA1 != drawable) {
            float fZ0 = z0();
            this.f23112c0 = drawable != null ? AbstractC3606a.r(drawable).mutate() : null;
            c3();
            float fZ02 = z0();
            a3(drawableA1);
            if (Z2()) {
                t0(this.f23112c0);
            }
            invalidateSelf();
            if (fZ0 != fZ02) {
                E1();
            }
        }
    }

    public float n1() {
        return this.f23124o0;
    }

    public void n2(CharSequence charSequence) {
        if (this.f23116g0 != charSequence) {
            this.f23116g0 = G0.a.c().h(charSequence);
            invalidateSelf();
        }
    }

    public ColorStateList o1() {
        return this.f23100U;
    }

    public void o2(float f10) {
        if (this.f23129t0 != f10) {
            this.f23129t0 = f10;
            invalidateSelf();
            if (Z2()) {
                E1();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i10) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i10);
        if (Y2()) {
            zOnLayoutDirectionChanged |= AbstractC3606a.m(this.f23106X, i10);
        }
        if (X2()) {
            zOnLayoutDirectionChanged |= AbstractC3606a.m(this.f23119j0, i10);
        }
        if (Z2()) {
            zOnLayoutDirectionChanged |= AbstractC3606a.m(this.f23112c0, i10);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        boolean zOnLevelChange = super.onLevelChange(i10);
        if (Y2()) {
            zOnLevelChange |= this.f23106X.setLevel(i10);
        }
        if (X2()) {
            zOnLevelChange |= this.f23119j0.setLevel(i10);
        }
        if (Z2()) {
            zOnLevelChange |= this.f23112c0.setLevel(i10);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // h5.h, android.graphics.drawable.Drawable, com.google.android.material.internal.i.b
    public boolean onStateChange(int[] iArr) {
        if (this.f23107X0) {
            super.onStateChange(iArr);
        }
        return F1(iArr, f1());
    }

    public c p1() {
        return this.f23121l0;
    }

    public void p2(int i10) {
        o2(this.f23131v0.getResources().getDimension(i10));
    }

    public CharSequence q1() {
        return this.f23102V;
    }

    public void q2(int i10) {
        m2(AbstractC2619a.b(this.f23131v0, i10));
    }

    public e r1() {
        return this.f23076C0.e();
    }

    public void r2(float f10) {
        if (this.f23115f0 != f10) {
            this.f23115f0 = f10;
            invalidateSelf();
            if (Z2()) {
                E1();
            }
        }
    }

    public float s1() {
        return this.f23127r0;
    }

    public void s2(int i10) {
        r2(this.f23131v0.getResources().getDimension(i10));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j10);
        }
    }

    @Override // h5.h, android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f23085L0 != i10) {
            this.f23085L0 = i10;
            invalidateSelf();
        }
    }

    @Override // h5.h, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f23086M0 != colorFilter) {
            this.f23086M0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // h5.h, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.f23089O0 != colorStateList) {
            this.f23089O0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // h5.h, android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f23091P0 != mode) {
            this.f23091P0 = mode;
            this.f23087N0 = d.k(this, this.f23089O0, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (Y2()) {
            visible |= this.f23106X.setVisible(z10, z11);
        }
        if (X2()) {
            visible |= this.f23119j0.setVisible(z10, z11);
        }
        if (Z2()) {
            visible |= this.f23112c0.setVisible(z10, z11);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public float t1() {
        return this.f23126q0;
    }

    public void t2(float f10) {
        if (this.f23128s0 != f10) {
            this.f23128s0 = f10;
            invalidateSelf();
            if (Z2()) {
                E1();
            }
        }
    }

    public void u2(int i10) {
        t2(this.f23131v0.getResources().getDimension(i10));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    float v0() {
        if (Y2() || X2()) {
            return this.f23124o0 + j1() + this.f23125p0;
        }
        return 0.0f;
    }

    public boolean v1() {
        return this.f23095R0;
    }

    public boolean v2(int[] iArr) {
        if (Arrays.equals(this.f23093Q0, iArr)) {
            return false;
        }
        this.f23093Q0 = iArr;
        if (Z2()) {
            return F1(getState(), iArr);
        }
        return false;
    }

    public void w2(ColorStateList colorStateList) {
        if (this.f23114e0 != colorStateList) {
            this.f23114e0 = colorStateList;
            if (Z2()) {
                this.f23112c0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public boolean x1() {
        return this.f23117h0;
    }

    public void x2(int i10) {
        w2(AbstractC2619a.a(this.f23131v0, i10));
    }

    public boolean y1() {
        return B1(this.f23112c0);
    }

    public void y2(boolean z10) {
        if (this.f23111b0 != z10) {
            boolean zZ2 = Z2();
            this.f23111b0 = z10;
            boolean zZ22 = Z2();
            if (zZ2 != zZ22) {
                if (zZ22) {
                    t0(this.f23112c0);
                } else {
                    a3(this.f23112c0);
                }
                invalidateSelf();
                E1();
            }
        }
    }

    float z0() {
        if (Z2()) {
            return this.f23128s0 + this.f23115f0 + this.f23129t0;
        }
        return 0.0f;
    }

    public boolean z1() {
        return this.f23111b0;
    }

    public void z2(InterfaceC0226a interfaceC0226a) {
        this.f23099T0 = new WeakReference(interfaceC0226a);
    }
}
