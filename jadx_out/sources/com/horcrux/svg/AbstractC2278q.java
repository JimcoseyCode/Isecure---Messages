package com.horcrux.svg;

import android.graphics.Bitmap;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.HashMap;

/* JADX INFO: renamed from: com.horcrux.svg.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC2278q extends AbstractC2266e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f24720g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final FilterRegion f24721h;

    public AbstractC2278q(ReactContext reactContext) {
        super(reactContext);
        this.f24721h = new FilterRegion();
    }

    protected static Bitmap e(HashMap map, Bitmap bitmap, String str) {
        Bitmap bitmap2 = str != null ? (Bitmap) map.get(str) : null;
        return bitmap2 != null ? bitmap2 : bitmap;
    }

    public abstract Bitmap c(HashMap map, Bitmap bitmap);

    public String d() {
        return this.f24720g;
    }

    public void f(Dynamic dynamic) {
        this.f24721h.setHeight(dynamic);
        invalidate();
    }

    public void g(String str) {
        this.f24720g = str;
        invalidate();
    }

    public void h(Dynamic dynamic) {
        this.f24721h.setWidth(dynamic);
        invalidate();
    }

    public void i(Dynamic dynamic) {
        this.f24721h.setX(dynamic);
        invalidate();
    }

    public void j(Dynamic dynamic) {
        this.f24721h.setY(dynamic);
        invalidate();
    }

    @Override // com.horcrux.svg.VirtualView
    void saveDefinition() {
    }
}
