package O0;

import N0.C1304d;
import N0.InterfaceC1305e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import n7.f;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements InterfaceC1305e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function1 f8175a;

    public b(Function1 produceNewData) {
        AbstractC2855l.g(produceNewData, "produceNewData");
        this.f8175a = produceNewData;
    }

    @Override // N0.InterfaceC1305e
    public Object a(C1304d c1304d, f fVar) {
        return this.f8175a.invoke(c1304d);
    }
}
