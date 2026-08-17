package com.google.mlkit.common.internal;

import H4.AbstractC0784f;
import a6.C1597a;
import b6.AbstractC1808a;
import b6.C1810c;
import c6.C1856a;
import c6.C1857b;
import c6.C1859d;
import c6.C1864i;
import c6.C1865j;
import c6.m;
import com.google.firebase.components.ComponentRegistrar;
import d6.C2340a;
import java.util.List;
import q5.C3119c;
import q5.InterfaceC3120d;
import q5.g;
import q5.q;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class CommonComponentRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        return AbstractC0784f.u(m.f18888b, C3119c.c(C2340a.class).b(q.j(C1864i.class)).e(new g() { // from class: Z5.a
            @Override // q5.g
            public final Object a(InterfaceC3120d interfaceC3120d) {
                return new C2340a((C1864i) interfaceC3120d.a(C1864i.class));
            }
        }).d(), C3119c.c(C1865j.class).e(new g() { // from class: Z5.b
            @Override // q5.g
            public final Object a(InterfaceC3120d interfaceC3120d) {
                return new C1865j();
            }
        }).d(), C3119c.c(C1810c.class).b(q.m(C1810c.a.class)).e(new g() { // from class: Z5.c
            @Override // q5.g
            public final Object a(InterfaceC3120d interfaceC3120d) {
                return new C1810c(interfaceC3120d.g(C1810c.a.class));
            }
        }).d(), C3119c.c(C1859d.class).b(q.l(C1865j.class)).e(new g() { // from class: Z5.d
            @Override // q5.g
            public final Object a(InterfaceC3120d interfaceC3120d) {
                return new C1859d(interfaceC3120d.c(C1865j.class));
            }
        }).d(), C3119c.c(C1856a.class).e(new g() { // from class: Z5.e
            @Override // q5.g
            public final Object a(InterfaceC3120d interfaceC3120d) {
                return C1856a.a();
            }
        }).d(), C3119c.c(C1857b.class).b(q.j(C1856a.class)).e(new g() { // from class: Z5.f
            @Override // q5.g
            public final Object a(InterfaceC3120d interfaceC3120d) {
                return new C1857b((C1856a) interfaceC3120d.a(C1856a.class));
            }
        }).d(), C3119c.c(C1597a.class).b(q.j(C1864i.class)).e(new g() { // from class: Z5.g
            @Override // q5.g
            public final Object a(InterfaceC3120d interfaceC3120d) {
                return new C1597a((C1864i) interfaceC3120d.a(C1864i.class));
            }
        }).d(), C3119c.m(C1810c.a.class).b(q.l(C1597a.class)).e(new g() { // from class: Z5.h
            @Override // q5.g
            public final Object a(InterfaceC3120d interfaceC3120d) {
                return new C1810c.a(AbstractC1808a.class, interfaceC3120d.c(C1597a.class));
            }
        }).d());
    }
}
