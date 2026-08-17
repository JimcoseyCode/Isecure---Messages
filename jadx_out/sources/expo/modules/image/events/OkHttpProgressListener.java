package expo.modules.image.events;

import com.facebook.react.modules.network.ProgressListener;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.image.ExpoImageViewWrapper;
import expo.modules.image.records.ImageProgressEvent;
import expo.modules.kotlin.viewevent.ViewEventCallback;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000f¨\u0006\u0010"}, d2 = {"Lexpo/modules/image/events/OkHttpProgressListener;", "Lcom/facebook/react/modules/network/ProgressListener;", "Ljava/lang/ref/WeakReference;", "Lexpo/modules/image/ExpoImageViewWrapper;", "expoImageViewWrapper", "<init>", "(Ljava/lang/ref/WeakReference;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "bytesWritten", "contentLength", PointerEventHelper.POINTER_TYPE_UNKNOWN, "done", "Li7/B;", "onProgress", "(JJZ)V", "Ljava/lang/ref/WeakReference;", "expo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OkHttpProgressListener implements ProgressListener {
    private final WeakReference<ExpoImageViewWrapper> expoImageViewWrapper;

    public OkHttpProgressListener(WeakReference<ExpoImageViewWrapper> expoImageViewWrapper) {
        AbstractC2855l.g(expoImageViewWrapper, "expoImageViewWrapper");
        this.expoImageViewWrapper = expoImageViewWrapper;
    }

    @Override // com.facebook.react.modules.network.ProgressListener
    public void onProgress(long bytesWritten, long contentLength, boolean done) {
        ExpoImageViewWrapper expoImageViewWrapper;
        ViewEventCallback<ImageProgressEvent> onProgress$expo_image_release;
        if (contentLength <= 0 || done || (expoImageViewWrapper = this.expoImageViewWrapper.get()) == null || (onProgress$expo_image_release = expoImageViewWrapper.getOnProgress$expo_image_release()) == null) {
            return;
        }
        onProgress$expo_image_release.invoke(new ImageProgressEvent((int) bytesWritten, (int) contentLength));
    }
}
