package G4;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: G4.j6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C0652j6 implements InterfaceC0628g6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List f2875a;

    public C0652j6(Context context, AbstractC0644i6 abstractC0644i6) {
        ArrayList arrayList = new ArrayList();
        this.f2875a = arrayList;
        if (abstractC0644i6.c()) {
            arrayList.add(new C0755w6(context, abstractC0644i6));
        }
    }

    @Override // G4.InterfaceC0628g6
    public final void a(InterfaceC0620f6 interfaceC0620f6) {
        Iterator it = this.f2875a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0628g6) it.next()).a(interfaceC0620f6);
        }
    }
}
