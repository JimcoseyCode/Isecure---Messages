package F7;

import C7.j;
import F7.a1;
import L7.AbstractC1295u;
import L7.InterfaceC1277b;
import i7.AbstractC2746i;
import i7.EnumC2749l;
import j7.AbstractC2793j;
import j7.AbstractC2800q;
import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC2855l;
import l7.AbstractC2884a;
import v7.AbstractC3430a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class A implements C7.c, X0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a1.a f1909g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final a1.a f1910h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final a1.a f1911i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final a1.a f1912j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final a1.a f1913k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Lazy f1914l;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC2884a.a(((C7.j) obj).getName(), ((C7.j) obj2).getName());
        }
    }

    public A() {
        a1.a aVarC = a1.c(new C0554q(this));
        AbstractC2855l.f(aVarC, "lazySoft(...)");
        this.f1909g = aVarC;
        a1.a aVarC2 = a1.c(new r(this));
        AbstractC2855l.f(aVarC2, "lazySoft(...)");
        this.f1910h = aVarC2;
        a1.a aVarC3 = a1.c(new C0557s(this));
        AbstractC2855l.f(aVarC3, "lazySoft(...)");
        this.f1911i = aVarC3;
        a1.a aVarC4 = a1.c(new C0559t(this));
        AbstractC2855l.f(aVarC4, "lazySoft(...)");
        this.f1912j = aVarC4;
        a1.a aVarC5 = a1.c(new C0561u(this));
        AbstractC2855l.f(aVarC5, "lazySoft(...)");
        this.f1913k = aVarC5;
        this.f1914l = AbstractC2746i.a(EnumC2749l.f28717h, new C0563v(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type A(A a10) {
        Type typeP = a10.P();
        return typeP == null ? a10.R().getReturnType() : typeP;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List B(A a10) {
        List<L7.m0> typeParameters = a10.Z().getTypeParameters();
        AbstractC2855l.f(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(typeParameters, 10));
        for (L7.m0 m0Var : typeParameters) {
            AbstractC2855l.d(m0Var);
            arrayList.add(new W0(a10, m0Var));
        }
        return arrayList;
    }

    private final Object M(Map map) throws D7.a {
        Object objO;
        List<C7.j> parameters = getParameters();
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(parameters, 10));
        for (C7.j jVar : parameters) {
            if (map.containsKey(jVar)) {
                objO = map.get(jVar);
                if (objO == null) {
                    throw new IllegalArgumentException("Annotation argument value cannot be null (" + jVar + ')');
                }
            } else if (jVar.d()) {
                objO = null;
            } else {
                if (!jVar.a()) {
                    throw new IllegalArgumentException("No argument provided for a required parameter: " + jVar);
                }
                objO = O(jVar.getType());
            }
            arrayList.add(objO);
        }
        G7.h hVarT = T();
        if (hVarT != null) {
            try {
                return hVarT.call(arrayList.toArray(new Object[0]));
            } catch (IllegalAccessException e10) {
                throw new D7.a(e10);
            }
        }
        throw new Y0("This callable does not support a default call: " + Z());
    }

    private final Object O(C7.o oVar) {
        Class clsB = AbstractC3430a.b(E7.b.b(oVar));
        if (clsB.isArray()) {
            Object objNewInstance = Array.newInstance(clsB.getComponentType(), 0);
            AbstractC2855l.f(objNewInstance, "run(...)");
            return objNewInstance;
        }
        throw new Y0("Cannot instantiate the default empty array of type " + clsB.getSimpleName() + ", because it is not an array type");
    }

    private final Type P() {
        Type[] lowerBounds;
        if (isSuspend()) {
            Object objS0 = AbstractC2800q.s0(R().a());
            ParameterizedType parameterizedType = objS0 instanceof ParameterizedType ? (ParameterizedType) objS0 : null;
            if (AbstractC2855l.b(parameterizedType != null ? parameterizedType.getRawType() : null, n7.f.class)) {
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                AbstractC2855l.f(actualTypeArguments, "getActualTypeArguments(...)");
                Object objI0 = AbstractC2793j.i0(actualTypeArguments);
                WildcardType wildcardType = objI0 instanceof WildcardType ? (WildcardType) objI0 : null;
                if (wildcardType != null && (lowerBounds = wildcardType.getLowerBounds()) != null) {
                    return (Type) AbstractC2793j.F(lowerBounds);
                }
            }
        }
        return null;
    }

    private final Object[] Q() {
        return (Object[]) ((Object[]) this.f1913k.invoke()).clone();
    }

    private final int V(C7.j jVar) {
        if (!((Boolean) this.f1914l.getValue()).booleanValue()) {
            throw new IllegalArgumentException("Check if parametersNeedMFVCFlattening is true before");
        }
        if (!j1.k(jVar.getType())) {
            return 1;
        }
        C7.o type = jVar.getType();
        AbstractC2855l.e(type, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
        List listN = G7.o.n(C8.F0.a(((U0) type).v()));
        AbstractC2855l.d(listN);
        return listN.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Y(A a10) {
        List parameters = a10.getParameters();
        if (parameters != null && parameters.isEmpty()) {
            return false;
        }
        Iterator it = parameters.iterator();
        while (it.hasNext()) {
            if (j1.k(((C7.j) it.next()).getType())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] t(A a10) {
        int iV;
        List<C7.j> parameters = a10.getParameters();
        int size = parameters.size() + (a10.isSuspend() ? 1 : 0);
        if (((Boolean) a10.f1914l.getValue()).booleanValue()) {
            iV = 0;
            for (C7.j jVar : parameters) {
                iV += jVar.getKind() == j.a.f515i ? a10.V(jVar) : 0;
            }
        } else if (parameters.isEmpty()) {
            iV = 0;
        } else {
            Iterator it = parameters.iterator();
            iV = 0;
            while (it.hasNext()) {
                if (((C7.j) it.next()).getKind() == j.a.f515i && (iV = iV + 1) < 0) {
                    AbstractC2800q.s();
                }
            }
        }
        int i10 = (iV + 31) / 32;
        Object[] objArr = new Object[size + i10 + 1];
        for (C7.j jVar2 : parameters) {
            if (jVar2.d() && !j1.l(jVar2.getType())) {
                objArr[jVar2.getIndex()] = j1.g(E7.c.f(jVar2.getType()));
            } else if (jVar2.a()) {
                objArr[jVar2.getIndex()] = a10.O(jVar2.getType());
            }
        }
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[size + i11] = 0;
        }
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List u(A a10) {
        return j1.e(a10.Z());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrayList v(A a10) {
        int i10;
        InterfaceC1277b interfaceC1277bU = a10.Z();
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        if (a10.X()) {
            i10 = 0;
        } else {
            L7.c0 c0VarI = j1.i(interfaceC1277bU);
            if (c0VarI != null) {
                arrayList.add(new C0570y0(a10, 0, j.a.f513g, new C0565w(c0VarI)));
                i10 = 1;
            } else {
                i10 = 0;
            }
            L7.c0 c0VarH0 = interfaceC1277bU.h0();
            if (c0VarH0 != null) {
                arrayList.add(new C0570y0(a10, i10, j.a.f514h, new C0567x(c0VarH0)));
                i10++;
            }
        }
        int size = interfaceC1277bU.i().size();
        while (i11 < size) {
            arrayList.add(new C0570y0(a10, i10, j.a.f515i, new C0569y(interfaceC1277bU, i11)));
            i11++;
            i10++;
        }
        if (a10.W() && (interfaceC1277bU instanceof W7.a) && arrayList.size() > 1) {
            AbstractC2800q.y(arrayList, new a());
        }
        arrayList.trimToSize();
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L7.W y(InterfaceC1277b interfaceC1277b, int i10) {
        Object obj = interfaceC1277b.i().get(i10);
        AbstractC2855l.f(obj, "get(...)");
        return (L7.W) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final U0 z(A a10) {
        C8.S returnType = a10.Z().getReturnType();
        AbstractC2855l.d(returnType);
        return new U0(returnType, new C0571z(a10));
    }

    public final Object N(Map args, n7.f fVar) throws D7.a {
        AbstractC2855l.g(args, "args");
        List<C7.j> parameters = getParameters();
        boolean z10 = false;
        if (parameters.isEmpty()) {
            try {
                return R().call(isSuspend() ? new n7.f[]{fVar} : new n7.f[0]);
            } catch (IllegalAccessException e10) {
                throw new D7.a(e10);
            }
        }
        int size = parameters.size() + (isSuspend() ? 1 : 0);
        Object[] objArrQ = Q();
        if (isSuspend()) {
            objArrQ[parameters.size()] = fVar;
        }
        boolean zBooleanValue = ((Boolean) this.f1914l.getValue()).booleanValue();
        int i10 = 0;
        for (C7.j jVar : parameters) {
            int iV = zBooleanValue ? V(jVar) : 1;
            if (args.containsKey(jVar)) {
                objArrQ[jVar.getIndex()] = args.get(jVar);
            } else if (jVar.d()) {
                if (zBooleanValue) {
                    int i11 = i10 + iV;
                    for (int i12 = i10; i12 < i11; i12++) {
                        int i13 = (i12 / 32) + size;
                        Object obj = objArrQ[i13];
                        AbstractC2855l.e(obj, "null cannot be cast to non-null type kotlin.Int");
                        objArrQ[i13] = Integer.valueOf(((Integer) obj).intValue() | (1 << (i12 % 32)));
                    }
                } else {
                    int i14 = (i10 / 32) + size;
                    Object obj2 = objArrQ[i14];
                    AbstractC2855l.e(obj2, "null cannot be cast to non-null type kotlin.Int");
                    objArrQ[i14] = Integer.valueOf(((Integer) obj2).intValue() | (1 << (i10 % 32)));
                }
                z10 = true;
            } else if (!jVar.a()) {
                throw new IllegalArgumentException("No argument provided for a required parameter: " + jVar);
            }
            if (jVar.getKind() == j.a.f515i) {
                i10 += iV;
            }
        }
        if (!z10) {
            try {
                G7.h hVarR = R();
                Object[] objArrCopyOf = Arrays.copyOf(objArrQ, size);
                AbstractC2855l.f(objArrCopyOf, "copyOf(...)");
                return hVarR.call(objArrCopyOf);
            } catch (IllegalAccessException e11) {
                throw new D7.a(e11);
            }
        }
        G7.h hVarT = T();
        if (hVarT != null) {
            try {
                return hVarT.call(objArrQ);
            } catch (IllegalAccessException e12) {
                throw new D7.a(e12);
            }
        }
        throw new Y0("This callable does not support a default call: " + Z());
    }

    public abstract G7.h R();

    public abstract AbstractC0529d0 S();

    public abstract G7.h T();

    /* JADX INFO: renamed from: U */
    public abstract InterfaceC1277b Z();

    protected final boolean W() {
        return AbstractC2855l.b(getName(), "<init>") && S().b().isAnnotation();
    }

    public abstract boolean X();

    @Override // C7.c
    public Object call(Object... args) throws D7.a {
        AbstractC2855l.g(args, "args");
        try {
            return R().call(args);
        } catch (IllegalAccessException e10) {
            throw new D7.a(e10);
        }
    }

    @Override // C7.c
    public Object callBy(Map args) {
        AbstractC2855l.g(args, "args");
        return W() ? M(args) : N(args, null);
    }

    @Override // C7.b
    public List getAnnotations() {
        Object objInvoke = this.f1909g.invoke();
        AbstractC2855l.f(objInvoke, "invoke(...)");
        return (List) objInvoke;
    }

    @Override // C7.c
    public List getParameters() {
        Object objInvoke = this.f1910h.invoke();
        AbstractC2855l.f(objInvoke, "invoke(...)");
        return (List) objInvoke;
    }

    @Override // C7.c
    public C7.o getReturnType() {
        Object objInvoke = this.f1911i.invoke();
        AbstractC2855l.f(objInvoke, "invoke(...)");
        return (C7.o) objInvoke;
    }

    @Override // C7.c
    public List getTypeParameters() {
        Object objInvoke = this.f1912j.invoke();
        AbstractC2855l.f(objInvoke, "invoke(...)");
        return (List) objInvoke;
    }

    @Override // C7.c
    public C7.s getVisibility() {
        AbstractC1295u visibility = Z().getVisibility();
        AbstractC2855l.f(visibility, "getVisibility(...)");
        return j1.r(visibility);
    }

    @Override // C7.c
    public boolean isAbstract() {
        return Z().k() == L7.E.f7286k;
    }

    @Override // C7.c
    public boolean isFinal() {
        return Z().k() == L7.E.f7283h;
    }

    @Override // C7.c
    public boolean isOpen() {
        return Z().k() == L7.E.f7285j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L7.W w(L7.c0 c0Var) {
        return c0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L7.W x(L7.c0 c0Var) {
        return c0Var;
    }
}
