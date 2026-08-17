package t;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import t.C3346f;
import y.C3563H;

/* JADX INFO: renamed from: t.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class C3347g implements C3346f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DynamicRangeProfiles f32438a;

    C3347g(Object obj) {
        this.f32438a = (DynamicRangeProfiles) obj;
    }

    private Long d(C3563H c3563h) {
        return AbstractC3344d.a(c3563h, this.f32438a);
    }

    private static Set e(Set set) {
        if (set.isEmpty()) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(f(((Long) it.next()).longValue()));
        }
        return Collections.unmodifiableSet(hashSet);
    }

    private static C3563H f(long j10) {
        return (C3563H) H0.g.h(AbstractC3344d.b(j10), "Dynamic range profile cannot be converted to a DynamicRange object: " + j10);
    }

    @Override // t.C3346f.a
    public DynamicRangeProfiles a() {
        return this.f32438a;
    }

    @Override // t.C3346f.a
    public Set b() {
        return e(this.f32438a.getSupportedProfiles());
    }

    @Override // t.C3346f.a
    public Set c(C3563H c3563h) {
        Long lD = d(c3563h);
        H0.g.b(lD != null, "DynamicRange is not supported: " + c3563h);
        return e(this.f32438a.getProfileCaptureRequestConstraints(lD.longValue()));
    }
}
