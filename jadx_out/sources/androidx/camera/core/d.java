package androidx.camera.core;

import F.F0;
import android.media.Image;
import android.media.ImageReader;
import android.view.Surface;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class d implements F0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ImageReader f15156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f15157b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f15158c = true;

    d(ImageReader imageReader) {
        this.f15156a = imageReader;
    }

    public static /* synthetic */ void a(final d dVar, Executor executor, final F0.a aVar, ImageReader imageReader) {
        synchronized (dVar.f15157b) {
            try {
                if (!dVar.f15158c) {
                    executor.execute(new Runnable() { // from class: androidx.camera.core.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            d.h(this.f15154g, aVar);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void h(d dVar, F0.a aVar) {
        dVar.getClass();
        aVar.a(dVar);
    }

    private boolean i(RuntimeException runtimeException) {
        return "ImageReaderContext is not initialized".equals(runtimeException.getMessage());
    }

    @Override // F.F0
    public o b() {
        Image imageAcquireLatestImage;
        synchronized (this.f15157b) {
            try {
                imageAcquireLatestImage = this.f15156a.acquireLatestImage();
            } catch (RuntimeException e10) {
                if (!i(e10)) {
                    throw e10;
                }
                imageAcquireLatestImage = null;
            }
            if (imageAcquireLatestImage == null) {
                return null;
            }
            return new a(imageAcquireLatestImage);
        }
    }

    @Override // F.F0
    public int c() {
        int imageFormat;
        synchronized (this.f15157b) {
            imageFormat = this.f15156a.getImageFormat();
        }
        return imageFormat;
    }

    @Override // F.F0
    public void close() {
        synchronized (this.f15157b) {
            this.f15156a.close();
        }
    }

    @Override // F.F0
    public void d() {
        synchronized (this.f15157b) {
            this.f15158c = true;
            this.f15156a.setOnImageAvailableListener(null, null);
        }
    }

    @Override // F.F0
    public void e(final F0.a aVar, final Executor executor) {
        synchronized (this.f15157b) {
            this.f15158c = false;
            this.f15156a.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: androidx.camera.core.b
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    d.a(this.f15151a, executor, aVar, imageReader);
                }
            }, H.n.a());
        }
    }

    @Override // F.F0
    public int f() {
        int maxImages;
        synchronized (this.f15157b) {
            maxImages = this.f15156a.getMaxImages();
        }
        return maxImages;
    }

    @Override // F.F0
    public o g() {
        Image imageAcquireNextImage;
        synchronized (this.f15157b) {
            try {
                imageAcquireNextImage = this.f15156a.acquireNextImage();
            } catch (RuntimeException e10) {
                if (!i(e10)) {
                    throw e10;
                }
                imageAcquireNextImage = null;
            }
            if (imageAcquireNextImage == null) {
                return null;
            }
            return new a(imageAcquireNextImage);
        }
    }

    @Override // F.F0
    public int getHeight() {
        int height;
        synchronized (this.f15157b) {
            height = this.f15156a.getHeight();
        }
        return height;
    }

    @Override // F.F0
    public Surface getSurface() {
        Surface surface;
        synchronized (this.f15157b) {
            surface = this.f15156a.getSurface();
        }
        return surface;
    }

    @Override // F.F0
    public int getWidth() {
        int width;
        synchronized (this.f15157b) {
            width = this.f15156a.getWidth();
        }
        return width;
    }
}
