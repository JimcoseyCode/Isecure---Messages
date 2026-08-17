package F;

import F.InterfaceC0490j0;
import android.util.Size;
import java.util.ArrayList;
import java.util.List;
import y.AbstractC3568a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public interface E0 extends h1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final InterfaceC0490j0.a f1322m = InterfaceC0490j0.a.a("camerax.core.imageOutput.targetAspectRatio", AbstractC3568a.class);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final InterfaceC0490j0.a f1323n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final InterfaceC0490j0.a f1324o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final InterfaceC0490j0.a f1325p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final InterfaceC0490j0.a f1326q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final InterfaceC0490j0.a f1327r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final InterfaceC0490j0.a f1328s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final InterfaceC0490j0.a f1329t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final InterfaceC0490j0.a f1330u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final InterfaceC0490j0.a f1331v;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface a {
        Object a(Size size);

        Object d(int i10);
    }

    static {
        Class cls = Integer.TYPE;
        f1323n = InterfaceC0490j0.a.a("camerax.core.imageOutput.targetRotation", cls);
        f1324o = InterfaceC0490j0.a.a("camerax.core.imageOutput.appTargetRotation", cls);
        f1325p = InterfaceC0490j0.a.a("camerax.core.imageOutput.mirrorMode", cls);
        f1326q = InterfaceC0490j0.a.a("camerax.core.imageOutput.targetResolution", Size.class);
        f1327r = InterfaceC0490j0.a.a("camerax.core.imageOutput.defaultResolution", Size.class);
        f1328s = InterfaceC0490j0.a.a("camerax.core.imageOutput.maxResolution", Size.class);
        f1329t = InterfaceC0490j0.a.a("camerax.core.imageOutput.supportedResolutions", List.class);
        f1330u = InterfaceC0490j0.a.a("camerax.core.imageOutput.resolutionSelector", S.c.class);
        f1331v = InterfaceC0490j0.a.a("camerax.core.imageOutput.customOrderedResolutions", List.class);
    }

    static void P(E0 e02) {
        boolean zM = e02.M();
        boolean z10 = e02.A(null) != null;
        if (zM && z10) {
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }
        if (e02.V(null) != null) {
            if (zM || z10) {
                throw new IllegalArgumentException("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }

    default Size A(Size size) {
        return (Size) f(f1326q, size);
    }

    default int B(int i10) {
        return ((Integer) f(f1324o, Integer.valueOf(i10))).intValue();
    }

    default boolean M() {
        return b(f1322m);
    }

    default int O() {
        return ((Integer) d(f1322m)).intValue();
    }

    default S.c V(S.c cVar) {
        return (S.c) f(f1330u, cVar);
    }

    default int c0(int i10) {
        return ((Integer) f(f1323n, Integer.valueOf(i10))).intValue();
    }

    default int d0(int i10) {
        return ((Integer) f(f1325p, Integer.valueOf(i10))).intValue();
    }

    default Size i(Size size) {
        return (Size) f(f1328s, size);
    }

    default List m(List list) {
        return (List) f(f1329t, list);
    }

    default S.c n() {
        return (S.c) d(f1330u);
    }

    default List p(List list) {
        List list2 = (List) f(f1331v, list);
        if (list2 != null) {
            return new ArrayList(list2);
        }
        return null;
    }

    default Size v(Size size) {
        return (Size) f(f1327r, size);
    }
}
