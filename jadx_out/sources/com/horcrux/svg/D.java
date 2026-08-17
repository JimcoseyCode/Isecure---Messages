package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class D extends RenderableView {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private SVGLength f24408g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private SVGLength f24409h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private SVGLength f24410i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private SVGLength f24411j;

    public D(ReactContext reactContext) {
        super(reactContext);
    }

    public void c(Dynamic dynamic) {
        this.f24408g = SVGLength.b(dynamic);
        invalidate();
    }

    public void d(Dynamic dynamic) {
        this.f24410i = SVGLength.b(dynamic);
        invalidate();
    }

    public void e(Dynamic dynamic) {
        this.f24409h = SVGLength.b(dynamic);
        invalidate();
    }

    public void f(Dynamic dynamic) {
        this.f24411j = SVGLength.b(dynamic);
        invalidate();
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        double dRelativeOnWidth = relativeOnWidth(this.f24408g);
        double dRelativeOnHeight = relativeOnHeight(this.f24409h);
        double dRelativeOnWidth2 = relativeOnWidth(this.f24410i);
        double dRelativeOnHeight2 = relativeOnHeight(this.f24411j);
        path.moveTo((float) dRelativeOnWidth, (float) dRelativeOnHeight);
        path.lineTo((float) dRelativeOnWidth2, (float) dRelativeOnHeight2);
        ArrayList<H> arrayList = new ArrayList<>();
        this.elements = arrayList;
        arrayList.add(new H(EnumC2268g.kCGPathElementMoveToPoint, new L[]{new L(dRelativeOnWidth, dRelativeOnHeight)}));
        this.elements.add(new H(EnumC2268g.kCGPathElementAddLineToPoint, new L[]{new L(dRelativeOnWidth2, dRelativeOnHeight2)}));
        return path;
    }
}
