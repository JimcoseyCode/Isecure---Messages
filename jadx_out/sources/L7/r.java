package L7;

import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class r extends AbstractC1295u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x0 f7342a;

    public r(x0 delegate) {
        AbstractC2855l.g(delegate, "delegate");
        this.f7342a = delegate;
    }

    @Override // L7.AbstractC1295u
    public x0 b() {
        return this.f7342a;
    }

    @Override // L7.AbstractC1295u
    public String c() {
        return b().b();
    }

    @Override // L7.AbstractC1295u
    public AbstractC1295u f() {
        AbstractC1295u abstractC1295uJ = AbstractC1294t.j(b().d());
        AbstractC2855l.f(abstractC1295uJ, "toDescriptorVisibility(...)");
        return abstractC1295uJ;
    }
}
