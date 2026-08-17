package expo.modules.kotlin.types;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.notifications.service.NotificationsService;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lexpo/modules/kotlin/types/TypeConverterProvider;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "LC7/o;", NotificationsService.EVENT_TYPE_KEY, "Lexpo/modules/kotlin/types/TypeConverter;", "obtainTypeConverter", "(LC7/o;)Lexpo/modules/kotlin/types/TypeConverter;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface TypeConverterProvider {
    TypeConverter<?> obtainTypeConverter(C7.o type);
}
