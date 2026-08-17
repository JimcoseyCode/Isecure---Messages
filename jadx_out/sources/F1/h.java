package F1;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import x1.v;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f1794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y1.b f1795b;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class a implements v {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final AnimatedImageDrawable f1796g;

        a(AnimatedImageDrawable animatedImageDrawable) {
            this.f1796g = animatedImageDrawable;
        }

        @Override // x1.v
        public Class a() {
            return Drawable.class;
        }

        @Override // x1.v
        public int b() {
            return this.f1796g.getIntrinsicWidth() * this.f1796g.getIntrinsicHeight() * Q1.l.j(Bitmap.Config.ARGB_8888) * 2;
        }

        @Override // x1.v
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public AnimatedImageDrawable get() {
            return this.f1796g;
        }

        @Override // x1.v
        public void recycle() {
            this.f1796g.stop();
            this.f1796g.clearAnimationCallbacks();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class b implements v1.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final h f1797a;

        b(h hVar) {
            this.f1797a = hVar;
        }

        @Override // v1.j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public v decode(ByteBuffer byteBuffer, int i10, int i11, v1.h hVar) {
            return this.f1797a.b(ImageDecoder.createSource(byteBuffer), i10, i11, hVar);
        }

        @Override // v1.j
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean handles(ByteBuffer byteBuffer, v1.h hVar) {
            return this.f1797a.d(byteBuffer);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class c implements v1.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final h f1798a;

        c(h hVar) {
            this.f1798a = hVar;
        }

        @Override // v1.j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public v decode(InputStream inputStream, int i10, int i11, v1.h hVar) {
            return this.f1798a.b(ImageDecoder.createSource(Q1.a.b(inputStream)), i10, i11, hVar);
        }

        @Override // v1.j
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean handles(InputStream inputStream, v1.h hVar) {
            return this.f1798a.c(inputStream);
        }
    }

    private h(List list, y1.b bVar) {
        this.f1794a = list;
        this.f1795b = bVar;
    }

    public static v1.j a(List list, y1.b bVar) {
        return new b(new h(list, bVar));
    }

    private boolean e(ImageHeaderParser.ImageType imageType) {
        if (imageType != ImageHeaderParser.ImageType.ANIMATED_WEBP) {
            return Build.VERSION.SDK_INT >= 31 && imageType == ImageHeaderParser.ImageType.ANIMATED_AVIF;
        }
        return true;
    }

    public static v1.j f(List list, y1.b bVar) {
        return new c(new h(list, bVar));
    }

    v b(ImageDecoder.Source source, int i10, int i11, v1.h hVar) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new D1.l(i10, i11, hVar));
        if (F1.b.a(drawableDecodeDrawable)) {
            return new a(F1.c.a(drawableDecodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + drawableDecodeDrawable);
    }

    boolean c(InputStream inputStream) {
        return e(com.bumptech.glide.load.a.f(this.f1794a, inputStream, this.f1795b));
    }

    boolean d(ByteBuffer byteBuffer) {
        return e(com.bumptech.glide.load.a.g(this.f1794a, byteBuffer));
    }
}
