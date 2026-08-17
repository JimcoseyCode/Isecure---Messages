package X;

import android.content.Context;
import android.hardware.camera2.CameraManager;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CameraManager f12215a;

    d(Context context) {
        this.f12215a = (CameraManager) context.getSystemService(CameraManager.class);
    }

    @Override // X.g
    public e a(String str) {
        return new c(this.f12215a, str);
    }
}
