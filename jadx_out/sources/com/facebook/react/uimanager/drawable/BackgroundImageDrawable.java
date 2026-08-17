package com.facebook.react.uimanager.drawable;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.FloatUtil;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.LengthPercentageType;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.uimanager.style.BackgroundImageLayer;
import com.facebook.react.uimanager.style.BackgroundPosition;
import com.facebook.react.uimanager.style.BackgroundRepeat;
import com.facebook.react.uimanager.style.BackgroundRepeatKeyword;
import com.facebook.react.uimanager.style.BackgroundSize;
import com.facebook.react.uimanager.style.BorderInsets;
import com.facebook.react.uimanager.style.BorderRadiusStyle;
import com.facebook.react.uimanager.style.ComputedBorderRadius;
import com.facebook.react.uimanager.style.CornerRadii;
import i7.t;
import j7.AbstractC2800q;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJO\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170#2\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u00172\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b$\u0010%J5\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170#2\u0006\u0010&\u001a\u00020\u00172\u0006\u0010'\u001a\u00020\u00172\b\u0010)\u001a\u0004\u0018\u00010(H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0012H\u0016¢\u0006\u0004\b,\u0010\u0014J\u0017\u0010/\u001a\u00020\u00122\u0006\u0010.\u001a\u00020-H\u0014¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\u00122\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u0019\u00107\u001a\u00020\u00122\b\u00106\u001a\u0004\u0018\u000105H\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u000201H\u0017¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\u00020\u00122\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b=\u0010>R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010?R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u0016\u0010J\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010M\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010O\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0018\u0010Q\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010PR:\u0010U\u001a\n\u0012\u0004\u0012\u00020S\u0018\u00010R2\u000e\u0010T\u001a\n\u0012\u0004\u0012\u00020S\u0018\u00010R8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR:\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010R2\u000e\u0010T\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010R8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010V\u001a\u0004\b[\u0010X\"\u0004\b\\\u0010ZR:\u0010]\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010R2\u000e\u0010T\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010R8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010V\u001a\u0004\b^\u0010X\"\u0004\b_\u0010ZR:\u0010`\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010R2\u000e\u0010T\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010R8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010V\u001a\u0004\ba\u0010X\"\u0004\bb\u0010ZR\u0014\u0010d\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010e¨\u0006f"}, d2 = {"Lcom/facebook/react/uimanager/drawable/BackgroundImageDrawable;", "Landroid/graphics/drawable/Drawable;", "Landroid/content/Context;", "context", "Lcom/facebook/react/uimanager/style/BorderRadiusStyle;", ViewProps.BORDER_RADIUS, "Lcom/facebook/react/uimanager/style/BorderInsets;", "borderInsets", "<init>", "(Landroid/content/Context;Lcom/facebook/react/uimanager/style/BorderRadiusStyle;Lcom/facebook/react/uimanager/style/BorderInsets;)V", "Landroid/graphics/RectF;", "computeBorderInsets", "()Landroid/graphics/RectF;", "positioningArea", "paintingArea", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hasInvalidDimensions", "(Landroid/graphics/RectF;Landroid/graphics/RectF;)Z", "Li7/B;", "updatePath", "()V", "Lcom/facebook/react/uimanager/LengthPercentage;", "lengthPercentage", PointerEventHelper.POINTER_TYPE_UNKNOWN, "availableSpace", "positionToPixels", "(Lcom/facebook/react/uimanager/LengthPercentage;F)F", "containerWidth", "containerHeight", "imageWidth", "imageHeight", "Lcom/facebook/react/uimanager/style/BackgroundSize;", "backgroundSize", "Lcom/facebook/react/uimanager/style/BackgroundRepeat;", "repeat", "Lkotlin/Pair;", "calculateBackgroundImageSize", "(FFFFLcom/facebook/react/uimanager/style/BackgroundSize;Lcom/facebook/react/uimanager/style/BackgroundRepeat;)Lkotlin/Pair;", "tileWidth", "tileHeight", "Lcom/facebook/react/uimanager/style/BackgroundPosition;", ViewProps.POSITION, "calculateBackgroundPosition", "(FFLcom/facebook/react/uimanager/style/BackgroundPosition;)Lkotlin/Pair;", "invalidateSelf", "Landroid/graphics/Rect;", "bounds", "onBoundsChange", "(Landroid/graphics/Rect;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "alpha", "setAlpha", "(I)V", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getOpacity", "()I", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "Landroid/content/Context;", "Lcom/facebook/react/uimanager/style/BorderRadiusStyle;", "getBorderRadius", "()Lcom/facebook/react/uimanager/style/BorderRadiusStyle;", "setBorderRadius", "(Lcom/facebook/react/uimanager/style/BorderRadiusStyle;)V", "Lcom/facebook/react/uimanager/style/BorderInsets;", "getBorderInsets", "()Lcom/facebook/react/uimanager/style/BorderInsets;", "setBorderInsets", "(Lcom/facebook/react/uimanager/style/BorderInsets;)V", "needUpdatePath", "Z", "Landroid/graphics/Path;", "backgroundImageClipPath", "Landroid/graphics/Path;", "backgroundPositioningArea", "Landroid/graphics/RectF;", "backgroundPaintingArea", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/uimanager/style/BackgroundImageLayer;", "value", "backgroundImageLayers", "Ljava/util/List;", "getBackgroundImageLayers", "()Ljava/util/List;", "setBackgroundImageLayers", "(Ljava/util/List;)V", "getBackgroundSize", "setBackgroundSize", "backgroundPosition", "getBackgroundPosition", "setBackgroundPosition", "backgroundRepeat", "getBackgroundRepeat", "setBackgroundRepeat", "Landroid/graphics/Paint;", "backgroundPaint", "Landroid/graphics/Paint;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BackgroundImageDrawable extends Drawable {
    private Path backgroundImageClipPath;
    private List<BackgroundImageLayer> backgroundImageLayers;
    private final Paint backgroundPaint;
    private RectF backgroundPaintingArea;
    private List<BackgroundPosition> backgroundPosition;
    private RectF backgroundPositioningArea;
    private List<BackgroundRepeat> backgroundRepeat;
    private List<? extends BackgroundSize> backgroundSize;
    private BorderInsets borderInsets;
    private BorderRadiusStyle borderRadius;
    private final Context context;
    private boolean needUpdatePath;

    public /* synthetic */ BackgroundImageDrawable(Context context, BorderRadiusStyle borderRadiusStyle, BorderInsets borderInsets, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : borderRadiusStyle, (i10 & 4) != 0 ? null : borderInsets);
    }

    private final Pair<Float, Float> calculateBackgroundImageSize(float containerWidth, float containerHeight, float imageWidth, float imageHeight, BackgroundSize backgroundSize, BackgroundRepeat repeat) {
        if (backgroundSize instanceof BackgroundSize.LengthPercentageAuto) {
            BackgroundSize.LengthPercentageAuto lengthPercentageAuto = (BackgroundSize.LengthPercentageAuto) backgroundSize;
            LengthPercentage x10 = lengthPercentageAuto.getLengthPercentage().getX();
            LengthPercentage y10 = lengthPercentageAuto.getLengthPercentage().getY();
            if (x10 != null && y10 != null) {
                imageWidth = positionToPixels(x10, containerWidth);
                imageHeight = positionToPixels(y10, containerHeight);
            }
        }
        BackgroundRepeatKeyword x11 = repeat != null ? repeat.getX() : null;
        BackgroundRepeatKeyword backgroundRepeatKeyword = BackgroundRepeatKeyword.Round;
        if (x11 == backgroundRepeatKeyword && imageWidth > 0.0f && !FloatUtil.floatsEqual(containerWidth % imageWidth, 0.0f)) {
            float fRint = (float) Math.rint(containerWidth / imageWidth);
            if (fRint > 0.0f) {
                imageWidth = containerWidth / fRint;
            }
        }
        if ((repeat != null ? repeat.getY() : null) == backgroundRepeatKeyword && imageHeight > 0.0f && !FloatUtil.floatsEqual(containerHeight % imageHeight, 0.0f)) {
            float fRint2 = (float) Math.rint(containerHeight / imageHeight);
            if (fRint2 > 0.0f) {
                imageHeight = containerHeight / fRint2;
            }
        }
        return t.a(Float.valueOf(imageWidth), Float.valueOf(imageHeight));
    }

    private final Pair<Float, Float> calculateBackgroundPosition(float tileWidth, float tileHeight, BackgroundPosition position) {
        float fPositionToPixels;
        float fPositionToPixels2 = 0.0f;
        Float fValueOf = Float.valueOf(0.0f);
        RectF rectF = this.backgroundPositioningArea;
        if (rectF == null) {
            return t.a(fValueOf, fValueOf);
        }
        float fWidth = rectF.width() - tileWidth;
        float fHeight = rectF.height() - tileHeight;
        if ((position != null ? position.getLeft() : null) != null) {
            fPositionToPixels = positionToPixels(position.getLeft(), fWidth);
        } else {
            fPositionToPixels = (position != null ? position.getRight() : null) != null ? fWidth - positionToPixels(position.getRight(), fWidth) : 0.0f;
        }
        float f10 = fPositionToPixels + rectF.left;
        if ((position != null ? position.getTop() : null) != null) {
            fPositionToPixels2 = positionToPixels(position.getTop(), fHeight);
        } else {
            if ((position != null ? position.getBottom() : null) != null) {
                fPositionToPixels2 = fHeight - positionToPixels(position.getBottom(), fHeight);
            }
        }
        return t.a(Float.valueOf(f10), Float.valueOf(fPositionToPixels2 + rectF.top));
    }

    private final RectF computeBorderInsets() {
        BorderInsets borderInsets = this.borderInsets;
        RectF rectFResolve = borderInsets != null ? borderInsets.resolve(getLayoutDirection(), this.context) : null;
        return new RectF(rectFResolve != null ? PixelUtil.INSTANCE.dpToPx(rectFResolve.left) : 0.0f, rectFResolve != null ? PixelUtil.INSTANCE.dpToPx(rectFResolve.top) : 0.0f, rectFResolve != null ? PixelUtil.INSTANCE.dpToPx(rectFResolve.right) : 0.0f, rectFResolve != null ? PixelUtil.INSTANCE.dpToPx(rectFResolve.bottom) : 0.0f);
    }

    private final boolean hasInvalidDimensions(RectF positioningArea, RectF paintingArea) {
        return FloatUtil.floatsEqual(positioningArea.width(), 0.0f) || positioningArea.width() < 0.0f || FloatUtil.floatsEqual(positioningArea.height(), 0.0f) || positioningArea.height() < 0.0f || FloatUtil.floatsEqual(paintingArea.width(), 0.0f) || paintingArea.width() < 0.0f || FloatUtil.floatsEqual(paintingArea.height(), 0.0f) || paintingArea.height() < 0.0f;
    }

    private final float positionToPixels(LengthPercentage lengthPercentage, float availableSpace) {
        return lengthPercentage.getType() == LengthPercentageType.PERCENT ? lengthPercentage.resolve(availableSpace) : PixelUtil.INSTANCE.dpToPx(lengthPercentage.resolve(availableSpace));
    }

    private final void updatePath() {
        ComputedBorderRadius computedBorderRadiusResolve;
        CornerRadii bottomLeft;
        CornerRadii bottomLeft2;
        CornerRadii bottomRight;
        CornerRadii bottomRight2;
        CornerRadii topRight;
        CornerRadii topRight2;
        CornerRadii topLeft;
        CornerRadii topLeft2;
        if (this.needUpdatePath) {
            this.needUpdatePath = false;
            RectF rectFComputeBorderInsets = computeBorderInsets();
            this.backgroundPositioningArea = new RectF(getBounds().left + rectFComputeBorderInsets.left, getBounds().top + rectFComputeBorderInsets.top, getBounds().right - rectFComputeBorderInsets.right, getBounds().bottom - rectFComputeBorderInsets.bottom);
            this.backgroundPaintingArea = new RectF(getBounds());
            BorderRadiusStyle borderRadiusStyle = this.borderRadius;
            if (borderRadiusStyle != null) {
                int layoutDirection = getLayoutDirection();
                Context context = this.context;
                PixelUtil pixelUtil = PixelUtil.INSTANCE;
                computedBorderRadiusResolve = borderRadiusStyle.resolve(layoutDirection, context, pixelUtil.pxToDp(getBounds().width()), pixelUtil.pxToDp(getBounds().height()));
            } else {
                computedBorderRadiusResolve = null;
            }
            BorderRadiusStyle borderRadiusStyle2 = this.borderRadius;
            if (borderRadiusStyle2 == null || !borderRadiusStyle2.hasRoundedBorders()) {
                RectF rectF = this.backgroundPaintingArea;
                if (rectF == null) {
                    return;
                }
                Path path = new Path();
                this.backgroundImageClipPath = path;
                path.addRect(rectF, Path.Direction.CW);
                return;
            }
            RectF rectF2 = this.backgroundPaintingArea;
            if (rectF2 == null) {
                return;
            }
            Path path2 = new Path();
            this.backgroundImageClipPath = path2;
            float fDpToPx = 0.0f;
            float fDpToPx2 = (computedBorderRadiusResolve == null || (topLeft2 = computedBorderRadiusResolve.getTopLeft()) == null) ? 0.0f : PixelUtil.INSTANCE.dpToPx(topLeft2.getHorizontal());
            float fDpToPx3 = (computedBorderRadiusResolve == null || (topLeft = computedBorderRadiusResolve.getTopLeft()) == null) ? 0.0f : PixelUtil.INSTANCE.dpToPx(topLeft.getVertical());
            float fDpToPx4 = (computedBorderRadiusResolve == null || (topRight2 = computedBorderRadiusResolve.getTopRight()) == null) ? 0.0f : PixelUtil.INSTANCE.dpToPx(topRight2.getHorizontal());
            float fDpToPx5 = (computedBorderRadiusResolve == null || (topRight = computedBorderRadiusResolve.getTopRight()) == null) ? 0.0f : PixelUtil.INSTANCE.dpToPx(topRight.getVertical());
            float fDpToPx6 = (computedBorderRadiusResolve == null || (bottomRight2 = computedBorderRadiusResolve.getBottomRight()) == null) ? 0.0f : PixelUtil.INSTANCE.dpToPx(bottomRight2.getHorizontal());
            float fDpToPx7 = (computedBorderRadiusResolve == null || (bottomRight = computedBorderRadiusResolve.getBottomRight()) == null) ? 0.0f : PixelUtil.INSTANCE.dpToPx(bottomRight.getVertical());
            float fDpToPx8 = (computedBorderRadiusResolve == null || (bottomLeft2 = computedBorderRadiusResolve.getBottomLeft()) == null) ? 0.0f : PixelUtil.INSTANCE.dpToPx(bottomLeft2.getHorizontal());
            if (computedBorderRadiusResolve != null && (bottomLeft = computedBorderRadiusResolve.getBottomLeft()) != null) {
                fDpToPx = PixelUtil.INSTANCE.dpToPx(bottomLeft.getVertical());
            }
            path2.addRoundRect(rectF2, new float[]{fDpToPx2, fDpToPx3, fDpToPx4, fDpToPx5, fDpToPx6, fDpToPx7, fDpToPx8, fDpToPx}, Path.Direction.CW);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0232  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void draw(Canvas canvas) {
        RectF rectF;
        int size;
        int i10;
        RectF rectF2;
        RectF rectF3;
        BackgroundRepeatKeyword x10;
        float f10;
        float f11;
        BackgroundRepeat backgroundRepeat;
        float f12;
        int i11;
        int i12;
        float f13;
        BackgroundRepeatKeyword y10;
        float f14;
        float f15;
        int i13;
        int i14;
        float f16;
        int i15;
        BackgroundImageDrawable backgroundImageDrawable = this;
        Canvas canvas2 = canvas;
        AbstractC2855l.g(canvas2, "canvas");
        List<BackgroundImageLayer> list = backgroundImageDrawable.backgroundImageLayers;
        if (list != null) {
            int i16 = 1;
            if (list != null && list.isEmpty()) {
                return;
            }
            backgroundImageDrawable.updatePath();
            RectF rectF4 = backgroundImageDrawable.backgroundPaintingArea;
            if (rectF4 != null && (rectF = backgroundImageDrawable.backgroundPositioningArea) != null && !backgroundImageDrawable.hasInvalidDimensions(rectF, rectF4)) {
                canvas2.save();
                Path path = backgroundImageDrawable.backgroundImageClipPath;
                if (path != null) {
                    canvas2.clipPath(path);
                }
                List<BackgroundImageLayer> list2 = backgroundImageDrawable.backgroundImageLayers;
                if (list2 != null && list2.size() - 1 >= 0) {
                    while (true) {
                        int i17 = size - 1;
                        BackgroundImageLayer backgroundImageLayer = list2.get(size);
                        List<? extends BackgroundSize> list3 = backgroundImageDrawable.backgroundSize;
                        BackgroundSize backgroundSize = list3 != null ? (BackgroundSize) AbstractC2800q.h0(list3, size % list3.size()) : null;
                        List<BackgroundRepeat> list4 = backgroundImageDrawable.backgroundRepeat;
                        BackgroundRepeat backgroundRepeat2 = list4 != null ? (BackgroundRepeat) AbstractC2800q.h0(list4, size % list4.size()) : null;
                        List<BackgroundPosition> list5 = backgroundImageDrawable.backgroundPosition;
                        BackgroundPosition backgroundPosition = list5 != null ? (BackgroundPosition) AbstractC2800q.h0(list5, size % list5.size()) : null;
                        Pair<Float, Float> pairCalculateBackgroundImageSize = backgroundImageDrawable.calculateBackgroundImageSize(rectF.width(), rectF.height(), rectF.width(), rectF.height(), backgroundSize, backgroundRepeat2);
                        BackgroundRepeat backgroundRepeat3 = backgroundRepeat2;
                        BackgroundImageDrawable backgroundImageDrawable2 = backgroundImageDrawable;
                        float fFloatValue = ((Number) pairCalculateBackgroundImageSize.getFirst()).floatValue();
                        float fFloatValue2 = ((Number) pairCalculateBackgroundImageSize.getSecond()).floatValue();
                        if (fFloatValue <= 0.0f || fFloatValue2 <= 0.0f) {
                            i10 = i16;
                            rectF2 = rectF4;
                            rectF3 = rectF;
                        } else {
                            backgroundImageDrawable2.backgroundPaint.setShader(backgroundImageLayer.getShader(fFloatValue, fFloatValue2));
                            Pair<Float, Float> pairCalculateBackgroundPosition = backgroundImageDrawable2.calculateBackgroundPosition(fFloatValue, fFloatValue2, backgroundPosition);
                            float fFloatValue3 = ((Number) pairCalculateBackgroundPosition.getFirst()).floatValue();
                            float fFloatValue4 = ((Number) pairCalculateBackgroundPosition.getSecond()).floatValue();
                            if (backgroundRepeat3 == null || (x10 = backgroundRepeat3.getX()) == null) {
                                x10 = BackgroundRepeatKeyword.Repeat;
                            }
                            BackgroundRepeatKeyword backgroundRepeatKeyword = BackgroundRepeatKeyword.Space;
                            if (x10 == backgroundRepeatKeyword) {
                                float fWidth = rectF4.width() - (2 * fFloatValue);
                                i10 = i16;
                                RectF rectF5 = rectF4;
                                if (((float) Math.rint(fFloatValue)) <= 0.0f || (fWidth <= 0.0f && !FloatUtil.floatsEqual(fWidth, 0.0f))) {
                                    f11 = 0.0f;
                                    f10 = fFloatValue4;
                                    rectF2 = rectF5;
                                } else {
                                    f10 = fFloatValue4;
                                    int iFloor = (int) Math.floor(((float) Math.rint(fWidth)) / r8);
                                    int i18 = iFloor + 2;
                                    float f17 = (fWidth - (iFloor * fFloatValue)) / (iFloor + 1);
                                    rectF2 = rectF5;
                                    fFloatValue3 = rectF2.left;
                                    backgroundRepeat = backgroundRepeat3;
                                    f12 = 0.0f;
                                    rectF3 = rectF;
                                    f13 = f17;
                                    i12 = i18;
                                    if (backgroundRepeat == null || (y10 = backgroundRepeat.getY()) == null) {
                                        y10 = BackgroundRepeatKeyword.Repeat;
                                    }
                                    if (y10 != backgroundRepeatKeyword) {
                                        float fHeight = rectF2.height() - (2 * fFloatValue2);
                                        if (((float) Math.rint(fFloatValue2)) > f12 && (fHeight > f12 || FloatUtil.floatsEqual(fHeight, f12))) {
                                            int iFloor2 = (int) Math.floor(((float) Math.rint(fHeight)) / r1);
                                            f10 = rectF2.top;
                                            f14 = f13;
                                            i14 = iFloor2 + 2;
                                            f16 = (fHeight - (iFloor2 * fFloatValue2)) / (iFloor2 + 1);
                                            float f18 = fFloatValue3;
                                            i15 = 0;
                                            while (i15 < i12) {
                                                int i19 = 0;
                                                float f19 = f10;
                                                while (i19 < i14) {
                                                    canvas2.save();
                                                    canvas2.translate(f18, f19);
                                                    canvas2.drawRect(0.0f, 0.0f, fFloatValue, fFloatValue2, backgroundImageDrawable2.backgroundPaint);
                                                    canvas.restore();
                                                    f19 += fFloatValue2 + f16;
                                                    i19++;
                                                    i12 = i12;
                                                    i15 = i15;
                                                    canvas2 = canvas;
                                                }
                                                f18 += fFloatValue + f14;
                                                i15++;
                                                i12 = i12;
                                                canvas2 = canvas;
                                            }
                                        }
                                    } else {
                                        if (y10 == BackgroundRepeatKeyword.Round || y10 == BackgroundRepeatKeyword.Repeat) {
                                            if (((float) Math.rint(fFloatValue2)) > 0.0f) {
                                                int iCeil = (int) Math.ceil(((float) Math.rint(r2)) / r1);
                                                f14 = f13;
                                                int iCeil2 = ((int) Math.ceil(((float) Math.rint(rectF2.height() - r2)) / r1)) + iCeil;
                                                f15 = f10 - (iCeil * fFloatValue2);
                                                i13 = iCeil2;
                                            } else {
                                                f14 = f13;
                                                f15 = f10;
                                                i13 = i10;
                                            }
                                            f10 = f15;
                                            i14 = i13;
                                        }
                                        f16 = 0.0f;
                                        float f182 = fFloatValue3;
                                        i15 = 0;
                                        while (i15 < i12) {
                                        }
                                    }
                                    f14 = f13;
                                    i14 = i10;
                                    f16 = 0.0f;
                                    float f1822 = fFloatValue3;
                                    i15 = 0;
                                    while (i15 < i12) {
                                    }
                                }
                            } else {
                                f10 = fFloatValue4;
                                i10 = i16;
                                rectF2 = rectF4;
                                f11 = 0.0f;
                                if (x10 == BackgroundRepeatKeyword.Round || x10 == BackgroundRepeatKeyword.Repeat) {
                                    if (((float) Math.rint(fFloatValue)) > 0.0f) {
                                        rectF3 = rectF;
                                        int iCeil3 = (int) Math.ceil(((float) Math.rint(fFloatValue3)) / r0);
                                        f12 = 0.0f;
                                        backgroundRepeat = backgroundRepeat3;
                                        int iCeil4 = ((int) Math.ceil(((float) Math.rint(rectF2.width() - fFloatValue3)) / r0)) + iCeil3;
                                        fFloatValue3 -= iCeil3 * fFloatValue;
                                        i11 = iCeil4;
                                    } else {
                                        backgroundRepeat = backgroundRepeat3;
                                        f12 = 0.0f;
                                        rectF3 = rectF;
                                        i11 = i10;
                                    }
                                    i12 = i11;
                                }
                                f13 = f12;
                                if (backgroundRepeat == null) {
                                    y10 = BackgroundRepeatKeyword.Repeat;
                                    if (y10 != backgroundRepeatKeyword) {
                                    }
                                    f14 = f13;
                                    i14 = i10;
                                    f16 = 0.0f;
                                    float f18222 = fFloatValue3;
                                    i15 = 0;
                                    while (i15 < i12) {
                                    }
                                }
                            }
                            backgroundRepeat = backgroundRepeat3;
                            f12 = f11;
                            rectF3 = rectF;
                            i12 = i10;
                            f13 = f12;
                            if (backgroundRepeat == null) {
                            }
                        }
                        if (i17 < 0) {
                            break;
                        }
                        canvas2 = canvas;
                        backgroundImageDrawable = backgroundImageDrawable2;
                        rectF4 = rectF2;
                        size = i17;
                        rectF = rectF3;
                        i16 = i10;
                    }
                }
                canvas.restore();
            }
        }
    }

    public final List<BackgroundImageLayer> getBackgroundImageLayers() {
        return this.backgroundImageLayers;
    }

    public final List<BackgroundPosition> getBackgroundPosition() {
        return this.backgroundPosition;
    }

    public final List<BackgroundRepeat> getBackgroundRepeat() {
        return this.backgroundRepeat;
    }

    public final List<BackgroundSize> getBackgroundSize() {
        return this.backgroundSize;
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
        this.backgroundPaint.setAlpha(alpha);
        invalidateSelf();
    }

    public final void setBackgroundImageLayers(List<BackgroundImageLayer> list) {
        if (AbstractC2855l.b(this.backgroundImageLayers, list)) {
            return;
        }
        this.backgroundImageLayers = list;
        invalidateSelf();
    }

    public final void setBackgroundPosition(List<BackgroundPosition> list) {
        if (AbstractC2855l.b(this.backgroundPosition, list)) {
            return;
        }
        this.backgroundPosition = list;
        invalidateSelf();
    }

    public final void setBackgroundRepeat(List<BackgroundRepeat> list) {
        if (AbstractC2855l.b(this.backgroundRepeat, list)) {
            return;
        }
        this.backgroundRepeat = list;
        invalidateSelf();
    }

    public final void setBackgroundSize(List<? extends BackgroundSize> list) {
        if (AbstractC2855l.b(this.backgroundSize, list)) {
            return;
        }
        this.backgroundSize = list;
        invalidateSelf();
    }

    public final void setBorderInsets(BorderInsets borderInsets) {
        this.borderInsets = borderInsets;
    }

    public final void setBorderRadius(BorderRadiusStyle borderRadiusStyle) {
        this.borderRadius = borderRadiusStyle;
    }

    public BackgroundImageDrawable(Context context, BorderRadiusStyle borderRadiusStyle, BorderInsets borderInsets) {
        AbstractC2855l.g(context, "context");
        this.context = context;
        this.borderRadius = borderRadiusStyle;
        this.borderInsets = borderInsets;
        this.needUpdatePath = true;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.backgroundPaint = paint;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
