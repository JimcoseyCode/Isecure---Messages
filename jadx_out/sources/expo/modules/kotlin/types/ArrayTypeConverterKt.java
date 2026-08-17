package expo.modules.kotlin.types;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.notifications.service.NotificationsService;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LC7/o;", NotificationsService.EVENT_TYPE_KEY, "Ljava/lang/Class;", "clazz", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isPrimitiveArray", "(LC7/o;Ljava/lang/Class;)Z", "expo-modules-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ArrayTypeConverterKt {
    public static final boolean isPrimitiveArray(C7.o type, Class<?> clazz) {
        AbstractC2855l.g(type, "type");
        AbstractC2855l.g(clazz, "clazz");
        if (AbstractC2855l.b(clazz, boolean[].class) || AbstractC2855l.b(clazz, byte[].class) || AbstractC2855l.b(clazz, char[].class) || AbstractC2855l.b(clazz, short[].class) || AbstractC2855l.b(clazz, int[].class) || AbstractC2855l.b(clazz, long[].class) || AbstractC2855l.b(clazz, float[].class) || AbstractC2855l.b(clazz, double[].class)) {
            return type.getArguments().isEmpty();
        }
        return false;
    }
}
