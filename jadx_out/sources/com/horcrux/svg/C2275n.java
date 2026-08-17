package com.horcrux.svg;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.facebook.react.bridge.ReactContext;
import java.util.HashMap;

/* JADX INFO: renamed from: com.horcrux.svg.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class C2275n extends AbstractC2278q {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    String f24693i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    float f24694j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    float f24695k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    EnumC2279r f24696l;

    public C2275n(ReactContext reactContext) {
        super(reactContext);
    }

    private Bitmap k(Context context, Bitmap bitmap) {
        float fMax = Math.max(this.f24694j, this.f24695k) * 2.0f;
        if (fMax <= 0.0f) {
            return bitmap;
        }
        float fMin = Math.min(fMax, 25.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap);
        RenderScript renderScriptCreate = RenderScript.create(context);
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap);
        Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
        scriptIntrinsicBlurCreate.setRadius(fMin);
        scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
        scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
        allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
        allocationCreateFromBitmap.destroy();
        allocationCreateFromBitmap2.destroy();
        renderScriptCreate.destroy();
        return Bitmap.createScaledBitmap(bitmapCreateBitmap, bitmap.getWidth(), bitmap.getHeight(), false);
    }

    @Override // com.horcrux.svg.AbstractC2278q
    public Bitmap c(HashMap map, Bitmap bitmap) {
        return k(getContext(), AbstractC2278q.e(map, bitmap, this.f24693i));
    }

    public void l(String str) {
        this.f24696l = EnumC2279r.j(str);
        invalidate();
    }

    public void m(String str) {
        this.f24693i = str;
        invalidate();
    }

    public void n(float f10) {
        this.f24694j = f10;
        invalidate();
    }

    public void o(float f10) {
        this.f24695k = f10;
        invalidate();
    }
}
