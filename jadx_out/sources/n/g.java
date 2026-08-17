package N;

import F.AbstractC0504q0;
import F.k1;
import android.media.MediaCodec;
import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import y.p0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f7691a;

    public g() {
        this.f7691a = androidx.camera.core.internal.compat.quirk.a.b(SurfaceOrderQuirk.class) != null;
    }

    public static /* synthetic */ int a(g gVar, k1.f fVar, k1.f fVar2) {
        gVar.getClass();
        return gVar.b(fVar.f()) - gVar.b(fVar2.f());
    }

    private int b(AbstractC0504q0 abstractC0504q0) {
        if (abstractC0504q0.g() == MediaCodec.class) {
            return 2;
        }
        return (abstractC0504q0.g() == p0.class || abstractC0504q0.g() == T.g.class) ? 0 : 1;
    }

    public void c(List list) {
        if (this.f7691a) {
            Collections.sort(list, new Comparator() { // from class: N.f
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return g.a(this.f7690g, (k1.f) obj, (k1.f) obj2);
                }
            });
        }
    }
}
