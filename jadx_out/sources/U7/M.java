package U7;

import java.util.Map;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class M implements K {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f11448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final B8.f f11449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final B8.h f11450d;

    public M(Map states) {
        AbstractC2855l.g(states, "states");
        this.f11448b = states;
        B8.f fVar = new B8.f("Java nullability annotation states");
        this.f11449c = fVar;
        B8.h hVarI = fVar.i(new L(this));
        AbstractC2855l.f(hVarI, "createMemoizedFunctionWithNullableValues(...)");
        this.f11450d = hVarI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object c(M m10, k8.c cVar) {
        AbstractC2855l.d(cVar);
        return k8.e.a(cVar, m10.f11448b);
    }

    @Override // U7.K
    public Object a(k8.c fqName) {
        AbstractC2855l.g(fqName, "fqName");
        return this.f11450d.invoke(fqName);
    }
}
