package t;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.Set;
import t.C3346f;
import y.C3563H;

/* JADX INFO: renamed from: t.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class C3348h implements C3346f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final C3346f f32439a = new C3346f(new C3348h());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set f32440b = Collections.singleton(C3563H.f33650d);

    C3348h() {
    }

    @Override // t.C3346f.a
    public DynamicRangeProfiles a() {
        return null;
    }

    @Override // t.C3346f.a
    public Set b() {
        return f32440b;
    }

    @Override // t.C3346f.a
    public Set c(C3563H c3563h) {
        H0.g.b(C3563H.f33650d.equals(c3563h), "DynamicRange is not supported: " + c3563h);
        return f32440b;
    }
}
