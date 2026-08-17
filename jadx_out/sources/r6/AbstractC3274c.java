package r6;

import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.provider.Settings;
import android.view.Display;
import android.view.WindowManager;
import android.view.WindowMetrics;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: r6.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3274c {
    public static final String a(Context context) {
        ComponentName componentNameUnflattenFromString;
        AbstractC2855l.g(context, "<this>");
        String string = Settings.Secure.getString(context.getContentResolver(), "default_input_method");
        if (string == null || (componentNameUnflattenFromString = ComponentName.unflattenFromString(string)) == null) {
            return null;
        }
        return componentNameUnflattenFromString.getPackageName();
    }

    public static final Point b(Context context) {
        AbstractC2855l.g(context, "<this>");
        Point point = new Point();
        if (Build.VERSION.SDK_INT < 30) {
            Object systemService = context.getSystemService("window");
            AbstractC2855l.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            AbstractC2855l.f(defaultDisplay, "getDefaultDisplay(...)");
            defaultDisplay.getRealSize(point);
            return point;
        }
        WindowMetrics currentWindowMetrics = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics();
        AbstractC2855l.f(currentWindowMetrics, "getCurrentWindowMetrics(...)");
        Rect bounds = currentWindowMetrics.getBounds();
        AbstractC2855l.f(bounds, "getBounds(...)");
        point.x = bounds.width();
        point.y = bounds.height();
        return point;
    }

    public static final boolean c(Context context) {
        AbstractC2855l.g(context, "<this>");
        if (Build.VERSION.SDK_INT >= 29) {
            Object systemService = context.getSystemService("uimode");
            UiModeManager uiModeManager = systemService instanceof UiModeManager ? (UiModeManager) systemService : null;
            if (uiModeManager != null && uiModeManager.getNightMode() == 2) {
                return true;
            }
        }
        return false;
    }
}
