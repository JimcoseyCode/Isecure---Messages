package expo.modules.kotlin.objects;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
public final class PropertyComponentBuilderWithThis$get$1$1 implements Function1 {
    final /* synthetic */ Function1 $body;

    public PropertyComponentBuilderWithThis$get$1$1(Function1 function1) {
        this.$body = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object[] it) {
        AbstractC2855l.g(it, "it");
        return this.$body.invoke(it[0]);
    }
}
