package t9;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class G {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f32566d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final G f32567e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f32568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f32569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f32570c;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public G a() {
        this.f32568a = false;
        return this;
    }

    public G b() {
        this.f32570c = 0L;
        return this;
    }

    public long c() {
        if (this.f32568a) {
            return this.f32569b;
        }
        throw new IllegalStateException("No deadline");
    }

    public G d(long j10) {
        this.f32568a = true;
        this.f32569b = j10;
        return this;
    }

    public boolean e() {
        return this.f32568a;
    }

    public void f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f32568a && this.f32569b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public G g(long j10, TimeUnit unit) {
        AbstractC2855l.g(unit, "unit");
        if (j10 >= 0) {
            this.f32570c = unit.toNanos(j10);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j10).toString());
    }

    public long h() {
        return this.f32570c;
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends G {
        a() {
        }

        @Override // t9.G
        public G g(long j10, TimeUnit unit) {
            AbstractC2855l.g(unit, "unit");
            return this;
        }

        @Override // t9.G
        public void f() {
        }

        @Override // t9.G
        public G d(long j10) {
            return this;
        }
    }
}
