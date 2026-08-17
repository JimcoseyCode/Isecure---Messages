package l6;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.nio.ByteBuffer;
import k6.C2831a;
import r4.AbstractC3268i;
import r4.C3263d;

/* JADX INFO: renamed from: l6.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class C2878d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C3263d f29448a = new C3263d("MLKitImageUtils", PointerEventHelper.POINTER_TYPE_UNKNOWN);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C2878d f29449b = new C2878d();

    private C2878d() {
    }

    public static C2878d b() {
        return f29449b;
    }

    public B4.a a(C2831a c2831a) throws Y5.a {
        int iF = c2831a.f();
        if (iF == -1) {
            return B4.b.x((Bitmap) AbstractC3268i.k(c2831a.c()));
        }
        if (iF != 17) {
            if (iF == 35) {
                return B4.b.x(c2831a.h());
            }
            if (iF != 842094169) {
                throw new Y5.a("Unsupported image format: " + c2831a.f(), 3);
            }
        }
        return B4.b.x((ByteBuffer) AbstractC3268i.k(c2831a.d()));
    }

    public int c(C2831a c2831a) {
        if (c2831a.f() == -1) {
            return ((Bitmap) AbstractC3268i.k(c2831a.c())).getAllocationByteCount();
        }
        if (c2831a.f() == 17 || c2831a.f() == 842094169) {
            return ((ByteBuffer) AbstractC3268i.k(c2831a.d())).limit();
        }
        if (c2831a.f() != 35) {
            return 0;
        }
        return (((Image.Plane[]) AbstractC3268i.k(c2831a.i()))[0].getBuffer().limit() * 3) / 2;
    }

    public Matrix d(int i10, int i11, int i12) {
        if (i12 == 0) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postTranslate((-i10) / 2.0f, (-i11) / 2.0f);
        matrix.postRotate(i12 * 90);
        int i13 = i12 % 2;
        int i14 = i13 != 0 ? i11 : i10;
        if (i13 == 0) {
            i10 = i11;
        }
        matrix.postTranslate(i14 / 2.0f, i10 / 2.0f);
        return matrix;
    }
}
