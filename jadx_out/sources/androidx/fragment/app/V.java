package androidx.fragment.app;

import android.view.View;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class V {
    public static final Fragment a(View view) {
        AbstractC2855l.g(view, "<this>");
        Fragment fragmentH0 = FragmentManager.h0(view);
        AbstractC2855l.f(fragmentH0, "findFragment(this)");
        return fragmentH0;
    }
}
