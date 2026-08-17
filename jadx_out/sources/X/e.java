package X;

import android.hardware.camera2.params.SessionConfiguration;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public interface e {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f12216a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f12217b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f12218c;

        public a(int i10, int i11, long j10) {
            this.f12216a = i10;
            this.f12217b = i11;
            this.f12218c = j10;
        }

        public int a() {
            return this.f12216a;
        }
    }

    a a(SessionConfiguration sessionConfiguration);
}
