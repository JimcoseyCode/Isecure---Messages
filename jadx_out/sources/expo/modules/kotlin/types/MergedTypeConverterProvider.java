package expo.modules.kotlin.types;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.exception.MissingTypeConverter;
import expo.modules.notifications.service.NotificationsService;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lexpo/modules/kotlin/types/MergedTypeConverterProvider;", "Lexpo/modules/kotlin/types/TypeConverterProvider;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "providers", "<init>", "(Ljava/util/List;)V", "LC7/o;", NotificationsService.EVENT_TYPE_KEY, "Lexpo/modules/kotlin/types/TypeConverter;", "obtainTypeConverter", "(LC7/o;)Lexpo/modules/kotlin/types/TypeConverter;", "Ljava/util/List;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MergedTypeConverterProvider implements TypeConverterProvider {
    private final List<TypeConverterProvider> providers;

    /* JADX WARN: Multi-variable type inference failed */
    public MergedTypeConverterProvider(List<? extends TypeConverterProvider> providers) {
        AbstractC2855l.g(providers, "providers");
        this.providers = providers;
    }

    @Override // expo.modules.kotlin.types.TypeConverterProvider
    public TypeConverter<?> obtainTypeConverter(C7.o type) throws MissingTypeConverter {
        AbstractC2855l.g(type, "type");
        Iterator<TypeConverterProvider> it = this.providers.iterator();
        while (it.hasNext()) {
            try {
                return it.next().obtainTypeConverter(type);
            } catch (MissingTypeConverter unused) {
            }
        }
        throw new MissingTypeConverter(type);
    }
}
