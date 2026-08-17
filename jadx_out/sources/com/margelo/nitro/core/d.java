package com.margelo.nitro.core;

import com.margelo.nitro.core.Promise;
import i7.InterfaceC2740c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.InterfaceC2850g;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class d implements Promise.OnRejectedCallback, InterfaceC2850g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Function1 f24831a;

    d(Function1 function) {
        AbstractC2855l.g(function, "function");
        this.f24831a = function;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Promise.OnRejectedCallback) && (obj instanceof InterfaceC2850g)) {
            return AbstractC2855l.b(getFunctionDelegate(), ((InterfaceC2850g) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC2850g
    public final InterfaceC2740c getFunctionDelegate() {
        return this.f24831a;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // com.margelo.nitro.core.Promise.OnRejectedCallback
    public final /* synthetic */ void onRejected(Throwable th) {
        this.f24831a.invoke(th);
    }
}
