package Z;

import Z.C1578q;
import android.location.Location;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.io.File;

/* JADX INFO: renamed from: Z.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C1567f extends C1578q.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f13362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f13363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Location f13364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final File f13365d;

    /* JADX INFO: renamed from: Z.f$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class b extends C1578q.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f13366a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f13367b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Location f13368c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private File f13369d;

        b() {
        }

        @Override // Z.C1578q.b.a
        C1578q.b c() {
            Long l10 = this.f13366a;
            String str = PointerEventHelper.POINTER_TYPE_UNKNOWN;
            if (l10 == null) {
                str = PointerEventHelper.POINTER_TYPE_UNKNOWN + " fileSizeLimit";
            }
            if (this.f13367b == null) {
                str = str + " durationLimitMillis";
            }
            if (this.f13369d == null) {
                str = str + " file";
            }
            if (str.isEmpty()) {
                return new C1567f(this.f13366a.longValue(), this.f13367b.longValue(), this.f13368c, this.f13369d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // Z.C1578q.b.a
        C1578q.b.a d(File file) {
            if (file == null) {
                throw new NullPointerException("Null file");
            }
            this.f13369d = file;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // Z.AbstractC1579s.b.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public C1578q.b.a a(long j10) {
            this.f13367b = Long.valueOf(j10);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // Z.AbstractC1579s.b.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public C1578q.b.a b(long j10) {
            this.f13366a = Long.valueOf(j10);
            return this;
        }
    }

    @Override // Z.AbstractC1579s.b
    long a() {
        return this.f13363b;
    }

    @Override // Z.AbstractC1579s.b
    long b() {
        return this.f13362a;
    }

    @Override // Z.AbstractC1579s.b
    Location c() {
        return this.f13364c;
    }

    @Override // Z.C1578q.b
    File d() {
        return this.f13365d;
    }

    public boolean equals(Object obj) {
        Location location;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1578q.b) {
            C1578q.b bVar = (C1578q.b) obj;
            if (this.f13362a == bVar.b() && this.f13363b == bVar.a() && ((location = this.f13364c) != null ? location.equals(bVar.c()) : bVar.c() == null) && this.f13365d.equals(bVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f13362a;
        long j11 = this.f13363b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        Location location = this.f13364c;
        return ((i10 ^ (location == null ? 0 : location.hashCode())) * 1000003) ^ this.f13365d.hashCode();
    }

    public String toString() {
        return "FileOutputOptionsInternal{fileSizeLimit=" + this.f13362a + ", durationLimitMillis=" + this.f13363b + ", location=" + this.f13364c + ", file=" + this.f13365d + "}";
    }

    private C1567f(long j10, long j11, Location location, File file) {
        this.f13362a = j10;
        this.f13363b = j11;
        this.f13364c = location;
        this.f13365d = file;
    }
}
