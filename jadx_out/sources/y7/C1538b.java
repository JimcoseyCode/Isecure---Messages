package Y7;

import b8.InterfaceC1823g;
import b8.InterfaceC1830n;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: Y7.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class C1538b implements InterfaceC1539c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1823g f13022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f13023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function1 f13024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f13025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f13026e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f13027f;

    public C1538b(InterfaceC1823g jClass, Function1 memberFilter) {
        AbstractC2855l.g(jClass, "jClass");
        AbstractC2855l.g(memberFilter, "memberFilter");
        this.f13022a = jClass;
        this.f13023b = memberFilter;
        C1537a c1537a = new C1537a(this);
        this.f13024c = c1537a;
        O8.i iVarY = O8.l.y(AbstractC2800q.V(jClass.I()), c1537a);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : iVarY) {
            k8.f name = ((b8.r) obj).getName();
            Object arrayList = linkedHashMap.get(name);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(name, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.f13025d = linkedHashMap;
        O8.i iVarY2 = O8.l.y(AbstractC2800q.V(this.f13022a.z()), this.f13023b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj2 : iVarY2) {
            linkedHashMap2.put(((InterfaceC1830n) obj2).getName(), obj2);
        }
        this.f13026e = linkedHashMap2;
        Collection collectionJ = this.f13022a.j();
        Function1 function1 = this.f13023b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : collectionJ) {
            if (((Boolean) function1.invoke(obj3)).booleanValue()) {
                arrayList2.add(obj3);
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(B7.d.d(j7.K.e(AbstractC2800q.u(arrayList2, 10)), 16));
        for (Object obj4 : arrayList2) {
            linkedHashMap3.put(((b8.w) obj4).getName(), obj4);
        }
        this.f13027f = linkedHashMap3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(C1538b c1538b, b8.r m10) {
        AbstractC2855l.g(m10, "m");
        return ((Boolean) c1538b.f13023b.invoke(m10)).booleanValue() && !b8.p.c(m10);
    }

    @Override // Y7.InterfaceC1539c
    public b8.w a(k8.f name) {
        AbstractC2855l.g(name, "name");
        return (b8.w) this.f13027f.get(name);
    }

    @Override // Y7.InterfaceC1539c
    public Set b() {
        O8.i iVarY = O8.l.y(AbstractC2800q.V(this.f13022a.I()), this.f13024c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = iVarY.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((b8.r) it.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // Y7.InterfaceC1539c
    public InterfaceC1830n c(k8.f name) {
        AbstractC2855l.g(name, "name");
        return (InterfaceC1830n) this.f13026e.get(name);
    }

    @Override // Y7.InterfaceC1539c
    public Set d() {
        return this.f13027f.keySet();
    }

    @Override // Y7.InterfaceC1539c
    public Set e() {
        O8.i iVarY = O8.l.y(AbstractC2800q.V(this.f13022a.z()), this.f13023b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = iVarY.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((InterfaceC1830n) it.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // Y7.InterfaceC1539c
    public Collection f(k8.f name) {
        AbstractC2855l.g(name, "name");
        List list = (List) this.f13025d.get(name);
        return list != null ? list : AbstractC2800q.j();
    }
}
