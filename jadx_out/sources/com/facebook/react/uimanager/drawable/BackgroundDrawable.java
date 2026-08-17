package com.facebook.react.uimanager.drawable;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.uimanager.style.BorderInsets;
import com.facebook.react.uimanager.style.BorderRadiusStyle;
import com.facebook.react.uimanager.style.ComputedBorderRadius;
import com.facebook.react.uimanager.style.CornerRadii;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import y7.AbstractC3624a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082D¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00101\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00107\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R*\u0010:\u001a\u00020\u00152\u0006\u00109\u001a\u00020\u00158\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010\u001e\"\u0004\b=\u0010\u0018R\u0016\u0010>\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u00102R\u0018\u0010@\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006E"}, d2 = {"Lcom/facebook/react/uimanager/drawable/BackgroundDrawable;", "Landroid/graphics/drawable/Drawable;", "Landroid/content/Context;", "context", "Lcom/facebook/react/uimanager/style/BorderRadiusStyle;", ViewProps.BORDER_RADIUS, "Lcom/facebook/react/uimanager/style/BorderInsets;", "borderInsets", "<init>", "(Landroid/content/Context;Lcom/facebook/react/uimanager/style/BorderRadiusStyle;Lcom/facebook/react/uimanager/style/BorderInsets;)V", "Landroid/graphics/RectF;", "computeBorderInsets", "()Landroid/graphics/RectF;", "Li7/B;", "updatePath", "()V", "invalidateSelf", "Landroid/graphics/Rect;", "bounds", "onBoundsChange", "(Landroid/graphics/Rect;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "alpha", "setAlpha", "(I)V", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getOpacity", "()I", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "Landroid/content/Context;", "Lcom/facebook/react/uimanager/style/BorderRadiusStyle;", "getBorderRadius", "()Lcom/facebook/react/uimanager/style/BorderRadiusStyle;", "setBorderRadius", "(Lcom/facebook/react/uimanager/style/BorderRadiusStyle;)V", "Lcom/facebook/react/uimanager/style/BorderInsets;", "getBorderInsets", "()Lcom/facebook/react/uimanager/style/BorderInsets;", "setBorderInsets", "(Lcom/facebook/react/uimanager/style/BorderInsets;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "pathAdjustment", "F", "computedBorderInsets", "Landroid/graphics/RectF;", "Lcom/facebook/react/uimanager/style/ComputedBorderRadius;", "computedBorderRadius", "Lcom/facebook/react/uimanager/style/ComputedBorderRadius;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "needUpdatePath", "Z", "value", ViewProps.BACKGROUND_COLOR, "I", "getBackgroundColor", "setBackgroundColor", "backgroundRect", "Landroid/graphics/Path;", "backgroundRenderPath", "Landroid/graphics/Path;", "Landroid/graphics/Paint;", "backgroundPaint", "Landroid/graphics/Paint;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BackgroundDrawable extends Drawable {
    private int backgroundColor;
    private final Paint backgroundPaint;
    private RectF backgroundRect;
    private Path backgroundRenderPath;
    private BorderInsets borderInsets;
    private BorderRadiusStyle borderRadius;
    private RectF computedBorderInsets;
    private ComputedBorderRadius computedBorderRadius;
    private final Context context;
    private boolean needUpdatePath;
    private final float pathAdjustment;

    public /* synthetic */ BackgroundDrawable(Context context, BorderRadiusStyle borderRadiusStyle, BorderInsets borderInsets, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : borderRadiusStyle, (i10 & 4) != 0 ? null : borderInsets);
    }

    private final RectF computeBorderInsets() {
        BorderInsets borderInsets = this.borderInsets;
        RectF rectFResolve = borderInsets != null ? borderInsets.resolve(getLayoutDirection(), this.context) : null;
        return new RectF(rectFResolve != null ? PixelUtil.INSTANCE.dpToPx(rectFResolve.left) : 0.0f, rectFResolve != null ? PixelUtil.INSTANCE.dpToPx(rectFResolve.top) : 0.0f, rectFResolve != null ? PixelUtil.INSTANCE.dpToPx(rectFResolve.right) : 0.0f, rectFResolve != null ? PixelUtil.INSTANCE.dpToPx(rectFResolve.bottom) : 0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void updatePath() {
        ComputedBorderRadius computedBorderRadiusResolve;
        boolean z10;
        Path path;
        CornerRadii bottomLeft;
        CornerRadii bottomLeft2;
        CornerRadii bottomRight;
        CornerRadii bottomRight2;
        CornerRadii topRight;
        CornerRadii topRight2;
        CornerRadii topLeft;
        CornerRadii topLeft2;
        BorderRadiusStyle borderRadiusStyle;
        ComputedBorderRadius computedBorderRadius;
        if (this.needUpdatePath) {
            this.needUpdatePath = false;
            this.backgroundRect.set(getBounds());
            this.computedBorderInsets = computeBorderInsets();
            BorderRadiusStyle borderRadiusStyle2 = this.borderRadius;
            if (borderRadiusStyle2 != null) {
                int layoutDirection = getLayoutDirection();
                Context context = this.context;
                PixelUtil pixelUtil = PixelUtil.INSTANCE;
                computedBorderRadiusResolve = borderRadiusStyle2.resolve(layoutDirection, context, pixelUtil.pxToDp(getBounds().width()), pixelUtil.pxToDp(getBounds().height()));
            } else {
                computedBorderRadiusResolve = null;
            }
            this.computedBorderRadius = computedBorderRadiusResolve;
            RectF rectF = this.computedBorderInsets;
            float fDpToPx = 0.0f;
            if (AbstractC2855l.a(rectF != null ? Float.valueOf(rectF.left) : null, 0.0f)) {
                RectF rectF2 = this.computedBorderInsets;
                if (AbstractC2855l.a(rectF2 != null ? Float.valueOf(rectF2.top) : null, 0.0f)) {
                    RectF rectF3 = this.computedBorderInsets;
                    if (AbstractC2855l.a(rectF3 != null ? Float.valueOf(rectF3.right) : null, 0.0f)) {
                        RectF rectF4 = this.computedBorderInsets;
                        if (AbstractC2855l.a(rectF4 != null ? Float.valueOf(rectF4.bottom) : null, 0.0f)) {
                            z10 = false;
                        }
                    }
                }
            } else {
                z10 = true;
            }
            ComputedBorderRadius computedBorderRadius2 = this.computedBorderRadius;
            if (computedBorderRadius2 != null && computedBorderRadius2.hasRoundedBorders() && (computedBorderRadius = this.computedBorderRadius) != null && !computedBorderRadius.isUniform()) {
                Path path2 = this.backgroundRenderPath;
                if (path2 == null) {
                    path2 = new Path();
                }
                this.backgroundRenderPath = path2;
                path2.reset();
            }
            if (z10 && (borderRadiusStyle = this.borderRadius) != null && borderRadiusStyle.hasRoundedBorders()) {
                RectF rectF5 = this.backgroundRect;
                float f10 = rectF5.left;
                float f11 = this.pathAdjustment;
                rectF5.left = f10 + f11;
                rectF5.top += f11;
                rectF5.right -= f11;
                rectF5.bottom -= f11;
            }
            BorderRadiusStyle borderRadiusStyle3 = this.borderRadius;
            if (borderRadiusStyle3 == null || !borderRadiusStyle3.hasRoundedBorders()) {
                return;
            }
            ComputedBorderRadius computedBorderRadius3 = this.computedBorderRadius;
            if ((computedBorderRadius3 == null || !computedBorderRadius3.isUniform()) && (path = this.backgroundRenderPath) != null) {
                RectF rectF6 = this.backgroundRect;
                ComputedBorderRadius computedBorderRadius4 = this.computedBorderRadius;
                float fDpToPx2 = (computedBorderRadius4 == null || (topLeft2 = computedBorderRadius4.getTopLeft()) == null) ? 0.0f : PixelUtil.INSTANCE.dpToPx(topLeft2.getHorizontal());
                ComputedBorderRadius computedBorderRadius5 = this.computedBorderRadius;
                float fDpToPx3 = (computedBorderRadius5 == null || (topLeft = computedBorderRadius5.getTopLeft()) == null) ? 0.0f : PixelUtil.INSTANCE.dpToPx(topLeft.getVertical());
                ComputedBorderRadius computedBorderRadius6 = this.computedBorderRadius;
                float fDpToPx4 = (computedBorderRadius6 == null || (topRight2 = computedBorderRadius6.getTopRight()) == null) ? 0.0f : PixelUtil.INSTANCE.dpToPx(topRight2.getHorizontal());
                ComputedBorderRadius computedBorderRadius7 = this.computedBorderRadius;
                float fDpToPx5 = (computedBorderRadius7 == null || (topRight = computedBorderRadius7.getTopRight()) == null) ? 0.0f : PixelUtil.INSTANCE.dpToPx(topRight.getVertical());
                ComputedBorderRadius computedBorderRadius8 = this.computedBorderRadius;
                float fDpToPx6 = (computedBorderRadius8 == null || (bottomRight2 = computedBorderRadius8.getBottomRight()) == null) ? 0.0f : PixelUtil.INSTANCE.dpToPx(bottomRight2.getHorizontal());
                ComputedBorderRadius computedBorderRadius9 = this.computedBorderRadius;
                float fDpToPx7 = (computedBorderRadius9 == null || (bottomRight = computedBorderRadius9.getBottomRight()) == null) ? 0.0f : PixelUtil.INSTANCE.dpToPx(bottomRight.getVertical());
                ComputedBorderRadius computedBorderRadius10 = this.computedBorderRadius;
                float fDpToPx8 = (computedBorderRadius10 == null || (bottomLeft2 = computedBorderRadius10.getBottomLeft()) == null) ? 0.0f : PixelUtil.INSTANCE.dpToPx(bottomLeft2.getHorizontal());
                ComputedBorderRadius computedBorderRadius11 = this.computedBorderRadius;
                if (computedBorderRadius11 != null && (bottomLeft = computedBorderRadius11.getBottomLeft()) != null) {
                    fDpToPx = PixelUtil.INSTANCE.dpToPx(bottomLeft.getVertical());
                }
                path.addRoundRect(rectF6, new float[]{fDpToPx2, fDpToPx3, fDpToPx4, fDpToPx5, fDpToPx6, fDpToPx7, fDpToPx8, fDpToPx}, Path.Direction.CW);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        BorderRadiusStyle borderRadiusStyle;
        CornerRadii topLeft;
        CornerRadii topLeft2;
        AbstractC2855l.g(canvas, "canvas");
        updatePath();
        canvas.save();
        if (this.backgroundPaint.getAlpha() != 0) {
            ComputedBorderRadius computedBorderRadius = this.computedBorderRadius;
            if (computedBorderRadius == null || !computedBorderRadius.isUniform() || (borderRadiusStyle = this.borderRadius) == null || !borderRadiusStyle.hasRoundedBorders()) {
                BorderRadiusStyle borderRadiusStyle2 = this.borderRadius;
                if (borderRadiusStyle2 == null || !borderRadiusStyle2.hasRoundedBorders()) {
                    canvas.drawRect(this.backgroundRect, this.backgroundPaint);
                } else {
                    Path path = this.backgroundRenderPath;
                    if (path == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    canvas.drawPath(path, this.backgroundPaint);
                }
            } else {
                RectF rectF = this.backgroundRect;
                ComputedBorderRadius computedBorderRadius2 = this.computedBorderRadius;
                float fDpToPx = 0.0f;
                float fDpToPx2 = (computedBorderRadius2 == null || (topLeft2 = computedBorderRadius2.getTopLeft()) == null) ? 0.0f : PixelUtil.INSTANCE.dpToPx(topLeft2.getHorizontal());
                ComputedBorderRadius computedBorderRadius3 = this.computedBorderRadius;
                if (computedBorderRadius3 != null && (topLeft = computedBorderRadius3.getTopLeft()) != null) {
                    fDpToPx = PixelUtil.INSTANCE.dpToPx(topLeft.getVertical());
                }
                canvas.drawRoundRect(rectF, fDpToPx2, fDpToPx, this.backgroundPaint);
            }
        }
        canvas.restore();
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final BorderInsets getBorderInsets() {
        return this.borderInsets;
    }

    public final BorderRadiusStyle getBorderRadius() {
        return this.borderRadius;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        int alpha = this.backgroundPaint.getAlpha();
        if (alpha == 255) {
            return -1;
        }
        return (1 > alpha || alpha >= 255) ? -2 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.needUpdatePath = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        AbstractC2855l.g(bounds, "bounds");
        super.onBoundsChange(bounds);
        this.needUpdatePath = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.backgroundPaint.setAlpha(AbstractC3624a.c((alpha / 255.0f) * (Color.alpha(this.backgroundColor) / 255.0f) * 255.0f));
        invalidateSelf();
    }

    public final void setBackgroundColor(int i10) {
        if (this.backgroundColor != i10) {
            this.backgroundColor = i10;
            this.backgroundPaint.setColor(i10);
            invalidateSelf();
        }
    }

    public final void setBorderInsets(BorderInsets borderInsets) {
        this.borderInsets = borderInsets;
    }

    public final void setBorderRadius(BorderRadiusStyle borderRadiusStyle) {
        this.borderRadius = borderRadiusStyle;
    }

    public BackgroundDrawable(Context context, BorderRadiusStyle borderRadiusStyle, BorderInsets borderInsets) {
        AbstractC2855l.g(context, "context");
        this.context = context;
        this.borderRadius = borderRadiusStyle;
        this.borderInsets = borderInsets;
        this.pathAdjustment = 0.8f;
        this.needUpdatePath = true;
        this.backgroundRect = new RectF();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.backgroundColor);
        this.backgroundPaint = paint;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
