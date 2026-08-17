package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.ReactConstants;
import d2.AbstractC2325a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class p0 extends RenderableView {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f24715g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private SVGLength f24716h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private SVGLength f24717i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private SVGLength f24718j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private SVGLength f24719k;

    public p0(ReactContext reactContext) {
        super(reactContext);
    }

    public void c(Dynamic dynamic) {
        this.f24719k = SVGLength.b(dynamic);
        invalidate();
    }

    public void d(String str) {
        this.f24715g = str;
        invalidate();
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f10) {
        Canvas canvas2;
        Paint paint2;
        VirtualView definedTemplate = getSvgView().getDefinedTemplate(this.f24715g);
        if (definedTemplate == null) {
            AbstractC2325a.I(ReactConstants.TAG, "`Use` element expected a pre-defined svg template as `href` prop, template named: " + this.f24715g + " is not defined.");
            return;
        }
        definedTemplate.clearCache();
        canvas.translate((float) relativeOnWidth(this.f24716h), (float) relativeOnHeight(this.f24717i));
        boolean z10 = definedTemplate instanceof RenderableView;
        if (z10) {
            ((RenderableView) definedTemplate).mergeProperties(this);
        }
        int iSaveAndSetupCanvas = definedTemplate.saveAndSetupCanvas(canvas, this.mCTM);
        clip(canvas, paint);
        if (definedTemplate instanceof T) {
            canvas2 = canvas;
            paint2 = paint;
            ((T) definedTemplate).n(canvas2, paint2, f10, (float) relativeOnWidth(this.f24718j), (float) relativeOnHeight(this.f24719k));
        } else {
            canvas2 = canvas;
            paint2 = paint;
            definedTemplate.draw(canvas2, paint2, f10 * this.mOpacity);
        }
        RectF rectF = new RectF();
        getPath(canvas2, paint2).computeBounds(rectF, true);
        canvas2.getMatrix().mapRect(rectF);
        setClientRect(rectF);
        definedTemplate.restoreCanvas(canvas2, iSaveAndSetupCanvas);
        if (z10) {
            ((RenderableView) definedTemplate).resetProperties();
        }
    }

    public void e(Dynamic dynamic) {
        this.f24718j = SVGLength.b(dynamic);
        invalidate();
    }

    public void f(Dynamic dynamic) {
        this.f24716h = SVGLength.b(dynamic);
        invalidate();
    }

    public void g(Dynamic dynamic) {
        this.f24717i = SVGLength.b(dynamic);
        invalidate();
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        VirtualView definedTemplate = getSvgView().getDefinedTemplate(this.f24715g);
        if (definedTemplate == null) {
            AbstractC2325a.I(ReactConstants.TAG, "`Use` element expected a pre-defined svg template as `href` prop, template named: " + this.f24715g + " is not defined.");
            return null;
        }
        Path path = definedTemplate.getPath(canvas, paint);
        Path path2 = new Path();
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) relativeOnWidth(this.f24716h), (float) relativeOnHeight(this.f24717i));
        path.transform(matrix, path2);
        return path2;
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    int hitTest(float[] fArr) {
        if (!this.mInvertible) {
            return -1;
        }
        float[] fArr2 = new float[2];
        this.mInvMatrix.mapPoints(fArr2, fArr);
        VirtualView definedTemplate = getSvgView().getDefinedTemplate(this.f24715g);
        if (definedTemplate != null) {
            int iHitTest = definedTemplate.hitTest(fArr2);
            if (iHitTest != -1) {
                return (definedTemplate.isResponsible() || iHitTest != definedTemplate.getId()) ? iHitTest : getId();
            }
            return -1;
        }
        AbstractC2325a.I(ReactConstants.TAG, "`Use` element expected a pre-defined svg template as `href` prop, template named: " + this.f24715g + " is not defined.");
        return -1;
    }
}
