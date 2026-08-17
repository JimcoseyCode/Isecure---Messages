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
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0007J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\n\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0016J\u0006\u0010\u000b\u001a\u00020\u0007J\b\u0010\f\u001a\u00020\u0007H\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0016J\u0006\u0010\u000e\u001a\u00020\u0003J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0006\u0010\u0011\u001a\u00020\u0007J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u0016J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u0016J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u0002¨\u0006\u0017"}, d2 = {"Lexpo/modules/manifests/core/ExpoUpdatesManifest;", "Lexpo/modules/manifests/core/Manifest;", "json", "Lorg/json/JSONObject;", "<init>", "(Lorg/json/JSONObject;)V", "getID", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getStableLegacyID", "getScopeKey", "getEASProjectID", "getRuntimeVersion", "getBundleURL", "getExpoGoSDKVersion", "getLaunchAsset", "getAssets", "Lorg/json/JSONArray;", "getCreatedAt", "getExpoGoConfigRootObject", "getExpoClientConfigRootObject", "getSlug", "getAppKey", "getExtra", "expo-manifests_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExpoUpdatesManifest extends Manifest {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpoUpdatesManifest(JSONObject json) {
        super(json);
        AbstractC2855l.g(json, "json");
    }

    private final JSONObject getExtra() throws JSONException {
        JSONObject json = getJson();
        if (!json.has("extra")) {
            return null;
        }
        d dVarB = D.b(JSONObject.class);
        if (AbstractC2855l.b(dVarB, D.b(String.class))) {
            Object string = json.getString("extra");
            if (string != null) {
                return (JSONObject) string;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        if (AbstractC2855l.b(dVarB, D.b(Double.TYPE))) {
            return (JSONObject) Double.valueOf(json.getDouble("extra"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Integer.TYPE))) {
            return (JSONObject) Integer.valueOf(json.getInt("extra"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Long.TYPE))) {
            return (JSONObject) Long.valueOf(json.getLong("extra"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Boolean.TYPE))) {
            return (JSONObject) Boolean.valueOf(json.getBoolean("extra"));
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONArray.class))) {
            Object jSONArray = json.getJSONArray("extra");
            if (jSONArray != null) {
                return (JSONObject) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONObject.class))) {
            JSONObject jSONObject = json.getJSONObject("extra");
            if (jSONObject != null) {
                return jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        Object obj = json.get("extra");
        if (obj != null) {
            return (JSONObject) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
    }

    @Override // expo.modules.manifests.core.Manifest
    public String getAppKey() {
        return null;
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
        JSONObject launchAsset = getLaunchAsset();
        d dVarB = D.b(String.class);
        if (AbstractC2855l.b(dVarB, D.b(String.class))) {
            String string = launchAsset.getString("url");
            if (string != null) {
                return string;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (AbstractC2855l.b(dVarB, D.b(Double.TYPE))) {
            return (String) Double.valueOf(launchAsset.getDouble("url"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Integer.TYPE))) {
            return (String) Integer.valueOf(launchAsset.getInt("url"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Long.TYPE))) {
            return (String) Long.valueOf(launchAsset.getLong("url"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Boolean.TYPE))) {
            return (String) Boolean.valueOf(launchAsset.getBoolean("url"));
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONArray.class))) {
            Object jSONArray = launchAsset.getJSONArray("url");
            if (jSONArray != null) {
                return (String) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONObject.class))) {
            Object jSONObject = launchAsset.getJSONObject("url");
            if (jSONObject != null) {
                return (String) jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        Object obj = launchAsset.get("url");
        if (obj != null) {
            return (String) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    public final String getCreatedAt() throws JSONException {
        JSONObject json = getJson();
        d dVarB = D.b(String.class);
        if (AbstractC2855l.b(dVarB, D.b(String.class))) {
            String string = json.getString("createdAt");
            if (string != null) {
                return string;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (AbstractC2855l.b(dVarB, D.b(Double.TYPE))) {
            return (String) Double.valueOf(json.getDouble("createdAt"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Integer.TYPE))) {
            return (String) Integer.valueOf(json.getInt("createdAt"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Long.TYPE))) {
            return (String) Long.valueOf(json.getLong("createdAt"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Boolean.TYPE))) {
            return (String) Boolean.valueOf(json.getBoolean("createdAt"));
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONArray.class))) {
            Object jSONArray = json.getJSONArray("createdAt");
            if (jSONArray != null) {
                return (String) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONObject.class))) {
            Object jSONObject = json.getJSONObject("createdAt");
            if (jSONObject != null) {
                return (String) jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        Object obj = json.get("createdAt");
        if (obj != null) {
            return (String) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    @Override // expo.modules.manifests.core.Manifest
    public String getEASProjectID() throws JSONException {
        JSONObject jSONObject;
        JSONObject extra = getExtra();
        if (extra != null) {
            boolean zHas = extra.has("eas");
            Class cls = Boolean.TYPE;
            Class cls2 = Long.TYPE;
            Class cls3 = Integer.TYPE;
            Class cls4 = Double.TYPE;
            if (zHas) {
                d dVarB = D.b(JSONObject.class);
                if (AbstractC2855l.b(dVarB, D.b(String.class))) {
                    Object string = extra.getString("eas");
                    if (string == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                    jSONObject = (JSONObject) string;
                } else if (AbstractC2855l.b(dVarB, D.b(cls4))) {
                    jSONObject = (JSONObject) Double.valueOf(extra.getDouble("eas"));
                } else if (AbstractC2855l.b(dVarB, D.b(cls3))) {
                    jSONObject = (JSONObject) Integer.valueOf(extra.getInt("eas"));
                } else if (AbstractC2855l.b(dVarB, D.b(cls2))) {
                    jSONObject = (JSONObject) Long.valueOf(extra.getLong("eas"));
                } else if (AbstractC2855l.b(dVarB, D.b(cls))) {
                    jSONObject = (JSONObject) Boolean.valueOf(extra.getBoolean("eas"));
                } else if (AbstractC2855l.b(dVarB, D.b(JSONArray.class))) {
                    Object jSONArray = extra.getJSONArray("eas");
                    if (jSONArray == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                    jSONObject = (JSONObject) jSONArray;
                } else if (AbstractC2855l.b(dVarB, D.b(JSONObject.class))) {
                    jSONObject = extra.getJSONObject("eas");
                    if (jSONObject == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                } else {
                    Object obj = extra.get("eas");
                    if (obj == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                    jSONObject = (JSONObject) obj;
                }
            } else {
                jSONObject = null;
            }
            if (jSONObject == null || !jSONObject.has("projectId")) {
                return null;
            }
            d dVarB2 = D.b(String.class);
            if (AbstractC2855l.b(dVarB2, D.b(String.class))) {
                String string2 = jSONObject.getString("projectId");
                if (string2 != null) {
                    return string2;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            if (AbstractC2855l.b(dVarB2, D.b(cls4))) {
                return (String) Double.valueOf(jSONObject.getDouble("projectId"));
            }
            if (AbstractC2855l.b(dVarB2, D.b(cls3))) {
                return (String) Integer.valueOf(jSONObject.getInt("projectId"));
            }
            if (AbstractC2855l.b(dVarB2, D.b(cls2))) {
                return (String) Long.valueOf(jSONObject.getLong("projectId"));
            }
            if (AbstractC2855l.b(dVarB2, D.b(cls))) {
                return (String) Boolean.valueOf(jSONObject.getBoolean("projectId"));
            }
            if (AbstractC2855l.b(dVarB2, D.b(JSONArray.class))) {
                Object jSONArray2 = jSONObject.getJSONArray("projectId");
                if (jSONArray2 != null) {
                    return (String) jSONArray2;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            if (AbstractC2855l.b(dVarB2, D.b(JSONObject.class))) {
                Object jSONObject2 = jSONObject.getJSONObject("projectId");
                if (jSONObject2 != null) {
                    return (String) jSONObject2;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            Object obj2 = jSONObject.get("projectId");
            if (obj2 != null) {
                return (String) obj2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        return null;
    }

    @Override // expo.modules.manifests.core.Manifest
    public JSONObject getExpoClientConfigRootObject() throws JSONException {
        JSONObject extra = getExtra();
        if (extra == null || !extra.has("expoClient")) {
            return null;
        }
        d dVarB = D.b(JSONObject.class);
        if (AbstractC2855l.b(dVarB, D.b(String.class))) {
            Object string = extra.getString("expoClient");
            if (string != null) {
                return (JSONObject) string;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        if (AbstractC2855l.b(dVarB, D.b(Double.TYPE))) {
            return (JSONObject) Double.valueOf(extra.getDouble("expoClient"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Integer.TYPE))) {
            return (JSONObject) Integer.valueOf(extra.getInt("expoClient"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Long.TYPE))) {
            return (JSONObject) Long.valueOf(extra.getLong("expoClient"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Boolean.TYPE))) {
            return (JSONObject) Boolean.valueOf(extra.getBoolean("expoClient"));
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONArray.class))) {
            Object jSONArray = extra.getJSONArray("expoClient");
            if (jSONArray != null) {
                return (JSONObject) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONObject.class))) {
            JSONObject jSONObject = extra.getJSONObject("expoClient");
            if (jSONObject != null) {
                return jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        Object obj = extra.get("expoClient");
        if (obj != null) {
            return (JSONObject) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
    }

    @Override // expo.modules.manifests.core.Manifest
    public JSONObject getExpoGoConfigRootObject() throws JSONException {
        JSONObject extra = getExtra();
        if (extra == null || !extra.has("expoGo")) {
            return null;
        }
        d dVarB = D.b(JSONObject.class);
        if (AbstractC2855l.b(dVarB, D.b(String.class))) {
            Object string = extra.getString("expoGo");
            if (string != null) {
                return (JSONObject) string;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        if (AbstractC2855l.b(dVarB, D.b(Double.TYPE))) {
            return (JSONObject) Double.valueOf(extra.getDouble("expoGo"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Integer.TYPE))) {
            return (JSONObject) Integer.valueOf(extra.getInt("expoGo"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Long.TYPE))) {
            return (JSONObject) Long.valueOf(extra.getLong("expoGo"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Boolean.TYPE))) {
            return (JSONObject) Boolean.valueOf(extra.getBoolean("expoGo"));
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONArray.class))) {
            Object jSONArray = extra.getJSONArray("expoGo");
            if (jSONArray != null) {
                return (JSONObject) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONObject.class))) {
            JSONObject jSONObject = extra.getJSONObject("expoGo");
            if (jSONObject != null) {
                return jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        Object obj = extra.get("expoGo");
        if (obj != null) {
            return (JSONObject) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
    }

    @Override // expo.modules.manifests.core.Manifest
    public String getExpoGoSDKVersion() throws JSONException {
        JSONObject expoClientConfigRootObject = getExpoClientConfigRootObject();
        if (expoClientConfigRootObject != null) {
            return expoClientConfigRootObject.getString("sdkVersion");
        }
        return null;
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

    public final JSONObject getLaunchAsset() throws JSONException {
        JSONObject json = getJson();
        d dVarB = D.b(JSONObject.class);
        if (AbstractC2855l.b(dVarB, D.b(String.class))) {
            Object string = json.getString("launchAsset");
            if (string != null) {
                return (JSONObject) string;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        if (AbstractC2855l.b(dVarB, D.b(Double.TYPE))) {
            return (JSONObject) Double.valueOf(json.getDouble("launchAsset"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Integer.TYPE))) {
            return (JSONObject) Integer.valueOf(json.getInt("launchAsset"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Long.TYPE))) {
            return (JSONObject) Long.valueOf(json.getLong("launchAsset"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Boolean.TYPE))) {
            return (JSONObject) Boolean.valueOf(json.getBoolean("launchAsset"));
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONArray.class))) {
            Object jSONArray = json.getJSONArray("launchAsset");
            if (jSONArray != null) {
                return (JSONObject) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONObject.class))) {
            JSONObject jSONObject = json.getJSONObject("launchAsset");
            if (jSONObject != null) {
                return jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        Object obj = json.get("launchAsset");
        if (obj != null) {
            return (JSONObject) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
    }

    public final String getRuntimeVersion() throws JSONException {
        JSONObject json = getJson();
        d dVarB = D.b(String.class);
        if (AbstractC2855l.b(dVarB, D.b(String.class))) {
            String string = json.getString("runtimeVersion");
            if (string != null) {
                return string;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (AbstractC2855l.b(dVarB, D.b(Double.TYPE))) {
            return (String) Double.valueOf(json.getDouble("runtimeVersion"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Integer.TYPE))) {
            return (String) Integer.valueOf(json.getInt("runtimeVersion"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Long.TYPE))) {
            return (String) Long.valueOf(json.getLong("runtimeVersion"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Boolean.TYPE))) {
            return (String) Boolean.valueOf(json.getBoolean("runtimeVersion"));
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONArray.class))) {
            Object jSONArray = json.getJSONArray("runtimeVersion");
            if (jSONArray != null) {
                return (String) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONObject.class))) {
            Object jSONObject = json.getJSONObject("runtimeVersion");
            if (jSONObject != null) {
                return (String) jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        Object obj = json.get("runtimeVersion");
        if (obj != null) {
            return (String) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    @Override // expo.modules.manifests.core.Manifest
    public String getScopeKey() throws JSONException {
        JSONObject jSONObject;
        JSONObject json = getJson();
        d dVarB = D.b(JSONObject.class);
        boolean zB = AbstractC2855l.b(dVarB, D.b(String.class));
        Class cls = Boolean.TYPE;
        Class cls2 = Long.TYPE;
        Class cls3 = Integer.TYPE;
        Class cls4 = Double.TYPE;
        if (zB) {
            Object string = json.getString("extra");
            if (string == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
            }
            jSONObject = (JSONObject) string;
        } else if (AbstractC2855l.b(dVarB, D.b(cls4))) {
            jSONObject = (JSONObject) Double.valueOf(json.getDouble("extra"));
        } else if (AbstractC2855l.b(dVarB, D.b(cls3))) {
            jSONObject = (JSONObject) Integer.valueOf(json.getInt("extra"));
        } else if (AbstractC2855l.b(dVarB, D.b(cls2))) {
            jSONObject = (JSONObject) Long.valueOf(json.getLong("extra"));
        } else if (AbstractC2855l.b(dVarB, D.b(cls))) {
            jSONObject = (JSONObject) Boolean.valueOf(json.getBoolean("extra"));
        } else if (AbstractC2855l.b(dVarB, D.b(JSONArray.class))) {
            Object jSONArray = json.getJSONArray("extra");
            if (jSONArray == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
            }
            jSONObject = (JSONObject) jSONArray;
        } else if (AbstractC2855l.b(dVarB, D.b(JSONObject.class))) {
            jSONObject = json.getJSONObject("extra");
            if (jSONObject == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
            }
        } else {
            Object obj = json.get("extra");
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
            }
            jSONObject = (JSONObject) obj;
        }
        d dVarB2 = D.b(String.class);
        if (AbstractC2855l.b(dVarB2, D.b(String.class))) {
            String string2 = jSONObject.getString("scopeKey");
            if (string2 != null) {
                return string2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (AbstractC2855l.b(dVarB2, D.b(cls4))) {
            return (String) Double.valueOf(jSONObject.getDouble("scopeKey"));
        }
        if (AbstractC2855l.b(dVarB2, D.b(cls3))) {
            return (String) Integer.valueOf(jSONObject.getInt("scopeKey"));
        }
        if (AbstractC2855l.b(dVarB2, D.b(cls2))) {
            return (String) Long.valueOf(jSONObject.getLong("scopeKey"));
        }
        if (AbstractC2855l.b(dVarB2, D.b(cls))) {
            return (String) Boolean.valueOf(jSONObject.getBoolean("scopeKey"));
        }
        if (AbstractC2855l.b(dVarB2, D.b(JSONArray.class))) {
            Object jSONArray2 = jSONObject.getJSONArray("scopeKey");
            if (jSONArray2 != null) {
                return (String) jSONArray2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (AbstractC2855l.b(dVarB2, D.b(JSONObject.class))) {
            Object jSONObject2 = jSONObject.getJSONObject("scopeKey");
            if (jSONObject2 != null) {
                return (String) jSONObject2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        Object obj2 = jSONObject.get("scopeKey");
        if (obj2 != null) {
            return (String) obj2;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    @Override // expo.modules.manifests.core.Manifest
    public String getSlug() {
        return null;
    }

    @Override // expo.modules.manifests.core.Manifest
    public String getStableLegacyID() {
        return null;
    }
}
