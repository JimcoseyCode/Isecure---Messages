package A8;

import L7.InterfaceC1283h;
import h8.AbstractC2708a;
import h8.InterfaceC2710c;
import h8.h;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import v8.C3435d;
import w7.InterfaceC3487a;
import y8.C3652n;
import y8.C3654p;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class M extends w {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final L7.N f106g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f107h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final k8.c f108i;

    public M(L7.N packageDescriptor, f8.l proto, InterfaceC2710c nameResolver, AbstractC2708a metadataVersion, InterfaceC0398s interfaceC0398s, C3652n components, String debugName, InterfaceC3487a classNames) {
        AbstractC2855l.g(packageDescriptor, "packageDescriptor");
        AbstractC2855l.g(proto, "proto");
        AbstractC2855l.g(nameResolver, "nameResolver");
        AbstractC2855l.g(metadataVersion, "metadataVersion");
        AbstractC2855l.g(components, "components");
        AbstractC2855l.g(debugName, "debugName");
        AbstractC2855l.g(classNames, "classNames");
        f8.t tVarU = proto.U();
        AbstractC2855l.f(tVarU, "getTypeTable(...)");
        h8.g gVar = new h8.g(tVarU);
        h.a aVar = h8.h.f28564b;
        f8.w wVarV = proto.V();
        AbstractC2855l.f(wVarV, "getVersionRequirementTable(...)");
        C3654p c3654pA = components.a(packageDescriptor, nameResolver, gVar, aVar.a(wVarV), metadataVersion, interfaceC0398s);
        List listN = proto.N();
        AbstractC2855l.f(listN, "getFunctionList(...)");
        List listQ = proto.Q();
        AbstractC2855l.f(listQ, "getPropertyList(...)");
        List listT = proto.T();
        AbstractC2855l.f(listT, "getTypeAliasList(...)");
        super(c3654pA, listN, listQ, listT, classNames);
        this.f106g = packageDescriptor;
        this.f107h = debugName;
        this.f108i = packageDescriptor.d();
    }

    @Override // v8.AbstractC3443l, v8.InterfaceC3445n
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public List g(C3435d kindFilter, Function1 nameFilter) {
        AbstractC2855l.g(kindFilter, "kindFilter");
        AbstractC2855l.g(nameFilter, "nameFilter");
        Collection collectionM = m(kindFilter, nameFilter, T7.d.f10638s);
        Iterable iterableL = s().c().l();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterableL.iterator();
        while (it.hasNext()) {
            AbstractC2800q.A(arrayList, ((N7.b) it.next()).a(this.f108i));
        }
        return AbstractC2800q.z0(collectionM, arrayList);
    }

    public void C(k8.f name, T7.b location) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(location, "location");
        S7.a.b(s().c().p(), location, this.f106g, name);
    }

    @Override // A8.w, v8.AbstractC3443l, v8.InterfaceC3445n
    public InterfaceC1283h f(k8.f name, T7.b location) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(location, "location");
        C(name, location);
        return super.f(name, location);
    }

    @Override // A8.w
    protected void j(Collection result, Function1 nameFilter) {
        AbstractC2855l.g(result, "result");
        AbstractC2855l.g(nameFilter, "nameFilter");
    }

    @Override // A8.w
    protected k8.b p(k8.f name) {
        AbstractC2855l.g(name, "name");
        return new k8.b(this.f108i, name);
    }

    public String toString() {
        return this.f107h;
    }

    @Override // A8.w
    protected Set v() {
        return j7.T.e();
    }

    @Override // A8.w
    protected Set w() {
        return j7.T.e();
    }

    @Override // A8.w
    protected Set x() {
        return j7.T.e();
    }

    @Override // A8.w
    protected boolean z(k8.f name) {
        AbstractC2855l.g(name, "name");
        if (super.z(name)) {
            return true;
        }
        Iterable iterableL = s().c().l();
        if ((iterableL instanceof Collection) && ((Collection) iterableL).isEmpty()) {
            return false;
        }
        Iterator it = iterableL.iterator();
        while (it.hasNext()) {
            if (((N7.b) it.next()).b(this.f108i, name)) {
                return true;
            }
        }
        return false;
    }
}
