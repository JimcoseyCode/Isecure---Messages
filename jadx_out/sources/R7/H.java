package R7;

import R7.E;
import b8.InterfaceC1815C;
import j7.AbstractC2793j;
import j7.AbstractC2800q;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class H extends E implements InterfaceC1815C {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WildcardType f10058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Collection f10059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f10060d;

    public H(WildcardType reflectType) {
        AbstractC2855l.g(reflectType, "reflectType");
        this.f10058b = reflectType;
        this.f10059c = AbstractC2800q.j();
    }

    @Override // b8.InterfaceC1815C
    public boolean F() {
        AbstractC2855l.f(N().getUpperBounds(), "getUpperBounds(...)");
        return !AbstractC2855l.b(AbstractC2793j.G(r0), Object.class);
    }

    @Override // b8.InterfaceC1815C
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public E y() {
        Type[] upperBounds = N().getUpperBounds();
        Type[] lowerBounds = N().getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + N());
        }
        if (lowerBounds.length == 1) {
            E.a aVar = E.f10052a;
            AbstractC2855l.d(lowerBounds);
            Object objI0 = AbstractC2793j.i0(lowerBounds);
            AbstractC2855l.f(objI0, "single(...)");
            return aVar.a((Type) objI0);
        }
        if (upperBounds.length == 1) {
            AbstractC2855l.d(upperBounds);
            Type type = (Type) AbstractC2793j.i0(upperBounds);
            if (!AbstractC2855l.b(type, Object.class)) {
                E.a aVar2 = E.f10052a;
                AbstractC2855l.d(type);
                return aVar2.a(type);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // R7.E
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public WildcardType N() {
        return this.f10058b;
    }

    @Override // b8.InterfaceC1820d
    public Collection getAnnotations() {
        return this.f10059c;
    }

    @Override // b8.InterfaceC1820d
    public boolean k() {
        return this.f10060d;
    }
}
