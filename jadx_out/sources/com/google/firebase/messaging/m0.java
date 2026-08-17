package com.google.firebase.messaging;

import P4.AbstractC1378l;
import P4.InterfaceC1372f;
import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import com.google.firebase.messaging.p0;
import f1.ExecutorC2595b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class m0 extends Binder {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f24300c;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    interface a {
        AbstractC1378l a(Intent intent);
    }

    m0(a aVar) {
        this.f24300c = aVar;
    }

    void b(final p0.a aVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        this.f24300c.a(aVar.f24315a).d(new ExecutorC2595b(), new InterfaceC1372f() { // from class: com.google.firebase.messaging.l0
            @Override // P4.InterfaceC1372f
            public final void onComplete(AbstractC1378l abstractC1378l) {
                aVar.d();
            }
        });
    }
}
