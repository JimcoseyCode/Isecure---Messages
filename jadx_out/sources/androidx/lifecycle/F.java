package androidx.lifecycle;

import androidx.lifecycle.AbstractC1764k;
import androidx.lifecycle.C1756c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class F implements InterfaceC1768o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f17531g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C1756c.a f17532h;

    F(Object obj) {
        this.f17531g = obj;
        this.f17532h = C1756c.f17573c.c(obj.getClass());
    }

    @Override // androidx.lifecycle.InterfaceC1768o
    public void k(r rVar, AbstractC1764k.a aVar) {
        this.f17532h.a(rVar, aVar, this.f17531g);
    }
}
