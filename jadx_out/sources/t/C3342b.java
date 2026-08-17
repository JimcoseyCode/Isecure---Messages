package t;

import F.InterfaceC0490j0;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import kotlin.jvm.internal.AbstractC2855l;
import q.C3091a;

/* JADX INFO: renamed from: t.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C3342b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3342b f32434a = new C3342b();

    private C3342b() {
    }

    public static final void a(C3091a.C0345a options, InterfaceC0490j0.c priority) {
        AbstractC2855l.g(options, "options");
        AbstractC2855l.g(priority, "priority");
        if (Build.VERSION.SDK_INT >= 34) {
            options.g(CaptureRequest.CONTROL_SETTINGS_OVERRIDE, 1, priority);
        }
    }
}
