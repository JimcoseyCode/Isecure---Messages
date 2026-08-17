package Z2;

import com.facebook.imagepipeline.producers.d0;
import com.facebook.imagepipeline.producers.e0;
import com.facebook.imagepipeline.producers.l0;
import f3.InterfaceC2610d;
import g2.AbstractC2662a;
import j3.C2768b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class c extends a {
    private c(d0 d0Var, l0 l0Var, InterfaceC2610d interfaceC2610d) {
        super(d0Var, l0Var, interfaceC2610d);
    }

    public static m2.c F(d0 d0Var, l0 l0Var, InterfaceC2610d interfaceC2610d) {
        if (C2768b.d()) {
            C2768b.a("CloseableProducerToDataSourceAdapter#create");
        }
        c cVar = new c(d0Var, l0Var, interfaceC2610d);
        if (C2768b.d()) {
            C2768b.b();
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m2.AbstractC2894a
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void f(AbstractC2662a abstractC2662a) {
        AbstractC2662a.B(abstractC2662a);
    }

    @Override // m2.AbstractC2894a, m2.c
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public AbstractC2662a getResult() {
        return AbstractC2662a.r((AbstractC2662a) super.getResult());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Z2.a
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void D(AbstractC2662a abstractC2662a, int i10, e0 e0Var) {
        super.D(AbstractC2662a.r(abstractC2662a), i10, e0Var);
    }
}
