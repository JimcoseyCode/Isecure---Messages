package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;
import g2.AbstractC2662a;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C1974j implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f20098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f20099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f20100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f20101d;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.j$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class a extends AbstractC1983t {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f20102c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f20103d;

        a(InterfaceC1978n interfaceC1978n, int i10, int i11) {
            super(interfaceC1978n);
            this.f20102c = i10;
            this.f20103d = i11;
        }

        private void p(AbstractC2662a abstractC2662a) {
            d3.e eVar;
            Bitmap bitmapH0;
            int rowBytes;
            if (abstractC2662a == null || !abstractC2662a.W() || (eVar = (d3.e) abstractC2662a.J()) == null || eVar.isClosed() || !(eVar instanceof d3.f) || (bitmapH0 = ((d3.f) eVar).h0()) == null || (rowBytes = bitmapH0.getRowBytes() * bitmapH0.getHeight()) < this.f20102c || rowBytes > this.f20103d) {
                return;
            }
            bitmapH0.prepareToDraw();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC1967c
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void h(AbstractC2662a abstractC2662a, int i10) {
            p(abstractC2662a);
            o().c(abstractC2662a, i10);
        }
    }

    public C1974j(d0 d0Var, int i10, int i11, boolean z10) {
        c2.k.b(Boolean.valueOf(i10 <= i11));
        this.f20098a = (d0) c2.k.g(d0Var);
        this.f20099b = i10;
        this.f20100c = i11;
        this.f20101d = z10;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC1978n interfaceC1978n, e0 e0Var) {
        if (!e0Var.A() || this.f20101d) {
            this.f20098a.b(new a(interfaceC1978n, this.f20099b, this.f20100c), e0Var);
        } else {
            this.f20098a.b(interfaceC1978n, e0Var);
        }
    }
}
