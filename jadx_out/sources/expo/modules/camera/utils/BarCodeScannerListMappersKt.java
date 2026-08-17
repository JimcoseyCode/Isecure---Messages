package expo.modules.camera.utils;

import B7.a;
import B7.d;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a1\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0002H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a1\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0002H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\b"}, d2 = {PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lkotlin/Function1;", "block", "Li7/B;", "mapX", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "mapY", "expo-camera_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class BarCodeScannerListMappersKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void mapX(List<Integer> list, Function1 block) {
        AbstractC2855l.g(list, "<this>");
        AbstractC2855l.g(block, "block");
        a aVarO = d.o(d.p(0, list.size()), 2);
        int iD = aVarO.d();
        int iO = aVarO.o();
        int iP = aVarO.p();
        if ((iP <= 0 || iD > iO) && (iP >= 0 || iO > iD)) {
            return;
        }
        while (true) {
            list.set(iD, block.invoke(Integer.valueOf(iD)));
            if (iD == iO) {
                return;
            } else {
                iD += iP;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void mapY(List<Integer> list, Function1 block) {
        AbstractC2855l.g(list, "<this>");
        AbstractC2855l.g(block, "block");
        a aVarO = d.o(d.p(1, list.size()), 2);
        int iD = aVarO.d();
        int iO = aVarO.o();
        int iP = aVarO.p();
        if ((iP <= 0 || iD > iO) && (iP >= 0 || iO > iD)) {
            return;
        }
        while (true) {
            list.set(iD, block.invoke(Integer.valueOf(iD)));
            if (iD == iO) {
                return;
            } else {
                iD += iP;
            }
        }
    }
}
