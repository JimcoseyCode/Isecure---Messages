package Y7;

import C8.AbstractC0407d0;
import C8.I0;
import C8.N0;
import L7.InterfaceC1288m;
import L7.h0;
import O7.AbstractC1323b;
import b8.InterfaceC1826j;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class c0 extends AbstractC1323b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final X7.k f13029q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final b8.y f13030r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(X7.k c10, b8.y javaTypeParameter, int i10, InterfaceC1288m containingDeclaration) {
        super(c10.e(), containingDeclaration, new X7.g(c10, javaTypeParameter, false, 4, null), javaTypeParameter.getName(), N0.f592k, false, i10, h0.f7335a, c10.a().v());
        AbstractC2855l.g(c10, "c");
        AbstractC2855l.g(javaTypeParameter, "javaTypeParameter");
        AbstractC2855l.g(containingDeclaration, "containingDeclaration");
        this.f13029q = c10;
        this.f13030r = javaTypeParameter;
    }

    private final List J0() {
        Collection upperBounds = this.f13030r.getUpperBounds();
        if (upperBounds.isEmpty()) {
            AbstractC0407d0 abstractC0407d0I = this.f13029q.d().n().i();
            AbstractC2855l.f(abstractC0407d0I, "getAnyType(...)");
            AbstractC0407d0 abstractC0407d0I2 = this.f13029q.d().n().I();
            AbstractC2855l.f(abstractC0407d0I2, "getNullableAnyType(...)");
            return AbstractC2800q.e(C8.V.e(abstractC0407d0I, abstractC0407d0I2));
        }
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(upperBounds, 10));
        Iterator it = upperBounds.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f13029q.g().p((InterfaceC1826j) it.next(), Z7.b.b(I0.f575h, false, false, this, 3, null)));
        }
        return arrayList;
    }

    @Override // O7.AbstractC1329h
    protected List C0(List bounds) {
        AbstractC2855l.g(bounds, "bounds");
        return this.f13029q.a().r().r(this, bounds, this.f13029q);
    }

    @Override // O7.AbstractC1329h
    protected void H0(C8.S type) {
        AbstractC2855l.g(type, "type");
    }

    @Override // O7.AbstractC1329h
    protected List I0() {
        return J0();
    }
}
