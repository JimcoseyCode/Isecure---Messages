package I7;

import L7.InterfaceC1280e;
import j7.AbstractC2800q;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2855l;
import o8.AbstractC3027i;
import s8.AbstractC3340e;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class e {
    public static final boolean a(d dVar, InterfaceC1280e classDescriptor) {
        AbstractC2855l.g(dVar, "<this>");
        AbstractC2855l.g(classDescriptor, "classDescriptor");
        if (!AbstractC3027i.x(classDescriptor)) {
            return false;
        }
        Set setB = dVar.b();
        k8.b bVarN = AbstractC3340e.n(classDescriptor);
        return AbstractC2800q.X(setB, bVarN != null ? bVarN.e() : null);
    }
}
