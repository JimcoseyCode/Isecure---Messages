package F;

import F.InterfaceC0490j0;
import y.C3563H;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public interface D0 extends h1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final InterfaceC0490j0.a f1294j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final InterfaceC0490j0.a f1295k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final InterfaceC0490j0.a f1296l;

    static {
        Class cls = Integer.TYPE;
        f1294j = InterfaceC0490j0.a.a("camerax.core.imageInput.inputFormat", cls);
        f1295k = InterfaceC0490j0.a.a("camerax.core.imageInput.secondaryInputFormat", cls);
        f1296l = InterfaceC0490j0.a.a("camerax.core.imageInput.inputDynamicRange", C3563H.class);
    }

    default int J() {
        return ((Integer) f(f1295k, 0)).intValue();
    }

    default C3563H l() {
        return (C3563H) H0.g.g((C3563H) f(f1296l, C3563H.f33649c));
    }

    default int r() {
        return ((Integer) d(f1294j)).intValue();
    }

    default boolean u() {
        return b(f1296l);
    }
}
