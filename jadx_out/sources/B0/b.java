package b0;

import F.InterfaceC0513v0;
import F.InterfaceC0515w0;
import android.util.Rational;
import g0.s0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import y.AbstractC3583h0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class b implements InterfaceC0513v0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC0513v0 f18616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final s0.a f18617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f18618e = new HashMap();

    public b(InterfaceC0513v0 interfaceC0513v0, s0.a aVar) {
        this.f18616c = interfaceC0513v0;
        this.f18617d = aVar;
    }

    private InterfaceC0515w0 c(InterfaceC0515w0 interfaceC0515w0, int i10, int i11) {
        InterfaceC0515w0.c cVar;
        if (interfaceC0515w0 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(interfaceC0515w0.d());
        Iterator it = interfaceC0515w0.d().iterator();
        while (true) {
            if (!it.hasNext()) {
                cVar = null;
                break;
            }
            cVar = (InterfaceC0515w0.c) it.next();
            if (cVar.g() == 0) {
                break;
            }
        }
        InterfaceC0515w0.c cVarK = k(g(cVar, i10, i11), this.f18617d);
        if (cVarK != null) {
            arrayList.add(cVarK);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return InterfaceC0515w0.b.h(interfaceC0515w0.a(), interfaceC0515w0.b(), interfaceC0515w0.c(), arrayList);
    }

    private static int d(int i10) {
        if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
            return 5;
        }
        throw new IllegalArgumentException("Unexpected HDR format: " + i10);
    }

    private static String e(int i10) {
        return InterfaceC0515w0.g(i10);
    }

    private static int f(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        if (i10 == 2) {
            return 4096;
        }
        if (i10 == 3) {
            return 8192;
        }
        if (i10 == 4) {
            return -1;
        }
        throw new IllegalArgumentException("Unexpected HDR format: " + i10);
    }

    private static InterfaceC0515w0.c g(InterfaceC0515w0.c cVar, int i10, int i11) {
        if (cVar == null) {
            return null;
        }
        int iE = cVar.e();
        String strI = cVar.i();
        int iJ = cVar.j();
        if (i10 != cVar.g()) {
            iE = d(i10);
            strI = e(iE);
            iJ = f(i10);
        }
        return InterfaceC0515w0.c.a(iE, strI, j(cVar.c(), i11, cVar.b()), cVar.f(), cVar.l(), cVar.h(), iJ, i11, cVar.d(), i10);
    }

    private InterfaceC0515w0 h(int i10) {
        if (this.f18618e.containsKey(Integer.valueOf(i10))) {
            return (InterfaceC0515w0) this.f18618e.get(Integer.valueOf(i10));
        }
        if (!this.f18616c.a(i10)) {
            return null;
        }
        InterfaceC0515w0 interfaceC0515w0C = c(this.f18616c.b(i10), 1, 10);
        this.f18618e.put(Integer.valueOf(i10), interfaceC0515w0C);
        return interfaceC0515w0C;
    }

    private static InterfaceC0515w0.c i(InterfaceC0515w0.c cVar, int i10) {
        return InterfaceC0515w0.c.a(cVar.e(), cVar.i(), i10, cVar.f(), cVar.l(), cVar.h(), cVar.j(), cVar.b(), cVar.d(), cVar.g());
    }

    private static int j(int i10, int i11, int i12) {
        if (i11 == i12) {
            return i10;
        }
        int iDoubleValue = (int) (((double) i10) * new Rational(i11, i12).doubleValue());
        if (AbstractC3583h0.f("BackupHdrProfileEncoderProfilesProvider")) {
            AbstractC3583h0.a("BackupHdrProfileEncoderProfilesProvider", String.format("Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) = %d", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(iDoubleValue)));
        }
        return iDoubleValue;
    }

    static InterfaceC0515w0.c k(InterfaceC0515w0.c cVar, s0.a aVar) {
        s0 s0VarA;
        if (cVar == null || (s0VarA = aVar.a(cVar.i())) == null || !s0VarA.a(cVar.l(), cVar.h())) {
            return null;
        }
        int iC = cVar.c();
        int iIntValue = ((Integer) s0VarA.c().clamp(Integer.valueOf(iC))).intValue();
        return iIntValue == iC ? cVar : i(cVar, iIntValue);
    }

    @Override // F.InterfaceC0513v0
    public boolean a(int i10) {
        return this.f18616c.a(i10) && h(i10) != null;
    }

    @Override // F.InterfaceC0513v0
    public InterfaceC0515w0 b(int i10) {
        return h(i10);
    }
}
