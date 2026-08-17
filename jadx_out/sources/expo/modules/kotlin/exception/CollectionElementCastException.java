package expo.modules.kotlin.exception;

import C7.d;
import C7.o;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u000b\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\fB-\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\r\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\u000e¨\u0006\u000f"}, d2 = {"Lexpo/modules/kotlin/exception/CollectionElementCastException;", "Lexpo/modules/kotlin/exception/DecoratedException;", "LC7/o;", "collectionType", "elementType", PointerEventHelper.POINTER_TYPE_UNKNOWN, "providedType", "Lexpo/modules/kotlin/exception/CodedException;", "cause", "<init>", "(LC7/o;LC7/o;Ljava/lang/String;Lexpo/modules/kotlin/exception/CodedException;)V", "Lcom/facebook/react/bridge/ReadableType;", "(LC7/o;LC7/o;Lcom/facebook/react/bridge/ReadableType;Lexpo/modules/kotlin/exception/CodedException;)V", "LC7/d;", "(LC7/o;LC7/o;LC7/d;Lexpo/modules/kotlin/exception/CodedException;)V", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CollectionElementCastException extends DecoratedException {
    private CollectionElementCastException(o oVar, o oVar2, String str, CodedException codedException) {
        super("Cannot cast '" + str + "' to '" + oVar2 + "' required by the collection of type: '" + oVar + "'.", codedException);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CollectionElementCastException(o collectionType, o elementType, ReadableType providedType, CodedException cause) {
        this(collectionType, elementType, providedType.name(), cause);
        AbstractC2855l.g(collectionType, "collectionType");
        AbstractC2855l.g(elementType, "elementType");
        AbstractC2855l.g(providedType, "providedType");
        AbstractC2855l.g(cause, "cause");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CollectionElementCastException(o collectionType, o elementType, d providedType, CodedException cause) {
        this(collectionType, elementType, providedType.toString(), cause);
        AbstractC2855l.g(collectionType, "collectionType");
        AbstractC2855l.g(elementType, "elementType");
        AbstractC2855l.g(providedType, "providedType");
        AbstractC2855l.g(cause, "cause");
    }
}
