package J8;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap f6952a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicInteger f6953b = new AtomicInteger(0);

    /* JADX INFO: Access modifiers changed from: private */
    public static final int f(z zVar, String it) {
        AbstractC2855l.g(it, "it");
        return zVar.f6953b.getAndIncrement();
    }

    public abstract int b(ConcurrentHashMap concurrentHashMap, String str, Function1 function1);

    public final n c(C7.d kClass) {
        AbstractC2855l.g(kClass, "kClass");
        return new n(d(kClass));
    }

    public final int d(C7.d kClass) {
        AbstractC2855l.g(kClass, "kClass");
        String strN = kClass.n();
        AbstractC2855l.d(strN);
        return e(strN);
    }

    public final int e(String keyQualifiedName) {
        AbstractC2855l.g(keyQualifiedName, "keyQualifiedName");
        return b(this.f6952a, keyQualifiedName, new y(this));
    }

    protected final Collection g() {
        Collection collectionValues = this.f6952a.values();
        AbstractC2855l.f(collectionValues, "<get-values>(...)");
        return collectionValues;
    }
}
