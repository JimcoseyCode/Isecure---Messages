package expo.modules.kotlin.typedarray;

import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0082\b¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lexpo/modules/kotlin/typedarray/TypedArray;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "index", "Li7/B;", "checkIfInRange", "(Lexpo/modules/kotlin/typedarray/TypedArray;I)V", "expo-modules-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ConcreteTypedArraysKt {
    private static final void checkIfInRange(TypedArray typedArray, int i10) {
        if (i10 < 0 || i10 >= typedArray.getLength()) {
            throw new IndexOutOfBoundsException();
        }
    }
}
