package n7;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import n7.j;

/* JADX INFO: renamed from: n7.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2982b implements j.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Function1 f30058g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final j.c f30059h;

    public AbstractC2982b(j.c baseKey, Function1 safeCast) {
        AbstractC2855l.g(baseKey, "baseKey");
        AbstractC2855l.g(safeCast, "safeCast");
        this.f30058g = safeCast;
        this.f30059h = baseKey instanceof AbstractC2982b ? ((AbstractC2982b) baseKey).f30059h : baseKey;
    }

    public final boolean a(j.c key) {
        AbstractC2855l.g(key, "key");
        return key == this || this.f30059h == key;
    }

    public final j.b b(j.b element) {
        AbstractC2855l.g(element, "element");
        return (j.b) this.f30058g.invoke(element);
    }
}
