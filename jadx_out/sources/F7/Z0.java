package F7;

import R7.AbstractC1394f;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class Z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ConcurrentMap f2020a = new ConcurrentHashMap();

    public static final Q7.k a(Class cls) {
        AbstractC2855l.g(cls, "<this>");
        ClassLoader classLoaderJ = AbstractC1394f.j(cls);
        k1 k1Var = new k1(classLoaderJ);
        ConcurrentMap concurrentMap = f2020a;
        WeakReference weakReference = (WeakReference) concurrentMap.get(k1Var);
        if (weakReference != null) {
            Q7.k kVar = (Q7.k) weakReference.get();
            if (kVar != null) {
                return kVar;
            }
            concurrentMap.remove(k1Var, weakReference);
        }
        Q7.k kVarA = Q7.k.f9873c.a(classLoaderJ);
        while (true) {
            try {
                ConcurrentMap concurrentMap2 = f2020a;
                WeakReference weakReference2 = (WeakReference) concurrentMap2.putIfAbsent(k1Var, new WeakReference(kVarA));
                if (weakReference2 == null) {
                    return kVarA;
                }
                Q7.k kVar2 = (Q7.k) weakReference2.get();
                if (kVar2 != null) {
                    return kVar2;
                }
                concurrentMap2.remove(k1Var, weakReference2);
            } finally {
                k1Var.a(null);
            }
        }
    }
}
