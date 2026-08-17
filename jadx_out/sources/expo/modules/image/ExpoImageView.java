package expo.modules.image;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.appcompat.widget.C1644q;
import com.bumptech.glide.k;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.image.enums.ContentFit;
import expo.modules.image.records.ContentPosition;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JA\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\fH\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u001dJ\u0019\u0010!\u001a\u00020\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010$\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%R$\u0010&\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0014\"\u0004\b)\u0010*R\"\u0010+\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-\"\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010,R*\u0010\t\u001a\u00020\b2\u0006\u00101\u001a\u00020\b8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R*\u00107\u001a\u00020\b2\u0006\u00101\u001a\u00020\b8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b7\u00102\u001a\u0004\b8\u00104\"\u0004\b9\u00106R*\u0010\u000b\u001a\u00020\n2\u0006\u00101\u001a\u00020\n8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>¨\u0006?"}, d2 = {"Lexpo/modules/image/ExpoImageView;", "Landroidx/appcompat/widget/q;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/graphics/drawable/Drawable;", "drawable", "Lexpo/modules/image/enums/ContentFit;", "contentFit", "Lexpo/modules/image/records/ContentPosition;", "contentPosition", PointerEventHelper.POINTER_TYPE_UNKNOWN, "sourceWidth", "sourceHeight", "Li7/B;", "applyTransformationMatrix", "(Landroid/graphics/drawable/Drawable;Lexpo/modules/image/enums/ContentFit;Lexpo/modules/image/records/ContentPosition;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Lexpo/modules/image/ImageViewWrapperTarget;", "recycleView", "()Lexpo/modules/image/ImageViewWrapperTarget;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "changed", ViewProps.LEFT, ViewProps.TOP, ViewProps.RIGHT, ViewProps.BOTTOM, "onLayout", "(ZIIII)V", "()V", ViewProps.COLOR, "setTintColor$expo_image_release", "(Ljava/lang/Integer;)V", "setTintColor", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "currentTarget", "Lexpo/modules/image/ImageViewWrapperTarget;", "getCurrentTarget", "setCurrentTarget", "(Lexpo/modules/image/ImageViewWrapperTarget;)V", "isPlaceholder", "Z", "()Z", "setPlaceholder", "(Z)V", "transformationMatrixChanged", "value", "Lexpo/modules/image/enums/ContentFit;", "getContentFit$expo_image_release", "()Lexpo/modules/image/enums/ContentFit;", "setContentFit$expo_image_release", "(Lexpo/modules/image/enums/ContentFit;)V", "placeholderContentFit", "getPlaceholderContentFit$expo_image_release", "setPlaceholderContentFit$expo_image_release", "Lexpo/modules/image/records/ContentPosition;", "getContentPosition$expo_image_release", "()Lexpo/modules/image/records/ContentPosition;", "setContentPosition$expo_image_release", "(Lexpo/modules/image/records/ContentPosition;)V", "expo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
public final class ExpoImageView extends C1644q {
    private ContentFit contentFit;
    private ContentPosition contentPosition;
    private ImageViewWrapperTarget currentTarget;
    private boolean isPlaceholder;
    private ContentFit placeholderContentFit;
    private boolean transformationMatrixChanged;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpoImageView(Context context) {
        super(context);
        AbstractC2855l.g(context, "context");
        setClipToOutline(true);
        setScaleType(ImageView.ScaleType.MATRIX);
        this.contentFit = ContentFit.Cover;
        this.placeholderContentFit = ContentFit.ScaleDown;
        this.contentPosition = ContentPosition.INSTANCE.getCenter();
    }

    static /* synthetic */ void applyTransformationMatrix$default(ExpoImageView expoImageView, Drawable drawable, ContentFit contentFit, ContentPosition contentPosition, Integer num, Integer num2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            contentPosition = ContentPosition.INSTANCE.getCenter();
        }
        ContentPosition contentPosition2 = contentPosition;
        if ((i10 & 8) != 0) {
            ImageViewWrapperTarget imageViewWrapperTarget = expoImageView.currentTarget;
            num = imageViewWrapperTarget != null ? Integer.valueOf(imageViewWrapperTarget.getSourceWidth()) : null;
        }
        Integer num3 = num;
        if ((i10 & 16) != 0) {
            ImageViewWrapperTarget imageViewWrapperTarget2 = expoImageView.currentTarget;
            num2 = imageViewWrapperTarget2 != null ? Integer.valueOf(imageViewWrapperTarget2.getSourceHeight()) : null;
        }
        expoImageView.applyTransformationMatrix(drawable, contentFit, contentPosition2, num3, num2);
    }

    public final void applyTransformationMatrix() {
        if (getDrawable() == null) {
            return;
        }
        if (!this.isPlaceholder) {
            Drawable drawable = getDrawable();
            AbstractC2855l.f(drawable, "getDrawable(...)");
            applyTransformationMatrix$default(this, drawable, this.contentFit, this.contentPosition, null, null, 24, null);
            return;
        }
        Drawable drawable2 = getDrawable();
        AbstractC2855l.f(drawable2, "getDrawable(...)");
        ContentFit contentFit = this.placeholderContentFit;
        ImageViewWrapperTarget imageViewWrapperTarget = this.currentTarget;
        Integer numValueOf = imageViewWrapperTarget != null ? Integer.valueOf(imageViewWrapperTarget.getPlaceholderHeight()) : null;
        ImageViewWrapperTarget imageViewWrapperTarget2 = this.currentTarget;
        applyTransformationMatrix$default(this, drawable2, contentFit, null, imageViewWrapperTarget2 != null ? Integer.valueOf(imageViewWrapperTarget2.getPlaceholderWidth()) : null, numValueOf, 4, null);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Bitmap bitmap;
        ImageViewWrapperTarget imageViewWrapperTargetRecycleView;
        k requestManager;
        AbstractC2855l.g(canvas, "canvas");
        Drawable drawable = getDrawable();
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null && bitmap.isRecycled() && (imageViewWrapperTargetRecycleView = recycleView()) != null) {
            ViewParent parent = getParent();
            ExpoImageViewWrapper expoImageViewWrapper = parent instanceof ExpoImageViewWrapper ? (ExpoImageViewWrapper) parent : null;
            if (expoImageViewWrapper != null && (requestManager = expoImageViewWrapper.getRequestManager()) != null) {
                imageViewWrapperTargetRecycleView.clear(requestManager);
            }
        }
        super.draw(canvas);
    }

    /* JADX INFO: renamed from: getContentFit$expo_image_release, reason: from getter */
    public final ContentFit getContentFit() {
        return this.contentFit;
    }

    /* JADX INFO: renamed from: getContentPosition$expo_image_release, reason: from getter */
    public final ContentPosition getContentPosition() {
        return this.contentPosition;
    }

    public final ImageViewWrapperTarget getCurrentTarget() {
        return this.currentTarget;
    }

    /* JADX INFO: renamed from: getPlaceholderContentFit$expo_image_release, reason: from getter */
    public final ContentFit getPlaceholderContentFit() {
        return this.placeholderContentFit;
    }

    /* JADX INFO: renamed from: isPlaceholder, reason: from getter */
    public final boolean getIsPlaceholder() {
        return this.isPlaceholder;
    }

    @Override // android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        applyTransformationMatrix();
    }

    public final ImageViewWrapperTarget recycleView() {
        setImageDrawable(null);
        ImageViewWrapperTarget imageViewWrapperTarget = this.currentTarget;
        if (imageViewWrapperTarget != null) {
            imageViewWrapperTarget.setUsed(false);
        } else {
            imageViewWrapperTarget = null;
        }
        this.currentTarget = null;
        setVisibility(8);
        this.isPlaceholder = false;
        return imageViewWrapperTarget;
    }

    public final void setContentFit$expo_image_release(ContentFit value) {
        AbstractC2855l.g(value, "value");
        this.contentFit = value;
        this.transformationMatrixChanged = true;
    }

    public final void setContentPosition$expo_image_release(ContentPosition value) {
        AbstractC2855l.g(value, "value");
        this.contentPosition = value;
        this.transformationMatrixChanged = true;
    }

    public final void setCurrentTarget(ImageViewWrapperTarget imageViewWrapperTarget) {
        this.currentTarget = imageViewWrapperTarget;
    }

    public final void setPlaceholder(boolean z10) {
        this.isPlaceholder = z10;
    }

    public final void setPlaceholderContentFit$expo_image_release(ContentFit value) {
        AbstractC2855l.g(value, "value");
        this.placeholderContentFit = value;
        this.transformationMatrixChanged = true;
    }

    public final void setTintColor$expo_image_release(Integer color) {
        if (color != null) {
            setColorFilter(color.intValue(), PorterDuff.Mode.SRC_IN);
        } else {
            clearColorFilter();
        }
    }

    private final void applyTransformationMatrix(Drawable drawable, ContentFit contentFit, ContentPosition contentPosition, Integer sourceWidth, Integer sourceHeight) {
        RectF rectF = new RectF(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        RectF rectF2 = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        Matrix matrix$expo_image_release = contentFit.toMatrix$expo_image_release(rectF, rectF2, sourceWidth != null ? sourceWidth.intValue() : -1, sourceHeight != null ? sourceHeight.intValue() : -1);
        matrix$expo_image_release.mapRect(rectF);
        contentPosition.apply$expo_image_release(matrix$expo_image_release, rectF, rectF2);
        setImageMatrix(matrix$expo_image_release);
    }
}
