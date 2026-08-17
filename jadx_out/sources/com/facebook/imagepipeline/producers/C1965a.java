package com.facebook.imagepipeline.producers;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C1965a implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f20048a;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class C0214a extends AbstractC1983t {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC1967c
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void h(d3.k kVar, int i10) {
            if (kVar == null) {
                o().c(null, i10);
                return;
            }
            if (!d3.k.l0(kVar)) {
                kVar.w0();
            }
            o().c(kVar, i10);
        }

        private C0214a(InterfaceC1978n interfaceC1978n) {
            super(interfaceC1978n);
        }
    }

    public C1965a(d0 d0Var) {
        this.f20048a = d0Var;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC1978n interfaceC1978n, e0 e0Var) {
        this.f20048a.b(new C0214a(interfaceC1978n), e0Var);
    }
}
