package c6;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.Locale;
import r4.C3263d;

/* JADX INFO: renamed from: c6.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1858c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C3263d f18846a = new C3263d("CommonUtils", PointerEventHelper.POINTER_TYPE_UNKNOWN);

    public static String a(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e10) {
            f18846a.c("CommonUtils", "Exception thrown when trying to get app version ".concat(e10.toString()));
            return PointerEventHelper.POINTER_TYPE_UNKNOWN;
        }
    }

    public static String b(Locale locale) {
        if (y4.l.e()) {
            return locale.toLanguageTag();
        }
        StringBuilder sb = new StringBuilder(locale.getLanguage());
        if (!TextUtils.isEmpty(locale.getCountry())) {
            sb.append("-");
            sb.append(locale.getCountry());
        }
        if (!TextUtils.isEmpty(locale.getVariant())) {
            sb.append("-");
            sb.append(locale.getVariant());
        }
        return sb.toString();
    }
}
