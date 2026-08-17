package com.facebook.imagepipeline.producers;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C1976l implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f20134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d0 f20135b;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.l$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class a extends AbstractC1983t {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private e0 f20136c;

        @Override // com.facebook.imagepipeline.producers.AbstractC1983t, com.facebook.imagepipeline.producers.AbstractC1967c
        protected void g(Throwable th) {
            C1976l.this.f20135b.b(o(), this.f20136c);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC1967c
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void h(d3.k kVar, int i10) {
            com.facebook.imagepipeline.request.b bVarE = this.f20136c.e();
            boolean zD = AbstractC1967c.d(i10);
            boolean zC = v0.c(kVar, bVarE.getResizeOptions());
            if (kVar != null && (zC || bVarE.getLocalThumbnailPreviewsEnabled())) {
                if (zD && zC) {
                    o().c(kVar, i10);
                } else {
                    o().c(kVar, AbstractC1967c.n(i10, 1));
                }
            }
            if (!zD || zC || bVarE.getLoadThumbnailOnlyForAndroidSdkAboveQ()) {
                return;
            }
            d3.k.k(kVar);
            C1976l.this.f20135b.b(o(), this.f20136c);
        }

        private a(InterfaceC1978n interfaceC1978n, e0 e0Var) {
            super(interfaceC1978n);
            this.f20136c = e0Var;
        }
    }

    public C1976l(d0 d0Var, d0 d0Var2) {
        this.f20134a = d0Var;
        this.f20135b = d0Var2;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC1978n interfaceC1978n, e0 e0Var) {
        this.f20134a.b(new a(interfaceC1978n, e0Var), e0Var);
    }
}
