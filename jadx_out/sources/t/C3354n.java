package t;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* JADX INFO: renamed from: t.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C3354n extends C3353m {
    C3354n(int i10, Surface surface) {
        this(new OutputConfiguration(i10, surface));
    }

    static C3354n m(OutputConfiguration outputConfiguration) {
        return new C3354n(outputConfiguration);
    }

    @Override // t.AbstractC3355o, t.C3350j.a
    public void a(long j10) {
        if (j10 == -1) {
            return;
        }
        ((OutputConfiguration) h()).setStreamUseCase(j10);
    }

    @Override // t.C3352l, t.AbstractC3355o, t.C3350j.a
    public /* bridge */ /* synthetic */ void b(Surface surface) {
        super.b(surface);
    }

    @Override // t.C3353m, t.C3352l, t.C3351k, t.C3350j.a
    public void c(long j10) {
        ((OutputConfiguration) h()).setDynamicRangeProfile(j10);
    }

    @Override // t.C3353m, t.C3352l, t.C3351k, t.C3350j.a
    public /* bridge */ /* synthetic */ String d() {
        return super.d();
    }

    @Override // t.C3352l, t.C3351k, t.C3350j.a
    public /* bridge */ /* synthetic */ void e() {
        super.e();
    }

    @Override // t.AbstractC3355o
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // t.C3353m, t.C3352l, t.C3351k, t.C3350j.a
    public /* bridge */ /* synthetic */ void f(String str) {
        super.f(str);
    }

    @Override // t.AbstractC3355o, t.C3350j.a
    public void g(int i10) {
        ((OutputConfiguration) h()).setMirrorMode(i10);
    }

    @Override // t.C3351k, t.AbstractC3355o, t.C3350j.a
    public /* bridge */ /* synthetic */ Surface getSurface() {
        return super.getSurface();
    }

    @Override // t.C3353m, t.C3352l, t.C3351k, t.C3350j.a
    public Object h() {
        H0.g.a(this.f32453a instanceof OutputConfiguration);
        return this.f32453a;
    }

    @Override // t.AbstractC3355o
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    C3354n(Object obj) {
        super(obj);
    }
}
