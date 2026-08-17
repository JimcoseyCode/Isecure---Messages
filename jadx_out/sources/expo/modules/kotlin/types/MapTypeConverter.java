package expo.modules.kotlin.types;

import C7.q;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.CollectionElementCastException;
import expo.modules.kotlin.exception.DynamicCastException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.ExpectedType;
import i7.C2735B;
import j7.AbstractC2800q;
import j7.K;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u000f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0013\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00022\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u0016\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00022\u0006\u0010\u0012\u001a\u00020\u00152\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR\u0018\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lexpo/modules/kotlin/types/MapTypeConverter;", "Lexpo/modules/kotlin/types/DynamicAwareTypeConverters;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/kotlin/types/TypeConverterProvider;", "converterProvider", "LC7/o;", "mapType", "<init>", "(Lexpo/modules/kotlin/types/TypeConverterProvider;LC7/o;)V", "Lcom/facebook/react/bridge/ReadableMap;", "jsMap", "Lexpo/modules/kotlin/AppContext;", "context", PointerEventHelper.POINTER_TYPE_UNKNOWN, "forceConversion", "convertFromReadableMap", "(Lcom/facebook/react/bridge/ReadableMap;Lexpo/modules/kotlin/AppContext;Z)Ljava/util/Map;", "Lcom/facebook/react/bridge/Dynamic;", "value", "convertFromDynamic", "(Lcom/facebook/react/bridge/Dynamic;Lexpo/modules/kotlin/AppContext;Z)Ljava/util/Map;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "convertFromAny", "(Ljava/lang/Object;Lexpo/modules/kotlin/AppContext;Z)Ljava/util/Map;", "Lexpo/modules/kotlin/jni/ExpectedType;", "getCppRequiredTypes", "()Lexpo/modules/kotlin/jni/ExpectedType;", "isTrivial", "()Z", "LC7/o;", "Lexpo/modules/kotlin/types/TypeConverter;", "valueConverter", "Lexpo/modules/kotlin/types/TypeConverter;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MapTypeConverter extends DynamicAwareTypeConverters<Map<?, ?>> {
    private final C7.o mapType;
    private final TypeConverter<?> valueConverter;

    public MapTypeConverter(TypeConverterProvider converterProvider, C7.o mapType) {
        AbstractC2855l.g(converterProvider, "converterProvider");
        AbstractC2855l.g(mapType, "mapType");
        this.mapType = mapType;
        C7.o oVarC = ((q) AbstractC2800q.e0(mapType.getArguments())).c();
        if (AbstractC2855l.b(oVarC != null ? oVarC.getClassifier() : null, D.b(String.class))) {
            q qVar = (q) AbstractC2800q.h0(mapType.getArguments(), 1);
            C7.o oVarC2 = qVar != null ? qVar.c() : null;
            if (oVarC2 == null) {
                throw new IllegalArgumentException("The map type should contain the key type.");
            }
            this.valueConverter = converterProvider.obtainTypeConverter(oVarC2);
            return;
        }
        throw new IllegalArgumentException(("The map key type should be String, but received " + AbstractC2800q.e0(mapType.getArguments()) + ".").toString());
    }

    private final Map<?, ?> convertFromReadableMap(ReadableMap jsMap, AppContext context, boolean forceConversion) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, Object>> entryIterator = jsMap.getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Object> next = entryIterator.next();
            String key = next.getKey();
            DynamicFromObject dynamicFromObject = new DynamicFromObject(next.getValue());
            try {
                linkedHashMap.put(key, this.valueConverter.convert(dynamicFromObject, context, forceConversion));
                C2735B c2735b = C2735B.f28704a;
                dynamicFromObject.recycle();
            } finally {
            }
        }
        return linkedHashMap;
    }

    @Override // expo.modules.kotlin.types.NonNullableTypeConverter, expo.modules.kotlin.types.TypeConverter
    /* JADX INFO: renamed from: getCppRequiredTypes */
    public ExpectedType get$cppRequireType() {
        return ExpectedType.INSTANCE.forMap(this.valueConverter.get$cppRequireType());
    }

    @Override // expo.modules.kotlin.types.NonNullableTypeConverter, expo.modules.kotlin.types.TypeConverter
    public boolean isTrivial() {
        return this.valueConverter.isTrivial();
    }

    @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
    public Map<?, ?> convertFromAny(Object value, AppContext context, boolean forceConversion) throws CollectionElementCastException {
        CodedException unexpectedException;
        AbstractC2855l.g(value, "value");
        if (this.valueConverter.isTrivial() && !forceConversion) {
            return (Map) value;
        }
        Map map = (Map) value;
        LinkedHashMap linkedHashMap = new LinkedHashMap(K.e(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value2 = entry.getValue();
            try {
                linkedHashMap.put(key, this.valueConverter.convert(value2, context, forceConversion));
            } catch (Throwable th) {
                if (th instanceof CodedException) {
                    unexpectedException = (CodedException) th;
                } else if (th instanceof expo.modules.core.errors.CodedException) {
                    expo.modules.core.errors.CodedException codedException = (expo.modules.core.errors.CodedException) th;
                    String code = codedException.getCode();
                    AbstractC2855l.f(code, "getCode(...)");
                    unexpectedException = new CodedException(code, codedException.getMessage(), codedException.getCause());
                } else {
                    unexpectedException = new UnexpectedException(th);
                }
                C7.o oVar = this.mapType;
                C7.o oVarC = ((q) this.mapType.getArguments().get(1)).c();
                AbstractC2855l.d(oVarC);
                AbstractC2855l.d(value2);
                throw new CollectionElementCastException(oVar, oVarC, D.b(value2.getClass()), unexpectedException);
            }
        }
        return linkedHashMap;
    }

    @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
    public Map<?, ?> convertFromDynamic(Dynamic value, AppContext context, boolean forceConversion) throws DynamicCastException {
        AbstractC2855l.g(value, "value");
        ReadableMap readableMapAsMap = value.asMap();
        if (readableMapAsMap != null) {
            return convertFromReadableMap(readableMapAsMap, context, forceConversion);
        }
        throw new DynamicCastException(D.b(ReadableMap.class));
    }
}
