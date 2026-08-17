package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class Q extends RenderableView {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private SVGLength f24502g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private SVGLength f24503h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private SVGLength f24504i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private SVGLength f24505j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private SVGLength f24506k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private SVGLength f24507l;

    public Q(ReactContext reactContext) {
        super(reactContext);
    }

    public void c(Dynamic dynamic) {
        this.f24505j = SVGLength.b(dynamic);
        invalidate();
    }

    public void d(Dynamic dynamic) {
        this.f24506k = SVGLength.b(dynamic);
        invalidate();
    }

    public void e(Dynamic dynamic) {
        this.f24507l = SVGLength.b(dynamic);
        invalidate();
    }

    public void f(Dynamic dynamic) {
        this.f24504i = SVGLength.b(dynamic);
        invalidate();
    }

    public void g(Dynamic dynamic) {
        this.f24502g = SVGLength.b(dynamic);
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    Path getPath(Canvas canvas, Paint paint) {
        double dRelativeOnWidth;
        double dRelativeOnHeight;
        double d10;
        double d11;
        Path path = new Path();
        double dRelativeOnWidth2 = relativeOnWidth(this.f24502g);
        double dRelativeOnHeight2 = relativeOnHeight(this.f24503h);
        double dRelativeOnWidth3 = relativeOnWidth(this.f24504i);
        double dRelativeOnHeight3 = relativeOnHeight(this.f24505j);
        SVGLength sVGLength = this.f24506k;
        if (sVGLength == null && this.f24507l == null) {
            path.addRect((float) dRelativeOnWidth2, (float) dRelativeOnHeight2, (float) (dRelativeOnWidth2 + dRelativeOnWidth3), (float) (dRelativeOnHeight2 + dRelativeOnHeight3), Path.Direction.CW);
            path.close();
        } else {
            if (sVGLength == null) {
                dRelativeOnWidth = relativeOnHeight(this.f24507l);
            } else if (this.f24507l == null) {
                dRelativeOnWidth = relativeOnWidth(sVGLength);
            } else {
                dRelativeOnWidth = relativeOnWidth(sVGLength);
                dRelativeOnHeight = relativeOnHeight(this.f24507l);
                d10 = dRelativeOnWidth3 / 2.0d;
                if (dRelativeOnWidth > d10) {
                    dRelativeOnWidth = d10;
                }
                d11 = dRelativeOnHeight3 / 2.0d;
                if (dRelativeOnHeight > d11) {
                    dRelativeOnHeight = d11;
                }
                path.addRoundRect((float) dRelativeOnWidth2, (float) dRelativeOnHeight2, (float) (dRelativeOnWidth2 + dRelativeOnWidth3), (float) (dRelativeOnHeight2 + dRelativeOnHeight3), (float) dRelativeOnWidth, (float) dRelativeOnHeight, Path.Direction.CW);
            }
            dRelativeOnHeight = dRelativeOnWidth;
            d10 = dRelativeOnWidth3 / 2.0d;
            if (dRelativeOnWidth > d10) {
            }
            d11 = dRelativeOnHeight3 / 2.0d;
            if (dRelativeOnHeight > d11) {
            }
            path.addRoundRect((float) dRelativeOnWidth2, (float) dRelativeOnHeight2, (float) (dRelativeOnWidth2 + dRelativeOnWidth3), (float) (dRelativeOnHeight2 + dRelativeOnHeight3), (float) dRelativeOnWidth, (float) dRelativeOnHeight, Path.Direction.CW);
        }
        ArrayList<H> arrayList = new ArrayList<>();
        this.elements = arrayList;
        arrayList.add(new H(EnumC2268g.kCGPathElementMoveToPoint, new L[]{new L(dRelativeOnWidth2, dRelativeOnHeight2)}));
        ArrayList<H> arrayList2 = this.elements;
        EnumC2268g enumC2268g = EnumC2268g.kCGPathElementAddLineToPoint;
        double d12 = dRelativeOnWidth3 + dRelativeOnWidth2;
        arrayList2.add(new H(enumC2268g, new L[]{new L(d12, dRelativeOnHeight2)}));
        double d13 = dRelativeOnHeight2 + dRelativeOnHeight3;
        this.elements.add(new H(enumC2268g, new L[]{new L(d12, d13)}));
        this.elements.add(new H(enumC2268g, new L[]{new L(dRelativeOnWidth2, d13)}));
        this.elements.add(new H(enumC2268g, new L[]{new L(dRelativeOnWidth2, dRelativeOnHeight2)}));
        return path;
    }

    public void h(Dynamic dynamic) {
        this.f24503h = SVGLength.b(dynamic);
        invalidate();
    }
}
