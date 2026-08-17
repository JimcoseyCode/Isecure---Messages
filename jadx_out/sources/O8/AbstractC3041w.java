package o8;

import L7.AbstractC1294t;
import L7.InterfaceC1277b;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: o8.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3041w {
    public static final InterfaceC1277b a(Collection descriptors) {
        Integer numD;
        AbstractC2855l.g(descriptors, "descriptors");
        descriptors.isEmpty();
        Iterator it = descriptors.iterator();
        InterfaceC1277b interfaceC1277b = null;
        while (it.hasNext()) {
            InterfaceC1277b interfaceC1277b2 = (InterfaceC1277b) it.next();
            if (interfaceC1277b == null || ((numD = AbstractC1294t.d(interfaceC1277b.getVisibility(), interfaceC1277b2.getVisibility())) != null && numD.intValue() < 0)) {
                interfaceC1277b = interfaceC1277b2;
            }
        }
        AbstractC2855l.d(interfaceC1277b);
        return interfaceC1277b;
    }
}
