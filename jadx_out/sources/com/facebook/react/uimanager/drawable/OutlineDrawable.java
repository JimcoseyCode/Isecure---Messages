package com.facebook.react.uimanager.drawable;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.uimanager.style.BorderRadiusStyle;
import com.facebook.react.uimanager.style.ComputedBorderRadius;
import com.facebook.react.uimanager.style.CornerRadii;
import com.facebook.react.uimanager.style.OutlineStyle;
import i7.C2750m;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import y7.AbstractC3624a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010#\u001a\u00020\u000f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0006H\u0017¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b'\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010(R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b.\u0010/R*\u0010\t\u001a\u00020\b2\u0006\u00100\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010/\u001a\u0004\b1\u00102\"\u0004\b3\u00104R*\u0010\u000b\u001a\u00020\n2\u0006\u00100\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R*\u0010\u0007\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010:\u001a\u0004\b;\u0010&\"\u0004\b<\u0010 R*\u0010\f\u001a\u00020\b2\u0006\u00100\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010/\u001a\u0004\b=\u00102\"\u0004\b>\u00104R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010C\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010F\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006K"}, d2 = {"Lcom/facebook/react/uimanager/drawable/OutlineDrawable;", "Landroid/graphics/drawable/Drawable;", "Landroid/content/Context;", "context", "Lcom/facebook/react/uimanager/style/BorderRadiusStyle;", ViewProps.BORDER_RADIUS, PointerEventHelper.POINTER_TYPE_UNKNOWN, ViewProps.OUTLINE_COLOR, PointerEventHelper.POINTER_TYPE_UNKNOWN, ViewProps.OUTLINE_OFFSET, "Lcom/facebook/react/uimanager/style/OutlineStyle;", ViewProps.OUTLINE_STYLE, ViewProps.OUTLINE_WIDTH, "<init>", "(Landroid/content/Context;Lcom/facebook/react/uimanager/style/BorderRadiusStyle;IFLcom/facebook/react/uimanager/style/OutlineStyle;F)V", "Li7/B;", "updateOutlineRect", "()V", "style", "Landroid/graphics/PathEffect;", "getPathEffect", "(Lcom/facebook/react/uimanager/style/OutlineStyle;F)Landroid/graphics/PathEffect;", "radius", "calculateRadius", "(FFF)F", "Landroid/graphics/Canvas;", "canvas", "drawRectangularOutline", "(Landroid/graphics/Canvas;)V", "drawRoundedOutline", "alpha", "setAlpha", "(I)V", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getOpacity", "()I", "draw", "Landroid/content/Context;", "Lcom/facebook/react/uimanager/style/BorderRadiusStyle;", "getBorderRadius", "()Lcom/facebook/react/uimanager/style/BorderRadiusStyle;", "setBorderRadius", "(Lcom/facebook/react/uimanager/style/BorderRadiusStyle;)V", "gapBetweenPaths", "F", "value", "getOutlineOffset", "()F", "setOutlineOffset", "(F)V", "Lcom/facebook/react/uimanager/style/OutlineStyle;", "getOutlineStyle", "()Lcom/facebook/react/uimanager/style/OutlineStyle;", "setOutlineStyle", "(Lcom/facebook/react/uimanager/style/OutlineStyle;)V", "I", "getOutlineColor", "setOutlineColor", "getOutlineWidth", "setOutlineWidth", "Landroid/graphics/Paint;", "outlinePaint", "Landroid/graphics/Paint;", "Lcom/facebook/react/uimanager/style/ComputedBorderRadius;", "computedBorderRadius", "Lcom/facebook/react/uimanager/style/ComputedBorderRadius;", "Landroid/graphics/RectF;", "tempRectForOutline", "Landroid/graphics/RectF;", "Landroid/graphics/Path;", "pathForOutline", "Landroid/graphics/Path;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OutlineDrawable extends Drawable {
    private BorderRadiusStyle borderRadius;
    private ComputedBorderRadius computedBorderRadius;
    private final Context context;
    private final float gapBetweenPaths;
    private int outlineColor;
    private float outlineOffset;
    private final Paint outlinePaint;
    private OutlineStyle outlineStyle;
    private float outlineWidth;
    private final Path pathForOutline;
    private RectF tempRectForOutline;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OutlineStyle.values().length];
            try {
                iArr[OutlineStyle.SOLID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OutlineStyle.DASHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OutlineStyle.DOTTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ OutlineDrawable(Context context, BorderRadiusStyle borderRadiusStyle, int i10, float f10, OutlineStyle outlineStyle, float f11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : borderRadiusStyle, i10, f10, outlineStyle, f11);
    }

    private final float calculateRadius(float radius, float outlineWidth, float outlineOffset) {
        if (radius == 0.0f) {
            return 0.0f;
        }
        return radius + (outlineWidth * 0.5f) + outlineOffset;
    }

    private final void drawRectangularOutline(Canvas canvas) {
        this.pathForOutline.addRect(this.tempRectForOutline, Path.Direction.CW);
        canvas.drawPath(this.pathForOutline, this.outlinePaint);
    }

    private final void drawRoundedOutline(Canvas canvas) {
        CornerRadii cornerRadii;
        CornerRadii cornerRadii2;
        CornerRadii cornerRadii3;
        CornerRadii cornerRadii4;
        CornerRadii bottomRight;
        CornerRadii bottomLeft;
        CornerRadii topRight;
        CornerRadii topLeft;
        ComputedBorderRadius computedBorderRadius = this.computedBorderRadius;
        if (computedBorderRadius == null || (topLeft = computedBorderRadius.getTopLeft()) == null || (cornerRadii = topLeft.toPixelFromDIP()) == null) {
            cornerRadii = new CornerRadii(0.0f, 0.0f);
        }
        ComputedBorderRadius computedBorderRadius2 = this.computedBorderRadius;
        if (computedBorderRadius2 == null || (topRight = computedBorderRadius2.getTopRight()) == null || (cornerRadii2 = topRight.toPixelFromDIP()) == null) {
            cornerRadii2 = new CornerRadii(0.0f, 0.0f);
        }
        ComputedBorderRadius computedBorderRadius3 = this.computedBorderRadius;
        if (computedBorderRadius3 == null || (bottomLeft = computedBorderRadius3.getBottomLeft()) == null || (cornerRadii3 = bottomLeft.toPixelFromDIP()) == null) {
            cornerRadii3 = new CornerRadii(0.0f, 0.0f);
        }
        ComputedBorderRadius computedBorderRadius4 = this.computedBorderRadius;
        if (computedBorderRadius4 == null || (bottomRight = computedBorderRadius4.getBottomRight()) == null || (cornerRadii4 = bottomRight.toPixelFromDIP()) == null) {
            cornerRadii4 = new CornerRadii(0.0f, 0.0f);
        }
        this.pathForOutline.addRoundRect(this.tempRectForOutline, new float[]{calculateRadius(cornerRadii.getHorizontal(), this.outlineWidth, this.outlineOffset), calculateRadius(cornerRadii.getVertical(), this.outlineWidth, this.outlineOffset), calculateRadius(cornerRadii2.getHorizontal(), this.outlineWidth, this.outlineOffset), calculateRadius(cornerRadii2.getVertical(), this.outlineWidth, this.outlineOffset), calculateRadius(cornerRadii4.getHorizontal(), this.outlineWidth, this.outlineOffset), calculateRadius(cornerRadii4.getVertical(), this.outlineWidth, this.outlineOffset), calculateRadius(cornerRadii3.getHorizontal(), this.outlineWidth, this.outlineOffset), calculateRadius(cornerRadii3.getVertical(), this.outlineWidth, this.outlineOffset)}, Path.Direction.CW);
        canvas.drawPath(this.pathForOutline, this.outlinePaint);
    }

    private final PathEffect getPathEffect(OutlineStyle style, float outlineWidth) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
        if (i10 == 1) {
            return null;
        }
        if (i10 == 2) {
            float f10 = outlineWidth * 3;
            return new DashPathEffect(new float[]{f10, f10, f10, f10}, 0.0f);
        }
        if (i10 == 3) {
            return new DashPathEffect(new float[]{outlineWidth, outlineWidth, outlineWidth, outlineWidth}, 0.0f);
        }
        throw new C2750m();
    }

    private final void updateOutlineRect() {
        this.tempRectForOutline.set(getBounds());
        RectF rectF = this.tempRectForOutline;
        float f10 = rectF.top;
        float f11 = this.outlineWidth;
        float f12 = this.outlineOffset;
        float f13 = this.gapBetweenPaths;
        rectF.top = f10 - (((f11 * 0.5f) + f12) - f13);
        rectF.bottom += ((f11 * 0.5f) + f12) - f13;
        rectF.left -= ((f11 * 0.5f) + f12) - f13;
        rectF.right += ((f11 * 0.5f) + f12) - f13;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ComputedBorderRadius computedBorderRadiusResolve;
        AbstractC2855l.g(canvas, "canvas");
        if (this.outlineWidth == 0.0f) {
            return;
        }
        this.pathForOutline.reset();
        BorderRadiusStyle borderRadiusStyle = this.borderRadius;
        if (borderRadiusStyle != null) {
            int layoutDirection = getLayoutDirection();
            Context context = this.context;
            PixelUtil pixelUtil = PixelUtil.INSTANCE;
            computedBorderRadiusResolve = borderRadiusStyle.resolve(layoutDirection, context, pixelUtil.pxToDp(getBounds().width()), pixelUtil.pxToDp(getBounds().height()));
        } else {
            computedBorderRadiusResolve = null;
        }
        this.computedBorderRadius = computedBorderRadiusResolve;
        updateOutlineRect();
        ComputedBorderRadius computedBorderRadius = this.computedBorderRadius;
        if (computedBorderRadius == null || computedBorderRadius == null || !computedBorderRadius.hasRoundedBorders()) {
            drawRectangularOutline(canvas);
        } else {
            drawRoundedOutline(canvas);
        }
    }

    public final BorderRadiusStyle getBorderRadius() {
        return this.borderRadius;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        int alpha = this.outlinePaint.getAlpha();
        if (alpha == 255) {
            return -1;
        }
        return (1 > alpha || alpha >= 255) ? -2 : -3;
    }

    public final int getOutlineColor() {
        return this.outlineColor;
    }

    public final float getOutlineOffset() {
        return this.outlineOffset;
    }

    public final OutlineStyle getOutlineStyle() {
        return this.outlineStyle;
    }

    public final float getOutlineWidth() {
        return this.outlineWidth;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.outlinePaint.setAlpha(AbstractC3624a.c((alpha / 255.0f) * (Color.alpha(this.outlineColor) / 255.0f) * 255.0f));
        invalidateSelf();
    }

    public final void setBorderRadius(BorderRadiusStyle borderRadiusStyle) {
        this.borderRadius = borderRadiusStyle;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.outlinePaint.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final void setOutlineColor(int i10) {
        if (i10 != this.outlineColor) {
            this.outlineColor = i10;
            this.outlinePaint.setColor(i10);
            invalidateSelf();
        }
    }

    public final void setOutlineOffset(float f10) {
        if (f10 == this.outlineOffset) {
            return;
        }
        this.outlineOffset = f10;
        invalidateSelf();
    }

    public final void setOutlineStyle(OutlineStyle value) {
        AbstractC2855l.g(value, "value");
        if (value != this.outlineStyle) {
            this.outlineStyle = value;
            this.outlinePaint.setPathEffect(getPathEffect(value, this.outlineWidth));
            invalidateSelf();
        }
    }

    public final void setOutlineWidth(float f10) {
        if (f10 == this.outlineWidth) {
            return;
        }
        this.outlineWidth = f10;
        this.outlinePaint.setStrokeWidth(f10);
        this.outlinePaint.setPathEffect(getPathEffect(this.outlineStyle, f10));
        invalidateSelf();
    }

    public OutlineDrawable(Context context, BorderRadiusStyle borderRadiusStyle, int i10, float f10, OutlineStyle outlineStyle, float f11) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(outlineStyle, "outlineStyle");
        this.context = context;
        this.borderRadius = borderRadiusStyle;
        this.gapBetweenPaths = 0.8f;
        this.outlineOffset = f10;
        this.outlineStyle = outlineStyle;
        this.outlineColor = i10;
        this.outlineWidth = f11;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(i10);
        paint.setStrokeWidth(f11);
        paint.setPathEffect(getPathEffect(outlineStyle, f11));
        this.outlinePaint = paint;
        this.tempRectForOutline = new RectF();
        this.pathForOutline = new Path();
    }
}
