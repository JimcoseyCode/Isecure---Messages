package v8;

import L7.InterfaceC1280e;
import L7.InterfaceC1283h;
import L7.InterfaceC1284i;
import L7.l0;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: v8.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3438g extends AbstractC3443l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3442k f32989b;

    public C3438g(InterfaceC3442k workerScope) {
        AbstractC2855l.g(workerScope, "workerScope");
        this.f32989b = workerScope;
    }

    @Override // v8.AbstractC3443l, v8.InterfaceC3442k
    public Set a() {
        return this.f32989b.a();
    }

    @Override // v8.AbstractC3443l, v8.InterfaceC3442k
    public Set c() {
        return this.f32989b.c();
    }

    @Override // v8.AbstractC3443l, v8.InterfaceC3442k
    public Set e() {
        return this.f32989b.e();
    }

    @Override // v8.AbstractC3443l, v8.InterfaceC3445n
    public InterfaceC1283h f(k8.f name, T7.b location) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(location, "location");
        InterfaceC1283h interfaceC1283hF = this.f32989b.f(name, location);
        if (interfaceC1283hF != null) {
            InterfaceC1280e interfaceC1280e = interfaceC1283hF instanceof InterfaceC1280e ? (InterfaceC1280e) interfaceC1283hF : null;
            if (interfaceC1280e != null) {
                return interfaceC1280e;
            }
            if (interfaceC1283hF instanceof l0) {
                return (l0) interfaceC1283hF;
            }
        }
        return null;
    }

    @Override // v8.AbstractC3443l, v8.InterfaceC3445n
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public List g(C3435d kindFilter, Function1 nameFilter) {
        AbstractC2855l.g(kindFilter, "kindFilter");
        AbstractC2855l.g(nameFilter, "nameFilter");
        C3435d c3435dN = kindFilter.n(C3435d.f32955c.c());
        if (c3435dN == null) {
            return AbstractC2800q.j();
        }
        Collection collectionG = this.f32989b.g(c3435dN, nameFilter);
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionG) {
            if (obj instanceof InterfaceC1284i) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public String toString() {
        return "Classes from " + this.f32989b;
    }
}
