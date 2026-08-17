package c8;

import C8.H0;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: c8.l0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1916l0 {
    public static final C1907h a(C1907h c1907h, Collection superQualifiers, boolean z10, boolean z11, boolean z12) {
        EnumC1913k enumC1913kD;
        boolean z13;
        AbstractC2855l.g(c1907h, "<this>");
        AbstractC2855l.g(superQualifiers, "superQualifiers");
        ArrayList arrayList = new ArrayList();
        Iterator it = superQualifiers.iterator();
        while (it.hasNext()) {
            EnumC1913k enumC1913kB = b((C1907h) it.next());
            if (enumC1913kB != null) {
                arrayList.add(enumC1913kB);
            }
        }
        EnumC1913k enumC1913kD2 = d(AbstractC2800q.T0(arrayList), b(c1907h), z10);
        if (enumC1913kD2 == null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = superQualifiers.iterator();
            while (it2.hasNext()) {
                EnumC1913k enumC1913kF = ((C1907h) it2.next()).f();
                if (enumC1913kF != null) {
                    arrayList2.add(enumC1913kF);
                }
            }
            enumC1913kD = d(AbstractC2800q.T0(arrayList2), c1907h.f(), z10);
        } else {
            enumC1913kD = enumC1913kD2;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = superQualifiers.iterator();
        while (it3.hasNext()) {
            EnumC1909i enumC1909iE = ((C1907h) it3.next()).e();
            if (enumC1909iE != null) {
                arrayList3.add(enumC1909iE);
            }
        }
        EnumC1909i enumC1909i = (EnumC1909i) e(AbstractC2800q.T0(arrayList3), EnumC1909i.f19000h, EnumC1909i.f18999g, c1907h.e(), z10);
        EnumC1913k enumC1913k = null;
        if (enumC1913kD != null && !z12 && (!z11 || enumC1913kD != EnumC1913k.f19006h)) {
            enumC1913k = enumC1913kD;
        }
        boolean z14 = false;
        if (enumC1913k == EnumC1913k.f19007i) {
            if (!c1907h.d()) {
                if (!superQualifiers.isEmpty()) {
                    Iterator it4 = superQualifiers.iterator();
                    while (it4.hasNext()) {
                        if (((C1907h) it4.next()).d()) {
                        }
                    }
                }
                z13 = false;
            }
            z13 = true;
            break;
        }
        z13 = false;
        if (enumC1913k != null && enumC1913kD2 != enumC1913kD) {
            z14 = true;
        }
        return new C1907h(enumC1913k, enumC1909i, z13, z14);
    }

    private static final EnumC1913k b(C1907h c1907h) {
        if (c1907h.g()) {
            return null;
        }
        return c1907h.f();
    }

    public static final boolean c(H0 h02, G8.i type) {
        AbstractC2855l.g(h02, "<this>");
        AbstractC2855l.g(type, "type");
        k8.c ENHANCED_NULLABILITY_ANNOTATION = U7.I.f11417v;
        AbstractC2855l.f(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
        return h02.r0(type, ENHANCED_NULLABILITY_ANNOTATION);
    }

    private static final EnumC1913k d(Set set, EnumC1913k enumC1913k, boolean z10) {
        EnumC1913k enumC1913k2 = EnumC1913k.f19005g;
        return enumC1913k == enumC1913k2 ? enumC1913k2 : (EnumC1913k) e(set, EnumC1913k.f19007i, EnumC1913k.f19006h, enumC1913k, z10);
    }

    private static final Object e(Set set, Object obj, Object obj2, Object obj3, boolean z10) {
        Set setT0;
        if (!z10) {
            if (obj3 != null && (setT0 = AbstractC2800q.T0(j7.T.l(set, obj3))) != null) {
                set = setT0;
            }
            return AbstractC2800q.D0(set);
        }
        Object obj4 = set.contains(obj) ? obj : set.contains(obj2) ? obj2 : null;
        if (AbstractC2855l.b(obj4, obj) && AbstractC2855l.b(obj3, obj2)) {
            return null;
        }
        return obj3 == null ? obj4 : obj3;
    }
}
