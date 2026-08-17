package L5;

import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import q5.C3119c;
import q5.InterfaceC3120d;
import q5.g;
import q5.i;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class b implements i {
    public static /* synthetic */ Object b(String str, C3119c c3119c, InterfaceC3120d interfaceC3120d) {
        try {
            c.b(str);
            return c3119c.h().a(interfaceC3120d);
        } finally {
            c.a();
        }
    }

    @Override // q5.i
    public List a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final C3119c c3119cR : componentRegistrar.getComponents()) {
            final String strI = c3119cR.i();
            if (strI != null) {
                c3119cR = c3119cR.r(new g() { // from class: L5.a
                    @Override // q5.g
                    public final Object a(InterfaceC3120d interfaceC3120d) {
                        return b.b(strI, c3119cR, interfaceC3120d);
                    }
                });
            }
            arrayList.add(c3119cR);
        }
        return arrayList;
    }
}
