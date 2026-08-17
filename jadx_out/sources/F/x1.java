package F;

import B.b;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;
import y.InterfaceC3601v;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x1 f1734a = new x1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static InterfaceC3601v f1735b;

    private x1() {
    }

    public static final InterfaceC3601v a() {
        InterfaceC3601v interfaceC3601v = f1735b;
        if (interfaceC3601v != null) {
            return interfaceC3601v;
        }
        AbstractC2855l.y("cameraUseCaseAdapterProvider");
        return null;
    }

    public static final void b(InterfaceC3601v interfaceC3601v) {
        AbstractC2855l.g(interfaceC3601v, "<set-?>");
        f1735b = interfaceC3601v;
    }

    public static final K.b c(L cameraInfoInternal, y.v0 sessionConfig, boolean z10, B.b bVar) {
        AbstractC2855l.g(cameraInfoInternal, "cameraInfoInternal");
        AbstractC2855l.g(sessionConfig, "sessionConfig");
        if (f1735b == null) {
            throw new IllegalStateException("mCameraUseCaseAdapterProvider must be initialized first!");
        }
        InterfaceC3601v interfaceC3601vA = a();
        String strF = cameraInfoInternal.f();
        AbstractC2855l.f(strF, "getCameraId(...)");
        K.f fVarB = interfaceC3601vA.b(strF);
        fVarB.m0(sessionConfig.l());
        fVarB.i0(sessionConfig.c());
        fVarB.l0(sessionConfig.i());
        fVarB.k0(sessionConfig.f());
        List listK = sessionConfig.k();
        if (bVar == null) {
            bVar = b.a.c(B.b.f231b, sessionConfig, cameraInfoInternal, null, 2, null);
        }
        K.b bVarO0 = fVarB.o0(listK, bVar, z10);
        AbstractC2855l.f(bVarO0, "simulateAddUseCases(...)");
        return bVarO0;
    }
}
