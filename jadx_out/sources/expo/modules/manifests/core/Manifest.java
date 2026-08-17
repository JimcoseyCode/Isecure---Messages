package expo.modules.manifests.core;

import B7.c;
import C7.d;
import P8.q;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.manifests.core.PluginType;
import i7.AbstractC2746i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0010$\n\u0002\b\u0003\b&\u0018\u0000 <2\u00020\u0001:\u0001<B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\u0003H\u0007J\b\u0010\t\u001a\u00020\nH\u0017J\n\u0010\u000b\u001a\u0004\u0018\u00010\nH'J\b\u0010\f\u001a\u00020\nH&J\n\u0010\r\u001a\u0004\u0018\u00010\nH&J\b\u0010\u000e\u001a\u00020\nH\u0007J\b\u0010\u000f\u001a\u00020\nH&J\u0006\u0010\u0010\u001a\u00020\nJ\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003J\n\u0010\u0012\u001a\u0004\u0018\u00010\nH&J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0014H&J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0003H&J\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0018J\u0006\u0010\u001a\u001a\u00020\u0018J\n\u0010\u001b\u001a\u0004\u0018\u00010\nH&J\u0006\u0010\u001c\u001a\u00020\nJ\u0006\u0010\u001d\u001a\u00020\nJ\b\u0010\u001e\u001a\u0004\u0018\u00010\nJ\u0006\u0010\u001f\u001a\u00020\u0018J\n\u0010 \u001a\u0004\u0018\u00010\nH&J\b\u0010!\u001a\u0004\u0018\u00010\nJ\b\u0010\"\u001a\u0004\u0018\u00010\nJ\b\u0010#\u001a\u0004\u0018\u00010\u0003J\b\u0010$\u001a\u0004\u0018\u00010\nJ\b\u0010%\u001a\u0004\u0018\u00010\nJ\b\u0010&\u001a\u0004\u0018\u00010\nJ\b\u0010'\u001a\u0004\u0018\u00010\nJ\b\u0010(\u001a\u0004\u0018\u00010\u0003J\b\u0010)\u001a\u0004\u0018\u00010\nJ\b\u0010*\u001a\u0004\u0018\u00010\u0003J\b\u00100\u001a\u0004\u0018\u00010\nJ\b\u00101\u001a\u0004\u0018\u00010\u0003J\b\u00102\u001a\u0004\u0018\u00010\u0003J\b\u00103\u001a\u0004\u0018\u00010\nJ\b\u00104\u001a\u0004\u0018\u00010\nJ\u0006\u00105\u001a\u00020\u0018J\u0006\u00106\u001a\u00020\nJ\u0006\u00107\u001a\u00020\nJ\u0006\u00108\u001a\u00020\u0018J\u001c\u00109\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010:2\u0006\u0010;\u001a\u00020\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010+\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b,\u0010-¨\u0006="}, d2 = {"Lexpo/modules/manifests/core/Manifest;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "json", "Lorg/json/JSONObject;", "<init>", "(Lorg/json/JSONObject;)V", "getJson", "()Lorg/json/JSONObject;", "getRawJson", "toString", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getStableLegacyID", "getScopeKey", "getEASProjectID", "getLegacyID", "getBundleURL", "getRevisionId", "getMetadata", "getExpoGoSDKVersion", "getAssets", "Lorg/json/JSONArray;", "getExpoGoConfigRootObject", "getExpoClientConfigRootObject", "isDevelopmentMode", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isDevelopmentSilentLaunch", "isUsingDeveloperTool", "getSlug", "getDebuggerHost", "getMainModuleName", "getHostUri", "isVerified", "getAppKey", "getName", "getVersion", "getUpdatesInfo", "getPrimaryColor", "getOrientation", "getAndroidKeyboardLayoutMode", "getAndroidUserInterfaceStyle", "getAndroidStatusBarOptions", "getAndroidBackgroundColor", "getAndroidNavigationBarOptions", "jsEngine", "getJsEngine", "()Ljava/lang/String;", "jsEngine$delegate", "Lkotlin/Lazy;", "getIconUrl", "getAndroidSplashInfo", "getRootSplashInfo", "getAndroidGoogleServicesFile", "getAndroidPackageName", "shouldUseNextNotificationsApi", "getFacebookAppId", "getFacebookApplicationName", "getFacebookAutoInitEnabled", "getPluginProperties", PointerEventHelper.POINTER_TYPE_UNKNOWN, "packageName", "Companion", "expo-manifests_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class Manifest {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: jsEngine$delegate, reason: from kotlin metadata */
    private final Lazy jsEngine;
    private final JSONObject json;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lexpo/modules/manifests/core/Manifest$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "fromManifestJson", "Lexpo/modules/manifests/core/Manifest;", "manifestJson", "Lorg/json/JSONObject;", "expo-manifests_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Manifest fromManifestJson(JSONObject manifestJson) throws Exception {
            AbstractC2855l.g(manifestJson, "manifestJson");
            if (manifestJson.has("releaseId")) {
                throw new Exception("Legacy manifests are no longer supported");
            }
            return manifestJson.has("metadata") ? new ExpoUpdatesManifest(manifestJson) : new EmbeddedManifest(manifestJson);
        }

        private Companion() {
        }
    }

    public Manifest(JSONObject json) {
        AbstractC2855l.g(json, "json");
        this.json = json;
        this.jsEngine = AbstractC2746i.b(new InterfaceC3487a() { // from class: expo.modules.manifests.core.a
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return Manifest.jsEngine_delegate$lambda$0(this.f26659g);
            }
        });
    }

    public static final Manifest fromManifestJson(JSONObject jSONObject) {
        return INSTANCE.fromManifestJson(jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String jsEngine_delegate$lambda$0(Manifest manifest) throws JSONException {
        String string;
        String string2;
        JSONObject jSONObject;
        JSONObject expoClientConfigRootObject = manifest.getExpoClientConfigRootObject();
        Class cls = Boolean.TYPE;
        Class cls2 = Long.TYPE;
        Class cls3 = Integer.TYPE;
        Class cls4 = Double.TYPE;
        if (expoClientConfigRootObject != null) {
            if (expoClientConfigRootObject.has("android")) {
                d dVarB = D.b(JSONObject.class);
                if (AbstractC2855l.b(dVarB, D.b(String.class))) {
                    Object string3 = expoClientConfigRootObject.getString("android");
                    if (string3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                    jSONObject = (JSONObject) string3;
                } else if (AbstractC2855l.b(dVarB, D.b(cls4))) {
                    jSONObject = (JSONObject) Double.valueOf(expoClientConfigRootObject.getDouble("android"));
                } else if (AbstractC2855l.b(dVarB, D.b(cls3))) {
                    jSONObject = (JSONObject) Integer.valueOf(expoClientConfigRootObject.getInt("android"));
                } else if (AbstractC2855l.b(dVarB, D.b(cls2))) {
                    jSONObject = (JSONObject) Long.valueOf(expoClientConfigRootObject.getLong("android"));
                } else if (AbstractC2855l.b(dVarB, D.b(cls))) {
                    jSONObject = (JSONObject) Boolean.valueOf(expoClientConfigRootObject.getBoolean("android"));
                } else if (AbstractC2855l.b(dVarB, D.b(JSONArray.class))) {
                    Object jSONArray = expoClientConfigRootObject.getJSONArray("android");
                    if (jSONArray == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                    jSONObject = (JSONObject) jSONArray;
                } else if (AbstractC2855l.b(dVarB, D.b(JSONObject.class))) {
                    jSONObject = expoClientConfigRootObject.getJSONObject("android");
                    if (jSONObject == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                } else {
                    Object obj = expoClientConfigRootObject.get("android");
                    if (obj == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                    jSONObject = (JSONObject) obj;
                }
            } else {
                jSONObject = null;
            }
            if (jSONObject != null) {
                if (jSONObject.has("jsEngine")) {
                    d dVarB2 = D.b(String.class);
                    if (AbstractC2855l.b(dVarB2, D.b(String.class))) {
                        string = jSONObject.getString("jsEngine");
                        if (string == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                    } else if (AbstractC2855l.b(dVarB2, D.b(cls4))) {
                        string = (String) Double.valueOf(jSONObject.getDouble("jsEngine"));
                    } else if (AbstractC2855l.b(dVarB2, D.b(cls3))) {
                        string = (String) Integer.valueOf(jSONObject.getInt("jsEngine"));
                    } else if (AbstractC2855l.b(dVarB2, D.b(cls2))) {
                        string = (String) Long.valueOf(jSONObject.getLong("jsEngine"));
                    } else if (AbstractC2855l.b(dVarB2, D.b(cls))) {
                        string = (String) Boolean.valueOf(jSONObject.getBoolean("jsEngine"));
                    } else if (AbstractC2855l.b(dVarB2, D.b(JSONArray.class))) {
                        Object jSONArray2 = jSONObject.getJSONArray("jsEngine");
                        if (jSONArray2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        string = (String) jSONArray2;
                    } else if (AbstractC2855l.b(dVarB2, D.b(JSONObject.class))) {
                        Object jSONObject2 = jSONObject.getJSONObject("jsEngine");
                        if (jSONObject2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        string = (String) jSONObject2;
                    } else {
                        Object obj2 = jSONObject.get("jsEngine");
                        if (obj2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        string = (String) obj2;
                    }
                } else {
                    string = null;
                }
                if (string == null) {
                }
            }
        } else if (expoClientConfigRootObject == null || !expoClientConfigRootObject.has("jsEngine")) {
            string = null;
        } else {
            d dVarB3 = D.b(String.class);
            if (AbstractC2855l.b(dVarB3, D.b(String.class))) {
                string2 = expoClientConfigRootObject.getString("jsEngine");
                if (string2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            } else if (AbstractC2855l.b(dVarB3, D.b(cls4))) {
                string2 = (String) Double.valueOf(expoClientConfigRootObject.getDouble("jsEngine"));
            } else if (AbstractC2855l.b(dVarB3, D.b(cls3))) {
                string2 = (String) Integer.valueOf(expoClientConfigRootObject.getInt("jsEngine"));
            } else if (AbstractC2855l.b(dVarB3, D.b(cls2))) {
                string2 = (String) Long.valueOf(expoClientConfigRootObject.getLong("jsEngine"));
            } else if (AbstractC2855l.b(dVarB3, D.b(cls))) {
                string2 = (String) Boolean.valueOf(expoClientConfigRootObject.getBoolean("jsEngine"));
            } else if (AbstractC2855l.b(dVarB3, D.b(JSONArray.class))) {
                Object jSONArray3 = expoClientConfigRootObject.getJSONArray("jsEngine");
                if (jSONArray3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                string2 = (String) jSONArray3;
            } else if (AbstractC2855l.b(dVarB3, D.b(JSONObject.class))) {
                Object jSONObject3 = expoClientConfigRootObject.getJSONObject("jsEngine");
                if (jSONObject3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                string2 = (String) jSONObject3;
            } else {
                Object obj3 = expoClientConfigRootObject.get("jsEngine");
                if (obj3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                string2 = (String) obj3;
            }
            string = string2;
        }
        if (string != null) {
            return string;
        }
        String expoGoSDKVersion = manifest.getExpoGoSDKVersion();
        List listG0 = expoGoSDKVersion != null ? q.G0(expoGoSDKVersion, new String[]{"."}, false, 0, 6, null) : null;
        Integer numN = (listG0 == null || listG0.size() != 3) ? 0 : q.n((String) listG0.get(0));
        return (numN == null || !new c(1, 47).contains(numN.intValue())) ? "hermes" : "jsc";
    }

    public final String getAndroidBackgroundColor() throws JSONException {
        String string;
        JSONObject jSONObject;
        Class cls = Boolean.TYPE;
        Class cls2 = Long.TYPE;
        Class cls3 = Integer.TYPE;
        Class cls4 = Double.TYPE;
        JSONObject expoClientConfigRootObject = getExpoClientConfigRootObject();
        if (expoClientConfigRootObject == null) {
            return null;
        }
        try {
            d dVarB = D.b(JSONObject.class);
            if (AbstractC2855l.b(dVarB, D.b(String.class))) {
                Object string2 = expoClientConfigRootObject.getString("android");
                if (string2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) string2;
            } else if (AbstractC2855l.b(dVarB, D.b(cls4))) {
                jSONObject = (JSONObject) Double.valueOf(expoClientConfigRootObject.getDouble("android"));
            } else if (AbstractC2855l.b(dVarB, D.b(cls3))) {
                jSONObject = (JSONObject) Integer.valueOf(expoClientConfigRootObject.getInt("android"));
            } else if (AbstractC2855l.b(dVarB, D.b(cls2))) {
                jSONObject = (JSONObject) Long.valueOf(expoClientConfigRootObject.getLong("android"));
            } else if (AbstractC2855l.b(dVarB, D.b(cls))) {
                jSONObject = (JSONObject) Boolean.valueOf(expoClientConfigRootObject.getBoolean("android"));
            } else if (AbstractC2855l.b(dVarB, D.b(JSONArray.class))) {
                Object jSONArray = expoClientConfigRootObject.getJSONArray("android");
                if (jSONArray == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) jSONArray;
            } else if (AbstractC2855l.b(dVarB, D.b(JSONObject.class))) {
                jSONObject = expoClientConfigRootObject.getJSONObject("android");
                if (jSONObject == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
            } else {
                Object obj = expoClientConfigRootObject.get("android");
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) obj;
            }
            d dVarB2 = D.b(String.class);
            if (AbstractC2855l.b(dVarB2, D.b(String.class))) {
                String string3 = jSONObject.getString(ViewProps.BACKGROUND_COLOR);
                if (string3 != null) {
                    return string3;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            if (AbstractC2855l.b(dVarB2, D.b(cls4))) {
                return (String) Double.valueOf(jSONObject.getDouble(ViewProps.BACKGROUND_COLOR));
            }
            if (AbstractC2855l.b(dVarB2, D.b(cls3))) {
                return (String) Integer.valueOf(jSONObject.getInt(ViewProps.BACKGROUND_COLOR));
            }
            if (AbstractC2855l.b(dVarB2, D.b(cls2))) {
                return (String) Long.valueOf(jSONObject.getLong(ViewProps.BACKGROUND_COLOR));
            }
            if (AbstractC2855l.b(dVarB2, D.b(cls))) {
                return (String) Boolean.valueOf(jSONObject.getBoolean(ViewProps.BACKGROUND_COLOR));
            }
            if (AbstractC2855l.b(dVarB2, D.b(JSONArray.class))) {
                Object jSONArray2 = jSONObject.getJSONArray(ViewProps.BACKGROUND_COLOR);
                if (jSONArray2 != null) {
                    return (String) jSONArray2;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            if (AbstractC2855l.b(dVarB2, D.b(JSONObject.class))) {
                Object jSONObject2 = jSONObject.getJSONObject(ViewProps.BACKGROUND_COLOR);
                if (jSONObject2 != null) {
                    return (String) jSONObject2;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            Object obj2 = jSONObject.get(ViewProps.BACKGROUND_COLOR);
            if (obj2 != null) {
                return (String) obj2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (JSONException unused) {
            if (!expoClientConfigRootObject.has(ViewProps.BACKGROUND_COLOR)) {
                return null;
            }
            d dVarB3 = D.b(String.class);
            if (AbstractC2855l.b(dVarB3, D.b(String.class))) {
                string = expoClientConfigRootObject.getString(ViewProps.BACKGROUND_COLOR);
                if (string == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            } else if (AbstractC2855l.b(dVarB3, D.b(cls4))) {
                string = (String) Double.valueOf(expoClientConfigRootObject.getDouble(ViewProps.BACKGROUND_COLOR));
            } else if (AbstractC2855l.b(dVarB3, D.b(cls3))) {
                string = (String) Integer.valueOf(expoClientConfigRootObject.getInt(ViewProps.BACKGROUND_COLOR));
            } else if (AbstractC2855l.b(dVarB3, D.b(cls2))) {
                string = (String) Long.valueOf(expoClientConfigRootObject.getLong(ViewProps.BACKGROUND_COLOR));
            } else if (AbstractC2855l.b(dVarB3, D.b(cls))) {
                string = (String) Boolean.valueOf(expoClientConfigRootObject.getBoolean(ViewProps.BACKGROUND_COLOR));
            } else if (AbstractC2855l.b(dVarB3, D.b(JSONArray.class))) {
                Object jSONArray3 = expoClientConfigRootObject.getJSONArray(ViewProps.BACKGROUND_COLOR);
                if (jSONArray3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                string = (String) jSONArray3;
            } else if (AbstractC2855l.b(dVarB3, D.b(JSONObject.class))) {
                Object jSONObject3 = expoClientConfigRootObject.getJSONObject(ViewProps.BACKGROUND_COLOR);
                if (jSONObject3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                string = (String) jSONObject3;
            } else {
                Object obj3 = expoClientConfigRootObject.get(ViewProps.BACKGROUND_COLOR);
                if (obj3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                string = (String) obj3;
            }
            return string;
        }
    }

    public final String getAndroidGoogleServicesFile() throws JSONException {
        JSONObject jSONObject;
        JSONObject expoClientConfigRootObject = getExpoClientConfigRootObject();
        if (expoClientConfigRootObject == null) {
            return null;
        }
        boolean zHas = expoClientConfigRootObject.has("android");
        Class cls = Boolean.TYPE;
        Class cls2 = Long.TYPE;
        Class cls3 = Integer.TYPE;
        Class cls4 = Double.TYPE;
        if (zHas) {
            d dVarB = D.b(JSONObject.class);
            if (AbstractC2855l.b(dVarB, D.b(String.class))) {
                Object string = expoClientConfigRootObject.getString("android");
                if (string == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) string;
            } else if (AbstractC2855l.b(dVarB, D.b(cls4))) {
                jSONObject = (JSONObject) Double.valueOf(expoClientConfigRootObject.getDouble("android"));
            } else if (AbstractC2855l.b(dVarB, D.b(cls3))) {
                jSONObject = (JSONObject) Integer.valueOf(expoClientConfigRootObject.getInt("android"));
            } else if (AbstractC2855l.b(dVarB, D.b(cls2))) {
                jSONObject = (JSONObject) Long.valueOf(expoClientConfigRootObject.getLong("android"));
            } else if (AbstractC2855l.b(dVarB, D.b(cls))) {
                jSONObject = (JSONObject) Boolean.valueOf(expoClientConfigRootObject.getBoolean("android"));
            } else if (AbstractC2855l.b(dVarB, D.b(JSONArray.class))) {
                Object jSONArray = expoClientConfigRootObject.getJSONArray("android");
                if (jSONArray == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) jSONArray;
            } else if (AbstractC2855l.b(dVarB, D.b(JSONObject.class))) {
                jSONObject = expoClientConfigRootObject.getJSONObject("android");
                if (jSONObject == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
            } else {
                Object obj = expoClientConfigRootObject.get("android");
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) obj;
            }
        } else {
            jSONObject = null;
        }
        if (jSONObject == null || !jSONObject.has("googleServicesFile")) {
            return null;
        }
        d dVarB2 = D.b(String.class);
        if (AbstractC2855l.b(dVarB2, D.b(String.class))) {
            String string2 = jSONObject.getString("googleServicesFile");
            if (string2 != null) {
                return string2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (AbstractC2855l.b(dVarB2, D.b(cls4))) {
            return (String) Double.valueOf(jSONObject.getDouble("googleServicesFile"));
        }
        if (AbstractC2855l.b(dVarB2, D.b(cls3))) {
            return (String) Integer.valueOf(jSONObject.getInt("googleServicesFile"));
        }
        if (AbstractC2855l.b(dVarB2, D.b(cls2))) {
            return (String) Long.valueOf(jSONObject.getLong("googleServicesFile"));
        }
        if (AbstractC2855l.b(dVarB2, D.b(cls))) {
            return (String) Boolean.valueOf(jSONObject.getBoolean("googleServicesFile"));
        }
        if (AbstractC2855l.b(dVarB2, D.b(JSONArray.class))) {
            Object jSONArray2 = jSONObject.getJSONArray("googleServicesFile");
            if (jSONArray2 != null) {
                return (String) jSONArray2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (AbstractC2855l.b(dVarB2, D.b(JSONObject.class))) {
            Object jSONObject2 = jSONObject.getJSONObject("googleServicesFile");
            if (jSONObject2 != null) {
                return (String) jSONObject2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        Object obj2 = jSONObject.get("googleServicesFile");
        if (obj2 != null) {
            return (String) obj2;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    public final String getAndroidKeyboardLayoutMode() throws JSONException {
        JSONObject jSONObject;
        JSONObject expoClientConfigRootObject = getExpoClientConfigRootObject();
        if (expoClientConfigRootObject == null) {
            return null;
        }
        boolean zHas = expoClientConfigRootObject.has("android");
        Class cls = Boolean.TYPE;
        Class cls2 = Long.TYPE;
        Class cls3 = Integer.TYPE;
        Class cls4 = Double.TYPE;
        if (zHas) {
            d dVarB = D.b(JSONObject.class);
            if (AbstractC2855l.b(dVarB, D.b(String.class))) {
                Object string = expoClientConfigRootObject.getString("android");
                if (string == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) string;
            } else if (AbstractC2855l.b(dVarB, D.b(cls4))) {
                jSONObject = (JSONObject) Double.valueOf(expoClientConfigRootObject.getDouble("android"));
            } else if (AbstractC2855l.b(dVarB, D.b(cls3))) {
                jSONObject = (JSONObject) Integer.valueOf(expoClientConfigRootObject.getInt("android"));
            } else if (AbstractC2855l.b(dVarB, D.b(cls2))) {
                jSONObject = (JSONObject) Long.valueOf(expoClientConfigRootObject.getLong("android"));
            } else if (AbstractC2855l.b(dVarB, D.b(cls))) {
                jSONObject = (JSONObject) Boolean.valueOf(expoClientConfigRootObject.getBoolean("android"));
            } else if (AbstractC2855l.b(dVarB, D.b(JSONArray.class))) {
                Object jSONArray = expoClientConfigRootObject.getJSONArray("android");
                if (jSONArray == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) jSONArray;
            } else if (AbstractC2855l.b(dVarB, D.b(JSONObject.class))) {
                jSONObject = expoClientConfigRootObject.getJSONObject("android");
                if (jSONObject == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
            } else {
                Object obj = expoClientConfigRootObject.get("android");
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) obj;
            }
        } else {
            jSONObject = null;
        }
        if (jSONObject == null || !jSONObject.has("softwareKeyboardLayoutMode")) {
            return null;
        }
        d dVarB2 = D.b(String.class);
        if (AbstractC2855l.b(dVarB2, D.b(String.class))) {
            String string2 = jSONObject.getString("softwareKeyboardLayoutMode");
            if (string2 != null) {
                return string2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (AbstractC2855l.b(dVarB2, D.b(cls4))) {
            return (String) Double.valueOf(jSONObject.getDouble("softwareKeyboardLayoutMode"));
        }
        if (AbstractC2855l.b(dVarB2, D.b(cls3))) {
            return (String) Integer.valueOf(jSONObject.getInt("softwareKeyboardLayoutMode"));
        }
        if (AbstractC2855l.b(dVarB2, D.b(cls2))) {
            return (String) Long.valueOf(jSONObject.getLong("softwareKeyboardLayoutMode"));
        }
        if (AbstractC2855l.b(dVarB2, D.b(cls))) {
            return (String) Boolean.valueOf(jSONObject.getBoolean("softwareKeyboardLayoutMode"));
        }
        if (AbstractC2855l.b(dVarB2, D.b(JSONArray.class))) {
            Object jSONArray2 = jSONObject.getJSONArray("softwareKeyboardLayoutMode");
            if (jSONArray2 != null) {
                return (String) jSONArray2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (AbstractC2855l.b(dVarB2, D.b(JSONObject.class))) {
            Object jSONObject2 = jSONObject.getJSONObject("softwareKeyboardLayoutMode");
            if (jSONObject2 != null) {
                return (String) jSONObject2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        Object obj2 = jSONObject.get("softwareKeyboardLayoutMode");
        if (obj2 != null) {
            return (String) obj2;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    public final JSONObject getAndroidNavigationBarOptions() throws JSONException {
        JSONObject expoClientConfigRootObject = getExpoClientConfigRootObject();
        if (expoClientConfigRootObject == null || !expoClientConfigRootObject.has("androidNavigationBar")) {
            return null;
        }
        d dVarB = D.b(JSONObject.class);
        if (AbstractC2855l.b(dVarB, D.b(String.class))) {
            Object string = expoClientConfigRootObject.getString("androidNavigationBar");
            if (string != null) {
                return (JSONObject) string;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        if (AbstractC2855l.b(dVarB, D.b(Double.TYPE))) {
            return (JSONObject) Double.valueOf(expoClientConfigRootObject.getDouble("androidNavigationBar"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Integer.TYPE))) {
            return (JSONObject) Integer.valueOf(expoClientConfigRootObject.getInt("androidNavigationBar"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Long.TYPE))) {
            return (JSONObject) Long.valueOf(expoClientConfigRootObject.getLong("androidNavigationBar"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Boolean.TYPE))) {
            return (JSONObject) Boolean.valueOf(expoClientConfigRootObject.getBoolean("androidNavigationBar"));
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONArray.class))) {
            Object jSONArray = expoClientConfigRootObject.getJSONArray("androidNavigationBar");
            if (jSONArray != null) {
                return (JSONObject) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONObject.class))) {
            JSONObject jSONObject = expoClientConfigRootObject.getJSONObject("androidNavigationBar");
            if (jSONObject != null) {
                return jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        Object obj = expoClientConfigRootObject.get("androidNavigationBar");
        if (obj != null) {
            return (JSONObject) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
    }

    public final String getAndroidPackageName() throws JSONException {
        JSONObject jSONObject;
        JSONObject expoClientConfigRootObject = getExpoClientConfigRootObject();
        if (expoClientConfigRootObject == null) {
            return null;
        }
        boolean zHas = expoClientConfigRootObject.has("android");
        Class cls = Boolean.TYPE;
        Class cls2 = Long.TYPE;
        Class cls3 = Integer.TYPE;
        Class cls4 = Double.TYPE;
        if (zHas) {
            d dVarB = D.b(JSONObject.class);
            if (AbstractC2855l.b(dVarB, D.b(String.class))) {
                Object string = expoClientConfigRootObject.getString("android");
                if (string == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) string;
            } else if (AbstractC2855l.b(dVarB, D.b(cls4))) {
                jSONObject = (JSONObject) Double.valueOf(expoClientConfigRootObject.getDouble("android"));
            } else if (AbstractC2855l.b(dVarB, D.b(cls3))) {
                jSONObject = (JSONObject) Integer.valueOf(expoClientConfigRootObject.getInt("android"));
            } else if (AbstractC2855l.b(dVarB, D.b(cls2))) {
                jSONObject = (JSONObject) Long.valueOf(expoClientConfigRootObject.getLong("android"));
            } else if (AbstractC2855l.b(dVarB, D.b(cls))) {
                jSONObject = (JSONObject) Boolean.valueOf(expoClientConfigRootObject.getBoolean("android"));
            } else if (AbstractC2855l.b(dVarB, D.b(JSONArray.class))) {
                Object jSONArray = expoClientConfigRootObject.getJSONArray("android");
                if (jSONArray == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) jSONArray;
            } else if (AbstractC2855l.b(dVarB, D.b(JSONObject.class))) {
                jSONObject = expoClientConfigRootObject.getJSONObject("android");
                if (jSONObject == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
            } else {
                Object obj = expoClientConfigRootObject.get("android");
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) obj;
            }
        } else {
            jSONObject = null;
        }
        if (jSONObject == null || !jSONObject.has("packageName")) {
            return null;
        }
        d dVarB2 = D.b(String.class);
        if (AbstractC2855l.b(dVarB2, D.b(String.class))) {
            String string2 = jSONObject.getString("packageName");
            if (string2 != null) {
                return string2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (AbstractC2855l.b(dVarB2, D.b(cls4))) {
            return (String) Double.valueOf(jSONObject.getDouble("packageName"));
        }
        if (AbstractC2855l.b(dVarB2, D.b(cls3))) {
            return (String) Integer.valueOf(jSONObject.getInt("packageName"));
        }
        if (AbstractC2855l.b(dVarB2, D.b(cls2))) {
            return (String) Long.valueOf(jSONObject.getLong("packageName"));
        }
        if (AbstractC2855l.b(dVarB2, D.b(cls))) {
            return (String) Boolean.valueOf(jSONObject.getBoolean("packageName"));
        }
        if (AbstractC2855l.b(dVarB2, D.b(JSONArray.class))) {
            Object jSONArray2 = jSONObject.getJSONArray("packageName");
            if (jSONArray2 != null) {
                return (String) jSONArray2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (AbstractC2855l.b(dVarB2, D.b(JSONObject.class))) {
            Object jSONObject2 = jSONObject.getJSONObject("packageName");
            if (jSONObject2 != null) {
                return (String) jSONObject2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        Object obj2 = jSONObject.get("packageName");
        if (obj2 != null) {
            return (String) obj2;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    public final JSONObject getAndroidSplashInfo() throws JSONException {
        JSONObject jSONObject;
        JSONObject expoClientConfigRootObject = getExpoClientConfigRootObject();
        if (expoClientConfigRootObject == null) {
            return null;
        }
        boolean zHas = expoClientConfigRootObject.has("android");
        Class cls = Boolean.TYPE;
        Class cls2 = Long.TYPE;
        Class cls3 = Integer.TYPE;
        Class cls4 = Double.TYPE;
        if (zHas) {
            d dVarB = D.b(JSONObject.class);
            if (AbstractC2855l.b(dVarB, D.b(String.class))) {
                Object string = expoClientConfigRootObject.getString("android");
                if (string == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) string;
            } else if (AbstractC2855l.b(dVarB, D.b(cls4))) {
                jSONObject = (JSONObject) Double.valueOf(expoClientConfigRootObject.getDouble("android"));
            } else if (AbstractC2855l.b(dVarB, D.b(cls3))) {
                jSONObject = (JSONObject) Integer.valueOf(expoClientConfigRootObject.getInt("android"));
            } else if (AbstractC2855l.b(dVarB, D.b(cls2))) {
                jSONObject = (JSONObject) Long.valueOf(expoClientConfigRootObject.getLong("android"));
            } else if (AbstractC2855l.b(dVarB, D.b(cls))) {
                jSONObject = (JSONObject) Boolean.valueOf(expoClientConfigRootObject.getBoolean("android"));
            } else if (AbstractC2855l.b(dVarB, D.b(JSONArray.class))) {
                Object jSONArray = expoClientConfigRootObject.getJSONArray("android");
                if (jSONArray == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) jSONArray;
            } else if (AbstractC2855l.b(dVarB, D.b(JSONObject.class))) {
                jSONObject = expoClientConfigRootObject.getJSONObject("android");
                if (jSONObject == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
            } else {
                Object obj = expoClientConfigRootObject.get("android");
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) obj;
            }
        } else {
            jSONObject = null;
        }
        if (jSONObject == null || !jSONObject.has("splash")) {
            return null;
        }
        d dVarB2 = D.b(JSONObject.class);
        if (AbstractC2855l.b(dVarB2, D.b(String.class))) {
            Object string2 = jSONObject.getString("splash");
            if (string2 != null) {
                return (JSONObject) string2;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        if (AbstractC2855l.b(dVarB2, D.b(cls4))) {
            return (JSONObject) Double.valueOf(jSONObject.getDouble("splash"));
        }
        if (AbstractC2855l.b(dVarB2, D.b(cls3))) {
            return (JSONObject) Integer.valueOf(jSONObject.getInt("splash"));
        }
        if (AbstractC2855l.b(dVarB2, D.b(cls2))) {
            return (JSONObject) Long.valueOf(jSONObject.getLong("splash"));
        }
        if (AbstractC2855l.b(dVarB2, D.b(cls))) {
            return (JSONObject) Boolean.valueOf(jSONObject.getBoolean("splash"));
        }
        if (AbstractC2855l.b(dVarB2, D.b(JSONArray.class))) {
            Object jSONArray2 = jSONObject.getJSONArray("splash");
            if (jSONArray2 != null) {
                return (JSONObject) jSONArray2;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        if (AbstractC2855l.b(dVarB2, D.b(JSONObject.class))) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("splash");
            if (jSONObject2 != null) {
                return jSONObject2;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        Object obj2 = jSONObject.get("splash");
        if (obj2 != null) {
            return (JSONObject) obj2;
        }
        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
    }

    public final JSONObject getAndroidStatusBarOptions() throws JSONException {
        JSONObject expoClientConfigRootObject = getExpoClientConfigRootObject();
        if (expoClientConfigRootObject == null || !expoClientConfigRootObject.has("androidStatusBar")) {
            return null;
        }
        d dVarB = D.b(JSONObject.class);
        if (AbstractC2855l.b(dVarB, D.b(String.class))) {
            Object string = expoClientConfigRootObject.getString("androidStatusBar");
            if (string != null) {
                return (JSONObject) string;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        if (AbstractC2855l.b(dVarB, D.b(Double.TYPE))) {
            return (JSONObject) Double.valueOf(expoClientConfigRootObject.getDouble("androidStatusBar"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Integer.TYPE))) {
            return (JSONObject) Integer.valueOf(expoClientConfigRootObject.getInt("androidStatusBar"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Long.TYPE))) {
            return (JSONObject) Long.valueOf(expoClientConfigRootObject.getLong("androidStatusBar"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Boolean.TYPE))) {
            return (JSONObject) Boolean.valueOf(expoClientConfigRootObject.getBoolean("androidStatusBar"));
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONArray.class))) {
            Object jSONArray = expoClientConfigRootObject.getJSONArray("androidStatusBar");
            if (jSONArray != null) {
                return (JSONObject) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONObject.class))) {
            JSONObject jSONObject = expoClientConfigRootObject.getJSONObject("androidStatusBar");
            if (jSONObject != null) {
                return jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        Object obj = expoClientConfigRootObject.get("androidStatusBar");
        if (obj != null) {
            return (JSONObject) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
    }

    public final String getAndroidUserInterfaceStyle() throws JSONException {
        String string;
        JSONObject jSONObject;
        Class cls = Boolean.TYPE;
        Class cls2 = Long.TYPE;
        Class cls3 = Integer.TYPE;
        Class cls4 = Double.TYPE;
        JSONObject expoClientConfigRootObject = getExpoClientConfigRootObject();
        if (expoClientConfigRootObject == null) {
            return null;
        }
        try {
            d dVarB = D.b(JSONObject.class);
            if (AbstractC2855l.b(dVarB, D.b(String.class))) {
                Object string2 = expoClientConfigRootObject.getString("android");
                if (string2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) string2;
            } else if (AbstractC2855l.b(dVarB, D.b(cls4))) {
                jSONObject = (JSONObject) Double.valueOf(expoClientConfigRootObject.getDouble("android"));
            } else if (AbstractC2855l.b(dVarB, D.b(cls3))) {
                jSONObject = (JSONObject) Integer.valueOf(expoClientConfigRootObject.getInt("android"));
            } else if (AbstractC2855l.b(dVarB, D.b(cls2))) {
                jSONObject = (JSONObject) Long.valueOf(expoClientConfigRootObject.getLong("android"));
            } else if (AbstractC2855l.b(dVarB, D.b(cls))) {
                jSONObject = (JSONObject) Boolean.valueOf(expoClientConfigRootObject.getBoolean("android"));
            } else if (AbstractC2855l.b(dVarB, D.b(JSONArray.class))) {
                Object jSONArray = expoClientConfigRootObject.getJSONArray("android");
                if (jSONArray == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) jSONArray;
            } else if (AbstractC2855l.b(dVarB, D.b(JSONObject.class))) {
                jSONObject = expoClientConfigRootObject.getJSONObject("android");
                if (jSONObject == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
            } else {
                Object obj = expoClientConfigRootObject.get("android");
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) obj;
            }
            d dVarB2 = D.b(String.class);
            if (AbstractC2855l.b(dVarB2, D.b(String.class))) {
                String string3 = jSONObject.getString("userInterfaceStyle");
                if (string3 != null) {
                    return string3;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            if (AbstractC2855l.b(dVarB2, D.b(cls4))) {
                return (String) Double.valueOf(jSONObject.getDouble("userInterfaceStyle"));
            }
            if (AbstractC2855l.b(dVarB2, D.b(cls3))) {
                return (String) Integer.valueOf(jSONObject.getInt("userInterfaceStyle"));
            }
            if (AbstractC2855l.b(dVarB2, D.b(cls2))) {
                return (String) Long.valueOf(jSONObject.getLong("userInterfaceStyle"));
            }
            if (AbstractC2855l.b(dVarB2, D.b(cls))) {
                return (String) Boolean.valueOf(jSONObject.getBoolean("userInterfaceStyle"));
            }
            if (AbstractC2855l.b(dVarB2, D.b(JSONArray.class))) {
                Object jSONArray2 = jSONObject.getJSONArray("userInterfaceStyle");
                if (jSONArray2 != null) {
                    return (String) jSONArray2;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            if (AbstractC2855l.b(dVarB2, D.b(JSONObject.class))) {
                Object jSONObject2 = jSONObject.getJSONObject("userInterfaceStyle");
                if (jSONObject2 != null) {
                    return (String) jSONObject2;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            Object obj2 = jSONObject.get("userInterfaceStyle");
            if (obj2 != null) {
                return (String) obj2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (JSONException unused) {
            if (!expoClientConfigRootObject.has("userInterfaceStyle")) {
                return null;
            }
            d dVarB3 = D.b(String.class);
            if (AbstractC2855l.b(dVarB3, D.b(String.class))) {
                string = expoClientConfigRootObject.getString("userInterfaceStyle");
                if (string == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            } else if (AbstractC2855l.b(dVarB3, D.b(cls4))) {
                string = (String) Double.valueOf(expoClientConfigRootObject.getDouble("userInterfaceStyle"));
            } else if (AbstractC2855l.b(dVarB3, D.b(cls3))) {
                string = (String) Integer.valueOf(expoClientConfigRootObject.getInt("userInterfaceStyle"));
            } else if (AbstractC2855l.b(dVarB3, D.b(cls2))) {
                string = (String) Long.valueOf(expoClientConfigRootObject.getLong("userInterfaceStyle"));
            } else if (AbstractC2855l.b(dVarB3, D.b(cls))) {
                string = (String) Boolean.valueOf(expoClientConfigRootObject.getBoolean("userInterfaceStyle"));
            } else if (AbstractC2855l.b(dVarB3, D.b(JSONArray.class))) {
                Object jSONArray3 = expoClientConfigRootObject.getJSONArray("userInterfaceStyle");
                if (jSONArray3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                string = (String) jSONArray3;
            } else if (AbstractC2855l.b(dVarB3, D.b(JSONObject.class))) {
                Object jSONObject3 = expoClientConfigRootObject.getJSONObject("userInterfaceStyle");
                if (jSONObject3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                string = (String) jSONObject3;
            } else {
                Object obj3 = expoClientConfigRootObject.get("userInterfaceStyle");
                if (obj3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                string = (String) obj3;
            }
            return string;
        }
    }

    public abstract String getAppKey();

    public abstract JSONArray getAssets();

    public abstract String getBundleURL() throws JSONException;

    public final String getDebuggerHost() throws JSONException {
        JSONObject expoGoConfigRootObject = getExpoGoConfigRootObject();
        AbstractC2855l.d(expoGoConfigRootObject);
        d dVarB = D.b(String.class);
        if (AbstractC2855l.b(dVarB, D.b(String.class))) {
            String string = expoGoConfigRootObject.getString("debuggerHost");
            if (string != null) {
                return string;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (AbstractC2855l.b(dVarB, D.b(Double.TYPE))) {
            return (String) Double.valueOf(expoGoConfigRootObject.getDouble("debuggerHost"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Integer.TYPE))) {
            return (String) Integer.valueOf(expoGoConfigRootObject.getInt("debuggerHost"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Long.TYPE))) {
            return (String) Long.valueOf(expoGoConfigRootObject.getLong("debuggerHost"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Boolean.TYPE))) {
            return (String) Boolean.valueOf(expoGoConfigRootObject.getBoolean("debuggerHost"));
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONArray.class))) {
            Object jSONArray = expoGoConfigRootObject.getJSONArray("debuggerHost");
            if (jSONArray != null) {
                return (String) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONObject.class))) {
            Object jSONObject = expoGoConfigRootObject.getJSONObject("debuggerHost");
            if (jSONObject != null) {
                return (String) jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        Object obj = expoGoConfigRootObject.get("debuggerHost");
        if (obj != null) {
            return (String) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    public abstract String getEASProjectID();

    public abstract JSONObject getExpoClientConfigRootObject();

    public abstract JSONObject getExpoGoConfigRootObject();

    public abstract String getExpoGoSDKVersion();

    public final String getFacebookAppId() throws JSONException {
        JSONObject expoClientConfigRootObject = getExpoClientConfigRootObject();
        AbstractC2855l.d(expoClientConfigRootObject);
        d dVarB = D.b(String.class);
        if (AbstractC2855l.b(dVarB, D.b(String.class))) {
            String string = expoClientConfigRootObject.getString("facebookAppId");
            if (string != null) {
                return string;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (AbstractC2855l.b(dVarB, D.b(Double.TYPE))) {
            return (String) Double.valueOf(expoClientConfigRootObject.getDouble("facebookAppId"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Integer.TYPE))) {
            return (String) Integer.valueOf(expoClientConfigRootObject.getInt("facebookAppId"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Long.TYPE))) {
            return (String) Long.valueOf(expoClientConfigRootObject.getLong("facebookAppId"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Boolean.TYPE))) {
            return (String) Boolean.valueOf(expoClientConfigRootObject.getBoolean("facebookAppId"));
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONArray.class))) {
            Object jSONArray = expoClientConfigRootObject.getJSONArray("facebookAppId");
            if (jSONArray != null) {
                return (String) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONObject.class))) {
            Object jSONObject = expoClientConfigRootObject.getJSONObject("facebookAppId");
            if (jSONObject != null) {
                return (String) jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        Object obj = expoClientConfigRootObject.get("facebookAppId");
        if (obj != null) {
            return (String) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    public final String getFacebookApplicationName() throws JSONException {
        JSONObject expoClientConfigRootObject = getExpoClientConfigRootObject();
        AbstractC2855l.d(expoClientConfigRootObject);
        d dVarB = D.b(String.class);
        if (AbstractC2855l.b(dVarB, D.b(String.class))) {
            String string = expoClientConfigRootObject.getString("facebookDisplayName");
            if (string != null) {
                return string;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (AbstractC2855l.b(dVarB, D.b(Double.TYPE))) {
            return (String) Double.valueOf(expoClientConfigRootObject.getDouble("facebookDisplayName"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Integer.TYPE))) {
            return (String) Integer.valueOf(expoClientConfigRootObject.getInt("facebookDisplayName"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Long.TYPE))) {
            return (String) Long.valueOf(expoClientConfigRootObject.getLong("facebookDisplayName"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Boolean.TYPE))) {
            return (String) Boolean.valueOf(expoClientConfigRootObject.getBoolean("facebookDisplayName"));
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONArray.class))) {
            Object jSONArray = expoClientConfigRootObject.getJSONArray("facebookDisplayName");
            if (jSONArray != null) {
                return (String) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONObject.class))) {
            Object jSONObject = expoClientConfigRootObject.getJSONObject("facebookDisplayName");
            if (jSONObject != null) {
                return (String) jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        Object obj = expoClientConfigRootObject.get("facebookDisplayName");
        if (obj != null) {
            return (String) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    public final boolean getFacebookAutoInitEnabled() throws JSONException {
        Boolean boolValueOf;
        JSONObject expoClientConfigRootObject = getExpoClientConfigRootObject();
        AbstractC2855l.d(expoClientConfigRootObject);
        d dVarB = D.b(Boolean.class);
        if (AbstractC2855l.b(dVarB, D.b(String.class))) {
            Object string = expoClientConfigRootObject.getString("facebookAutoInitEnabled");
            if (string == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
            }
            boolValueOf = (Boolean) string;
        } else if (AbstractC2855l.b(dVarB, D.b(Double.TYPE))) {
            boolValueOf = (Boolean) Double.valueOf(expoClientConfigRootObject.getDouble("facebookAutoInitEnabled"));
        } else if (AbstractC2855l.b(dVarB, D.b(Integer.TYPE))) {
            boolValueOf = (Boolean) Integer.valueOf(expoClientConfigRootObject.getInt("facebookAutoInitEnabled"));
        } else if (AbstractC2855l.b(dVarB, D.b(Long.TYPE))) {
            boolValueOf = (Boolean) Long.valueOf(expoClientConfigRootObject.getLong("facebookAutoInitEnabled"));
        } else if (AbstractC2855l.b(dVarB, D.b(Boolean.TYPE))) {
            boolValueOf = Boolean.valueOf(expoClientConfigRootObject.getBoolean("facebookAutoInitEnabled"));
        } else if (AbstractC2855l.b(dVarB, D.b(JSONArray.class))) {
            Object jSONArray = expoClientConfigRootObject.getJSONArray("facebookAutoInitEnabled");
            if (jSONArray == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
            }
            boolValueOf = (Boolean) jSONArray;
        } else if (AbstractC2855l.b(dVarB, D.b(JSONObject.class))) {
            Object jSONObject = expoClientConfigRootObject.getJSONObject("facebookAutoInitEnabled");
            if (jSONObject == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
            }
            boolValueOf = (Boolean) jSONObject;
        } else {
            Object obj = expoClientConfigRootObject.get("facebookAutoInitEnabled");
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
            }
            boolValueOf = (Boolean) obj;
        }
        return boolValueOf.booleanValue();
    }

    public final String getHostUri() throws JSONException {
        JSONObject expoClientConfigRootObject = getExpoClientConfigRootObject();
        if (expoClientConfigRootObject == null || !expoClientConfigRootObject.has("hostUri")) {
            return null;
        }
        d dVarB = D.b(String.class);
        if (AbstractC2855l.b(dVarB, D.b(String.class))) {
            String string = expoClientConfigRootObject.getString("hostUri");
            if (string != null) {
                return string;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (AbstractC2855l.b(dVarB, D.b(Double.TYPE))) {
            return (String) Double.valueOf(expoClientConfigRootObject.getDouble("hostUri"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Integer.TYPE))) {
            return (String) Integer.valueOf(expoClientConfigRootObject.getInt("hostUri"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Long.TYPE))) {
            return (String) Long.valueOf(expoClientConfigRootObject.getLong("hostUri"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Boolean.TYPE))) {
            return (String) Boolean.valueOf(expoClientConfigRootObject.getBoolean("hostUri"));
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONArray.class))) {
            Object jSONArray = expoClientConfigRootObject.getJSONArray("hostUri");
            if (jSONArray != null) {
                return (String) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONObject.class))) {
            Object jSONObject = expoClientConfigRootObject.getJSONObject("hostUri");
            if (jSONObject != null) {
                return (String) jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        Object obj = expoClientConfigRootObject.get("hostUri");
        if (obj != null) {
            return (String) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    public final String getIconUrl() throws JSONException {
        JSONObject expoClientConfigRootObject = getExpoClientConfigRootObject();
        if (expoClientConfigRootObject == null || !expoClientConfigRootObject.has("iconUrl")) {
            return null;
        }
        d dVarB = D.b(String.class);
        if (AbstractC2855l.b(dVarB, D.b(String.class))) {
            String string = expoClientConfigRootObject.getString("iconUrl");
            if (string != null) {
                return string;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (AbstractC2855l.b(dVarB, D.b(Double.TYPE))) {
            return (String) Double.valueOf(expoClientConfigRootObject.getDouble("iconUrl"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Integer.TYPE))) {
            return (String) Integer.valueOf(expoClientConfigRootObject.getInt("iconUrl"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Long.TYPE))) {
            return (String) Long.valueOf(expoClientConfigRootObject.getLong("iconUrl"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Boolean.TYPE))) {
            return (String) Boolean.valueOf(expoClientConfigRootObject.getBoolean("iconUrl"));
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONArray.class))) {
            Object jSONArray = expoClientConfigRootObject.getJSONArray("iconUrl");
            if (jSONArray != null) {
                return (String) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONObject.class))) {
            Object jSONObject = expoClientConfigRootObject.getJSONObject("iconUrl");
            if (jSONObject != null) {
                return (String) jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        Object obj = expoClientConfigRootObject.get("iconUrl");
        if (obj != null) {
            return (String) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    public final String getJsEngine() {
        return (String) this.jsEngine.getValue();
    }

    protected final JSONObject getJson() {
        return this.json;
    }

    public final String getLegacyID() throws JSONException {
        JSONObject jSONObject = this.json;
        d dVarB = D.b(String.class);
        if (AbstractC2855l.b(dVarB, D.b(String.class))) {
            String string = jSONObject.getString("id");
            if (string != null) {
                return string;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (AbstractC2855l.b(dVarB, D.b(Double.TYPE))) {
            return (String) Double.valueOf(jSONObject.getDouble("id"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Integer.TYPE))) {
            return (String) Integer.valueOf(jSONObject.getInt("id"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Long.TYPE))) {
            return (String) Long.valueOf(jSONObject.getLong("id"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Boolean.TYPE))) {
            return (String) Boolean.valueOf(jSONObject.getBoolean("id"));
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONArray.class))) {
            Object jSONArray = jSONObject.getJSONArray("id");
            if (jSONArray != null) {
                return (String) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONObject.class))) {
            Object jSONObject2 = jSONObject.getJSONObject("id");
            if (jSONObject2 != null) {
                return (String) jSONObject2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        Object obj = jSONObject.get("id");
        if (obj != null) {
            return (String) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    public final String getMainModuleName() throws JSONException {
        JSONObject expoGoConfigRootObject = getExpoGoConfigRootObject();
        if (expoGoConfigRootObject == null) {
            return "main";
        }
        d dVarB = D.b(String.class);
        if (AbstractC2855l.b(dVarB, D.b(String.class))) {
            String string = expoGoConfigRootObject.getString("mainModuleName");
            if (string != null) {
                return string;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (AbstractC2855l.b(dVarB, D.b(Double.TYPE))) {
            return (String) Double.valueOf(expoGoConfigRootObject.getDouble("mainModuleName"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Integer.TYPE))) {
            return (String) Integer.valueOf(expoGoConfigRootObject.getInt("mainModuleName"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Long.TYPE))) {
            return (String) Long.valueOf(expoGoConfigRootObject.getLong("mainModuleName"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Boolean.TYPE))) {
            return (String) Boolean.valueOf(expoGoConfigRootObject.getBoolean("mainModuleName"));
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONArray.class))) {
            Object jSONArray = expoGoConfigRootObject.getJSONArray("mainModuleName");
            if (jSONArray != null) {
                return (String) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONObject.class))) {
            Object jSONObject = expoGoConfigRootObject.getJSONObject("mainModuleName");
            if (jSONObject != null) {
                return (String) jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        Object obj = expoGoConfigRootObject.get("mainModuleName");
        if (obj != null) {
            return (String) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    public final JSONObject getMetadata() throws JSONException {
        JSONObject jSONObject = this.json;
        if (!jSONObject.has("metadata")) {
            return null;
        }
        d dVarB = D.b(JSONObject.class);
        if (AbstractC2855l.b(dVarB, D.b(String.class))) {
            Object string = jSONObject.getString("metadata");
            if (string != null) {
                return (JSONObject) string;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        if (AbstractC2855l.b(dVarB, D.b(Double.TYPE))) {
            return (JSONObject) Double.valueOf(jSONObject.getDouble("metadata"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Integer.TYPE))) {
            return (JSONObject) Integer.valueOf(jSONObject.getInt("metadata"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Long.TYPE))) {
            return (JSONObject) Long.valueOf(jSONObject.getLong("metadata"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Boolean.TYPE))) {
            return (JSONObject) Boolean.valueOf(jSONObject.getBoolean("metadata"));
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONArray.class))) {
            Object jSONArray = jSONObject.getJSONArray("metadata");
            if (jSONArray != null) {
                return (JSONObject) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONObject.class))) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("metadata");
            if (jSONObject2 != null) {
                return jSONObject2;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        Object obj = jSONObject.get("metadata");
        if (obj != null) {
            return (JSONObject) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
    }

    public final String getName() throws JSONException {
        JSONObject expoClientConfigRootObject = getExpoClientConfigRootObject();
        if (expoClientConfigRootObject == null || !expoClientConfigRootObject.has("name")) {
            return null;
        }
        d dVarB = D.b(String.class);
        if (AbstractC2855l.b(dVarB, D.b(String.class))) {
            String string = expoClientConfigRootObject.getString("name");
            if (string != null) {
                return string;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (AbstractC2855l.b(dVarB, D.b(Double.TYPE))) {
            return (String) Double.valueOf(expoClientConfigRootObject.getDouble("name"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Integer.TYPE))) {
            return (String) Integer.valueOf(expoClientConfigRootObject.getInt("name"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Long.TYPE))) {
            return (String) Long.valueOf(expoClientConfigRootObject.getLong("name"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Boolean.TYPE))) {
            return (String) Boolean.valueOf(expoClientConfigRootObject.getBoolean("name"));
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONArray.class))) {
            Object jSONArray = expoClientConfigRootObject.getJSONArray("name");
            if (jSONArray != null) {
                return (String) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONObject.class))) {
            Object jSONObject = expoClientConfigRootObject.getJSONObject("name");
            if (jSONObject != null) {
                return (String) jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        Object obj = expoClientConfigRootObject.get("name");
        if (obj != null) {
            return (String) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    public final String getOrientation() throws JSONException {
        JSONObject expoClientConfigRootObject = getExpoClientConfigRootObject();
        if (expoClientConfigRootObject == null || !expoClientConfigRootObject.has("orientation")) {
            return null;
        }
        d dVarB = D.b(String.class);
        if (AbstractC2855l.b(dVarB, D.b(String.class))) {
            String string = expoClientConfigRootObject.getString("orientation");
            if (string != null) {
                return string;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (AbstractC2855l.b(dVarB, D.b(Double.TYPE))) {
            return (String) Double.valueOf(expoClientConfigRootObject.getDouble("orientation"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Integer.TYPE))) {
            return (String) Integer.valueOf(expoClientConfigRootObject.getInt("orientation"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Long.TYPE))) {
            return (String) Long.valueOf(expoClientConfigRootObject.getLong("orientation"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Boolean.TYPE))) {
            return (String) Boolean.valueOf(expoClientConfigRootObject.getBoolean("orientation"));
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONArray.class))) {
            Object jSONArray = expoClientConfigRootObject.getJSONArray("orientation");
            if (jSONArray != null) {
                return (String) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONObject.class))) {
            Object jSONObject = expoClientConfigRootObject.getJSONObject("orientation");
            if (jSONObject != null) {
                return (String) jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        Object obj = expoClientConfigRootObject.get("orientation");
        if (obj != null) {
            return (String) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    public final Map<String, Object> getPluginProperties(String packageName) throws JSONException, IllegalArgumentException {
        JSONArray jSONArray;
        Object next;
        Pair<String, Map<String, Object>> plugin;
        AbstractC2855l.g(packageName, "packageName");
        JSONObject expoClientConfigRootObject = getExpoClientConfigRootObject();
        if (expoClientConfigRootObject != null) {
            if (expoClientConfigRootObject.has("plugins")) {
                d dVarB = D.b(JSONArray.class);
                if (AbstractC2855l.b(dVarB, D.b(String.class))) {
                    Object string = expoClientConfigRootObject.getString("plugins");
                    if (string == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
                    }
                    jSONArray = (JSONArray) string;
                } else if (AbstractC2855l.b(dVarB, D.b(Double.TYPE))) {
                    jSONArray = (JSONArray) Double.valueOf(expoClientConfigRootObject.getDouble("plugins"));
                } else if (AbstractC2855l.b(dVarB, D.b(Integer.TYPE))) {
                    jSONArray = (JSONArray) Integer.valueOf(expoClientConfigRootObject.getInt("plugins"));
                } else if (AbstractC2855l.b(dVarB, D.b(Long.TYPE))) {
                    jSONArray = (JSONArray) Long.valueOf(expoClientConfigRootObject.getLong("plugins"));
                } else if (AbstractC2855l.b(dVarB, D.b(Boolean.TYPE))) {
                    jSONArray = (JSONArray) Boolean.valueOf(expoClientConfigRootObject.getBoolean("plugins"));
                } else if (AbstractC2855l.b(dVarB, D.b(JSONArray.class))) {
                    jSONArray = expoClientConfigRootObject.getJSONArray("plugins");
                    if (jSONArray == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
                    }
                } else if (AbstractC2855l.b(dVarB, D.b(JSONObject.class))) {
                    Object jSONObject = expoClientConfigRootObject.getJSONObject("plugins");
                    if (jSONObject == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
                    }
                    jSONArray = (JSONArray) jSONObject;
                } else {
                    Object obj = expoClientConfigRootObject.get("plugins");
                    if (obj == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
                    }
                    jSONArray = (JSONArray) obj;
                }
            } else {
                jSONArray = null;
            }
            if (jSONArray != null) {
                List<PluginType> listFromRawArrayValue = PluginType.INSTANCE.fromRawArrayValue(jSONArray);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listFromRawArrayValue) {
                    if (obj2 instanceof PluginType.WithProps) {
                        arrayList.add(obj2);
                    }
                }
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (AbstractC2855l.b(((PluginType.WithProps) next).getPlugin().c(), packageName)) {
                        break;
                    }
                }
                PluginType.WithProps withProps = (PluginType.WithProps) next;
                if (withProps == null || (plugin = withProps.getPlugin()) == null) {
                    return null;
                }
                return (Map) plugin.d();
            }
        }
        return null;
    }

    public final String getPrimaryColor() throws JSONException {
        JSONObject expoClientConfigRootObject = getExpoClientConfigRootObject();
        if (expoClientConfigRootObject == null || !expoClientConfigRootObject.has("primaryColor")) {
            return null;
        }
        d dVarB = D.b(String.class);
        if (AbstractC2855l.b(dVarB, D.b(String.class))) {
            String string = expoClientConfigRootObject.getString("primaryColor");
            if (string != null) {
                return string;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (AbstractC2855l.b(dVarB, D.b(Double.TYPE))) {
            return (String) Double.valueOf(expoClientConfigRootObject.getDouble("primaryColor"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Integer.TYPE))) {
            return (String) Integer.valueOf(expoClientConfigRootObject.getInt("primaryColor"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Long.TYPE))) {
            return (String) Long.valueOf(expoClientConfigRootObject.getLong("primaryColor"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Boolean.TYPE))) {
            return (String) Boolean.valueOf(expoClientConfigRootObject.getBoolean("primaryColor"));
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONArray.class))) {
            Object jSONArray = expoClientConfigRootObject.getJSONArray("primaryColor");
            if (jSONArray != null) {
                return (String) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONObject.class))) {
            Object jSONObject = expoClientConfigRootObject.getJSONObject("primaryColor");
            if (jSONObject != null) {
                return (String) jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        Object obj = expoClientConfigRootObject.get("primaryColor");
        if (obj != null) {
            return (String) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    public final JSONObject getRawJson() {
        return this.json;
    }

    public final String getRevisionId() throws JSONException {
        JSONObject expoClientConfigRootObject = getExpoClientConfigRootObject();
        AbstractC2855l.d(expoClientConfigRootObject);
        d dVarB = D.b(String.class);
        if (AbstractC2855l.b(dVarB, D.b(String.class))) {
            String string = expoClientConfigRootObject.getString("revisionId");
            if (string != null) {
                return string;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (AbstractC2855l.b(dVarB, D.b(Double.TYPE))) {
            return (String) Double.valueOf(expoClientConfigRootObject.getDouble("revisionId"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Integer.TYPE))) {
            return (String) Integer.valueOf(expoClientConfigRootObject.getInt("revisionId"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Long.TYPE))) {
            return (String) Long.valueOf(expoClientConfigRootObject.getLong("revisionId"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Boolean.TYPE))) {
            return (String) Boolean.valueOf(expoClientConfigRootObject.getBoolean("revisionId"));
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONArray.class))) {
            Object jSONArray = expoClientConfigRootObject.getJSONArray("revisionId");
            if (jSONArray != null) {
                return (String) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONObject.class))) {
            Object jSONObject = expoClientConfigRootObject.getJSONObject("revisionId");
            if (jSONObject != null) {
                return (String) jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        Object obj = expoClientConfigRootObject.get("revisionId");
        if (obj != null) {
            return (String) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    public final JSONObject getRootSplashInfo() throws JSONException {
        JSONObject expoClientConfigRootObject = getExpoClientConfigRootObject();
        if (expoClientConfigRootObject == null || !expoClientConfigRootObject.has("splash")) {
            return null;
        }
        d dVarB = D.b(JSONObject.class);
        if (AbstractC2855l.b(dVarB, D.b(String.class))) {
            Object string = expoClientConfigRootObject.getString("splash");
            if (string != null) {
                return (JSONObject) string;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        if (AbstractC2855l.b(dVarB, D.b(Double.TYPE))) {
            return (JSONObject) Double.valueOf(expoClientConfigRootObject.getDouble("splash"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Integer.TYPE))) {
            return (JSONObject) Integer.valueOf(expoClientConfigRootObject.getInt("splash"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Long.TYPE))) {
            return (JSONObject) Long.valueOf(expoClientConfigRootObject.getLong("splash"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Boolean.TYPE))) {
            return (JSONObject) Boolean.valueOf(expoClientConfigRootObject.getBoolean("splash"));
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONArray.class))) {
            Object jSONArray = expoClientConfigRootObject.getJSONArray("splash");
            if (jSONArray != null) {
                return (JSONObject) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONObject.class))) {
            JSONObject jSONObject = expoClientConfigRootObject.getJSONObject("splash");
            if (jSONObject != null) {
                return jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        Object obj = expoClientConfigRootObject.get("splash");
        if (obj != null) {
            return (JSONObject) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
    }

    public abstract String getScopeKey() throws JSONException;

    public abstract String getSlug();

    public abstract String getStableLegacyID();

    public final JSONObject getUpdatesInfo() throws JSONException {
        JSONObject expoClientConfigRootObject = getExpoClientConfigRootObject();
        if (expoClientConfigRootObject == null || !expoClientConfigRootObject.has("updates")) {
            return null;
        }
        d dVarB = D.b(JSONObject.class);
        if (AbstractC2855l.b(dVarB, D.b(String.class))) {
            Object string = expoClientConfigRootObject.getString("updates");
            if (string != null) {
                return (JSONObject) string;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        if (AbstractC2855l.b(dVarB, D.b(Double.TYPE))) {
            return (JSONObject) Double.valueOf(expoClientConfigRootObject.getDouble("updates"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Integer.TYPE))) {
            return (JSONObject) Integer.valueOf(expoClientConfigRootObject.getInt("updates"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Long.TYPE))) {
            return (JSONObject) Long.valueOf(expoClientConfigRootObject.getLong("updates"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Boolean.TYPE))) {
            return (JSONObject) Boolean.valueOf(expoClientConfigRootObject.getBoolean("updates"));
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONArray.class))) {
            Object jSONArray = expoClientConfigRootObject.getJSONArray("updates");
            if (jSONArray != null) {
                return (JSONObject) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONObject.class))) {
            JSONObject jSONObject = expoClientConfigRootObject.getJSONObject("updates");
            if (jSONObject != null) {
                return jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        Object obj = expoClientConfigRootObject.get("updates");
        if (obj != null) {
            return (JSONObject) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
    }

    public final String getVersion() throws JSONException {
        JSONObject expoClientConfigRootObject = getExpoClientConfigRootObject();
        if (expoClientConfigRootObject == null || !expoClientConfigRootObject.has("version")) {
            return null;
        }
        d dVarB = D.b(String.class);
        if (AbstractC2855l.b(dVarB, D.b(String.class))) {
            String string = expoClientConfigRootObject.getString("version");
            if (string != null) {
                return string;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (AbstractC2855l.b(dVarB, D.b(Double.TYPE))) {
            return (String) Double.valueOf(expoClientConfigRootObject.getDouble("version"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Integer.TYPE))) {
            return (String) Integer.valueOf(expoClientConfigRootObject.getInt("version"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Long.TYPE))) {
            return (String) Long.valueOf(expoClientConfigRootObject.getLong("version"));
        }
        if (AbstractC2855l.b(dVarB, D.b(Boolean.TYPE))) {
            return (String) Boolean.valueOf(expoClientConfigRootObject.getBoolean("version"));
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONArray.class))) {
            Object jSONArray = expoClientConfigRootObject.getJSONArray("version");
            if (jSONArray != null) {
                return (String) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (AbstractC2855l.b(dVarB, D.b(JSONObject.class))) {
            Object jSONObject = expoClientConfigRootObject.getJSONObject("version");
            if (jSONObject != null) {
                return (String) jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        Object obj = expoClientConfigRootObject.get("version");
        if (obj != null) {
            return (String) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a5 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isDevelopmentMode() {
        JSONObject jSONObject;
        boolean zBooleanValue;
        Boolean boolValueOf;
        JSONObject expoGoConfigRootObject = getExpoGoConfigRootObject();
        if (expoGoConfigRootObject == null) {
            return false;
        }
        try {
            if (expoGoConfigRootObject.has("developer")) {
                boolean zHas = expoGoConfigRootObject.has("packagerOpts");
                Class cls = Boolean.TYPE;
                Class cls2 = Long.TYPE;
                Class cls3 = Integer.TYPE;
                Class cls4 = Double.TYPE;
                Boolean bool = null;
                if (zHas) {
                    d dVarB = D.b(JSONObject.class);
                    if (AbstractC2855l.b(dVarB, D.b(String.class))) {
                        Object string = expoGoConfigRootObject.getString("packagerOpts");
                        if (string == null) {
                            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                        }
                        jSONObject = (JSONObject) string;
                    } else if (AbstractC2855l.b(dVarB, D.b(cls4))) {
                        jSONObject = (JSONObject) Double.valueOf(expoGoConfigRootObject.getDouble("packagerOpts"));
                    } else if (AbstractC2855l.b(dVarB, D.b(cls3))) {
                        jSONObject = (JSONObject) Integer.valueOf(expoGoConfigRootObject.getInt("packagerOpts"));
                    } else if (AbstractC2855l.b(dVarB, D.b(cls2))) {
                        jSONObject = (JSONObject) Long.valueOf(expoGoConfigRootObject.getLong("packagerOpts"));
                    } else if (AbstractC2855l.b(dVarB, D.b(cls))) {
                        jSONObject = (JSONObject) Boolean.valueOf(expoGoConfigRootObject.getBoolean("packagerOpts"));
                    } else if (AbstractC2855l.b(dVarB, D.b(JSONArray.class))) {
                        Object jSONArray = expoGoConfigRootObject.getJSONArray("packagerOpts");
                        if (jSONArray == null) {
                            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                        }
                        jSONObject = (JSONObject) jSONArray;
                    } else if (AbstractC2855l.b(dVarB, D.b(JSONObject.class))) {
                        jSONObject = expoGoConfigRootObject.getJSONObject("packagerOpts");
                        if (jSONObject == null) {
                            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                        }
                    } else {
                        Object obj = expoGoConfigRootObject.get("packagerOpts");
                        if (obj == null) {
                            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                        }
                        jSONObject = (JSONObject) obj;
                    }
                } else {
                    jSONObject = null;
                }
                if (jSONObject == null) {
                    zBooleanValue = false;
                    if (!zBooleanValue) {
                        return true;
                    }
                } else {
                    if (jSONObject.has("dev")) {
                        d dVarB2 = D.b(Boolean.class);
                        if (AbstractC2855l.b(dVarB2, D.b(String.class))) {
                            Object string2 = jSONObject.getString("dev");
                            if (string2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                            }
                            boolValueOf = (Boolean) string2;
                        } else if (AbstractC2855l.b(dVarB2, D.b(cls4))) {
                            boolValueOf = (Boolean) Double.valueOf(jSONObject.getDouble("dev"));
                        } else if (AbstractC2855l.b(dVarB2, D.b(cls3))) {
                            boolValueOf = (Boolean) Integer.valueOf(jSONObject.getInt("dev"));
                        } else if (AbstractC2855l.b(dVarB2, D.b(cls2))) {
                            boolValueOf = (Boolean) Long.valueOf(jSONObject.getLong("dev"));
                        } else if (AbstractC2855l.b(dVarB2, D.b(cls))) {
                            boolValueOf = Boolean.valueOf(jSONObject.getBoolean("dev"));
                        } else if (AbstractC2855l.b(dVarB2, D.b(JSONArray.class))) {
                            Object jSONArray2 = jSONObject.getJSONArray("dev");
                            if (jSONArray2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                            }
                            boolValueOf = (Boolean) jSONArray2;
                        } else if (AbstractC2855l.b(dVarB2, D.b(JSONObject.class))) {
                            Object jSONObject2 = jSONObject.getJSONObject("dev");
                            if (jSONObject2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                            }
                            boolValueOf = (Boolean) jSONObject2;
                        } else {
                            Object obj2 = jSONObject.get("dev");
                            if (obj2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                            }
                            boolValueOf = (Boolean) obj2;
                        }
                        bool = boolValueOf;
                    }
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    }
                    if (!zBooleanValue) {
                    }
                }
            }
        } catch (JSONException unused) {
        }
        return false;
    }

    public final boolean isDevelopmentSilentLaunch() throws JSONException {
        JSONObject jSONObject;
        Boolean boolValueOf;
        JSONObject expoGoConfigRootObject = getExpoGoConfigRootObject();
        if (expoGoConfigRootObject == null) {
            return false;
        }
        boolean zHas = expoGoConfigRootObject.has("developmentClient");
        Class cls = Boolean.TYPE;
        Class cls2 = Long.TYPE;
        Class cls3 = Integer.TYPE;
        Class cls4 = Double.TYPE;
        Boolean bool = null;
        if (zHas) {
            d dVarB = D.b(JSONObject.class);
            if (AbstractC2855l.b(dVarB, D.b(String.class))) {
                Object string = expoGoConfigRootObject.getString("developmentClient");
                if (string == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) string;
            } else if (AbstractC2855l.b(dVarB, D.b(cls4))) {
                jSONObject = (JSONObject) Double.valueOf(expoGoConfigRootObject.getDouble("developmentClient"));
            } else if (AbstractC2855l.b(dVarB, D.b(cls3))) {
                jSONObject = (JSONObject) Integer.valueOf(expoGoConfigRootObject.getInt("developmentClient"));
            } else if (AbstractC2855l.b(dVarB, D.b(cls2))) {
                jSONObject = (JSONObject) Long.valueOf(expoGoConfigRootObject.getLong("developmentClient"));
            } else if (AbstractC2855l.b(dVarB, D.b(cls))) {
                jSONObject = (JSONObject) Boolean.valueOf(expoGoConfigRootObject.getBoolean("developmentClient"));
            } else if (AbstractC2855l.b(dVarB, D.b(JSONArray.class))) {
                Object jSONArray = expoGoConfigRootObject.getJSONArray("developmentClient");
                if (jSONArray == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) jSONArray;
            } else if (AbstractC2855l.b(dVarB, D.b(JSONObject.class))) {
                jSONObject = expoGoConfigRootObject.getJSONObject("developmentClient");
                if (jSONObject == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
            } else {
                Object obj = expoGoConfigRootObject.get("developmentClient");
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) obj;
            }
        } else {
            jSONObject = null;
        }
        if (jSONObject != null) {
            if (jSONObject.has("silentLaunch")) {
                d dVarB2 = D.b(Boolean.class);
                if (AbstractC2855l.b(dVarB2, D.b(String.class))) {
                    Object string2 = jSONObject.getString("silentLaunch");
                    if (string2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                    }
                    boolValueOf = (Boolean) string2;
                } else if (AbstractC2855l.b(dVarB2, D.b(cls4))) {
                    boolValueOf = (Boolean) Double.valueOf(jSONObject.getDouble("silentLaunch"));
                } else if (AbstractC2855l.b(dVarB2, D.b(cls3))) {
                    boolValueOf = (Boolean) Integer.valueOf(jSONObject.getInt("silentLaunch"));
                } else if (AbstractC2855l.b(dVarB2, D.b(cls2))) {
                    boolValueOf = (Boolean) Long.valueOf(jSONObject.getLong("silentLaunch"));
                } else if (AbstractC2855l.b(dVarB2, D.b(cls))) {
                    boolValueOf = Boolean.valueOf(jSONObject.getBoolean("silentLaunch"));
                } else if (AbstractC2855l.b(dVarB2, D.b(JSONArray.class))) {
                    Object jSONArray2 = jSONObject.getJSONArray("silentLaunch");
                    if (jSONArray2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                    }
                    boolValueOf = (Boolean) jSONArray2;
                } else if (AbstractC2855l.b(dVarB2, D.b(JSONObject.class))) {
                    Object jSONObject2 = jSONObject.getJSONObject("silentLaunch");
                    if (jSONObject2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                    }
                    boolValueOf = (Boolean) jSONObject2;
                } else {
                    Object obj2 = jSONObject.get("silentLaunch");
                    if (obj2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                    }
                    boolValueOf = (Boolean) obj2;
                }
                bool = boolValueOf;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return false;
    }

    public final boolean isUsingDeveloperTool() throws JSONException {
        JSONObject jSONObject;
        JSONObject expoGoConfigRootObject = getExpoGoConfigRootObject();
        if (expoGoConfigRootObject == null) {
            return false;
        }
        if (expoGoConfigRootObject.has("developer")) {
            d dVarB = D.b(JSONObject.class);
            if (AbstractC2855l.b(dVarB, D.b(String.class))) {
                Object string = expoGoConfigRootObject.getString("developer");
                if (string == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) string;
            } else if (AbstractC2855l.b(dVarB, D.b(Double.TYPE))) {
                jSONObject = (JSONObject) Double.valueOf(expoGoConfigRootObject.getDouble("developer"));
            } else if (AbstractC2855l.b(dVarB, D.b(Integer.TYPE))) {
                jSONObject = (JSONObject) Integer.valueOf(expoGoConfigRootObject.getInt("developer"));
            } else if (AbstractC2855l.b(dVarB, D.b(Long.TYPE))) {
                jSONObject = (JSONObject) Long.valueOf(expoGoConfigRootObject.getLong("developer"));
            } else if (AbstractC2855l.b(dVarB, D.b(Boolean.TYPE))) {
                jSONObject = (JSONObject) Boolean.valueOf(expoGoConfigRootObject.getBoolean("developer"));
            } else if (AbstractC2855l.b(dVarB, D.b(JSONArray.class))) {
                Object jSONArray = expoGoConfigRootObject.getJSONArray("developer");
                if (jSONArray == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) jSONArray;
            } else if (AbstractC2855l.b(dVarB, D.b(JSONObject.class))) {
                jSONObject = expoGoConfigRootObject.getJSONObject("developer");
                if (jSONObject == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
            } else {
                Object obj = expoGoConfigRootObject.get("developer");
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) obj;
            }
        } else {
            jSONObject = null;
        }
        if (jSONObject != null) {
            return jSONObject.has("tool");
        }
        return false;
    }

    public final boolean isVerified() throws JSONException {
        Boolean boolValueOf;
        JSONObject jSONObject = this.json;
        if (jSONObject.has("isVerified")) {
            d dVarB = D.b(Boolean.class);
            if (AbstractC2855l.b(dVarB, D.b(String.class))) {
                Object string = jSONObject.getString("isVerified");
                if (string == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                }
                boolValueOf = (Boolean) string;
            } else if (AbstractC2855l.b(dVarB, D.b(Double.TYPE))) {
                boolValueOf = (Boolean) Double.valueOf(jSONObject.getDouble("isVerified"));
            } else if (AbstractC2855l.b(dVarB, D.b(Integer.TYPE))) {
                boolValueOf = (Boolean) Integer.valueOf(jSONObject.getInt("isVerified"));
            } else if (AbstractC2855l.b(dVarB, D.b(Long.TYPE))) {
                boolValueOf = (Boolean) Long.valueOf(jSONObject.getLong("isVerified"));
            } else if (AbstractC2855l.b(dVarB, D.b(Boolean.TYPE))) {
                boolValueOf = Boolean.valueOf(jSONObject.getBoolean("isVerified"));
            } else if (AbstractC2855l.b(dVarB, D.b(JSONArray.class))) {
                Object jSONArray = jSONObject.getJSONArray("isVerified");
                if (jSONArray == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                }
                boolValueOf = (Boolean) jSONArray;
            } else if (AbstractC2855l.b(dVarB, D.b(JSONObject.class))) {
                Object jSONObject2 = jSONObject.getJSONObject("isVerified");
                if (jSONObject2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                }
                boolValueOf = (Boolean) jSONObject2;
            } else {
                Object obj = jSONObject.get("isVerified");
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                }
                boolValueOf = (Boolean) obj;
            }
        } else {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    public final boolean shouldUseNextNotificationsApi() throws JSONException {
        JSONObject jSONObject;
        Boolean boolValueOf;
        JSONObject expoClientConfigRootObject = getExpoClientConfigRootObject();
        if (expoClientConfigRootObject == null) {
            return false;
        }
        boolean zHas = expoClientConfigRootObject.has("android");
        Class cls = Boolean.TYPE;
        Class cls2 = Long.TYPE;
        Class cls3 = Integer.TYPE;
        Class cls4 = Double.TYPE;
        Boolean bool = null;
        if (zHas) {
            d dVarB = D.b(JSONObject.class);
            if (AbstractC2855l.b(dVarB, D.b(String.class))) {
                Object string = expoClientConfigRootObject.getString("android");
                if (string == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) string;
            } else if (AbstractC2855l.b(dVarB, D.b(cls4))) {
                jSONObject = (JSONObject) Double.valueOf(expoClientConfigRootObject.getDouble("android"));
            } else if (AbstractC2855l.b(dVarB, D.b(cls3))) {
                jSONObject = (JSONObject) Integer.valueOf(expoClientConfigRootObject.getInt("android"));
            } else if (AbstractC2855l.b(dVarB, D.b(cls2))) {
                jSONObject = (JSONObject) Long.valueOf(expoClientConfigRootObject.getLong("android"));
            } else if (AbstractC2855l.b(dVarB, D.b(cls))) {
                jSONObject = (JSONObject) Boolean.valueOf(expoClientConfigRootObject.getBoolean("android"));
            } else if (AbstractC2855l.b(dVarB, D.b(JSONArray.class))) {
                Object jSONArray = expoClientConfigRootObject.getJSONArray("android");
                if (jSONArray == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) jSONArray;
            } else if (AbstractC2855l.b(dVarB, D.b(JSONObject.class))) {
                jSONObject = expoClientConfigRootObject.getJSONObject("android");
                if (jSONObject == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
            } else {
                Object obj = expoClientConfigRootObject.get("android");
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) obj;
            }
        } else {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return false;
        }
        if (jSONObject.has("useNextNotificationsApi")) {
            d dVarB2 = D.b(Boolean.class);
            if (AbstractC2855l.b(dVarB2, D.b(String.class))) {
                Object string2 = jSONObject.getString("useNextNotificationsApi");
                if (string2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                }
                boolValueOf = (Boolean) string2;
            } else if (AbstractC2855l.b(dVarB2, D.b(cls4))) {
                boolValueOf = (Boolean) Double.valueOf(jSONObject.getDouble("useNextNotificationsApi"));
            } else if (AbstractC2855l.b(dVarB2, D.b(cls3))) {
                boolValueOf = (Boolean) Integer.valueOf(jSONObject.getInt("useNextNotificationsApi"));
            } else if (AbstractC2855l.b(dVarB2, D.b(cls2))) {
                boolValueOf = (Boolean) Long.valueOf(jSONObject.getLong("useNextNotificationsApi"));
            } else if (AbstractC2855l.b(dVarB2, D.b(cls))) {
                boolValueOf = Boolean.valueOf(jSONObject.getBoolean("useNextNotificationsApi"));
            } else if (AbstractC2855l.b(dVarB2, D.b(JSONArray.class))) {
                Object jSONArray2 = jSONObject.getJSONArray("useNextNotificationsApi");
                if (jSONArray2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                }
                boolValueOf = (Boolean) jSONArray2;
            } else if (AbstractC2855l.b(dVarB2, D.b(JSONObject.class))) {
                Object jSONObject2 = jSONObject.getJSONObject("useNextNotificationsApi");
                if (jSONObject2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                }
                boolValueOf = (Boolean) jSONObject2;
            } else {
                Object obj2 = jSONObject.get("useNextNotificationsApi");
                if (obj2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                }
                boolValueOf = (Boolean) obj2;
            }
            bool = boolValueOf;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public String toString() {
        String string = getRawJson().toString();
        AbstractC2855l.f(string, "toString(...)");
        return string;
    }
}
