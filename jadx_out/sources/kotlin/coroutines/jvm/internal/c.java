package kotlin.coroutines.jvm.internal;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements n7.f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f29362g = new c();

    private c() {
    }

    @Override // n7.f
    public n7.j getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // n7.f
    public void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
