package k6;

import J4.G5;
import J4.I5;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import android.os.SystemClock;
import c6.InterfaceC1863h;
import java.nio.ByteBuffer;
import l6.C2877c;
import r4.AbstractC3268i;

/* JADX INFO: renamed from: k6.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class C2831a implements InterfaceC1863h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Bitmap f29132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile ByteBuffer f29133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile C2832b f29134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f29135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f29136e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f29137f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f29138g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Matrix f29139h;

    private C2831a(Bitmap bitmap, int i10) {
        this.f29132a = (Bitmap) AbstractC3268i.k(bitmap);
        this.f29135d = bitmap.getWidth();
        this.f29136e = bitmap.getHeight();
        l(i10);
        this.f29137f = i10;
        this.f29138g = -1;
        this.f29139h = null;
    }

    public static C2831a a(Bitmap bitmap, int i10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C2831a c2831a = new C2831a(bitmap, i10);
        n(-1, 1, jElapsedRealtime, bitmap.getHeight(), bitmap.getWidth(), bitmap.getAllocationByteCount(), i10);
        return c2831a;
    }

    public static C2831a b(Image image, int i10) {
        return m(image, i10, null);
    }

    private static int l(int i10) {
        boolean z10 = true;
        if (i10 != 0 && i10 != 90 && i10 != 180) {
            if (i10 == 270) {
                i10 = 270;
            } else {
                z10 = false;
            }
        }
        AbstractC3268i.b(z10, "Invalid rotation. Only 0, 90, 180, 270 are supported currently.");
        return i10;
    }

    private static C2831a m(Image image, int i10, Matrix matrix) {
        Image image2;
        int i11;
        int iLimit;
        C2831a c2831a;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        AbstractC3268i.l(image, "Please provide a valid image");
        l(i10);
        boolean z10 = true;
        if (image.getFormat() != 256 && image.getFormat() != 35) {
            z10 = false;
        }
        AbstractC3268i.b(z10, "Only JPEG and YUV_420_888 are supported now");
        Image.Plane[] planes = image.getPlanes();
        if (image.getFormat() == 256) {
            iLimit = image.getPlanes()[0].getBuffer().limit();
            image2 = image;
            i11 = i10;
            c2831a = new C2831a(C2877c.d().b(image, i10), 0);
        } else {
            for (Image.Plane plane : planes) {
                if (plane.getBuffer() != null) {
                    plane.getBuffer().rewind();
                }
            }
            image2 = image;
            i11 = i10;
            C2831a c2831a2 = new C2831a(image2, image.getWidth(), image.getHeight(), i11, matrix);
            iLimit = (image2.getPlanes()[0].getBuffer().limit() * 3) / 2;
            c2831a = c2831a2;
        }
        n(image2.getFormat(), 5, jElapsedRealtime, image2.getHeight(), image2.getWidth(), iLimit, i11);
        return c2831a;
    }

    private static void n(int i10, int i11, long j10, int i12, int i13, int i14, int i15) {
        I5.a(G5.b("vision-common"), i10, i11, j10, i12, i13, i14, i15);
    }

    public Bitmap c() {
        return this.f29132a;
    }

    public ByteBuffer d() {
        return this.f29133b;
    }

    public Matrix e() {
        return this.f29139h;
    }

    public int f() {
        return this.f29138g;
    }

    public int g() {
        return this.f29136e;
    }

    public Image h() {
        if (this.f29134c == null) {
            return null;
        }
        return this.f29134c.a();
    }

    public Image.Plane[] i() {
        if (this.f29134c == null) {
            return null;
        }
        return this.f29134c.b();
    }

    public int j() {
        return this.f29137f;
    }

    public int k() {
        return this.f29135d;
    }

    private C2831a(Image image, int i10, int i11, int i12, Matrix matrix) {
        AbstractC3268i.k(image);
        this.f29134c = new C2832b(image);
        this.f29135d = i10;
        this.f29136e = i11;
        l(i12);
        this.f29137f = i12;
        this.f29138g = 35;
        this.f29139h = matrix;
    }
}
