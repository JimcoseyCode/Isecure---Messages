package O7;

import C8.AbstractC0407d0;
import C8.AbstractC0415h0;
import C8.G0;
import C8.N0;
import L7.AbstractC1295u;
import L7.InterfaceC1277b;
import L7.InterfaceC1279d;
import L7.InterfaceC1280e;
import L7.InterfaceC1288m;
import L7.InterfaceC1300z;
import L7.c0;
import L7.h0;
import L7.l0;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o8.AbstractC3026h;
import w8.InterfaceC3500f;
import w8.InterfaceC3501g;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class T extends AbstractC1339s implements Q {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final B8.n f8413K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final l0 f8414L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final B8.j f8415M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private InterfaceC1279d f8416N;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    static final /* synthetic */ C7.k[] f8412P = {kotlin.jvm.internal.D.k(new kotlin.jvm.internal.v(kotlin.jvm.internal.D.b(T.class), "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"))};

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final a f8411O = new a(null);

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final G0 c(l0 l0Var) {
            if (l0Var.q() == null) {
                return null;
            }
            return G0.f(l0Var.T());
        }

        public final Q b(B8.n storageManager, l0 typeAliasDescriptor, InterfaceC1279d constructor) {
            InterfaceC1279d interfaceC1279dC;
            List listJ;
            AbstractC2855l.g(storageManager, "storageManager");
            AbstractC2855l.g(typeAliasDescriptor, "typeAliasDescriptor");
            AbstractC2855l.g(constructor, "constructor");
            G0 g0C = c(typeAliasDescriptor);
            if (g0C == null || (interfaceC1279dC = constructor.c(g0C)) == null) {
                return null;
            }
            M7.h annotations = constructor.getAnnotations();
            InterfaceC1277b.a kind = constructor.getKind();
            AbstractC2855l.f(kind, "getKind(...)");
            h0 h0VarG = typeAliasDescriptor.g();
            AbstractC2855l.f(h0VarG, "getSource(...)");
            T t10 = new T(storageManager, typeAliasDescriptor, interfaceC1279dC, null, annotations, kind, h0VarG, null);
            List listL0 = AbstractC1339s.L0(t10, constructor.i(), g0C);
            if (listL0 == null) {
                return null;
            }
            AbstractC0407d0 abstractC0407d0C = C8.L.c(interfaceC1279dC.getReturnType().N0());
            AbstractC0407d0 abstractC0407d0R = typeAliasDescriptor.r();
            AbstractC2855l.f(abstractC0407d0R, "getDefaultType(...)");
            AbstractC0407d0 abstractC0407d0J = AbstractC0415h0.j(abstractC0407d0C, abstractC0407d0R);
            c0 c0VarA0 = constructor.a0();
            c0 c0VarI = c0VarA0 != null ? AbstractC3026h.i(t10, g0C.n(c0VarA0.getType(), N0.f592k), M7.h.f7570a.b()) : null;
            InterfaceC1280e interfaceC1280eQ = typeAliasDescriptor.q();
            if (interfaceC1280eQ != null) {
                List listM0 = constructor.m0();
                AbstractC2855l.f(listM0, "getContextReceiverParameters(...)");
                listJ = new ArrayList(AbstractC2800q.u(listM0, 10));
                int i10 = 0;
                for (Object obj : listM0) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        AbstractC2800q.t();
                    }
                    c0 c0Var = (c0) obj;
                    C8.S sN = g0C.n(c0Var.getType(), N0.f592k);
                    InterfaceC3501g value = c0Var.getValue();
                    AbstractC2855l.e(value, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitContextReceiver");
                    listJ.add(AbstractC3026h.c(interfaceC1280eQ, sN, ((InterfaceC3500f) value).a(), M7.h.f7570a.b(), i10));
                    i10 = i11;
                }
            } else {
                listJ = AbstractC2800q.j();
            }
            t10.O0(c0VarI, null, listJ, typeAliasDescriptor.t(), listL0, abstractC0407d0J, L7.E.f7283h, typeAliasDescriptor.getVisibility());
            return t10;
        }

        private a() {
        }
    }

    public /* synthetic */ T(B8.n nVar, l0 l0Var, InterfaceC1279d interfaceC1279d, Q q10, M7.h hVar, InterfaceC1277b.a aVar, h0 h0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(nVar, l0Var, interfaceC1279d, q10, hVar, aVar, h0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final T o1(T t10, InterfaceC1279d interfaceC1279d) {
        B8.n nVar = t10.f8413K;
        l0 l0VarM1 = t10.m1();
        M7.h annotations = interfaceC1279d.getAnnotations();
        InterfaceC1277b.a kind = interfaceC1279d.getKind();
        AbstractC2855l.f(kind, "getKind(...)");
        h0 h0VarG = t10.m1().g();
        AbstractC2855l.f(h0VarG, "getSource(...)");
        T t11 = new T(nVar, l0VarM1, interfaceC1279d, t10, annotations, kind, h0VarG);
        G0 g0C = f8411O.c(t10.m1());
        if (g0C == null) {
            return null;
        }
        c0 c0VarA0 = interfaceC1279d.a0();
        c0 c0VarC = c0VarA0 != null ? c0VarA0.c(g0C) : null;
        List listM0 = interfaceC1279d.m0();
        AbstractC2855l.f(listM0, "getContextReceiverParameters(...)");
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(listM0, 10));
        Iterator it = listM0.iterator();
        while (it.hasNext()) {
            arrayList.add(((c0) it.next()).c(g0C));
        }
        t11.O0(null, c0VarC, arrayList, t10.m1().t(), t10.i(), t10.getReturnType(), L7.E.f7283h, t10.m1().getVisibility());
        return t11;
    }

    @Override // L7.InterfaceC1287l
    public boolean A() {
        return k0().A();
    }

    @Override // L7.InterfaceC1287l
    public InterfaceC1280e B() {
        InterfaceC1280e interfaceC1280eB = k0().B();
        AbstractC2855l.f(interfaceC1280eB, "getConstructedClass(...)");
        return interfaceC1280eB;
    }

    @Override // O7.AbstractC1339s, L7.InterfaceC1276a
    public C8.S getReturnType() {
        C8.S returnType = super.getReturnType();
        AbstractC2855l.d(returnType);
        return returnType;
    }

    @Override // L7.InterfaceC1277b
    /* JADX INFO: renamed from: i1, reason: merged with bridge method [inline-methods] */
    public Q x(InterfaceC1288m newOwner, L7.E modality, AbstractC1295u visibility, InterfaceC1277b.a kind, boolean z10) {
        AbstractC2855l.g(newOwner, "newOwner");
        AbstractC2855l.g(modality, "modality");
        AbstractC2855l.g(visibility, "visibility");
        AbstractC2855l.g(kind, "kind");
        InterfaceC1300z interfaceC1300zBuild = s().m(newOwner).s(modality).b(visibility).i(kind).k(z10).build();
        AbstractC2855l.e(interfaceC1300zBuild, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (Q) interfaceC1300zBuild;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // O7.AbstractC1339s
    /* JADX INFO: renamed from: j1, reason: merged with bridge method [inline-methods] */
    public T I0(InterfaceC1288m newOwner, InterfaceC1300z interfaceC1300z, InterfaceC1277b.a kind, k8.f fVar, M7.h annotations, h0 source) {
        AbstractC2855l.g(newOwner, "newOwner");
        AbstractC2855l.g(kind, "kind");
        AbstractC2855l.g(annotations, "annotations");
        AbstractC2855l.g(source, "source");
        InterfaceC1277b.a aVar = InterfaceC1277b.a.DECLARATION;
        if (kind != aVar) {
            InterfaceC1277b.a aVar2 = InterfaceC1277b.a.SYNTHESIZED;
        }
        return new T(this.f8413K, m1(), k0(), this, annotations, aVar, source);
    }

    @Override // O7.Q
    public InterfaceC1279d k0() {
        return this.f8416N;
    }

    @Override // O7.AbstractC1335n, L7.InterfaceC1288m
    /* JADX INFO: renamed from: k1, reason: merged with bridge method [inline-methods] */
    public l0 b() {
        return m1();
    }

    @Override // O7.AbstractC1335n
    /* JADX INFO: renamed from: l1, reason: merged with bridge method [inline-methods] */
    public Q a() {
        InterfaceC1300z interfaceC1300zA = super.a();
        AbstractC2855l.e(interfaceC1300zA, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (Q) interfaceC1300zA;
    }

    public l0 m1() {
        return this.f8414L;
    }

    @Override // O7.AbstractC1339s, L7.InterfaceC1300z, L7.j0
    /* JADX INFO: renamed from: n1, reason: merged with bridge method [inline-methods] */
    public Q c(G0 substitutor) {
        AbstractC2855l.g(substitutor, "substitutor");
        InterfaceC1300z interfaceC1300zC = super.c(substitutor);
        AbstractC2855l.e(interfaceC1300zC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
        T t10 = (T) interfaceC1300zC;
        G0 g0F = G0.f(t10.getReturnType());
        AbstractC2855l.f(g0F, "create(...)");
        InterfaceC1279d interfaceC1279dC = k0().a().c(g0F);
        if (interfaceC1279dC == null) {
            return null;
        }
        t10.f8416N = interfaceC1279dC;
        return t10;
    }

    private T(B8.n nVar, l0 l0Var, InterfaceC1279d interfaceC1279d, Q q10, M7.h hVar, InterfaceC1277b.a aVar, h0 h0Var) {
        super(l0Var, q10, hVar, k8.h.f29229j, aVar, h0Var);
        this.f8413K = nVar;
        this.f8414L = l0Var;
        S0(m1().B0());
        this.f8415M = nVar.g(new S(this, interfaceC1279d));
        this.f8416N = interfaceC1279d;
    }
}
