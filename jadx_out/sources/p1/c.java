package P1;

import Q1.k;
import java.security.MessageDigest;
import v1.f;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f8789b;

    public c(Object obj) {
        this.f8789b = k.e(obj);
    }

    @Override // v1.f
    public boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f8789b.equals(((c) obj).f8789b);
        }
        return false;
    }

    @Override // v1.f
    public int hashCode() {
        return this.f8789b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f8789b + '}';
    }

    @Override // v1.f
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(this.f8789b.toString().getBytes(f.f32884a));
    }
}
