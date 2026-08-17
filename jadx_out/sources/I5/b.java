package I5;

import com.google.firebase.messaging.N;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b f5046b = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final I5.a f5047a;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private I5.a f5048a = null;

        a() {
        }

        public b a() {
            return new b(this.f5048a);
        }

        public a b(I5.a aVar) {
            this.f5048a = aVar;
            return this;
        }
    }

    b(I5.a aVar) {
        this.f5047a = aVar;
    }

    public static a b() {
        return new a();
    }

    public I5.a a() {
        return this.f5047a;
    }

    public byte[] c() {
        return N.a(this);
    }
}
