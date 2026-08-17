package H;

import android.os.Build;
import android.util.CloseGuard;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f3562a;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final CloseGuard f3563a = new CloseGuard();

        a() {
        }

        @Override // H.d.b
        public void a() {
            this.f3563a.warnIfOpen();
        }

        @Override // H.d.b
        public void b(String str) {
            this.f3563a.open(str);
        }

        @Override // H.d.b
        public void close() {
            this.f3563a.close();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private interface b {
        void a();

        void b(String str);

        void close();
    }

    private d(b bVar) {
        this.f3562a = bVar;
    }

    public static d b() {
        return Build.VERSION.SDK_INT >= 30 ? new d(new a()) : new d(new c());
    }

    public void a() {
        this.f3562a.close();
    }

    public void c(String str) {
        this.f3562a.b(str);
    }

    public void d() {
        this.f3562a.a();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class c implements b {
        c() {
        }

        @Override // H.d.b
        public void b(String str) {
            H0.g.h(str, "CloseMethodName must not be null.");
        }

        @Override // H.d.b
        public void a() {
        }

        @Override // H.d.b
        public void close() {
        }
    }
}
