package expo.modules.kotlin.jni;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.jni.worklets.Worklet;
import expo.modules.kotlin.typedarray.TypedArray;
import expo.modules.kotlin.types.ValueOrUndefined;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p7.AbstractC3083a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b$\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001f\b\u0002\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'¨\u0006("}, d2 = {"Lexpo/modules/kotlin/jni/CppType;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "LC7/d;", "clazz", PointerEventHelper.POINTER_TYPE_UNKNOWN, "value", "<init>", "(Ljava/lang/String;ILC7/d;I)V", "LC7/d;", "getClazz", "()LC7/d;", "I", "getValue", "()I", "NONE", "DOUBLE", "INT", "LONG", "FLOAT", "BOOLEAN", "STRING", "JS_OBJECT", "JS_VALUE", "READABLE_ARRAY", "READABLE_MAP", "UINT8_TYPED_ARRAY", "TYPED_ARRAY", "PRIMITIVE_ARRAY", "ARRAY", "LIST", "MAP", "VIEW_TAG", "SHARED_OBJECT_ID", "JS_FUNCTION", "ANY", "NULLABLE", "VALUE_OR_UNDEFINED", "JS_ARRAY_BUFFER", "NATIVE_ARRAY_BUFFER", "SERIALIZABLE", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CppType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CppType[] $VALUES;
    public static final CppType ANY;
    public static final CppType ARRAY;
    public static final CppType BOOLEAN;
    public static final CppType FLOAT;
    public static final CppType INT;
    public static final CppType JS_ARRAY_BUFFER;
    public static final CppType JS_FUNCTION;
    public static final CppType JS_OBJECT;
    public static final CppType JS_VALUE;
    public static final CppType LIST;
    public static final CppType LONG;
    public static final CppType MAP;
    public static final CppType NATIVE_ARRAY_BUFFER;
    public static final CppType NULLABLE;
    public static final CppType PRIMITIVE_ARRAY;
    public static final CppType READABLE_ARRAY;
    public static final CppType READABLE_MAP;
    public static final CppType SERIALIZABLE;
    public static final CppType SHARED_OBJECT_ID;
    public static final CppType STRING;
    public static final CppType TYPED_ARRAY;
    public static final CppType UINT8_TYPED_ARRAY;
    public static final CppType VALUE_OR_UNDEFINED;
    public static final CppType VIEW_TAG;
    private final C7.d clazz;
    private final int value;
    public static final CppType NONE = new CppType("NONE", 0, D.b(Void.class), 0);
    public static final CppType DOUBLE = new CppType("DOUBLE", 1, D.b(Double.TYPE), 0, 2, null);

    private static final /* synthetic */ CppType[] $values() {
        return new CppType[]{NONE, DOUBLE, INT, LONG, FLOAT, BOOLEAN, STRING, JS_OBJECT, JS_VALUE, READABLE_ARRAY, READABLE_MAP, UINT8_TYPED_ARRAY, TYPED_ARRAY, PRIMITIVE_ARRAY, ARRAY, LIST, MAP, VIEW_TAG, SHARED_OBJECT_ID, JS_FUNCTION, ANY, NULLABLE, VALUE_OR_UNDEFINED, JS_ARRAY_BUFFER, NATIVE_ARRAY_BUFFER, SERIALIZABLE};
    }

    static {
        Class cls = Integer.TYPE;
        INT = new CppType("INT", 2, D.b(cls), 0, 2, null);
        LONG = new CppType("LONG", 3, D.b(Long.TYPE), 0, 2, null);
        FLOAT = new CppType("FLOAT", 4, D.b(Float.TYPE), 0, 2, null);
        DefaultConstructorMarker defaultConstructorMarker = null;
        BOOLEAN = new CppType("BOOLEAN", 5, D.b(Boolean.TYPE), 0, 2, defaultConstructorMarker);
        STRING = new CppType("STRING", 6, D.b(String.class), 0, 2, null);
        JS_OBJECT = new CppType("JS_OBJECT", 7, D.b(JavaScriptObject.class), 0, 2, null);
        JS_VALUE = new CppType("JS_VALUE", 8, D.b(JavaScriptValue.class), 0, 2, null);
        READABLE_ARRAY = new CppType("READABLE_ARRAY", 9, D.b(ReadableArray.class), 0, 2, null);
        READABLE_MAP = new CppType("READABLE_MAP", 10, D.b(ReadableMap.class), 0, 2, null);
        UINT8_TYPED_ARRAY = new CppType("UINT8_TYPED_ARRAY", 11, D.b(byte[].class), 0, 2, null);
        TYPED_ARRAY = new CppType("TYPED_ARRAY", 12, D.b(TypedArray.class), 0, 2, null);
        PRIMITIVE_ARRAY = new CppType("PRIMITIVE_ARRAY", 13, D.b(Object[].class), 0, 2, defaultConstructorMarker);
        ARRAY = new CppType("ARRAY", 14, D.b(Object[].class), 0, 2, null);
        LIST = new CppType("LIST", 15, D.b(List.class), 0, 2, null);
        MAP = new CppType("MAP", 16, D.b(Map.class), 0, 2, null);
        VIEW_TAG = new CppType("VIEW_TAG", 17, D.b(cls), 0, 2, null);
        SHARED_OBJECT_ID = new CppType("SHARED_OBJECT_ID", 18, D.b(cls), 0, 2, null);
        JS_FUNCTION = new CppType("JS_FUNCTION", 19, D.b(JavaScriptFunction.class), 0, 2, null);
        ANY = new CppType("ANY", 20, D.b(Object.class), 0, 2, null);
        NULLABLE = new CppType("NULLABLE", 21, D.b(Object.class), 0, 2, null);
        VALUE_OR_UNDEFINED = new CppType("VALUE_OR_UNDEFINED", 22, D.b(ValueOrUndefined.class), 0, 2, null);
        JS_ARRAY_BUFFER = new CppType("JS_ARRAY_BUFFER", 23, D.b(JavaScriptArrayBuffer.class), 0, 2, null);
        NATIVE_ARRAY_BUFFER = new CppType("NATIVE_ARRAY_BUFFER", 24, D.b(NativeArrayBuffer.class), 0, 2, null);
        SERIALIZABLE = new CppType("SERIALIZABLE", 25, D.b(Worklet.class), 0, 2, null);
        CppType[] cppTypeArr$values = $values();
        $VALUES = cppTypeArr$values;
        $ENTRIES = AbstractC3083a.a(cppTypeArr$values);
    }

    private CppType(String str, int i10, C7.d dVar, int i11) {
        this.clazz = dVar;
        this.value = i11;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static CppType valueOf(String str) {
        return (CppType) Enum.valueOf(CppType.class, str);
    }

    public static CppType[] values() {
        return (CppType[]) $VALUES.clone();
    }

    public final C7.d getClazz() {
        return this.clazz;
    }

    public final int getValue() {
        return this.value;
    }

    /* synthetic */ CppType(String str, int i10, C7.d dVar, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, dVar, (i12 & 2) != 0 ? CppTypeKt.nextValue() : i11);
    }
}
