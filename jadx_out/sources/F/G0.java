package F;

import android.util.Size;
import android.view.Surface;
import m5.InterfaceFutureC2904a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class G0 extends AbstractC0504q0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Surface f1341o;

    public G0(Surface surface, Size size, int i10) {
        super(size, i10);
        this.f1341o = surface;
    }

    @Override // F.AbstractC0504q0
    public InterfaceFutureC2904a o() {
        return J.n.p(this.f1341o);
    }

    public G0(Surface surface) {
        this.f1341o = surface;
    }
}
