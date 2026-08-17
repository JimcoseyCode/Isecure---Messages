package E7;

import C7.g;
import C7.h;
import C7.k;
import F7.A;
import F7.j1;
import G7.h;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {
    public static final boolean a(C7.c cVar) {
        h hVarT;
        AbstractC2855l.g(cVar, "<this>");
        if (cVar instanceof C7.h) {
            k kVar = (k) cVar;
            Field fieldB = c.b(kVar);
            if (fieldB != null ? fieldB.isAccessible() : true) {
                Method methodC = c.c(kVar);
                if (methodC != null ? methodC.isAccessible() : true) {
                    Method methodE = c.e((C7.h) cVar);
                    if (methodE != null ? methodE.isAccessible() : true) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (cVar instanceof k) {
            k kVar2 = (k) cVar;
            Field fieldB2 = c.b(kVar2);
            if (fieldB2 != null ? fieldB2.isAccessible() : true) {
                Method methodC2 = c.c(kVar2);
                if (methodC2 != null ? methodC2.isAccessible() : true) {
                    return true;
                }
            }
            return false;
        }
        if (cVar instanceof k.b) {
            Field fieldB3 = c.b(((k.b) cVar).j());
            if (fieldB3 != null ? fieldB3.isAccessible() : true) {
                Method methodD = c.d((g) cVar);
                if (methodD != null ? methodD.isAccessible() : true) {
                    return true;
                }
            }
            return false;
        }
        if (cVar instanceof h.a) {
            Field fieldB4 = c.b(((h.a) cVar).j());
            if (fieldB4 != null ? fieldB4.isAccessible() : true) {
                Method methodD2 = c.d((g) cVar);
                if (methodD2 != null ? methodD2.isAccessible() : true) {
                    return true;
                }
            }
            return false;
        }
        if (!(cVar instanceof g)) {
            throw new UnsupportedOperationException("Unknown callable: " + cVar + " (" + cVar.getClass() + ')');
        }
        g gVar = (g) cVar;
        Method methodD3 = c.d(gVar);
        if (methodD3 != null ? methodD3.isAccessible() : true) {
            A aB = j1.b(cVar);
            Member memberB = (aB == null || (hVarT = aB.T()) == null) ? null : hVarT.b();
            AccessibleObject accessibleObject = memberB instanceof AccessibleObject ? (AccessibleObject) memberB : null;
            if (accessibleObject != null ? accessibleObject.isAccessible() : true) {
                Constructor constructorA = c.a(gVar);
                if (constructorA != null ? constructorA.isAccessible() : true) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void b(C7.c cVar, boolean z10) {
        G7.h hVarT;
        AbstractC2855l.g(cVar, "<this>");
        if (cVar instanceof C7.h) {
            k kVar = (k) cVar;
            Field fieldB = c.b(kVar);
            if (fieldB != null) {
                fieldB.setAccessible(z10);
            }
            Method methodC = c.c(kVar);
            if (methodC != null) {
                methodC.setAccessible(z10);
            }
            Method methodE = c.e((C7.h) cVar);
            if (methodE != null) {
                methodE.setAccessible(z10);
                return;
            }
            return;
        }
        if (cVar instanceof k) {
            k kVar2 = (k) cVar;
            Field fieldB2 = c.b(kVar2);
            if (fieldB2 != null) {
                fieldB2.setAccessible(z10);
            }
            Method methodC2 = c.c(kVar2);
            if (methodC2 != null) {
                methodC2.setAccessible(z10);
                return;
            }
            return;
        }
        if (cVar instanceof k.b) {
            Field fieldB3 = c.b(((k.b) cVar).j());
            if (fieldB3 != null) {
                fieldB3.setAccessible(z10);
            }
            Method methodD = c.d((g) cVar);
            if (methodD != null) {
                methodD.setAccessible(z10);
                return;
            }
            return;
        }
        if (cVar instanceof h.a) {
            Field fieldB4 = c.b(((h.a) cVar).j());
            if (fieldB4 != null) {
                fieldB4.setAccessible(z10);
            }
            Method methodD2 = c.d((g) cVar);
            if (methodD2 != null) {
                methodD2.setAccessible(z10);
                return;
            }
            return;
        }
        if (!(cVar instanceof g)) {
            throw new UnsupportedOperationException("Unknown callable: " + cVar + " (" + cVar.getClass() + ')');
        }
        g gVar = (g) cVar;
        Method methodD3 = c.d(gVar);
        if (methodD3 != null) {
            methodD3.setAccessible(z10);
        }
        A aB = j1.b(cVar);
        Member memberB = (aB == null || (hVarT = aB.T()) == null) ? null : hVarT.b();
        AccessibleObject accessibleObject = memberB instanceof AccessibleObject ? (AccessibleObject) memberB : null;
        if (accessibleObject != null) {
            accessibleObject.setAccessible(true);
        }
        Constructor constructorA = c.a(gVar);
        if (constructorA != null) {
            constructorA.setAccessible(z10);
        }
    }
}
