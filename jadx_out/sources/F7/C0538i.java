package F7;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: F7.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class C0538i extends AbstractC0522a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function1 f2062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap f2063b;

    public C0538i(Function1 compute) {
        AbstractC2855l.g(compute, "compute");
        this.f2062a = compute;
        this.f2063b = new ConcurrentHashMap();
    }

    @Override // F7.AbstractC0522a
    public Object a(Class key) {
        AbstractC2855l.g(key, "key");
        ConcurrentHashMap concurrentHashMap = this.f2063b;
        Object obj = concurrentHashMap.get(key);
        if (obj != null) {
            return obj;
        }
        Object objInvoke = this.f2062a.invoke(key);
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(key, objInvoke);
        return objPutIfAbsent == null ? objInvoke : objPutIfAbsent;
    }
}
