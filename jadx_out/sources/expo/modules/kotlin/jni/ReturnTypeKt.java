package expo.modules.kotlin.jni;

import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0002"}, d2 = {"nextValue", PointerEventHelper.POINTER_TYPE_UNKNOWN, "expo-modules-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ReturnTypeKt {
    private static int nextValue;

    /* JADX INFO: Access modifiers changed from: private */
    public static final int nextValue() {
        int i10 = nextValue;
        int i11 = 1 << i10;
        nextValue = i10 + 1;
        return i11;
    }
}
