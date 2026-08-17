package expo.modules.jsonutils;

import C7.d;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a&\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0086\b¢\u0006\u0002\u0010\u0006\u001a(\u0010\u0007\u001a\u0004\u0018\u0001H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0086\b¢\u0006\u0002\u0010\u0006¨\u0006\b"}, d2 = {"require", "T", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lorg/json/JSONObject;", "key", PointerEventHelper.POINTER_TYPE_UNKNOWN, "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Object;", "getNullable", "expo-json-utils_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class JSONObjectUtilsKt {
    public static final /* synthetic */ <T> T getNullable(JSONObject jSONObject, String key) {
        AbstractC2855l.g(jSONObject, "<this>");
        AbstractC2855l.g(key, "key");
        if (!jSONObject.has(key)) {
            return null;
        }
        AbstractC2855l.m(4, "T");
        d dVarB = D.b(Object.class);
        if (AbstractC2855l.b(dVarB, D.b(String.class))) {
            T t10 = (T) jSONObject.getString(key);
            AbstractC2855l.m(1, "T");
            return t10;
        }
        if (AbstractC2855l.b(dVarB, D.b(Double.TYPE))) {
            T t11 = (T) Double.valueOf(jSONObject.getDouble(key));
            AbstractC2855l.m(1, "T");
            return t11;
        }
        if (AbstractC2855l.b(dVarB, D.b(Integer.TYPE))) {
            T t12 = (T) Integer.valueOf(jSONObject.getInt(key));
            AbstractC2855l.m(1, "T");
            return t12;
        }
        if (AbstractC2855l.b(dVarB, D.b(Long.TYPE))) {
            T t13 = (T) Long.valueOf(jSONObject.getLong(key));
            AbstractC2855l.m(1, "T");
            return t13;
        }
        if (AbstractC2855l.b(dVarB, D.b(Boolean.TYPE))) {
            T t14 = (T) Boolean.valueOf(jSONObject.getBoolean(key));
            AbstractC2855l.m(1, "T");
            return t14;
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONArray.class))) {
            T t15 = (T) jSONObject.getJSONArray(key);
            AbstractC2855l.m(1, "T");
            return t15;
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONObject.class))) {
            T t16 = (T) jSONObject.getJSONObject(key);
            AbstractC2855l.m(1, "T");
            return t16;
        }
        T t17 = (T) jSONObject.get(key);
        AbstractC2855l.m(1, "T");
        return t17;
    }

    public static final /* synthetic */ <T> T require(JSONObject jSONObject, String key) throws JSONException {
        AbstractC2855l.g(jSONObject, "<this>");
        AbstractC2855l.g(key, "key");
        AbstractC2855l.m(4, "T");
        d dVarB = D.b(Object.class);
        if (AbstractC2855l.b(dVarB, D.b(String.class))) {
            T t10 = (T) jSONObject.getString(key);
            AbstractC2855l.m(1, "T");
            return t10;
        }
        if (AbstractC2855l.b(dVarB, D.b(Double.TYPE))) {
            T t11 = (T) Double.valueOf(jSONObject.getDouble(key));
            AbstractC2855l.m(1, "T");
            return t11;
        }
        if (AbstractC2855l.b(dVarB, D.b(Integer.TYPE))) {
            T t12 = (T) Integer.valueOf(jSONObject.getInt(key));
            AbstractC2855l.m(1, "T");
            return t12;
        }
        if (AbstractC2855l.b(dVarB, D.b(Long.TYPE))) {
            T t13 = (T) Long.valueOf(jSONObject.getLong(key));
            AbstractC2855l.m(1, "T");
            return t13;
        }
        if (AbstractC2855l.b(dVarB, D.b(Boolean.TYPE))) {
            T t14 = (T) Boolean.valueOf(jSONObject.getBoolean(key));
            AbstractC2855l.m(1, "T");
            return t14;
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONArray.class))) {
            T t15 = (T) jSONObject.getJSONArray(key);
            AbstractC2855l.m(1, "T");
            return t15;
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONObject.class))) {
            T t16 = (T) jSONObject.getJSONObject(key);
            AbstractC2855l.m(1, "T");
            return t16;
        }
        T t17 = (T) jSONObject.get(key);
        AbstractC2855l.m(1, "T");
        return t17;
    }
}
