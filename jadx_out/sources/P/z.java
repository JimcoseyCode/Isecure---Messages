package P;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z {
    public static z i(Bitmap bitmap, H.g gVar, Rect rect, int i10, Matrix matrix, F.B b10) {
        return new C1347b(bitmap, gVar, 42, new Size(bitmap.getWidth(), bitmap.getHeight()), rect, i10, matrix, b10);
    }

    public static z j(androidx.camera.core.o oVar, H.g gVar, Rect rect, int i10, Matrix matrix, F.B b10) {
        return k(oVar, gVar, new Size(oVar.getWidth(), oVar.getHeight()), rect, i10, matrix, b10);
    }

    public static z k(androidx.camera.core.o oVar, H.g gVar, Size size, Rect rect, int i10, Matrix matrix, F.B b10) {
        if (O.b.i(oVar.getFormat())) {
            H0.g.h(gVar, "JPEG image must have Exif.");
        }
        return new C1347b(oVar, gVar, oVar.getFormat(), size, rect, i10, matrix, b10);
    }

    public static z l(byte[] bArr, H.g gVar, int i10, Size size, Rect rect, int i11, Matrix matrix, F.B b10) {
        return new C1347b(bArr, gVar, i10, size, rect, i11, matrix, b10);
    }

    public abstract F.B a();

    public abstract Rect b();

    public abstract Object c();

    public abstract H.g d();

    public abstract int e();

    public abstract int f();

    public abstract Matrix g();

    public abstract Size h();
}
