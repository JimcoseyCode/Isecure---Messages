package expo.modules.camera.analyzers;

import androidx.camera.core.o;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {PointerEventHelper.POINTER_TYPE_UNKNOWN, "Landroidx/camera/core/o$a;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "toByteArray", "([Landroidx/camera/core/o$a;)[B", "expo-camera_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class BarcodeAnalyzerKt {
    public static final byte[] toByteArray(o.a[] aVarArr) {
        AbstractC2855l.g(aVarArr, "<this>");
        int iRemaining = 0;
        for (o.a aVar : aVarArr) {
            iRemaining += aVar.c().remaining();
        }
        byte[] bArr = new byte[iRemaining];
        int i10 = 0;
        for (o.a aVar2 : aVarArr) {
            ByteBuffer byteBufferC = aVar2.c();
            AbstractC2855l.f(byteBufferC, "getBuffer(...)");
            int iRemaining2 = byteBufferC.remaining();
            byteBufferC.get(bArr, i10, iRemaining2);
            i10 += iRemaining2;
        }
        return bArr;
    }
}
