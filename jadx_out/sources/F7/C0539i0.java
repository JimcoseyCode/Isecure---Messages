package F7;

import F7.AbstractC0548n;
import F7.InterfaceC0544l;
import F7.a1;
import G7.a;
import G7.i;
import G7.n;
import L7.InterfaceC1277b;
import L7.InterfaceC1280e;
import L7.InterfaceC1287l;
import L7.InterfaceC1288m;
import L7.InterfaceC1300z;
import i7.AbstractC2746i;
import i7.C2750m;
import i7.EnumC2749l;
import j7.AbstractC2793j;
import j7.AbstractC2800q;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC2846c;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InterfaceC2851h;
import o8.AbstractC3029k;
import s8.AbstractC3340e;
import t8.AbstractC3379b;

/* JADX INFO: renamed from: F7.i0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0539i0 extends A implements InterfaceC2851h, C7.g, InterfaceC0544l {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static final /* synthetic */ C7.k[] f2064s = {kotlin.jvm.internal.D.k(new kotlin.jvm.internal.v(kotlin.jvm.internal.D.b(C0539i0.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;"))};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AbstractC0529d0 f2065m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f2066n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Object f2067o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final a1.a f2068p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Lazy f2069q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Lazy f2070r;

    /* synthetic */ C0539i0(AbstractC0529d0 abstractC0529d0, String str, String str2, InterfaceC1300z interfaceC1300z, Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC0529d0, str, str2, interfaceC1300z, (i10 & 16) != 0 ? AbstractC2846c.NO_RECEIVER : obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G7.h c0(C0539i0 c0539i0) {
        Object objD;
        G7.i iVarE0;
        AbstractC0548n abstractC0548nG = f1.f2051a.g(c0539i0.Z());
        if (abstractC0548nG instanceof AbstractC0548n.d) {
            if (c0539i0.W()) {
                Class clsB = c0539i0.S().b();
                List parameters = c0539i0.getParameters();
                ArrayList arrayList = new ArrayList(AbstractC2800q.u(parameters, 10));
                Iterator it = parameters.iterator();
                while (it.hasNext()) {
                    String name = ((C7.j) it.next()).getName();
                    AbstractC2855l.d(name);
                    arrayList.add(name);
                }
                return new G7.a(clsB, arrayList, a.EnumC0047a.f3491h, a.b.f3495h, null, 16, null);
            }
            objD = c0539i0.S().u(((AbstractC0548n.d) abstractC0548nG).b());
        } else if (abstractC0548nG instanceof AbstractC0548n.e) {
            InterfaceC1300z interfaceC1300zZ = c0539i0.Z();
            InterfaceC1288m interfaceC1288mB = interfaceC1300zZ.b();
            AbstractC2855l.f(interfaceC1288mB, "getContainingDeclaration(...)");
            if (AbstractC3029k.d(interfaceC1288mB) && (interfaceC1300zZ instanceof InterfaceC1287l) && ((InterfaceC1287l) interfaceC1300zZ).A()) {
                InterfaceC1300z interfaceC1300zZ2 = c0539i0.Z();
                AbstractC0529d0 abstractC0529d0S = c0539i0.S();
                String strB = ((AbstractC0548n.e) abstractC0548nG).b();
                List listI = c0539i0.Z().i();
                AbstractC2855l.f(listI, "getValueParameters(...)");
                return new n.b(interfaceC1300zZ2, abstractC0529d0S, strB, listI);
            }
            AbstractC0548n.e eVar = (AbstractC0548n.e) abstractC0548nG;
            objD = c0539i0.S().z(eVar.c(), eVar.b());
        } else if (abstractC0548nG instanceof AbstractC0548n.c) {
            objD = ((AbstractC0548n.c) abstractC0548nG).b();
            AbstractC2855l.e(objD, "null cannot be cast to non-null type java.lang.reflect.Member");
        } else {
            if (!(abstractC0548nG instanceof AbstractC0548n.b)) {
                if (!(abstractC0548nG instanceof AbstractC0548n.a)) {
                    throw new C2750m();
                }
                List listD = ((AbstractC0548n.a) abstractC0548nG).d();
                Class clsB2 = c0539i0.S().b();
                ArrayList arrayList2 = new ArrayList(AbstractC2800q.u(listD, 10));
                Iterator it2 = listD.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((Method) it2.next()).getName());
                }
                return new G7.a(clsB2, arrayList2, a.EnumC0047a.f3491h, a.b.f3494g, listD);
            }
            objD = ((AbstractC0548n.b) abstractC0548nG).d();
            AbstractC2855l.e(objD, "null cannot be cast to non-null type java.lang.reflect.Member");
        }
        if (objD instanceof Constructor) {
            iVarE0 = c0539i0.d0((Constructor) objD, c0539i0.Z(), false);
        } else {
            if (!(objD instanceof Method)) {
                throw new Y0("Could not compute caller for function: " + c0539i0.Z() + " (member = " + objD + ')');
            }
            Method method = (Method) objD;
            iVarE0 = !Modifier.isStatic(method.getModifiers()) ? c0539i0.e0(method) : c0539i0.Z().getAnnotations().b(j1.j()) != null ? c0539i0.f0(method) : c0539i0.g0(method);
        }
        return G7.o.j(iVarE0, c0539i0.Z(), false, 2, null);
    }

    private final G7.i d0(Constructor constructor, InterfaceC1300z interfaceC1300z, boolean z10) {
        return (z10 || !AbstractC3379b.f(interfaceC1300z)) ? X() ? new i.c(constructor, j0()) : new i.e(constructor) : X() ? new i.a(constructor, j0()) : new i.b(constructor);
    }

    private final i.h e0(Method method) {
        return X() ? new i.h.a(method, j0()) : new i.h.e(method);
    }

    private final i.h f0(Method method) {
        return X() ? new i.h.b(method) : new i.h.f(method);
    }

    private final i.h g0(Method method) {
        if (X()) {
            return new i.h.c(method, m0(method) ? this.f2067o : j0());
        }
        return new i.h.g(method);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final G7.h h0(C0539i0 c0539i0) {
        GenericDeclaration genericDeclarationV;
        G7.i iVarF0;
        f1 f1Var = f1.f2051a;
        AbstractC0548n abstractC0548nG = f1Var.g(c0539i0.Z());
        if (abstractC0548nG instanceof AbstractC0548n.e) {
            InterfaceC1300z interfaceC1300zZ = c0539i0.Z();
            InterfaceC1288m interfaceC1288mB = interfaceC1300zZ.b();
            AbstractC2855l.f(interfaceC1288mB, "getContainingDeclaration(...)");
            if (AbstractC3029k.d(interfaceC1288mB) && (interfaceC1300zZ instanceof InterfaceC1287l) && ((InterfaceC1287l) interfaceC1300zZ).A()) {
                throw new Y0(c0539i0.Z().b() + " cannot have default arguments");
            }
            InterfaceC1300z interfaceC1300zL0 = c0539i0.l0(c0539i0.Z());
            if (interfaceC1300zL0 != null) {
                AbstractC0548n abstractC0548nG2 = f1Var.g(interfaceC1300zL0);
                AbstractC2855l.e(abstractC0548nG2, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.JvmFunctionSignature.KotlinFunction");
                AbstractC0548n.e eVar = (AbstractC0548n.e) abstractC0548nG2;
                genericDeclarationV = c0539i0.S().w(eVar.c(), eVar.b(), true);
            } else {
                AbstractC0529d0 abstractC0529d0S = c0539i0.S();
                AbstractC0548n.e eVar2 = (AbstractC0548n.e) abstractC0548nG;
                String strC = eVar2.c();
                String strB = eVar2.b();
                AbstractC2855l.d(c0539i0.R().b());
                genericDeclarationV = abstractC0529d0S.w(strC, strB, !Modifier.isStatic(r5.getModifiers()));
            }
        } else if (abstractC0548nG instanceof AbstractC0548n.d) {
            if (c0539i0.W()) {
                Class clsB = c0539i0.S().b();
                List parameters = c0539i0.getParameters();
                ArrayList arrayList = new ArrayList(AbstractC2800q.u(parameters, 10));
                Iterator it = parameters.iterator();
                while (it.hasNext()) {
                    String name = ((C7.j) it.next()).getName();
                    AbstractC2855l.d(name);
                    arrayList.add(name);
                }
                return new G7.a(clsB, arrayList, a.EnumC0047a.f3490g, a.b.f3495h, null, 16, null);
            }
            genericDeclarationV = c0539i0.S().v(((AbstractC0548n.d) abstractC0548nG).b());
        } else {
            if (abstractC0548nG instanceof AbstractC0548n.a) {
                List listD = ((AbstractC0548n.a) abstractC0548nG).d();
                Class clsB2 = c0539i0.S().b();
                ArrayList arrayList2 = new ArrayList(AbstractC2800q.u(listD, 10));
                Iterator it2 = listD.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((Method) it2.next()).getName());
                }
                return new G7.a(clsB2, arrayList2, a.EnumC0047a.f3490g, a.b.f3494g, listD);
            }
            genericDeclarationV = null;
        }
        if (genericDeclarationV instanceof Constructor) {
            iVarF0 = c0539i0.d0((Constructor) genericDeclarationV, c0539i0.Z(), true);
        } else if (!(genericDeclarationV instanceof Method)) {
            iVarF0 = null;
        } else if (c0539i0.Z().getAnnotations().b(j1.j()) != null) {
            InterfaceC1288m interfaceC1288mB2 = c0539i0.Z().b();
            AbstractC2855l.e(interfaceC1288mB2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            iVarF0 = !((InterfaceC1280e) interfaceC1288mB2).y() ? c0539i0.f0((Method) genericDeclarationV) : c0539i0.g0((Method) genericDeclarationV);
        }
        if (iVarF0 != null) {
            return G7.o.i(iVarF0, c0539i0.Z(), true);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC1300z i0(C0539i0 c0539i0, String str) {
        return c0539i0.S().x(str, c0539i0.f2066n);
    }

    private final Object j0() {
        return G7.o.h(this.f2067o, Z());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final InterfaceC1300z l0(InterfaceC1300z interfaceC1300z) {
        InterfaceC1288m interfaceC1288mB;
        Object next;
        List listI = interfaceC1300z.i();
        AbstractC2855l.f(listI, "getValueParameters(...)");
        if (listI == null || !listI.isEmpty()) {
            Iterator it = listI.iterator();
            while (it.hasNext()) {
                if (((L7.t0) it.next()).q0()) {
                    break;
                }
            }
            interfaceC1288mB = interfaceC1300z.b();
            AbstractC2855l.f(interfaceC1288mB, "getContainingDeclaration(...)");
            if (AbstractC3029k.g(interfaceC1288mB)) {
                Member memberB = R().b();
                AbstractC2855l.d(memberB);
                if (Modifier.isStatic(memberB.getModifiers())) {
                    Iterator it2 = AbstractC3340e.z(interfaceC1300z, false).iterator();
                    loop0: while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        List listI2 = ((InterfaceC1277b) next).i();
                        AbstractC2855l.f(listI2, "getValueParameters(...)");
                        if (listI2 == null || !listI2.isEmpty()) {
                            Iterator it3 = listI2.iterator();
                            while (it3.hasNext()) {
                                if (((L7.t0) it3.next()).q0()) {
                                    break loop0;
                                }
                            }
                        }
                    }
                    if (next instanceof InterfaceC1300z) {
                        return (InterfaceC1300z) next;
                    }
                }
            }
        } else {
            interfaceC1288mB = interfaceC1300z.b();
            AbstractC2855l.f(interfaceC1288mB, "getContainingDeclaration(...)");
            if (AbstractC3029k.g(interfaceC1288mB)) {
            }
        }
        return null;
    }

    private final boolean m0(Method method) {
        C8.S type;
        L7.c0 c0VarA0 = Z().a0();
        if (c0VarA0 == null || (type = c0VarA0.getType()) == null || !AbstractC3029k.c(type)) {
            return false;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        AbstractC2855l.f(parameterTypes, "getParameterTypes(...)");
        Class cls = (Class) AbstractC2793j.G(parameterTypes);
        return cls != null && cls.isInterface();
    }

    @Override // F7.A
    public G7.h R() {
        return (G7.h) this.f2069q.getValue();
    }

    @Override // F7.A
    public AbstractC0529d0 S() {
        return this.f2065m;
    }

    @Override // F7.A
    public G7.h T() {
        return (G7.h) this.f2070r.getValue();
    }

    @Override // F7.A
    public boolean X() {
        return this.f2067o != AbstractC2846c.NO_RECEIVER;
    }

    @Override // w7.p
    public Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        return InterfaceC0544l.a.e(this, obj, obj2, obj3, obj4);
    }

    public boolean equals(Object obj) {
        C0539i0 c0539i0C = j1.c(obj);
        return c0539i0C != null && AbstractC2855l.b(S(), c0539i0C.S()) && AbstractC2855l.b(getName(), c0539i0C.getName()) && AbstractC2855l.b(this.f2066n, c0539i0C.f2066n) && AbstractC2855l.b(this.f2067o, c0539i0C.f2067o);
    }

    @Override // kotlin.jvm.internal.InterfaceC2851h
    public int getArity() {
        return G7.j.a(R());
    }

    @Override // C7.c
    public String getName() {
        String strJ = Z().getName().j();
        AbstractC2855l.f(strJ, "asString(...)");
        return strJ;
    }

    public int hashCode() {
        return (((S().hashCode() * 31) + getName().hashCode()) * 31) + this.f2066n.hashCode();
    }

    @Override // w7.t
    public Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return InterfaceC0544l.a.i(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
    }

    @Override // w7.InterfaceC3487a
    public Object invoke() {
        return InterfaceC0544l.a.a(this);
    }

    @Override // C7.g
    public boolean isExternal() {
        return Z().isExternal();
    }

    @Override // C7.g
    public boolean isInfix() {
        return Z().isInfix();
    }

    @Override // C7.g
    public boolean isInline() {
        return Z().isInline();
    }

    @Override // C7.g
    public boolean isOperator() {
        return Z().isOperator();
    }

    @Override // C7.c
    public boolean isSuspend() {
        return Z().isSuspend();
    }

    @Override // F7.A
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public InterfaceC1300z Z() {
        Object objC = this.f2068p.c(this, f2064s[0]);
        AbstractC2855l.f(objC, "getValue(...)");
        return (InterfaceC1300z) objC;
    }

    @Override // w7.r
    public Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return InterfaceC0544l.a.g(this, obj, obj2, obj3, obj4, obj5, obj6);
    }

    @Override // w7.u
    public Object p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        return InterfaceC0544l.a.j(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
    }

    @Override // w7.s
    public Object s(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return InterfaceC0544l.a.h(this, obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    public String toString() {
        return e1.f2045a.f(Z());
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return InterfaceC0544l.a.b(this, obj);
    }

    private C0539i0(AbstractC0529d0 abstractC0529d0, String str, String str2, InterfaceC1300z interfaceC1300z, Object obj) {
        this.f2065m = abstractC0529d0;
        this.f2066n = str2;
        this.f2067o = obj;
        this.f2068p = a1.b(interfaceC1300z, new C0533f0(this, str));
        EnumC2749l enumC2749l = EnumC2749l.f28717h;
        this.f2069q = AbstractC2746i.a(enumC2749l, new C0535g0(this));
        this.f2070r = AbstractC2746i.a(enumC2749l, new C0537h0(this));
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        return InterfaceC0544l.a.c(this, obj, obj2);
    }

    @Override // w7.o
    public Object invoke(Object obj, Object obj2, Object obj3) {
        return InterfaceC0544l.a.d(this, obj, obj2, obj3);
    }

    @Override // w7.q
    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return InterfaceC0544l.a.f(this, obj, obj2, obj3, obj4, obj5);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0539i0(AbstractC0529d0 container, String name, String signature, Object obj) {
        this(container, name, signature, null, obj);
        AbstractC2855l.g(container, "container");
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(signature, "signature");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0539i0(AbstractC0529d0 container, InterfaceC1300z descriptor) {
        AbstractC2855l.g(container, "container");
        AbstractC2855l.g(descriptor, "descriptor");
        String strJ = descriptor.getName().j();
        AbstractC2855l.f(strJ, "asString(...)");
        this(container, strJ, f1.f2051a.g(descriptor).a(), descriptor, null, 16, null);
    }
}
