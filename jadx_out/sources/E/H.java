package E;

import E.Q;
import F.B;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class H implements P.y {
    H() {
    }

    private static P.z b(S s10, H.g gVar, androidx.camera.core.o oVar) {
        return P.z.j(oVar, gVar, s10.b(), s10.f(), s10.h(), d(oVar));
    }

    private static P.z c(S s10, H.g gVar, androidx.camera.core.o oVar) {
        Size size = new Size(oVar.getWidth(), oVar.getHeight());
        int iF = s10.f() - gVar.n();
        Size sizeE = e(iF, size);
        Matrix matrixD = H.z.d(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), new RectF(0.0f, 0.0f, sizeE.getWidth(), sizeE.getHeight()), iF);
        return P.z.k(oVar, gVar, sizeE, f(s10.b(), matrixD), gVar.n(), g(s10.h(), matrixD), d(oVar));
    }

    private static F.B d(androidx.camera.core.o oVar) {
        return oVar.i() instanceof K.c ? ((K.c) oVar.i()).f() : B.a.l();
    }

    private static Size e(int i10, Size size) {
        return H.z.i(H.z.v(i10)) ? new Size(size.getHeight(), size.getWidth()) : size;
    }

    private static Rect f(Rect rect, Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        rectF.sort();
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    private static Matrix g(Matrix matrix, Matrix matrix2) {
        Matrix matrix3 = new Matrix(matrix);
        matrix3.postConcat(matrix2);
        return matrix3;
    }

    @Override // P.y
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public P.z apply(Q.b bVar) throws y.X {
        H.g gVarG;
        androidx.camera.core.o oVarA = bVar.a();
        S sB = bVar.b();
        if (O.b.i(oVarA.getFormat())) {
            try {
                gVarG = H.g.g(oVarA);
                oVarA.p()[0].c().rewind();
            } catch (IOException e10) {
                throw new y.X(1, "Failed to extract EXIF data.", e10);
            }
        } else {
            gVarG = null;
        }
        if (!C0465z.f1007g.b(oVarA)) {
            return b(sB, gVarG, oVarA);
        }
        H0.g.h(gVarG, "JPEG image must have exif.");
        return c(sB, gVarG, oVarA);
    }
}
