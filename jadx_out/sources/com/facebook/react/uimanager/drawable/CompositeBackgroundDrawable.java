package com.facebook.react.uimanager.drawable;

import android.content.Context;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.uimanager.style.BorderInsets;
import com.facebook.react.uimanager.style.BorderRadiusStyle;
import com.facebook.react.uimanager.style.ComputedBorderRadius;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\"\b\u0000\u0018\u0000 G2\u00020\u0001:\u0001GB\u008f\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001c\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00002\b\u0010\"\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020&2\u0006\u0010\u0011\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010)R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010,R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b4\u00105R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b9\u0010,R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010-\u001a\u0004\b:\u0010/R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010;\u001a\u0004\b'\u0010<R$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010F¨\u0006H"}, d2 = {"Lcom/facebook/react/uimanager/drawable/CompositeBackgroundDrawable;", "Landroid/graphics/drawable/LayerDrawable;", "Landroid/content/Context;", "context", "Landroid/graphics/drawable/Drawable;", "originalBackground", PointerEventHelper.POINTER_TYPE_UNKNOWN, "outerShadows", "Lcom/facebook/react/uimanager/drawable/BackgroundDrawable;", AppStateModule.APP_STATE_BACKGROUND, "Lcom/facebook/react/uimanager/drawable/BackgroundImageDrawable;", "backgroundImage", "Lcom/facebook/react/uimanager/drawable/BorderDrawable;", "border", "feedbackUnderlay", "innerShadows", "Lcom/facebook/react/uimanager/drawable/OutlineDrawable;", "outline", "Lcom/facebook/react/uimanager/style/BorderInsets;", "borderInsets", "Lcom/facebook/react/uimanager/style/BorderRadiusStyle;", ViewProps.BORDER_RADIUS, "<init>", "(Landroid/content/Context;Landroid/graphics/drawable/Drawable;Ljava/util/List;Lcom/facebook/react/uimanager/drawable/BackgroundDrawable;Lcom/facebook/react/uimanager/drawable/BackgroundImageDrawable;Lcom/facebook/react/uimanager/drawable/BorderDrawable;Landroid/graphics/drawable/Drawable;Ljava/util/List;Lcom/facebook/react/uimanager/drawable/OutlineDrawable;Lcom/facebook/react/uimanager/style/BorderInsets;Lcom/facebook/react/uimanager/style/BorderRadiusStyle;)V", "withNewBackgroundImage", "(Lcom/facebook/react/uimanager/drawable/BackgroundImageDrawable;)Lcom/facebook/react/uimanager/drawable/CompositeBackgroundDrawable;", "withNewBackground", "(Lcom/facebook/react/uimanager/drawable/BackgroundDrawable;)Lcom/facebook/react/uimanager/drawable/CompositeBackgroundDrawable;", "withNewShadows", "(Ljava/util/List;Ljava/util/List;)Lcom/facebook/react/uimanager/drawable/CompositeBackgroundDrawable;", "withNewBorder", "(Lcom/facebook/react/uimanager/drawable/BorderDrawable;)Lcom/facebook/react/uimanager/drawable/CompositeBackgroundDrawable;", "withNewOutline", "(Lcom/facebook/react/uimanager/drawable/OutlineDrawable;)Lcom/facebook/react/uimanager/drawable/CompositeBackgroundDrawable;", "newUnderlay", "withNewFeedbackUnderlay", "(Landroid/graphics/drawable/Drawable;)Lcom/facebook/react/uimanager/drawable/CompositeBackgroundDrawable;", "Landroid/graphics/Outline;", "Li7/B;", "getOutline", "(Landroid/graphics/Outline;)V", "Landroid/content/Context;", "Landroid/graphics/drawable/Drawable;", "getOriginalBackground", "()Landroid/graphics/drawable/Drawable;", "Ljava/util/List;", "getOuterShadows", "()Ljava/util/List;", "Lcom/facebook/react/uimanager/drawable/BackgroundDrawable;", "getBackground", "()Lcom/facebook/react/uimanager/drawable/BackgroundDrawable;", "Lcom/facebook/react/uimanager/drawable/BackgroundImageDrawable;", "getBackgroundImage", "()Lcom/facebook/react/uimanager/drawable/BackgroundImageDrawable;", "Lcom/facebook/react/uimanager/drawable/BorderDrawable;", "getBorder", "()Lcom/facebook/react/uimanager/drawable/BorderDrawable;", "getFeedbackUnderlay", "getInnerShadows", "Lcom/facebook/react/uimanager/drawable/OutlineDrawable;", "()Lcom/facebook/react/uimanager/drawable/OutlineDrawable;", "Lcom/facebook/react/uimanager/style/BorderInsets;", "getBorderInsets", "()Lcom/facebook/react/uimanager/style/BorderInsets;", "setBorderInsets", "(Lcom/facebook/react/uimanager/style/BorderInsets;)V", "Lcom/facebook/react/uimanager/style/BorderRadiusStyle;", "getBorderRadius", "()Lcom/facebook/react/uimanager/style/BorderRadiusStyle;", "setBorderRadius", "(Lcom/facebook/react/uimanager/style/BorderRadiusStyle;)V", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CompositeBackgroundDrawable extends LayerDrawable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final BackgroundDrawable background;
    private final BackgroundImageDrawable backgroundImage;
    private final BorderDrawable border;
    private BorderInsets borderInsets;
    private BorderRadiusStyle borderRadius;
    private final Context context;
    private final Drawable feedbackUnderlay;
    private final List<Drawable> innerShadows;
    private final Drawable originalBackground;
    private final List<Drawable> outerShadows;
    private final OutlineDrawable outline;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jm\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/facebook/react/uimanager/drawable/CompositeBackgroundDrawable$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "createLayersArray", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Landroid/graphics/drawable/Drawable;", "originalBackground", "outerShadows", PointerEventHelper.POINTER_TYPE_UNKNOWN, AppStateModule.APP_STATE_BACKGROUND, "Lcom/facebook/react/uimanager/drawable/BackgroundDrawable;", "backgroundImage", "Lcom/facebook/react/uimanager/drawable/BackgroundImageDrawable;", "border", "Lcom/facebook/react/uimanager/drawable/BorderDrawable;", "feedbackUnderlay", "innerShadows", "outline", "Lcom/facebook/react/uimanager/drawable/OutlineDrawable;", "(Landroid/graphics/drawable/Drawable;Ljava/util/List;Lcom/facebook/react/uimanager/drawable/BackgroundDrawable;Lcom/facebook/react/uimanager/drawable/BackgroundImageDrawable;Lcom/facebook/react/uimanager/drawable/BorderDrawable;Landroid/graphics/drawable/Drawable;Ljava/util/List;Lcom/facebook/react/uimanager/drawable/OutlineDrawable;)[Landroid/graphics/drawable/Drawable;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Drawable[] createLayersArray(Drawable originalBackground, List<? extends Drawable> outerShadows, BackgroundDrawable background, BackgroundImageDrawable backgroundImage, BorderDrawable border, Drawable feedbackUnderlay, List<? extends Drawable> innerShadows, OutlineDrawable outline) {
            ArrayList arrayList = new ArrayList();
            if (originalBackground != null) {
                arrayList.add(originalBackground);
            }
            arrayList.addAll(AbstractC2800q.N(outerShadows));
            if (background != null) {
                arrayList.add(background);
            }
            if (backgroundImage != null) {
                arrayList.add(backgroundImage);
            }
            if (border != null) {
                arrayList.add(border);
            }
            if (feedbackUnderlay != null) {
                arrayList.add(feedbackUnderlay);
            }
            arrayList.addAll(AbstractC2800q.N(innerShadows));
            if (outline != null) {
                arrayList.add(outline);
            }
            return (Drawable[]) arrayList.toArray(new Drawable[0]);
        }

        private Companion() {
        }
    }

    public /* synthetic */ CompositeBackgroundDrawable(Context context, Drawable drawable, List list, BackgroundDrawable backgroundDrawable, BackgroundImageDrawable backgroundImageDrawable, BorderDrawable borderDrawable, Drawable drawable2, List list2, OutlineDrawable outlineDrawable, BorderInsets borderInsets, BorderRadiusStyle borderRadiusStyle, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : drawable, (i10 & 4) != 0 ? AbstractC2800q.j() : list, (i10 & 8) != 0 ? null : backgroundDrawable, (i10 & 16) != 0 ? null : backgroundImageDrawable, (i10 & 32) != 0 ? null : borderDrawable, (i10 & 64) != 0 ? null : drawable2, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? AbstractC2800q.j() : list2, (i10 & 256) != 0 ? null : outlineDrawable, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : borderInsets, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : borderRadiusStyle);
    }

    public final BackgroundDrawable getBackground() {
        return this.background;
    }

    public final BackgroundImageDrawable getBackgroundImage() {
        return this.backgroundImage;
    }

    public final BorderDrawable getBorder() {
        return this.border;
    }

    public final BorderInsets getBorderInsets() {
        return this.borderInsets;
    }

    public final BorderRadiusStyle getBorderRadius() {
        return this.borderRadius;
    }

    public final Drawable getFeedbackUnderlay() {
        return this.feedbackUnderlay;
    }

    public final List<Drawable> getInnerShadows() {
        return this.innerShadows;
    }

    public final Drawable getOriginalBackground() {
        return this.originalBackground;
    }

    public final List<Drawable> getOuterShadows() {
        return this.outerShadows;
    }

    public final OutlineDrawable getOutline() {
        return this.outline;
    }

    public final void setBorderInsets(BorderInsets borderInsets) {
        this.borderInsets = borderInsets;
    }

    public final void setBorderRadius(BorderRadiusStyle borderRadiusStyle) {
        this.borderRadius = borderRadiusStyle;
    }

    public final CompositeBackgroundDrawable withNewBackground(BackgroundDrawable background) {
        return new CompositeBackgroundDrawable(this.context, this.originalBackground, this.outerShadows, background, this.backgroundImage, this.border, this.feedbackUnderlay, this.innerShadows, this.outline, this.borderInsets, this.borderRadius);
    }

    public final CompositeBackgroundDrawable withNewBackgroundImage(BackgroundImageDrawable backgroundImage) {
        return new CompositeBackgroundDrawable(this.context, this.originalBackground, this.outerShadows, this.background, backgroundImage, this.border, this.feedbackUnderlay, this.innerShadows, this.outline, this.borderInsets, this.borderRadius);
    }

    public final CompositeBackgroundDrawable withNewBorder(BorderDrawable border) {
        AbstractC2855l.g(border, "border");
        return new CompositeBackgroundDrawable(this.context, this.originalBackground, this.outerShadows, this.background, this.backgroundImage, border, this.feedbackUnderlay, this.innerShadows, this.outline, this.borderInsets, this.borderRadius);
    }

    public final CompositeBackgroundDrawable withNewFeedbackUnderlay(Drawable newUnderlay) {
        return new CompositeBackgroundDrawable(this.context, this.originalBackground, this.outerShadows, this.background, this.backgroundImage, this.border, newUnderlay, this.innerShadows, this.outline, this.borderInsets, this.borderRadius);
    }

    public final CompositeBackgroundDrawable withNewOutline(OutlineDrawable outline) {
        AbstractC2855l.g(outline, "outline");
        return new CompositeBackgroundDrawable(this.context, this.originalBackground, this.outerShadows, this.background, this.backgroundImage, this.border, this.feedbackUnderlay, this.innerShadows, outline, this.borderInsets, this.borderRadius);
    }

    public final CompositeBackgroundDrawable withNewShadows(List<? extends Drawable> outerShadows, List<? extends Drawable> innerShadows) {
        AbstractC2855l.g(outerShadows, "outerShadows");
        AbstractC2855l.g(innerShadows, "innerShadows");
        return new CompositeBackgroundDrawable(this.context, this.originalBackground, outerShadows, this.background, this.backgroundImage, this.border, this.feedbackUnderlay, innerShadows, this.outline, this.borderInsets, this.borderRadius);
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        AbstractC2855l.g(outline, "outline");
        BorderRadiusStyle borderRadiusStyle = this.borderRadius;
        if (borderRadiusStyle == null || !borderRadiusStyle.hasRoundedBorders()) {
            outline.setRect(getBounds());
            return;
        }
        Path path = new Path();
        BorderRadiusStyle borderRadiusStyle2 = this.borderRadius;
        ComputedBorderRadius computedBorderRadiusResolve = borderRadiusStyle2 != null ? borderRadiusStyle2.resolve(getLayoutDirection(), this.context, getBounds().width(), getBounds().height()) : null;
        BorderInsets borderInsets = this.borderInsets;
        RectF rectFResolve = borderInsets != null ? borderInsets.resolve(getLayoutDirection(), this.context) : null;
        if (computedBorderRadiusResolve != null) {
            RectF rectF = new RectF(getBounds());
            PixelUtil pixelUtil = PixelUtil.INSTANCE;
            path.addRoundRect(rectF, new float[]{pixelUtil.dpToPx(computedBorderRadiusResolve.getTopLeft().getHorizontal() + (rectFResolve != null ? rectFResolve.left : 0.0f)), pixelUtil.dpToPx(computedBorderRadiusResolve.getTopLeft().getVertical() + (rectFResolve != null ? rectFResolve.top : 0.0f)), pixelUtil.dpToPx(computedBorderRadiusResolve.getTopRight().getHorizontal() + (rectFResolve != null ? rectFResolve.right : 0.0f)), pixelUtil.dpToPx(computedBorderRadiusResolve.getTopRight().getVertical() + (rectFResolve != null ? rectFResolve.top : 0.0f)), pixelUtil.dpToPx(computedBorderRadiusResolve.getBottomRight().getHorizontal() + (rectFResolve != null ? rectFResolve.right : 0.0f)), pixelUtil.dpToPx(computedBorderRadiusResolve.getBottomRight().getVertical() + (rectFResolve != null ? rectFResolve.bottom : 0.0f)), pixelUtil.dpToPx(computedBorderRadiusResolve.getBottomLeft().getHorizontal() + (rectFResolve != null ? rectFResolve.left : 0.0f)), pixelUtil.dpToPx(computedBorderRadiusResolve.getBottomLeft().getVertical() + (rectFResolve != null ? rectFResolve.bottom : 0.0f))}, Path.Direction.CW);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            outline.setPath(path);
        } else {
            outline.setConvexPath(path);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CompositeBackgroundDrawable(Context context, Drawable drawable, List<? extends Drawable> outerShadows, BackgroundDrawable backgroundDrawable, BackgroundImageDrawable backgroundImageDrawable, BorderDrawable borderDrawable, Drawable drawable2, List<? extends Drawable> innerShadows, OutlineDrawable outlineDrawable, BorderInsets borderInsets, BorderRadiusStyle borderRadiusStyle) {
        super(INSTANCE.createLayersArray(drawable, outerShadows, backgroundDrawable, backgroundImageDrawable, borderDrawable, drawable2, innerShadows, outlineDrawable));
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(outerShadows, "outerShadows");
        AbstractC2855l.g(innerShadows, "innerShadows");
        this.context = context;
        this.originalBackground = drawable;
        this.outerShadows = outerShadows;
        this.background = backgroundDrawable;
        this.backgroundImage = backgroundImageDrawable;
        this.border = borderDrawable;
        this.feedbackUnderlay = drawable2;
        this.innerShadows = innerShadows;
        this.outline = outlineDrawable;
        this.borderInsets = borderInsets;
        this.borderRadius = borderRadiusStyle;
        setPaddingMode(1);
    }
}
