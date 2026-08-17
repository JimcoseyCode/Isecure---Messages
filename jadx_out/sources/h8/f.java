package h8;

import f8.n;
import f8.q;
import f8.r;
import f8.s;
import f8.u;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class f {
    public static final q a(q qVar, g typeTable) {
        AbstractC2855l.g(qVar, "<this>");
        AbstractC2855l.g(typeTable, "typeTable");
        if (qVar.i0()) {
            return qVar.Q();
        }
        if (qVar.j0()) {
            return typeTable.a(qVar.R());
        }
        return null;
    }

    public static final List b(f8.c cVar, g typeTable) {
        AbstractC2855l.g(cVar, "<this>");
        AbstractC2855l.g(typeTable, "typeTable");
        List listX0 = cVar.x0();
        if (listX0.isEmpty()) {
            listX0 = null;
        }
        if (listX0 == null) {
            List<Integer> listW0 = cVar.w0();
            AbstractC2855l.f(listW0, "getContextReceiverTypeIdList(...)");
            listX0 = new ArrayList(AbstractC2800q.u(listW0, 10));
            for (Integer num : listW0) {
                AbstractC2855l.d(num);
                listX0.add(typeTable.a(num.intValue()));
            }
        }
        return listX0;
    }

    public static final List c(f8.i iVar, g typeTable) {
        AbstractC2855l.g(iVar, "<this>");
        AbstractC2855l.g(typeTable, "typeTable");
        List listX = iVar.X();
        if (listX.isEmpty()) {
            listX = null;
        }
        if (listX == null) {
            List<Integer> listW = iVar.W();
            AbstractC2855l.f(listW, "getContextReceiverTypeIdList(...)");
            listX = new ArrayList(AbstractC2800q.u(listW, 10));
            for (Integer num : listW) {
                AbstractC2855l.d(num);
                listX.add(typeTable.a(num.intValue()));
            }
        }
        return listX;
    }

    public static final List d(n nVar, g typeTable) {
        AbstractC2855l.g(nVar, "<this>");
        AbstractC2855l.g(typeTable, "typeTable");
        List listW = nVar.W();
        if (listW.isEmpty()) {
            listW = null;
        }
        if (listW == null) {
            List<Integer> listV = nVar.V();
            AbstractC2855l.f(listV, "getContextReceiverTypeIdList(...)");
            listW = new ArrayList(AbstractC2800q.u(listV, 10));
            for (Integer num : listV) {
                AbstractC2855l.d(num);
                listW.add(typeTable.a(num.intValue()));
            }
        }
        return listW;
    }

    public static final q e(r rVar, g typeTable) {
        AbstractC2855l.g(rVar, "<this>");
        AbstractC2855l.g(typeTable, "typeTable");
        if (rVar.c0()) {
            q qVarS = rVar.S();
            AbstractC2855l.f(qVarS, "getExpandedType(...)");
            return qVarS;
        }
        if (rVar.d0()) {
            return typeTable.a(rVar.T());
        }
        throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias");
    }

    public static final q f(q qVar, g typeTable) {
        AbstractC2855l.g(qVar, "<this>");
        AbstractC2855l.g(typeTable, "typeTable");
        if (qVar.o0()) {
            return qVar.a0();
        }
        if (qVar.p0()) {
            return typeTable.a(qVar.b0());
        }
        return null;
    }

    public static final boolean g(f8.i iVar) {
        AbstractC2855l.g(iVar, "<this>");
        return iVar.v0() || iVar.w0();
    }

    public static final boolean h(n nVar) {
        AbstractC2855l.g(nVar, "<this>");
        return nVar.s0() || nVar.t0();
    }

    public static final q i(f8.c cVar, g typeTable) {
        AbstractC2855l.g(cVar, "<this>");
        AbstractC2855l.g(typeTable, "typeTable");
        if (cVar.o1()) {
            return cVar.J0();
        }
        if (cVar.p1()) {
            return typeTable.a(cVar.K0());
        }
        return null;
    }

    public static final q j(q qVar, g typeTable) {
        AbstractC2855l.g(qVar, "<this>");
        AbstractC2855l.g(typeTable, "typeTable");
        if (qVar.r0()) {
            return qVar.d0();
        }
        if (qVar.s0()) {
            return typeTable.a(qVar.e0());
        }
        return null;
    }

    public static final q k(f8.i iVar, g typeTable) {
        AbstractC2855l.g(iVar, "<this>");
        AbstractC2855l.g(typeTable, "typeTable");
        if (iVar.v0()) {
            return iVar.e0();
        }
        if (iVar.w0()) {
            return typeTable.a(iVar.f0());
        }
        return null;
    }

    public static final q l(n nVar, g typeTable) {
        AbstractC2855l.g(nVar, "<this>");
        AbstractC2855l.g(typeTable, "typeTable");
        if (nVar.s0()) {
            return nVar.d0();
        }
        if (nVar.t0()) {
            return typeTable.a(nVar.e0());
        }
        return null;
    }

    public static final q m(f8.i iVar, g typeTable) {
        AbstractC2855l.g(iVar, "<this>");
        AbstractC2855l.g(typeTable, "typeTable");
        if (iVar.x0()) {
            q qVarG0 = iVar.g0();
            AbstractC2855l.f(qVarG0, "getReturnType(...)");
            return qVarG0;
        }
        if (iVar.y0()) {
            return typeTable.a(iVar.h0());
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Function");
    }

    public static final q n(n nVar, g typeTable) {
        AbstractC2855l.g(nVar, "<this>");
        AbstractC2855l.g(typeTable, "typeTable");
        if (nVar.u0()) {
            q qVarF0 = nVar.f0();
            AbstractC2855l.f(qVarF0, "getReturnType(...)");
            return qVarF0;
        }
        if (nVar.v0()) {
            return typeTable.a(nVar.g0());
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Property");
    }

    public static final List o(f8.c cVar, g typeTable) {
        AbstractC2855l.g(cVar, "<this>");
        AbstractC2855l.g(typeTable, "typeTable");
        List listA1 = cVar.a1();
        if (listA1.isEmpty()) {
            listA1 = null;
        }
        if (listA1 == null) {
            List<Integer> listZ0 = cVar.Z0();
            AbstractC2855l.f(listZ0, "getSupertypeIdList(...)");
            listA1 = new ArrayList(AbstractC2800q.u(listZ0, 10));
            for (Integer num : listZ0) {
                AbstractC2855l.d(num);
                listA1.add(typeTable.a(num.intValue()));
            }
        }
        return listA1;
    }

    public static final q p(q.b bVar, g typeTable) {
        AbstractC2855l.g(bVar, "<this>");
        AbstractC2855l.g(typeTable, "typeTable");
        if (bVar.A()) {
            return bVar.x();
        }
        if (bVar.B()) {
            return typeTable.a(bVar.y());
        }
        return null;
    }

    public static final q q(u uVar, g typeTable) {
        AbstractC2855l.g(uVar, "<this>");
        AbstractC2855l.g(typeTable, "typeTable");
        if (uVar.R()) {
            q qVarL = uVar.L();
            AbstractC2855l.f(qVarL, "getType(...)");
            return qVarL;
        }
        if (uVar.S()) {
            return typeTable.a(uVar.M());
        }
        throw new IllegalStateException("No type in ProtoBuf.ValueParameter");
    }

    public static final q r(r rVar, g typeTable) {
        AbstractC2855l.g(rVar, "<this>");
        AbstractC2855l.g(typeTable, "typeTable");
        if (rVar.g0()) {
            q qVarZ = rVar.Z();
            AbstractC2855l.f(qVarZ, "getUnderlyingType(...)");
            return qVarZ;
        }
        if (rVar.h0()) {
            return typeTable.a(rVar.a0());
        }
        throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias");
    }

    public static final List s(s sVar, g typeTable) {
        AbstractC2855l.g(sVar, "<this>");
        AbstractC2855l.g(typeTable, "typeTable");
        List listR = sVar.R();
        if (listR.isEmpty()) {
            listR = null;
        }
        if (listR == null) {
            List<Integer> listQ = sVar.Q();
            AbstractC2855l.f(listQ, "getUpperBoundIdList(...)");
            listR = new ArrayList(AbstractC2800q.u(listQ, 10));
            for (Integer num : listQ) {
                AbstractC2855l.d(num);
                listR.add(typeTable.a(num.intValue()));
            }
        }
        return listR;
    }

    public static final q t(u uVar, g typeTable) {
        AbstractC2855l.g(uVar, "<this>");
        AbstractC2855l.g(typeTable, "typeTable");
        if (uVar.T()) {
            return uVar.N();
        }
        if (uVar.U()) {
            return typeTable.a(uVar.O());
        }
        return null;
    }
}
