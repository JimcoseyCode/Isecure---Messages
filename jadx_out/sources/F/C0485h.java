package F;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: F.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C0485h extends AbstractC0476d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f1470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f1471b;

    C0485h(Executor executor, Handler handler) {
        if (executor == null) {
            throw new NullPointerException("Null cameraExecutor");
        }
        this.f1470a = executor;
        if (handler == null) {
            throw new NullPointerException("Null schedulerHandler");
        }
        this.f1471b = handler;
    }

    @Override // F.AbstractC0476d0
    public Executor b() {
        return this.f1470a;
    }

    @Override // F.AbstractC0476d0
    public Handler c() {
        return this.f1471b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0476d0) {
            AbstractC0476d0 abstractC0476d0 = (AbstractC0476d0) obj;
            if (this.f1470a.equals(abstractC0476d0.b()) && this.f1471b.equals(abstractC0476d0.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f1470a.hashCode() ^ 1000003) * 1000003) ^ this.f1471b.hashCode();
    }

    public String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.f1470a + ", schedulerHandler=" + this.f1471b + "}";
    }
}
