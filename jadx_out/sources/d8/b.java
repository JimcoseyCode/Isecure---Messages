package D8;

import C8.AbstractC0407d0;
import C8.B0;
import C8.C0413g0;
import C8.C0438y;
import C8.G0;
import C8.H0;
import C8.I;
import C8.InterfaceC0401a0;
import C8.InterfaceC0405c0;
import C8.J0;
import C8.M0;
import C8.N0;
import C8.Q;
import C8.S;
import C8.V;
import C8.W;
import C8.u0;
import C8.v0;
import C8.w0;
import I7.o;
import L7.EnumC1281f;
import L7.F;
import L7.InterfaceC1280e;
import L7.InterfaceC1283h;
import L7.l0;
import L7.m0;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import o8.AbstractC3029k;
import p8.C3086a;
import s8.AbstractC3340e;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public interface b extends H0, G8.q {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: D8.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class C0031a extends u0.c.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ b f817a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ G0 f818b;

            C0031a(b bVar, G0 g02) {
                this.f817a = bVar;
                this.f818b = g02;
            }

            @Override // C8.u0.c
            public G8.j a(u0 state, G8.i type) {
                AbstractC2855l.g(state, "state");
                AbstractC2855l.g(type, "type");
                b bVar = this.f817a;
                G0 g02 = this.f818b;
                Object objK = bVar.K(type);
                AbstractC2855l.e(objK, "null cannot be cast to non-null type org.jetbrains.kotlin.types.KotlinType");
                S sN = g02.n((S) objK, N0.f592k);
                AbstractC2855l.f(sN, "safeSubstitute(...)");
                G8.j jVarA = bVar.a(sN);
                AbstractC2855l.d(jVarA);
                return jVarA;
            }
        }

        public static boolean A(b bVar, G8.i receiver, k8.c fqName) {
            AbstractC2855l.g(receiver, "$receiver");
            AbstractC2855l.g(fqName, "fqName");
            if (receiver instanceof S) {
                return ((S) receiver).getAnnotations().h(fqName);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + D.b(receiver.getClass())).toString());
        }

        public static boolean B(b bVar, G8.n receiver, G8.m mVar) {
            AbstractC2855l.g(receiver, "$receiver");
            if (!(receiver instanceof m0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + D.b(receiver.getClass())).toString());
            }
            m0 m0Var = (m0) receiver;
            if (mVar == null ? true : mVar instanceof v0) {
                return H8.d.r(m0Var, (v0) mVar, null, 4, null);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + m0Var + ", " + D.b(m0Var.getClass())).toString());
        }

        public static boolean C(b bVar, G8.j a10, G8.j b10) {
            AbstractC2855l.g(a10, "a");
            AbstractC2855l.g(b10, "b");
            if (!(a10 instanceof AbstractC0407d0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + a10 + ", " + D.b(a10.getClass())).toString());
            }
            if (b10 instanceof AbstractC0407d0) {
                return ((AbstractC0407d0) a10).I0() == ((AbstractC0407d0) b10).I0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + b10 + ", " + D.b(b10.getClass())).toString());
        }

        public static G8.i D(b bVar, Collection types) {
            AbstractC2855l.g(types, "types");
            return d.a(types);
        }

        public static boolean E(b bVar, G8.m receiver) {
            AbstractC2855l.g(receiver, "$receiver");
            if (receiver instanceof v0) {
                return I7.i.w0((v0) receiver, o.a.f5185b);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + D.b(receiver.getClass())).toString());
        }

        public static boolean F(b bVar, G8.m receiver) {
            AbstractC2855l.g(receiver, "$receiver");
            if (receiver instanceof v0) {
                return ((v0) receiver).p() instanceof InterfaceC1280e;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + D.b(receiver.getClass())).toString());
        }

        public static boolean G(b bVar, G8.m receiver) {
            AbstractC2855l.g(receiver, "$receiver");
            if (receiver instanceof v0) {
                InterfaceC1283h interfaceC1283hP = ((v0) receiver).p();
                InterfaceC1280e interfaceC1280e = interfaceC1283hP instanceof InterfaceC1280e ? (InterfaceC1280e) interfaceC1283hP : null;
                return (interfaceC1280e == null || !F.a(interfaceC1280e) || interfaceC1280e.getKind() == EnumC1281f.f7323k || interfaceC1280e.getKind() == EnumC1281f.f7324l) ? false : true;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + D.b(receiver.getClass())).toString());
        }

        public static boolean H(b bVar, G8.m receiver) {
            AbstractC2855l.g(receiver, "$receiver");
            if (receiver instanceof v0) {
                return ((v0) receiver).q();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + D.b(receiver.getClass())).toString());
        }

        public static boolean I(b bVar, G8.i receiver) {
            AbstractC2855l.g(receiver, "$receiver");
            if (receiver instanceof S) {
                return W.a((S) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + D.b(receiver.getClass())).toString());
        }

        public static boolean J(b bVar, G8.m receiver) {
            AbstractC2855l.g(receiver, "$receiver");
            if (receiver instanceof v0) {
                InterfaceC1283h interfaceC1283hP = ((v0) receiver).p();
                InterfaceC1280e interfaceC1280e = interfaceC1283hP instanceof InterfaceC1280e ? (InterfaceC1280e) interfaceC1283hP : null;
                return (interfaceC1280e != null ? interfaceC1280e.w0() : null) instanceof L7.A;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + D.b(receiver.getClass())).toString());
        }

        public static boolean K(b bVar, G8.m receiver) {
            AbstractC2855l.g(receiver, "$receiver");
            if (receiver instanceof v0) {
                return receiver instanceof q8.q;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + D.b(receiver.getClass())).toString());
        }

        public static boolean L(b bVar, G8.m receiver) {
            AbstractC2855l.g(receiver, "$receiver");
            if (receiver instanceof v0) {
                return receiver instanceof Q;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + D.b(receiver.getClass())).toString());
        }

        public static boolean M(b bVar) {
            return false;
        }

        public static boolean N(b bVar, G8.j receiver) {
            AbstractC2855l.g(receiver, "$receiver");
            if (receiver instanceof AbstractC0407d0) {
                return ((AbstractC0407d0) receiver).L0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + D.b(receiver.getClass())).toString());
        }

        public static boolean O(b bVar, G8.i receiver) {
            AbstractC2855l.g(receiver, "$receiver");
            return receiver instanceof InterfaceC0401a0;
        }

        public static boolean P(b bVar, G8.m receiver) {
            AbstractC2855l.g(receiver, "$receiver");
            if (receiver instanceof v0) {
                return I7.i.w0((v0) receiver, o.a.f5187c);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + D.b(receiver.getClass())).toString());
        }

        public static boolean Q(b bVar, G8.i receiver) {
            AbstractC2855l.g(receiver, "$receiver");
            if (receiver instanceof S) {
                return J0.l((S) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + D.b(receiver.getClass())).toString());
        }

        public static boolean R(b bVar, G8.d receiver) {
            AbstractC2855l.g(receiver, "$receiver");
            return receiver instanceof C3086a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean S(b bVar, G8.j receiver) {
            AbstractC2855l.g(receiver, "$receiver");
            if (receiver instanceof S) {
                return I7.i.s0((S) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + D.b(receiver.getClass())).toString());
        }

        public static boolean T(b bVar, G8.d receiver) {
            AbstractC2855l.g(receiver, "$receiver");
            if (receiver instanceof i) {
                return ((i) receiver).W0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + D.b(receiver.getClass())).toString());
        }

        public static boolean U(b bVar, G8.i receiver) {
            AbstractC2855l.g(receiver, "$receiver");
            if (receiver instanceof S) {
                return receiver instanceof InterfaceC0405c0;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + D.b(receiver.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean V(b bVar, G8.j receiver) {
            AbstractC2855l.g(receiver, "$receiver");
            if (receiver instanceof AbstractC0407d0) {
                if (W.a((S) receiver)) {
                    return false;
                }
                AbstractC0407d0 abstractC0407d0 = (AbstractC0407d0) receiver;
                if (abstractC0407d0.K0().p() instanceof l0) {
                    return false;
                }
                return abstractC0407d0.K0().p() != null || (receiver instanceof C3086a) || (receiver instanceof i) || (receiver instanceof C0438y) || (abstractC0407d0.K0() instanceof q8.q) || W(bVar, receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + D.b(receiver.getClass())).toString());
        }

        private static boolean W(b bVar, G8.j jVar) {
            return (jVar instanceof C0413g0) && bVar.b(((C0413g0) jVar).C0());
        }

        public static boolean X(b bVar, G8.l receiver) {
            AbstractC2855l.g(receiver, "$receiver");
            if (receiver instanceof B0) {
                return ((B0) receiver).b();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + D.b(receiver.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean Y(b bVar, G8.j receiver) {
            AbstractC2855l.g(receiver, "$receiver");
            if (receiver instanceof AbstractC0407d0) {
                return H8.d.u((S) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + D.b(receiver.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean Z(b bVar, G8.j receiver) {
            AbstractC2855l.g(receiver, "$receiver");
            if (receiver instanceof AbstractC0407d0) {
                return H8.d.v((S) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + D.b(receiver.getClass())).toString());
        }

        public static boolean a(b bVar, G8.m c12, G8.m c22) {
            AbstractC2855l.g(c12, "c1");
            AbstractC2855l.g(c22, "c2");
            if (!(c12 instanceof v0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + c12 + ", " + D.b(c12.getClass())).toString());
            }
            if (c22 instanceof v0) {
                return AbstractC2855l.b(c12, c22);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + c22 + ", " + D.b(c22.getClass())).toString());
        }

        public static boolean a0(b bVar, G8.i receiver) {
            AbstractC2855l.g(receiver, "$receiver");
            if (!(receiver instanceof M0)) {
                return false;
            }
            ((M0) receiver).K0();
            return false;
        }

        public static int b(b bVar, G8.i receiver) {
            AbstractC2855l.g(receiver, "$receiver");
            if (receiver instanceof S) {
                return ((S) receiver).I0().size();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + D.b(receiver.getClass())).toString());
        }

        public static boolean b0(b bVar, G8.m receiver) {
            AbstractC2855l.g(receiver, "$receiver");
            if (receiver instanceof v0) {
                InterfaceC1283h interfaceC1283hP = ((v0) receiver).p();
                return interfaceC1283hP != null && I7.i.B0(interfaceC1283hP);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + D.b(receiver.getClass())).toString());
        }

        public static G8.k c(b bVar, G8.j receiver) {
            AbstractC2855l.g(receiver, "$receiver");
            if (receiver instanceof AbstractC0407d0) {
                return (G8.k) receiver;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + D.b(receiver.getClass())).toString());
        }

        public static G8.j c0(b bVar, G8.g receiver) {
            AbstractC2855l.g(receiver, "$receiver");
            if (receiver instanceof I) {
                return ((I) receiver).S0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + D.b(receiver.getClass())).toString());
        }

        public static G8.d d(b bVar, G8.j receiver) {
            AbstractC2855l.g(receiver, "$receiver");
            if (receiver instanceof AbstractC0407d0) {
                if (receiver instanceof C0413g0) {
                    return bVar.d(((C0413g0) receiver).C0());
                }
                if (receiver instanceof i) {
                    return (i) receiver;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + D.b(receiver.getClass())).toString());
        }

        public static G8.i d0(b bVar, G8.d receiver) {
            AbstractC2855l.g(receiver, "$receiver");
            if (receiver instanceof i) {
                return ((i) receiver).V0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + D.b(receiver.getClass())).toString());
        }

        public static G8.e e(b bVar, G8.j receiver) {
            AbstractC2855l.g(receiver, "$receiver");
            if (receiver instanceof AbstractC0407d0) {
                if (receiver instanceof C0438y) {
                    return (C0438y) receiver;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + D.b(receiver.getClass())).toString());
        }

        public static G8.i e0(b bVar, G8.i receiver, boolean z10) {
            AbstractC2855l.g(receiver, "$receiver");
            if (receiver instanceof M0) {
                return c.b((M0) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + D.b(receiver.getClass())).toString());
        }

        public static G8.f f(b bVar, G8.g receiver) {
            AbstractC2855l.g(receiver, "$receiver");
            if (receiver instanceof I) {
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + D.b(receiver.getClass())).toString());
        }

        public static u0 f0(b bVar, boolean z10, boolean z11) {
            return AbstractC0440a.b(z10, z11, bVar, null, null, 24, null);
        }

        public static G8.g g(b bVar, G8.i receiver) {
            AbstractC2855l.g(receiver, "$receiver");
            if (receiver instanceof S) {
                M0 m0N0 = ((S) receiver).N0();
                if (m0N0 instanceof I) {
                    return (I) m0N0;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + D.b(receiver.getClass())).toString());
        }

        public static G8.j g0(b bVar, G8.e receiver) {
            AbstractC2855l.g(receiver, "$receiver");
            if (receiver instanceof C0438y) {
                return ((C0438y) receiver).W0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + D.b(receiver.getClass())).toString());
        }

        public static G8.j h(b bVar, G8.i receiver) {
            AbstractC2855l.g(receiver, "$receiver");
            if (receiver instanceof S) {
                M0 m0N0 = ((S) receiver).N0();
                if (m0N0 instanceof AbstractC0407d0) {
                    return (AbstractC0407d0) m0N0;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + D.b(receiver.getClass())).toString());
        }

        public static int h0(b bVar, G8.m receiver) {
            AbstractC2855l.g(receiver, "$receiver");
            if (receiver instanceof v0) {
                return ((v0) receiver).getParameters().size();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + D.b(receiver.getClass())).toString());
        }

        public static G8.l i(b bVar, G8.i receiver) {
            AbstractC2855l.g(receiver, "$receiver");
            if (receiver instanceof S) {
                return H8.d.d((S) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + D.b(receiver.getClass())).toString());
        }

        public static Collection i0(b bVar, G8.j receiver) {
            AbstractC2855l.g(receiver, "$receiver");
            G8.m mVarC = bVar.c(receiver);
            if (mVarC instanceof q8.q) {
                return ((q8.q) mVarC).e();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + D.b(receiver.getClass())).toString());
        }

        public static G8.j j(b bVar, G8.j type, G8.b status) {
            AbstractC2855l.g(type, "type");
            AbstractC2855l.g(status, "status");
            if (type instanceof AbstractC0407d0) {
                return o.b((AbstractC0407d0) type, status);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + type + ", " + D.b(type.getClass())).toString());
        }

        public static G8.l j0(b bVar, G8.c receiver) {
            AbstractC2855l.g(receiver, "$receiver");
            if (receiver instanceof n) {
                return ((n) receiver).getProjection();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + D.b(receiver.getClass())).toString());
        }

        public static G8.b k(b bVar, G8.d receiver) {
            AbstractC2855l.g(receiver, "$receiver");
            if (receiver instanceof i) {
                return ((i) receiver).T0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + D.b(receiver.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static u0.c k0(b bVar, G8.j type) {
            AbstractC2855l.g(type, "type");
            if (type instanceof AbstractC0407d0) {
                return new C0031a(bVar, w0.f710c.a((S) type).c());
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + type + ", " + D.b(type.getClass())).toString());
        }

        public static G8.i l(b bVar, G8.j lowerBound, G8.j upperBound) {
            AbstractC2855l.g(lowerBound, "lowerBound");
            AbstractC2855l.g(upperBound, "upperBound");
            if (!(lowerBound instanceof AbstractC0407d0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + bVar + ", " + D.b(bVar.getClass())).toString());
            }
            if (upperBound instanceof AbstractC0407d0) {
                return V.e((AbstractC0407d0) lowerBound, (AbstractC0407d0) upperBound);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + bVar + ", " + D.b(bVar.getClass())).toString());
        }

        public static Collection l0(b bVar, G8.m receiver) {
            AbstractC2855l.g(receiver, "$receiver");
            if (receiver instanceof v0) {
                Collection collectionG = ((v0) receiver).g();
                AbstractC2855l.f(collectionG, "getSupertypes(...)");
                return collectionG;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + D.b(receiver.getClass())).toString());
        }

        public static G8.l m(b bVar, G8.i receiver, int i10) {
            AbstractC2855l.g(receiver, "$receiver");
            if (receiver instanceof S) {
                return (G8.l) ((S) receiver).I0().get(i10);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + D.b(receiver.getClass())).toString());
        }

        public static G8.c m0(b bVar, G8.d receiver) {
            AbstractC2855l.g(receiver, "$receiver");
            if (receiver instanceof i) {
                return ((i) receiver).K0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + D.b(receiver.getClass())).toString());
        }

        public static List n(b bVar, G8.i receiver) {
            AbstractC2855l.g(receiver, "$receiver");
            if (receiver instanceof S) {
                return ((S) receiver).I0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + D.b(receiver.getClass())).toString());
        }

        public static G8.m n0(b bVar, G8.j receiver) {
            AbstractC2855l.g(receiver, "$receiver");
            if (receiver instanceof AbstractC0407d0) {
                return ((AbstractC0407d0) receiver).K0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + D.b(receiver.getClass())).toString());
        }

        public static k8.d o(b bVar, G8.m receiver) {
            AbstractC2855l.g(receiver, "$receiver");
            if (receiver instanceof v0) {
                InterfaceC1283h interfaceC1283hP = ((v0) receiver).p();
                AbstractC2855l.e(interfaceC1283hP, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return AbstractC3340e.p((InterfaceC1280e) interfaceC1283hP);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + D.b(receiver.getClass())).toString());
        }

        public static G8.j o0(b bVar, G8.g receiver) {
            AbstractC2855l.g(receiver, "$receiver");
            if (receiver instanceof I) {
                return ((I) receiver).T0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + D.b(receiver.getClass())).toString());
        }

        public static G8.n p(b bVar, G8.m receiver, int i10) {
            AbstractC2855l.g(receiver, "$receiver");
            if (receiver instanceof v0) {
                Object obj = ((v0) receiver).getParameters().get(i10);
                AbstractC2855l.f(obj, "get(...)");
                return (G8.n) obj;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + D.b(receiver.getClass())).toString());
        }

        public static G8.i p0(b bVar, G8.i receiver, boolean z10) {
            AbstractC2855l.g(receiver, "$receiver");
            if (receiver instanceof G8.j) {
                return bVar.g((G8.j) receiver, z10);
            }
            if (!(receiver instanceof G8.g)) {
                throw new IllegalStateException("sealed");
            }
            G8.g gVar = (G8.g) receiver;
            return bVar.F(bVar.g(bVar.f(gVar), z10), bVar.g(bVar.e(gVar), z10));
        }

        public static List q(b bVar, G8.m receiver) {
            AbstractC2855l.g(receiver, "$receiver");
            if (receiver instanceof v0) {
                List parameters = ((v0) receiver).getParameters();
                AbstractC2855l.f(parameters, "getParameters(...)");
                return parameters;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + D.b(receiver.getClass())).toString());
        }

        public static G8.j q0(b bVar, G8.j receiver, boolean z10) {
            AbstractC2855l.g(receiver, "$receiver");
            if (receiver instanceof AbstractC0407d0) {
                return ((AbstractC0407d0) receiver).O0(z10);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + D.b(receiver.getClass())).toString());
        }

        public static I7.l r(b bVar, G8.m receiver) {
            AbstractC2855l.g(receiver, "$receiver");
            if (receiver instanceof v0) {
                InterfaceC1283h interfaceC1283hP = ((v0) receiver).p();
                AbstractC2855l.e(interfaceC1283hP, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return I7.i.P((InterfaceC1280e) interfaceC1283hP);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + D.b(receiver.getClass())).toString());
        }

        public static I7.l s(b bVar, G8.m receiver) {
            AbstractC2855l.g(receiver, "$receiver");
            if (receiver instanceof v0) {
                InterfaceC1283h interfaceC1283hP = ((v0) receiver).p();
                AbstractC2855l.e(interfaceC1283hP, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return I7.i.S((InterfaceC1280e) interfaceC1283hP);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + D.b(receiver.getClass())).toString());
        }

        public static G8.i t(b bVar, G8.n receiver) {
            AbstractC2855l.g(receiver, "$receiver");
            if (receiver instanceof m0) {
                return H8.d.o((m0) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + D.b(receiver.getClass())).toString());
        }

        public static G8.i u(b bVar, G8.l receiver) {
            AbstractC2855l.g(receiver, "$receiver");
            if (receiver instanceof B0) {
                return ((B0) receiver).getType().N0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + D.b(receiver.getClass())).toString());
        }

        public static G8.n v(b bVar, G8.m receiver) {
            AbstractC2855l.g(receiver, "$receiver");
            if (receiver instanceof v0) {
                InterfaceC1283h interfaceC1283hP = ((v0) receiver).p();
                if (interfaceC1283hP instanceof m0) {
                    return (m0) interfaceC1283hP;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + D.b(receiver.getClass())).toString());
        }

        public static G8.i w(b bVar, G8.i receiver) {
            AbstractC2855l.g(receiver, "$receiver");
            if (receiver instanceof S) {
                return AbstractC3029k.k((S) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + D.b(receiver.getClass())).toString());
        }

        public static List x(b bVar, G8.n receiver) {
            AbstractC2855l.g(receiver, "$receiver");
            if (receiver instanceof m0) {
                List upperBounds = ((m0) receiver).getUpperBounds();
                AbstractC2855l.f(upperBounds, "getUpperBounds(...)");
                return upperBounds;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + D.b(receiver.getClass())).toString());
        }

        public static G8.s y(b bVar, G8.l receiver) {
            AbstractC2855l.g(receiver, "$receiver");
            if (receiver instanceof B0) {
                N0 n0A = ((B0) receiver).a();
                AbstractC2855l.f(n0A, "getProjectionKind(...)");
                return G8.p.a(n0A);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + D.b(receiver.getClass())).toString());
        }

        public static G8.s z(b bVar, G8.n receiver) {
            AbstractC2855l.g(receiver, "$receiver");
            if (receiver instanceof m0) {
                N0 n0M = ((m0) receiver).m();
                AbstractC2855l.f(n0M, "getVariance(...)");
                return G8.p.a(n0M);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + D.b(receiver.getClass())).toString());
        }
    }

    G8.i F(G8.j jVar, G8.j jVar2);

    @Override // G8.o
    G8.j a(G8.i iVar);

    @Override // G8.o
    boolean b(G8.j jVar);

    @Override // G8.o
    G8.m c(G8.j jVar);

    @Override // G8.o
    G8.d d(G8.j jVar);

    @Override // G8.o
    G8.j e(G8.g gVar);

    @Override // G8.o
    G8.j f(G8.g gVar);

    @Override // G8.o
    G8.j g(G8.j jVar, boolean z10);
}
