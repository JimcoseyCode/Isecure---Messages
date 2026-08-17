package R7;

import b8.InterfaceC1824h;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class r extends AbstractC1396h implements InterfaceC1824h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Class f10099c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(k8.f fVar, Class klass) {
        super(fVar, null);
        AbstractC2855l.g(klass, "klass");
        this.f10099c = klass;
    }

    @Override // b8.InterfaceC1824h
    public b8.x c() {
        return E.f10052a.a(this.f10099c);
    }
}
