package expo.modules.kotlin;

import i7.C2735B;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2853j;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* synthetic */ class PromiseKt$toBridgePromise$resolveMethod$2 extends AbstractC2853j implements Function1 {
    PromiseKt$toBridgePromise$resolveMethod$2(Object obj) {
        super(1, obj, Promise.class, "resolve", "resolve(Ljava/lang/Object;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m224invoke(obj);
        return C2735B.f28704a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m224invoke(Object obj) {
        ((Promise) this.receiver).resolve(obj);
    }
}
