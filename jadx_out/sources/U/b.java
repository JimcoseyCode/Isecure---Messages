package U;

import android.hardware.camera2.CameraManager;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a f10707f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CameraManager f10708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f10709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f10710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f10711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f10712e;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(CameraManager cameraManager) {
        AbstractC2855l.g(cameraManager, "cameraManager");
        this.f10708a = cameraManager;
        this.f10709b = new Object();
        this.f10710c = new LinkedHashMap();
        this.f10711d = new LinkedHashMap();
        this.f10712e = new LinkedHashMap();
    }
}
