package E;

import F.u1;
import H.i;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.o;
import java.nio.ByteBuffer;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class W implements androidx.camera.core.o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f913g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f914h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f915i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Rect f916j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    o.a[] f917k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final y.Y f918l;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f919a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f920b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f921c;

        a(int i10, int i11, ByteBuffer byteBuffer) {
            this.f919a = i10;
            this.f920b = i11;
            this.f921c = byteBuffer;
        }

        @Override // androidx.camera.core.o.a
        public ByteBuffer c() {
            return this.f921c;
        }

        @Override // androidx.camera.core.o.a
        public int d() {
            return this.f919a;
        }

        @Override // androidx.camera.core.o.a
        public int e() {
            return this.f920b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b implements y.Y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f922a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f923b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Matrix f924c;

        b(long j10, int i10, Matrix matrix) {
            this.f922a = j10;
            this.f923b = i10;
            this.f924c = matrix;
        }

        @Override // y.Y
        public long a() {
            return this.f922a;
        }

        @Override // y.Y
        public u1 b() {
            throw new UnsupportedOperationException("Custom ImageProxy does not contain TagBundle");
        }

        @Override // y.Y
        public void d(i.b bVar) {
            throw new UnsupportedOperationException("Custom ImageProxy does not contain Exif data.");
        }

        @Override // y.Y
        public int e() {
            return this.f923b;
        }
    }

    public W(P.z zVar) {
        this((Bitmap) zVar.c(), zVar.b(), zVar.f(), zVar.g(), zVar.a().a());
    }

    private void d() {
        synchronized (this.f913g) {
            H0.g.j(this.f917k != null, "The image is closed.");
        }
    }

    private static y.Y e(long j10, int i10, Matrix matrix) {
        return new b(j10, i10, matrix);
    }

    private static o.a k(ByteBuffer byteBuffer, int i10, int i11) {
        return new a(i10, i11, byteBuffer);
    }

    @Override // androidx.camera.core.o
    public void b0(Rect rect) {
        synchronized (this.f913g) {
            try {
                d();
                if (rect != null) {
                    this.f916j.set(rect);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.o, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f913g) {
            d();
            this.f917k = null;
        }
    }

    @Override // androidx.camera.core.o
    public int getFormat() {
        synchronized (this.f913g) {
            d();
        }
        return 1;
    }

    @Override // androidx.camera.core.o
    public int getHeight() {
        int i10;
        synchronized (this.f913g) {
            d();
            i10 = this.f915i;
        }
        return i10;
    }

    @Override // androidx.camera.core.o
    public int getWidth() {
        int i10;
        synchronized (this.f913g) {
            d();
            i10 = this.f914h;
        }
        return i10;
    }

    @Override // androidx.camera.core.o
    public y.Y i() {
        y.Y y10;
        synchronized (this.f913g) {
            d();
            y10 = this.f918l;
        }
        return y10;
    }

    @Override // androidx.camera.core.o
    public o.a[] p() {
        o.a[] aVarArr;
        synchronized (this.f913g) {
            d();
            o.a[] aVarArr2 = this.f917k;
            Objects.requireNonNull(aVarArr2);
            aVarArr = aVarArr2;
        }
        return aVarArr;
    }

    @Override // androidx.camera.core.o
    public Image p0() {
        synchronized (this.f913g) {
            d();
        }
        return null;
    }

    public W(Bitmap bitmap, Rect rect, int i10, Matrix matrix, long j10) {
        this(O.b.e(bitmap), 4, bitmap.getWidth(), bitmap.getHeight(), rect, i10, matrix, j10);
    }

    public W(ByteBuffer byteBuffer, int i10, int i11, int i12, Rect rect, int i13, Matrix matrix, long j10) {
        this.f913g = new Object();
        this.f914h = i11;
        this.f915i = i12;
        this.f916j = rect;
        this.f918l = e(j10, i13, matrix);
        byteBuffer.rewind();
        this.f917k = new o.a[]{k(byteBuffer, i11 * i10, i10)};
    }
}
