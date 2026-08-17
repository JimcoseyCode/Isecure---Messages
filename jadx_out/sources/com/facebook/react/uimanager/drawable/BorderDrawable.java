package com.facebook.react.uimanager.drawable;

import C7.k;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.facebook.react.uimanager.FloatUtil;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.Spacing;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.uimanager.style.BorderColors;
import com.facebook.react.uimanager.style.BorderInsets;
import com.facebook.react.uimanager.style.BorderRadiusProp;
import com.facebook.react.uimanager.style.BorderRadiusStyle;
import com.facebook.react.uimanager.style.BorderStyle;
import com.facebook.react.uimanager.style.ColorEdges;
import com.facebook.react.uimanager.style.ComputedBorderRadius;
import com.facebook.react.uimanager.style.CornerRadii;
import com.facebook.react.uimanager.style.LogicalEdge;
import i7.C2735B;
import i7.C2750m;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.p;
import kotlin.properties.d;
import l7.AbstractC2884a;
import y7.AbstractC3624a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001cJO\u0010'\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u001eH\u0002¢\u0006\u0004\b'\u0010(J_\u00102\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\u00142\u0006\u0010-\u001a\u00020\u00142\u0006\u0010.\u001a\u00020\u00142\u0006\u0010/\u001a\u00020\u00142\u0006\u00100\u001a\u00020\u00142\u0006\u00101\u001a\u00020\u0014H\u0002¢\u0006\u0004\b2\u00103J\u000f\u00105\u001a\u000204H\u0002¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0014H\u0002¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u001aH\u0002¢\u0006\u0004\b9\u0010:J\u0017\u00109\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u001eH\u0002¢\u0006\u0004\b9\u0010;J!\u0010>\u001a\u0004\u0018\u00010=2\u0006\u0010<\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0014H\u0002¢\u0006\u0004\b>\u0010?JW\u0010K\u001a\u00020\u001a2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020@2\u0006\u0010C\u001a\u00020@2\u0006\u0010D\u001a\u00020@2\u0006\u0010E\u001a\u00020@2\u0006\u0010F\u001a\u00020@2\u0006\u0010G\u001a\u00020@2\u0006\u0010H\u001a\u00020@2\u0006\u0010J\u001a\u00020IH\u0002¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020\u001aH\u0002¢\u0006\u0004\bM\u0010:J\u001f\u0010P\u001a\u00020\u001e2\u0006\u0010N\u001a\u00020\u001e2\u0006\u0010O\u001a\u00020\u001eH\u0002¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020\u001aH\u0016¢\u0006\u0004\bR\u0010:J\u0017\u0010U\u001a\u00020\u001a2\u0006\u0010T\u001a\u00020SH\u0014¢\u0006\u0004\bU\u0010VJ\u0017\u0010X\u001a\u00020\u001a2\u0006\u0010W\u001a\u00020\u001eH\u0016¢\u0006\u0004\bX\u0010;J\u0019\u0010[\u001a\u00020\u001a2\b\u0010Z\u001a\u0004\u0018\u00010YH\u0016¢\u0006\u0004\b[\u0010\\J\u000f\u0010]\u001a\u00020\u001eH\u0017¢\u0006\u0004\b]\u0010^J\u0017\u0010_\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b_\u0010\u001cJ\u001d\u0010b\u001a\u00020\u001a2\u0006\u0010`\u001a\u00020\u001e2\u0006\u0010a\u001a\u00020\u0014¢\u0006\u0004\bb\u0010cJ\u001f\u0010h\u001a\u00020\u001a2\u0006\u0010e\u001a\u00020d2\b\u0010g\u001a\u0004\u0018\u00010f¢\u0006\u0004\bh\u0010iJ\u0017\u0010k\u001a\u00020\u001a2\b\u0010<\u001a\u0004\u0018\u00010j¢\u0006\u0004\bk\u0010lJ\u001f\u0010n\u001a\u00020\u001a2\u0006\u0010`\u001a\u00020m2\b\u0010N\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\bn\u0010oJ\u0015\u0010p\u001a\u00020\u001e2\u0006\u0010`\u001a\u00020m¢\u0006\u0004\bp\u0010qR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010s\u001a\u0004\bt\u0010uR$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010v\u001a\u0004\bw\u0010x\"\u0004\bh\u0010yR$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R4\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u007f\u001a\u0004\u0018\u00010\n8F@FX\u0086\u008e\u0002¢\u0006\u0017\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0005\bk\u0010\u0084\u0001R\u001c\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0085\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u001a\u0010\u0089\u0001\u001a\u00030\u0088\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001c\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u008b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0019\u0010\u008e\u0001\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0017\u0010\u0090\u0001\u001a\u00020\u00148\u0002X\u0082D¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001c\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u0092\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0018\u0010\u0096\u0001\u001a\u00030\u0095\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u001a\u0010\u0099\u0001\u001a\u00030\u0098\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u001c\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u0092\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u0094\u0001R\u001c\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u0092\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u0094\u0001R\u001c\u0010\u009d\u0001\u001a\u0005\u0018\u00010\u0092\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u0094\u0001R\u001c\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u0092\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u0094\u0001R0\u0010 \u0001\u001a\u0005\u0018\u00010\u0092\u00012\n\u0010\u009f\u0001\u001a\u0005\u0018\u00010\u0092\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b \u0001\u0010\u0094\u0001\u001a\u0006\b¡\u0001\u0010¢\u0001R\u001b\u0010£\u0001\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u001b\u0010¥\u0001\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0001\u0010¤\u0001R\u001b\u0010¦\u0001\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¦\u0001\u0010¤\u0001R\u001b\u0010§\u0001\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0001\u0010¤\u0001R\u001b\u0010¨\u0001\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R\u001b\u0010ª\u0001\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0001\u0010©\u0001R\u001b\u0010«\u0001\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b«\u0001\u0010©\u0001¨\u0006¬\u0001"}, d2 = {"Lcom/facebook/react/uimanager/drawable/BorderDrawable;", "Landroid/graphics/drawable/Drawable;", "Landroid/content/Context;", "context", "Lcom/facebook/react/uimanager/Spacing;", ViewProps.BORDER_WIDTH, "Lcom/facebook/react/uimanager/style/BorderRadiusStyle;", ViewProps.BORDER_RADIUS, "Lcom/facebook/react/uimanager/style/BorderInsets;", "borderInsets", "Lcom/facebook/react/uimanager/style/BorderStyle;", "borderStyle", "<init>", "(Landroid/content/Context;Lcom/facebook/react/uimanager/Spacing;Lcom/facebook/react/uimanager/style/BorderRadiusStyle;Lcom/facebook/react/uimanager/style/BorderInsets;Lcom/facebook/react/uimanager/style/BorderStyle;)V", "T", "initialValue", "Lkotlin/properties/d;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "invalidatingAndPathChange", "(Ljava/lang/Object;)Lkotlin/properties/d;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "computedRadius", "getInnerBorderRadius", "(FF)F", "Landroid/graphics/Canvas;", "canvas", "Li7/B;", "drawRectangularBorders", "(Landroid/graphics/Canvas;)V", "drawRoundedBorders", PointerEventHelper.POINTER_TYPE_UNKNOWN, "borderLeft", "borderTop", "borderRight", "borderBottom", "colorLeft", "colorTop", "colorRight", "colorBottom", "fastBorderCompatibleColorOrZero", "(IIIIIIII)I", "fillColor", "x1", "y1", "x2", "y2", "x3", "y3", "x4", "y4", "drawQuadrilateral", "(Landroid/graphics/Canvas;IFFFFFFFF)V", "Landroid/graphics/RectF;", "computeBorderInsets", "()Landroid/graphics/RectF;", "getFullBorderWidth", "()F", "updatePathEffect", "()V", "(I)V", "style", "Landroid/graphics/PathEffect;", "getPathEffect", "(Lcom/facebook/react/uimanager/style/BorderStyle;F)Landroid/graphics/PathEffect;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "ellipseBoundsLeft", "ellipseBoundsTop", "ellipseBoundsRight", "ellipseBoundsBottom", "lineStartX", "lineStartY", "lineEndX", "lineEndY", "Landroid/graphics/PointF;", "result", "getEllipseIntersectionWithLine", "(DDDDDDDDLandroid/graphics/PointF;)V", "updatePath", ViewProps.COLOR, "rawAlpha", "multiplyColorAlpha", "(II)I", "invalidateSelf", "Landroid/graphics/Rect;", "bounds", "onBoundsChange", "(Landroid/graphics/Rect;)V", "alpha", "setAlpha", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getOpacity", "()I", "draw", ViewProps.POSITION, "width", "setBorderWidth", "(IF)V", "Lcom/facebook/react/uimanager/style/BorderRadiusProp;", "property", "Lcom/facebook/react/uimanager/LengthPercentage;", "radius", "setBorderRadius", "(Lcom/facebook/react/uimanager/style/BorderRadiusProp;Lcom/facebook/react/uimanager/LengthPercentage;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "setBorderStyle", "(Ljava/lang/String;)V", "Lcom/facebook/react/uimanager/style/LogicalEdge;", "setBorderColor", "(Lcom/facebook/react/uimanager/style/LogicalEdge;Ljava/lang/Integer;)V", "getBorderColor", "(Lcom/facebook/react/uimanager/style/LogicalEdge;)I", "Landroid/content/Context;", "Lcom/facebook/react/uimanager/Spacing;", "getBorderWidth", "()Lcom/facebook/react/uimanager/Spacing;", "Lcom/facebook/react/uimanager/style/BorderRadiusStyle;", "getBorderRadius", "()Lcom/facebook/react/uimanager/style/BorderRadiusStyle;", "(Lcom/facebook/react/uimanager/style/BorderRadiusStyle;)V", "Lcom/facebook/react/uimanager/style/BorderInsets;", "getBorderInsets", "()Lcom/facebook/react/uimanager/style/BorderInsets;", "setBorderInsets", "(Lcom/facebook/react/uimanager/style/BorderInsets;)V", "<set-?>", "borderStyle$delegate", "Lkotlin/properties/d;", "getBorderStyle", "()Lcom/facebook/react/uimanager/style/BorderStyle;", "(Lcom/facebook/react/uimanager/style/BorderStyle;)V", "Lcom/facebook/react/uimanager/style/BorderColors;", "borderColors", "[Ljava/lang/Integer;", "Lcom/facebook/react/uimanager/style/ColorEdges;", "computedBorderColors", "Lcom/facebook/react/uimanager/style/ColorEdges;", "Lcom/facebook/react/uimanager/style/ComputedBorderRadius;", "computedBorderRadius", "Lcom/facebook/react/uimanager/style/ComputedBorderRadius;", "borderAlpha", "I", "gapBetweenPaths", "F", "Landroid/graphics/Path;", "pathForBorder", "Landroid/graphics/Path;", "Landroid/graphics/Paint;", "borderPaint", "Landroid/graphics/Paint;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "needUpdatePath", "Z", "pathForSingleBorder", "pathForOutline", "centerDrawPath", "outerClipPathForBorderRadius", "value", "innerClipPathForBorderRadius", "getInnerClipPathForBorderRadius", "()Landroid/graphics/Path;", "innerBottomLeftCorner", "Landroid/graphics/PointF;", "innerBottomRightCorner", "innerTopLeftCorner", "innerTopRightCorner", "innerClipTempRectForBorderRadius", "Landroid/graphics/RectF;", "outerClipTempRectForBorderRadius", "tempRectForCenterDrawPath", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BorderDrawable extends Drawable {
    static final /* synthetic */ k[] $$delegatedProperties = {D.e(new p(BorderDrawable.class, "borderStyle", "getBorderStyle()Lcom/facebook/react/uimanager/style/BorderStyle;", 0))};
    private int borderAlpha;
    private Integer[] borderColors;
    private BorderInsets borderInsets;
    private final Paint borderPaint;
    private BorderRadiusStyle borderRadius;

    /* JADX INFO: renamed from: borderStyle$delegate, reason: from kotlin metadata */
    private final d borderStyle;
    private final Spacing borderWidth;
    private Path centerDrawPath;
    private ColorEdges computedBorderColors;
    private ComputedBorderRadius computedBorderRadius;
    private final Context context;
    private final float gapBetweenPaths;
    private PointF innerBottomLeftCorner;
    private PointF innerBottomRightCorner;
    private Path innerClipPathForBorderRadius;
    private RectF innerClipTempRectForBorderRadius;
    private PointF innerTopLeftCorner;
    private PointF innerTopRightCorner;
    private boolean needUpdatePath;
    private Path outerClipPathForBorderRadius;
    private RectF outerClipTempRectForBorderRadius;
    private Path pathForBorder;
    private Path pathForOutline;
    private Path pathForSingleBorder;
    private RectF tempRectForCenterDrawPath;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BorderStyle.values().length];
            try {
                iArr[BorderStyle.SOLID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BorderStyle.DASHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BorderStyle.DOTTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public BorderDrawable(Context context, Spacing spacing, BorderRadiusStyle borderRadiusStyle, BorderInsets borderInsets, BorderStyle borderStyle) {
        AbstractC2855l.g(context, "context");
        this.context = context;
        this.borderWidth = spacing;
        this.borderRadius = borderRadiusStyle;
        this.borderInsets = borderInsets;
        this.borderStyle = invalidatingAndPathChange(borderStyle);
        this.computedBorderColors = new ColorEdges(0, 0, 0, 0, 15, null);
        this.borderAlpha = 255;
        this.gapBetweenPaths = 0.8f;
        this.borderPaint = new Paint(1);
        this.needUpdatePath = true;
    }

    private final RectF computeBorderInsets() {
        RectF rectFResolve;
        BorderInsets borderInsets = this.borderInsets;
        if (borderInsets == null || (rectFResolve = borderInsets.resolve(getLayoutDirection(), this.context)) == null) {
            return new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        }
        return new RectF(Float.isNaN(rectFResolve.left) ? 0.0f : PixelUtil.INSTANCE.dpToPx(rectFResolve.left), Float.isNaN(rectFResolve.top) ? 0.0f : PixelUtil.INSTANCE.dpToPx(rectFResolve.top), Float.isNaN(rectFResolve.right) ? 0.0f : PixelUtil.INSTANCE.dpToPx(rectFResolve.right), Float.isNaN(rectFResolve.bottom) ? 0.0f : PixelUtil.INSTANCE.dpToPx(rectFResolve.bottom));
    }

    private final void drawQuadrilateral(Canvas canvas, int fillColor, float x12, float y12, float x22, float y22, float x32, float y32, float x42, float y42) {
        if (fillColor == 0) {
            return;
        }
        if (this.pathForBorder == null) {
            this.pathForBorder = new Path();
        }
        this.borderPaint.setColor(multiplyColorAlpha(fillColor, this.borderAlpha));
        Path path = this.pathForBorder;
        if (path != null) {
            path.reset();
        }
        Path path2 = this.pathForBorder;
        if (path2 != null) {
            path2.moveTo(x12, y12);
        }
        Path path3 = this.pathForBorder;
        if (path3 != null) {
            path3.lineTo(x22, y22);
        }
        Path path4 = this.pathForBorder;
        if (path4 != null) {
            path4.lineTo(x32, y32);
        }
        Path path5 = this.pathForBorder;
        if (path5 != null) {
            path5.lineTo(x42, y42);
        }
        Path path6 = this.pathForBorder;
        if (path6 != null) {
            path6.lineTo(x12, y12);
        }
        Path path7 = this.pathForBorder;
        if (path7 != null) {
            canvas.drawPath(path7, this.borderPaint);
        }
    }

    private final void drawRectangularBorders(Canvas canvas) {
        RectF rectFComputeBorderInsets = computeBorderInsets();
        int iC = AbstractC3624a.c(rectFComputeBorderInsets.left);
        int iC2 = AbstractC3624a.c(rectFComputeBorderInsets.top);
        int iC3 = AbstractC3624a.c(rectFComputeBorderInsets.right);
        int iC4 = AbstractC3624a.c(rectFComputeBorderInsets.bottom);
        if (iC > 0 || iC3 > 0 || iC2 > 0 || iC4 > 0) {
            Rect bounds = getBounds();
            AbstractC2855l.f(bounds, "getBounds(...)");
            int i10 = bounds.left;
            int i11 = bounds.top;
            int iFastBorderCompatibleColorOrZero = fastBorderCompatibleColorOrZero(iC, iC2, iC3, iC4, this.computedBorderColors.getLeft(), this.computedBorderColors.getTop(), this.computedBorderColors.getRight(), this.computedBorderColors.getBottom());
            if (iFastBorderCompatibleColorOrZero == 0) {
                this.borderPaint.setAntiAlias(false);
                int iWidth = bounds.width();
                int iHeight = bounds.height();
                if (iC > 0) {
                    float f10 = i10;
                    float f11 = i10 + iC;
                    int left = this.computedBorderColors.getLeft();
                    drawQuadrilateral(canvas, left, f10, i11, f11, i11 + iC2, f11, r1 - iC4, f10, i11 + iHeight);
                }
                if (iC2 > 0) {
                    float f12 = i11;
                    float f13 = i11 + iC2;
                    int top = this.computedBorderColors.getTop();
                    drawQuadrilateral(canvas, top, i10, f12, i10 + iC, f13, r1 - iC3, f13, i10 + iWidth, f12);
                }
                if (iC3 > 0) {
                    int i12 = i10 + iWidth;
                    float f14 = i12;
                    int i13 = i11 + iHeight;
                    float f15 = i12 - iC3;
                    drawQuadrilateral(canvas, this.computedBorderColors.getRight(), f14, i11, f14, i13, f15, i13 - iC4, f15, i11 + iC2);
                }
                if (iC4 > 0) {
                    int i14 = i11 + iHeight;
                    float f16 = i14;
                    float f17 = i14 - iC4;
                    drawQuadrilateral(canvas, this.computedBorderColors.getBottom(), i10, f16, i10 + iWidth, f16, r1 - iC3, f17, i10 + iC, f17);
                }
                this.borderPaint.setAntiAlias(true);
                return;
            }
            if (Color.alpha(iFastBorderCompatibleColorOrZero) != 0) {
                int i15 = bounds.right;
                int i16 = bounds.bottom;
                this.borderPaint.setColor(multiplyColorAlpha(iFastBorderCompatibleColorOrZero, this.borderAlpha));
                this.borderPaint.setStyle(Paint.Style.STROKE);
                Path path = new Path();
                this.pathForSingleBorder = path;
                if (iC > 0) {
                    path.reset();
                    int iC5 = AbstractC3624a.c(rectFComputeBorderInsets.left);
                    updatePathEffect(iC5);
                    this.borderPaint.setStrokeWidth(iC5);
                    Path path2 = this.pathForSingleBorder;
                    if (path2 != null) {
                        path2.moveTo((iC5 / 2) + i10, i11);
                    }
                    Path path3 = this.pathForSingleBorder;
                    if (path3 != null) {
                        path3.lineTo((iC5 / 2) + i10, i16);
                    }
                    Path path4 = this.pathForSingleBorder;
                    if (path4 != null) {
                        canvas.drawPath(path4, this.borderPaint);
                    }
                }
                if (iC2 > 0) {
                    Path path5 = this.pathForSingleBorder;
                    if (path5 != null) {
                        path5.reset();
                    }
                    int iC6 = AbstractC3624a.c(rectFComputeBorderInsets.top);
                    updatePathEffect(iC6);
                    this.borderPaint.setStrokeWidth(iC6);
                    Path path6 = this.pathForSingleBorder;
                    if (path6 != null) {
                        path6.moveTo(i10, (iC6 / 2) + i11);
                    }
                    Path path7 = this.pathForSingleBorder;
                    if (path7 != null) {
                        path7.lineTo(i15, (iC6 / 2) + i11);
                    }
                    Path path8 = this.pathForSingleBorder;
                    if (path8 != null) {
                        canvas.drawPath(path8, this.borderPaint);
                    }
                }
                if (iC3 > 0) {
                    Path path9 = this.pathForSingleBorder;
                    if (path9 != null) {
                        path9.reset();
                    }
                    int iC7 = AbstractC3624a.c(rectFComputeBorderInsets.right);
                    updatePathEffect(iC7);
                    this.borderPaint.setStrokeWidth(iC7);
                    Path path10 = this.pathForSingleBorder;
                    if (path10 != null) {
                        path10.moveTo(i15 - (iC7 / 2), i11);
                    }
                    Path path11 = this.pathForSingleBorder;
                    if (path11 != null) {
                        path11.lineTo(i15 - (iC7 / 2), i16);
                    }
                    Path path12 = this.pathForSingleBorder;
                    if (path12 != null) {
                        canvas.drawPath(path12, this.borderPaint);
                    }
                }
                if (iC4 > 0) {
                    Path path13 = this.pathForSingleBorder;
                    if (path13 != null) {
                        path13.reset();
                    }
                    int iC8 = AbstractC3624a.c(rectFComputeBorderInsets.bottom);
                    updatePathEffect(iC8);
                    this.borderPaint.setStrokeWidth(iC8);
                    Path path14 = this.pathForSingleBorder;
                    if (path14 != null) {
                        path14.moveTo(i10, i16 - (iC8 / 2));
                    }
                    Path path15 = this.pathForSingleBorder;
                    if (path15 != null) {
                        path15.lineTo(i15, i16 - (iC8 / 2));
                    }
                    Path path16 = this.pathForSingleBorder;
                    if (path16 != null) {
                        canvas.drawPath(path16, this.borderPaint);
                    }
                }
            }
        }
    }

    private final void drawRoundedBorders(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        float f13;
        PointF pointF;
        PointF pointF2;
        PointF pointF3;
        PointF pointF4;
        CornerRadii topLeft;
        CornerRadii pixelFromDIP;
        CornerRadii topLeft2;
        CornerRadii pixelFromDIP2;
        updatePath();
        canvas.save();
        Path path = this.outerClipPathForBorderRadius;
        if (path == null) {
            throw new IllegalStateException("Required value was null.");
        }
        canvas.clipPath(path);
        RectF rectFComputeBorderInsets = computeBorderInsets();
        float vertical = 0.0f;
        if (rectFComputeBorderInsets.top > 0.0f || rectFComputeBorderInsets.bottom > 0.0f || rectFComputeBorderInsets.left > 0.0f || rectFComputeBorderInsets.right > 0.0f) {
            float fullBorderWidth = getFullBorderWidth();
            int borderColor = getBorderColor(LogicalEdge.ALL);
            if (rectFComputeBorderInsets.top != fullBorderWidth || rectFComputeBorderInsets.bottom != fullBorderWidth || rectFComputeBorderInsets.left != fullBorderWidth || rectFComputeBorderInsets.right != fullBorderWidth || this.computedBorderColors.getLeft() != borderColor || this.computedBorderColors.getTop() != borderColor || this.computedBorderColors.getRight() != borderColor || this.computedBorderColors.getBottom() != borderColor) {
                this.borderPaint.setStyle(Paint.Style.FILL);
                if (Build.VERSION.SDK_INT >= 26) {
                    Path path2 = this.innerClipPathForBorderRadius;
                    if (path2 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    canvas.clipOutPath(path2);
                } else {
                    Path path3 = this.innerClipPathForBorderRadius;
                    if (path3 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    canvas.clipPath(path3, Region.Op.DIFFERENCE);
                }
                RectF rectF = this.outerClipTempRectForBorderRadius;
                if (rectF == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                float f14 = rectF.left;
                float f15 = rectF.right;
                float f16 = rectF.top;
                float f17 = rectF.bottom;
                PointF pointF5 = this.innerTopLeftCorner;
                if (pointF5 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                PointF pointF6 = this.innerTopRightCorner;
                if (pointF6 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                PointF pointF7 = this.innerBottomLeftCorner;
                if (pointF7 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                PointF pointF8 = this.innerBottomRightCorner;
                if (pointF8 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                if (rectFComputeBorderInsets.left > 0.0f) {
                    float f18 = this.gapBetweenPaths;
                    f10 = 0.0f;
                    float f19 = f18 + f17;
                    f13 = f17;
                    pointF4 = pointF8;
                    f11 = f15;
                    pointF2 = pointF6;
                    f12 = f16;
                    pointF3 = pointF7;
                    pointF = pointF5;
                    drawQuadrilateral(canvas, this.computedBorderColors.getLeft(), f14, f16 - f18, pointF5.x, pointF5.y - f18, pointF7.x, pointF7.y + f18, f14, f19);
                } else {
                    f10 = 0.0f;
                    f11 = f15;
                    f12 = f16;
                    f13 = f17;
                    pointF = pointF5;
                    pointF2 = pointF6;
                    pointF3 = pointF7;
                    pointF4 = pointF8;
                }
                if (rectFComputeBorderInsets.top > f10) {
                    float f20 = this.gapBetweenPaths;
                    drawQuadrilateral(canvas, this.computedBorderColors.getTop(), f14 - f20, f12, pointF.x - f20, pointF.y, pointF2.x + f20, pointF2.y, f11 + f20, f12);
                }
                if (rectFComputeBorderInsets.right > f10) {
                    float f21 = this.gapBetweenPaths;
                    drawQuadrilateral(canvas, this.computedBorderColors.getRight(), f11, f12 - f21, pointF2.x, pointF2.y - f21, pointF4.x, pointF4.y + f21, f11, f13 + f21);
                }
                if (rectFComputeBorderInsets.bottom > f10) {
                    float f22 = this.gapBetweenPaths;
                    drawQuadrilateral(canvas, this.computedBorderColors.getBottom(), f14 - f22, f13, pointF3.x - f22, pointF3.y, pointF4.x + f22, pointF4.y, f11 + f22, f13);
                }
            } else if (fullBorderWidth > 0.0f) {
                this.borderPaint.setColor(multiplyColorAlpha(borderColor, this.borderAlpha));
                this.borderPaint.setStyle(Paint.Style.STROKE);
                this.borderPaint.setStrokeWidth(fullBorderWidth);
                ComputedBorderRadius computedBorderRadius = this.computedBorderRadius;
                if (computedBorderRadius == null || !computedBorderRadius.isUniform()) {
                    Path path4 = this.centerDrawPath;
                    if (path4 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    canvas.drawPath(path4, this.borderPaint);
                } else {
                    RectF rectF2 = this.tempRectForCenterDrawPath;
                    if (rectF2 != null) {
                        ComputedBorderRadius computedBorderRadius2 = this.computedBorderRadius;
                        float horizontal = ((computedBorderRadius2 == null || (topLeft2 = computedBorderRadius2.getTopLeft()) == null || (pixelFromDIP2 = topLeft2.toPixelFromDIP()) == null) ? 0.0f : pixelFromDIP2.getHorizontal()) - (rectFComputeBorderInsets.left * 0.5f);
                        ComputedBorderRadius computedBorderRadius3 = this.computedBorderRadius;
                        if (computedBorderRadius3 != null && (topLeft = computedBorderRadius3.getTopLeft()) != null && (pixelFromDIP = topLeft.toPixelFromDIP()) != null) {
                            vertical = pixelFromDIP.getVertical();
                        }
                        canvas.drawRoundRect(rectF2, horizontal, vertical - (rectFComputeBorderInsets.top * 0.5f), this.borderPaint);
                    }
                }
            }
        }
        canvas.restore();
    }

    private final int fastBorderCompatibleColorOrZero(int borderLeft, int borderTop, int borderRight, int borderBottom, int colorLeft, int colorTop, int colorRight, int colorBottom) {
        if (Color.alpha(colorLeft) >= 255 && Color.alpha(colorTop) >= 255 && Color.alpha(colorRight) >= 255 && Color.alpha(colorBottom) >= 255) {
            int i10 = (borderBottom > 0 ? colorBottom : -1) & (borderLeft > 0 ? colorLeft : -1) & (borderTop > 0 ? colorTop : -1) & (borderRight > 0 ? colorRight : -1);
            if (borderLeft <= 0) {
                colorLeft = 0;
            }
            if (borderTop <= 0) {
                colorTop = 0;
            }
            int i11 = colorLeft | colorTop;
            if (borderRight <= 0) {
                colorRight = 0;
            }
            int i12 = i11 | colorRight;
            if (borderBottom <= 0) {
                colorBottom = 0;
            }
            if (i10 == (i12 | colorBottom)) {
                return i10;
            }
        }
        return 0;
    }

    private final void getEllipseIntersectionWithLine(double ellipseBoundsLeft, double ellipseBoundsTop, double ellipseBoundsRight, double ellipseBoundsBottom, double lineStartX, double lineStartY, double lineEndX, double lineEndY, PointF result) {
        double d10 = 2;
        double d11 = (ellipseBoundsLeft + ellipseBoundsRight) / d10;
        double d12 = (ellipseBoundsTop + ellipseBoundsBottom) / d10;
        double d13 = lineStartX - d11;
        double d14 = lineStartY - d12;
        double dAbs = Math.abs(ellipseBoundsRight - ellipseBoundsLeft) / d10;
        double dAbs2 = Math.abs(ellipseBoundsBottom - ellipseBoundsTop) / d10;
        double d15 = ((lineEndY - d12) - d14) / ((lineEndX - d11) - d13);
        double d16 = d14 - (d13 * d15);
        double d17 = dAbs2 * dAbs2;
        double d18 = dAbs * dAbs;
        double d19 = d17 + (d18 * d15 * d15);
        double d20 = d10 * dAbs * dAbs * d16 * d15;
        double d21 = d10 * d19;
        double dSqrt = ((-d20) / d21) - Math.sqrt(((-(d18 * ((d16 * d16) - d17))) / d19) + Math.pow(d20 / d21, 2.0d));
        double d22 = (d15 * dSqrt) + d16;
        double d23 = dSqrt + d11;
        double d24 = d22 + d12;
        if (Double.isNaN(d23) || Double.isNaN(d24)) {
            return;
        }
        result.x = (float) d23;
        result.y = (float) d24;
    }

    private final float getFullBorderWidth() {
        Spacing spacing = this.borderWidth;
        float raw = spacing != null ? spacing.getRaw(8) : Float.NaN;
        if (Float.isNaN(raw)) {
            return 0.0f;
        }
        return raw;
    }

    private final float getInnerBorderRadius(float computedRadius, float borderWidth) {
        return B7.d.c(computedRadius - borderWidth, 0.0f);
    }

    private final PathEffect getPathEffect(BorderStyle style, float borderWidth) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
        if (i10 == 1) {
            return null;
        }
        if (i10 == 2) {
            float f10 = borderWidth * 3;
            return new DashPathEffect(new float[]{f10, f10, f10, f10}, 0.0f);
        }
        if (i10 == 3) {
            return new DashPathEffect(new float[]{borderWidth, borderWidth, borderWidth, borderWidth}, 0.0f);
        }
        throw new C2750m();
    }

    private final <T> d invalidatingAndPathChange(T initialValue) {
        return new kotlin.properties.b(initialValue) { // from class: com.facebook.react.uimanager.drawable.BorderDrawable.invalidatingAndPathChange.1
            @Override // kotlin.properties.b
            protected void afterChange(k property, T oldValue, T newValue) {
                AbstractC2855l.g(property, "property");
                if (AbstractC2855l.b(oldValue, newValue)) {
                    return;
                }
                this.needUpdatePath = true;
                this.invalidateSelf();
            }
        };
    }

    private final int multiplyColorAlpha(int color, int rawAlpha) {
        if (rawAlpha == 255) {
            return color;
        }
        if (rawAlpha == 0) {
            return color & 16777215;
        }
        return (color & 16777215) | ((((color >>> 24) * ((rawAlpha + (rawAlpha >> 7)) >> 7)) >> 8) << 24);
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x02f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void updatePath() {
        ComputedBorderRadius computedBorderRadiusResolve;
        CornerRadii cornerRadii;
        CornerRadii cornerRadii2;
        CornerRadii cornerRadii3;
        CornerRadii cornerRadii4;
        char c10;
        char c11;
        char c12;
        Path path;
        int i10;
        Path path2;
        Path path3;
        CornerRadii bottomRight;
        CornerRadii bottomLeft;
        CornerRadii topRight;
        CornerRadii topLeft;
        if (this.needUpdatePath) {
            this.needUpdatePath = false;
            Path path4 = this.innerClipPathForBorderRadius;
            if (path4 == null) {
                path4 = new Path();
            }
            this.innerClipPathForBorderRadius = path4;
            Path path5 = this.outerClipPathForBorderRadius;
            if (path5 == null) {
                path5 = new Path();
            }
            this.outerClipPathForBorderRadius = path5;
            this.pathForOutline = new Path();
            RectF rectF = this.innerClipTempRectForBorderRadius;
            if (rectF == null) {
                rectF = new RectF();
            }
            this.innerClipTempRectForBorderRadius = rectF;
            RectF rectF2 = this.outerClipTempRectForBorderRadius;
            if (rectF2 == null) {
                rectF2 = new RectF();
            }
            this.outerClipTempRectForBorderRadius = rectF2;
            RectF rectF3 = this.tempRectForCenterDrawPath;
            if (rectF3 == null) {
                rectF3 = new RectF();
            }
            this.tempRectForCenterDrawPath = rectF3;
            Path path6 = this.innerClipPathForBorderRadius;
            if (path6 != null) {
                path6.reset();
                C2735B c2735b = C2735B.f28704a;
            }
            Path path7 = this.outerClipPathForBorderRadius;
            if (path7 != null) {
                path7.reset();
                C2735B c2735b2 = C2735B.f28704a;
            }
            RectF rectF4 = this.innerClipTempRectForBorderRadius;
            if (rectF4 != null) {
                rectF4.set(getBounds());
                C2735B c2735b3 = C2735B.f28704a;
            }
            RectF rectF5 = this.outerClipTempRectForBorderRadius;
            if (rectF5 != null) {
                rectF5.set(getBounds());
                C2735B c2735b4 = C2735B.f28704a;
            }
            RectF rectF6 = this.tempRectForCenterDrawPath;
            if (rectF6 != null) {
                rectF6.set(getBounds());
                C2735B c2735b5 = C2735B.f28704a;
            }
            RectF rectFComputeBorderInsets = computeBorderInsets();
            if (Color.alpha(this.computedBorderColors.getLeft()) != 0 || Color.alpha(this.computedBorderColors.getTop()) != 0 || Color.alpha(this.computedBorderColors.getRight()) != 0 || Color.alpha(this.computedBorderColors.getBottom()) != 0) {
                RectF rectF7 = this.innerClipTempRectForBorderRadius;
                if (rectF7 != null) {
                    rectF7.top = rectF7 != null ? rectF7.top + rectFComputeBorderInsets.top : 0.0f;
                    C2735B c2735b6 = C2735B.f28704a;
                }
                if (rectF7 != null) {
                    rectF7.bottom = rectF7 != null ? rectF7.bottom - rectFComputeBorderInsets.bottom : 0.0f;
                    C2735B c2735b7 = C2735B.f28704a;
                }
                if (rectF7 != null) {
                    rectF7.left = rectF7 != null ? rectF7.left + rectFComputeBorderInsets.left : 0.0f;
                    C2735B c2735b8 = C2735B.f28704a;
                }
                if (rectF7 != null) {
                    rectF7.right = rectF7 != null ? rectF7.right - rectFComputeBorderInsets.right : 0.0f;
                    C2735B c2735b9 = C2735B.f28704a;
                }
            }
            RectF rectF8 = this.tempRectForCenterDrawPath;
            if (rectF8 != null) {
                rectF8.top = rectF8 != null ? rectF8.top + (rectFComputeBorderInsets.top * 0.5f) : 0.0f;
                C2735B c2735b10 = C2735B.f28704a;
            }
            if (rectF8 != null) {
                rectF8.bottom = rectF8 != null ? rectF8.bottom - (rectFComputeBorderInsets.bottom * 0.5f) : 0.0f;
                C2735B c2735b11 = C2735B.f28704a;
            }
            if (rectF8 != null) {
                rectF8.left = rectF8 != null ? rectF8.left + (rectFComputeBorderInsets.left * 0.5f) : 0.0f;
                C2735B c2735b12 = C2735B.f28704a;
            }
            if (rectF8 != null) {
                rectF8.right = rectF8 != null ? rectF8.right - (rectFComputeBorderInsets.right * 0.5f) : 0.0f;
                C2735B c2735b13 = C2735B.f28704a;
            }
            BorderRadiusStyle borderRadiusStyle = this.borderRadius;
            if (borderRadiusStyle != null) {
                int layoutDirection = getLayoutDirection();
                Context context = this.context;
                RectF rectF9 = this.outerClipTempRectForBorderRadius;
                float fPxToDp = rectF9 != null ? PixelUtil.INSTANCE.pxToDp(rectF9.width()) : 0.0f;
                RectF rectF10 = this.outerClipTempRectForBorderRadius;
                computedBorderRadiusResolve = borderRadiusStyle.resolve(layoutDirection, context, fPxToDp, rectF10 != null ? PixelUtil.INSTANCE.pxToDp(rectF10.height()) : 0.0f);
            } else {
                computedBorderRadiusResolve = null;
            }
            this.computedBorderRadius = computedBorderRadiusResolve;
            if (computedBorderRadiusResolve == null || (topLeft = computedBorderRadiusResolve.getTopLeft()) == null || (cornerRadii = topLeft.toPixelFromDIP()) == null) {
                cornerRadii = new CornerRadii(0.0f, 0.0f);
            }
            ComputedBorderRadius computedBorderRadius = this.computedBorderRadius;
            if (computedBorderRadius == null || (topRight = computedBorderRadius.getTopRight()) == null || (cornerRadii2 = topRight.toPixelFromDIP()) == null) {
                cornerRadii2 = new CornerRadii(0.0f, 0.0f);
            }
            ComputedBorderRadius computedBorderRadius2 = this.computedBorderRadius;
            if (computedBorderRadius2 == null || (bottomLeft = computedBorderRadius2.getBottomLeft()) == null || (cornerRadii3 = bottomLeft.toPixelFromDIP()) == null) {
                cornerRadii3 = new CornerRadii(0.0f, 0.0f);
            }
            ComputedBorderRadius computedBorderRadius3 = this.computedBorderRadius;
            if (computedBorderRadius3 == null || (bottomRight = computedBorderRadius3.getBottomRight()) == null || (cornerRadii4 = bottomRight.toPixelFromDIP()) == null) {
                cornerRadii4 = new CornerRadii(0.0f, 0.0f);
            }
            float innerBorderRadius = getInnerBorderRadius(cornerRadii.getHorizontal(), rectFComputeBorderInsets.left);
            float innerBorderRadius2 = getInnerBorderRadius(cornerRadii.getVertical(), rectFComputeBorderInsets.top);
            float innerBorderRadius3 = getInnerBorderRadius(cornerRadii2.getHorizontal(), rectFComputeBorderInsets.right);
            float innerBorderRadius4 = getInnerBorderRadius(cornerRadii2.getVertical(), rectFComputeBorderInsets.top);
            float innerBorderRadius5 = getInnerBorderRadius(cornerRadii4.getHorizontal(), rectFComputeBorderInsets.right);
            float innerBorderRadius6 = getInnerBorderRadius(cornerRadii4.getVertical(), rectFComputeBorderInsets.bottom);
            float innerBorderRadius7 = getInnerBorderRadius(cornerRadii3.getHorizontal(), rectFComputeBorderInsets.left);
            float innerBorderRadius8 = getInnerBorderRadius(cornerRadii3.getVertical(), rectFComputeBorderInsets.bottom);
            RectF rectF11 = this.innerClipTempRectForBorderRadius;
            if (rectF11 == null || (path3 = this.innerClipPathForBorderRadius) == null) {
                c10 = 6;
                c11 = 7;
            } else {
                c11 = 7;
                c10 = 6;
                path3.addRoundRect(rectF11, new float[]{innerBorderRadius, innerBorderRadius2, innerBorderRadius3, innerBorderRadius4, innerBorderRadius5, innerBorderRadius6, innerBorderRadius7, innerBorderRadius8}, Path.Direction.CW);
                C2735B c2735b14 = C2735B.f28704a;
            }
            RectF rectF12 = this.outerClipTempRectForBorderRadius;
            if (rectF12 == null || (path2 = this.outerClipPathForBorderRadius) == null) {
                c12 = 5;
            } else {
                float horizontal = cornerRadii.getHorizontal();
                float vertical = cornerRadii.getVertical();
                float horizontal2 = cornerRadii2.getHorizontal();
                float vertical2 = cornerRadii2.getVertical();
                float horizontal3 = cornerRadii4.getHorizontal();
                float vertical3 = cornerRadii4.getVertical();
                float horizontal4 = cornerRadii3.getHorizontal();
                float vertical4 = cornerRadii3.getVertical();
                c12 = 5;
                float[] fArr = new float[8];
                fArr[0] = horizontal;
                fArr[1] = vertical;
                fArr[2] = horizontal2;
                fArr[3] = vertical2;
                fArr[4] = horizontal3;
                fArr[5] = vertical3;
                fArr[c10] = horizontal4;
                fArr[c11] = vertical4;
                path2.addRoundRect(rectF12, fArr, Path.Direction.CW);
                C2735B c2735b15 = C2735B.f28704a;
            }
            Spacing spacing = this.borderWidth;
            float f10 = spacing != null ? spacing.get(8) / 2.0f : 0.0f;
            Path path8 = this.pathForOutline;
            if (path8 != null) {
                RectF rectF13 = new RectF(getBounds());
                float horizontal5 = cornerRadii.getHorizontal() + f10;
                float vertical5 = cornerRadii.getVertical() + f10;
                float horizontal6 = cornerRadii2.getHorizontal() + f10;
                float vertical6 = cornerRadii2.getVertical() + f10;
                float horizontal7 = cornerRadii4.getHorizontal() + f10;
                float vertical7 = cornerRadii4.getVertical() + f10;
                float horizontal8 = cornerRadii3.getHorizontal() + f10;
                float vertical8 = cornerRadii3.getVertical() + f10;
                float[] fArr2 = new float[8];
                fArr2[0] = horizontal5;
                fArr2[1] = vertical5;
                fArr2[2] = horizontal6;
                fArr2[3] = vertical6;
                fArr2[4] = horizontal7;
                fArr2[c12] = vertical7;
                fArr2[c10] = horizontal8;
                fArr2[c11] = vertical8;
                path8.addRoundRect(rectF13, fArr2, Path.Direction.CW);
                C2735B c2735b16 = C2735B.f28704a;
            }
            ComputedBorderRadius computedBorderRadius4 = this.computedBorderRadius;
            if (computedBorderRadius4 == null || !computedBorderRadius4.isUniform()) {
                Path path9 = this.centerDrawPath;
                if (path9 == null) {
                    path9 = new Path();
                }
                this.centerDrawPath = path9;
                path9.reset();
                C2735B c2735b17 = C2735B.f28704a;
                RectF rectF14 = this.tempRectForCenterDrawPath;
                if (rectF14 == null || (path = this.centerDrawPath) == null) {
                    i10 = 2;
                } else {
                    float horizontal9 = cornerRadii.getHorizontal() - (rectFComputeBorderInsets.left * 0.5f);
                    float vertical9 = cornerRadii.getVertical() - (rectFComputeBorderInsets.top * 0.5f);
                    float horizontal10 = cornerRadii2.getHorizontal() - (rectFComputeBorderInsets.right * 0.5f);
                    float vertical10 = cornerRadii2.getVertical() - (rectFComputeBorderInsets.top * 0.5f);
                    float horizontal11 = cornerRadii4.getHorizontal() - (rectFComputeBorderInsets.right * 0.5f);
                    float vertical11 = cornerRadii4.getVertical() - (rectFComputeBorderInsets.bottom * 0.5f);
                    i10 = 2;
                    float horizontal12 = cornerRadii3.getHorizontal() - (rectFComputeBorderInsets.left * 0.5f);
                    float vertical12 = cornerRadii3.getVertical() - (rectFComputeBorderInsets.bottom * 0.5f);
                    float[] fArr3 = new float[8];
                    fArr3[0] = horizontal9;
                    fArr3[1] = vertical9;
                    fArr3[2] = horizontal10;
                    fArr3[3] = vertical10;
                    fArr3[4] = horizontal11;
                    fArr3[c12] = vertical11;
                    fArr3[c10] = horizontal12;
                    fArr3[c11] = vertical12;
                    path.addRoundRect(rectF14, fArr3, Path.Direction.CW);
                    C2735B c2735b18 = C2735B.f28704a;
                }
            }
            RectF rectF15 = this.innerClipTempRectForBorderRadius;
            RectF rectF16 = this.outerClipTempRectForBorderRadius;
            if (rectF15 == null || rectF16 == null) {
                return;
            }
            PointF pointF = this.innerTopLeftCorner;
            if (pointF == null) {
                pointF = new PointF();
            }
            this.innerTopLeftCorner = pointF;
            pointF.x = rectF15.left;
            C2735B c2735b19 = C2735B.f28704a;
            pointF.y = rectF15.top;
            C2735B c2735b20 = C2735B.f28704a;
            float f11 = rectF15.left;
            float f12 = rectF15.top;
            float f13 = i10;
            getEllipseIntersectionWithLine(f11, f12, (innerBorderRadius * f13) + f11, (f13 * innerBorderRadius2) + f12, rectF16.left, rectF16.top, f11, f12, pointF);
            C2735B c2735b21 = C2735B.f28704a;
            PointF pointF2 = this.innerBottomLeftCorner;
            if (pointF2 == null) {
                pointF2 = new PointF();
            }
            this.innerBottomLeftCorner = pointF2;
            pointF2.x = rectF15.left;
            C2735B c2735b22 = C2735B.f28704a;
            pointF2.y = rectF15.bottom;
            C2735B c2735b23 = C2735B.f28704a;
            float f14 = rectF15.left;
            float f15 = rectF15.bottom;
            float f16 = 2;
            getEllipseIntersectionWithLine(f14, f15 - (innerBorderRadius8 * f16), (f16 * innerBorderRadius7) + f14, f15, rectF16.left, rectF16.bottom, f14, f15, pointF2);
            C2735B c2735b24 = C2735B.f28704a;
            PointF pointF3 = this.innerTopRightCorner;
            if (pointF3 == null) {
                pointF3 = new PointF();
            }
            this.innerTopRightCorner = pointF3;
            pointF3.x = rectF15.right;
            C2735B c2735b25 = C2735B.f28704a;
            pointF3.y = rectF15.top;
            C2735B c2735b26 = C2735B.f28704a;
            float f17 = rectF15.right;
            float f18 = 2;
            float f19 = rectF15.top;
            getEllipseIntersectionWithLine(f17 - (innerBorderRadius3 * f18), f19, f17, (f18 * innerBorderRadius4) + f19, rectF16.right, rectF16.top, f17, f19, pointF3);
            C2735B c2735b27 = C2735B.f28704a;
            PointF pointF4 = this.innerBottomRightCorner;
            if (pointF4 == null) {
                pointF4 = new PointF();
            }
            this.innerBottomRightCorner = pointF4;
            pointF4.x = rectF15.right;
            C2735B c2735b28 = C2735B.f28704a;
            pointF4.y = rectF15.bottom;
            C2735B c2735b29 = C2735B.f28704a;
            float f20 = rectF15.right;
            float f21 = 2;
            float f22 = rectF15.bottom;
            getEllipseIntersectionWithLine(f20 - (innerBorderRadius5 * f21), f22 - (f21 * innerBorderRadius6), f20, f22, rectF16.right, rectF16.bottom, f20, f22, pointF4);
            C2735B c2735b30 = C2735B.f28704a;
        }
    }

    private final void updatePathEffect() {
        BorderStyle borderStyle = getBorderStyle();
        if (borderStyle != null) {
            this.borderPaint.setPathEffect(getBorderStyle() != null ? getPathEffect(borderStyle, getFullBorderWidth()) : null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ColorEdges colorEdgesM14resolveimpl;
        AbstractC2855l.g(canvas, "canvas");
        updatePathEffect();
        Integer[] numArr = this.borderColors;
        if (numArr == null || (colorEdgesM14resolveimpl = BorderColors.m14resolveimpl(numArr, getLayoutDirection(), this.context)) == null) {
            colorEdgesM14resolveimpl = this.computedBorderColors;
        }
        this.computedBorderColors = colorEdgesM14resolveimpl;
        BorderRadiusStyle borderRadiusStyle = this.borderRadius;
        if (borderRadiusStyle == null || !borderRadiusStyle.hasRoundedBorders()) {
            drawRectangularBorders(canvas);
        } else {
            drawRoundedBorders(canvas);
        }
    }

    public final int getBorderColor(LogicalEdge position) {
        Integer num;
        AbstractC2855l.g(position, "position");
        Integer[] numArr = this.borderColors;
        if (numArr == null || (num = numArr[position.ordinal()]) == null) {
            return -16777216;
        }
        return num.intValue();
    }

    public final BorderInsets getBorderInsets() {
        return this.borderInsets;
    }

    public final BorderRadiusStyle getBorderRadius() {
        return this.borderRadius;
    }

    public final BorderStyle getBorderStyle() {
        return (BorderStyle) this.borderStyle.getValue(this, $$delegatedProperties[0]);
    }

    public final Spacing getBorderWidth() {
        return this.borderWidth;
    }

    public final Path getInnerClipPathForBorderRadius() {
        return this.innerClipPathForBorderRadius;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (AbstractC2884a.f(Color.alpha(multiplyColorAlpha(this.computedBorderColors.getLeft(), this.borderAlpha)), Color.alpha(multiplyColorAlpha(this.computedBorderColors.getTop(), this.borderAlpha)), Color.alpha(multiplyColorAlpha(this.computedBorderColors.getRight(), this.borderAlpha)), Color.alpha(multiplyColorAlpha(this.computedBorderColors.getBottom(), this.borderAlpha))) == 0) {
            return -2;
        }
        return AbstractC2884a.g(Color.alpha(multiplyColorAlpha(this.computedBorderColors.getLeft(), this.borderAlpha)), Color.alpha(multiplyColorAlpha(this.computedBorderColors.getTop(), this.borderAlpha)), Color.alpha(multiplyColorAlpha(this.computedBorderColors.getRight(), this.borderAlpha)), Color.alpha(multiplyColorAlpha(this.computedBorderColors.getBottom(), this.borderAlpha))) == 255 ? -1 : -3;
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
        this.borderAlpha = alpha;
        invalidateSelf();
    }

    public final void setBorderColor(LogicalEdge position, Integer color) {
        AbstractC2855l.g(position, "position");
        Integer[] numArrM10constructorimpl$default = this.borderColors;
        if (numArrM10constructorimpl$default == null) {
            numArrM10constructorimpl$default = BorderColors.m10constructorimpl$default(null, 1, null);
        }
        this.borderColors = numArrM10constructorimpl$default;
        if (numArrM10constructorimpl$default != null) {
            numArrM10constructorimpl$default[position.ordinal()] = color;
        }
        this.needUpdatePath = true;
        invalidateSelf();
    }

    public final void setBorderInsets(BorderInsets borderInsets) {
        this.borderInsets = borderInsets;
    }

    public final void setBorderRadius(BorderRadiusStyle borderRadiusStyle) {
        this.borderRadius = borderRadiusStyle;
    }

    public final void setBorderStyle(BorderStyle borderStyle) {
        this.borderStyle.setValue(this, $$delegatedProperties[0], borderStyle);
    }

    public final void setBorderWidth(int position, float width) {
        Spacing spacing = this.borderWidth;
        if (FloatUtil.floatsEqual(spacing != null ? Float.valueOf(spacing.getRaw(position)) : null, Float.valueOf(width))) {
            return;
        }
        Spacing spacing2 = this.borderWidth;
        if (spacing2 != null) {
            spacing2.set(position, width);
        }
        if (position == 0 || position == 1 || position == 2 || position == 3 || position == 4 || position == 5 || position == 8) {
            this.needUpdatePath = true;
        }
        invalidateSelf();
    }

    public final void setBorderRadius(BorderRadiusProp property, LengthPercentage radius) {
        AbstractC2855l.g(property, "property");
        BorderRadiusStyle borderRadiusStyle = this.borderRadius;
        if (AbstractC2855l.b(radius, borderRadiusStyle != null ? borderRadiusStyle.get(property) : null)) {
            return;
        }
        BorderRadiusStyle borderRadiusStyle2 = this.borderRadius;
        if (borderRadiusStyle2 != null) {
            borderRadiusStyle2.set(property, radius);
        }
        this.needUpdatePath = true;
        invalidateSelf();
    }

    public final void setBorderStyle(String style) {
        BorderStyle borderStyleValueOf;
        if (style == null) {
            borderStyleValueOf = null;
        } else {
            String upperCase = style.toUpperCase(Locale.ROOT);
            AbstractC2855l.f(upperCase, "toUpperCase(...)");
            borderStyleValueOf = BorderStyle.valueOf(upperCase);
        }
        setBorderStyle(borderStyleValueOf);
        this.needUpdatePath = true;
        invalidateSelf();
    }

    private final void updatePathEffect(int borderWidth) {
        BorderStyle borderStyle = getBorderStyle();
        if (borderStyle != null) {
            this.borderPaint.setPathEffect(getBorderStyle() != null ? getPathEffect(borderStyle, borderWidth) : null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
