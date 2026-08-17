package expo.modules.kotlin.records;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.types.TypeConverter;
import expo.modules.kotlin.types.TypeConverterProviderImpl;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00010\bH\u0001¢\u0006\u0002\u0010\t\u001a0\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00022\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0086\b¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"recordFromMap", "T", "Lexpo/modules/kotlin/records/Record;", "map", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "converter", "Lexpo/modules/kotlin/records/RecordTypeConverter;", "(Ljava/util/Map;Lexpo/modules/kotlin/records/RecordTypeConverter;)Lexpo/modules/kotlin/records/Record;", "(Ljava/util/Map;)Lexpo/modules/kotlin/records/Record;", "expo-modules-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class RecordTypeConverterKt {
    public static final <T extends Record> T recordFromMap(Map<String, ? extends Object> map, RecordTypeConverter<T> converter) {
        AbstractC2855l.g(map, "map");
        AbstractC2855l.g(converter, "converter");
        return (T) RecordTypeConverter.convertFromMap$expo_modules_core_release$default(converter, map, null, false, 6, null);
    }

    public static final /* synthetic */ <T extends Record> T recordFromMap(Map<String, ? extends Object> map) {
        AbstractC2855l.g(map, "map");
        TypeConverterProviderImpl typeConverterProviderImpl = TypeConverterProviderImpl.INSTANCE;
        AbstractC2855l.m(6, "T");
        TypeConverter<?> typeConverterObtainTypeConverter = typeConverterProviderImpl.obtainTypeConverter(null);
        AbstractC2855l.e(typeConverterObtainTypeConverter, "null cannot be cast to non-null type expo.modules.kotlin.records.RecordTypeConverter<T of expo.modules.kotlin.records.RecordTypeConverterKt.recordFromMap>");
        return (T) recordFromMap(map, (RecordTypeConverter) typeConverterObtainTypeConverter);
    }
}
