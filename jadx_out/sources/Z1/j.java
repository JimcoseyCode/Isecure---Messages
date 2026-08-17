package z1;

import Q1.k;
import Q1.l;
import R1.a;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Q1.h f34213a = new Q1.h(1000);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final H0.e f34214b = R1.a.d(10, new a());

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements a.d {
        a() {
        }

        @Override // R1.a.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b create() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class b implements a.f {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final MessageDigest f34216g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final R1.c f34217h = R1.c.a();

        b(MessageDigest messageDigest) {
            this.f34216g = messageDigest;
        }

        @Override // R1.a.f
        public R1.c m() {
            return this.f34217h;
        }
    }

    private String a(v1.f fVar) {
        b bVar = (b) k.e((b) this.f34214b.acquire());
        try {
            fVar.updateDiskCacheKey(bVar.f34216g);
            return l.y(bVar.f34216g.digest());
        } finally {
            this.f34214b.release(bVar);
        }
    }

    public String b(v1.f fVar) {
        String strA;
        synchronized (this.f34213a) {
            strA = (String) this.f34213a.g(fVar);
        }
        if (strA == null) {
            strA = a(fVar);
        }
        synchronized (this.f34213a) {
            this.f34213a.k(fVar, strA);
        }
        return strA;
    }
}
