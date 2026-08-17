package v8;

import L7.D;
import L7.InterfaceC1283h;
import L7.InterfaceC1284i;
import j7.AbstractC2793j;
import j7.AbstractC2800q;
import j7.T;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v8.InterfaceC3442k;

/* JADX INFO: renamed from: v8.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3433b implements InterfaceC3442k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f32949d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3442k[] f32951c;

    /* JADX INFO: renamed from: v8.b$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC3442k a(String debugName, Iterable scopes) {
            AbstractC2855l.g(debugName, "debugName");
            AbstractC2855l.g(scopes, "scopes");
            M8.k kVar = new M8.k();
            Iterator it = scopes.iterator();
            while (it.hasNext()) {
                InterfaceC3442k interfaceC3442k = (InterfaceC3442k) it.next();
                if (interfaceC3442k != InterfaceC3442k.b.f32996b) {
                    if (interfaceC3442k instanceof C3433b) {
                        AbstractC2800q.B(kVar, ((C3433b) interfaceC3442k).f32951c);
                    } else {
                        kVar.add(interfaceC3442k);
                    }
                }
            }
            return b(debugName, kVar);
        }

        public final InterfaceC3442k b(String debugName, List scopes) {
            AbstractC2855l.g(debugName, "debugName");
            AbstractC2855l.g(scopes, "scopes");
            int size = scopes.size();
            return size != 0 ? size != 1 ? new C3433b(debugName, (InterfaceC3442k[]) scopes.toArray(new InterfaceC3442k[0]), null) : (InterfaceC3442k) scopes.get(0) : InterfaceC3442k.b.f32996b;
        }

        private a() {
        }
    }

    public /* synthetic */ C3433b(String str, InterfaceC3442k[] interfaceC3442kArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, interfaceC3442kArr);
    }

    @Override // v8.InterfaceC3442k
    public Set a() {
        InterfaceC3442k[] interfaceC3442kArr = this.f32951c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC3442k interfaceC3442k : interfaceC3442kArr) {
            AbstractC2800q.A(linkedHashSet, interfaceC3442k.a());
        }
        return linkedHashSet;
    }

    @Override // v8.InterfaceC3442k
    public Collection b(k8.f name, T7.b location) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(location, "location");
        InterfaceC3442k[] interfaceC3442kArr = this.f32951c;
        int length = interfaceC3442kArr.length;
        if (length == 0) {
            return AbstractC2800q.j();
        }
        if (length == 1) {
            return interfaceC3442kArr[0].b(name, location);
        }
        Collection collectionA = null;
        for (InterfaceC3442k interfaceC3442k : interfaceC3442kArr) {
            collectionA = L8.a.a(collectionA, interfaceC3442k.b(name, location));
        }
        return collectionA == null ? T.e() : collectionA;
    }

    @Override // v8.InterfaceC3442k
    public Set c() {
        InterfaceC3442k[] interfaceC3442kArr = this.f32951c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC3442k interfaceC3442k : interfaceC3442kArr) {
            AbstractC2800q.A(linkedHashSet, interfaceC3442k.c());
        }
        return linkedHashSet;
    }

    @Override // v8.InterfaceC3442k
    public Collection d(k8.f name, T7.b location) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(location, "location");
        InterfaceC3442k[] interfaceC3442kArr = this.f32951c;
        int length = interfaceC3442kArr.length;
        if (length == 0) {
            return AbstractC2800q.j();
        }
        if (length == 1) {
            return interfaceC3442kArr[0].d(name, location);
        }
        Collection collectionA = null;
        for (InterfaceC3442k interfaceC3442k : interfaceC3442kArr) {
            collectionA = L8.a.a(collectionA, interfaceC3442k.d(name, location));
        }
        return collectionA == null ? T.e() : collectionA;
    }

    @Override // v8.InterfaceC3442k
    public Set e() {
        return AbstractC3444m.a(AbstractC2793j.x(this.f32951c));
    }

    @Override // v8.InterfaceC3445n
    public InterfaceC1283h f(k8.f name, T7.b location) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(location, "location");
        InterfaceC1283h interfaceC1283h = null;
        for (InterfaceC3442k interfaceC3442k : this.f32951c) {
            InterfaceC1283h interfaceC1283hF = interfaceC3442k.f(name, location);
            if (interfaceC1283hF != null) {
                if (!(interfaceC1283hF instanceof InterfaceC1284i) || !((D) interfaceC1283hF).J()) {
                    return interfaceC1283hF;
                }
                if (interfaceC1283h == null) {
                    interfaceC1283h = interfaceC1283hF;
                }
            }
        }
        return interfaceC1283h;
    }

    @Override // v8.InterfaceC3445n
    public Collection g(C3435d kindFilter, Function1 nameFilter) {
        AbstractC2855l.g(kindFilter, "kindFilter");
        AbstractC2855l.g(nameFilter, "nameFilter");
        InterfaceC3442k[] interfaceC3442kArr = this.f32951c;
        int length = interfaceC3442kArr.length;
        if (length == 0) {
            return AbstractC2800q.j();
        }
        if (length == 1) {
            return interfaceC3442kArr[0].g(kindFilter, nameFilter);
        }
        Collection collectionA = null;
        for (InterfaceC3442k interfaceC3442k : interfaceC3442kArr) {
            collectionA = L8.a.a(collectionA, interfaceC3442k.g(kindFilter, nameFilter));
        }
        return collectionA == null ? T.e() : collectionA;
    }

    public String toString() {
        return this.f32950b;
    }

    private C3433b(String str, InterfaceC3442k[] interfaceC3442kArr) {
        this.f32950b = str;
        this.f32951c = interfaceC3442kArr;
    }
}
