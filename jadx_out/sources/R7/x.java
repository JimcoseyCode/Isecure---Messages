package R7;

import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class x extends AbstractC1396h implements b8.o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f10105c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(k8.f fVar, Object value) {
        super(fVar, null);
        AbstractC2855l.g(value, "value");
        this.f10105c = value;
    }

    @Override // b8.o
    public Object getValue() {
        return this.f10105c;
    }
}
