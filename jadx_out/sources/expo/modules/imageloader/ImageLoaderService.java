package expo.modules.imageloader;

import N1.a;
import P8.q;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.b;
import com.bumptech.glide.j;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.interfaces.imageloader.ImageLoaderInterface;
import expo.modules.kotlin.services.ServiceInterface;
import j7.AbstractC2800q;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import x1.AbstractC3526j;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@ServiceInterface(clazz = ImageLoaderInterface.class)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\f\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\f\u0010\u0011J\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lexpo/modules/imageloader/ImageLoaderService;", "Lexpo/modules/interfaces/imageloader/ImageLoaderInterface;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "url", "normalizeAssetsUrl", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/util/concurrent/Future;", "Landroid/graphics/Bitmap;", "loadImageForDisplayFromURL", "(Ljava/lang/String;)Ljava/util/concurrent/Future;", "Lexpo/modules/interfaces/imageloader/ImageLoaderInterface$ResultListener;", "resultListener", "Li7/B;", "(Ljava/lang/String;Lexpo/modules/interfaces/imageloader/ImageLoaderInterface$ResultListener;)V", "loadImageForManipulationFromURL", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "expo-image-loader_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ImageLoaderService implements ImageLoaderInterface {
    private final Context context;

    public ImageLoaderService(Context context) {
        AbstractC2855l.g(context, "context");
        this.context = context;
    }

    private final String normalizeAssetsUrl(String url) {
        if (!q.K(url, "asset:///", false, 2, null)) {
            return url;
        }
        return "file:///android_asset/" + AbstractC2800q.q0(q.G0(url, new String[]{"/"}, false, 0, 6, null));
    }

    public final Context getContext() {
        return this.context;
    }

    @Override // expo.modules.interfaces.imageloader.ImageLoaderInterface
    public Future<Bitmap> loadImageForDisplayFromURL(String url) {
        AbstractC2855l.g(url, "url");
        final SimpleSettableFuture simpleSettableFuture = new SimpleSettableFuture();
        loadImageForDisplayFromURL(url, new ImageLoaderInterface.ResultListener() { // from class: expo.modules.imageloader.ImageLoaderService.loadImageForDisplayFromURL.1
            @Override // expo.modules.interfaces.imageloader.ImageLoaderInterface.ResultListener
            public void onFailure(Throwable cause) {
                simpleSettableFuture.setException(new ExecutionException(cause));
            }

            @Override // expo.modules.interfaces.imageloader.ImageLoaderInterface.ResultListener
            public void onSuccess(Bitmap bitmap) {
                AbstractC2855l.g(bitmap, "bitmap");
                simpleSettableFuture.set(bitmap);
            }
        });
        return simpleSettableFuture;
    }

    @Override // expo.modules.interfaces.imageloader.ImageLoaderInterface
    public Future<Bitmap> loadImageForManipulationFromURL(String url) {
        AbstractC2855l.g(url, "url");
        final SimpleSettableFuture simpleSettableFuture = new SimpleSettableFuture();
        loadImageForManipulationFromURL(url, new ImageLoaderInterface.ResultListener() { // from class: expo.modules.imageloader.ImageLoaderService.loadImageForManipulationFromURL.1
            @Override // expo.modules.interfaces.imageloader.ImageLoaderInterface.ResultListener
            public void onFailure(Throwable cause) {
                simpleSettableFuture.setException(new ExecutionException(cause));
            }

            @Override // expo.modules.interfaces.imageloader.ImageLoaderInterface.ResultListener
            public void onSuccess(Bitmap bitmap) {
                AbstractC2855l.g(bitmap, "bitmap");
                simpleSettableFuture.set(bitmap);
            }
        });
        return simpleSettableFuture;
    }

    @Override // expo.modules.interfaces.imageloader.ImageLoaderInterface
    public void loadImageForDisplayFromURL(String url, final ImageLoaderInterface.ResultListener resultListener) {
        AbstractC2855l.g(url, "url");
        AbstractC2855l.g(resultListener, "resultListener");
        b.v(this.context).b().y0(url).q0(new a() { // from class: expo.modules.imageloader.ImageLoaderService.loadImageForDisplayFromURL.2
            @Override // N1.a, N1.d
            public void onLoadFailed(Drawable errorDrawable) {
                super.onLoadFailed(errorDrawable);
                resultListener.onFailure(new Exception("Loading bitmap failed"));
            }

            @Override // N1.d
            public void onResourceReady(Bitmap resource, O1.b transition) {
                AbstractC2855l.g(resource, "resource");
                resultListener.onSuccess(resource);
            }

            @Override // N1.d
            public void onLoadCleared(Drawable placeholder) {
            }
        });
    }

    @Override // expo.modules.interfaces.imageloader.ImageLoaderInterface
    public void loadImageForManipulationFromURL(String url, final ImageLoaderInterface.ResultListener resultListener) {
        AbstractC2855l.g(url, "url");
        AbstractC2855l.g(resultListener, "resultListener");
        ((j) ((j) b.v(this.context).b().g(AbstractC3526j.f33373b)).a0(true)).y0(normalizeAssetsUrl(url)).q0(new a() { // from class: expo.modules.imageloader.ImageLoaderService.loadImageForManipulationFromURL.2
            @Override // N1.a, N1.d
            public void onLoadFailed(Drawable errorDrawable) {
                super.onLoadFailed(errorDrawable);
                resultListener.onFailure(new Exception("Loading bitmap failed"));
            }

            @Override // N1.d
            public void onResourceReady(Bitmap resource, O1.b transition) {
                AbstractC2855l.g(resource, "resource");
                resultListener.onSuccess(resource);
            }

            @Override // N1.d
            public void onLoadCleared(Drawable placeholder) {
            }
        });
    }
}
