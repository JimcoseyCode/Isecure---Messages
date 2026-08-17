package v8;

import C8.S;
import L7.InterfaceC1277b;
import L7.InterfaceC1280e;
import L7.InterfaceC1300z;
import L7.Z;
import L7.g0;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import o8.AbstractC3031m;
import o8.C3033o;
import v8.InterfaceC3445n;

/* JADX INFO: renamed from: v8.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3437f extends AbstractC3443l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final /* synthetic */ C7.k[] f32984d = {D.k(new kotlin.jvm.internal.v(D.b(AbstractC3437f.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1280e f32985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final B8.i f32986c;

    /* JADX INFO: renamed from: v8.f$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends AbstractC3031m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f32987a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC3437f f32988b;

        a(ArrayList arrayList, AbstractC3437f abstractC3437f) {
            this.f32987a = arrayList;
            this.f32988b = abstractC3437f;
        }

        @Override // o8.AbstractC3032n
        public void a(InterfaceC1277b fakeOverride) {
            AbstractC2855l.g(fakeOverride, "fakeOverride");
            C3033o.K(fakeOverride, null);
            this.f32987a.add(fakeOverride);
        }

        @Override // o8.AbstractC3031m
        protected void e(InterfaceC1277b fromSuper, InterfaceC1277b fromCurrent) {
            AbstractC2855l.g(fromSuper, "fromSuper");
            AbstractC2855l.g(fromCurrent, "fromCurrent");
            throw new IllegalStateException(("Conflict in scope of " + this.f32988b.m() + ": " + fromSuper + " vs " + fromCurrent).toString());
        }
    }

    public AbstractC3437f(B8.n storageManager, InterfaceC1280e containingClass) {
        AbstractC2855l.g(storageManager, "storageManager");
        AbstractC2855l.g(containingClass, "containingClass");
        this.f32985b = containingClass;
        this.f32986c = storageManager.e(new C3436e(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List i(AbstractC3437f abstractC3437f) {
        List listJ = abstractC3437f.j();
        return AbstractC2800q.z0(listJ, abstractC3437f.k(listJ));
    }

    private final List k(List list) {
        Collection collectionJ;
        ArrayList arrayList = new ArrayList(3);
        Collection collectionG = this.f32985b.j().g();
        AbstractC2855l.f(collectionG, "getSupertypes(...)");
        ArrayList arrayList2 = new ArrayList();
        Iterator it = collectionG.iterator();
        while (it.hasNext()) {
            AbstractC2800q.A(arrayList2, InterfaceC3445n.a.a(((S) it.next()).o(), null, null, 3, null));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (obj instanceof InterfaceC1277b) {
                arrayList3.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList3) {
            k8.f name = ((InterfaceC1277b) obj2).getName();
            Object arrayList4 = linkedHashMap.get(name);
            if (arrayList4 == null) {
                arrayList4 = new ArrayList();
                linkedHashMap.put(name, arrayList4);
            }
            ((List) arrayList4).add(obj2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            AbstractC2855l.f(key, "component1(...)");
            k8.f fVar = (k8.f) key;
            List list2 = (List) entry.getValue();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj3 : list2) {
                Boolean boolValueOf = Boolean.valueOf(((InterfaceC1277b) obj3) instanceof InterfaceC1300z);
                Object arrayList5 = linkedHashMap2.get(boolValueOf);
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                    linkedHashMap2.put(boolValueOf, arrayList5);
                }
                ((List) arrayList5).add(obj3);
            }
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                boolean zBooleanValue = ((Boolean) entry2.getKey()).booleanValue();
                List list3 = (List) entry2.getValue();
                C3033o c3033o = C3033o.f30533f;
                if (zBooleanValue) {
                    collectionJ = new ArrayList();
                    for (Object obj4 : list) {
                        if (AbstractC2855l.b(((InterfaceC1300z) obj4).getName(), fVar)) {
                            collectionJ.add(obj4);
                        }
                    }
                } else {
                    collectionJ = AbstractC2800q.j();
                }
                c3033o.v(fVar, list3, collectionJ, this.f32985b, new a(arrayList, this));
            }
        }
        return M8.a.c(arrayList);
    }

    private final List l() {
        return (List) B8.m.a(this.f32986c, this, f32984d[0]);
    }

    @Override // v8.AbstractC3443l, v8.InterfaceC3442k
    public Collection b(k8.f name, T7.b location) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(location, "location");
        List listL = l();
        if (listL.isEmpty()) {
            return AbstractC2800q.j();
        }
        M8.k kVar = new M8.k();
        for (Object obj : listL) {
            if ((obj instanceof g0) && AbstractC2855l.b(((g0) obj).getName(), name)) {
                kVar.add(obj);
            }
        }
        return kVar;
    }

    @Override // v8.AbstractC3443l, v8.InterfaceC3442k
    public Collection d(k8.f name, T7.b location) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(location, "location");
        List listL = l();
        if (listL.isEmpty()) {
            return AbstractC2800q.j();
        }
        M8.k kVar = new M8.k();
        for (Object obj : listL) {
            if ((obj instanceof Z) && AbstractC2855l.b(((Z) obj).getName(), name)) {
                kVar.add(obj);
            }
        }
        return kVar;
    }

    @Override // v8.AbstractC3443l, v8.InterfaceC3445n
    public Collection g(C3435d kindFilter, Function1 nameFilter) {
        AbstractC2855l.g(kindFilter, "kindFilter");
        AbstractC2855l.g(nameFilter, "nameFilter");
        return !kindFilter.a(C3435d.f32968p.m()) ? AbstractC2800q.j() : l();
    }

    protected abstract List j();

    protected final InterfaceC1280e m() {
        return this.f32985b;
    }
}
