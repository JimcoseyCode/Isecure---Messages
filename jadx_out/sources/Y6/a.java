package Y6;

import android.view.View;
import androidx.core.view.AbstractC1658a0;
import androidx.core.view.L0;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {
    public static final int a(View decorView) {
        AbstractC2855l.g(decorView, "decorView");
        L0 l0F = AbstractC1658a0.F(decorView);
        if (l0F == null) {
            return 0;
        }
        return b(l0F);
    }

    private static final int b(L0 l02) {
        return l02.f(L0.p.g() | L0.p.a()).f33238b;
    }

    public static final Boolean c(View decorView) {
        AbstractC2855l.g(decorView, "decorView");
        L0 l0F = AbstractC1658a0.F(decorView);
        if (l0F == null) {
            return null;
        }
        return Boolean.valueOf(l0F.q(L0.p.b()));
    }
}
