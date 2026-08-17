package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import n5.C2970e;
import q5.C3119c;
import q5.InterfaceC3120d;
import t5.InterfaceC3367b;
import z5.InterfaceC3679d;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Keep
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    public static /* synthetic */ FirebaseMessaging a(q5.D d10, InterfaceC3120d interfaceC3120d) {
        C2970e c2970e = (C2970e) interfaceC3120d.a(C2970e.class);
        android.support.v4.media.session.b.a(interfaceC3120d.a(B5.a.class));
        return new FirebaseMessaging(c2970e, null, interfaceC3120d.c(K5.i.class), interfaceC3120d.c(A5.j.class), (D5.e) interfaceC3120d.a(D5.e.class), interfaceC3120d.f(d10), (InterfaceC3679d) interfaceC3120d.a(InterfaceC3679d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C3119c> getComponents() {
        final q5.D dA = q5.D.a(InterfaceC3367b.class, U3.i.class);
        return Arrays.asList(C3119c.c(FirebaseMessaging.class).g(LIBRARY_NAME).b(q5.q.j(C2970e.class)).b(q5.q.g(B5.a.class)).b(q5.q.h(K5.i.class)).b(q5.q.h(A5.j.class)).b(q5.q.j(D5.e.class)).b(q5.q.i(dA)).b(q5.q.j(InterfaceC3679d.class)).e(new q5.g() { // from class: com.google.firebase.messaging.E
            @Override // q5.g
            public final Object a(InterfaceC3120d interfaceC3120d) {
                return FirebaseMessagingRegistrar.a(dA, interfaceC3120d);
            }
        }).c().d(), K5.h.b(LIBRARY_NAME, "25.0.1"));
    }
}
