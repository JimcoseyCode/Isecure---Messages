package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.horcrux.svg.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class C2269h extends RenderableView {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private SVGLength f24646g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private SVGLength f24647h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private SVGLength f24648i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private SVGLength f24649j;

    public C2269h(ReactContext reactContext) {
        super(reactContext);
    }

    public void c(Dynamic dynamic) {
        this.f24646g = SVGLength.b(dynamic);
        invalidate();
    }

    public void d(Dynamic dynamic) {
        this.f24647h = SVGLength.b(dynamic);
        invalidate();
    }

    public void e(Dynamic dynamic) {
        this.f24648i = SVGLength.b(dynamic);
        invalidate();
    }

    public void f(Dynamic dynamic) {
        this.f24649j = SVGLength.b(dynamic);
        invalidate();
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        double dRelativeOnWidth = relativeOnWidth(this.f24646g);
        double dRelativeOnHeight = relativeOnHeight(this.f24647h);
        double dRelativeOnWidth2 = relativeOnWidth(this.f24648i);
        double dRelativeOnHeight2 = relativeOnHeight(this.f24649j);
        double d10 = dRelativeOnWidth - dRelativeOnWidth2;
        double d11 = dRelativeOnHeight - dRelativeOnHeight2;
        double d12 = dRelativeOnWidth + dRelativeOnWidth2;
        double d13 = dRelativeOnHeight + dRelativeOnHeight2;
        path.addOval(new RectF((float) d10, (float) d11, (float) d12, (float) d13), Path.Direction.CW);
        ArrayList<H> arrayList = new ArrayList<>();
        this.elements = arrayList;
        arrayList.add(new H(EnumC2268g.kCGPathElementMoveToPoint, new L[]{new L(dRelativeOnWidth, d11)}));
        ArrayList<H> arrayList2 = this.elements;
        EnumC2268g enumC2268g = EnumC2268g.kCGPathElementAddLineToPoint;
        arrayList2.add(new H(enumC2268g, new L[]{new L(dRelativeOnWidth, d11), new L(d12, dRelativeOnHeight)}));
        this.elements.add(new H(enumC2268g, new L[]{new L(d12, dRelativeOnHeight), new L(dRelativeOnWidth, d13)}));
        this.elements.add(new H(enumC2268g, new L[]{new L(dRelativeOnWidth, d13), new L(d10, dRelativeOnHeight)}));
        this.elements.add(new H(enumC2268g, new L[]{new L(d10, dRelativeOnHeight), new L(dRelativeOnWidth, d11)}));
        return path;
    }
}
