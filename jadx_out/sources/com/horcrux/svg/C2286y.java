package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;

/* JADX INFO: renamed from: com.horcrux.svg.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class C2286y extends B {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    SVGLength f24781l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    SVGLength f24782m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    SVGLength f24783n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    SVGLength f24784o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    Bitmap f24785p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    Canvas f24786q;

    public C2286y(ReactContext reactContext) {
        super(reactContext);
        this.f24785p = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        this.f24786q = new Canvas(this.f24785p);
    }

    @Override // com.horcrux.svg.B
    void c(Canvas canvas, Paint paint, float f10) {
        i();
        SvgView svgView = getSvgView();
        RectF rectF = new RectF();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (!(childAt instanceof G)) {
                if (childAt instanceof VirtualView) {
                    VirtualView virtualView = (VirtualView) childAt;
                    if (!"none".equals(virtualView.mDisplay)) {
                        boolean z10 = virtualView instanceof RenderableView;
                        if (z10) {
                            ((RenderableView) virtualView).mergeProperties(this);
                        }
                        int iSaveAndSetupCanvas = virtualView.saveAndSetupCanvas(canvas, this.mCTM);
                        virtualView.render(canvas, paint, this.mOpacity * f10);
                        RectF clientRect = virtualView.getClientRect();
                        if (clientRect != null) {
                            rectF.union(clientRect);
                        }
                        virtualView.restoreCanvas(canvas, iSaveAndSetupCanvas);
                        if (z10) {
                            ((RenderableView) virtualView).resetProperties();
                        }
                        if (virtualView.isResponsible()) {
                            svgView.enableTouchEvents();
                        }
                    }
                } else if (childAt instanceof SvgView) {
                    SvgView svgView2 = (SvgView) childAt;
                    svgView2.drawChildren(canvas);
                    if (svgView2.isResponsible()) {
                        svgView.enableTouchEvents();
                    }
                } else {
                    int iSave = canvas.save();
                    canvas.translate(childAt.getLeft(), childAt.getTop());
                    Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        canvas.concat(matrix);
                    }
                    childAt.draw(canvas);
                    canvas.restoreToCount(iSave);
                }
            }
        }
        setClientRect(rectF);
        h();
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(this.f24786q);
    }

    @Override // com.horcrux.svg.B, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f10) {
        float fRelativeOnWidth = (float) relativeOnWidth(this.f24781l);
        float fRelativeOnHeight = (float) relativeOnHeight(this.f24782m);
        float fRelativeOnWidth2 = (float) relativeOnWidth(this.f24783n);
        float fRelativeOnHeight2 = (float) relativeOnHeight(this.f24784o);
        canvas.translate(fRelativeOnWidth, fRelativeOnHeight);
        canvas.clipRect(0.0f, 0.0f, fRelativeOnWidth2, fRelativeOnHeight2);
        super.draw(canvas, paint, f10);
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(this.f24786q, view, j10);
    }

    @Override // com.horcrux.svg.VirtualView, android.view.View
    public void invalidate() {
        super.invalidate();
        SvgView svgView = getSvgView();
        if (svgView != null) {
            svgView.invalidate();
        }
    }

    public void n(Dynamic dynamic) {
        this.f24784o = SVGLength.b(dynamic);
        invalidate();
    }

    public void o(Dynamic dynamic) {
        this.f24783n = SVGLength.b(dynamic);
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidate();
    }

    public void p(Dynamic dynamic) {
        this.f24781l = SVGLength.b(dynamic);
        invalidate();
    }

    public void q(Dynamic dynamic) {
        this.f24782m = SVGLength.b(dynamic);
        invalidate();
    }
}
