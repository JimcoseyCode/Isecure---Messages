package com.facebook.react.uimanager.drawable;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.FilterHelper;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.uimanager.style.BorderRadiusStyle;
import com.facebook.react.uimanager.style.ComputedBorderRadius;
import com.facebook.react.uimanager.style.CornerRadii;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import y7.AbstractC3624a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u00020\u00162\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010(R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010(R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010(R\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010(R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00061"}, d2 = {"Lcom/facebook/react/uimanager/drawable/OutsetBoxShadowDrawable;", "Landroid/graphics/drawable/Drawable;", "Landroid/content/Context;", "context", PointerEventHelper.POINTER_TYPE_UNKNOWN, ViewProps.SHADOW_COLOR, PointerEventHelper.POINTER_TYPE_UNKNOWN, "offsetX", "offsetY", "blurRadius", "spread", "Lcom/facebook/react/uimanager/style/BorderRadiusStyle;", ViewProps.BORDER_RADIUS, "<init>", "(Landroid/content/Context;IFFFFLcom/facebook/react/uimanager/style/BorderRadiusStyle;)V", "Landroid/graphics/Canvas;", "canvas", "Landroid/graphics/RectF;", "shadowRect", "spreadExtent", "Lcom/facebook/react/uimanager/style/ComputedBorderRadius;", "computedBorderRadii", "Li7/B;", "drawShadowRoundRect", "(Landroid/graphics/Canvas;Landroid/graphics/RectF;FLcom/facebook/react/uimanager/style/ComputedBorderRadius;)V", "drawShadowRect", "(Landroid/graphics/Canvas;Landroid/graphics/RectF;)V", "alpha", "setAlpha", "(I)V", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getOpacity", "()I", "draw", "(Landroid/graphics/Canvas;)V", "Landroid/content/Context;", "I", "F", "Lcom/facebook/react/uimanager/style/BorderRadiusStyle;", "getBorderRadius", "()Lcom/facebook/react/uimanager/style/BorderRadiusStyle;", "setBorderRadius", "(Lcom/facebook/react/uimanager/style/BorderRadiusStyle;)V", "Landroid/graphics/Paint;", "shadowPaint", "Landroid/graphics/Paint;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OutsetBoxShadowDrawable extends Drawable {
    private final float blurRadius;
    private BorderRadiusStyle borderRadius;
    private final Context context;
    private final float offsetX;
    private final float offsetY;
    private final int shadowColor;
    private final Paint shadowPaint;
    private final float spread;

    public /* synthetic */ OutsetBoxShadowDrawable(Context context, int i10, float f10, float f11, float f12, float f13, BorderRadiusStyle borderRadiusStyle, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, i10, f10, f11, f12, f13, (i11 & 64) != 0 ? null : borderRadiusStyle);
    }

    private final void drawShadowRect(Canvas canvas, RectF shadowRect) {
        canvas.clipOutRect(getBounds());
        canvas.drawRect(shadowRect, this.shadowPaint);
    }

    private final void drawShadowRoundRect(Canvas canvas, RectF shadowRect, float spreadExtent, ComputedBorderRadius computedBorderRadii) {
        RectF rectF = new RectF(getBounds());
        rectF.inset(0.4f, 0.4f);
        Path path = new Path();
        float[] fArr = {computedBorderRadii.getTopLeft().getHorizontal(), computedBorderRadii.getTopLeft().getVertical(), computedBorderRadii.getTopRight().getHorizontal(), computedBorderRadii.getTopRight().getVertical(), computedBorderRadii.getBottomRight().getHorizontal(), computedBorderRadii.getBottomRight().getVertical(), computedBorderRadii.getBottomLeft().getHorizontal(), computedBorderRadii.getBottomLeft().getVertical()};
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, fArr, direction);
        canvas.clipOutPath(path);
        Path path2 = new Path();
        path2.addRoundRect(shadowRect, new float[]{BoxShadowBorderRadiusKt.adjustRadiusForSpread(computedBorderRadii.getTopLeft().getHorizontal(), spreadExtent), BoxShadowBorderRadiusKt.adjustRadiusForSpread(computedBorderRadii.getTopLeft().getVertical(), spreadExtent), BoxShadowBorderRadiusKt.adjustRadiusForSpread(computedBorderRadii.getTopRight().getHorizontal(), spreadExtent), BoxShadowBorderRadiusKt.adjustRadiusForSpread(computedBorderRadii.getTopRight().getVertical(), spreadExtent), BoxShadowBorderRadiusKt.adjustRadiusForSpread(computedBorderRadii.getBottomRight().getHorizontal(), spreadExtent), BoxShadowBorderRadiusKt.adjustRadiusForSpread(computedBorderRadii.getBottomRight().getVertical(), spreadExtent), BoxShadowBorderRadiusKt.adjustRadiusForSpread(computedBorderRadii.getBottomLeft().getHorizontal(), spreadExtent), BoxShadowBorderRadiusKt.adjustRadiusForSpread(computedBorderRadii.getBottomLeft().getVertical(), spreadExtent)}, direction);
        canvas.drawPath(path2, this.shadowPaint);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ComputedBorderRadius computedBorderRadiusResolve;
        AbstractC2855l.g(canvas, "canvas");
        PixelUtil pixelUtil = PixelUtil.INSTANCE;
        float fPxToDp = pixelUtil.pxToDp(getBounds().width());
        float fPxToDp2 = pixelUtil.pxToDp(getBounds().height());
        BorderRadiusStyle borderRadiusStyle = this.borderRadius;
        ComputedBorderRadius computedBorderRadius = (borderRadiusStyle == null || (computedBorderRadiusResolve = borderRadiusStyle.resolve(getLayoutDirection(), this.context, fPxToDp, fPxToDp2)) == null) ? null : new ComputedBorderRadius(new CornerRadii(pixelUtil.dpToPx(computedBorderRadiusResolve.getTopLeft().getHorizontal()), pixelUtil.dpToPx(computedBorderRadiusResolve.getTopLeft().getVertical())), new CornerRadii(pixelUtil.dpToPx(computedBorderRadiusResolve.getTopRight().getHorizontal()), pixelUtil.dpToPx(computedBorderRadiusResolve.getTopRight().getVertical())), new CornerRadii(pixelUtil.dpToPx(computedBorderRadiusResolve.getBottomLeft().getHorizontal()), pixelUtil.dpToPx(computedBorderRadiusResolve.getBottomLeft().getVertical())), new CornerRadii(pixelUtil.dpToPx(computedBorderRadiusResolve.getBottomRight().getHorizontal()), pixelUtil.dpToPx(computedBorderRadiusResolve.getBottomRight().getVertical())));
        float fDpToPx = pixelUtil.dpToPx(this.spread);
        RectF rectF = new RectF(getBounds());
        float f10 = -fDpToPx;
        rectF.inset(f10, f10);
        rectF.offset(pixelUtil.dpToPx(this.offsetX), pixelUtil.dpToPx(this.offsetY));
        int iSave = canvas.save();
        if (computedBorderRadius == null || !computedBorderRadius.hasRoundedBorders()) {
            drawShadowRect(canvas, rectF);
        } else {
            drawShadowRoundRect(canvas, rectF, fDpToPx, computedBorderRadius);
        }
        canvas.restoreToCount(iSave);
    }

    public final BorderRadiusStyle getBorderRadius() {
        return this.borderRadius;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        int alpha = this.shadowPaint.getAlpha();
        if (alpha == 255) {
            return -1;
        }
        return (1 > alpha || alpha >= 255) ? -2 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.shadowPaint.setAlpha(AbstractC3624a.c((alpha / 255.0f) * (Color.alpha(this.shadowColor) / 255.0f) * 255.0f));
        invalidateSelf();
    }

    public final void setBorderRadius(BorderRadiusStyle borderRadiusStyle) {
        this.borderRadius = borderRadiusStyle;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.shadowPaint.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public OutsetBoxShadowDrawable(Context context, int i10, float f10, float f11, float f12, float f13, BorderRadiusStyle borderRadiusStyle) {
        AbstractC2855l.g(context, "context");
        this.context = context;
        this.shadowColor = i10;
        this.offsetX = f10;
        this.offsetY = f11;
        this.blurRadius = f12;
        this.spread = f13;
        this.borderRadius = borderRadiusStyle;
        Paint paint = new Paint();
        paint.setColor(i10);
        float fSigmaToRadius$ReactAndroid_release = FilterHelper.INSTANCE.sigmaToRadius$ReactAndroid_release(f12 * 0.5f);
        if (fSigmaToRadius$ReactAndroid_release > 0.0f) {
            paint.setMaskFilter(new BlurMaskFilter(fSigmaToRadius$ReactAndroid_release, BlurMaskFilter.Blur.NORMAL));
        }
        this.shadowPaint = paint;
    }
}
