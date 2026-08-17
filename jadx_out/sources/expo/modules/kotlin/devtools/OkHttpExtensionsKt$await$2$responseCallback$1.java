package expo.modules.kotlin.devtools;

import R8.InterfaceC1421m;
import e9.D;
import e9.InterfaceC2437e;
import e9.InterfaceC2438f;
import i7.AbstractC2753p;
import i7.C2752o;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"expo/modules/kotlin/devtools/OkHttpExtensionsKt$await$2$responseCallback$1", "Le9/f;", "Le9/e;", "call", "Le9/D;", "response", "Li7/B;", "onResponse", "(Le9/e;Le9/D;)V", "Ljava/io/IOException;", "e", "onFailure", "(Le9/e;Ljava/io/IOException;)V", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 176)
public final class OkHttpExtensionsKt$await$2$responseCallback$1 implements InterfaceC2438f {
    final /* synthetic */ InterfaceC1421m $callback;

    public OkHttpExtensionsKt$await$2$responseCallback$1(InterfaceC1421m interfaceC1421m) {
        this.$callback = interfaceC1421m;
    }

    @Override // e9.InterfaceC2438f
    public void onFailure(InterfaceC2437e call, IOException e10) {
        AbstractC2855l.g(call, "call");
        AbstractC2855l.g(e10, "e");
        if (this.$callback.isCancelled()) {
            return;
        }
        InterfaceC1421m interfaceC1421m = this.$callback;
        C2752o.a aVar = C2752o.f28721h;
        interfaceC1421m.resumeWith(C2752o.b(AbstractC2753p.a(e10)));
    }

    @Override // e9.InterfaceC2438f
    public void onResponse(InterfaceC2437e call, D response) {
        AbstractC2855l.g(call, "call");
        AbstractC2855l.g(response, "response");
        this.$callback.resumeWith(C2752o.b(response));
    }
}
