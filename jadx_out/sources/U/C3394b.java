package u;

import P8.q;
import android.os.Build;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: u.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C3394b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3394b f32643a = new C3394b();

    private C3394b() {
    }

    private final boolean a(String str, String str2) {
        return q.x(str, str2, true);
    }

    private final boolean b(String str) {
        String MANUFACTURER = Build.MANUFACTURER;
        AbstractC2855l.f(MANUFACTURER, "MANUFACTURER");
        if (a(MANUFACTURER, str)) {
            return true;
        }
        String BRAND = Build.BRAND;
        AbstractC2855l.f(BRAND, "BRAND");
        return a(BRAND, str);
    }

    private final boolean c() {
        return b("Itel");
    }

    public static final boolean d() {
        if (Build.VERSION.SDK_INT < 31 || !q.x("Spreadtrum", Build.SOC_MANUFACTURER, true)) {
            String HARDWARE = Build.HARDWARE;
            AbstractC2855l.f(HARDWARE, "HARDWARE");
            Locale locale = Locale.ROOT;
            String lowerCase = HARDWARE.toLowerCase(locale);
            AbstractC2855l.f(lowerCase, "toLowerCase(...)");
            if (!q.K(lowerCase, "ums", false, 2, null)) {
                if (f32643a.c()) {
                    AbstractC2855l.f(HARDWARE, "HARDWARE");
                    String lowerCase2 = HARDWARE.toLowerCase(locale);
                    AbstractC2855l.f(lowerCase2, "toLowerCase(...)");
                    if (q.K(lowerCase2, "sp", false, 2, null)) {
                    }
                }
                return false;
            }
        }
        return true;
    }
}
