package v1;

import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final b f32885e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f32886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f32887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f32888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile byte[] f32889d;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface b {
        void a(byte[] bArr, Object obj, MessageDigest messageDigest);
    }

    private g(String str, Object obj, b bVar) {
        this.f32888c = Q1.k.c(str);
        this.f32886a = obj;
        this.f32887b = (b) Q1.k.e(bVar);
    }

    public static g a(String str, Object obj, b bVar) {
        return new g(str, obj, bVar);
    }

    private static b b() {
        return f32885e;
    }

    private byte[] d() {
        if (this.f32889d == null) {
            this.f32889d = this.f32888c.getBytes(f.f32884a);
        }
        return this.f32889d;
    }

    public static g e(String str) {
        return new g(str, null, b());
    }

    public static g f(String str, Object obj) {
        return new g(str, obj, b());
    }

    public Object c() {
        return this.f32886a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f32888c.equals(((g) obj).f32888c);
        }
        return false;
    }

    public void g(Object obj, MessageDigest messageDigest) {
        this.f32887b.a(d(), obj, messageDigest);
    }

    public int hashCode() {
        return this.f32888c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f32888c + "'}";
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements b {
        a() {
        }

        @Override // v1.g.b
        public void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }
}
