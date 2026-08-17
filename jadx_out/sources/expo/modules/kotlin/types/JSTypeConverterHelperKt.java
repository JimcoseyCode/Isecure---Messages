package expo.modules.kotlin.types;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.records.Field;
import expo.modules.kotlin.records.Record;
import expo.modules.kotlin.records.formatters.FormattedRecord;
import expo.modules.kotlin.records.formatters.ValueOrSkip;
import expo.modules.kotlin.types.JSTypeConverterProvider;
import i7.C2735B;
import i7.C2750m;
import i7.t;
import j7.AbstractC2800q;
import j7.K;
import java.io.File;
import java.lang.annotation.Annotation;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import v7.AbstractC3430a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0013\n\u0000\n\u0002\u0010\u0018\n\u0000\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\u0004\u0010\u0007\u001a\u0019\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\r¢\u0006\u0004\b\u0004\u0010\u000e\u001a\u0019\u0010\u000b\u001a\u00020\n*\u00020\r2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\u000f\u001a7\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001\"\u0004\b\u0000\u0010\u0010\"\u0004\b\u0001\u0010\u0011*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0012\u001a1\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u0010\"\u0004\b\u0001\u0010\u0011*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\u0013\u001a%\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0015\"\u0004\b\u0000\u0010\u0014*\b\u0012\u0004\u0012\u00028\u00000\u0015¢\u0006\u0004\b\u0004\u0010\u0016\u001a%\u0010\u000b\u001a\u00020\u0017\"\u0004\b\u0000\u0010\u0014*\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\u0018\u001a%\u0010\u000b\u001a\u00020\u0017\"\u0004\b\u0000\u0010\u0014*\b\u0012\u0004\u0012\u00028\u00000\u00192\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\u001a\u001a\u0019\u0010\u000b\u001a\u00020\u0017*\u00020\u001b2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\u001c\u001a\u0019\u0010\u000b\u001a\u00020\u0017*\u00020\u001d2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\u001e\u001a\u0019\u0010\u000b\u001a\u00020\u0017*\u00020\u001f2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010 \u001a\u0019\u0010\u000b\u001a\u00020\u0017*\u00020!2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\"\u001a\u0019\u0010\u000b\u001a\u00020\u0017*\u00020#2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010$\u001a\u0017\u0010\u000b\u001a\u0004\u0018\u00010\u0003*\u0006\u0012\u0002\b\u00030%¢\u0006\u0004\b\u000b\u0010&\u001a\u0011\u0010\u000b\u001a\u00020\u0002*\u00020'¢\u0006\u0004\b\u000b\u0010(\u001a\u0011\u0010\u000b\u001a\u00020\u0002*\u00020)¢\u0006\u0004\b\u000b\u0010*\u001a\u0011\u0010\u000b\u001a\u00020\u0002*\u00020+¢\u0006\u0004\b\u000b\u0010,\u001a\u0011\u0010\u000b\u001a\u00020\u0002*\u00020-¢\u0006\u0004\b\u000b\u0010.\u001a!\u0010\u000b\u001a\u00020\u0017*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030/2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u00100\u001a%\u00104\u001a\u000203*\u00020\n2\u0006\u00101\u001a\u00020\u00022\b\u00102\u001a\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0004\b4\u00105\u001a\u001d\u00104\u001a\u000203*\u00020\u00172\b\u00102\u001a\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0004\b4\u00106¨\u00067"}, d2 = {"Lexpo/modules/kotlin/records/Record;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "toJSValueExperimental", "(Lexpo/modules/kotlin/records/Record;)Ljava/util/Map;", "Lexpo/modules/kotlin/records/formatters/FormattedRecord;", "(Lexpo/modules/kotlin/records/formatters/FormattedRecord;)Ljava/util/Map;", "Lexpo/modules/kotlin/types/JSTypeConverterProvider$ContainerProvider;", "containerProvider", "Lcom/facebook/react/bridge/WritableMap;", "toJSValue", "(Lexpo/modules/kotlin/records/Record;Lexpo/modules/kotlin/types/JSTypeConverterProvider$ContainerProvider;)Lcom/facebook/react/bridge/WritableMap;", "Landroid/os/Bundle;", "(Landroid/os/Bundle;)Ljava/util/Map;", "(Landroid/os/Bundle;Lexpo/modules/kotlin/types/JSTypeConverterProvider$ContainerProvider;)Lcom/facebook/react/bridge/WritableMap;", "K", "V", "(Ljava/util/Map;)Ljava/util/Map;", "(Ljava/util/Map;Lexpo/modules/kotlin/types/JSTypeConverterProvider$ContainerProvider;)Lcom/facebook/react/bridge/WritableMap;", "T", PointerEventHelper.POINTER_TYPE_UNKNOWN, "(Ljava/util/Collection;)Ljava/util/Collection;", "Lcom/facebook/react/bridge/WritableArray;", "(Ljava/util/Collection;Lexpo/modules/kotlin/types/JSTypeConverterProvider$ContainerProvider;)Lcom/facebook/react/bridge/WritableArray;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "([Ljava/lang/Object;Lexpo/modules/kotlin/types/JSTypeConverterProvider$ContainerProvider;)Lcom/facebook/react/bridge/WritableArray;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "([ILexpo/modules/kotlin/types/JSTypeConverterProvider$ContainerProvider;)Lcom/facebook/react/bridge/WritableArray;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "([JLexpo/modules/kotlin/types/JSTypeConverterProvider$ContainerProvider;)Lcom/facebook/react/bridge/WritableArray;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "([FLexpo/modules/kotlin/types/JSTypeConverterProvider$ContainerProvider;)Lcom/facebook/react/bridge/WritableArray;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "([DLexpo/modules/kotlin/types/JSTypeConverterProvider$ContainerProvider;)Lcom/facebook/react/bridge/WritableArray;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "([ZLexpo/modules/kotlin/types/JSTypeConverterProvider$ContainerProvider;)Lcom/facebook/react/bridge/WritableArray;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "(Ljava/lang/Enum;)Ljava/lang/Object;", "Ljava/net/URL;", "(Ljava/net/URL;)Ljava/lang/String;", "Landroid/net/Uri;", "(Landroid/net/Uri;)Ljava/lang/String;", "Ljava/net/URI;", "(Ljava/net/URI;)Ljava/lang/String;", "Ljava/io/File;", "(Ljava/io/File;)Ljava/lang/String;", "Lkotlin/Pair;", "(Lkotlin/Pair;Lexpo/modules/kotlin/types/JSTypeConverterProvider$ContainerProvider;)Lcom/facebook/react/bridge/WritableArray;", "key", "value", "Li7/B;", "putGeneric", "(Lcom/facebook/react/bridge/WritableMap;Ljava/lang/String;Ljava/lang/Object;)V", "(Lcom/facebook/react/bridge/WritableArray;Ljava/lang/Object;)V", "expo-modules-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class JSTypeConverterHelperKt {
    public static final void putGeneric(WritableMap writableMap, String key, Object obj) {
        AbstractC2855l.g(writableMap, "<this>");
        AbstractC2855l.g(key, "key");
        if (obj == null || (obj instanceof C2735B)) {
            writableMap.putNull(key);
            return;
        }
        if (obj instanceof ReadableArray) {
            writableMap.putArray(key, (ReadableArray) obj);
            return;
        }
        if (obj instanceof ReadableMap) {
            writableMap.putMap(key, (ReadableMap) obj);
            return;
        }
        if (obj instanceof String) {
            writableMap.putString(key, (String) obj);
            return;
        }
        if (obj instanceof Integer) {
            writableMap.putInt(key, ((Number) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            writableMap.putLong(key, ((Number) obj).longValue());
            return;
        }
        if (obj instanceof Number) {
            writableMap.putDouble(key, ((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof Boolean) {
            writableMap.putBoolean(key, ((Boolean) obj).booleanValue());
            return;
        }
        throw new IllegalArgumentException("Could not put '" + obj.getClass() + "' to WritableMap");
    }

    public static final WritableMap toJSValue(Record record, JSTypeConverterProvider.ContainerProvider containerProvider) {
        Object next;
        AbstractC2855l.g(record, "<this>");
        AbstractC2855l.g(containerProvider, "containerProvider");
        WritableMap writableMapCreateMap = containerProvider.createMap();
        Collection<C7.m> collectionB = D7.c.b(AbstractC3430a.e(record.getClass()));
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(collectionB, 10));
        for (C7.m mVar : collectionB) {
            Iterator it = mVar.getAnnotations().iterator();
            while (true) {
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
                String strKey = field.key();
                String name = AbstractC2855l.b(strKey, PointerEventHelper.POINTER_TYPE_UNKNOWN) ? null : strKey;
                if (name == null) {
                    name = mVar.getName();
                }
                E7.a.b(mVar, true);
                putGeneric(writableMapCreateMap, name, JSTypeConverterProvider.INSTANCE.legacyConvertToJSValue(mVar.get(record), containerProvider));
            }
            arrayList.add(C2735B.f28704a);
        }
        return writableMapCreateMap;
    }

    public static final Map<String, Object> toJSValueExperimental(Record record) {
        Object next;
        AbstractC2855l.g(record, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Collection<C7.m> collectionB = D7.c.b(AbstractC3430a.e(record.getClass()));
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(collectionB, 10));
        for (C7.m mVar : collectionB) {
            Iterator it = mVar.getAnnotations().iterator();
            while (true) {
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
                String strKey = field.key();
                String name = AbstractC2855l.b(strKey, PointerEventHelper.POINTER_TYPE_UNKNOWN) ? null : strKey;
                if (name == null) {
                    name = mVar.getName();
                }
                E7.a.b(mVar, true);
                linkedHashMap.put(name, JSTypeConverterProvider.convertToJSValue$default(JSTypeConverterProvider.INSTANCE, mVar.get(record), null, true, 2, null));
            }
            arrayList.add(C2735B.f28704a);
        }
        return linkedHashMap;
    }

    public static final void putGeneric(WritableArray writableArray, Object obj) {
        AbstractC2855l.g(writableArray, "<this>");
        if (obj != null && !(obj instanceof C2735B)) {
            if (obj instanceof ReadableArray) {
                writableArray.pushArray((ReadableArray) obj);
                return;
            }
            if (obj instanceof ReadableMap) {
                writableArray.pushMap((ReadableMap) obj);
                return;
            }
            if (obj instanceof String) {
                writableArray.pushString((String) obj);
                return;
            }
            if (obj instanceof Integer) {
                writableArray.pushInt(((Number) obj).intValue());
                return;
            }
            if (obj instanceof Long) {
                writableArray.pushLong(((Number) obj).longValue());
                return;
            }
            if (obj instanceof Number) {
                writableArray.pushDouble(((Number) obj).doubleValue());
                return;
            }
            if (obj instanceof Boolean) {
                writableArray.pushBoolean(((Boolean) obj).booleanValue());
                return;
            }
            throw new IllegalArgumentException("Could not put '" + obj.getClass() + "' to WritableArray");
        }
        writableArray.pushNull();
    }

    public static final WritableMap toJSValue(Bundle bundle, JSTypeConverterProvider.ContainerProvider containerProvider) {
        AbstractC2855l.g(bundle, "<this>");
        AbstractC2855l.g(containerProvider, "containerProvider");
        WritableMap writableMapCreateMap = containerProvider.createMap();
        for (String str : bundle.keySet()) {
            Object objLegacyConvertToJSValue = JSTypeConverterProvider.INSTANCE.legacyConvertToJSValue(bundle.get(str), containerProvider);
            AbstractC2855l.d(str);
            putGeneric(writableMapCreateMap, str, objLegacyConvertToJSValue);
        }
        return writableMapCreateMap;
    }

    public static final Map<String, Object> toJSValueExperimental(FormattedRecord<?> formattedRecord) {
        Object next;
        Object objInvoke;
        AbstractC2855l.g(formattedRecord, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Collection<C7.m> collectionB = D7.c.b(AbstractC3430a.e(formattedRecord.getRecord$expo_modules_core_release().getClass()));
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(collectionB, 10));
        for (C7.m mVar : collectionB) {
            Iterator it = mVar.getAnnotations().iterator();
            while (true) {
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
                String strKey = field.key();
                String name = AbstractC2855l.b(strKey, PointerEventHelper.POINTER_TYPE_UNKNOWN) ? null : strKey;
                if (name == null) {
                    name = mVar.getName();
                }
                E7.a.b(mVar, true);
                Function2 action$expo_modules_core_release = formattedRecord.getFormatter$expo_modules_core_release().getAction$expo_modules_core_release(mVar);
                Object value = mVar.get(formattedRecord.getRecord$expo_modules_core_release());
                if (action$expo_modules_core_release != null && (objInvoke = action$expo_modules_core_release.invoke(formattedRecord.getRecord$expo_modules_core_release(), value)) != null) {
                    value = objInvoke;
                }
                if (value instanceof ValueOrSkip) {
                    ValueOrSkip valueOrSkip = (ValueOrSkip) value;
                    if (!(valueOrSkip instanceof ValueOrSkip.Value)) {
                        if (!AbstractC2855l.b(valueOrSkip, ValueOrSkip.Skip.INSTANCE)) {
                            throw new C2750m();
                        }
                    } else {
                        value = ((ValueOrSkip.Value) value).getValue();
                        linkedHashMap.put(name, JSTypeConverterProvider.convertToJSValue$default(JSTypeConverterProvider.INSTANCE, value, null, true, 2, null));
                    }
                } else {
                    linkedHashMap.put(name, JSTypeConverterProvider.convertToJSValue$default(JSTypeConverterProvider.INSTANCE, value, null, true, 2, null));
                }
            }
            arrayList.add(C2735B.f28704a);
        }
        return linkedHashMap;
    }

    public static final <K, V> WritableMap toJSValue(Map<K, ? extends V> map, JSTypeConverterProvider.ContainerProvider containerProvider) {
        AbstractC2855l.g(map, "<this>");
        AbstractC2855l.g(containerProvider, "containerProvider");
        WritableMap writableMapCreateMap = containerProvider.createMap();
        for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
            K key = entry.getKey();
            putGeneric(writableMapCreateMap, String.valueOf(key), JSTypeConverterProvider.INSTANCE.legacyConvertToJSValue(entry.getValue(), containerProvider));
        }
        return writableMapCreateMap;
    }

    public static final <T> WritableArray toJSValue(Collection<? extends T> collection, JSTypeConverterProvider.ContainerProvider containerProvider) {
        AbstractC2855l.g(collection, "<this>");
        AbstractC2855l.g(containerProvider, "containerProvider");
        WritableArray writableArrayCreateArray = containerProvider.createArray();
        Iterator<? extends T> it = collection.iterator();
        while (it.hasNext()) {
            putGeneric(writableArrayCreateArray, JSTypeConverterProvider.INSTANCE.legacyConvertToJSValue(it.next(), containerProvider));
        }
        return writableArrayCreateArray;
    }

    public static final <T> WritableArray toJSValue(T[] tArr, JSTypeConverterProvider.ContainerProvider containerProvider) {
        AbstractC2855l.g(tArr, "<this>");
        AbstractC2855l.g(containerProvider, "containerProvider");
        WritableArray writableArrayCreateArray = containerProvider.createArray();
        for (T t10 : tArr) {
            putGeneric(writableArrayCreateArray, JSTypeConverterProvider.INSTANCE.legacyConvertToJSValue(t10, containerProvider));
        }
        return writableArrayCreateArray;
    }

    public static final WritableArray toJSValue(int[] iArr, JSTypeConverterProvider.ContainerProvider containerProvider) {
        AbstractC2855l.g(iArr, "<this>");
        AbstractC2855l.g(containerProvider, "containerProvider");
        WritableArray writableArrayCreateArray = containerProvider.createArray();
        for (int i10 : iArr) {
            writableArrayCreateArray.pushInt(i10);
        }
        return writableArrayCreateArray;
    }

    public static final WritableArray toJSValue(long[] jArr, JSTypeConverterProvider.ContainerProvider containerProvider) {
        AbstractC2855l.g(jArr, "<this>");
        AbstractC2855l.g(containerProvider, "containerProvider");
        WritableArray writableArrayCreateArray = containerProvider.createArray();
        for (long j10 : jArr) {
            writableArrayCreateArray.pushLong(j10);
        }
        return writableArrayCreateArray;
    }

    public static final WritableArray toJSValue(float[] fArr, JSTypeConverterProvider.ContainerProvider containerProvider) {
        AbstractC2855l.g(fArr, "<this>");
        AbstractC2855l.g(containerProvider, "containerProvider");
        WritableArray writableArrayCreateArray = containerProvider.createArray();
        for (float f10 : fArr) {
            writableArrayCreateArray.pushDouble(f10);
        }
        return writableArrayCreateArray;
    }

    public static final Map<String, Object> toJSValueExperimental(Bundle bundle) {
        AbstractC2855l.g(bundle, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : bundle.keySet()) {
            linkedHashMap.put(str, JSTypeConverterProvider.convertToJSValue$default(JSTypeConverterProvider.INSTANCE, bundle.get(str), null, true, 2, null));
        }
        return linkedHashMap;
    }

    public static final WritableArray toJSValue(double[] dArr, JSTypeConverterProvider.ContainerProvider containerProvider) {
        AbstractC2855l.g(dArr, "<this>");
        AbstractC2855l.g(containerProvider, "containerProvider");
        WritableArray writableArrayCreateArray = containerProvider.createArray();
        for (double d10 : dArr) {
            writableArrayCreateArray.pushDouble(d10);
        }
        return writableArrayCreateArray;
    }

    public static final WritableArray toJSValue(boolean[] zArr, JSTypeConverterProvider.ContainerProvider containerProvider) {
        AbstractC2855l.g(zArr, "<this>");
        AbstractC2855l.g(containerProvider, "containerProvider");
        WritableArray writableArrayCreateArray = containerProvider.createArray();
        for (boolean z10 : zArr) {
            writableArrayCreateArray.pushBoolean(z10);
        }
        return writableArrayCreateArray;
    }

    public static final <K, V> Map<String, Object> toJSValueExperimental(Map<K, ? extends V> map) {
        AbstractC2855l.g(map, "<this>");
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
            arrayList.add(t.a(String.valueOf(entry.getKey()), JSTypeConverterProvider.convertToJSValue$default(JSTypeConverterProvider.INSTANCE, entry.getValue(), null, true, 2, null)));
        }
        return K.r(arrayList);
    }

    public static final Object toJSValue(Enum<?> r42) {
        Object next;
        AbstractC2855l.g(r42, "<this>");
        C7.g gVarC = D7.c.c(D.b(r42.getClass()));
        if (gVarC != null) {
            if (gVarC.getParameters().isEmpty()) {
                return r42.name();
            }
            if (gVarC.getParameters().size() == 1) {
                String name = ((C7.j) AbstractC2800q.e0(gVarC.getParameters())).getName();
                AbstractC2855l.d(name);
                Iterator it = D7.c.a(D.b(r42.getClass())).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (AbstractC2855l.b(((C7.m) next).getName(), name)) {
                        break;
                    }
                }
                AbstractC2855l.e(next, "null cannot be cast to non-null type kotlin.reflect.KProperty1<kotlin.Enum<*>, *>");
                return ((C7.m) next).get(r42);
            }
            throw new IllegalStateException("Enum '" + r42.getClass() + "' cannot be used as return type (incompatible with JS)");
        }
        throw new IllegalArgumentException("Cannot convert enum without the primary constructor to js value");
    }

    public static final <T> Collection<Object> toJSValueExperimental(Collection<? extends T> collection) {
        AbstractC2855l.g(collection, "<this>");
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(JSTypeConverterProvider.convertToJSValue$default(JSTypeConverterProvider.INSTANCE, it.next(), null, true, 2, null));
        }
        return arrayList;
    }

    public static final String toJSValue(URL url) {
        AbstractC2855l.g(url, "<this>");
        String string = url.toString();
        AbstractC2855l.f(string, "toString(...)");
        return string;
    }

    public static final String toJSValue(Uri uri) {
        AbstractC2855l.g(uri, "<this>");
        String string = uri.toString();
        AbstractC2855l.f(string, "toString(...)");
        return string;
    }

    public static final String toJSValue(URI uri) {
        AbstractC2855l.g(uri, "<this>");
        String string = uri.toString();
        AbstractC2855l.f(string, "toString(...)");
        return string;
    }

    public static final String toJSValue(File file) {
        AbstractC2855l.g(file, "<this>");
        String absolutePath = file.getAbsolutePath();
        AbstractC2855l.f(absolutePath, "getAbsolutePath(...)");
        return absolutePath;
    }

    public static final WritableArray toJSValue(Pair<?, ?> pair, JSTypeConverterProvider.ContainerProvider containerProvider) {
        AbstractC2855l.g(pair, "<this>");
        AbstractC2855l.g(containerProvider, "containerProvider");
        WritableArray writableArrayCreateArray = containerProvider.createArray();
        JSTypeConverterProvider jSTypeConverterProvider = JSTypeConverterProvider.INSTANCE;
        Object objLegacyConvertToJSValue = jSTypeConverterProvider.legacyConvertToJSValue(pair.c(), containerProvider);
        Object objLegacyConvertToJSValue2 = jSTypeConverterProvider.legacyConvertToJSValue(pair.d(), containerProvider);
        putGeneric(writableArrayCreateArray, objLegacyConvertToJSValue);
        putGeneric(writableArrayCreateArray, objLegacyConvertToJSValue2);
        return writableArrayCreateArray;
    }
}
