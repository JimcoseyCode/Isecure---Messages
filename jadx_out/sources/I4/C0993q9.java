package I4;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: I4.q9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C0993q9 implements InterfaceC0960n9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List f4859a;

    public C0993q9(Context context, AbstractC0982p9 abstractC0982p9) {
        ArrayList arrayList = new ArrayList();
        this.f4859a = arrayList;
        if (abstractC0982p9.c()) {
            arrayList.add(new F9(context, abstractC0982p9));
        }
    }

    @Override // I4.InterfaceC0960n9
    public final void a(InterfaceC0949m9 interfaceC0949m9) {
        Iterator it = this.f4859a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0960n9) it.next()).a(interfaceC0949m9);
        }
    }
}
