package U7;

import L7.InterfaceC1276a;
import L7.InterfaceC1277b;
import L7.InterfaceC1280e;
import L7.InterfaceC1283h;
import L7.InterfaceC1288m;
import L7.InterfaceC1300z;
import L7.t0;
import U7.U;
import d8.AbstractC2345C;
import d8.AbstractC2371s;
import j7.AbstractC2800q;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o8.InterfaceC3028j;
import s8.AbstractC3340e;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class z implements InterfaceC3028j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f11543a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean b(InterfaceC1300z interfaceC1300z) {
            if (interfaceC1300z.i().size() != 1) {
                return false;
            }
            InterfaceC1288m interfaceC1288mB = interfaceC1300z.b();
            InterfaceC1280e interfaceC1280e = interfaceC1288mB instanceof InterfaceC1280e ? (InterfaceC1280e) interfaceC1288mB : null;
            if (interfaceC1280e == null) {
                return false;
            }
            List listI = interfaceC1300z.i();
            AbstractC2855l.f(listI, "getValueParameters(...)");
            InterfaceC1283h interfaceC1283hP = ((t0) AbstractC2800q.C0(listI)).getType().K0().p();
            InterfaceC1280e interfaceC1280e2 = interfaceC1283hP instanceof InterfaceC1280e ? (InterfaceC1280e) interfaceC1283hP : null;
            return interfaceC1280e2 != null && I7.i.r0(interfaceC1280e) && AbstractC2855l.b(AbstractC3340e.o(interfaceC1280e), AbstractC3340e.o(interfaceC1280e2));
        }

        private final AbstractC2371s c(InterfaceC1300z interfaceC1300z, t0 t0Var) {
            if (AbstractC2345C.e(interfaceC1300z) || b(interfaceC1300z)) {
                C8.S type = t0Var.getType();
                AbstractC2855l.f(type, "getType(...)");
                return AbstractC2345C.g(H8.d.B(type));
            }
            C8.S type2 = t0Var.getType();
            AbstractC2855l.f(type2, "getType(...)");
            return AbstractC2345C.g(type2);
        }

        public final boolean a(InterfaceC1276a superDescriptor, InterfaceC1276a subDescriptor) {
            AbstractC2855l.g(superDescriptor, "superDescriptor");
            AbstractC2855l.g(subDescriptor, "subDescriptor");
            if ((subDescriptor instanceof W7.e) && (superDescriptor instanceof InterfaceC1300z)) {
                W7.e eVar = (W7.e) subDescriptor;
                eVar.i().size();
                InterfaceC1300z interfaceC1300z = (InterfaceC1300z) superDescriptor;
                interfaceC1300z.i().size();
                List listI = eVar.a().i();
                AbstractC2855l.f(listI, "getValueParameters(...)");
                List listI2 = interfaceC1300z.a().i();
                AbstractC2855l.f(listI2, "getValueParameters(...)");
                for (Pair pair : AbstractC2800q.X0(listI, listI2)) {
                    t0 t0Var = (t0) pair.getFirst();
                    t0 t0Var2 = (t0) pair.getSecond();
                    AbstractC2855l.d(t0Var);
                    boolean z10 = c((InterfaceC1300z) subDescriptor, t0Var) instanceof AbstractC2371s.d;
                    AbstractC2855l.d(t0Var2);
                    if (z10 != (c(interfaceC1300z, t0Var2) instanceof AbstractC2371s.d)) {
                        return true;
                    }
                }
            }
            return false;
        }

        private a() {
        }
    }

    private final boolean c(InterfaceC1276a interfaceC1276a, InterfaceC1276a interfaceC1276a2, InterfaceC1280e interfaceC1280e) {
        if ((interfaceC1276a instanceof InterfaceC1277b) && (interfaceC1276a2 instanceof InterfaceC1300z) && !I7.i.g0(interfaceC1276a2)) {
            C1481i c1481i = C1481i.f11512o;
            InterfaceC1300z interfaceC1300z = (InterfaceC1300z) interfaceC1276a2;
            k8.f name = interfaceC1300z.getName();
            AbstractC2855l.f(name, "getName(...)");
            if (!c1481i.n(name)) {
                U.a aVar = U.f11461a;
                k8.f name2 = interfaceC1300z.getName();
                AbstractC2855l.f(name2, "getName(...)");
                if (!aVar.k(name2)) {
                    return false;
                }
            }
            InterfaceC1277b interfaceC1277bJ = T.j((InterfaceC1277b) interfaceC1276a);
            boolean z10 = interfaceC1276a instanceof InterfaceC1300z;
            InterfaceC1300z interfaceC1300z2 = z10 ? (InterfaceC1300z) interfaceC1276a : null;
            if (!(interfaceC1300z2 != null && interfaceC1300z.t0() == interfaceC1300z2.t0()) && (interfaceC1277bJ == null || !interfaceC1300z.t0())) {
                return true;
            }
            if ((interfaceC1280e instanceof W7.c) && interfaceC1300z.Z() == null && interfaceC1277bJ != null && !T.l(interfaceC1280e, interfaceC1277bJ)) {
                if ((interfaceC1277bJ instanceof InterfaceC1300z) && z10 && C1481i.l((InterfaceC1300z) interfaceC1277bJ) != null) {
                    String strC = AbstractC2345C.c(interfaceC1300z, false, false, 2, null);
                    InterfaceC1300z interfaceC1300zA = ((InterfaceC1300z) interfaceC1276a).a();
                    AbstractC2855l.f(interfaceC1300zA, "getOriginal(...)");
                    if (AbstractC2855l.b(strC, AbstractC2345C.c(interfaceC1300zA, false, false, 2, null))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // o8.InterfaceC3028j
    public InterfaceC3028j.a a() {
        return InterfaceC3028j.a.CONFLICTS_ONLY;
    }

    @Override // o8.InterfaceC3028j
    public InterfaceC3028j.b b(InterfaceC1276a superDescriptor, InterfaceC1276a subDescriptor, InterfaceC1280e interfaceC1280e) {
        AbstractC2855l.g(superDescriptor, "superDescriptor");
        AbstractC2855l.g(subDescriptor, "subDescriptor");
        return c(superDescriptor, subDescriptor, interfaceC1280e) ? InterfaceC3028j.b.INCOMPATIBLE : f11543a.a(superDescriptor, subDescriptor) ? InterfaceC3028j.b.INCOMPATIBLE : InterfaceC3028j.b.UNKNOWN;
    }
}
