package expo.modules.kotlin.sharedobjects;

import C7.d;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import v7.AbstractC3430a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a(\u0010\u0002\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u0006\u0012\u0002\b\u00030\u0001H\u0086\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0006\u001a\u00020\u0005*\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"RefType", "Lexpo/modules/kotlin/sharedobjects/SharedRef;", "cast", "(Lexpo/modules/kotlin/sharedobjects/SharedRef;)Lexpo/modules/kotlin/sharedobjects/SharedRef;", "LC7/d;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isSharedRefClass", "(LC7/d;)Z", "expo-modules-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class SharedRefKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <RefType> SharedRef<RefType> cast(SharedRef<?> sharedRef) {
        AbstractC2855l.g(sharedRef, "<this>");
        Object ref = sharedRef.getRef();
        AbstractC2855l.m(3, "RefType");
        if (ref != null) {
            return sharedRef;
        }
        return null;
    }

    public static final boolean isSharedRefClass(d dVar) {
        AbstractC2855l.g(dVar, "<this>");
        return SharedRef.class.isAssignableFrom(AbstractC3430a.b(dVar));
    }
}
