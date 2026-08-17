package n8;

import C8.AbstractC0407d0;
import C8.AbstractC0415h0;
import C8.B0;
import C8.C0400a;
import C8.C0438y;
import C8.I;
import C8.J0;
import C8.M0;
import C8.N0;
import C8.O0;
import C8.Q;
import C8.S;
import C8.W;
import C8.v0;
import I7.o;
import L7.AbstractC1294t;
import L7.AbstractC1295u;
import L7.EnumC1281f;
import L7.H;
import L7.InterfaceC1276a;
import L7.InterfaceC1277b;
import L7.InterfaceC1279d;
import L7.InterfaceC1280e;
import L7.InterfaceC1283h;
import L7.InterfaceC1284i;
import L7.InterfaceC1287l;
import L7.InterfaceC1288m;
import L7.InterfaceC1290o;
import L7.InterfaceC1291p;
import L7.InterfaceC1297w;
import L7.InterfaceC1300z;
import L7.M;
import L7.N;
import L7.V;
import L7.X;
import L7.Y;
import L7.Z;
import L7.a0;
import L7.b0;
import L7.c0;
import L7.l0;
import L7.m0;
import L7.q0;
import L7.t0;
import L7.u0;
import P8.AbstractC1382a;
import com.facebook.react.uimanager.events.PointerEventHelper;
import i7.AbstractC2746i;
import i7.C2735B;
import i7.C2750m;
import j7.AbstractC2800q;
import j7.T;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import n8.n;
import o8.AbstractC3027i;
import q8.C3136a;
import q8.C3137b;
import q8.s;
import s8.AbstractC3340e;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class u extends n implements w {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final z f30135m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Lazy f30136n;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private final class a implements InterfaceC1290o {

        /* JADX INFO: renamed from: n8.u$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public /* synthetic */ class C0327a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f30138a;

            static {
                int[] iArr = new int[E.values().length];
                try {
                    iArr[E.f30085g.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[E.f30086h.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[E.f30087i.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f30138a = iArr;
            }
        }

        public a() {
        }

        private final void t(Y y10, StringBuilder sb, String str) {
            int i10 = C0327a.f30138a[u.this.P0().ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    p(y10, sb);
                    return;
                } else {
                    if (i10 != 3) {
                        throw new C2750m();
                    }
                    return;
                }
            }
            u.this.w1(y10, sb);
            sb.append(str + " for ");
            u uVar = u.this;
            Z zY0 = y10.y0();
            AbstractC2855l.f(zY0, "getCorrespondingProperty(...)");
            uVar.h2(zY0, sb);
        }

        public void A(t0 descriptor, StringBuilder builder) {
            AbstractC2855l.g(descriptor, "descriptor");
            AbstractC2855l.g(builder, "builder");
            u.this.B2(descriptor, true, builder, true);
        }

        @Override // L7.InterfaceC1290o
        public /* bridge */ /* synthetic */ Object a(t0 t0Var, Object obj) {
            A(t0Var, (StringBuilder) obj);
            return C2735B.f28704a;
        }

        @Override // L7.InterfaceC1290o
        public /* bridge */ /* synthetic */ Object b(V v10, Object obj) {
            s(v10, (StringBuilder) obj);
            return C2735B.f28704a;
        }

        @Override // L7.InterfaceC1290o
        public /* bridge */ /* synthetic */ Object c(Z z10, Object obj) {
            u(z10, (StringBuilder) obj);
            return C2735B.f28704a;
        }

        @Override // L7.InterfaceC1290o
        public /* bridge */ /* synthetic */ Object d(InterfaceC1300z interfaceC1300z, Object obj) {
            p(interfaceC1300z, (StringBuilder) obj);
            return C2735B.f28704a;
        }

        @Override // L7.InterfaceC1290o
        public /* bridge */ /* synthetic */ Object e(InterfaceC1287l interfaceC1287l, Object obj) {
            o(interfaceC1287l, (StringBuilder) obj);
            return C2735B.f28704a;
        }

        @Override // L7.InterfaceC1290o
        public /* bridge */ /* synthetic */ Object f(m0 m0Var, Object obj) {
            z(m0Var, (StringBuilder) obj);
            return C2735B.f28704a;
        }

        @Override // L7.InterfaceC1290o
        public /* bridge */ /* synthetic */ Object g(c0 c0Var, Object obj) {
            x(c0Var, (StringBuilder) obj);
            return C2735B.f28704a;
        }

        @Override // L7.InterfaceC1290o
        public /* bridge */ /* synthetic */ Object h(InterfaceC1280e interfaceC1280e, Object obj) {
            n(interfaceC1280e, (StringBuilder) obj);
            return C2735B.f28704a;
        }

        @Override // L7.InterfaceC1290o
        public /* bridge */ /* synthetic */ Object i(a0 a0Var, Object obj) {
            v(a0Var, (StringBuilder) obj);
            return C2735B.f28704a;
        }

        @Override // L7.InterfaceC1290o
        public /* bridge */ /* synthetic */ Object j(l0 l0Var, Object obj) {
            y(l0Var, (StringBuilder) obj);
            return C2735B.f28704a;
        }

        @Override // L7.InterfaceC1290o
        public /* bridge */ /* synthetic */ Object k(H h10, Object obj) {
            q(h10, (StringBuilder) obj);
            return C2735B.f28704a;
        }

        @Override // L7.InterfaceC1290o
        public /* bridge */ /* synthetic */ Object l(N n10, Object obj) {
            r(n10, (StringBuilder) obj);
            return C2735B.f28704a;
        }

        @Override // L7.InterfaceC1290o
        public /* bridge */ /* synthetic */ Object m(b0 b0Var, Object obj) {
            w(b0Var, (StringBuilder) obj);
            return C2735B.f28704a;
        }

        public void n(InterfaceC1280e descriptor, StringBuilder builder) {
            AbstractC2855l.g(descriptor, "descriptor");
            AbstractC2855l.g(builder, "builder");
            u.this.C1(descriptor, builder);
        }

        public void o(InterfaceC1287l constructorDescriptor, StringBuilder builder) {
            AbstractC2855l.g(constructorDescriptor, "constructorDescriptor");
            AbstractC2855l.g(builder, "builder");
            u.this.H1(constructorDescriptor, builder);
        }

        public void p(InterfaceC1300z descriptor, StringBuilder builder) {
            AbstractC2855l.g(descriptor, "descriptor");
            AbstractC2855l.g(builder, "builder");
            u.this.P1(descriptor, builder);
        }

        public void q(H descriptor, StringBuilder builder) {
            AbstractC2855l.g(descriptor, "descriptor");
            AbstractC2855l.g(builder, "builder");
            u.this.Z1(descriptor, builder, true);
        }

        public void r(N descriptor, StringBuilder builder) {
            AbstractC2855l.g(descriptor, "descriptor");
            AbstractC2855l.g(builder, "builder");
            u.this.d2(descriptor, builder);
        }

        public void s(V descriptor, StringBuilder builder) {
            AbstractC2855l.g(descriptor, "descriptor");
            AbstractC2855l.g(builder, "builder");
            u.this.f2(descriptor, builder);
        }

        public void u(Z descriptor, StringBuilder builder) {
            AbstractC2855l.g(descriptor, "descriptor");
            AbstractC2855l.g(builder, "builder");
            u.this.h2(descriptor, builder);
        }

        public void v(a0 descriptor, StringBuilder builder) {
            AbstractC2855l.g(descriptor, "descriptor");
            AbstractC2855l.g(builder, "builder");
            t(descriptor, builder, "getter");
        }

        public void w(b0 descriptor, StringBuilder builder) {
            AbstractC2855l.g(descriptor, "descriptor");
            AbstractC2855l.g(builder, "builder");
            t(descriptor, builder, "setter");
        }

        public void x(c0 descriptor, StringBuilder builder) {
            AbstractC2855l.g(descriptor, "descriptor");
            AbstractC2855l.g(builder, "builder");
            builder.append(descriptor.getName());
        }

        public void y(l0 descriptor, StringBuilder builder) {
            AbstractC2855l.g(descriptor, "descriptor");
            AbstractC2855l.g(builder, "builder");
            u.this.q2(descriptor, builder);
        }

        public void z(m0 descriptor, StringBuilder builder) {
            AbstractC2855l.g(descriptor, "descriptor");
            AbstractC2855l.g(builder, "builder");
            u.this.w2(descriptor, builder, true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30139a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f30140b;

        static {
            int[] iArr = new int[F.values().length];
            try {
                iArr[F.f30090g.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[F.f30091h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f30139a = iArr;
            int[] iArr2 = new int[D.values().length];
            try {
                iArr2[D.f30080g.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[D.f30081h.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[D.f30082i.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f30140b = iArr2;
        }
    }

    public u(z options) {
        AbstractC2855l.g(options, "options");
        this.f30135m = options;
        options.p0();
        this.f30136n = AbstractC2746i.b(new o(this));
    }

    static /* synthetic */ void A1(u uVar, StringBuilder sb, M7.a aVar, M7.e eVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            eVar = null;
        }
        uVar.z1(sb, aVar, eVar);
    }

    static /* synthetic */ void A2(u uVar, u0 u0Var, StringBuilder sb, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        uVar.z2(u0Var, sb, z10);
    }

    private final void B1(InterfaceC1284i interfaceC1284i, StringBuilder sb) {
        List listT = interfaceC1284i.t();
        AbstractC2855l.f(listT, "getDeclaredTypeParameters(...)");
        List parameters = interfaceC1284i.j().getParameters();
        AbstractC2855l.f(parameters, "getParameters(...)");
        if (j1() && interfaceC1284i.K() && parameters.size() > listT.size()) {
            sb.append(" /*captured type parameters: ");
            x2(sb, parameters.subList(listT.size(), parameters.size()));
            sb.append("*/");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B2(t0 t0Var, boolean z10, StringBuilder sb, boolean z11) {
        boolean z12;
        if (z11) {
            sb.append(S1("value-parameter"));
            sb.append(" ");
        }
        if (j1()) {
            sb.append("/*");
            sb.append(t0Var.getIndex());
            sb.append("*/ ");
        }
        A1(this, sb, t0Var, null, 2, null);
        Y1(sb, t0Var.X(), "crossinline");
        Y1(sb, t0Var.V(), "noinline");
        boolean z13 = false;
        if (Y0()) {
            InterfaceC1276a interfaceC1276aB = t0Var.b();
            InterfaceC1279d interfaceC1279d = interfaceC1276aB instanceof InterfaceC1279d ? (InterfaceC1279d) interfaceC1276aB : null;
            z12 = interfaceC1279d != null && interfaceC1279d.A();
        }
        if (z12) {
            Y1(sb, v0(), "actual");
        }
        D2(t0Var, z10, sb, z11, z12);
        if (B0() != null) {
            if (o() ? t0Var.q0() : AbstractC3340e.f(t0Var)) {
                z13 = true;
            }
        }
        if (z13) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" = ");
            Function1 function1B0 = B0();
            AbstractC2855l.d(function1B0);
            sb2.append((String) function1B0.invoke(t0Var));
            sb.append(sb2.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C1(InterfaceC1280e interfaceC1280e, StringBuilder sb) {
        InterfaceC1279d interfaceC1279dO;
        boolean z10 = interfaceC1280e.getKind() == EnumC1281f.f7323k;
        if (!d1()) {
            List listD0 = interfaceC1280e.D0();
            AbstractC2855l.f(listD0, "getContextReceivers(...)");
            J1(listD0, sb);
            A1(this, sb, interfaceC1280e, null, 2, null);
            if (!z10) {
                AbstractC1295u visibility = interfaceC1280e.getVisibility();
                AbstractC2855l.f(visibility, "getVisibility(...)");
                E2(visibility, sb);
            }
            if ((interfaceC1280e.getKind() != EnumC1281f.f7321i || interfaceC1280e.k() != L7.E.f7286k) && (!interfaceC1280e.getKind().j() || interfaceC1280e.k() != L7.E.f7283h)) {
                L7.E eK = interfaceC1280e.k();
                AbstractC2855l.f(eK, "getModality(...)");
                W1(eK, sb, r1(interfaceC1280e));
            }
            U1(interfaceC1280e, sb);
            Y1(sb, I0().contains(v.f30148o) && interfaceC1280e.K(), "inner");
            Y1(sb, I0().contains(v.f30150q) && interfaceC1280e.F0(), "data");
            Y1(sb, I0().contains(v.f30151r) && interfaceC1280e.isInline(), "inline");
            Y1(sb, I0().contains(v.f30157x) && interfaceC1280e.l(), "value");
            Y1(sb, I0().contains(v.f30156w) && interfaceC1280e.C(), "fun");
            D1(interfaceC1280e, sb);
        }
        if (AbstractC3027i.x(interfaceC1280e)) {
            F1(interfaceC1280e, sb);
        } else {
            if (!d1()) {
                m2(sb);
            }
            Z1(interfaceC1280e, sb, true);
        }
        if (z10) {
            return;
        }
        List listT = interfaceC1280e.t();
        AbstractC2855l.f(listT, "getDeclaredTypeParameters(...)");
        y2(listT, sb, false);
        B1(interfaceC1280e, sb);
        if (!interfaceC1280e.getKind().j() && z0() && (interfaceC1279dO = interfaceC1280e.O()) != null) {
            sb.append(" ");
            A1(this, sb, interfaceC1279dO, null, 2, null);
            AbstractC1295u visibility2 = interfaceC1279dO.getVisibility();
            AbstractC2855l.f(visibility2, "getVisibility(...)");
            E2(visibility2, sb);
            sb.append(S1("constructor"));
            List listI = interfaceC1279dO.i();
            AbstractC2855l.f(listI, "getValueParameters(...)");
            C2(listI, interfaceC1279dO.F(), sb);
        }
        n2(interfaceC1280e, sb);
        F2(listT, sb);
    }

    private final void C2(Collection collection, boolean z10, StringBuilder sb) {
        boolean zH2 = H2(z10);
        int size = collection.size();
        i1().b(size, sb);
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            t0 t0Var = (t0) it.next();
            i1().d(t0Var, i10, size, sb);
            B2(t0Var, zH2, sb, false);
            i1().a(t0Var, i10, size, sb);
            i10++;
        }
        i1().c(size, sb);
    }

    private final void D1(InterfaceC1280e interfaceC1280e, StringBuilder sb) {
        sb.append(S1(n.f30115a.a(interfaceC1280e)));
    }

    private final void D2(u0 u0Var, boolean z10, StringBuilder sb, boolean z11, boolean z12) {
        S type = u0Var.getType();
        AbstractC2855l.f(type, "getType(...)");
        t0 t0Var = u0Var instanceof t0 ? (t0) u0Var : null;
        S sF0 = t0Var != null ? t0Var.f0() : null;
        S s10 = sF0 == null ? type : sF0;
        Y1(sb, sF0 != null, "vararg");
        if (z12 || (z11 && !d1())) {
            z2(u0Var, sb, z12);
        }
        if (z10) {
            Z1(u0Var, sb, z11);
            sb.append(": ");
        }
        sb.append(U(s10));
        R1(u0Var, sb);
        if (!j1() || sF0 == null) {
            return;
        }
        sb.append(" /*");
        sb.append(U(type));
        sb.append("*/");
    }

    private final u E0() {
        return (u) this.f30136n.getValue();
    }

    private final boolean E2(AbstractC1295u abstractC1295u, StringBuilder sb) {
        if (!I0().contains(v.f30144k)) {
            return false;
        }
        if (J0()) {
            abstractC1295u = abstractC1295u.f();
        }
        if (!X0() && AbstractC2855l.b(abstractC1295u, AbstractC1294t.f7354l)) {
            return false;
        }
        sb.append(S1(abstractC1295u.c()));
        sb.append(" ");
        return true;
    }

    private final void F1(InterfaceC1288m interfaceC1288m, StringBuilder sb) {
        if (S0()) {
            if (d1()) {
                sb.append("companion object");
            }
            m2(sb);
            InterfaceC1288m interfaceC1288mB = interfaceC1288m.b();
            if (interfaceC1288mB != null) {
                sb.append("of ");
                k8.f name = interfaceC1288mB.getName();
                AbstractC2855l.f(name, "getName(...)");
                sb.append(T(name, false));
            }
        }
        if (j1() || !AbstractC2855l.b(interfaceC1288m.getName(), k8.h.f29223d)) {
            if (!d1()) {
                m2(sb);
            }
            k8.f name2 = interfaceC1288m.getName();
            AbstractC2855l.f(name2, "getName(...)");
            sb.append(T(name2, true));
        }
    }

    private final void F2(List list, StringBuilder sb) {
        if (o1()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m0 m0Var = (m0) it.next();
            List upperBounds = m0Var.getUpperBounds();
            AbstractC2855l.f(upperBounds, "getUpperBounds(...)");
            for (S s10 : AbstractC2800q.Z(upperBounds, 1)) {
                StringBuilder sb2 = new StringBuilder();
                k8.f name = m0Var.getName();
                AbstractC2855l.f(name, "getName(...)");
                sb2.append(T(name, false));
                sb2.append(" : ");
                AbstractC2855l.d(s10);
                sb2.append(U(s10));
                arrayList.add(sb2.toString());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        sb.append(" ");
        sb.append(S1("where"));
        sb.append(" ");
        AbstractC2800q.m0(arrayList, sb, ", ", null, null, 0, null, null, 124, null);
    }

    private final String G1(q8.g gVar) {
        Function1 function1P = this.f30135m.P();
        if (function1P != null) {
            return (String) function1P.invoke(gVar);
        }
        if (gVar instanceof C3137b) {
            Iterable iterable = (Iterable) ((C3137b) gVar).b();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                String strG1 = G1((q8.g) it.next());
                if (strG1 != null) {
                    arrayList.add(strG1);
                }
            }
            return AbstractC2800q.o0(arrayList, ", ", "{", "}", 0, null, null, 56, null);
        }
        if (gVar instanceof C3136a) {
            return P8.q.w0(n.Q(this, (M7.c) ((C3136a) gVar).b(), null, 2, null), "@");
        }
        if (!(gVar instanceof q8.s)) {
            return gVar.toString();
        }
        s.b bVar = (s.b) ((q8.s) gVar).b();
        if (bVar instanceof s.b.a) {
            return ((s.b.a) bVar).a() + "::class";
        }
        if (!(bVar instanceof s.b.C0350b)) {
            throw new C2750m();
        }
        s.b.C0350b c0350b = (s.b.C0350b) bVar;
        String strB = c0350b.b().a().b();
        AbstractC2855l.f(strB, "asString(...)");
        for (int i10 = 0; i10 < c0350b.a(); i10++) {
            strB = "kotlin.Array<" + strB + '>';
        }
        return strB + "::class";
    }

    private final boolean G2(S s10) {
        if (!I7.h.p(s10)) {
            return false;
        }
        List listI0 = s10.I0();
        if (listI0 != null && listI0.isEmpty()) {
            return true;
        }
        Iterator it = listI0.iterator();
        while (it.hasNext()) {
            if (((B0) it.next()).b()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H1(InterfaceC1287l interfaceC1287l, StringBuilder sb) {
        boolean z10;
        InterfaceC1279d interfaceC1279dO;
        A1(this, sb, interfaceC1287l, null, 2, null);
        if (this.f30135m.X() || interfaceC1287l.B().k() != L7.E.f7284i) {
            AbstractC1295u visibility = interfaceC1287l.getVisibility();
            AbstractC2855l.f(visibility, "getVisibility(...)");
            z10 = E2(visibility, sb);
        }
        T1(interfaceC1287l, sb);
        boolean z11 = U0() || !interfaceC1287l.A() || z10;
        if (z11) {
            sb.append(S1("constructor"));
        }
        InterfaceC1284i interfaceC1284iB = interfaceC1287l.b();
        AbstractC2855l.f(interfaceC1284iB, "getContainingDeclaration(...)");
        if (b1()) {
            if (z11) {
                sb.append(" ");
            }
            Z1(interfaceC1284iB, sb, true);
            List typeParameters = interfaceC1287l.getTypeParameters();
            AbstractC2855l.f(typeParameters, "getTypeParameters(...)");
            y2(typeParameters, sb, false);
        }
        List listI = interfaceC1287l.i();
        AbstractC2855l.f(listI, "getValueParameters(...)");
        C2(listI, interfaceC1287l.F(), sb);
        if (T0() && !interfaceC1287l.A() && (interfaceC1284iB instanceof InterfaceC1280e) && (interfaceC1279dO = ((InterfaceC1280e) interfaceC1284iB).O()) != null) {
            List listI2 = interfaceC1279dO.i();
            AbstractC2855l.f(listI2, "getValueParameters(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj : listI2) {
                t0 t0Var = (t0) obj;
                if (!t0Var.q0() && t0Var.f0() == null) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                sb.append(" : ");
                sb.append(S1("this"));
                sb.append(AbstractC2800q.o0(arrayList, ", ", "(", ")", 0, null, r.f30132g, 24, null));
            }
        }
        if (b1()) {
            List typeParameters2 = interfaceC1287l.getTypeParameters();
            AbstractC2855l.f(typeParameters2, "getTypeParameters(...)");
            F2(typeParameters2, sb);
        }
    }

    private final boolean H2(boolean z10) {
        int i10 = b.f30140b[M0().ordinal()];
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return !z10;
        }
        if (i10 == 3) {
            return false;
        }
        throw new C2750m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence I1(t0 t0Var) {
        return PointerEventHelper.POINTER_TYPE_UNKNOWN;
    }

    private final void J1(List list, StringBuilder sb) {
        if (list.isEmpty()) {
            return;
        }
        sb.append("context(");
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            int i11 = i10 + 1;
            c0 c0Var = (c0) it.next();
            z1(sb, c0Var, M7.e.f7557m);
            S type = c0Var.getType();
            AbstractC2855l.f(type, "getType(...)");
            sb.append(N1(type));
            if (i10 == AbstractC2800q.l(list)) {
                sb.append(") ");
            } else {
                sb.append(", ");
            }
            i10 = i11;
        }
    }

    private final void K1(StringBuilder sb, S s10) {
        A1(this, sb, s10, null, 2, null);
        C0438y c0438y = s10 instanceof C0438y ? (C0438y) s10 : null;
        if (c0438y != null) {
            c0438y.W0();
        }
        if (!W.a(s10)) {
            v2(this, sb, s10, null, 2, null);
            C2735B c2735b = C2735B.f28704a;
        } else if (H8.d.z(s10) && O0()) {
            sb.append(L1(E8.l.f1253a.p(s10)));
        } else {
            if (!(s10 instanceof E8.i) || H0()) {
                sb.append(s10.K0().toString());
            } else {
                sb.append(((E8.i) s10).T0());
            }
            sb.append(r2(s10.I0()));
        }
        if (s10.L0()) {
            sb.append("?");
        }
        if (AbstractC0415h0.c(s10)) {
            sb.append(" & Any");
        }
    }

    private final String L1(String str) {
        int i10 = b.f30139a[e1().ordinal()];
        if (i10 == 1) {
            return str;
        }
        if (i10 != 2) {
            throw new C2750m();
        }
        return "<font color=red><b>" + str + "</b></font>";
    }

    private final void M1(StringBuilder sb, C0400a c0400a) {
        F fE1 = e1();
        F f10 = F.f30091h;
        if (fE1 == f10) {
            sb.append("<font color=\"808080\"><i>");
        }
        sb.append(" /* ");
        sb.append("= ");
        b2(sb, c0400a.T());
        sb.append(" */");
        if (e1() == f10) {
            sb.append("</i></font>");
        }
    }

    private final String N1(S s10) {
        String strU = U(s10);
        if ((!G2(s10) || J0.l(s10)) && !(s10 instanceof C0438y)) {
            return strU;
        }
        return '(' + strU + ')';
    }

    private final String O1(List list) {
        return s0(G.c(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P1(InterfaceC1300z interfaceC1300z, StringBuilder sb) {
        InterfaceC1300z interfaceC1300z2;
        StringBuilder sb2;
        if (d1()) {
            interfaceC1300z2 = interfaceC1300z;
            sb2 = sb;
        } else {
            if (c1()) {
                interfaceC1300z2 = interfaceC1300z;
                sb2 = sb;
            } else {
                List listM0 = interfaceC1300z.m0();
                AbstractC2855l.f(listM0, "getContextReceiverParameters(...)");
                J1(listM0, sb);
                interfaceC1300z2 = interfaceC1300z;
                sb2 = sb;
                A1(this, sb2, interfaceC1300z2, null, 2, null);
                AbstractC1295u visibility = interfaceC1300z2.getVisibility();
                AbstractC2855l.f(visibility, "getVisibility(...)");
                E2(visibility, sb2);
                X1(interfaceC1300z2, sb2);
                if (F0()) {
                    U1(interfaceC1300z2, sb2);
                }
                c2(interfaceC1300z2, sb2);
                if (F0()) {
                    x1(interfaceC1300z2, sb2);
                } else {
                    p2(interfaceC1300z2, sb2);
                }
                T1(interfaceC1300z2, sb2);
                if (j1()) {
                    if (interfaceC1300z2.t0()) {
                        sb2.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (interfaceC1300z2.z0()) {
                        sb2.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            sb2.append(S1("fun"));
            sb2.append(" ");
            List typeParameters = interfaceC1300z2.getTypeParameters();
            AbstractC2855l.f(typeParameters, "getTypeParameters(...)");
            y2(typeParameters, sb2, true);
            j2(interfaceC1300z2, sb2);
        }
        Z1(interfaceC1300z2, sb2, true);
        List listI = interfaceC1300z2.i();
        AbstractC2855l.f(listI, "getValueParameters(...)");
        C2(listI, interfaceC1300z2.F(), sb2);
        k2(interfaceC1300z2, sb2);
        S returnType = interfaceC1300z2.getReturnType();
        if (!m1() && (h1() || returnType == null || !I7.i.C0(returnType))) {
            sb2.append(": ");
            sb2.append(returnType == null ? "[NULL]" : U(returnType));
        }
        List typeParameters2 = interfaceC1300z2.getTypeParameters();
        AbstractC2855l.f(typeParameters2, "getTypeParameters(...)");
        F2(typeParameters2, sb2);
    }

    private final void Q1(StringBuilder sb, S s10) {
        k8.f fVarD;
        int length = sb.length();
        A1(E0(), sb, s10, null, 2, null);
        boolean z10 = sb.length() != length;
        S sK = I7.h.k(s10);
        List listE = I7.h.e(s10);
        boolean zR = I7.h.r(s10);
        boolean zL0 = s10.L0();
        boolean z11 = zL0 || (z10 && sK != null);
        if (z11) {
            if (zR) {
                sb.insert(length, '(');
            } else {
                if (z10) {
                    AbstractC1382a.c(P8.q.g1(sb));
                    if (sb.charAt(P8.q.X(sb) - 1) != ')') {
                        sb.insert(P8.q.X(sb), "()");
                    }
                }
                sb.append("(");
            }
        }
        if (!listE.isEmpty()) {
            sb.append("context(");
            Iterator it = listE.subList(0, AbstractC2800q.l(listE)).iterator();
            while (it.hasNext()) {
                a2(sb, (S) it.next());
                sb.append(", ");
            }
            a2(sb, (S) AbstractC2800q.q0(listE));
            sb.append(") ");
        }
        Y1(sb, zR, "suspend");
        if (sK != null) {
            boolean z12 = (G2(sK) && !sK.L0()) || q1(sK) || (sK instanceof C0438y);
            if (z12) {
                sb.append("(");
            }
            a2(sb, sK);
            if (z12) {
                sb.append(")");
            }
            sb.append(".");
        }
        sb.append("(");
        if (!I7.h.n(s10) || s10.I0().size() > 1) {
            int i10 = 0;
            for (B0 b02 : I7.h.m(s10)) {
                int i11 = i10 + 1;
                if (i10 > 0) {
                    sb.append(", ");
                }
                if (N0()) {
                    S type = b02.getType();
                    AbstractC2855l.f(type, "getType(...)");
                    fVarD = I7.h.d(type);
                } else {
                    fVarD = null;
                }
                if (fVarD != null) {
                    sb.append(T(fVarD, false));
                    sb.append(": ");
                }
                sb.append(V(b02));
                i10 = i11;
            }
        } else {
            sb.append("???");
        }
        sb.append(") ");
        sb.append(r0());
        sb.append(" ");
        a2(sb, I7.h.l(s10));
        if (z11) {
            sb.append(")");
        }
        if (zL0) {
            sb.append("?");
        }
    }

    private final void R1(u0 u0Var, StringBuilder sb) {
        q8.g gVarU;
        String strG1;
        if (!G0() || (gVarU = u0Var.U()) == null || (strG1 = G1(gVarU)) == null) {
            return;
        }
        sb.append(" = ");
        sb.append(s0(strG1));
    }

    private final String S1(String str) {
        int i10 = b.f30139a[e1().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                throw new C2750m();
            }
            if (!y0()) {
                return "<b>" + str + "</b>";
            }
        }
        return str;
    }

    private final void T1(InterfaceC1277b interfaceC1277b, StringBuilder sb) {
        if (I0().contains(v.f30149p) && j1() && interfaceC1277b.getKind() != InterfaceC1277b.a.DECLARATION) {
            sb.append("/*");
            sb.append(K8.a.f(interfaceC1277b.getKind().name()));
            sb.append("*/ ");
        }
    }

    private final void U1(L7.D d10, StringBuilder sb) {
        Y1(sb, d10.isExternal(), "external");
        boolean z10 = false;
        Y1(sb, I0().contains(v.f30152s) && d10.J(), "expect");
        if (I0().contains(v.f30153t) && d10.B0()) {
            z10 = true;
        }
        Y1(sb, z10, "actual");
    }

    private final void W1(L7.E e10, StringBuilder sb, L7.E e11) {
        if (W0() || e10 != e11) {
            Y1(sb, I0().contains(v.f30145l), K8.a.f(e10.name()));
        }
    }

    private final void X1(InterfaceC1277b interfaceC1277b, StringBuilder sb) {
        if (AbstractC3027i.J(interfaceC1277b) && interfaceC1277b.k() == L7.E.f7283h) {
            return;
        }
        if (L0() == C.f30075g && interfaceC1277b.k() == L7.E.f7285j && u1(interfaceC1277b)) {
            return;
        }
        L7.E eK = interfaceC1277b.k();
        AbstractC2855l.f(eK, "getModality(...)");
        W1(eK, sb, r1(interfaceC1277b));
    }

    private final void Y1(StringBuilder sb, boolean z10, String str) {
        if (z10) {
            sb.append(S1(str));
            sb.append(" ");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z1(InterfaceC1288m interfaceC1288m, StringBuilder sb, boolean z10) {
        k8.f name = interfaceC1288m.getName();
        AbstractC2855l.f(name, "getName(...)");
        sb.append(T(name, z10));
    }

    private final void a2(StringBuilder sb, S s10) {
        M0 m0N0 = s10.N0();
        C0400a c0400a = m0N0 instanceof C0400a ? (C0400a) m0N0 : null;
        if (c0400a == null) {
            b2(sb, s10);
            return;
        }
        if (Z0()) {
            b2(sb, c0400a.T());
            if (R0()) {
                v1(sb, c0400a);
                return;
            }
            return;
        }
        b2(sb, c0400a.W0());
        if (a1()) {
            M1(sb, c0400a);
        }
    }

    private final void b2(StringBuilder sb, S s10) {
        if ((s10 instanceof O0) && o() && !((O0) s10).P0()) {
            sb.append("<Not computed yet>");
            return;
        }
        M0 m0N0 = s10.N0();
        if (m0N0 instanceof I) {
            sb.append(((I) m0N0).U0(this, this));
        } else {
            if (!(m0N0 instanceof AbstractC0407d0)) {
                throw new C2750m();
            }
            l2(sb, (AbstractC0407d0) m0N0);
        }
    }

    private final void c2(InterfaceC1277b interfaceC1277b, StringBuilder sb) {
        if (I0().contains(v.f30146m) && u1(interfaceC1277b) && L0() != C.f30076h) {
            Y1(sb, true, "override");
            if (j1()) {
                sb.append("/*");
                sb.append(interfaceC1277b.e().size());
                sb.append("*/ ");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d2(N n10, StringBuilder sb) {
        e2(n10.d(), "package-fragment", sb);
        if (o()) {
            sb.append(" in ");
            Z1(n10.b(), sb, false);
        }
    }

    private final void e2(k8.c cVar, String str, StringBuilder sb) {
        sb.append(S1(str));
        k8.d dVarJ = cVar.j();
        AbstractC2855l.f(dVarJ, "toUnsafe(...)");
        String strS = S(dVarJ);
        if (strS.length() > 0) {
            sb.append(" ");
            sb.append(strS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f2(V v10, StringBuilder sb) {
        e2(v10.d(), "package", sb);
        if (o()) {
            sb.append(" in context of ");
            Z1(v10.r0(), sb, false);
        }
    }

    private final void g2(StringBuilder sb, X x10) {
        X xC = x10.c();
        if (xC != null) {
            g2(sb, xC);
            sb.append('.');
            k8.f name = x10.b().getName();
            AbstractC2855l.f(name, "getName(...)");
            sb.append(T(name, false));
        } else {
            v0 v0VarJ = x10.b().j();
            AbstractC2855l.f(v0VarJ, "getTypeConstructor(...)");
            sb.append(s2(v0VarJ));
        }
        sb.append(r2(x10.a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h2(Z z10, StringBuilder sb) {
        Z z11;
        StringBuilder sb2;
        if (d1()) {
            z11 = z10;
            sb2 = sb;
        } else {
            if (!c1()) {
                List listM0 = z10.m0();
                AbstractC2855l.f(listM0, "getContextReceiverParameters(...)");
                J1(listM0, sb);
                i2(z10, sb);
                AbstractC1295u visibility = z10.getVisibility();
                AbstractC2855l.f(visibility, "getVisibility(...)");
                E2(visibility, sb);
                boolean z12 = false;
                Y1(sb, I0().contains(v.f30154u) && z10.isConst(), "const");
                U1(z10, sb);
                X1(z10, sb);
                c2(z10, sb);
                if (I0().contains(v.f30155v) && z10.o0()) {
                    z12 = true;
                }
                Y1(sb, z12, "lateinit");
                T1(z10, sb);
            }
            z11 = z10;
            sb2 = sb;
            A2(this, z11, sb2, false, 4, null);
            List typeParameters = z11.getTypeParameters();
            AbstractC2855l.f(typeParameters, "getTypeParameters(...)");
            y2(typeParameters, sb2, true);
            j2(z11, sb2);
        }
        Z1(z11, sb2, true);
        sb2.append(": ");
        S type = z11.getType();
        AbstractC2855l.f(type, "getType(...)");
        sb2.append(U(type));
        k2(z11, sb2);
        R1(z11, sb2);
        List typeParameters2 = z11.getTypeParameters();
        AbstractC2855l.f(typeParameters2, "getTypeParameters(...)");
        F2(typeParameters2, sb2);
    }

    private final void i2(Z z10, StringBuilder sb) {
        if (I0().contains(v.f30147n)) {
            A1(this, sb, z10, null, 2, null);
            InterfaceC1297w interfaceC1297wL0 = z10.l0();
            if (interfaceC1297wL0 != null) {
                z1(sb, interfaceC1297wL0, M7.e.f7552h);
            }
            InterfaceC1297w interfaceC1297wI0 = z10.i0();
            if (interfaceC1297wI0 != null) {
                z1(sb, interfaceC1297wI0, M7.e.f7560p);
            }
            if (P0() == E.f30087i) {
                a0 getter = z10.getGetter();
                if (getter != null) {
                    z1(sb, getter, M7.e.f7555k);
                }
                b0 b0VarH = z10.h();
                if (b0VarH != null) {
                    z1(sb, b0VarH, M7.e.f7556l);
                    List listI = b0VarH.i();
                    AbstractC2855l.f(listI, "getValueParameters(...)");
                    t0 t0Var = (t0) AbstractC2800q.C0(listI);
                    AbstractC2855l.d(t0Var);
                    z1(sb, t0Var, M7.e.f7559o);
                }
            }
        }
    }

    private final void j2(InterfaceC1276a interfaceC1276a, StringBuilder sb) {
        c0 c0VarH0 = interfaceC1276a.h0();
        if (c0VarH0 != null) {
            z1(sb, c0VarH0, M7.e.f7557m);
            S type = c0VarH0.getType();
            AbstractC2855l.f(type, "getType(...)");
            sb.append(N1(type));
            sb.append(".");
        }
    }

    private final void k2(InterfaceC1276a interfaceC1276a, StringBuilder sb) {
        c0 c0VarH0;
        if (Q0() && (c0VarH0 = interfaceC1276a.h0()) != null) {
            sb.append(" on ");
            S type = c0VarH0.getType();
            AbstractC2855l.f(type, "getType(...)");
            sb.append(U(type));
        }
    }

    private final void l2(StringBuilder sb, AbstractC0407d0 abstractC0407d0) {
        if (AbstractC2855l.b(abstractC0407d0, J0.f582b) || J0.k(abstractC0407d0)) {
            sb.append("???");
            return;
        }
        if (E8.l.o(abstractC0407d0)) {
            if (!g1()) {
                sb.append("???");
                return;
            }
            v0 v0VarK0 = abstractC0407d0.K0();
            AbstractC2855l.e(v0VarK0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
            sb.append(L1(((E8.j) v0VarK0).b(0)));
            return;
        }
        if (W.a(abstractC0407d0)) {
            K1(sb, abstractC0407d0);
        } else if (G2(abstractC0407d0)) {
            Q1(sb, abstractC0407d0);
        } else {
            K1(sb, abstractC0407d0);
        }
    }

    private final void m2(StringBuilder sb) {
        int length = sb.length();
        if (length == 0 || sb.charAt(length - 1) != ' ') {
            sb.append(' ');
        }
    }

    private final void n2(InterfaceC1280e interfaceC1280e, StringBuilder sb) {
        if (n1() || I7.i.n0(interfaceC1280e.r())) {
            return;
        }
        Collection collectionG = interfaceC1280e.j().g();
        AbstractC2855l.f(collectionG, "getSupertypes(...)");
        if (collectionG.isEmpty()) {
            return;
        }
        if (collectionG.size() == 1 && I7.i.b0((S) collectionG.iterator().next())) {
            return;
        }
        m2(sb);
        sb.append(": ");
        AbstractC2800q.m0(collectionG, sb, ", ", null, null, 0, null, new s(this), 60, null);
    }

    private final void o0(StringBuilder sb, InterfaceC1288m interfaceC1288m) {
        InterfaceC1288m interfaceC1288mB;
        String name;
        if ((interfaceC1288m instanceof N) || (interfaceC1288m instanceof V) || (interfaceC1288mB = interfaceC1288m.b()) == null || (interfaceC1288mB instanceof H)) {
            return;
        }
        sb.append(" ");
        sb.append(V1("defined in"));
        sb.append(" ");
        k8.d dVarM = AbstractC3027i.m(interfaceC1288mB);
        AbstractC2855l.f(dVarM, "getFqName(...)");
        sb.append(dVarM.e() ? "root package" : S(dVarM));
        if (l1() && (interfaceC1288mB instanceof N) && (interfaceC1288m instanceof InterfaceC1291p) && (name = ((InterfaceC1291p) interfaceC1288m).g().a().getName()) != null) {
            sb.append(" ");
            sb.append(V1("in file"));
            sb.append(" ");
            sb.append(name);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence o2(u uVar, S s10) {
        AbstractC2855l.d(s10);
        return uVar.U(s10);
    }

    private final void p0(StringBuilder sb, List list) {
        AbstractC2800q.m0(list, sb, ", ", null, null, 0, null, new q(this), 60, null);
    }

    private final String p1() {
        return s0(">");
    }

    private final void p2(InterfaceC1300z interfaceC1300z, StringBuilder sb) {
        Y1(sb, interfaceC1300z.isSuspend(), "suspend");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence q0(u uVar, B0 it) {
        AbstractC2855l.g(it, "it");
        if (it.b()) {
            return "*";
        }
        S type = it.getType();
        AbstractC2855l.f(type, "getType(...)");
        String strU = uVar.U(type);
        if (it.a() == N0.f592k) {
            return strU;
        }
        return it.a() + ' ' + strU;
    }

    private final boolean q1(S s10) {
        return I7.h.r(s10) || !s10.getAnnotations().isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q2(l0 l0Var, StringBuilder sb) {
        A1(this, sb, l0Var, null, 2, null);
        AbstractC1295u visibility = l0Var.getVisibility();
        AbstractC2855l.f(visibility, "getVisibility(...)");
        E2(visibility, sb);
        U1(l0Var, sb);
        sb.append(S1("typealias"));
        sb.append(" ");
        Z1(l0Var, sb, true);
        List listT = l0Var.t();
        AbstractC2855l.f(listT, "getDeclaredTypeParameters(...)");
        y2(listT, sb, false);
        B1(l0Var, sb);
        sb.append(" = ");
        sb.append(U(l0Var.b0()));
    }

    private final String r0() {
        int i10 = b.f30139a[e1().ordinal()];
        if (i10 == 1) {
            return s0("->");
        }
        if (i10 == 2) {
            return "&rarr;";
        }
        throw new C2750m();
    }

    private final L7.E r1(L7.D d10) {
        if (d10 instanceof InterfaceC1280e) {
            return ((InterfaceC1280e) d10).getKind() == EnumC1281f.f7321i ? L7.E.f7286k : L7.E.f7283h;
        }
        InterfaceC1288m interfaceC1288mB = d10.b();
        InterfaceC1280e interfaceC1280e = interfaceC1288mB instanceof InterfaceC1280e ? (InterfaceC1280e) interfaceC1288mB : null;
        if (interfaceC1280e == null) {
            return L7.E.f7283h;
        }
        if (!(d10 instanceof InterfaceC1277b)) {
            return L7.E.f7283h;
        }
        InterfaceC1277b interfaceC1277b = (InterfaceC1277b) d10;
        Collection collectionE = interfaceC1277b.e();
        AbstractC2855l.f(collectionE, "getOverriddenDescriptors(...)");
        if (!collectionE.isEmpty() && interfaceC1280e.k() != L7.E.f7283h) {
            return L7.E.f7285j;
        }
        if (interfaceC1280e.getKind() != EnumC1281f.f7321i || AbstractC2855l.b(interfaceC1277b.getVisibility(), AbstractC1294t.f7343a)) {
            return L7.E.f7283h;
        }
        L7.E eK = interfaceC1277b.k();
        L7.E e10 = L7.E.f7286k;
        return eK == e10 ? e10 : L7.E.f7285j;
    }

    private final String s0(String str) {
        return e1().j(str);
    }

    private final boolean s1(M7.c cVar) {
        return AbstractC2855l.b(cVar.d(), o.a.f5150E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u t0(u uVar) {
        n nVarW = uVar.W(t.f30134g);
        AbstractC2855l.e(nVarW, "null cannot be cast to non-null type org.jetbrains.kotlin.renderer.DescriptorRendererImpl");
        return (u) nVarW;
    }

    private final String t1() {
        return s0("<");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object t2(S it) {
        AbstractC2855l.g(it, "it");
        return it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2735B u0(w withOptions) {
        AbstractC2855l.g(withOptions, "$this$withOptions");
        withOptions.a(T.k(withOptions.n(), AbstractC2800q.m(o.a.f5146C, o.a.f5148D)));
        return C2735B.f28704a;
    }

    private final boolean u1(InterfaceC1277b interfaceC1277b) {
        return !interfaceC1277b.e().isEmpty();
    }

    private final void u2(StringBuilder sb, S s10, v0 v0Var) {
        X xD = q0.d(s10);
        if (xD != null) {
            g2(sb, xD);
        } else {
            sb.append(s2(v0Var));
            sb.append(r2(s10.I0()));
        }
    }

    private final void v1(StringBuilder sb, C0400a c0400a) {
        F fE1 = e1();
        F f10 = F.f30091h;
        if (fE1 == f10) {
            sb.append("<font color=\"808080\"><i>");
        }
        sb.append(" /* ");
        sb.append("from: ");
        b2(sb, c0400a.W0());
        sb.append(" */");
        if (e1() == f10) {
            sb.append("</i></font>");
        }
    }

    static /* synthetic */ void v2(u uVar, StringBuilder sb, S s10, v0 v0Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            v0Var = s10.K0();
        }
        uVar.u2(sb, s10, v0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w1(Y y10, StringBuilder sb) {
        U1(y10, sb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w2(m0 m0Var, StringBuilder sb, boolean z10) {
        if (z10) {
            sb.append(t1());
        }
        if (j1()) {
            sb.append("/*");
            sb.append(m0Var.getIndex());
            sb.append("*/ ");
        }
        Y1(sb, m0Var.E(), "reified");
        String strK = m0Var.m().k();
        boolean z11 = true;
        Y1(sb, strK.length() > 0, strK);
        A1(this, sb, m0Var, null, 2, null);
        Z1(m0Var, sb, z10);
        int size = m0Var.getUpperBounds().size();
        if ((size > 1 && !z10) || size == 1) {
            S s10 = (S) m0Var.getUpperBounds().iterator().next();
            if (!I7.i.j0(s10)) {
                sb.append(" : ");
                AbstractC2855l.d(s10);
                sb.append(U(s10));
            }
        } else if (z10) {
            for (S s11 : m0Var.getUpperBounds()) {
                if (!I7.i.j0(s11)) {
                    if (z11) {
                        sb.append(" : ");
                    } else {
                        sb.append(" & ");
                    }
                    AbstractC2855l.d(s11);
                    sb.append(U(s11));
                    z11 = false;
                }
            }
        }
        if (z10) {
            sb.append(p1());
        }
    }

    private final void x1(InterfaceC1300z interfaceC1300z, StringBuilder sb) {
        boolean z10;
        boolean z11 = false;
        if (interfaceC1300z.isOperator()) {
            Collection collectionE = interfaceC1300z.e();
            AbstractC2855l.f(collectionE, "getOverriddenDescriptors(...)");
            if (!collectionE.isEmpty()) {
                Iterator it = collectionE.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((InterfaceC1300z) it.next()).isOperator()) {
                        if (w0()) {
                            break;
                        }
                    }
                }
                z10 = false;
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (interfaceC1300z.isInfix()) {
            Collection collectionE2 = interfaceC1300z.e();
            AbstractC2855l.f(collectionE2, "getOverriddenDescriptors(...)");
            if (collectionE2.isEmpty()) {
                z11 = true;
            } else {
                Iterator it2 = collectionE2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (((InterfaceC1300z) it2.next()).isInfix()) {
                        if (w0()) {
                            break;
                        }
                    }
                }
            }
        }
        Y1(sb, interfaceC1300z.N(), "tailrec");
        p2(interfaceC1300z, sb);
        Y1(sb, interfaceC1300z.isInline(), "inline");
        Y1(sb, z11, "infix");
        Y1(sb, z10, "operator");
    }

    private final void x2(StringBuilder sb, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            w2((m0) it.next(), sb, false);
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
    }

    private final List y1(M7.c cVar) {
        InterfaceC1279d interfaceC1279dO;
        List listI;
        Map mapA = cVar.a();
        List listJ = null;
        InterfaceC1280e interfaceC1280eL = V0() ? AbstractC3340e.l(cVar) : null;
        if (interfaceC1280eL != null && (interfaceC1279dO = interfaceC1280eL.O()) != null && (listI = interfaceC1279dO.i()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listI) {
                if (((t0) obj).q0()) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC2800q.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((t0) it.next()).getName());
            }
            listJ = arrayList2;
        }
        if (listJ == null) {
            listJ = AbstractC2800q.j();
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listJ) {
            if (!mapA.containsKey((k8.f) obj2)) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(AbstractC2800q.u(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((k8.f) it2.next()).j() + " = ...");
        }
        Set<Map.Entry> setEntrySet = mapA.entrySet();
        ArrayList arrayList5 = new ArrayList(AbstractC2800q.u(setEntrySet, 10));
        for (Map.Entry entry : setEntrySet) {
            k8.f fVar = (k8.f) entry.getKey();
            q8.g gVar = (q8.g) entry.getValue();
            StringBuilder sb = new StringBuilder();
            sb.append(fVar.j());
            sb.append(" = ");
            sb.append(!listJ.contains(fVar) ? G1(gVar) : "...");
            arrayList5.add(sb.toString());
        }
        return AbstractC2800q.G0(AbstractC2800q.z0(arrayList4, arrayList5));
    }

    private final void y2(List list, StringBuilder sb, boolean z10) {
        if (o1() || list.isEmpty()) {
            return;
        }
        sb.append(t1());
        x2(sb, list);
        sb.append(p1());
        if (z10) {
            sb.append(" ");
        }
    }

    private final void z1(StringBuilder sb, M7.a aVar, M7.e eVar) {
        if (I0().contains(v.f30147n)) {
            Set setN = aVar instanceof S ? n() : D0();
            Function1 function1X0 = x0();
            for (M7.c cVar : aVar.getAnnotations()) {
                if (!AbstractC2800q.X(setN, cVar.d()) && !s1(cVar) && (function1X0 == null || ((Boolean) function1X0.invoke(cVar)).booleanValue())) {
                    sb.append(P(cVar, eVar));
                    if (C0()) {
                        sb.append('\n');
                        AbstractC2855l.f(sb, "append(...)");
                    } else {
                        sb.append(" ");
                    }
                }
            }
        }
    }

    private final void z2(u0 u0Var, StringBuilder sb, boolean z10) {
        if (z10 || !(u0Var instanceof t0)) {
            sb.append(S1(u0Var.d0() ? "var" : "val"));
            sb.append(" ");
        }
    }

    public InterfaceC2987b A0() {
        return this.f30135m.B();
    }

    public Function1 B0() {
        return this.f30135m.C();
    }

    public boolean C0() {
        return this.f30135m.D();
    }

    public Set D0() {
        return this.f30135m.E();
    }

    public String E1(InterfaceC1283h klass) {
        AbstractC2855l.g(klass, "klass");
        return E8.l.m(klass) ? klass.j().toString() : A0().a(klass, this);
    }

    public boolean F0() {
        return this.f30135m.F();
    }

    public boolean G0() {
        return this.f30135m.G();
    }

    public boolean H0() {
        return this.f30135m.H();
    }

    public Set I0() {
        return this.f30135m.I();
    }

    public boolean J0() {
        return this.f30135m.J();
    }

    public final z K0() {
        return this.f30135m;
    }

    public C L0() {
        return this.f30135m.K();
    }

    public D M0() {
        return this.f30135m.L();
    }

    public boolean N0() {
        return this.f30135m.M();
    }

    @Override // n8.n
    public String O(InterfaceC1288m declarationDescriptor) {
        AbstractC2855l.g(declarationDescriptor, "declarationDescriptor");
        StringBuilder sb = new StringBuilder();
        declarationDescriptor.E0(new a(), sb);
        if (k1()) {
            o0(sb, declarationDescriptor);
        }
        String string = sb.toString();
        AbstractC2855l.f(string, "toString(...)");
        return string;
    }

    public boolean O0() {
        return this.f30135m.N();
    }

    @Override // n8.n
    public String P(M7.c annotation, M7.e eVar) {
        AbstractC2855l.g(annotation, "annotation");
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        if (eVar != null) {
            sb.append(eVar.j() + ':');
        }
        S type = annotation.getType();
        sb.append(U(type));
        if (m()) {
            List listY1 = y1(annotation);
            if (b() || !listY1.isEmpty()) {
                AbstractC2800q.m0(listY1, sb, ", ", "(", ")", 0, null, null, 112, null);
            }
        }
        if (j1() && (W.a(type) || (type.K0().p() instanceof M.b))) {
            sb.append(" /* annotation class not found */");
        }
        String string = sb.toString();
        AbstractC2855l.f(string, "toString(...)");
        return string;
    }

    public E P0() {
        return this.f30135m.O();
    }

    public boolean Q0() {
        return this.f30135m.Q();
    }

    @Override // n8.n
    public String R(String lowerRendered, String upperRendered, I7.i builtIns) {
        AbstractC2855l.g(lowerRendered, "lowerRendered");
        AbstractC2855l.g(upperRendered, "upperRendered");
        AbstractC2855l.g(builtIns, "builtIns");
        if (G.f(lowerRendered, upperRendered)) {
            if (!P8.q.K(upperRendered, "(", false, 2, null)) {
                return lowerRendered + '!';
            }
            return '(' + lowerRendered + ")!";
        }
        InterfaceC2987b interfaceC2987bA0 = A0();
        InterfaceC1280e interfaceC1280eW = builtIns.w();
        AbstractC2855l.f(interfaceC1280eW, "getCollection(...)");
        String strX0 = P8.q.X0(interfaceC2987bA0.a(interfaceC1280eW, this), "Collection", null, 2, null);
        String strD = G.d(lowerRendered, strX0 + "Mutable", upperRendered, strX0, strX0 + "(Mutable)");
        if (strD != null) {
            return strD;
        }
        String strD2 = G.d(lowerRendered, strX0 + "MutableMap.MutableEntry", upperRendered, strX0 + "Map.Entry", strX0 + "(Mutable)Map.(Mutable)Entry");
        if (strD2 != null) {
            return strD2;
        }
        InterfaceC2987b interfaceC2987bA02 = A0();
        InterfaceC1280e interfaceC1280eJ = builtIns.j();
        AbstractC2855l.f(interfaceC1280eJ, "getArray(...)");
        String strX02 = P8.q.X0(interfaceC2987bA02.a(interfaceC1280eJ, this), "Array", null, 2, null);
        String strD3 = G.d(lowerRendered, strX02 + s0("Array<"), upperRendered, strX02 + s0("Array<out "), strX02 + s0("Array<(out) "));
        if (strD3 != null) {
            return strD3;
        }
        return '(' + lowerRendered + ".." + upperRendered + ')';
    }

    public boolean R0() {
        return this.f30135m.R();
    }

    @Override // n8.n
    public String S(k8.d fqName) {
        AbstractC2855l.g(fqName, "fqName");
        List listH = fqName.h();
        AbstractC2855l.f(listH, "pathSegments(...)");
        return O1(listH);
    }

    public boolean S0() {
        return this.f30135m.S();
    }

    @Override // n8.n
    public String T(k8.f name, boolean z10) {
        AbstractC2855l.g(name, "name");
        String strS0 = s0(G.b(name));
        if (!y0() || e1() != F.f30091h || !z10) {
            return strS0;
        }
        return "<b>" + strS0 + "</b>";
    }

    public boolean T0() {
        return this.f30135m.T();
    }

    @Override // n8.n
    public String U(S type) {
        AbstractC2855l.g(type, "type");
        StringBuilder sb = new StringBuilder();
        a2(sb, (S) f1().invoke(type));
        String string = sb.toString();
        AbstractC2855l.f(string, "toString(...)");
        return string;
    }

    public boolean U0() {
        return this.f30135m.U();
    }

    @Override // n8.n
    public String V(B0 typeProjection) {
        AbstractC2855l.g(typeProjection, "typeProjection");
        StringBuilder sb = new StringBuilder();
        p0(sb, AbstractC2800q.e(typeProjection));
        String string = sb.toString();
        AbstractC2855l.f(string, "toString(...)");
        return string;
    }

    public boolean V0() {
        return this.f30135m.V();
    }

    public String V1(String message) {
        AbstractC2855l.g(message, "message");
        int i10 = b.f30139a[e1().ordinal()];
        if (i10 == 1) {
            return message;
        }
        if (i10 != 2) {
            throw new C2750m();
        }
        return "<i>" + message + "</i>";
    }

    public boolean W0() {
        return this.f30135m.W();
    }

    public boolean X0() {
        return this.f30135m.X();
    }

    public boolean Y0() {
        return this.f30135m.Y();
    }

    public boolean Z0() {
        return this.f30135m.Z();
    }

    @Override // n8.w
    public void a(Set set) {
        AbstractC2855l.g(set, "<set-?>");
        this.f30135m.a(set);
    }

    public boolean a1() {
        return this.f30135m.a0();
    }

    @Override // n8.w
    public boolean b() {
        return this.f30135m.b();
    }

    public boolean b1() {
        return this.f30135m.b0();
    }

    @Override // n8.w
    public void c(boolean z10) {
        this.f30135m.c(z10);
    }

    public boolean c1() {
        return this.f30135m.c0();
    }

    @Override // n8.w
    public void d(Set set) {
        AbstractC2855l.g(set, "<set-?>");
        this.f30135m.d(set);
    }

    public boolean d1() {
        return this.f30135m.d0();
    }

    @Override // n8.w
    public void e(D d10) {
        AbstractC2855l.g(d10, "<set-?>");
        this.f30135m.e(d10);
    }

    public F e1() {
        return this.f30135m.e0();
    }

    @Override // n8.w
    public void f(InterfaceC2987b interfaceC2987b) {
        AbstractC2855l.g(interfaceC2987b, "<set-?>");
        this.f30135m.f(interfaceC2987b);
    }

    public Function1 f1() {
        return this.f30135m.f0();
    }

    @Override // n8.w
    public void g(boolean z10) {
        this.f30135m.g(z10);
    }

    public boolean g1() {
        return this.f30135m.g0();
    }

    @Override // n8.w
    public boolean h() {
        return this.f30135m.h();
    }

    public boolean h1() {
        return this.f30135m.h0();
    }

    @Override // n8.w
    public void i(boolean z10) {
        this.f30135m.i(z10);
    }

    public n.b i1() {
        return this.f30135m.i0();
    }

    @Override // n8.w
    public void j(boolean z10) {
        this.f30135m.j(z10);
    }

    public boolean j1() {
        return this.f30135m.j0();
    }

    @Override // n8.w
    public void k(boolean z10) {
        this.f30135m.k(z10);
    }

    public boolean k1() {
        return this.f30135m.k0();
    }

    @Override // n8.w
    public void l(boolean z10) {
        this.f30135m.l(z10);
    }

    public boolean l1() {
        return this.f30135m.l0();
    }

    @Override // n8.w
    public boolean m() {
        return this.f30135m.m();
    }

    public boolean m1() {
        return this.f30135m.m0();
    }

    @Override // n8.w
    public Set n() {
        return this.f30135m.n();
    }

    public boolean n1() {
        return this.f30135m.n0();
    }

    @Override // n8.w
    public boolean o() {
        return this.f30135m.o();
    }

    public boolean o1() {
        return this.f30135m.o0();
    }

    @Override // n8.w
    public EnumC2986a p() {
        return this.f30135m.p();
    }

    @Override // n8.w
    public void q(F f10) {
        AbstractC2855l.g(f10, "<set-?>");
        this.f30135m.q(f10);
    }

    @Override // n8.w
    public void r(boolean z10) {
        this.f30135m.r(z10);
    }

    public String r2(List typeArguments) {
        AbstractC2855l.g(typeArguments, "typeArguments");
        if (typeArguments.isEmpty()) {
            return PointerEventHelper.POINTER_TYPE_UNKNOWN;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(t1());
        p0(sb, typeArguments);
        sb.append(p1());
        String string = sb.toString();
        AbstractC2855l.f(string, "toString(...)");
        return string;
    }

    public String s2(v0 typeConstructor) {
        AbstractC2855l.g(typeConstructor, "typeConstructor");
        InterfaceC1283h interfaceC1283hP = typeConstructor.p();
        if ((interfaceC1283hP instanceof m0) || (interfaceC1283hP instanceof InterfaceC1280e) || (interfaceC1283hP instanceof l0)) {
            return E1(interfaceC1283hP);
        }
        if (interfaceC1283hP == null) {
            return typeConstructor instanceof Q ? ((Q) typeConstructor).i(p.f30130g) : typeConstructor.toString();
        }
        throw new IllegalStateException(("Unexpected classifier: " + interfaceC1283hP.getClass()).toString());
    }

    public boolean v0() {
        return this.f30135m.w();
    }

    public boolean w0() {
        return this.f30135m.x();
    }

    public Function1 x0() {
        return this.f30135m.y();
    }

    public boolean y0() {
        return this.f30135m.z();
    }

    public boolean z0() {
        return this.f30135m.A();
    }
}
