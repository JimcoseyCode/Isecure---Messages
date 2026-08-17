package R7;

import R7.AbstractC1396h;
import b8.InterfaceC1821e;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class l extends AbstractC1396h implements InterfaceC1821e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f10085c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(k8.f fVar, Object[] values) {
        super(fVar, null);
        AbstractC2855l.g(values, "values");
        this.f10085c = values;
    }

    @Override // b8.InterfaceC1821e
    public List e() {
        Object[] objArr = this.f10085c;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            AbstractC1396h.a aVar = AbstractC1396h.f10082b;
            AbstractC2855l.d(obj);
            arrayList.add(aVar.a(obj, null));
        }
        return arrayList;
    }
}
