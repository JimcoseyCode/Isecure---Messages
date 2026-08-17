package E;

import F.g1;
import O.b;
import android.graphics.Rect;
import android.util.Size;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: renamed from: E.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C0463x implements P.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final N.d f1005a;

    /* JADX INFO: renamed from: E.x$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static abstract class a {
        a() {
        }

        static a c(P.z zVar, int i10) {
            return new C0443c(zVar, i10);
        }

        abstract int a();

        abstract P.z b();
    }

    C0463x(g1 g1Var) {
        this.f1005a = new N.d(g1Var);
    }

    private static H.g b(byte[] bArr) throws y.X {
        try {
            return H.g.h(new ByteArrayInputStream(bArr));
        } catch (IOException e10) {
            throw new y.X(0, "Failed to extract Exif from YUV-generated JPEG", e10);
        }
    }

    private P.z c(a aVar, int i10) {
        P.z zVarB = aVar.b();
        byte[] bArrA = this.f1005a.a((androidx.camera.core.o) zVarB.c());
        H.g gVarD = zVarB.d();
        Objects.requireNonNull(gVarD);
        return P.z.l(bArrA, gVarD, i10, zVarB.h(), zVarB.b(), zVarB.f(), zVarB.g(), zVarB.a());
    }

    private P.z d(a aVar) throws y.X {
        P.z zVarB = aVar.b();
        androidx.camera.core.o oVar = (androidx.camera.core.o) zVarB.c();
        Rect rectB = zVarB.b();
        try {
            byte[] bArrM = O.b.m(oVar, rectB, aVar.a(), zVarB.f());
            return P.z.l(bArrM, b(bArrM), 256, new Size(rectB.width(), rectB.height()), new Rect(0, 0, rectB.width(), rectB.height()), zVarB.f(), H.z.u(zVarB.g(), rectB), zVarB.a());
        } catch (b.a e10) {
            throw new y.X(1, "Failed to encode the image to JPEG.", e10);
        }
    }

    @Override // P.y
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public P.z apply(a aVar) {
        P.z zVarD;
        try {
            int iE = aVar.b().e();
            if (iE != 35) {
                if (iE != 256 && iE != 4101) {
                    throw new IllegalArgumentException("Unexpected format: " + iE);
                }
                zVarD = c(aVar, iE);
            } else {
                zVarD = d(aVar);
            }
            ((androidx.camera.core.o) aVar.b().c()).close();
            return zVarD;
        } catch (Throwable th) {
            ((androidx.camera.core.o) aVar.b().c()).close();
            throw th;
        }
    }
}
