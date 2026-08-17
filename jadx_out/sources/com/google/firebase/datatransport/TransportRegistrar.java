package com.google.firebase.datatransport;

import K5.h;
import U3.i;
import W3.t;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.datatransport.cct.a;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import java.util.Arrays;
import java.util.List;
import q5.C3119c;
import q5.D;
import q5.InterfaceC3120d;
import q5.g;
import q5.q;
import t5.InterfaceC3366a;
import t5.InterfaceC3367b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Keep
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public static /* synthetic */ i a(InterfaceC3120d interfaceC3120d) {
        t.f((Context) interfaceC3120d.a(Context.class));
        return t.c().g(a.f20905g);
    }

    public static /* synthetic */ i b(InterfaceC3120d interfaceC3120d) {
        t.f((Context) interfaceC3120d.a(Context.class));
        return t.c().g(a.f20906h);
    }

    public static /* synthetic */ i c(InterfaceC3120d interfaceC3120d) {
        t.f((Context) interfaceC3120d.a(Context.class));
        return t.c().g(a.f20906h);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C3119c> getComponents() {
        return Arrays.asList(C3119c.c(i.class).g(LIBRARY_NAME).b(q.j(Context.class)).e(new g() { // from class: t5.c
            @Override // q5.g
            public final Object a(InterfaceC3120d interfaceC3120d) {
                return TransportRegistrar.c(interfaceC3120d);
            }
        }).d(), C3119c.e(D.a(InterfaceC3366a.class, i.class)).b(q.j(Context.class)).e(new g() { // from class: t5.d
            @Override // q5.g
            public final Object a(InterfaceC3120d interfaceC3120d) {
                return TransportRegistrar.b(interfaceC3120d);
            }
        }).d(), C3119c.e(D.a(InterfaceC3367b.class, i.class)).b(q.j(Context.class)).e(new g() { // from class: t5.e
            @Override // q5.g
            public final Object a(InterfaceC3120d interfaceC3120d) {
                return TransportRegistrar.a(interfaceC3120d);
            }
        }).d(), h.b(LIBRARY_NAME, "18.2.0"));
    }
}
