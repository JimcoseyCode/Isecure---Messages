package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C1755b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference f17572a;

    public C1755b(Object obj) {
        this.f17572a = new AtomicReference(obj);
    }

    public final boolean a(Object obj, Object obj2) {
        return androidx.camera.view.i.a(this.f17572a, obj, obj2);
    }

    public final Object b() {
        return this.f17572a.get();
    }
}
