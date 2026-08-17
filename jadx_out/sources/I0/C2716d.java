package i0;

import F.InterfaceC0513v0;
import F.InterfaceC0515w0;
import F.L;
import F.g1;
import androidx.camera.video.internal.compat.quirk.ExtraSupportedQualityQuirk;
import g0.s0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: i0.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C2716d implements InterfaceC0513v0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC0513v0 f28657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f28658d;

    public C2716d(InterfaceC0513v0 interfaceC0513v0, g1 g1Var, L l10, s0.a aVar) {
        this.f28657c = interfaceC0513v0;
        List listC = g1Var.c(ExtraSupportedQualityQuirk.class);
        if (listC.isEmpty()) {
            return;
        }
        H0.g.i(listC.size() == 1);
        Map mapG = ((ExtraSupportedQualityQuirk) listC.get(0)).g(l10, interfaceC0513v0, aVar);
        if (mapG != null) {
            this.f28658d = new HashMap(mapG);
        }
    }

    private InterfaceC0515w0 c(int i10) {
        Map map = this.f28658d;
        return (map == null || !map.containsKey(Integer.valueOf(i10))) ? this.f28657c.b(i10) : (InterfaceC0515w0) this.f28658d.get(Integer.valueOf(i10));
    }

    @Override // F.InterfaceC0513v0
    public boolean a(int i10) {
        return c(i10) != null;
    }

    @Override // F.InterfaceC0513v0
    public InterfaceC0515w0 b(int i10) {
        return c(i10);
    }
}
