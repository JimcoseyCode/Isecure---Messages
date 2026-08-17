package d1;

import d1.AbstractC2320a;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: d1.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C2321b extends AbstractC2320a {
    /* JADX WARN: Multi-variable type inference failed */
    public C2321b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // d1.AbstractC2320a
    public Object a(AbstractC2320a.c key) {
        AbstractC2855l.g(key, "key");
        return b().get(key);
    }

    public final void c(AbstractC2320a.c key, Object obj) {
        AbstractC2855l.g(key, "key");
        b().put(key, obj);
    }

    public C2321b(Map initialExtras) {
        AbstractC2855l.g(initialExtras, "initialExtras");
        b().putAll(initialExtras);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2321b(AbstractC2320a initialExtras) {
        this(initialExtras.b());
        AbstractC2855l.g(initialExtras, "initialExtras");
    }

    public /* synthetic */ C2321b(AbstractC2320a abstractC2320a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? AbstractC2320a.b.f25551c : abstractC2320a);
    }
}
