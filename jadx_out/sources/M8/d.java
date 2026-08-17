package M8;

import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d {
    public static final boolean a(Throwable th) {
        AbstractC2855l.g(th, "<this>");
        Class<?> superclass = th.getClass();
        while (!AbstractC2855l.b(superclass.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return false;
            }
        }
        return true;
    }

    public static final RuntimeException b(Throwable e10) throws Throwable {
        AbstractC2855l.g(e10, "e");
        throw e10;
    }
}
