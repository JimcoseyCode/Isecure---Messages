package E;

import androidx.camera.core.ImageProcessingUtil;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C implements P.y {
    @Override // P.y
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public P.z apply(P.z zVar) {
        androidx.camera.core.r rVar = new androidx.camera.core.r(androidx.camera.core.p.a(zVar.h().getWidth(), zVar.h().getHeight(), 256, 2));
        androidx.camera.core.o oVarE = ImageProcessingUtil.e(rVar, (byte[]) zVar.c());
        rVar.j();
        Objects.requireNonNull(oVarE);
        H.g gVarD = zVar.d();
        Objects.requireNonNull(gVarD);
        return P.z.j(oVarE, gVarD, zVar.b(), zVar.f(), zVar.g(), zVar.a());
    }
}
