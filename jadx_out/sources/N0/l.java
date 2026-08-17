package N0;

import i7.C2750m;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final U8.l f7900a;

    public l() {
        H h10 = H.f7720b;
        AbstractC2855l.e(h10, "null cannot be cast to non-null type androidx.datastore.core.State<T of androidx.datastore.core.DataStoreInMemoryCache>");
        this.f7900a = U8.r.a(h10);
    }

    public final D a() {
        return (D) this.f7900a.getValue();
    }

    public final U8.b b() {
        return this.f7900a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final D c(D newState) {
        Object value;
        D d10;
        AbstractC2855l.g(newState, "newState");
        U8.l lVar = this.f7900a;
        do {
            value = lVar.getValue();
            d10 = (D) value;
            if (!(d10 instanceof x ? true : AbstractC2855l.b(d10, H.f7720b))) {
                if (d10 instanceof C1306f) {
                    if (newState.a() > d10.a()) {
                        d10 = newState;
                    }
                } else if (!(d10 instanceof r)) {
                    throw new C2750m();
                }
            }
        } while (!lVar.a(value, d10));
        return d10;
    }
}
