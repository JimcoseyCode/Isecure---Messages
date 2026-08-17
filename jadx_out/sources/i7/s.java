package I7;

import C8.J0;
import C8.S;
import L7.InterfaceC1283h;
import L7.InterfaceC1288m;
import L7.N;
import i7.t;
import j7.AbstractC2800q;
import j7.K;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f5253a = new s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set f5254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set f5255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final HashMap f5256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final HashMap f5257e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final HashMap f5258f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Set f5259g;

    static {
        r[] rVarArrValues = r.values();
        ArrayList arrayList = new ArrayList(rVarArrValues.length);
        for (r rVar : rVarArrValues) {
            arrayList.add(rVar.m());
        }
        f5254b = AbstractC2800q.T0(arrayList);
        q[] qVarArrValues = q.values();
        ArrayList arrayList2 = new ArrayList(qVarArrValues.length);
        for (q qVar : qVarArrValues) {
            arrayList2.add(qVar.j());
        }
        f5255c = AbstractC2800q.T0(arrayList2);
        f5256d = new HashMap();
        f5257e = new HashMap();
        f5258f = K.k(t.a(q.f5236i, k8.f.q("ubyteArrayOf")), t.a(q.f5237j, k8.f.q("ushortArrayOf")), t.a(q.f5238k, k8.f.q("uintArrayOf")), t.a(q.f5239l, k8.f.q("ulongArrayOf")));
        r[] rVarArrValues2 = r.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (r rVar2 : rVarArrValues2) {
            linkedHashSet.add(rVar2.j().h());
        }
        f5259g = linkedHashSet;
        for (r rVar3 : r.values()) {
            f5256d.put(rVar3.j(), rVar3.k());
            f5257e.put(rVar3.k(), rVar3.j());
        }
    }

    private s() {
    }

    public static final boolean d(S type) {
        InterfaceC1283h interfaceC1283hP;
        AbstractC2855l.g(type, "type");
        if (J0.w(type) || (interfaceC1283hP = type.K0().p()) == null) {
            return false;
        }
        return f5253a.c(interfaceC1283hP);
    }

    public final k8.b a(k8.b arrayClassId) {
        AbstractC2855l.g(arrayClassId, "arrayClassId");
        return (k8.b) f5256d.get(arrayClassId);
    }

    public final boolean b(k8.f name) {
        AbstractC2855l.g(name, "name");
        return f5259g.contains(name);
    }

    public final boolean c(InterfaceC1288m descriptor) {
        AbstractC2855l.g(descriptor, "descriptor");
        InterfaceC1288m interfaceC1288mB = descriptor.b();
        return (interfaceC1288mB instanceof N) && AbstractC2855l.b(((N) interfaceC1288mB).d(), o.f5108A) && f5254b.contains(descriptor.getName());
    }
}
