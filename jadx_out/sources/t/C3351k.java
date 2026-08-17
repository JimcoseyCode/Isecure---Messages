package t;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;

/* JADX INFO: renamed from: t.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class C3351k extends AbstractC3355o {

    /* JADX INFO: renamed from: t.k$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final OutputConfiguration f32444a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f32445b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f32446c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f32447d = 1;

        a(OutputConfiguration outputConfiguration) {
            this.f32444a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equals(this.f32444a, aVar.f32444a) && this.f32446c == aVar.f32446c && this.f32447d == aVar.f32447d && Objects.equals(this.f32445b, aVar.f32445b);
        }

        public int hashCode() {
            int iHashCode = this.f32444a.hashCode() ^ 31;
            int i10 = (this.f32446c ? 1 : 0) ^ ((iHashCode << 5) - iHashCode);
            int i11 = (i10 << 5) - i10;
            String str = this.f32445b;
            int iHashCode2 = (str == null ? 0 : str.hashCode()) ^ i11;
            return Long.hashCode(this.f32447d) ^ ((iHashCode2 << 5) - iHashCode2);
        }
    }

    C3351k(int i10, Surface surface) {
        this(new a(new OutputConfiguration(i10, surface)));
    }

    static C3351k j(OutputConfiguration outputConfiguration) {
        return new C3351k(new a(outputConfiguration));
    }

    @Override // t.C3350j.a
    public void c(long j10) {
        ((a) this.f32453a).f32447d = j10;
    }

    @Override // t.C3350j.a
    public String d() {
        return ((a) this.f32453a).f32445b;
    }

    @Override // t.C3350j.a
    public void e() {
        ((a) this.f32453a).f32446c = true;
    }

    @Override // t.C3350j.a
    public void f(String str) {
        ((a) this.f32453a).f32445b = str;
    }

    @Override // t.AbstractC3355o, t.C3350j.a
    public Surface getSurface() {
        return ((OutputConfiguration) h()).getSurface();
    }

    @Override // t.C3350j.a
    public Object h() {
        H0.g.a(this.f32453a instanceof a);
        return ((a) this.f32453a).f32444a;
    }

    @Override // t.AbstractC3355o
    boolean i() {
        return ((a) this.f32453a).f32446c;
    }

    C3351k(Object obj) {
        super(obj);
    }
}
