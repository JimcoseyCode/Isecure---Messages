package J4;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: J4.t5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C1230t5 implements InterfaceC1210q5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List f6310a;

    public C1230t5(Context context, AbstractC1223s5 abstractC1223s5) {
        ArrayList arrayList = new ArrayList();
        this.f6310a = arrayList;
        if (abstractC1223s5.c()) {
            arrayList.add(new D5(context, abstractC1223s5));
        }
    }

    @Override // J4.InterfaceC1210q5
    public final void a(InterfaceC1203p5 interfaceC1203p5) {
        Iterator it = this.f6310a.iterator();
        while (it.hasNext()) {
            ((InterfaceC1210q5) it.next()).a(interfaceC1203p5);
        }
    }
}
