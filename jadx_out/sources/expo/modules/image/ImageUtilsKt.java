package expo.modules.image;

import android.graphics.RectF;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a2\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007\u001a2\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007\u001a2\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007¨\u0006\r"}, d2 = {"calcXTranslation", PointerEventHelper.POINTER_TYPE_UNKNOWN, "value", "imageRect", "Landroid/graphics/RectF;", "viewRect", "isPercentage", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isReverse", "calcYTranslation", "calcTranslation", "imageRefValue", "viewRefValue", "expo-image_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ImageUtilsKt {
    public static final float calcTranslation(float f10, float f11, float f12, boolean z10, boolean z11) {
        if (!z10) {
            return z11 ? (f12 - f11) - f10 : f10;
        }
        if (z11) {
            f10 = 100.0f - f10;
        }
        return (f10 / 100.0f) * (f12 - f11);
    }

    public static /* synthetic */ float calcTranslation$default(float f10, float f11, float f12, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        if ((i10 & 16) != 0) {
            z11 = false;
        }
        return calcTranslation(f10, f11, f12, z10, z11);
    }

    public static final float calcXTranslation(float f10, RectF imageRect, RectF viewRect, boolean z10, boolean z11) {
        AbstractC2855l.g(imageRect, "imageRect");
        AbstractC2855l.g(viewRect, "viewRect");
        return calcTranslation(f10, imageRect.width(), viewRect.width(), z10, z11);
    }

    public static /* synthetic */ float calcXTranslation$default(float f10, RectF rectF, RectF rectF2, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        if ((i10 & 16) != 0) {
            z11 = false;
        }
        return calcXTranslation(f10, rectF, rectF2, z10, z11);
    }

    public static final float calcYTranslation(float f10, RectF imageRect, RectF viewRect, boolean z10, boolean z11) {
        AbstractC2855l.g(imageRect, "imageRect");
        AbstractC2855l.g(viewRect, "viewRect");
        return calcTranslation(f10, imageRect.height(), viewRect.height(), z10, z11);
    }

    public static /* synthetic */ float calcYTranslation$default(float f10, RectF rectF, RectF rectF2, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        if ((i10 & 16) != 0) {
            z11 = false;
        }
        return calcYTranslation(f10, rectF, rectF2, z10, z11);
    }
}
