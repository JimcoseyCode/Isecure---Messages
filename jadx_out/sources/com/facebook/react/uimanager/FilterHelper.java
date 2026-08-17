package com.facebook.react.uimanager;

import android.graphics.BlendMode;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\u0014\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\u001c\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005J\u001a\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u000eH\u0002J\u001a\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005J2\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001a2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005J\u001a\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u000eJ\u001a\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005J\u0010\u0010 \u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u000eH\u0002J\u001a\u0010!\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\"\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u000eH\u0002J\u001a\u0010#\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005J\u0010\u0010$\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u000eH\u0002J\u001a\u0010%\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005J\u0010\u0010&\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u000eH\u0002J\u001a\u0010'\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005J\u0010\u0010(\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u000eH\u0002J\u001a\u0010)\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005J\u0010\u0010*\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u000eH\u0002J\u001c\u0010+\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u00132\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0002J\u0015\u0010-\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000eH\u0000¢\u0006\u0002\b.¨\u0006/"}, d2 = {"Lcom/facebook/react/uimanager/FilterHelper;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "parseFilters", "Landroid/graphics/RenderEffect;", "filters", "Lcom/facebook/react/bridge/ReadableArray;", "parseColorMatrixFilters", "Landroid/graphics/ColorMatrixColorFilter;", "isOnlyColorMatrixFilters", PointerEventHelper.POINTER_TYPE_UNKNOWN, "createBlurEffect", "sigma", PointerEventHelper.POINTER_TYPE_UNKNOWN, "chainedEffects", "createBrightnessEffect", "amount", "createBrightnessColorMatrix", "Landroid/graphics/ColorMatrix;", "createOpacityEffect", "createDropShadowEffect", "offsetX", "offsetY", "blurRadius", ViewProps.COLOR, PointerEventHelper.POINTER_TYPE_UNKNOWN, "parseAndCreateDropShadowEffect", "filterValues", "Lcom/facebook/react/bridge/ReadableMap;", "createOpacityColorMatrix", "createContrastEffect", "createContrastColorMatrix", "createGrayscaleEffect", "createGrayscaleColorMatrix", "createSepiaEffect", "createSepiaColorMatrix", "createSaturateEffect", "createSaturateColorMatrix", "createHueRotateEffect", "createHueRotateColorMatrix", "createInvertEffect", "createInvertColorMatrix", "createColorMatrixEffect", "colorMatrix", "sigmaToRadius", "sigmaToRadius$ReactAndroid_release", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FilterHelper {
    public static final FilterHelper INSTANCE = new FilterHelper();

    private FilterHelper() {
    }

    public static /* synthetic */ RenderEffect createBlurEffect$default(FilterHelper filterHelper, float f10, RenderEffect renderEffect, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            renderEffect = null;
        }
        return filterHelper.createBlurEffect(f10, renderEffect);
    }

    private final ColorMatrix createBrightnessColorMatrix(float amount) {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setScale(amount, amount, amount, 1.0f);
        return colorMatrix;
    }

    public static /* synthetic */ RenderEffect createBrightnessEffect$default(FilterHelper filterHelper, float f10, RenderEffect renderEffect, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            renderEffect = null;
        }
        return filterHelper.createBrightnessEffect(f10, renderEffect);
    }

    private final RenderEffect createColorMatrixEffect(ColorMatrix colorMatrix, RenderEffect chainedEffects) {
        if (chainedEffects == null) {
            RenderEffect renderEffectCreateColorFilterEffect = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix));
            AbstractC2855l.d(renderEffectCreateColorFilterEffect);
            return renderEffectCreateColorFilterEffect;
        }
        RenderEffect renderEffectCreateColorFilterEffect2 = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix), chainedEffects);
        AbstractC2855l.d(renderEffectCreateColorFilterEffect2);
        return renderEffectCreateColorFilterEffect2;
    }

    static /* synthetic */ RenderEffect createColorMatrixEffect$default(FilterHelper filterHelper, ColorMatrix colorMatrix, RenderEffect renderEffect, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            renderEffect = null;
        }
        return filterHelper.createColorMatrixEffect(colorMatrix, renderEffect);
    }

    private final ColorMatrix createContrastColorMatrix(float amount) {
        float f10 = 255 * ((-(amount / 2.0f)) + 0.5f);
        return new ColorMatrix(new float[]{amount, 0.0f, 0.0f, 0.0f, f10, 0.0f, amount, 0.0f, 0.0f, f10, 0.0f, 0.0f, amount, 0.0f, f10, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }

    public static /* synthetic */ RenderEffect createContrastEffect$default(FilterHelper filterHelper, float f10, RenderEffect renderEffect, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            renderEffect = null;
        }
        return filterHelper.createContrastEffect(f10, renderEffect);
    }

    public static /* synthetic */ RenderEffect createDropShadowEffect$default(FilterHelper filterHelper, float f10, float f11, float f12, int i10, RenderEffect renderEffect, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            renderEffect = null;
        }
        return filterHelper.createDropShadowEffect(f10, f11, f12, i10, renderEffect);
    }

    private final ColorMatrix createGrayscaleColorMatrix(float amount) {
        float f10 = 1 - amount;
        float f11 = 0.7152f - (f10 * 0.7152f);
        float f12 = 0.0722f - (f10 * 0.0722f);
        float f13 = 0.2126f - (f10 * 0.2126f);
        return new ColorMatrix(new float[]{(0.7874f * f10) + 0.2126f, f11, f12, 0.0f, 0.0f, f13, (0.2848f * f10) + 0.7152f, f12, 0.0f, 0.0f, f13, f11, (f10 * 0.9278f) + 0.0722f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }

    public static /* synthetic */ RenderEffect createGrayscaleEffect$default(FilterHelper filterHelper, float f10, RenderEffect renderEffect, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            renderEffect = null;
        }
        return filterHelper.createGrayscaleEffect(f10, renderEffect);
    }

    private final ColorMatrix createHueRotateColorMatrix(float amount) {
        double radians = Math.toRadians(amount);
        float fCos = (float) Math.cos(radians);
        float fSin = (float) Math.sin(radians);
        float f10 = 0.715f - (fCos * 0.715f);
        float f11 = fSin * 0.715f;
        float f12 = 0.072f - (fCos * 0.072f);
        float f13 = 0.213f - (fCos * 0.213f);
        return new ColorMatrix(new float[]{((fCos * 0.787f) + 0.213f) - (fSin * 0.213f), f10 - f11, (fSin * 0.928f) + f12, 0.0f, 0.0f, (0.143f * fSin) + f13, (0.285f * fCos) + 0.715f + (0.14f * fSin), f12 - (0.283f * fSin), 0.0f, 0.0f, f13 - (0.787f * fSin), f10 + f11, (fCos * 0.928f) + 0.072f + (fSin * 0.072f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }

    public static /* synthetic */ RenderEffect createHueRotateEffect$default(FilterHelper filterHelper, float f10, RenderEffect renderEffect, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            renderEffect = null;
        }
        return filterHelper.createHueRotateEffect(f10, renderEffect);
    }

    private final ColorMatrix createInvertColorMatrix(float amount) {
        float f10 = 1 - (2 * amount);
        float f11 = amount * 255;
        return new ColorMatrix(new float[]{f10, 0.0f, 0.0f, 0.0f, f11, 0.0f, f10, 0.0f, 0.0f, f11, 0.0f, 0.0f, f10, 0.0f, f11, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }

    public static /* synthetic */ RenderEffect createInvertEffect$default(FilterHelper filterHelper, float f10, RenderEffect renderEffect, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            renderEffect = null;
        }
        return filterHelper.createInvertEffect(f10, renderEffect);
    }

    public static /* synthetic */ RenderEffect createOpacityEffect$default(FilterHelper filterHelper, float f10, RenderEffect renderEffect, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            renderEffect = null;
        }
        return filterHelper.createOpacityEffect(f10, renderEffect);
    }

    private final ColorMatrix createSaturateColorMatrix(float amount) {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(amount);
        return colorMatrix;
    }

    public static /* synthetic */ RenderEffect createSaturateEffect$default(FilterHelper filterHelper, float f10, RenderEffect renderEffect, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            renderEffect = null;
        }
        return filterHelper.createSaturateEffect(f10, renderEffect);
    }

    private final ColorMatrix createSepiaColorMatrix(float amount) {
        float f10 = 1 - amount;
        return new ColorMatrix(new float[]{(0.607f * f10) + 0.393f, 0.769f - (f10 * 0.769f), 0.189f - (f10 * 0.189f), 0.0f, 0.0f, 0.349f - (f10 * 0.349f), (0.314f * f10) + 0.686f, 0.168f - (f10 * 0.168f), 0.0f, 0.0f, 0.272f - (f10 * 0.272f), 0.534f - (f10 * 0.534f), (f10 * 0.869f) + 0.131f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }

    public static /* synthetic */ RenderEffect createSepiaEffect$default(FilterHelper filterHelper, float f10, RenderEffect renderEffect, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            renderEffect = null;
        }
        return filterHelper.createSepiaEffect(f10, renderEffect);
    }

    public static final boolean isOnlyColorMatrixFilters(ReadableArray filters) {
        if (filters == null || filters.size() == 0) {
            return false;
        }
        int size = filters.size();
        for (int i10 = 0; i10 < size; i10++) {
            ReadableMap map = filters.getMap(i10);
            AbstractC2855l.d(map);
            String key = map.getEntryIterator().next().getKey();
            if (AbstractC2855l.b(key, "blur") || AbstractC2855l.b(key, "dropShadow")) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ RenderEffect parseAndCreateDropShadowEffect$default(FilterHelper filterHelper, ReadableMap readableMap, RenderEffect renderEffect, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            renderEffect = null;
        }
        return filterHelper.parseAndCreateDropShadowEffect(readableMap, renderEffect);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final ColorMatrixColorFilter parseColorMatrixFilters(ReadableArray filters) {
        ColorMatrix colorMatrixCreateSaturateColorMatrix;
        if (filters == null) {
            return null;
        }
        ColorMatrix colorMatrix = new ColorMatrix();
        int size = filters.size();
        for (int i10 = 0; i10 < size; i10++) {
            ReadableMap map = filters.getMap(i10);
            if (map == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Map.Entry<String, Object> next = map.getEntryIterator().next();
            String key = next.getKey();
            Object value = next.getValue();
            AbstractC2855l.e(value, "null cannot be cast to non-null type kotlin.Double");
            float fDoubleValue = (float) ((Double) value).doubleValue();
            switch (key.hashCode()) {
                case -2114203985:
                    if (!key.equals("saturate")) {
                        throw new IllegalArgumentException("Invalid color matrix filter: " + key);
                    }
                    colorMatrixCreateSaturateColorMatrix = INSTANCE.createSaturateColorMatrix(fDoubleValue);
                    colorMatrix.preConcat(colorMatrixCreateSaturateColorMatrix);
                    break;
                    break;
                case -1267206133:
                    if (!key.equals(ViewProps.OPACITY)) {
                        throw new IllegalArgumentException("Invalid color matrix filter: " + key);
                    }
                    colorMatrixCreateSaturateColorMatrix = INSTANCE.createOpacityColorMatrix(fDoubleValue);
                    colorMatrix.preConcat(colorMatrixCreateSaturateColorMatrix);
                    break;
                    break;
                case -1183703082:
                    if (!key.equals("invert")) {
                        throw new IllegalArgumentException("Invalid color matrix filter: " + key);
                    }
                    colorMatrixCreateSaturateColorMatrix = INSTANCE.createInvertColorMatrix(fDoubleValue);
                    colorMatrix.preConcat(colorMatrixCreateSaturateColorMatrix);
                    break;
                    break;
                case -905411385:
                    if (!key.equals("grayscale")) {
                        throw new IllegalArgumentException("Invalid color matrix filter: " + key);
                    }
                    colorMatrixCreateSaturateColorMatrix = INSTANCE.createGrayscaleColorMatrix(fDoubleValue);
                    colorMatrix.preConcat(colorMatrixCreateSaturateColorMatrix);
                    break;
                    break;
                case -566947070:
                    if (!key.equals("contrast")) {
                        throw new IllegalArgumentException("Invalid color matrix filter: " + key);
                    }
                    colorMatrixCreateSaturateColorMatrix = INSTANCE.createContrastColorMatrix(fDoubleValue);
                    colorMatrix.preConcat(colorMatrixCreateSaturateColorMatrix);
                    break;
                    break;
                case 109324790:
                    if (!key.equals("sepia")) {
                        throw new IllegalArgumentException("Invalid color matrix filter: " + key);
                    }
                    colorMatrixCreateSaturateColorMatrix = INSTANCE.createSepiaColorMatrix(fDoubleValue);
                    colorMatrix.preConcat(colorMatrixCreateSaturateColorMatrix);
                    break;
                    break;
                case 648162385:
                    if (!key.equals("brightness")) {
                        throw new IllegalArgumentException("Invalid color matrix filter: " + key);
                    }
                    colorMatrixCreateSaturateColorMatrix = INSTANCE.createBrightnessColorMatrix(fDoubleValue);
                    colorMatrix.preConcat(colorMatrixCreateSaturateColorMatrix);
                    break;
                    break;
                case 650888307:
                    if (!key.equals("hueRotate")) {
                        throw new IllegalArgumentException("Invalid color matrix filter: " + key);
                    }
                    colorMatrixCreateSaturateColorMatrix = INSTANCE.createHueRotateColorMatrix(fDoubleValue);
                    colorMatrix.preConcat(colorMatrixCreateSaturateColorMatrix);
                    break;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid color matrix filter: " + key);
            }
        }
        return new ColorMatrixColorFilter(colorMatrix);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final RenderEffect parseFilters(ReadableArray filters) {
        RenderEffect renderEffectCreateSaturateEffect = null;
        if (filters == null) {
            return null;
        }
        int size = filters.size();
        for (int i10 = 0; i10 < size; i10++) {
            ReadableMap map = filters.getMap(i10);
            if (map == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Map.Entry<String, Object> next = map.getEntryIterator().next();
            String key = next.getKey();
            switch (key.hashCode()) {
                case -2114203985:
                    if (!key.equals("saturate")) {
                        throw new IllegalArgumentException("Invalid filter name: " + key);
                    }
                    FilterHelper filterHelper = INSTANCE;
                    Object value = next.getValue();
                    AbstractC2855l.e(value, "null cannot be cast to non-null type kotlin.Double");
                    renderEffectCreateSaturateEffect = filterHelper.createSaturateEffect((float) ((Double) value).doubleValue(), renderEffectCreateSaturateEffect);
                    break;
                    break;
                case -1267206133:
                    if (!key.equals(ViewProps.OPACITY)) {
                        throw new IllegalArgumentException("Invalid filter name: " + key);
                    }
                    FilterHelper filterHelper2 = INSTANCE;
                    Object value2 = next.getValue();
                    AbstractC2855l.e(value2, "null cannot be cast to non-null type kotlin.Double");
                    renderEffectCreateSaturateEffect = filterHelper2.createOpacityEffect((float) ((Double) value2).doubleValue(), renderEffectCreateSaturateEffect);
                    break;
                    break;
                case -1183703082:
                    if (!key.equals("invert")) {
                        throw new IllegalArgumentException("Invalid filter name: " + key);
                    }
                    FilterHelper filterHelper3 = INSTANCE;
                    Object value3 = next.getValue();
                    AbstractC2855l.e(value3, "null cannot be cast to non-null type kotlin.Double");
                    renderEffectCreateSaturateEffect = filterHelper3.createInvertEffect((float) ((Double) value3).doubleValue(), renderEffectCreateSaturateEffect);
                    break;
                    break;
                case -905411385:
                    if (!key.equals("grayscale")) {
                        throw new IllegalArgumentException("Invalid filter name: " + key);
                    }
                    FilterHelper filterHelper4 = INSTANCE;
                    Object value4 = next.getValue();
                    AbstractC2855l.e(value4, "null cannot be cast to non-null type kotlin.Double");
                    renderEffectCreateSaturateEffect = filterHelper4.createGrayscaleEffect((float) ((Double) value4).doubleValue(), renderEffectCreateSaturateEffect);
                    break;
                    break;
                case -566947070:
                    if (!key.equals("contrast")) {
                        throw new IllegalArgumentException("Invalid filter name: " + key);
                    }
                    FilterHelper filterHelper5 = INSTANCE;
                    Object value5 = next.getValue();
                    AbstractC2855l.e(value5, "null cannot be cast to non-null type kotlin.Double");
                    renderEffectCreateSaturateEffect = filterHelper5.createContrastEffect((float) ((Double) value5).doubleValue(), renderEffectCreateSaturateEffect);
                    break;
                    break;
                case 3027047:
                    if (!key.equals("blur")) {
                        throw new IllegalArgumentException("Invalid filter name: " + key);
                    }
                    FilterHelper filterHelper6 = INSTANCE;
                    Object value6 = next.getValue();
                    AbstractC2855l.e(value6, "null cannot be cast to non-null type kotlin.Double");
                    renderEffectCreateSaturateEffect = filterHelper6.createBlurEffect((float) ((Double) value6).doubleValue(), renderEffectCreateSaturateEffect);
                    break;
                    break;
                case 109324790:
                    if (!key.equals("sepia")) {
                        throw new IllegalArgumentException("Invalid filter name: " + key);
                    }
                    FilterHelper filterHelper7 = INSTANCE;
                    Object value7 = next.getValue();
                    AbstractC2855l.e(value7, "null cannot be cast to non-null type kotlin.Double");
                    renderEffectCreateSaturateEffect = filterHelper7.createSepiaEffect((float) ((Double) value7).doubleValue(), renderEffectCreateSaturateEffect);
                    break;
                    break;
                case 648162385:
                    if (!key.equals("brightness")) {
                        throw new IllegalArgumentException("Invalid filter name: " + key);
                    }
                    FilterHelper filterHelper8 = INSTANCE;
                    Object value8 = next.getValue();
                    AbstractC2855l.e(value8, "null cannot be cast to non-null type kotlin.Double");
                    renderEffectCreateSaturateEffect = filterHelper8.createBrightnessEffect((float) ((Double) value8).doubleValue(), renderEffectCreateSaturateEffect);
                    break;
                    break;
                case 650888307:
                    if (!key.equals("hueRotate")) {
                        throw new IllegalArgumentException("Invalid filter name: " + key);
                    }
                    FilterHelper filterHelper9 = INSTANCE;
                    Object value9 = next.getValue();
                    AbstractC2855l.e(value9, "null cannot be cast to non-null type kotlin.Double");
                    renderEffectCreateSaturateEffect = filterHelper9.createHueRotateEffect((float) ((Double) value9).doubleValue(), renderEffectCreateSaturateEffect);
                    break;
                    break;
                case 906978543:
                    if (!key.equals("dropShadow")) {
                        throw new IllegalArgumentException("Invalid filter name: " + key);
                    }
                    FilterHelper filterHelper10 = INSTANCE;
                    Object value10 = next.getValue();
                    AbstractC2855l.e(value10, "null cannot be cast to non-null type com.facebook.react.bridge.ReadableMap");
                    renderEffectCreateSaturateEffect = filterHelper10.parseAndCreateDropShadowEffect((ReadableMap) value10, renderEffectCreateSaturateEffect);
                    break;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid filter name: " + key);
            }
        }
        return renderEffectCreateSaturateEffect;
    }

    public final RenderEffect createBlurEffect(float sigma, RenderEffect chainedEffects) {
        if (sigma <= 0.5d) {
            return null;
        }
        float fSigmaToRadius$ReactAndroid_release = sigmaToRadius$ReactAndroid_release(sigma);
        return chainedEffects == null ? RenderEffect.createBlurEffect(fSigmaToRadius$ReactAndroid_release, fSigmaToRadius$ReactAndroid_release, Shader.TileMode.DECAL) : RenderEffect.createBlurEffect(fSigmaToRadius$ReactAndroid_release, fSigmaToRadius$ReactAndroid_release, chainedEffects, Shader.TileMode.DECAL);
    }

    public final RenderEffect createBrightnessEffect(float amount, RenderEffect chainedEffects) {
        return createColorMatrixEffect(createBrightnessColorMatrix(amount), chainedEffects);
    }

    public final RenderEffect createContrastEffect(float amount, RenderEffect chainedEffects) {
        return createColorMatrixEffect(createContrastColorMatrix(amount), chainedEffects);
    }

    public final RenderEffect createDropShadowEffect(float offsetX, float offsetY, float blurRadius, int color, RenderEffect chainedEffects) {
        RenderEffect renderEffectCreateOffsetEffect;
        RenderEffect renderEffectCreateOffsetEffect2;
        if (chainedEffects == null) {
            renderEffectCreateOffsetEffect2 = RenderEffect.createOffsetEffect(0.0f, 0.0f);
            AbstractC2855l.f(renderEffectCreateOffsetEffect2, "createOffsetEffect(...)");
            renderEffectCreateOffsetEffect = RenderEffect.createOffsetEffect(offsetX, offsetY);
            AbstractC2855l.f(renderEffectCreateOffsetEffect, "createOffsetEffect(...)");
        } else {
            RenderEffect renderEffectCreateOffsetEffect3 = RenderEffect.createOffsetEffect(0.0f, 0.0f, chainedEffects);
            AbstractC2855l.f(renderEffectCreateOffsetEffect3, "createOffsetEffect(...)");
            renderEffectCreateOffsetEffect = RenderEffect.createOffsetEffect(offsetX, offsetY, chainedEffects);
            AbstractC2855l.f(renderEffectCreateOffsetEffect, "createOffsetEffect(...)");
            renderEffectCreateOffsetEffect2 = renderEffectCreateOffsetEffect3;
        }
        w.a();
        RenderEffect renderEffectCreateColorFilterEffect = RenderEffect.createColorFilterEffect(v.a(color, BlendMode.SRC_IN), renderEffectCreateOffsetEffect);
        AbstractC2855l.f(renderEffectCreateColorFilterEffect, "createColorFilterEffect(...)");
        RenderEffect renderEffectCreateBlurEffect = RenderEffect.createBlurEffect(blurRadius, blurRadius, renderEffectCreateColorFilterEffect, Shader.TileMode.DECAL);
        AbstractC2855l.f(renderEffectCreateBlurEffect, "createBlurEffect(...)");
        RenderEffect renderEffectCreateBlendModeEffect = RenderEffect.createBlendModeEffect(renderEffectCreateBlurEffect, renderEffectCreateOffsetEffect2, BlendMode.SRC_OVER);
        AbstractC2855l.f(renderEffectCreateBlendModeEffect, "createBlendModeEffect(...)");
        return renderEffectCreateBlendModeEffect;
    }

    public final RenderEffect createGrayscaleEffect(float amount, RenderEffect chainedEffects) {
        return createColorMatrixEffect(createGrayscaleColorMatrix(amount), chainedEffects);
    }

    public final RenderEffect createHueRotateEffect(float amount, RenderEffect chainedEffects) {
        return createColorMatrixEffect(createHueRotateColorMatrix(amount), chainedEffects);
    }

    public final RenderEffect createInvertEffect(float amount, RenderEffect chainedEffects) {
        return createColorMatrixEffect(createInvertColorMatrix(amount), chainedEffects);
    }

    public final ColorMatrix createOpacityColorMatrix(float amount) {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setScale(1.0f, 1.0f, 1.0f, amount);
        return colorMatrix;
    }

    public final RenderEffect createOpacityEffect(float amount, RenderEffect chainedEffects) {
        return createColorMatrixEffect(createOpacityColorMatrix(amount), chainedEffects);
    }

    public final RenderEffect createSaturateEffect(float amount, RenderEffect chainedEffects) {
        return createColorMatrixEffect(createSaturateColorMatrix(amount), chainedEffects);
    }

    public final RenderEffect createSepiaEffect(float amount, RenderEffect chainedEffects) {
        return createColorMatrixEffect(createSepiaColorMatrix(amount), chainedEffects);
    }

    public final RenderEffect parseAndCreateDropShadowEffect(ReadableMap filterValues, RenderEffect chainedEffects) {
        AbstractC2855l.g(filterValues, "filterValues");
        PixelUtil pixelUtil = PixelUtil.INSTANCE;
        return createDropShadowEffect(pixelUtil.dpToPx(filterValues.getDouble("offsetX")), pixelUtil.dpToPx(filterValues.getDouble("offsetY")), filterValues.hasKey("standardDeviation") ? sigmaToRadius$ReactAndroid_release((float) filterValues.getDouble("standardDeviation")) : 0.0f, filterValues.hasKey(ViewProps.COLOR) ? filterValues.getInt(ViewProps.COLOR) : -16777216, chainedEffects);
    }

    public final float sigmaToRadius$ReactAndroid_release(float sigma) {
        float pixelFromDIP = PixelUtil.toPixelFromDIP(sigma);
        if (pixelFromDIP > 0.5f) {
            return (pixelFromDIP - 0.5f) / 0.57735f;
        }
        return 0.0f;
    }
}
