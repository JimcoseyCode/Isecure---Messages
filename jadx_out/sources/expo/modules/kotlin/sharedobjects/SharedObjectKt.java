package expo.modules.kotlin.sharedobjects;

import C7.d;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import v7.AbstractC3430a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LC7/d;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isSharedObjectClass", "(LC7/d;)Z", "expo-modules-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class SharedObjectKt {
    public static final boolean isSharedObjectClass(d dVar) {
        AbstractC2855l.g(dVar, "<this>");
        return SharedObject.class.isAssignableFrom(AbstractC3430a.b(dVar));
    }
}
