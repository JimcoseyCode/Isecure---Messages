package D7;

import C7.e;
import C7.o;
import C7.q;
import C7.r;
import C8.AbstractC0407d0;
import C8.C0421k0;
import C8.D0;
import C8.N0;
import C8.S;
import C8.V;
import C8.r0;
import C8.v0;
import F7.U0;
import F7.Y;
import F7.Y0;
import L7.InterfaceC1283h;
import L7.m0;
import i7.C2750m;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f816a;

        static {
            int[] iArr = new int[r.values().length];
            try {
                iArr[r.f523g.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r.f524h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[r.f525i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f816a = iArr;
        }
    }

    private static final AbstractC0407d0 a(r0 r0Var, v0 v0Var, List list, boolean z10) {
        Object c0421k0;
        List parameters = v0Var.getParameters();
        AbstractC2855l.f(parameters, "getParameters(...)");
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(list, 10));
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC2800q.t();
            }
            q qVar = (q) obj;
            U0 u02 = (U0) qVar.c();
            S sV = u02 != null ? u02.v() : null;
            r rVarD = qVar.d();
            int i12 = rVarD == null ? -1 : a.f816a[rVarD.ordinal()];
            if (i12 == -1) {
                Object obj2 = parameters.get(i10);
                AbstractC2855l.f(obj2, "get(...)");
                c0421k0 = new C0421k0((m0) obj2);
            } else if (i12 == 1) {
                N0 n02 = N0.f592k;
                AbstractC2855l.d(sV);
                c0421k0 = new D0(n02, sV);
            } else if (i12 == 2) {
                N0 n03 = N0.f593l;
                AbstractC2855l.d(sV);
                c0421k0 = new D0(n03, sV);
            } else {
                if (i12 != 3) {
                    throw new C2750m();
                }
                N0 n04 = N0.f594m;
                AbstractC2855l.d(sV);
                c0421k0 = new D0(n04, sV);
            }
            arrayList.add(c0421k0);
            i10 = i11;
        }
        return V.k(r0Var, v0Var, arrayList, z10, null, 16, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final o b(e eVar, List arguments, boolean z10, List annotations) {
        InterfaceC1283h interfaceC1283hE;
        AbstractC2855l.g(eVar, "<this>");
        AbstractC2855l.g(arguments, "arguments");
        AbstractC2855l.g(annotations, "annotations");
        InterfaceC3487a interfaceC3487a = null;
        Object[] objArr = 0;
        Y y10 = eVar instanceof Y ? (Y) eVar : null;
        if (y10 == null || (interfaceC1283hE = y10.e()) == null) {
            throw new Y0("Cannot create type for an unsupported classifier: " + eVar + " (" + eVar.getClass() + ')');
        }
        v0 v0VarJ = interfaceC1283hE.j();
        AbstractC2855l.f(v0VarJ, "getTypeConstructor(...)");
        List parameters = v0VarJ.getParameters();
        AbstractC2855l.f(parameters, "getParameters(...)");
        if (parameters.size() == arguments.size()) {
            return new U0(a(annotations.isEmpty() ? r0.f682h.j() : r0.f682h.j(), v0VarJ, arguments, z10), interfaceC3487a, 2, objArr == true ? 1 : 0);
        }
        throw new IllegalArgumentException("Class declares " + parameters.size() + " type parameters, but " + arguments.size() + " were provided.");
    }
}
