package T6;

import P8.q;
import android.content.Context;
import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f10612a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f10613b = new LinkedHashMap();

    private b() {
    }

    private final int a(Context context, String str, String str2) {
        if (str.length() == 0) {
            return -1;
        }
        Locale ROOT = Locale.ROOT;
        AbstractC2855l.f(ROOT, "ROOT");
        String lowerCase = str.toLowerCase(ROOT);
        AbstractC2855l.f(lowerCase, "toLowerCase(...)");
        String strE = q.E(lowerCase, "-", "_", false, 4, null);
        String str3 = str2 + "/" + strE;
        synchronized (this) {
            Map map = f10613b;
            Integer num = (Integer) map.get(str3);
            if (num != null) {
                return num.intValue();
            }
            int identifier = context.getResources().getIdentifier(strE, str2, context.getPackageName());
            map.put(str3, Integer.valueOf(identifier));
            return identifier;
        }
    }

    public final Uri b(Context context, String name) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(name, "name");
        Locale ROOT = Locale.ROOT;
        AbstractC2855l.f(ROOT, "ROOT");
        String lowerCase = name.toLowerCase(ROOT);
        AbstractC2855l.f(lowerCase, "toLowerCase(...)");
        q.E(lowerCase, "-", "_", false, 4, null);
        int iA = a(context, name, "drawable");
        if (iA != 0) {
            return Uri.parse("res:/" + iA);
        }
        int iA2 = a(context, name, "raw");
        if (iA2 != 0) {
            return Uri.parse("res:/" + iA2);
        }
        if (!q.K(name, "asset:/", false, 2, null)) {
            return Uri.parse("file:///android_asset/" + name);
        }
        return Uri.parse("file:///android_asset/" + q.w0(name, "asset:/"));
    }
}
