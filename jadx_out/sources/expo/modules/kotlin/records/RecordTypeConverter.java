package expo.modules.kotlin.records;

import C7.d;
import C7.e;
import C7.m;
import C7.o;
import E7.c;
import P8.q;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.allocators.ObjectConstructor;
import expo.modules.kotlin.allocators.ObjectConstructorFactory;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.DynamicCastException;
import expo.modules.kotlin.exception.FieldCastException;
import expo.modules.kotlin.exception.FieldRequiredException;
import expo.modules.kotlin.exception.RecordCastException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.CppType;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.records.Record;
import expo.modules.kotlin.types.DynamicAwareTypeConverters;
import expo.modules.kotlin.types.TypeConverter;
import expo.modules.kotlin.types.TypeConverterProvider;
import expo.modules.notifications.service.NotificationsService;
import i7.AbstractC2746i;
import i7.C2735B;
import i7.t;
import j7.K;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u00017B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ)\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u0015\"\b\b\u0001\u0010\u0002*\u00020\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001c\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u00122\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000eH\u0016¢\u0006\u0004\b!\u0010\"J;\u0010(\u001a\u00028\u00002\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0006\u0012\u0004\u0018\u00010\u00120#2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R3\u00106\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\u0012\u0012\u0002\b\u000300\u0012\u0004\u0012\u0002010#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105¨\u00068"}, d2 = {"Lexpo/modules/kotlin/records/RecordTypeConverter;", "Lexpo/modules/kotlin/records/Record;", "T", "Lexpo/modules/kotlin/types/DynamicAwareTypeConverters;", "Lexpo/modules/kotlin/types/TypeConverterProvider;", "converterProvider", "LC7/o;", NotificationsService.EVENT_TYPE_KEY, "<init>", "(Lexpo/modules/kotlin/types/TypeConverterProvider;LC7/o;)V", "Lcom/facebook/react/bridge/ReadableMap;", "jsMap", "Lexpo/modules/kotlin/AppContext;", "context", PointerEventHelper.POINTER_TYPE_UNKNOWN, "forceConversion", "convertFromReadableMap", "(Lcom/facebook/react/bridge/ReadableMap;Lexpo/modules/kotlin/AppContext;Z)Lexpo/modules/kotlin/records/Record;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "LC7/d;", "clazz", "Lexpo/modules/kotlin/allocators/ObjectConstructor;", "getObjectConstructor", "(LC7/d;)Lexpo/modules/kotlin/allocators/ObjectConstructor;", "Lcom/facebook/react/bridge/Dynamic;", "value", "convertFromDynamic", "(Lcom/facebook/react/bridge/Dynamic;Lexpo/modules/kotlin/AppContext;Z)Lexpo/modules/kotlin/records/Record;", "convertFromAny", "(Ljava/lang/Object;Lexpo/modules/kotlin/AppContext;Z)Lexpo/modules/kotlin/records/Record;", "Lexpo/modules/kotlin/jni/ExpectedType;", "getCppRequiredTypes", "()Lexpo/modules/kotlin/jni/ExpectedType;", "isTrivial", "()Z", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "map", "convertFromMap$expo_modules_core_release", "(Ljava/util/Map;Lexpo/modules/kotlin/AppContext;Z)Lexpo/modules/kotlin/records/Record;", "convertFromMap", "Lexpo/modules/kotlin/types/TypeConverterProvider;", "LC7/o;", "getType", "()LC7/o;", "Lexpo/modules/kotlin/allocators/ObjectConstructorFactory;", "objectConstructorFactory", "Lexpo/modules/kotlin/allocators/ObjectConstructorFactory;", "LC7/m;", "Lexpo/modules/kotlin/records/RecordTypeConverter$PropertyDescriptor;", "propertyDescriptors$delegate", "Lkotlin/Lazy;", "getPropertyDescriptors", "()Ljava/util/Map;", "propertyDescriptors", "PropertyDescriptor", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RecordTypeConverter<T extends Record> extends DynamicAwareTypeConverters<T> {
    private final TypeConverterProvider converterProvider;
    private final ObjectConstructorFactory objectConstructorFactory;

    /* JADX INFO: renamed from: propertyDescriptors$delegate, reason: from kotlin metadata */
    private final Lazy propertyDescriptors;
    private final o type;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B#\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0019"}, d2 = {"Lexpo/modules/kotlin/records/RecordTypeConverter$PropertyDescriptor;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "typeConverter", "Lexpo/modules/kotlin/types/TypeConverter;", "fieldAnnotation", "Lexpo/modules/kotlin/records/Field;", "isRequired", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(Lexpo/modules/kotlin/types/TypeConverter;Lexpo/modules/kotlin/records/Field;Z)V", "getTypeConverter", "()Lexpo/modules/kotlin/types/TypeConverter;", "getFieldAnnotation", "()Lexpo/modules/kotlin/records/Field;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", PointerEventHelper.POINTER_TYPE_UNKNOWN, "toString", PointerEventHelper.POINTER_TYPE_UNKNOWN, "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final /* data */ class PropertyDescriptor {
        private final Field fieldAnnotation;
        private final boolean isRequired;
        private final TypeConverter<?> typeConverter;

        public PropertyDescriptor(TypeConverter<?> typeConverter, Field fieldAnnotation, boolean z10) {
            AbstractC2855l.g(typeConverter, "typeConverter");
            AbstractC2855l.g(fieldAnnotation, "fieldAnnotation");
            this.typeConverter = typeConverter;
            this.fieldAnnotation = fieldAnnotation;
            this.isRequired = z10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PropertyDescriptor copy$default(PropertyDescriptor propertyDescriptor, TypeConverter typeConverter, Field field, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                typeConverter = propertyDescriptor.typeConverter;
            }
            if ((i10 & 2) != 0) {
                field = propertyDescriptor.fieldAnnotation;
            }
            if ((i10 & 4) != 0) {
                z10 = propertyDescriptor.isRequired;
            }
            return propertyDescriptor.copy(typeConverter, field, z10);
        }

        public final TypeConverter<?> component1() {
            return this.typeConverter;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Field getFieldAnnotation() {
            return this.fieldAnnotation;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getIsRequired() {
            return this.isRequired;
        }

        public final PropertyDescriptor copy(TypeConverter<?> typeConverter, Field fieldAnnotation, boolean isRequired) {
            AbstractC2855l.g(typeConverter, "typeConverter");
            AbstractC2855l.g(fieldAnnotation, "fieldAnnotation");
            return new PropertyDescriptor(typeConverter, fieldAnnotation, isRequired);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PropertyDescriptor)) {
                return false;
            }
            PropertyDescriptor propertyDescriptor = (PropertyDescriptor) other;
            return AbstractC2855l.b(this.typeConverter, propertyDescriptor.typeConverter) && AbstractC2855l.b(this.fieldAnnotation, propertyDescriptor.fieldAnnotation) && this.isRequired == propertyDescriptor.isRequired;
        }

        public final Field getFieldAnnotation() {
            return this.fieldAnnotation;
        }

        public final TypeConverter<?> getTypeConverter() {
            return this.typeConverter;
        }

        public int hashCode() {
            return (((this.typeConverter.hashCode() * 31) + this.fieldAnnotation.hashCode()) * 31) + Boolean.hashCode(this.isRequired);
        }

        public final boolean isRequired() {
            return this.isRequired;
        }

        public String toString() {
            return "PropertyDescriptor(typeConverter=" + this.typeConverter + ", fieldAnnotation=" + this.fieldAnnotation + ", isRequired=" + this.isRequired + ")";
        }
    }

    public RecordTypeConverter(TypeConverterProvider converterProvider, o type) {
        AbstractC2855l.g(converterProvider, "converterProvider");
        AbstractC2855l.g(type, "type");
        this.converterProvider = converterProvider;
        this.type = type;
        this.objectConstructorFactory = new ObjectConstructorFactory();
        this.propertyDescriptors = AbstractC2746i.b(new InterfaceC3487a() { // from class: expo.modules.kotlin.records.a
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return RecordTypeConverter.propertyDescriptors_delegate$lambda$1(this.f26625g);
            }
        });
    }

    public static /* synthetic */ Record convertFromMap$expo_modules_core_release$default(RecordTypeConverter recordTypeConverter, Map map, AppContext appContext, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            appContext = null;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return recordTypeConverter.convertFromMap$expo_modules_core_release(map, appContext, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T convertFromReadableMap(ReadableMap jsMap, AppContext context, boolean forceConversion) throws FieldRequiredException {
        FieldCastException fieldCastException;
        e classifier = this.type.getClassifier();
        AbstractC2855l.e(classifier, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
        T tConstruct = getObjectConstructor((d) classifier).construct();
        for (Map.Entry<m, PropertyDescriptor> entry : getPropertyDescriptors().entrySet()) {
            m key = entry.getKey();
            PropertyDescriptor value = entry.getValue();
            String strKey = value.getFieldAnnotation().key();
            if (q.f0(strKey)) {
                strKey = null;
            }
            if (strKey == null) {
                strKey = key.getName();
            }
            if (jsMap.hasKey(strKey)) {
                Dynamic dynamic = jsMap.getDynamic(strKey);
                try {
                    java.lang.reflect.Field fieldB = c.b(key);
                    AbstractC2855l.d(fieldB);
                    try {
                        Object objConvert = value.getTypeConverter().convert(dynamic, context, forceConversion);
                        fieldB.setAccessible(true);
                        fieldB.set(tConstruct, objConvert);
                        C2735B c2735b = C2735B.f28704a;
                    } finally {
                    }
                } finally {
                    dynamic.recycle();
                }
            } else if (value.isRequired()) {
                throw new FieldRequiredException(key);
            }
        }
        AbstractC2855l.e(tConstruct, "null cannot be cast to non-null type T of expo.modules.kotlin.records.RecordTypeConverter");
        return tConstruct;
    }

    private final <T> ObjectConstructor<T> getObjectConstructor(d clazz) {
        return this.objectConstructorFactory.get(clazz);
    }

    private final Map<m, PropertyDescriptor> getPropertyDescriptors() {
        return (Map) this.propertyDescriptors.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map propertyDescriptors_delegate$lambda$1(RecordTypeConverter recordTypeConverter) {
        Object objA;
        Object next;
        e classifier = recordTypeConverter.type.getClassifier();
        AbstractC2855l.e(classifier, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
        Collection<m> collectionB = D7.c.b((d) classifier);
        ArrayList arrayList = new ArrayList();
        for (m mVar : collectionB) {
            Iterator it = mVar.getAnnotations().iterator();
            while (true) {
                objA = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((Annotation) next) instanceof Field) {
                    break;
                }
            }
            Field field = (Field) next;
            if (field != null) {
                TypeConverter<?> typeConverterObtainTypeConverter = recordTypeConverter.converterProvider.obtainTypeConverter(mVar.getReturnType());
                Iterator it2 = mVar.getAnnotations().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next2 = it2.next();
                    if (((Annotation) next2) instanceof Required) {
                        objA = next2;
                        break;
                    }
                }
                objA = t.a(mVar, new PropertyDescriptor(typeConverterObtainTypeConverter, field, ((Required) objA) != null));
            }
            if (objA != null) {
                arrayList.add(objA);
            }
        }
        return K.r(arrayList);
    }

    public final T convertFromMap$expo_modules_core_release(Map<String, ? extends Object> map, AppContext context, boolean forceConversion) throws IllegalAccessException, FieldCastException, FieldRequiredException {
        CodedException unexpectedException;
        AbstractC2855l.g(map, "map");
        e classifier = this.type.getClassifier();
        AbstractC2855l.e(classifier, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
        T tConstruct = getObjectConstructor((d) classifier).construct();
        for (Map.Entry<m, PropertyDescriptor> entry : getPropertyDescriptors().entrySet()) {
            m key = entry.getKey();
            PropertyDescriptor value = entry.getValue();
            String strKey = value.getFieldAnnotation().key();
            if (q.f0(strKey)) {
                strKey = null;
            }
            if (strKey == null) {
                strKey = key.getName();
            }
            if (map.containsKey(strKey)) {
                Object objValueOf = map.get(strKey);
                if (objValueOf instanceof Number) {
                    e classifier2 = key.getReturnType().getClassifier();
                    objValueOf = AbstractC2855l.b(classifier2, D.b(Integer.TYPE)) ? Integer.valueOf(((Number) objValueOf).intValue()) : AbstractC2855l.b(classifier2, D.b(Long.TYPE)) ? Long.valueOf(((Number) objValueOf).longValue()) : AbstractC2855l.b(classifier2, D.b(Float.TYPE)) ? Float.valueOf(((Number) objValueOf).floatValue()) : AbstractC2855l.b(classifier2, D.b(Double.TYPE)) ? Double.valueOf(((Number) objValueOf).doubleValue()) : (Number) objValueOf;
                }
                java.lang.reflect.Field fieldB = c.b(key);
                AbstractC2855l.d(fieldB);
                try {
                    Object objConvert = value.getTypeConverter().convert(objValueOf, context, forceConversion);
                    fieldB.setAccessible(true);
                    fieldB.set(tConstruct, objConvert);
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
                    throw new FieldCastException(key.getName(), key.getReturnType(), getType(), unexpectedException);
                }
            } else if (value.isRequired()) {
                throw new FieldRequiredException(key);
            }
        }
        AbstractC2855l.e(tConstruct, "null cannot be cast to non-null type T of expo.modules.kotlin.records.RecordTypeConverter");
        return tConstruct;
    }

    @Override // expo.modules.kotlin.types.NonNullableTypeConverter, expo.modules.kotlin.types.TypeConverter
    /* JADX INFO: renamed from: getCppRequiredTypes */
    public ExpectedType get$cppRequireType() {
        return new ExpectedType(CppType.READABLE_MAP);
    }

    public final o getType() {
        return this.type;
    }

    @Override // expo.modules.kotlin.types.NonNullableTypeConverter, expo.modules.kotlin.types.TypeConverter
    public boolean isTrivial() {
        return false;
    }

    @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
    public T convertFromAny(Object value, AppContext context, boolean forceConversion) {
        AbstractC2855l.g(value, "value");
        return value instanceof ReadableMap ? (T) convertFromReadableMap((ReadableMap) value, context, forceConversion) : value instanceof Map ? (T) convertFromMap$expo_modules_core_release((Map) value, context, forceConversion) : (T) value;
    }

    @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
    public T convertFromDynamic(Dynamic value, AppContext context, boolean forceConversion) throws RecordCastException {
        CodedException unexpectedException;
        AbstractC2855l.g(value, "value");
        try {
            ReadableMap readableMapAsMap = value.asMap();
            if (readableMapAsMap != null) {
                return (T) convertFromReadableMap(readableMapAsMap, context, forceConversion);
            }
            throw new DynamicCastException(D.b(ReadableMap.class));
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
            throw new RecordCastException(getType(), unexpectedException);
        }
    }
}
