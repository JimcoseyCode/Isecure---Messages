package C8;

import kotlin.jvm.internal.AbstractC2855l;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class Y extends O0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final B8.n f624h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC3487a f625i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final B8.i f626j;

    public Y(B8.n storageManager, InterfaceC3487a computation) {
        AbstractC2855l.g(storageManager, "storageManager");
        AbstractC2855l.g(computation, "computation");
        this.f624h = storageManager;
        this.f625i = computation;
        this.f626j = storageManager.e(computation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final S S0(D8.g gVar, Y y10) {
        return gVar.a((G8.i) y10.f625i.invoke());
    }

    @Override // C8.O0
    protected S O0() {
        return (S) this.f626j.invoke();
    }

    @Override // C8.O0
    public boolean P0() {
        return this.f626j.b();
    }

    @Override // C8.S
    /* JADX INFO: renamed from: R0, reason: merged with bridge method [inline-methods] */
    public Y U0(D8.g kotlinTypeRefiner) {
        AbstractC2855l.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new Y(this.f624h, new X(kotlinTypeRefiner, this));
    }
}
