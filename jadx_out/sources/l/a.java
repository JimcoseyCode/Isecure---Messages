package L;

import android.media.Image;
import android.media.ImageWriter;
import android.view.Surface;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static void a(ImageWriter imageWriter) {
        d.c(imageWriter);
    }

    public static Image b(ImageWriter imageWriter) {
        return d.d(imageWriter);
    }

    public static ImageWriter c(Surface surface, int i10) {
        return d.e(surface, i10);
    }

    public static void d(ImageWriter imageWriter, Image image) {
        d.f(imageWriter, image);
    }

    public static void e(ImageWriter imageWriter, ImageWriter.OnImageReleasedListener onImageReleasedListener, Executor executor) {
        d.g(imageWriter, onImageReleasedListener, executor);
    }
}
