package expo.modules.kotlin.types;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.AppContext;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\fJ'\u0010\r\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH&¢\u0006\u0002\u0010\u000fJ'\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH&¢\u0006\u0002\u0010\f¨\u0006\u0011"}, d2 = {"Lexpo/modules/kotlin/types/DynamicAwareTypeConverters;", "T", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/kotlin/types/NonNullableTypeConverter;", "<init>", "()V", "convertNonNullable", "value", "context", "Lexpo/modules/kotlin/AppContext;", "forceConversion", PointerEventHelper.POINTER_TYPE_UNKNOWN, "(Ljava/lang/Object;Lexpo/modules/kotlin/AppContext;Z)Ljava/lang/Object;", "convertFromDynamic", "Lcom/facebook/react/bridge/Dynamic;", "(Lcom/facebook/react/bridge/Dynamic;Lexpo/modules/kotlin/AppContext;Z)Ljava/lang/Object;", "convertFromAny", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class DynamicAwareTypeConverters<T> extends NonNullableTypeConverter<T> {
    public abstract T convertFromAny(Object value, AppContext context, boolean forceConversion);

    public abstract T convertFromDynamic(Dynamic value, AppContext context, boolean forceConversion);

    @Override // expo.modules.kotlin.types.NonNullableTypeConverter
    public T convertNonNullable(Object value, AppContext context, boolean forceConversion) {
        AbstractC2855l.g(value, "value");
        return value instanceof Dynamic ? convertFromDynamic((Dynamic) value, context, forceConversion) : convertFromAny(value, context, forceConversion);
    }
}
