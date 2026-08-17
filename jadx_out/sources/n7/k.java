package n7;

import java.io.Serializable;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import n7.j;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class k implements j, Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final k f30068g = new k();
    private static final long serialVersionUID = 0;

    private k() {
    }

    private final Object readResolve() {
        return f30068g;
    }

    @Override // n7.j
    public j X(j context) {
        AbstractC2855l.g(context, "context");
        return context;
    }

    @Override // n7.j
    public j.b e(j.c key) {
        AbstractC2855l.g(key, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // n7.j
    public Object u0(Object obj, Function2 operation) {
        AbstractC2855l.g(operation, "operation");
        return obj;
    }

    @Override // n7.j
    public j y0(j.c key) {
        AbstractC2855l.g(key, "key");
        return this;
    }
}
