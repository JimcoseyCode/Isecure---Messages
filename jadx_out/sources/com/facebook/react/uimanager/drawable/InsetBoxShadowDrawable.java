package com.facebook.react.uimanager.drawable;

import B7.d;
import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.FilterHelper;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.uimanager.style.BorderInsets;
import com.facebook.react.uimanager.style.BorderRadiusStyle;
import com.facebook.react.uimanager.style.ComputedBorderRadius;
import com.facebook.react.uimanager.style.CornerRadii;
import j7.AbstractC2800q;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import y7.AbstractC3624a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u00020\u001c2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0004H\u0017¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010+R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010+R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010+R\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010+R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108¨\u00069"}, d2 = {"Lcom/facebook/react/uimanager/drawable/InsetBoxShadowDrawable;", "Landroid/graphics/drawable/Drawable;", "Landroid/content/Context;", "context", PointerEventHelper.POINTER_TYPE_UNKNOWN, ViewProps.SHADOW_COLOR, PointerEventHelper.POINTER_TYPE_UNKNOWN, "offsetX", "offsetY", "blurRadius", "spread", "Lcom/facebook/react/uimanager/style/BorderInsets;", "borderInsets", "Lcom/facebook/react/uimanager/style/BorderRadiusStyle;", ViewProps.BORDER_RADIUS, "<init>", "(Landroid/content/Context;IFFFFLcom/facebook/react/uimanager/style/BorderInsets;Lcom/facebook/react/uimanager/style/BorderRadiusStyle;)V", "Lcom/facebook/react/uimanager/style/ComputedBorderRadius;", "computeBorderRadii", "()Lcom/facebook/react/uimanager/style/ComputedBorderRadius;", "Landroid/graphics/RectF;", "computeBorderInsets", "()Landroid/graphics/RectF;", "radius", "borderInset", "innerRadius", "(FLjava/lang/Float;)F", "alpha", "Li7/B;", "setAlpha", "(I)V", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getOpacity", "()I", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "Landroid/content/Context;", "I", "F", "Lcom/facebook/react/uimanager/style/BorderInsets;", "getBorderInsets", "()Lcom/facebook/react/uimanager/style/BorderInsets;", "setBorderInsets", "(Lcom/facebook/react/uimanager/style/BorderInsets;)V", "Lcom/facebook/react/uimanager/style/BorderRadiusStyle;", "getBorderRadius", "()Lcom/facebook/react/uimanager/style/BorderRadiusStyle;", "setBorderRadius", "(Lcom/facebook/react/uimanager/style/BorderRadiusStyle;)V", "Landroid/graphics/Paint;", "shadowPaint", "Landroid/graphics/Paint;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InsetBoxShadowDrawable extends Drawable {
    private final float blurRadius;
    private BorderInsets borderInsets;
    private BorderRadiusStyle borderRadius;
    private final Context context;
    private final float offsetX;
    private final float offsetY;
    private final int shadowColor;
    private final Paint shadowPaint;
    private final float spread;

    public /* synthetic */ InsetBoxShadowDrawable(Context context, int i10, float f10, float f11, float f12, float f13, BorderInsets borderInsets, BorderRadiusStyle borderRadiusStyle, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, i10, f10, f11, f12, f13, (i11 & 64) != 0 ? null : borderInsets, (i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : borderRadiusStyle);
    }

    private final RectF computeBorderInsets() {
        RectF rectFResolve;
        BorderInsets borderInsets = this.borderInsets;
        if (borderInsets == null || (rectFResolve = borderInsets.resolve(getLayoutDirection(), this.context)) == null) {
            return null;
        }
        PixelUtil pixelUtil = PixelUtil.INSTANCE;
        return new RectF(pixelUtil.dpToPx(rectFResolve.left), pixelUtil.dpToPx(rectFResolve.top), pixelUtil.dpToPx(rectFResolve.right), pixelUtil.dpToPx(rectFResolve.bottom));
    }

    private final ComputedBorderRadius computeBorderRadii() {
        ComputedBorderRadius computedBorderRadiusResolve;
        BorderRadiusStyle borderRadiusStyle = this.borderRadius;
        if (borderRadiusStyle != null) {
            int layoutDirection = getLayoutDirection();
            Context context = this.context;
            PixelUtil pixelUtil = PixelUtil.INSTANCE;
            computedBorderRadiusResolve = borderRadiusStyle.resolve(layoutDirection, context, pixelUtil.pxToDp(getBounds().width()), pixelUtil.pxToDp(getBounds().height()));
        } else {
            computedBorderRadiusResolve = null;
        }
        if (computedBorderRadiusResolve == null || !computedBorderRadiusResolve.hasRoundedBorders()) {
            return null;
        }
        PixelUtil pixelUtil2 = PixelUtil.INSTANCE;
        return new ComputedBorderRadius(new CornerRadii(pixelUtil2.dpToPx(computedBorderRadiusResolve.getTopLeft().getHorizontal()), pixelUtil2.dpToPx(computedBorderRadiusResolve.getTopLeft().getVertical())), new CornerRadii(pixelUtil2.dpToPx(computedBorderRadiusResolve.getTopRight().getHorizontal()), pixelUtil2.dpToPx(computedBorderRadiusResolve.getTopRight().getVertical())), new CornerRadii(pixelUtil2.dpToPx(computedBorderRadiusResolve.getBottomLeft().getHorizontal()), pixelUtil2.dpToPx(computedBorderRadiusResolve.getBottomLeft().getVertical())), new CornerRadii(pixelUtil2.dpToPx(computedBorderRadiusResolve.getBottomRight().getHorizontal()), pixelUtil2.dpToPx(computedBorderRadiusResolve.getBottomRight().getVertical())));
    }

    private final float innerRadius(float radius, Float borderInset) {
        return d.c(radius - (borderInset != null ? borderInset.floatValue() : 0.0f), 0.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Canvas canvas2;
        AbstractC2855l.g(canvas, "canvas");
        ComputedBorderRadius computedBorderRadiusComputeBorderRadii = computeBorderRadii();
        RectF rectFComputeBorderInsets = computeBorderInsets();
        RectF rectF = new RectF(getBounds().left + (rectFComputeBorderInsets != null ? rectFComputeBorderInsets.left : 0.0f), getBounds().top + (rectFComputeBorderInsets != null ? rectFComputeBorderInsets.top : 0.0f), getBounds().right - (rectFComputeBorderInsets != null ? rectFComputeBorderInsets.right : 0.0f), getBounds().bottom - (rectFComputeBorderInsets != null ? rectFComputeBorderInsets.bottom : 0.0f));
        float[] fArr = computedBorderRadiusComputeBorderRadii != null ? new float[]{innerRadius(computedBorderRadiusComputeBorderRadii.getTopLeft().getHorizontal(), rectFComputeBorderInsets != null ? Float.valueOf(rectFComputeBorderInsets.left) : null), innerRadius(computedBorderRadiusComputeBorderRadii.getTopLeft().getVertical(), rectFComputeBorderInsets != null ? Float.valueOf(rectFComputeBorderInsets.top) : null), innerRadius(computedBorderRadiusComputeBorderRadii.getTopRight().getHorizontal(), rectFComputeBorderInsets != null ? Float.valueOf(rectFComputeBorderInsets.right) : null), innerRadius(computedBorderRadiusComputeBorderRadii.getTopRight().getVertical(), rectFComputeBorderInsets != null ? Float.valueOf(rectFComputeBorderInsets.top) : null), innerRadius(computedBorderRadiusComputeBorderRadii.getBottomRight().getHorizontal(), rectFComputeBorderInsets != null ? Float.valueOf(rectFComputeBorderInsets.right) : null), innerRadius(computedBorderRadiusComputeBorderRadii.getBottomRight().getVertical(), rectFComputeBorderInsets != null ? Float.valueOf(rectFComputeBorderInsets.bottom) : null), innerRadius(computedBorderRadiusComputeBorderRadii.getBottomLeft().getHorizontal(), rectFComputeBorderInsets != null ? Float.valueOf(rectFComputeBorderInsets.left) : null), innerRadius(computedBorderRadiusComputeBorderRadii.getBottomLeft().getVertical(), rectFComputeBorderInsets != null ? Float.valueOf(rectFComputeBorderInsets.bottom) : null)} : null;
        PixelUtil pixelUtil = PixelUtil.INSTANCE;
        float fDpToPx = pixelUtil.dpToPx(this.offsetX);
        float fDpToPx2 = pixelUtil.dpToPx(this.offsetY);
        float fDpToPx3 = pixelUtil.dpToPx(this.spread);
        RectF rectF2 = new RectF(rectF);
        if (2 * fDpToPx3 > rectF.width()) {
            rectF2.setEmpty();
        } else {
            rectF2.inset(fDpToPx3, fDpToPx3);
        }
        rectF2.offset(fDpToPx, fDpToPx2);
        float fSigmaToRadius$ReactAndroid_release = FilterHelper.INSTANCE.sigmaToRadius$ReactAndroid_release(this.blurRadius);
        RectF rectF3 = new RectF(rectF2);
        rectF3.set(rectF);
        float f10 = -fSigmaToRadius$ReactAndroid_release;
        rectF3.inset(f10, f10);
        rectF3.union(new RectF(rectF2));
        int iSave = canvas.save();
        if (fArr != null) {
            Path path = new Path();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.clipPath(path);
            ArrayList arrayList = new ArrayList(fArr.length);
            for (float f11 : fArr) {
                arrayList.add(Float.valueOf(BoxShadowBorderRadiusKt.adjustRadiusForSpread(f11, -fDpToPx3)));
            }
            canvas2 = canvas;
            canvas2.drawDoubleRoundRect(rectF3, InsetBoxShadowDrawableKt.ZERO_RADII, rectF2, AbstractC2800q.M0(arrayList), this.shadowPaint);
        } else {
            canvas2 = canvas;
            canvas2.clipRect(rectF);
            canvas2.drawDoubleRoundRect(rectF3, InsetBoxShadowDrawableKt.ZERO_RADII, rectF2, InsetBoxShadowDrawableKt.ZERO_RADII, this.shadowPaint);
        }
        canvas2.restoreToCount(iSave);
    }

    public final BorderInsets getBorderInsets() {
        return this.borderInsets;
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

    public final void setBorderInsets(BorderInsets borderInsets) {
        this.borderInsets = borderInsets;
    }

    public final void setBorderRadius(BorderRadiusStyle borderRadiusStyle) {
        this.borderRadius = borderRadiusStyle;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.shadowPaint.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public InsetBoxShadowDrawable(Context context, int i10, float f10, float f11, float f12, float f13, BorderInsets borderInsets, BorderRadiusStyle borderRadiusStyle) {
        AbstractC2855l.g(context, "context");
        this.context = context;
        this.shadowColor = i10;
        this.offsetX = f10;
        this.offsetY = f11;
        this.blurRadius = f12;
        this.spread = f13;
        this.borderInsets = borderInsets;
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
