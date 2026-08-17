package R7;

import R7.E;
import b8.InterfaceC1817a;
import b8.InterfaceC1825i;
import b8.InterfaceC1826j;
import j7.AbstractC2800q;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class s extends E implements InterfaceC1826j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Type f10100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC1825i f10101c;

    public s(Type reflectType) {
        InterfaceC1825i qVar;
        AbstractC2855l.g(reflectType, "reflectType");
        this.f10100b = reflectType;
        Type typeN = N();
        if (typeN instanceof Class) {
            qVar = new q((Class) typeN);
        } else if (typeN instanceof TypeVariable) {
            qVar = new F((TypeVariable) typeN);
        } else {
            if (!(typeN instanceof ParameterizedType)) {
                throw new IllegalStateException("Not a classifier type (" + typeN.getClass() + "): " + typeN);
            }
            Type rawType = ((ParameterizedType) typeN).getRawType();
            AbstractC2855l.e(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            qVar = new q((Class) rawType);
        }
        this.f10101c = qVar;
    }

    @Override // b8.InterfaceC1826j
    public List B() {
        List listH = AbstractC1394f.h(N());
        E.a aVar = E.f10052a;
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(listH, 10));
        Iterator it = listH.iterator();
        while (it.hasNext()) {
            arrayList.add(aVar.a((Type) it.next()));
        }
        return arrayList;
    }

    @Override // R7.E
    public Type N() {
        return this.f10100b;
    }

    @Override // R7.E, b8.InterfaceC1820d
    public InterfaceC1817a b(k8.c fqName) {
        AbstractC2855l.g(fqName, "fqName");
        return null;
    }

    @Override // b8.InterfaceC1820d
    public Collection getAnnotations() {
        return AbstractC2800q.j();
    }

    @Override // b8.InterfaceC1826j
    public InterfaceC1825i getClassifier() {
        return this.f10101c;
    }

    @Override // b8.InterfaceC1820d
    public boolean k() {
        return false;
    }

    @Override // b8.InterfaceC1826j
    public String m() {
        return N().toString();
    }

    @Override // b8.InterfaceC1826j
    public boolean u() {
        Type typeN = N();
        if (typeN instanceof Class) {
            TypeVariable[] typeParameters = ((Class) typeN).getTypeParameters();
            AbstractC2855l.f(typeParameters, "getTypeParameters(...)");
            if (!(typeParameters.length == 0)) {
                return true;
            }
        }
        return false;
    }

    @Override // b8.InterfaceC1826j
    public String v() {
        throw new UnsupportedOperationException("Type not found: " + N());
    }
}
