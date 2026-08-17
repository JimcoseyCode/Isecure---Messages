package expo.modules.image;

import com.bumptech.glide.load.resource.bitmap.AbstractC1944n;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lexpo/modules/image/PlaceholderDownsampleStrategy;", "Lexpo/modules/image/CustomDownsampleStrategy;", "Lexpo/modules/image/ImageViewWrapperTarget;", "target", "<init>", "(Lexpo/modules/image/ImageViewWrapperTarget;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "sourceWidth", "sourceHeight", "requestedWidth", "requestedHeight", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getScaleFactor", "(IIII)F", "Lcom/bumptech/glide/load/resource/bitmap/n$g;", "getSampleSizeRounding", "(IIII)Lcom/bumptech/glide/load/resource/bitmap/n$g;", "Lexpo/modules/image/ImageViewWrapperTarget;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "wasTriggered", "Z", "expo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PlaceholderDownsampleStrategy extends CustomDownsampleStrategy {
    private final ImageViewWrapperTarget target;
    private boolean wasTriggered;

    public PlaceholderDownsampleStrategy(ImageViewWrapperTarget target) {
        AbstractC2855l.g(target, "target");
        this.target = target;
    }

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC1944n
    public AbstractC1944n.g getSampleSizeRounding(int sourceWidth, int sourceHeight, int requestedWidth, int requestedHeight) {
        return AbstractC1944n.g.QUALITY;
    }

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC1944n
    public float getScaleFactor(int sourceWidth, int sourceHeight, int requestedWidth, int requestedHeight) {
        if (this.wasTriggered) {
            return 1.0f;
        }
        this.target.setPlaceholderWidth(sourceWidth);
        this.target.setPlaceholderHeight(sourceHeight);
        this.wasTriggered = true;
        return 1.0f;
    }
}
