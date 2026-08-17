package com.google.mlkit.vision.barcode.internal;

import I4.AbstractC0885h0;
import c6.C1859d;
import c6.C1864i;
import com.google.firebase.components.ComponentRegistrar;
import h6.f;
import h6.h;
import java.util.List;
import q5.C3119c;
import q5.InterfaceC3120d;
import q5.g;
import q5.q;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class BarcodeRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        return AbstractC0885h0.t(C3119c.c(h.class).b(q.j(C1864i.class)).e(new g() { // from class: h6.c
            @Override // q5.g
            public final Object a(InterfaceC3120d interfaceC3120d) {
                return new h((C1864i) interfaceC3120d.a(C1864i.class));
            }
        }).d(), C3119c.c(f.class).b(q.j(h.class)).b(q.j(C1859d.class)).b(q.j(C1864i.class)).e(new g() { // from class: h6.d
            @Override // q5.g
            public final Object a(InterfaceC3120d interfaceC3120d) {
                return new f((h) interfaceC3120d.a(h.class), (C1859d) interfaceC3120d.a(C1859d.class), (C1864i) interfaceC3120d.a(C1864i.class));
            }
        }).d());
    }
}
