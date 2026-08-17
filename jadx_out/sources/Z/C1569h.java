package Z;

import android.net.Uri;

/* JADX INFO: renamed from: Z.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C1569h extends AbstractC1580t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f13379a;

    C1569h(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null outputUri");
        }
        this.f13379a = uri;
    }

    @Override // Z.AbstractC1580t
    public Uri a() {
        return this.f13379a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1580t) {
            return this.f13379a.equals(((AbstractC1580t) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.f13379a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "OutputResults{outputUri=" + this.f13379a + "}";
    }
}
