package x1;

import java.security.MessageDigest;

/* JADX INFO: renamed from: x1.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C3520d implements v1.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v1.f f33287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v1.f f33288c;

    C3520d(v1.f fVar, v1.f fVar2) {
        this.f33287b = fVar;
        this.f33288c = fVar2;
    }

    @Override // v1.f
    public boolean equals(Object obj) {
        if (obj instanceof C3520d) {
            C3520d c3520d = (C3520d) obj;
            if (this.f33287b.equals(c3520d.f33287b) && this.f33288c.equals(c3520d.f33288c)) {
                return true;
            }
        }
        return false;
    }

    @Override // v1.f
    public int hashCode() {
        return (this.f33287b.hashCode() * 31) + this.f33288c.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f33287b + ", signature=" + this.f33288c + '}';
    }

    @Override // v1.f
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        this.f33287b.updateDiskCacheKey(messageDigest);
        this.f33288c.updateDiskCacheKey(messageDigest);
    }
}
