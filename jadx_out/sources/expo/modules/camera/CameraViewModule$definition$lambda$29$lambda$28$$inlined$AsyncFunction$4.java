package expo.modules.camera;

import expo.modules.kotlin.Promise;
import i7.C2735B;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunction$4 implements Function2 {
    /* JADX WARN: Multi-variable type inference failed */
    public final void invoke(Object[] objArr, Promise promise) {
        AbstractC2855l.g(objArr, "<unused var>");
        AbstractC2855l.g(promise, "promise");
        ((ExpoCameraView) promise).toggleRecording();
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Object[]) obj, (Promise) obj2);
        return C2735B.f28704a;
    }
}
