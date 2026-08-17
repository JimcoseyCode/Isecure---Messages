package com.facebook.imagepipeline.producers;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class t0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u0[] f20200a;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class a extends AbstractC1983t {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final e0 f20201c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f20202d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final X2.g f20203e;

        public a(InterfaceC1978n interfaceC1978n, e0 e0Var, int i10) {
            super(interfaceC1978n);
            this.f20201c = e0Var;
            this.f20202d = i10;
            this.f20203e = e0Var.e().getResizeOptions();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC1983t, com.facebook.imagepipeline.producers.AbstractC1967c
        protected void g(Throwable th) {
            if (t0.this.e(this.f20202d + 1, o(), this.f20201c)) {
                return;
            }
            o().onFailure(th);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC1967c
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void h(d3.k kVar, int i10) {
            if (kVar != null && (AbstractC1967c.e(i10) || v0.c(kVar, this.f20203e))) {
                o().c(kVar, i10);
            } else if (AbstractC1967c.d(i10)) {
                d3.k.k(kVar);
                if (t0.this.e(this.f20202d + 1, o(), this.f20201c)) {
                    return;
                }
                o().c(null, 1);
            }
        }
    }

    public t0(u0... u0VarArr) {
        u0[] u0VarArr2 = (u0[]) c2.k.g(u0VarArr);
        this.f20200a = u0VarArr2;
        c2.k.e(0, u0VarArr2.length);
    }

    private int d(int i10, X2.g gVar) {
        while (true) {
            u0[] u0VarArr = this.f20200a;
            if (i10 >= u0VarArr.length) {
                return -1;
            }
            if (u0VarArr[i10].a(gVar)) {
                return i10;
            }
            i10++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(int i10, InterfaceC1978n interfaceC1978n, e0 e0Var) {
        int iD = d(i10, e0Var.e().getResizeOptions());
        if (iD == -1) {
            return false;
        }
        this.f20200a[iD].b(new a(interfaceC1978n, e0Var, iD), e0Var);
        return true;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC1978n interfaceC1978n, e0 e0Var) {
        if (e0Var.e().getResizeOptions() == null) {
            interfaceC1978n.c(null, 1);
        } else {
            if (e(0, interfaceC1978n, e0Var)) {
                return;
            }
            interfaceC1978n.c(null, 1);
        }
    }
}
