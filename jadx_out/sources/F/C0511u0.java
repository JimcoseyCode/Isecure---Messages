package F;

import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2855l;
import y.C3563H;

/* JADX INFO: renamed from: F.u0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C0511u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0511u0 f1702a = new C0511u0();

    private C0511u0() {
    }

    private final boolean a(C3563H c3563h, C3563H c3563h2) {
        H0.g.j(c3563h2.e(), "Fully specified range is not actually fully specified.");
        return c3563h.a() == 0 || c3563h.a() == c3563h2.a();
    }

    private final boolean b(C3563H c3563h, C3563H c3563h2) {
        H0.g.j(c3563h2.e(), "Fully specified range is not actually fully specified.");
        int iB = c3563h.b();
        if (iB == 0) {
            return true;
        }
        int iB2 = c3563h2.b();
        return (iB == 2 && iB2 != 1) || iB == iB2;
    }

    public static final boolean c(C3563H dynamicRangeToTest, Set fullySpecifiedDynamicRanges) {
        Object next;
        AbstractC2855l.g(dynamicRangeToTest, "dynamicRangeToTest");
        AbstractC2855l.g(fullySpecifiedDynamicRanges, "fullySpecifiedDynamicRanges");
        if (dynamicRangeToTest.e()) {
            return fullySpecifiedDynamicRanges.contains(dynamicRangeToTest);
        }
        Iterator it = fullySpecifiedDynamicRanges.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (f1702a.d(dynamicRangeToTest, (C3563H) next)) {
                break;
            }
        }
        return next != null;
    }

    private final boolean d(C3563H c3563h, C3563H c3563h2) {
        return a(c3563h, c3563h2) && b(c3563h, c3563h2);
    }
}
