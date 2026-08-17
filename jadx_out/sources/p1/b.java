package P1;

import java.security.MessageDigest;
import v1.f;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b f8788b = new b();

    private b() {
    }

    public static b b() {
        return f8788b;
    }

    public String toString() {
        return "EmptySignature";
    }

    @Override // v1.f
    public void updateDiskCacheKey(MessageDigest messageDigest) {
    }
}
