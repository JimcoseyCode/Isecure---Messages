package W;

import F.F0;
import android.media.Image;
import android.media.ImageWriter;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.o;
import androidx.camera.core.p;
import androidx.camera.extensions.internal.compat.quirk.CaptureOutputSurfaceOccupiedQuirk;
import y.AbstractC3583h0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ImageWriter f11889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final F0 f11890c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Surface f11892e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f11893f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f11894g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f11888a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f11891d = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    long f11895h = -1;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class a {
        static void a(Image image, long j10) {
            image.setTimestamp(j10);
        }
    }

    /* JADX INFO: renamed from: W.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class C0125b {
        static void a(ImageWriter imageWriter) {
            imageWriter.close();
        }

        static ImageWriter b(Surface surface, int i10, int i11) {
            return ImageWriter.newInstance(surface, i10, i11);
        }

        static void c(ImageWriter imageWriter, Image image) {
            imageWriter.queueInputImage(image);
        }
    }

    public b(Surface surface, Size size, boolean z10) {
        this.f11894g = z10;
        boolean z11 = androidx.camera.extensions.internal.compat.quirk.a.b(CaptureOutputSurfaceOccupiedQuirk.class) != null || z10;
        this.f11893f = z11;
        if (Build.VERSION.SDK_INT < 29 || !z11) {
            this.f11892e = surface;
            this.f11890c = null;
            this.f11889b = null;
        } else {
            AbstractC3583h0.a("CaptureOutputSurface", "Enabling intermediate surface");
            F0 f0A = p.a(size.getWidth(), size.getHeight(), 35, 2);
            this.f11890c = f0A;
            this.f11892e = f0A.getSurface();
            this.f11889b = C0125b.b(surface, 2, 35);
            f0A.e(new F0.a() { // from class: W.a
                @Override // F.F0.a
                public final void a(F0 f02) {
                    b.a(this.f11887a, f02);
                }
            }, I.c.b());
        }
    }

    public static /* synthetic */ void a(b bVar, F0 f02) {
        Image imageP0;
        synchronized (bVar.f11888a) {
            try {
                if (bVar.f11891d) {
                    return;
                }
                o oVarG = f02.g();
                if (oVarG != null && (imageP0 = oVarG.p0()) != null) {
                    if (bVar.f11894g) {
                        long j10 = bVar.f11895h;
                        if (j10 != -1) {
                            a.a(imageP0, j10);
                        }
                    }
                    C0125b.c(bVar.f11889b, imageP0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b() {
        synchronized (this.f11888a) {
            try {
                this.f11891d = true;
                if (Build.VERSION.SDK_INT >= 29 && this.f11893f) {
                    this.f11890c.d();
                    this.f11890c.close();
                    C0125b.a(this.f11889b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Surface c() {
        return this.f11892e;
    }

    public void d(long j10) {
        if (this.f11894g) {
            this.f11895h = j10;
        }
    }
}
