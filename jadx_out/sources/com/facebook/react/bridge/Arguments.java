package com.facebook.react.bridge;

import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\n\u001a\u00020\t\"\u0004\b\u0000\u0010\f2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\n\u0010\rJ)\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0016\u001a\u00020\u000e2\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0015H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0004\b\u0016\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010\"\u001a\u00020\t2\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\"\u0010\rJ\u001f\u0010\"\u001a\u00020\t2\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010#H\u0007¢\u0006\u0004\b\"\u0010$J\u0017\u0010&\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u0001H\u0007¢\u0006\u0004\b&\u0010'J\u001b\u0010)\u001a\u00020\u001b2\n\u0010(\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0007¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b+\u0010,J1\u00101\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010/j\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u0001`02\b\u0010.\u001a\u0004\u0018\u00010-H\u0007¢\u0006\u0004\b1\u00102J\u001b\u00105\u001a\u0004\u0018\u00010\u00182\b\u00104\u001a\u0004\u0018\u000103H\u0007¢\u0006\u0004\b5\u00106¨\u00067"}, d2 = {"Lcom/facebook/react/bridge/Arguments;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "value", "makeNativeObject", "(Ljava/lang/Object;)Ljava/lang/Object;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "objects", "Lcom/facebook/react/bridge/WritableNativeArray;", "makeNativeArray", "(Ljava/util/List;)Lcom/facebook/react/bridge/WritableNativeArray;", "T", "(Ljava/lang/Object;)Lcom/facebook/react/bridge/WritableNativeArray;", "Lcom/facebook/react/bridge/WritableNativeMap;", "nativeMap", PointerEventHelper.POINTER_TYPE_UNKNOWN, "key", "Li7/B;", "addEntry", "(Lcom/facebook/react/bridge/WritableNativeMap;Ljava/lang/String;Ljava/lang/Object;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "makeNativeMap", "(Ljava/util/Map;)Lcom/facebook/react/bridge/WritableNativeMap;", "Landroid/os/Bundle;", "bundle", "(Landroid/os/Bundle;)Lcom/facebook/react/bridge/WritableNativeMap;", "Lcom/facebook/react/bridge/WritableArray;", "createArray", "()Lcom/facebook/react/bridge/WritableArray;", "Lcom/facebook/react/bridge/WritableMap;", "createMap", "()Lcom/facebook/react/bridge/WritableMap;", "args", "fromJavaArgs", PointerEventHelper.POINTER_TYPE_UNKNOWN, "([Ljava/lang/Object;)Lcom/facebook/react/bridge/WritableNativeArray;", "array", "fromArray", "(Ljava/lang/Object;)Lcom/facebook/react/bridge/WritableArray;", "list", "fromList", "(Ljava/util/List;)Lcom/facebook/react/bridge/WritableArray;", "fromBundle", "(Landroid/os/Bundle;)Lcom/facebook/react/bridge/WritableMap;", "Lcom/facebook/react/bridge/ReadableArray;", "readableArray", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "toList", "(Lcom/facebook/react/bridge/ReadableArray;)Ljava/util/ArrayList;", "Lcom/facebook/react/bridge/ReadableMap;", "readableMap", "toBundle", "(Lcom/facebook/react/bridge/ReadableMap;)Landroid/os/Bundle;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Arguments {
    public static final Arguments INSTANCE = new Arguments();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReadableType.values().length];
            try {
                iArr[ReadableType.Null.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadableType.Boolean.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReadableType.Number.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ReadableType.String.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ReadableType.Map.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ReadableType.Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private Arguments() {
    }

    private final void addEntry(WritableNativeMap nativeMap, String key, Object value) {
        Object objMakeNativeObject = makeNativeObject(value);
        if (objMakeNativeObject == null) {
            nativeMap.putNull(key);
            return;
        }
        if (objMakeNativeObject instanceof Boolean) {
            nativeMap.putBoolean(key, ((Boolean) objMakeNativeObject).booleanValue());
            return;
        }
        if (objMakeNativeObject instanceof Integer) {
            nativeMap.putInt(key, ((Number) objMakeNativeObject).intValue());
            return;
        }
        if (objMakeNativeObject instanceof Number) {
            nativeMap.putDouble(key, ((Number) objMakeNativeObject).doubleValue());
            return;
        }
        if (objMakeNativeObject instanceof String) {
            nativeMap.putString(key, (String) objMakeNativeObject);
            return;
        }
        if (objMakeNativeObject instanceof WritableNativeArray) {
            nativeMap.putArray(key, (ReadableArray) objMakeNativeObject);
            return;
        }
        if (objMakeNativeObject instanceof WritableNativeMap) {
            nativeMap.putMap(key, (ReadableMap) objMakeNativeObject);
            return;
        }
        throw new IllegalArgumentException("Could not convert " + objMakeNativeObject.getClass());
    }

    public static final WritableArray createArray() {
        return new WritableNativeArray();
    }

    public static final WritableMap createMap() {
        return new WritableNativeMap();
    }

    public static final WritableArray fromArray(Object array) {
        AbstractC2855l.g(array, "array");
        WritableArray writableArrayCreateArray = createArray();
        boolean z10 = array instanceof Object[];
        int i10 = 0;
        if (z10 && (((Object[]) array) instanceof String[])) {
            String[] strArr = (String[]) array;
            int length = strArr.length;
            while (i10 < length) {
                writableArrayCreateArray.pushString(strArr[i10]);
                i10++;
            }
        } else if (z10 && (((Object[]) array) instanceof Bundle[])) {
            Bundle[] bundleArr = (Bundle[]) array;
            int length2 = bundleArr.length;
            while (i10 < length2) {
                writableArrayCreateArray.pushMap(fromBundle(bundleArr[i10]));
                i10++;
            }
        } else if (array instanceof int[]) {
            int[] iArr = (int[]) array;
            int length3 = iArr.length;
            while (i10 < length3) {
                writableArrayCreateArray.pushInt(iArr[i10]);
                i10++;
            }
        } else if (array instanceof float[]) {
            int length4 = ((float[]) array).length;
            while (i10 < length4) {
                writableArrayCreateArray.pushDouble(r5[i10]);
                i10++;
            }
        } else if (array instanceof double[]) {
            double[] dArr = (double[]) array;
            int length5 = dArr.length;
            while (i10 < length5) {
                writableArrayCreateArray.pushDouble(dArr[i10]);
                i10++;
            }
        } else if (array instanceof boolean[]) {
            boolean[] zArr = (boolean[]) array;
            int length6 = zArr.length;
            while (i10 < length6) {
                writableArrayCreateArray.pushBoolean(zArr[i10]);
                i10++;
            }
        } else {
            if (!z10 || !(((Object[]) array) instanceof Parcelable[])) {
                throw new IllegalArgumentException("Unknown array type " + array.getClass());
            }
            Parcelable[] parcelableArr = (Parcelable[]) array;
            int length7 = parcelableArr.length;
            while (i10 < length7) {
                Parcelable parcelable = parcelableArr[i10];
                if (!(parcelable instanceof Bundle)) {
                    throw new IllegalArgumentException("Unexpected array member type " + parcelable.getClass());
                }
                writableArrayCreateArray.pushMap(fromBundle((Bundle) parcelable));
                i10++;
            }
        }
        return writableArrayCreateArray;
    }

    public static final WritableMap fromBundle(Bundle bundle) {
        AbstractC2855l.g(bundle, "bundle");
        WritableMap writableMapCreateMap = createMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj == null) {
                AbstractC2855l.d(str);
                writableMapCreateMap.putNull(str);
            } else if (obj.getClass().isArray()) {
                AbstractC2855l.d(str);
                writableMapCreateMap.putArray(str, fromArray(obj));
            } else if (obj instanceof String) {
                AbstractC2855l.d(str);
                writableMapCreateMap.putString(str, (String) obj);
            } else if (obj instanceof Number) {
                if (obj instanceof Integer) {
                    AbstractC2855l.d(str);
                    writableMapCreateMap.putInt(str, ((Number) obj).intValue());
                } else {
                    AbstractC2855l.d(str);
                    writableMapCreateMap.putDouble(str, ((Number) obj).doubleValue());
                }
            } else if (obj instanceof Boolean) {
                AbstractC2855l.d(str);
                writableMapCreateMap.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Bundle) {
                AbstractC2855l.d(str);
                writableMapCreateMap.putMap(str, fromBundle((Bundle) obj));
            } else {
                if (!(obj instanceof List)) {
                    throw new IllegalArgumentException("Could not convert " + obj.getClass());
                }
                AbstractC2855l.d(str);
                writableMapCreateMap.putArray(str, fromList((List) obj));
            }
        }
        return writableMapCreateMap;
    }

    public static final WritableNativeArray fromJavaArgs(Object args) {
        AbstractC2855l.e(args, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return fromJavaArgs((Object[]) args);
    }

    public static final WritableArray fromList(List<?> list) {
        AbstractC2855l.g(list, "list");
        WritableArray writableArrayCreateArray = createArray();
        for (Object obj : list) {
            if (obj == null) {
                writableArrayCreateArray.pushNull();
            } else if (obj.getClass().isArray()) {
                writableArrayCreateArray.pushArray(fromArray(obj));
            } else if (obj instanceof Bundle) {
                writableArrayCreateArray.pushMap(fromBundle((Bundle) obj));
            } else if (obj instanceof List) {
                writableArrayCreateArray.pushArray(fromList((List) obj));
            } else if (obj instanceof String) {
                writableArrayCreateArray.pushString((String) obj);
            } else if (obj instanceof Integer) {
                writableArrayCreateArray.pushInt(((Number) obj).intValue());
            } else if (obj instanceof Number) {
                writableArrayCreateArray.pushDouble(((Number) obj).doubleValue());
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Unknown value type " + obj.getClass());
                }
                writableArrayCreateArray.pushBoolean(((Boolean) obj).booleanValue());
            }
        }
        return writableArrayCreateArray;
    }

    public static final WritableNativeArray makeNativeArray(List<?> objects) {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        if (objects != null) {
            Iterator<?> it = objects.iterator();
            while (it.hasNext()) {
                Object objMakeNativeObject = INSTANCE.makeNativeObject(it.next());
                if (objMakeNativeObject == null) {
                    writableNativeArray.pushNull();
                } else if (objMakeNativeObject instanceof Boolean) {
                    writableNativeArray.pushBoolean(((Boolean) objMakeNativeObject).booleanValue());
                } else if (objMakeNativeObject instanceof Integer) {
                    writableNativeArray.pushInt(((Number) objMakeNativeObject).intValue());
                } else if (objMakeNativeObject instanceof Double) {
                    writableNativeArray.pushDouble(((Number) objMakeNativeObject).doubleValue());
                } else if (objMakeNativeObject instanceof String) {
                    writableNativeArray.pushString((String) objMakeNativeObject);
                } else if (objMakeNativeObject instanceof WritableNativeArray) {
                    writableNativeArray.pushArray((ReadableArray) objMakeNativeObject);
                } else {
                    if (!(objMakeNativeObject instanceof WritableNativeMap)) {
                        throw new IllegalArgumentException("Could not convert " + objMakeNativeObject.getClass());
                    }
                    writableNativeArray.pushMap((ReadableMap) objMakeNativeObject);
                }
            }
        }
        return writableNativeArray;
    }

    public static final WritableNativeMap makeNativeMap(Map<String, ? extends Object> objects) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (objects != null) {
            for (Map.Entry<String, ? extends Object> entry : objects.entrySet()) {
                INSTANCE.addEntry(writableNativeMap, entry.getKey(), entry.getValue());
            }
        }
        return writableNativeMap;
    }

    private final Object makeNativeObject(Object value) {
        if (value == null) {
            return null;
        }
        return ((value instanceof Float) || (value instanceof Long) || (value instanceof Byte) || (value instanceof Short)) ? Double.valueOf(((Number) value).doubleValue()) : value.getClass().isArray() ? makeNativeArray(value) : value instanceof List ? makeNativeArray((List<?>) value) : value instanceof Map ? makeNativeMap((Map<String, ? extends Object>) value) : value instanceof Bundle ? makeNativeMap((Bundle) value) : value instanceof JavaOnlyMap ? makeNativeMap(((JavaOnlyMap) value).toHashMap()) : value instanceof JavaOnlyArray ? makeNativeArray((List<?>) ((JavaOnlyArray) value).toArrayList()) : value;
    }

    public static final Bundle toBundle(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        Bundle bundle = new Bundle();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            switch (WhenMappings.$EnumSwitchMapping$0[readableMap.getType(strNextKey).ordinal()]) {
                case 1:
                    bundle.putString(strNextKey, null);
                    break;
                case 2:
                    bundle.putBoolean(strNextKey, readableMap.getBoolean(strNextKey));
                    break;
                case 3:
                    bundle.putDouble(strNextKey, readableMap.getDouble(strNextKey));
                    break;
                case 4:
                    bundle.putString(strNextKey, readableMap.getString(strNextKey));
                    break;
                case 5:
                    bundle.putBundle(strNextKey, toBundle(readableMap.getMap(strNextKey)));
                    break;
                case 6:
                    bundle.putSerializable(strNextKey, toList(readableMap.getArray(strNextKey)));
                    break;
                default:
                    throw new IllegalArgumentException("Could not convert object with key: " + strNextKey + ".");
            }
        }
        return bundle;
    }

    public static final ArrayList<Object> toList(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        ArrayList<Object> arrayList = new ArrayList<>();
        int size = readableArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            switch (WhenMappings.$EnumSwitchMapping$0[readableArray.getType(i10).ordinal()]) {
                case 1:
                    arrayList.add(null);
                    break;
                case 2:
                    arrayList.add(Boolean.valueOf(readableArray.getBoolean(i10)));
                    break;
                case 3:
                    double d10 = readableArray.getDouble(i10);
                    if (d10 == Math.rint(d10)) {
                        arrayList.add(Integer.valueOf((int) d10));
                    } else {
                        arrayList.add(Double.valueOf(d10));
                    }
                    break;
                case 4:
                    arrayList.add(readableArray.getString(i10));
                    break;
                case 5:
                    arrayList.add(toBundle(readableArray.getMap(i10)));
                    break;
                case 6:
                    arrayList.add(toList(readableArray.getArray(i10)));
                    break;
                default:
                    throw new IllegalArgumentException("Could not convert object in array.");
            }
        }
        return arrayList;
    }

    public static final WritableNativeArray fromJavaArgs(Object[] args) {
        AbstractC2855l.g(args, "args");
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        int length = args.length;
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = args[i10];
            Class<?> cls = obj != null ? obj.getClass() : null;
            if (cls == null) {
                writableNativeArray.pushNull();
            } else if (AbstractC2855l.b(cls, Boolean.TYPE) || AbstractC2855l.b(cls, Boolean.class)) {
                AbstractC2855l.e(obj, "null cannot be cast to non-null type kotlin.Boolean");
                writableNativeArray.pushBoolean(((Boolean) obj).booleanValue());
            } else if (AbstractC2855l.b(cls, Integer.TYPE) || AbstractC2855l.b(cls, Integer.class)) {
                AbstractC2855l.e(obj, "null cannot be cast to non-null type kotlin.Number");
                writableNativeArray.pushDouble(((Number) obj).doubleValue());
            } else if (AbstractC2855l.b(cls, Double.TYPE) || AbstractC2855l.b(cls, Double.class)) {
                AbstractC2855l.e(obj, "null cannot be cast to non-null type kotlin.Double");
                writableNativeArray.pushDouble(((Double) obj).doubleValue());
            } else if (AbstractC2855l.b(cls, Float.TYPE)) {
                AbstractC2855l.e(obj, "null cannot be cast to non-null type kotlin.Float");
                writableNativeArray.pushDouble(((Float) obj).floatValue());
            } else if (AbstractC2855l.b(cls, Float.class)) {
                AbstractC2855l.e(obj, "null cannot be cast to non-null type kotlin.Float");
                writableNativeArray.pushDouble(((Float) obj).floatValue());
            } else if (AbstractC2855l.b(cls, String.class)) {
                writableNativeArray.pushString(obj.toString());
            } else if (AbstractC2855l.b(cls, WritableNativeMap.class)) {
                AbstractC2855l.e(obj, "null cannot be cast to non-null type com.facebook.react.bridge.WritableNativeMap");
                writableNativeArray.pushMap((WritableNativeMap) obj);
            } else {
                if (!AbstractC2855l.b(cls, WritableNativeArray.class)) {
                    throw new RuntimeException("Cannot convert argument of type " + cls);
                }
                AbstractC2855l.e(obj, "null cannot be cast to non-null type com.facebook.react.bridge.WritableNativeArray");
                writableNativeArray.pushArray((WritableNativeArray) obj);
            }
        }
        return writableNativeArray;
    }

    public static final WritableNativeMap makeNativeMap(Bundle bundle) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Arguments arguments = INSTANCE;
                AbstractC2855l.d(str);
                arguments.addEntry(writableNativeMap, str, bundle.get(str));
            }
        }
        return writableNativeMap;
    }

    public static final <T> WritableNativeArray makeNativeArray(final Object objects) {
        if (objects == null) {
            return new WritableNativeArray();
        }
        return makeNativeArray((List<?>) new AbstractList<Object>() { // from class: com.facebook.react.bridge.Arguments.makeNativeArray.1
            @Override // java.util.AbstractList, java.util.List
            public Object get(int index) {
                return Array.get(objects, index);
            }

            public int getSize() {
                return Array.getLength(objects);
            }

            @Override // java.util.AbstractList, java.util.List
            public final /* bridge */ Object remove(int i10) {
                return removeAt(i10);
            }

            public /* bridge */ Object removeAt(int i10) {
                return super.remove(i10);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final /* bridge */ int size() {
                return getSize();
            }
        });
    }
}
