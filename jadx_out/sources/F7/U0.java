package F7;

import F7.a1;
import L7.InterfaceC1280e;
import L7.InterfaceC1283h;
import R7.AbstractC1394f;
import i7.AbstractC2746i;
import i7.C2750m;
import i7.C2751n;
import i7.EnumC2749l;
import j7.AbstractC2793j;
import j7.AbstractC2800q;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v7.AbstractC3430a;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class U0 implements kotlin.jvm.internal.m {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final /* synthetic */ C7.k[] f1980k = {kotlin.jvm.internal.D.k(new kotlin.jvm.internal.v(kotlin.jvm.internal.D.b(U0.class), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;")), kotlin.jvm.internal.D.k(new kotlin.jvm.internal.v(kotlin.jvm.internal.D.b(U0.class), "arguments", "getArguments()Ljava/util/List;"))};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C8.S f1981g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final a1.a f1982h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final a1.a f1983i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final a1.a f1984j;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1985a;

        static {
            int[] iArr = new int[C8.N0.values().length];
            try {
                iArr[C8.N0.f592k.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C8.N0.f593l.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C8.N0.f594m.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f1985a = iArr;
        }
    }

    public U0(C8.S type, InterfaceC3487a interfaceC3487a) {
        AbstractC2855l.g(type, "type");
        this.f1981g = type;
        a1.a aVarC = null;
        a1.a aVar = interfaceC3487a instanceof a1.a ? (a1.a) interfaceC3487a : null;
        if (aVar != null) {
            aVarC = aVar;
        } else if (interfaceC3487a != null) {
            aVarC = a1.c(interfaceC3487a);
        }
        this.f1982h = aVarC;
        this.f1983i = a1.c(new Q0(this));
        this.f1984j = a1.c(new R0(this, interfaceC3487a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List k(U0 u02, InterfaceC3487a interfaceC3487a) {
        C7.q qVarD;
        List listI0 = u02.f1981g.I0();
        if (listI0.isEmpty()) {
            return AbstractC2800q.j();
        }
        Lazy lazyA = AbstractC2746i.a(EnumC2749l.f28717h, new S0(u02));
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(listI0, 10));
        int i10 = 0;
        for (Object obj : listI0) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC2800q.t();
            }
            C8.B0 b02 = (C8.B0) obj;
            if (b02.b()) {
                qVarD = C7.q.f518c.c();
            } else {
                C8.S type = b02.getType();
                AbstractC2855l.f(type, "getType(...)");
                U0 u03 = new U0(type, interfaceC3487a == null ? null : new T0(u02, i10, lazyA));
                int i12 = a.f1985a[b02.a().ordinal()];
                if (i12 == 1) {
                    qVarD = C7.q.f518c.d(u03);
                } else if (i12 == 2) {
                    qVarD = C7.q.f518c.a(u03);
                } else {
                    if (i12 != 3) {
                        throw new C2750m();
                    }
                    qVarD = C7.q.f518c.b(u03);
                }
            }
            arrayList.add(qVarD);
            i10 = i11;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List m(U0 u02) {
        Type typeC = u02.c();
        AbstractC2855l.d(typeC);
        return AbstractC1394f.h(typeC);
    }

    private static final List p(Lazy lazy) {
        return (List) lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type s(U0 u02, int i10, Lazy lazy) {
        Type typeC = u02.c();
        if (typeC instanceof Class) {
            Class cls = (Class) typeC;
            Class componentType = cls.isArray() ? cls.getComponentType() : Object.class;
            AbstractC2855l.d(componentType);
            return componentType;
        }
        if (typeC instanceof GenericArrayType) {
            if (i10 == 0) {
                Type genericComponentType = ((GenericArrayType) typeC).getGenericComponentType();
                AbstractC2855l.d(genericComponentType);
                return genericComponentType;
            }
            throw new Y0("Array type has been queried for a non-0th argument: " + u02);
        }
        if (!(typeC instanceof ParameterizedType)) {
            throw new Y0("Non-generic type has been queried for arguments: " + u02);
        }
        Type type = (Type) p(lazy).get(i10);
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        AbstractC2855l.f(lowerBounds, "getLowerBounds(...)");
        Type type2 = (Type) AbstractC2793j.G(lowerBounds);
        if (type2 == null) {
            Type[] upperBounds = wildcardType.getUpperBounds();
            AbstractC2855l.f(upperBounds, "getUpperBounds(...)");
            type2 = (Type) AbstractC2793j.F(upperBounds);
        }
        AbstractC2855l.d(type2);
        return type2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C7.e t(U0 u02) {
        return u02.u(u02.f1981g);
    }

    private final C7.e u(C8.S s10) {
        C8.S type;
        InterfaceC1283h interfaceC1283hP = s10.K0().p();
        if (!(interfaceC1283hP instanceof InterfaceC1280e)) {
            if (interfaceC1283hP instanceof L7.m0) {
                return new W0(null, (L7.m0) interfaceC1283hP);
            }
            if (!(interfaceC1283hP instanceof L7.l0)) {
                return null;
            }
            throw new C2751n("An operation is not implemented: Type alias classifiers are not yet supported");
        }
        Class clsQ = j1.q((InterfaceC1280e) interfaceC1283hP);
        if (clsQ == null) {
            return null;
        }
        if (!clsQ.isArray()) {
            if (C8.J0.l(s10)) {
                return new X(clsQ);
            }
            Class clsI = AbstractC1394f.i(clsQ);
            if (clsI != null) {
                clsQ = clsI;
            }
            return new X(clsQ);
        }
        C8.B0 b02 = (C8.B0) AbstractC2800q.E0(s10.I0());
        if (b02 == null || (type = b02.getType()) == null) {
            return new X(clsQ);
        }
        C7.e eVarU = u(type);
        if (eVarU != null) {
            return new X(j1.f(AbstractC3430a.b(E7.b.a(eVarU))));
        }
        throw new Y0("Cannot determine classifier for array element type: " + this);
    }

    @Override // kotlin.jvm.internal.m
    public Type c() {
        a1.a aVar = this.f1982h;
        if (aVar != null) {
            return (Type) aVar.invoke();
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof U0)) {
            return false;
        }
        U0 u02 = (U0) obj;
        return AbstractC2855l.b(this.f1981g, u02.f1981g) && AbstractC2855l.b(getClassifier(), u02.getClassifier()) && AbstractC2855l.b(getArguments(), u02.getArguments());
    }

    @Override // C7.b
    public List getAnnotations() {
        return j1.e(this.f1981g);
    }

    @Override // C7.o
    public List getArguments() {
        Object objC = this.f1984j.c(this, f1980k[1]);
        AbstractC2855l.f(objC, "getValue(...)");
        return (List) objC;
    }

    @Override // C7.o
    public C7.e getClassifier() {
        return (C7.e) this.f1983i.c(this, f1980k[0]);
    }

    public int hashCode() {
        int iHashCode = this.f1981g.hashCode() * 31;
        C7.e classifier = getClassifier();
        return ((iHashCode + (classifier != null ? classifier.hashCode() : 0)) * 31) + getArguments().hashCode();
    }

    @Override // C7.o
    /* JADX INFO: renamed from: isMarkedNullable */
    public boolean getIsMarkedNullable() {
        return this.f1981g.L0();
    }

    public String toString() {
        return e1.f2045a.l(this.f1981g);
    }

    public final C8.S v() {
        return this.f1981g;
    }

    public /* synthetic */ U0(C8.S s10, InterfaceC3487a interfaceC3487a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(s10, (i10 & 2) != 0 ? null : interfaceC3487a);
    }
}
