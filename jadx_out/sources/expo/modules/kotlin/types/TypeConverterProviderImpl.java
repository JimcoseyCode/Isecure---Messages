package expo.modules.kotlin.types;

import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.core.arguments.ReadableArguments;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.exception.DynamicCastException;
import expo.modules.kotlin.exception.MissingTypeConverter;
import expo.modules.kotlin.exception.UnsupportedClass;
import expo.modules.kotlin.jni.CppType;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.JavaScriptArrayBuffer;
import expo.modules.kotlin.jni.JavaScriptFunction;
import expo.modules.kotlin.jni.JavaScriptObject;
import expo.modules.kotlin.jni.JavaScriptValue;
import expo.modules.kotlin.jni.NativeArrayBuffer;
import expo.modules.kotlin.jni.worklets.Serializable;
import expo.modules.kotlin.jni.worklets.Worklet;
import expo.modules.kotlin.records.Record;
import expo.modules.kotlin.records.RecordTypeConverter;
import expo.modules.kotlin.sharedobjects.SharedObject;
import expo.modules.kotlin.sharedobjects.SharedObjectTypeConverter;
import expo.modules.kotlin.sharedobjects.SharedRef;
import expo.modules.kotlin.sharedobjects.SharedRefTypeConverter;
import expo.modules.kotlin.typedarray.BigInt64Array;
import expo.modules.kotlin.typedarray.BigUint64Array;
import expo.modules.kotlin.typedarray.Float32Array;
import expo.modules.kotlin.typedarray.Float64Array;
import expo.modules.kotlin.typedarray.Int16Array;
import expo.modules.kotlin.typedarray.Int32Array;
import expo.modules.kotlin.typedarray.Int8Array;
import expo.modules.kotlin.typedarray.TypedArray;
import expo.modules.kotlin.typedarray.Uint16Array;
import expo.modules.kotlin.typedarray.Uint32Array;
import expo.modules.kotlin.typedarray.Uint8Array;
import expo.modules.kotlin.typedarray.Uint8ClampedArray;
import expo.modules.kotlin.types.io.FileTypeConverter;
import expo.modules.kotlin.types.io.PathTypeConverter;
import expo.modules.kotlin.types.net.JavaURITypeConverter;
import expo.modules.kotlin.types.net.URLTypConverter;
import expo.modules.kotlin.types.net.UriTypeConverter;
import expo.modules.kotlin.types.worklets.SerializableTypeConverter;
import expo.modules.kotlin.types.worklets.WorkletTypeConverter;
import expo.modules.kotlin.views.ViewTypeConverter;
import expo.modules.notifications.service.NotificationsService;
import i7.C2735B;
import i7.t;
import j7.K;
import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import v7.AbstractC3430a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ)\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u00042\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0011\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0010\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0013\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0010\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u001b\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\bJ\u0019\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\bR(\u0010\u0016\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0010\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R(\u0010\u0018\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0010\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R$\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017¨\u0006\u001b"}, d2 = {"Lexpo/modules/kotlin/types/TypeConverterProviderImpl;", "Lexpo/modules/kotlin/types/TypeConverterProvider;", "<init>", "()V", "LC7/o;", "inputType", "Lexpo/modules/kotlin/types/TypeConverter;", "getCachedConverter", "(LC7/o;)Lexpo/modules/kotlin/types/TypeConverter;", "getCachedPrimitiveArrayConverter", NotificationsService.EVENT_TYPE_KEY, "Ljava/lang/Class;", "jClass", "handelEither", "(LC7/o;Ljava/lang/Class;)Lexpo/modules/kotlin/types/TypeConverter;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "LC7/d;", "createCachedConverters", "()Ljava/util/Map;", "createCachedPrimitiveArrayConverters", "obtainTypeConverter", "obtainNonNullableTypeConverter", "cachedConverters", "Ljava/util/Map;", "cachedPrimitiveArrayConverters", PointerEventHelper.POINTER_TYPE_UNKNOWN, "cachedRecordConverters", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TypeConverterProviderImpl implements TypeConverterProvider {
    public static final TypeConverterProviderImpl INSTANCE;
    private static final Map<C7.d, TypeConverter<?>> cachedConverters;
    private static final Map<C7.d, TypeConverter<?>> cachedPrimitiveArrayConverters;
    private static final Map<C7.o, TypeConverter<?>> cachedRecordConverters;

    static {
        TypeConverterProviderImpl typeConverterProviderImpl = new TypeConverterProviderImpl();
        INSTANCE = typeConverterProviderImpl;
        cachedConverters = typeConverterProviderImpl.createCachedConverters();
        cachedPrimitiveArrayConverters = typeConverterProviderImpl.createCachedPrimitiveArrayConverters();
        cachedRecordConverters = new LinkedHashMap();
    }

    private TypeConverterProviderImpl() {
    }

    private final Map<C7.d, TypeConverter<?>> createCachedConverters() {
        final ExpectedType expectedType = new ExpectedType(CppType.INT);
        DynamicAwareTypeConverters<Integer> dynamicAwareTypeConverters = new DynamicAwareTypeConverters<Integer>() { // from class: expo.modules.kotlin.types.TypeConverterProviderImpl$createCachedConverters$$inlined$createTrivialTypeConverter$1
            @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
            public Integer convertFromAny(Object value, AppContext context, boolean forceConversion) {
                AbstractC2855l.g(value, "value");
                return (Integer) value;
            }

            @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
            public Integer convertFromDynamic(Dynamic value, AppContext context, boolean forceConversion) {
                AbstractC2855l.g(value, "value");
                return Integer.valueOf((int) value.asDouble());
            }

            @Override // expo.modules.kotlin.types.NonNullableTypeConverter, expo.modules.kotlin.types.TypeConverter
            /* JADX INFO: renamed from: getCppRequiredTypes, reason: from getter */
            public ExpectedType get$cppRequireType() {
                return expectedType;
            }
        };
        final ExpectedType expectedType2 = new ExpectedType(CppType.LONG);
        DynamicAwareTypeConverters<Long> dynamicAwareTypeConverters2 = new DynamicAwareTypeConverters<Long>() { // from class: expo.modules.kotlin.types.TypeConverterProviderImpl$createCachedConverters$$inlined$createTrivialTypeConverter$2
            @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
            public Long convertFromAny(Object value, AppContext context, boolean forceConversion) {
                AbstractC2855l.g(value, "value");
                return (Long) value;
            }

            @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
            public Long convertFromDynamic(Dynamic value, AppContext context, boolean forceConversion) {
                AbstractC2855l.g(value, "value");
                return Long.valueOf((long) value.asDouble());
            }

            @Override // expo.modules.kotlin.types.NonNullableTypeConverter, expo.modules.kotlin.types.TypeConverter
            /* JADX INFO: renamed from: getCppRequiredTypes, reason: from getter */
            public ExpectedType get$cppRequireType() {
                return expectedType2;
            }
        };
        final ExpectedType expectedType3 = new ExpectedType(CppType.DOUBLE);
        DynamicAwareTypeConverters<Double> dynamicAwareTypeConverters3 = new DynamicAwareTypeConverters<Double>() { // from class: expo.modules.kotlin.types.TypeConverterProviderImpl$createCachedConverters$$inlined$createTrivialTypeConverter$3
            @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
            public Double convertFromAny(Object value, AppContext context, boolean forceConversion) {
                AbstractC2855l.g(value, "value");
                return (Double) value;
            }

            @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
            public Double convertFromDynamic(Dynamic value, AppContext context, boolean forceConversion) {
                AbstractC2855l.g(value, "value");
                return Double.valueOf(value.asDouble());
            }

            @Override // expo.modules.kotlin.types.NonNullableTypeConverter, expo.modules.kotlin.types.TypeConverter
            /* JADX INFO: renamed from: getCppRequiredTypes, reason: from getter */
            public ExpectedType get$cppRequireType() {
                return expectedType3;
            }
        };
        final ExpectedType expectedType4 = new ExpectedType(CppType.FLOAT);
        DynamicAwareTypeConverters<Float> dynamicAwareTypeConverters4 = new DynamicAwareTypeConverters<Float>() { // from class: expo.modules.kotlin.types.TypeConverterProviderImpl$createCachedConverters$$inlined$createTrivialTypeConverter$4
            @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
            public Float convertFromAny(Object value, AppContext context, boolean forceConversion) {
                AbstractC2855l.g(value, "value");
                return (Float) value;
            }

            @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
            public Float convertFromDynamic(Dynamic value, AppContext context, boolean forceConversion) {
                AbstractC2855l.g(value, "value");
                return Float.valueOf((float) value.asDouble());
            }

            @Override // expo.modules.kotlin.types.NonNullableTypeConverter, expo.modules.kotlin.types.TypeConverter
            /* JADX INFO: renamed from: getCppRequiredTypes, reason: from getter */
            public ExpectedType get$cppRequireType() {
                return expectedType4;
            }
        };
        final ExpectedType expectedType5 = new ExpectedType(CppType.BOOLEAN);
        DynamicAwareTypeConverters<Boolean> dynamicAwareTypeConverters5 = new DynamicAwareTypeConverters<Boolean>() { // from class: expo.modules.kotlin.types.TypeConverterProviderImpl$createCachedConverters$$inlined$createTrivialTypeConverter$5
            @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
            public Boolean convertFromAny(Object value, AppContext context, boolean forceConversion) {
                AbstractC2855l.g(value, "value");
                return (Boolean) value;
            }

            @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
            public Boolean convertFromDynamic(Dynamic value, AppContext context, boolean forceConversion) {
                AbstractC2855l.g(value, "value");
                return Boolean.valueOf(value.asBoolean());
            }

            @Override // expo.modules.kotlin.types.NonNullableTypeConverter, expo.modules.kotlin.types.TypeConverter
            /* JADX INFO: renamed from: getCppRequiredTypes, reason: from getter */
            public ExpectedType get$cppRequireType() {
                return expectedType5;
            }
        };
        SerializableTypeConverter serializableTypeConverter = new SerializableTypeConverter();
        Pair pairA = t.a(D.b(Integer.TYPE), dynamicAwareTypeConverters);
        Pair pairA2 = t.a(D.b(Integer.class), dynamicAwareTypeConverters);
        Pair pairA3 = t.a(D.b(Long.TYPE), dynamicAwareTypeConverters2);
        Pair pairA4 = t.a(D.b(Long.class), dynamicAwareTypeConverters2);
        Pair pairA5 = t.a(D.b(Double.TYPE), dynamicAwareTypeConverters3);
        Pair pairA6 = t.a(D.b(Double.class), dynamicAwareTypeConverters3);
        Pair pairA7 = t.a(D.b(Float.TYPE), dynamicAwareTypeConverters4);
        Pair pairA8 = t.a(D.b(Float.class), dynamicAwareTypeConverters4);
        Pair pairA9 = t.a(D.b(Boolean.TYPE), dynamicAwareTypeConverters5);
        Pair pairA10 = t.a(D.b(Boolean.class), dynamicAwareTypeConverters5);
        C7.d dVarB = D.b(String.class);
        final ExpectedType expectedType6 = new ExpectedType(CppType.STRING);
        Pair pairA11 = t.a(dVarB, new DynamicAwareTypeConverters<String>() { // from class: expo.modules.kotlin.types.TypeConverterProviderImpl$createCachedConverters$$inlined$createTrivialTypeConverter$6
            @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
            public String convertFromAny(Object value, AppContext context, boolean forceConversion) {
                AbstractC2855l.g(value, "value");
                return (String) value;
            }

            @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
            public String convertFromDynamic(Dynamic value, AppContext context, boolean forceConversion) throws DynamicCastException {
                AbstractC2855l.g(value, "value");
                String strAsString = value.asString();
                if (strAsString != null) {
                    return strAsString;
                }
                throw new DynamicCastException(D.b(String.class));
            }

            @Override // expo.modules.kotlin.types.NonNullableTypeConverter, expo.modules.kotlin.types.TypeConverter
            /* JADX INFO: renamed from: getCppRequiredTypes, reason: from getter */
            public ExpectedType get$cppRequireType() {
                return expectedType6;
            }
        });
        C7.d dVarB2 = D.b(ReadableArray.class);
        final ExpectedType expectedType7 = new ExpectedType(CppType.READABLE_ARRAY);
        Pair pairA12 = t.a(dVarB2, new DynamicAwareTypeConverters<ReadableArray>() { // from class: expo.modules.kotlin.types.TypeConverterProviderImpl$createCachedConverters$$inlined$createTrivialTypeConverter$7
            @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
            public ReadableArray convertFromAny(Object value, AppContext context, boolean forceConversion) {
                AbstractC2855l.g(value, "value");
                return (ReadableArray) value;
            }

            @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
            public ReadableArray convertFromDynamic(Dynamic value, AppContext context, boolean forceConversion) throws DynamicCastException {
                AbstractC2855l.g(value, "value");
                ReadableArray readableArrayAsArray = value.asArray();
                if (readableArrayAsArray != null) {
                    return readableArrayAsArray;
                }
                throw new DynamicCastException(D.b(ReadableArray.class));
            }

            @Override // expo.modules.kotlin.types.NonNullableTypeConverter, expo.modules.kotlin.types.TypeConverter
            /* JADX INFO: renamed from: getCppRequiredTypes, reason: from getter */
            public ExpectedType get$cppRequireType() {
                return expectedType7;
            }
        });
        C7.d dVarB3 = D.b(ReadableMap.class);
        final ExpectedType expectedType8 = new ExpectedType(CppType.READABLE_MAP);
        Pair pairA13 = t.a(dVarB3, new DynamicAwareTypeConverters<ReadableMap>() { // from class: expo.modules.kotlin.types.TypeConverterProviderImpl$createCachedConverters$$inlined$createTrivialTypeConverter$8
            @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
            public ReadableMap convertFromAny(Object value, AppContext context, boolean forceConversion) {
                AbstractC2855l.g(value, "value");
                return (ReadableMap) value;
            }

            @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
            public ReadableMap convertFromDynamic(Dynamic value, AppContext context, boolean forceConversion) throws DynamicCastException {
                AbstractC2855l.g(value, "value");
                ReadableMap readableMapAsMap = value.asMap();
                if (readableMapAsMap != null) {
                    return readableMapAsMap;
                }
                throw new DynamicCastException(D.b(ReadableMap.class));
            }

            @Override // expo.modules.kotlin.types.NonNullableTypeConverter, expo.modules.kotlin.types.TypeConverter
            /* JADX INFO: renamed from: getCppRequiredTypes, reason: from getter */
            public ExpectedType get$cppRequireType() {
                return expectedType8;
            }
        });
        Pair pairA14 = t.a(D.b(byte[].class), new ByteArrayTypeConverter());
        C7.d dVarB4 = D.b(JavaScriptValue.class);
        final ExpectedType expectedType9 = new ExpectedType(CppType.JS_VALUE);
        Pair pairA15 = t.a(dVarB4, new DynamicAwareTypeConverters<Object>() { // from class: expo.modules.kotlin.types.TypeConverterProviderImpl$createCachedConverters$$inlined$createTrivialTypeConverter$default$1
            @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
            public Object convertFromAny(Object value, AppContext context, boolean forceConversion) {
                AbstractC2855l.g(value, "value");
                return value;
            }

            @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
            public Object convertFromDynamic(Dynamic value, AppContext context, boolean forceConversion) throws UnsupportedClass {
                AbstractC2855l.g(value, "value");
                throw new UnsupportedClass(D.b(Object.class));
            }

            @Override // expo.modules.kotlin.types.NonNullableTypeConverter, expo.modules.kotlin.types.TypeConverter
            /* JADX INFO: renamed from: getCppRequiredTypes, reason: from getter */
            public ExpectedType get$cppRequireType() {
                return expectedType9;
            }
        });
        C7.d dVarB5 = D.b(JavaScriptObject.class);
        final ExpectedType expectedType10 = new ExpectedType(CppType.JS_OBJECT);
        Pair pairA16 = t.a(dVarB5, new DynamicAwareTypeConverters<Object>() { // from class: expo.modules.kotlin.types.TypeConverterProviderImpl$createCachedConverters$$inlined$createTrivialTypeConverter$default$2
            @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
            public Object convertFromAny(Object value, AppContext context, boolean forceConversion) {
                AbstractC2855l.g(value, "value");
                return value;
            }

            @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
            public Object convertFromDynamic(Dynamic value, AppContext context, boolean forceConversion) throws UnsupportedClass {
                AbstractC2855l.g(value, "value");
                throw new UnsupportedClass(D.b(Object.class));
            }

            @Override // expo.modules.kotlin.types.NonNullableTypeConverter, expo.modules.kotlin.types.TypeConverter
            /* JADX INFO: renamed from: getCppRequiredTypes, reason: from getter */
            public ExpectedType get$cppRequireType() {
                return expectedType10;
            }
        });
        C7.d dVarB6 = D.b(JavaScriptArrayBuffer.class);
        final ExpectedType expectedType11 = new ExpectedType(CppType.JS_ARRAY_BUFFER);
        Pair pairA17 = t.a(dVarB6, new DynamicAwareTypeConverters<Object>() { // from class: expo.modules.kotlin.types.TypeConverterProviderImpl$createCachedConverters$$inlined$createTrivialTypeConverter$default$3
            @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
            public Object convertFromAny(Object value, AppContext context, boolean forceConversion) {
                AbstractC2855l.g(value, "value");
                return value;
            }

            @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
            public Object convertFromDynamic(Dynamic value, AppContext context, boolean forceConversion) throws UnsupportedClass {
                AbstractC2855l.g(value, "value");
                throw new UnsupportedClass(D.b(Object.class));
            }

            @Override // expo.modules.kotlin.types.NonNullableTypeConverter, expo.modules.kotlin.types.TypeConverter
            /* JADX INFO: renamed from: getCppRequiredTypes, reason: from getter */
            public ExpectedType get$cppRequireType() {
                return expectedType11;
            }
        });
        C7.d dVarB7 = D.b(NativeArrayBuffer.class);
        final ExpectedType expectedType12 = new ExpectedType(CppType.NATIVE_ARRAY_BUFFER);
        Map<C7.d, TypeConverter<?>> mapL = K.l(pairA, pairA2, pairA3, pairA4, pairA5, pairA6, pairA7, pairA8, pairA9, pairA10, pairA11, pairA12, pairA13, pairA14, pairA15, pairA16, pairA17, t.a(dVarB7, new DynamicAwareTypeConverters<Object>() { // from class: expo.modules.kotlin.types.TypeConverterProviderImpl$createCachedConverters$$inlined$createTrivialTypeConverter$default$4
            @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
            public Object convertFromAny(Object value, AppContext context, boolean forceConversion) {
                AbstractC2855l.g(value, "value");
                return value;
            }

            @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
            public Object convertFromDynamic(Dynamic value, AppContext context, boolean forceConversion) throws UnsupportedClass {
                AbstractC2855l.g(value, "value");
                throw new UnsupportedClass(D.b(Object.class));
            }

            @Override // expo.modules.kotlin.types.NonNullableTypeConverter, expo.modules.kotlin.types.TypeConverter
            /* JADX INFO: renamed from: getCppRequiredTypes, reason: from getter */
            public ExpectedType get$cppRequireType() {
                return expectedType12;
            }
        }), t.a(D.b(Serializable.class), serializableTypeConverter), t.a(D.b(Worklet.class), new WorkletTypeConverter(serializableTypeConverter)), t.a(D.b(Int8Array.class), new Int8ArrayTypeConverter()), t.a(D.b(Int16Array.class), new Int16ArrayTypeConverter()), t.a(D.b(Int32Array.class), new Int32ArrayTypeConverter()), t.a(D.b(Uint8Array.class), new Uint8ArrayTypeConverter()), t.a(D.b(Uint8ClampedArray.class), new Uint8ClampedArrayTypeConverter()), t.a(D.b(Uint16Array.class), new Uint16ArrayTypeConverter()), t.a(D.b(Uint32Array.class), new Uint32ArrayTypeConverter()), t.a(D.b(Float32Array.class), new Float32ArrayTypeConverter()), t.a(D.b(Float64Array.class), new Float64ArrayTypeConverter()), t.a(D.b(BigInt64Array.class), new BigInt64ArrayTypeConverter()), t.a(D.b(BigUint64Array.class), new BigUint64ArrayTypeConverter()), t.a(D.b(TypedArray.class), new TypedArrayTypeConverter()), t.a(D.b(URL.class), new URLTypConverter()), t.a(D.b(Uri.class), new UriTypeConverter()), t.a(D.b(URI.class), new JavaURITypeConverter()), t.a(D.b(File.class), new FileTypeConverter()), t.a(D.b(Q8.a.class), new DurationTypeConverter()), t.a(D.b(Object.class), new AnyTypeConverter()), t.a(D.b(C2735B.class), new UnitTypeConverter()), t.a(D.b(ReadableArguments.class), new ReadableArgumentsTypeConverter()));
        return Build.VERSION.SDK_INT >= 26 ? K.o(mapL, K.l(t.a(D.b(m.a()), new PathTypeConverter()), t.a(D.b(Color.class), new ColorTypeConverter()), t.a(D.b(n.a()), new DateTypeConverter()))) : mapL;
    }

    private final Map<C7.d, TypeConverter<?>> createCachedPrimitiveArrayConverters() {
        C7.d dVarB = D.b(int[].class);
        ExpectedType.Companion companion = ExpectedType.INSTANCE;
        final ExpectedType expectedTypeForPrimitiveArray = companion.forPrimitiveArray(CppType.INT);
        Pair pairA = t.a(dVarB, new DynamicAwareTypeConverters<int[]>() { // from class: expo.modules.kotlin.types.TypeConverterProviderImpl$createCachedPrimitiveArrayConverters$$inlined$createTrivialTypeConverter$1
            @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
            public int[] convertFromAny(Object value, AppContext context, boolean forceConversion) {
                AbstractC2855l.g(value, "value");
                return (int[]) value;
            }

            @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
            public int[] convertFromDynamic(Dynamic value, AppContext context, boolean forceConversion) throws DynamicCastException {
                AbstractC2855l.g(value, "value");
                ReadableArray readableArrayAsArray = value.asArray();
                if (readableArrayAsArray == null) {
                    throw new DynamicCastException(D.b(ReadableArray.class));
                }
                int size = readableArrayAsArray.size();
                int[] iArr = new int[size];
                for (int i10 = 0; i10 < size; i10++) {
                    iArr[i10] = readableArrayAsArray.getInt(i10);
                }
                return iArr;
            }

            @Override // expo.modules.kotlin.types.NonNullableTypeConverter, expo.modules.kotlin.types.TypeConverter
            /* JADX INFO: renamed from: getCppRequiredTypes, reason: from getter */
            public ExpectedType get$cppRequireType() {
                return expectedTypeForPrimitiveArray;
            }
        });
        C7.d dVarB2 = D.b(long[].class);
        final ExpectedType expectedTypeForPrimitiveArray2 = companion.forPrimitiveArray(CppType.LONG);
        Pair pairA2 = t.a(dVarB2, new DynamicAwareTypeConverters<long[]>() { // from class: expo.modules.kotlin.types.TypeConverterProviderImpl$createCachedPrimitiveArrayConverters$$inlined$createTrivialTypeConverter$2
            @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
            public long[] convertFromAny(Object value, AppContext context, boolean forceConversion) {
                AbstractC2855l.g(value, "value");
                return (long[]) value;
            }

            @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
            public long[] convertFromDynamic(Dynamic value, AppContext context, boolean forceConversion) throws DynamicCastException {
                AbstractC2855l.g(value, "value");
                ReadableArray readableArrayAsArray = value.asArray();
                if (readableArrayAsArray == null) {
                    throw new DynamicCastException(D.b(ReadableArray.class));
                }
                int size = readableArrayAsArray.size();
                long[] jArr = new long[size];
                for (int i10 = 0; i10 < size; i10++) {
                    jArr[i10] = (long) readableArrayAsArray.getDouble(i10);
                }
                return jArr;
            }

            @Override // expo.modules.kotlin.types.NonNullableTypeConverter, expo.modules.kotlin.types.TypeConverter
            /* JADX INFO: renamed from: getCppRequiredTypes, reason: from getter */
            public ExpectedType get$cppRequireType() {
                return expectedTypeForPrimitiveArray2;
            }
        });
        C7.d dVarB3 = D.b(double[].class);
        final ExpectedType expectedTypeForPrimitiveArray3 = companion.forPrimitiveArray(CppType.DOUBLE);
        Pair pairA3 = t.a(dVarB3, new DynamicAwareTypeConverters<double[]>() { // from class: expo.modules.kotlin.types.TypeConverterProviderImpl$createCachedPrimitiveArrayConverters$$inlined$createTrivialTypeConverter$3
            @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
            public double[] convertFromAny(Object value, AppContext context, boolean forceConversion) {
                AbstractC2855l.g(value, "value");
                return (double[]) value;
            }

            @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
            public double[] convertFromDynamic(Dynamic value, AppContext context, boolean forceConversion) throws DynamicCastException {
                AbstractC2855l.g(value, "value");
                ReadableArray readableArrayAsArray = value.asArray();
                if (readableArrayAsArray == null) {
                    throw new DynamicCastException(D.b(ReadableArray.class));
                }
                int size = readableArrayAsArray.size();
                double[] dArr = new double[size];
                for (int i10 = 0; i10 < size; i10++) {
                    dArr[i10] = readableArrayAsArray.getDouble(i10);
                }
                return dArr;
            }

            @Override // expo.modules.kotlin.types.NonNullableTypeConverter, expo.modules.kotlin.types.TypeConverter
            /* JADX INFO: renamed from: getCppRequiredTypes, reason: from getter */
            public ExpectedType get$cppRequireType() {
                return expectedTypeForPrimitiveArray3;
            }
        });
        C7.d dVarB4 = D.b(float[].class);
        final ExpectedType expectedTypeForPrimitiveArray4 = companion.forPrimitiveArray(CppType.FLOAT);
        Pair pairA4 = t.a(dVarB4, new DynamicAwareTypeConverters<float[]>() { // from class: expo.modules.kotlin.types.TypeConverterProviderImpl$createCachedPrimitiveArrayConverters$$inlined$createTrivialTypeConverter$4
            @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
            public float[] convertFromAny(Object value, AppContext context, boolean forceConversion) {
                AbstractC2855l.g(value, "value");
                return (float[]) value;
            }

            @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
            public float[] convertFromDynamic(Dynamic value, AppContext context, boolean forceConversion) throws DynamicCastException {
                AbstractC2855l.g(value, "value");
                ReadableArray readableArrayAsArray = value.asArray();
                if (readableArrayAsArray == null) {
                    throw new DynamicCastException(D.b(ReadableArray.class));
                }
                int size = readableArrayAsArray.size();
                float[] fArr = new float[size];
                for (int i10 = 0; i10 < size; i10++) {
                    fArr[i10] = (float) readableArrayAsArray.getDouble(i10);
                }
                return fArr;
            }

            @Override // expo.modules.kotlin.types.NonNullableTypeConverter, expo.modules.kotlin.types.TypeConverter
            /* JADX INFO: renamed from: getCppRequiredTypes, reason: from getter */
            public ExpectedType get$cppRequireType() {
                return expectedTypeForPrimitiveArray4;
            }
        });
        C7.d dVarB5 = D.b(boolean[].class);
        final ExpectedType expectedTypeForPrimitiveArray5 = companion.forPrimitiveArray(CppType.BOOLEAN);
        return K.l(pairA, pairA2, pairA3, pairA4, t.a(dVarB5, new DynamicAwareTypeConverters<boolean[]>() { // from class: expo.modules.kotlin.types.TypeConverterProviderImpl$createCachedPrimitiveArrayConverters$$inlined$createTrivialTypeConverter$5
            @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
            public boolean[] convertFromAny(Object value, AppContext context, boolean forceConversion) {
                AbstractC2855l.g(value, "value");
                return (boolean[]) value;
            }

            @Override // expo.modules.kotlin.types.DynamicAwareTypeConverters
            public boolean[] convertFromDynamic(Dynamic value, AppContext context, boolean forceConversion) throws DynamicCastException {
                AbstractC2855l.g(value, "value");
                ReadableArray readableArrayAsArray = value.asArray();
                if (readableArrayAsArray == null) {
                    throw new DynamicCastException(D.b(ReadableArray.class));
                }
                int size = readableArrayAsArray.size();
                boolean[] zArr = new boolean[size];
                for (int i10 = 0; i10 < size; i10++) {
                    zArr[i10] = readableArrayAsArray.getBoolean(i10);
                }
                return zArr;
            }

            @Override // expo.modules.kotlin.types.NonNullableTypeConverter, expo.modules.kotlin.types.TypeConverter
            /* JADX INFO: renamed from: getCppRequiredTypes, reason: from getter */
            public ExpectedType get$cppRequireType() {
                return expectedTypeForPrimitiveArray5;
            }
        }));
    }

    private final TypeConverter<?> getCachedConverter(C7.o inputType) {
        return cachedConverters.get(inputType.getClassifier());
    }

    private final TypeConverter<?> getCachedPrimitiveArrayConverter(C7.o inputType) {
        return cachedPrimitiveArrayConverters.get(inputType.getClassifier());
    }

    private final TypeConverter<?> handelEither(C7.o type, Class<?> jClass) {
        if (Either.class.isAssignableFrom(jClass)) {
            return EitherOfFour.class.isAssignableFrom(jClass) ? new EitherOfFourTypeConverter(this, type) : EitherOfThree.class.isAssignableFrom(jClass) ? new EitherOfThreeTypeConverter(this, type) : new EitherTypeConverter(this, type);
        }
        return null;
    }

    public final TypeConverter<?> obtainNonNullableTypeConverter(C7.o type) throws MissingTypeConverter {
        AbstractC2855l.g(type, "type");
        TypeConverter<?> cachedConverter = getCachedConverter(type);
        if (cachedConverter != null) {
            return cachedConverter;
        }
        C7.e classifier = type.getClassifier();
        C7.d dVar = classifier instanceof C7.d ? (C7.d) classifier : null;
        if (dVar == null) {
            throw new MissingTypeConverter(type);
        }
        Class<?> clsB = AbstractC3430a.b(dVar);
        if (clsB.isArray() || Object[].class.isAssignableFrom(clsB)) {
            if (!ArrayTypeConverterKt.isPrimitiveArray(type, clsB)) {
                return new ArrayTypeConverter(this, type);
            }
            TypeConverter<?> cachedPrimitiveArrayConverter = getCachedPrimitiveArrayConverter(type);
            if (cachedPrimitiveArrayConverter != null) {
                return cachedPrimitiveArrayConverter;
            }
            throw new MissingTypeConverter(type);
        }
        if (List.class.isAssignableFrom(clsB)) {
            return new ListTypeConverter(this, type);
        }
        if (Map.class.isAssignableFrom(clsB)) {
            return new MapTypeConverter(this, type);
        }
        if (Pair.class.isAssignableFrom(clsB)) {
            return new PairTypeConverter(this, type);
        }
        if (Set.class.isAssignableFrom(clsB)) {
            return new SetTypeConverter(this, type);
        }
        if (clsB.isEnum()) {
            return new EnumTypeConverter(dVar);
        }
        Map<C7.o, TypeConverter<?>> map = cachedRecordConverters;
        TypeConverter<?> typeConverter = map.get(type);
        if (typeConverter != null) {
            return typeConverter;
        }
        if (Record.class.isAssignableFrom(clsB)) {
            RecordTypeConverter recordTypeConverter = new RecordTypeConverter(this, type);
            map.put(type, recordTypeConverter);
            return recordTypeConverter;
        }
        if (View.class.isAssignableFrom(clsB)) {
            return new ViewTypeConverter(type);
        }
        if (SharedRef.class.isAssignableFrom(clsB)) {
            return new SharedRefTypeConverter(type);
        }
        if (SharedObject.class.isAssignableFrom(clsB)) {
            return new SharedObjectTypeConverter(type);
        }
        if (JavaScriptFunction.class.isAssignableFrom(clsB)) {
            return new JavaScriptFunctionTypeConverter(type);
        }
        if (ValueOrUndefined.class.isAssignableFrom(clsB)) {
            return new ValueOrUndefinedTypeConverter(this, type);
        }
        TypeConverter<?> typeConverterHandelEither = handelEither(type, clsB);
        if (typeConverterHandelEither != null) {
            return typeConverterHandelEither;
        }
        throw new MissingTypeConverter(type);
    }

    @Override // expo.modules.kotlin.types.TypeConverterProvider
    public TypeConverter<?> obtainTypeConverter(C7.o type) {
        AbstractC2855l.g(type, "type");
        TypeConverter<?> typeConverterObtainNonNullableTypeConverter = obtainNonNullableTypeConverter(type);
        return type.getIsMarkedNullable() ? new NullableTypeConverter(typeConverterObtainNonNullableTypeConverter) : typeConverterObtainNonNullableTypeConverter;
    }
}
