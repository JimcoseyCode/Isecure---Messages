package U7;

import C8.A0;
import L7.InterfaceC1276a;
import L7.InterfaceC1280e;
import L7.c0;
import L7.g0;
import L7.t0;
import j7.AbstractC2800q;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;
import o8.C3033o;
import o8.InterfaceC3028j;

/* JADX INFO: renamed from: U7.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1489q implements InterfaceC3028j {

    /* JADX INFO: renamed from: U7.q$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11523a;

        static {
            int[] iArr = new int[C3033o.i.a.values().length];
            try {
                iArr[C3033o.i.a.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f11523a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8.S d(t0 t0Var) {
        return t0Var.getType();
    }

    @Override // o8.InterfaceC3028j
    public InterfaceC3028j.a a() {
        return InterfaceC3028j.a.SUCCESS_ONLY;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o8.InterfaceC3028j
    public InterfaceC3028j.b b(InterfaceC1276a superDescriptor, InterfaceC1276a subDescriptor, InterfaceC1280e interfaceC1280e) {
        AbstractC2855l.g(superDescriptor, "superDescriptor");
        AbstractC2855l.g(subDescriptor, "subDescriptor");
        if (subDescriptor instanceof W7.e) {
            W7.e eVar = (W7.e) subDescriptor;
            List typeParameters = eVar.getTypeParameters();
            AbstractC2855l.f(typeParameters, "getTypeParameters(...)");
            if (typeParameters.isEmpty()) {
                C3033o.i iVarW = C3033o.w(superDescriptor, subDescriptor);
                A0 a02 = null;
                Object[] objArr = 0;
                if ((iVarW != null ? iVarW.c() : null) != null) {
                    return InterfaceC3028j.b.UNKNOWN;
                }
                List listI = eVar.i();
                AbstractC2855l.f(listI, "getValueParameters(...)");
                O8.i iVarJ = O8.l.J(AbstractC2800q.V(listI), C1488p.f11522g);
                C8.S returnType = eVar.getReturnType();
                AbstractC2855l.d(returnType);
                O8.i iVarN = O8.l.N(iVarJ, returnType);
                c0 c0VarH0 = eVar.h0();
                for (C8.S s10 : O8.l.M(iVarN, AbstractC2800q.n(c0VarH0 != null ? c0VarH0.getType() : null))) {
                    if (!s10.I0().isEmpty() && !(s10.N0() instanceof Z7.k)) {
                        return InterfaceC3028j.b.UNKNOWN;
                    }
                }
                InterfaceC1276a interfaceC1276aBuild = (InterfaceC1276a) superDescriptor.c(new Z7.i(a02, 1, objArr == true ? 1 : 0).c());
                if (interfaceC1276aBuild == null) {
                    return InterfaceC3028j.b.UNKNOWN;
                }
                if (interfaceC1276aBuild instanceof g0) {
                    g0 g0Var = (g0) interfaceC1276aBuild;
                    List typeParameters2 = g0Var.getTypeParameters();
                    AbstractC2855l.f(typeParameters2, "getTypeParameters(...)");
                    if (!typeParameters2.isEmpty()) {
                        interfaceC1276aBuild = g0Var.s().n(AbstractC2800q.j()).build();
                        AbstractC2855l.d(interfaceC1276aBuild);
                    }
                }
                C3033o.i.a aVarC = C3033o.f30533f.F(interfaceC1276aBuild, subDescriptor, false).c();
                AbstractC2855l.f(aVarC, "getResult(...)");
                return a.f11523a[aVarC.ordinal()] == 1 ? InterfaceC3028j.b.OVERRIDABLE : InterfaceC3028j.b.UNKNOWN;
            }
        }
        return InterfaceC3028j.b.UNKNOWN;
    }
}
