package R8;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: R8.z0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class C1447z0 extends F0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Function1 f10228k;

    public C1447z0(Function1 function1) {
        this.f10228k = function1;
    }

    @Override // R8.F0
    public boolean v() {
        return false;
    }

    @Override // R8.F0
    public void w(Throwable th) {
        this.f10228k.invoke(th);
    }
}
