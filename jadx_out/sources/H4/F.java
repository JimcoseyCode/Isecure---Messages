package H4;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class F implements B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List f3737a;

    public F(Context context, E e10) {
        ArrayList arrayList = new ArrayList();
        this.f3737a = arrayList;
        if (e10.c()) {
            arrayList.add(new N(context, e10));
        }
    }
}
