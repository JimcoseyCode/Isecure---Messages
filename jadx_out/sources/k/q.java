package K;

import F.InterfaceC0490j0;
import F.h1;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public interface q extends h1 {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final InterfaceC0490j0.a f7018M = InterfaceC0490j0.a.a("camerax.core.target.name", String.class);

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final InterfaceC0490j0.a f7019N = InterfaceC0490j0.a.a("camerax.core.target.class", Class.class);

    default String C(String str) {
        return (String) f(f7018M, str);
    }

    default String L() {
        return (String) d(f7018M);
    }
}
