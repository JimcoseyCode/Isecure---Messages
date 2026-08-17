package F7;

import C7.h;
import C7.k;
import F7.AbstractC0552p;
import F7.a1;
import L7.InterfaceC1280e;
import L7.InterfaceC1288m;
import M7.h;
import U7.AbstractC1487o;
import i7.AbstractC2746i;
import i7.C2750m;
import i7.EnumC2749l;
import i8.AbstractC2757a;
import j8.AbstractC2809d;
import j8.C2814i;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC2846c;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o8.AbstractC3026h;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class K0 extends A implements C7.k {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final b f1941s = new b(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Object f1942t = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AbstractC0529d0 f1943m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f1944n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f1945o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Object f1946p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Lazy f1947q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final a1.a f1948r;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class a extends A implements C7.g, k.a {
        @Override // F7.A
        public AbstractC0529d0 S() {
            return j().S();
        }

        @Override // F7.A
        public G7.h T() {
            return null;
        }

        @Override // F7.A
        public boolean X() {
            return j().X();
        }

        public abstract L7.Y Z();

        /* JADX INFO: renamed from: a0 */
        public abstract K0 j();

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
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class c extends a implements k.b {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        static final /* synthetic */ C7.k[] f1949o = {kotlin.jvm.internal.D.k(new kotlin.jvm.internal.v(kotlin.jvm.internal.D.b(c.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;"))};

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final a1.a f1950m = a1.c(new L0(this));

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Lazy f1951n = AbstractC2746i.a(EnumC2749l.f28717h, new M0(this));

        /* JADX INFO: Access modifiers changed from: private */
        public static final G7.h d0(c cVar) {
            return P0.b(cVar, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final L7.a0 e0(c cVar) {
            L7.a0 getter = cVar.j().Z().getGetter();
            if (getter != null) {
                return getter;
            }
            O7.L lD = AbstractC3026h.d(cVar.j().Z(), M7.h.f7570a.b());
            AbstractC2855l.f(lD, "createDefaultGetter(...)");
            return lD;
        }

        @Override // F7.A
        public G7.h R() {
            return (G7.h) this.f1951n.getValue();
        }

        public boolean equals(Object obj) {
            return (obj instanceof c) && AbstractC2855l.b(j(), ((c) obj).j());
        }

        @Override // F7.K0.a
        /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public L7.a0 Z() {
            Object objC = this.f1950m.c(this, f1949o[0]);
            AbstractC2855l.f(objC, "getValue(...)");
            return (L7.a0) objC;
        }

        @Override // C7.c
        public String getName() {
            return "<get-" + j().getName() + '>';
        }

        public int hashCode() {
            return j().hashCode();
        }

        public String toString() {
            return "getter of " + j();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class d extends a implements h.a {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        static final /* synthetic */ C7.k[] f1952o = {kotlin.jvm.internal.D.k(new kotlin.jvm.internal.v(kotlin.jvm.internal.D.b(d.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;"))};

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final a1.a f1953m = a1.c(new N0(this));

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Lazy f1954n = AbstractC2746i.a(EnumC2749l.f28717h, new O0(this));

        /* JADX INFO: Access modifiers changed from: private */
        public static final G7.h d0(d dVar) {
            return P0.b(dVar, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final L7.b0 e0(d dVar) {
            L7.b0 b0VarH = dVar.j().Z().h();
            if (b0VarH != null) {
                return b0VarH;
            }
            L7.Z Z9 = dVar.j().Z();
            h.a aVar = M7.h.f7570a;
            O7.M mE = AbstractC3026h.e(Z9, aVar.b(), aVar.b());
            AbstractC2855l.f(mE, "createDefaultSetter(...)");
            return mE;
        }

        @Override // F7.A
        public G7.h R() {
            return (G7.h) this.f1954n.getValue();
        }

        public boolean equals(Object obj) {
            return (obj instanceof d) && AbstractC2855l.b(j(), ((d) obj).j());
        }

        @Override // F7.K0.a
        /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
        public L7.b0 Z() {
            Object objC = this.f1953m.c(this, f1952o[0]);
            AbstractC2855l.f(objC, "getValue(...)");
            return (L7.b0) objC;
        }

        @Override // C7.c
        public String getName() {
            return "<set-" + j().getName() + '>';
        }

        public int hashCode() {
            return j().hashCode();
        }

        public String toString() {
            return "setter of " + j();
        }
    }

    private K0(AbstractC0529d0 abstractC0529d0, String str, String str2, L7.Z z10, Object obj) {
        this.f1943m = abstractC0529d0;
        this.f1944n = str;
        this.f1945o = str2;
        this.f1946p = obj;
        this.f1947q = AbstractC2746i.a(EnumC2749l.f28717h, new I0(this));
        a1.a aVarB = a1.b(z10, new J0(this));
        AbstractC2855l.f(aVarB, "lazySoft(...)");
        this.f1948r = aVarB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L7.Z Z(K0 k02) {
        return k02.S().A(k02.getName(), k02.f1945o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Field a0(K0 k02) {
        Class<?> enclosingClass;
        AbstractC0552p abstractC0552pF = f1.f2051a.f(k02.Z());
        if (!(abstractC0552pF instanceof AbstractC0552p.c)) {
            if (abstractC0552pF instanceof AbstractC0552p.a) {
                return ((AbstractC0552p.a) abstractC0552pF).b();
            }
            if ((abstractC0552pF instanceof AbstractC0552p.b) || (abstractC0552pF instanceof AbstractC0552p.d)) {
                return null;
            }
            throw new C2750m();
        }
        AbstractC0552p.c cVar = (AbstractC0552p.c) abstractC0552pF;
        L7.Z zB = cVar.b();
        AbstractC2809d.a aVarD = C2814i.d(C2814i.f28956a, cVar.e(), cVar.d(), cVar.g(), false, 8, null);
        if (aVarD == null) {
            return null;
        }
        if (AbstractC1487o.e(zB) || C2814i.f(cVar.e())) {
            enclosingClass = k02.S().b().getEnclosingClass();
        } else {
            InterfaceC1288m interfaceC1288mB = zB.b();
            enclosingClass = interfaceC1288mB instanceof InterfaceC1280e ? j1.q((InterfaceC1280e) interfaceC1288mB) : k02.S().b();
        }
        if (enclosingClass == null) {
            return null;
        }
        try {
            return enclosingClass.getDeclaredField(aVarD.e());
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    @Override // F7.A
    public G7.h R() {
        return h0().R();
    }

    @Override // F7.A
    public AbstractC0529d0 S() {
        return this.f1943m;
    }

    @Override // F7.A
    public G7.h T() {
        return h0().T();
    }

    @Override // F7.A
    public boolean X() {
        return this.f1946p != AbstractC2846c.NO_RECEIVER;
    }

    protected final Member d0() {
        if (!Z().M()) {
            return null;
        }
        AbstractC0552p abstractC0552pF = f1.f2051a.f(Z());
        if (abstractC0552pF instanceof AbstractC0552p.c) {
            AbstractC0552p.c cVar = (AbstractC0552p.c) abstractC0552pF;
            if (cVar.f().D()) {
                AbstractC2757a.c cVarY = cVar.f().y();
                if (!cVarY.y() || !cVarY.x()) {
                    return null;
                }
                return S().z(cVar.d().getString(cVarY.w()), cVar.d().getString(cVarY.v()));
            }
        }
        return i0();
    }

    public final Object e0() {
        return G7.o.h(this.f1946p, Z());
    }

    public boolean equals(Object obj) {
        K0 k0D = j1.d(obj);
        return k0D != null && AbstractC2855l.b(S(), k0D.S()) && AbstractC2855l.b(getName(), k0D.getName()) && AbstractC2855l.b(this.f1945o, k0D.f1945o) && AbstractC2855l.b(this.f1946p, k0D.f1946p);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final Object f0(Member member, Object obj, Object obj2) throws D7.b {
        try {
            Object obj3 = f1942t;
            if ((obj == obj3 || obj2 == obj3) && Z().h0() == null) {
                throw new RuntimeException('\'' + this + "' is not an extension property and thus getExtensionDelegate() is not going to work, use getDelegate() instead");
            }
            Object objE0 = X() ? e0() : obj;
            if (objE0 == obj3) {
                objE0 = null;
            }
            if (!X()) {
                obj = obj2;
            }
            if (obj == obj3) {
                obj = null;
            }
            AccessibleObject accessibleObject = member instanceof AccessibleObject ? (AccessibleObject) member : null;
            if (accessibleObject != null) {
                accessibleObject.setAccessible(E7.a.a(this));
            }
            if (member == 0) {
                return null;
            }
            if (member instanceof Field) {
                return ((Field) member).get(objE0);
            }
            if (!(member instanceof Method)) {
                throw new AssertionError("delegate field/method " + member + " neither field nor method");
            }
            int length = ((Method) member).getParameterTypes().length;
            if (length == 0) {
                return ((Method) member).invoke(null, null);
            }
            if (length == 1) {
                Method method = (Method) member;
                if (objE0 == null) {
                    Class<?> cls = ((Method) member).getParameterTypes()[0];
                    AbstractC2855l.f(cls, "get(...)");
                    objE0 = j1.g(cls);
                }
                return method.invoke(null, objE0);
            }
            if (length != 2) {
                throw new AssertionError("delegate method " + member + " should take 0, 1, or 2 parameters");
            }
            Method method2 = (Method) member;
            if (obj == null) {
                Class<?> cls2 = ((Method) member).getParameterTypes()[1];
                AbstractC2855l.f(cls2, "get(...)");
                obj = j1.g(cls2);
            }
            return method2.invoke(null, objE0, obj);
        } catch (IllegalAccessException e10) {
            throw new D7.b(e10);
        }
    }

    @Override // F7.A
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public L7.Z Z() {
        Object objInvoke = this.f1948r.invoke();
        AbstractC2855l.f(objInvoke, "invoke(...)");
        return (L7.Z) objInvoke;
    }

    @Override // C7.c
    public String getName() {
        return this.f1944n;
    }

    public abstract c h0();

    public int hashCode() {
        return (((S().hashCode() * 31) + getName().hashCode()) * 31) + this.f1945o.hashCode();
    }

    public final Field i0() {
        return (Field) this.f1947q.getValue();
    }

    @Override // C7.k
    public boolean isConst() {
        return Z().isConst();
    }

    @Override // C7.k
    public boolean isLateinit() {
        return Z().o0();
    }

    @Override // C7.c
    public boolean isSuspend() {
        return false;
    }

    public final String j0() {
        return this.f1945o;
    }

    public String toString() {
        return e1.f2045a.k(Z());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public K0(AbstractC0529d0 container, String name, String signature, Object obj) {
        this(container, name, signature, null, obj);
        AbstractC2855l.g(container, "container");
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(signature, "signature");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public K0(AbstractC0529d0 container, L7.Z descriptor) {
        AbstractC2855l.g(container, "container");
        AbstractC2855l.g(descriptor, "descriptor");
        String strJ = descriptor.getName().j();
        AbstractC2855l.f(strJ, "asString(...)");
        this(container, strJ, f1.f2051a.f(descriptor).a(), descriptor, AbstractC2846c.NO_RECEIVER);
    }
}
