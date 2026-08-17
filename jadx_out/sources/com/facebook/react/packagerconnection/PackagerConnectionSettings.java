package com.facebook.react.packagerconnection;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.facebook.react.modules.systeminfo.AndroidInfoHelpers;
import com.facebook.react.uimanager.events.PointerEventHelper;
import d2.AbstractC2325a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u000f\b\u0016\u0018\u0000 ,2\u00020\u0001:\u0001,B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ9\u0010\r\u001a\u00020\u00062*\u0010\f\u001a&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n0\t¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R:\u0010!\u001a&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n0\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010#\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u001bR$\u0010(\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u000b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b%\u0010\u001d\"\u0004\b&\u0010'R\u001d\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n8F¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lcom/facebook/react/packagerconnection/PackagerConnectionSettings;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Landroid/content/Context;", "appContext", "<init>", "(Landroid/content/Context;)V", "Li7/B;", "resetDebugServerHost", "()V", "Lkotlin/Function1;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "queryMapper", "setPackagerOptionsUpdater", "(Lkotlin/jvm/functions/Function1;)V", "options", "updatePackagerOptions", "(Ljava/util/Map;)Ljava/util/Map;", "key", "value", "setAdditionalOptionForPackager", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/content/Context;", "Landroid/content/SharedPreferences;", "preferences", "Landroid/content/SharedPreferences;", "packageName", "Ljava/lang/String;", "getPackageName", "()Ljava/lang/String;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "_additionalOptionsForPackager", "Ljava/util/Map;", "_packagerOptionsUpdater", "Lkotlin/jvm/functions/Function1;", "cachedHost", "host", "getDebugServerHost", "setDebugServerHost", "(Ljava/lang/String;)V", "debugServerHost", "getAdditionalOptionsForPackager", "()Ljava/util/Map;", "additionalOptionsForPackager", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class PackagerConnectionSettings {
    private static final String PREFS_DEBUG_SERVER_HOST_KEY = "debug_http_host";
    private final Map<String, String> _additionalOptionsForPackager;
    private Function1 _packagerOptionsUpdater;
    private final Context appContext;
    private String cachedHost;
    private final String packageName;
    private final SharedPreferences preferences;
    private static final Companion Companion = new Companion(null);
    private static final String TAG = PackagerConnectionSettings.class.getSimpleName();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/facebook/react/packagerconnection/PackagerConnectionSettings$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "TAG", PointerEventHelper.POINTER_TYPE_UNKNOWN, "kotlin.jvm.PlatformType", "PREFS_DEBUG_SERVER_HOST_KEY", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public PackagerConnectionSettings(Context appContext) {
        AbstractC2855l.g(appContext, "appContext");
        this.appContext = appContext;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(appContext);
        AbstractC2855l.f(defaultSharedPreferences, "getDefaultSharedPreferences(...)");
        this.preferences = defaultSharedPreferences;
        String packageName = appContext.getPackageName();
        AbstractC2855l.f(packageName, "getPackageName(...)");
        this.packageName = packageName;
        this._additionalOptionsForPackager = new LinkedHashMap();
        this._packagerOptionsUpdater = new Function1() { // from class: com.facebook.react.packagerconnection.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PackagerConnectionSettings._packagerOptionsUpdater$lambda$0((Map) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map _packagerOptionsUpdater$lambda$0(Map it) {
        AbstractC2855l.g(it, "it");
        return it;
    }

    public final Map<String, String> getAdditionalOptionsForPackager() {
        return this._additionalOptionsForPackager;
    }

    public String getDebugServerHost() {
        String str = this.cachedHost;
        if (str != null) {
            return str;
        }
        String string = this.preferences.getString(PREFS_DEBUG_SERVER_HOST_KEY, null);
        if (string != null && string.length() != 0) {
            return string;
        }
        String serverHost = AndroidInfoHelpers.getServerHost(this.appContext);
        if (AbstractC2855l.b(serverHost, AndroidInfoHelpers.DEVICE_LOCALHOST)) {
            AbstractC2325a.I(TAG, "You seem to be running on device. Run '" + AndroidInfoHelpers.getAdbReverseTcpCommand(this.appContext) + "' to forward the debug server's port to the device.");
        }
        this.cachedHost = serverHost;
        return serverHost;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public void resetDebugServerHost() {
        this.cachedHost = null;
    }

    public final void setAdditionalOptionForPackager(String key, String value) {
        AbstractC2855l.g(key, "key");
        AbstractC2855l.g(value, "value");
        this._additionalOptionsForPackager.put(key, value);
    }

    public void setDebugServerHost(String host) {
        AbstractC2855l.g(host, "host");
        if (host.length() == 0) {
            this.cachedHost = null;
        } else {
            this.cachedHost = host;
        }
    }

    public final void setPackagerOptionsUpdater(Function1 queryMapper) {
        AbstractC2855l.g(queryMapper, "queryMapper");
        this._packagerOptionsUpdater = queryMapper;
    }

    public final Map<String, String> updatePackagerOptions(Map<String, String> options) {
        AbstractC2855l.g(options, "options");
        return (Map) this._packagerOptionsUpdater.invoke(options);
    }
}
