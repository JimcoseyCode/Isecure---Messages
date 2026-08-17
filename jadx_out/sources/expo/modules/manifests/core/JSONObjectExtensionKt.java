package expo.modules.manifests.core;

import O8.i;
import O8.l;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004¨\u0006\u0005"}, d2 = {"toMap", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lorg/json/JSONObject;", "expo-manifests_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class JSONObjectExtensionKt {
    public static final Map<String, Object> toMap(JSONObject jSONObject) throws JSONException {
        AbstractC2855l.g(jSONObject, "<this>");
        Iterator<String> itKeys = jSONObject.keys();
        AbstractC2855l.f(itKeys, "keys(...)");
        i iVarG = l.g(itKeys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : iVarG) {
            Object map = jSONObject.get((String) obj);
            if (map instanceof JSONObject) {
                map = toMap((JSONObject) map);
            }
            linkedHashMap.put(obj, map);
        }
        return linkedHashMap;
    }
}
