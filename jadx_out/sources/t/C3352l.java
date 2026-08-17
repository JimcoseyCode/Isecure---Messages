package t;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;

/* JADX INFO: renamed from: t.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class C3352l extends C3351k {

    /* JADX INFO: renamed from: t.l$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final OutputConfiguration f32448a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f32449b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f32450c = 1;

        a(OutputConfiguration outputConfiguration) {
            this.f32448a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equals(this.f32448a, aVar.f32448a) && this.f32450c == aVar.f32450c && Objects.equals(this.f32449b, aVar.f32449b);
        }

        public int hashCode() {
            int iHashCode = this.f32448a.hashCode() ^ 31;
            int i10 = (iHashCode << 5) - iHashCode;
            String str = this.f32449b;
            int iHashCode2 = (str == null ? 0 : str.hashCode()) ^ i10;
            return Long.hashCode(this.f32450c) ^ ((iHashCode2 << 5) - iHashCode2);
        }
    }

    C3352l(int i10, Surface surface) {
        this(new a(new OutputConfiguration(i10, surface)));
    }

    static C3352l k(OutputConfiguration outputConfiguration) {
        return new C3352l(new a(outputConfiguration));
    }

    @Override // t.AbstractC3355o, t.C3350j.a
    public void b(Surface surface) {
        ((OutputConfiguration) h()).addSurface(surface);
    }

    @Override // t.C3351k, t.C3350j.a
    public void c(long j10) {
        ((a) this.f32453a).f32450c = j10;
    }

    @Override // t.C3351k, t.C3350j.a
    public String d() {
        return ((a) this.f32453a).f32449b;
    }

    @Override // t.C3351k, t.C3350j.a
    public void e() {
        ((OutputConfiguration) h()).enableSurfaceSharing();
    }

    @Override // t.C3351k, t.C3350j.a
    public void f(String str) {
        ((a) this.f32453a).f32449b = str;
    }

    @Override // t.C3351k, t.C3350j.a
    public Object h() {
        H0.g.a(this.f32453a instanceof a);
        return ((a) this.f32453a).f32448a;
    }

    @Override // t.C3351k, t.AbstractC3355o
    final boolean i() {
        throw new AssertionError("isSurfaceSharingEnabled() should not be called on API >= 26");
    }

    C3352l(Object obj) {
        super(obj);
    }
}
