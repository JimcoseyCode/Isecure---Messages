package E;

import android.graphics.Bitmap;
import androidx.camera.core.ImageProcessingUtil;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: E.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C0462w implements P.y {
    @Override // P.y
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Bitmap apply(P.z zVar) throws Throwable {
        androidx.camera.core.r rVar;
        Bitmap bitmapL;
        androidx.camera.core.r rVar2 = null;
        try {
            try {
                int iE = zVar.e();
                if (iE == 35) {
                    androidx.camera.core.o oVar = (androidx.camera.core.o) zVar.c();
                    boolean z10 = zVar.f() % 180 != 0;
                    rVar = new androidx.camera.core.r(androidx.camera.core.p.a(z10 ? oVar.getHeight() : oVar.getWidth(), z10 ? oVar.getWidth() : oVar.getHeight(), 1, 2));
                    try {
                        androidx.camera.core.o oVarG = ImageProcessingUtil.g(oVar, rVar, ByteBuffer.allocateDirect(oVar.getWidth() * oVar.getHeight() * 4), zVar.f(), false);
                        oVar.close();
                        if (oVarG == null) {
                            throw new y.X(0, "Can't covert YUV to RGB", null);
                        }
                        bitmapL = O.b.b(oVarG);
                        oVarG.close();
                    } catch (UnsupportedOperationException e10) {
                        e = e10;
                        throw new y.X(0, "Can't convert " + (zVar.e() == 35 ? "YUV" : "JPEG") + " to bitmap", e);
                    } catch (Throwable th) {
                        th = th;
                        rVar2 = rVar;
                        if (rVar2 != null) {
                            rVar2.close();
                        }
                        throw th;
                    }
                } else {
                    if (iE != 256 && iE != 4101) {
                        throw new IllegalArgumentException("Invalid postview image format : " + zVar.e());
                    }
                    androidx.camera.core.o oVar2 = (androidx.camera.core.o) zVar.c();
                    Bitmap bitmapB = O.b.b(oVar2);
                    oVar2.close();
                    rVar = null;
                    bitmapL = O.b.l(bitmapB, zVar.f());
                }
                if (rVar != null) {
                    rVar.close();
                }
                return bitmapL;
            } catch (UnsupportedOperationException e11) {
                e = e11;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
