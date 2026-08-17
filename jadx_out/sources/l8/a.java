package L8;

import M8.k;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.AbstractC2855l;
import v8.InterfaceC3442k;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {
    public static final Collection a(Collection collection, Collection collection2) {
        AbstractC2855l.g(collection2, "collection");
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == null) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    public static final k b(Iterable scopes) {
        AbstractC2855l.g(scopes, "scopes");
        k kVar = new k();
        for (Object obj : scopes) {
            InterfaceC3442k interfaceC3442k = (InterfaceC3442k) obj;
            if (interfaceC3442k != null && interfaceC3442k != InterfaceC3442k.b.f32996b) {
                kVar.add(obj);
            }
        }
        return kVar;
    }
}
