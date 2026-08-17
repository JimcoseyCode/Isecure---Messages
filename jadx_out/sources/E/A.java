package E;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class A implements P.y {
    A() {
    }

    private Bitmap b(byte[] bArr, Rect rect) throws y.X {
        try {
            return BitmapRegionDecoder.newInstance(bArr, 0, bArr.length, false).decodeRegion(rect, new BitmapFactory.Options());
        } catch (IOException e10) {
            throw new y.X(1, "Failed to decode JPEG.", e10);
        }
    }

    @Override // P.y
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public P.z apply(P.z zVar) throws y.X {
        Rect rectB = zVar.b();
        Bitmap bitmapB = b((byte[]) zVar.c(), rectB);
        H.g gVarD = zVar.d();
        Objects.requireNonNull(gVarD);
        return P.z.i(bitmapB, gVarD, new Rect(0, 0, bitmapB.getWidth(), bitmapB.getHeight()), zVar.f(), H.z.u(zVar.g(), rectB), zVar.a());
    }
}
