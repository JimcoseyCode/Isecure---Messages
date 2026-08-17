package v8;

import C8.S;
import L7.InterfaceC1276a;
import L7.InterfaceC1288m;
import L7.Z;
import L7.g0;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o8.AbstractC3036r;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class x extends AbstractC3432a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f33014d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f33015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3442k f33016c;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC3442k a(String message, Collection types) {
            AbstractC2855l.g(message, "message");
            AbstractC2855l.g(types, "types");
            ArrayList arrayList = new ArrayList(AbstractC2800q.u(types, 10));
            Iterator it = types.iterator();
            while (it.hasNext()) {
                arrayList.add(((S) it.next()).o());
            }
            M8.k kVarB = L8.a.b(arrayList);
            InterfaceC3442k interfaceC3442kB = C3433b.f32949d.b(message, kVarB);
            return kVarB.size() <= 1 ? interfaceC3442kB : new x(message, interfaceC3442kB, null);
        }

        private a() {
        }
    }

    public /* synthetic */ x(String str, InterfaceC3442k interfaceC3442k, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, interfaceC3442k);
    }

    public static final InterfaceC3442k m(String str, Collection collection) {
        return f33014d.a(str, collection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC1276a n(InterfaceC1276a selectMostSpecificInEachOverridableGroup) {
        AbstractC2855l.g(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
        return selectMostSpecificInEachOverridableGroup;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC1276a o(g0 selectMostSpecificInEachOverridableGroup) {
        AbstractC2855l.g(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
        return selectMostSpecificInEachOverridableGroup;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC1276a p(Z selectMostSpecificInEachOverridableGroup) {
        AbstractC2855l.g(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
        return selectMostSpecificInEachOverridableGroup;
    }

    @Override // v8.AbstractC3432a, v8.InterfaceC3442k
    public Collection b(k8.f name, T7.b location) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(location, "location");
        return AbstractC3036r.b(super.b(name, location), C3452u.f33011g);
    }

    @Override // v8.AbstractC3432a, v8.InterfaceC3442k
    public Collection d(k8.f name, T7.b location) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(location, "location");
        return AbstractC3036r.b(super.d(name, location), v.f33012g);
    }

    @Override // v8.AbstractC3432a, v8.InterfaceC3445n
    public Collection g(C3435d kindFilter, Function1 nameFilter) {
        AbstractC2855l.g(kindFilter, "kindFilter");
        AbstractC2855l.g(nameFilter, "nameFilter");
        Collection collectionG = super.g(kindFilter, nameFilter);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : collectionG) {
            if (((InterfaceC1288m) obj) instanceof InterfaceC1276a) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List list = (List) pair.getFirst();
        List list2 = (List) pair.getSecond();
        AbstractC2855l.e(list, "null cannot be cast to non-null type kotlin.collections.Collection<org.jetbrains.kotlin.descriptors.CallableDescriptor>");
        return AbstractC2800q.z0(AbstractC3036r.b(list, w.f33013g), list2);
    }

    @Override // v8.AbstractC3432a
    protected InterfaceC3442k i() {
        return this.f33016c;
    }

    private x(String str, InterfaceC3442k interfaceC3442k) {
        this.f33015b = str;
        this.f33016c = interfaceC3442k;
    }
}
