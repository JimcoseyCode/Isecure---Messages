package t;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;

/* JADX INFO: renamed from: t.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C3350j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f32443a;

    /* JADX INFO: renamed from: t.j$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    interface a {
        void a(long j10);

        void b(Surface surface);

        void c(long j10);

        String d();

        void e();

        void f(String str);

        void g(int i10);

        Surface getSurface();

        Object h();
    }

    public C3350j(int i10, Surface surface) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            this.f32443a = new C3354n(i10, surface);
            return;
        }
        if (i11 >= 28) {
            this.f32443a = new C3353m(i10, surface);
        } else if (i11 >= 26) {
            this.f32443a = new C3352l(i10, surface);
        } else {
            this.f32443a = new C3351k(i10, surface);
        }
    }

    public static C3350j j(Object obj) {
        if (obj == null) {
            return null;
        }
        int i10 = Build.VERSION.SDK_INT;
        a aVarM = i10 >= 33 ? C3354n.m((OutputConfiguration) obj) : i10 >= 28 ? C3353m.l((OutputConfiguration) obj) : i10 >= 26 ? C3352l.k((OutputConfiguration) obj) : C3351k.j((OutputConfiguration) obj);
        if (aVarM == null) {
            return null;
        }
        return new C3350j(aVarM);
    }

    public void a(Surface surface) {
        this.f32443a.b(surface);
    }

    public void b() {
        this.f32443a.e();
    }

    public String c() {
        return this.f32443a.d();
    }

    public Surface d() {
        return this.f32443a.getSurface();
    }

    public void e(long j10) {
        this.f32443a.c(j10);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C3350j) {
            return this.f32443a.equals(((C3350j) obj).f32443a);
        }
        return false;
    }

    public void f(int i10) {
        this.f32443a.g(i10);
    }

    public void g(String str) {
        this.f32443a.f(str);
    }

    public void h(long j10) {
        this.f32443a.a(j10);
    }

    public int hashCode() {
        return this.f32443a.hashCode();
    }

    public Object i() {
        return this.f32443a.h();
    }

    public C3350j(OutputConfiguration outputConfiguration) {
        this.f32443a = C3354n.m(outputConfiguration);
    }

    private C3350j(a aVar) {
        this.f32443a = aVar;
    }
}
