package d1;

import androidx.lifecycle.T;
import androidx.lifecycle.U;
import kotlin.jvm.internal.AbstractC2855l;
import v7.AbstractC3430a;

/* JADX INFO: renamed from: d1.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2324e {
    public static final T a(U.c factory, C7.d modelClass, AbstractC2320a extras) {
        AbstractC2855l.g(factory, "factory");
        AbstractC2855l.g(modelClass, "modelClass");
        AbstractC2855l.g(extras, "extras");
        try {
            try {
                return factory.c(modelClass, extras);
            } catch (AbstractMethodError unused) {
                return factory.a(AbstractC3430a.b(modelClass));
            }
        } catch (AbstractMethodError unused2) {
            return factory.b(AbstractC3430a.b(modelClass), extras);
        }
    }
}
