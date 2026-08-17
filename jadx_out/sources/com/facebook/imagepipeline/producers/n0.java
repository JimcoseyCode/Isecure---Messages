package com.facebook.imagepipeline.producers;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class n0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f20142a;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends AbstractC1983t {
        a(InterfaceC1978n interfaceC1978n) {
            super(interfaceC1978n);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC1967c
        protected void h(Object obj, int i10) {
            if (AbstractC1967c.d(i10)) {
                o().c(null, i10);
            }
        }
    }

    public n0(d0 d0Var) {
        this.f20142a = d0Var;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC1978n interfaceC1978n, e0 e0Var) {
        this.f20142a.b(new a(interfaceC1978n), e0Var);
    }
}
