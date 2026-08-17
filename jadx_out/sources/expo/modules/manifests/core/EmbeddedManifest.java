package expo.modules.manifests.core;

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
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\tJ\b\u0010\n\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\u0007H\u0016J\n\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0007H\u0016J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\u0011\u001a\u00020\u0003H\u0016J\b\u0010\u0012\u001a\u00020\u0003H\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0007H\u0016J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u0015"}, d2 = {"Lexpo/modules/manifests/core/EmbeddedManifest;", "Lexpo/modules/manifests/core/Manifest;", "json", "Lorg/json/JSONObject;", "<init>", "(Lorg/json/JSONObject;)V", "getID", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getCommitTimeLong", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getStableLegacyID", "getScopeKey", "getEASProjectID", "getAssets", "Lorg/json/JSONArray;", "getBundleURL", "getExpoGoSDKVersion", "getExpoGoConfigRootObject", "getExpoClientConfigRootObject", "getSlug", "getAppKey", "expo-manifests_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EmbeddedManifest extends Manifest {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmbeddedManifest(JSONObject json) {
        super(json);
        AbstractC2855l.g(json, "json");
    }

    @Override // expo.modules.manifests.core.Manifest
    public String getAppKey() throws JSONException {
        JSONObject json = getJson();
        if (!json.has("appKey")) {
            return null;
        }
        d dVarB = D.b(String.class);
        if (AbstractC2855l.b(dVarB, D.b(String.class))) {
            String string = json.getString("appKey");
            if (string != null) {
                return string;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (AbstractC2855l.b(dVarB, D.b(Double.TYPE))) {
            return (String) Double.valueOf(json.getDouble("appKey"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Integer.TYPE))) {
            return (String) Integer.valueOf(json.getInt("appKey"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Long.TYPE))) {
            return (String) Long.valueOf(json.getLong("appKey"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Boolean.TYPE))) {
            return (String) Boolean.valueOf(json.getBoolean("appKey"));
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONArray.class))) {
            Object jSONArray = json.getJSONArray("appKey");
            if (jSONArray != null) {
                return (String) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONObject.class))) {
            Object jSONObject = json.getJSONObject("appKey");
            if (jSONObject != null) {
                return (String) jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        Object obj = json.get("appKey");
        if (obj != null) {
            return (String) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    @Override // expo.modules.manifests.core.Manifest
    public JSONArray getAssets() throws JSONException {
        JSONObject json = getJson();
        if (!json.has("assets")) {
            return null;
        }
        d dVarB = D.b(JSONArray.class);
        if (AbstractC2855l.b(dVarB, D.b(String.class))) {
            Object string = json.getString("assets");
            if (string != null) {
                return (JSONArray) string;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
        }
        if (AbstractC2855l.b(dVarB, D.b(Double.TYPE))) {
            return (JSONArray) Double.valueOf(json.getDouble("assets"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Integer.TYPE))) {
            return (JSONArray) Integer.valueOf(json.getInt("assets"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Long.TYPE))) {
            return (JSONArray) Long.valueOf(json.getLong("assets"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Boolean.TYPE))) {
            return (JSONArray) Boolean.valueOf(json.getBoolean("assets"));
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONArray.class))) {
            JSONArray jSONArray = json.getJSONArray("assets");
            if (jSONArray != null) {
                return jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONObject.class))) {
            Object jSONObject = json.getJSONObject("assets");
            if (jSONObject != null) {
                return (JSONArray) jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
        }
        Object obj = json.get("assets");
        if (obj != null) {
            return (JSONArray) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
    }

    @Override // expo.modules.manifests.core.Manifest
    public String getBundleURL() throws JSONException {
        JSONObject json = getJson();
        d dVarB = D.b(String.class);
        if (AbstractC2855l.b(dVarB, D.b(String.class))) {
            String string = json.getString("bundleUrl");
            if (string != null) {
                return string;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (AbstractC2855l.b(dVarB, D.b(Double.TYPE))) {
            return (String) Double.valueOf(json.getDouble("bundleUrl"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Integer.TYPE))) {
            return (String) Integer.valueOf(json.getInt("bundleUrl"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Long.TYPE))) {
            return (String) Long.valueOf(json.getLong("bundleUrl"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Boolean.TYPE))) {
            return (String) Boolean.valueOf(json.getBoolean("bundleUrl"));
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONArray.class))) {
            Object jSONArray = json.getJSONArray("bundleUrl");
            if (jSONArray != null) {
                return (String) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONObject.class))) {
            Object jSONObject = json.getJSONObject("bundleUrl");
            if (jSONObject != null) {
                return (String) jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        Object obj = json.get("bundleUrl");
        if (obj != null) {
            return (String) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    public final long getCommitTimeLong() throws JSONException {
        Long lValueOf;
        JSONObject json = getJson();
        d dVarB = D.b(Long.class);
        if (AbstractC2855l.b(dVarB, D.b(String.class))) {
            Object string = json.getString("commitTime");
            if (string == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
            }
            lValueOf = (Long) string;
        } else if (AbstractC2855l.b(dVarB, D.b(Double.TYPE))) {
            lValueOf = (Long) Double.valueOf(json.getDouble("commitTime"));
        } else if (AbstractC2855l.b(dVarB, D.b(Integer.TYPE))) {
            lValueOf = (Long) Integer.valueOf(json.getInt("commitTime"));
        } else if (AbstractC2855l.b(dVarB, D.b(Long.TYPE))) {
            lValueOf = Long.valueOf(json.getLong("commitTime"));
        } else if (AbstractC2855l.b(dVarB, D.b(Boolean.TYPE))) {
            lValueOf = (Long) Boolean.valueOf(json.getBoolean("commitTime"));
        } else if (AbstractC2855l.b(dVarB, D.b(JSONArray.class))) {
            Object jSONArray = json.getJSONArray("commitTime");
            if (jSONArray == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
            }
            lValueOf = (Long) jSONArray;
        } else if (AbstractC2855l.b(dVarB, D.b(JSONObject.class))) {
            Object jSONObject = json.getJSONObject("commitTime");
            if (jSONObject == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
            }
            lValueOf = (Long) jSONObject;
        } else {
            Object obj = json.get("commitTime");
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
            }
            lValueOf = (Long) obj;
        }
        return lValueOf.longValue();
    }

    @Override // expo.modules.manifests.core.Manifest
    public String getEASProjectID() throws JSONException {
        JSONObject json = getJson();
        if (!json.has("projectId")) {
            return null;
        }
        d dVarB = D.b(String.class);
        if (AbstractC2855l.b(dVarB, D.b(String.class))) {
            String string = json.getString("projectId");
            if (string != null) {
                return string;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (AbstractC2855l.b(dVarB, D.b(Double.TYPE))) {
            return (String) Double.valueOf(json.getDouble("projectId"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Integer.TYPE))) {
            return (String) Integer.valueOf(json.getInt("projectId"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Long.TYPE))) {
            return (String) Long.valueOf(json.getLong("projectId"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Boolean.TYPE))) {
            return (String) Boolean.valueOf(json.getBoolean("projectId"));
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONArray.class))) {
            Object jSONArray = json.getJSONArray("projectId");
            if (jSONArray != null) {
                return (String) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONObject.class))) {
            Object jSONObject = json.getJSONObject("projectId");
            if (jSONObject != null) {
                return (String) jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        Object obj = json.get("projectId");
        if (obj != null) {
            return (String) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    @Override // expo.modules.manifests.core.Manifest
    public JSONObject getExpoClientConfigRootObject() {
        return getJson();
    }

    @Override // expo.modules.manifests.core.Manifest
    public JSONObject getExpoGoConfigRootObject() {
        return getJson();
    }

    @Override // expo.modules.manifests.core.Manifest
    public String getExpoGoSDKVersion() throws JSONException {
        JSONObject json = getJson();
        if (!json.has("sdkVersion")) {
            return null;
        }
        d dVarB = D.b(String.class);
        if (AbstractC2855l.b(dVarB, D.b(String.class))) {
            String string = json.getString("sdkVersion");
            if (string != null) {
                return string;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (AbstractC2855l.b(dVarB, D.b(Double.TYPE))) {
            return (String) Double.valueOf(json.getDouble("sdkVersion"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Integer.TYPE))) {
            return (String) Integer.valueOf(json.getInt("sdkVersion"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Long.TYPE))) {
            return (String) Long.valueOf(json.getLong("sdkVersion"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Boolean.TYPE))) {
            return (String) Boolean.valueOf(json.getBoolean("sdkVersion"));
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONArray.class))) {
            Object jSONArray = json.getJSONArray("sdkVersion");
            if (jSONArray != null) {
                return (String) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONObject.class))) {
            Object jSONObject = json.getJSONObject("sdkVersion");
            if (jSONObject != null) {
                return (String) jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        Object obj = json.get("sdkVersion");
        if (obj != null) {
            return (String) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    public final String getID() throws JSONException {
        JSONObject json = getJson();
        d dVarB = D.b(String.class);
        if (AbstractC2855l.b(dVarB, D.b(String.class))) {
            String string = json.getString("id");
            if (string != null) {
                return string;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (AbstractC2855l.b(dVarB, D.b(Double.TYPE))) {
            return (String) Double.valueOf(json.getDouble("id"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Integer.TYPE))) {
            return (String) Integer.valueOf(json.getInt("id"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Long.TYPE))) {
            return (String) Long.valueOf(json.getLong("id"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Boolean.TYPE))) {
            return (String) Boolean.valueOf(json.getBoolean("id"));
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONArray.class))) {
            Object jSONArray = json.getJSONArray("id");
            if (jSONArray != null) {
                return (String) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONObject.class))) {
            Object jSONObject = json.getJSONObject("id");
            if (jSONObject != null) {
                return (String) jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        Object obj = json.get("id");
        if (obj != null) {
            return (String) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    @Override // expo.modules.manifests.core.Manifest
    public String getScopeKey() throws JSONException {
        String string;
        JSONObject json = getJson();
        if (json.has("scopeKey")) {
            d dVarB = D.b(String.class);
            if (AbstractC2855l.b(dVarB, D.b(String.class))) {
                string = json.getString("scopeKey");
                if (string == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            } else if (AbstractC2855l.b(dVarB, D.b(Double.TYPE))) {
                string = (String) Double.valueOf(json.getDouble("scopeKey"));
            } else if (AbstractC2855l.b(dVarB, D.b(Integer.TYPE))) {
                string = (String) Integer.valueOf(json.getInt("scopeKey"));
            } else if (AbstractC2855l.b(dVarB, D.b(Long.TYPE))) {
                string = (String) Long.valueOf(json.getLong("scopeKey"));
            } else if (AbstractC2855l.b(dVarB, D.b(Boolean.TYPE))) {
                string = (String) Boolean.valueOf(json.getBoolean("scopeKey"));
            } else if (AbstractC2855l.b(dVarB, D.b(JSONArray.class))) {
                Object jSONArray = json.getJSONArray("scopeKey");
                if (jSONArray == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                string = (String) jSONArray;
            } else if (AbstractC2855l.b(dVarB, D.b(JSONObject.class))) {
                Object jSONObject = json.getJSONObject("scopeKey");
                if (jSONObject == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                string = (String) jSONObject;
            } else {
                Object obj = json.get("scopeKey");
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                string = (String) obj;
            }
        } else {
            string = null;
        }
        return string == null ? getStableLegacyID() : string;
    }

    @Override // expo.modules.manifests.core.Manifest
    public String getSlug() throws JSONException {
        JSONObject json = getJson();
        if (!json.has("slug")) {
            return null;
        }
        d dVarB = D.b(String.class);
        if (AbstractC2855l.b(dVarB, D.b(String.class))) {
            String string = json.getString("slug");
            if (string != null) {
                return string;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (AbstractC2855l.b(dVarB, D.b(Double.TYPE))) {
            return (String) Double.valueOf(json.getDouble("slug"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Integer.TYPE))) {
            return (String) Integer.valueOf(json.getInt("slug"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Long.TYPE))) {
            return (String) Long.valueOf(json.getLong("slug"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Boolean.TYPE))) {
            return (String) Boolean.valueOf(json.getBoolean("slug"));
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONArray.class))) {
            Object jSONArray = json.getJSONArray("slug");
            if (jSONArray != null) {
                return (String) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONObject.class))) {
            Object jSONObject = json.getJSONObject("slug");
            if (jSONObject != null) {
                return (String) jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        Object obj = json.get("slug");
        if (obj != null) {
            return (String) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    @Override // expo.modules.manifests.core.Manifest
    public String getStableLegacyID() throws JSONException {
        String string;
        JSONObject json = getJson();
        if (json.has("originalFullName")) {
            d dVarB = D.b(String.class);
            if (AbstractC2855l.b(dVarB, D.b(String.class))) {
                string = json.getString("originalFullName");
                if (string == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            } else if (AbstractC2855l.b(dVarB, D.b(Double.TYPE))) {
                string = (String) Double.valueOf(json.getDouble("originalFullName"));
            } else if (AbstractC2855l.b(dVarB, D.b(Integer.TYPE))) {
                string = (String) Integer.valueOf(json.getInt("originalFullName"));
            } else if (AbstractC2855l.b(dVarB, D.b(Long.TYPE))) {
                string = (String) Long.valueOf(json.getLong("originalFullName"));
            } else if (AbstractC2855l.b(dVarB, D.b(Boolean.TYPE))) {
                string = (String) Boolean.valueOf(json.getBoolean("originalFullName"));
            } else if (AbstractC2855l.b(dVarB, D.b(JSONArray.class))) {
                Object jSONArray = json.getJSONArray("originalFullName");
                if (jSONArray == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                string = (String) jSONArray;
            } else if (AbstractC2855l.b(dVarB, D.b(JSONObject.class))) {
                Object jSONObject = json.getJSONObject("originalFullName");
                if (jSONObject == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                string = (String) jSONObject;
            } else {
                Object obj = json.get("originalFullName");
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                string = (String) obj;
            }
        } else {
            string = null;
        }
        return string == null ? getLegacyID() : string;
    }
}
