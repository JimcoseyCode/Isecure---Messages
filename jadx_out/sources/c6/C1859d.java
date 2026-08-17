package c6;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: c6.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class C1859d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5.b f18847a;

    public C1859d(C5.b bVar) {
        this.f18847a = bVar;
    }

    public Executor a(Executor executor) {
        return executor != null ? executor : (Executor) this.f18847a.get();
    }
}
