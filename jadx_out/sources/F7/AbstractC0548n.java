package F7;

import R7.AbstractC1394f;
import com.facebook.react.uimanager.events.PointerEventHelper;
import j7.AbstractC2793j;
import j7.AbstractC2800q;
import j8.AbstractC2809d;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l7.AbstractC2884a;

/* JADX INFO: renamed from: F7.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0548n {

    /* JADX INFO: renamed from: F7.n$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends AbstractC0548n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class f2085a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f2086b;

        /* JADX INFO: renamed from: F7.n$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class C0044a implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC2884a.a(((Method) obj).getName(), ((Method) obj2).getName());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class jClass) {
            super(null);
            AbstractC2855l.g(jClass, "jClass");
            this.f2085a = jClass;
            Method[] declaredMethods = jClass.getDeclaredMethods();
            AbstractC2855l.f(declaredMethods, "getDeclaredMethods(...)");
            this.f2086b = AbstractC2793j.l0(declaredMethods, new C0044a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence c(Method method) {
            Class<?> returnType = method.getReturnType();
            AbstractC2855l.f(returnType, "getReturnType(...)");
            return AbstractC1394f.f(returnType);
        }

        @Override // F7.AbstractC0548n
        public String a() {
            return AbstractC2800q.o0(this.f2086b, PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>(", ")V", 0, null, C0546m.f2082g, 24, null);
        }

        public final List d() {
            return this.f2086b;
        }
    }

    /* JADX INFO: renamed from: F7.n$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b extends AbstractC0548n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Constructor f2087a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Constructor constructor) {
            super(null);
            AbstractC2855l.g(constructor, "constructor");
            this.f2087a = constructor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence c(Class cls) {
            AbstractC2855l.d(cls);
            return AbstractC1394f.f(cls);
        }

        @Override // F7.AbstractC0548n
        public String a() {
            Class<?>[] parameterTypes = this.f2087a.getParameterTypes();
            AbstractC2855l.f(parameterTypes, "getParameterTypes(...)");
            return AbstractC2793j.a0(parameterTypes, PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>(", ")V", 0, null, C0550o.f2094g, 24, null);
        }

        public final Constructor d() {
            return this.f2087a;
        }
    }

    /* JADX INFO: renamed from: F7.n$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class c extends AbstractC0548n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f2088a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Method method) {
            super(null);
            AbstractC2855l.g(method, "method");
            this.f2088a = method;
        }

        @Override // F7.AbstractC0548n
        public String a() {
            return h1.d(this.f2088a);
        }

        public final Method b() {
            return this.f2088a;
        }
    }

    /* JADX INFO: renamed from: F7.n$d */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class d extends AbstractC0548n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AbstractC2809d.b f2089a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f2090b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AbstractC2809d.b signature) {
            super(null);
            AbstractC2855l.g(signature, "signature");
            this.f2089a = signature;
            this.f2090b = signature.a();
        }

        @Override // F7.AbstractC0548n
        public String a() {
            return this.f2090b;
        }

        public final String b() {
            return this.f2089a.d();
        }
    }

    /* JADX INFO: renamed from: F7.n$e */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class e extends AbstractC0548n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AbstractC2809d.b f2091a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f2092b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AbstractC2809d.b signature) {
            super(null);
            AbstractC2855l.g(signature, "signature");
            this.f2091a = signature;
            this.f2092b = signature.a();
        }

        @Override // F7.AbstractC0548n
        public String a() {
            return this.f2092b;
        }

        public final String b() {
            return this.f2091a.d();
        }

        public final String c() {
            return this.f2091a.e();
        }
    }

    public /* synthetic */ AbstractC0548n(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String a();

    private AbstractC0548n() {
    }
}
