package F7;

import C7.j;
import L7.InterfaceC1276a;
import L7.InterfaceC1300z;
import i7.C2750m;
import j7.AbstractC2800q;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e1 f2045a = new e1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final n8.n f2046b = n8.n.f30122h;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2047a;

        static {
            int[] iArr = new int[j.a.values().length];
            try {
                iArr[j.a.f514h.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.a.f513g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j.a.f515i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f2047a = iArr;
        }
    }

    private e1() {
    }

    private final void c(StringBuilder sb, L7.c0 c0Var) {
        if (c0Var != null) {
            C8.S type = c0Var.getType();
            AbstractC2855l.f(type, "getType(...)");
            sb.append(l(type));
            sb.append(".");
        }
    }

    private final void d(StringBuilder sb, InterfaceC1276a interfaceC1276a) {
        L7.c0 c0VarI = j1.i(interfaceC1276a);
        L7.c0 c0VarH0 = interfaceC1276a.h0();
        c(sb, c0VarI);
        boolean z10 = (c0VarI == null || c0VarH0 == null) ? false : true;
        if (z10) {
            sb.append("(");
        }
        c(sb, c0VarH0);
        if (z10) {
            sb.append(")");
        }
    }

    private final String e(InterfaceC1276a interfaceC1276a) {
        if (interfaceC1276a instanceof L7.Z) {
            return k((L7.Z) interfaceC1276a);
        }
        if (interfaceC1276a instanceof InterfaceC1300z) {
            return f((InterfaceC1300z) interfaceC1276a);
        }
        throw new IllegalStateException(("Illegal callable: " + interfaceC1276a).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence g(L7.t0 t0Var) {
        e1 e1Var = f2045a;
        C8.S type = t0Var.getType();
        AbstractC2855l.f(type, "getType(...)");
        return e1Var.l(type);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence i(L7.t0 t0Var) {
        e1 e1Var = f2045a;
        C8.S type = t0Var.getType();
        AbstractC2855l.f(type, "getType(...)");
        return e1Var.l(type);
    }

    public final String f(InterfaceC1300z descriptor) {
        AbstractC2855l.g(descriptor, "descriptor");
        StringBuilder sb = new StringBuilder();
        sb.append("fun ");
        e1 e1Var = f2045a;
        e1Var.d(sb, descriptor);
        n8.n nVar = f2046b;
        k8.f name = descriptor.getName();
        AbstractC2855l.f(name, "getName(...)");
        sb.append(nVar.T(name, true));
        List listI = descriptor.i();
        AbstractC2855l.f(listI, "getValueParameters(...)");
        AbstractC2800q.m0(listI, sb, ", ", "(", ")", 0, null, c1.f2028g, 48, null);
        sb.append(": ");
        C8.S returnType = descriptor.getReturnType();
        AbstractC2855l.d(returnType);
        sb.append(e1Var.l(returnType));
        String string = sb.toString();
        AbstractC2855l.f(string, "toString(...)");
        return string;
    }

    public final String h(InterfaceC1300z invoke) {
        AbstractC2855l.g(invoke, "invoke");
        StringBuilder sb = new StringBuilder();
        e1 e1Var = f2045a;
        e1Var.d(sb, invoke);
        List listI = invoke.i();
        AbstractC2855l.f(listI, "getValueParameters(...)");
        AbstractC2800q.m0(listI, sb, ", ", "(", ")", 0, null, d1.f2042g, 48, null);
        sb.append(" -> ");
        C8.S returnType = invoke.getReturnType();
        AbstractC2855l.d(returnType);
        sb.append(e1Var.l(returnType));
        String string = sb.toString();
        AbstractC2855l.f(string, "toString(...)");
        return string;
    }

    public final String j(C0570y0 parameter) {
        AbstractC2855l.g(parameter, "parameter");
        StringBuilder sb = new StringBuilder();
        int i10 = a.f2047a[parameter.getKind().ordinal()];
        if (i10 == 1) {
            sb.append("extension receiver parameter");
        } else if (i10 == 2) {
            sb.append("instance parameter");
        } else {
            if (i10 != 3) {
                throw new C2750m();
            }
            sb.append("parameter #" + parameter.getIndex() + ' ' + parameter.getName());
        }
        sb.append(" of ");
        sb.append(f2045a.e(parameter.m().Z()));
        String string = sb.toString();
        AbstractC2855l.f(string, "toString(...)");
        return string;
    }

    public final String k(L7.Z descriptor) {
        AbstractC2855l.g(descriptor, "descriptor");
        StringBuilder sb = new StringBuilder();
        sb.append(descriptor.d0() ? "var " : "val ");
        e1 e1Var = f2045a;
        e1Var.d(sb, descriptor);
        n8.n nVar = f2046b;
        k8.f name = descriptor.getName();
        AbstractC2855l.f(name, "getName(...)");
        sb.append(nVar.T(name, true));
        sb.append(": ");
        C8.S type = descriptor.getType();
        AbstractC2855l.f(type, "getType(...)");
        sb.append(e1Var.l(type));
        String string = sb.toString();
        AbstractC2855l.f(string, "toString(...)");
        return string;
    }

    public final String l(C8.S type) {
        AbstractC2855l.g(type, "type");
        return f2046b.U(type);
    }
}
