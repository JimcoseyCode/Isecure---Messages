package Z;

import Z.AbstractC1579s;
import Z.C1567f;
import java.io.File;

/* JADX INFO: renamed from: Z.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C1578q extends AbstractC1579s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f13462b;

    /* JADX INFO: renamed from: Z.q$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends AbstractC1579s.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b.a f13463b;

        public a(File file) {
            super(new C1567f.b());
            H0.g.h(file, "File can't be null.");
            b.a aVar = (b.a) this.f13467a;
            this.f13463b = aVar;
            aVar.d(file);
        }

        @Override // Z.AbstractC1579s.a
        public /* bridge */ /* synthetic */ Object a(long j10) {
            return super.a(j10);
        }

        @Override // Z.AbstractC1579s.a
        public /* bridge */ /* synthetic */ Object b(long j10) {
            return super.b(j10);
        }

        public C1578q c() {
            return new C1578q(this.f13463b.c());
        }
    }

    /* JADX INFO: renamed from: Z.q$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static abstract class b extends AbstractC1579s.b {

        /* JADX INFO: renamed from: Z.q$b$a */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        static abstract class a extends AbstractC1579s.b.a {
            a() {
            }

            abstract b c();

            abstract a d(File file);
        }

        b() {
        }

        abstract File d();
    }

    C1578q(b bVar) {
        super(bVar);
        this.f13462b = bVar;
    }

    public File d() {
        return this.f13462b.d();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1578q) {
            return this.f13462b.equals(((C1578q) obj).f13462b);
        }
        return false;
    }

    public int hashCode() {
        return this.f13462b.hashCode();
    }

    public String toString() {
        return this.f13462b.toString().replaceFirst("FileOutputOptionsInternal", "FileOutputOptions");
    }
}
