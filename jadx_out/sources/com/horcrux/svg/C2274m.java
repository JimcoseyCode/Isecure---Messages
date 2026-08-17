package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import expo.modules.notifications.service.NotificationsService;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.horcrux.svg.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class C2274m extends AbstractC2278q {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Pattern f24687k = Pattern.compile("[0-9.-]+");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ReadableArray f24688i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f24689j;

    public C2274m(ReactContext reactContext) {
        super(reactContext);
        this.f24689j = 1.0f;
    }

    private void setupPaint(Paint paint, float f10, ReadableArray readableArray) {
        if (readableArray.getInt(0) != 0) {
            return;
        }
        if (readableArray.size() != 2) {
            paint.setARGB((int) (readableArray.size() > 4 ? readableArray.getDouble(4) * ((double) f10) * 255.0d : f10 * 255.0f), (int) (readableArray.getDouble(1) * 255.0d), (int) (readableArray.getDouble(2) * 255.0d), (int) (readableArray.getDouble(3) * 255.0d));
        } else {
            paint.setColor((Math.round((r13 >>> 24) * f10) << 24) | ((readableArray.getType(1) == ReadableType.Map ? ColorPropConverter.getColor(readableArray.getMap(1), getContext()).intValue() : readableArray.getInt(1)) & 16777215));
        }
    }

    @Override // com.horcrux.svg.AbstractC2278q
    public Bitmap c(HashMap map, Bitmap bitmap) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setFlags(129);
        paint.setStyle(Paint.Style.FILL);
        setupPaint(paint, this.f24689j, this.f24688i);
        canvas.drawPaint(paint);
        return bitmapCreateBitmap;
    }

    public void k(Dynamic dynamic) {
        if (dynamic == null || dynamic.isNull()) {
            this.f24688i = null;
            invalidate();
            return;
        }
        if (dynamic.getType().equals(ReadableType.Map)) {
            l(dynamic.asMap());
            return;
        }
        ReadableType type = dynamic.getType();
        int i10 = 0;
        if (type.equals(ReadableType.Number)) {
            this.f24688i = JavaOnlyArray.of(0, Integer.valueOf(dynamic.asInt()));
        } else if (type.equals(ReadableType.Array)) {
            this.f24688i = dynamic.asArray();
        } else {
            JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
            javaOnlyArray.pushInt(0);
            Matcher matcher = f24687k.matcher(dynamic.asString());
            while (matcher.find()) {
                double d10 = Double.parseDouble(matcher.group());
                int i11 = i10 + 1;
                if (i10 < 3) {
                    d10 /= 255.0d;
                }
                javaOnlyArray.pushDouble(d10);
                i10 = i11;
            }
            this.f24688i = javaOnlyArray;
        }
        invalidate();
    }

    public void l(ReadableMap readableMap) {
        if (readableMap == null) {
            this.f24688i = null;
            invalidate();
            return;
        }
        int i10 = readableMap.getInt(NotificationsService.EVENT_TYPE_KEY);
        if (i10 == 0) {
            ReadableType type = readableMap.getType("payload");
            if (type.equals(ReadableType.Number)) {
                this.f24688i = JavaOnlyArray.of(0, Integer.valueOf(readableMap.getInt("payload")));
            } else if (type.equals(ReadableType.Map)) {
                this.f24688i = JavaOnlyArray.of(0, readableMap.getMap("payload"));
            }
        } else if (i10 == 1) {
            this.f24688i = JavaOnlyArray.of(1, readableMap.getString("brushRef"));
        } else {
            this.f24688i = JavaOnlyArray.of(Integer.valueOf(i10));
        }
        invalidate();
    }

    public void m(float f10) {
        this.f24689j = f10;
        invalidate();
    }
}
