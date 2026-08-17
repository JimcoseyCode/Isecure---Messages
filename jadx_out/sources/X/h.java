package x;

import F.C0475d;
import F.L;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import java.util.List;
import r.C3153b0;
import y.InterfaceC3597q;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C3153b0 f33195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f33196b;

    public h(C3153b0 c3153b0) {
        this.f33195a = c3153b0;
    }

    public static h a(InterfaceC3597q interfaceC3597q) {
        L lG = ((L) interfaceC3597q).g();
        H0.g.b(lG instanceof C3153b0, "CameraInfo doesn't contain Camera2 implementation.");
        h hVarB = ((C3153b0) lG).B();
        if (interfaceC3597q instanceof C0475d) {
            ((C0475d) interfaceC3597q).D();
        }
        return hVarB;
    }

    public Object b(CameraCharacteristics.Key key) {
        List<Pair> list = this.f33196b;
        if (list != null) {
            for (Pair pair : list) {
                if (((CameraCharacteristics.Key) pair.first).equals(key)) {
                    return pair.second;
                }
            }
        }
        return this.f33195a.C().a(key);
    }

    public String c() {
        return this.f33195a.f();
    }
}
