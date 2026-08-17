package expo.modules.filesystem.unifiedfile;

import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LS0/a;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "deleteRecursively", "(LS0/a;)Z", "expo-file-system_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class SAFDocumentFileKt {
    public static final boolean deleteRecursively(S0.a aVar) {
        AbstractC2855l.g(aVar, "<this>");
        if (aVar.m()) {
            S0.a[] aVarArrQ = aVar.q();
            AbstractC2855l.f(aVarArrQ, "listFiles(...)");
            for (S0.a aVar2 : aVarArrQ) {
                AbstractC2855l.d(aVar2);
                deleteRecursively(aVar2);
            }
        }
        return aVar.e();
    }
}
