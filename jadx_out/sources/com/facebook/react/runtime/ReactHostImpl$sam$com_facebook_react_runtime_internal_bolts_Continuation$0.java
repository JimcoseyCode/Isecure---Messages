package com.facebook.react.runtime;

import com.facebook.react.runtime.internal.bolts.Continuation;
import com.facebook.react.runtime.internal.bolts.Task;
import i7.InterfaceC2740c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.InterfaceC2850g;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class ReactHostImpl$sam$com_facebook_react_runtime_internal_bolts_Continuation$0 implements Continuation, InterfaceC2850g {
    private final /* synthetic */ Function1 function;

    ReactHostImpl$sam$com_facebook_react_runtime_internal_bolts_Continuation$0(Function1 function) {
        AbstractC2855l.g(function, "function");
        this.function = function;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Continuation) && (obj instanceof InterfaceC2850g)) {
            return AbstractC2855l.b(getFunctionDelegate(), ((InterfaceC2850g) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC2850g
    public final InterfaceC2740c getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // com.facebook.react.runtime.internal.bolts.Continuation
    public final /* synthetic */ Object then(Task task) {
        return this.function.invoke(task);
    }
}
