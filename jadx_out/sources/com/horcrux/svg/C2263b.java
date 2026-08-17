package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.horcrux.svg.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class C2263b extends RenderableView {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private SVGLength f24578g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private SVGLength f24579h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private SVGLength f24580i;

    public C2263b(ReactContext reactContext) {
        super(reactContext);
    }

    public void c(Dynamic dynamic) {
        this.f24578g = SVGLength.b(dynamic);
        invalidate();
    }

    public void d(Dynamic dynamic) {
        this.f24579h = SVGLength.b(dynamic);
        invalidate();
    }

    public void e(Dynamic dynamic) {
        this.f24580i = SVGLength.b(dynamic);
        invalidate();
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        double dRelativeOnWidth = relativeOnWidth(this.f24578g);
        double dRelativeOnHeight = relativeOnHeight(this.f24579h);
        double dRelativeOnOther = relativeOnOther(this.f24580i);
        path.addCircle((float) dRelativeOnWidth, (float) dRelativeOnHeight, (float) dRelativeOnOther, Path.Direction.CW);
        ArrayList<H> arrayList = new ArrayList<>();
        this.elements = arrayList;
        double d10 = dRelativeOnHeight - dRelativeOnOther;
        arrayList.add(new H(EnumC2268g.kCGPathElementMoveToPoint, new L[]{new L(dRelativeOnWidth, d10)}));
        ArrayList<H> arrayList2 = this.elements;
        EnumC2268g enumC2268g = EnumC2268g.kCGPathElementAddLineToPoint;
        double d11 = dRelativeOnWidth + dRelativeOnOther;
        arrayList2.add(new H(enumC2268g, new L[]{new L(dRelativeOnWidth, d10), new L(d11, dRelativeOnHeight)}));
        double d12 = dRelativeOnHeight + dRelativeOnOther;
        this.elements.add(new H(enumC2268g, new L[]{new L(d11, dRelativeOnHeight), new L(dRelativeOnWidth, d12)}));
        ArrayList<H> arrayList3 = this.elements;
        L l10 = new L(dRelativeOnWidth, d12);
        double d13 = dRelativeOnWidth - dRelativeOnOther;
        arrayList3.add(new H(enumC2268g, new L[]{l10, new L(d13, dRelativeOnHeight)}));
        this.elements.add(new H(enumC2268g, new L[]{new L(d13, dRelativeOnHeight), new L(dRelativeOnWidth, d10)}));
        return path;
    }
}
