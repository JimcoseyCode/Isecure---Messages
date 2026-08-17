package v8;

import j7.AbstractC2800q;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: v8.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3444m {
    public static final Set a(Iterable iterable) {
        AbstractC2855l.g(iterable, "<this>");
        HashSet hashSet = new HashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Set setE = ((InterfaceC3442k) it.next()).e();
            if (setE == null) {
                return null;
            }
            AbstractC2800q.A(hashSet, setE);
        }
        return hashSet;
    }
}
