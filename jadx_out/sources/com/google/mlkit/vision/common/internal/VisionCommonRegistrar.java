package com.google.mlkit.vision.common.internal;

import J4.N5;
import com.google.firebase.components.ComponentRegistrar;
import com.google.mlkit.vision.common.internal.a;
import java.util.List;
import q5.C3119c;
import q5.InterfaceC3120d;
import q5.g;
import q5.q;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class VisionCommonRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        return N5.u(C3119c.c(a.class).b(q.m(a.C0234a.class)).e(new g() { // from class: com.google.mlkit.vision.common.internal.b
            @Override // q5.g
            public final Object a(InterfaceC3120d interfaceC3120d) {
                return new a(interfaceC3120d.g(a.C0234a.class));
            }
        }).d());
    }
}
