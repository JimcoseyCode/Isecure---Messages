package androidx.lifecycle;

import R8.C1404d0;
import R8.T0;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: androidx.lifecycle.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1769p {
    public static final AbstractC1765l a(AbstractC1764k abstractC1764k) {
        C1766m c1766m;
        AbstractC2855l.g(abstractC1764k, "<this>");
        do {
            C1766m c1766m2 = (C1766m) abstractC1764k.c().b();
            if (c1766m2 != null) {
                return c1766m2;
            }
            c1766m = new C1766m(abstractC1764k, T0.b(null, 1, null).X(C1404d0.c().O0()));
        } while (!abstractC1764k.c().a(null, c1766m));
        c1766m.b();
        return c1766m;
    }
}
