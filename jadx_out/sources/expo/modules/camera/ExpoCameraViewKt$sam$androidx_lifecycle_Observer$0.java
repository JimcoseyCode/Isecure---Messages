package expo.modules.camera;

import androidx.lifecycle.B;
import i7.InterfaceC2740c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.InterfaceC2850g;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class ExpoCameraViewKt$sam$androidx_lifecycle_Observer$0 implements B, InterfaceC2850g {
    private final /* synthetic */ Function1 function;

    ExpoCameraViewKt$sam$androidx_lifecycle_Observer$0(Function1 function) {
        AbstractC2855l.g(function, "function");
        this.function = function;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof B) && (obj instanceof InterfaceC2850g)) {
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

    @Override // androidx.lifecycle.B
    public final /* synthetic */ void onChanged(Object obj) {
        this.function.invoke(obj);
    }
}
