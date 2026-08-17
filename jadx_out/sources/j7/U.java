package j7;

import java.util.Collections;
import java.util.Set;
import k7.C2842j;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class U {
    public static Set a(Set builder) {
        AbstractC2855l.g(builder, "builder");
        return ((C2842j) builder).o();
    }

    public static Set b() {
        return new C2842j();
    }

    public static Set c(int i10) {
        return new C2842j(i10);
    }

    public static Set d(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        AbstractC2855l.f(setSingleton, "singleton(...)");
        return setSingleton;
    }
}
