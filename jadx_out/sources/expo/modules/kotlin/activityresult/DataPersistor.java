package expo.modules.kotlin.activityresult;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import com.facebook.react.uimanager.events.PointerEventHelper;
import i7.AbstractC2746i;
import j7.AbstractC2800q;
import j7.K;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC2855l;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000e\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\t0\u000bj\b\u0012\u0004\u0012\u00020\t`\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0014\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u0019\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00180\u0012¢\u0006\u0004\b\u0019\u0010\u0015J#\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00122\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\u001f\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0018¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u0004\u0018\u00010\u00182\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b!\u0010\"J\r\u0010$\u001a\u00020#¢\u0006\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001b\u0010.\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\b¨\u0006/"}, d2 = {"Lexpo/modules/kotlin/activityresult/DataPersistor;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "retrieveData", "()Landroid/os/Bundle;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "key", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "value", "addStringArrayList", "(Ljava/lang/String;Ljava/util/ArrayList;)Lexpo/modules/kotlin/activityresult/DataPersistor;", "retrieveStringArrayList", "(Ljava/lang/String;)Ljava/util/ArrayList;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "addStringToIntMap", "(Ljava/lang/String;Ljava/util/Map;)Lexpo/modules/kotlin/activityresult/DataPersistor;", "retrieveStringToIntMap", "(Ljava/lang/String;)Ljava/util/Map;", "Ljava/io/Serializable;", "addStringToSerializableMap", "retrieveStringToSerializableMap", "addBundle", "(Ljava/lang/String;Landroid/os/Bundle;)Lexpo/modules/kotlin/activityresult/DataPersistor;", "retrieveBundle", "(Ljava/lang/String;)Landroid/os/Bundle;", "addSerializable", "(Ljava/lang/String;Ljava/io/Serializable;)Lexpo/modules/kotlin/activityresult/DataPersistor;", "retrieveSerializable", "(Ljava/lang/String;)Ljava/io/Serializable;", "Li7/B;", "persist", "()V", "Landroid/content/SharedPreferences;", "sharedPreferences", "Landroid/content/SharedPreferences;", "accumulator", "Landroid/os/Bundle;", "retrievedData$delegate", "Lkotlin/Lazy;", "getRetrievedData", "retrievedData", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DataPersistor {
    private final Bundle accumulator;

    /* JADX INFO: renamed from: retrievedData$delegate, reason: from kotlin metadata */
    private final Lazy retrievedData;
    private final SharedPreferences sharedPreferences;

    public DataPersistor(Context context) {
        AbstractC2855l.g(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("expo.modules.kotlin.PersistentDataManager", 0);
        AbstractC2855l.f(sharedPreferences, "getSharedPreferences(...)");
        this.sharedPreferences = sharedPreferences;
        this.accumulator = new Bundle();
        this.retrievedData = AbstractC2746i.b(new InterfaceC3487a() { // from class: expo.modules.kotlin.activityresult.d
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return this.f26575g.retrieveData();
            }
        });
    }

    private final Bundle getRetrievedData() {
        return (Bundle) this.retrievedData.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bundle retrieveData() {
        String string;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        if (this.sharedPreferences.getLong(DataPersistorKt.EXPIRE_KEY, 0L) > new Date().getTime() && (string = this.sharedPreferences.getString("bundle", null)) != null && (bundle = DataPersistorKt.toBundle(string)) != null) {
            bundle2 = bundle;
        }
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.clear();
        editorEdit.commit();
        return bundle2;
    }

    public final DataPersistor addBundle(String key, Bundle value) {
        AbstractC2855l.g(key, "key");
        AbstractC2855l.g(value, "value");
        this.accumulator.putBundle(key, value);
        return this;
    }

    public final DataPersistor addSerializable(String key, Serializable value) {
        AbstractC2855l.g(key, "key");
        AbstractC2855l.g(value, "value");
        this.accumulator.putSerializable(key, value);
        return this;
    }

    public final DataPersistor addStringArrayList(String key, ArrayList<String> value) {
        AbstractC2855l.g(key, "key");
        AbstractC2855l.g(value, "value");
        this.accumulator.putStringArrayList(key, value);
        return this;
    }

    public final DataPersistor addStringToIntMap(String key, Map<String, Integer> value) {
        AbstractC2855l.g(key, "key");
        AbstractC2855l.g(value, "value");
        Bundle bundle = this.accumulator;
        Pair[] pairArr = (Pair[]) K.x(value).toArray(new Pair[0]);
        bundle.putBundle(key, D0.c.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
        return this;
    }

    public final DataPersistor addStringToSerializableMap(String key, Map<String, ? extends Serializable> value) {
        AbstractC2855l.g(key, "key");
        AbstractC2855l.g(value, "value");
        Bundle bundle = this.accumulator;
        Pair[] pairArr = (Pair[]) K.x(value).toArray(new Pair[0]);
        bundle.putBundle(key, D0.c.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
        return this;
    }

    public final void persist() {
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.putString("bundle", DataPersistorKt.toBase64(this.accumulator));
        editorEdit.putLong(DataPersistorKt.EXPIRE_KEY, new Date().getTime() + DataPersistorKt.EXPIRATION_TIME);
        editorEdit.commit();
    }

    public final Bundle retrieveBundle(String key) {
        AbstractC2855l.g(key, "key");
        return getRetrievedData().getBundle(key);
    }

    public final Serializable retrieveSerializable(String key) {
        AbstractC2855l.g(key, "key");
        Bundle retrievedData = getRetrievedData();
        return Build.VERSION.SDK_INT >= 33 ? retrievedData.getSerializable(key, Serializable.class) : retrievedData.getSerializable(key);
    }

    public final ArrayList<String> retrieveStringArrayList(String key) {
        AbstractC2855l.g(key, "key");
        return getRetrievedData().getStringArrayList(key);
    }

    public final Map<String, Integer> retrieveStringToIntMap(String key) {
        AbstractC2855l.g(key, "key");
        Bundle bundle = getRetrievedData().getBundle(key);
        if (bundle == null) {
            return null;
        }
        Set<String> setKeySet = bundle.keySet();
        AbstractC2855l.d(setKeySet);
        LinkedHashMap linkedHashMap = new LinkedHashMap(B7.d.d(K.e(AbstractC2800q.u(setKeySet, 10)), 16));
        for (Object obj : setKeySet) {
            linkedHashMap.put(obj, Integer.valueOf(bundle.getInt((String) obj)));
        }
        return linkedHashMap;
    }

    public final Map<String, Serializable> retrieveStringToSerializableMap(String key) {
        AbstractC2855l.g(key, "key");
        Bundle bundle = getRetrievedData().getBundle(key);
        if (bundle == null) {
            return null;
        }
        Set<String> setKeySet = bundle.keySet();
        AbstractC2855l.f(setKeySet, "keySet(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap(B7.d.d(K.e(AbstractC2800q.u(setKeySet, 10)), 16));
        for (Object obj : setKeySet) {
            String str = (String) obj;
            Serializable serializable = Build.VERSION.SDK_INT >= 33 ? bundle.getSerializable(str, Serializable.class) : bundle.getSerializable(str);
            if (serializable == null) {
                throw new IllegalStateException("For a key '" + str + "' there should be a serializable class available");
            }
            linkedHashMap.put(obj, serializable);
        }
        return linkedHashMap;
    }
}
