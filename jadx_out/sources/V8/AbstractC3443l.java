package v8;

import L7.InterfaceC1283h;
import L7.g0;
import j7.AbstractC2800q;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: v8.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3443l implements InterfaceC3442k {
    @Override // v8.InterfaceC3442k
    public Set a() {
        Collection collectionG = g(C3435d.f32974v, M8.j.k());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionG) {
            if (obj instanceof g0) {
                k8.f name = ((g0) obj).getName();
                AbstractC2855l.f(name, "getName(...)");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // v8.InterfaceC3442k
    public Collection b(k8.f name, T7.b location) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(location, "location");
        return AbstractC2800q.j();
    }

    @Override // v8.InterfaceC3442k
    public Set c() {
        Collection collectionG = g(C3435d.f32975w, M8.j.k());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionG) {
            if (obj instanceof g0) {
                k8.f name = ((g0) obj).getName();
                AbstractC2855l.f(name, "getName(...)");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // v8.InterfaceC3442k
    public Collection d(k8.f name, T7.b location) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(location, "location");
        return AbstractC2800q.j();
    }

    @Override // v8.InterfaceC3442k
    public Set e() {
        return null;
    }

    @Override // v8.InterfaceC3445n
    public InterfaceC1283h f(k8.f name, T7.b location) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(location, "location");
        return null;
    }

    @Override // v8.InterfaceC3445n
    public Collection g(C3435d kindFilter, Function1 nameFilter) {
        AbstractC2855l.g(kindFilter, "kindFilter");
        AbstractC2855l.g(nameFilter, "nameFilter");
        return AbstractC2800q.j();
    }
}
