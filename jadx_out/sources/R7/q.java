package R7;

import L7.w0;
import L7.x0;
import b8.EnumC1816D;
import b8.InterfaceC1817a;
import b8.InterfaceC1823g;
import j7.AbstractC2793j;
import j7.AbstractC2800q;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2852i;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class q extends u implements j, A, InterfaceC1823g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f10093a;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    /* synthetic */ class a extends AbstractC2852i implements Function1 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f10094g = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.internal.AbstractC2846c, C7.c
        public final String getName() {
            return "isSynthetic";
        }

        @Override // kotlin.jvm.internal.AbstractC2846c
        public final C7.f getOwner() {
            return kotlin.jvm.internal.D.b(Member.class);
        }

        @Override // kotlin.jvm.internal.AbstractC2846c
        public final String getSignature() {
            return "isSynthetic()Z";
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Member p02) {
            AbstractC2855l.g(p02, "p0");
            return Boolean.valueOf(p02.isSynthetic());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    /* synthetic */ class b extends AbstractC2852i implements Function1 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f10095g = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.internal.AbstractC2846c, C7.c
        public final String getName() {
            return "<init>";
        }

        @Override // kotlin.jvm.internal.AbstractC2846c
        public final C7.f getOwner() {
            return kotlin.jvm.internal.D.b(t.class);
        }

        @Override // kotlin.jvm.internal.AbstractC2846c
        public final String getSignature() {
            return "<init>(Ljava/lang/reflect/Constructor;)V";
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public final t invoke(Constructor p02) {
            AbstractC2855l.g(p02, "p0");
            return new t(p02);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    /* synthetic */ class c extends AbstractC2852i implements Function1 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final c f10096g = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.internal.AbstractC2846c, C7.c
        public final String getName() {
            return "isSynthetic";
        }

        @Override // kotlin.jvm.internal.AbstractC2846c
        public final C7.f getOwner() {
            return kotlin.jvm.internal.D.b(Member.class);
        }

        @Override // kotlin.jvm.internal.AbstractC2846c
        public final String getSignature() {
            return "isSynthetic()Z";
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Member p02) {
            AbstractC2855l.g(p02, "p0");
            return Boolean.valueOf(p02.isSynthetic());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    /* synthetic */ class d extends AbstractC2852i implements Function1 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final d f10097g = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.internal.AbstractC2846c, C7.c
        public final String getName() {
            return "<init>";
        }

        @Override // kotlin.jvm.internal.AbstractC2846c
        public final C7.f getOwner() {
            return kotlin.jvm.internal.D.b(w.class);
        }

        @Override // kotlin.jvm.internal.AbstractC2846c
        public final String getSignature() {
            return "<init>(Ljava/lang/reflect/Field;)V";
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public final w invoke(Field p02) {
            AbstractC2855l.g(p02, "p0");
            return new w(p02);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    /* synthetic */ class e extends AbstractC2852i implements Function1 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final e f10098g = new e();

        e() {
            super(1);
        }

        @Override // kotlin.jvm.internal.AbstractC2846c, C7.c
        public final String getName() {
            return "<init>";
        }

        @Override // kotlin.jvm.internal.AbstractC2846c
        public final C7.f getOwner() {
            return kotlin.jvm.internal.D.b(z.class);
        }

        @Override // kotlin.jvm.internal.AbstractC2846c
        public final String getSignature() {
            return "<init>(Ljava/lang/reflect/Method;)V";
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public final z invoke(Method p02) {
            AbstractC2855l.g(p02, "p0");
            return new z(p02);
        }
    }

    public q(Class klass) {
        AbstractC2855l.g(klass, "klass");
        this.f10093a = klass;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean N(Class cls) {
        String simpleName = cls.getSimpleName();
        AbstractC2855l.f(simpleName, "getSimpleName(...)");
        return simpleName.length() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k8.f O(Class cls) {
        String simpleName = cls.getSimpleName();
        if (!k8.f.s(simpleName)) {
            simpleName = null;
        }
        if (simpleName != null) {
            return k8.f.q(simpleName);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean P(q qVar, Method method) {
        if (method.isSynthetic()) {
            return false;
        }
        if (!qVar.x()) {
            return true;
        }
        AbstractC2855l.d(method);
        return !qVar.Z(method);
    }

    private final boolean Z(Method method) {
        String name = method.getName();
        if (AbstractC2855l.b(name, "values")) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            AbstractC2855l.f(parameterTypes, "getParameterTypes(...)");
            return parameterTypes.length == 0;
        }
        if (AbstractC2855l.b(name, "valueOf")) {
            return Arrays.equals(method.getParameterTypes(), new Class[]{String.class});
        }
        return false;
    }

    @Override // b8.InterfaceC1823g
    public boolean A() throws IllegalAccessException, InvocationTargetException {
        Boolean boolF = C1390b.f10065a.f(this.f10093a);
        if (boolF != null) {
            return boolF.booleanValue();
        }
        return false;
    }

    @Override // b8.InterfaceC1823g
    public boolean D() {
        return this.f10093a.isInterface();
    }

    @Override // b8.InterfaceC1823g
    public EnumC1816D E() {
        return null;
    }

    @Override // b8.InterfaceC1823g
    public O8.i J() throws IllegalAccessException, InvocationTargetException {
        Class[] clsArrC = C1390b.f10065a.c(this.f10093a);
        if (clsArrC != null) {
            ArrayList arrayList = new ArrayList(clsArrC.length);
            for (Class cls : clsArrC) {
                arrayList.add(new s(cls));
            }
            O8.i iVarV = AbstractC2800q.V(arrayList);
            if (iVarV != null) {
                return iVarV;
            }
        }
        return O8.l.i();
    }

    @Override // b8.s
    public boolean M() {
        return Modifier.isStatic(getModifiers());
    }

    @Override // b8.InterfaceC1823g
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public List f() {
        Constructor<?>[] declaredConstructors = this.f10093a.getDeclaredConstructors();
        AbstractC2855l.f(declaredConstructors, "getDeclaredConstructors(...)");
        return O8.l.S(O8.l.J(O8.l.z(AbstractC2793j.y(declaredConstructors), a.f10094g), b.f10095g));
    }

    @Override // R7.j
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public Class t() {
        return this.f10093a;
    }

    @Override // b8.InterfaceC1823g
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public List z() {
        Field[] declaredFields = this.f10093a.getDeclaredFields();
        AbstractC2855l.f(declaredFields, "getDeclaredFields(...)");
        return O8.l.S(O8.l.J(O8.l.z(AbstractC2793j.y(declaredFields), c.f10096g), d.f10097g));
    }

    @Override // b8.InterfaceC1823g
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public List G() {
        Class<?>[] declaredClasses = this.f10093a.getDeclaredClasses();
        AbstractC2855l.f(declaredClasses, "getDeclaredClasses(...)");
        return O8.l.S(O8.l.K(O8.l.z(AbstractC2793j.y(declaredClasses), n.f10090g), o.f10091g));
    }

    @Override // b8.InterfaceC1823g
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public List I() {
        Method[] declaredMethods = this.f10093a.getDeclaredMethods();
        AbstractC2855l.f(declaredMethods, "getDeclaredMethods(...)");
        return O8.l.S(O8.l.J(O8.l.y(AbstractC2793j.y(declaredMethods), new p(this)), e.f10098g));
    }

    @Override // b8.InterfaceC1823g
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public q h() {
        Class<?> declaringClass = this.f10093a.getDeclaringClass();
        if (declaringClass != null) {
            return new q(declaringClass);
        }
        return null;
    }

    @Override // b8.InterfaceC1820d
    public /* bridge */ /* synthetic */ InterfaceC1817a b(k8.c cVar) {
        return b(cVar);
    }

    @Override // b8.InterfaceC1823g
    public k8.c d() {
        return AbstractC1394f.e(this.f10093a).a();
    }

    public boolean equals(Object obj) {
        return (obj instanceof q) && AbstractC2855l.b(this.f10093a, ((q) obj).f10093a);
    }

    @Override // b8.InterfaceC1823g
    public Collection g() {
        Class cls;
        cls = Object.class;
        if (AbstractC2855l.b(this.f10093a, cls)) {
            return AbstractC2800q.j();
        }
        kotlin.jvm.internal.G g10 = new kotlin.jvm.internal.G(2);
        Type genericSuperclass = this.f10093a.getGenericSuperclass();
        g10.a(genericSuperclass != null ? genericSuperclass : Object.class);
        g10.b(this.f10093a.getGenericInterfaces());
        List listM = AbstractC2800q.m(g10.d(new Type[g10.c()]));
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(listM, 10));
        Iterator it = listM.iterator();
        while (it.hasNext()) {
            arrayList.add(new s((Type) it.next()));
        }
        return arrayList;
    }

    @Override // b8.InterfaceC1820d
    public /* bridge */ /* synthetic */ Collection getAnnotations() {
        return getAnnotations();
    }

    @Override // R7.A
    public int getModifiers() {
        return this.f10093a.getModifiers();
    }

    @Override // b8.t
    public k8.f getName() {
        if (!this.f10093a.isAnonymousClass()) {
            k8.f fVarQ = k8.f.q(this.f10093a.getSimpleName());
            AbstractC2855l.d(fVarQ);
            return fVarQ;
        }
        String name = this.f10093a.getName();
        AbstractC2855l.f(name, "getName(...)");
        k8.f fVarQ2 = k8.f.q(P8.q.T0(name, ".", null, 2, null));
        AbstractC2855l.d(fVarQ2);
        return fVarQ2;
    }

    @Override // b8.z
    public List getTypeParameters() {
        TypeVariable[] typeParameters = this.f10093a.getTypeParameters();
        AbstractC2855l.f(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new F(typeVariable));
        }
        return arrayList;
    }

    @Override // b8.s
    public x0 getVisibility() {
        int modifiers = getModifiers();
        return Modifier.isPublic(modifiers) ? w0.h.f7371c : Modifier.isPrivate(modifiers) ? w0.e.f7368c : Modifier.isProtected(modifiers) ? Modifier.isStatic(modifiers) ? P7.c.f8851c : P7.b.f8850c : P7.a.f8849c;
    }

    public int hashCode() {
        return this.f10093a.hashCode();
    }

    @Override // b8.s
    public boolean isAbstract() {
        return Modifier.isAbstract(getModifiers());
    }

    @Override // b8.s
    public boolean isFinal() {
        return Modifier.isFinal(getModifiers());
    }

    @Override // b8.InterfaceC1823g
    public Collection j() {
        Object[] objArrD = C1390b.f10065a.d(this.f10093a);
        if (objArrD == null) {
            objArrD = new Object[0];
        }
        ArrayList arrayList = new ArrayList(objArrD.length);
        for (Object obj : objArrD) {
            arrayList.add(new D(obj));
        }
        return arrayList;
    }

    @Override // b8.InterfaceC1820d
    public boolean k() {
        return false;
    }

    @Override // b8.InterfaceC1823g
    public boolean o() {
        return this.f10093a.isAnnotation();
    }

    @Override // b8.InterfaceC1823g
    public boolean q() throws IllegalAccessException, InvocationTargetException {
        Boolean boolE = C1390b.f10065a.e(this.f10093a);
        if (boolE != null) {
            return boolE.booleanValue();
        }
        return false;
    }

    @Override // b8.InterfaceC1823g
    public boolean r() {
        return false;
    }

    public String toString() {
        return q.class.getName() + ": " + this.f10093a;
    }

    @Override // b8.InterfaceC1823g
    public boolean x() {
        return this.f10093a.isEnum();
    }

    @Override // R7.j, b8.InterfaceC1820d
    public C1395g b(k8.c fqName) {
        Annotation[] declaredAnnotations;
        AbstractC2855l.g(fqName, "fqName");
        AnnotatedElement annotatedElementT = t();
        if (annotatedElementT == null || (declaredAnnotations = annotatedElementT.getDeclaredAnnotations()) == null) {
            return null;
        }
        return k.a(declaredAnnotations, fqName);
    }

    @Override // R7.j, b8.InterfaceC1820d
    public List getAnnotations() {
        Annotation[] declaredAnnotations;
        List listB;
        AnnotatedElement annotatedElementT = t();
        return (annotatedElementT == null || (declaredAnnotations = annotatedElementT.getDeclaredAnnotations()) == null || (listB = k.b(declaredAnnotations)) == null) ? AbstractC2800q.j() : listB;
    }
}
