package expo.modules.interfaces.imageloader;

import android.graphics.Bitmap;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.services.Service;
import java.util.concurrent.Future;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\rJ\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u0006\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u0006\u0010\u000bJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\u0007J\u001f\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\f\u0010\u000b¨\u0006\u000e"}, d2 = {"Lexpo/modules/interfaces/imageloader/ImageLoaderInterface;", "Lexpo/modules/kotlin/services/Service;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "url", "Ljava/util/concurrent/Future;", "Landroid/graphics/Bitmap;", "loadImageForDisplayFromURL", "(Ljava/lang/String;)Ljava/util/concurrent/Future;", "Lexpo/modules/interfaces/imageloader/ImageLoaderInterface$ResultListener;", "resultListener", "Li7/B;", "(Ljava/lang/String;Lexpo/modules/interfaces/imageloader/ImageLoaderInterface$ResultListener;)V", "loadImageForManipulationFromURL", "ResultListener", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ImageLoaderInterface extends Service {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lexpo/modules/interfaces/imageloader/ImageLoaderInterface$ResultListener;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Landroid/graphics/Bitmap;", "bitmap", "Li7/B;", "onSuccess", "(Landroid/graphics/Bitmap;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "cause", "onFailure", "(Ljava/lang/Throwable;)V", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ResultListener {
        void onFailure(Throwable cause);

        void onSuccess(Bitmap bitmap);
    }

    Future<Bitmap> loadImageForDisplayFromURL(String url);

    void loadImageForDisplayFromURL(String url, ResultListener resultListener);

    Future<Bitmap> loadImageForManipulationFromURL(String url);

    void loadImageForManipulationFromURL(String url, ResultListener resultListener);
}
