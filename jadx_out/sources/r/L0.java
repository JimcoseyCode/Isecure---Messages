package r;

import F.AbstractC0504q0;
import F.C0486h0;
import F.InterfaceC0490j0;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import x.l;
import y.AbstractC3583h0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class L0 {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a {
        static CaptureRequest.Builder a(CameraDevice cameraDevice, TotalCaptureResult totalCaptureResult) {
            return cameraDevice.createReprocessCaptureRequest(totalCaptureResult);
        }
    }

    private static void a(C0486h0 c0486h0, CaptureRequest.Builder builder) {
        Range rangeE = c0486h0.e();
        if (!rangeE.equals(F.o1.f1588a)) {
            builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, rangeE);
        }
        AbstractC3583h0.a("Camera2CaptureRequestBuilder", "applyAeFpsRange: expectedFrameRateRange = " + rangeE);
    }

    private static void b(CaptureRequest.Builder builder, InterfaceC0490j0 interfaceC0490j0) {
        x.l lVarD = l.a.e(interfaceC0490j0).d();
        for (InterfaceC0490j0.a aVar : lVarD.a()) {
            CaptureRequest.Key key = (CaptureRequest.Key) aVar.d();
            try {
                builder.set(key, lVarD.d(aVar));
            } catch (IllegalArgumentException unused) {
                AbstractC3583h0.c("Camera2CaptureRequestBuilder", "CaptureRequest.Key is not supported: " + key);
            }
        }
    }

    private static void c(CaptureRequest.Builder builder, int i10, v.z zVar) {
        for (Map.Entry entry : zVar.a(i10).entrySet()) {
            builder.set((CaptureRequest.Key) entry.getKey(), entry.getValue());
        }
    }

    static void d(C0486h0 c0486h0, CaptureRequest.Builder builder) {
        Integer numH = h(c0486h0);
        if (numH != null) {
            builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, numH);
        }
        AbstractC3583h0.a("Camera2CaptureRequestBuilder", "applyVideoStabilization: mode = " + numH);
    }

    public static CaptureRequest e(C0486h0 c0486h0, CameraDevice cameraDevice, Map map, boolean z10, v.z zVar) throws CameraAccessException {
        CaptureRequest.Builder builderCreateCaptureRequest;
        if (cameraDevice == null) {
            return null;
        }
        List listG = g(c0486h0.i(), map);
        if (listG.isEmpty()) {
            return null;
        }
        F.B bD = c0486h0.d();
        if (c0486h0.k() == 5 && bD != null && (bD.i() instanceof TotalCaptureResult)) {
            AbstractC3583h0.a("Camera2CaptureRequestBuilder", "createReprocessCaptureRequest");
            builderCreateCaptureRequest = a.a(cameraDevice, (TotalCaptureResult) bD.i());
        } else {
            AbstractC3583h0.a("Camera2CaptureRequestBuilder", "createCaptureRequest");
            if (c0486h0.k() == 5) {
                builderCreateCaptureRequest = cameraDevice.createCaptureRequest(z10 ? 1 : 2);
            } else {
                builderCreateCaptureRequest = cameraDevice.createCaptureRequest(c0486h0.k());
            }
        }
        c(builderCreateCaptureRequest, c0486h0.k(), zVar);
        a(c0486h0, builderCreateCaptureRequest);
        d(c0486h0, builderCreateCaptureRequest);
        InterfaceC0490j0 interfaceC0490j0G = c0486h0.g();
        InterfaceC0490j0.a aVar = C0486h0.f1472i;
        if (interfaceC0490j0G.b(aVar)) {
            builderCreateCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, (Integer) c0486h0.g().d(aVar));
        }
        InterfaceC0490j0 interfaceC0490j0G2 = c0486h0.g();
        InterfaceC0490j0.a aVar2 = C0486h0.f1473j;
        if (interfaceC0490j0G2.b(aVar2)) {
            builderCreateCaptureRequest.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) c0486h0.g().d(aVar2)).byteValue()));
        }
        b(builderCreateCaptureRequest, c0486h0.g());
        Iterator it = listG.iterator();
        while (it.hasNext()) {
            builderCreateCaptureRequest.addTarget((Surface) it.next());
        }
        builderCreateCaptureRequest.setTag(c0486h0.j());
        return builderCreateCaptureRequest.build();
    }

    public static CaptureRequest f(C0486h0 c0486h0, CameraDevice cameraDevice, v.z zVar) throws CameraAccessException {
        if (cameraDevice == null) {
            return null;
        }
        AbstractC3583h0.a("Camera2CaptureRequestBuilder", "template type = " + c0486h0.k());
        CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(c0486h0.k());
        c(builderCreateCaptureRequest, c0486h0.k(), zVar);
        a(c0486h0, builderCreateCaptureRequest);
        b(builderCreateCaptureRequest, c0486h0.g());
        return builderCreateCaptureRequest.build();
    }

    private static List g(List list, Map map) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Surface surface = (Surface) map.get((AbstractC0504q0) it.next());
            if (surface == null) {
                throw new IllegalArgumentException("DeferrableSurface not in configuredSurfaceMap");
            }
            arrayList.add(surface);
        }
        return arrayList;
    }

    static Integer h(C0486h0 c0486h0) {
        if (c0486h0.h() == 1 || c0486h0.l() == 1) {
            return 0;
        }
        if (c0486h0.h() == 2) {
            return 2;
        }
        return c0486h0.l() == 2 ? 1 : null;
    }
}
