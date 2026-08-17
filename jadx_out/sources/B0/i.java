package b0;

import F.InterfaceC0515w0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i implements InterfaceC0515w0 {
    public static i h(int i10, int i11, List list, List list2) {
        H0.g.b(!list2.isEmpty(), "Should contain at least one VideoProfile.");
        return new C1796a(i10, i11, Collections.unmodifiableList(new ArrayList(list)), Collections.unmodifiableList(new ArrayList(list2)), !list.isEmpty() ? (InterfaceC0515w0.a) list.get(0) : null, (InterfaceC0515w0.c) list2.get(0));
    }

    public static i i(InterfaceC0515w0 interfaceC0515w0) {
        return h(interfaceC0515w0.a(), interfaceC0515w0.b(), interfaceC0515w0.c(), interfaceC0515w0.d());
    }

    public abstract InterfaceC0515w0.a j();

    public abstract InterfaceC0515w0.c k();
}
