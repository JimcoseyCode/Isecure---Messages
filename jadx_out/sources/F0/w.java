package F0;

import android.R;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowInsetsController;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f1793a = new w();

    private w() {
    }

    public static final void a(Resources.Theme theme, View decor, TypedValue tv) {
        AbstractC2855l.g(theme, "theme");
        AbstractC2855l.g(decor, "decor");
        AbstractC2855l.g(tv, "tv");
        int i10 = (!theme.resolveAttribute(R.attr.windowLightStatusBar, tv, true) || tv.data == 0) ? 0 : 8;
        if (theme.resolveAttribute(R.attr.windowLightNavigationBar, tv, true) && tv.data != 0) {
            i10 |= 16;
        }
        WindowInsetsController windowInsetsController = decor.getWindowInsetsController();
        AbstractC2855l.d(windowInsetsController);
        windowInsetsController.setSystemBarsAppearance(i10, 24);
    }

    public static /* synthetic */ void b(Resources.Theme theme, View view, TypedValue typedValue, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            typedValue = new TypedValue();
        }
        a(theme, view, typedValue);
    }
}
