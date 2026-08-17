package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class J extends RenderableView {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Path f24458g;

    public J(ReactContext reactContext) {
        super(reactContext);
        I.f24445a = this.mScale;
        this.f24458g = new Path();
    }

    public void c(String str) {
        this.f24458g = I.o(str);
        ArrayList<H> arrayList = I.f24450f;
        this.elements = arrayList;
        Iterator<H> it = arrayList.iterator();
        while (it.hasNext()) {
            for (L l10 : it.next().f24444b) {
                double d10 = l10.f24473a;
                float f10 = this.mScale;
                l10.f24473a = d10 * ((double) f10);
                l10.f24474b *= (double) f10;
            }
        }
        invalidate();
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        return this.f24458g;
    }
}
