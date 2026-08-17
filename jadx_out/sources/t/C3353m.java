package t;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;

/* JADX INFO: renamed from: t.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class C3353m extends C3352l {

    /* JADX INFO: renamed from: t.m$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final OutputConfiguration f32451a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f32452b = 1;

        a(OutputConfiguration outputConfiguration) {
            this.f32451a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equals(this.f32451a, aVar.f32451a) && this.f32452b == aVar.f32452b;
        }

        public int hashCode() {
            int iHashCode = this.f32451a.hashCode() ^ 31;
            return Long.hashCode(this.f32452b) ^ ((iHashCode << 5) - iHashCode);
        }
    }

    C3353m(int i10, Surface surface) {
        this(new a(new OutputConfiguration(i10, surface)));
    }

    static C3353m l(OutputConfiguration outputConfiguration) {
        return new C3353m(new a(outputConfiguration));
    }

    @Override // t.C3352l, t.C3351k, t.C3350j.a
    public void c(long j10) {
        ((a) this.f32453a).f32452b = j10;
    }

    @Override // t.C3352l, t.C3351k, t.C3350j.a
    public String d() {
        return null;
    }

    @Override // t.C3352l, t.C3351k, t.C3350j.a
    public void f(String str) {
        ((OutputConfiguration) h()).setPhysicalCameraId(str);
    }

    @Override // t.C3352l, t.C3351k, t.C3350j.a
    public Object h() {
        H0.g.a(this.f32453a instanceof a);
        return ((a) this.f32453a).f32451a;
    }

    C3353m(Object obj) {
        super(obj);
    }
}
