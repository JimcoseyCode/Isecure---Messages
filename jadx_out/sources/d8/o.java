package D8;

import C8.AbstractC0407d0;
import C8.B0;
import C8.G0;
import C8.M0;
import C8.N0;
import C8.S;
import C8.V;
import C8.w0;
import D8.f;
import L7.m0;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class o {
    private static final List a(M0 m02, G8.b bVar) {
        if (m02.I0().size() != m02.K0().getParameters().size()) {
            return null;
        }
        List listI0 = m02.I0();
        if (listI0 == null || !listI0.isEmpty()) {
            Iterator it = listI0.iterator();
            while (it.hasNext()) {
                if (((B0) it.next()).a() != N0.f592k) {
                    List parameters = m02.K0().getParameters();
                    AbstractC2855l.f(parameters, "getParameters(...)");
                    List<Pair> listX0 = AbstractC2800q.X0(listI0, parameters);
                    ArrayList arrayList = new ArrayList(AbstractC2800q.u(listX0, 10));
                    for (Pair pair : listX0) {
                        B0 b0D = (B0) pair.getFirst();
                        m0 m0Var = (m0) pair.getSecond();
                        if (b0D.a() != N0.f592k) {
                            M0 m0N0 = (b0D.b() || b0D.a() != N0.f593l) ? null : b0D.getType().N0();
                            AbstractC2855l.d(m0Var);
                            b0D = H8.d.d(new i(bVar, m0N0, b0D, m0Var));
                        }
                        arrayList.add(b0D);
                    }
                    G0 g0C = w0.f710c.b(m02.K0(), arrayList).c();
                    int size = listI0.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        B0 b02 = (B0) listI0.get(i10);
                        B0 b03 = (B0) arrayList.get(i10);
                        if (b02.a() != N0.f592k) {
                            List upperBounds = ((m0) m02.K0().getParameters().get(i10)).getUpperBounds();
                            AbstractC2855l.f(upperBounds, "getUpperBounds(...)");
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = upperBounds.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(f.a.f820a.a(g0C.n((S) it2.next(), N0.f592k).N0()));
                            }
                            if (!b02.b() && b02.a() == N0.f594m) {
                                arrayList2.add(f.a.f820a.a(b02.getType().N0()));
                            }
                            S type = b03.getType();
                            AbstractC2855l.e(type, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedType");
                            ((i) type).K0().j(arrayList2);
                        }
                    }
                    return arrayList;
                }
            }
        }
        return null;
    }

    public static final AbstractC0407d0 b(AbstractC0407d0 type, G8.b status) {
        AbstractC2855l.g(type, "type");
        AbstractC2855l.g(status, "status");
        List listA = a(type, status);
        if (listA != null) {
            return c(type, listA);
        }
        return null;
    }

    private static final AbstractC0407d0 c(M0 m02, List list) {
        return V.k(m02.J0(), m02.K0(), list, m02.L0(), null, 16, null);
    }
}
