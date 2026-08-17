package V1;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements V1.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f11622b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f11623a;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(File file) {
            AbstractC2855l.g(file, "file");
            return new b(file, null);
        }

        public final b b(File file) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (file != null) {
                return new b(file, defaultConstructorMarker);
            }
            return null;
        }

        private a() {
        }
    }

    public /* synthetic */ b(File file, DefaultConstructorMarker defaultConstructorMarker) {
        this(file);
    }

    public static final b b(File file) {
        return f11622b.a(file);
    }

    public static final b c(File file) {
        return f11622b.b(file);
    }

    @Override // V1.a
    public InputStream a() {
        return new FileInputStream(this.f11623a);
    }

    public final File d() {
        return this.f11623a;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        return AbstractC2855l.b(this.f11623a, ((b) obj).f11623a);
    }

    public int hashCode() {
        return this.f11623a.hashCode();
    }

    @Override // V1.a
    public long size() {
        return this.f11623a.length();
    }

    private b(File file) {
        this.f11623a = file;
    }
}
