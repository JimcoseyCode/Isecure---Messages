package W2;

import g2.AbstractC2662a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class u implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f12011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z f12012b;

    public u(x xVar, z zVar) {
        this.f12011a = xVar;
        this.f12012b = zVar;
    }

    @Override // W2.x
    public void a(Object obj) {
        this.f12011a.a(obj);
    }

    @Override // W2.x
    public boolean b(c2.l lVar) {
        return this.f12011a.b(lVar);
    }

    @Override // W2.x
    public int d(c2.l lVar) {
        return this.f12011a.d(lVar);
    }

    @Override // W2.x
    public AbstractC2662a f(Object obj, AbstractC2662a abstractC2662a) {
        this.f12012b.c(obj);
        return this.f12011a.f(obj, abstractC2662a);
    }

    @Override // W2.x
    public AbstractC2662a get(Object obj) {
        AbstractC2662a abstractC2662a = this.f12011a.get(obj);
        if (abstractC2662a == null) {
            this.f12012b.b(obj);
            return abstractC2662a;
        }
        this.f12012b.a(obj);
        return abstractC2662a;
    }
}
