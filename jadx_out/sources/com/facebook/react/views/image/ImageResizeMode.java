package com.facebook.react.views.image;

import android.graphics.Shader;
import com.facebook.drawee.drawable.q;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import d2.AbstractC2325a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0015¨\u0006\u001b"}, d2 = {"Lcom/facebook/react/views/image/ImageResizeMode;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "resizeModeValue", "Lcom/facebook/drawee/drawable/q;", "toScaleType", "(Ljava/lang/String;)Lcom/facebook/drawee/drawable/q;", "Landroid/graphics/Shader$TileMode;", "toTileMode", "(Ljava/lang/String;)Landroid/graphics/Shader$TileMode;", "defaultValue", "()Lcom/facebook/drawee/drawable/q;", "defaultTileMode", "()Landroid/graphics/Shader$TileMode;", PointerEventHelper.POINTER_TYPE_UNKNOWN, ViewProps.RESIZE_MODE, "fromInt", "(I)Ljava/lang/String;", "RESIZE_MODE_CONTAIN", "Ljava/lang/String;", "RESIZE_MODE_COVER", "RESIZE_MODE_STRETCH", "RESIZE_MODE_CENTER", "RESIZE_MODE_REPEAT", "RESIZE_MODE_NONE", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ImageResizeMode {
    public static final ImageResizeMode INSTANCE = new ImageResizeMode();
    private static final String RESIZE_MODE_CENTER = "center";
    private static final String RESIZE_MODE_CONTAIN = "contain";
    private static final String RESIZE_MODE_COVER = "cover";
    private static final String RESIZE_MODE_NONE = "none";
    private static final String RESIZE_MODE_REPEAT = "repeat";
    private static final String RESIZE_MODE_STRETCH = "stretch";

    private ImageResizeMode() {
    }

    public static final Shader.TileMode defaultTileMode() {
        return Shader.TileMode.CLAMP;
    }

    public static final q defaultValue() {
        q CENTER_CROP = q.f19815i;
        AbstractC2855l.f(CENTER_CROP, "CENTER_CROP");
        return CENTER_CROP;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final q toScaleType(String resizeModeValue) {
        if (resizeModeValue != null) {
            switch (resizeModeValue.hashCode()) {
                case -1881872635:
                    if (resizeModeValue.equals(RESIZE_MODE_STRETCH)) {
                        q FIT_XY = q.f19807a;
                        AbstractC2855l.f(FIT_XY, "FIT_XY");
                        return FIT_XY;
                    }
                    break;
                case -1364013995:
                    if (resizeModeValue.equals(RESIZE_MODE_CENTER)) {
                        q CENTER_INSIDE = q.f19814h;
                        AbstractC2855l.f(CENTER_INSIDE, "CENTER_INSIDE");
                        return CENTER_INSIDE;
                    }
                    break;
                case -934531685:
                    if (resizeModeValue.equals(RESIZE_MODE_REPEAT)) {
                        return ScaleTypeStartInside.INSTANCE.getINSTANCE();
                    }
                    break;
                case 3387192:
                    if (resizeModeValue.equals("none")) {
                        return ScaleTypeStartInside.INSTANCE.getINSTANCE();
                    }
                    break;
                case 94852023:
                    if (resizeModeValue.equals(RESIZE_MODE_COVER)) {
                        q CENTER_CROP = q.f19815i;
                        AbstractC2855l.f(CENTER_CROP, "CENTER_CROP");
                        return CENTER_CROP;
                    }
                    break;
                case 951526612:
                    if (resizeModeValue.equals(RESIZE_MODE_CONTAIN)) {
                        q FIT_CENTER = q.f19811e;
                        AbstractC2855l.f(FIT_CENTER, "FIT_CENTER");
                        return FIT_CENTER;
                    }
                    break;
            }
        }
        if (resizeModeValue != null) {
            AbstractC2325a.I(ReactConstants.TAG, "Invalid resize mode: '" + resizeModeValue + "'");
        }
        return defaultValue();
    }

    public static final Shader.TileMode toTileMode(String resizeModeValue) {
        if (AbstractC2855l.b(RESIZE_MODE_CONTAIN, resizeModeValue) || AbstractC2855l.b(RESIZE_MODE_COVER, resizeModeValue) || AbstractC2855l.b(RESIZE_MODE_STRETCH, resizeModeValue) || AbstractC2855l.b(RESIZE_MODE_CENTER, resizeModeValue) || AbstractC2855l.b("none", resizeModeValue)) {
            return Shader.TileMode.CLAMP;
        }
        if (AbstractC2855l.b(RESIZE_MODE_REPEAT, resizeModeValue)) {
            return Shader.TileMode.REPEAT;
        }
        if (resizeModeValue != null) {
            AbstractC2325a.I(ReactConstants.TAG, "Invalid resize mode: '" + resizeModeValue + "'");
        }
        return defaultTileMode();
    }

    public final /* synthetic */ String fromInt(int resizeMode) {
        return resizeMode != 0 ? resizeMode != 1 ? resizeMode != 2 ? resizeMode != 3 ? resizeMode != 4 ? "none" : RESIZE_MODE_REPEAT : RESIZE_MODE_CENTER : RESIZE_MODE_STRETCH : RESIZE_MODE_CONTAIN : RESIZE_MODE_COVER;
    }
}
