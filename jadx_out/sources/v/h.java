package v;

import F.g1;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import r.InterfaceC3175g2;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CaptureSessionOnClosedNotCalledQuirk f32743a;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface a {
        void a(InterfaceC3175g2 interfaceC3175g2);
    }

    public h(g1 g1Var) {
        this.f32743a = (CaptureSessionOnClosedNotCalledQuirk) g1Var.b(CaptureSessionOnClosedNotCalledQuirk.class);
    }

    private void a(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            InterfaceC3175g2 interfaceC3175g2 = (InterfaceC3175g2) it.next();
            interfaceC3175g2.c().s(interfaceC3175g2);
        }
    }

    private void b(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            InterfaceC3175g2 interfaceC3175g2 = (InterfaceC3175g2) it.next();
            interfaceC3175g2.c().t(interfaceC3175g2);
        }
    }

    public void c(InterfaceC3175g2 interfaceC3175g2, List list, List list2, a aVar) {
        InterfaceC3175g2 interfaceC3175g22;
        InterfaceC3175g2 interfaceC3175g23;
        if (d()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = list.iterator();
            while (it.hasNext() && (interfaceC3175g23 = (InterfaceC3175g2) it.next()) != interfaceC3175g2) {
                linkedHashSet.add(interfaceC3175g23);
            }
            b(linkedHashSet);
        }
        aVar.a(interfaceC3175g2);
        if (d()) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Iterator it2 = list2.iterator();
            while (it2.hasNext() && (interfaceC3175g22 = (InterfaceC3175g2) it2.next()) != interfaceC3175g2) {
                linkedHashSet2.add(interfaceC3175g22);
            }
            a(linkedHashSet2);
        }
    }

    public boolean d() {
        return this.f32743a != null;
    }
}
