package t;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
import java.util.Set;
import q.AbstractC3094d;
import s.E;
import y.C3563H;

/* JADX INFO: renamed from: t.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C3346f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f32437a;

    /* JADX INFO: renamed from: t.f$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    interface a {
        DynamicRangeProfiles a();

        Set b();

        Set c(C3563H c3563h);
    }

    C3346f(a aVar) {
        this.f32437a = aVar;
    }

    public static C3346f a(E e10) {
        C3346f c3346fE = Build.VERSION.SDK_INT >= 33 ? e(AbstractC3094d.a(e10.a(CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES))) : null;
        return c3346fE == null ? C3348h.f32439a : c3346fE;
    }

    public static C3346f e(DynamicRangeProfiles dynamicRangeProfiles) {
        if (dynamicRangeProfiles == null) {
            return null;
        }
        H0.g.j(Build.VERSION.SDK_INT >= 33, "DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher.");
        return new C3346f(new C3347g(dynamicRangeProfiles));
    }

    public Set b(C3563H c3563h) {
        return this.f32437a.c(c3563h);
    }

    public Set c() {
        return this.f32437a.b();
    }

    public DynamicRangeProfiles d() {
        H0.g.j(Build.VERSION.SDK_INT >= 33, "DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.");
        return this.f32437a.a();
    }
}
