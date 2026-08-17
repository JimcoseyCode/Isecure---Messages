package com.facebook.react.uimanager.style;

import android.content.Context;
import android.graphics.RectF;
import com.facebook.react.modules.i18nmanager.I18nUtil;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/facebook/react/uimanager/style/BorderInsets;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Lcom/facebook/react/uimanager/style/LogicalEdge;", "edge", PointerEventHelper.POINTER_TYPE_UNKNOWN, "width", "Li7/B;", "setBorderWidth", "(Lcom/facebook/react/uimanager/style/LogicalEdge;Ljava/lang/Float;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, ViewProps.LAYOUT_DIRECTION, "Landroid/content/Context;", "context", "Landroid/graphics/RectF;", "resolve", "(ILandroid/content/Context;)Landroid/graphics/RectF;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "edgeInsets", "[Ljava/lang/Float;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BorderInsets {
    private final Float[] edgeInsets = new Float[LogicalEdge.values().length];

    public final RectF resolve(int layoutDirection, Context context) {
        AbstractC2855l.g(context, "context");
        if (layoutDirection == 0) {
            Float f10 = this.edgeInsets[LogicalEdge.START.ordinal()];
            float fFloatValue = (f10 == null && (f10 = this.edgeInsets[LogicalEdge.LEFT.ordinal()]) == null && (f10 = this.edgeInsets[LogicalEdge.HORIZONTAL.ordinal()]) == null && (f10 = this.edgeInsets[LogicalEdge.ALL.ordinal()]) == null) ? 0.0f : f10.floatValue();
            Float f11 = this.edgeInsets[LogicalEdge.BLOCK_START.ordinal()];
            float fFloatValue2 = (f11 == null && (f11 = this.edgeInsets[LogicalEdge.TOP.ordinal()]) == null && (f11 = this.edgeInsets[LogicalEdge.BLOCK.ordinal()]) == null && (f11 = this.edgeInsets[LogicalEdge.VERTICAL.ordinal()]) == null && (f11 = this.edgeInsets[LogicalEdge.ALL.ordinal()]) == null) ? 0.0f : f11.floatValue();
            Float f12 = this.edgeInsets[LogicalEdge.END.ordinal()];
            float fFloatValue3 = (f12 == null && (f12 = this.edgeInsets[LogicalEdge.RIGHT.ordinal()]) == null && (f12 = this.edgeInsets[LogicalEdge.HORIZONTAL.ordinal()]) == null && (f12 = this.edgeInsets[LogicalEdge.ALL.ordinal()]) == null) ? 0.0f : f12.floatValue();
            Float f13 = this.edgeInsets[LogicalEdge.BLOCK_END.ordinal()];
            return new RectF(fFloatValue, fFloatValue2, fFloatValue3, (f13 == null && (f13 = this.edgeInsets[LogicalEdge.BOTTOM.ordinal()]) == null && (f13 = this.edgeInsets[LogicalEdge.BLOCK.ordinal()]) == null && (f13 = this.edgeInsets[LogicalEdge.VERTICAL.ordinal()]) == null && (f13 = this.edgeInsets[LogicalEdge.ALL.ordinal()]) == null) ? 0.0f : f13.floatValue());
        }
        if (layoutDirection != 1) {
            throw new IllegalArgumentException("Expected resolved layout direction");
        }
        if (I18nUtil.INSTANCE.getInstance().doLeftAndRightSwapInRTL(context)) {
            Float f14 = this.edgeInsets[LogicalEdge.END.ordinal()];
            float fFloatValue4 = (f14 == null && (f14 = this.edgeInsets[LogicalEdge.RIGHT.ordinal()]) == null && (f14 = this.edgeInsets[LogicalEdge.HORIZONTAL.ordinal()]) == null && (f14 = this.edgeInsets[LogicalEdge.ALL.ordinal()]) == null) ? 0.0f : f14.floatValue();
            Float f15 = this.edgeInsets[LogicalEdge.BLOCK_START.ordinal()];
            float fFloatValue5 = (f15 == null && (f15 = this.edgeInsets[LogicalEdge.TOP.ordinal()]) == null && (f15 = this.edgeInsets[LogicalEdge.BLOCK.ordinal()]) == null && (f15 = this.edgeInsets[LogicalEdge.VERTICAL.ordinal()]) == null && (f15 = this.edgeInsets[LogicalEdge.ALL.ordinal()]) == null) ? 0.0f : f15.floatValue();
            Float f16 = this.edgeInsets[LogicalEdge.START.ordinal()];
            float fFloatValue6 = (f16 == null && (f16 = this.edgeInsets[LogicalEdge.LEFT.ordinal()]) == null && (f16 = this.edgeInsets[LogicalEdge.HORIZONTAL.ordinal()]) == null && (f16 = this.edgeInsets[LogicalEdge.ALL.ordinal()]) == null) ? 0.0f : f16.floatValue();
            Float f17 = this.edgeInsets[LogicalEdge.BLOCK_END.ordinal()];
            return new RectF(fFloatValue4, fFloatValue5, fFloatValue6, (f17 == null && (f17 = this.edgeInsets[LogicalEdge.BOTTOM.ordinal()]) == null && (f17 = this.edgeInsets[LogicalEdge.BLOCK.ordinal()]) == null && (f17 = this.edgeInsets[LogicalEdge.VERTICAL.ordinal()]) == null && (f17 = this.edgeInsets[LogicalEdge.ALL.ordinal()]) == null) ? 0.0f : f17.floatValue());
        }
        Float f18 = this.edgeInsets[LogicalEdge.END.ordinal()];
        float fFloatValue7 = (f18 == null && (f18 = this.edgeInsets[LogicalEdge.LEFT.ordinal()]) == null && (f18 = this.edgeInsets[LogicalEdge.HORIZONTAL.ordinal()]) == null && (f18 = this.edgeInsets[LogicalEdge.ALL.ordinal()]) == null) ? 0.0f : f18.floatValue();
        Float f19 = this.edgeInsets[LogicalEdge.BLOCK_START.ordinal()];
        float fFloatValue8 = (f19 == null && (f19 = this.edgeInsets[LogicalEdge.TOP.ordinal()]) == null && (f19 = this.edgeInsets[LogicalEdge.BLOCK.ordinal()]) == null && (f19 = this.edgeInsets[LogicalEdge.VERTICAL.ordinal()]) == null && (f19 = this.edgeInsets[LogicalEdge.ALL.ordinal()]) == null) ? 0.0f : f19.floatValue();
        Float f20 = this.edgeInsets[LogicalEdge.START.ordinal()];
        float fFloatValue9 = (f20 == null && (f20 = this.edgeInsets[LogicalEdge.RIGHT.ordinal()]) == null && (f20 = this.edgeInsets[LogicalEdge.HORIZONTAL.ordinal()]) == null && (f20 = this.edgeInsets[LogicalEdge.ALL.ordinal()]) == null) ? 0.0f : f20.floatValue();
        Float f21 = this.edgeInsets[LogicalEdge.BLOCK_END.ordinal()];
        return new RectF(fFloatValue7, fFloatValue8, fFloatValue9, (f21 == null && (f21 = this.edgeInsets[LogicalEdge.BOTTOM.ordinal()]) == null && (f21 = this.edgeInsets[LogicalEdge.BLOCK.ordinal()]) == null && (f21 = this.edgeInsets[LogicalEdge.VERTICAL.ordinal()]) == null && (f21 = this.edgeInsets[LogicalEdge.ALL.ordinal()]) == null) ? 0.0f : f21.floatValue());
    }

    public final void setBorderWidth(LogicalEdge edge, Float width) {
        AbstractC2855l.g(edge, "edge");
        this.edgeInsets[edge.ordinal()] = width;
    }
}
