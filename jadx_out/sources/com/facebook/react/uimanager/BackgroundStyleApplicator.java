package com.facebook.react.uimanager;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.common.ViewUtil;
import com.facebook.react.uimanager.drawable.BackgroundDrawable;
import com.facebook.react.uimanager.drawable.BackgroundImageDrawable;
import com.facebook.react.uimanager.drawable.BorderDrawable;
import com.facebook.react.uimanager.drawable.CompositeBackgroundDrawable;
import com.facebook.react.uimanager.drawable.InsetBoxShadowDrawable;
import com.facebook.react.uimanager.drawable.OutlineDrawable;
import com.facebook.react.uimanager.drawable.OutsetBoxShadowDrawable;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.uimanager.style.BackgroundImageLayer;
import com.facebook.react.uimanager.style.BackgroundPosition;
import com.facebook.react.uimanager.style.BackgroundRepeat;
import com.facebook.react.uimanager.style.BackgroundSize;
import com.facebook.react.uimanager.style.BorderInsets;
import com.facebook.react.uimanager.style.BorderRadiusProp;
import com.facebook.react.uimanager.style.BorderRadiusStyle;
import com.facebook.react.uimanager.style.BorderStyle;
import com.facebook.react.uimanager.style.BoxShadow;
import com.facebook.react.uimanager.style.ComputedBorderRadius;
import com.facebook.react.uimanager.style.CornerRadii;
import com.facebook.react.uimanager.style.LogicalEdge;
import com.facebook.react.uimanager.style.OutlineStyle;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000bH\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ'\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000bH\u0001¢\u0006\u0004\b\u0016\u0010\u000fJ'\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u000bH\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010\"\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010 H\u0007¢\u0006\u0004\b\"\u0010#J!\u0010$\u001a\u0004\u0018\u00010 2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b$\u0010%J+\u0010&\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001e2\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b&\u0010'J!\u0010(\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b(\u0010)J)\u0010.\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010+\u001a\u00020*2\b\u0010-\u001a\u0004\u0018\u00010,H\u0007¢\u0006\u0004\b.\u0010/J!\u00100\u001a\u0004\u0018\u00010,2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010+\u001a\u00020*H\u0007¢\u0006\u0004\b0\u00101J!\u00104\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u00103\u001a\u0004\u0018\u000102H\u0007¢\u0006\u0004\b4\u00105J\u0019\u00106\u001a\u0004\u0018\u0001022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b6\u00107J#\u00109\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u00108\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b9\u0010\nJ\u0019\u0010:\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b:\u0010\u001dJ\u001f\u0010<\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010;\u001a\u00020 H\u0007¢\u0006\u0004\b<\u0010=J!\u0010@\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010?\u001a\u0004\u0018\u00010>H\u0007¢\u0006\u0004\b@\u0010AJ\u001f\u0010B\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\bB\u0010=J%\u0010E\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010D\u001a\b\u0012\u0004\u0012\u00020C0\u000bH\u0007¢\u0006\u0004\bE\u0010\u000fJ!\u0010E\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010D\u001a\u0004\u0018\u00010FH\u0007¢\u0006\u0004\bE\u0010GJ!\u0010J\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010I\u001a\u0004\u0018\u00010HH\u0007¢\u0006\u0004\bJ\u0010KJ\u001f\u0010N\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010M\u001a\u00020LH\u0007¢\u0006\u0004\bN\u0010OJ\u0017\u0010P\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\bP\u0010QJ\u0017\u0010S\u001a\u00020R2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\bS\u0010TJ\u0019\u0010U\u001a\u0004\u0018\u00010R2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\bU\u0010TJ\u0017\u0010W\u001a\u00020V2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\bW\u0010XJ\u0019\u0010Y\u001a\u0004\u0018\u00010V2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\bY\u0010XJ\u0017\u0010[\u001a\u00020Z2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b[\u0010\\J\u0019\u0010]\u001a\u0004\u0018\u00010Z2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b]\u0010\\J\u0019\u0010_\u001a\u0004\u0018\u00010^2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b_\u0010`J\u0017\u0010a\u001a\u00020^2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\ba\u0010`J\u0017\u0010c\u001a\u00020b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\bc\u0010dJ\u0019\u0010e\u001a\u0004\u0018\u00010b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\be\u0010dJ#\u0010h\u001a\u00020 2\b\u0010f\u001a\u0004\u0018\u00010 2\b\u0010g\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\bh\u0010iJ1\u0010o\u001a\u00020n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010j\u001a\u00020R2\u0006\u0010l\u001a\u00020k2\b\u0010m\u001a\u0004\u0018\u00010kH\u0002¢\u0006\u0004\bo\u0010pJ\u0017\u0010q\u001a\u0004\u0018\u00010 2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\bq\u0010rJ\u0017\u0010s\u001a\u0004\u0018\u00010>2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\bs\u0010tJ\u0017\u0010u\u001a\u0004\u0018\u00010 2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\bu\u0010r¨\u0006v"}, d2 = {"Lcom/facebook/react/uimanager/BackgroundStyleApplicator;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Landroid/view/View;", "view", PointerEventHelper.POINTER_TYPE_UNKNOWN, ViewProps.COLOR, "Li7/B;", "setBackgroundColor", "(Landroid/view/View;Ljava/lang/Integer;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/uimanager/style/BackgroundImageLayer;", "backgroundImageLayers", "setBackgroundImage", "(Landroid/view/View;Ljava/util/List;)V", "Lcom/facebook/react/uimanager/style/BackgroundSize;", "backgroundSizes", "setBackgroundSize$ReactAndroid_release", "setBackgroundSize", "Lcom/facebook/react/uimanager/style/BackgroundPosition;", "backgroundPositions", "setBackgroundPosition$ReactAndroid_release", "setBackgroundPosition", "Lcom/facebook/react/uimanager/style/BackgroundRepeat;", "backgroundRepeats", "setBackgroundRepeat$ReactAndroid_release", "setBackgroundRepeat", "getBackgroundColor", "(Landroid/view/View;)Ljava/lang/Integer;", "Lcom/facebook/react/uimanager/style/LogicalEdge;", "edge", PointerEventHelper.POINTER_TYPE_UNKNOWN, "width", "setBorderWidth", "(Landroid/view/View;Lcom/facebook/react/uimanager/style/LogicalEdge;Ljava/lang/Float;)V", "getBorderWidth", "(Landroid/view/View;Lcom/facebook/react/uimanager/style/LogicalEdge;)Ljava/lang/Float;", "setBorderColor", "(Landroid/view/View;Lcom/facebook/react/uimanager/style/LogicalEdge;Ljava/lang/Integer;)V", "getBorderColor", "(Landroid/view/View;Lcom/facebook/react/uimanager/style/LogicalEdge;)Ljava/lang/Integer;", "Lcom/facebook/react/uimanager/style/BorderRadiusProp;", "corner", "Lcom/facebook/react/uimanager/LengthPercentage;", "radius", "setBorderRadius", "(Landroid/view/View;Lcom/facebook/react/uimanager/style/BorderRadiusProp;Lcom/facebook/react/uimanager/LengthPercentage;)V", "getBorderRadius", "(Landroid/view/View;Lcom/facebook/react/uimanager/style/BorderRadiusProp;)Lcom/facebook/react/uimanager/LengthPercentage;", "Lcom/facebook/react/uimanager/style/BorderStyle;", "borderStyle", "setBorderStyle", "(Landroid/view/View;Lcom/facebook/react/uimanager/style/BorderStyle;)V", "getBorderStyle", "(Landroid/view/View;)Lcom/facebook/react/uimanager/style/BorderStyle;", ViewProps.OUTLINE_COLOR, "setOutlineColor", "getOutlineColor", ViewProps.OUTLINE_OFFSET, "setOutlineOffset", "(Landroid/view/View;F)V", "Lcom/facebook/react/uimanager/style/OutlineStyle;", ViewProps.OUTLINE_STYLE, "setOutlineStyle", "(Landroid/view/View;Lcom/facebook/react/uimanager/style/OutlineStyle;)V", "setOutlineWidth", "Lcom/facebook/react/uimanager/style/BoxShadow;", "shadows", "setBoxShadow", "Lcom/facebook/react/bridge/ReadableArray;", "(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V", "Landroid/graphics/drawable/Drawable;", "drawable", "setFeedbackUnderlay", "(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V", "Landroid/graphics/Canvas;", "canvas", "clipToPaddingBox", "(Landroid/view/View;Landroid/graphics/Canvas;)V", "reset", "(Landroid/view/View;)V", "Lcom/facebook/react/uimanager/drawable/CompositeBackgroundDrawable;", "ensureCompositeBackgroundDrawable", "(Landroid/view/View;)Lcom/facebook/react/uimanager/drawable/CompositeBackgroundDrawable;", "getCompositeBackgroundDrawable", "Lcom/facebook/react/uimanager/drawable/BackgroundDrawable;", "ensureBackgroundDrawable", "(Landroid/view/View;)Lcom/facebook/react/uimanager/drawable/BackgroundDrawable;", "getBackground", "Lcom/facebook/react/uimanager/drawable/BackgroundImageDrawable;", "ensureBackgroundImageDrawable", "(Landroid/view/View;)Lcom/facebook/react/uimanager/drawable/BackgroundImageDrawable;", "getBackgroundImage", "Lcom/facebook/react/uimanager/drawable/BorderDrawable;", "getBorder", "(Landroid/view/View;)Lcom/facebook/react/uimanager/drawable/BorderDrawable;", "ensureBorderDrawable", "Lcom/facebook/react/uimanager/drawable/OutlineDrawable;", "ensureOutlineDrawable", "(Landroid/view/View;)Lcom/facebook/react/uimanager/drawable/OutlineDrawable;", "getOutlineDrawable", "computedRadius", ViewProps.BORDER_WIDTH, "getInnerBorderRadius", "(Ljava/lang/Float;Ljava/lang/Float;)F", "composite", "Landroid/graphics/RectF;", "paddingBoxRect", "computedBorderInsets", "Landroid/graphics/Path;", "createPaddingBoxPath", "(Landroid/view/View;Lcom/facebook/react/uimanager/drawable/CompositeBackgroundDrawable;Landroid/graphics/RectF;Landroid/graphics/RectF;)Landroid/graphics/Path;", "getOutlineOffset", "(Landroid/view/View;)Ljava/lang/Float;", "getOutlineStyle", "(Landroid/view/View;)Lcom/facebook/react/uimanager/style/OutlineStyle;", "getOutlineWidth", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BackgroundStyleApplicator {
    public static final BackgroundStyleApplicator INSTANCE = new BackgroundStyleApplicator();

    private BackgroundStyleApplicator() {
    }

    public static final void clipToPaddingBox(View view, Canvas canvas) {
        RectF rectFResolve;
        float fDpToPx;
        float fDpToPx2;
        float fDpToPx3;
        AbstractC2855l.g(view, "view");
        AbstractC2855l.g(canvas, "canvas");
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        BackgroundStyleApplicator backgroundStyleApplicator = INSTANCE;
        CompositeBackgroundDrawable compositeBackgroundDrawable = backgroundStyleApplicator.getCompositeBackgroundDrawable(view);
        if (compositeBackgroundDrawable == null) {
            canvas.clipRect(rect);
            return;
        }
        RectF rectF = new RectF();
        BorderInsets borderInsets = compositeBackgroundDrawable.getBorderInsets();
        if (borderInsets != null) {
            int layoutDirection = compositeBackgroundDrawable.getLayoutDirection();
            Context context = view.getContext();
            AbstractC2855l.f(context, "getContext(...)");
            rectFResolve = borderInsets.resolve(layoutDirection, context);
        } else {
            rectFResolve = null;
        }
        float f10 = compositeBackgroundDrawable.getBounds().left;
        float fDpToPx4 = 0.0f;
        if (rectFResolve != null) {
            fDpToPx = PixelUtil.INSTANCE.dpToPx(rectFResolve.left);
        } else {
            fDpToPx = 0.0f;
        }
        rectF.left = f10 + fDpToPx;
        float f11 = compositeBackgroundDrawable.getBounds().top;
        if (rectFResolve != null) {
            fDpToPx2 = PixelUtil.INSTANCE.dpToPx(rectFResolve.top);
        } else {
            fDpToPx2 = 0.0f;
        }
        rectF.top = f11 + fDpToPx2;
        float f12 = compositeBackgroundDrawable.getBounds().right;
        if (rectFResolve != null) {
            fDpToPx3 = PixelUtil.INSTANCE.dpToPx(rectFResolve.right);
        } else {
            fDpToPx3 = 0.0f;
        }
        rectF.right = f12 - fDpToPx3;
        float f13 = compositeBackgroundDrawable.getBounds().bottom;
        if (rectFResolve != null) {
            fDpToPx4 = PixelUtil.INSTANCE.dpToPx(rectFResolve.bottom);
        }
        rectF.bottom = f13 - fDpToPx4;
        BorderRadiusStyle borderRadius = compositeBackgroundDrawable.getBorderRadius();
        if (borderRadius == null || !borderRadius.hasRoundedBorders()) {
            rectF.offset(rect.left, rect.top);
            canvas.clipRect(rectF);
        } else {
            Path pathCreatePaddingBoxPath = backgroundStyleApplicator.createPaddingBoxPath(view, compositeBackgroundDrawable, rectF, rectFResolve);
            pathCreatePaddingBoxPath.offset(rect.left, rect.top);
            canvas.clipPath(pathCreatePaddingBoxPath);
        }
    }

    private final Path createPaddingBoxPath(View view, CompositeBackgroundDrawable composite, RectF paddingBoxRect, RectF computedBorderInsets) {
        ComputedBorderRadius computedBorderRadiusResolve;
        CornerRadii bottomLeft;
        CornerRadii bottomLeft2;
        CornerRadii bottomRight;
        CornerRadii bottomRight2;
        CornerRadii topRight;
        CornerRadii topRight2;
        CornerRadii topLeft;
        CornerRadii topLeft2;
        BorderRadiusStyle borderRadius = composite.getBorderRadius();
        if (borderRadius != null) {
            int layoutDirection = composite.getLayoutDirection();
            Context context = view.getContext();
            AbstractC2855l.f(context, "getContext(...)");
            computedBorderRadiusResolve = borderRadius.resolve(layoutDirection, context, PixelUtil.toDIPFromPixel(composite.getBounds().width()), PixelUtil.toDIPFromPixel(composite.getBounds().height()));
        } else {
            computedBorderRadiusResolve = null;
        }
        Path path = new Path();
        path.addRoundRect(paddingBoxRect, new float[]{getInnerBorderRadius((computedBorderRadiusResolve == null || (topLeft2 = computedBorderRadiusResolve.getTopLeft()) == null) ? null : Float.valueOf(PixelUtil.INSTANCE.dpToPx(topLeft2.getHorizontal())), computedBorderInsets != null ? Float.valueOf(PixelUtil.INSTANCE.dpToPx(computedBorderInsets.left)) : null), getInnerBorderRadius((computedBorderRadiusResolve == null || (topLeft = computedBorderRadiusResolve.getTopLeft()) == null) ? null : Float.valueOf(PixelUtil.INSTANCE.dpToPx(topLeft.getVertical())), computedBorderInsets != null ? Float.valueOf(PixelUtil.INSTANCE.dpToPx(computedBorderInsets.top)) : null), getInnerBorderRadius((computedBorderRadiusResolve == null || (topRight2 = computedBorderRadiusResolve.getTopRight()) == null) ? null : Float.valueOf(PixelUtil.INSTANCE.dpToPx(topRight2.getHorizontal())), computedBorderInsets != null ? Float.valueOf(PixelUtil.INSTANCE.dpToPx(computedBorderInsets.right)) : null), getInnerBorderRadius((computedBorderRadiusResolve == null || (topRight = computedBorderRadiusResolve.getTopRight()) == null) ? null : Float.valueOf(PixelUtil.INSTANCE.dpToPx(topRight.getVertical())), computedBorderInsets != null ? Float.valueOf(PixelUtil.INSTANCE.dpToPx(computedBorderInsets.top)) : null), getInnerBorderRadius((computedBorderRadiusResolve == null || (bottomRight2 = computedBorderRadiusResolve.getBottomRight()) == null) ? null : Float.valueOf(PixelUtil.INSTANCE.dpToPx(bottomRight2.getHorizontal())), computedBorderInsets != null ? Float.valueOf(PixelUtil.INSTANCE.dpToPx(computedBorderInsets.right)) : null), getInnerBorderRadius((computedBorderRadiusResolve == null || (bottomRight = computedBorderRadiusResolve.getBottomRight()) == null) ? null : Float.valueOf(PixelUtil.INSTANCE.dpToPx(bottomRight.getVertical())), computedBorderInsets != null ? Float.valueOf(PixelUtil.INSTANCE.dpToPx(computedBorderInsets.bottom)) : null), getInnerBorderRadius((computedBorderRadiusResolve == null || (bottomLeft2 = computedBorderRadiusResolve.getBottomLeft()) == null) ? null : Float.valueOf(PixelUtil.INSTANCE.dpToPx(bottomLeft2.getHorizontal())), computedBorderInsets != null ? Float.valueOf(PixelUtil.INSTANCE.dpToPx(computedBorderInsets.left)) : null), getInnerBorderRadius((computedBorderRadiusResolve == null || (bottomLeft = computedBorderRadiusResolve.getBottomLeft()) == null) ? null : Float.valueOf(PixelUtil.INSTANCE.dpToPx(bottomLeft.getVertical())), computedBorderInsets != null ? Float.valueOf(PixelUtil.INSTANCE.dpToPx(computedBorderInsets.bottom)) : null)}, Path.Direction.CW);
        return path;
    }

    private final BackgroundDrawable ensureBackgroundDrawable(View view) {
        CompositeBackgroundDrawable compositeBackgroundDrawableEnsureCompositeBackgroundDrawable = ensureCompositeBackgroundDrawable(view);
        BackgroundDrawable background = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBackground();
        if (background != null) {
            return background;
        }
        Context context = view.getContext();
        AbstractC2855l.f(context, "getContext(...)");
        BackgroundDrawable backgroundDrawable = new BackgroundDrawable(context, compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBorderRadius(), compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBorderInsets());
        view.setBackground(compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.withNewBackground(backgroundDrawable));
        return backgroundDrawable;
    }

    private final BackgroundImageDrawable ensureBackgroundImageDrawable(View view) {
        CompositeBackgroundDrawable compositeBackgroundDrawableEnsureCompositeBackgroundDrawable = ensureCompositeBackgroundDrawable(view);
        BackgroundImageDrawable backgroundImage = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBackgroundImage();
        if (backgroundImage != null) {
            return backgroundImage;
        }
        Context context = view.getContext();
        AbstractC2855l.f(context, "getContext(...)");
        BackgroundImageDrawable backgroundImageDrawable = new BackgroundImageDrawable(context, compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBorderRadius(), compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBorderInsets());
        view.setBackground(compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.withNewBackgroundImage(backgroundImageDrawable));
        return backgroundImageDrawable;
    }

    private final BorderDrawable ensureBorderDrawable(View view) {
        CompositeBackgroundDrawable compositeBackgroundDrawableEnsureCompositeBackgroundDrawable = ensureCompositeBackgroundDrawable(view);
        BorderDrawable border = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBorder();
        if (border != null) {
            return border;
        }
        Context context = view.getContext();
        AbstractC2855l.f(context, "getContext(...)");
        BorderRadiusStyle borderRadius = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBorderRadius();
        BorderDrawable borderDrawable = new BorderDrawable(context, new Spacing(0.0f), borderRadius, compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBorderInsets(), BorderStyle.SOLID);
        view.setBackground(compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.withNewBorder(borderDrawable));
        return borderDrawable;
    }

    private final CompositeBackgroundDrawable ensureCompositeBackgroundDrawable(View view) {
        if (view.getBackground() instanceof CompositeBackgroundDrawable) {
            Drawable background = view.getBackground();
            AbstractC2855l.e(background, "null cannot be cast to non-null type com.facebook.react.uimanager.drawable.CompositeBackgroundDrawable");
            return (CompositeBackgroundDrawable) background;
        }
        Context context = view.getContext();
        AbstractC2855l.f(context, "getContext(...)");
        CompositeBackgroundDrawable compositeBackgroundDrawable = new CompositeBackgroundDrawable(context, view.getBackground(), null, null, null, null, null, null, null, null, null, 2044, null);
        view.setBackground(compositeBackgroundDrawable);
        return compositeBackgroundDrawable;
    }

    private final OutlineDrawable ensureOutlineDrawable(View view) {
        CompositeBackgroundDrawable compositeBackgroundDrawableEnsureCompositeBackgroundDrawable = ensureCompositeBackgroundDrawable(view);
        OutlineDrawable outline = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getOutline();
        if (outline != null) {
            return outline;
        }
        BorderRadiusStyle borderRadius = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBorderRadius();
        Context context = view.getContext();
        AbstractC2855l.f(context, "getContext(...)");
        OutlineDrawable outlineDrawable = new OutlineDrawable(context, borderRadius, -16777216, 0.0f, OutlineStyle.SOLID, 0.0f);
        view.setBackground(compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.withNewOutline(outlineDrawable));
        return outlineDrawable;
    }

    private final BackgroundDrawable getBackground(View view) {
        CompositeBackgroundDrawable compositeBackgroundDrawable = getCompositeBackgroundDrawable(view);
        if (compositeBackgroundDrawable != null) {
            return compositeBackgroundDrawable.getBackground();
        }
        return null;
    }

    public static final Integer getBackgroundColor(View view) {
        AbstractC2855l.g(view, "view");
        BackgroundDrawable background = INSTANCE.getBackground(view);
        if (background != null) {
            return Integer.valueOf(background.getBackgroundColor());
        }
        return null;
    }

    private final BackgroundImageDrawable getBackgroundImage(View view) {
        CompositeBackgroundDrawable compositeBackgroundDrawable = getCompositeBackgroundDrawable(view);
        if (compositeBackgroundDrawable != null) {
            return compositeBackgroundDrawable.getBackgroundImage();
        }
        return null;
    }

    private final BorderDrawable getBorder(View view) {
        CompositeBackgroundDrawable compositeBackgroundDrawable = getCompositeBackgroundDrawable(view);
        if (compositeBackgroundDrawable != null) {
            return compositeBackgroundDrawable.getBorder();
        }
        return null;
    }

    public static final Integer getBorderColor(View view, LogicalEdge edge) {
        AbstractC2855l.g(view, "view");
        AbstractC2855l.g(edge, "edge");
        BorderDrawable border = INSTANCE.getBorder(view);
        if (border != null) {
            return Integer.valueOf(border.getBorderColor(edge));
        }
        return null;
    }

    public static final LengthPercentage getBorderRadius(View view, BorderRadiusProp corner) {
        BorderRadiusStyle borderRadius;
        AbstractC2855l.g(view, "view");
        AbstractC2855l.g(corner, "corner");
        CompositeBackgroundDrawable compositeBackgroundDrawable = INSTANCE.getCompositeBackgroundDrawable(view);
        if (compositeBackgroundDrawable == null || (borderRadius = compositeBackgroundDrawable.getBorderRadius()) == null) {
            return null;
        }
        return borderRadius.get(corner);
    }

    public static final BorderStyle getBorderStyle(View view) {
        AbstractC2855l.g(view, "view");
        BorderDrawable border = INSTANCE.getBorder(view);
        if (border != null) {
            return border.getBorderStyle();
        }
        return null;
    }

    public static final Float getBorderWidth(View view, LogicalEdge edge) {
        Spacing borderWidth;
        AbstractC2855l.g(view, "view");
        AbstractC2855l.g(edge, "edge");
        BorderDrawable border = INSTANCE.getBorder(view);
        Float fValueOf = (border == null || (borderWidth = border.getBorderWidth()) == null) ? null : Float.valueOf(borderWidth.getRaw(edge.toSpacingType()));
        if (fValueOf == null || Float.isNaN(fValueOf.floatValue())) {
            return null;
        }
        return Float.valueOf(PixelUtil.INSTANCE.pxToDp(fValueOf.floatValue()));
    }

    private final CompositeBackgroundDrawable getCompositeBackgroundDrawable(View view) {
        Drawable background = view.getBackground();
        if (background instanceof CompositeBackgroundDrawable) {
            return (CompositeBackgroundDrawable) background;
        }
        return null;
    }

    private final float getInnerBorderRadius(Float computedRadius, Float borderWidth) {
        return B7.d.c((computedRadius != null ? computedRadius.floatValue() : 0.0f) - (borderWidth != null ? borderWidth.floatValue() : 0.0f), 0.0f);
    }

    public static final Integer getOutlineColor(View view) {
        AbstractC2855l.g(view, "view");
        OutlineDrawable outlineDrawable = INSTANCE.getOutlineDrawable(view);
        if (outlineDrawable != null) {
            return Integer.valueOf(outlineDrawable.getOutlineColor());
        }
        return null;
    }

    private final OutlineDrawable getOutlineDrawable(View view) {
        CompositeBackgroundDrawable compositeBackgroundDrawable = getCompositeBackgroundDrawable(view);
        if (compositeBackgroundDrawable != null) {
            return compositeBackgroundDrawable.getOutline();
        }
        return null;
    }

    public static final void reset(View view) {
        AbstractC2855l.g(view, "view");
        if (view.getBackground() instanceof CompositeBackgroundDrawable) {
            Drawable background = view.getBackground();
            AbstractC2855l.e(background, "null cannot be cast to non-null type com.facebook.react.uimanager.drawable.CompositeBackgroundDrawable");
            view.setBackground(((CompositeBackgroundDrawable) background).getOriginalBackground());
        }
    }

    public static final void setBackgroundColor(View view, Integer color) {
        AbstractC2855l.g(view, "view");
        if ((color == null || color.intValue() == 0) && !(view.getBackground() instanceof CompositeBackgroundDrawable)) {
            return;
        }
        INSTANCE.ensureBackgroundDrawable(view).setBackgroundColor(color != null ? color.intValue() : 0);
    }

    public static final void setBackgroundImage(View view, List<BackgroundImageLayer> backgroundImageLayers) {
        AbstractC2855l.g(view, "view");
        INSTANCE.ensureBackgroundImageDrawable(view).setBackgroundImageLayers(backgroundImageLayers);
    }

    public static final void setBackgroundPosition$ReactAndroid_release(View view, List<BackgroundPosition> backgroundPositions) {
        AbstractC2855l.g(view, "view");
        INSTANCE.ensureBackgroundImageDrawable(view).setBackgroundPosition(backgroundPositions);
    }

    public static final void setBackgroundRepeat$ReactAndroid_release(View view, List<BackgroundRepeat> backgroundRepeats) {
        AbstractC2855l.g(view, "view");
        INSTANCE.ensureBackgroundImageDrawable(view).setBackgroundRepeat(backgroundRepeats);
    }

    public static final void setBackgroundSize$ReactAndroid_release(View view, List<? extends BackgroundSize> backgroundSizes) {
        AbstractC2855l.g(view, "view");
        INSTANCE.ensureBackgroundImageDrawable(view).setBackgroundSize(backgroundSizes);
    }

    public static final void setBorderColor(View view, LogicalEdge edge, Integer color) {
        AbstractC2855l.g(view, "view");
        AbstractC2855l.g(edge, "edge");
        INSTANCE.ensureBorderDrawable(view).setBorderColor(edge, color);
    }

    public static final void setBorderRadius(View view, BorderRadiusProp corner, LengthPercentage radius) {
        AbstractC2855l.g(view, "view");
        AbstractC2855l.g(corner, "corner");
        BackgroundStyleApplicator backgroundStyleApplicator = INSTANCE;
        CompositeBackgroundDrawable compositeBackgroundDrawableEnsureCompositeBackgroundDrawable = backgroundStyleApplicator.ensureCompositeBackgroundDrawable(view);
        BorderRadiusStyle borderRadius = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBorderRadius();
        if (borderRadius == null) {
            borderRadius = new BorderRadiusStyle(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
        }
        compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.setBorderRadius(borderRadius);
        BorderRadiusStyle borderRadius2 = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBorderRadius();
        if (borderRadius2 != null) {
            borderRadius2.set(corner, radius);
        }
        if (view instanceof ImageView) {
            backgroundStyleApplicator.ensureBackgroundDrawable(view);
        }
        BackgroundDrawable background = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBackground();
        if (background != null) {
            background.setBorderRadius(compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBorderRadius());
        }
        BackgroundImageDrawable backgroundImage = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBackgroundImage();
        if (backgroundImage != null) {
            backgroundImage.setBorderRadius(compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBorderRadius());
        }
        BorderDrawable border = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBorder();
        if (border != null) {
            border.setBorderRadius(compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBorderRadius());
        }
        BackgroundDrawable background2 = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBackground();
        if (background2 != null) {
            background2.invalidateSelf();
        }
        BackgroundImageDrawable backgroundImage2 = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBackgroundImage();
        if (backgroundImage2 != null) {
            backgroundImage2.invalidateSelf();
        }
        BorderDrawable border2 = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBorder();
        if (border2 != null) {
            border2.invalidateSelf();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            List<Drawable> outerShadows = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getOuterShadows();
            ArrayList arrayList = new ArrayList();
            for (Object obj : outerShadows) {
                if (obj instanceof OutsetBoxShadowDrawable) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((OutsetBoxShadowDrawable) it.next()).setBorderRadius(compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBorderRadius());
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            List<Drawable> innerShadows = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getInnerShadows();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : innerShadows) {
                if (obj2 instanceof InsetBoxShadowDrawable) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((InsetBoxShadowDrawable) it2.next()).setBorderRadius(compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBorderRadius());
            }
        }
        OutlineDrawable outline = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getOutline();
        if (outline != null) {
            outline.setBorderRadius(compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBorderRadius());
        }
        compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.invalidateSelf();
    }

    public static final void setBorderStyle(View view, BorderStyle borderStyle) {
        AbstractC2855l.g(view, "view");
        INSTANCE.ensureBorderDrawable(view).setBorderStyle(borderStyle);
    }

    public static final void setBorderWidth(View view, LogicalEdge edge, Float width) {
        AbstractC2855l.g(view, "view");
        AbstractC2855l.g(edge, "edge");
        BackgroundStyleApplicator backgroundStyleApplicator = INSTANCE;
        CompositeBackgroundDrawable compositeBackgroundDrawableEnsureCompositeBackgroundDrawable = backgroundStyleApplicator.ensureCompositeBackgroundDrawable(view);
        BorderInsets borderInsets = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBorderInsets();
        if (borderInsets == null) {
            borderInsets = new BorderInsets();
        }
        compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.setBorderInsets(borderInsets);
        BorderInsets borderInsets2 = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBorderInsets();
        if (borderInsets2 != null) {
            borderInsets2.setBorderWidth(edge, width);
        }
        backgroundStyleApplicator.ensureBorderDrawable(view).setBorderWidth(edge.toSpacingType(), width != null ? PixelUtil.INSTANCE.dpToPx(width.floatValue()) : Float.NaN);
        BackgroundDrawable background = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBackground();
        if (background != null) {
            background.setBorderInsets(compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBorderInsets());
        }
        BackgroundImageDrawable backgroundImage = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBackgroundImage();
        if (backgroundImage != null) {
            backgroundImage.setBorderInsets(compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBorderInsets());
        }
        BorderDrawable border = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBorder();
        if (border != null) {
            border.setBorderInsets(compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBorderInsets());
        }
        BackgroundDrawable background2 = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBackground();
        if (background2 != null) {
            background2.invalidateSelf();
        }
        BackgroundImageDrawable backgroundImage2 = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBackgroundImage();
        if (backgroundImage2 != null) {
            backgroundImage2.invalidateSelf();
        }
        BorderDrawable border2 = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBorder();
        if (border2 != null) {
            border2.invalidateSelf();
        }
        BorderInsets borderInsets3 = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBorderInsets();
        if (borderInsets3 == null) {
            borderInsets3 = new BorderInsets();
        }
        compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.setBorderInsets(borderInsets3);
        BorderInsets borderInsets4 = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBorderInsets();
        if (borderInsets4 != null) {
            borderInsets4.setBorderWidth(edge, width);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            List<Drawable> innerShadows = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getInnerShadows();
            ArrayList arrayList = new ArrayList();
            for (Object obj : innerShadows) {
                if (obj instanceof InsetBoxShadowDrawable) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InsetBoxShadowDrawable) it.next()).setBorderInsets(compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBorderInsets());
            }
        }
    }

    public static final void setBoxShadow(View view, List<BoxShadow> shadows) {
        AbstractC2855l.g(view, "view");
        AbstractC2855l.g(shadows, "shadows");
        if (ViewUtil.getUIManagerType(view) != 2) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        CompositeBackgroundDrawable compositeBackgroundDrawableEnsureCompositeBackgroundDrawable = INSTANCE.ensureCompositeBackgroundDrawable(view);
        BorderInsets borderInsets = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBorderInsets();
        BorderRadiusStyle borderRadius = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBorderRadius();
        for (BoxShadow boxShadow : shadows) {
            float offsetX = boxShadow.getOffsetX();
            float offsetY = boxShadow.getOffsetY();
            Integer color = boxShadow.getColor();
            int iIntValue = color != null ? color.intValue() : -16777216;
            Float blurRadius = boxShadow.getBlurRadius();
            float fFloatValue = blurRadius != null ? blurRadius.floatValue() : 0.0f;
            Float spreadDistance = boxShadow.getSpreadDistance();
            float fFloatValue2 = spreadDistance != null ? spreadDistance.floatValue() : 0.0f;
            Boolean inset = boxShadow.getInset();
            boolean zBooleanValue = inset != null ? inset.booleanValue() : false;
            if (zBooleanValue && Build.VERSION.SDK_INT >= 29) {
                Context context = view.getContext();
                AbstractC2855l.f(context, "getContext(...)");
                arrayList.add(new InsetBoxShadowDrawable(context, iIntValue, offsetX, offsetY, fFloatValue, fFloatValue2, borderInsets, borderRadius));
            } else if (!zBooleanValue && Build.VERSION.SDK_INT >= 28) {
                Context context2 = view.getContext();
                AbstractC2855l.f(context2, "getContext(...)");
                arrayList2.add(new OutsetBoxShadowDrawable(context2, iIntValue, offsetX, offsetY, fFloatValue, fFloatValue2, borderRadius));
            }
        }
        view.setBackground(INSTANCE.ensureCompositeBackgroundDrawable(view).withNewShadows(arrayList2, arrayList));
    }

    public static final void setFeedbackUnderlay(View view, Drawable drawable) {
        AbstractC2855l.g(view, "view");
        INSTANCE.ensureCompositeBackgroundDrawable(view).withNewFeedbackUnderlay(drawable);
    }

    public static final void setOutlineColor(View view, Integer outlineColor) {
        AbstractC2855l.g(view, "view");
        if (ViewUtil.getUIManagerType(view) != 2) {
            return;
        }
        OutlineDrawable outlineDrawableEnsureOutlineDrawable = INSTANCE.ensureOutlineDrawable(view);
        if (outlineColor != null) {
            outlineDrawableEnsureOutlineDrawable.setOutlineColor(outlineColor.intValue());
        }
    }

    public static final void setOutlineOffset(View view, float outlineOffset) {
        AbstractC2855l.g(view, "view");
        if (ViewUtil.getUIManagerType(view) != 2) {
            return;
        }
        INSTANCE.ensureOutlineDrawable(view).setOutlineOffset(PixelUtil.INSTANCE.dpToPx(outlineOffset));
    }

    public static final void setOutlineStyle(View view, OutlineStyle outlineStyle) {
        AbstractC2855l.g(view, "view");
        if (ViewUtil.getUIManagerType(view) != 2) {
            return;
        }
        OutlineDrawable outlineDrawableEnsureOutlineDrawable = INSTANCE.ensureOutlineDrawable(view);
        if (outlineStyle != null) {
            outlineDrawableEnsureOutlineDrawable.setOutlineStyle(outlineStyle);
        }
    }

    public static final void setOutlineWidth(View view, float width) {
        AbstractC2855l.g(view, "view");
        if (ViewUtil.getUIManagerType(view) != 2) {
            return;
        }
        INSTANCE.ensureOutlineDrawable(view).setOutlineWidth(PixelUtil.INSTANCE.dpToPx(width));
    }

    public final Float getOutlineOffset(View view) {
        AbstractC2855l.g(view, "view");
        OutlineDrawable outlineDrawable = getOutlineDrawable(view);
        if (outlineDrawable != null) {
            return Float.valueOf(outlineDrawable.getOutlineOffset());
        }
        return null;
    }

    public final OutlineStyle getOutlineStyle(View view) {
        AbstractC2855l.g(view, "view");
        OutlineDrawable outlineDrawable = getOutlineDrawable(view);
        if (outlineDrawable != null) {
            return outlineDrawable.getOutlineStyle();
        }
        return null;
    }

    public final Float getOutlineWidth(View view) {
        AbstractC2855l.g(view, "view");
        OutlineDrawable outlineDrawable = getOutlineDrawable(view);
        if (outlineDrawable != null) {
            return Float.valueOf(outlineDrawable.getOutlineOffset());
        }
        return null;
    }

    public static final void setBoxShadow(View view, ReadableArray shadows) {
        AbstractC2855l.g(view, "view");
        if (shadows == null) {
            setBoxShadow(view, (List<BoxShadow>) AbstractC2800q.j());
            return;
        }
        ArrayList arrayList = new ArrayList();
        int size = shadows.size();
        for (int i10 = 0; i10 < size; i10++) {
            BoxShadow.Companion companion = BoxShadow.INSTANCE;
            ReadableMap map = shadows.getMap(i10);
            Context context = view.getContext();
            AbstractC2855l.f(context, "getContext(...)");
            BoxShadow boxShadow = companion.parse(map, context);
            if (boxShadow == null) {
                throw new IllegalStateException("Required value was null.");
            }
            arrayList.add(boxShadow);
        }
        setBoxShadow(view, arrayList);
    }
}
