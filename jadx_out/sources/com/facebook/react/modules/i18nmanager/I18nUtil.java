package com.facebook.react.modules.i18nmanager;

import G0.o;
import P8.q;
import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.hermes.intl.Constants;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ'\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\bJ\u001d\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\bJ\u001d\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u0016J\u001d\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/facebook/react/modules/i18nmanager/I18nUtil;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Landroid/content/Context;", "context", PointerEventHelper.POINTER_TYPE_UNKNOWN, "applicationHasRtlSupport", "(Landroid/content/Context;)Z", "isRTLAllowed", "isRTLForced", PointerEventHelper.POINTER_TYPE_UNKNOWN, "key", "defaultValue", "isPrefSet", "(Landroid/content/Context;Ljava/lang/String;Z)Z", "value", "Li7/B;", "setPref", "(Landroid/content/Context;Ljava/lang/String;Z)V", "isRTL", "allowRTL", "(Landroid/content/Context;Z)V", "doLeftAndRightSwapInRTL", "flip", "swapLeftAndRightInRTL", "forceRTL", "isDevicePreferredLanguageRTL", "()Z", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class I18nUtil {
    private static final String KEY_FOR_PERFS_MAKE_RTL_FLIP_LEFT_AND_RIGHT_STYLES = "RCTI18nUtil_makeRTLFlipLeftAndRightStyles";
    private static final String KEY_FOR_PREFS_ALLOWRTL = "RCTI18nUtil_allowRTL";
    private static final String KEY_FOR_PREFS_FORCERTL = "RCTI18nUtil_forceRTL";
    private static final String SHARED_PREFS_NAME = "com.facebook.react.modules.i18nmanager.I18nUtil";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final I18nUtil instance = new I18nUtil();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0002\b\rR\u0013\u0010\u0004\u001a\u00020\u00058G¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/facebook/react/modules/i18nmanager/I18nUtil$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "instance", "Lcom/facebook/react/modules/i18nmanager/I18nUtil;", "getInstance", "()Lcom/facebook/react/modules/i18nmanager/I18nUtil;", "SHARED_PREFS_NAME", PointerEventHelper.POINTER_TYPE_UNKNOWN, "KEY_FOR_PREFS_ALLOWRTL", "KEY_FOR_PREFS_FORCERTL", "KEY_FOR_PERFS_MAKE_RTL_FLIP_LEFT_AND_RIGHT_STYLES", "DEPRECATED$getInstance", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final I18nUtil DEPRECATED$getInstance() {
            return getInstance();
        }

        public final I18nUtil getInstance() {
            return I18nUtil.instance;
        }

        private Companion() {
        }
    }

    private I18nUtil() {
    }

    private final boolean applicationHasRtlSupport(Context context) {
        return (context.getApplicationInfo().flags & 4194304) != 0;
    }

    public static final I18nUtil getInstance() {
        return INSTANCE.getInstance();
    }

    private final boolean isDevicePreferredLanguageRTL() {
        return o.a(Locale.getAvailableLocales()[0]) == 1;
    }

    private final boolean isPrefSet(Context context, String key, boolean defaultValue) {
        return context.getSharedPreferences(SHARED_PREFS_NAME, 0).getBoolean(key, defaultValue);
    }

    private final boolean isRTLAllowed(Context context) {
        return isPrefSet(context, KEY_FOR_PREFS_ALLOWRTL, true);
    }

    private final boolean isRTLForced(Context context) {
        return isPrefSet(context, KEY_FOR_PREFS_FORCERTL, false) || q.x(System.getProperty("FORCE_RTL_FOR_TESTING", Constants.CASEFIRST_FALSE), "true", true);
    }

    private final void setPref(Context context, String key, boolean value) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(SHARED_PREFS_NAME, 0).edit();
        editorEdit.putBoolean(key, value);
        editorEdit.apply();
    }

    public final void allowRTL(Context context, boolean allowRTL) {
        AbstractC2855l.g(context, "context");
        setPref(context, KEY_FOR_PREFS_ALLOWRTL, allowRTL);
    }

    public final boolean doLeftAndRightSwapInRTL(Context context) {
        AbstractC2855l.g(context, "context");
        return isPrefSet(context, KEY_FOR_PERFS_MAKE_RTL_FLIP_LEFT_AND_RIGHT_STYLES, true);
    }

    public final void forceRTL(Context context, boolean forceRTL) {
        AbstractC2855l.g(context, "context");
        setPref(context, KEY_FOR_PREFS_FORCERTL, forceRTL);
    }

    public final boolean isRTL(Context context) {
        AbstractC2855l.g(context, "context");
        if (!applicationHasRtlSupport(context)) {
            return false;
        }
        if (isRTLForced(context)) {
            return true;
        }
        return isRTLAllowed(context) && isDevicePreferredLanguageRTL();
    }

    public final void swapLeftAndRightInRTL(Context context, boolean flip) {
        AbstractC2855l.g(context, "context");
        setPref(context, KEY_FOR_PERFS_MAKE_RTL_FLIP_LEFT_AND_RIGHT_STYLES, flip);
    }
}
