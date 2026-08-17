package F;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f1469a;

    public g1(List list) {
        this.f1469a = new ArrayList(list);
    }

    public static String d(g1 g1Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = g1Var.f1469a.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC0471b1) it.next()).getClass().getSimpleName());
        }
        return f1.a(" | ", arrayList);
    }

    public boolean a(Class cls) {
        Iterator it = this.f1469a.iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(((InterfaceC0471b1) it.next()).getClass())) {
                return true;
            }
        }
        return false;
    }

    public InterfaceC0471b1 b(Class cls) {
        for (InterfaceC0471b1 interfaceC0471b1 : this.f1469a) {
            if (interfaceC0471b1.getClass() == cls) {
                return interfaceC0471b1;
            }
        }
        return null;
    }

    public List c(Class cls) {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC0471b1 interfaceC0471b1 : this.f1469a) {
            if (cls.isAssignableFrom(interfaceC0471b1.getClass())) {
                arrayList.add(interfaceC0471b1);
            }
        }
        return arrayList;
    }
}
