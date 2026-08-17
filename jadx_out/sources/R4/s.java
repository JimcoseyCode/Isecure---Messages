package r4;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import com.facebook.react.views.text.TextAttributeProps;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final m0.i f31938a = new m0.i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Locale f31939b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            return A4.d.a(context).c(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context, int i10) {
        Resources resources = context.getResources();
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? resources.getString(R.string.ok) : resources.getString(l4.b.f29429a) : resources.getString(l4.b.f29438j) : resources.getString(l4.b.f29432d);
    }

    public static String c(Context context, int i10) {
        Resources resources = context.getResources();
        String strA = a(context);
        if (i10 == 1) {
            return resources.getString(l4.b.f29433e, strA);
        }
        if (i10 == 2) {
            return y4.g.c(context) ? resources.getString(l4.b.f29442n) : resources.getString(l4.b.f29439k, strA);
        }
        if (i10 == 3) {
            return resources.getString(l4.b.f29430b, strA);
        }
        if (i10 == 5) {
            return g(context, "common_google_play_services_invalid_account_text", strA);
        }
        if (i10 == 7) {
            return g(context, "common_google_play_services_network_error_text", strA);
        }
        if (i10 == 9) {
            return resources.getString(l4.b.f29437i, strA);
        }
        if (i10 == 20) {
            return g(context, "common_google_play_services_restricted_profile_text", strA);
        }
        switch (i10) {
            case 16:
                return g(context, "common_google_play_services_api_unavailable_text", strA);
            case 17:
                return g(context, "common_google_play_services_sign_in_failed_text", strA);
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                return resources.getString(l4.b.f29441m, strA);
            default:
                return resources.getString(n4.g.f30024a, strA);
        }
    }

    public static String d(Context context, int i10) {
        return (i10 == 6 || i10 == 19) ? g(context, "common_google_play_services_resolution_required_text", a(context)) : c(context, i10);
    }

    public static String e(Context context, int i10) {
        String strH = i10 == 6 ? h(context, "common_google_play_services_resolution_required_title") : f(context, i10);
        return strH == null ? context.getResources().getString(l4.b.f29436h) : strH;
    }

    public static String f(Context context, int i10) {
        Resources resources = context.getResources();
        switch (i10) {
            case 1:
                return resources.getString(l4.b.f29434f);
            case 2:
                return resources.getString(l4.b.f29440l);
            case 3:
                return resources.getString(l4.b.f29431c);
            case 4:
            case 6:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                return null;
            case 5:
                return h(context, "common_google_play_services_invalid_account_title");
            case 7:
                return h(context, "common_google_play_services_network_error_title");
            case 8:
            case 9:
            case 10:
            case 11:
            case 16:
                return null;
            case 12:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
            default:
                return null;
            case 17:
                return h(context, "common_google_play_services_sign_in_failed_title");
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
                return h(context, "common_google_play_services_restricted_profile_title");
        }
    }

    private static String g(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String strH = h(context, str);
        if (strH == null) {
            strH = resources.getString(n4.g.f30024a);
        }
        return String.format(resources.getConfiguration().locale, strH, str2);
    }

    private static String h(Context context, String str) {
        m0.i iVar = f31938a;
        synchronized (iVar) {
            try {
                Locale localeC = D0.e.a(context.getResources().getConfiguration()).c(0);
                if (!localeC.equals(f31939b)) {
                    iVar.clear();
                    f31939b = localeC;
                }
                String str2 = (String) iVar.get(str);
                if (str2 != null) {
                    return str2;
                }
                Resources resourcesC = com.google.android.gms.common.c.c(context);
                if (resourcesC == null) {
                    return null;
                }
                int identifier = resourcesC.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    return null;
                }
                String string = resourcesC.getString(identifier);
                if (TextUtils.isEmpty(string)) {
                    return null;
                }
                iVar.put(str, string);
                return string;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
