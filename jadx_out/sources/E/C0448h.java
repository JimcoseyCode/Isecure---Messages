package E;

import android.graphics.Bitmap;
import android.os.Build;
import java.io.ByteArrayOutputStream;
import java.util.Objects;

/* JADX INFO: renamed from: E.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C0448h implements P.y {

    /* JADX INFO: renamed from: E.h$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class a {
        static boolean a(Bitmap bitmap) {
            return bitmap.hasGainmap();
        }
    }

    /* JADX INFO: renamed from: E.h$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class b {
        public static b c(P.z zVar, int i10) {
            return new C0441a(zVar, i10);
        }

        abstract int a();

        abstract P.z b();
    }

    private static int b(Bitmap bitmap) {
        return (Build.VERSION.SDK_INT < 34 || !a.a(bitmap)) ? 256 : 4101;
    }

    @Override // P.y
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public P.z apply(b bVar) {
        P.z zVarB = bVar.b();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) zVarB.c()).compress(Bitmap.CompressFormat.JPEG, bVar.a(), byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        H.g gVarD = zVarB.d();
        Objects.requireNonNull(gVarD);
        return P.z.l(byteArray, gVarD, b((Bitmap) zVarB.c()), zVarB.h(), zVarB.b(), zVarB.f(), zVarB.g(), zVarB.a());
    }
}
