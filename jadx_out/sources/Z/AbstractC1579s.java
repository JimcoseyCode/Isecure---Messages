package Z;

import android.location.Location;

/* JADX INFO: renamed from: Z.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1579s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f13466a;

    /* JADX INFO: renamed from: Z.s$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final b.a f13467a;

        a(b.a aVar) {
            this.f13467a = aVar;
            aVar.b(0L);
            aVar.a(0L);
        }

        public Object a(long j10) {
            H0.g.b(j10 >= 0, "The specified duration limit can't be negative.");
            this.f13467a.a(j10);
            return this;
        }

        public Object b(long j10) {
            H0.g.b(j10 >= 0, "The specified file size limit can't be negative.");
            this.f13467a.b(j10);
            return this;
        }
    }

    /* JADX INFO: renamed from: Z.s$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static abstract class b {

        /* JADX INFO: renamed from: Z.s$b$a */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        static abstract class a {
            a() {
            }

            abstract Object a(long j10);

            abstract Object b(long j10);
        }

        b() {
        }

        abstract long a();

        abstract long b();

        abstract Location c();
    }

    AbstractC1579s(b bVar) {
        this.f13466a = bVar;
    }

    public long a() {
        return this.f13466a.a();
    }

    public long b() {
        return this.f13466a.b();
    }

    public Location c() {
        return this.f13466a.c();
    }
}
