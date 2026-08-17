package R7;

import R7.E;
import b8.InterfaceC1822f;
import j7.AbstractC2800q;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class m extends E implements InterfaceC1822f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Type f10086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final E f10087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Collection f10088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f10089e;

    public m(Type reflectType) {
        E eA;
        AbstractC2855l.g(reflectType, "reflectType");
        this.f10086b = reflectType;
        Type typeN = N();
        if (!(typeN instanceof GenericArrayType)) {
            if (typeN instanceof Class) {
                Class cls = (Class) typeN;
                if (cls.isArray()) {
                    E.a aVar = E.f10052a;
                    Class<?> componentType = cls.getComponentType();
                    AbstractC2855l.f(componentType, "getComponentType(...)");
                    eA = aVar.a(componentType);
                }
            }
            throw new IllegalArgumentException("Not an array type (" + N().getClass() + "): " + N());
        }
        E.a aVar2 = E.f10052a;
        Type genericComponentType = ((GenericArrayType) typeN).getGenericComponentType();
        AbstractC2855l.f(genericComponentType, "getGenericComponentType(...)");
        eA = aVar2.a(genericComponentType);
        this.f10087c = eA;
        this.f10088d = AbstractC2800q.j();
    }

    @Override // R7.E
    protected Type N() {
        return this.f10086b;
    }

    @Override // b8.InterfaceC1822f
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public E l() {
        return this.f10087c;
    }

    @Override // b8.InterfaceC1820d
    public Collection getAnnotations() {
        return this.f10088d;
    }

    @Override // b8.InterfaceC1820d
    public boolean k() {
        return this.f10089e;
    }
}
