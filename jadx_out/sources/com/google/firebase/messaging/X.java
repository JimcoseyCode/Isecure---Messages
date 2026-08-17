package com.google.firebase.messaging;

import P4.AbstractC1378l;
import P4.InterfaceC1369c;
import java.util.Map;
import java.util.concurrent.Executor;
import m0.C2892a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f24195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f24196b = new C2892a();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    interface a {
        AbstractC1378l start();
    }

    X(Executor executor) {
        this.f24195a = executor;
    }

    public static /* synthetic */ AbstractC1378l a(X x10, String str, AbstractC1378l abstractC1378l) {
        synchronized (x10) {
            x10.f24196b.remove(str);
        }
        return abstractC1378l;
    }

    synchronized AbstractC1378l b(final String str, a aVar) {
        AbstractC1378l abstractC1378l = (AbstractC1378l) this.f24196b.get(str);
        if (abstractC1378l != null) {
            return abstractC1378l;
        }
        AbstractC1378l abstractC1378lJ = aVar.start().j(this.f24195a, new InterfaceC1369c() { // from class: com.google.firebase.messaging.W
            @Override // P4.InterfaceC1369c
            public final Object a(AbstractC1378l abstractC1378l2) {
                return X.a(this.f24193a, str, abstractC1378l2);
            }
        });
        this.f24196b.put(str, abstractC1378lJ);
        return abstractC1378lJ;
    }
}
