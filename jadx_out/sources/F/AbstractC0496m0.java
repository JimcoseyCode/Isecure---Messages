package F;

import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import y.AbstractC3583h0;

/* JADX INFO: renamed from: F.m0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0496m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set f1555a = Collections.unmodifiableSet(EnumSet.of(EnumC0516x.PASSIVE_FOCUSED, EnumC0516x.PASSIVE_NOT_FOCUSED, EnumC0516x.LOCKED_FOCUSED, EnumC0516x.LOCKED_NOT_FOCUSED));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set f1556b = Collections.unmodifiableSet(EnumSet.of(EnumC0520z.CONVERGED, EnumC0520z.UNKNOWN));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set f1557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Set f1558d;

    static {
        EnumC0512v enumC0512v = EnumC0512v.CONVERGED;
        EnumC0512v enumC0512v2 = EnumC0512v.FLASH_REQUIRED;
        EnumC0512v enumC0512v3 = EnumC0512v.UNKNOWN;
        Set setUnmodifiableSet = Collections.unmodifiableSet(EnumSet.of(enumC0512v, enumC0512v2, enumC0512v3));
        f1557c = setUnmodifiableSet;
        EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) setUnmodifiableSet);
        enumSetCopyOf.remove(enumC0512v2);
        enumSetCopyOf.remove(enumC0512v3);
        f1558d = Collections.unmodifiableSet(enumSetCopyOf);
    }

    public static boolean a(B b10, boolean z10) {
        boolean z11 = b10.g() == EnumC0514w.OFF || f1555a.contains(b10.k());
        boolean z12 = b10.j() == EnumC0510u.OFF;
        boolean z13 = !z10 ? !(z12 || f1557c.contains(b10.h())) : !(z12 || f1558d.contains(b10.h()));
        boolean z14 = b10.f() == EnumC0518y.OFF || f1556b.contains(b10.e());
        AbstractC3583h0.a("ConvergenceUtils", "checkCaptureResult, AE=" + b10.h() + " AF =" + b10.k() + " AWB=" + b10.e());
        return z11 && z13 && z14;
    }
}
