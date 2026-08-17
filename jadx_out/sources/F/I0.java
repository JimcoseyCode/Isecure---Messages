package F;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import y.InterfaceC3595o;
import y.InterfaceC3597q;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class I0 implements InterfaceC3595o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f1347b;

    public I0(int i10) {
        this.f1347b = i10;
    }

    @Override // y.InterfaceC3595o
    public List b(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC3597q interfaceC3597q = (InterfaceC3597q) it.next();
            H0.g.b(interfaceC3597q instanceof L, "The camera info doesn't contain internal implementation.");
            if (interfaceC3597q.k() == this.f1347b) {
                arrayList.add(interfaceC3597q);
            }
        }
        return arrayList;
    }

    public int c() {
        return this.f1347b;
    }
}
