package androidx.camera.core;

import F.u1;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.o;
import java.nio.ByteBuffer;
import y.AbstractC3577e0;
import y.Y;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class a implements o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Image f15147g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C0149a[] f15148h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Y f15149i;

    /* JADX INFO: renamed from: androidx.camera.core.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class C0149a implements o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Image.Plane f15150a;

        C0149a(Image.Plane plane) {
            this.f15150a = plane;
        }

        @Override // androidx.camera.core.o.a
        public ByteBuffer c() {
            return this.f15150a.getBuffer();
        }

        @Override // androidx.camera.core.o.a
        public int d() {
            return this.f15150a.getRowStride();
        }

        @Override // androidx.camera.core.o.a
        public int e() {
            return this.f15150a.getPixelStride();
        }
    }

    a(Image image) {
        this.f15147g = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.f15148h = new C0149a[planes.length];
            for (int i10 = 0; i10 < planes.length; i10++) {
                this.f15148h[i10] = new C0149a(planes[i10]);
            }
        } else {
            this.f15148h = new C0149a[0];
        }
        this.f15149i = AbstractC3577e0.f(u1.b(), image.getTimestamp(), 0, new Matrix(), 0);
    }

    @Override // androidx.camera.core.o
    public void b0(Rect rect) {
        this.f15147g.setCropRect(rect);
    }

    @Override // androidx.camera.core.o, java.lang.AutoCloseable
    public void close() {
        this.f15147g.close();
    }

    @Override // androidx.camera.core.o
    public int getFormat() {
        return this.f15147g.getFormat();
    }

    @Override // androidx.camera.core.o
    public int getHeight() {
        return this.f15147g.getHeight();
    }

    @Override // androidx.camera.core.o
    public int getWidth() {
        return this.f15147g.getWidth();
    }

    @Override // androidx.camera.core.o
    public Y i() {
        return this.f15149i;
    }

    @Override // androidx.camera.core.o
    public o.a[] p() {
        return this.f15148h;
    }

    @Override // androidx.camera.core.o
    public Image p0() {
        return this.f15147g;
    }
}
