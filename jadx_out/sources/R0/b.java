package R0;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f9938a;

    public b(boolean z10) {
        this.f9938a = new AtomicBoolean(z10);
    }

    public final boolean a() {
        return this.f9938a.get();
    }

    public final void b(boolean z10) {
        this.f9938a.set(z10);
    }
}
