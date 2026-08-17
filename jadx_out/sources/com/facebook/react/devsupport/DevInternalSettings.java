package com.facebook.react.devsupport;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.modules.debug.interfaces.DeveloperSettings;
import com.facebook.react.modules.dialog.AlertFragment;
import com.facebook.react.packagerconnection.PackagerConnectionSettings;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0000\u0018\u0000 02\u00020\u00012\u00020\u0002:\u000210B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\u001c\u001a\u00020\u001b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010\"\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u001b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R$\u0010%\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u001b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 R$\u0010'\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u001b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b'\u0010\u001e\"\u0004\b(\u0010 R$\u0010)\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u001b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b)\u0010\u001e\"\u0004\b*\u0010 R$\u0010+\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u001b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b+\u0010\u001e\"\u0004\b,\u0010 R$\u0010.\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020\u001b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b.\u0010\u001e\"\u0004\b/\u0010 ¨\u00062"}, d2 = {"Lcom/facebook/react/devsupport/DevInternalSettings;", "Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "Landroid/content/Context;", "applicationContext", "Lcom/facebook/react/devsupport/DevInternalSettings$Listener;", "listener", "<init>", "(Landroid/content/Context;Lcom/facebook/react/devsupport/DevInternalSettings$Listener;)V", "Landroid/content/SharedPreferences;", "sharedPreferences", PointerEventHelper.POINTER_TYPE_UNKNOWN, "key", "Li7/B;", "onSharedPreferenceChanged", "(Landroid/content/SharedPreferences;Ljava/lang/String;)V", AlertFragment.ARG_TITLE, "addMenuItem", "(Ljava/lang/String;)V", "Lcom/facebook/react/devsupport/DevInternalSettings$Listener;", "preferences", "Landroid/content/SharedPreferences;", "Lcom/facebook/react/packagerconnection/PackagerConnectionSettings;", "packagerConnectionSettings", "Lcom/facebook/react/packagerconnection/PackagerConnectionSettings;", "getPackagerConnectionSettings", "()Lcom/facebook/react/packagerconnection/PackagerConnectionSettings;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isDeviceDebugEnabled", "Z", "()Z", "setDeviceDebugEnabled", "(Z)V", "value", "isFpsDebugEnabled", "setFpsDebugEnabled", "_", "isAnimationFpsDebugEnabled", "setAnimationFpsDebugEnabled", "isJSDevModeEnabled", "setJSDevModeEnabled", "isJSMinifyEnabled", "setJSMinifyEnabled", "isElementInspectorEnabled", "setElementInspectorEnabled", ViewProps.ENABLED, "isHotModuleReplacementEnabled", "setHotModuleReplacementEnabled", "Companion", "Listener", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DevInternalSettings implements DeveloperSettings, SharedPreferences.OnSharedPreferenceChangeListener {
    private static final String PREFS_ANIMATIONS_DEBUG_KEY = "animations_debug";
    private static final String PREFS_FPS_DEBUG_KEY = "fps_debug";
    private static final String PREFS_HOT_MODULE_REPLACEMENT_KEY = "hot_module_replacement";
    private static final String PREFS_INSPECTOR_DEBUG_KEY = "inspector_debug";
    private static final String PREFS_JS_DEV_MODE_DEBUG_KEY = "js_dev_mode_debug";
    private static final String PREFS_JS_MINIFY_DEBUG_KEY = "js_minify_debug";
    private boolean isDeviceDebugEnabled;
    private final Listener listener;
    private final PackagerConnectionSettings packagerConnectionSettings;
    private final SharedPreferences preferences;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lcom/facebook/react/devsupport/DevInternalSettings$Listener;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Li7/B;", "onInternalSettingsChanged", "()V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Listener {
        void onInternalSettingsChanged();
    }

    public DevInternalSettings(Context applicationContext, Listener listener) {
        AbstractC2855l.g(applicationContext, "applicationContext");
        this.listener = listener;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        AbstractC2855l.f(defaultSharedPreferences, "getDefaultSharedPreferences(...)");
        this.preferences = defaultSharedPreferences;
        this.packagerConnectionSettings = new PackagerConnectionSettings(applicationContext);
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
        this.isDeviceDebugEnabled = ReactBuildConfig.DEBUG;
    }

    @Override // com.facebook.react.modules.debug.interfaces.DeveloperSettings
    public void addMenuItem(String title) {
        AbstractC2855l.g(title, "title");
    }

    @Override // com.facebook.react.modules.debug.interfaces.DeveloperSettings
    public PackagerConnectionSettings getPackagerConnectionSettings() {
        return this.packagerConnectionSettings;
    }

    @Override // com.facebook.react.modules.debug.interfaces.DeveloperSettings
    public boolean isAnimationFpsDebugEnabled() {
        return this.preferences.getBoolean(PREFS_ANIMATIONS_DEBUG_KEY, false);
    }

    @Override // com.facebook.react.modules.debug.interfaces.DeveloperSettings
    /* JADX INFO: renamed from: isDeviceDebugEnabled, reason: from getter */
    public boolean getIsDeviceDebugEnabled() {
        return this.isDeviceDebugEnabled;
    }

    @Override // com.facebook.react.modules.debug.interfaces.DeveloperSettings
    public boolean isElementInspectorEnabled() {
        return this.preferences.getBoolean(PREFS_INSPECTOR_DEBUG_KEY, false);
    }

    @Override // com.facebook.react.modules.debug.interfaces.DeveloperSettings
    public boolean isFpsDebugEnabled() {
        return this.preferences.getBoolean(PREFS_FPS_DEBUG_KEY, false);
    }

    @Override // com.facebook.react.modules.debug.interfaces.DeveloperSettings
    public boolean isHotModuleReplacementEnabled() {
        return this.preferences.getBoolean(PREFS_HOT_MODULE_REPLACEMENT_KEY, true);
    }

    @Override // com.facebook.react.modules.debug.interfaces.DeveloperSettings
    public boolean isJSDevModeEnabled() {
        return this.preferences.getBoolean(PREFS_JS_DEV_MODE_DEBUG_KEY, true);
    }

    @Override // com.facebook.react.modules.debug.interfaces.DeveloperSettings
    public boolean isJSMinifyEnabled() {
        return this.preferences.getBoolean(PREFS_JS_MINIFY_DEBUG_KEY, false);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {
        AbstractC2855l.g(sharedPreferences, "sharedPreferences");
        if (this.listener != null) {
            if (AbstractC2855l.b(PREFS_FPS_DEBUG_KEY, key) || AbstractC2855l.b(PREFS_JS_DEV_MODE_DEBUG_KEY, key) || AbstractC2855l.b(PREFS_JS_MINIFY_DEBUG_KEY, key)) {
                this.listener.onInternalSettingsChanged();
            }
        }
    }

    @Override // com.facebook.react.modules.debug.interfaces.DeveloperSettings
    public void setDeviceDebugEnabled(boolean z10) {
        this.isDeviceDebugEnabled = z10;
    }

    @Override // com.facebook.react.modules.debug.interfaces.DeveloperSettings
    public void setElementInspectorEnabled(boolean z10) {
        this.preferences.edit().putBoolean(PREFS_INSPECTOR_DEBUG_KEY, z10).apply();
    }

    @Override // com.facebook.react.modules.debug.interfaces.DeveloperSettings
    public void setFpsDebugEnabled(boolean z10) {
        this.preferences.edit().putBoolean(PREFS_FPS_DEBUG_KEY, z10).apply();
    }

    @Override // com.facebook.react.modules.debug.interfaces.DeveloperSettings
    public void setHotModuleReplacementEnabled(boolean z10) {
        this.preferences.edit().putBoolean(PREFS_HOT_MODULE_REPLACEMENT_KEY, z10).apply();
    }

    @Override // com.facebook.react.modules.debug.interfaces.DeveloperSettings
    public void setJSDevModeEnabled(boolean z10) {
        this.preferences.edit().putBoolean(PREFS_JS_DEV_MODE_DEBUG_KEY, z10).apply();
    }

    @Override // com.facebook.react.modules.debug.interfaces.DeveloperSettings
    public void setAnimationFpsDebugEnabled(boolean z10) {
    }

    @Override // com.facebook.react.modules.debug.interfaces.DeveloperSettings
    public void setJSMinifyEnabled(boolean z10) {
    }
}
