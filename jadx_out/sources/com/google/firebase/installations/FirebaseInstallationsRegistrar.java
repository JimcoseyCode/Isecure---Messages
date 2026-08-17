package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import n5.C2970e;
import p5.InterfaceC3080a;
import q5.C3119c;
import q5.D;
import q5.InterfaceC3120d;
import q5.q;
import r5.j;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    public static /* synthetic */ D5.e a(InterfaceC3120d interfaceC3120d) {
        return new c((C2970e) interfaceC3120d.a(C2970e.class), interfaceC3120d.c(A5.i.class), (ExecutorService) interfaceC3120d.e(D.a(InterfaceC3080a.class, ExecutorService.class)), j.a((Executor) interfaceC3120d.e(D.a(p5.b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C3119c> getComponents() {
        return Arrays.asList(C3119c.c(D5.e.class).g(LIBRARY_NAME).b(q.j(C2970e.class)).b(q.h(A5.i.class)).b(q.k(D.a(InterfaceC3080a.class, ExecutorService.class))).b(q.k(D.a(p5.b.class, Executor.class))).e(new q5.g() { // from class: D5.f
            @Override // q5.g
            public final Object a(InterfaceC3120d interfaceC3120d) {
                return FirebaseInstallationsRegistrar.a(interfaceC3120d);
            }
        }).d(), A5.h.a(), K5.h.b(LIBRARY_NAME, "18.0.0"));
    }
}
