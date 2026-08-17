package com.th3rdwave.safeareacontext;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import i7.t;
import j7.K;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class q {
    public static final Map a(a insets) {
        AbstractC2855l.g(insets, "insets");
        return K.l(t.a(ViewProps.TOP, Float.valueOf(PixelUtil.toDIPFromPixel(insets.d()))), t.a(ViewProps.RIGHT, Float.valueOf(PixelUtil.toDIPFromPixel(insets.c()))), t.a(ViewProps.BOTTOM, Float.valueOf(PixelUtil.toDIPFromPixel(insets.a()))), t.a(ViewProps.LEFT, Float.valueOf(PixelUtil.toDIPFromPixel(insets.b()))));
    }

    public static final WritableMap b(a insets) {
        AbstractC2855l.g(insets, "insets");
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble(ViewProps.TOP, PixelUtil.toDIPFromPixel(insets.d()));
        writableMapCreateMap.putDouble(ViewProps.RIGHT, PixelUtil.toDIPFromPixel(insets.c()));
        writableMapCreateMap.putDouble(ViewProps.BOTTOM, PixelUtil.toDIPFromPixel(insets.a()));
        writableMapCreateMap.putDouble(ViewProps.LEFT, PixelUtil.toDIPFromPixel(insets.b()));
        return writableMapCreateMap;
    }

    public static final Map c(c rect) {
        AbstractC2855l.g(rect, "rect");
        return K.l(t.a("x", Float.valueOf(PixelUtil.toDIPFromPixel(rect.c()))), t.a("y", Float.valueOf(PixelUtil.toDIPFromPixel(rect.d()))), t.a("width", Float.valueOf(PixelUtil.toDIPFromPixel(rect.b()))), t.a("height", Float.valueOf(PixelUtil.toDIPFromPixel(rect.a()))));
    }

    public static final WritableMap d(c rect) {
        AbstractC2855l.g(rect, "rect");
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("x", PixelUtil.toDIPFromPixel(rect.c()));
        writableMapCreateMap.putDouble("y", PixelUtil.toDIPFromPixel(rect.d()));
        writableMapCreateMap.putDouble("width", PixelUtil.toDIPFromPixel(rect.b()));
        writableMapCreateMap.putDouble("height", PixelUtil.toDIPFromPixel(rect.a()));
        return writableMapCreateMap;
    }
}
