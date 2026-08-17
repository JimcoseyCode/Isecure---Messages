package androidx.camera.video.internal.compat.quirk;

import F.InterfaceC0471b1;
import F.InterfaceC0513v0;
import F.InterfaceC0515w0;
import F.L;
import O.d;
import Z.z0;
import android.os.Build;
import android.util.Range;
import android.util.Size;
import g0.s0;
import h0.AbstractC2689c;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class ExtraSupportedQualityQuirk implements InterfaceC0471b1 {
    private Map h(L l10, InterfaceC0513v0 interfaceC0513v0, s0.a aVar) {
        InterfaceC0515w0 interfaceC0515w0B;
        InterfaceC0515w0.c cVarB;
        if (!"1".equals(l10.f()) || interfaceC0513v0.a(4) || (cVarB = AbstractC2689c.b((interfaceC0515w0B = interfaceC0513v0.b(1)))) == null) {
            return null;
        }
        Range rangeI = i(cVarB, aVar);
        Size size = d.f8169d;
        InterfaceC0515w0.b bVarH = InterfaceC0515w0.b.h(interfaceC0515w0B.a(), interfaceC0515w0B.b(), interfaceC0515w0B.c(), Collections.singletonList(AbstractC2689c.a(cVarB, size, rangeI)));
        HashMap map = new HashMap();
        map.put(4, bVarH);
        if (d.c(size) > d.c(cVarB.k())) {
            map.put(1, bVarH);
        }
        return map;
    }

    private static Range i(InterfaceC0515w0.c cVar, s0.a aVar) {
        s0 s0VarA = aVar.a(cVar.i());
        return s0VarA != null ? s0VarA.c() : z0.f13529a;
    }

    private static boolean j() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto c".equalsIgnoreCase(Build.MODEL);
    }

    static boolean k() {
        return j();
    }

    public Map g(L l10, InterfaceC0513v0 interfaceC0513v0, s0.a aVar) {
        return j() ? h(l10, interfaceC0513v0, aVar) : Collections.EMPTY_MAP;
    }
}
