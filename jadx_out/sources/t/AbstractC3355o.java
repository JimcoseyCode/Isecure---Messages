package t;

import android.view.Surface;
import java.util.Objects;
import t.C3350j;

/* JADX INFO: renamed from: t.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC3355o implements C3350j.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f32453a;

    AbstractC3355o(Object obj) {
        this.f32453a = obj;
    }

    @Override // t.C3350j.a
    public void b(Surface surface) {
        H0.g.h(surface, "Surface must not be null");
        if (getSurface() == surface) {
            throw new IllegalStateException("Surface is already added!");
        }
        if (!i()) {
            throw new IllegalStateException("Cannot have 2 surfaces for a non-sharing configuration");
        }
        throw new IllegalArgumentException("Exceeds maximum number of surfaces");
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC3355o) {
            return Objects.equals(this.f32453a, ((AbstractC3355o) obj).f32453a);
        }
        return false;
    }

    @Override // t.C3350j.a
    public abstract Surface getSurface();

    public int hashCode() {
        return this.f32453a.hashCode();
    }

    abstract boolean i();

    @Override // t.C3350j.a
    public void a(long j10) {
    }

    @Override // t.C3350j.a
    public void g(int i10) {
    }
}
