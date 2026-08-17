package com.facebook.react.views.imagehelper;

import Y2.C1533t;
import Y2.y;
import com.facebook.react.modules.fresco.ImageCacheControl;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007J.\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u000f"}, d2 = {"Lcom/facebook/react/views/imagehelper/MultiSourceHelper;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "getBestSourceForSize", "Lcom/facebook/react/views/imagehelper/MultiSourceHelper$MultiSourceResult;", "width", PointerEventHelper.POINTER_TYPE_UNKNOWN, "height", "sources", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/views/imagehelper/ImageSource;", "multiplier", PointerEventHelper.POINTER_TYPE_UNKNOWN, "MultiSourceResult", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MultiSourceHelper {
    public static final MultiSourceHelper INSTANCE = new MultiSourceHelper();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/facebook/react/views/imagehelper/MultiSourceHelper$MultiSourceResult;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "bestResult", "Lcom/facebook/react/views/imagehelper/ImageSource;", "bestResultInCache", "<init>", "(Lcom/facebook/react/views/imagehelper/ImageSource;Lcom/facebook/react/views/imagehelper/ImageSource;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MultiSourceResult {
        public final ImageSource bestResult;
        public final ImageSource bestResultInCache;

        public MultiSourceResult(ImageSource imageSource, ImageSource imageSource2) {
            this.bestResult = imageSource;
            this.bestResultInCache = imageSource2;
        }
    }

    private MultiSourceHelper() {
    }

    public static final MultiSourceResult getBestSourceForSize(int width, int height, List<? extends ImageSource> sources) {
        AbstractC2855l.g(sources, "sources");
        return getBestSourceForSize(width, height, sources, 1.0d);
    }

    public static final MultiSourceResult getBestSourceForSize(int width, int height, List<? extends ImageSource> sources, double multiplier) {
        AbstractC2855l.g(sources, "sources");
        if (sources.isEmpty()) {
            return new MultiSourceResult(null, null);
        }
        if (sources.size() == 1) {
            return new MultiSourceResult(sources.get(0), null);
        }
        if (width <= 0 || height <= 0) {
            return new MultiSourceResult(null, null);
        }
        C1533t c1533tJ = y.l().j();
        AbstractC2855l.f(c1533tJ, "getImagePipeline(...)");
        double d10 = ((double) (width * height)) * multiplier;
        double d11 = Double.MAX_VALUE;
        double d12 = Double.MAX_VALUE;
        ImageSource imageSource = null;
        ImageSource imageSource2 = null;
        for (ImageSource imageSource3 : sources) {
            double dAbs = Math.abs(1.0d - (imageSource3.getSize() / d10));
            if (dAbs < d11) {
                imageSource2 = imageSource3;
                d11 = dAbs;
            }
            if (dAbs < d12 && imageSource3.getCacheControl() != ImageCacheControl.RELOAD && (c1533tJ.t(imageSource3.getUri()) || c1533tJ.v(imageSource3.getUri()))) {
                imageSource = imageSource3;
                d12 = dAbs;
            }
        }
        return new MultiSourceResult(imageSource2, (imageSource == null || imageSource2 == null || !AbstractC2855l.b(imageSource.getSource(), imageSource2.getSource())) ? imageSource : null);
    }
}
