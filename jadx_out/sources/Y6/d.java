package Y6;

import android.view.View;
import android.view.WindowInsets;
import androidx.core.view.L0;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d {
    public static final x0.e a(View view, int i10, WindowInsets windowInsets, boolean z10) {
        AbstractC2855l.g(view, "<this>");
        if (windowInsets == null) {
            x0.e NONE = x0.e.f33236e;
            AbstractC2855l.f(NONE, "NONE");
            return NONE;
        }
        L0 l0Y = L0.y(windowInsets);
        AbstractC2855l.f(l0Y, "toWindowInsetsCompat(...)");
        if (z10) {
            x0.e eVarG = l0Y.g(i10);
            AbstractC2855l.d(eVarG);
            return eVarG;
        }
        x0.e eVarF = l0Y.f(i10);
        AbstractC2855l.d(eVarF);
        return eVarF;
    }

    public static /* synthetic */ x0.e b(View view, int i10, WindowInsets windowInsets, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            windowInsets = view.getRootWindowInsets();
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return a(view, i10, windowInsets, z10);
    }
}
