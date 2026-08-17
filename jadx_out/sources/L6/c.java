package L6;

import android.view.View;
import androidx.core.view.I;
import androidx.core.view.L0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements I {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f7234g = new ArrayList();

    @Override // androidx.core.view.I
    public L0 a(View v10, L0 insets) {
        AbstractC2855l.g(v10, "v");
        AbstractC2855l.g(insets, "insets");
        Iterator it = this.f7234g.iterator();
        while (it.hasNext()) {
            ((I) it.next()).a(v10, insets);
        }
        return insets;
    }

    public final void b(I listener) {
        AbstractC2855l.g(listener, "listener");
        this.f7234g.add(listener);
    }
}
