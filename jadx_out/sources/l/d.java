package L;

import H.n;
import android.media.Image;
import android.media.ImageWriter;
import android.view.Surface;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class d {
    static void c(ImageWriter imageWriter) {
        imageWriter.close();
    }

    static Image d(ImageWriter imageWriter) {
        return imageWriter.dequeueInputImage();
    }

    static ImageWriter e(Surface surface, int i10) {
        return ImageWriter.newInstance(surface, i10);
    }

    static void f(ImageWriter imageWriter, Image image) {
        imageWriter.queueInputImage(image);
    }

    static void g(ImageWriter imageWriter, final ImageWriter.OnImageReleasedListener onImageReleasedListener, final Executor executor) {
        imageWriter.setOnImageReleasedListener(new ImageWriter.OnImageReleasedListener() { // from class: L.b
            @Override // android.media.ImageWriter.OnImageReleasedListener
            public final void onImageReleased(ImageWriter imageWriter2) {
                executor.execute(new Runnable() { // from class: L.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        onImageReleasedListener.onImageReleased(imageWriter2);
                    }
                });
            }
        }, n.a());
    }
}
