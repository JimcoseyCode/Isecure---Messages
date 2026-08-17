package androidx.camera.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class t extends e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AtomicBoolean f15263j;

    t(o oVar) {
        super(oVar);
        this.f15263j = new AtomicBoolean(false);
    }

    @Override // androidx.camera.core.e, androidx.camera.core.o, java.lang.AutoCloseable
    public void close() {
        if (this.f15263j.getAndSet(true)) {
            return;
        }
        super.close();
    }
}
