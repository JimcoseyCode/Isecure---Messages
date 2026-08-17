package s;

import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import s.F;
import t.C3350j;
import t.C3356p;
import y.AbstractC3583h0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class N implements F.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final CameraDevice f32007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Object f32008b;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Handler f32009a;

        a(Handler handler) {
            this.f32009a = handler;
        }
    }

    N(CameraDevice cameraDevice, Object obj) {
        this.f32007a = (CameraDevice) H0.g.g(cameraDevice);
        this.f32008b = obj;
    }

    private static void b(CameraDevice cameraDevice, List list) {
        String id = cameraDevice.getId();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String strC = ((C3350j) it.next()).c();
            if (strC != null && !strC.isEmpty()) {
                AbstractC3583h0.l("CameraDeviceCompat", "Camera " + id + ": Camera doesn't support physicalCameraId " + strC + ". Ignoring.");
            }
        }
    }

    static void c(CameraDevice cameraDevice, C3356p c3356p) {
        H0.g.g(cameraDevice);
        H0.g.g(c3356p);
        H0.g.g(c3356p.e());
        List listC = c3356p.c();
        if (listC == null) {
            throw new IllegalArgumentException("Invalid output configurations");
        }
        if (c3356p.a() == null) {
            throw new IllegalArgumentException("Invalid executor");
        }
        b(cameraDevice, listC);
    }

    static List d(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C3350j) it.next()).d());
        }
        return arrayList;
    }
}
