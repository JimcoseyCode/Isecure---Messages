package L0;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC1670g0;
import androidx.core.view.AbstractC1672h0;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f7204a = c.f7208b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f7205b = c.f7207a;

    public static final void a(View view) {
        AbstractC2855l.g(view, "<this>");
        Iterator it = AbstractC1672h0.a(view).iterator();
        while (it.hasNext()) {
            c((View) it.next()).a();
        }
    }

    public static final void b(ViewGroup viewGroup) {
        AbstractC2855l.g(viewGroup, "<this>");
        Iterator it = AbstractC1670g0.a(viewGroup).iterator();
        while (it.hasNext()) {
            c((View) it.next()).a();
        }
    }

    private static final b c(View view) {
        int i10 = f7204a;
        b bVar = (b) view.getTag(i10);
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b();
        view.setTag(i10, bVar2);
        return bVar2;
    }

    public static final void d(View view, boolean z10) {
        AbstractC2855l.g(view, "<this>");
        view.setTag(f7205b, Boolean.valueOf(z10));
    }
}
