package androidx.camera.extensions;

import U.g;
import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import y.r;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final g f15269e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f15270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f15271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f15272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final U.b f15273d;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements g {
        a() {
        }
    }

    b(r rVar, Context context) {
        this.f15270a = rVar;
        if (Build.VERSION.SDK_INT >= 31) {
            this.f15273d = new U.b((CameraManager) context.getSystemService(CameraManager.class));
        } else {
            this.f15273d = null;
        }
        this.f15271b = U.c.a(rVar.a());
        this.f15272c = new c() { // from class: androidx.camera.extensions.a
        };
    }
}
