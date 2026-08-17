package G7;

import G7.h;
import i7.C2735B;
import j7.AbstractC2793j;
import j7.AbstractC2800q;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.G;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class i implements G7.h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f3507e = new d(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Member f3508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Type f3509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Class f3510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f3511d;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends i implements G7.g {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Object f3512f;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(Constructor constructor, Object obj) {
            AbstractC2855l.g(constructor, "constructor");
            Class declaringClass = constructor.getDeclaringClass();
            AbstractC2855l.f(declaringClass, "getDeclaringClass(...)");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            AbstractC2855l.f(genericParameterTypes, "getGenericParameterTypes(...)");
            super(constructor, declaringClass, null, (Type[]) (genericParameterTypes.length <= 2 ? new Type[0] : AbstractC2793j.n(genericParameterTypes, 1, genericParameterTypes.length - 1)), null);
            this.f3512f = obj;
        }

        @Override // G7.h
        public Object call(Object[] args) {
            AbstractC2855l.g(args, "args");
            c(args);
            Constructor constructor = (Constructor) b();
            G g10 = new G(3);
            g10.a(this.f3512f);
            g10.b(args);
            g10.a(null);
            return constructor.newInstance(g10.d(new Object[g10.c()]));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b extends i {
        /* JADX WARN: Illegal instructions before constructor call */
        public b(Constructor constructor) {
            AbstractC2855l.g(constructor, "constructor");
            Class declaringClass = constructor.getDeclaringClass();
            AbstractC2855l.f(declaringClass, "getDeclaringClass(...)");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            AbstractC2855l.f(genericParameterTypes, "getGenericParameterTypes(...)");
            super(constructor, declaringClass, null, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : AbstractC2793j.n(genericParameterTypes, 0, genericParameterTypes.length - 1)), null);
        }

        @Override // G7.h
        public Object call(Object[] args) {
            AbstractC2855l.g(args, "args");
            c(args);
            Constructor constructor = (Constructor) b();
            G g10 = new G(2);
            g10.b(args);
            g10.a(null);
            return constructor.newInstance(g10.d(new Object[g10.c()]));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class c extends i implements G7.g {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Object f3513f;

        /* JADX WARN: Illegal instructions before constructor call */
        public c(Constructor constructor, Object obj) {
            AbstractC2855l.g(constructor, "constructor");
            Class declaringClass = constructor.getDeclaringClass();
            AbstractC2855l.f(declaringClass, "getDeclaringClass(...)");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            AbstractC2855l.f(genericParameterTypes, "getGenericParameterTypes(...)");
            super(constructor, declaringClass, null, genericParameterTypes, null);
            this.f3513f = obj;
        }

        @Override // G7.h
        public Object call(Object[] args) {
            AbstractC2855l.g(args, "args");
            c(args);
            Constructor constructor = (Constructor) b();
            G g10 = new G(2);
            g10.a(this.f3513f);
            g10.b(args);
            return constructor.newInstance(g10.d(new Object[g10.c()]));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class e extends i {
        /* JADX WARN: Illegal instructions before constructor call */
        public e(Constructor constructor) {
            AbstractC2855l.g(constructor, "constructor");
            Class declaringClass = constructor.getDeclaringClass();
            AbstractC2855l.f(declaringClass, "getDeclaringClass(...)");
            Class declaringClass2 = constructor.getDeclaringClass();
            Class<?> declaringClass3 = declaringClass2.getDeclaringClass();
            Class<?> cls = (declaringClass3 == null || Modifier.isStatic(declaringClass2.getModifiers())) ? null : declaringClass3;
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            AbstractC2855l.f(genericParameterTypes, "getGenericParameterTypes(...)");
            super(constructor, declaringClass, cls, genericParameterTypes, null);
        }

        @Override // G7.h
        public Object call(Object[] args) {
            AbstractC2855l.g(args, "args");
            c(args);
            return ((Constructor) b()).newInstance(Arrays.copyOf(args, args.length));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class f extends i {

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class a extends f implements G7.g {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private final Object f3514f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Field field, Object obj) {
                super(field, false, null);
                AbstractC2855l.g(field, "field");
                this.f3514f = obj;
            }

            @Override // G7.i.f, G7.h
            public Object call(Object[] args) {
                AbstractC2855l.g(args, "args");
                c(args);
                return ((Field) b()).get(this.f3514f);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class b extends f implements G7.g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Field field) {
                super(field, false, null);
                AbstractC2855l.g(field, "field");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class c extends f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Field field) {
                super(field, true, null);
                AbstractC2855l.g(field, "field");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class d extends f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Field field) {
                super(field, true, null);
                AbstractC2855l.g(field, "field");
            }

            @Override // G7.i
            public void c(Object[] args) {
                AbstractC2855l.g(args, "args");
                super.c(args);
                d(AbstractC2793j.G(args));
            }
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class e extends f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Field field) {
                super(field, false, null);
                AbstractC2855l.g(field, "field");
            }
        }

        public /* synthetic */ f(Field field, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
            this(field, z10);
        }

        @Override // G7.h
        public Object call(Object[] args) {
            AbstractC2855l.g(args, "args");
            c(args);
            return ((Field) b()).get(e() != null ? AbstractC2793j.F(args) : null);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private f(Field field, boolean z10) {
            Type genericType = field.getGenericType();
            AbstractC2855l.f(genericType, "getGenericType(...)");
            super(field, genericType, z10 ? field.getDeclaringClass() : null, new Type[0], null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class g extends i {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f3515f;

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class a extends g implements G7.g {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private final Object f3516g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Field field, boolean z10, Object obj) {
                super(field, z10, false, null);
                AbstractC2855l.g(field, "field");
                this.f3516g = obj;
            }

            @Override // G7.i.g, G7.h
            public Object call(Object[] args) throws IllegalAccessException {
                AbstractC2855l.g(args, "args");
                c(args);
                ((Field) b()).set(this.f3516g, AbstractC2793j.F(args));
                return C2735B.f28704a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class b extends g implements G7.g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Field field, boolean z10) {
                super(field, z10, false, null);
                AbstractC2855l.g(field, "field");
            }

            @Override // G7.i.g, G7.h
            public Object call(Object[] args) throws IllegalAccessException {
                AbstractC2855l.g(args, "args");
                c(args);
                ((Field) b()).set(null, AbstractC2793j.b0(args));
                return C2735B.f28704a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class c extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Field field, boolean z10) {
                super(field, z10, true, null);
                AbstractC2855l.g(field, "field");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class d extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Field field, boolean z10) {
                super(field, z10, true, null);
                AbstractC2855l.g(field, "field");
            }

            @Override // G7.i.g, G7.i
            public void c(Object[] args) {
                AbstractC2855l.g(args, "args");
                super.c(args);
                d(AbstractC2793j.G(args));
            }
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class e extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Field field, boolean z10) {
                super(field, z10, false, null);
                AbstractC2855l.g(field, "field");
            }
        }

        public /* synthetic */ g(Field field, boolean z10, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
            this(field, z10, z11);
        }

        @Override // G7.i
        public void c(Object[] args) {
            AbstractC2855l.g(args, "args");
            super.c(args);
            if (this.f3515f && AbstractC2793j.b0(args) == null) {
                throw new IllegalArgumentException("null is not allowed as a value for this property.");
            }
        }

        @Override // G7.h
        public Object call(Object[] args) throws IllegalAccessException {
            AbstractC2855l.g(args, "args");
            c(args);
            ((Field) b()).set(e() != null ? AbstractC2793j.F(args) : null, AbstractC2793j.b0(args));
            return C2735B.f28704a;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private g(Field field, boolean z10, boolean z11) {
            Class TYPE = Void.TYPE;
            AbstractC2855l.f(TYPE, "TYPE");
            super(field, TYPE, z11 ? field.getDeclaringClass() : null, new Type[]{field.getGenericType()}, null);
            this.f3515f = z10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class h extends i {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f3517f;

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class a extends h implements G7.g {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private final Object f3518g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Method method, Object obj) {
                super(method, false, null, 4, null);
                AbstractC2855l.g(method, "method");
                this.f3518g = obj;
            }

            @Override // G7.h
            public Object call(Object[] args) {
                AbstractC2855l.g(args, "args");
                c(args);
                return f(this.f3518g, args);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class b extends h implements G7.g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Method method) {
                super(method, false, null, 4, null);
                AbstractC2855l.g(method, "method");
            }

            @Override // G7.h
            public Object call(Object[] args) {
                AbstractC2855l.g(args, "args");
                c(args);
                return f(null, args);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class c extends h implements G7.g {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private final Object f3519g;

            /* JADX WARN: Illegal instructions before constructor call */
            public c(Method method, Object obj) {
                AbstractC2855l.g(method, "method");
                Type[] genericParameterTypes = method.getGenericParameterTypes();
                AbstractC2855l.f(genericParameterTypes, "getGenericParameterTypes(...)");
                super(method, false, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : AbstractC2793j.n(genericParameterTypes, 1, genericParameterTypes.length)), null);
                this.f3519g = obj;
            }

            @Override // G7.h
            public Object call(Object[] args) {
                AbstractC2855l.g(args, "args");
                c(args);
                G g10 = new G(2);
                g10.a(this.f3519g);
                g10.b(args);
                return f(null, g10.d(new Object[g10.c()]));
            }

            public final Object g() {
                return this.f3519g;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class d extends h implements G7.g {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private final Object[] f3520g;

            /* JADX WARN: Illegal instructions before constructor call */
            public d(Method method, Object[] boundReceiverComponents) {
                AbstractC2855l.g(method, "method");
                AbstractC2855l.g(boundReceiverComponents, "boundReceiverComponents");
                Type[] genericParameterTypes = method.getGenericParameterTypes();
                AbstractC2855l.f(genericParameterTypes, "getGenericParameterTypes(...)");
                super(method, false, (Type[]) AbstractC2793j.C(genericParameterTypes, boundReceiverComponents.length).toArray(new Type[0]), null);
                this.f3520g = boundReceiverComponents;
            }

            @Override // G7.h
            public Object call(Object[] args) {
                AbstractC2855l.g(args, "args");
                c(args);
                G g10 = new G(2);
                g10.b(this.f3520g);
                g10.b(args);
                return f(null, g10.d(new Object[g10.c()]));
            }

            public final Object[] g() {
                return this.f3520g;
            }

            public final int h() {
                return this.f3520g.length;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class e extends h {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Method method) {
                super(method, false, null, 6, null);
                AbstractC2855l.g(method, "method");
            }

            @Override // G7.h
            public Object call(Object[] args) {
                AbstractC2855l.g(args, "args");
                c(args);
                return f(args[0], args.length <= 1 ? new Object[0] : AbstractC2793j.n(args, 1, args.length));
            }
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class f extends h {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(Method method) {
                super(method, true, null, 4, null);
                AbstractC2855l.g(method, "method");
            }

            @Override // G7.h
            public Object call(Object[] args) {
                AbstractC2855l.g(args, "args");
                c(args);
                d(AbstractC2793j.G(args));
                return f(null, args.length <= 1 ? new Object[0] : AbstractC2793j.n(args, 1, args.length));
            }
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class g extends h {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(Method method) {
                super(method, false, null, 6, null);
                AbstractC2855l.g(method, "method");
            }

            @Override // G7.h
            public Object call(Object[] args) {
                AbstractC2855l.g(args, "args");
                c(args);
                return f(null, args);
            }
        }

        public /* synthetic */ h(Method method, boolean z10, Type[] typeArr, DefaultConstructorMarker defaultConstructorMarker) {
            this(method, z10, typeArr);
        }

        protected final Object f(Object obj, Object[] args) {
            AbstractC2855l.g(args, "args");
            return this.f3517f ? C2735B.f28704a : ((Method) b()).invoke(obj, Arrays.copyOf(args, args.length));
        }

        public /* synthetic */ h(Method method, boolean z10, Type[] typeArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(method, (i10 & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z10, (i10 & 4) != 0 ? method.getGenericParameterTypes() : typeArr, null);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private h(Method method, boolean z10, Type[] typeArr) {
            Type genericReturnType = method.getGenericReturnType();
            AbstractC2855l.f(genericReturnType, "getGenericReturnType(...)");
            super(method, genericReturnType, z10 ? method.getDeclaringClass() : null, typeArr, null);
            this.f3517f = AbstractC2855l.b(getReturnType(), Void.TYPE);
        }
    }

    public /* synthetic */ i(Member member, Type type, Class cls, Type[] typeArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(member, type, cls, typeArr);
    }

    @Override // G7.h
    public List a() {
        return this.f3511d;
    }

    @Override // G7.h
    public final Member b() {
        return this.f3508a;
    }

    public void c(Object[] objArr) {
        h.a.a(this, objArr);
    }

    protected final void d(Object obj) {
        if (obj == null || !this.f3508a.getDeclaringClass().isInstance(obj)) {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    public final Class e() {
        return this.f3510c;
    }

    @Override // G7.h
    public final Type getReturnType() {
        return this.f3509b;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private i(Member member, Type type, Class cls, Type[] typeArr) {
        List listV0;
        this.f3508a = member;
        this.f3509b = type;
        this.f3510c = cls;
        if (cls != null) {
            G g10 = new G(2);
            g10.a(cls);
            g10.b(typeArr);
            listV0 = AbstractC2800q.m(g10.d(new Type[g10.c()]));
            listV0 = listV0 == null ? AbstractC2793j.v0(typeArr) : listV0;
        }
        this.f3511d = listV0;
    }
}
