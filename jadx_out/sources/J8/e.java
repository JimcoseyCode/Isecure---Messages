package J8;

import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class e extends AbstractC1275a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private c f6849g;

    protected e(c arrayMap) {
        AbstractC2855l.g(arrayMap, "arrayMap");
        this.f6849g = arrayMap;
    }

    @Override // J8.AbstractC1275a
    protected final c d() {
        return this.f6849g;
    }

    @Override // J8.AbstractC1275a
    protected final void q(String keyQualifiedName, Object value) {
        AbstractC2855l.g(keyQualifiedName, "keyQualifiedName");
        AbstractC2855l.g(value, "value");
        int iE = o().e(keyQualifiedName);
        int iD = this.f6849g.d();
        if (iD == 0) {
            this.f6849g = new o(value, iE);
            return;
        }
        if (iD == 1) {
            c cVar = this.f6849g;
            AbstractC2855l.e(cVar, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
            o oVar = (o) cVar;
            if (oVar.o() == iE) {
                this.f6849g = new o(value, iE);
                return;
            } else {
                d dVar = new d();
                this.f6849g = dVar;
                dVar.set(oVar.o(), oVar.p());
            }
        }
        this.f6849g.set(iE, value);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public e() {
        i iVar = i.f6862g;
        AbstractC2855l.e(iVar, "null cannot be cast to non-null type org.jetbrains.kotlin.util.ArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
        this(iVar);
    }
}
