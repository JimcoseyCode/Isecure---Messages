package G7;

import G7.h;
import G7.i;
import j7.AbstractC2793j;
import j7.AbstractC2800q;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class k implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Method f3521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f3522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Type f3523c;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends k implements g {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Object f3524d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Method unboxMethod, Object obj) {
            super(unboxMethod, AbstractC2800q.j(), null);
            AbstractC2855l.g(unboxMethod, "unboxMethod");
            this.f3524d = obj;
        }

        @Override // G7.h
        public Object call(Object[] args) {
            AbstractC2855l.g(args, "args");
            d(args);
            return c(this.f3524d, args);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b extends k {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Method unboxMethod) {
            super(unboxMethod, AbstractC2800q.e(unboxMethod.getDeclaringClass()), null);
            AbstractC2855l.g(unboxMethod, "unboxMethod");
        }

        @Override // G7.h
        public Object call(Object[] args) {
            AbstractC2855l.g(args, "args");
            d(args);
            Object obj = args[0];
            i.d dVar = i.f3507e;
            return c(obj, args.length <= 1 ? new Object[0] : AbstractC2793j.n(args, 1, args.length));
        }
    }

    public /* synthetic */ k(Method method, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(method, list);
    }

    @Override // G7.h
    public final List a() {
        return this.f3522b;
    }

    protected final Object c(Object obj, Object[] args) {
        AbstractC2855l.g(args, "args");
        return this.f3521a.invoke(obj, Arrays.copyOf(args, args.length));
    }

    public void d(Object[] objArr) {
        h.a.a(this, objArr);
    }

    @Override // G7.h
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Method b() {
        return null;
    }

    @Override // G7.h
    public final Type getReturnType() {
        return this.f3523c;
    }

    private k(Method method, List list) {
        this.f3521a = method;
        this.f3522b = list;
        Class<?> returnType = method.getReturnType();
        AbstractC2855l.f(returnType, "getReturnType(...)");
        this.f3523c = returnType;
    }
}
