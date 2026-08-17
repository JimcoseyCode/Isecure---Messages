package R7;

import b8.InterfaceC1817a;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class E implements b8.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f10052a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final E a(Type type) {
            AbstractC2855l.g(type, "type");
            boolean z10 = type instanceof Class;
            if (z10) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new C(cls);
                }
            }
            return ((type instanceof GenericArrayType) || (z10 && ((Class) type).isArray())) ? new m(type) : type instanceof WildcardType ? new H((WildcardType) type) : new s(type);
        }

        private a() {
        }
    }

    protected abstract Type N();

    @Override // b8.InterfaceC1820d
    public InterfaceC1817a b(k8.c fqName) {
        Object obj;
        AbstractC2855l.g(fqName, "fqName");
        Iterator it = getAnnotations().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            k8.b bVarC = ((InterfaceC1817a) next).c();
            if (AbstractC2855l.b(bVarC != null ? bVarC.a() : null, fqName)) {
                obj = next;
                break;
            }
        }
        return (InterfaceC1817a) obj;
    }

    public boolean equals(Object obj) {
        return (obj instanceof E) && AbstractC2855l.b(N(), ((E) obj).N());
    }

    public int hashCode() {
        return N().hashCode();
    }

    public String toString() {
        return getClass().getName() + ": " + N();
    }
}
