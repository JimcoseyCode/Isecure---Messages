package o8;

import L7.InterfaceC1276a;
import i7.C2735B;
import j7.AbstractC2800q;
import java.util.Collection;
import java.util.LinkedList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: o8.r, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3036r {
    public static final Collection b(Collection collection, Function1 descriptorByHandle) {
        AbstractC2855l.g(collection, "<this>");
        AbstractC2855l.g(descriptorByHandle, "descriptorByHandle");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        M8.l lVarA = M8.l.f7676i.a();
        while (!linkedList.isEmpty()) {
            Object objE0 = AbstractC2800q.e0(linkedList);
            M8.l lVarA2 = M8.l.f7676i.a();
            Collection collectionQ = C3033o.q(objE0, linkedList, descriptorByHandle, new C3035q(lVarA2));
            AbstractC2855l.f(collectionQ, "extractMembersOverridableInBothWays(...)");
            if (collectionQ.size() == 1 && lVarA2.isEmpty()) {
                Object objB0 = AbstractC2800q.B0(collectionQ);
                AbstractC2855l.f(objB0, "single(...)");
                lVarA.add(objB0);
            } else {
                Object objL = C3033o.L(collectionQ, descriptorByHandle);
                InterfaceC1276a interfaceC1276a = (InterfaceC1276a) descriptorByHandle.invoke(objL);
                for (Object obj : collectionQ) {
                    AbstractC2855l.d(obj);
                    if (!C3033o.B(interfaceC1276a, (InterfaceC1276a) descriptorByHandle.invoke(obj))) {
                        lVarA2.add(obj);
                    }
                }
                if (!lVarA2.isEmpty()) {
                    lVarA.addAll(lVarA2);
                }
                lVarA.add(objL);
            }
        }
        return lVarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B c(M8.l lVar, Object obj) {
        AbstractC2855l.d(obj);
        lVar.add(obj);
        return C2735B.f28704a;
    }
}
